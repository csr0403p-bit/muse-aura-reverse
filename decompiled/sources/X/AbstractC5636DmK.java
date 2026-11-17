package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DmK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5636DmK implements InterfaceC5637DmL {
    public final InterfaceC5637DmL delegate;
    public static final DVI FB_TRANSFER_MONITOR_FACTORY = new DVI();
    public static final DwG DUMMY_TASOS_SIGNALS_INTERFACE_IMPL_FACTORY = new DwG();

    @Override // X.InterfaceC5637DmL
    public InterfaceC6083DvN abrMonitorObserverFactory(HeroPlayerSetting heroPlayerSetting) {
        InterfaceC6083DvN interfaceC6083DvNAbrMonitorObserverFactory;
        C7384Etj.A0Y(heroPlayerSetting, 0);
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6083DvNAbrMonitorObserverFactory = interfaceC5637DmL.abrMonitorObserverFactory(heroPlayerSetting)) == null) ? InterfaceC6083DvN.A00 : interfaceC6083DvNAbrMonitorObserverFactory;
    }

    @Override // X.InterfaceC5637DmL
    public abstract /* synthetic */ void configureMediaCodecForSDK35();

    @Override // X.InterfaceC5637DmL
    public BVQ aacAudioRendererFactory() {
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        if (interfaceC5637DmL != null) {
            return interfaceC5637DmL.aacAudioRendererFactory();
        }
        return null;
    }

    @Override // X.InterfaceC5637DmL
    public DFE abrInstrumentationHelper() {
        DFE dfeAbrInstrumentationHelper;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (dfeAbrInstrumentationHelper = interfaceC5637DmL.abrInstrumentationHelper()) == null) ? AbstractC6047Dui.A00 : dfeAbrInstrumentationHelper;
    }

    @Override // X.InterfaceC5637DmL
    public DF1 audioRoutingInterface() {
        DF1 df1AudioRoutingInterface;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (df1AudioRoutingInterface = interfaceC5637DmL.audioRoutingInterface()) == null) ? new C4928DEy() : df1AudioRoutingInterface;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6105Dvk audioSuperResolutionProcessorFactory() {
        InterfaceC6105Dvk interfaceC6105DvkAudioSuperResolutionProcessorFactory;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6105DvkAudioSuperResolutionProcessorFactory = interfaceC5637DmL.audioSuperResolutionProcessorFactory()) == null) ? InterfaceC6105Dvk.A00 : interfaceC6105DvkAudioSuperResolutionProcessorFactory;
    }

    public DVI bandwidthMeterFactory() {
        return FB_TRANSFER_MONITOR_FACTORY;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6087DvR breakpadManagerDelegate() {
        InterfaceC6087DvR interfaceC6087DvRBreakpadManagerDelegate;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6087DvRBreakpadManagerDelegate = interfaceC5637DmL.breakpadManagerDelegate()) == null) ? InterfaceC6087DvR.A00 : interfaceC6087DvRBreakpadManagerDelegate;
    }

    @Override // X.InterfaceC5637DmL
    public C5496DjY chunkExtractorFactory() {
        C5496DjY c5496DjYChunkExtractorFactory;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (c5496DjYChunkExtractorFactory = interfaceC5637DmL.chunkExtractorFactory()) == null) ? new C5496DjY() : c5496DjYChunkExtractorFactory;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6103Dvi crashReportAnnotationDelegate() {
        InterfaceC6103Dvi interfaceC6103DviCrashReportAnnotationDelegate;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6103DviCrashReportAnnotationDelegate = interfaceC5637DmL.crashReportAnnotationDelegate()) == null) ? InterfaceC6103Dvi.A00 : interfaceC6103DviCrashReportAnnotationDelegate;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6085DvP dav1dSurfaceControlPresenterFactory() {
        InterfaceC6085DvP interfaceC6085DvPDav1dSurfaceControlPresenterFactory;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6085DvPDav1dSurfaceControlPresenterFactory = interfaceC5637DmL.dav1dSurfaceControlPresenterFactory()) == null) ? InterfaceC6085DvP.A00 : interfaceC6085DvPDav1dSurfaceControlPresenterFactory;
    }

    @Override // X.InterfaceC5637DmL
    public Dw5 debugTracer() {
        Dw5 dw5DebugTracer;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (dw5DebugTracer = interfaceC5637DmL.debugTracer()) == null) ? Dw5.A00 : dw5DebugTracer;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6128DwU downloadStatusStore() {
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        if (interfaceC5637DmL != null) {
            return interfaceC5637DmL.downloadStatusStore();
        }
        return null;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6117Dvw eventLoggerFactory() {
        InterfaceC6117Dvw interfaceC6117DvwEventLoggerFactory;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6117DvwEventLoggerFactory = interfaceC5637DmL.eventLoggerFactory()) == null) ? InterfaceC6117Dvw.A00 : interfaceC6117DvwEventLoggerFactory;
    }

    @Override // X.InterfaceC5637DmL
    public C12 evictionPolicyInfoProvider() {
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        if (interfaceC5637DmL != null) {
            return interfaceC5637DmL.evictionPolicyInfoProvider();
        }
        return null;
    }

    public final InterfaceC5637DmL getDelegate() {
        return this.delegate;
    }

    public InterfaceC6109Dvo hardwareStressInterface() {
        return InterfaceC6109Dvo.A00;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6101Dvg hlsMediaSourceFactory() {
        InterfaceC6101Dvg interfaceC6101DvgHlsMediaSourceFactory;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6101DvgHlsMediaSourceFactory = interfaceC5637DmL.hlsMediaSourceFactory()) == null) ? InterfaceC6101Dvg.A00 : interfaceC6101DvgHlsMediaSourceFactory;
    }

    public /* synthetic */ InterfaceC6099Dve liveProtocolModule() {
        return InterfaceC6099Dve.A00;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6107Dvm memoryPressureInterface() {
        InterfaceC6107Dvm interfaceC6107DvmMemoryPressureInterface;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6107DvmMemoryPressureInterface = interfaceC5637DmL.memoryPressureInterface()) == null) ? InterfaceC6107Dvm.A00 : interfaceC6107DvmMemoryPressureInterface;
    }

    @Override // X.InterfaceC5637DmL
    public DVE moduleInfoProviderInterface() {
        DVE dveModuleInfoProviderInterface;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (dveModuleInfoProviderInterface = interfaceC5637DmL.moduleInfoProviderInterface()) == null) ? DVF.A00 : dveModuleInfoProviderInterface;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6090DvU playbackResourceMonitor() {
        InterfaceC6090DvU interfaceC6090DvUPlaybackResourceMonitor;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6090DvUPlaybackResourceMonitor = interfaceC5637DmL.playbackResourceMonitor()) == null) ? InterfaceC6090DvU.A00 : interfaceC6090DvUPlaybackResourceMonitor;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6097Dvc prefetchByteModelObserver() {
        InterfaceC6097Dvc interfaceC6097DvcPrefetchByteModelObserver;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6097DvcPrefetchByteModelObserver = interfaceC5637DmL.prefetchByteModelObserver()) == null) ? InterfaceC6097Dvc.A00 : interfaceC6097DvcPrefetchByteModelObserver;
    }

    @Override // X.InterfaceC5637DmL
    public DVK prefetchManagerFactory() {
        DVK dvkPrefetchManagerFactory;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (dvkPrefetchManagerFactory = interfaceC5637DmL.prefetchManagerFactory()) == null) ? DVK.A00 : dvkPrefetchManagerFactory;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6095Dva prefetchMarkerLogger() {
        InterfaceC6095Dva interfaceC6095DvaPrefetchMarkerLogger;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6095DvaPrefetchMarkerLogger = interfaceC5637DmL.prefetchMarkerLogger()) == null) ? InterfaceC6095Dva.A00 : interfaceC6095DvaPrefetchMarkerLogger;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6093DvY prefetchRetryHelper() {
        InterfaceC6093DvY interfaceC6093DvYPrefetchRetryHelper;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6093DvYPrefetchRetryHelper = interfaceC5637DmL.prefetchRetryHelper()) == null) ? InterfaceC6093DvY.A00 : interfaceC6093DvYPrefetchRetryHelper;
    }

    public C5600Dlf progressiveExtractorFactory() {
        return new C5600Dlf();
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6068Dv6 provideOpusAudioRenderer() {
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        if (interfaceC5637DmL != null) {
            return interfaceC5637DmL.provideOpusAudioRenderer();
        }
        return null;
    }

    @Override // X.InterfaceC5637DmL
    public DwF riskEvaluatorFactories() {
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        if (interfaceC5637DmL != null) {
            return interfaceC5637DmL.riskEvaluatorFactories();
        }
        return null;
    }

    @Override // X.InterfaceC5637DmL
    public Executor scrollIdleExecutor() {
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        if (interfaceC5637DmL != null) {
            return interfaceC5637DmL.scrollIdleExecutor();
        }
        return null;
    }

    @Override // X.InterfaceC5637DmL
    public Dw2 spatialAudioHelper() {
        Dw2 dw2SpatialAudioHelper;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (dw2SpatialAudioHelper = interfaceC5637DmL.spatialAudioHelper()) == null) ? Dw2.A00 : dw2SpatialAudioHelper;
    }

    public InterfaceC6091DvW startStatusInterface() {
        return InterfaceC6091DvW.A00;
    }

    public DwG tasosSignalsInterfaceFactory() {
        return DUMMY_TASOS_SIGNALS_INTERFACE_IMPL_FACTORY;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6113Dvs tigonVideoServiceHelper() {
        InterfaceC6113Dvs interfaceC6113DvsTigonVideoServiceHelper;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6113DvsTigonVideoServiceHelper = interfaceC5637DmL.tigonVideoServiceHelper()) == null) ? InterfaceC6113Dvs.A00 : interfaceC6113DvsTigonVideoServiceHelper;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6111Dvq videoFlytrapExtrasRetriever() {
        InterfaceC6111Dvq interfaceC6111DvqVideoFlytrapExtrasRetriever;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6111DvqVideoFlytrapExtrasRetriever = interfaceC5637DmL.videoFlytrapExtrasRetriever()) == null) ? InterfaceC6111Dvq.A00 : interfaceC6111DvqVideoFlytrapExtrasRetriever;
    }

    @Override // X.InterfaceC5637DmL
    public InterfaceC6115Dvu videoSessionJankTracker() {
        InterfaceC6115Dvu interfaceC6115DvuVideoSessionJankTracker;
        InterfaceC5637DmL interfaceC5637DmL = this.delegate;
        return (interfaceC5637DmL == null || (interfaceC6115DvuVideoSessionJankTracker = interfaceC5637DmL.videoSessionJankTracker()) == null) ? InterfaceC6115Dvu.A00 : interfaceC6115DvuVideoSessionJankTracker;
    }

    public AbstractC5636DmK(InterfaceC5637DmL interfaceC5637DmL) {
        this.delegate = interfaceC5637DmL;
    }

    @Override // X.InterfaceC5637DmL
    public DDU defaultDataSourceFactory(HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, AtomicReference atomicReference2) {
        return null;
    }
}
