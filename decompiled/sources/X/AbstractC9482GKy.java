package X;

/* renamed from: X.GKy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9482GKy {
    public static final GLC<GKV> A00;
    public static final GLF<Hnc, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GL0, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.AesEaxKey");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(3), GL0.class);
        A02 = GLD.A00(c6966EdOA01, 3);
        A01 = new GLF(new C8930Ftm(3), Hnc.class);
        A00 = GLC.A00(c6966EdOA01, 3);
    }

    public static GJY A00(GL0 parameters) {
        int i = parameters.A02;
        if (i != 16) {
            throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", BV5.A1Y(i));
        }
        GHW ghwA09 = GHS.A09(GJY.DEFAULT_INSTANCE);
        ((GJY) GHW.A00(ghwA09)).ivSize_ = parameters.A00;
        return (GJY) ghwA09.A02();
    }

    public static GKP A01(C9480GKw variant) {
        if (C9480GKw.A03.equals(variant)) {
            return GKP.TINK;
        }
        if (C9480GKw.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (C9480GKw.A02.equals(variant)) {
            return GKP.RAW;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }
}
