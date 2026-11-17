package androidx.health.platform.client.impl;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.BV8;
import X.C7384Etj;
import X.C9180Fzn;
import X.DWk;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.service.IFilterGrantedPermissionsCallback;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class FilterGrantedPermissionsCallback extends Binder implements IFilterGrantedPermissionsCallback {
    public final SettableFuture<Set<C9180Fzn>> A00;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                if (i == 1) {
                    ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Permission.CREATOR);
                    C7384Etj.A0Y(arrayListCreateTypedArrayList, 0);
                    SettableFuture<Set<C9180Fzn>> settableFuture = this.A00;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListCreateTypedArrayList);
                    Iterator it = arrayListCreateTypedArrayList.iterator();
                    while (it.hasNext()) {
                        arrayListA0i.add(((Permission) it.next()).A00);
                    }
                    settableFuture.set(AbstractC0878AGe.A0g(arrayListA0i));
                    return true;
                }
                if (i == 2) {
                    ErrorStatus errorStatus = (ErrorStatus) BV8.A0o(parcel, ErrorStatus.CREATOR);
                    C7384Etj.A0Y(errorStatus, 0);
                    this.A00.setException(DWk.A00(errorStatus));
                    return true;
                }
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
                return true;
            }
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }

    public FilterGrantedPermissionsCallback(SettableFuture<Set<C9180Fzn>> settableFuture) {
        this();
        this.A00 = settableFuture;
    }

    public FilterGrantedPermissionsCallback() {
        attachInterface(this, "androidx.health.platform.client.service.IFilterGrantedPermissionsCallback");
    }
}
