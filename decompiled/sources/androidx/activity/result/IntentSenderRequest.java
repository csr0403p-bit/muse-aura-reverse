package androidx.activity.result;

import X.C10638I0i;
import X.C7384Etj;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C10638I0i(11);
    public final int A00;
    public final int A01;
    public final Intent A02;
    public final IntentSender A03;

    public IntentSenderRequest(Intent intent, IntentSender intentSender, int i, int i2) {
        C7384Etj.A0Y(intentSender, 0);
        this.A03 = intentSender;
        this.A02 = intent;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
