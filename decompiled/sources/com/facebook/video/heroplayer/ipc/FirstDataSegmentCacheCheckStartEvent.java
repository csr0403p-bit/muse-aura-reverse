package com.facebook.video.heroplayer.ipc;

import X.BYP;
import X.C7580F4t;
import X.DER;
import X.FGI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class FirstDataSegmentCacheCheckStartEvent extends BYP implements Parcelable {
    public static final Parcelable.Creator<FirstDataSegmentCacheCheckStartEvent> CREATOR = new C7580F4t(22);
    public final long playerId;
    public final long requestLength;
    public final long startPos;
    public final int streamType;
    public final String videoId;

    public FirstDataSegmentCacheCheckStartEvent(Parcel parcel) {
        super(DER.A07);
        String string = parcel.readString();
        this.videoId = string == null ? "" : string;
        this.playerId = parcel.readLong();
        this.streamType = parcel.readInt();
        this.startPos = parcel.readLong();
        this.requestLength = parcel.readLong();
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
        parcel.writeLong(this.startPos);
        parcel.writeLong(this.requestLength);
    }

    public final String toString() {
        return FGI.A0h(FGI.A0M("videoId=", this.videoId), FGI.A0B(this.playerId, ", playerId="), FGI.A0H(", streamType=", this.streamType), FGI.A0B(this.startPos, ", startPos="), FGI.A0B(this.requestLength, ", requestLength="));
    }

    public FirstDataSegmentCacheCheckStartEvent(String str, int i, long j, long j2, long j3) {
        super(DER.A07);
        this.videoId = str;
        this.playerId = j;
        this.streamType = i;
        this.startPos = j2;
        this.requestLength = j3;
    }
}
