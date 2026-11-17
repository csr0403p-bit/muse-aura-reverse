package X;

import java.util.Arrays;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EUs {
    public static final F0C<Pattern> A02 = C5322DgG.A01((Function0) C6724EXi.A00(11));
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (getClass().equals(BV5.A0N(obj))) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.imagepipeline.common.BytesRange");
                EUs eUs = (EUs) obj;
                if (this.A00 != eUs.A00 || this.A01 != eUs.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        int i = this.A00;
        String strValueOf = i == Integer.MAX_VALUE ? "" : String.valueOf(i);
        int i2 = this.A01;
        return String.format(null, "%s-%s", Arrays.copyOf(new Object[]{strValueOf, i2 == Integer.MAX_VALUE ? "" : String.valueOf(i2)}, 2));
    }

    public EUs(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
