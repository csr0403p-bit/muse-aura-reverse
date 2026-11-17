package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchAuthCredentials extends C06G {
    public final String abraAccessToken;
    public final String abraUserId;
    public final HatchAccountSelectionChallenge accountSelectionChallenge;
    public final HatchAttestationRequest attestationRequest;
    public final String authState;
    public final HatchCheckpointChallenge checkpointChallenge;
    public final boolean checkpointWithoutUrl;
    public final String completionHandle;
    public final String confirmContactPoint;
    public final HatchDisclosurePresentation disclosurePresentation;
    public final String frlAccessToken;
    public final String frlAccountId;
    public final HatchItemizedConsent itemizedConsent;
    public final boolean linkingFailed;
    public final String loginContactPoint;
    public final String noticeBody;
    public final String noticeTitle;
    public final HatchNtpUpsellOffer ntpUpsell;
    public final List<HatchNtpUpsellChoiceRow> ntpUpsellChoice;
    public final HatchLandingPresentation ntpUpsellChoiceLandingPresentation;
    public final HatchTosDisclosure ntpUpsellChoiceTos;
    public final String ntpUpsellPendingContactPoint;
    public final HatchReactivationChallenge reactivationChallenge;
    public final String refreshToken;
    public final String registrationState;
    public final boolean requiresBirthday;
    public final boolean requiresConsent;
    public final boolean requiresName;
    public final HatchTosDisclosure tos;
    public final HatchTwoFactorChallenge twoFactorChallenge;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAuthCredentials) {
                HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) obj;
                if (!C7384Etj.areEqual(this.registrationState, hatchAuthCredentials.registrationState) || !C7384Etj.areEqual(this.abraAccessToken, hatchAuthCredentials.abraAccessToken) || !C7384Etj.areEqual(this.abraUserId, hatchAuthCredentials.abraUserId) || !C7384Etj.areEqual(this.frlAccessToken, hatchAuthCredentials.frlAccessToken) || !C7384Etj.areEqual(this.frlAccountId, hatchAuthCredentials.frlAccountId) || this.requiresBirthday != hatchAuthCredentials.requiresBirthday || this.requiresName != hatchAuthCredentials.requiresName || this.requiresConsent != hatchAuthCredentials.requiresConsent || this.disclosurePresentation != hatchAuthCredentials.disclosurePresentation || !C7384Etj.areEqual(this.itemizedConsent, hatchAuthCredentials.itemizedConsent) || !C7384Etj.areEqual(this.completionHandle, hatchAuthCredentials.completionHandle) || !C7384Etj.areEqual(this.ntpUpsell, hatchAuthCredentials.ntpUpsell) || !C7384Etj.areEqual(this.ntpUpsellPendingContactPoint, hatchAuthCredentials.ntpUpsellPendingContactPoint) || !C7384Etj.areEqual(this.loginContactPoint, hatchAuthCredentials.loginContactPoint) || !C7384Etj.areEqual(this.tos, hatchAuthCredentials.tos) || !C7384Etj.areEqual(this.accountSelectionChallenge, hatchAuthCredentials.accountSelectionChallenge) || !C7384Etj.areEqual(this.twoFactorChallenge, hatchAuthCredentials.twoFactorChallenge) || !C7384Etj.areEqual(this.checkpointChallenge, hatchAuthCredentials.checkpointChallenge) || !C7384Etj.areEqual(this.reactivationChallenge, hatchAuthCredentials.reactivationChallenge) || this.checkpointWithoutUrl != hatchAuthCredentials.checkpointWithoutUrl || !C7384Etj.areEqual(this.authState, hatchAuthCredentials.authState) || !C7384Etj.areEqual(this.confirmContactPoint, hatchAuthCredentials.confirmContactPoint) || this.linkingFailed != hatchAuthCredentials.linkingFailed || !C7384Etj.areEqual(this.noticeTitle, hatchAuthCredentials.noticeTitle) || !C7384Etj.areEqual(this.noticeBody, hatchAuthCredentials.noticeBody) || !C7384Etj.areEqual(this.ntpUpsellChoice, hatchAuthCredentials.ntpUpsellChoice) || !C7384Etj.areEqual(this.ntpUpsellChoiceTos, hatchAuthCredentials.ntpUpsellChoiceTos) || !C7384Etj.areEqual(this.refreshToken, hatchAuthCredentials.refreshToken) || this.ntpUpsellChoiceLandingPresentation != hatchAuthCredentials.ntpUpsellChoiceLandingPresentation || !C7384Etj.areEqual(this.attestationRequest, hatchAuthCredentials.attestationRequest)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.registrationState;
    }

    public final HatchItemizedConsent component10() {
        return this.itemizedConsent;
    }

    public final String component11() {
        return this.completionHandle;
    }

    public final HatchNtpUpsellOffer component12() {
        return this.ntpUpsell;
    }

    public final String component13() {
        return this.ntpUpsellPendingContactPoint;
    }

    public final String component14() {
        return this.loginContactPoint;
    }

    public final HatchTosDisclosure component15() {
        return this.tos;
    }

    public final HatchAccountSelectionChallenge component16() {
        return this.accountSelectionChallenge;
    }

    public final HatchTwoFactorChallenge component17() {
        return this.twoFactorChallenge;
    }

    public final HatchCheckpointChallenge component18() {
        return this.checkpointChallenge;
    }

    public final HatchReactivationChallenge component19() {
        return this.reactivationChallenge;
    }

    public final String component2() {
        return this.abraAccessToken;
    }

    public final boolean component20() {
        return this.checkpointWithoutUrl;
    }

    public final String component21() {
        return this.authState;
    }

    public final String component22() {
        return this.confirmContactPoint;
    }

    public final boolean component23() {
        return this.linkingFailed;
    }

    public final String component24() {
        return this.noticeTitle;
    }

    public final String component25() {
        return this.noticeBody;
    }

    public final List<HatchNtpUpsellChoiceRow> component26() {
        return this.ntpUpsellChoice;
    }

    public final HatchTosDisclosure component27() {
        return this.ntpUpsellChoiceTos;
    }

    public final String component28() {
        return this.refreshToken;
    }

    public final HatchLandingPresentation component29() {
        return this.ntpUpsellChoiceLandingPresentation;
    }

    public final String component3() {
        return this.abraUserId;
    }

    public final HatchAttestationRequest component30() {
        return this.attestationRequest;
    }

    public final String component4() {
        return this.frlAccessToken;
    }

    public final String component5() {
        return this.frlAccountId;
    }

    public final boolean component6() {
        return this.requiresBirthday;
    }

    public final boolean component7() {
        return this.requiresName;
    }

    public final boolean component8() {
        return this.requiresConsent;
    }

    public final HatchDisclosurePresentation component9() {
        return this.disclosurePresentation;
    }

    public final String getAbraAccessToken() {
        return this.abraAccessToken;
    }

    public final String getAbraUserId() {
        return this.abraUserId;
    }

    public final HatchAccountSelectionChallenge getAccountSelectionChallenge() {
        return this.accountSelectionChallenge;
    }

    public final HatchAttestationRequest getAttestationRequest() {
        return this.attestationRequest;
    }

    public final String getAuthState() {
        return this.authState;
    }

    public final HatchCheckpointChallenge getCheckpointChallenge() {
        return this.checkpointChallenge;
    }

    public final boolean getCheckpointWithoutUrl() {
        return this.checkpointWithoutUrl;
    }

    public final String getCompletionHandle() {
        return this.completionHandle;
    }

    public final String getConfirmContactPoint() {
        return this.confirmContactPoint;
    }

    public final HatchDisclosurePresentation getDisclosurePresentation() {
        return this.disclosurePresentation;
    }

    public final String getFrlAccessToken() {
        return this.frlAccessToken;
    }

    public final String getFrlAccountId() {
        return this.frlAccountId;
    }

    public final HatchItemizedConsent getItemizedConsent() {
        return this.itemizedConsent;
    }

    public final boolean getLinkingFailed() {
        return this.linkingFailed;
    }

    public final String getLoginContactPoint() {
        return this.loginContactPoint;
    }

    public final String getNoticeBody() {
        return this.noticeBody;
    }

    public final String getNoticeTitle() {
        return this.noticeTitle;
    }

    public final HatchNtpUpsellOffer getNtpUpsell() {
        return this.ntpUpsell;
    }

    public final List<HatchNtpUpsellChoiceRow> getNtpUpsellChoice() {
        return this.ntpUpsellChoice;
    }

    public final HatchLandingPresentation getNtpUpsellChoiceLandingPresentation() {
        return this.ntpUpsellChoiceLandingPresentation;
    }

    public final HatchTosDisclosure getNtpUpsellChoiceTos() {
        return this.ntpUpsellChoiceTos;
    }

    public final String getNtpUpsellPendingContactPoint() {
        return this.ntpUpsellPendingContactPoint;
    }

    public final HatchReactivationChallenge getReactivationChallenge() {
        return this.reactivationChallenge;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getRegistrationState() {
        return this.registrationState;
    }

    public final boolean getRequiresBirthday() {
        return this.requiresBirthday;
    }

    public final boolean getRequiresConsent() {
        return this.requiresConsent;
    }

    public final boolean getRequiresName() {
        return this.requiresName;
    }

    public final HatchTosDisclosure getTos() {
        return this.tos;
    }

    public final HatchTwoFactorChallenge getTwoFactorChallenge() {
        return this.twoFactorChallenge;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.ntpUpsellChoiceLandingPresentation, (((((AnonymousClass005.A0I(this.noticeBody, AnonymousClass005.A0I(this.noticeTitle, C0KA.A01(AnonymousClass005.A0I(this.confirmContactPoint, AnonymousClass005.A0I(this.authState, C0KA.A01((((((((((((((((AnonymousClass005.A0I(this.completionHandle, (AnonymousClass005.A0F(this.disclosurePresentation, C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.frlAccountId, AnonymousClass005.A0I(this.frlAccessToken, AnonymousClass005.A0I(this.abraUserId, AnonymousClass005.A0I(this.abraAccessToken, AnonymousClass001.A0G(this.registrationState))))), this.requiresBirthday), this.requiresName), this.requiresConsent)) + AnonymousClass006.A0D(this.itemizedConsent)) * 31) + AnonymousClass006.A0D(this.ntpUpsell)) * 31) + AnonymousClass006.A0G(this.ntpUpsellPendingContactPoint)) * 31) + AnonymousClass006.A0G(this.loginContactPoint)) * 31) + AnonymousClass006.A0D(this.tos)) * 31) + AnonymousClass006.A0D(this.accountSelectionChallenge)) * 31) + AnonymousClass006.A0D(this.twoFactorChallenge)) * 31) + AnonymousClass006.A0D(this.checkpointChallenge)) * 31) + AnonymousClass006.A0D(this.reactivationChallenge)) * 31, this.checkpointWithoutUrl))), this.linkingFailed))) + AnonymousClass006.A0D(this.ntpUpsellChoice)) * 31) + AnonymousClass006.A0D(this.ntpUpsellChoiceTos)) * 31) + AnonymousClass006.A0G(this.refreshToken)) * 31) + C3cH.A02(this.attestationRequest);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAuthCredentials(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, HatchDisclosurePresentation hatchDisclosurePresentation, HatchItemizedConsent hatchItemizedConsent, String str6, HatchNtpUpsellOffer hatchNtpUpsellOffer, String str7, String str8, HatchTosDisclosure hatchTosDisclosure, HatchAccountSelectionChallenge hatchAccountSelectionChallenge, HatchTwoFactorChallenge hatchTwoFactorChallenge, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z4, String str9, String str10, boolean z5, String str11, String str12, List list, HatchTosDisclosure hatchTosDisclosure2, String str13, HatchLandingPresentation hatchLandingPresentation, HatchAttestationRequest hatchAttestationRequest, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, z, z2, z3, (i & 256) != 0 ? HatchDisclosurePresentation.INLINE : hatchDisclosurePresentation, (i & 512) != 0 ? null : hatchItemizedConsent, str6, hatchNtpUpsellOffer, str7, str8, hatchTosDisclosure, hatchAccountSelectionChallenge, hatchTwoFactorChallenge, hatchCheckpointChallenge, hatchReactivationChallenge, z4, (1048576 & i) != 0 ? "" : str9, (2097152 & i) != 0 ? "" : str10, C3cH.A1L(4194304, i, z5), (8388608 & i) != 0 ? "" : str11, (16777216 & i) != 0 ? "" : str12, (33554432 & i) != 0 ? null : list, (67108864 & i) != 0 ? null : hatchTosDisclosure2, (134217728 & i) != 0 ? null : str13, (268435456 & i) != 0 ? HatchLandingPresentation.STANDARD : hatchLandingPresentation, (i & 536870912) != 0 ? null : hatchAttestationRequest);
    }

    public final HatchAuthCredentials copy(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, HatchDisclosurePresentation hatchDisclosurePresentation, HatchItemizedConsent hatchItemizedConsent, String str6, HatchNtpUpsellOffer hatchNtpUpsellOffer, String str7, String str8, HatchTosDisclosure hatchTosDisclosure, HatchAccountSelectionChallenge hatchAccountSelectionChallenge, HatchTwoFactorChallenge hatchTwoFactorChallenge, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z4, String str9, String str10, boolean z5, String str11, String str12, List<HatchNtpUpsellChoiceRow> list, HatchTosDisclosure hatchTosDisclosure2, String str13, HatchLandingPresentation hatchLandingPresentation, HatchAttestationRequest hatchAttestationRequest) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(hatchDisclosurePresentation, 8);
        C7384Etj.A0Y(str6, 10);
        C7384Etj.A0Y(str9, 20);
        C7384Etj.A0Y(str10, 21);
        C7384Etj.A0Y(str11, 23);
        C7384Etj.A0Y(str12, 24);
        C7384Etj.A0Y(hatchLandingPresentation, 28);
        return new HatchAuthCredentials(str, str2, str3, str4, str5, z, z2, z3, hatchDisclosurePresentation, hatchItemizedConsent, str6, hatchNtpUpsellOffer, str7, str8, hatchTosDisclosure, hatchAccountSelectionChallenge, hatchTwoFactorChallenge, hatchCheckpointChallenge, hatchReactivationChallenge, z4, str9, str10, z5, str11, str12, list, hatchTosDisclosure2, str13, hatchLandingPresentation, hatchAttestationRequest);
    }

    public static /* synthetic */ HatchAuthCredentials copy$default(HatchAuthCredentials hatchAuthCredentials, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, HatchDisclosurePresentation hatchDisclosurePresentation, HatchItemizedConsent hatchItemizedConsent, String str6, HatchNtpUpsellOffer hatchNtpUpsellOffer, String str7, String str8, HatchTosDisclosure hatchTosDisclosure, HatchAccountSelectionChallenge hatchAccountSelectionChallenge, HatchTwoFactorChallenge hatchTwoFactorChallenge, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z4, String str9, String str10, boolean z5, String str11, String str12, List list, HatchTosDisclosure hatchTosDisclosure2, String str13, HatchLandingPresentation hatchLandingPresentation, HatchAttestationRequest hatchAttestationRequest, int i, Object obj) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        boolean z6 = z;
        boolean z7 = z2;
        boolean z8 = z3;
        HatchDisclosurePresentation hatchDisclosurePresentation2 = hatchDisclosurePresentation;
        HatchItemizedConsent hatchItemizedConsent2 = hatchItemizedConsent;
        String str19 = str6;
        HatchNtpUpsellOffer hatchNtpUpsellOffer2 = hatchNtpUpsellOffer;
        String str20 = str7;
        String str21 = str8;
        HatchTosDisclosure hatchTosDisclosure3 = hatchTosDisclosure;
        HatchAccountSelectionChallenge hatchAccountSelectionChallenge2 = hatchAccountSelectionChallenge;
        boolean z9 = z4;
        boolean z10 = z5;
        List list2 = list;
        HatchTosDisclosure hatchTosDisclosure4 = hatchTosDisclosure2;
        String str22 = str13;
        HatchLandingPresentation hatchLandingPresentation2 = hatchLandingPresentation;
        HatchTwoFactorChallenge hatchTwoFactorChallenge2 = hatchTwoFactorChallenge;
        HatchCheckpointChallenge hatchCheckpointChallenge2 = hatchCheckpointChallenge;
        HatchReactivationChallenge hatchReactivationChallenge2 = hatchReactivationChallenge;
        String str23 = str9;
        String str24 = str10;
        String str25 = str11;
        String str26 = str12;
        HatchAttestationRequest hatchAttestationRequest2 = hatchAttestationRequest;
        if ((i & 1) != 0) {
            str14 = hatchAuthCredentials.registrationState;
        }
        if ((i & 2) != 0) {
            str15 = hatchAuthCredentials.abraAccessToken;
        }
        if ((i & 4) != 0) {
            str16 = hatchAuthCredentials.abraUserId;
        }
        if ((i & 8) != 0) {
            str17 = hatchAuthCredentials.frlAccessToken;
        }
        if ((i & 16) != 0) {
            str18 = hatchAuthCredentials.frlAccountId;
        }
        if ((i & 32) != 0) {
            z6 = hatchAuthCredentials.requiresBirthday;
        }
        if ((i & 64) != 0) {
            z7 = hatchAuthCredentials.requiresName;
        }
        if ((i & 128) != 0) {
            z8 = hatchAuthCredentials.requiresConsent;
        }
        if ((i & 256) != 0) {
            hatchDisclosurePresentation2 = hatchAuthCredentials.disclosurePresentation;
        }
        if ((i & 512) != 0) {
            hatchItemizedConsent2 = hatchAuthCredentials.itemizedConsent;
        }
        if ((i & 1024) != 0) {
            str19 = hatchAuthCredentials.completionHandle;
        }
        if ((i & 2048) != 0) {
            hatchNtpUpsellOffer2 = hatchAuthCredentials.ntpUpsell;
        }
        if ((i & 4096) != 0) {
            str20 = hatchAuthCredentials.ntpUpsellPendingContactPoint;
        }
        if ((i & 8192) != 0) {
            str21 = hatchAuthCredentials.loginContactPoint;
        }
        if ((i & 16384) != 0) {
            hatchTosDisclosure3 = hatchAuthCredentials.tos;
        }
        if ((i & 32768) != 0) {
            hatchAccountSelectionChallenge2 = hatchAuthCredentials.accountSelectionChallenge;
        }
        if ((i & 65536) != 0) {
            hatchTwoFactorChallenge2 = hatchAuthCredentials.twoFactorChallenge;
        }
        if ((i & 131072) != 0) {
            hatchCheckpointChallenge2 = hatchAuthCredentials.checkpointChallenge;
        }
        if ((i & 262144) != 0) {
            hatchReactivationChallenge2 = hatchAuthCredentials.reactivationChallenge;
        }
        if ((i & 524288) != 0) {
            z9 = hatchAuthCredentials.checkpointWithoutUrl;
        }
        if ((i & 1048576) != 0) {
            str23 = hatchAuthCredentials.authState;
        }
        if ((i & 2097152) != 0) {
            str24 = hatchAuthCredentials.confirmContactPoint;
        }
        if ((i & 4194304) != 0) {
            z10 = hatchAuthCredentials.linkingFailed;
        }
        if ((i & 8388608) != 0) {
            str25 = hatchAuthCredentials.noticeTitle;
        }
        if ((i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
            str26 = hatchAuthCredentials.noticeBody;
        }
        if ((i & 33554432) != 0) {
            list2 = hatchAuthCredentials.ntpUpsellChoice;
        }
        if ((i & 67108864) != 0) {
            hatchTosDisclosure4 = hatchAuthCredentials.ntpUpsellChoiceTos;
        }
        if ((i & 134217728) != 0) {
            str22 = hatchAuthCredentials.refreshToken;
        }
        if ((i & 268435456) != 0) {
            hatchLandingPresentation2 = hatchAuthCredentials.ntpUpsellChoiceLandingPresentation;
        }
        if ((i & 536870912) != 0) {
            hatchAttestationRequest2 = hatchAuthCredentials.attestationRequest;
        }
        return hatchAuthCredentials.copy(str14, str15, str16, str17, str18, z6, z7, z8, hatchDisclosurePresentation2, hatchItemizedConsent2, str19, hatchNtpUpsellOffer2, str20, str21, hatchTosDisclosure3, hatchAccountSelectionChallenge2, hatchTwoFactorChallenge2, hatchCheckpointChallenge2, hatchReactivationChallenge2, z9, str23, str24, z10, str25, str26, list2, hatchTosDisclosure4, str22, hatchLandingPresentation2, hatchAttestationRequest2);
    }

    public HatchAuthCredentials(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, HatchDisclosurePresentation hatchDisclosurePresentation, HatchItemizedConsent hatchItemizedConsent, String str6, HatchNtpUpsellOffer hatchNtpUpsellOffer, String str7, String str8, HatchTosDisclosure hatchTosDisclosure, HatchAccountSelectionChallenge hatchAccountSelectionChallenge, HatchTwoFactorChallenge hatchTwoFactorChallenge, HatchCheckpointChallenge hatchCheckpointChallenge, HatchReactivationChallenge hatchReactivationChallenge, boolean z4, String str9, String str10, boolean z5, String str11, String str12, List<HatchNtpUpsellChoiceRow> list, HatchTosDisclosure hatchTosDisclosure2, String str13, HatchLandingPresentation hatchLandingPresentation, HatchAttestationRequest hatchAttestationRequest) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(hatchDisclosurePresentation, 8);
        C7384Etj.A0Y(str6, 10);
        C7384Etj.A0Y(str9, 20);
        C7384Etj.A0Y(str10, 21);
        C7384Etj.A0Y(str11, 23);
        C7384Etj.A0Y(str12, 24);
        C7384Etj.A0Y(hatchLandingPresentation, 28);
        this.registrationState = str;
        this.abraAccessToken = str2;
        this.abraUserId = str3;
        this.frlAccessToken = str4;
        this.frlAccountId = str5;
        this.requiresBirthday = z;
        this.requiresName = z2;
        this.requiresConsent = z3;
        this.disclosurePresentation = hatchDisclosurePresentation;
        this.itemizedConsent = hatchItemizedConsent;
        this.completionHandle = str6;
        this.ntpUpsell = hatchNtpUpsellOffer;
        this.ntpUpsellPendingContactPoint = str7;
        this.loginContactPoint = str8;
        this.tos = hatchTosDisclosure;
        this.accountSelectionChallenge = hatchAccountSelectionChallenge;
        this.twoFactorChallenge = hatchTwoFactorChallenge;
        this.checkpointChallenge = hatchCheckpointChallenge;
        this.reactivationChallenge = hatchReactivationChallenge;
        this.checkpointWithoutUrl = z4;
        this.authState = str9;
        this.confirmContactPoint = str10;
        this.linkingFailed = z5;
        this.noticeTitle = str11;
        this.noticeBody = str12;
        this.ntpUpsellChoice = list;
        this.ntpUpsellChoiceTos = hatchTosDisclosure2;
        this.refreshToken = str13;
        this.ntpUpsellChoiceLandingPresentation = hatchLandingPresentation;
        this.attestationRequest = hatchAttestationRequest;
    }
}
