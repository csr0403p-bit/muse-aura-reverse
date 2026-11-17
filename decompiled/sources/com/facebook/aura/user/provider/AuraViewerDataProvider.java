package com.facebook.aura.user.provider;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C3cI;
import X.C3cJ;
import X.C4oT;
import X.C5as;
import X.C5b2;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.C9tI;
import X.CFK;
import X.CH0;
import X.G0U;
import X.HnJ;
import X.InterfaceC3137BzH;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.utils.HatchUtil;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class AuraViewerDataProvider implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String TAG = "AuraViewerDataProvider";
    public final BLG<AuraUserData> _userData;
    public final Object lock;
    public long optimisticVersion;
    public final C4oT prefs;
    public final InterfaceC3137BzH prefsListener;
    public final long sessionUserId;
    public final C1BN<AuraUserData> userData;

    public final void atomicUpdate(G0U<? super AuraUserData, AuraUserData> g0u) {
        C7384Etj.A0Y(g0u, 0);
        synchronized (this.lock) {
            AuraUserData value = this._userData.getValue();
            if (value != null) {
                AuraUserData auraUserDataInvoke = g0u.invoke(value);
                this.optimisticVersion++;
                updateUserData(auraUserDataInvoke);
                this._userData.Af8(auraUserDataInvoke);
            }
        }
    }

    public final void updateFromServer(AuraUserData auraUserData, long j) {
        C7384Etj.A0Y(auraUserData, 0);
        synchronized (this.lock) {
            if (this.optimisticVersion == j) {
                updateUserData(auraUserData);
                AnonymousClass002.A1I(this._userData, auraUserData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final AuraUserData readFromPrefs() {
        C5b2 c5b2ValueOf;
        List listA0h;
        List listA0g;
        try {
            Boolean boolACw = this.prefs.ACw(AuraViewerDataProviderKt.KEY_HAS_HATCH_ACCESS);
            Boolean boolACw2 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_HAS_CLEARED_ACQUISITION);
            Boolean boolACw3 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_INVITE_CODE_ENTRY_AVAILABLE);
            Boolean boolACw4 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_WAITLIST_AVAILABLE);
            Boolean boolACw5 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_HAS_PROVISIONED_VM);
            C5as c5asValueOf = null;
            String string = this.prefs.getString(AuraViewerDataProviderKt.KEY_WAITLIST_STATUS, null);
            if (string != null) {
                try {
                    c5b2ValueOf = C5b2.valueOf(string);
                } catch (IllegalArgumentException unused) {
                    c5b2ValueOf = null;
                }
            } else {
                c5b2ValueOf = null;
            }
            boolean z = this.prefs.getBoolean(AuraViewerDataProviderKt.KEY_HAS_REDEEMED_INVITE_CODE, false);
            boolean z2 = this.prefs.getBoolean(AuraViewerDataProviderKt.KEY_HAS_ACCEPTED_TOS, false);
            String string2 = this.prefs.getString(AuraViewerDataProviderKt.KEY_AGE_CONFIRMATION_STATUS, null);
            if (string2 != null) {
                try {
                    c5asValueOf = C5as.valueOf(string2);
                } catch (IllegalArgumentException unused2) {
                }
            }
            Boolean boolACw6 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_IS_PASS_GEOGATING);
            boolean z3 = this.prefs.getBoolean(AuraViewerDataProviderKt.KEY_HAS_COMPLETED_HATCH_ACTIVATION, false);
            boolean z4 = this.prefs.getBoolean(AuraViewerDataProviderKt.KEY_HAS_LINKED_WEARABLES, false);
            boolean z5 = this.prefs.getBoolean(AuraViewerDataProviderKt.KEY_IS_NDA_REQUIRED, false);
            Boolean boolACw7 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_SELECTION_REQUIRED);
            boolean z6 = this.prefs.getBoolean(AuraViewerDataProviderKt.KEY_REQUIRES_NAME, false);
            Boolean boolACw8 = this.prefs.ACw(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_PLAN_REQUIRED);
            AgeCheckLayout ageCheckLayoutValueOf = null;
            String string3 = this.prefs.getString("profile_name", null);
            String string4 = this.prefs.getString(AuraViewerDataProviderKt.KEY_PROFILE_USERNAME, null);
            String string5 = this.prefs.getString("profile_picture_url", null);
            String string6 = this.prefs.getString(AuraViewerDataProviderKt.KEY_NAME_PREFILL, null);
            String string7 = this.prefs.getString(AuraViewerDataProviderKt.KEY_EMAIL_PREFILL, null);
            String string8 = this.prefs.getString(AuraViewerDataProviderKt.KEY_RETOS_PAYLOAD, null);
            String string9 = this.prefs.getString(AuraViewerDataProviderKt.KEY_AGE_VERIFICATION_METHODS, null);
            if (string9 == null || (listA0g = C7BY.A0g(string9, new char[]{','})) == null) {
                listA0h = C0881AGi.A00;
            } else {
                listA0h = C3cG.A0h();
                Iterator it = listA0g.iterator();
                while (it.hasNext()) {
                    try {
                        AgeCheckMethod ageCheckMethodValueOf = AgeCheckMethod.valueOf((String) it.next());
                        if (ageCheckMethodValueOf != null) {
                            listA0h.add(ageCheckMethodValueOf);
                        }
                    } catch (IllegalArgumentException unused3) {
                    }
                }
            }
            String string10 = this.prefs.getString(AuraViewerDataProviderKt.KEY_AGE_VERIFICATION_LAYOUT, null);
            if (string10 != null) {
                try {
                    ageCheckLayoutValueOf = AgeCheckLayout.valueOf(string10);
                } catch (IllegalArgumentException unused4) {
                }
            }
            return new AuraUserData(boolACw, boolACw2, boolACw3, boolACw4, boolACw5, c5b2ValueOf, z, z2, c5asValueOf, boolACw6, z3, z4, z5, boolACw7, z6, boolACw8, string3, string4, string5, string6, string7, string8, listA0h, ageCheckLayoutValueOf);
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to restore user data from prefs", e);
            return new AuraUserData(null, null, null, null, null, null, false, false, null, null, false, false, false, null, false, null, null, null, null, null, null, null, C0881AGi.A00, null);
        }
    }

    public final String bugReportSummary() {
        StringBuilder sb = new StringBuilder();
        AuraUserData value = this._userData.getValue();
        if (value == null) {
            sb.append("userData: (signed out / not loaded)\n");
        } else {
            C3cJ.A0k(value.hasHatchAccess, "hasHatchAccess: ", sb);
            C3cJ.A0k(value.hasClearedAcquisition, "hasClearedAcquisition: ", sb);
            C3cJ.A0k(value.isInviteCodeEntryAvailable, "isInviteCodeEntryAvailable: ", sb);
            C3cJ.A0k(value.isWaitlistAvailable, "isWaitlistAvailable: ", sb);
            C3cJ.A0k(value.hasProvisionedVm, "hasProvisionedVm: ", sb);
            Object obj = value.waitlistStatus;
            if (obj == null) {
                obj = "(null)";
            }
            C3cJ.A0k(obj, "waitlistStatus: ", sb);
            C3cI.A1M("hasRedeemedInviteCode: ", sb, value.hasRedeemedInviteCode);
            C3cI.A1M("hasAcceptedTos: ", sb, value.hasAcceptedTos);
            Object obj2 = value.ageConfirmationStatus;
            if (obj2 == null) {
                obj2 = "(null)";
            }
            C3cJ.A0k(obj2, "ageConfirmationStatus: ", sb);
            C3cJ.A0k(value.ageVerificationMethods, "ageVerificationMethods: ", sb);
            Object obj3 = value.ageVerificationLayout;
            C3cJ.A0k(obj3 != null ? obj3 : "(null)", "ageVerificationLayout: ", sb);
            C3cJ.A0k(value.isPassGeogating, "isPassGeogating: ", sb);
            C3cI.A1M("hasCompletedHatchActivation: ", sb, value.hasCompletedHatchActivation);
            C3cI.A1M("hasLinkedWearables: ", sb, value.hasLinkedWearables);
            C3cI.A1M("isNdaRequired: ", sb, value.isNdaRequired);
            C3cJ.A0k(value.isVmTypeSelectionRequired, "isVmTypeSelectionRequired: ", sb);
            C3cI.A1M("owesReTos: ", sb, AnonymousClass002.A1X(value.reTosPayload));
            C3cI.A1M("requiresName: ", sb, value.requiresName);
            C3cJ.A0k(value.isVmTypePlanRequired, "isVmTypePlanRequired: ", sb);
            C3cJ.A0k(value.getCurrentActivationState(false, false, false), "activationState: ", sb);
        }
        HatchUtil hatchUtil = HatchUtil.INSTANCE;
        C3cI.A1M("isActivationEnabled: ", sb, true);
        C3cI.A1M("isAgeVerificationEnabled: ", sb, hatchUtil.isAgeVerificationEnabled());
        return sb.toString();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            this.optimisticVersion++;
            this._userData.Af8(null);
            this.prefs.Ahk(this.prefsListener);
            try {
                BzK bzKA9q = this.prefs.A9q();
                bzKA9q.A08();
                bzKA9q.apply();
            } catch (Exception e) {
                CFK.A08(TAG, "Failed to clear user data from prefs", e);
            }
        }
    }

    public final boolean getHasPersistedUserData() {
        return this.prefs.contains(AuraViewerDataProviderKt.KEY_HAS_COMPLETED_HATCH_ACTIVATION);
    }

    public final long getSessionUserId() {
        return this.sessionUserId;
    }

    public final C1BN<AuraUserData> getUserData() {
        return this.userData;
    }

    public final boolean isConfidentialVmEnabled() {
        AuraUserData value = this._userData.getValue();
        if (value != null) {
            return AnonymousClass002.A1b(value.isVmTypeSelectionRequired, true);
        }
        return false;
    }

    public final long snapshotOptimisticVersion() {
        long j;
        synchronized (this.lock) {
            j = this.optimisticVersion;
        }
        return j;
    }

    public final void updateUserData(AuraUserData auraUserData) {
        BzK bzKA9q;
        C4oT c4oT = this.prefs;
        try {
            if (auraUserData != null) {
                bzKA9q = c4oT.A9q();
                C5b2 c5b2 = auraUserData.waitlistStatus;
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_WAITLIST_STATUS, c5b2 != null ? c5b2.name() : null);
                bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_REDEEMED_INVITE_CODE, auraUserData.hasRedeemedInviteCode);
                bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_ACCEPTED_TOS, auraUserData.hasAcceptedTos);
                C5as c5as = auraUserData.ageConfirmationStatus;
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_AGE_CONFIRMATION_STATUS, c5as != null ? c5as.name() : null);
                bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_COMPLETED_HATCH_ACTIVATION, auraUserData.hasCompletedHatchActivation);
                bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_LINKED_WEARABLES, auraUserData.hasLinkedWearables);
                bzKA9q.A0A(AuraViewerDataProviderKt.KEY_IS_NDA_REQUIRED, auraUserData.isNdaRequired);
                bzKA9q.A0A(AuraViewerDataProviderKt.KEY_REQUIRES_NAME, auraUserData.requiresName);
                bzKA9q.AYr("profile_name", auraUserData.profileName);
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_PROFILE_USERNAME, auraUserData.profileUsername);
                bzKA9q.AYr("profile_picture_url", auraUserData.profilePictureUrl);
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_NAME_PREFILL, auraUserData.namePrefill);
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_EMAIL_PREFILL, auraUserData.emailPrefill);
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_RETOS_PAYLOAD, auraUserData.reTosPayload);
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_AGE_VERIFICATION_METHODS, AbstractC0878AGe.A0L(",", "", "", auraUserData.ageVerificationMethods, AuraViewerDataProvider$updateUserData$editor$1.INSTANCE));
                AgeCheckLayout ageCheckLayout = auraUserData.ageVerificationLayout;
                bzKA9q.AYr(AuraViewerDataProviderKt.KEY_AGE_VERIFICATION_LAYOUT, ageCheckLayout != null ? ageCheckLayout.name() : null);
                Boolean bool = auraUserData.hasProvisionedVm;
                if (bool == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_HAS_PROVISIONED_VM);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_PROVISIONED_VM, bool.booleanValue());
                }
                Boolean bool2 = auraUserData.hasHatchAccess;
                if (bool2 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_HAS_HATCH_ACCESS);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_HATCH_ACCESS, bool2.booleanValue());
                }
                Boolean bool3 = auraUserData.hasClearedAcquisition;
                if (bool3 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_HAS_CLEARED_ACQUISITION);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_HAS_CLEARED_ACQUISITION, bool3.booleanValue());
                }
                Boolean bool4 = auraUserData.isInviteCodeEntryAvailable;
                if (bool4 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_INVITE_CODE_ENTRY_AVAILABLE);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_INVITE_CODE_ENTRY_AVAILABLE, bool4.booleanValue());
                }
                Boolean bool5 = auraUserData.isWaitlistAvailable;
                if (bool5 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_WAITLIST_AVAILABLE);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_WAITLIST_AVAILABLE, bool5.booleanValue());
                }
                Boolean bool6 = auraUserData.isVmTypeSelectionRequired;
                if (bool6 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_SELECTION_REQUIRED);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_SELECTION_REQUIRED, bool6.booleanValue());
                }
                Boolean bool7 = auraUserData.isVmTypePlanRequired;
                if (bool7 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_PLAN_REQUIRED);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_IS_VM_TYPE_PLAN_REQUIRED, bool7.booleanValue());
                }
                Boolean bool8 = auraUserData.isPassGeogating;
                if (bool8 == null) {
                    bzKA9q.Aae(AuraViewerDataProviderKt.KEY_IS_PASS_GEOGATING);
                } else {
                    bzKA9q.A0A(AuraViewerDataProviderKt.KEY_IS_PASS_GEOGATING, bool8.booleanValue());
                }
            } else {
                bzKA9q = c4oT.A9q();
                bzKA9q.A08();
            }
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to persist user data to prefs", e);
        }
    }

    public final class Companion {
        public final AuraViewerDataProvider getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AuraViewerDataProvider) abstractC3358CGz.A03(AuraViewerDataProvider.class, new AuraViewerDataProvider$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraViewerDataProvider(AbstractC3358CGz abstractC3358CGz) {
        String str = ((CH0) abstractC3358CGz).A01;
        Long lA0s = C9tI.A0s(str);
        this.sessionUserId = lA0s != null ? lA0s.longValue() : 0L;
        C4oT c4oT = AuraUserPrefs.INSTANCE.get(str, AuraUserPrefStore.USER_PROFILE);
        this.prefs = c4oT;
        this.lock = C3cG.A0T();
        C9286GCn c9286GCnA01 = HnJ.A01(readFromPrefs());
        this._userData = c9286GCnA01;
        this.userData = C3Pi.A00(c9286GCnA01);
        InterfaceC3137BzH interfaceC3137BzH = new InterfaceC3137BzH() { // from class: com.facebook.aura.user.provider.AuraViewerDataProvider$prefsListener$1
            @Override // X.InterfaceC3137BzH
            public final void onSharedPreferenceChanged(C4oT c4oT2, String str2) {
                AuraViewerDataProvider auraViewerDataProvider = this.this$0;
                auraViewerDataProvider._userData.Af8(auraViewerDataProvider.readFromPrefs());
            }
        };
        this.prefsListener = interfaceC3137BzH;
        c4oT.Aa2(interfaceC3137BzH);
    }

    public /* synthetic */ AuraViewerDataProvider(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
