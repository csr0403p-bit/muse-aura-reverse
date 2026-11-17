package androidx.appcompat.widget;

import X.AbstractC7607F5u;
import X.BV4;
import X.C3cG;
import X.C60O;
import X.FYT;
import X.InterfaceC8088FSu;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class ViewStubCompat extends View {
    public LayoutInflater A00;
    public int A01;
    public int A02;
    public InterfaceC8088FSu A03;
    public WeakReference<View> A04;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.A01;
    }

    public LayoutInflater getLayoutInflater() {
        return this.A00;
    }

    public int getLayoutResource() {
        return this.A02;
    }

    public void setInflatedId(int i) {
        this.A01 = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.A00 = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A02 = i;
    }

    public void setOnInflateListener(InterfaceC8088FSu interfaceC8088FSu) {
        this.A03 = interfaceC8088FSu;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.A04;
        if (weakReference != null) {
            View viewA0c = AbstractC7607F5u.A0c(weakReference);
            if (viewA0c == null) {
                throw C3cG.A0Q("setVisibility called on un-referenced view");
            }
            viewA0c.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            A00();
        }
    }

    public final View A00() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw C3cG.A0Q("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.A02 == 0) {
            throw C60O.A0i("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.A00;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.A02, viewGroup, false);
        int i = this.A01;
        if (i != -1) {
            viewInflate.setId(i);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.A04 = BV4.A0q(viewInflate);
        return viewInflate;
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FYT.A0P, i, 0);
        this.A01 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.A02 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
