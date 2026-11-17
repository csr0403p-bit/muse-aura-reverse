package X;

/* renamed from: X.CDj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3310CDj {
    public final int A00;
    public final Exception A01;
    public final Integer A02;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("resultCode ");
        sbA0x.append(this.A00);
        Integer num = this.A02;
        if (num != null) {
            sbA0x.append(" | errorCode ");
            sbA0x.append(num.intValue());
        }
        Exception exc = this.A01;
        if (exc != null) {
            sbA0x.append(" | exception ");
            BV4.A1O(sbA0x, exc);
        }
        return sbA0x.toString();
    }

    public C3310CDj(Exception exc, Integer num, int i) {
        this.A00 = i;
        this.A01 = exc;
        this.A02 = num;
    }
}
