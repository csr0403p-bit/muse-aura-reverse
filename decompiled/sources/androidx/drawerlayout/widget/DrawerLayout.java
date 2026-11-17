package androidx.drawerlayout.widget;

import X.C6p9;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class DrawerLayout extends ViewGroup {
    public abstract float getDrawerElevation();

    public abstract Drawable getStatusBarBackgroundDrawable();

    public abstract void setDrawerElevation(float f);

    @Deprecated
    public abstract void setDrawerListener(C6p9 c6p9);

    public abstract void setDrawerLockMode(int i);

    public abstract void setScrimColor(int i);

    public abstract void setStatusBarBackground(int i);

    public abstract void setStatusBarBackground(Drawable drawable);

    public abstract void setStatusBarBackgroundColor(int i);
}
