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
                name = "������ ����������� � ������";
                break;
            case WorseProgrammerOfCourse:
                name = "������ ����������� � ������";
                break;
            case BestSportsmenOfCourse:
                name = "������ ��������� � ������";
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "������ � ��������� - " + GetName() + " � ��������� - " + _note;
    }
}
