package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class I0X implements View.OnAttachStateChangeListener {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public I0X(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                ((ViewGroup) this.A01).addView((View) this.A00, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C8572FgR c8572FgR = (C8572FgR) this.A01;
                Fragment fragment = c8572FgR.A02;
                c8572FgR.A04();
                AbstractC8541Ffu.A02((ViewGroup) fragment.mView.getParent(), ((LayoutInflaterFactory2C8517FfO) this.A00).A00).A09();
                break;
            default:
                View view2 = (View) this.A01;
                view2.removeOnAttachStateChangeListener(this);
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.$t == 0) {
            ((ViewGroup) this.A01).addView((View) this.A00, 0);
            view.removeOnAttachStateChangeListener(this);
        }
    }
}
