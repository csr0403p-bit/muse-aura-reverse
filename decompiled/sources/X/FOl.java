package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class FOl extends FrameLayout {
    public int A00;
    public ViewGroup A01;
    public FOT A02;
    public boolean A03;

    public final FOT getContentPager() {
        FOT fot = this.A02;
        if (fot != null) {
            return fot;
        }
        C7384Etj.A0b("contentPager");
        throw F60.createAndThrow();
    }

    public final ViewGroup getHeaderContainer() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            return viewGroup;
        }
        C7384Etj.A0b("headerContainer");
        throw F60.createAndThrow();
    }

    public final void setHeaderTopMargin(int i) {
        this.A00 = i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getContentPager().layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        getHeaderContainer().measure(AbstractC7608F5v.A05(View.MeasureSpec.getSize(getMeasuredWidth())), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(getMeasuredHeight()), Integer.MIN_VALUE));
        getHeaderContainer().layout(0, this.A00, getHeaderContainer().getMeasuredWidth(), getHeaderContainer().getMeasuredHeight() + this.A00);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        getContentPager().measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), this.A03 ? Integer.MIN_VALUE : 1073741824));
        setMeasuredDimension(getContentPager().getMeasuredWidth(), getContentPager().getMeasuredHeight());
    }
}
