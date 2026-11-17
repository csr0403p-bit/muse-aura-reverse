package X;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: X.CZi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3619CZi implements InterfaceC3633Cah {
    public final IBinder A00;

    public C3619CZi(IBinder iBinder) {
        this.A00 = iBinder;
    }

    @Override // X.InterfaceC3633Cah
    public final void APP(int i) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.gcm.INetworkTaskCallback");
            parcelObtain.writeInt(i);
            BV7.A1A(this.A00, parcelObtain, parcelObtain2, 2);
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }
}
