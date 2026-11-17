package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BWH;
import X.C06H;
import X.C10571Hud;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver;
import com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchHttpTransportTimings;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchVmWakeQplAttemptObserverFactory implements HatchHttpRequestAttemptObserverFactory {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final AtomicInteger nextInstanceKey = BV5.A17();
    public final AtomicInteger attemptCounter;
    public final String connectionAttemptId;
    public final Long connectionCycleStartNs;
    public final Long connectionCycleStartWallTimeMs;
    public final int retryCount;
    public final HatchVmWakeTrigger trigger;

    public final class HatchVmWakeQplAttemptObserver implements HatchHttpRequestAttemptObserver {
        public final AtomicBoolean ended;
        public final Map<String, String> extraHeaders;
        public final int instanceKey;
        public final boolean markerStarted;
        public final QuickPerformanceLogger qpl;

        /* renamed from: com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<QuickPerformanceLogger, Unit> {
            public final /* synthetic */ boolean $authRetry;
            public final /* synthetic */ String $connectionAttemptId;
            public final /* synthetic */ int $retryCount;
            public final /* synthetic */ String $startSource;
            public final /* synthetic */ HatchVmWakeTrigger $trigger;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QuickPerformanceLogger quickPerformanceLogger) {
                C7384Etj.A0Y(quickPerformanceLogger, 0);
                int i = HatchVmWakeQplAttemptObserverKt.MARKER_ID;
                quickPerformanceLogger.markerAnnotate(i, HatchVmWakeQplAttemptObserver.this.instanceKey, "connection_attempt_id", this.$connectionAttemptId);
                quickPerformanceLogger.markerAnnotate(i, HatchVmWakeQplAttemptObserver.this.instanceKey, "retry_count", this.$retryCount);
                quickPerformanceLogger.markerAnnotate(i, HatchVmWakeQplAttemptObserver.this.instanceKey, "wake_trigger", this.$trigger.getValue());
                quickPerformanceLogger.markerAnnotate(i, HatchVmWakeQplAttemptObserver.this.instanceKey, "start_source", this.$startSource);
                quickPerformanceLogger.markerAnnotate(i, HatchVmWakeQplAttemptObserver.this.instanceKey, "auth_retry", this.$authRetry);
                quickPerformanceLogger.markerAnnotate(i, HatchVmWakeQplAttemptObserver.this.instanceKey, "app_state", AuraAppLifecycleManager.INSTANCE.isAppInForeground() ? "foreground" : "background");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, int i, HatchVmWakeTrigger hatchVmWakeTrigger, String str2, boolean z) {
                super(1);
                this.$connectionAttemptId = str;
                this.$retryCount = i;
                this.$trigger = hatchVmWakeTrigger;
                this.$startSource = str2;
                this.$authRetry = z;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(QuickPerformanceLogger quickPerformanceLogger) {
                invoke2(quickPerformanceLogger);
                return Unit.INSTANCE;
            }
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public void onCompleted(HatchHttpResponse hatchHttpResponse) {
            C7384Etj.A0Y(hatchHttpResponse, 0);
            end(hatchHttpResponse.isSuccessful ? (short) 2 : (short) 3, new HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onCompleted$1(this, hatchHttpResponse));
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public void onFailed(Throwable th) {
            C7384Etj.A0Y(th, 0);
            end((short) 3, new HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onFailed$1(this, th));
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public void onTransportTimings(HatchHttpTransportTimings hatchHttpTransportTimings) {
            C7384Etj.A0Y(hatchHttpTransportTimings, 0);
            log(new HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onTransportTimings$1(this, hatchHttpTransportTimings));
        }

        public HatchVmWakeQplAttemptObserver(String str, int i, String str2, int i2, HatchVmWakeTrigger hatchVmWakeTrigger, boolean z, long j, long j2, String str3) {
            Object objA0s;
            long jCurrentTimeMillis = j2;
            AnonymousClass002.A1A(str, 0, str2);
            C60O.A1N(hatchVmWakeTrigger, 4, str3);
            this.instanceKey = i;
            this.extraHeaders = AnonymousClass006.A10(HatchVmWakeQplAttemptObserverKt.QPL_JOIN_ID_HEADER, str);
            this.qpl = C60O.A0g();
            this.ended = BV4.A12(false);
            try {
                QuickPerformanceLogger quickPerformanceLogger = this.qpl;
                int i3 = HatchVmWakeQplAttemptObserverKt.MARKER_ID;
                int i4 = this.instanceKey;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                C7384Etj.A0Y(quickPerformanceLogger, 0);
                quickPerformanceLogger.markerStartWithCancelPolicy(i3, false, i4, j, timeUnit, str);
                MarkerEditor markerEditorWithMarker = quickPerformanceLogger.withMarker(i3, i4);
                C7384Etj.A0U(markerEditorWithMarker);
                jCurrentTimeMillis = j2 == -1 ? System.currentTimeMillis() : jCurrentTimeMillis;
                markerEditorWithMarker.annotate("join_id", str);
                markerEditorWithMarker.annotate("qpl_join__source_clock", "unreliable");
                markerEditorWithMarker.annotate("qpl_join__absolute_time_origin_ms", jCurrentTimeMillis);
                markerEditorWithMarker.annotate("qpl_join__source_is_primary", true);
                markerEditorWithMarker.markerEditingCompleted();
                objA0s = Unit.INSTANCE;
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            this.markerStarted = !(objA0s instanceof C10571Hud);
            log(new AnonymousClass2(str2, i2, hatchVmWakeTrigger, str3, z));
        }

        private final void end(short s, G0U<? super QuickPerformanceLogger, Unit> g0u) {
            if (this.markerStarted && C3cI.A1W(this.ended)) {
                try {
                    g0u.invoke(this.qpl);
                } catch (Throwable th) {
                    C3cG.A0s(th);
                }
                try {
                    this.qpl.markerEnd(HatchVmWakeQplAttemptObserverKt.MARKER_ID, this.instanceKey, s);
                } catch (Throwable th2) {
                    C3cG.A0s(th2);
                }
            }
        }

        private final void log(G0U<? super QuickPerformanceLogger, Unit> g0u) {
            if (!this.markerStarted || this.ended.get()) {
                return;
            }
            try {
                g0u.invoke(this.qpl);
            } catch (Throwable th) {
                C3cG.A0s(th);
            }
        }

        private final void logRequestPoint(String str, BWH bwh, long j) {
            log(new HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$logRequestPoint$1(this, str, j, bwh));
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public Map<String, String> getExtraHeaders() {
            return this.extraHeaders;
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public void onAfterResponseReceived(long j) {
            logRequestPoint(HatchVmWakeQplAttemptObserverKt.POINT_WAKE_RESPONSE_RECEIVED, BWH.A02, j);
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public void onBeforeRequestSent(long j) {
            logRequestPoint(HatchVmWakeQplAttemptObserverKt.POINT_WAKE_REQUEST_SENT, BWH.A03, j);
        }

        @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver
        public void onCancelled() {
            end((short) 4, new HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver$onCancelled$1(this));
        }
    }

    public HatchVmWakeQplAttemptObserverFactory(String str, int i, HatchVmWakeTrigger hatchVmWakeTrigger, Long l, Long l2) {
        AnonymousClass002.A1A(str, 0, hatchVmWakeTrigger);
        this.connectionAttemptId = str;
        this.retryCount = i;
        this.trigger = hatchVmWakeTrigger;
        this.connectionCycleStartNs = l;
        this.connectionCycleStartWallTimeMs = l2;
        this.attemptCounter = BV4.A13(0);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @Override // com.facebook.aura.network.transport.HatchHttpRequestAttemptObserverFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver create() {
        /*
            r13 = this;
            java.lang.Long r0 = r13.connectionCycleStartNs
            if (r0 == 0) goto L9
            java.lang.Long r0 = r13.connectionCycleStartWallTimeMs
            r2 = 1
            if (r0 != 0) goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = X.BV5.A0j()
            java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory.nextInstanceKey
            int r4 = r0.incrementAndGet()
            java.lang.String r5 = r13.connectionAttemptId
            int r6 = r13.retryCount
            com.facebook.aura.gateway.HatchVmWakeTrigger r7 = r13.trigger
            java.util.concurrent.atomic.AtomicInteger r0 = r13.attemptCounter
            int r0 = r0.getAndIncrement()
            boolean r8 = X.AnonymousClass002.A1N(r0)
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L40
            java.lang.Long r0 = r13.connectionCycleStartNs
            if (r0 == 0) goto L50
            long r9 = r0.longValue()
            java.lang.Long r0 = r13.connectionCycleStartWallTimeMs
            if (r0 == 0) goto L4b
            long r11 = r0.longValue()
            java.lang.String r13 = "connection_cycle"
        L3a:
            com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver r2 = new com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory$HatchVmWakeQplAttemptObserver
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13)
            return r2
        L40:
            long r9 = java.lang.System.nanoTime()
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = "request_dispatch"
            goto L3a
        L4b:
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r1)
            throw r0
        L50:
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmWakeQplAttemptObserverFactory.create():com.facebook.aura.network.transport.HatchHttpRequestAttemptObserver");
    }
}
