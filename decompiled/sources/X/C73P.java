package X;

import java.util.List;

/* renamed from: X.73P, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73P {
    public static final C73P A02 = new C73P(0.0f, C0881AGi.A00);
    public final float A00;
    public final List<Integer> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73P) {
                C73P c73p = (C73P) obj;
                if (!C1DG.A08(this.A00, c73p.A00) || !this.A01.equals(c73p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C73P A00(C73P c73p) {
        return new C73P(this.A00 + c73p.A00, AbstractC0878AGe.A0P(c73p.A01, this.A01));
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, Float.floatToIntBits(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PaddingDimension(dp=");
        C1DG.A07(sbA0x, this.A00);
        sbA0x.append(", resourceIds=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C73P(float f, List<Integer> list) {
        this.A00 = f;
        this.A01 = list;
    }
}
