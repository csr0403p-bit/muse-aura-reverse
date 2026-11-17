package com.facebook.aura.activation.model;

import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* loaded from: classes4.dex */
public final class HatchInviteLogging {
    public static final String EVENT_INVITE_CODE_GENERATE = "invite_code_generate";
    public static final String EVENT_INVITE_PAGE_LOAD = "invite_page_load";
    public static final String EVENT_TYPE_STATUS_CHECK = "status_check";
    public static final HatchInviteLogging INSTANCE = new HatchInviteLogging();
    public static final String KEY_HAS_CODE = "has_code";
    public static final String KEY_HAS_INVITE_LINK = "has_invite_link";
    public static final String KEY_HAS_SHARE_TEXT = "has_share_text";
    public static final String KEY_INVITE_STATE = "invite_state";
    public static final String RESULT_ERROR = "error";
    public static final String RESULT_SUCCESS = "success";
    public static final String SUBSURFACE_INVITE_FRIENDS = "invite_friends";

    private final void logSheetClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_INVITE_FRIENDS, hatchComponent, null, null, null);
    }

    private final String result(boolean z) {
        return z ? "success" : "error";
    }

    public final void logCopyCodeClick() {
        logSheetClick(HatchComponent.COPY_CODE_BUTTON);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logInviteCodeGenerate(com.facebook.aura.activation.repo.AuraActivationRepository.GenerateInviteCodeResult r13) {
        /*
            r12 = this;
            com.facebook.aura.analytics.hatch.HatchAppEventLogger r6 = com.facebook.aura.analytics.hatch.HatchAppEventLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchSurface r0 = com.facebook.aura.analytics.hatch.HatchSurface.ONBOARDING
            java.lang.String r8 = r0.getValue()
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.RESULT
            java.lang.String r1 = r0.getValue()
            r5 = 0
            if (r13 == 0) goto L70
            java.lang.String r0 = "success"
        L13:
            X.HxE r4 = X.C3cG.A0r(r1, r0)
            if (r13 == 0) goto L24
            java.lang.String r0 = r13.code
            if (r0 == 0) goto L24
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L25
        L24:
            r0 = 1
        L25:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_code"
            X.HxE r3 = X.C3cG.A0r(r0, r1)
            if (r13 == 0) goto L3e
            java.lang.String r0 = r13.inviteLink
            if (r0 == 0) goto L3e
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L3f
        L3e:
            r0 = 1
        L3f:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_invite_link"
            X.HxE r2 = X.C3cG.A0r(r0, r1)
            if (r13 == 0) goto L57
            java.lang.String r0 = r13.shareText
            if (r0 == 0) goto L57
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L58
        L57:
            r5 = 1
        L58:
            r0 = r5 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_share_text"
            java.util.Map r12 = X.C3cH.A0n(r0, r1, r4, r3, r2)
            r13 = 0
            java.lang.String r7 = "invite_code_generate"
            java.lang.String r9 = "invite_friends"
            java.lang.String r10 = "status_check"
            r11 = r7
            r6.logEvent(r7, r8, r9, r10, r11, r12, r13)
            return
        L70:
            java.lang.String r0 = "error"
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.HatchInviteLogging.logInviteCodeGenerate(com.facebook.aura.activation.repo.AuraActivationRepository$GenerateInviteCodeResult):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logInvitePageLoad(com.facebook.aura.activation.data.HatchInvitePage r11) {
        /*
            r10 = this;
            com.facebook.aura.analytics.hatch.HatchAppEventLogger r4 = com.facebook.aura.analytics.hatch.HatchAppEventLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchSurface r0 = com.facebook.aura.analytics.hatch.HatchSurface.ONBOARDING
            java.lang.String r6 = r0.getValue()
            X.AIa r2 = X.C3cG.A0u()
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.RESULT
            java.lang.String r1 = r0.getValue()
            r3 = 0
            if (r11 == 0) goto L85
            java.lang.String r0 = "success"
        L17:
            r2.put(r1, r0)
            if (r11 == 0) goto L38
            com.facebook.aura.activation.data.HatchInviteState r0 = r11.state
            if (r0 == 0) goto L2d
            java.lang.String r0 = r0.name()
            java.lang.String r1 = X.C60Q.A0j(r0)
            java.lang.String r0 = "invite_state"
            r2.put(r0, r1)
        L2d:
            java.lang.String r0 = r11.code
            if (r0 == 0) goto L38
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L39
        L38:
            r0 = 1
        L39:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_code"
            r2.put(r0, r1)
            if (r11 == 0) goto L51
            java.lang.String r0 = r11.inviteLink
            if (r0 == 0) goto L51
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L52
        L51:
            r0 = 1
        L52:
            r0 = r0 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_invite_link"
            r2.put(r0, r1)
            if (r11 == 0) goto L69
            java.lang.String r0 = r11.shareText
            if (r0 == 0) goto L69
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L6a
        L69:
            r3 = 1
        L6a:
            r0 = r3 ^ 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "has_share_text"
            r2.put(r0, r1)
            X.AIa r10 = X.AIW.A0K(r2)
            r11 = 0
            java.lang.String r5 = "invite_page_load"
            java.lang.String r7 = "invite_friends"
            java.lang.String r8 = "status_check"
            r9 = r5
            r4.logEvent(r5, r6, r7, r8, r9, r10, r11)
            return
        L85:
            java.lang.String r0 = "error"
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.HatchInviteLogging.logInvitePageLoad(com.facebook.aura.activation.data.HatchInvitePage):void");
    }

    public final void logTicketCardReveal() {
        logSheetClick(HatchComponent.INVITE_TICKET_CARD);
    }

    private final String bool(boolean z) {
        return String.valueOf(z);
    }
}
