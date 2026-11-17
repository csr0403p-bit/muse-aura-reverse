package X;

/* loaded from: classes6.dex */
public abstract class GME {
    public static C6966EdO A00(GM4 gm4, Integer num) {
        GMK gmk = gm4.A03;
        if (gmk == GMK.A02) {
            return AbstractC9478GKu.A00;
        }
        if (gmk == GMK.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (gmk == GMK.A03) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(gmk, "Unknown AesGcmParameters.Variant: ");
    }
}
