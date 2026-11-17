package X;

import android.view.DisplayCutout;

/* renamed from: X.FfB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8504FfB extends C8511FfI {
    @Override // X.C8495Ff2, X.C8496Ff3
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8504FfB) {
                C8495Ff2 c8495Ff2 = (C8495Ff2) obj;
                if (Ht0.A00(this.A0A, c8495Ff2.A0A) && Ht0.A00(this.A03, c8495Ff2.A03)) {
                    if ((this.A02 & 6) == (c8495Ff2.A02 & 6)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C8496Ff3
    public final C8500Ff7 A06() {
        DisplayCutout displayCutout = this.A0A.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C8500Ff7(displayCutout);
    }

    @Override // X.C8496Ff3
    public final C8497Ff4 A07() {
        return AbstractC7607F5u.A0j(this.A0A.consumeDisplayCutout());
    }

    @Override // X.C8496Ff3
    public final int hashCode() {
        return this.A0A.hashCode();
    }
}
