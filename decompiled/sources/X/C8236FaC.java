package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.facebook.aura.R;

/* renamed from: X.FaC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8236FaC {
    public View A01;
    public PopupWindow.OnDismissListener A02;
    public AbstractC8231Fa7 A03;
    public InterfaceC8331Fby A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final C8249FaR A0A;
    public final boolean A0B;
    public int A00 = 8388611;
    public final PopupWindow.OnDismissListener A09 = new C8307FbZ(this);

    public void A01() {
        this.A03 = null;
        PopupWindow.OnDismissListener onDismissListener = this.A02;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final AbstractC8231Fa7 A00() {
        AbstractC8231Fa7 viewOnKeyListenerC8234FaA = this.A03;
        if (viewOnKeyListenerC8234FaA == null) {
            Context context = this.A08;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen._name_removed__res_0x7f07000c)) {
                viewOnKeyListenerC8234FaA = new ViewOnKeyListenerC8233Fa9(context, this.A01, this.A06, this.A07, this.A0B);
            } else {
                viewOnKeyListenerC8234FaA = new ViewOnKeyListenerC8234FaA(context, this.A01, this.A0A, this.A06, this.A07, this.A0B);
            }
            C8249FaR c8249FaR = this.A0A;
            boolean z = viewOnKeyListenerC8234FaA instanceof ViewOnKeyListenerC8234FaA;
            if (!z) {
                ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9 = (ViewOnKeyListenerC8233Fa9) viewOnKeyListenerC8234FaA;
                c8249FaR.A08(viewOnKeyListenerC8233Fa9.A0H, viewOnKeyListenerC8233Fa9);
                if (viewOnKeyListenerC8233Fa9.AP1()) {
                    ViewOnKeyListenerC8233Fa9.A01(viewOnKeyListenerC8233Fa9, c8249FaR);
                } else {
                    viewOnKeyListenerC8233Fa9.A0L.add(c8249FaR);
                }
            }
            PopupWindow.OnDismissListener onDismissListener = this.A09;
            if (z) {
                ((ViewOnKeyListenerC8234FaA) viewOnKeyListenerC8234FaA).A05 = onDismissListener;
            } else {
                ((ViewOnKeyListenerC8233Fa9) viewOnKeyListenerC8234FaA).A08 = onDismissListener;
            }
            View view = this.A01;
            if (z) {
                ((ViewOnKeyListenerC8234FaA) viewOnKeyListenerC8234FaA).A02 = view;
            } else {
                ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa92 = (ViewOnKeyListenerC8233Fa9) viewOnKeyListenerC8234FaA;
                if (viewOnKeyListenerC8233Fa92.A05 != view) {
                    viewOnKeyListenerC8233Fa92.A05 = view;
                    viewOnKeyListenerC8233Fa92.A00 = Gravity.getAbsoluteGravity(viewOnKeyListenerC8233Fa92.A02, view.getLayoutDirection());
                }
            }
            viewOnKeyListenerC8234FaA.Acz(this.A04);
            viewOnKeyListenerC8234FaA.A02(this.A05);
            int i = this.A00;
            if (z) {
                ((ViewOnKeyListenerC8234FaA) viewOnKeyListenerC8234FaA).A01 = i;
            } else {
                ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa93 = (ViewOnKeyListenerC8233Fa9) viewOnKeyListenerC8234FaA;
                if (viewOnKeyListenerC8233Fa93.A02 != i) {
                    viewOnKeyListenerC8233Fa93.A02 = i;
                    viewOnKeyListenerC8233Fa93.A00 = Gravity.getAbsoluteGravity(i, viewOnKeyListenerC8233Fa93.A05.getLayoutDirection());
                }
            }
            this.A03 = viewOnKeyListenerC8234FaA;
        }
        return viewOnKeyListenerC8234FaA;
    }

    public C8236FaC(Context context, View view, C8249FaR c8249FaR, int i, int i2, boolean z) {
        this.A08 = context;
        this.A0A = c8249FaR;
        this.A01 = view;
        this.A0B = z;
        this.A06 = i;
        this.A07 = i2;
    }
}
