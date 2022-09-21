//        Date.java -  years, months, dates. *Inherits* Time class.

public class Date extends Time{
    int years;
    int months;
    int days;

    public Date(int years, int months, int days, int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
        this.years = years;
        this.months = months;
        this.days = days;
    }

    @Override
    public String toString() {
        String month = new String("" + months);
        if(months<10){
            month="0" + months;
        }
        String day = new String("" + days);
        if(days<10){
            day="0" + days;
        }
        String hour=new String("" + hours);
        if(hours<10){
            hour="0" + hours;
        }
        String minute=new String("" + minutes);
        if(minutes<10){
            minute="0" + minutes;
        }
        String second=new String("" + seconds);
        if(seconds<10){
            second="0" + seconds;
        }
        return "Time is " + years +
                "-" + month +
                "-" + day +
                " " + hour +
                ":" + minute +
                ":" + second
                ;
    }
}
