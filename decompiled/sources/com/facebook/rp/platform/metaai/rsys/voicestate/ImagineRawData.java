package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public final class ImagineRawData extends C06G {

    @SerializedName("avatar_motion_type")
    public final String avatarMotionType;

    @SerializedName("background_motion_type")
    public final String backgroundMotionType;

    @SerializedName("insertion_index")
    public final String insertionIndex;

    @SerializedName("media_type")
    public final String mediaType;

    @SerializedName("prompt")
    public final String prompt;

    @SerializedName("request_id")
    public final String requestId;

    @SerializedName("response_id")
    public final String responseId;

    @SerializedName("serialized_blob")
    public final String serializedBlob;

    @SerializedName("temporary_handle")
    public final String temporaryHandle;

    @SerializedName("uri")
    public final String uri;

    public static /* synthetic */ ImagineRawData copy$default(ImagineRawData imagineRawData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        if ((i & 1) != 0) {
            str11 = imagineRawData.mediaType;
        }
        if ((i & 2) != 0) {
            str12 = imagineRawData.prompt;
        }
        if ((i & 4) != 0) {
            str13 = imagineRawData.uri;
        }
        if ((i & 8) != 0) {
            str14 = imagineRawData.temporaryHandle;
        }
        if ((i & 16) != 0) {
            str15 = imagineRawData.requestId;
        }
        if ((i & 32) != 0) {
            str16 = imagineRawData.responseId;
        }
        if ((i & 64) != 0) {
            str17 = imagineRawData.insertionIndex;
        }
        if ((i & 128) != 0) {
            str18 = imagineRawData.avatarMotionType;
        }
        if ((i & 256) != 0) {
            str19 = imagineRawData.backgroundMotionType;
        }
        if ((i & 512) != 0) {
            str20 = imagineRawData.serializedBlob;
        }
        return new ImagineRawData(str11, str12, str13, str14, str15, str16, str17, str18, str19, str20);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImagineRawData) {
                ImagineRawData imagineRawData = (ImagineRawData) obj;
                if (!C7384Etj.areEqual(this.mediaType, imagineRawData.mediaType) || !C7384Etj.areEqual(this.prompt, imagineRawData.prompt) || !C7384Etj.areEqual(this.uri, imagineRawData.uri) || !C7384Etj.areEqual(this.temporaryHandle, imagineRawData.temporaryHandle) || !C7384Etj.areEqual(this.requestId, imagineRawData.requestId) || !C7384Etj.areEqual(this.responseId, imagineRawData.responseId) || !C7384Etj.areEqual(this.insertionIndex, imagineRawData.insertionIndex) || !C7384Etj.areEqual(this.avatarMotionType, imagineRawData.avatarMotionType) || !C7384Etj.areEqual(this.backgroundMotionType, imagineRawData.backgroundMotionType) || !C7384Etj.areEqual(this.serializedBlob, imagineRawData.serializedBlob)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.mediaType;
    }

    public final String component10() {
        return this.serializedBlob;
    }

    public final String component2() {
        return this.prompt;
    }

    public final String component3() {
        return this.uri;
    }

    public final String component4() {
        return this.temporaryHandle;
    }

    public final String component5() {
        return this.requestId;
    }

    public final String component6() {
        return this.responseId;
    }

    public final String component7() {
        return this.insertionIndex;
    }

    public final String component8() {
        return this.avatarMotionType;
    }

    public final String component9() {
        return this.backgroundMotionType;
    }

    public final ImagineRawData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new ImagineRawData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public final String getAvatarMotionType() {
        return this.avatarMotionType;
    }

    public final String getBackgroundMotionType() {
        return this.backgroundMotionType;
    }

    public final String getInsertionIndex() {
        return this.insertionIndex;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getResponseId() {
        return this.responseId;
    }

    public final String getSerializedBlob() {
        return this.serializedBlob;
    }

    public final String getTemporaryHandle() {
        return this.temporaryHandle;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((((((((((((((((AnonymousClass006.A0G(this.mediaType) * 31) + AnonymousClass006.A0G(this.prompt)) * 31) + AnonymousClass006.A0G(this.uri)) * 31) + AnonymousClass006.A0G(this.temporaryHandle)) * 31) + AnonymousClass006.A0G(this.requestId)) * 31) + AnonymousClass006.A0G(this.responseId)) * 31) + AnonymousClass006.A0G(this.insertionIndex)) * 31) + AnonymousClass006.A0G(this.avatarMotionType)) * 31) + AnonymousClass006.A0G(this.backgroundMotionType)) * 31) + AnonymousClass005.A0H(this.serializedBlob);
    }

    public String toString() {
        String str = this.mediaType;
        String str2 = this.prompt;
        String str3 = this.uri;
        String str4 = this.temporaryHandle;
        String str5 = this.requestId;
        String str6 = this.responseId;
        String str7 = this.insertionIndex;
        String str8 = this.avatarMotionType;
        String str9 = this.backgroundMotionType;
        String str10 = this.serializedBlob;
        StringBuilder sbA0x = C3cI.A0x("ImagineRawData(mediaType=", str);
        sbA0x.append(", prompt=");
        sbA0x.append(str2);
        sbA0x.append(", uri=");
        sbA0x.append(str3);
        sbA0x.append(", temporaryHandle=");
        sbA0x.append(str4);
        sbA0x.append(", requestId=");
        sbA0x.append(str5);
        sbA0x.append(", responseId=");
        sbA0x.append(str6);
        sbA0x.append(", insertionIndex=");
        sbA0x.append(str7);
        sbA0x.append(", avatarMotionType=");
        sbA0x.append(str8);
        sbA0x.append(", backgroundMotionType=");
        sbA0x.append(str9);
        return C3cJ.A0N(", serializedBlob=", str10, sbA0x);
    }

    public ImagineRawData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.mediaType = str;
        this.prompt = str2;
        this.uri = str3;
        this.temporaryHandle = str4;
        this.requestId = str5;
        this.responseId = str6;
        this.insertionIndex = str7;
        this.avatarMotionType = str8;
        this.backgroundMotionType = str9;
        this.serializedBlob = str10;
    }
}
