package androidx.health.platform.client.impl;

import X.BV8;
import X.C7384Etj;
import X.C9182Fzp;
import X.DWk;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.AggregateDataResponse;
import androidx.health.platform.client.service.IAggregateDataCallback;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes5.dex */
public final class AggregateDataCallback extends Binder implements IAggregateDataCallback {
    public final SettableFuture<C9182Fzp> A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IAggregateDataCallback");
                if (i == 1) {
                    AggregateDataResponse aggregateDataResponse = (AggregateDataResponse) BV8.A0o(parcel, AggregateDataResponse.CREATOR);
                    C7384Etj.A0Y(aggregateDataResponse, 0);
                    this.A00.set(aggregateDataResponse.A00);
                    return true;
                }
                if (i == 2) {
                    ErrorStatus errorStatus = (ErrorStatus) BV8.A0o(parcel, ErrorStatus.CREATOR);
                    C7384Etj.A0Y(errorStatus, 0);
                    this.A00.setException(DWk.A00(errorStatus));
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IAggregateDataCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public AggregateDataCallback(SettableFuture<C9182Fzp> settableFuture) {
        this();
        this.A00 = settableFuture;
    }

    public AggregateDataCallback() {
        attachInterface(this, "androidx.health.platform.client.service.IAggregateDataCallback");
    }
}
