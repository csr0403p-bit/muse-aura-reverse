package X;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public final class I0E extends AbstractC8334Fc1 {
    public final int $t;
    public final Object A00;

    public I0E(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.AbstractC8334Fc1, X.FT0
    public final void onAnimationEnd(View view) {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT;
        View view2;
        View view3;
        switch (this.$t) {
            case 0:
                layoutInflaterFactory2C8250FaT = ((RunnableC8271Fat) this.A00).A00;
                layoutInflaterFactory2C8250FaT.A0L.setAlpha(1.0f);
                layoutInflaterFactory2C8250FaT.A0N.A04(null);
                layoutInflaterFactory2C8250FaT.A0N = null;
                break;
            case 1:
                layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) this.A00;
                layoutInflaterFactory2C8250FaT.A0L.setAlpha(1.0f);
                layoutInflaterFactory2C8250FaT.A0N.A04(null);
                layoutInflaterFactory2C8250FaT.A0N = null;
                break;
            case 2:
                LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT2 = ((C8262Fak) this.A00).A01;
                layoutInflaterFactory2C8250FaT2.A0L.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C8250FaT2.A0A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else {
                    AbstractC7611F5y.A0j(layoutInflaterFactory2C8250FaT2);
                }
                layoutInflaterFactory2C8250FaT2.A0L.A05();
                layoutInflaterFactory2C8250FaT2.A0N.A04(null);
                layoutInflaterFactory2C8250FaT2.A0N = null;
                view2 = layoutInflaterFactory2C8250FaT2.A08;
                view2.requestApplyInsets();
                break;
            case 3:
                C8251FaW c8251FaW = (C8251FaW) this.A00;
                if (c8251FaW.A0D && (view3 = c8251FaW.A03) != null) {
                    view3.setTranslationY(0.0f);
                    c8251FaW.A08.setTranslationY(0.0f);
                }
                c8251FaW.A08.setVisibility(8);
                c8251FaW.A08.setTransitioning(false);
                c8251FaW.A07 = null;
                InterfaceC8306FbY interfaceC8306FbY = c8251FaW.A05;
                if (interfaceC8306FbY != null) {
                    interfaceC8306FbY.ASW(c8251FaW.A06);
                    c8251FaW.A06 = null;
                    c8251FaW.A05 = null;
                }
                view2 = c8251FaW.A0A;
                if (view2 == null) {
                }
                view2.requestApplyInsets();
                break;
            default:
                C8251FaW c8251FaW2 = (C8251FaW) this.A00;
                c8251FaW2.A07 = null;
                c8251FaW2.A08.requestLayout();
                break;
        }
    }

    @Override // X.AbstractC8334Fc1, X.FT0
    public final void onAnimationStart(View view) {
        switch (this.$t) {
            case 0:
                ((RunnableC8271Fat) this.A00).A00.A0L.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = (LayoutInflaterFactory2C8250FaT) this.A00;
                layoutInflaterFactory2C8250FaT.A0L.setVisibility(0);
                AbstractC7611F5y.A0j(layoutInflaterFactory2C8250FaT);
                break;
        }
    }
}
