package X;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import java.util.List;

/* loaded from: classes6.dex */
public final class FEQ implements Runnable {
    public static final String __redex_internal_original_name = "BKBloksComponentsCdsInternalPopupBinderUtil$createRenderUnit$1$bind$1";
    public final /* synthetic */ FLU A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ FDW A02;
    public final /* synthetic */ Object A03;

    public FEQ(FLU flu, FBB fbb, FDW fdw, Object obj) {
        this.A01 = fbb;
        this.A02 = fdw;
        this.A00 = flu;
        this.A03 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strValueOf;
        String str;
        C7652F8t c7652F8t = C7652F8t.A00;
        FBB fbb = this.A01;
        FDW fdw = this.A02;
        try {
            strValueOf = fdw.A0F(35);
            if (strValueOf == null) {
                throw BV4.A0c("Popup does not have an anchor view id");
            }
        } catch (ClassCastException unused) {
            long jA08 = fdw.A08(35, 0L);
            if (jA08 == 0) {
                throw BV4.A0c("Popup does not have an anchor view id");
            }
            strValueOf = String.valueOf(jA08);
        }
        F9b f9bA03 = FBA.A03(fbb);
        C7384Etj.A0U(f9bA03);
        FDW fdwA00 = FB6.A00(f9bA03, new F6N(strValueOf));
        if (fdwA00 != null) {
            View viewA09 = fdwA00.A09(fbb);
            if (viewA09 != null || (viewA09 = C7652F8t.A00(c7652F8t, fbb, fdwA00)) != null) {
                PopupWindow popupWindow = this.A00.A00;
                List listA15 = AbstractC7608F5v.A15(fdw, 32);
                if (listA15.size() >= 1) {
                    Object obj = this.A03;
                    C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.IntArray");
                    int[] iArr = (int[]) obj;
                    long jA00 = C7827FGi.A00(View.MeasureSpec.makeMeasureSpec(viewA09.getWidth(), View.MeasureSpec.getMode(iArr[0])), iArr[1]);
                    Object obj2 = listA15.get(0);
                    C7384Etj.A0U(obj2);
                    FET fet = FEC.A00(null, fbb, (FDW) obj2, jA00).A01;
                    View contentView = popupWindow.getContentView();
                    C1H.A00(contentView);
                    FGR.A01(fet, contentView);
                    float fA06 = fdw.A06(36, 0.0f);
                    float fA062 = fdw.A06(38, 0.0f);
                    Context contextA00 = FBB.A00(fbb);
                    int iRound = Math.round(HsH.A00(contextA00, fA06));
                    int iRound2 = Math.round(HsH.A00(contextA00, fA062));
                    if (FKI.A00(contextA00)) {
                        iRound = (-FGW.A00(fet.A03)) - iRound;
                    }
                    popupWindow.showAsDropDown(viewA09, iRound, iRound2);
                    return;
                }
                str = "Popup must have a child element.";
            }
            FFI.A01(null, str, null);
        }
        FFI.A03("Could not find component with anchor view id: ", strValueOf);
        str = "Popup cannot find text input view to anchor to";
        FFI.A01(null, str, null);
    }
}
