package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;

/* loaded from: classes2.dex */
public final class HatchVoiceReadinessRecord extends C06G {
    public final String assetId;
    public final String avatarImagePath;
    public final long avatarImageUpdatedMs;
    public final String avatarStillPath;
    public final String avatarStillSha1;
    public final int cropBottom;
    public final int cropTop;
    public final boolean embodimentCompatible;
    public final boolean fullFrame;
    public final String gatewayUrl;
    public final String idleVideoUri;
    public final Float referenceCropSize;
    public final Float referenceCropX;
    public final Float referenceCropY;
    public final Boolean referenceFromOriginal;
    public final String referenceImageUri;
    public final String selectionKind;
    public final String sourceSha1;
    public final String vmId;

    public final HatchVoiceReadinessRecord copy(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str4, str5);
        C7384Etj.A0Y(str6, 7);
        return new HatchVoiceReadinessRecord(str, str2, str3, j, str4, str5, z, str6, i, i2, str7, str8, str9, f, f2, f3, z2, str10, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchVoiceReadinessRecord) {
                HatchVoiceReadinessRecord hatchVoiceReadinessRecord = (HatchVoiceReadinessRecord) obj;
                if (!C7384Etj.areEqual(this.gatewayUrl, hatchVoiceReadinessRecord.gatewayUrl) || !C7384Etj.areEqual(this.vmId, hatchVoiceReadinessRecord.vmId) || !C7384Etj.areEqual(this.avatarImagePath, hatchVoiceReadinessRecord.avatarImagePath) || this.avatarImageUpdatedMs != hatchVoiceReadinessRecord.avatarImageUpdatedMs || !C7384Etj.areEqual(this.avatarStillPath, hatchVoiceReadinessRecord.avatarStillPath) || !C7384Etj.areEqual(this.selectionKind, hatchVoiceReadinessRecord.selectionKind) || this.fullFrame != hatchVoiceReadinessRecord.fullFrame || !C7384Etj.areEqual(this.assetId, hatchVoiceReadinessRecord.assetId) || this.cropTop != hatchVoiceReadinessRecord.cropTop || this.cropBottom != hatchVoiceReadinessRecord.cropBottom || !C7384Etj.areEqual(this.sourceSha1, hatchVoiceReadinessRecord.sourceSha1) || !C7384Etj.areEqual(this.idleVideoUri, hatchVoiceReadinessRecord.idleVideoUri) || !C7384Etj.areEqual(this.referenceImageUri, hatchVoiceReadinessRecord.referenceImageUri) || !C7384Etj.areEqual(this.referenceCropX, hatchVoiceReadinessRecord.referenceCropX) || !C7384Etj.areEqual(this.referenceCropY, hatchVoiceReadinessRecord.referenceCropY) || !C7384Etj.areEqual(this.referenceCropSize, hatchVoiceReadinessRecord.referenceCropSize) || this.embodimentCompatible != hatchVoiceReadinessRecord.embodimentCompatible || !C7384Etj.areEqual(this.avatarStillSha1, hatchVoiceReadinessRecord.avatarStillSha1) || !C7384Etj.areEqual(this.referenceFromOriginal, hatchVoiceReadinessRecord.referenceFromOriginal)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean provesSameConfigAs(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
        C7384Etj.A0Y(hatchVoiceReadinessRecord, 0);
        return C7384Etj.areEqual(copy$default(this, null, null, null, 0L, hatchVoiceReadinessRecord.avatarStillPath, null, false, null, 0, 0, null, hatchVoiceReadinessRecord.idleVideoUri, hatchVoiceReadinessRecord.referenceImageUri, hatchVoiceReadinessRecord.referenceCropX, hatchVoiceReadinessRecord.referenceCropY, hatchVoiceReadinessRecord.referenceCropSize, false, hatchVoiceReadinessRecord.avatarStillSha1, hatchVoiceReadinessRecord.referenceFromOriginal, 67567, null), hatchVoiceReadinessRecord);
    }

    public final HatchVoiceVideoConfigStore.Snapshot toSnapshot$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(String str) {
        C7384Etj.A0Y(str, 0);
        String str2 = this.selectionKind;
        String str3 = this.assetId;
        String str4 = this.sourceSha1;
        String str5 = this.idleVideoUri;
        HatchAvatarSelection hatchAvatarSelection = new HatchAvatarSelection(str2, new HatchAvatarReference(str3, this.referenceCropX, this.referenceCropY, this.referenceCropSize, str4, this.referenceImageUri, str5, this.embodimentCompatible), this.fullFrame);
        Boolean boolMadeFromOriginal = this.referenceFromOriginal;
        if (boolMadeFromOriginal == null) {
            String str6 = this.sourceSha1;
            String str7 = this.avatarStillSha1;
            if (str7 == null) {
                str7 = str6;
            }
            boolMadeFromOriginal = HatchAvatarReferenceImageProviderKt.madeFromOriginal(str6, str7);
        }
        return new HatchVoiceVideoConfigStore.Snapshot(new PreparedHatchAvatar(str, hatchAvatarSelection, boolMadeFromOriginal), C3cG.A0r(this.gatewayUrl, this.vmId), new HatchAiIdentityHandler.AvatarImageKey(this.avatarImagePath, this.avatarImageUpdatedMs), null);
    }

    public /* synthetic */ HatchVoiceReadinessRecord(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, int i3, C06H c06h) {
        this(str, str2, str3, j, str4, str5, z, str6, i, i2, str7, str8, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? null : f, (i3 & 16384) != 0 ? null : f2, (32768 & i3) != 0 ? null : f3, (65536 & i3) != 0 ? true : z2, (131072 & i3) != 0 ? null : str10, (i3 & 262144) != 0 ? null : bool);
    }

    public final String component1() {
        return this.gatewayUrl;
    }

    public final int component10() {
        return this.cropBottom;
    }

    public final String component11() {
        return this.sourceSha1;
    }

    public final String component12() {
        return this.idleVideoUri;
    }

    public final String component13() {
        return this.referenceImageUri;
    }

    public final Float component14() {
        return this.referenceCropX;
    }

    public final Float component15() {
        return this.referenceCropY;
    }

    public final Float component16() {
        return this.referenceCropSize;
    }

    public final boolean component17() {
        return this.embodimentCompatible;
    }

    public final String component18() {
        return this.avatarStillSha1;
    }

    public final Boolean component19() {
        return this.referenceFromOriginal;
    }

    public final String component2() {
        return this.vmId;
    }

    public final String component3() {
        return this.avatarImagePath;
    }

    public final long component4() {
        return this.avatarImageUpdatedMs;
    }

    public final String component5() {
        return this.avatarStillPath;
    }

    public final String component6() {
        return this.selectionKind;
    }

    public final boolean component7() {
        return this.fullFrame;
    }

    public final String component8() {
        return this.assetId;
    }

    public final int component9() {
        return this.cropTop;
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getAvatarImagePath() {
        return this.avatarImagePath;
    }

    public final long getAvatarImageUpdatedMs() {
        return this.avatarImageUpdatedMs;
    }

    public final String getAvatarStillPath() {
        return this.avatarStillPath;
    }

    public final String getAvatarStillSha1() {
        return this.avatarStillSha1;
    }

    public final int getCropBottom() {
        return this.cropBottom;
    }

    public final int getCropTop() {
        return this.cropTop;
    }

    public final boolean getEmbodimentCompatible() {
        return this.embodimentCompatible;
    }

    public final boolean getFullFrame() {
        return this.fullFrame;
    }

    public final String getGatewayUrl() {
        return this.gatewayUrl;
    }

    public final String getIdleVideoUri() {
        return this.idleVideoUri;
    }

    public final Float getReferenceCropSize() {
        return this.referenceCropSize;
    }

    public final Float getReferenceCropX() {
        return this.referenceCropX;
    }

    public final Float getReferenceCropY() {
        return this.referenceCropY;
    }

    public final Boolean getReferenceFromOriginal() {
        return this.referenceFromOriginal;
    }

    public final String getReferenceImageUri() {
        return this.referenceImageUri;
    }

    public final String getSelectionKind() {
        return this.selectionKind;
    }

    public final String getSourceSha1() {
        return this.sourceSha1;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return ((C0KA.A01((((((((((((((((AnonymousClass005.A0I(this.assetId, C0KA.A01(AnonymousClass005.A0I(this.selectionKind, AnonymousClass005.A0I(this.avatarStillPath, AnonymousClass006.A05(this.avatarImageUpdatedMs, (((AnonymousClass001.A0G(this.gatewayUrl) + AnonymousClass006.A0G(this.vmId)) * 31) + AnonymousClass006.A0G(this.avatarImagePath)) * 31) * 31)), this.fullFrame)) + this.cropTop) * 31) + this.cropBottom) * 31) + AnonymousClass006.A0G(this.sourceSha1)) * 31) + AnonymousClass006.A0G(this.idleVideoUri)) * 31) + AnonymousClass006.A0G(this.referenceImageUri)) * 31) + AnonymousClass006.A0D(this.referenceCropX)) * 31) + AnonymousClass006.A0D(this.referenceCropY)) * 31) + AnonymousClass006.A0D(this.referenceCropSize)) * 31, this.embodimentCompatible) + AnonymousClass006.A0G(this.avatarStillSha1)) * 31) + C3cH.A02(this.referenceFromOriginal);
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ HatchVoiceReadinessRecord copy$default(HatchVoiceReadinessRecord hatchVoiceReadinessRecord, String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool, int i3, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        long j2 = j;
        String str14 = str4;
        String str15 = str5;
        boolean z3 = z;
        String str16 = str6;
        int i4 = i;
        int i5 = i2;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        Float f4 = f;
        Float f5 = f2;
        Float f6 = f3;
        boolean z4 = z2;
        String str20 = str10;
        Boolean bool2 = bool;
        if ((i3 & 1) != 0) {
            str11 = hatchVoiceReadinessRecord.gatewayUrl;
        }
        if ((i3 & 2) != 0) {
            str12 = hatchVoiceReadinessRecord.vmId;
        }
        if ((i3 & 4) != 0) {
            str13 = hatchVoiceReadinessRecord.avatarImagePath;
        }
        if ((i3 & 8) != 0) {
            j2 = hatchVoiceReadinessRecord.avatarImageUpdatedMs;
        }
        if ((i3 & 16) != 0) {
            str14 = hatchVoiceReadinessRecord.avatarStillPath;
        }
        if ((i3 & 32) != 0) {
            str15 = hatchVoiceReadinessRecord.selectionKind;
        }
        if ((i3 & 64) != 0) {
            z3 = hatchVoiceReadinessRecord.fullFrame;
        }
        if ((i3 & 128) != 0) {
            str16 = hatchVoiceReadinessRecord.assetId;
        }
        if ((i3 & 256) != 0) {
            i4 = hatchVoiceReadinessRecord.cropTop;
        }
        if ((i3 & 512) != 0) {
            i5 = hatchVoiceReadinessRecord.cropBottom;
        }
        if ((i3 & 1024) != 0) {
            str17 = hatchVoiceReadinessRecord.sourceSha1;
        }
        if ((i3 & 2048) != 0) {
            str18 = hatchVoiceReadinessRecord.idleVideoUri;
        }
        if ((i3 & 4096) != 0) {
            str19 = hatchVoiceReadinessRecord.referenceImageUri;
        }
        if ((i3 & 8192) != 0) {
            f4 = hatchVoiceReadinessRecord.referenceCropX;
        }
        if ((i3 & 16384) != 0) {
            f5 = hatchVoiceReadinessRecord.referenceCropY;
        }
        if ((i3 & 32768) != 0) {
            f6 = hatchVoiceReadinessRecord.referenceCropSize;
        }
        if ((i3 & 65536) != 0) {
            z4 = hatchVoiceReadinessRecord.embodimentCompatible;
        }
        if ((i3 & 131072) != 0) {
            str20 = hatchVoiceReadinessRecord.avatarStillSha1;
        }
        if ((i3 & 262144) != 0) {
            bool2 = hatchVoiceReadinessRecord.referenceFromOriginal;
        }
        boolean z5 = z3;
        String str21 = str16;
        return hatchVoiceReadinessRecord.copy(str11, str12, str13, j2, str14, str15, z5, str21, i4, i5, str17, str18, str19, f4, f5, f6, z4, str20, bool2);
    }

    public HatchVoiceReadinessRecord(String str, String str2, String str3, long j, String str4, String str5, boolean z, String str6, int i, int i2, String str7, String str8, String str9, Float f, Float f2, Float f3, boolean z2, String str10, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0y(str4, str5);
        C7384Etj.A0Y(str6, 7);
        this.gatewayUrl = str;
        this.vmId = str2;
        this.avatarImagePath = str3;
        this.avatarImageUpdatedMs = j;
        this.avatarStillPath = str4;
        this.selectionKind = str5;
        this.fullFrame = z;
        this.assetId = str6;
        this.cropTop = i;
        this.cropBottom = i2;
        this.sourceSha1 = str7;
        this.idleVideoUri = str8;
        this.referenceImageUri = str9;
        this.referenceCropX = f;
        this.referenceCropY = f2;
        this.referenceCropSize = f3;
        this.embodimentCompatible = z2;
        this.avatarStillSha1 = str10;
        this.referenceFromOriginal = bool;
    }
}
