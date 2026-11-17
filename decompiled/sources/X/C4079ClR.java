package X;

/* renamed from: X.ClR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4079ClR {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public C4079ClR(long j, long j2, long j3, long j4) {
        this.A03 = j;
        this.A01 = j2;
        this.A02 = j3;
        this.A00 = j4;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("{single=(");
        sbA0x.append(this.A03);
        sbA0x.append(",");
        sbA0x.append(this.A01);
        sbA0x.append("), batch=(");
        sbA0x.append(this.A02);
        sbA0x.append(",");
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v(")}", sbA0x);
    }
}
