package android.support.v4.media.session;

import X.BV4;
import X.BV7;
import X.C10638I0i;
import X.C60O;
import X.C8852FrD;
import X.C8j3;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

@Deprecated
/* loaded from: classes6.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C10638I0i(8);
    public PlaybackState A00;
    public List<CustomAction> A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final Bundle A0A;
    public final CharSequence A0B;

    @Deprecated
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C10638I0i(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sbA0x = C60O.A0x("Action:mName='");
            sbA0x.append((Object) this.A02);
            sbA0x.append(", mIcon=");
            sbA0x.append(this.A00);
            sbA0x.append(", mExtras=");
            return C8j3.A14(this.A01, sbA0x);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = parcel.readBundle(C8852FrD.class.getClassLoader());
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlaybackState {state=");
        sbA0x.append(this.A04);
        sbA0x.append(", position=");
        sbA0x.append(this.A08);
        sbA0x.append(", buffered position=");
        sbA0x.append(this.A07);
        sbA0x.append(", speed=");
        sbA0x.append(this.A02);
        sbA0x.append(", updated=");
        sbA0x.append(this.A09);
        sbA0x.append(", actions=");
        sbA0x.append(this.A05);
        sbA0x.append(", error code=");
        sbA0x.append(this.A03);
        sbA0x.append(", error message=");
        sbA0x.append(this.A0B);
        sbA0x.append(", custom actions=");
        sbA0x.append(this.A01);
        sbA0x.append(", active item id=");
        sbA0x.append(this.A06);
        return BV7.A11(sbA0x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A08);
        parcel.writeFloat(this.A02);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A05);
        TextUtils.writeToParcel(this.A0B, parcel, i);
        parcel.writeTypedList(this.A01);
        parcel.writeLong(this.A06);
        parcel.writeBundle(this.A0A);
        parcel.writeInt(this.A03);
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A04 = parcel.readInt();
        this.A08 = parcel.readLong();
        this.A02 = parcel.readFloat();
        this.A09 = parcel.readLong();
        this.A07 = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A0B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A01 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A06 = parcel.readLong();
        this.A0A = parcel.readBundle(C8852FrD.class.getClassLoader());
        this.A03 = parcel.readInt();
    }

    /* JADX WARN: Incorrect types in method signature: (IJJFJILjava/lang/CharSequence;JLjava/util/List<Landroid/support/v4/media/session/PlaybackStateCompat$CustomAction;>;JLandroid/os/Bundle;)V */
    public PlaybackStateCompat(Bundle bundle, CharSequence charSequence, List list, float f, int i, int i2, long j, long j2, long j3, long j4, long j5) {
        this.A04 = i;
        this.A08 = j;
        this.A07 = j2;
        this.A02 = f;
        this.A05 = j3;
        this.A03 = i2;
        this.A0B = charSequence;
        this.A09 = j4;
        this.A01 = BV4.A0t(list);
        this.A06 = j5;
        this.A0A = bundle;
    }
}
