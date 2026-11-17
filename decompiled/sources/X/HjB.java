package X;

import com.instagram.common.bloks.lexer.ParsingException;

/* loaded from: classes6.dex */
public abstract class HjB {
    public static final float A00(FDW fdw, float f, int i) {
        String strA0F = fdw.A0F(i);
        if (strA0F == null) {
            return f;
        }
        try {
            f = HiY.A01(strA0F);
            return f;
        } catch (ParsingException unused) {
            FFI.A03("Error parsing pixel value ", strA0F);
            return f;
        }
    }

    public static int A01(FDW fdw, float f, int i) {
        return (int) A00(fdw, f, i);
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.FBB, java.lang.Float, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Float] */
    public static final Float A02(FDW fdw, int i) {
        String strA0F = fdw.A0F(i);
        ?? ValueOf = 0;
        if (strA0F == null) {
            return null;
        }
        try {
            ValueOf = Float.valueOf(HiY.A01(strA0F));
            return ValueOf;
        } catch (ParsingException unused) {
            FFI.A01(ValueOf, FGI.A0M("Error parsing pixel value ", strA0F), ValueOf);
            return ValueOf;
        }
    }
}
