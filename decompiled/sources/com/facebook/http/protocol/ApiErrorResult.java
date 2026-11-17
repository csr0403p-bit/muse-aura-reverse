package com.facebook.http.protocol;

import X.BWo;
import X.C7580F4t;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class ApiErrorResult implements Parcelable, Serializable {
    public static final Parcelable.Creator<ApiErrorResult> CREATOR = new C7580F4t(18);
    public static final long serialVersionUID = 1;
    public final int mErrorCode;
    public final String mErrorData;
    public final BWo mErrorDomain;
    public final String mErrorMessage;
    public final int mErrorSubCode;
    public final String mErrorUserMessage;
    public final String mErrorUserTitle;
    public final String mFbRequestId;
    public final boolean mIsTransientDefaultValue;
    public final String mJsonResponse;
    public final String mSummary;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mErrorCode);
        parcel.writeInt(this.mErrorSubCode);
        parcel.writeString(this.mErrorMessage);
        parcel.writeString(this.mErrorData);
        parcel.writeString(this.mErrorUserTitle);
        parcel.writeString(this.mErrorUserMessage);
        parcel.writeString(this.mJsonResponse);
        parcel.writeString(this.mErrorDomain.toString());
        parcel.writeInt(this.mIsTransientDefaultValue ? 1 : 0);
        parcel.writeString(this.mFbRequestId);
        parcel.writeString(this.mSummary);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ApiErrorResult(android.os.Parcel r3) {
        /*
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.mErrorCode = r0
            int r0 = r3.readInt()
            r2.mErrorSubCode = r0
            java.lang.String r0 = r3.readString()
            r2.mErrorMessage = r0
            java.lang.String r0 = r3.readString()
            r2.mErrorData = r0
            java.lang.String r0 = r3.readString()
            r2.mErrorUserTitle = r0
            java.lang.String r0 = r3.readString()
            r2.mErrorUserMessage = r0
            java.lang.String r0 = r3.readString()
            r2.mJsonResponse = r0
            java.lang.Class<X.BWo> r1 = X.BWo.class
            java.lang.String r0 = r3.readString()
            java.lang.Enum r0 = java.lang.Enum.valueOf(r1, r0)
            X.BWo r0 = (X.BWo) r0
            r2.mErrorDomain = r0
            int r0 = r3.dataAvail()
            if (r0 <= 0) goto L57
            int r1 = r3.readInt()
            r0 = 1
            if (r1 != r0) goto L57
        L48:
            r2.mIsTransientDefaultValue = r0
            java.lang.String r0 = r3.readString()
            r2.mFbRequestId = r0
            java.lang.String r0 = r3.readString()
            r2.mSummary = r0
            return
        L57:
            r0 = 0
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.http.protocol.ApiErrorResult.<init>(android.os.Parcel):void");
    }

    public ApiErrorResult(BWo bWo, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        this.mErrorCode = i;
        this.mErrorSubCode = 0;
        this.mErrorMessage = str;
        this.mErrorData = str2;
        this.mErrorUserTitle = str3;
        this.mErrorUserMessage = str4;
        this.mErrorDomain = bWo;
        this.mJsonResponse = null;
        this.mIsTransientDefaultValue = z;
        this.mFbRequestId = str5;
        this.mSummary = str6;
    }
}
