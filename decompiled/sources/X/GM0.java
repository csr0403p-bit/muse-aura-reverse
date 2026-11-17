package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class GM0 extends GMT {
    public final GMH A00;
    public final C6966EdO A01;
    public final Hp7 A02;
    public final Integer A03;

    public static GM0 A01(GMO variant, Hp7 secretBytes, Integer idRequirement) throws GeneralSecurityException {
        C6966EdO c6966EdOA0T;
        GMO gmo = GMO.A02;
        if (variant != gmo && idRequirement == null) {
            throw AbstractC7610F5x.A14(" the value of idRequirement must be non-null", C3cG.A0f(variant, "For given Variant "));
        }
        if (variant == gmo && idRequirement != null) {
            throw BV6.A0u("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        int length = secretBytes.A00.A00.length;
        if (length != 32) {
            throw FGI.A0u("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length);
        }
        GMH gmh = new GMH(variant);
        GMO gmo2 = gmh.A00;
        if (gmo2 == gmo) {
            c6966EdOA0T = AbstractC9478GKu.A00;
        } else if (gmo2 == GMO.A01) {
            c6966EdOA0T = AbstractC7608F5v.A0S(idRequirement);
        } else {
            if (gmo2 != GMO.A03) {
                throw AbstractC7607F5u.A10(gmo2, "Unknown Variant: ");
            }
            c6966EdOA0T = AbstractC7608F5v.A0T(idRequirement);
        }
        return new GM0(gmh, c6966EdOA0T, secretBytes, idRequirement);
    }

    public GM0(GMH parameters, C6966EdO keyBytes, Hp7 outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A02 = outputPrefix;
        this.A01 = keyBytes;
        this.A03 = idRequirement;
    }
}
