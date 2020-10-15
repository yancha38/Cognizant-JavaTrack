public class Associate{
    private int associateId;
    private String associateName;
    private String workStatus;
    
    public Associate(){
        
    }
    public Associate(int associateId, String associateName, String workStatus){
        super();
        this.associateId = associateId;
        this.associateName = associateName;
        this.workStatus = workStatus;
    }
    
    public int getAssociateId(){
        return associateId;
    }
    public void setAssociateId(int associateId){
        this.associateId = associateId;
    }
    
    public String getAssociateName(){
        return associateName;
    }
    public void setAssociateName(String associateName){
        this.associateName = associateName;
    }
    
    public String getWorkStatus(){
        return workStatus;
    }
    public void setWorkStatus(String workStatus){
        this.workStatus = workStatus;
    }
    public void trackAssociateStatus(int days){
        String work;
        if(days > 0 && days <= 20){
            work = "Core skills";
        }
        else if(days > 20 && days <= 40){
            work = "Advanced modules";
        }
        else if(days > 40 && days <= 60){
            work = "Project phase";
        }
        else work = "Deployed in project";
        setWorkStatus(work);
        System.out.println("The associate " + getAssociateName() + " work status:" + getWorkStatus());
    }
}
