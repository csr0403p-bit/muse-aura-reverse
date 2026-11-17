package X;

/* loaded from: classes5.dex */
public final class Cl7 {
    public final long A00;
    public final long A01;
    public final String A02;

    public Cl7(long j, long j2, String str) {
        if (j < 0) {
            throw C60O.A0i("minDelayMs < 0");
        }
        if (j2 < 0) {
            throw C60O.A0i("maxDelayMs < 0");
        }
        if (j > j2) {
            StringBuilder sbA0g = C3cG.A0g("minDelay=");
            sbA0g.append(j);
            throw C60O.A0i(BV7.A0z("; maxDelay=", sbA0g, j2));
        }
        this.A01 = j;
        this.A00 = j2;
        this.A02 = str;
    }
}
