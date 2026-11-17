package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.C7BY;

/* loaded from: classes.dex */
public final class NativeLoginAccountUiModel extends C06G {
    public static final int $stable = 0;
    public final HatchAccountStatus accountStatus;
    public final HatchDisclosurePresentation disclosurePresentation;
    public final String displayName;
    public final String fallbackGlyphPlatform;
    public final boolean hasHatch;
    public final boolean hasMetaAi;
    public final String id;
    public final boolean isF3;
    public final int linkedAccountCount;
    public final AHD<NativeLoginLinkedAccountUiModel> linkedAccounts;
    public final NativeLoginMuseProfileUiModel museProfile;
    public final boolean oneTapLoginEligible;
    public final String photoUrl;
    public final AHD<NativeLoginProfileUiModel> profiles;
    public final boolean showMuseTransparency;
    public final String sourceApp;
    public final String subtitle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginAccountUiModel) {
                NativeLoginAccountUiModel nativeLoginAccountUiModel = (NativeLoginAccountUiModel) obj;
                if (!C7384Etj.areEqual(this.id, nativeLoginAccountUiModel.id) || !C7384Etj.areEqual(this.displayName, nativeLoginAccountUiModel.displayName) || !C7384Etj.areEqual(this.subtitle, nativeLoginAccountUiModel.subtitle) || !C7384Etj.areEqual(this.photoUrl, nativeLoginAccountUiModel.photoUrl) || !C7384Etj.areEqual(this.linkedAccounts, nativeLoginAccountUiModel.linkedAccounts) || this.linkedAccountCount != nativeLoginAccountUiModel.linkedAccountCount || !C7384Etj.areEqual(this.profiles, nativeLoginAccountUiModel.profiles) || this.oneTapLoginEligible != nativeLoginAccountUiModel.oneTapLoginEligible || this.hasHatch != nativeLoginAccountUiModel.hasHatch || this.hasMetaAi != nativeLoginAccountUiModel.hasMetaAi || this.isF3 != nativeLoginAccountUiModel.isF3 || !C7384Etj.areEqual(this.sourceApp, nativeLoginAccountUiModel.sourceApp) || !C7384Etj.areEqual(this.fallbackGlyphPlatform, nativeLoginAccountUiModel.fallbackGlyphPlatform) || !C7384Etj.areEqual(this.museProfile, nativeLoginAccountUiModel.museProfile) || this.showMuseTransparency != nativeLoginAccountUiModel.showMuseTransparency || this.disclosurePresentation != nativeLoginAccountUiModel.disclosurePresentation || this.accountStatus != nativeLoginAccountUiModel.accountStatus) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ NativeLoginAccountUiModel(String str, String str2, String str3, String str4, AHD ahd, int i, AHD ahd2, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, HatchAccountStatus hatchAccountStatus, int i2, C06H c06h) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? AHI.A01 : ahd, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? AHI.A01 : ahd2, z, z2, z3, (i2 & 1024) != 0 ? false : z4, (i2 & 2048) != 0 ? null : str5, (i2 & 4096) != 0 ? null : str6, (i2 & 8192) != 0 ? null : nativeLoginMuseProfileUiModel, (i2 & 16384) != 0 ? false : z5, (32768 & i2) != 0 ? HatchDisclosurePresentation.INLINE : hatchDisclosurePresentation, (i2 & 65536) != 0 ? HatchAccountStatus.ACTIVE : hatchAccountStatus);
    }

    public static /* synthetic */ NativeLoginAccountUiModel copy$default(NativeLoginAccountUiModel nativeLoginAccountUiModel, String str, String str2, String str3, String str4, AHD ahd, int i, AHD ahd2, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, HatchAccountStatus hatchAccountStatus, int i2, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        AHD ahd3 = ahd;
        int i3 = i;
        AHD ahd4 = ahd2;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        boolean z9 = z4;
        String str11 = str5;
        String str12 = str6;
        NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel2 = nativeLoginMuseProfileUiModel;
        boolean z10 = z5;
        HatchDisclosurePresentation hatchDisclosurePresentation2 = hatchDisclosurePresentation;
        HatchAccountStatus hatchAccountStatus2 = hatchAccountStatus;
        if ((i2 & 1) != 0) {
            str7 = nativeLoginAccountUiModel.id;
        }
        if ((i2 & 2) != 0) {
            str8 = nativeLoginAccountUiModel.displayName;
        }
        if ((i2 & 4) != 0) {
            str9 = nativeLoginAccountUiModel.subtitle;
        }
        if ((i2 & 8) != 0) {
            str10 = nativeLoginAccountUiModel.photoUrl;
        }
        if ((i2 & 16) != 0) {
            ahd3 = nativeLoginAccountUiModel.linkedAccounts;
        }
        if ((i2 & 32) != 0) {
            i3 = nativeLoginAccountUiModel.linkedAccountCount;
        }
        if ((i2 & 64) != 0) {
            ahd4 = nativeLoginAccountUiModel.profiles;
        }
        if ((i2 & 128) != 0) {
            z6 = nativeLoginAccountUiModel.oneTapLoginEligible;
        }
        if ((i2 & 256) != 0) {
            z7 = nativeLoginAccountUiModel.hasHatch;
        }
        if ((i2 & 512) != 0) {
            z8 = nativeLoginAccountUiModel.hasMetaAi;
        }
        if ((i2 & 1024) != 0) {
            z9 = nativeLoginAccountUiModel.isF3;
        }
        if ((i2 & 2048) != 0) {
            str11 = nativeLoginAccountUiModel.sourceApp;
        }
        if ((i2 & 4096) != 0) {
            str12 = nativeLoginAccountUiModel.fallbackGlyphPlatform;
        }
        if ((i2 & 8192) != 0) {
            nativeLoginMuseProfileUiModel2 = nativeLoginAccountUiModel.museProfile;
        }
        if ((i2 & 16384) != 0) {
            z10 = nativeLoginAccountUiModel.showMuseTransparency;
        }
        if ((i2 & 32768) != 0) {
            hatchDisclosurePresentation2 = nativeLoginAccountUiModel.disclosurePresentation;
        }
        if ((i2 & 65536) != 0) {
            hatchAccountStatus2 = nativeLoginAccountUiModel.accountStatus;
        }
        AHD ahd5 = ahd3;
        return nativeLoginAccountUiModel.copy(str7, str8, str9, str10, ahd5, i3, ahd4, z6, z7, z8, z9, str11, str12, nativeLoginMuseProfileUiModel2, z10, hatchDisclosurePresentation2, hatchAccountStatus2);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.hasMetaAi;
    }

    public final boolean component11() {
        return this.isF3;
    }

    public final String component12() {
        return this.sourceApp;
    }

    public final String component13() {
        return this.fallbackGlyphPlatform;
    }

    public final NativeLoginMuseProfileUiModel component14() {
        return this.museProfile;
    }

    public final boolean component15() {
        return this.showMuseTransparency;
    }

    public final HatchDisclosurePresentation component16() {
        return this.disclosurePresentation;
    }

    public final HatchAccountStatus component17() {
        return this.accountStatus;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final String component4() {
        return this.photoUrl;
    }

    public final AHD<NativeLoginLinkedAccountUiModel> component5() {
        return this.linkedAccounts;
    }

    public final int component6() {
        return this.linkedAccountCount;
    }

    public final AHD<NativeLoginProfileUiModel> component7() {
        return this.profiles;
    }

    public final boolean component8() {
        return this.oneTapLoginEligible;
    }

    public final boolean component9() {
        return this.hasHatch;
    }

    public final HatchAccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final HatchDisclosurePresentation getDisclosurePresentation() {
        return this.disclosurePresentation;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFallbackGlyphPlatform() {
        return this.fallbackGlyphPlatform;
    }

    public final boolean getHasHatch() {
        return this.hasHatch;
    }

    public final boolean getHasMetaAi() {
        return this.hasMetaAi;
    }

    public final boolean getHasUsableMuseProfile() {
        NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel = this.museProfile;
        return (nativeLoginMuseProfileUiModel == null || C7BY.A0j(nativeLoginMuseProfileUiModel.name) || C7BY.A0j(nativeLoginMuseProfileUiModel.photoUrl)) ? false : true;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLinkedAccountCount() {
        return this.linkedAccountCount;
    }

    public final AHD<NativeLoginLinkedAccountUiModel> getLinkedAccounts() {
        return this.linkedAccounts;
    }

    public final NativeLoginMuseProfileUiModel getMuseProfile() {
        return this.museProfile;
    }

    public final boolean getOneTapLoginEligible() {
        return this.oneTapLoginEligible;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getProfileCount$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow() {
        return Math.max(this.linkedAccountCount, Math.max(this.profiles.size(), this.linkedAccounts.size()));
    }

    public final AHD<NativeLoginProfileUiModel> getProfiles() {
        return this.profiles;
    }

    public final boolean getShowMuseTransparency() {
        return this.showMuseTransparency;
    }

    public final String getSourceApp() {
        return this.sourceApp;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.accountStatus, AnonymousClass005.A0F(this.disclosurePresentation, C0KA.A01((((((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.profiles, (AnonymousClass005.A0F(this.linkedAccounts, (((AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.photoUrl)) * 31) + this.linkedAccountCount) * 31), this.oneTapLoginEligible), this.hasHatch), this.hasMetaAi), this.isF3) + AnonymousClass006.A0G(this.sourceApp)) * 31) + AnonymousClass006.A0G(this.fallbackGlyphPlatform)) * 31) + C06G.A04(this.museProfile)) * 31, this.showMuseTransparency)));
    }

    public final boolean isF3() {
        return this.isF3;
    }

    public final boolean isJoin() {
        return !this.hasMetaAi;
    }

    public final NativeLoginAccountUiModel copy(String str, String str2, String str3, String str4, AHD<NativeLoginLinkedAccountUiModel> ahd, int i, AHD<NativeLoginProfileUiModel> ahd2, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, HatchAccountStatus hatchAccountStatus) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass002.A1E(ahd, 4, ahd2);
        AnonymousClass003.A12(hatchDisclosurePresentation, hatchAccountStatus);
        return new NativeLoginAccountUiModel(str, str2, str3, str4, ahd, i, ahd2, z, z2, z3, z4, str5, str6, nativeLoginMuseProfileUiModel, z5, hatchDisclosurePresentation, hatchAccountStatus);
    }

    public String toString() {
        return super.toString();
    }

    public NativeLoginAccountUiModel(String str, String str2, String str3, String str4, AHD<NativeLoginLinkedAccountUiModel> ahd, int i, AHD<NativeLoginProfileUiModel> ahd2, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, NativeLoginMuseProfileUiModel nativeLoginMuseProfileUiModel, boolean z5, HatchDisclosurePresentation hatchDisclosurePresentation, HatchAccountStatus hatchAccountStatus) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass002.A1E(ahd, 4, ahd2);
        AnonymousClass003.A12(hatchDisclosurePresentation, hatchAccountStatus);
        this.id = str;
        this.displayName = str2;
        this.subtitle = str3;
        this.photoUrl = str4;
        this.linkedAccounts = ahd;
        this.linkedAccountCount = i;
        this.profiles = ahd2;
        this.oneTapLoginEligible = z;
        this.hasHatch = z2;
        this.hasMetaAi = z3;
        this.isF3 = z4;
        this.sourceApp = str5;
        this.fallbackGlyphPlatform = str6;
        this.museProfile = nativeLoginMuseProfileUiModel;
        this.showMuseTransparency = z5;
        this.disclosurePresentation = hatchDisclosurePresentation;
        this.accountStatus = hatchAccountStatus;
    }
}
