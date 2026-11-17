package X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.maps.basemap.BaseMapSavedState;

/* loaded from: classes4.dex */
public final class BSH implements Parcelable.Creator {
    public final int $t;

    public BSH(int i) {
        this.$t = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.$t) {
            case 0:
                return new DefaultLazyKey(parcel.readInt());
            case 1:
                return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
            case 2:
                return new ParcelableSnapshotMutableIntState(parcel.readInt());
            case 3:
                return new ParcelableSnapshotMutableLongState(parcel.readLong());
            case 4:
                return new ContextChain(parcel);
            case 5:
                C7384Etj.A0Y(parcel, 0);
                return new BaseMapSavedState(parcel);
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.$t) {
            case 0:
                return new DefaultLazyKey[i];
            case 1:
                return new ParcelableSnapshotMutableFloatState[i];
            case 2:
                return new ParcelableSnapshotMutableIntState[i];
            case 3:
                return new ParcelableSnapshotMutableLongState[i];
            case 4:
                return new ContextChain[i];
            case 5:
                return new BaseMapSavedState[i];
            default:
                return new Object[0];
        }
    }
}
