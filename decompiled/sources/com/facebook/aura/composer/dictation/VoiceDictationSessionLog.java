package com.facebook.aura.composer.dictation;

import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C7384Etj;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.util.Map;

/* loaded from: classes5.dex */
public final class VoiceDictationSessionLog {
    public static final int $stable = 8;
    public long firstTranscriptAtMs;
    public DictationStartTrigger startTrigger;
    public long startedAtMs;
    public long stopRequestedAtMs;
    public final String subsurface;
    public final String surface;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logFinished(com.facebook.aura.composer.dictation.HatchVoiceDictationService r16, com.facebook.aura.composer.dictation.engine.DictationOutcome r17, com.facebook.aura.composer.dictation.VoiceDictationFinishTrigger r18, com.facebook.aura.composer.dictation.VoiceDictationSendResult r19, java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            r15 = this;
            r7 = 0
            r8 = r16
            X.C7384Etj.A0Y(r8, r7)
            java.lang.String r6 = "outcome"
            r5 = 1
            r10 = r17
            X.C7384Etj.A0Y(r10, r5)
            java.lang.String r13 = "trigger"
            r4 = 2
            r14 = r18
            r12 = r20
            X.AnonymousClass002.A1C(r14, r4, r12)
            long r17 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.captureLimitReachedAtMs
            r9 = r15
            long r0 = r15.stopRequestedAtMs
            r15 = 0
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 == 0) goto L2d
            int r11 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r11 != 0) goto Lc4
            r2 = r0
        L2d:
            X.AIa r11 = new X.AIa
            r11.<init>()
            java.lang.String r0 = r10.name()
            r11.put(r6, r0)
            java.lang.String r0 = X.AnonymousClass006.A0x(r14)
            r11.put(r13, r0)
            r13 = r19
            if (r19 == 0) goto L6d
            boolean r0 = r13.requested
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "send_requested"
            r11.put(r0, r1)
            boolean r0 = r13.sent
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "sent"
            r11.put(r0, r1)
            boolean r0 = r13.requested
            if (r0 == 0) goto L63
            boolean r1 = r13.sent
            r0 = 1
            if (r1 == 0) goto L64
        L63:
            r0 = 0
        L64:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "send_withheld"
            r11.put(r0, r1)
        L6d:
            r11.putAll(r12)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto Lc1
            r12 = r2
        L75:
            long r0 = r9.startedAtMs
            long r12 = r12 - r0
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "capture_ms"
            r11.put(r0, r1)
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto L90
            long r17 = r17 - r2
            java.lang.String r1 = java.lang.String.valueOf(r17)
            java.lang.String r0 = "finalization_ms"
            r11.put(r0, r1)
        L90:
            long r2 = r9.firstTranscriptAtMs
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 <= 0) goto La2
            long r0 = r9.startedAtMs
            long r2 = r2 - r0
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "first_transcript_ms"
            r11.put(r0, r1)
        La2:
            java.util.Map r0 = r8.captureMetadata()
            r11.putAll(r0)
            X.AIa r1 = X.AIW.A0K(r11)
            java.lang.String r0 = "dictation_finished"
            r9.logEvent(r0, r6, r8, r1)
            int r0 = r10.ordinal()
            if (r0 == r7) goto Lcf
            if (r0 == r4) goto Lca
            if (r0 == r5) goto Ld6
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Lc1:
            r12 = r17
            goto L75
        Lc4:
            long r2 = java.lang.Math.min(r0, r2)
            goto L2d
        Lca:
            com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r1 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.FAILURE
            goto Ld3
        Lcf:
            com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r1 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchClientCvmOutcome r0 = com.facebook.aura.analytics.hatch.HatchClientCvmOutcome.SUCCESS
        Ld3:
            r1.logVoiceDictation(r0)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.dictation.VoiceDictationSessionLog.logFinished(com.facebook.aura.composer.dictation.HatchVoiceDictationService, com.facebook.aura.composer.dictation.engine.DictationOutcome, com.facebook.aura.composer.dictation.VoiceDictationFinishTrigger, com.facebook.aura.composer.dictation.VoiceDictationSendResult, java.util.Map):void");
    }

    public final void start(DictationStartTrigger dictationStartTrigger) {
        C7384Etj.A0Y(dictationStartTrigger, 0);
        this.startedAtMs = SystemClock.elapsedRealtime();
        this.stopRequestedAtMs = 0L;
        this.firstTranscriptAtMs = 0L;
        this.startTrigger = dictationStartTrigger;
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DictationOutcome.values().length];
            try {
                AnonymousClass002.A13(DictationOutcome.COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(DictationOutcome.FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(DictationOutcome.CANCELLED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEvent(String str, String str2, HatchVoiceDictationService hatchVoiceDictationService, Map<String, String> map) {
        String logName;
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String str3 = this.surface;
        String str4 = this.subsurface;
        C0924AIa c0924AIa = new C0924AIa();
        DictationEngineType dictationEngineType = hatchVoiceDictationService.transport;
        if (dictationEngineType == null || (logName = dictationEngineType.getLogName()) == null) {
            logName = "none";
        }
        c0924AIa.put(HatchDataExportRepositoryKt.FAILURE_TRANSPORT, logName);
        c0924AIa.put("client_session_id", hatchVoiceDictationService.clientSessionId);
        c0924AIa.put(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, loggedMode(hatchVoiceDictationService));
        c0924AIa.put("start_trigger", AnonymousClass006.A0x(this.startTrigger));
        c0924AIa.putAll(map);
        hatchAppEventLogger.logEvent(str, str3, str4, str2, "voice_dictation", AIW.A0K(c0924AIa), null);
    }

    private final String loggedMode(HatchVoiceDictationService hatchVoiceDictationService) {
        return this.startTrigger == DictationStartTrigger.MIC_HOLD ? "PUSH_TO_TALK" : hatchVoiceDictationService.recordingMode.name();
    }

    public static /* synthetic */ void markStopRequested$default(VoiceDictationSessionLog voiceDictationSessionLog, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.elapsedRealtime();
        }
        voiceDictationSessionLog.markStopRequested(j);
    }

    public static /* synthetic */ void markTranscript$default(VoiceDictationSessionLog voiceDictationSessionLog, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = SystemClock.elapsedRealtime();
        }
        voiceDictationSessionLog.markTranscript(j);
    }

    public final long getFirstTranscriptAtMs$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return this.firstTranscriptAtMs;
    }

    public final DictationStartTrigger getStartTrigger$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return this.startTrigger;
    }

    public final long getStartedAtMs$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return this.startedAtMs;
    }

    public final long getStopRequestedAtMs$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return this.stopRequestedAtMs;
    }

    public final void markStopRequested(long j) {
        long j2 = this.stopRequestedAtMs;
        if (j2 == 0 || j < j2) {
            this.stopRequestedAtMs = j;
        }
    }

    public final void markTranscript(long j) {
        if (this.firstTranscriptAtMs == 0) {
            this.firstTranscriptAtMs = j;
        }
    }

    public VoiceDictationSessionLog(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.surface = str;
        this.subsurface = str2;
        this.startTrigger = DictationStartTrigger.MIC;
    }

    public final void logStarted(HatchVoiceDictationService hatchVoiceDictationService, Map<String, String> map) {
        AnonymousClass003.A0u(hatchVoiceDictationService, map);
        logEvent("dictation_started", WidgetComponentsKt.START_PATH, hatchVoiceDictationService, map);
        HatchClientCvmEventLogger.INSTANCE.logVoiceDictation(HatchClientCvmOutcome.ATTEMPT);
    }
}
