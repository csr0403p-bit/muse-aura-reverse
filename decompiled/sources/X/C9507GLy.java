package X;

import java.security.GeneralSecurityException;

/* renamed from: X.GLy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9507GLy extends GMT {
    public final GMC A00;
    public final C6966EdO A01;
    public final Hp7 A02;
    public final Integer A03;

    public static C9507GLy A01(GMC parameters, Hp7 secretBytes, Integer idRequirement) throws GeneralSecurityException {
        C6966EdO c6966EdOA0T;
        GMR gmr = parameters.A01;
        GMR gmr2 = GMR.A01;
        if (gmr != gmr2 && idRequirement == null) {
            throw AbstractC7610F5x.A14(" the value of idRequirement must be non-null", C3cG.A0f(gmr, "For given Variant "));
        }
        if (gmr == gmr2 && idRequirement != null) {
            throw BV6.A0u("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        int length = secretBytes.A00.A00.length;
        if (length != 32) {
            throw FGI.A0u("XAesGcmKey key must be constructed with key of length 32 bytes, not ", length);
        }
        if (gmr == gmr2) {
            c6966EdOA0T = AbstractC9478GKu.A00;
        } else {
            if (gmr != GMR.A02) {
                throw AbstractC7607F5u.A10(gmr, "Unknown Variant: ");
            }
            c6966EdOA0T = AbstractC7608F5v.A0T(idRequirement);
        }
        return new C9507GLy(parameters, c6966EdOA0T, secretBytes, idRequirement);
    }

    public C9507GLy(GMC parameters, C6966EdO keyBytes, Hp7 outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A02 = outputPrefix;
        this.A01 = keyBytes;
        this.A03 = idRequirement;
    }
}
