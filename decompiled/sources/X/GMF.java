package X;

/* loaded from: classes6.dex */
public abstract class GMF {
    public static C6966EdO A00(GM8 gm8, Integer num) {
        GML gml = gm8.A01;
        if (gml == GML.A02) {
            return AbstractC9478GKu.A00;
        }
        if (gml == GML.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (gml == GML.A03) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(gml, "Unknown AesGcmSivParameters.Variant: ");
    }
}
