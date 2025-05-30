package asm6;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Child> children = new ArrayList<>();
        children.add(new Child("Nguyen Van A", LocalDate.of(2010, 5, 20)));
        children.add(new Child("Tran Thi B", LocalDate.of(2011, 11, 2)));
        children.add(new Child("Le Van C", LocalDate.of(2012, 6, 25)));
        children.add(new Child("Pham Thi D", LocalDate.of(2009, 1, 5)));
        children.add(new Child("Hoang Van E", LocalDate.of(2013, 12, 15)));

        LocalDate today = LocalDate.now();
        Child closestChild = null;
        long minDays = Long.MAX_VALUE;

        for (Child c : children) {
            MonthDay birthMonthDay = MonthDay.from(c.getDateOfBirth());
            LocalDate nextBirthday = birthMonthDay.atYear(today.getYear());

            if (nextBirthday.isBefore(today)) {
                nextBirthday = nextBirthday.plusYears(1);
            }

            long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

            if (daysUntilBirthday < minDays) {
                minDays = daysUntilBirthday;
                closestChild = c;
            }
        }

        if (closestChild != null) {
            LocalDate dob = closestChild.getDateOfBirth();
            System.out.println("Người có sinh nhật gần nhất:");
            System.out.println("Họ tên: " + closestChild.getFullName());
            System.out.println("Ngày sinh nhật: " + dob.getDayOfMonth() + "/" + dob.getMonthValue());
        }
    }
}
