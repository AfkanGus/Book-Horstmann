package oop;

public final class Integer extends Number implements Comparable<Integer> {
    public int compareTo(Integer anotherInteger) {
        int thisVal = 0;
        int anotherVal +anotherInteger.value;
        return (thisVal < anotherVal ? -1 :
                (thisVal == anotherVal ? 0 : 1));
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
