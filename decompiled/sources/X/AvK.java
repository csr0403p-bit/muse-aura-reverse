package X;

/* loaded from: classes4.dex */
public abstract class AvK {
    public static final C1954Aus A00(C1958Aux c1958Aux, int i, int i2, int i3, long j, boolean z, boolean z2) {
        C1940Aud c1940Aud;
        if (z) {
            c1940Aud = null;
        } else {
            int iA0G = C8j3.A0G(j);
            C1962AvE c1962AvE = new C1962AvE(AbstractC1973Ave.A00(c1958Aux, iA0G), iA0G, 1L);
            int iA09 = AnonymousClass002.A09(j);
            c1940Aud = new C1940Aud(c1962AvE, new C1962AvE(AbstractC1973Ave.A00(c1958Aux, iA09), iA09, 1L), Au3.A05(j));
        }
        return new C1954Aus(new AvA(c1958Aux, 1, i, i2, i3, 1L), c1940Aud, 1, 1, z2);
    }
}
