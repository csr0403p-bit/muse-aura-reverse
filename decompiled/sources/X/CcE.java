package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CcE {
    public final Float A00;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof CcE) && CS7.A01(this.A00, ((CcE) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.A00, null});
    }
}
