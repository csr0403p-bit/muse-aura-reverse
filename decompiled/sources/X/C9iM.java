package X;

import java.util.Arrays;

/* renamed from: X.9iM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9iM extends C9iK {
    @Override // X.C9iK
    public final boolean equals(Object obj) {
        int i;
        if (this != obj) {
            if (obj instanceof C9iM) {
                C9iZ c9iZ = (C9iZ) obj;
                if (this.A03.equals(c9iZ.AKP()) && Arrays.equals((Object[]) this.A06.getValue(), (Object[]) ((C9iK) obj).A06.getValue()) && (i = this.A02) == c9iZ.AF6()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (C7384Etj.areEqual(AF3(i2).AKP(), c9iZ.AF3(i2).AKP()) && C7384Etj.areEqual(AF3(i2).AGs(), c9iZ.AF3(i2).AGs())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C9iK, X.C9iZ
    public final boolean isInline() {
        return true;
    }

    @Override // X.C9iK
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
