package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.facebook.aura.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Fds, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8429Fds implements Cloneable {
    public long A02;
    public long A04;
    public AbstractC8473Fec A07;
    public C8444Fe8 A08;
    public ArrayList<Hi2> A0H;
    public ArrayList<Hi2> A0I;
    public InterfaceC8451FeF[] A0Q;
    public static final Animator[] A0S = new Animator[0];
    public static final int[] A0U = {2, 1, 3, 4};
    public static final C8467FeV A0T = new C8467FeV();
    public static ThreadLocal<DQd<Animator, C8435Fdy>> A0R = new ThreadLocal<>();
    public String A0E = C60Q.A0e(this);
    public long A03 = -1;
    public long A01 = -1;
    public TimeInterpolator A05 = null;
    public ArrayList<Integer> A0J = C3cG.A0h();
    public ArrayList<View> A0K = C3cG.A0h();
    public C8434Fdx A0D = new C8434Fdx();
    public C8434Fdx A0C = new C8434Fdx();
    public C8430Fdt A0B = null;
    public int[] A0M = A0U;
    public ArrayList<Animator> A0G = C3cG.A0h();
    public Animator[] A0N = A0S;
    public int A00 = 0;
    public boolean A0P = false;
    public boolean A0L = false;
    public AbstractC8429Fds A09 = null;
    public AbstractC8429Fds A0A = null;
    public ArrayList<InterfaceC8451FeF> A0O = null;
    public ArrayList<Animator> A0F = C3cG.A0h();
    public C8467FeV A06 = A0T;

    public static Path A02(int i, int i2, int i3, int i4) {
        Path path = new Path();
        path.moveTo(i, i2);
        path.lineTo(i3, i4);
        return path;
    }

    public final void A0N(long j, long j2) {
        if (!(this instanceof C8430Fdt)) {
            long j3 = this.A04;
            boolean zA1R = C8j3.A1R((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
                this.A0L = false;
                A07(InterfaceC8443Fe7.A04, this, this, zA1R);
            }
            ArrayList<Animator> arrayList = this.A0G;
            int size = arrayList.size();
            Animator[] animatorArrA08 = A08(this, arrayList);
            for (int i = 0; i < size; i++) {
                Animator animator = animatorArrA08[i];
                animatorArrA08[i] = null;
                ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
            }
            this.A0N = animatorArrA08;
            if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
                return;
            }
            if (j > j3) {
                this.A0L = true;
            }
            A07(InterfaceC8443Fe7.A01, this, this, zA1R);
            return;
        }
        C8430Fdt c8430Fdt = (C8430Fdt) this;
        long j4 = ((AbstractC8429Fds) c8430Fdt).A04;
        if (c8430Fdt.A0B != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        int i2 = 0;
        boolean zA1R2 = C8j3.A1R((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            c8430Fdt.A0L = false;
            A07(InterfaceC8443Fe7.A04, c8430Fdt, c8430Fdt, zA1R2);
        }
        if (!c8430Fdt.A03) {
            int size2 = 1;
            while (true) {
                ArrayList<AbstractC8429Fds> arrayList2 = c8430Fdt.A02;
                if (size2 >= arrayList2.size()) {
                    size2 = arrayList2.size();
                    break;
                } else if (AbstractC7607F5u.A0o(arrayList2, size2).A02 > j2) {
                    break;
                } else {
                    size2++;
                }
            }
            int i3 = size2 - 1;
            if (j < j2) {
                while (i3 >= 0) {
                    AbstractC8429Fds abstractC8429FdsA0o = AbstractC7607F5u.A0o(c8430Fdt.A02, i3);
                    long j5 = abstractC8429FdsA0o.A02;
                    long j6 = j - j5;
                    abstractC8429FdsA0o.A0N(j6, j2 - j5);
                    if (j6 >= 0) {
                        break;
                    } else {
                        i3--;
                    }
                }
            } else {
                while (true) {
                    ArrayList<AbstractC8429Fds> arrayList3 = c8430Fdt.A02;
                    if (i3 >= arrayList3.size()) {
                        break;
                    }
                    AbstractC8429Fds abstractC8429FdsA0o2 = AbstractC7607F5u.A0o(arrayList3, i3);
                    long j7 = abstractC8429FdsA0o2.A02;
                    long j8 = j - j7;
                    if (j8 < 0) {
                        break;
                    }
                    abstractC8429FdsA0o2.A0N(j8, j2 - j7);
                    i3++;
                }
            }
        } else {
            while (true) {
                ArrayList<AbstractC8429Fds> arrayList4 = c8430Fdt.A02;
                if (i2 >= arrayList4.size()) {
                    break;
                }
                AbstractC7607F5u.A0o(arrayList4, i2).A0N(j, j2);
                i2++;
            }
        }
        if (c8430Fdt.A0B != null) {
            if ((j <= j4 || j2 > j4) && (j >= 0 || j2 < 0)) {
                return;
            }
            if (j > j4) {
                c8430Fdt.A0L = true;
            }
            A07(InterfaceC8443Fe7.A01, c8430Fdt, c8430Fdt, zA1R2);
        }
    }

    public static DQd<Animator, C8435Fdy> A03() {
        ThreadLocal<DQd<Animator, C8435Fdy>> threadLocal = A0R;
        DQd<Animator, C8435Fdy> dQd = threadLocal.get();
        if (dQd != null) {
            return dQd;
        }
        DQd<Animator, C8435Fdy> dQd2 = new DQd<>(0);
        threadLocal.set(dQd2);
        return dQd2;
    }

    public static void A04(View view, Hi2 hi2, C8434Fdx c8434Fdx) {
        c8434Fdx.A02.put(view, hi2);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = c8434Fdx.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            DQd<String, View> dQd = c8434Fdx.A01;
            if (dQd.containsKey(transitionName)) {
                dQd.put(transitionName, null);
            } else {
                dQd.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1685AoO<View> c1685AoO = c8434Fdx.A03;
                if (c1685AoO.A01(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1685AoO.A08(itemIdAtPosition, view);
                    return;
                }
                View viewA04 = c1685AoO.A04(itemIdAtPosition);
                if (viewA04 != null) {
                    viewA04.setHasTransientState(false);
                    c1685AoO.A08(itemIdAtPosition, null);
                }
            }
        }
    }

    private void A05(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                Hi2 hi2 = new Hi2(view);
                if (z) {
                    A0c(hi2);
                } else {
                    A0a(hi2);
                }
                hi2.A01.add(this);
                A0b(hi2);
                A04(view, hi2, z ? this.A0D : this.A0C);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A05(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static void A06(DQZ dqz, DQZ dqz2, AbstractC8429Fds abstractC8429Fds, Object obj, Object obj2) {
        View view = (View) obj;
        if (view == null || !abstractC8429Fds.A0f(view)) {
            return;
        }
        Object obj3 = dqz.get(obj2);
        Object obj4 = dqz2.get(view);
        if (obj3 == null || obj4 == null) {
            return;
        }
        abstractC8429Fds.A0I.add(obj3);
        abstractC8429Fds.A0H.add(obj4);
        dqz.remove(obj2);
        dqz2.remove(view);
    }

    public static void A07(InterfaceC8443Fe7 interfaceC8443Fe7, AbstractC8429Fds abstractC8429Fds, AbstractC8429Fds abstractC8429Fds2, boolean z) {
        AbstractC8429Fds abstractC8429Fds3 = abstractC8429Fds.A09;
        if (abstractC8429Fds3 != null) {
            A07(interfaceC8443Fe7, abstractC8429Fds3, abstractC8429Fds2, z);
        }
        ArrayList<InterfaceC8451FeF> arrayList = abstractC8429Fds.A0O;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        InterfaceC8451FeF[] interfaceC8451FeFArr = abstractC8429Fds.A0Q;
        if (interfaceC8451FeFArr == null) {
            interfaceC8451FeFArr = new InterfaceC8451FeF[size];
        }
        abstractC8429Fds.A0Q = null;
        InterfaceC8451FeF[] interfaceC8451FeFArr2 = (InterfaceC8451FeF[]) arrayList.toArray(interfaceC8451FeFArr);
        for (int i = 0; i < size; i++) {
            InterfaceC8451FeF interfaceC8451FeF = interfaceC8451FeFArr2[i];
            switch (((C8920Ftc) interfaceC8443Fe7).$t) {
                case 0:
                    interfaceC8451FeF.AWs(abstractC8429Fds2);
                    break;
                case 1:
                    interfaceC8451FeF.AWp(abstractC8429Fds2);
                    break;
                case 2:
                    interfaceC8451FeF.AWo(abstractC8429Fds2);
                    break;
                case 3:
                    interfaceC8451FeF.AWq();
                    break;
                case 4:
                    interfaceC8451FeF.AWr();
                    break;
            }
            interfaceC8451FeFArr2[i] = null;
        }
        abstractC8429Fds.A0Q = interfaceC8451FeFArr2;
    }

    public static Animator[] A08(AbstractC8429Fds abstractC8429Fds, AbstractCollection abstractCollection) {
        Animator[] animatorArr = (Animator[]) abstractCollection.toArray(abstractC8429Fds.A0N);
        abstractC8429Fds.A0N = A0S;
        return animatorArr;
    }

    private final Hi2 A0C(View view, boolean z) {
        C8430Fdt c8430Fdt = this.A0B;
        if (c8430Fdt != null) {
            return c8430Fdt.A0C(view, z);
        }
        ArrayList<Hi2> arrayList = z ? this.A0I : this.A0H;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Hi2 hi2 = arrayList.get(i);
                if (hi2 == null) {
                    break;
                }
                if (hi2.A00 != view) {
                    i++;
                } else if (i >= 0) {
                    return (z ? this.A0H : this.A0I).get(i);
                }
            }
        }
        return null;
    }

    private final Hi2 A0D(View view, boolean z) {
        C8430Fdt c8430Fdt = this.A0B;
        if (c8430Fdt != null) {
            return c8430Fdt.A0D(view, z);
        }
        return (z ? this.A0D : this.A0C).A02.get(view);
    }

    private final void A0G() {
        long jMax;
        if (this instanceof C8430Fdt) {
            C8430Fdt c8430Fdt = (C8430Fdt) this;
            ((AbstractC8429Fds) c8430Fdt).A04 = 0L;
            C8433Fdw c8433Fdw = new C8433Fdw(c8430Fdt);
            int i = 0;
            while (true) {
                ArrayList<AbstractC8429Fds> arrayList = c8430Fdt.A02;
                if (i >= arrayList.size()) {
                    return;
                }
                AbstractC8429Fds abstractC8429FdsA0o = AbstractC7607F5u.A0o(arrayList, i);
                abstractC8429FdsA0o.A0Y(c8433Fdw);
                abstractC8429FdsA0o.A0G();
                long j = abstractC8429FdsA0o.A04;
                boolean z = c8430Fdt.A03;
                long j2 = ((AbstractC8429Fds) c8430Fdt).A04;
                if (z) {
                    jMax = Math.max(j2, j);
                } else {
                    abstractC8429FdsA0o.A02 = j2;
                    jMax = j2 + j;
                }
                ((AbstractC8429Fds) c8430Fdt).A04 = jMax;
                i++;
            }
        } else {
            DQd<Animator, C8435Fdy> dQdA03 = A03();
            this.A04 = 0L;
            int i2 = 0;
            while (true) {
                ArrayList<Animator> arrayList2 = this.A0F;
                if (i2 >= arrayList2.size()) {
                    arrayList2.clear();
                    return;
                }
                Animator animator = arrayList2.get(i2);
                C8435Fdy c8435Fdy = dQdA03.get(animator);
                if (animator != null && c8435Fdy != null) {
                    long j3 = this.A01;
                    if (j3 >= 0) {
                        c8435Fdy.A00.setDuration(j3);
                    }
                    long j4 = this.A03;
                    if (j4 >= 0) {
                        Animator animator2 = c8435Fdy.A00;
                        animator2.setStartDelay(j4 + animator2.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A05;
                    if (timeInterpolator != null) {
                        c8435Fdy.A00.setInterpolator(timeInterpolator);
                    }
                    this.A0G.add(animator);
                    this.A04 = Math.max(this.A04, animator.getTotalDuration());
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.animation.Animator, android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r2v34, types: [X.FdG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0U(android.view.ViewGroup r35, X.C8434Fdx r36, X.C8434Fdx r37, java.util.ArrayList<X.Hi2> r38, java.util.ArrayList<X.Hi2> r39) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8429Fds.A0U(android.view.ViewGroup, X.Fdx, X.Fdx, java.util.ArrayList, java.util.ArrayList):void");
    }

    private final void A0a(Hi2 hi2) {
        if (!(this instanceof C8430Fdt)) {
            if (this instanceof C8398FdE) {
                C8398FdE.A01(hi2);
                return;
            } else {
                C8422Fdl.A00(hi2);
                return;
            }
        }
        C8430Fdt c8430Fdt = (C8430Fdt) this;
        View view = hi2.A00;
        if (c8430Fdt.A0f(view)) {
            Iterator<AbstractC8429Fds> it = c8430Fdt.A02.iterator();
            while (it.hasNext()) {
                AbstractC8429Fds next = it.next();
                if (next.A0f(view)) {
                    next.A0a(hi2);
                    hi2.A01.add(next);
                }
            }
        }
    }

    private final void A0b(Hi2 hi2) {
        if (this instanceof C8430Fdt) {
            ArrayList<AbstractC8429Fds> arrayList = ((C8430Fdt) this).A02;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC7607F5u.A0o(arrayList, i).A0b(hi2);
            }
        }
    }

    private final void A0c(Hi2 hi2) {
        float transitionAlpha;
        if (this instanceof C8430Fdt) {
            C8430Fdt c8430Fdt = (C8430Fdt) this;
            View view = hi2.A00;
            if (c8430Fdt.A0f(view)) {
                Iterator<AbstractC8429Fds> it = c8430Fdt.A02.iterator();
                while (it.hasNext()) {
                    AbstractC8429Fds next = it.next();
                    if (next.A0f(view)) {
                        next.A0c(hi2);
                        hi2.A01.add(next);
                    }
                }
                return;
            }
            return;
        }
        if (!(this instanceof C8398FdE)) {
            C8422Fdl.A00(hi2);
            return;
        }
        C8398FdE.A01(hi2);
        View view2 = hi2.A00;
        Object tag = view2.getTag(R.id.transition_pause_alpha);
        if (tag == null) {
            if (view2.getVisibility() == 0) {
                Property<View, Rect> property = AbstractC8405FdM.A00;
                transitionAlpha = view2.getTransitionAlpha();
            } else {
                transitionAlpha = 0.0f;
            }
            tag = Float.valueOf(transitionAlpha);
        }
        hi2.A02.put("android:fade:transitionAlpha", tag);
    }

    private final boolean A0g(Hi2 hi2, Hi2 hi22) {
        boolean z;
        if (!(this instanceof C8398FdE)) {
            if (hi2 != null && hi22 != null) {
                String[] strArr = this instanceof C8422Fdl ? C8422Fdl.A05 : null;
                z = true;
                if (strArr != null) {
                    for (String str : strArr) {
                        Object obj = hi2.A02.get(str);
                        Object obj2 = hi22.A02.get(str);
                        if (obj == null) {
                            if (obj2 == null) {
                            }
                        } else if (obj2 != null) {
                            if (!obj.equals(obj2)) {
                                return true;
                            }
                        }
                    }
                } else {
                    Map<String, Object> map = hi2.A02;
                    Iterator itA11 = BV5.A11(map);
                    while (itA11.hasNext()) {
                        Object next = itA11.next();
                        Object obj3 = map.get(next);
                        Object obj4 = hi22.A02.get(next);
                        if (obj3 == null) {
                            if (obj4 == null) {
                            }
                        } else if (obj4 != null) {
                            if (!obj3.equals(obj4)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        z = false;
        if (hi2 == null) {
            if (hi22 != null) {
            }
        } else if (hi22 != null && hi22.A02.containsKey("android:visibility:visibility") != hi2.A02.containsKey("android:visibility:visibility")) {
            return false;
        }
        C8402FdI c8402FdIA00 = C8398FdE.A00(hi2, hi22);
        if (c8402FdIA00.A05 && (c8402FdIA00.A01 == 0 || c8402FdIA00.A00 == 0)) {
            return true;
        }
        return z;
    }

    public final C8444Fe8 A09() {
        C8444Fe8 c8444Fe8 = new C8444Fe8(this);
        this.A08 = c8444Fe8;
        A0Y(c8444Fe8);
        return this.A08;
    }

    public final AbstractC8429Fds A0B() {
        C8430Fdt c8430Fdt = this.A0B;
        return c8430Fdt != null ? c8430Fdt.A0B() : this;
    }

    public void A0F() {
        AbstractC8429Fds abstractC8429Fds = this.A0A;
        if (abstractC8429Fds != null) {
            this.A0A = null;
            abstractC8429Fds.A0F();
        }
        DQd<Animator, C8435Fdy> dQdA03 = A03();
        ArrayList<Animator> arrayList = this.A0G;
        int size = arrayList.size();
        Animator[] animatorArrA08 = A08(this, arrayList);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArrA08[i];
            animatorArrA08[i] = null;
            animator.cancel();
            dQdA03.remove(animator);
        }
        this.A0N = animatorArrA08;
        A07(InterfaceC8443Fe7.A00, this, this, false);
    }

    public final void A0H() {
        if (this instanceof C8430Fdt) {
            C8430Fdt c8430Fdt = (C8430Fdt) this;
            int i = 0;
            while (true) {
                ArrayList<AbstractC8429Fds> arrayList = c8430Fdt.A02;
                if (i >= arrayList.size()) {
                    return;
                }
                AbstractC7607F5u.A0o(arrayList, i).A0H();
                i++;
            }
        } else {
            DQd<Animator, C8435Fdy> dQdA03 = A03();
            ArrayList<Animator> arrayList2 = this.A0G;
            int size = arrayList2.size();
            Animator[] animatorArrA08 = A08(this, arrayList2);
            while (true) {
                size--;
                if (size < 0) {
                    this.A0N = animatorArrA08;
                    arrayList2.clear();
                    return;
                } else {
                    Animator animator = animatorArrA08[size];
                    animatorArrA08[size] = null;
                    dQdA03.remove(animator);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.Fds] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void A0I() {
        ?? r9;
        ArrayList<AbstractC8429Fds> arrayList;
        if (this instanceof C8430Fdt) {
            C8430Fdt c8430Fdt = (C8430Fdt) this;
            if (!c8430Fdt.A02.isEmpty()) {
                C8436Fdz c8436Fdz = new C8436Fdz();
                c8436Fdz.A00 = c8430Fdt;
                Iterator<AbstractC8429Fds> it = c8430Fdt.A02.iterator();
                while (it.hasNext()) {
                    it.next().A0Y(c8436Fdz);
                }
                c8430Fdt.A01 = c8430Fdt.A02.size();
                if (c8430Fdt.A03) {
                    Iterator<AbstractC8429Fds> it2 = c8430Fdt.A02.iterator();
                    while (it2.hasNext()) {
                        it2.next().A0I();
                    }
                    return;
                }
                int i = 1;
                while (true) {
                    arrayList = c8430Fdt.A02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    AbstractC7607F5u.A0o(arrayList, i - 1).A0Y(new I0K(1, arrayList.get(i), c8430Fdt));
                    i++;
                }
                AbstractC8429Fds abstractC8429FdsA0o = AbstractC7607F5u.A0o(arrayList, 0);
                if (abstractC8429FdsA0o != null) {
                    abstractC8429FdsA0o.A0I();
                    return;
                }
                return;
            }
            c8430Fdt.A0L();
            r9 = c8430Fdt;
        } else {
            A0L();
            DQd<Animator, C8435Fdy> dQdA03 = A03();
            Iterator<Animator> it3 = this.A0F.iterator();
            while (it3.hasNext()) {
                Animator animatorA0S = AbstractC7607F5u.A0S(it3);
                if (dQdA03.containsKey(animatorA0S)) {
                    A0L();
                    if (animatorA0S != null) {
                        animatorA0S.addListener(new C8428Fdr(dQdA03, this));
                        long j = this.A01;
                        if (j >= 0) {
                            animatorA0S.setDuration(j);
                        }
                        long j2 = this.A03;
                        if (j2 >= 0) {
                            animatorA0S.setStartDelay(j2 + animatorA0S.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.A05;
                        if (timeInterpolator != null) {
                            animatorA0S.setInterpolator(timeInterpolator);
                        }
                        I05.A00(animatorA0S, this, 1);
                        animatorA0S.start();
                    }
                }
            }
            this.A0F.clear();
            this = this;
        }
        r9.A0K();
    }

    public final void A0J() {
        if (this instanceof C8430Fdt) {
            C8430Fdt c8430Fdt = (C8430Fdt) this;
            c8430Fdt.A00 |= 2;
            int size = c8430Fdt.A02.size();
            for (int i = 0; i < size; i++) {
                AbstractC7607F5u.A0o(c8430Fdt.A02, i).A0J();
            }
        }
    }

    public final void A0K() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i != 0) {
            return;
        }
        A07(InterfaceC8443Fe7.A01, this, this, false);
        int i2 = 0;
        while (true) {
            C1685AoO<View> c1685AoO = this.A0D.A03;
            if (i2 >= c1685AoO.A00()) {
                break;
            }
            View viewA03 = c1685AoO.A03(i2);
            if (viewA03 != null) {
                viewA03.setHasTransientState(false);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            C1685AoO<View> c1685AoO2 = this.A0C.A03;
            if (i3 >= c1685AoO2.A00()) {
                this.A0L = true;
                return;
            }
            View viewA032 = c1685AoO2.A03(i3);
            if (viewA032 != null) {
                viewA032.setHasTransientState(false);
            }
            i3++;
        }
    }

    public final void A0L() {
        if (this.A00 == 0) {
            A07(InterfaceC8443Fe7.A04, this, this, false);
            this.A0L = false;
        }
        this.A00++;
    }

    public final void A0M(long j) {
        ArrayList<AbstractC8429Fds> arrayList;
        if (!(this instanceof C8430Fdt)) {
            this.A01 = j;
            return;
        }
        C8430Fdt c8430Fdt = (C8430Fdt) this;
        ((AbstractC8429Fds) c8430Fdt).A01 = j;
        if (j < 0 || (arrayList = c8430Fdt.A02) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC7607F5u.A0o(c8430Fdt.A02, i).A0M(j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Fds] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.Fds] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Fdt] */
    public final void A0O(TimeInterpolator timeInterpolator) {
        if (this instanceof C8430Fdt) {
            this = (C8430Fdt) this;
            this.A00 |= 1;
            ArrayList<AbstractC8429Fds> arrayList = this.A02;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AbstractC7607F5u.A0o(this.A02, i).A0O(timeInterpolator);
                }
            }
        }
        this.A05 = timeInterpolator;
    }

    public void A0P(View view) {
        this.A0K.add(view);
    }

    public void A0Q(View view) {
        if (this.A0L) {
            return;
        }
        ArrayList<Animator> arrayList = this.A0G;
        int size = arrayList.size();
        Animator[] animatorArrA08 = A08(this, arrayList);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArrA08[i];
            animatorArrA08[i] = null;
            animator.pause();
        }
        this.A0N = animatorArrA08;
        A07(InterfaceC8443Fe7.A02, this, this, false);
        this.A0P = true;
    }

    public void A0R(View view) {
        this.A0K.remove(view);
    }

    public void A0S(View view) {
        if (this.A0P) {
            if (!this.A0L) {
                ArrayList<Animator> arrayList = this.A0G;
                int size = arrayList.size();
                Animator[] animatorArrA08 = A08(this, arrayList);
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArrA08[size];
                    animatorArrA08[size] = null;
                    animator.resume();
                }
                this.A0N = animatorArrA08;
                A07(InterfaceC8443Fe7.A03, this, this, false);
            }
            this.A0P = false;
        }
    }

    public final void A0V(ViewGroup viewGroup, boolean z) {
        C8434Fdx c8434Fdx;
        if (z) {
            C8434Fdx c8434Fdx2 = this.A0D;
            c8434Fdx2.A02.clear();
            c8434Fdx2.A00.clear();
            c8434Fdx = this.A0D;
        } else {
            C8434Fdx c8434Fdx3 = this.A0C;
            c8434Fdx3.A02.clear();
            c8434Fdx3.A00.clear();
            c8434Fdx = this.A0C;
        }
        c8434Fdx.A03.A05();
        ArrayList<Integer> arrayList = this.A0J;
        if (arrayList.size() <= 0 && this.A0K.size() <= 0) {
            A05(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(AnonymousClass001.A0F(arrayList.get(i)));
            if (viewFindViewById != null) {
                Hi2 hi2 = new Hi2(viewFindViewById);
                if (z) {
                    A0c(hi2);
                } else {
                    A0a(hi2);
                }
                hi2.A01.add(this);
                A0b(hi2);
                A04(viewFindViewById, hi2, z ? this.A0D : this.A0C);
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList<View> arrayList2 = this.A0K;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View viewA0d = AbstractC7607F5u.A0d(arrayList2, i2);
            Hi2 hi22 = new Hi2(viewA0d);
            if (z) {
                A0c(hi22);
            } else {
                A0a(hi22);
            }
            hi22.A01.add(this);
            A0b(hi22);
            A04(viewA0d, hi22, z ? this.A0D : this.A0C);
            i2++;
        }
    }

    public void A0W(C8467FeV c8467FeV) {
        if (c8467FeV == null) {
            c8467FeV = A0T;
        }
        this.A06 = c8467FeV;
    }

    public final void A0X(AbstractC8473Fec abstractC8473Fec) {
        if (!(this instanceof C8430Fdt)) {
            this.A07 = abstractC8473Fec;
            return;
        }
        C8430Fdt c8430Fdt = (C8430Fdt) this;
        c8430Fdt.A07 = abstractC8473Fec;
        c8430Fdt.A00 |= 8;
        int size = c8430Fdt.A02.size();
        for (int i = 0; i < size; i++) {
            AbstractC7607F5u.A0o(c8430Fdt.A02, i).A0X(abstractC8473Fec);
        }
    }

    public void A0Y(InterfaceC8451FeF interfaceC8451FeF) {
        ArrayList<InterfaceC8451FeF> arrayListA0h = this.A0O;
        if (arrayListA0h == null) {
            arrayListA0h = C3cG.A0h();
            this.A0O = arrayListA0h;
        }
        arrayListA0h.add(interfaceC8451FeF);
    }

    public void A0Z(InterfaceC8451FeF interfaceC8451FeF) {
        AbstractC8429Fds abstractC8429Fds;
        ArrayList<InterfaceC8451FeF> arrayList = this.A0O;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC8451FeF) && (abstractC8429Fds = this.A09) != null) {
                abstractC8429Fds.A0Z(interfaceC8451FeF);
            }
            if (this.A0O.size() == 0) {
                this.A0O = null;
            }
        }
    }

    public final boolean A0d() {
        if (!(this instanceof C8430Fdt)) {
            return !this.A0G.isEmpty();
        }
        C8430Fdt c8430Fdt = (C8430Fdt) this;
        int i = 0;
        while (true) {
            ArrayList<AbstractC8429Fds> arrayList = c8430Fdt.A02;
            if (i >= arrayList.size()) {
                return false;
            }
            if (AbstractC7607F5u.A0o(arrayList, i).A0d()) {
                return true;
            }
            i++;
        }
    }

    public final boolean A0e() {
        if (this instanceof C8430Fdt) {
            ArrayList<AbstractC8429Fds> arrayList = ((C8430Fdt) this).A02;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!AbstractC7607F5u.A0o(arrayList, i).A0e()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String toString() {
        return A0E("");
    }

    private final boolean A0f(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.A0J;
        return (arrayList.size() == 0 && this.A0K.size() == 0) || AbstractC7608F5v.A1Y(arrayList, id) || this.A0K.contains(view);
    }

    /* renamed from: A0A, reason: merged with bridge method [inline-methods] */
    public AbstractC8429Fds clone() {
        try {
            AbstractC8429Fds abstractC8429Fds = (AbstractC8429Fds) super.clone();
            abstractC8429Fds.A0F = C3cG.A0h();
            abstractC8429Fds.A0D = new C8434Fdx();
            abstractC8429Fds.A0C = new C8434Fdx();
            abstractC8429Fds.A0I = null;
            abstractC8429Fds.A0H = null;
            abstractC8429Fds.A08 = null;
            abstractC8429Fds.A09 = this;
            abstractC8429Fds.A0O = null;
            abstractC8429Fds.A0A = null;
            return abstractC8429Fds;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }

    public String A0E(String str) {
        StringBuilder sbA0x = C60O.A0x(str);
        AbstractC7609F5w.A1L(sbA0x, this);
        sbA0x.append("@");
        BV4.A1N(sbA0x, hashCode());
        sbA0x.append(": ");
        long j = this.A01;
        if (j != -1) {
            sbA0x.append("dur(");
            sbA0x.append(j);
            sbA0x.append(") ");
        }
        long j2 = this.A03;
        if (j2 != -1) {
            sbA0x.append("dly(");
            sbA0x.append(j2);
            sbA0x.append(") ");
        }
        TimeInterpolator timeInterpolator = this.A05;
        if (timeInterpolator != null) {
            sbA0x.append("interp(");
            sbA0x.append(timeInterpolator);
            sbA0x.append(") ");
        }
        ArrayList<Integer> arrayList = this.A0J;
        if (arrayList.size() > 0 || this.A0K.size() > 0) {
            sbA0x.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sbA0x.append(", ");
                    }
                    sbA0x.append(arrayList.get(i));
                }
            }
            ArrayList<View> arrayList2 = this.A0K;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sbA0x.append(", ");
                    }
                    sbA0x.append(arrayList2.get(i2));
                }
            }
            sbA0x.append(")");
        }
        return sbA0x.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0T(ViewGroup viewGroup) {
        C8435Fdy c8435Fdy;
        Hi2 hi2;
        this.A0I = C3cG.A0h();
        this.A0H = C3cG.A0h();
        C8434Fdx c8434Fdx = this.A0D;
        C8434Fdx c8434Fdx2 = this.A0C;
        DQd<View, Hi2> dQd = c8434Fdx.A02;
        DQd dQd2 = new DQd(0);
        dQd2.A0A(dQd);
        DQd<View, Hi2> dQd3 = c8434Fdx2.A02;
        DQd dQd4 = new DQd(0);
        dQd4.A0A(dQd3);
        int i = 0;
        while (true) {
            int[] iArr = this.A0M;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                int size = dQd2.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        View view = (View) dQd2.A05(size);
                        if (view != null && A0f(view) && (hi2 = (Hi2) dQd4.remove(view)) != null && A0f(hi2.A00)) {
                            this.A0I.add(dQd2.A06(size));
                            this.A0H.add(hi2);
                        }
                    }
                }
            } else if (i2 == 2) {
                DQd<String, View> dQd5 = c8434Fdx.A01;
                DQd<String, View> dQd6 = c8434Fdx2.A01;
                int size2 = dQd5.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    View viewA07 = dQd5.A07(i3);
                    if (viewA07 != null && A0f(viewA07)) {
                        A06(dQd2, dQd4, this, dQd6.get(dQd5.A05(i3)), viewA07);
                    }
                }
            } else if (i2 == 3) {
                SparseArray<View> sparseArray = c8434Fdx.A00;
                SparseArray<View> sparseArray2 = c8434Fdx2.A00;
                int size3 = sparseArray.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    View viewValueAt = sparseArray.valueAt(i4);
                    if (viewValueAt != null && A0f(viewValueAt)) {
                        A06(dQd2, dQd4, this, sparseArray2.get(sparseArray.keyAt(i4)), viewValueAt);
                    }
                }
            } else if (i2 == 4) {
                C1685AoO<View> c1685AoO = c8434Fdx.A03;
                C1685AoO<View> c1685AoO2 = c8434Fdx2.A03;
                int iA00 = c1685AoO.A00();
                for (int i5 = 0; i5 < iA00; i5++) {
                    View viewA03 = c1685AoO.A03(i5);
                    if (viewA03 != null && A0f(viewA03)) {
                        A06(dQd2, dQd4, this, c1685AoO2.A04(c1685AoO.A02(i5)), viewA03);
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < dQd2.size(); i6++) {
            Hi2 hi22 = (Hi2) dQd2.A07(i6);
            if (A0f(hi22.A00)) {
                this.A0I.add(hi22);
                this.A0H.add(null);
            }
        }
        for (int i7 = 0; i7 < dQd4.size(); i7++) {
            Hi2 hi23 = (Hi2) dQd4.A07(i7);
            if (A0f(hi23.A00)) {
                this.A0H.add(hi23);
                this.A0I.add(null);
            }
        }
        DQd<Animator, C8435Fdy> dQdA03 = A03();
        int size4 = dQdA03.size();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayListA0h = C3cG.A0h();
        for (int i8 = size4 - 1; i8 >= 0; i8--) {
            Animator animatorA05 = dQdA03.A05(i8);
            if (animatorA05 != null && (c8435Fdy = dQdA03.get(animatorA05)) != null && c8435Fdy.A01 != null && C6xC.A00(windowId, c8435Fdy.A02)) {
                Hi2 hi24 = c8435Fdy.A04;
                View view2 = c8435Fdy.A01;
                Hi2 hi2A0D = A0D(view2, true);
                Hi2 hi2A0C = A0C(view2, true);
                if ((hi2A0D != null || hi2A0C != null || (hi2A0C = this.A0C.A02.get(view2)) != null) && c8435Fdy.A03.A0g(hi24, hi2A0C)) {
                    AbstractC8429Fds abstractC8429Fds = c8435Fdy.A03;
                    if (abstractC8429Fds.A0B().A08 != null) {
                        animatorA05.cancel();
                        ArrayList<Animator> arrayList = abstractC8429Fds.A0G;
                        arrayList.remove(animatorA05);
                        dQdA03.A06(i8);
                        if (arrayList.size() == 0) {
                            arrayListA0h.add(abstractC8429Fds);
                        }
                    } else if (animatorA05.isRunning() || animatorA05.isStarted()) {
                        animatorA05.cancel();
                    } else {
                        dQdA03.A06(i8);
                    }
                }
            }
        }
        for (int i9 = 0; i9 < arrayListA0h.size(); i9++) {
            AbstractC8429Fds abstractC8429FdsA0o = AbstractC7607F5u.A0o(arrayListA0h, i9);
            A07(InterfaceC8443Fe7.A00, abstractC8429FdsA0o, abstractC8429FdsA0o, false);
            if (!abstractC8429FdsA0o.A0L) {
                abstractC8429FdsA0o.A0L = true;
                A07(InterfaceC8443Fe7.A01, abstractC8429FdsA0o, abstractC8429FdsA0o, false);
            }
        }
        A0U(viewGroup, this.A0D, this.A0C, this.A0I, this.A0H);
        if (this.A08 == null) {
            A0I();
        } else if (Build.VERSION.SDK_INT >= 34) {
            A0G();
            this.A08.A01();
            this.A08.A02();
        }
    }
}
