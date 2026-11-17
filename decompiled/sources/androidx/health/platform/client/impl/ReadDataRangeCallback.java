package androidx.health.platform.client.impl;

import X.BV8;
import X.C7384Etj;
import X.C9177Fzk;
import X.DWk;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.ReadDataRangeResponse;
import androidx.health.platform.client.service.IReadDataRangeCallback;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes5.dex */
public final class ReadDataRangeCallback extends Binder implements IReadDataRangeCallback {
    public final SettableFuture<C9177Fzk> A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IReadDataRangeCallback");
                if (i == 1) {
                    ReadDataRangeResponse readDataRangeResponse = (ReadDataRangeResponse) BV8.A0o(parcel, ReadDataRangeResponse.CREATOR);
                    C7384Etj.A0Y(readDataRangeResponse, 0);
                    this.A00.set(readDataRangeResponse.A00);
                    return true;
                }
                if (i == 2) {
                    ErrorStatus errorStatus = (ErrorStatus) BV8.A0o(parcel, ErrorStatus.CREATOR);
                    C7384Etj.A0Y(errorStatus, 0);
                    this.A00.setException(DWk.A00(errorStatus));
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IReadDataRangeCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public ReadDataRangeCallback(SettableFuture<C9177Fzk> settableFuture) {
        this();
        this.A00 = settableFuture;
    }

    public ReadDataRangeCallback() {
        attachInterface(this, "androidx.health.platform.client.service.IReadDataRangeCallback");
    }
}
