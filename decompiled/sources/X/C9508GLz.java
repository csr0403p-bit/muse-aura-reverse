package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GLz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9508GLz extends GMT {
    public final GMG A00;
    public final C6966EdO A01;
    public final Hp7 A02;
    public final Integer A03;

    public static C9508GLz A01(GMM variant, Hp7 secretBytes, Integer idRequirement) throws GeneralSecurityException {
        C6966EdO c6966EdOA0T;
        GMM gmm = GMM.A02;
        if (variant != gmm && idRequirement == null) {
            throw AbstractC7610F5x.A14(" the value of idRequirement must be non-null", C3cG.A0f(variant, "For given Variant "));
        }
        if (variant == gmm && idRequirement != null) {
            throw BV6.A0u("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        int length = secretBytes.A00.A00.length;
        if (length != 32) {
            throw FGI.A0u("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length);
        }
        GMG gmg = new GMG(variant);
        GMM gmm2 = gmg.A00;
        if (gmm2 == gmm) {
            c6966EdOA0T = AbstractC9478GKu.A00;
        } else if (gmm2 == GMM.A01) {
            c6966EdOA0T = AbstractC7608F5v.A0S(idRequirement);
        } else {
            if (gmm2 != GMM.A03) {
                throw AbstractC7607F5u.A10(gmm2, "Unknown Variant: ");
            }
            c6966EdOA0T = AbstractC7608F5v.A0T(idRequirement);
        }
        return new C9508GLz(gmg, c6966EdOA0T, secretBytes, idRequirement);
    }

    public C9508GLz(GMG parameters, C6966EdO keyBytes, Hp7 outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A02 = outputPrefix;
        this.A01 = keyBytes;
        this.A03 = idRequirement;
    }
}
