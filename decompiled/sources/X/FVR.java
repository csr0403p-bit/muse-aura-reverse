package X;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
public abstract class FVR extends LinearLayout {
    public abstract CoordinatorLayout.Behavior<FVR> getBehavior();

    public abstract int getDownNestedPreScrollRange();

    public abstract int getDownNestedScrollRange();

    public abstract int getLiftOnScrollTargetViewId();

    public abstract int getMinimumHeightForVisibleOverlappingContent();

    public abstract int getPendingAction();

    public abstract Drawable getStatusBarForeground();

    @Deprecated
    public abstract float getTargetElevation();

    public abstract int getTopInset();

    public abstract int getTotalScrollRange();

    public abstract int getUpNestedPreScrollRange();

    public abstract void setExpanded(boolean z);

    public abstract void setLiftOnScroll(boolean z);

    public abstract void setLiftOnScrollTargetViewId(int i);

    public abstract void setStatusBarForeground(Drawable drawable);

    public abstract void setStatusBarForegroundColor(int i);

    public abstract void setStatusBarForegroundResource(int i);

    @Deprecated
    public abstract void setTargetElevation(float f);

    @Override // android.view.View
    public void setElevation(float f) {
        throw F60.createAndThrow();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        throw F60.createAndThrow();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        throw F60.createAndThrow();
    }
}
