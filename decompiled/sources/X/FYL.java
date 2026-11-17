package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.aura.R;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class FYL extends ListView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public RunnableC8190FYh A05;
    public boolean A06;
    public boolean A07;
    public C8145FWj A08;
    public ViewOnTouchListenerC8213FZg A09;
    public boolean A0A;
    public final Rect A0B;

    public FYL(Context context, boolean z) {
        super(context, null, R.attr._name_removed__res_0x7f0401b6);
        this.A0B = AbstractC7607F5u.A0X();
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A0A = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.A05 = null;
        super.onDetachedFromWindow();
    }

    private void setSelectorEnabled(boolean z) {
        C8145FWj c8145FWj = this.A08;
        if (c8145FWj != null) {
            c8145FWj.A01 = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r14 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.view.MotionEvent r16, int r17) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FYL.A01(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A0B;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.A05 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.A06 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.A0A || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.A0A || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.A0A || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.A0A && this.A07) || super.isInTouchMode();
    }

    public void setListSelectionHidden(boolean z) {
        this.A07 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C8145FWj c8145FWj;
        if (drawable != null) {
            c8145FWj = new C8145FWj();
            AbstractC7609F5w.A16(c8145FWj.A00);
            c8145FWj.A00 = drawable;
            drawable.setCallback(c8145FWj);
            c8145FWj.A01 = true;
        } else {
            c8145FWj = null;
        }
        this.A08 = c8145FWj;
        super.setSelector(c8145FWj);
        Rect rectA0X = AbstractC7607F5u.A0X();
        if (drawable != null) {
            drawable.getPadding(rectA0X);
        }
        this.A02 = rectA0X.left;
        this.A04 = rectA0X.top;
        this.A03 = rectA0X.right;
        this.A01 = rectA0X.bottom;
    }

    public final int A00(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter != null) {
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            View view = null;
            int i3 = 0;
            for (int i4 = 0; i4 < count; i4++) {
                int itemViewType = adapter.getItemViewType(i4);
                if (itemViewType != i3) {
                    view = null;
                    i3 = itemViewType;
                }
                view = adapter.getView(i4, view, this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParams);
                }
                int i5 = layoutParams.height;
                view.measure(i, i5 > 0 ? AbstractC7608F5v.A05(i5) : View.MeasureSpec.makeMeasureSpec(0, 0));
                view.forceLayout();
                if (i4 > 0) {
                    measuredHeight += dividerHeight;
                }
                measuredHeight += view.getMeasuredHeight();
                if (measuredHeight >= i2) {
                    return i2;
                }
            }
        }
        return measuredHeight;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.A05 == null) {
            RunnableC8190FYh runnableC8190FYh = new RunnableC8190FYh(this);
            this.A05 = runnableC8190FYh;
            runnableC8190FYh.A00.post(runnableC8190FYh);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT < 30 || !FYN.A01()) {
                        setSelectionFromTop(iPointToPosition, AbstractC7607F5u.A0E(this, childAt.getTop()));
                    } else {
                        FYN.A00(childAt, this, iPointToPosition);
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.A06 && isPressed()) {
                    selector.setState(getDrawableState());
                    return zOnHoverEvent;
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A00 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC8190FYh runnableC8190FYh = this.A05;
        if (runnableC8190FYh != null) {
            FYL fyl = runnableC8190FYh.A00;
            fyl.A05 = null;
            fyl.removeCallbacks(runnableC8190FYh);
        }
        return super.onTouchEvent(motionEvent);
    }
}
