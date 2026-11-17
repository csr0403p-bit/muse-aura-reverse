package com.facebook.video.heroplayer.ipc;

import X.AbstractC7606F5t;
import X.BYP;
import X.C7580F4t;
import X.DEK;
import X.DER;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class FirstDataSegmentCacheCheckEndEvent extends BYP implements Parcelable {
    public static final Parcelable.Creator<FirstDataSegmentCacheCheckEndEvent> CREATOR = new C7580F4t(21);
    public final DEK cacheType;
    public final long playerId;
    public final long readByteLength;
    public final long requestLength;
    public final long startPos;
    public final int streamType;
    public final String videoId;

    public FirstDataSegmentCacheCheckEndEvent(Parcel parcel) {
        super(DER.A06);
        String string = parcel.readString();
        this.videoId = string == null ? "" : string;
        this.playerId = parcel.readLong();
        this.streamType = parcel.readInt();
        DEK dek = (DEK) parcel.readValue(DEK.class.getClassLoader());
        this.cacheType = dek == null ? DEK.NOT_APPLY : dek;
        this.startPos = parcel.readLong();
        this.requestLength = parcel.readLong();
        this.readByteLength = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.videoId);
        parcel.writeLong(this.playerId);
        parcel.writeInt(this.streamType);
        parcel.writeValue(this.cacheType);
        parcel.writeLong(this.startPos);
        parcel.writeLong(this.requestLength);
        parcel.writeLong(this.readByteLength);
    }

    public final String toString() {
        return FGI.A0k(FGI.A0M("videoId=", this.videoId), FGI.A0B(this.playerId, ", playerId="), FGI.A0H(", streamType=", this.streamType), FGI.A0M(AbstractC7606F5t.A00(15), this.cacheType.mName), FGI.A0B(this.startPos, ", startPos="), FGI.A0B(this.requestLength, ", requestLength="), FGI.A0B(this.readByteLength, ", readByteLength="));
    }

    public FirstDataSegmentCacheCheckEndEvent(DEK dek, String str, int i, long j, long j2, long j3, long j4) {
        super(DER.A06);
        this.videoId = str;
        this.playerId = j;
        this.streamType = i;
        this.cacheType = dek;
        this.startPos = j2;
        this.requestLength = j3;
        this.readByteLength = j4;
    }
}
