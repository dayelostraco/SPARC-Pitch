package sparc.pitch.service.impl;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import sparc.pitch.exception.DataAccessException;
import sparc.pitch.model.Pitch;
import sparc.pitch.service.PitchDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * User: Dayel Ostraco
 * Date: 8/1/12
 * Time: 8:08 PM
 */
@Component(value = "pitchDao")
public class PitchDaoImpl implements PitchDao {

    @PersistenceContext(unitName = "sparcPitchPersistence")
    private EntityManager em;

    @Override
    @Transactional
    public Pitch findPitch(String id) throws DataAccessException {
        try {
            return em.find(Pitch.class, id);
        } catch (Exception e) {
            throw new DataAccessException("Unknown Exception", e);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Pitch> findAllPitches() throws DataAccessException {
        final String queryString = "SELECT p FROM Pitch p";
        final Query query = em.createQuery(queryString);

        try {
            return (List<Pitch>) query.getResultList();
        } catch (Exception e) {
            throw new DataAccessException("Unknown Exception", e);
        }
    }

    @Override
    @Transactional
    public void addPitch(Pitch pitch) throws DataAccessException {
        try {
            pitch.setId(UUID.randomUUID().toString());
            pitch.setCreatedDate(new Date());
            pitch.setLastModDate(new Date());
            em.persist(pitch);
        } catch (ConstraintViolationException e) {
            throw new DataAccessException("Duplicate Key", e);
        } catch (Exception e) {
            throw new DataAccessException("Unknown Exception", e);
        }
    }

    @Override
    @Transactional
    public Pitch updatePitch(Pitch pitch) throws DataAccessException {
        try {
            pitch.setLastModDate(new Date());
            return em.merge(pitch);
        } catch (Exception e) {
            throw new DataAccessException("Unknown Exception", e);
        }
    }

    @Override
    @Transactional
    public void deletePitch(Pitch pitch) throws DataAccessException {
        try {
            Pitch attachedPitch = findPitch(pitch.getId());
            em.remove(attachedPitch);
        } catch (Exception e) {
            throw new DataAccessException("Unknown Exception", e);
        }
    }
}
