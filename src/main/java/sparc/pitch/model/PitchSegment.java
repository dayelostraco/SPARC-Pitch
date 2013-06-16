package sparc.pitch.model;

/**
 * User: Dayel Ostraco
 * Date: 8/3/12
 * Time: 4:02 PM
 */
public class PitchSegment {

    private String pitchId;
    private String fieldName;
    private String fieldValue;

    public String getPitchId() {
        return pitchId;
    }

    public void setPitchId(String pitchId) {
        this.pitchId = pitchId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}
