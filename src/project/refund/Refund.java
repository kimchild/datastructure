package project.refund;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Refund {

    private String customer;
    private LocalDate localDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate refundDate;
    private final float charge;
    private long orderPrice;
    public Refund(final float charge) {
        this.charge = (charge/100f);
        this.localDate = LocalDate.now();
        this.startDate = localDate.with(DayOfWeek.THURSDAY).minusWeeks(2);
        this.endDate = localDate.with(DayOfWeek.WEDNESDAY).minusWeeks(1);
        this.refundDate = localDate.with(DayOfWeek.WEDNESDAY);
    }

    public String getCustomer() {
        return this.customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setOrderPrice(long orderPrice) {
        this.orderPrice = orderPrice;
    }
    public long getRefundAmount() {
        return orderPrice <= 0 ? 0 : (long) (orderPrice * charge);
    }
    public LocalDate getRefundDate() {
        return this.refundDate;
    }
    public LocalDate getStartDate() {
        return this.startDate;
    }
    public LocalDate getEndDate() {
        return this.endDate;
    }

}