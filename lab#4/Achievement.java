public class Achievement {
    private Achievements achievement;
    private String name;

    Achievement(Achievements ach){achievement = ach;}

    public String GetName(){
        GetRusName();
        return name;
    }

    private void GetRusName(){
        switch(achievement){
            case BestProgrammerOfGroup:
            name = "Лучший программист в группе";
            break;
            case WorseProgrammerOfCourse:
            name = "Худший программист в группе";
            break;
        default:
            break;
        }
    }

    @Override
    public String ToString(){
        return "Ачивка с названием - " + name;
    }
}
