package X;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BHP {
    public final String A00;
    public final Function0<Boolean> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHP) {
                BHP bhp = (BHP) obj;
                if (!C7384Etj.areEqual(this.A00, bhp.A00) || this.A01 != bhp.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass001.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CustomAccessibilityAction(label=");
        sbA0x.append(this.A00);
        sbA0x.append(", action=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public BHP(String str, Function0<Boolean> function0) {
        this.A00 = str;
        this.A01 = function0;
    }
}
