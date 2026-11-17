package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;

/* renamed from: X.AMx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0992AMx implements Parcelable.ClassLoaderCreator<SnapshotStateList<Object>> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int i = parcel.readInt();
        BT9 bt9 = new BT9(20, classLoader, parcel);
        if (i == 0) {
            return new SnapshotStateList();
        }
        AHV ahvA5a = AHT.A01.A5a();
        for (int i2 = 0; i2 < i; i2++) {
            ahvA5a.add(C8j4.A0r(bt9, i2));
        }
        return new SnapshotStateList(ahvA5a.A0U());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SnapshotStateList[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ SnapshotStateList<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        int i = parcel.readInt();
        BT9 bt9 = new BT9(20, classLoader, parcel);
        if (i == 0) {
            return new SnapshotStateList();
        }
        AHV ahvA5a = AHT.A01.A5a();
        for (int i2 = 0; i2 < i; i2++) {
            ahvA5a.add(C8j4.A0r(bt9, i2));
        }
        return new SnapshotStateList(ahvA5a.A0U());
    }
}
