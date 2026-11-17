package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FJl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7892FJl extends TouchDelegate {
    public static final Rect A02 = AbstractC7607F5u.A0X();
    public final List<FHU> A00;
    public final ViewGroup A01;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    @Override // android.view.TouchDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7892FJl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C7892FJl(ViewGroup viewGroup, List<FJn> list) {
        super(A02, viewGroup);
        this.A01 = viewGroup;
        this.A00 = C3cG.A0h();
        A00(list);
    }

    public final void A00(List<FJn> list) {
        List<FHU> list2 = this.A00;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<FJn> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(new FHU(this.A01, it.next()));
        }
        list2.addAll(arrayListA0i);
        AbstractC06907md.A04(list2, C7895FJp.A00);
    }
}
