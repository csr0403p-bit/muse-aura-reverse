package X;

import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: X.75B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75B {
    public static final C75B A04 = new C75B(new long[0], new RemoteViews[0], 1, false);
    public final int A00;
    public final boolean A01;
    public final long[] A02;
    public final RemoteViews[] A03;

    public C75B(long[] jArr, RemoteViews[] remoteViewsArr, int i, boolean z) {
        this.A02 = jArr;
        this.A03 = remoteViewsArr;
        this.A01 = z;
        this.A00 = i;
        int length = jArr.length;
        int length2 = remoteViewsArr.length;
        if (length != length2) {
            throw C60O.A0i("RemoteCollectionItems has different number of ids and views");
        }
        if (i < 1) {
            throw C60O.A0i("View type count must be >= 1");
        }
        ArrayList arrayListA11 = C60O.A11(length2);
        for (RemoteViews remoteViews : remoteViewsArr) {
            C60Q.A1P(arrayListA11, remoteViews.getLayoutId());
        }
        int size = C3cG.A0m(arrayListA11).size();
        int i2 = this.A00;
        if (size > i2) {
            throw C60O.A0i(FGI.A0Y("View type count is set to ", ", but the collection contains ", " different layout ids", i2, size));
        }
    }
}
