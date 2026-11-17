package X;

import java.io.Serializable;

/* renamed from: X.DoI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5723DoI implements Serializable {
    public static final long serialVersionUID = 3167503204689356560L;
    public final int audioChannels;
    public final int audioSamplingRate;
    public final int bitrate;
    public final String codecs;
    public final String containerMimeType;
    public final boolean fbAvoidOnABRForIntentionalView;
    public final boolean fbAvoidOnABRForUnintentionalView;
    public final boolean fbAvoidOnCellularDataSaverForIntentionalView;
    public final boolean fbAvoidOnCellularDataSaverForUnintentionalView;
    public final boolean fbAvoidOnCellularForIntentionalView;
    public final boolean fbAvoidOnCellularForUnintentionalView;
    public final String fbEncodingTag;
    public final boolean fbIsDefaultFormat;
    public final boolean fbIsHvqLandscape;
    public final boolean fbIsHvqPortrait;
    public final boolean fbIsProtectedContent;
    public final int fbMaxBandwidth;
    public final String fbPlaybackResolutionCsvqm;
    public final String fbPlaybackResolutionMos;
    public final String fbPlaybackResolutionMosConfidence;
    public final String fbQualityLabel;
    public final String fbUnifiedUploadResolutionMos;
    public final String fbVariantKey;
    public final float frameRate;
    public final int height;
    public final String id;
    public final String language;
    public final String mimeType;
    public final int roleFlag;
    public final int width;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                String str = ((C5723DoI) obj).id;
                String str2 = this.id;
                if (str == null) {
                    if (str2 == null) {
                    }
                } else if (str2 != null && str == str2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.id.hashCode();
    }

    public C5723DoI(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.id = str == null ? "" : str;
        this.mimeType = str2 == null ? "" : str2;
        this.width = i;
        this.height = i2;
        this.frameRate = f;
        this.audioChannels = i3;
        this.audioSamplingRate = i4;
        this.bitrate = i5;
        this.language = str3;
        this.codecs = str4;
        this.fbQualityLabel = str5;
        this.fbPlaybackResolutionMos = str6;
        this.fbPlaybackResolutionMosConfidence = str7;
        this.fbPlaybackResolutionCsvqm = str8;
        this.fbUnifiedUploadResolutionMos = str9;
        this.fbEncodingTag = str10;
        this.fbIsHvqLandscape = z;
        this.fbIsHvqPortrait = z2;
        this.fbAvoidOnCellularForUnintentionalView = z3;
        this.fbAvoidOnCellularForIntentionalView = z4;
        this.fbAvoidOnCellularDataSaverForUnintentionalView = z6;
        this.fbAvoidOnCellularDataSaverForIntentionalView = z5;
        this.fbAvoidOnABRForUnintentionalView = z7;
        this.fbAvoidOnABRForIntentionalView = z8;
        this.fbIsProtectedContent = z9;
        this.fbIsDefaultFormat = z10;
        this.fbMaxBandwidth = i6;
        this.containerMimeType = str11 != null ? str11 : "";
        this.roleFlag = i7;
        this.fbVariantKey = str12;
    }
}
