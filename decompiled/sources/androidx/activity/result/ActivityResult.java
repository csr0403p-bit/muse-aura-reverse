package androidx.activity.result;

import X.C10638I0i;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new C10638I0i(10);
    public final int A00;
    public final Intent A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7384Etj.A0Y(parcel, 0);
        parcel.writeInt(this.A00);
        Intent intent = this.A01;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ActivityResult{resultCode=");
        int i = this.A00;
        sbA0x.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sbA0x.append(", data=");
        sbA0x.append(this.A01);
        return C8j3.A15(sbA0x);
    }

    public ActivityResult(int i, Intent intent) {
        this.A00 = i;
        this.A01 = intent;
    }
}
