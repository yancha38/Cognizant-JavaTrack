public class Student{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    
    public Student(int id, String name, int[] marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int[] getMarks(){
        return marks;
    }
    public void setMarks(int[] marks){
        this.marks = marks;
    }
    
    public float getAverage(){
        return average;
    }
    public void setAverage(float average){
        this.average = average;
    }
    
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        this.grade = grade;
    }
    
    public void calculateAvg(){
        float sum = 0;
        for(int mark : this.marks){
            sum += mark;
        }
        this.setAverage(sum / this.marks.length);
    }
    
    public void findGrade(){
        if(average >= 80 && average <= 100){
            grade = 'O';
        }
        else if(average >= 50 && average <= 80){
            grade = 'A';
        }
        
        for(int mark : marks){
            if(mark < 50){
                grade = 'F';
            }
        }
    }
}