package sparc.pitch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sparc.pitch.exception.DataAccessException;
import sparc.pitch.exception.RestException;
import sparc.pitch.model.Pitch;
import sparc.pitch.model.PitchSegment;
import sparc.pitch.service.PitchDao;

import java.util.List;

/**
 * User: dayel.ostraco
 * Date: 12/2/11
 * Time: 11:31 AM
 */
@Controller
public class PitchController {

    @Autowired
    private PitchDao pitchDao;

    /**
     * REST Methods
     */

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/pitches", method = RequestMethod.GET)
    public List<Pitch> getPitches() throws RestException {
        try {
            return pitchDao.findAllPitches();
        } catch (DataAccessException e) {
            throw new RestException(e);
        }
    }

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/pitches/{id}", method = RequestMethod.GET)
    public Pitch getPitch(@PathVariable("id") String id) throws RestException {
        try {
            return pitchDao.findPitch(id);
        } catch (DataAccessException e) {
            //TODO: Log this!
            throw new RestException(e);
        }
    }

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/pitch/update", method = RequestMethod.POST)
    public String updatePitch(@RequestBody Pitch pitch) {
        try {
            pitchDao.updatePitch(pitch);

            return "success";

        } catch (DataAccessException e) {
            //TODO: Log this!
            return "error";
        }
    }

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/pitch/add", method = RequestMethod.POST)
    public String addPitch(@RequestBody Pitch pitch) {
        try {
            pitchDao.addPitch(pitch);

            return "success";

        } catch (DataAccessException e) {
            //TODO: Log this!
            return "error";
        }
    }

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/pitch/edit/segment", method = RequestMethod.POST)
    public String editPitchSegment(@RequestBody PitchSegment pitchSegment) {
        try {
            Pitch pitch = pitchDao.findPitch(pitchSegment.getPitchId());

            if (pitchSegment.getFieldName().equals("productName")) {
                pitch.setProductName(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("mission")) {
                pitch.setMission(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("pitch")) {
                pitch.setPitch(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("benefits")) {
                pitch.setBenefits(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("cost")) {
                pitch.setCost(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("stats")) {
                pitch.setStats(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("actionStatement")) {
                pitch.setActionStatement(pitchSegment.getFieldValue());
            } else if (pitchSegment.getFieldName().equals("objections")) {
                pitch.setObjections(pitchSegment.getFieldValue());
            }

            pitchDao.updatePitch(pitch);
            return "success";

        } catch (DataAccessException e) {
            //TODO: Log this!
            return "error";
        }
    }

    /**
     * View Methods
     */

    @RequestMapping(value = "/index/", method = RequestMethod.GET)
    public String index(Model model) {

        try {
            List<Pitch> pitches = pitchDao.findAllPitches();
            model.addAttribute("pitches", pitches);
        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return "index";
    }

    @RequestMapping(value = "/pitch/add/", method = RequestMethod.GET)
    public String addPitch() {
        return "addPitch";
    }

    @RequestMapping(value = "/pitch/view/{id}/", method = RequestMethod.GET)
    public String viewPitch(Model model, @PathVariable("id") String id) {

        try {
            Pitch pitch = pitchDao.findPitch(id);
            model.addAttribute("pitch", pitch);
        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return "viewPitch";
    }

    @RequestMapping(value = "/pitch/view/{field}/{id}/", method = RequestMethod.GET)
    public String viewPitchField(Model model, @PathVariable("field") String field, @PathVariable("id") String id) {

        try {
            Pitch pitch = pitchDao.findPitch(id);
            model.addAttribute("pitch", pitch);

            String fieldValue = "";
            String fieldTitle = "";
            if (field == null) {

            } else if (field.equals("mission")) {
                fieldValue = pitch.getMission();
                fieldTitle = "The Mission";
            } else if (field.equals("pitch")) {
                fieldValue = pitch.getPitch();
                fieldTitle = "The Pitch";
            } else if (field.equals("benefits")) {
                fieldValue = pitch.getBenefits();
                fieldTitle = "The Benefits";
            } else if (field.equals("cost")) {
                fieldValue = pitch.getCost();
                fieldTitle = "The Cost";
            } else if (field.equals("stats")) {
                fieldValue = pitch.getStats();
                fieldTitle = "The Stats";
            } else if (field.equals("actionStatement")) {
                fieldValue = pitch.getActionStatement();
                fieldTitle = "The Action Statement";
            } else if (field.equals("objections")) {
                fieldValue = pitch.getObjections();
                fieldTitle = "The Objections";
            }

            model.addAttribute("pitch", pitch);
            model.addAttribute("fieldName", field);
            model.addAttribute("fieldTitle", fieldTitle);
            model.addAttribute("fieldValue", fieldValue);

        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return "viewPitchSegment";
    }

    @RequestMapping(value = "/pitch/edit/dialog/{id}/", method = RequestMethod.GET)
    public String editPitchName(Model model, @PathVariable("id") String id) {

        try {
            Pitch pitch = pitchDao.findPitch(id);
            model.addAttribute("pitch", pitch);
        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return "editPitchNameDialog";
    }

    @RequestMapping(value = "/pitch/edit/{id}/{field}/", method = RequestMethod.GET)
    public String editPitchSegmentView(Model model, @PathVariable("id") String id, @PathVariable("field") String field) {

        try {
            Pitch pitch = pitchDao.findPitch(id);
            model.addAttribute("pitch", pitch);

            String fieldValue = "";
            String fieldTitle = "";
            if (field == null) {

            } else if (field.equals("mission")) {
                fieldValue = pitch.getMission();
                fieldTitle = "The Mission";
            } else if (field.equals("pitch")) {
                fieldValue = pitch.getPitch();
                fieldTitle = "The Pitch";
            } else if (field.equals("benefits")) {
                fieldValue = pitch.getBenefits();
                fieldTitle = "The Benefits";
            } else if (field.equals("cost")) {
                fieldValue = pitch.getCost();
                fieldTitle = "The Cost";
            } else if (field.equals("stats")) {
                fieldValue = pitch.getStats();
                fieldTitle = "The Stats";
            } else if (field.equals("actionStatement")) {
                fieldValue = pitch.getActionStatement();
                fieldTitle = "The Action Statement";
            } else if (field.equals("objections")) {
                fieldValue = pitch.getObjections();
                fieldTitle = "The Objections";
            }

            model.addAttribute("pitch", pitch);
            model.addAttribute("fieldName", field);
            model.addAttribute("fieldTitle", fieldTitle);
            model.addAttribute("fieldValue", fieldValue);

        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return "editPitchSegment";
    }

    @RequestMapping(value = "/pitch/delete/dialog/{id}/", method = RequestMethod.GET)
    public String deletePitchDialog(Model model, @PathVariable("id") String id) {

        model.addAttribute("pitchId", id);

        return "deleteDialog";
    }

    @RequestMapping(value = "/pitch/delete/{id}/", method = RequestMethod.GET)
    public String deletePitch(Model model, @PathVariable("id") String id) {
        try {
            Pitch pitch = pitchDao.findPitch(id);
            pitchDao.deletePitch(pitch);
        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return index(model);
    }

    //
    @RequestMapping(value = "/pitch/presentation/{id}/", method = RequestMethod.GET)
    public String presentation(Model model, @PathVariable("id") String id) {

        try {
            Pitch pitch = pitchDao.findPitch(id);
            model.addAttribute("pitch", pitch);
        } catch (DataAccessException e) {
            //TODO: Log this!
        }

        return "presentation";
    }
}