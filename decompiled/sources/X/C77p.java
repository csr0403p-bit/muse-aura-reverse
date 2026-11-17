package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* renamed from: X.77p, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C77p {
    public final int A00;
    public final boolean A01;
    public final long[] A02;
    public final RemoteViews[] A03;

    public C77p(Parcel parcel) {
        int i = parcel.readInt();
        long[] jArr = new long[i];
        this.A02 = jArr;
        parcel.readLongArray(jArr);
        Parcelable.Creator creator = RemoteViews.CREATOR;
        C7384Etj.A0V(creator);
        RemoteViews[] remoteViewsArr = new RemoteViews[i];
        parcel.readTypedArray(remoteViewsArr, creator);
        BFI.A0I(remoteViewsArr);
        this.A03 = remoteViewsArr;
        this.A01 = parcel.readInt() == 1;
        this.A00 = parcel.readInt();
    }

    public C77p(long[] jArr, RemoteViews[] remoteViewsArr) {
        this.A02 = jArr;
        this.A03 = remoteViewsArr;
        this.A01 = false;
        this.A00 = 1;
        int size = C3cG.A0m(C60O.A11(0)).size();
        if (size <= 1) {
        } else {
            throw C60O.A0i(FGI.A0Y("View type count is set to ", ", but the collection contains ", " different layout ids", 1, size));
        }
    }
}
