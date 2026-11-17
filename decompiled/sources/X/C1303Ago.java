package X;

import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.Ago, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1303Ago implements AX8 {
    public final int A00;
    public final MotionEvent A01;
    public final List<C1298Agj> A02;

    public C1303Ago(MotionEvent motionEvent, List list, int i) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = motionEvent;
        if (list.isEmpty()) {
            throw C60O.A0i("changes cannot be empty");
        }
    }
}
