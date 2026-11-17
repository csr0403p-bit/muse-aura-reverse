package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DmL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5637DmL {
    BVQ aacAudioRendererFactory();

    DFE abrInstrumentationHelper();

    InterfaceC6083DvN abrMonitorObserverFactory(HeroPlayerSetting heroPlayerSetting);

    DF1 audioRoutingInterface();

    InterfaceC6105Dvk audioSuperResolutionProcessorFactory();

    InterfaceC6087DvR breakpadManagerDelegate();

    C5496DjY chunkExtractorFactory();

    void configureMediaCodecForSDK35();

    InterfaceC6103Dvi crashReportAnnotationDelegate();

    InterfaceC6085DvP dav1dSurfaceControlPresenterFactory();

    Dw5 debugTracer();

    DDU defaultDataSourceFactory(HeroPlayerSetting heroPlayerSetting, AtomicReference atomicReference, AtomicReference atomicReference2);

    InterfaceC6128DwU downloadStatusStore();

    InterfaceC6117Dvw eventLoggerFactory();

    C12 evictionPolicyInfoProvider();

    InterfaceC6101Dvg hlsMediaSourceFactory();

    InterfaceC6107Dvm memoryPressureInterface();

    DVE moduleInfoProviderInterface();

    InterfaceC6090DvU playbackResourceMonitor();

    InterfaceC6097Dvc prefetchByteModelObserver();

    DVK prefetchManagerFactory();

    InterfaceC6095Dva prefetchMarkerLogger();

    InterfaceC6093DvY prefetchRetryHelper();

    InterfaceC6068Dv6 provideOpusAudioRenderer();

    DwF riskEvaluatorFactories();

    Executor scrollIdleExecutor();

    Dw2 spatialAudioHelper();

    InterfaceC6113Dvs tigonVideoServiceHelper();

    InterfaceC6111Dvq videoFlytrapExtrasRetriever();

    InterfaceC6115Dvu videoSessionJankTracker();
}
