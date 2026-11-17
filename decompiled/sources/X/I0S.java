package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class I0S implements View.OnAttachStateChangeListener {
    public final int $t;

    public I0S(int i) {
        this.$t = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(view, 0);
                HlL.A00.add(view);
                break;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.$t == 0) {
            C7384Etj.A0Y(view, 0);
            HlL.A00.remove(view);
        }
    }
}
