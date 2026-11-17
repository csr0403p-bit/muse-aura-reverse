package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import java.util.HashMap;

/* renamed from: X.FFw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7815FFw {
    public FEE<?, FBB> A00;
    public FEE<?, FBB> A01;
    public final C7813FFu A02;
    public final C7814FFv A03;
    public final FBB A04;

    public static Float A00(Context context, int i) {
        return Float.valueOf(FE5.A00(context, i));
    }

    public final FET A01(View view, FDW fdw) {
        int i;
        int i2;
        FEE<?, FBB> feeA00;
        FDW fdwA0C = fdw.A0C(43);
        if (fdwA0C == null) {
            throw C60O.A0i("Server should have ensured that the Tooltip Container always has a Tooltip.");
        }
        float fA00 = HjB.A00(fdwA0C, 0.0f, 49);
        float fA002 = HjB.A00(fdwA0C, 0.0f, 43);
        Resources resources = view.getResources();
        FBB fbb = this.A04;
        float fMin = Math.min(resources.getDisplayMetrics().widthPixels * 0.8f, TypedValue.applyDimension(1, 300.0f, C60Q.A0B(FBB.A00(fbb))));
        if (fA00 == 0.0f) {
            i = (int) fMin;
            int i3 = FF1.A00;
            i2 = Integer.MIN_VALUE;
        } else {
            i = (int) fA00;
            int i4 = FF1.A00;
            i2 = 1073741824;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, i2);
        int iA05 = fA002 == 0.0f ? FF1.A00 : AbstractC7608F5v.A05((int) fA002);
        C7813FFu c7813FFu = this.A02;
        c7813FFu.A00 = null;
        FEE<?, FBB> feeA002 = FEC.A00(this.A01, fbb, fdwA0C, C7827FGi.A00(iMakeMeasureSpec, iA05));
        this.A01 = feeA002;
        Rect rect = feeA002.A03.A02.A03;
        int iWidth = rect.width();
        int iHeight = rect.height();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rectA0X = AbstractC7607F5u.A0X();
        view.getRootView().getWindowVisibleDisplayFrame(rectA0X);
        int i5 = displayMetrics.widthPixels;
        int i6 = rectA0X.bottom;
        int i7 = displayMetrics.heightPixels;
        if (i6 > i7) {
            i6 = i7;
        }
        C7816FFx c7816FFx = new C7816FFx(i5, i6, iArr[0], iArr[1], view.getWidth(), view.getHeight(), iWidth, iHeight, FKH.A00(AbstractC7608F5v.A0E(view)));
        C7814FFv c7814FFv = this.A03;
        HashMap<C7816FFx, C7817FFy> map = c7814FFv.A01;
        C7817FFy c7817FFy = map.get(c7816FFx);
        if (c7817FFy == null) {
            HsM hsMA0D = fdw.A0D(40);
            if (hsMA0D == null) {
                throw C60O.A0i("Server should have ensured that the Tooltip Container always has on-compute-position.");
            }
            FBB fbb2 = c7814FFv.A00;
            Context context = fbb2.A00;
            C7384Etj.A0U(context);
            C9115Fyg c9115FygA00 = C9115Fyg.A00();
            c9115FygA00.A06(A00(context, c7816FFx.A05), 0);
            c9115FygA00.A06(A00(context, c7816FFx.A04), 1);
            c9115FygA00.A06(A00(context, c7816FFx.A02), 2);
            c9115FygA00.A06(A00(context, c7816FFx.A03), 3);
            c9115FygA00.A06(A00(context, c7816FFx.A01), 4);
            c9115FygA00.A06(A00(context, c7816FFx.A00), 5);
            c9115FygA00.A06(A00(context, c7816FFx.A07), 6);
            c9115FygA00.A06(A00(context, c7816FFx.A06), 7);
            Object objA03 = F6D.A03(fbb2, fdw, C9115Fyg.A03(c9115FygA00, Boolean.valueOf(c7816FFx.A08), 8), hsMA0D);
            C7384Etj.A0U(objA03);
            FDW fdw2 = (FDW) objA03;
            C7384Etj.A0Y(fdw2, 0);
            float fA06 = fdw2.A06(43, 0.0f);
            float fA062 = fdw2.A06(44, 0.0f);
            float fA063 = fdw2.A06(42, 0.0f);
            float fA064 = fdw2.A06(41, 0.0f);
            float fA065 = fdw2.A06(38, 0.0f);
            float fA066 = fdw2.A06(40, 0.0f);
            float fA067 = fdw2.A06(48, 0.0f);
            float fA068 = fdw2.A06(46, 0.0f);
            float fA069 = fdw2.A06(55, 0.0f);
            float fA0610 = fdw2.A06(56, 0.0f);
            float fA0611 = fdw2.A06(54, 0.0f);
            float fA0612 = fdw2.A06(53, 0.0f);
            String strA0u = AbstractC7608F5v.A0u(fdw2);
            for (FIe fIe : FIe.values()) {
                if (C7384Etj.areEqual(fIe.value, strA0u)) {
                    String strA0p = AbstractC7608F5v.A0p(fdw2);
                    for (EnumC7870FIi enumC7870FIi : EnumC7870FIi.values()) {
                        if (C7384Etj.areEqual(enumC7870FIi.value, strA0p)) {
                            c7817FFy = new C7817FFy(new RectF(TypedValue.applyDimension(1, fA06, C60Q.A0B(context)), TypedValue.applyDimension(1, fA062, C60Q.A0B(context)), TypedValue.applyDimension(1, fA06 + fA063, C60Q.A0B(context)), TypedValue.applyDimension(1, fA062 + fA064, C60Q.A0B(context))), new RectF(TypedValue.applyDimension(1, fA069, C60Q.A0B(context)), TypedValue.applyDimension(1, fA0610, C60Q.A0B(context)), TypedValue.applyDimension(1, fA069 + fA0611, C60Q.A0B(context)), TypedValue.applyDimension(1, fA0610 + fA0612, C60Q.A0B(context))), new RectF(TypedValue.applyDimension(1, fA065, C60Q.A0B(context)), TypedValue.applyDimension(1, fA066, C60Q.A0B(context)), TypedValue.applyDimension(1, fA065 + fA067, C60Q.A0B(context)), TypedValue.applyDimension(1, fA066 + fA068, C60Q.A0B(context))), enumC7870FIi, fIe);
                            map.put(c7816FFx, c7817FFy);
                        }
                    }
                    throw AbstractC7608F5v.A0e();
                }
            }
            throw AbstractC7608F5v.A0e();
        }
        if (C7384Etj.areEqual(c7813FFu.A00, c7817FFy)) {
            feeA00 = this.A00;
            if (feeA00 == null) {
                return null;
            }
        } else {
            c7813FFu.A00 = c7817FFy;
            RectF rectF = c7817FFy.A02;
            int iWidth2 = (int) rectF.width();
            int iHeight2 = (int) rectF.height();
            feeA00 = FEC.A00(this.A00, fbb, fdwA0C, C7828FGj.A00.A00(iWidth2, iWidth2, iHeight2, iHeight2));
            this.A00 = feeA00;
        }
        return feeA00.A01;
    }

    public C7815FFw(C7813FFu c7813FFu, FBB fbb) {
        this.A04 = fbb;
        this.A02 = c7813FFu;
        this.A03 = new C7814FFv(fbb);
    }
}
