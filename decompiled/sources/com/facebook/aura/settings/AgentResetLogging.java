package com.facebook.aura.settings;

import X.AIW;
import X.AnonymousClass001;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.HsJ;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContextKt;

/* loaded from: classes3.dex */
public final class AgentResetLogging {
    public static final int $stable = 0;
    public static final String EVENT_NAME = "agent_reset";
    public static final String EVENT_TYPE_OUTCOME = "outcome";
    public static final AgentResetLogging INSTANCE = new AgentResetLogging();
    public static final String KEY_ERROR_CODE = "error_code";
    public static final String KEY_HTTP_STATUS = "http_status";
    public static final String NO_ACTIVITY = "no_activity";
    public static final String NO_VM_HOST = "no_vm_host";

    public final void logNotSent(String str) {
        C7384Etj.A0Y(str, 0);
        log("failure", str, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[Catch: CancellationException -> 0x00a5, TryCatch #0 {CancellationException -> 0x00a5, blocks: (B:31:0x0087, B:32:0x008a, B:35:0x0096, B:38:0x009f, B:20:0x0050, B:21:0x0053, B:24:0x005d, B:26:0x0063, B:28:0x0074, B:17:0x0041), top: B:44:0x001c }] */
    /* renamed from: logRequest-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1895logRequest0E7RQCE(X.G0U<? super X.HtJ<? super X.HsJ<java.lang.Boolean>>, ? extends java.lang.Object> r12, X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r13, X.HtJ<? super X.HsJ<java.lang.Boolean>> r14) {
        /*
            r11 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.settings.AgentResetLogging$logRequest$1
            r9 = r11
            if (r0 == 0) goto L27
            r8 = r3
            com.facebook.aura.settings.AgentResetLogging$logRequest$1 r8 = (com.facebook.aura.settings.AgentResetLogging$logRequest$1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r8.label = r2
        L14:
            java.lang.Object r2 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L39
            if (r0 == r6) goto L32
            if (r0 != r5) goto L2d
            long r0 = r8.J$0
            java.lang.Object r7 = r8.L$2
            goto L87
        L27:
            com.facebook.aura.settings.AgentResetLogging$logRequest$1 r8 = new com.facebook.aura.settings.AgentResetLogging$logRequest$1
            r8.<init>(r11, r14)
            goto L14
        L2d:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L32:
            long r0 = r8.J$0
            java.lang.Object r13 = r8.L$1
            X.G0U r13 = (X.G0U) r13
            goto L50
        L39:
            X.Hwg.A00(r2)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 0
            r8.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> La5
            r8.L$1 = r13     // Catch: java.util.concurrent.CancellationException -> La5
            r8.J$0 = r0     // Catch: java.util.concurrent.CancellationException -> La5
            r8.label = r6     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Object r2 = r12.invoke(r8)     // Catch: java.util.concurrent.CancellationException -> La5
            if (r2 != r7) goto L53
            return r7
        L50:
            X.Hwg.A00(r2)     // Catch: java.util.concurrent.CancellationException -> La5
        L53:
            X.HsJ r2 = (X.HsJ) r2     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Object r4 = r2.value     // Catch: java.util.concurrent.CancellationException -> La5
            boolean r3 = r4 instanceof X.C10571Hud     // Catch: java.util.concurrent.CancellationException -> La5
            r2 = r4
            if (r3 == 0) goto L5d
            r2 = 0
        L5d:
            boolean r2 = X.C3cG.A1P(r2, r6)     // Catch: java.util.concurrent.CancellationException -> La5
            if (r2 == 0) goto L74
            java.lang.String r10 = "success"
            long r2 = X.C3cG.A04(r0)     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Long r12 = X.C3cG.A0S(r2)     // Catch: java.util.concurrent.CancellationException -> La5
            r11 = 0
            r13 = r11
            r14 = r11
            r9.log(r10, r11, r12, r13, r14)     // Catch: java.util.concurrent.CancellationException -> La5
            return r4
        L74:
            r2 = 0
            r8.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> La5
            r8.L$1 = r2     // Catch: java.util.concurrent.CancellationException -> La5
            r8.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> La5
            r8.J$0 = r0     // Catch: java.util.concurrent.CancellationException -> La5
            r8.label = r5     // Catch: java.util.concurrent.CancellationException -> La5
            java.lang.Object r2 = r13.invoke(r8)     // Catch: java.util.concurrent.CancellationException -> La5
            if (r2 == r7) goto La4
            r7 = r4
            goto L8a
        L87:
            X.Hwg.A00(r2)     // Catch: java.util.concurrent.CancellationException -> La5
        L8a:
            boolean r5 = X.AnonymousClass001.A1X(r2)     // Catch: java.util.concurrent.CancellationException -> La5
            long r3 = X.C3cG.A04(r0)     // Catch: java.util.concurrent.CancellationException -> La5
            if (r5 == 0) goto L9a
            java.lang.String r2 = "confirmed_destroyed"
        L96:
            r11.logFailedResponse(r7, r3, r2)     // Catch: java.util.concurrent.CancellationException -> La5
            goto L9d
        L9a:
            java.lang.String r2 = "failure"
            goto L96
        L9d:
            if (r5 == 0) goto La4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)     // Catch: java.util.concurrent.CancellationException -> La5
            return r4
        La4:
            return r7
        La5:
            r2 = move-exception
            long r0 = X.C3cG.A04(r0)
            java.lang.Long r12 = X.C3cG.A0S(r0)
            r11 = 0
            java.lang.String r10 = "cancelled"
            r13 = r11
            r14 = r11
            r9.log(r10, r11, r12, r13, r14)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.AgentResetLogging.m1895logRequest0E7RQCE(X.G0U, X.G0U, X.HtJ):java.lang.Object");
    }

    private final void log(String str, String str2, Long l, Integer num, String str3) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.SETTINGS.getValue();
        String value2 = HatchSubsurface.DATA_CONTROLS.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.RESULT, str, c0924AIaA0u);
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.FAILURE_REASON, str2, c0924AIaA0u);
        }
        if (l != null) {
            C3cH.A1A(HatchMetadataKey.DURATION_MS.getValue(), c0924AIaA0u, l.longValue());
        }
        if (num != null) {
            c0924AIaA0u.put("http_status", String.valueOf(num.intValue()));
        }
        if (str3 != null) {
            c0924AIaA0u.put("error_code", str3);
        }
        hatchAppEventLogger.logEvent(EVENT_NAME, value, value2, "outcome", EVENT_NAME, AIW.A0K(c0924AIaA0u), null);
    }

    public static /* synthetic */ void log$default(AgentResetLogging agentResetLogging, String str, String str2, Long l, Integer num, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        agentResetLogging.log(str, str2, l, num, str3);
    }

    private final void logFailedResponse(Object obj, long j, String str) {
        Integer numValueOf;
        String str2;
        String str3;
        NetworkException networkException;
        Throwable thA00 = HsJ.A00(obj);
        NetworkException networkException2 = null;
        if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null && networkException.httpResponseCode > 0) {
            networkException2 = networkException;
        }
        Long lValueOf = Long.valueOf(j);
        if (thA00 == null) {
            numValueOf = null;
            str3 = "not_destroyed";
        } else {
            if (networkException2 != null) {
                numValueOf = Integer.valueOf(networkException2.httpResponseCode);
                str2 = networkException2.errorCode;
                str3 = HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED;
                log(str, str3, lValueOf, numValueOf, str2);
            }
            numValueOf = null;
            str3 = HatchCallJoinContextKt.COSMOS_JOIN_NO_RESPONSE;
        }
        str2 = numValueOf;
        log(str, str3, lValueOf, numValueOf, str2);
    }
}
