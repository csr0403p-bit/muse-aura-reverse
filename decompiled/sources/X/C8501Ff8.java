package X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.Ff8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8501Ff8 extends C8503FfA {
    public static final C8497Ff4 A00 = AbstractC7607F5u.A0j(WindowInsets.CONSUMED);

    public C8501Ff8(C8497Ff4 c8497Ff4, C8501Ff8 c8501Ff8) {
        super(c8497Ff4, new WindowInsets(c8501Ff8.A0A));
        ((C8511FfI) this).A00 = null;
        ((C8511FfI) this).A00 = ((C8511FfI) c8501Ff8).A00;
        ((C8503FfA) this).A01 = null;
        ((C8503FfA) this).A00 = null;
        ((C8503FfA) this).A02 = null;
    }

    @Override // X.C8496Ff3
    public C8345FcJ A04(int i) {
        return C8345FcJ.A01(this.A0A.getInsets(AbstractC10400HbH.A00(i)));
    }

    @Override // X.C8496Ff3
    public C8345FcJ A05(int i) {
        return C8345FcJ.A01(this.A0A.getInsetsIgnoringVisibility(AbstractC10400HbH.A00(i)));
    }

    @Override // X.C8496Ff3
    public boolean A0C(int i) {
        return this.A0A.isVisible(AbstractC10400HbH.A00(i));
    }

    @Override // X.C8495Ff2, X.C8496Ff3
    public final void A0I(View view) {
    }

    public C8501Ff8(C8497Ff4 c8497Ff4, WindowInsets windowInsets) {
        super(c8497Ff4, windowInsets);
        ((C8511FfI) this).A00 = null;
        ((C8503FfA) this).A01 = null;
        ((C8503FfA) this).A00 = null;
        ((C8503FfA) this).A02 = null;
    }
}
