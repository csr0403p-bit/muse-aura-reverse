package X;

import android.util.Range;

/* loaded from: classes5.dex */
public abstract class Be3 {
    public static final Range<Integer> A00;
    public static final Range<Integer> A01;
    public static final Be3 A02;

    static {
        Integer numA0V = BV4.A0V();
        A00 = new Range<>(numA0V, Integer.MAX_VALUE);
        Range<Integer> range = new Range<>(numA0V, Integer.MAX_VALUE);
        A01 = range;
        Range<Integer> range2 = A00;
        if (!"".isEmpty()) {
            throw BV8.A0l("");
        }
        A02 = new Be1(range2, range, 0);
    }
}
