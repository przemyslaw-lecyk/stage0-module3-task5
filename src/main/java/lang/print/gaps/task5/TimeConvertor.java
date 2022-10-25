package lang.print.gaps.task5;

public class TimeConvertor {
    public static void main(String[] args) {
        //example
        TimeConvertor convertor = new TimeConvertor();
        convertor.convert(11.5F);
    }
    public void convert(float minutes) {
        System.out.println(minutes * 60.0);
    }
}
