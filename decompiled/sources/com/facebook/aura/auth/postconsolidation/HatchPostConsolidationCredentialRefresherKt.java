package com.facebook.aura.auth.postconsolidation;

import X.AnonymousClass006;
import X.C7BY;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.login.nativeflow.HatchAuthCredentials;

/* loaded from: classes2.dex */
public abstract class HatchPostConsolidationCredentialRefresherKt {
    public static final String REGISTRATION_STATE_LOGGED_IN = "logged_in";

    public static final boolean isCompleteLoggedInSession(HatchAuthCredentials hatchAuthCredentials) {
        return REGISTRATION_STATE_LOGGED_IN.equals(hatchAuthCredentials.registrationState) && !C7BY.A0j(hatchAuthCredentials.abraAccessToken) && !C7BY.A0j(hatchAuthCredentials.abraUserId) && !C7BY.A0j(hatchAuthCredentials.frlAccessToken) && !C7BY.A0j(hatchAuthCredentials.frlAccountId) && !hatchAuthCredentials.requiresBirthday && !hatchAuthCredentials.requiresName && !hatchAuthCredentials.requiresConsent && C7BY.A0j(hatchAuthCredentials.completionHandle) && hatchAuthCredentials.ntpUpsell == null && hatchAuthCredentials.ntpUpsellPendingContactPoint == null && hatchAuthCredentials.loginContactPoint == null && hatchAuthCredentials.tos == null && hatchAuthCredentials.accountSelectionChallenge == null && hatchAuthCredentials.twoFactorChallenge == null && hatchAuthCredentials.checkpointChallenge == null && !hatchAuthCredentials.checkpointWithoutUrl && C7BY.A0j(hatchAuthCredentials.authState) && C7BY.A0j(hatchAuthCredentials.confirmContactPoint) && !hatchAuthCredentials.linkingFailed && C7BY.A0j(hatchAuthCredentials.noticeTitle) && C7BY.A0j(hatchAuthCredentials.noticeBody);
    }

    public static final void logRefreshResult(PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult) {
        HatchInteractionLogger.INSTANCE.logStatusCheck(HatchSurface.AGE_CONFIRMATION, null, HatchScreen.CCV_SCREEN, HatchComponent.POST_CONSOLIDATION_CREDENTIAL_REFRESH, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), postConsolidationCredentialRefreshResult.getValue()));
    }
}
