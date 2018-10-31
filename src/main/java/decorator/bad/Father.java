package decorator.bad;

public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 签名？休想！
    }
}
