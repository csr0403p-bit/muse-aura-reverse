package com.facebook.aura.composer.dictation;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV5;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C5322DgG;
import X.C7384Etj;
import X.C78W;
import X.C7Bq;
import X.C8eO;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.composer.dictation.engine.DictationEngine;
import com.facebook.aura.composer.dictation.engine.DictationEngineListener;
import com.facebook.aura.composer.dictation.engine.DictationMode;
import com.facebook.aura.composer.dictation.engine.DictationOutcome;
import com.facebook.aura.composer.dictation.engine.DictationRequest;
import com.facebook.aura.composer.dictation.engine.EndOfTurnCountdown;
import com.facebook.aura.composer.dictation.ondevice.OnDeviceDictationEngine;
import com.facebook.aura.executors.AuraDispatchers;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchVoiceDictationService {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long MAX_CAPTURE_DURATION_MS = 600000;
    public static final String TAG = "HatchVoiceDictationService";
    public volatile long captureLimitReachedAtMs;
    public volatile String clientSessionId;
    public final Long connectDeadlineMs;
    public final Context context;
    public volatile DictationEngine engine;
    public final Function0<Boolean> isLowBandwidthLink;
    public final boolean isOnDeviceSupported;
    public volatile DictationEngine lastEngine;
    public DictationMode mode;
    public final Function0<Boolean> oggOpus;
    public G0U<? super Long, Unit> onCaptureLimitReached;
    public Function0<Unit> onCaptureStarted;
    public Function0<Unit> onConnected;
    public G0U<? super EndOfTurnCountdown, Unit> onEndOfTurnCountdown;
    public Function0<Unit> onEndpointReached;
    public G0U<? super DictationOutcome, Unit> onStoppedListener;
    public volatile DictationMode recordingMode;
    public final boolean retriesAutoSubmit;
    public final C3UX scope;
    public volatile HoC sessionLimitJob;
    public G0V<? super String, ? super Boolean, Unit> transcriptionListener;
    public DictationEngineType transport;
    public final AbstractC3358CGz userSession;

    public final class EngineListener implements DictationEngineListener {
        public final F0C showsTraditionalChinese$delegate;
        public final DictationEngine target;
        public final /* synthetic */ HatchVoiceDictationService this$0;
        public final DictationEngineType type;

        @Override // com.facebook.aura.composer.dictation.engine.DictationEngineListener
        public void onStopped(DictationOutcome dictationOutcome) {
            C7384Etj.A0Y(dictationOutcome, 0);
            if (this.type == DictationEngineType.VM && dictationOutcome == DictationOutcome.FAILED) {
                DictationEngineSelector.INSTANCE.recordVmFailure(this.this$0.userSession);
            }
            HatchVoiceDictationService hatchVoiceDictationService = this.this$0;
            synchronized (hatchVoiceDictationService) {
                if (hatchVoiceDictationService.engine != this.target) {
                    return;
                }
                HoC hoC = hatchVoiceDictationService.sessionLimitJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                hatchVoiceDictationService.sessionLimitJob = null;
                hatchVoiceDictationService.engine = null;
                G0U<? super DictationOutcome, Unit> g0u = hatchVoiceDictationService.onStoppedListener;
                if (g0u != null) {
                    g0u.invoke(dictationOutcome);
                }
            }
        }

        @Override // com.facebook.aura.composer.dictation.engine.DictationEngineListener
        public void onTranscript(String str, boolean z) {
            G0V<? super String, ? super Boolean, Unit> g0v;
            C7384Etj.A0Y(str, 0);
            if (this.this$0.engine != this.target || (g0v = this.this$0.transcriptionListener) == null) {
                return;
            }
            if (getShowsTraditionalChinese()) {
                str = DictationLanguages.INSTANCE.toTraditionalChinese(str);
            }
            g0v.invoke(str, Boolean.valueOf(z));
        }

        private final boolean getShowsTraditionalChinese() {
            return AnonymousClass001.A1X(this.showsTraditionalChinese$delegate.getValue());
        }

        @Override // com.facebook.aura.composer.dictation.engine.DictationEngineListener
        public void onCaptureStarted() {
            Function0<Unit> function0;
            if (this.this$0.engine != this.target || (function0 = this.this$0.onCaptureStarted) == null) {
                return;
            }
            function0.invoke();
        }

        @Override // com.facebook.aura.composer.dictation.engine.DictationEngineListener
        public void onConnected() {
            Function0<Unit> function0;
            if (this.this$0.engine != this.target || (function0 = this.this$0.onConnected) == null) {
                return;
            }
            function0.invoke();
        }

        @Override // com.facebook.aura.composer.dictation.engine.DictationEngineListener
        public void onEndOfTurnCountdown(EndOfTurnCountdown endOfTurnCountdown) {
            G0U<? super EndOfTurnCountdown, Unit> g0u;
            if (this.this$0.engine != this.target || (g0u = this.this$0.onEndOfTurnCountdown) == null) {
                return;
            }
            g0u.invoke(endOfTurnCountdown);
        }

        @Override // com.facebook.aura.composer.dictation.engine.DictationEngineListener
        public void onEndpoint() {
            Function0<Unit> function0;
            if (this.this$0.engine != this.target || (function0 = this.this$0.onEndpointReached) == null) {
                return;
            }
            function0.invoke();
        }

        public EngineListener(HatchVoiceDictationService hatchVoiceDictationService, DictationEngine dictationEngine, DictationEngineType dictationEngineType) {
            AnonymousClass003.A0x(dictationEngine, dictationEngineType);
            this.this$0 = hatchVoiceDictationService;
            this.target = dictationEngine;
            this.type = dictationEngineType;
            this.showsTraditionalChinese$delegate = C5322DgG.A01((Function0) new HatchVoiceDictationService$EngineListener$showsTraditionalChinese$2(this, hatchVoiceDictationService));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.HatchVoiceDictationService$armSessionLimit$1", f = "HatchVoiceDictationService.kt", l = {133}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.HatchVoiceDictationService$armSessionLimit$1, reason: invalid class name and case insensitive filesystem */
    public final class C111521 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DictationEngine $target;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111521(DictationEngine dictationEngine, HtJ<? super C111521> htJ) {
            super(2, htJ);
            this.$target = dictationEngine;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVoiceDictationService.this.new C111521(this.$target, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(600000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchVoiceDictationService.this.stopExpiredInteraction(this.$target);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C111521) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.composer.dictation.HatchVoiceDictationService$startInteraction$1", f = "HatchVoiceDictationService.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.dictation.HatchVoiceDictationService$startInteraction$1, reason: invalid class name and case insensitive filesystem */
    public final class C111531 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C111531(HtJ<? super C111531> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchVoiceDictationService.this.new C111531(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchVoiceDictationService.this.new C111531(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            G0U<? super DictationOutcome, Unit> g0u = HatchVoiceDictationService.this.onStoppedListener;
            if (g0u != null) {
                g0u.invoke(DictationOutcome.FAILED);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void stopExpiredInteraction(DictationEngine dictationEngine) {
        if (this.engine == dictationEngine) {
            CFK.A06(TAG, "Maximum dictation duration reached");
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.captureLimitReachedAtMs = jElapsedRealtime;
            G0U<? super Long, Unit> g0u = this.onCaptureLimitReached;
            if (g0u != null) {
                g0u.invoke(Long.valueOf(jElapsedRealtime));
            }
            dictationEngine.stop();
        }
    }

    public final synchronized void forceStopInteraction() {
        HoC hoC = this.sessionLimitJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        DictationEngine dictationEngine = this.engine;
        if (dictationEngine != null) {
            dictationEngine.cancel();
        }
    }

    public final synchronized float getVolume() {
        DictationEngine dictationEngine;
        dictationEngine = this.engine;
        return dictationEngine != null ? dictationEngine.volumeDb() : -160.0f;
    }

    public final synchronized float getWaveformVolume() {
        DictationEngine dictationEngine;
        dictationEngine = this.engine;
        return dictationEngine != null ? dictationEngine.waveformVolumeDb() : -160.0f;
    }

    public final synchronized boolean isAwaitingStopResult() {
        boolean z;
        DictationEngine dictationEngine = this.engine;
        z = false;
        if (dictationEngine != null) {
            if (dictationEngine.isFinalizing()) {
                z = true;
            }
        }
        return z;
    }

    public final void setMode(DictationMode dictationMode) {
        C7384Etj.A0Y(dictationMode, 0);
        this.mode = dictationMode;
    }

    public final synchronized void startInteraction(boolean z) {
        DictationEngine dictationEngine = this.engine;
        this.engine = null;
        if (dictationEngine != null) {
            dictationEngine.cancel();
        }
        this.captureLimitReachedAtMs = 0L;
        this.clientSessionId = BV5.A0j();
        DictationEngineSelector dictationEngineSelector = DictationEngineSelector.INSTANCE;
        DictationEngineType dictationEngineTypeSelect = dictationEngineSelector.select(this.mode, this.userSession, this.isOnDeviceSupported);
        this.transport = dictationEngineTypeSelect;
        this.recordingMode = (!z || dictationEngineTypeSelect == null || dictationEngineTypeSelect == DictationEngineType.VM) ? this.mode : DictationMode.AUTO_SUBMIT;
        if (dictationEngineTypeSelect == null) {
            AnonymousClass001.A1J(new C111531(null), this.scope);
        } else {
            DictationEngine dictationEngineCreate = dictationEngineSelector.create(dictationEngineTypeSelect, this.userSession, this.context, this.isLowBandwidthLink, this.retriesAutoSubmit, this.connectDeadlineMs, this.oggOpus);
            this.engine = dictationEngineCreate;
            this.lastEngine = dictationEngineCreate;
            armSessionLimit(dictationEngineCreate);
            dictationEngineCreate.start(new DictationRequest(this.recordingMode, this.clientSessionId), new EngineListener(this, dictationEngineCreate, dictationEngineTypeSelect));
        }
    }

    public final synchronized void stopInteraction() {
        HoC hoC = this.sessionLimitJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        DictationEngine dictationEngine = this.engine;
        if (dictationEngine != null) {
            dictationEngine.stop();
        }
    }

    public final boolean supports(DictationMode dictationMode) {
        C7384Etj.A0Y(dictationMode, 0);
        return DictationEngineSelector.INSTANCE.select(dictationMode, this.userSession, this.isOnDeviceSupported) != null;
    }

    /* renamed from: com.facebook.aura.composer.dictation.HatchVoiceDictationService$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    /* renamed from: com.facebook.aura.composer.dictation.HatchVoiceDictationService$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return AnonymousClass001.A0h();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return AnonymousClass001.A0h();
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchVoiceDictationService(AbstractC3358CGz abstractC3358CGz, Context context, Function0 function0, boolean z, Long l, Function0 function02, int i, C06H c06h) {
        this(abstractC3358CGz, context, (i & 4) != 0 ? AnonymousClass1.INSTANCE : function0, C3cG.A1K(i & 8, z), (i & 16) != 0 ? null : l, (i & 32) != 0 ? AnonymousClass2.INSTANCE : function02);
    }

    private final void armSessionLimit(DictationEngine dictationEngine) {
        HtJ htJA13 = AnonymousClass006.A13(this.sessionLimitJob);
        this.sessionLimitJob = AnonymousClass001.A11(new C111521(dictationEngine, htJA13), this.scope);
    }

    public static /* synthetic */ void startInteraction$default(HatchVoiceDictationService hatchVoiceDictationService, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        hatchVoiceDictationService.startInteraction(z);
    }

    public final Map<String, String> captureMetadata() {
        Map<String, String> mapCaptureMetadata;
        DictationEngine dictationEngine = this.lastEngine;
        return (dictationEngine == null || (mapCaptureMetadata = dictationEngine.captureMetadata()) == null) ? AGH.A0E() : mapCaptureMetadata;
    }

    public final long getCaptureLimitReachedAtMs() {
        return this.captureLimitReachedAtMs;
    }

    public final String getClientSessionId() {
        return this.clientSessionId;
    }

    public final DictationMode getMode() {
        return this.mode;
    }

    public final G0U<Long, Unit> getOnCaptureLimitReached() {
        return this.onCaptureLimitReached;
    }

    public final Function0<Unit> getOnCaptureStarted() {
        return this.onCaptureStarted;
    }

    public final Function0<Unit> getOnConnected() {
        return this.onConnected;
    }

    public final G0U<EndOfTurnCountdown, Unit> getOnEndOfTurnCountdown() {
        return this.onEndOfTurnCountdown;
    }

    public final Function0<Unit> getOnEndpointReached() {
        return this.onEndpointReached;
    }

    public final G0U<DictationOutcome, Unit> getOnStoppedListener() {
        return this.onStoppedListener;
    }

    public final DictationMode getRecordingMode$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_dictation() {
        return this.recordingMode;
    }

    public final G0V<String, Boolean, Unit> getTranscriptionListener() {
        return this.transcriptionListener;
    }

    public final DictationEngineType getTransport() {
        return this.transport;
    }

    public final boolean wasMicSilenced() {
        DictationEngine dictationEngine = this.lastEngine;
        return dictationEngine != null && dictationEngine.wasMicSilenced();
    }

    public final boolean wasUnreachable() {
        DictationEngine dictationEngine = this.lastEngine;
        return dictationEngine != null && dictationEngine.wasUnreachable();
    }

    public final void setOnCaptureLimitReached(G0U<? super Long, Unit> g0u) {
        this.onCaptureLimitReached = g0u;
    }

    public final void setOnCaptureStarted(Function0<Unit> function0) {
        this.onCaptureStarted = function0;
    }

    public final void setOnConnected(Function0<Unit> function0) {
        this.onConnected = function0;
    }

    public final void setOnEndOfTurnCountdown(G0U<? super EndOfTurnCountdown, Unit> g0u) {
        this.onEndOfTurnCountdown = g0u;
    }

    public final void setOnEndpointReached(Function0<Unit> function0) {
        this.onEndpointReached = function0;
    }

    public final void setOnStoppedListener(G0U<? super DictationOutcome, Unit> g0u) {
        this.onStoppedListener = g0u;
    }

    public final void setTranscriptionListener(G0V<? super String, ? super Boolean, Unit> g0v) {
        this.transcriptionListener = g0v;
    }

    public HatchVoiceDictationService(AbstractC3358CGz abstractC3358CGz, Context context, Function0<Boolean> function0, boolean z, Long l, Function0<Boolean> function02) {
        AnonymousClass005.A0x(abstractC3358CGz, context, function0);
        C7384Etj.A0Y(function02, 5);
        this.userSession = abstractC3358CGz;
        this.context = context;
        this.isLowBandwidthLink = function0;
        this.retriesAutoSubmit = z;
        this.connectDeadlineMs = l;
        this.oggOpus = function02;
        DictationMode dictationMode = DictationMode.MANUAL;
        this.mode = dictationMode;
        this.recordingMode = dictationMode;
        this.clientSessionId = "";
        this.scope = C78W.A05(new C8eO(null), AuraDispatchers.INSTANCE.m764default());
        this.isOnDeviceSupported = OnDeviceDictationEngine.Companion.isSupported(context);
    }
}
