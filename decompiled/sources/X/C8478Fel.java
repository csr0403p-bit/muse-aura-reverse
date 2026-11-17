package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.aura.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Fel, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8478Fel extends FrameLayout {
    public static final Object A02 = C3cG.A0T();
    public C8479Fem A00;
    public final List<C8480Fen> A01;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[LOOP:0: B:7:0x0027->B:23:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A00() {
        /*
            r11 = this;
            java.util.List<X.Fen> r2 = r11.A01
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            r11.A01()
        Lb:
            return
        Lc:
            X.Feh r1 = r11.getOrInstallSystemBarStateMonitor()
            r11.A01()
            X.Fem r0 = new X.Fem
            r0.<init>(r1, r2)
            r11.A00 = r0
            int r10 = r11.getChildCount()
            X.Fem r0 = r11.A00
            java.util.ArrayList<X.Fen> r0 = r0.A05
            int r7 = r0.size()
            r6 = 0
        L27:
            if (r6 >= r7) goto Lb
            X.Fem r0 = r11.A00
            java.util.ArrayList<X.Fen> r0 = r0.A05
            java.lang.Object r0 = r0.get(r6)
            X.Fen r0 = (X.C8480Fen) r0
            android.content.Context r8 = r11.getContext()
            int r5 = r6 + r10
            X.Feo r4 = r0.A07
            int r3 = r0.A05
            r2 = 1
            r1 = 8
            r0 = -1
            if (r3 == r2) goto Lad
            r2 = 2
            if (r3 == r2) goto La8
            r2 = 4
            if (r3 == r2) goto La4
            if (r3 != r1) goto Lb2
            int r9 = r4.A03
            r2 = 80
        L4f:
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r0, r9, r2)
            X.FcJ r2 = r4.A06
            int r0 = r2.A01
            r3.leftMargin = r0
            int r0 = r2.A03
            r3.topMargin = r0
            int r0 = r2.A02
            r3.rightMargin = r0
            int r0 = r2.A00
            r3.bottomMargin = r0
            android.view.View r2 = new android.view.View
            r2.<init>(r8)
            java.lang.Object r0 = X.C8478Fel.A02
            r2.setTag(r0)
            float r0 = r4.A01
            r2.setTranslationX(r0)
            float r0 = r4.A02
            r2.setTranslationY(r0)
            float r0 = r4.A00
            r2.setAlpha(r0)
            boolean r0 = r4.A08
            if (r0 == 0) goto L84
            r1 = 0
        L84:
            r2.setVisibility(r1)
            android.graphics.drawable.Drawable r0 = r4.A05
            r2.setBackground(r0)
            X.Fep r1 = new X.Fep
            r1.<init>(r2, r3, r11)
            X.Fes r0 = r4.A07
            if (r0 == 0) goto L9c
            java.lang.String r0 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L9c:
            r4.A07 = r1
            r11.addView(r2, r5, r3)
            int r6 = r6 + 1
            goto L27
        La4:
            int r0 = r4.A04
            r2 = 5
            goto Lb0
        La8:
            int r9 = r4.A03
            r2 = 48
            goto L4f
        Lad:
            int r0 = r4.A04
            r2 = 3
        Lb0:
            r9 = -1
            goto L4f
        Lb2:
            java.lang.String r0 = "Unexpected side: "
            java.lang.IllegalArgumentException r0 = X.BV5.A0Q(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8478Fel.A00():void");
    }

    private void A01() {
        if (this.A00 != null) {
            int childCount = getChildCount();
            C8479Fem c8479Fem = this.A00;
            removeViews(childCount - c8479Fem.A05.size(), c8479Fem.A05.size());
            C8479Fem c8479Fem2 = this.A00;
            int size = c8479Fem2.A05.size();
            for (int i = 0; i < size; i++) {
                c8479Fem2.A05.get(i).A07.A07 = null;
            }
            if (!c8479Fem2.A03) {
                c8479Fem2.A03 = true;
                c8479Fem2.A04.A04.remove(c8479Fem2);
                ArrayList<C8480Fen> arrayList = c8479Fem2.A05;
                for (int iA0I = AbstractC7607F5u.A0I(arrayList, 1); iA0I >= 0; iA0I--) {
                    arrayList.get(iA0I).A03 = null;
                }
                arrayList.clear();
            }
            this.A00 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != A02) {
            C8479Fem c8479Fem = this.A00;
            int childCount = getChildCount() - (c8479Fem != null ? c8479Fem.A05.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public void setProtections(List<C8480Fen> list) {
        List<C8480Fen> list2 = this.A01;
        list2.clear();
        list2.addAll(list);
        if (isAttachedToWindow()) {
            A00();
            requestApplyInsets();
        }
    }

    public C8478Fel(Context context, List<C8480Fen> list) {
        super(context);
        this.A01 = C3cG.A0h();
        setProtections(list);
    }

    private C8474Feh getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C8474Feh) {
            return (C8474Feh) tag;
        }
        C8474Feh c8474Feh = new C8474Feh(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, c8474Feh);
        return c8474Feh;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A00();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
        View rootView = getRootView();
        Object tag = rootView.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof C8474Feh) {
            final C8474Feh c8474Feh = (C8474Feh) tag;
            if (!c8474Feh.A04.isEmpty()) {
                return;
            }
            c8474Feh.A03.post(new Runnable() { // from class: X.Feq
                public static final String __redex_internal_original_name = "SystemBarStateMonitor$$ExternalSyntheticLambda1";

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC7610F5x.A19(c8474Feh.A03);
                }
            });
            rootView.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }
}
