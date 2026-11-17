package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class GM2 extends GMT {
    public final GMB A00;
    public final C6966EdO A01;
    public final Integer A02;

    public static GM2 A01(GMB parameters, Integer idRequirement) throws GeneralSecurityException {
        C6966EdO c6966EdOA0T;
        GMQ gmq = parameters.A01;
        if (gmq == GMQ.A01) {
            if (idRequirement != null) {
                throw BV6.A0u("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            c6966EdOA0T = AbstractC9478GKu.A00;
        } else {
            if (gmq != GMQ.A02) {
                throw AbstractC7611F5y.A0a(gmq, "Unknown Variant: ");
            }
            if (idRequirement == null) {
                throw BV6.A0u("For given Variant TINK the value of idRequirement must be non-null");
            }
            c6966EdOA0T = AbstractC7608F5v.A0T(idRequirement);
        }
        return new GM2(parameters, c6966EdOA0T, idRequirement);
    }

    public GM2(GMB parameters, C6966EdO outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A01 = outputPrefix;
        this.A02 = idRequirement;
    }
}
