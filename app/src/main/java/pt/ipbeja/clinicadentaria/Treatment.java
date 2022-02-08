package pt.ipbeja.clinicadentaria;

public class Treatment {

    private long id;

    private String treatment_name;

    private String minutes;

    public Treatment(long id, String treatment_name, String minutes) {
        this.id = id;
        this.treatment_name = treatment_name;
        this.minutes = minutes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTreatment_name() {
        return treatment_name;
    }

    public void setTreatment_name(String treatment_name) {
        this.treatment_name = treatment_name;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }
}
