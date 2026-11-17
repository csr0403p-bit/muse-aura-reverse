package X;

/* loaded from: classes5.dex */
public final class CP9 {
    public static final CP9 A01 = new CP9(0);
    public final int A00;

    static {
        new CP9(64);
    }

    public CP9(int i) {
        if (((i - 1) & i) != 0) {
            throw BV5.A0S("Only one flag must be set for a listener, ", " passed", i);
        }
        this.A00 = i;
    }
}
