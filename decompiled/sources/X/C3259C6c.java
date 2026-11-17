package X;

/* renamed from: X.C6c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3259C6c {
    public final long A00;
    public final long A01;
    public final long A02;
    public final boolean A03;
    public final boolean A04;

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("[Rel And Abs Timestamp ");
        if (this.A04) {
            str = "was not set";
        } else {
            if (!this.A03) {
                sbA0x.append("was not valid with error code ");
                sbA0x.append(this.A01);
                return AnonymousClass001.A0v("]", sbA0x);
            }
            sbA0x.append("rel time ");
            sbA0x.append(this.A02);
            sbA0x.append(" ms and abs time ");
            sbA0x.append(this.A00);
            str = " ms";
        }
        sbA0x.append(str);
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public C3259C6c(long j) {
        this.A02 = 0L;
        this.A00 = 0L;
        this.A01 = j;
        this.A03 = false;
        this.A04 = j == -758;
    }

    public C3259C6c(long j, long j2) {
        this.A02 = j;
        this.A00 = j2;
        this.A01 = 0L;
        this.A03 = true;
        this.A04 = false;
    }
}
