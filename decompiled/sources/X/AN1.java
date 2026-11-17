package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public final class AN1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ATF atf;
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            atf = AGG.A00;
        } else if (i == 1) {
            atf = AGE.A00;
        } else {
            if (i != 2) {
                throw C3cG.A0Q(FGI.A0I("Unsupported MutableState policy ", i, " was restored"));
            }
            atf = AG5.A00;
        }
        return C3cG.A08(atf, value);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }
}
