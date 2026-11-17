package com.google.android.gms.internal.identity_credentials;

import X.AbstractC4119CnD;
import X.BV4;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C4249CrM;
import X.C60P;
import X.C7384Etj;
import X.C8j3;
import X.CSE;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearCreationOptionsResponse;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.identitycredentials.ClearExportResponse;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.CredentialTransferCapabilities;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;
import com.google.android.gms.identitycredentials.ImportCredentialsForDeviceSetupResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterCreationOptionsResponse;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$clearCredentialState$1$callback$1;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1;

/* loaded from: classes5.dex */
public abstract class zzb extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public static UnsupportedOperationException A00(Parcel parcel, Parcelable.Creator creator) {
        C4249CrM.A00(parcel, creator);
        A01(parcel);
        return new UnsupportedOperationException();
    }

    public static final void A01(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C60P.A1O("Parcel data not fully consumed, unread size: ", BV4.A0p(BV7.A03(iDataAvail) + 45), iDataAvail));
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        Object obj;
        CSE cse;
        if (i <= 16777215) {
            BV6.A0y(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        IIdentityCredentialCallbacks.Stub stub = (IIdentityCredentialCallbacks.Stub) this;
        switch (i) {
            case 1:
                status = (Status) BV8.A0V(parcel, Status.CREATOR);
                obj = (PendingGetCredentialHandle) BV8.A0V(parcel, PendingGetCredentialHandle.CREATOR);
                A01(parcel);
                if (!(stub instanceof InternalIdentityCredentialClient$getCredential$1$callback$1)) {
                    throw C8j3.A17();
                }
                C7384Etj.A0Y(status, 0);
                cse = ((InternalIdentityCredentialClient$getCredential$1$callback$1) stub).A00;
                break;
            case 2:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, RegistrationResponse.CREATOR);
            case 3:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, ClearRegistryResponse.CREATOR);
            case 4:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, PendingImportCredentialsHandle.CREATOR);
            case 5:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, RegisterExportResponse.CREATOR);
            case 6:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, CreateCredentialResponse.CREATOR);
            case 7:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, CreateCredentialHandle.CREATOR);
            case 8:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, RegisterCreationOptionsResponse.CREATOR);
            case 9:
                status = (Status) BV8.A0V(parcel, Status.CREATOR);
                obj = (ClearCredentialStateResponse) BV8.A0V(parcel, ClearCredentialStateResponse.CREATOR);
                A01(parcel);
                if (!(stub instanceof InternalIdentityCredentialClient$clearCredentialState$1$callback$1)) {
                    throw C8j3.A17();
                }
                C7384Etj.A0Y(status, 0);
                cse = ((InternalIdentityCredentialClient$clearCredentialState$1$callback$1) stub).A00;
                break;
            case 10:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, SignalCredentialStateResponse.CREATOR);
            case 11:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, ClearExportResponse.CREATOR);
            case 12:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, ImportCredentialsForDeviceSetupResponse.CREATOR);
            case 13:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, ExportCredentialsToDeviceSetupResponse.CREATOR);
            case 14:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, CredentialTransferCapabilities.CREATOR);
            case 15:
                BV8.A0V(parcel, Status.CREATOR);
                throw A00(parcel, ClearCreationOptionsResponse.CREATOR);
            default:
                return false;
        }
        AbstractC4119CnD.A00(status, cse, obj);
        return true;
    }
}
