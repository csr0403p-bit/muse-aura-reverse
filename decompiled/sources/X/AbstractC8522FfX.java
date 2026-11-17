package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FfX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8522FfX {
    public final void A05(Object obj, Object obj2, Object obj3, ArrayList arrayList, ArrayList arrayList2) {
        if (this instanceof FragmentTransitionSupport) {
            ((AbstractC8429Fds) obj).A0Y(new C8440Fe4((FragmentTransitionSupport) this, obj2, obj3, arrayList, arrayList2));
        } else {
            ((Transition) obj).addListener(new C8567FgL((C8565FgJ) this, obj2, obj3, arrayList, arrayList2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[Catch: all -> 0x003f, DONT_GENERATE, TryCatch #1 {, blocks: (B:6:0x000e, B:8:0x0012, B:9:0x0016, B:11:0x001a, B:13:0x0020, B:15:0x0022), top: B:31:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C8439Fe3 r5, java.lang.Object r6, java.lang.Runnable r7, java.lang.Runnable r8) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L42
            androidx.transition.FragmentTransitionSupport r4 = (androidx.transition.FragmentTransitionSupport) r4
            X.Fds r6 = (X.AbstractC8429Fds) r6
            X.FeB r3 = new X.FeB
            r3.<init>(r6, r7, r8)
            monitor-enter(r5)
        Le:
            boolean r0 = r5.A01     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L16
            r5.wait()     // Catch: java.lang.InterruptedException -> Le java.lang.Throwable -> L3f
            goto Le
        L16:
            X.Fea r0 = r5.A00     // Catch: java.lang.Throwable -> L3f
            if (r0 == r3) goto L22
            r5.A00 = r3     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r5.A02     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L22
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            goto L24
        L22:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            goto L32
        L24:
            java.lang.Runnable r2 = r3.A01
            X.Fds r1 = r3.A00
            java.lang.Runnable r0 = r3.A02
            if (r2 != 0) goto L3b
            r1.A0F()
            r0.run()
        L32:
            X.Fe5 r0 = new X.Fe5
            r0.<init>(r4, r8)
            r6.A0Y(r0)
            return
        L3b:
            r2.run()
            goto L32
        L3f:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r0
        L42:
            r8.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8522FfX.A03(X.Fe3, java.lang.Object, java.lang.Runnable, java.lang.Runnable):void");
    }

    public final void A04(Object obj, View view) {
        if (this instanceof FragmentTransitionSupport) {
            FragmentTransitionSupport fragmentTransitionSupport = (FragmentTransitionSupport) this;
            if (view != null) {
                Rect rectA0X = AbstractC7607F5u.A0X();
                A00(view, rectA0X);
                ((AbstractC8429Fds) obj).A0X(new C8445Fe9(rectA0X, fragmentTransitionSupport));
                return;
            }
            return;
        }
        C8565FgJ c8565FgJ = (C8565FgJ) this;
        if (view != null) {
            Rect rectA0X2 = AbstractC7607F5u.A0X();
            A00(view, rectA0X2);
            ((Transition) obj).setEpicenterCallback(new C8570FgO(rectA0X2, c8565FgJ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.Object r5, java.util.ArrayList<android.view.View> r6) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof androidx.transition.FragmentTransitionSupport
            if (r0 == 0) goto L51
            X.Fds r5 = (X.AbstractC8429Fds) r5
            if (r5 == 0) goto L8e
            boolean r0 = r5 instanceof X.C8430Fdt
            r3 = 0
            if (r0 == 0) goto L2d
            X.Fdt r5 = (X.C8430Fdt) r5
            java.util.ArrayList<X.Fds> r0 = r5.A02
            int r2 = r0.size()
        L15:
            if (r3 >= r2) goto L8e
            if (r3 < 0) goto L2b
            java.util.ArrayList<X.Fds> r1 = r5.A02
            int r0 = r1.size()
            if (r3 >= r0) goto L2b
            java.lang.Object r0 = r1.get(r3)
        L25:
            r4.A06(r0, r6)
            int r3 = r3 + 1
            goto L15
        L2b:
            r0 = 0
            goto L25
        L2d:
            java.util.ArrayList<java.lang.Integer> r0 = r5.A0J
            if (r0 == 0) goto L37
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8e
        L37:
            java.util.ArrayList<android.view.View> r0 = r5.A0K
            if (r0 == 0) goto L41
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8e
        L41:
            int r1 = r6.size()
        L45:
            if (r3 >= r1) goto L8e
            android.view.View r0 = X.AbstractC7607F5u.A0d(r6, r3)
            r5.A0P(r0)
            int r3 = r3 + 1
            goto L45
        L51:
            android.transition.Transition r5 = (android.transition.Transition) r5
            if (r5 == 0) goto L8e
            boolean r0 = r5 instanceof android.transition.TransitionSet
            r2 = 0
            if (r0 == 0) goto L6c
            android.transition.TransitionSet r5 = (android.transition.TransitionSet) r5
            int r1 = r5.getTransitionCount()
        L60:
            if (r2 >= r1) goto L8e
            android.transition.Transition r0 = r5.getTransitionAt(r2)
            r4.A06(r0, r6)
            int r2 = r2 + 1
            goto L60
        L6c:
            boolean r0 = X.C8565FgJ.A02(r5)
            if (r0 != 0) goto L8e
            java.util.List r0 = r5.getTargets()
            if (r0 == 0) goto L7e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8e
        L7e:
            int r1 = r6.size()
        L82:
            if (r2 >= r1) goto L8e
            android.view.View r0 = X.AbstractC7607F5u.A0d(r6, r2)
            r5.addTarget(r0)
            int r2 = r2 + 1
            goto L82
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8522FfX.A06(java.lang.Object, java.util.ArrayList):void");
    }

    public final boolean A07(Object obj) {
        if (this instanceof FragmentTransitionSupport) {
            boolean zA0e = ((AbstractC8429Fds) obj).A0e();
            if (!zA0e) {
                AbstractC7610F5x.A1O(C3cG.A0f(obj, "Predictive back not available for AndroidX Transition "), ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
            }
            return zA0e;
        }
        if (!AbstractC8571FgQ.A0L()) {
            return false;
        }
        AbstractC7610F5x.A1O(C3cG.A0f(obj, "Predictive back not available for framework transition "), ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public static final void A00(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectFA0Y = AbstractC7607F5u.A0Y();
            rectFA0Y.set(0.0f, 0.0f, AbstractC7607F5u.A02(view), AbstractC7607F5u.A03(view));
            view.getMatrix().mapRect(rectFA0Y);
            rectFA0Y.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectFA0Y.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectFA0Y);
                rectFA0Y.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectFA0Y.offset(r2[0], r2[1]);
            rect.set(Math.round(rectFA0Y.left), Math.round(rectFA0Y.top), Math.round(rectFA0Y.right), Math.round(rectFA0Y.bottom));
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Landroid/view/View;>;Landroid/view/View;)V */
    public static void A01(View view, List list) {
        int i;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2) == view) {
                return;
            }
        }
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i3 = size; i3 < list.size(); i3++) {
            View view2 = (View) list.get(i3);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    while (true) {
                        if (i < size) {
                            i = list.get(i) != childAt ? i + 1 : 0;
                        } else if (childAt.getTransitionName() != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }
}
