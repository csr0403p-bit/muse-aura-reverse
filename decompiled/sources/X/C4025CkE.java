package X;

import com.facebook.aura.auth.strategies.AuraBloksLoginStrategy;
import com.facebook.aura.auth.strategies.AuraReauthStrategy;
import com.facebook.aura.auth.strategies.AuraSignOutStrategy;

/* renamed from: X.CkE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4025CkE extends C06G {
    public final AuraBloksLoginStrategy A00;
    public final AuraReauthStrategy A01;
    public final AuraSignOutStrategy A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4025CkE) {
                C4025CkE c4025CkE = (C4025CkE) obj;
                if (!C7384Etj.areEqual(this.A00, c4025CkE.A00) || !C7384Etj.areEqual(this.A02, c4025CkE.A02) || !C7384Etj.areEqual(this.A01, c4025CkE.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        AuraBloksLoginStrategy auraBloksLoginStrategy = this.A00;
        AuraSignOutStrategy auraSignOutStrategy = this.A02;
        AuraReauthStrategy auraReauthStrategy = this.A01;
        StringBuilder sbA0f = C3cG.A0f(null, "AuthStrategyConfig(ssoAuthStrategy=");
        sbA0f.append(", userPassAuthStrategy=");
        sbA0f.append(auraBloksLoginStrategy);
        sbA0f.append(", twoFactorAuthStrategy=");
        sbA0f.append((Object) null);
        sbA0f.append(", signOutStrategy=");
        sbA0f.append(auraSignOutStrategy);
        return C3cJ.A0L(auraReauthStrategy, ", softSignOutStrategy=", sbA0f);
    }

    public final int hashCode() {
        return (((AnonymousClass006.A0D(this.A00) * 31 * 31) + AnonymousClass006.A0D(this.A02)) * 31) + C3cH.A02(this.A01);
    }

    public C4025CkE(AuraBloksLoginStrategy auraBloksLoginStrategy, AuraReauthStrategy auraReauthStrategy, AuraSignOutStrategy auraSignOutStrategy) {
        this.A00 = auraBloksLoginStrategy;
        this.A02 = auraSignOutStrategy;
        this.A01 = auraReauthStrategy;
    }
}
