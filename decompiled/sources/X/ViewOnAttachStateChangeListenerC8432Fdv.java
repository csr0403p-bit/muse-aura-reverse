package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Fdv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC8432Fdv implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public AbstractC8429Fds A01;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList<ViewGroup> arrayList = AbstractC8431Fdu.A01;
        ViewGroup viewGroup2 = this.A00;
        if (arrayList.remove(viewGroup2)) {
            DQd<ViewGroup, ArrayList<AbstractC8429Fds>> dQdA00 = AbstractC8431Fdu.A00();
            ArrayList<AbstractC8429Fds> arrayListA0h = dQdA00.get(viewGroup2);
            ArrayList arrayListA0t = null;
            if (arrayListA0h == null) {
                arrayListA0h = C3cG.A0h();
                dQdA00.put(viewGroup2, arrayListA0h);
            } else if (arrayListA0h.size() > 0) {
                arrayListA0t = BV4.A0t(arrayListA0h);
            }
            AbstractC8429Fds abstractC8429Fds = this.A01;
            arrayListA0h.add(abstractC8429Fds);
            abstractC8429Fds.A0Y(new I0K(0, dQdA00, this));
            abstractC8429Fds.A0V(viewGroup2, false);
            if (arrayListA0t != null) {
                Iterator it = arrayListA0t.iterator();
                while (it.hasNext()) {
                    ((AbstractC8429Fds) it.next()).A0S(viewGroup2);
                }
            }
            abstractC8429Fds.A0T(viewGroup2);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList<ViewGroup> arrayList = AbstractC8431Fdu.A01;
        ViewGroup viewGroup2 = this.A00;
        arrayList.remove(viewGroup2);
        ArrayList<AbstractC8429Fds> arrayList2 = AbstractC8431Fdu.A00().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator<AbstractC8429Fds> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().A0S(viewGroup2);
            }
        }
        AbstractC8429Fds abstractC8429Fds = this.A01;
        C8434Fdx c8434Fdx = abstractC8429Fds.A0D;
        c8434Fdx.A02.clear();
        c8434Fdx.A00.clear();
        abstractC8429Fds.A0D.A03.A05();
    }
}
