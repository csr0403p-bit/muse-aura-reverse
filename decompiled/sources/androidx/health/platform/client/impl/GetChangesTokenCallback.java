package androidx.health.platform.client.impl;

import X.BV8;
import X.C7384Etj;
import X.C9189Fzw;
import X.DWk;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.GetChangesTokenResponse;
import androidx.health.platform.client.service.IGetChangesTokenCallback;
import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes5.dex */
public final class GetChangesTokenCallback extends Binder implements IGetChangesTokenCallback {
    public final SettableFuture<C9189Fzw> A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IGetChangesTokenCallback");
                if (i == 1) {
                    GetChangesTokenResponse getChangesTokenResponse = (GetChangesTokenResponse) BV8.A0o(parcel, GetChangesTokenResponse.CREATOR);
                    C7384Etj.A0Y(getChangesTokenResponse, 0);
                    this.A00.set(getChangesTokenResponse.A00);
                    return true;
                }
                if (i == 2) {
                    ErrorStatus errorStatus = (ErrorStatus) BV8.A0o(parcel, ErrorStatus.CREATOR);
                    C7384Etj.A0Y(errorStatus, 0);
                    this.A00.setException(DWk.A00(errorStatus));
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IGetChangesTokenCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public GetChangesTokenCallback(SettableFuture<C9189Fzw> settableFuture) {
        this();
        this.A00 = settableFuture;
    }

    public GetChangesTokenCallback() {
        attachInterface(this, "androidx.health.platform.client.service.IGetChangesTokenCallback");
    }
}
