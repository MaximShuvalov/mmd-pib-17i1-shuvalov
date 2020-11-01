public class Achievement {
    private Achievements achievement;
    private String name;
    private String _note;

    public Achievement(Achievements ach, String note) {
        achievement = ach;
        _note = note;
    }

    public String GetName() {
        GetRusName();
        return name;
    }

    public String GetNote() {
        return _note;
    }

    private void GetRusName() {
        switch (achievement) {
            case BestProgrammerOfGroup:
                name = "Ћучший программист в группе";
                break;
            case WorseProgrammerOfCourse:
                name = "’удший программист в группе";
                break;
            case BestSportsmenOfCourse:
                name = "Ћучший спортсмен в группе";
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "јчивка с названием - " + GetName() + " и описанием - " + _note;
    }
}
