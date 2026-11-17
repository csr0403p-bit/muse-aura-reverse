package com.facebook.aura.perf;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;

/* loaded from: classes3.dex */
public final class HatchNavQueryTrace {
    public static final Companion Companion = new Companion();
    public final HatchNavTTRCCoordinator.TraceToken activeTraceToken;
    public final HatchNavTTRCCoordinator coordinator;
    public final HatchNavTTRCSpec.FailedSource failedSource;
    public final String fetchEndPoint;
    public final String query;
    public final boolean shouldRecordObservedOnDisplay;
    public final boolean shouldTrackTraceQuery;
    public final HatchNavTTRCSpec.Surface surface;

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[PHI: r9 r10
  0x0029: PHI (r9v4 com.facebook.aura.perf.HatchNavTTRCCoordinator$TraceToken) = 
  (r9v2 com.facebook.aura.perf.HatchNavTTRCCoordinator$TraceToken)
  (r9v2 com.facebook.aura.perf.HatchNavTTRCCoordinator$TraceToken)
  (r9v5 com.facebook.aura.perf.HatchNavTTRCCoordinator$TraceToken)
 binds: [B:18:0x0032, B:20:0x0035, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r10v3 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v4 boolean) binds: [B:18:0x0032, B:20:0x0035, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.perf.HatchNavQueryTrace begin(com.facebook.aura.perf.HatchNavTTRCCoordinator r5, com.facebook.aura.perf.HatchNavTTRCSpec.Surface r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.facebook.aura.perf.HatchNavTTRCSpec.FailedSource r10, boolean r11) {
            /*
                r4 = this;
                r3 = r5
                r4 = r6
                r5 = r7
                r6 = r9
                X.AnonymousClass005.A17(r3, r4, r7, r8, r9)
                r0 = 5
                r7 = r10
                X.C7384Etj.A0Y(r10, r0)
                r9 = 0
                if (r11 == 0) goto L30
                com.facebook.aura.perf.HatchNavTTRCCoordinator$ActiveTraceState r2 = r3.captureActiveTraceState(r4)
                if (r2 == 0) goto L31
                com.facebook.aura.perf.HatchNavTTRCSpec$LoadType r1 = r2.loadType
                com.facebook.aura.perf.HatchNavTTRCSpec$LoadType r0 = com.facebook.aura.perf.HatchNavTTRCSpec.LoadType.COLD
                if (r1 != r0) goto L31
                com.facebook.aura.perf.HatchNavTTRCCoordinator$TraceToken r9 = r2.token
                if (r9 == 0) goto L31
                boolean r0 = r3.hasObservedQuery(r4, r5)
                if (r0 != 0) goto L31
                r10 = 1
                r3.onDiagnosticPoint(r4, r8, r9)
            L29:
                r8 = 0
            L2a:
                com.facebook.aura.perf.HatchNavQueryTrace r2 = new com.facebook.aura.perf.HatchNavQueryTrace
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                return r2
            L30:
                r2 = r9
            L31:
                r10 = 0
                if (r11 == 0) goto L29
                r8 = 1
                if (r2 == 0) goto L2a
                goto L29
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.perf.HatchNavQueryTrace.Companion.begin(com.facebook.aura.perf.HatchNavTTRCCoordinator, com.facebook.aura.perf.HatchNavTTRCSpec$Surface, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.perf.HatchNavTTRCSpec$FailedSource, boolean):com.facebook.aura.perf.HatchNavQueryTrace");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void annotate(String str, Object obj) {
        C7384Etj.A0Y(str, 0);
        HatchNavTTRCCoordinator.TraceToken traceToken = this.activeTraceToken;
        if (traceToken != null) {
            this.coordinator.annotate(this.surface, str, obj, traceToken);
        }
    }

    public final HatchNavTTRCCoordinator.TraceToken getActiveTraceToken() {
        return this.activeTraceToken;
    }

    public final boolean getQueryWasObservedBeforeStart() {
        return (this.activeTraceToken == null || this.shouldTrackTraceQuery) ? false : true;
    }

    public final boolean getShouldTrackTraceQuery() {
        return this.shouldTrackTraceQuery;
    }

    public final void onDisplayed() {
        if (this.shouldTrackTraceQuery) {
            this.coordinator.onDiagnosticPoint(this.surface, this.fetchEndPoint, this.activeTraceToken);
            this.coordinator.onQueryDisplayed(this.surface, this.query, this.activeTraceToken);
        } else if (this.shouldRecordObservedOnDisplay) {
            this.coordinator.recordObservedQuery(this.surface, this.query);
        }
    }

    public final void onFailure(String str, String str2) {
        if (this.shouldTrackTraceQuery) {
            this.coordinator.onFailure(this.surface, HatchNavTTRCSpec.FailureReason.DATA_FETCH_FAILED, str, str2, this.failedSource, this.activeTraceToken);
        }
    }

    public HatchNavQueryTrace(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, String str, String str2, HatchNavTTRCSpec.FailedSource failedSource, boolean z, HatchNavTTRCCoordinator.TraceToken traceToken, boolean z2) {
        this.coordinator = hatchNavTTRCCoordinator;
        this.surface = surface;
        this.query = str;
        this.fetchEndPoint = str2;
        this.failedSource = failedSource;
        this.shouldRecordObservedOnDisplay = z;
        this.activeTraceToken = traceToken;
        this.shouldTrackTraceQuery = z2;
    }

    public /* synthetic */ HatchNavQueryTrace(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, String str, String str2, HatchNavTTRCSpec.FailedSource failedSource, boolean z, HatchNavTTRCCoordinator.TraceToken traceToken, boolean z2, C06H c06h) {
        this(hatchNavTTRCCoordinator, surface, str, str2, failedSource, z, traceToken, z2);
    }
}
