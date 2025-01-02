package me.whiteship.chapter06.item34.payroll;

// 코드 34-8 값에 따라 분기하며 코드를 공유하는 열거 타입. (217쪽)
enum PayrollDayOriginal {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
        int basePay = minutesWorked * payRate;

        int overrimePay;
        switch (this) {
            case SATURDAY: case SUNDAY:
                overrimePay = basePay / 2;
                break;
            default: // 주중
                overrimePay = minutesWorked <= MINS_PER_SHIFT ? 0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
        }

        return basePay + overrimePay;
    }

}
