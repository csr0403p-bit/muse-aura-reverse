package X;

/* renamed from: X.GKx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9481GKx {
    public static final GLC<GKV> A00;
    public static final GLF<C10536Hqh, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<C9483GKz, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(2), C9483GKz.class);
        A02 = GLD.A00(c6966EdOA01, 2);
        A01 = new GLF(new C8930Ftm(2), C10536Hqh.class);
        A00 = GLC.A00(c6966EdOA01, 2);
    }

    public static GKJ A01(C9483GKz parameters) {
        GKK gkk;
        GHW ghwA09 = GHS.A09(GKJ.DEFAULT_INSTANCE);
        ((GKJ) GHW.A00(ghwA09)).tagSize_ = parameters.A03;
        GL4 gl4 = parameters.A04;
        if (GL4.A01.equals(gl4)) {
            gkk = GKK.SHA1;
        } else if (GL4.A02.equals(gl4)) {
            gkk = GKK.SHA224;
        } else if (GL4.A03.equals(gl4)) {
            gkk = GKK.SHA256;
        } else if (GL4.A04.equals(gl4)) {
            gkk = GKK.SHA384;
        } else {
            if (!GL4.A05.equals(gl4)) {
                throw AbstractC7611F5y.A0a(gl4, "Unable to serialize HashType ");
            }
            gkk = GKK.SHA512;
        }
        ((GKJ) GHW.A00(ghwA09)).hash_ = gkk.value;
        return (GKJ) ghwA09.A02();
    }

    public static GKP A02(C9479GKv variant) {
        if (C9479GKv.A03.equals(variant)) {
            return GKP.TINK;
        }
        if (C9479GKv.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (C9479GKv.A02.equals(variant)) {
            return GKP.RAW;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }

    public static GL4 A00(GKK hashType) {
        int iOrdinal = hashType.ordinal();
        if (iOrdinal == 1) {
            return GL4.A01;
        }
        if (iOrdinal == 5) {
            return GL4.A02;
        }
        if (iOrdinal == 3) {
            return GL4.A03;
        }
        if (iOrdinal == 2) {
            return GL4.A04;
        }
        if (iOrdinal == 4) {
            return GL4.A05;
        }
        if (hashType != GKK.UNRECOGNIZED) {
            throw FGI.A0u("Unable to parse HashType: ", hashType.value);
        }
        throw C60O.A0i("Can't get the number of an unknown enum value.");
    }
}
