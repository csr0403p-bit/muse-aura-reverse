package com.facebook.aura.activation.data;

import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C5as;
import X.C5b2;
import X.Ey9;
import com.facebook.aura.utils.HatchUtil;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ActivationState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ActivationState[] $VALUES;
    public static final ActivationState AGE_VERIFICATION;
    public static final ActivationState ALREADY_WAITLISTED;
    public static final ActivationState BLOCKED;
    public static final ActivationState CONFIDENTIAL_VM_SETUP;
    public static final Companion Companion;
    public static final ActivationState DISCLOSURE_ToS;
    public static final ActivationState FULLY_ACTIVATED;
    public static final ActivationState GEO_BLOCKED;
    public static final ActivationState LIMITED_WAITLIST;
    public static final ActivationState LOADING;
    public static final ActivationState NAME_REQUIRED;
    public static final ActivationState NDA;
    public static final ActivationState NO_ACCESS;
    public static final ActivationState REQUEST_INVITE_CODE;
    public static final ActivationState REQUEST_WAITLIST;
    public static final ActivationState RETOS;
    public static final ActivationState VM_PROVISIONING;
    public static final ActivationState WEARABLES_LINKING;

    public final class Companion {
        public final boolean isGeoBlocked(Boolean bool) {
            return AnonymousClass002.A1b(bool, false);
        }

        public final boolean isNoHatchAccess(Boolean bool) {
            return AnonymousClass002.A1b(bool, false);
        }

        private final boolean needsRouteOutOfAcquisition(C5b2 c5b2, Boolean bool) {
            return c5b2 == null && !AnonymousClass002.A1b(bool, true);
        }

        public final boolean isAgeVerifiedRequired(C5as c5as) {
            return c5as != C5as.A03 && HatchUtil.INSTANCE.isAgeVerificationEnabled();
        }

        public final boolean isBlocked(C5as c5as) {
            return c5as == C5as.A02 && HatchUtil.INSTANCE.isAgeVerificationEnabled();
        }

        public final boolean isConsentRequired(boolean z) {
            return !z;
        }

        public final boolean isInWaitlistQueue(C5b2 c5b2, Boolean bool, Boolean bool2) {
            if (c5b2 != C5b2.A06 && c5b2 != C5b2.A04) {
                return false;
            }
            Boolean bool3 = true;
            return !bool3.equals(bool) && bool3.equals(bool2);
        }

        public final boolean isResolvingAccess(Boolean bool, boolean z) {
            return bool == null && !z;
        }

        public final boolean isResolvingAcquisition(Boolean bool, Boolean bool2, Boolean bool3, boolean z) {
            return (bool == null || bool2 == null || bool3 == null) && !z;
        }

        public final boolean isWearablesLinkingRequired(boolean z, boolean z2) {
            return !z && z2 && HatchUtil.INSTANCE.isWearableConsentEnabled();
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.activation.data.ActivationState getCurrentActivationState(java.lang.Boolean r7, java.lang.Boolean r8, java.lang.Boolean r9, java.lang.Boolean r10, java.lang.Boolean r11, X.C5b2 r12, boolean r13, X.C5as r14, java.lang.Boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23) {
            /*
                r6 = this;
                boolean r5 = r6.isAgeVerifiedRequired(r14)
                java.lang.Boolean r1 = X.AnonymousClass001.A0i()
                boolean r3 = r1.equals(r9)
                r0 = 0
                if (r3 != 0) goto L18
                com.facebook.aura.installsource.AuraBuildChannel r2 = com.facebook.aura.installsource.AuraBuildChannel.INSTANCE
                boolean r2 = r2.isPlayAlphaInstall()
                r4 = 0
                if (r2 == 0) goto L19
            L18:
                r4 = 1
            L19:
                com.facebook.aura.installsource.AuraBuildChannel r2 = com.facebook.aura.installsource.AuraBuildChannel.INSTANCE
                boolean r2 = r2.isPlayAlphaInstall()
                if (r2 != 0) goto L25
                if (r23 == 0) goto Lb8
                if (r3 == 0) goto Lb8
            L25:
                r3 = 1
            L26:
                r2 = r16
                if (r7 != 0) goto L2f
                if (r16 != 0) goto L2f
            L2c:
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.LOADING
                return r0
            L2f:
                boolean r2 = r6.isResolvingAcquisition(r8, r9, r10, r2)
                if (r2 != 0) goto L2c
                if (r20 == 0) goto L3a
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.RETOS
                return r0
            L3a:
                boolean r2 = r6.isInWaitlistQueue(r12, r8, r10)
                if (r2 == 0) goto L49
                if (r3 != 0) goto Lc1
                X.5b2 r0 = X.C5b2.A04
                if (r12 != r0) goto Lbb
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.LIMITED_WAITLIST
                return r0
            L49:
                if (r3 != 0) goto L54
                boolean r2 = r6.isWaitlistRequired(r12, r8, r10)
                if (r2 == 0) goto L54
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.REQUEST_WAITLIST
                return r0
            L54:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
                boolean r2 = r6.isInviteCodeRequired(r12, r8, r2)
                if (r2 != 0) goto Lc1
                boolean r2 = X.AnonymousClass002.A1b(r15, r0)
                if (r2 == 0) goto L67
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.GEO_BLOCKED
                return r0
            L67:
                boolean r2 = X.AnonymousClass002.A1b(r7, r0)
                if (r2 == 0) goto L70
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.NO_ACCESS
                return r0
            L70:
                if (r19 == 0) goto L75
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.NDA
                return r0
            L75:
                boolean r2 = r6.isBlocked(r14)
                if (r2 == 0) goto L7e
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.BLOCKED
                return r0
            L7e:
                if (r5 == 0) goto L83
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.AGE_VERIFICATION
                return r0
            L83:
                r2 = r13 ^ 1
                if (r2 == 0) goto L8a
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.DISCLOSURE_ToS
                return r0
            L8a:
                r3 = r17
                r2 = r18
                boolean r2 = r6.isWearablesLinkingRequired(r3, r2)
                if (r2 == 0) goto L97
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.WEARABLES_LINKING
                return r0
            L97:
                if (r21 == 0) goto L9c
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.NAME_REQUIRED
                return r0
            L9c:
                if (r22 == 0) goto La7
                boolean r0 = X.AnonymousClass002.A1b(r11, r0)
                if (r0 == 0) goto La7
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.CONFIDENTIAL_VM_SETUP
                return r0
            La7:
                if (r11 == 0) goto L2c
                boolean r0 = r11.booleanValue()
                if (r0 != 0) goto Lbe
                boolean r0 = r1.equals(r7)
                if (r0 == 0) goto L2c
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.VM_PROVISIONING
                return r0
            Lb8:
                r3 = 0
                goto L26
            Lbb:
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.ALREADY_WAITLISTED
                return r0
            Lbe:
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.FULLY_ACTIVATED
                return r0
            Lc1:
                com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.REQUEST_INVITE_CODE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.data.ActivationState.Companion.getCurrentActivationState(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, X.5b2, boolean, X.5as, java.lang.Boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):com.facebook.aura.activation.data.ActivationState");
        }

        public final boolean isInviteCodeRequired(C5b2 c5b2, Boolean bool, Boolean bool2) {
            return needsRouteOutOfAcquisition(c5b2, bool) && AnonymousClass002.A1b(bool2, true);
        }

        public final boolean isUnresolvedAccess(Boolean bool) {
            return AnonymousClass002.A1Y(bool);
        }

        public final boolean isWaitlistRequired(C5b2 c5b2, Boolean bool, Boolean bool2) {
            return needsRouteOutOfAcquisition(c5b2, bool) && AnonymousClass002.A1b(bool2, true);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ActivationState activationState = new ActivationState("LOADING", 0);
        LOADING = activationState;
        ActivationState activationState2 = new ActivationState("RETOS", 1);
        RETOS = activationState2;
        ActivationState activationState3 = new ActivationState("NO_ACCESS", 2);
        NO_ACCESS = activationState3;
        ActivationState activationState4 = new ActivationState("BLOCKED", 3);
        BLOCKED = activationState4;
        ActivationState activationState5 = new ActivationState("GEO_BLOCKED", 4);
        GEO_BLOCKED = activationState5;
        ActivationState activationState6 = new ActivationState("REQUEST_INVITE_CODE", 5);
        REQUEST_INVITE_CODE = activationState6;
        ActivationState activationState7 = new ActivationState("REQUEST_WAITLIST", 6);
        REQUEST_WAITLIST = activationState7;
        ActivationState activationState8 = new ActivationState("ALREADY_WAITLISTED", 7);
        ALREADY_WAITLISTED = activationState8;
        ActivationState activationState9 = new ActivationState("LIMITED_WAITLIST", 8);
        LIMITED_WAITLIST = activationState9;
        ActivationState activationState10 = new ActivationState("DISCLOSURE_ToS", 9);
        DISCLOSURE_ToS = activationState10;
        ActivationState activationState11 = new ActivationState("NDA", 10);
        NDA = activationState11;
        ActivationState activationState12 = new ActivationState("WEARABLES_LINKING", 11);
        WEARABLES_LINKING = activationState12;
        ActivationState activationState13 = new ActivationState("AGE_VERIFICATION", 12);
        AGE_VERIFICATION = activationState13;
        ActivationState activationState14 = new ActivationState("NAME_REQUIRED", 13);
        NAME_REQUIRED = activationState14;
        ActivationState activationState15 = new ActivationState("CONFIDENTIAL_VM_SETUP", 14);
        CONFIDENTIAL_VM_SETUP = activationState15;
        ActivationState activationState16 = new ActivationState("VM_PROVISIONING", 15);
        VM_PROVISIONING = activationState16;
        ActivationState activationState17 = new ActivationState("FULLY_ACTIVATED", 16);
        FULLY_ACTIVATED = activationState17;
        ActivationState[] activationStateArr = {activationState, activationState2, activationState3, activationState4, activationState5, activationState6, activationState7, activationState8, activationState9, activationState10, activationState11, activationState12, activationState13, activationState14, activationState15, activationState16, activationState17};
        $VALUES = activationStateArr;
        $ENTRIES = C3cG.A0w(activationStateArr);
        Companion = new Companion();
    }

    public static Ey9<ActivationState> getEntries() {
        return $ENTRIES;
    }

    public static ActivationState valueOf(String str) {
        return (ActivationState) Enum.valueOf(ActivationState.class, str);
    }

    public static ActivationState[] values() {
        return (ActivationState[]) $VALUES.clone();
    }

    public final boolean isWaitlistSurface() {
        return this == REQUEST_WAITLIST || this == ALREADY_WAITLISTED || this == LIMITED_WAITLIST;
    }

    public ActivationState(String str, int i) {
    }
}
