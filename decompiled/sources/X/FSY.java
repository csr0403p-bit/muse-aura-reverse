package X;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public abstract class FSY extends FrameLayout {
    public final ViewTreeObserver.OnScrollChangedListener A00;
    public final C8079FSi A01;
    public final boolean A02;

    public FSY(Context context, C8079FSi c8079FSi) {
        super(context);
        this.A01 = c8079FSi;
        this.A02 = true;
        this.A00 = new ViewTreeObserverOnScrollChangedListenerC8075FSe(this);
        setTag(R.id.visibility_bounds_change_notifier_tag, c8079FSi);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A02) {
            getViewTreeObserver().addOnScrollChangedListener(this.A00);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A02) {
            getViewTreeObserver().removeOnScrollChangedListener(this.A00);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        AbstractC8162FXe.A02(null);
        if (f == 0.0f) {
            post(new FSd(this));
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        AbstractC8162FXe.A02(null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        AbstractC8162FXe.A02(null);
    }
}
