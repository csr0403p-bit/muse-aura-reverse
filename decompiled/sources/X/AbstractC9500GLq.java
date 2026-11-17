package X;

/* renamed from: X.GLq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9500GLq {
    public static final GLC<GKV> A00;
    public static final GLF<GMI, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GM4, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.AesGcmKey");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(4), GM4.class);
        A02 = GLD.A00(c6966EdOA01, 4);
        A01 = new GLF(new C8930Ftm(4), GMI.class);
        A00 = GLC.A00(c6966EdOA01, 4);
    }

    public static GKP A00(GMK variant) {
        if (GMK.A03.equals(variant)) {
            return GKP.TINK;
        }
        if (GMK.A01.equals(variant)) {
            return GKP.CRUNCHY;
        }
        if (GMK.A02.equals(variant)) {
            return GKP.RAW;
        }
        throw AbstractC7611F5y.A0a(variant, "Unable to serialize variant: ");
    }

    public static void A01(GM4 parameters) {
        int i = parameters.A02;
        if (i != 16) {
            throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", BV5.A1Y(i));
        }
        int i2 = parameters.A00;
        if (i2 != 12) {
            throw AbstractC7609F5w.A0v("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", BV5.A1Y(i2));
        }
    }
}
