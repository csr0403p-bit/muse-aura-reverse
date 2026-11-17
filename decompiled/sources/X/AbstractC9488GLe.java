package X;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.GLe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9488GLe {
    public static final GLC<GKV> A00;
    public static final GLF<C9492GLi, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<C9490GLg, GKZ> A03;
    public static final Map<GKP, C9486GLc> A04;
    public static final Map<C9486GLc, GKP> A05;
    public static final C6966EdO A06;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.AesSivKey");
        A06 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(9), C9490GLg.class);
        A02 = GLD.A00(c6966EdOA01, 9);
        A01 = new GLF(new C8930Ftm(9), C9492GLi.class);
        A00 = GLC.A00(c6966EdOA01, 9);
        HashMap mapA0u = BV4.A0u();
        C9486GLc c9486GLc = C9486GLc.A02;
        GKP gkp = GKP.RAW;
        mapA0u.put(c9486GLc, gkp);
        C9486GLc c9486GLc2 = C9486GLc.A03;
        GKP gkp2 = GKP.TINK;
        mapA0u.put(c9486GLc2, gkp2);
        C9486GLc c9486GLc3 = C9486GLc.A01;
        GKP gkp3 = GKP.CRUNCHY;
        mapA0u.put(c9486GLc3, gkp3);
        A05 = Collections.unmodifiableMap(mapA0u);
        EnumMap enumMap = new EnumMap(GKP.class);
        enumMap.put((EnumMap) gkp, (GKP) c9486GLc);
        enumMap.put((EnumMap) gkp2, (GKP) c9486GLc2);
        enumMap.put((EnumMap) gkp3, (GKP) c9486GLc3);
        enumMap.put((EnumMap) GKP.LEGACY, (GKP) c9486GLc3);
        A04 = Collections.unmodifiableMap(enumMap);
    }
}
