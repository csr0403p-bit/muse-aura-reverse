package android.support.v4.media.session;

import X.AnonymousClass001;
import X.C10638I0i;
import X.C60O;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@Deprecated
/* loaded from: classes6.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C10638I0i(4);
    public final long A00;
    public final MediaDescriptionCompat A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MediaSession.QueueItem {Description=");
        sbA0x.append(this.A01);
        sbA0x.append(", Id=");
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v(" }", sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeLong(this.A00);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.A01 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readLong();
    }
}
