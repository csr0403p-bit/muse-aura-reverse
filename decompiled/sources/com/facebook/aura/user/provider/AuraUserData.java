package com.facebook.aura.user.provider;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5as;
import X.C5b2;
import X.C7384Etj;
import com.facebook.aura.activation.data.ActivationState;
import java.util.List;

/* loaded from: classes2.dex */
public final class AuraUserData extends C06G {
    public final C5as ageConfirmationStatus;
    public final AgeCheckLayout ageVerificationLayout;
    public final List<AgeCheckMethod> ageVerificationMethods;
    public final String emailPrefill;
    public final boolean hasAcceptedTos;
    public final Boolean hasClearedAcquisition;
    public final boolean hasCompletedHatchActivation;
    public final Boolean hasHatchAccess;
    public final boolean hasLinkedWearables;
    public final Boolean hasProvisionedVm;
    public final boolean hasRedeemedInviteCode;
    public final Boolean isInviteCodeEntryAvailable;
    public final boolean isNdaRequired;
    public final Boolean isPassGeogating;
    public final Boolean isVmTypePlanRequired;
    public final Boolean isVmTypeSelectionRequired;
    public final Boolean isWaitlistAvailable;
    public final String namePrefill;
    public final String profileName;
    public final String profilePictureUrl;
    public final String profileUsername;
    public final String reTosPayload;
    public final boolean requiresName;
    public final C5b2 waitlistStatus;

    public final String currentActivationStateName() {
        return AnonymousClass006.A0x(getCurrentActivationState(false, false, false));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraUserData) {
                AuraUserData auraUserData = (AuraUserData) obj;
                if (!C7384Etj.areEqual(this.hasHatchAccess, auraUserData.hasHatchAccess) || !C7384Etj.areEqual(this.hasClearedAcquisition, auraUserData.hasClearedAcquisition) || !C7384Etj.areEqual(this.isInviteCodeEntryAvailable, auraUserData.isInviteCodeEntryAvailable) || !C7384Etj.areEqual(this.isWaitlistAvailable, auraUserData.isWaitlistAvailable) || !C7384Etj.areEqual(this.hasProvisionedVm, auraUserData.hasProvisionedVm) || this.waitlistStatus != auraUserData.waitlistStatus || this.hasRedeemedInviteCode != auraUserData.hasRedeemedInviteCode || this.hasAcceptedTos != auraUserData.hasAcceptedTos || this.ageConfirmationStatus != auraUserData.ageConfirmationStatus || !C7384Etj.areEqual(this.isPassGeogating, auraUserData.isPassGeogating) || this.hasCompletedHatchActivation != auraUserData.hasCompletedHatchActivation || this.hasLinkedWearables != auraUserData.hasLinkedWearables || this.isNdaRequired != auraUserData.isNdaRequired || !C7384Etj.areEqual(this.isVmTypeSelectionRequired, auraUserData.isVmTypeSelectionRequired) || this.requiresName != auraUserData.requiresName || !C7384Etj.areEqual(this.isVmTypePlanRequired, auraUserData.isVmTypePlanRequired) || !C7384Etj.areEqual(this.profileName, auraUserData.profileName) || !C7384Etj.areEqual(this.profileUsername, auraUserData.profileUsername) || !C7384Etj.areEqual(this.profilePictureUrl, auraUserData.profilePictureUrl) || !C7384Etj.areEqual(this.namePrefill, auraUserData.namePrefill) || !C7384Etj.areEqual(this.emailPrefill, auraUserData.emailPrefill) || !C7384Etj.areEqual(this.reTosPayload, auraUserData.reTosPayload) || !C7384Etj.areEqual(this.ageVerificationMethods, auraUserData.ageVerificationMethods) || this.ageVerificationLayout != auraUserData.ageVerificationLayout) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isChatCapable() {
        return getCurrentActivationState(false, false, false) == ActivationState.FULLY_ACTIVATED;
    }

    public final boolean canEnterInviteCode() {
        return AnonymousClass002.A1b(this.isInviteCodeEntryAvailable, true);
    }

    public final Boolean component1() {
        return this.hasHatchAccess;
    }

    public final Boolean component10() {
        return this.isPassGeogating;
    }

    public final boolean component11() {
        return this.hasCompletedHatchActivation;
    }

    public final boolean component12() {
        return this.hasLinkedWearables;
    }

    public final boolean component13() {
        return this.isNdaRequired;
    }

    public final Boolean component14() {
        return this.isVmTypeSelectionRequired;
    }

    public final boolean component15() {
        return this.requiresName;
    }

    public final Boolean component16() {
        return this.isVmTypePlanRequired;
    }

    public final String component17() {
        return this.profileName;
    }

    public final String component18() {
        return this.profileUsername;
    }

    public final String component19() {
        return this.profilePictureUrl;
    }

    public final Boolean component2() {
        return this.hasClearedAcquisition;
    }

    public final String component20() {
        return this.namePrefill;
    }

    public final String component21() {
        return this.emailPrefill;
    }

    public final String component22() {
        return this.reTosPayload;
    }

    public final List<AgeCheckMethod> component23() {
        return this.ageVerificationMethods;
    }

    public final AgeCheckLayout component24() {
        return this.ageVerificationLayout;
    }

    public final Boolean component3() {
        return this.isInviteCodeEntryAvailable;
    }

    public final Boolean component4() {
        return this.isWaitlistAvailable;
    }

    public final Boolean component5() {
        return this.hasProvisionedVm;
    }

    public final C5b2 component6() {
        return this.waitlistStatus;
    }

    public final boolean component7() {
        return this.hasRedeemedInviteCode;
    }

    public final boolean component8() {
        return this.hasAcceptedTos;
    }

    public final C5as component9() {
        return this.ageConfirmationStatus;
    }

    public final AuraUserData copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C5b2 c5b2, boolean z, boolean z2, C5as c5as, Boolean bool6, boolean z3, boolean z4, boolean z5, Boolean bool7, boolean z6, Boolean bool8, String str, String str2, String str3, String str4, String str5, String str6, List<? extends AgeCheckMethod> list, AgeCheckLayout ageCheckLayout) {
        C7384Etj.A0Y(list, 22);
        return new AuraUserData(bool, bool2, bool3, bool4, bool5, c5b2, z, z2, c5as, bool6, z3, z4, z5, bool7, z6, bool8, str, str2, str3, str4, str5, str6, list, ageCheckLayout);
    }

