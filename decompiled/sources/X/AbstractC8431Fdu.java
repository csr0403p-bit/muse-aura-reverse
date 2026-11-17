package X;

import android.os.Build;
import android.view.ViewGroup;
import com.facebook.aura.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Fdu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8431Fdu {
    public static AbstractC8429Fds A00 = new C8426Fdp();
    public static ThreadLocal<WeakReference<DQd<ViewGroup, ArrayList<AbstractC8429Fds>>>> A02 = new ThreadLocal<>();
    public static ArrayList<ViewGroup> A01 = C3cG.A0h();

    public static DQd<ViewGroup, ArrayList<AbstractC8429Fds>> A00() {
        DQd<ViewGroup, ArrayList<AbstractC8429Fds>> dQd;
        ThreadLocal<WeakReference<DQd<ViewGroup, ArrayList<AbstractC8429Fds>>>> threadLocal = A02;
        WeakReference<DQd<ViewGroup, ArrayList<AbstractC8429Fds>>> weakReference = threadLocal.get();
        if (weakReference != null && (dQd = weakReference.get()) != null) {
            return dQd;
        }
        DQd<ViewGroup, ArrayList<AbstractC8429Fds>> dQd2 = new DQd<>(0);
        threadLocal.set(BV4.A0q(dQd2));
        return dQd2;
    }

    public static C8444Fe8 A01(ViewGroup viewGroup, AbstractC8429Fds abstractC8429Fds) {
        ArrayList<ViewGroup> arrayList = A01;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC8429Fds.A0e()) {
            throw C60O.A0i("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        AbstractC8429Fds abstractC8429FdsClone = abstractC8429Fds.clone();
        C8430Fdt c8430Fdt = new C8430Fdt();
        c8430Fdt.A0h(abstractC8429FdsClone);
        abstractC8429Fds.A0A = c8430Fdt;
        A02(viewGroup, c8430Fdt);
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewOnAttachStateChangeListenerC8432Fdv viewOnAttachStateChangeListenerC8432Fdv = new ViewOnAttachStateChangeListenerC8432Fdv();
        viewOnAttachStateChangeListenerC8432Fdv.A01 = c8430Fdt;
        viewOnAttachStateChangeListenerC8432Fdv.A00 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC8432Fdv);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewOnAttachStateChangeListenerC8432Fdv);
        viewGroup.invalidate();
        return c8430Fdt.A09();
    }

    public static void A02(ViewGroup viewGroup, AbstractC8429Fds abstractC8429Fds) {
        ArrayList<AbstractC8429Fds> arrayList = A00().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC8429Fds> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().A0Q(viewGroup);
            }
        }
        if (abstractC8429Fds != null) {
            abstractC8429Fds.A0V(viewGroup, true);
        }
        viewGroup.getTag(R.id.transition_current_scene);
    }
}
