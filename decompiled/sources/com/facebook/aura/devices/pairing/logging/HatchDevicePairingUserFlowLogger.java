package com.facebook.aura.devices.pairing.logging;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV3;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import com.facebook.aura.qpl.AuraQuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchDevicePairingUserFlowLogger {
    public final Map<HatchDevicePairingAttempt, Integer> attempts;
    public long deadlineMs;
    public final Set<HatchDevicePairingFailureReason> failureReasons;
    public long flowId;
    public boolean hasStarted;
    public final Function0<Boolean> isStandardVm;
    public final C3UX mainScope;
    public boolean pairingCompleted;
    public final Set<HatchDevicePairingPoint> points;
    public final Map<HatchDevicePairingRetry, Integer> retries;
    public HoC timeoutJob;
    public final long ttlMs;
    public boolean userDismissed;
    public final UserFlowLogger userFlowLogger;

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger$start$1", f = "HatchDevicePairingUserFlowLogger.kt", l = {55}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger$start$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDevicePairingUserFlowLogger.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDevicePairingUserFlowLogger.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = HatchDevicePairingUserFlowLogger.this.ttlMs;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDevicePairingUserFlowLogger.this.endFlowOnTimeout();
            return Unit.INSTANCE;
        }
    }

    public final void markPoint(HatchDevicePairingPoint hatchDevicePairingPoint) {
        C7384Etj.A0Y(hatchDevicePairingPoint, 0);
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            markPoint(lActiveFlowId.longValue(), hatchDevicePairingPoint);
        }
    }

    public final void recordAttempt(HatchDevicePairingAttempt hatchDevicePairingAttempt) {
        C7384Etj.A0Y(hatchDevicePairingAttempt, 0);
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            long jLongValue = lActiveFlowId.longValue();
            Integer num = this.attempts.get(hatchDevicePairingAttempt);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            this.attempts.put(hatchDevicePairingAttempt, Integer.valueOf(iIntValue));
            this.userFlowLogger.flowAnnotate(jLongValue, hatchDevicePairingAttempt.getAnnotation(), iIntValue);
            markPoint(jLongValue, hatchDevicePairingAttempt.getPoint());
        }
    }

    public final void recordError(HatchDevicePairingFailureReason hatchDevicePairingFailureReason) {
        C7384Etj.A0Y(hatchDevicePairingFailureReason, 0);
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            recordFailure(lActiveFlowId.longValue(), hatchDevicePairingFailureReason);
        }
    }

    public final void recordRetry(HatchDevicePairingRetry hatchDevicePairingRetry) {
        C7384Etj.A0Y(hatchDevicePairingRetry, 0);
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            long jLongValue = lActiveFlowId.longValue();
            Integer num = this.retries.get(hatchDevicePairingRetry);
            int iIntValue = (num != null ? num.intValue() : 0) + 1;
            this.retries.put(hatchDevicePairingRetry, Integer.valueOf(iIntValue));
            this.userFlowLogger.flowAnnotate(jLongValue, hatchDevicePairingRetry.getAnnotation(), iIntValue);
        }
    }

    public final void start(HatchDevicePairingTriggerSource hatchDevicePairingTriggerSource, HatchDevicePairingMode hatchDevicePairingMode, boolean z) {
        boolean zA1a = AnonymousClass002.A1a(hatchDevicePairingTriggerSource, hatchDevicePairingMode);
        if (this.hasStarted) {
            return;
        }
        long jGenerateNewFlowId = this.userFlowLogger.generateNewFlowId(734871486);
        String value = hatchDevicePairingTriggerSource.getValue();
        long j = this.ttlMs;
        UserFlowConfig userFlowConfig = new UserFlowConfig(value, false);
        userFlowConfig.mTtlMs = j;
        if (this.userFlowLogger.flowStartIfNotOngoing(jGenerateNewFlowId, userFlowConfig)) {
            this.hasStarted = zA1a;
            this.flowId = jGenerateNewFlowId;
            this.deadlineMs = SystemClock.elapsedRealtime() + this.ttlMs;
            this.timeoutJob = AnonymousClass001.A11(new AnonymousClass1(null), this.mainScope);
            this.userFlowLogger.flowAnnotate(jGenerateNewFlowId, "device_family", "link");
            this.userFlowLogger.flowAnnotateWithCrucialData(jGenerateNewFlowId, BV3.A00(4), hatchDevicePairingTriggerSource.getValue());
            this.userFlowLogger.flowAnnotateWithCrucialData(jGenerateNewFlowId, "pairing_mode", hatchDevicePairingMode.getValue());
            this.userFlowLogger.flowAnnotate(jGenerateNewFlowId, "setup_protocol", HatchDevicePairingSetupProtocol.UNKNOWN.getValue());
            this.userFlowLogger.flowAnnotate(jGenerateNewFlowId, "ble_permission_at_open", z);
            Iterator<HatchDevicePairingAttempt> it = HatchDevicePairingAttempt.getEntries().iterator();
            while (it.hasNext()) {
                this.userFlowLogger.flowAnnotate(jGenerateNewFlowId, it.next().getAnnotation(), 0);
            }
            Iterator<HatchDevicePairingRetry> it2 = HatchDevicePairingRetry.getEntries().iterator();
            while (it2.hasNext()) {
                this.userFlowLogger.flowAnnotate(jGenerateNewFlowId, it2.next().getAnnotation(), 0);
            }
        }
    }

    public final void updateFirmwareVersion(String str) {
        C7384Etj.A0Y(str, 0);
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            this.userFlowLogger.flowAnnotate(lActiveFlowId.longValue(), "firmware_version", str);
        }
    }

    public final void updateSetupProtocol(HatchDevicePairingSetupProtocol hatchDevicePairingSetupProtocol) {
        C7384Etj.A0Y(hatchDevicePairingSetupProtocol, 0);
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            this.userFlowLogger.flowAnnotate(lActiveFlowId.longValue(), "setup_protocol", hatchDevicePairingSetupProtocol.getValue());
        }
    }

    private final Long activeFlowId() {
        long j = this.flowId;
        if (j != 0) {
            if (this.userFlowLogger.isOngoingFlow(j)) {
                if (SystemClock.elapsedRealtime() < this.deadlineMs) {
                    return Long.valueOf(this.flowId);
                }
                endFlowOnTimeout();
                return null;
            }
            clearActiveFlow();
        }
        return null;
    }

    private final void clearActiveFlow() {
        this.flowId = 0L;
        this.timeoutJob = C3cI.A15(this.timeoutJob);
    }

    public static /* synthetic */ void close$default(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HatchDevicePairingFailureReason hatchDevicePairingFailureReason, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchDevicePairingFailureReason = null;
        }
        hatchDevicePairingUserFlowLogger.close(hatchDevicePairingFailureReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endFlowOnTimeout() {
        long j = this.flowId;
        if (j != 0) {
            if (this.userFlowLogger.isOngoingFlow(j)) {
                this.userFlowLogger.flowEndTimeout(j);
            }
            clearActiveFlow();
        }
    }

    private final void recordFailure(long j, HatchDevicePairingFailureReason hatchDevicePairingFailureReason) {
        this.userFlowLogger.flowAnnotate(j, "last_failure_reason", hatchDevicePairingFailureReason.getValue());
        if (this.failureReasons.add(hatchDevicePairingFailureReason)) {
            this.userFlowLogger.flowMarkError(j, hatchDevicePairingFailureReason.getValue(), null);
        }
    }

    public HatchDevicePairingUserFlowLogger(UserFlowLogger userFlowLogger, C3UX c3ux, Function0<Boolean> function0) {
        AnonymousClass005.A0x(userFlowLogger, c3ux, function0);
        this.userFlowLogger = userFlowLogger;
        this.mainScope = c3ux;
        this.isStandardVm = function0;
        this.ttlMs = 900000L;
        this.points = C3cG.A0k();
        this.failureReasons = C3cG.A0k();
        this.attempts = C3cG.A0j();
        this.retries = C3cG.A0j();
    }

    public final void close(HatchDevicePairingFailureReason hatchDevicePairingFailureReason) {
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            long jLongValue = lActiveFlowId.longValue();
            if (this.pairingCompleted) {
                this.userFlowLogger.flowEndSuccess(jLongValue);
            } else if (this.userDismissed || hatchDevicePairingFailureReason == null) {
                this.userFlowLogger.flowEndCancel(jLongValue, BV3.A00(84));
            } else {
                recordFailure(jLongValue, hatchDevicePairingFailureReason);
                this.userFlowLogger.flowEndFail(jLongValue, "forced_termination", null);
            }
            clearActiveFlow();
        }
    }

    public final void markUserDismissed() {
        if (activeFlowId() != null) {
            this.userDismissed = true;
        }
    }

    public final void updateDeviceDisplayName(String str) {
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            long jLongValue = lActiveFlowId.longValue();
            if (str == null || C7BY.A0j(str) || !AnonymousClass003.A1Y(this.isStandardVm)) {
                return;
            }
            this.userFlowLogger.flowAnnotate(jLongValue, "device_display_name", str);
        }
    }

    public final void updateIsCommunityDevice(boolean z) {
        Long lActiveFlowId = activeFlowId();
        if (lActiveFlowId != null) {
            long jLongValue = lActiveFlowId.longValue();
            if (AnonymousClass003.A1Y(this.isStandardVm)) {
                this.userFlowLogger.flowAnnotate(jLongValue, "is_community_device", z);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingUserFlowLogger(C3UX c3ux, Function0<Boolean> function0) {
        this(new UserFlowLoggerImpl(AuraQuickPerformanceLogger.INSTANCE.getInstance()), c3ux, function0);
        AnonymousClass003.A0u(c3ux, function0);
    }

    private final void markPoint(long j, HatchDevicePairingPoint hatchDevicePairingPoint) {
        if (this.points.add(hatchDevicePairingPoint)) {
            this.userFlowLogger.flowMarkPoint(j, hatchDevicePairingPoint.getValue());
        }
        if (hatchDevicePairingPoint == HatchDevicePairingPoint.PAIRING_COMPLETED) {
            this.pairingCompleted = true;
        }
    }
}
