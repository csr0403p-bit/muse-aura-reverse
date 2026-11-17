package X;

/* renamed from: X.B9y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2193B9y {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;

    public C2193B9y() {
        this(2, 0L, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C2193B9y c2193B9y = (C2193B9y) obj;
                if (this.A01 != c2193B9y.A01 || this.A02 != c2193B9y.A02 || this.A00 != c2193B9y.A00 || this.A03 != c2193B9y.A03 || this.A04 != c2193B9y.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A04, (AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A01), this.A02), this.A00) + this.A03) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NavigationEvent(touchX=");
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

    public C2193B9y(int i, long j, float f, float f2, float f3) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A04 = j;
    }
}
