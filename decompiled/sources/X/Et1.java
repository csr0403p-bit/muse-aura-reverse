package X;

import com.facebook.primitive.canvas.model.CanvasInverseTransform;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Et1 {
    public static final C3054BtW A00(FDW fdw, long j) {
        Object objA00;
        float fA06;
        float fA062;
        if (fdw.A05 != 16606) {
            throw C60O.A0i("Expected non-inverse transform model.");
        }
        float fA063 = fdw.A06(35, 1.0f);
        float fA064 = fdw.A06(36, 0.0f);
        float fA065 = fdw.A06(38, 0.0f);
        float fA066 = fdw.A06(40, 1.0f);
        String strA0F = fdw.A0F(41);
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = Hus.A00(strA0F, 0.0f, fA03);
        String strA0F2 = fdw.A0F(42);
        float fA002 = AnonymousClass004.A00(j);
        float fA003 = Hus.A00(strA0F2, 0.0f, fA002);
        List<FDW> listA0G = fdw.A0G();
        C7384Etj.A0U(listA0G);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0G);
        for (FDW fdw2 : listA0G) {
            C7384Etj.A0X(fdw2);
            int i = fdw2.A05;
            if (i == 16834) {
                objA00 = CanvasInverseTransform.A00;
            } else if (i == 16590) {
                objA00 = new Et4(fdw2.A06(38, 1.0f), fdw2.A06(40, 1.0f), BV8.A0L(fdw2, fA03, fA002, 35));
            } else if (i == 16607) {
                objA00 = new Et3(fdw2.A06(35, 0.0f), AbstractC5463Diy.A01(BV6.A01(fdw2, fA03, 36), BV6.A01(fdw2, fA002, 38)));
            } else if (i == 16599) {
                objA00 = new C3056BtY(BV6.A01(fdw2, fA03, 35), BV6.A01(fdw2, fA002, 36));
            } else {
                if (i == 16589) {
                    fA06 = BV6.A01(fdw2, fA03, 38);
                    fA062 = BV6.A01(fdw2, fA002, 40);
                } else if (i == 16830) {
                    fA06 = fdw2.A06(38, 0.0f);
                    fA062 = fdw2.A06(40, 0.0f);
                } else {
                    if (i != 16606) {
                        throw C60O.A0i("Unknown canvas child transform.");
                    }
                    objA00 = A00(fdw2, j);
                }
                objA00 = new Et2(fA06, fA062, BV8.A0L(fdw2, fA03, fA002, 35));
            }
            arrayListA0i.add(objA00);
        }
        return new C3054BtW(arrayListA0i, fA063, fA064, fA065, fA066, fA00, fA003);
    }
}
