package android.support.v4.media;

import X.BV4;
import X.C10638I0i;
import X.C8852FrD;
import X.DQd;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes6.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final DQd<String, Integer> A02;
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public MediaMetadata A00;
    public final Bundle A01;

    static {
        DQd<String, Integer> dQd = new DQd<>(0);
        A02 = dQd;
        Integer numA0W = BV4.A0W();
        dQd.put("android.media.metadata.TITLE", numA0W);
        dQd.put("android.media.metadata.ARTIST", numA0W);
        dQd.put("android.media.metadata.DURATION", 0);
        dQd.put("android.media.metadata.ALBUM", numA0W);
        dQd.put("android.media.metadata.AUTHOR", numA0W);
        dQd.put("android.media.metadata.WRITER", numA0W);
        dQd.put("android.media.metadata.COMPOSER", numA0W);
        dQd.put("android.media.metadata.COMPILATION", numA0W);
        dQd.put("android.media.metadata.DATE", numA0W);
        dQd.put("android.media.metadata.YEAR", 0);
        dQd.put("android.media.metadata.GENRE", numA0W);
        dQd.put("android.media.metadata.TRACK_NUMBER", 0);
        dQd.put("android.media.metadata.NUM_TRACKS", 0);
        dQd.put("android.media.metadata.DISC_NUMBER", 0);
        dQd.put("android.media.metadata.ALBUM_ARTIST", numA0W);
        Integer numA0X = BV4.A0X();
        dQd.put("android.media.metadata.ART", numA0X);
        dQd.put("android.media.metadata.ART_URI", numA0W);
        dQd.put("android.media.metadata.ALBUM_ART", numA0X);
        dQd.put("android.media.metadata.ALBUM_ART_URI", numA0W);
        Integer numA0Y = BV4.A0Y();
        dQd.put("android.media.metadata.USER_RATING", numA0Y);
        dQd.put("android.media.metadata.RATING", numA0Y);
        dQd.put("android.media.metadata.DISPLAY_TITLE", numA0W);
        dQd.put("android.media.metadata.DISPLAY_SUBTITLE", numA0W);
        dQd.put("android.media.metadata.DISPLAY_DESCRIPTION", numA0W);
        dQd.put("android.media.metadata.DISPLAY_ICON", numA0X);
        dQd.put("android.media.metadata.DISPLAY_ICON_URI", numA0W);
        dQd.put("android.media.metadata.MEDIA_ID", numA0W);
        dQd.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        dQd.put("android.media.metadata.MEDIA_URI", numA0W);
        dQd.put("android.media.metadata.ADVERTISEMENT", 0);
        dQd.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C10638I0i(2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A01);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.A01 = parcel.readBundle(C8852FrD.class.getClassLoader());
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.A01 = bundle2;
        C8852FrD.A00(bundle2);
    }
}
