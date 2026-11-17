package X;

import java.io.Serializable;

/* renamed from: X.Ddj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5226Ddj implements Serializable {
    public static final long serialVersionUID = 1;
    public final String ntaEligibility;
    public final String personalizationData;
    public final String ssoEligibility;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5226Ddj) {
                C5226Ddj c5226Ddj = (C5226Ddj) obj;
                if (!C7384Etj.areEqual(this.ssoEligibility, c5226Ddj.ssoEligibility) || !C7384Etj.areEqual(this.ntaEligibility, c5226Ddj.ntaEligibility) || !C7384Etj.areEqual(this.personalizationData, c5226Ddj.personalizationData)) {
                }
            }
            return false;
        }
        return true;
    }

    public C5226Ddj() {
        this("2", "2", null);
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.ntaEligibility, AnonymousClass001.A0G(this.ssoEligibility)) + AnonymousClass006.A0G(this.personalizationData);
    }

    public final String toString() {
        return FGI.A0k("SsoSetting(ssoEligibility=", this.ssoEligibility, ", ntaEligibility=", this.ntaEligibility, ", personalizationData=", this.personalizationData, ")");
    }

    public C5226Ddj(String str, String str2, String str3) {
        this.ssoEligibility = str;
        this.ntaEligibility = str2;
        this.personalizationData = str3;
    }
}
