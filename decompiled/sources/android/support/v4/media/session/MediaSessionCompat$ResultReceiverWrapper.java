package android.support.v4.media.session;

import X.C10638I0i;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* loaded from: classes6.dex */
public final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new C10638I0i(5);
    public ResultReceiver A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
    }
}
