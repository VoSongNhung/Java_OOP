public class ClassObj2 {
    int idJob;
    String nameJob;
    String description;

    //Create constructor
   public ClassObj2(int idJob, String nameJob, String description) {
        this.idJob = idJob;
        this.nameJob = nameJob;
        this.description = description;
    }

    public int getIdJob() {
        return idJob;
    }

    public void setIdJob(int idJob) {
        this.idJob = idJob;
    }

    public String getNameJob() {
        return nameJob;
    }

    public void setNameJob(String nameJob) {
        this.nameJob = nameJob;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
