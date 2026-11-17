package X;

import java.util.Arrays;

/* renamed from: X.Ehm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7177Ehm {
    public final float A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.options.RoundingOptions");
                if (this.A00 != ((C7177Ehm) obj).A00 || !Arrays.equals((float[]) null, (float[]) null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        float f = this.A00;
        String string = Arrays.toString((float[]) null);
        StringBuilder sbA10 = C60O.A10("RoundingOptions(isCircular=", false);
        sbA10.append(AbstractC7606F5t.A00(16));
        sbA10.append(f);
        sbA10.append(", cornerRadii=");
        sbA10.append(string);
        sbA10.append(", isAntiAliased=");
        sbA10.append(false);
        return C8j5.A0W(", isForceRoundAtDecode=", sbA10, false);
    }

    public C7177Ehm(float f) {
        this.A00 = f;
    }

    public final int hashCode() {
        return C0KA.A01((AnonymousClass005.A02(38347, this.A00) + Arrays.hashCode((float[]) null)) * 31, false) + 1237;
    }
}
