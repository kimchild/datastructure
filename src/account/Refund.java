package account;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Function;

/**
 * CalculatorType
 *
 * @author ckkim on 2018-06-18
 */
public class Refund {

    private String customer;
    private LocalDate localDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate refundDate;
    private long refund;
    public Refund() {
        this.localDate = LocalDate.now();
        this.startDate = localDate.with(DayOfWeek.THURSDAY).minusWeeks(2);
        this.endDate = localDate.with(DayOfWeek.WEDNESDAY).minusWeeks(1);
        this.refundDate = localDate.with(DayOfWeek.WEDNESDAY);
    }

    public void setRefund(long refund) {
        CalculatorRefund code = CalculatorRefund.CALC_REFUND;
        this.refund = code.calculate(refund);
    }
    public LocalDate getRefundDate() {
        return refundDate;
    }
    public long getRefund() {
        return refund;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public enum CalculatorRefund {

        CALC_REFUND(value -> value - ((long) (value * (5 / 100f))));

        private Function<Long, Long> expression;
        CalculatorRefund(Function<Long, Long> expression) {this.expression = expression;}
        public long calculate(long value) {return expression.apply(value);}
    }


}