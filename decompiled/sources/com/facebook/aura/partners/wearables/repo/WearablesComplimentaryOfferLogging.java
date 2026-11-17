package com.facebook.aura.partners.wearables.repo;

import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0924AIa;
import X.C3cG;
import X.C7BY;
import X.CFK;
import X.HsJ;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchRequestFailureMetadataKt;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* loaded from: classes3.dex */
public final class WearablesComplimentaryOfferLogging {
    public static final WearablesComplimentaryOfferLogging INSTANCE = new WearablesComplimentaryOfferLogging();
    public static final String TAG = "WearablesComplimentaryOfferLogging";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void log(java.lang.String r9, java.lang.Object r10, com.facebook.aura.analytics.hatch.HatchSurface r11, com.facebook.aura.analytics.hatch.HatchSubsurface r12, java.lang.String r13, java.lang.Integer r14) {
        /*
            r8 = this;
            r0 = 0
            X.AnonymousClass005.A11(r9, r11, r12, r0)
            boolean r0 = r10 instanceof X.C10571Hud
            r2 = 0
            r6 = r10
            if (r0 == 0) goto Lb
            r6 = r2
        Lb:
            boolean r0 = r6 instanceof com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferJson
            if (r0 == 0) goto L9c
            com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferJson r6 = (com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferJson) r6
        L11:
            java.lang.Throwable r5 = X.HsJ.A00(r10)
            boolean r0 = r5 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L99
            r4 = r5
            com.facebook.aura.json.NetworkException r4 = (com.facebook.aura.json.NetworkException) r4
            if (r4 == 0) goto L9a
            int r0 = r4.httpResponseCode
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            if (r0 <= 0) goto L9a
        L26:
            X.AIa r3 = X.C3cG.A0u()
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.STEP
            X.AnonymousClass001.A1C(r0, r9, r3)
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.RESULT
            java.lang.String r1 = r0.getValue()
            if (r5 != 0) goto L96
            java.lang.String r0 = "success"
        L39:
            r3.put(r1, r0)
            if (r14 == 0) goto L47
            int r1 = r14.intValue()
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.ATTEMPT_NUMBER
            X.AnonymousClass006.A1B(r0, r3, r1)
        L47:
            if (r13 == 0) goto L54
            boolean r0 = X.C7BY.A0j(r13)
            if (r0 != 0) goto L54
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.SETUP_SESSION_ID
            X.AnonymousClass001.A1C(r0, r13, r3)
        L54:
            if (r6 == 0) goto L70
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.HOLDS_OFFER
            java.lang.String r1 = r0.getValue()
            boolean r0 = r6.holds_offer
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r1, r0)
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.OFFER_STATUS
            java.lang.String r1 = r0.getValue()
            java.lang.String r0 = r6.offer_status
            r3.put(r1, r0)
        L70:
            if (r5 == 0) goto L8c
            com.facebook.aura.analytics.hatch.HatchRequestFailureMetadataKt.putRequestFailure(r3, r5)
            if (r7 != 0) goto L8c
            if (r4 == 0) goto L7b
            java.lang.String r2 = r4.errorCode
        L7b:
            r0 = 19
            java.lang.String r1 = X.C8j2.A00(r0)
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L8c
            com.facebook.aura.analytics.hatch.HatchMetadataKey r0 = com.facebook.aura.analytics.hatch.HatchMetadataKey.FAILURE_REASON
            X.AnonymousClass001.A1C(r0, r1, r3)
        L8c:
            X.AIa r1 = X.AIW.A0K(r3)
            java.lang.String r0 = "wearables_complimentary_offer"
            r8.logEvent(r0, r11, r12, r1)
            return
        L96:
            java.lang.String r0 = "error"
            goto L39
        L99:
            r4 = r2
        L9a:
            r7 = r2
            goto L26
        L9c:
            r6 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferLogging.log(java.lang.String, java.lang.Object, com.facebook.aura.analytics.hatch.HatchSurface, com.facebook.aura.analytics.hatch.HatchSubsurface, java.lang.String, java.lang.Integer):void");
    }

    private final void logEvent(String str, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, Map<String, String> map) {
        try {
            HatchAppEventLogger.INSTANCE.logEvent(str, hatchSurface.getValue(), hatchSubsurface.getValue(), HatchEventType.STATUS_CHECK.getValue(), null, map, null);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0A(TAG, "Failed to log wearables outcome", e2);
        }
    }

    public final void logConsentResult(Object obj, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str) {
        AnonymousClass003.A0x(hatchSurface, hatchSubsurface);
        Throwable thA00 = HsJ.A00(obj);
        String str2 = thA00 == null ? "wearables_consent_accepted" : "wearables_consent_request_failed";
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str != null && !C7BY.A0j(str)) {
            AnonymousClass001.A1C(HatchMetadataKey.SETUP_SESSION_ID, str, c0924AIaA0u);
        }
        if (thA00 != null) {
            HatchRequestFailureMetadataKt.putRequestFailure(c0924AIaA0u, thA00);
        }
        logEvent(str2, hatchSurface, hatchSubsurface, AIW.A0K(c0924AIaA0u));
    }
}
