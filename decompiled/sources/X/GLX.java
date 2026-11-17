package X;

/* loaded from: classes6.dex */
public abstract class GLX {
    public static C6966EdO A00(GLV glv, Integer num) {
        GLZ glz = glv.A02;
        if (glz == GLZ.A03) {
            return AbstractC9478GKu.A00;
        }
        if (glz == GLZ.A02 || glz == GLZ.A01) {
            return AbstractC7608F5v.A0S(num);
        }
        if (glz == GLZ.A04) {
            return AbstractC7608F5v.A0T(num);
        }
        throw AbstractC7607F5u.A10(glz, "Unknown AesCmacParametersParameters.Variant: ");
    }
}
