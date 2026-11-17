package X;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FdK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8403FdK extends FrameLayout {
    public boolean A00;
    public View.OnApplyWindowInsetsListener A01;
    public final List<View> A02;
    public final List<View> A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public C8403FdK(Context context, AttributeSet attributeSet, AbstractC8571FgQ abstractC8571FgQ) throws ClassNotFoundException {
        View view;
        super(context, attributeSet);
        boolean zA1a = AnonymousClass002.A1a(context, attributeSet);
        this.A02 = C3cG.A0h();
        this.A03 = C3cG.A0h();
        this.A00 = zA1a;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8404FdL.A01, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(zA1a ? 1 : 0);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentA0T = abstractC8571FgQ.A0T(id);
        if (classAttribute != null && fragmentA0T == null) {
            if (id == -1) {
                throw BV5.A0V("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? FGI.A0M(" with tag ", string) : "");
            }
            C8518FfP c8518FfPA0V = abstractC8571FgQ.A0V();
            context.getClassLoader();
            Fragment fragmentInstantiate = Fragment.instantiate(c8518FfPA0V.A00.A09.A01, classAttribute, null);
            C7384Etj.A0U(fragmentInstantiate);
            fragmentInstantiate.mFragmentId = id;
            fragmentInstantiate.mContainerId = id;
            fragmentInstantiate.mTag = string;
            fragmentInstantiate.mFragmentManager = abstractC8571FgQ;
            fragmentInstantiate.mHost = abstractC8571FgQ.A09;
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            C8573FgU c8573FgU = new C8573FgU(abstractC8571FgQ);
            c8573FgU.A0G = zA1a;
            fragmentInstantiate.mContainer = this;
            fragmentInstantiate.mInDynamicContainer = zA1a;
            c8573FgU.A01(fragmentInstantiate, string, getId(), zA1a ? 1 : 0);
            c8573FgU.A00();
            c8573FgU.A02.A0q(c8573FgU, zA1a);
        }
        Iterator it = abstractC8571FgQ.A0U.A02().iterator();
        while (it.hasNext()) {
            C8572FgR c8572FgR = (C8572FgR) it.next();
            Fragment fragment = c8572FgR.A02;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                c8572FgR.A02();
                c8572FgR.A04();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C7384Etj.A0Y(view, 0);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (!(tag instanceof Fragment) || tag == null) {
            throw BV8.A0m(" is not associated with a Fragment.", C3cG.A0f(view, "Views added to a FragmentContainerView must be associated with a Fragment. View "));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C8497Ff4 c8497Ff4A03;
        C7384Etj.A0Y(windowInsets, 0);
        C8497Ff4 c8497Ff4 = new C8497Ff4(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A01;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C7384Etj.A0U(windowInsetsOnApplyWindowInsets);
            c8497Ff4A03 = new C8497Ff4(windowInsetsOnApplyWindowInsets);
        } else {
            c8497Ff4A03 = AbstractC8060FRo.A03(this, c8497Ff4);
        }
        if (!c8497Ff4A03.A00.A0B()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC8060FRo.A08(getChildAt(i), c8497Ff4A03);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C7384Etj.A0Y(canvas, 0);
        if (this.A00) {
            Iterator<View> it = this.A02.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C7384Etj.A0Y(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A00 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C7384Etj.A0Y(windowInsets, 0);
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C7384Etj.A0Y(view, 0);
        A00(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C7384Etj.A0Y(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C7384Etj.A0Y(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }

    private final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C7384Etj.A0U(childAt);
            A00(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C7384Etj.A0U(childAt);
            A00(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.A00 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw C8j3.A18("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.A01 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zA1b = AnonymousClass004.A1b(canvas, view);
        if (this.A00) {
            List<View> list = this.A02;
            if (!list.isEmpty() && list.contains(view)) {
                return zA1b;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final <F extends Fragment> F getFragment() {
        AbstractC8571FgQ abstractC8571FgQA00;
        Fragment fragmentA01 = AbstractC8571FgQ.A01(this);
        if (fragmentA01 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    if (fragmentActivity != null) {
                        abstractC8571FgQA00 = AbstractC8330Fbx.A00(fragmentActivity);
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            throw BV8.A0m(" is not within a subclass of FragmentActivity.", C3cG.A0f(this, "View "));
        }
        if (!fragmentA01.isAdded()) {
            StringBuilder sbA0f = C3cG.A0f(fragmentA01, "The Fragment ");
            sbA0f.append(" that owns View ");
            sbA0f.append(this);
            throw BV8.A0m(" has already been destroyed. Nested fragments should always use the child FragmentManager.", sbA0f);
        }
        abstractC8571FgQA00 = fragmentA01.getChildFragmentManager();
        return (F) abstractC8571FgQA00.A0T(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                C7384Etj.A0U(childAt);
                A00(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C7384Etj.A0U(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }
}
