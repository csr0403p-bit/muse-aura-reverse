package android.support.v4.os;

import X.C7580F4t;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C7580F4t(0);
    public IResultReceiver A00;

    public final class MyResultReceiver extends Binder implements IResultReceiver {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        public MyResultReceiver() {
            this();
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IResultReceiver.A00;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(str);
                    if (i == 1) {
                        parcel.readInt();
                        parcel.readTypedObject(Bundle.CREATOR);
                        return true;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(str);
                    return true;
                }
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        public MyResultReceiver() {
            attachInterface(this, IResultReceiver.A00);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            IResultReceiver myResultReceiver = this.A00;
            if (myResultReceiver == null) {
                myResultReceiver = new MyResultReceiver();
                this.A00 = myResultReceiver;
            }
            parcel.writeStrongBinder(myResultReceiver.asBinder());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
