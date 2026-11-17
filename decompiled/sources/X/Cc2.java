package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Cc2 {
    public final EnumC3667CcO A00;
    public final Integer A01;

    public /* synthetic */ Cc2(EnumC3667CcO enumC3667CcO, Integer num) {
        this.A00 = enumC3667CcO;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Cc2) {
                Cc2 cc2 = (Cc2) obj;
                if (!CS7.A01(this.A00, cc2.A00) || !CS7.A01(this.A01, cc2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, null, null});
    }
}
