package androidx.room;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class IMultiInstanceInvalidationCallback$Stub$Proxy implements IMultiInstanceInvalidationCallback {
    public IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    @Override // androidx.room.IMultiInstanceInvalidationCallback
    public final void ATh(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.A00);
            parcelObtain.writeStringArray(strArr);
            this.A00.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
