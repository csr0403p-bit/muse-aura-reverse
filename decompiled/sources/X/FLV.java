package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.PopupWindow;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FLV extends PopupWindow {
    public int A00;
    public View A01;
    public Function0<Unit> A02;
    public Function0<Unit> A03;
    public Function0<Unit> A04;
    public final View.OnLayoutChangeListener A05;

    public FLV(Context context) {
        super(context);
        this.A05 = new I0V(this, 0);
        setContentView(new FGE(context));
        setInputMethodMode(2);
        setBackgroundDrawable(new ColorDrawable(0));
        setAnimationStyle(0);
        setFocusable(true);
        setOutsideTouchable(true);
    }

    public final void A01(View view, int i, int i2) {
        if (isShowing()) {
            return;
        }
        this.A01 = view;
        this.A00 = view.getResources().getConfiguration().orientation;
        View view2 = this.A01;
        if (view2 == null) {
            throw AbstractC7608F5v.A0e();
        }
        View rootView = view2.getRootView();
        View.OnLayoutChangeListener onLayoutChangeListener = this.A05;
        rootView.removeOnLayoutChangeListener(onLayoutChangeListener);
        view2.getRootView().addOnLayoutChangeListener(onLayoutChangeListener);
        super.showAtLocation(view, 0, i, i2);
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = Hs1.A02, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view) {
    }

    public final void A00() {
        if (isShowing()) {
            super.dismiss();
            View view = this.A01;
            if (view == null) {
                throw AbstractC7608F5v.A0e();
            }
            view.getRootView().removeOnLayoutChangeListener(this.A05);
            this.A01 = null;
            this.A00 = 0;
            FGR.A01(null, getContentView());
            this.A04 = null;
            this.A02 = null;
            this.A03 = null;
        }
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = Hs1.A02, message = "Use hide() instead", replaceWith = @ReplaceWith(expression = "hide()", imports = {}))
    public final void dismiss() {
        KeyEvent.DispatcherState keyDispatcherState;
        View contentView = getContentView();
        Function0<Unit> function0 = (contentView == null || (keyDispatcherState = contentView.getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(new KeyEvent(0, 4))) ? this.A04 : this.A02;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = Hs1.A02, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAtLocation(View view, int i, int i2, int i3) {
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = Hs1.A02, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view, int i, int i2) {
    }

    @Override // android.widget.PopupWindow
    @Deprecated(level = Hs1.A02, message = "Use show() instead", replaceWith = @ReplaceWith(expression = "show()", imports = {}))
    public final void showAsDropDown(View view, int i, int i2, int i3) {
    }
}
