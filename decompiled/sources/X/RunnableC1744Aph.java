package X;

import android.os.Build;
import android.view.View;
import java.util.List;

/* renamed from: X.Aph, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC1744Aph extends AbstractC8493Ff0 implements Runnable, FPU, View.OnAttachStateChangeListener {
    public static final String __redex_internal_original_name = "InsetsListener";
    public C8497Ff4 A00;
    public boolean A01;
    public boolean A02;
    public final C1743Apg A03;

    @Override // X.AbstractC8493Ff0
    public final C8492Fez A03(C8492Fez c8492Fez, C8490Fex c8490Fex) {
        this.A01 = false;
        return c8492Fez;
    }

    @Override // X.AbstractC8493Ff0
    public final void A05(C8490Fex c8490Fex) {
        this.A01 = false;
        this.A02 = false;
        C8497Ff4 c8497Ff4 = this.A00;
        if (c8490Fex.A00.A08() > 0 && c8497Ff4 != null) {
            C1743Apg c1743Apg = this.A03;
            C1751Apo c1751Apo = c1743Apg.A09;
            C8496Ff3 c8496Ff3 = c8497Ff4.A00;
            AbstractC1742Apf.A00(c1751Apo, c8496Ff3.A04(8));
            AbstractC1742Apf.A00(c1743Apg.A0A, c8496Ff3.A04(8));
            C1743Apg.A02(c1743Apg, c8497Ff4);
        }
        this.A00 = null;
    }

    @Override // X.AbstractC8493Ff0
    public final void A06(C8490Fex c8490Fex) {
        this.A01 = true;
        this.A02 = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public RunnableC1744Aph(C1743Apg c1743Apg) {
        super(!c1743Apg.A0G ? 1 : 0);
        this.A03 = c1743Apg;
    }

    @Override // X.AbstractC8493Ff0
    public final C8497Ff4 A04(C8497Ff4 c8497Ff4, List<C8490Fex> list) {
        C1743Apg c1743Apg = this.A03;
        C1743Apg.A02(c1743Apg, c8497Ff4);
        return c1743Apg.A0G ? C8497Ff4.A01 : c8497Ff4;
    }

    @Override // X.FPU
    public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
        this.A00 = c8497Ff4;
        C1743Apg c1743Apg = this.A03;
        C1751Apo c1751Apo = c1743Apg.A0A;
        C8496Ff3 c8496Ff3 = c8497Ff4.A00;
        AbstractC1742Apf.A00(c1751Apo, c8496Ff3.A04(8));
        if (this.A01) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.A02) {
            AbstractC1742Apf.A00(c1743Apg.A09, c8496Ff3.A04(8));
            C1743Apg.A02(c1743Apg, c8497Ff4);
        }
        return c1743Apg.A0G ? C8497Ff4.A01 : c8497Ff4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A01) {
            this.A01 = false;
            this.A02 = false;
            C8497Ff4 c8497Ff4 = this.A00;
            if (c8497Ff4 != null) {
                C1743Apg c1743Apg = this.A03;
                AbstractC1742Apf.A00(c1743Apg.A09, c8497Ff4.A00.A04(8));
                C1743Apg.A02(c1743Apg, c8497Ff4);
                this.A00 = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }
}
