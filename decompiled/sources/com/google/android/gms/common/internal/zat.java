package com.google.android.gms.common.internal;

import X.AbstractC4100CmU;
import X.C4158CoD;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes5.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = C4158CoD.A03(27);
    public final int A00;
    public final int A01;
    public final Account A02;
    public final GoogleSignInAccount A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA02 = AbstractSafeParcelable.A02(parcel, this.A00);
        AbstractC4100CmU.A09(parcel, this.A02, 2, i);
        AbstractC4100CmU.A06(parcel, 3, this.A01);
        AbstractC4100CmU.A09(parcel, this.A03, 4, i);
        AbstractC4100CmU.A05(parcel, iA02);
    }

    public zat(Account account, GoogleSignInAccount googleSignInAccount, int i, int i2) {
        this.A00 = i;
        this.A02 = account;
        this.A01 = i2;
        this.A03 = googleSignInAccount;
    }
}
