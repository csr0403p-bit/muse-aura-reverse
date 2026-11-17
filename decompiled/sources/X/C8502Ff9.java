package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.Ff9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8502Ff9 extends C8512FfJ {
    public static final C8497Ff4 A00 = AbstractC7607F5u.A0j(WindowInsets.CONSUMED);

    @Override // X.C8501Ff8, X.C8496Ff3
    public final C8345FcJ A04(int i) {
        return C8345FcJ.A01(this.A0A.getInsets(AbstractC10401HbI.A00(i)));
    }

    @Override // X.C8501Ff8, X.C8496Ff3
    public final C8345FcJ A05(int i) {
        return C8345FcJ.A01(this.A0A.getInsetsIgnoringVisibility(AbstractC10401HbI.A00(i)));
    }

    @Override // X.C8501Ff8, X.C8496Ff3
    public final boolean A0C(int i) {
        return this.A0A.isVisible(AbstractC10401HbI.A00(i));
    }

    @Override // X.C8495Ff2, X.C8496Ff3
    public final void A0J(View view) {
    }

    public C8502Ff9(C8497Ff4 c8497Ff4, C8502Ff9 c8502Ff9) {
        super(c8497Ff4, (C8501Ff8) c8502Ff9);
    }

    public C8502Ff9(C8497Ff4 c8497Ff4, WindowInsets windowInsets) {
        super(c8497Ff4, windowInsets);
    }
}
