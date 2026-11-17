package com.facebook.aura.perf;

import X.AbstractC2258BHp;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C60P;
import X.C6tn;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC7549F2g;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchNavTTRCCoordinator implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final int MAX_ERROR_MESSAGE_LENGTH = 200;
    public static boolean isProcessColdStart = true;
    public ActiveTrace activeTrace;
    public final EnumMap<HatchNavTTRCSpec.Surface, Set<String>> displayedQueriesBySurface;
    public final HatchNavTTRCTraceLogger logger;
    public int nextInstanceId;
    public final LinkedHashSet<HatchNavTTRCSpec.Surface> successfulSurfaces;

    public final class ActiveTrace extends C06G {
        public final HatchNavTTRCSpec.LoadType loadType;
        public final TraceToken token;
        public final HatchNavTTRCTrace trace;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActiveTrace) {
                    ActiveTrace activeTrace = (ActiveTrace) obj;
                    if (!C7384Etj.areEqual(this.token, activeTrace.token) || this.loadType != activeTrace.loadType || !C7384Etj.areEqual(this.trace, activeTrace.trace)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActiveTrace copy$default(ActiveTrace activeTrace, TraceToken traceToken, HatchNavTTRCSpec.LoadType loadType, HatchNavTTRCTrace hatchNavTTRCTrace, int i, Object obj) {
            if ((i & 1) != 0) {
                traceToken = activeTrace.token;
            }
            if ((i & 2) != 0) {
                loadType = activeTrace.loadType;
            }
            if ((i & 4) != 0) {
                hatchNavTTRCTrace = activeTrace.trace;
            }
            return activeTrace.copy(traceToken, loadType, hatchNavTTRCTrace);
        }

        public final TraceToken component1() {
            return this.token;
        }

        public final HatchNavTTRCSpec.LoadType component2() {
            return this.loadType;
        }

        public final HatchNavTTRCTrace component3() {
            return this.trace;
        }

        public final HatchNavTTRCSpec.LoadType getLoadType() {
            return this.loadType;
        }

        public final TraceToken getToken() {
            return this.token;
        }

        public final HatchNavTTRCTrace getTrace() {
            return this.trace;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.trace, AnonymousClass005.A0F(this.loadType, AnonymousClass005.A0E(this.token)));
        }

        public ActiveTrace(TraceToken traceToken, HatchNavTTRCSpec.LoadType loadType, HatchNavTTRCTrace hatchNavTTRCTrace) {
            AnonymousClass005.A0x(traceToken, loadType, hatchNavTTRCTrace);
            this.token = traceToken;
            this.loadType = loadType;
            this.trace = hatchNavTTRCTrace;
        }

        public final ActiveTrace copy(TraceToken traceToken, HatchNavTTRCSpec.LoadType loadType, HatchNavTTRCTrace hatchNavTTRCTrace) {
            AnonymousClass005.A0x(traceToken, loadType, hatchNavTTRCTrace);
            return new ActiveTrace(traceToken, loadType, hatchNavTTRCTrace);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ActiveTraceState extends C06G {
        public final HatchNavTTRCSpec.LoadType loadType;
        public final TraceToken token;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActiveTraceState) {
                    ActiveTraceState activeTraceState = (ActiveTraceState) obj;
                    if (!C7384Etj.areEqual(this.token, activeTraceState.token) || this.loadType != activeTraceState.loadType) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActiveTraceState copy$default(ActiveTraceState activeTraceState, TraceToken traceToken, HatchNavTTRCSpec.LoadType loadType, int i, Object obj) {
            if ((i & 1) != 0) {
                traceToken = activeTraceState.token;
            }
            if ((i & 2) != 0) {
                loadType = activeTraceState.loadType;
            }
            AnonymousClass003.A0u(traceToken, loadType);
            return new ActiveTraceState(traceToken, loadType);
        }

        public final TraceToken component1() {
            return this.token;
        }

        public final HatchNavTTRCSpec.LoadType component2() {
            return this.loadType;
        }

        public final HatchNavTTRCSpec.LoadType getLoadType() {
            return this.loadType;
        }

        public final TraceToken getToken() {
            return this.token;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.loadType, AnonymousClass005.A0E(this.token));
        }

        public ActiveTraceState(TraceToken traceToken, HatchNavTTRCSpec.LoadType loadType) {
            AnonymousClass003.A0u(traceToken, loadType);
            this.token = traceToken;
            this.loadType = loadType;
        }

        public final ActiveTraceState copy(TraceToken traceToken, HatchNavTTRCSpec.LoadType loadType) {
            AnonymousClass003.A0u(traceToken, loadType);
            return new ActiveTraceState(traceToken, loadType);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class TraceToken extends C06G {
        public final int instanceId;
        public final HatchNavTTRCSpec.Surface surface;

        public TraceToken(int i, HatchNavTTRCSpec.Surface surface) {
            C7384Etj.A0Y(surface, 1);
            this.instanceId = i;
            this.surface = surface;
        }

        public final TraceToken copy(int i, HatchNavTTRCSpec.Surface surface) {
            C7384Etj.A0Y(surface, 1);
            return new TraceToken(i, surface);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof TraceToken) {
                    TraceToken traceToken = (TraceToken) obj;
                    if (this.instanceId != traceToken.instanceId || this.surface != traceToken.surface) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ TraceToken copy$default(TraceToken traceToken, int i, HatchNavTTRCSpec.Surface surface, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = traceToken.instanceId;
            }
            if ((i2 & 2) != 0) {
                surface = traceToken.surface;
            }
            C7384Etj.A0Y(surface, 1);
            return new TraceToken(i, surface);
        }

        public final int component1() {
            return this.instanceId;
        }

        public final HatchNavTTRCSpec.Surface component2() {
            return this.surface;
        }

        public final int getInstanceId() {
            return this.instanceId;
        }

        public final HatchNavTTRCSpec.Surface getSurface() {
            return this.surface;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.surface, this.instanceId * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$annotate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ Object $value;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.annotate(this.$key, this.$value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Object obj) {
            super(1);
            this.$key = str;
            this.$value = obj;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$onDiagnosticPoint$1, reason: invalid class name and case insensitive filesystem */
    public final class C134321 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public final /* synthetic */ String $pointName;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.markerPoint(this.$pointName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134321(String str) {
            super(1);
            this.$pointName = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$onFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C134331 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $errorType;
        public final /* synthetic */ HatchNavTTRCSpec.FailedSource $failedSource;
        public final /* synthetic */ HatchNavTTRCSpec.FailureReason $failureReason;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            String strA03;
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.annotate(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, this.$failureReason.getValue());
            String str = this.$errorType;
            if (str != null) {
                hatchNavTTRCTrace.annotate("error_type", str);
            }
            String str2 = this.$errorMessage;
            if (str2 != null && (strA03 = C6tn.A03(str2)) != null) {
                hatchNavTTRCTrace.annotate(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, strA03);
            }
            HatchNavTTRCSpec.FailedSource failedSource = this.$failedSource;
            if (failedSource != null) {
                hatchNavTTRCTrace.annotate(HatchNavTTRCSpec.AnnotationKeys.FAILED_SOURCE, failedSource.getValue());
            }
            hatchNavTTRCTrace.fail(this.$failureReason.getValue());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134331(HatchNavTTRCSpec.FailureReason failureReason, String str, String str2, HatchNavTTRCSpec.FailedSource failedSource) {
            super(1);
            this.$failureReason = failureReason;
            this.$errorType = str;
            this.$errorMessage = str2;
            this.$failedSource = failedSource;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$onQueryDisplayed$1, reason: invalid class name and case insensitive filesystem */
    public final class C134341 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public final /* synthetic */ String $query;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.displayQuery(this.$query);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134341(String str) {
            super(1);
            this.$query = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$onStepNotNeeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C134351 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public final /* synthetic */ String $step;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.revokeStep(this.$step);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134351(String str) {
            super(1);
            this.$step = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HatchNavTTRCCoordinator(HatchNavTTRCTraceLogger hatchNavTTRCTraceLogger, int i, C06H c06h) {
        HatchNavTTRCTraceLogger hatchNavTTRCLogger = hatchNavTTRCTraceLogger;
        if ((i & 1) != 0) {
            hatchNavTTRCLogger = new HatchNavTTRCLogger(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }
        this(hatchNavTTRCLogger);
    }

    private final synchronized void mutateMatchingTrace(HatchNavTTRCSpec.Surface surface, TraceToken traceToken, G0U<? super HatchNavTTRCTrace, Unit> g0u) {
        ActiveTrace activeTrace = this.activeTrace;
        if (activeTrace != null && ((surface == null || activeTrace.token.surface == surface) && (traceToken == null || C7384Etj.areEqual(activeTrace.token, traceToken)))) {
            g0u.invoke(activeTrace.trace);
            finalizeIfTerminal(activeTrace);
        }
    }

    public final synchronized void annotate(HatchNavTTRCSpec.Surface surface, String str, Object obj, TraceToken traceToken) {
        C7384Etj.A0Y(str, 1);
        mutateMatchingTrace(surface, traceToken, new AnonymousClass1(str, obj));
    }

    public final synchronized void cancelForPushNavigation() {
        cancelActiveTrace(HatchNavTTRCSpec.CancelReason.PUSH_NAVIGATION);
    }

    public final synchronized void cancelForTabSwitch() {
        cancelActiveTrace(HatchNavTTRCSpec.CancelReason.TAB_SWITCH);
    }

    public final synchronized TraceToken captureActiveToken(HatchNavTTRCSpec.Surface surface) {
        TraceToken traceToken;
        TraceToken traceToken2;
        C7384Etj.A0Y(surface, 0);
        ActiveTrace activeTrace = this.activeTrace;
        traceToken = null;
        if (activeTrace != null && (traceToken2 = activeTrace.token) != null) {
            if (traceToken2.surface == surface) {
                traceToken = traceToken2;
            }
        }
        return traceToken;
    }

    public final synchronized ActiveTraceState captureActiveTraceState(HatchNavTTRCSpec.Surface surface) {
        ActiveTraceState activeTraceState;
        C7384Etj.A0Y(surface, 0);
        ActiveTrace activeTrace = this.activeTrace;
        activeTraceState = null;
        if (activeTrace != null) {
            TraceToken traceToken = activeTrace.token;
            if (traceToken.surface == surface) {
                activeTraceState = new ActiveTraceState(traceToken, activeTrace.loadType);
            }
        }
        return activeTraceState;
    }

    public final synchronized void clearObservedQuery(HatchNavTTRCSpec.Surface surface, String str) {
        AnonymousClass003.A0u(surface, str);
        EnumMap<HatchNavTTRCSpec.Surface, Set<String>> enumMap = this.displayedQueriesBySurface;
        C7384Etj.A0Y(enumMap, 0);
        ((Set) AbstractC2258BHp.A0L(surface, enumMap)).remove(str);
    }

    public final synchronized boolean hasObservedQuery(HatchNavTTRCSpec.Surface surface, String str) {
        EnumMap<HatchNavTTRCSpec.Surface, Set<String>> enumMap;
        AnonymousClass003.A0u(surface, str);
        enumMap = this.displayedQueriesBySurface;
        C7384Etj.A0Y(enumMap, 0);
        return ((Set) AbstractC2258BHp.A0L(surface, enumMap)).contains(str);
    }

    public final synchronized void onDiagnosticPoint(HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken) {
        C7384Etj.A0Y(str, 1);
        mutateMatchingTrace(surface, traceToken, new C134321(str));
    }

    public final synchronized void onFailure(HatchNavTTRCSpec.Surface surface, HatchNavTTRCSpec.FailureReason failureReason, String str, String str2, HatchNavTTRCSpec.FailedSource failedSource, TraceToken traceToken) {
        C7384Etj.A0Y(failureReason, 1);
        mutateMatchingTrace(surface, traceToken, new C134331(failureReason, str, str2, failedSource));
    }

    public final synchronized void onQueryDisplayed(HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken) {
        AnonymousClass003.A0u(surface, str);
        recordObservedQuery(surface, str);
        mutateMatchingQuery(surface, str, traceToken, new C134341(str));
    }

    public final synchronized void onStepNotNeeded(HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken) {
        AnonymousClass003.A0u(surface, str);
        mutateMatchingTrace(surface, traceToken, new C134351(str));
    }

    public final synchronized void onViewFinished(HatchNavTTRCSpec.Surface surface, TraceToken traceToken) {
        C7384Etj.A0Y(surface, 0);
        mutateMatchingTrace(surface, traceToken, C134361.INSTANCE);
    }

    public final synchronized void onWebViewLoaded(TraceToken traceToken) {
        mutateMatchingTrace(HatchNavTTRCSpec.Surface.SPACES, traceToken, C134371.INSTANCE);
    }

    public final synchronized void recordObservedQuery(HatchNavTTRCSpec.Surface surface, String str) {
        AnonymousClass003.A0u(surface, str);
        EnumMap<HatchNavTTRCSpec.Surface, Set<String>> enumMap = this.displayedQueriesBySurface;
        C7384Etj.A0Y(enumMap, 0);
        ((Set) AbstractC2258BHp.A0L(surface, enumMap)).add(str);
    }

    public final synchronized TraceToken startNavigation(HatchNavTTRCSpec.Surface surface, boolean z, boolean z2, Long l, HatchNavTTRCSpec.Surface surface2) {
        ActiveTrace activeTrace;
        C7384Etj.A0Y(surface, 0);
        cancelActiveTrace(HatchNavTTRCSpec.CancelReason.TAB_SWITCH);
        boolean zConsumeProcessColdStart = Companion.consumeProcessColdStart();
        HatchNavTTRCSpec.LoadType loadType = this.successfulSurfaces.contains(surface) ? HatchNavTTRCSpec.LoadType.WARM : HatchNavTTRCSpec.LoadType.COLD;
        HatchNavTTRCTraceLogger hatchNavTTRCTraceLogger = this.logger;
        int i = HatchNavTTRCSpec.MARKER_ID;
        int i2 = this.nextInstanceId;
        this.nextInstanceId = i2 + 1;
        HatchNavTTRCTrace hatchNavTTRCTraceStartTrace = hatchNavTTRCTraceLogger.startTrace(new HatchNavTTRCStartTraceParams(i, i2, l, surface2 != null ? surface2.getValue() : null));
        activeTrace = new ActiveTrace(new TraceToken(hatchNavTTRCTraceStartTrace.getInstanceId(), surface), loadType, hatchNavTTRCTraceStartTrace);
        registerExpectations(activeTrace);
        annotateStart(activeTrace, z, zConsumeProcessColdStart, z2);
        this.activeTrace = activeTrace;
        applyObservedQueries(activeTrace);
        finalizeIfTerminal(activeTrace);
        return activeTrace.token;
    }

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean consumeProcessColdStart() {
            if (!HatchNavTTRCCoordinator.isProcessColdStart) {
                return false;
            }
            HatchNavTTRCCoordinator.isProcessColdStart = false;
            return true;
        }

        public final HatchNavTTRCCoordinator getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchNavTTRCCoordinator) abstractC3358CGz.A03(HatchNavTTRCCoordinator.class, HatchNavTTRCCoordinator$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchNavTTRCTraceTerminalState.values().length];
            try {
                AnonymousClass005.A0v(HatchNavTTRCTraceTerminalState.SUCCESS, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchNavTTRCTraceTerminalState.FAILURE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchNavTTRCSpec.Surface.values().length];
            try {
                AnonymousClass005.A0v(HatchNavTTRCSpec.Surface.CHAT, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchNavTTRCSpec.Surface.SPACES, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(HatchNavTTRCSpec.Surface.LIBRARY, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(HatchNavTTRCSpec.Surface.GOALS, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(HatchNavTTRCSpec.Surface.IDEAS, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void annotate$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, String str, Object obj, TraceToken traceToken, int i, Object obj2) {
        if ((i & 8) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.annotate(surface, str, obj, traceToken);
    }

    private final void annotateStart(ActiveTrace activeTrace, boolean z, boolean z2, boolean z3) {
        activeTrace.trace.annotate("surface", activeTrace.token.surface.getValue());
        activeTrace.trace.annotate(HatchNavTTRCSpec.AnnotationKeys.LOAD_TYPE, activeTrace.loadType.getValue());
        activeTrace.trace.annotate(HatchNavTTRCSpec.AnnotationKeys.IS_DEEPLINK, Boolean.valueOf(z));
        activeTrace.trace.annotate(HatchNavTTRCSpec.AnnotationKeys.IS_COLD_START, Boolean.valueOf(z2));
        activeTrace.trace.annotate(HatchNavTTRCSpec.AnnotationKeys.GATEWAY_CONNECTED, Boolean.valueOf(z3));
    }

    private final void applyObservedQueries(ActiveTrace activeTrace) {
        if (activeTrace.loadType == HatchNavTTRCSpec.LoadType.COLD) {
            EnumMap<HatchNavTTRCSpec.Surface, Set<String>> enumMap = this.displayedQueriesBySurface;
            HatchNavTTRCSpec.Surface surface = activeTrace.token.surface;
            C7384Etj.A0Y(enumMap, 0);
            Object objA0L = AbstractC2258BHp.A0L(surface, enumMap);
            C7384Etj.A0U(objA0L);
            for (String str : (Iterable) objA0L) {
                if (isRegisteredQuery(activeTrace, str)) {
                    activeTrace.trace.displayQuery(str);
                }
            }
        }
    }

    private final void cancelActiveTrace(HatchNavTTRCSpec.CancelReason cancelReason) {
        ActiveTrace activeTrace = this.activeTrace;
        if (activeTrace != null) {
            activeTrace.trace.annotate("cancel_reason", cancelReason.getValue());
            activeTrace.trace.cancel(cancelReason.getValue());
            finalizeIfTerminal(activeTrace);
        }
    }

    private final void finalizeIfTerminal(ActiveTrace activeTrace) {
        HatchNavTTRCTraceTerminalState terminalState;
        int iOrdinal;
        ActiveTrace activeTrace2 = this.activeTrace;
        if (!C7384Etj.areEqual(activeTrace2 != null ? activeTrace2.token : null, activeTrace.token) || (terminalState = activeTrace.trace.getTerminalState()) == null || (iOrdinal = terminalState.ordinal()) == -1) {
            return;
        }
        if (iOrdinal == 0) {
            this.successfulSurfaces.add(activeTrace.token.surface);
            this.activeTrace = null;
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            this.activeTrace = null;
        }
    }

    private final boolean isRegisteredQuery(ActiveTrace activeTrace, String str) {
        return activeTrace.loadType == HatchNavTTRCSpec.LoadType.COLD && coldQueries(activeTrace.token.surface).contains(str);
    }

    private final void mutateMatchingQuery(HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken, G0U<? super HatchNavTTRCTrace, Unit> g0u) {
        ActiveTrace activeTrace = this.activeTrace;
        if (activeTrace != null) {
            TraceToken traceToken2 = activeTrace.token;
            if (traceToken2.surface == surface) {
                if ((traceToken == null || traceToken2.equals(traceToken)) && isRegisteredQuery(activeTrace, str)) {
                    g0u.invoke(activeTrace.trace);
                    finalizeIfTerminal(activeTrace);
                }
            }
        }
    }

    public static /* synthetic */ void onDiagnosticPoint$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken, int i, Object obj) {
        if ((i & 4) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.onDiagnosticPoint(surface, str, traceToken);
    }

    public static /* synthetic */ void onFailure$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, HatchNavTTRCSpec.FailureReason failureReason, String str, String str2, HatchNavTTRCSpec.FailedSource failedSource, TraceToken traceToken, int i, Object obj) {
        if ((i & 16) != 0) {
            failedSource = null;
        }
        if ((i & 32) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.onFailure(surface, failureReason, str, str2, failedSource, traceToken);
    }

    public static /* synthetic */ void onQueryDisplayed$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken, int i, Object obj) {
        if ((i & 4) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.onQueryDisplayed(surface, str, traceToken);
    }

    public static /* synthetic */ void onStepNotNeeded$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, String str, TraceToken traceToken, int i, Object obj) {
        if ((i & 4) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.onStepNotNeeded(surface, str, traceToken);
    }

    public static /* synthetic */ void onViewFinished$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, TraceToken traceToken, int i, Object obj) {
        if ((i & 2) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.onViewFinished(surface, traceToken);
    }

    public static /* synthetic */ void onWebViewLoaded$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, TraceToken traceToken, int i, Object obj) {
        if ((i & 1) != 0) {
            traceToken = null;
        }
        hatchNavTTRCCoordinator.onWebViewLoaded(traceToken);
    }

    private final void registerExpectations(ActiveTrace activeTrace) {
        Set<String> setRequiredSteps = requiredSteps(activeTrace.token.surface);
        HatchNavTTRCTrace hatchNavTTRCTrace = activeTrace.trace;
        Iterator<String> it = setRequiredSteps.iterator();
        while (it.hasNext()) {
            hatchNavTTRCTrace.registerStep(it.next());
        }
        if (activeTrace.loadType == HatchNavTTRCSpec.LoadType.COLD) {
            Set<String> setColdQueries = coldQueries(activeTrace.token.surface);
            HatchNavTTRCTrace hatchNavTTRCTrace2 = activeTrace.trace;
            Iterator<String> it2 = setColdQueries.iterator();
            while (it2.hasNext()) {
                hatchNavTTRCTrace2.registerNetworkOnlyQuery(it2.next());
            }
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        cancelActiveTrace(HatchNavTTRCSpec.CancelReason.PUSH_NAVIGATION);
        this.successfulSurfaces.clear();
        Iterator itA1R = C60P.A1R(this.displayedQueriesBySurface);
        while (itA1R.hasNext()) {
            ((Set) itA1R.next()).clear();
        }
        this.nextInstanceId = 0;
    }

    private final Set<String> coldQueries(HatchNavTTRCSpec.Surface surface) {
        int iOrdinal = surface.ordinal();
        if (iOrdinal == 0) {
            return HatchNavTTRCSpec.Expectations.CHAT_COLD_QUERIES;
        }
        if (iOrdinal == 1) {
            return HatchNavTTRCSpec.Expectations.SPACES_COLD_QUERIES;
        }
        if (iOrdinal == 2) {
            return HatchNavTTRCSpec.Expectations.LIBRARY_COLD_QUERIES;
        }
        if (iOrdinal == 3) {
            return HatchNavTTRCSpec.Expectations.GOALS_COLD_QUERIES;
        }
        if (iOrdinal == 4) {
            return HatchNavTTRCSpec.Expectations.IDEAS_COLD_QUERIES;
        }
        throw C3cG.A0q();
    }

    private final Set<String> requiredSteps(HatchNavTTRCSpec.Surface surface) {
        int iOrdinal = surface.ordinal();
        if (iOrdinal == 0) {
            return HatchNavTTRCSpec.Expectations.CHAT_STEPS;
        }
        if (iOrdinal == 1) {
            return HatchNavTTRCSpec.Expectations.SPACES_STEPS;
        }
        if (iOrdinal == 2) {
            return HatchNavTTRCSpec.Expectations.LIBRARY_STEPS;
        }
        if (iOrdinal == 3) {
            return HatchNavTTRCSpec.Expectations.GOALS_STEPS;
        }
        if (iOrdinal == 4) {
            return HatchNavTTRCSpec.Expectations.IDEAS_STEPS;
        }
        throw C3cG.A0q();
    }

    public static /* synthetic */ TraceToken startNavigation$default(HatchNavTTRCCoordinator hatchNavTTRCCoordinator, HatchNavTTRCSpec.Surface surface, boolean z, boolean z2, Long l, HatchNavTTRCSpec.Surface surface2, int i, Object obj) {
        boolean zA1Q = AnonymousClass001.A1Q(i, z);
        boolean zA1O = AnonymousClass005.A1O(i, z2);
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            surface2 = null;
        }
        return hatchNavTTRCCoordinator.startNavigation(surface, zA1Q, zA1O, l, surface2);
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$onViewFinished$1, reason: invalid class name and case insensitive filesystem */
    public final class C134361 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public static final C134361 INSTANCE = new C134361();

        public C134361() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.completeStep(HatchNavTTRCSpec.Steps.VIEW_FINISHED);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.perf.HatchNavTTRCCoordinator$onWebViewLoaded$1, reason: invalid class name and case insensitive filesystem */
    public final class C134371 extends AbstractC7559F3s implements G0U<HatchNavTTRCTrace, Unit> {
        public static final C134371 INSTANCE = new C134371();

        public C134371() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchNavTTRCTrace hatchNavTTRCTrace) {
            C7384Etj.A0Y(hatchNavTTRCTrace, 0);
            hatchNavTTRCTrace.completeStep(HatchNavTTRCSpec.Steps.WEBVIEW_LOADED);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchNavTTRCTrace hatchNavTTRCTrace) {
            invoke2(hatchNavTTRCTrace);
            return Unit.INSTANCE;
        }
    }

    public HatchNavTTRCCoordinator(HatchNavTTRCTraceLogger hatchNavTTRCTraceLogger) {
        C7384Etj.A0Y(hatchNavTTRCTraceLogger, 0);
        this.logger = hatchNavTTRCTraceLogger;
        this.successfulSurfaces = C3cG.A0k();
        EnumMap<HatchNavTTRCSpec.Surface, Set<String>> enumMap = new EnumMap<>(HatchNavTTRCSpec.Surface.class);
        Iterator<HatchNavTTRCSpec.Surface> it = HatchNavTTRCSpec.Surface.getEntries().iterator();
        while (it.hasNext()) {
            enumMap.put((EnumMap<HatchNavTTRCSpec.Surface, Set<String>>) it.next(), (HatchNavTTRCSpec.Surface) new LinkedHashSet());
        }
        this.displayedQueriesBySurface = enumMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchNavTTRCCoordinator() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
