public class Achievement {
    private Achievements achievement;
    private String name;
    private String note = "Описание отсутствует";

    public Achievement(Achievements ach) {
        achievement = ach;
    }

    public String GetName() {
        GetRusName();
        return name;
    }

    public void SetNote(String note) {
        this.note = note;
    }

    public String GetNote() {
        return note;
    }

    private void GetRusName() {
        switch (achievement) {
            case BestProgrammerOfGroup:
                name = "Лучший программист в группе";
                break;
            case WorseProgrammerOfCourse:
                name = "Худший программист в группе";
                break;
            case BestSportsmenOfCourse:
                name = "Лучший спортсмен в группе";
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "Ачивка с названием - " + GetName() + " и описанием - " + note;
    }
}
