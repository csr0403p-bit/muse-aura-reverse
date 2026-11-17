package androidx.viewpager.widget;

import X.AbstractC8827Flg;
import X.F60;
import X.InterfaceC8828Flh;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public abstract class ViewPager extends ViewGroup {
    public abstract AbstractC8827Flg getAdapter();

    public abstract int getCurrentItem();

    public abstract int getOffscreenPageLimit();

    public abstract int getPageMargin();

    public abstract void setAdapter(AbstractC8827Flg abstractC8827Flg);

    public abstract void setCurrentItem(int i);

    public abstract void setDragInGutterEnabled(boolean z);

    public abstract void setOffscreenPageLimit(int i);

    @Deprecated
    public abstract void setOnPageChangeListener(InterfaceC8828Flh interfaceC8828Flh);

    public abstract void setPageMargin(int i);

    public abstract void setPageMarginDrawable(int i);

    public abstract void setPageMarginDrawable(Drawable drawable);

    public abstract void setScrollState(int i);

    private int getClientWidth() {
        throw F60.createAndThrow();
    }

    private void setScrollingCacheEnabled(boolean z) {
        throw F60.createAndThrow();
    }
}
