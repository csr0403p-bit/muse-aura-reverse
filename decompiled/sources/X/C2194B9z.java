package X;

/* renamed from: X.B9z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2194B9z {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;

    public C2194B9z(C2193B9y c2193B9y) {
        float f = c2193B9y.A01;
        float f2 = c2193B9y.A02;
        float f3 = c2193B9y.A00;
        int i = c2193B9y.A03;
        long j = c2193B9y.A04;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = j;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BackEventCompat(touchX=");
        sbA0x.append(this.A01);
        sbA0x.append(", touchY=");
        sbA0x.append(this.A02);
        sbA0x.append(", progress=");
        sbA0x.append(this.A00);
        sbA0x.append(", swipeEdge=");
        sbA0x.append(this.A03);
        sbA0x.append(", frameTimeMillis=");
        sbA0x.append(this.A04);
        return AnonymousClass006.A0z(sbA0x);
    }
}
