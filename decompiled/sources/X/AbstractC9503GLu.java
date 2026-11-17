package X;

/* renamed from: X.GLu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9503GLu {
    public static final GLC<GKV> A00;
    public static final GLF<GM0, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GMH, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(8), GMH.class);
        A02 = GLD.A00(c6966EdOA01, 8);
        A01 = new GLF(new C8930Ftm(8), GM0.class);
        A00 = GLC.A00(c6966EdOA01, 8);
    }

    public static GKP A00(GMO variant) {
        if (GMO.A03.equals(variant)) {
            return GKP.TINK;
        }
        if (GMO.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (GMO.A02.equals(variant)) {
            return GKP.RAW;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }
}
