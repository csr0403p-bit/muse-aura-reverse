package X;

/* loaded from: classes6.dex */
public abstract class GLs {
    public static final GLC<GKV> A00;
    public static final GLF<HjH, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GM8, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(5), GM8.class);
        A02 = GLD.A00(c6966EdOA01, 5);
        A01 = new GLF(new C8930Ftm(5), HjH.class);
        A00 = GLC.A00(c6966EdOA01, 5);
    }

    public static GKP A00(GML variant) {
        if (GML.A03.equals(variant)) {
            return GKP.TINK;
        }
        if (GML.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (GML.A02.equals(variant)) {
            return GKP.RAW;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }
}
