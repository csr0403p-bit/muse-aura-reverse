package X;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class GLN {
    public static final GLY<GKK, GLL> A00;
    public static final GLY<GKP, C9484GLa> A01;
    public static final GLC<GKV> A02;
    public static final GLF<Ho4, GKV> A03;
    public static final GLD<GKZ> A04;
    public static final GLB<GLO, GKZ> A05;
    public static final C6966EdO A06;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.HmacKey");
        A06 = c6966EdOA01;
        HashMap mapA0u = BV4.A0u();
        HashMap mapA0u2 = BV4.A0u();
        GKP gkp = GKP.RAW;
        C9484GLa c9484GLa = C9484GLa.A03;
        mapA0u.put(gkp, c9484GLa);
        mapA0u2.put(c9484GLa, gkp);
        GKP gkp2 = GKP.TINK;
        C9484GLa c9484GLa2 = C9484GLa.A04;
        mapA0u.put(gkp2, c9484GLa2);
        mapA0u2.put(c9484GLa2, gkp2);
        GKP gkp3 = GKP.LEGACY;
        C9484GLa c9484GLa3 = C9484GLa.A02;
        mapA0u.put(gkp3, c9484GLa3);
        mapA0u2.put(c9484GLa3, gkp3);
        GKP gkp4 = GKP.CRUNCHY;
        C9484GLa c9484GLa4 = C9484GLa.A01;
        mapA0u.put(gkp4, c9484GLa4);
        mapA0u2.put(c9484GLa4, gkp4);
        A01 = new GLY<>(Collections.unmodifiableMap(mapA0u), Collections.unmodifiableMap(mapA0u2));
        HashMap mapA0u3 = BV4.A0u();
        HashMap mapA0u4 = BV4.A0u();
        GKK gkk = GKK.SHA1;
        GLL gll = GLL.A01;
        mapA0u3.put(gkk, gll);
        mapA0u4.put(gll, gkk);
        GKK gkk2 = GKK.SHA224;
        GLL gll2 = GLL.A02;
        mapA0u3.put(gkk2, gll2);
        mapA0u4.put(gll2, gkk2);
        GKK gkk3 = GKK.SHA256;
        GLL gll3 = GLL.A03;
        mapA0u3.put(gkk3, gll3);
        mapA0u4.put(gll3, gkk3);
        GKK gkk4 = GKK.SHA384;
        GLL gll4 = GLL.A04;
        mapA0u3.put(gkk4, gll4);
        mapA0u4.put(gll4, gkk4);
        GKK gkk5 = GKK.SHA512;
        GLL gll5 = GLL.A05;
        mapA0u3.put(gkk5, gll5);
        mapA0u4.put(gll5, gkk5);
        A00 = new GLY<>(Collections.unmodifiableMap(mapA0u3), Collections.unmodifiableMap(mapA0u4));
        A05 = new GLB(new C8929Ftl(11), GLO.class);
        A04 = GLD.A00(c6966EdOA01, 11);
        A03 = new GLF(new C8930Ftm(12), Ho4.class);
        A02 = GLC.A00(c6966EdOA01, 11);
    }

    public static GKJ A00(GLO parameters) {
        GHW ghwA09 = GHS.A09(GKJ.DEFAULT_INSTANCE);
        ((GKJ) GHW.A00(ghwA09)).tagSize_ = parameters.A01;
        GLY<GKK, GLL> gly = A00;
        GLL gll = parameters.A02;
        Enum r2 = (Enum) gly.A01.get(gll);
        if (r2 == null) {
            throw AbstractC7611F5y.A0a(gll, "Unable to convert object enum: ");
        }
        GKK gkk = (GKK) r2;
        GKJ gkj = (GKJ) GHW.A00(ghwA09);
        if (gkk == GKK.UNRECOGNIZED) {
            throw C60O.A0i("Can't get the number of an unknown enum value.");
        }
        gkj.hash_ = gkk.value;
        return (GKJ) ghwA09.A02();
    }
}
