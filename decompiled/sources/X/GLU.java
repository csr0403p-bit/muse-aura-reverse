package X;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class GLU {
    public static final GLC<GKV> A00;
    public static final GLF<Htd, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GLV, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.AesCmacKey");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(10), GLV.class);
        A02 = GLD.A00(c6966EdOA01, 10);
        A01 = new GLF(new C8930Ftm(11), Htd.class);
        A00 = GLC.A00(c6966EdOA01, 10);
    }

    public static GKP A01(GLZ variant) {
        if (GLZ.A04.equals(variant)) {
            return GKP.TINK;
        }
        if (GLZ.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (GLZ.A03.equals(variant)) {
            return GKP.RAW;
        }
        if (GLZ.A02.equals(variant)) {
            return GKP.LEGACY;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }

    public static GLZ A00(GKP outputPrefixType) throws GeneralSecurityException {
        int iOrdinal = outputPrefixType.ordinal();
        if (iOrdinal == 1) {
            return GLZ.A04;
        }
        if (iOrdinal == 4) {
            return GLZ.A01;
        }
        if (iOrdinal == 2) {
            return GLZ.A02;
        }
        if (iOrdinal == 3) {
            return GLZ.A03;
        }
        throw FGI.A0t(outputPrefixType);
    }
}
