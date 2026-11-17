package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CbD implements CbG {
    @Override // X.CbG
    public final CbI AcR(Context context, CbJ cbJ, String str) {
        CbI cbI = new CbI();
        int i = 1;
        int iAjN = cbJ.AjN(context, str, true);
        cbI.A01 = iAjN;
        if (iAjN == 0) {
            int iAjB = cbJ.AjB(context, str);
            cbI.A00 = iAjB;
            if (iAjB != 0) {
                i = -1;
                cbI.A02 = i;
            }
        } else {
            cbI.A02 = i;
        }
        return cbI;
    }
}
