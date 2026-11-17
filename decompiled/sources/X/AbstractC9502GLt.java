package X;

/* renamed from: X.GLt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9502GLt {
    public static final GLC<GKV> A00;
    public static final GLF<C9508GLz, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GMG, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(6), GMG.class);
        A02 = GLD.A00(c6966EdOA01, 6);
        A01 = new GLF(new C8930Ftm(6), C9508GLz.class);
        A00 = GLC.A00(c6966EdOA01, 6);
    }

    public static GKP A00(GMM variant) {
        if (GMM.A03.equals(variant)) {
            return GKP.TINK;
        }
        if (GMM.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (GMM.A02.equals(variant)) {
            return GKP.RAW;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }
}
