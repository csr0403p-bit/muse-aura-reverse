package X;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class EFT extends AbstractC10584Hwp {
    public final EFS A00;

    @Override // X.AbstractC10584Hwp
    public final void A01(boolean z) {
        if (E9X.A08 != null) {
            this.A00.A01(z);
        }
    }

    @Override // X.AbstractC10584Hwp
    public final void A02(boolean z) {
        boolean z2 = !AnonymousClass002.A1X(E9X.A08);
        EFS efs = this.A00;
        if (z2) {
            efs.A00 = z;
        } else {
            efs.A02(z);
        }
    }

    @Override // X.AbstractC10584Hwp
    public final InputFilter[] A03(InputFilter[] inputFilterArr) {
        return E9X.A08 != null ? this.A00.A03(inputFilterArr) : inputFilterArr;
    }

    public EFT(TextView textView) {
        this.A00 = new EFS(textView);
    }
}
