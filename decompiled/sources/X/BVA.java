package X;

import android.app.Application;
import com.facebook.aura.accessv2.AuraSourceAppConfig;
import com.facebook.aura.analytics.impl.MetaAnalyticsHooks;
import com.facebook.aura.analytics.impl.MetaAnalyticsInstance;
import com.facebook.aura.analytics.impl.MetaAppBackgroundProvider;
import com.facebook.aura.analytics.impl.MetaPhoneIdForAnalytics;
import com.facebook.aura.analytics.impl.QplConfigInstance;
import com.facebook.aura.analytics.impl.config.MetaAnalyticsMC;
import com.facebook.aura.analytics.impl.sampling.MetaAnalyticsSamplingPolicyFactory;
import com.facebook.aura.analytics.timespent.TimeSpentAnalyticsKt;
import com.facebook.aura.analytics.timespent.config.TimeSpentMC;
import com.facebook.aura.app.noopbindings.NoOpActivityChoreographer;
import com.facebook.aura.auth.bindings.AuraAuthBindingsModule;
import com.facebook.aura.common.video.HatchVideoPrefetcher;
import com.facebook.aura.hooks.lifecycle.AuraLifecycleHooks;
import com.facebook.aura.hooks.lifecycle.impl.AuraLifecycleHooksImpl;
import com.facebook.aura.mobileconfig.AuraMobileConfigParams;
import com.facebook.aura.network.tigon.deviceidentifiers.AuraAndroidIdProvider;
import com.facebook.aura.network.tigon.deviceidentifiers.AuraDeviceIdProvider;
import com.facebook.aura.network.tigon.deviceidentifiers.AuraFamilyDeviceIdProvider;
import com.facebook.aura.network.tigon.deviceidentifiers.AuraMachineIdProvider;
import com.facebook.aura.qpl.module.AuraQplModule;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowJSI;
import com.facebook.quicklog.reliability.UserFlowJSIProvider;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.tigon.interceptors.deviceidentifiers.DeviceIdentifiersHelper;
import com.facebook.tigon.interceptors.deviceidentifiers.DeviceIdentifiersNativeProvider;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public abstract class BVA {
    public static Object A00(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        switch (i & 16383) {
            case 0:
                return new NoOpActivityChoreographer();
            case 1:
                return new AuraLifecycleHooksImpl();
            case 2:
                return new AuraMobileConfigParams();
            case 3:
                return new CH7();
            case 4:
                return new CH5();
            case 5:
                return new HatchVideoPrefetcher();
            case 6:
                return new AuraLifecycleHooks();
            case 7:
                return new AuraQplModule.AnonymousClass1();
            case 8:
                return AuraQplModule.provideQuickPerformanceLogger();
            case 9:
                return new C3429CMx();
            case 10:
                UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl((QuickPerformanceLogger) C5246DeB.A01(C5249DeE.A00(), 65544), false, ((QuickPerformanceLoggerGKs) C5246DeB.A01(C5249DeE.A00(), 65543)).shouldReportTriggerSourceAsCrucial());
                UserFlowJSIProvider.A00 = new UserFlowJSI(userFlowLoggerImpl);
                UserFlowJNIProvider.setUserFlowLogger(userFlowLoggerImpl);
                return userFlowLoggerImpl;
            case 11:
                return new MetaAppBackgroundProvider();
            case 12:
                return new MetaPhoneIdForAnalytics();
            case 13:
                return new QplConfigInstance();
            case 14:
                return new MetaAnalyticsInstance();
            case 15:
                return new MetaAnalyticsHooks();
            case 16:
                return new MetaAnalyticsSamplingPolicyFactory();
            case 17:
                return new AuraAndroidIdProvider();
            case 18:
                return new AuraDeviceIdProvider();
            case 19:
                return new AuraFamilyDeviceIdProvider();
            case 20:
                return new AuraMachineIdProvider();
            case 21:
                return new TimeSpentMC();
            case 22:
                return TimeSpentAnalyticsKt.providesTimeSpentAnalytics();
            case 23:
                return new DRo();
            case 24:
                return new DRo();
            case 25:
                DSU dsu = (DSU) C5246DeB.A01(C5249DeE.A00(), 65560);
                C7384Etj.A0Y(dsu, 0);
                return new DSa(dsu);
            case 26:
                DSU dsu2 = (DSU) C5246DeB.A01(C5249DeE.A00(), 65559);
                C7384Etj.A0Y(dsu2, 0);
                return new C5059DSb(dsu2);
            case 27:
                return new MetaAnalyticsMC();
            case 28:
            case 29:
                return new De5(-1);
            case 30:
                return new C5338DgZ();
            case 31:
                return new EDl((Application) obj);
            case 32:
                return new AuraSourceAppConfig();
            case 33:
                return new EOQ();
            case 34:
                return new EP7();
            case 35:
                return new EP3();
            case 36:
                return new EOP();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return new EOf();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return new EP8();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return new EP4();
            case 40:
                return new EP5();
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return new EP9();
            case 42:
                return new EPA();
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return new DeviceIdentifiersNativeProvider();
            case 44:
                return new DeviceIdentifiersHelper();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return new EXX();
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                AuraAuthBindingsModule.provideFlipperLiveDataProvider();
                throw F60.createAndThrow();
            default:
                throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
