package X;

/* renamed from: X.APw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1013APw {
    public final float A00;
    public final AOe<Float> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1013APw) {
                C1013APw c1013APw = (C1013APw) obj;
                if (Float.compare(this.A00, c1013APw.A00) != 0 || !C7384Etj.areEqual(this.A01, c1013APw.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, C8j4.A04(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Fade(alpha=");
        sbA0x.append(this.A00);
        sbA0x.append(", animationSpec=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (FLX/AOe<Ljava/lang/Float;>;)V */
    public C1013APw(AOe aOe, float f) {
        this.A00 = f;
        this.A01 = aOe;
    }
}
