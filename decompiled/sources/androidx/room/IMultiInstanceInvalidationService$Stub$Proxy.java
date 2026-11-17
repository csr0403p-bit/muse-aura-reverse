package androidx.room;

import X.BV7;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class IMultiInstanceInvalidationService$Stub$Proxy implements IMultiInstanceInvalidationService {
    public IBinder A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.A00;
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void A5M(int i, String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.A00);
            parcelObtain.writeInt(i);
            parcelObtain.writeStringArray(strArr);
            this.A00.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final int AZz(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.A00);
            parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
            parcelObtain.writeString(str);
            BV7.A1A(this.A00, parcelObtain, parcelObtain2, 1);
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    public final void Ahj(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.A00);
            parcelObtain.writeStrongInterface(iMultiInstanceInvalidationCallback);
            parcelObtain.writeInt(i);
            BV7.A1A(this.A00, parcelObtain, parcelObtain2, 2);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
