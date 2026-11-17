package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Hib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10445Hib {
    public final HuA A01;
    public final WeakReference<View> A02;
    public final List<Rect> A03 = C3cG.A0h();
    public final Rect A00 = AbstractC7607F5u.A0X();
    public final Rect A04 = AbstractC7607F5u.A0X();

    public final void A00(List<Rect> list) {
        list.clear();
        List<Rect> list2 = this.A03;
        list2.clear();
        View viewA0c = AbstractC7607F5u.A0c(this.A02);
        if (viewA0c != null) {
            Rect rect = this.A00;
            if (!viewA0c.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                return;
            }
            list2.add(rect);
            List list3 = this.A01.A00;
            if (0 < list3.size()) {
                list3.get(0);
                throw BV4.A0a("getClipRect");
            }
            list.addAll(list2);
        }
    }

    public C10445Hib(View view, HuA huA) {
        this.A01 = huA;
        this.A02 = BV4.A0q(view);
    }
}