    public final C5as getAgeConfirmationStatus() {
        return this.ageConfirmationStatus;
    }

    public final AgeCheckLayout getAgeVerificationLayout() {
        return this.ageVerificationLayout;
    }

    public final List<AgeCheckMethod> getAgeVerificationMethods() {
        return this.ageVerificationMethods;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.activation.data.ActivationState getCurrentActivationState(boolean r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            com.facebook.aura.activation.data.ActivationState$Companion r4 = com.facebook.aura.activation.data.ActivationState.Companion
            r1 = r20
            java.lang.Boolean r5 = r1.hasHatchAccess
            java.lang.Boolean r6 = r1.hasClearedAcquisition
            java.lang.Boolean r7 = r1.isInviteCodeEntryAvailable
            java.lang.Boolean r8 = r1.isWaitlistAvailable
            java.lang.Boolean r9 = r1.hasProvisionedVm
            X.5b2 r10 = r1.waitlistStatus
            boolean r11 = r1.hasAcceptedTos
            X.5as r12 = r1.ageConfirmationStatus
            java.lang.Boolean r13 = r1.isPassGeogating
            boolean r14 = r1.hasCompletedHatchActivation
            boolean r15 = r1.hasLinkedWearables
            boolean r3 = r1.isNdaRequired
            java.lang.String r2 = r1.reTosPayload
            r18 = 0
            r0 = 1
            if (r2 == 0) goto L25
            r18 = 1
        L25:
            boolean r2 = r1.requiresName
            java.lang.Boolean r1 = r1.isVmTypeSelectionRequired
            boolean r0 = X.AnonymousClass002.A1b(r1, r0)
            if (r0 == 0) goto L33
            r20 = 1
            if (r22 != 0) goto L35
        L33:
            r20 = 0
        L35:
            r16 = r21
            r21 = r23
            r19 = r2
            r17 = r3
            com.facebook.aura.activation.data.ActivationState r0 = r4.getCurrentActivationState(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.user.provider.AuraUserData.getCurrentActivationState(boolean, boolean, boolean):com.facebook.aura.activation.data.ActivationState");
    }

    public final String getEmailPrefill() {
        return this.emailPrefill;
    }

    public final boolean getHasAcceptedTos() {
        return this.hasAcceptedTos;
    }

    public final Boolean getHasClearedAcquisition() {
        return this.hasClearedAcquisition;
    }

    public final boolean getHasCompletedHatchActivation() {
        return this.hasCompletedHatchActivation;
    }

    public final Boolean getHasHatchAccess() {
        return this.hasHatchAccess;
    }

    public final boolean getHasLinkedWearables() {
        return this.hasLinkedWearables;
    }

    public final Boolean getHasProvisionedVm() {
        return this.hasProvisionedVm;
    }

    public final boolean getHasRedeemedInviteCode() {
        return this.hasRedeemedInviteCode;
    }

    public final String getNamePrefill() {
        return this.namePrefill;
    }

    public final String getProfileName() {
        return this.profileName;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final String getProfileUsername() {
        return this.profileUsername;
    }

    public final String getReTosPayload() {
        return this.reTosPayload;
    }

    public final boolean getRequiresName() {
        return this.requiresName;
    }

    public final C5b2 getWaitlistStatus() {
        return this.waitlistStatus;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.ageVerificationMethods, (((((((((((((C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01((((C0KA.A01(C0KA.A01(((((((((((AnonymousClass006.A0D(this.hasHatchAccess) * 31) + AnonymousClass006.A0D(this.hasClearedAcquisition)) * 31) + AnonymousClass006.A0D(this.isInviteCodeEntryAvailable)) * 31) + AnonymousClass006.A0D(this.isWaitlistAvailable)) * 31) + AnonymousClass006.A0D(this.hasProvisionedVm)) * 31) + AnonymousClass006.A0D(this.waitlistStatus)) * 31, this.hasRedeemedInviteCode), this.hasAcceptedTos) + AnonymousClass006.A0D(this.ageConfirmationStatus)) * 31) + AnonymousClass006.A0D(this.isPassGeogating)) * 31, this.hasCompletedHatchActivation), this.hasLinkedWearables), this.isNdaRequired) + AnonymousClass006.A0D(this.isVmTypeSelectionRequired)) * 31, this.requiresName) + AnonymousClass006.A0D(this.isVmTypePlanRequired)) * 31) + AnonymousClass006.A0G(this.profileName)) * 31) + AnonymousClass006.A0G(this.profileUsername)) * 31) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31) + AnonymousClass006.A0G(this.namePrefill)) * 31) + AnonymousClass006.A0G(this.emailPrefill)) * 31) + AnonymousClass006.A0G(this.reTosPayload)) * 31) + C3cH.A02(this.ageVerificationLayout);
    }

    public final Boolean isInviteCodeEntryAvailable() {
        return this.isInviteCodeEntryAvailable;
    }

    public final boolean isNdaRequired() {
        return this.isNdaRequired;
    }

    public final Boolean isPassGeogating() {
        return this.isPassGeogating;
    }

    public final Boolean isVmTypePlanRequired() {
        return this.isVmTypePlanRequired;
    }

    public final Boolean isVmTypeSelectionRequired() {
        return this.isVmTypeSelectionRequired;
    }

    public final Boolean isWaitlistAvailable() {
        return this.isWaitlistAvailable;
    }

    public final boolean needsFetch() {
        return this.isVmTypeSelectionRequired == null || this.hasHatchAccess == null || getCurrentActivationState(false, false, false) != ActivationState.FULLY_ACTIVATED;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraUserData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C5b2 c5b2, boolean z, boolean z2, C5as c5as, Boolean bool6, boolean z3, boolean z4, boolean z5, Boolean bool7, boolean z6, Boolean bool8, String str, String str2, String str3, String str4, String str5, String str6, List<? extends AgeCheckMethod> list, AgeCheckLayout ageCheckLayout) {
        C7384Etj.A0Y(list, 22);
        this.hasHatchAccess = bool;
        this.hasClearedAcquisition = bool2;
        this.isInviteCodeEntryAvailable = bool3;
        this.isWaitlistAvailable = bool4;
        this.hasProvisionedVm = bool5;
        this.waitlistStatus = c5b2;
        this.hasRedeemedInviteCode = z;
        this.hasAcceptedTos = z2;
        this.ageConfirmationStatus = c5as;
        this.isPassGeogating = bool6;
        this.hasCompletedHatchActivation = z3;
        this.hasLinkedWearables = z4;
        this.isNdaRequired = z5;
        this.isVmTypeSelectionRequired = bool7;
        this.requiresName = z6;
        this.isVmTypePlanRequired = bool8;
        this.profileName = str;
        this.profileUsername = str2;
        this.profilePictureUrl = str3;
        this.namePrefill = str4;
        this.emailPrefill = str5;
        this.reTosPayload = str6;
        this.ageVerificationMethods = list;
        this.ageVerificationLayout = ageCheckLayout;
    }

    public static /* synthetic */ AuraUserData copy$default(AuraUserData auraUserData, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C5b2 c5b2, boolean z, boolean z2, C5as c5as, Boolean bool6, boolean z3, boolean z4, boolean z5, Boolean bool7, boolean z6, Boolean bool8, String str, String str2, String str3, String str4, String str5, String str6, List list, AgeCheckLayout ageCheckLayout, int i, Object obj) {
        Boolean bool9 = bool;
        Boolean bool10 = bool2;
        Boolean bool11 = bool3;
        Boolean bool12 = bool4;
        Boolean bool13 = bool5;
        C5b2 c5b22 = c5b2;
        boolean z7 = z;
        boolean z8 = z2;
        C5as c5as2 = c5as;
        Boolean bool14 = bool6;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        Boolean bool15 = bool7;
        boolean z12 = z6;
        Boolean bool16 = bool8;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        List list2 = list;
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        AgeCheckLayout ageCheckLayout2 = ageCheckLayout;
        if ((i & 1) != 0) {
            bool9 = auraUserData.hasHatchAccess;
        }
        if ((i & 2) != 0) {
            bool10 = auraUserData.hasClearedAcquisition;
        }
        if ((i & 4) != 0) {
            bool11 = auraUserData.isInviteCodeEntryAvailable;
        }
        if ((i & 8) != 0) {
            bool12 = auraUserData.isWaitlistAvailable;
        }
        if ((i & 16) != 0) {
            bool13 = auraUserData.hasProvisionedVm;
        }
        if ((i & 32) != 0) {
            c5b22 = auraUserData.waitlistStatus;
        }
        if ((i & 64) != 0) {
            z7 = auraUserData.hasRedeemedInviteCode;
        }
        if ((i & 128) != 0) {
            z8 = auraUserData.hasAcceptedTos;
        }
        if ((i & 256) != 0) {
            c5as2 = auraUserData.ageConfirmationStatus;
        }
        if ((i & 512) != 0) {
            bool14 = auraUserData.isPassGeogating;
        }
        if ((i & 1024) != 0) {
            z9 = auraUserData.hasCompletedHatchActivation;
        }
        if ((i & 2048) != 0) {
            z10 = auraUserData.hasLinkedWearables;
        }
        if ((i & 4096) != 0) {
            z11 = auraUserData.isNdaRequired;
        }
        if ((i & 8192) != 0) {
            bool15 = auraUserData.isVmTypeSelectionRequired;
        }
        if ((i & 16384) != 0) {
            z12 = auraUserData.requiresName;
        }
        if ((i & 32768) != 0) {
            bool16 = auraUserData.isVmTypePlanRequired;
        }
        if ((i & 65536) != 0) {
            str10 = auraUserData.profileName;
        }
        if ((i & 131072) != 0) {
            str11 = auraUserData.profileUsername;
        }
        if ((i & 262144) != 0) {
            str12 = auraUserData.profilePictureUrl;
        }
        if ((i & 524288) != 0) {
            str7 = auraUserData.namePrefill;
        }
        if ((i & 1048576) != 0) {
            str8 = auraUserData.emailPrefill;
        }
        if ((i & 2097152) != 0) {
            str9 = auraUserData.reTosPayload;
        }
        if ((i & 4194304) != 0) {
            list2 = auraUserData.ageVerificationMethods;
        }
        if ((i & 8388608) != 0) {
            ageCheckLayout2 = auraUserData.ageVerificationLayout;
        }
        boolean z13 = z10;
        boolean z14 = z11;
        return auraUserData.copy(bool9, bool10, bool11, bool12, bool13, c5b22, z7, z8, c5as2, bool14, z9, z13, z14, bool15, z12, bool16, str10, str11, str12, str7, str8, str9, list2, ageCheckLayout2);
    }

    public /* synthetic */ AuraUserData(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, C5b2 c5b2, boolean z, boolean z2, C5as c5as, Boolean bool6, boolean z3, boolean z4, boolean z5, Boolean bool7, boolean z6, Boolean bool8, String str, String str2, String str3, String str4, String str5, String str6, List list, AgeCheckLayout ageCheckLayout, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4, (i & 16) != 0 ? null : bool5, (i & 32) != 0 ? null : c5b2, C3cH.A1M(i, z), C3cH.A1N(i, z2), (i & 256) != 0 ? null : c5as, (i & 512) != 0 ? null : bool6, C3cG.A1K(i & 1024, z3), C3cG.A1K(i & 2048, z4), C3cG.A1K(i & 4096, z5), (i & 8192) != 0 ? null : bool7, C3cG.A1K(i & 16384, z6), (i & 32768) != 0 ? null : bool8, C3cI.A0V(i, 65536, str), C3cI.A0V(i, 131072, str2), C3cI.A0V(i, 262144, str3), C3cI.A0V(i, 524288, str4), C3cI.A0V(i, 1048576, str5), C3cI.A0V(i, 2097152, str6), (i & 4194304) != 0 ? C0881AGi.A00 : list, (i & 8388608) != 0 ? null : ageCheckLayout);
    }

    public AuraUserData() {
        this(null, null, null, null, null, null, false, false, null, null, false, false, false, null, false, null, null, null, null, null, null, null, C0881AGi.A00, null);
    }
}
