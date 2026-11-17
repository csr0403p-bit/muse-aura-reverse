package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.FFq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7809FFq {
    public View A00;
    public final FBB A01;
    public final F0C A02;
    public final F0C A03;
    public final F0C A04;

    public static final void A00(C7809FFq c7809FFq, FDW fdw, boolean z, boolean z2) {
        ((C7813FFu) c7809FFq.A04.getValue()).A01 = true;
        HsM hsM = (HsM) c7809FFq.A03.getValue();
        C9115Fyg c9115FygA00 = C9115Fyg.A00();
        c9115FygA00.A06(Boolean.valueOf(z), 0);
        F6D.A03(c7809FFq.A01, fdw, C9115Fyg.A03(c9115FygA00, Boolean.valueOf(z2), 1), hsM);
    }

    public final void A01(View view, FDW fdw) {
        C7817FFy c7817FFy;
        this.A00 = view;
        C7813FFu c7813FFu = (C7813FFu) this.A04.getValue();
        boolean zA0L = fdw.A0L(44, false);
        FLV flv = c7813FFu.A02;
        if (zA0L) {
            if (!flv.isShowing() && (c7817FFy = c7813FFu.A00) != null) {
                RectF rectF = c7817FFy.A02;
                flv.A01(view, (int) rectF.left, (int) rectF.top);
            }
            FET fetA01 = ((C7815FFw) c7813FFu.A04.getValue()).A01(view, fdw);
            if (fetA01 != null) {
                FGR.A01(fetA01, flv.getContentView());
                C7817FFy c7817FFy2 = c7813FFu.A00;
                if (c7817FFy2 != null) {
                    RectF rectF2 = c7817FFy2.A02;
                    flv.update((int) rectF2.left, (int) rectF2.top, -1, -1);
                }
            }
        } else if (flv.isShowing()) {
            c7813FFu.A00();
        }
        c7813FFu.A01 = false;
    }

    public C7809FFq(FBB fbb, FDW fdw) {
        this.A01 = fbb;
        Integer num = C79.A0C;
        this.A03 = FZO.A00(num, fdw, 12);
        this.A02 = FZO.A00(num, fdw, 11);
        this.A04 = AbstractC5321DgF.A02(num, new C8197FYo(8, this, fdw));
    }
}
