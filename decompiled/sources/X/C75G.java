package X;

import android.widget.RemoteViews;

/* renamed from: X.75G, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75G {
    public static final C75G A00 = new C75G();

    public final void A00(RemoteViews remoteViews, C75B c75b, int i) {
        RemoteViews.RemoteCollectionItems.Builder viewTypeCount = new RemoteViews.RemoteCollectionItems.Builder().setHasStableIds(c75b.A01).setViewTypeCount(c75b.A00);
        long[] jArr = c75b.A02;
        int length = jArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            viewTypeCount.addItem(jArr[i2], c75b.A03[i2]);
        }
        remoteViews.setRemoteAdapter(i, viewTypeCount.build());
    }
}
