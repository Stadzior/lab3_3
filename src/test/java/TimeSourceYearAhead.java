import edu.iis.mto.time.ITimeSource;

public class TimeSourceYearAhead implements ITimeSource {

    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis()+PERIOD.ONE_YEAR.getNumVal();
    }

    public enum PERIOD {
        ONE_SECOND(1000),
        ONE_MINUTE(ONE_SECOND.getNumVal()*60),
        ONE_HOUR(ONE_MINUTE.getNumVal()*60),
        ONE_DAY(ONE_HOUR.getNumVal()*24),
        ONE_YEAR(ONE_DAY.getNumVal()*365);

        private int numVal;

        PERIOD(int numVal) {
            this.numVal = numVal;
        }

        public int getNumVal() {
            return numVal;
        }
    }

}
