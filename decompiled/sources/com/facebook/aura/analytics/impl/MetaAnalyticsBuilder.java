package com.facebook.aura.analytics.impl;

import X.AbstractC3416CMe;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass801;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C3cG;
import X.C4082ClZ;
import X.C4931DFd;
import X.C4934DFk;
import X.C4939DFv;
import X.C4942DGd;
import X.C4943DGh;
import X.C4947DGs;
import X.C4949DGw;
import X.C5246DeB;
import X.C5322DgG;
import X.C7384Etj;
import X.C7438Evz;
import X.C9X;
import X.CFK;
import X.CI7;
import X.CIA;
import X.DFX;
import X.DFY;
import X.DG8;
import X.DGD;
import X.DGG;
import X.DGS;
import X.DGT;
import X.DGc;
import X.DH0;
import X.DH8;
import X.DHG;
import X.DHQ;
import X.DKG;
import X.F0C;
import X.F18;
import X.F60;
import X.HandlerC4948DGt;
import X.InterfaceC4071ClJ;
import X.InterfaceC4944DGi;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.aura.analytics.AnalyticsUploadHold;
import com.facebook.aura.analytics.ffdb.AuraFFDBProvider;
import com.facebook.aura.analytics.impl.sampling.MetaAnalyticsSamplingPolicyFactory;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.network.AuraUserAgent;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import com.facebook.common.build.BuildConstants;
import com.facebook.logginginfra.falco.GetQPLConfigDirective;
import com.facebook.logginginfra.falco.PrincipalSubject;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.File;
import java.util.Collections;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MetaAnalyticsBuilder {
    public static final Companion Companion = new Companion();
    public static final String FALCO_CLIENT_TOKEN = "330bd45681a06ad240322862d206c0be";
    public static final String TAG = "MetaAnalyticsBuilder";
    public static C4942DGd configValueInstance;
    public static DH8 uploadConfigInstance;
    public final DGc analyticsEventListener;
    public final MetaAppInfoProvider appInfoProvider;
    public final DFY builder;
    public final CI7 consentStateProvider;
    public final InterfaceC4944DGi deviceInfoProvider;
    public final DHG modeStateProvider;
    public final MetaAnalyticsSessionIdGenerator sessionIdGenerator;

    /* renamed from: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C109201 extends C7438Evz implements Function0<Unit> {
        public C109201(Object obj) {
            super(0, obj, C4947DGs.class, "onPause", "onPause()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C4947DGs c4947DGs = (C4947DGs) this.receiver;
            c4947DGs.A00();
            DG8 dg8 = c4947DGs.A00;
            if (dg8 == null) {
                C7384Etj.A0b("eventQueue");
                throw F60.createAndThrow();
            }
            HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
            BV4.A1C(handlerC4948DGt, handlerC4948DGt.A04);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements Function0<Unit> {
        public AnonymousClass2(Object obj) {
            super(0, obj, C4947DGs.class, "onResume", "onResume()V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C4947DGs c4947DGs = (C4947DGs) this.receiver;
            c4947DGs.A00();
            DG8 dg8 = c4947DGs.A00;
            if (dg8 == null) {
                C7384Etj.A0b("eventQueue");
                throw F60.createAndThrow();
            }
            HandlerC4948DGt handlerC4948DGt = (HandlerC4948DGt) dg8;
            BV4.A1C(handlerC4948DGt, handlerC4948DGt.A05);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void getDeviceInfoProvider$annotations() {
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DH8 createFFA2UploadConfiguration() {
        DH8 dh8 = uploadConfigInstance;
        if (dh8 == null) {
            dh8 = new DH8(FALCO_CLIENT_TOKEN, AuraUserAgent.INSTANCE.instanceWithoutWaiting(F0C.A05()), new F18() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$createFFA2UploadConfiguration$uploadConfigNonNull$1
                @Override // X.F18
                /* renamed from: get */
                public final TigonServiceHolder AMN() {
                    return null;
                }

                @Override // X.F18
                /* renamed from: get */
                public /* bridge */ /* synthetic */ Object AMN() {
                    return null;
                }
            });
        }
        uploadConfigInstance = dh8;
        return dh8;
    }

    private final C4942DGd createFFConfigValues() {
        C4942DGd c4942DGd = configValueInstance;
        if (c4942DGd == null) {
            C5246DeB.A00(65563);
            C5246DeB.A00(65563);
            c4942DGd = new C4942DGd(getBaseFilePath());
        }
        configValueInstance = c4942DGd;
        return c4942DGd;
    }

    private final DGD createHealthCounterLoggerProvider(C4947DGs c4947DGs) {
        final C5322DgG c5322DgG = new C5322DgG(null, new MetaAnalyticsBuilder$createHealthCounterLoggerProvider$healthCounterLogger$2(this, c4947DGs, new C5322DgG(null, new MetaAnalyticsBuilder$createHealthCounterLoggerProvider$isFfdbEnabled$2(AbstractC5321DgF.A03(MetaAnalyticsBuilder$createHealthCounterLoggerProvider$ffdbProvider$1.INSTANCE))), AbstractC5321DgF.A03(MetaAnalyticsBuilder$createHealthCounterLoggerProvider$isDebugBuild$2.INSTANCE)));
        return new DGD() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder.createHealthCounterLoggerProvider.1
            @Override // X.DGD
            public DGS get() {
                return c5322DgG.getValue();
            }

            @Override // X.DGD
            public boolean isHealthCounterEnabled() {
                return true;
            }

            @Override // X.DGD
            public boolean isOneFabricEnabled() {
                return true;
            }
        };
    }

    public static /* synthetic */ DGD createHealthCounterLoggerProvider$default(MetaAnalyticsBuilder metaAnalyticsBuilder, C4947DGs c4947DGs, int i, Object obj) {
        if ((i & 1) != 0) {
            c4947DGs = null;
        }
        return metaAnalyticsBuilder.createHealthCounterLoggerProvider(c4947DGs);
    }

    private final void maybeSetHighPriorityUploadSchedulerParamsProvider() {
        this.builder.A08 = new HighPriUploadSchedulerParamsProvider();
    }

    private final void maybeSetRegularPriorityUploadSchedulerParamsProvider() {
        this.builder.A09 = new RegularPriUploadSchedulerParamsProvider();
    }

    public final DFX build() {
        return new DFX(this.builder);
    }

    public MetaAnalyticsBuilder() {
        MetaAppInfoProvider metaAppInfoProvider = new MetaAppInfoProvider();
        this.appInfoProvider = metaAppInfoProvider;
        InterfaceC4944DGi interfaceC4944DGi = ((MetaPhoneIdForAnalytics) BV5.A0Z(65548)).provider;
        this.deviceInfoProvider = interfaceC4944DGi;
        UserConsentStateProvider userConsentStateProvider = new UserConsentStateProvider();
        this.consentStateProvider = userConsentStateProvider;
        this.modeStateProvider = new HatchModeStateProvider();
        MetaAnalyticsSessionIdGenerator companion = MetaAnalyticsSessionIdGenerator.Companion.getInstance(false, true);
        this.sessionIdGenerator = companion;
        DGc dGc = new DGc() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$analyticsEventListener$1
            @Override // X.DGc
            public void onEventReceived() {
                try {
                    AnonymousClass801.A0T(new int[]{0}[0]);
                } catch (RuntimeException e) {
                    CFK.A08(MetaAnalyticsBuilder.TAG, "Analytics event listener failed", e);
                }
            }

            public void onEventsWritten(int i) {
            }
        };
        this.analyticsEventListener = dGc;
        DFY dfy = new DFY(C3cG.A06());
        this.builder = dfy;
        boolean zA04 = C9X.A04();
        MetaAnalyticsSamplingPolicyFactory metaAnalyticsSamplingPolicyFactory = (MetaAnalyticsSamplingPolicyFactory) BV5.A0Z(65552);
        dfy.A0A = metaAppInfoProvider;
        dfy.A0D = interfaceC4944DGi;
        dfy.A06 = ((MetaAppBackgroundProvider) BV5.A0Z(65547)).instance;
        dfy.A03 = MetaAnalyticsSessionManager.instance;
        dfy.A0C = !zA04 ? metaAnalyticsSamplingPolicyFactory.createPrimaryPigeonSamplingPolicy() : new MetaAnalyticsSamplingPolicyFactory.AnonymousClass1();
        C5246DeB.A00(65549);
        dfy.A0E = AuraSamplingPolicyConfig.class;
        dfy.A0B = new MetaPrivacyContextProvider();
        dfy.A07 = new MetaMicroBatchConfigProvider();
        dfy.A0F = MetaAnalyticsUploader.class;
        dfy.A02 = userConsentStateProvider;
        dfy.A04 = dGc;
        if (companion != null) {
            dfy.A05 = companion;
        }
        dfy.A0H = new F18() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$ffdbProvider$1
            @Override // X.F18
            /* renamed from: get */
            public final InterfaceC4071ClJ AMN() {
                return new AuraFFDBProvider();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new AuraFFDBProvider();
            }
        };
        maybeSetRegularPriorityUploadSchedulerParamsProvider();
        maybeSetHighPriorityUploadSchedulerParamsProvider();
        dfy.A01 = createHealthCounterLoggerProvider(maybeEnableOneFabric());
    }

    public static final /* synthetic */ DGS access$createHealthCounterLoggerProvider$lambda$2(F0C f0c) {
        return (DGS) f0c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getBaseFilePath() {
        Context contextA06 = C3cG.A06();
        AnonymousClass003.A0u(contextA06, DGG.A00);
        File fileA00 = AbstractC3416CMe.A00(contextA06, 1543572765);
        fileA00.mkdirs();
        File fileA0O = C3cG.A0O(fileA00, "fflogger");
        fileA0O.mkdirs();
        String path = fileA0O.getPath();
        C7384Etj.A0U(path);
        return path;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1] */
    private final C4947DGs maybeEnableOneFabric() throws NumberFormatException {
        String strA0f = BV4.A0f();
        MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1 metaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1 = MetaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1.INSTANCE;
        long j = Long.parseLong("4331325740476680");
        C4949DGw c4949DGw = new C4949DGw(this.modeStateProvider, this.consentStateProvider, metaAnalyticsBuilder$maybeEnableOneFabric$identitiesDescriptor$1, strA0f, "", "16.0.0.11.159", "", BuildConstants.A01(), 0, j);
        c4949DGw.A0A = false;
        MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 metaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 = new MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1(new C4082ClZ(((MetaAppBackgroundProvider) BV5.A0Z(65547)).instance, new RegularPriUploadSchedulerParamsProvider(), new HighPriUploadSchedulerParamsProvider(), BV5.A0F().realTimeExemptLatency, BV5.A0F().regularExemptLatency, BV5.A0F().latencyWindowMultiplier));
        HandlerThread handlerThread = new HandlerThread("one-fabric-event-handler");
        handlerThread.start();
        AuraAppContext auraAppContext = AuraAppContext.INSTANCE;
        FFMetaAnalyticsUploader fFMetaAnalyticsUploader = new FFMetaAnalyticsUploader(auraAppContext.requireContext());
        ?? r10 = new Object() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1
            public boolean isAppStarting() {
                return false;
            }
        };
        boolean zA04 = C9X.A04();
        DGT dh0 = !zA04 ? new DH0() : new DGT() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$samplingPolicy$1
            @Override // X.DGT
            public C4934DFk shouldLog(String str, C4949DGw c4949DGw2) {
                return C4934DFk.A00();
            }
        };
        F18 f18 = !zA04 ? new F18() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$qplConfigHandlerProvider$1
            @Override // X.F18
            /* renamed from: get */
            public final DHQ AMN() {
                return ((QplConfigInstance) BV5.A0Z(65549)).getInstance().A00;
            }
        } : new F18() { // from class: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$qplConfigHandlerProvider$2

            /* renamed from: com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$qplConfigHandlerProvider$2$1, reason: invalid class name */
            public final class AnonymousClass1 implements DHQ {
                @Override // X.DHQ
                public GetQPLConfigDirective getQPLConfigDirective(PrincipalSubject principalSubject) {
                    Object[] objArr = new Object[3];
                    System.arraycopy(new Object[3], 0, objArr, 0, 3);
                    GetQPLConfigDirective getQPLConfigDirective = new GetQPLConfigDirective();
                    getQPLConfigDirective.A00 = "com.facebook.logginginfra.falco.GetQPLConfigDirective";
                    getQPLConfigDirective.A01 = objArr;
                    return getQPLConfigDirective;
                }

                @Override // X.DHQ
                public boolean handleConfig(SetQPLConfigDirective setQPLConfigDirective) {
                    return false;
                }
            }

            @Override // X.F18
            /* renamed from: get */
            public final DHQ AMN() {
                return new AnonymousClass1();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return new AnonymousClass1();
            }
        };
        Context contextRequireContext = auraAppContext.requireContext();
        DKG dkgA00 = C4939DFv.A00();
        DH8 dh8CreateFFA2UploadConfiguration = createFFA2UploadConfiguration();
        C4942DGd c4942DGdCreateFFConfigValues = createFFConfigValues();
        C4943DGh c4943DGh = new C4943DGh();
        Looper looper = handlerThread.getLooper();
        C7384Etj.A0U(looper);
        Set set = Collections.EMPTY_SET;
        C7384Etj.A0V(set);
        C5246DeB.A00(65563);
        C5246DeB.A00(65563);
        C5246DeB.A00(65563);
        C4947DGs c4947DGs = new C4947DGs(contextRequireContext, looper, c4949DGw, fFMetaAnalyticsUploader, metaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1, r10, c4943DGh, dh8CreateFFA2UploadConfiguration, c4942DGdCreateFFConfigValues, dh0, dkgA00, new AuraAnalyticsEndpointSelector().facebookAuthority("graph"), set, f18);
        C4931DFd c4931DFdProvideBootstrappedPigeonIdentity = MetaAnalyticsSessionManager.instance.provideBootstrappedPigeonIdentity();
        if (c4931DFdProvideBootstrappedPigeonIdentity != null) {
            c4931DFdProvideBootstrappedPigeonIdentity.addFieldsToIdentityDescriptor(c4949DGw);
        } else {
            CFK.A06(TAG, "Failed to bootstrap Pigeon Identity");
        }
        MetaAnalyticsSessionIdGenerator metaAnalyticsSessionIdGenerator = this.sessionIdGenerator;
        if (metaAnalyticsSessionIdGenerator != null) {
            c4947DGs.AgA(new CIA(c4931DFdProvideBootstrappedPigeonIdentity, metaAnalyticsSessionIdGenerator.provideSessionId()));
        }
        c4947DGs.A0J = this.analyticsEventListener;
        this.builder.A00 = c4947DGs;
        AnalyticsUploadHold.INSTANCE.attach(new C109201(c4947DGs), new AnonymousClass2(c4947DGs));
        return c4947DGs;
    }
}
