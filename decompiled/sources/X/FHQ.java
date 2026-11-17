package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class FHQ extends AbstractC7837FGt {
    public FHS A00;
    public boolean A01;
    public boolean A02;
    public int[] A03;
    public FGF[] A04;
    public FGF[] A05;
    public Drawable A06;
    public SparseArray<Object> A07;
    public Object A08;
    public final FH9 A09;
    public final F0C A0A;

    public FHQ(Context context) {
        super(context, null);
        setClipChildren(true);
        this.A09 = new FH9(this);
        this.A0A = AbstractC7607F5u.A1A(null, C8472Feb.A00(32));
        this.A04 = new FGF[8];
        this.A03 = new int[0];
        setWillNotDraw(false);
        setChildrenDrawingOrderEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public static final void A08(FHQ fhq) {
        C7384Etj.A0Y(fhq, 0);
        BT4 bt4 = new BT4(fhq);
        while (bt4.hasNext()) {
            View view = (View) bt4.next();
            if (view.isLayoutRequested()) {
                AbstractC7608F5v.A1E(view, view.getHeight(), 1073741824, View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824));
                view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            if (view instanceof FHQ) {
                A08((FHQ) view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        FH9 fh9 = this.A09;
        fh9.A02 = canvas;
        fh9.A00 = 0;
        fh9.A01 = fh9.A03.A04.length;
        super.dispatchDraw(canvas);
        if (fh9.A02 != null && fh9.A00 < fh9.A01) {
            fh9.A00();
        }
        fh9.A02 = null;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        super.draw(canvas);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Boolean boolATg;
        C7384Etj.A0Y(motionEvent, 0);
        Iterator<FHS> it = getInterceptTouchEventHandlers().iterator();
        Boolean bool = null;
        while (it.hasNext()) {
            Boolean boolATg2 = it.next().ATg(motionEvent, this);
            Boolean boolA0i = AnonymousClass001.A0i();
            if (boolA0i.equals(boolATg2)) {
                bool = boolA0i;
            }
        }
        FHS fhs = this.A00;
        return (fhs == null || (boolATg = fhs.ATg(motionEvent, this)) == null) ? bool != null ? bool.booleanValue() : super.onInterceptTouchEvent(motionEvent) : boolATg.booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A01 = true;
        A0C(z, i, i2, i3, i4);
        this.A01 = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        if (isEnabled()) {
            for (int length = this.A04.length - 1; -1 < length; length--) {
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        ViewParent parent = this;
        while (parent instanceof FHQ) {
            FHQ fhq = (FHQ) parent;
            if (!(!fhq.A01)) {
                return;
            } else {
                parent = fhq.getParent();
            }
        }
        super.requestLayout();
    }

    public final void setViewTags(SparseArray<Object> sparseArray) {
        C7384Etj.A0Y(sparseArray, 0);
        this.A07 = sparseArray;
    }

    public static final String A07(FGF[] fgfArr) {
        String str;
        if (fgfArr == null) {
            return "<null>";
        }
        StringBuilder sbA0w = C60O.A0w();
        int length = fgfArr.length;
        for (int i = 0; i < length; i++) {
            FGF fgf = fgfArr[i];
            sbA0w.append("Item at index: ");
            if (fgf != null) {
                sbA0w.append(i);
                sbA0w.append(" Type: ");
                sbA0w.append(fgf.A01.A07.A0L());
                sbA0w.append(" Position in parent: ");
                sbA0w.append(fgf.A01.A02);
                str = PairsDiscretionDocument.TERMINATOR;
            } else {
                sbA0w.append(i);
                str = " item is null\n";
            }
            sbA0w.append(str);
        }
        return sbA0w.toString();
    }

    public static final void A09(FHQ fhq, FGF fgf) {
        View view = (View) fgf.A05;
        fhq.A02 = true;
        if (view.isPressed()) {
            view.setPressed(false);
        }
        if (fhq.A01) {
            super.removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public static final void A0A(FHQ fhq, FGF[] fgfArr) {
        if (fgfArr != null) {
            for (FGF fgf : fgfArr) {
                if (fgf != null) {
                    if (FGF.A00(fgf) == C79.A00) {
                        Drawable drawable = (Drawable) fgf.A05;
                        drawable.setCallback(null);
                        fhq.invalidate(drawable.getBounds());
                    } else {
                        A09(fhq, fgf);
                        fhq.A02 = true;
                    }
                }
            }
        }
    }

    public static /* synthetic */ void getDescriptionOfMountedItems$annotations() {
    }

    private final List<FHS> getInterceptTouchEventHandlers() {
        return (List) this.A0A.getValue();
    }

    private final void setForegroundLollipop(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(drawable2);
            }
            this.A06 = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                AbstractC7610F5x.A18(drawable, this);
            }
            invalidate();
        }
    }

    @Override // X.AbstractC7837FGt
    public final void A0B(FGF fgf, int i) {
        if (super.A00 != 0) {
            throw C3cG.A0Q("Cannot mutate Host mount items from a visitMountItems callback");
        }
        Integer numA00 = FGF.A00(fgf);
        Integer num = C79.A00;
        Object obj = fgf.A05;
        if (numA00 == num) {
            Drawable drawable = (Drawable) obj;
            C7384Etj.A0Y(drawable, 1);
            drawable.setVisible(AnonymousClass002.A1M(getVisibility()), false);
            drawable.setCallback(this);
            AbstractC7610F5x.A18(drawable, this);
            invalidate(fgf.A01.A03);
        } else {
            View view = (View) obj;
            this.A02 = true;
            if ((view instanceof FHQ) && view.getParent() == this) {
                view.dispatchFinishTemporaryDetach();
                view.setVisibility(0);
            } else {
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(generateDefaultLayoutParams());
                }
                if (this.A01) {
                    super.addViewInLayout(view, -1, view.getLayoutParams(), true);
                } else {
                    super.addView(view, -1, view.getLayoutParams());
                }
            }
        }
        FGF[] fgfArr = this.A04;
        int length = fgfArr.length;
        if (i >= length) {
            int i2 = length;
            do {
                i2 *= 2;
            } while (i >= i2);
            FGF[] fgfArr2 = new FGF[i2];
            System.arraycopy(fgfArr, 0, fgfArr2, 0, length);
            this.A04 = fgfArr2;
            fgfArr = fgfArr2;
        }
        fgfArr[i] = fgf;
        fgf.A00 = this;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.A02) {
            int childCount = getChildCount();
            if (this.A03.length < childCount) {
                this.A03 = new int[childCount + 5];
            }
            int length = this.A04.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                FGF fgf = this.A04[i4];
                if (fgf != null && FGF.A00(fgf) == C79.A01) {
                    this.A03[i3] = indexOfChild((View) fgf.A05);
                    i3++;
                }
            }
            this.A02 = false;
        }
        FH9 fh9 = this.A09;
        if (fh9.A02 != null && fh9.A00 < fh9.A01) {
            fh9.A00();
        }
        return this.A03[i2];
    }

    @Override // X.AbstractC7837FGt
    public String getDescriptionOfMountedItems() {
        return FGI.A0d("\nMounted Items", A07(this.A04), "\nScraped Items: ", A07(this.A05));
    }

    @Override // X.AbstractC7837FGt
    public int getMountItemCount() {
        int i = 0;
        for (FGF fgf : this.A04) {
            if (fgf != null) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.View
    public Object getTag() {
        Object obj = this.A08;
        return obj == null ? super.getTag() : obj;
    }

    public final void setInterceptTouchEventHandler(FHS fhs) {
        this.A00 = fhs;
    }

    public final void setViewTag(Object obj) {
        this.A08 = obj;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        for (FGF fgf : this.A04) {
            if (fgf != null && FGF.A00(fgf) == C79.A00) {
                Drawable drawable = (Drawable) fgf.A05;
                C7384Etj.A0Y(drawable, 1);
                AbstractC7610F5x.A18(drawable, this);
            }
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        for (FGF fgf : this.A04) {
            if (fgf != null && FGF.A00(fgf) == C79.A00) {
                ((Drawable) fgf.A05).jumpToCurrentState();
            }
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getRight(), getBottom());
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        for (FGF fgf : this.A04) {
            if (fgf != null && FGF.A00(fgf) == C79.A00) {
                ((Drawable) fgf.A05).setVisible(AnonymousClass002.A1M(i), false);
            }
        }
    }

    public final void setForegroundCompat(Drawable drawable) {
        setForeground(drawable);
    }

    public void A0C(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final Object getTag(int i) {
        Object obj;
        SparseArray<Object> sparseArray = this.A07;
        if (sparseArray == null || (obj = sparseArray.get(i)) == null) {
            return super.getTag(i);
        }
        return obj;
    }
}
