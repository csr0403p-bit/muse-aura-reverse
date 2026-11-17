package X;

import android.graphics.Shader;
import com.facebook.primitive.canvas.model.CanvasRadialGradient;
import com.instagram.common.bloks.lexer.ParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class HiW {
    /* JADX WARN: Type inference failed for: r11v4, types: [X.FBB, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.BtW] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static final InterfaceC8642Fhu A01(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, long j) {
        C3054BtW c3054BtWA00;
        InterfaceC8639Fhr canvasRadialGradient;
        int i = fdw.A05;
        if (i == 16591) {
            FDW fdwA0Y = AbstractC7608F5v.A0Y(fdw);
            if (fdwA0Y != null) {
                iA00 = HlW.A00(fdwA0Y, interfaceC10557Hsn, 0);
            } else {
                FFI.A01(null, "Color shading is missing the themed color; defaulting to transparent", null);
            }
            return new C8641Fht(iA00);
        }
        C8637Fhp c8637Fhp = null;
        ?? A00 = 0;
        C3054BtW c3054BtW = null;
        if (i == 16616) {
            FDW fdwA0C = fdw.A0C(38);
            if (fdwA0C == null) {
                throw C60O.A0i("Linear gradient shading must specify the gradient");
            }
            C7911FKj c7911FKjA00 = A00(fdwA0C, interfaceC10557Hsn);
            String strA0r = AbstractC7608F5v.A0r(fdw);
            float fA03 = AnonymousClass003.A03(j);
            float fA00 = Hus.A00(strA0r, 0.0f, fA03);
            String strA0s = AbstractC7608F5v.A0s(fdw);
            float fA002 = AnonymousClass004.A00(j);
            long jA01 = AbstractC5463Diy.A01(fA00, Hus.A00(strA0s, 0.0f, fA002));
            long jA0L = BV8.A0L(fdw, fA03, fA002, 35);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            FDW fdwA0C2 = fdw.A0C(48);
            if (fdwA0C2 != null) {
                try {
                    A00 = Et1.A00(fdwA0C2, j);
                    c3054BtW = A00;
                } catch (ParsingException | IllegalArgumentException e) {
                    FFI.A01(A00, BV5.A0n("Invalid gradient shading transform: ", e), A00);
                    c3054BtW = null;
                }
            }
            canvasRadialGradient = new C8635Fhn(tileMode, c7911FKjA00, c3054BtW, jA01, jA0L);
        } else {
            if (i != 16615) {
                throw C60O.A0i("Unknown canvas shading.");
            }
            FDW fdwA0C3 = fdw.A0C(38);
            if (fdwA0C3 == null) {
                throw C60O.A0i("Radial gradient shading must specify the gradient");
            }
            C7911FKj c7911FKjA002 = A00(fdwA0C3, interfaceC10557Hsn);
            String strA0o = AbstractC7608F5v.A0o(fdw);
            float fA003 = AnonymousClass001.A00(j);
            float fA004 = Hus.A00(strA0o, 0.0f, fA003);
            String strA0p = AbstractC7608F5v.A0p(fdw);
            float fA005 = AnonymousClass004.A00(j);
            long jA012 = AbstractC5463Diy.A01(fA004, Hus.A00(strA0p, 0.0f, fA005));
            iA00 = (AbstractC7608F5v.A0v(fdw) == null && fdw.A0F(48) == null && fdw.A0F(49) == null) ? 0 : 1;
            float fA006 = HjB.A00(fdw, 0.0f, 40);
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            FDW fdwA0C4 = fdw.A0C(50);
            if (fdwA0C4 != null) {
                try {
                    c3054BtWA00 = Et1.A00(fdwA0C4, j);
                } catch (ParsingException | IllegalArgumentException e2) {
                    FFI.A01(null, BV5.A0n("Invalid gradient shading transform: ", e2), null);
                    c3054BtWA00 = null;
                }
            } else {
                c3054BtWA00 = null;
            }
            if (iA00 != 0) {
                String strA0v = AbstractC7608F5v.A0v(fdw);
                float fA007 = AnonymousClass001.A00(jA012);
                try {
                    fA007 = Hus.A00(strA0v, fA007, fA003);
                } catch (ParsingException | IllegalArgumentException unused) {
                    FFI.A01(null, FGI.A0M("Invalid radial gradient start center: ", strA0v), null);
                }
                String strA0F = fdw.A0F(48);
                float fA008 = AnonymousClass004.A00(jA012);
                try {
                    fA008 = Hus.A00(strA0F, fA008, fA005);
                } catch (ParsingException | IllegalArgumentException unused2) {
                    FFI.A01(null, FGI.A0M("Invalid radial gradient start center: ", strA0F), null);
                }
                c8637Fhp = new C8637Fhp(AbstractC5463Diy.A01(fA007, fA008));
            }
            String strA0F2 = fdw.A0F(49);
            float fA01 = 0.0f;
            if (strA0F2 != null) {
                try {
                    fA01 = HiY.A01(strA0F2);
                } catch (ParsingException | IllegalArgumentException unused3) {
                    FFI.A03("Invalid radial gradient start radius: ", strA0F2);
                }
            }
            canvasRadialGradient = new CanvasRadialGradient(tileMode2, c7911FKjA002, c3054BtWA00, c8637Fhp, fA006, fA01, jA012);
        }
        return new C8640Fhs(canvasRadialGradient);
    }

    public static final C7911FKj A00(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn) {
        if (fdw.A05 != 16594) {
            throw C60O.A0i("Expected canvas gradient model.");
        }
        List listA14 = AbstractC7608F5v.A14(fdw, 36);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA14);
        Iterator it = listA14.iterator();
        while (it.hasNext()) {
            C60Q.A1P(arrayListA0i, HlW.A00(AbstractC7607F5u.A0y(it), interfaceC10557Hsn, 0));
        }
        return new C7911FKj(AbstractC7608F5v.A15(fdw, 35).isEmpty() ? null : AbstractC0878AGe.A0m(AbstractC7608F5v.A15(fdw, 35)), AbstractC0878AGe.A0n(arrayListA0i));
    }
}
