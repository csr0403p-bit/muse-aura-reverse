package X;

import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fft, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8540Fft extends C8552Fg5 {
    public Object A00;
    public boolean A01;
    public final DQd<String, View> A02;
    public final C8439Fe3 A03 = new C8439Fe3();
    public final AbstractC8522FfX A04;
    public final C8542Ffv A05;
    public final C8542Ffv A06;
    public final Object A07;
    public final List<C8544Ffx> A08;
    public final DQd<String, View> A09;
    public final DQd<String, String> A0A;
    public final ArrayList<String> A0B;
    public final ArrayList<String> A0C;
    public final ArrayList<View> A0D;
    public final ArrayList<View> A0E;

    public static final void A02(ViewGroup viewGroup, C8540Fft c8540Fft, ArrayList arrayList, Function0 function0) {
        AbstractC8545Ffy.A00(arrayList, 4);
        AbstractC8522FfX abstractC8522FfX = c8540Fft.A04;
        ArrayList<View> arrayList2 = c8540Fft.A0E;
        ArrayList arrayListA0h = C3cG.A0h();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            View viewA0d = AbstractC7607F5u.A0d(arrayList2, i);
            arrayListA0h.add(viewA0d.getTransitionName());
            viewA0d.setTransitionName(null);
        }
        if (AbstractC8571FgQ.A0L()) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it = c8540Fft.A0D.iterator();
            while (it.hasNext()) {
                View view = (View) C7384Etj.A0F(it);
                StringBuilder sbA0f = C3cG.A0f(view, "View: ");
                sbA0f.append(" Name: ");
                AbstractC7609F5w.A1N(sbA0f, view.getTransitionName());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                View view2 = (View) C7384Etj.A0F(it2);
                StringBuilder sbA0f2 = C3cG.A0f(view2, "View: ");
                sbA0f2.append(" Name: ");
                AbstractC7609F5w.A1N(sbA0f2, view2.getTransitionName());
            }
        }
        function0.invoke();
        ArrayList<View> arrayList3 = c8540Fft.A0D;
        DQd<String, String> dQd = c8540Fft.A0A;
        int size2 = arrayList2.size();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (int i2 = 0; i2 < size2; i2++) {
            View viewA0d2 = AbstractC7607F5u.A0d(arrayList3, i2);
            String transitionName = viewA0d2.getTransitionName();
            arrayListA0h2.add(transitionName);
            if (transitionName != null) {
                viewA0d2.setTransitionName(null);
                String str = dQd.get(transitionName);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayListA0h.get(i3))) {
                        AbstractC7607F5u.A0d(arrayList2, i3).setTransitionName(transitionName);
                        break;
                    }
                    i3++;
                }
            }
        }
        ViewOnAttachStateChangeListenerC8438Fe2.A00(viewGroup, new RunnableC8551Fg4(abstractC8522FfX, arrayList2, arrayListA0h, arrayList3, arrayListA0h2, size2));
        AbstractC8545Ffy.A00(arrayList, 0);
        Object obj = c8540Fft.A07;
        if (!(abstractC8522FfX instanceof FragmentTransitionSupport)) {
            C8565FgJ c8565FgJ = (C8565FgJ) abstractC8522FfX;
            Transition transition = (Transition) obj;
            if (transition != null) {
                transition.getTargets().clear();
                transition.getTargets().addAll(arrayList2);
                c8565FgJ.A08(transition, arrayList3, arrayList2);
                return;
            }
            return;
        }
        FragmentTransitionSupport fragmentTransitionSupport = (FragmentTransitionSupport) abstractC8522FfX;
        AbstractC8429Fds abstractC8429Fds = (AbstractC8429Fds) obj;
        if (abstractC8429Fds != null) {
            ArrayList<View> arrayList4 = abstractC8429Fds.A0K;
            arrayList4.clear();
            arrayList4.addAll(arrayList2);
            fragmentTransitionSupport.A08(abstractC8429Fds, arrayList3, arrayList2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/ArrayList<Landroid/view/View;>;Landroid/view/View;)V */
    private final void A01(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            WindowInsets windowInsets = FS0.A00;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        A01(childAt, arrayList);
                    }
                }
                return;
            }
        }
        BV7.A1D(view, arrayList);
    }

    public static final boolean A03(C8540Fft c8540Fft) {
        List<C8544Ffx> list = c8540Fft.A08;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C8544Ffx> it = list.iterator();
            while (it.hasNext()) {
                if (!AbstractC8538Ffr.A00(it).A07.mTransitioning) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.C8552Fg5
    public final boolean A05() {
        Object obj;
        AbstractC8522FfX abstractC8522FfX = this.A04;
        if (!(abstractC8522FfX instanceof FragmentTransitionSupport)) {
            if (!AbstractC8571FgQ.A0N(4)) {
                return false;
            }
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
            return false;
        }
        List<C8544Ffx> list = this.A08;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C8544Ffx c8544Ffx : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = c8544Ffx.A01) == null || !abstractC8522FfX.A07(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.A07;
        return obj2 == null || abstractC8522FfX.A07(obj2);
    }

    public C8540Fft(DQd dQd, DQd dQd2, DQd dQd3, AbstractC8522FfX abstractC8522FfX, C8542Ffv c8542Ffv, C8542Ffv c8542Ffv2, Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list) {
        this.A08 = list;
        this.A05 = c8542Ffv;
        this.A06 = c8542Ffv2;
        this.A04 = abstractC8522FfX;
        this.A07 = obj;
        this.A0D = arrayList;
        this.A0E = arrayList2;
        this.A0A = dQd;
        this.A0B = arrayList3;
        this.A0C = arrayList4;
        this.A09 = dQd2;
        this.A02 = dQd3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x032c A[PHI: r12
  0x032c: PHI (r12v7 ??) = (r12v5 ??), (r12v11 ??) binds: [B:129:0x0317, B:112:0x02cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x010a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.Fdt] */
    /* JADX WARN: Type inference failed for: r0v40, types: [X.Fdt] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [X.Fds] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.transition.Transition] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v15, types: [X.Fds] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.transition.TransitionSet] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.Fdt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.HxE A00(android.view.ViewGroup r30, final X.C8540Fft r31, final X.C8542Ffv r32, final X.C8542Ffv r33) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8540Fft.A00(android.view.ViewGroup, X.Fft, X.Ffv, X.Ffv):X.HxE");
    }
}
