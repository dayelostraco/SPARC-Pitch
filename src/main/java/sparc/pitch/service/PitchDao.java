package sparc.pitch.service;

import sparc.pitch.exception.DataAccessException;
import sparc.pitch.model.Pitch;

import java.util.List;

/**
 * User: Dayel Ostraco
 * Date: 8/1/12
 * Time: 8:08 PM
 */
public interface PitchDao {

    Pitch findPitch(String id) throws DataAccessException;

    List<Pitch> findAllPitches() throws DataAccessException;

    void addPitch(Pitch pitch) throws DataAccessException;

    Pitch updatePitch(Pitch pitch) throws DataAccessException;

    void deletePitch(Pitch pitch) throws DataAccessException;
}
