package com.google.android.gms.identitycredentials;

import X.AbstractC4100CmU;
import X.AnonymousClass005;
import X.C4158CoD;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes5.dex */
public final class GetCredentialRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = C4158CoD.A03(61);
    public final Bundle A00;
    public final ResultReceiver A01;
    public final String A02;
    public final List<CredentialOption> A03;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lcom/google/android/gms/identitycredentials/CredentialOption;>;Landroid/os/Bundle;Ljava/lang/String;Landroid/os/ResultReceiver;)V */
    public GetCredentialRequest(Bundle bundle, ResultReceiver resultReceiver, String str, List list) {
        AnonymousClass005.A0y(list, bundle, resultReceiver);
        this.A03 = list;
        this.A00 = bundle;
        this.A02 = str;
        this.A01 = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA01 = AbstractSafeParcelable.A01(parcel);
        AbstractC4100CmU.A0C(parcel, this.A03, 1);
        AbstractC4100CmU.A02(this.A00, parcel, 2);
        AbstractC4100CmU.A0A(parcel, this.A02, 3);
        AbstractC4100CmU.A09(parcel, this.A01, 4, i);
        AbstractC4100CmU.A05(parcel, iA01);
    }
}
