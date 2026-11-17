package X;

/* renamed from: X.Ffh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8530Ffh extends C06G {
    public static final C8530Ffh A04 = new C8530Ffh(0.0f, 0.0f, 0.0f, 0.0f);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public C8530Ffh() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8530Ffh) {
                C8530Ffh c8530Ffh = (C8530Ffh) obj;
                if (Float.compare(this.A03, c8530Ffh.A03) != 0 || Float.compare(this.A01, c8530Ffh.A01) != 0 || Float.compare(this.A00, c8530Ffh.A00) != 0 || Float.compare(this.A02, c8530Ffh.A02) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A03), this.A01), this.A00), this.A02);
    }

    public C8530Ffh(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A01 = f2;
        this.A00 = f3;
        this.A02 = f4;
    }
}
