package com.facebook.aura.qpl;

import X.AII;
import X.AIM;
import X.AbstractC0885AGm;
import X.AbstractC3136BzG;
import X.AbstractC4952DHl;
import X.AnonymousClass002;
import X.BV4;
import X.C18;
import X.C3172C1a;
import X.C3174C1d;
import X.C3469COs;
import X.C3470COv;
import X.C3cG;
import X.C4955DHq;
import X.C4957DIa;
import X.C4958DIb;
import X.C4964DIr;
import X.C4966DIx;
import X.C4969DJf;
import X.C4972DJl;
import X.C4JM;
import X.C4oT;
import X.C5246DeB;
import X.C5249DeE;
import X.C7384Etj;
import X.C7603F5q;
import X.C79;
import X.C9X;
import X.C9u;
import X.CAG;
import X.CAI;
import X.CFK;
import X.COt;
import X.CP1;
import X.CRS;
import X.DGY;
import X.DGf;
import X.DHp;
import X.DHu;
import X.DHy;
import X.DI0;
import X.DI6;
import X.DIA;
import X.DID;
import X.DIF;
import X.DIO;
import X.DIP;
import X.DIQ;
import X.DIU;
import X.DIz;
import X.DJ7;
import X.DJ8;
import X.DJ9;
import X.DJF;
import X.DJH;
import X.DJY;
import X.DJe;
import X.F18;
import X.FGI;
import X.InterfaceC3472COx;
import X.InterfaceC4945DGj;
import X.InterfaceC7539F0o;
import android.app.ActivityManager;
import android.os.PowerManager;
import android.os.Trace;
import com.facebook.aura.analytics.AuraAnalytics;
import com.facebook.aura.analytics.impl.sampling.MetaPrefsSamplingConfigAccessor;
import com.facebook.aura.analytics.timespent.navigation.NavigationLoggerImpl;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import com.facebook.aura.qpl.api.QuickEventListenerSlot;
import com.facebook.aura.qpl.xanalytics.AuraXAnalyticsProvider;
import com.facebook.aura.ui.adaptive.AuraDevice;
import com.facebook.aura.ui.adaptive.AuraDeviceType;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.QPLConfigurationNativeBridge;
import com.facebook.quicklog.QuickEventImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.xplat.QPLXplatInitializerImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraQuickPerformanceLogger {
    public static C4957DIa ffLoggerQplConfig;
    public static Function0<Unit> instanceAvailableListener;
    public static QuickPerformanceLogger instanceBackingField;
    public static volatile DHy qplListenersListHolder;
    public static Function0<Unit> transitionToMatureStage;
    public static final AuraQuickPerformanceLogger INSTANCE = new AuraQuickPerformanceLogger();
    public static final AtomicBoolean isStartupCompleted = BV4.A12(false);
    public static final AtomicBoolean isConfigReady = BV4.A12(false);

    /* renamed from: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createHoneyClientLoggerLazy$1, reason: invalid class name and case insensitive filesystem */
    public final class C134441<T> implements F18 {
        public static final C134441<T> INSTANCE = new C134441<>();

        @Override // X.F18
        /* renamed from: get */
        public final CRS AMN() {
            return new CRS(AuraAnalytics.INSTANCE.getInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void maybeTransitionToMatureStage() {
        Function0<Unit> function0;
        if (isStartupCompleted.get() && isConfigReady.get() && !C9X.A04() && (function0 = transitionToMatureStage) != null) {
            transitionToMatureStage = null;
            function0.invoke();
        }
    }

    public final synchronized void onStartupCompletion() {
        boolean andSet = isStartupCompleted.getAndSet(true);
        if (C9X.A04()) {
            if (instanceBackingField == null) {
                throw C3cG.A0Q("QPL instance is not initialized when onStartupCompletion is called");
            }
            if (andSet) {
                throw C3cG.A0Q("onStartupCompletion is triggered more than once, which is not expected");
            }
            AbstractC3136BzG.A00("transitToMatureStage");
            try {
                Function0<Unit> function0 = transitionToMatureStage;
                if (function0 == null) {
                    throw BV4.A0U();
                }
                function0.invoke();
                transitionToMatureStage = null;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        maybeTransitionToMatureStage();
    }

    public final void setFFLoggerQplConfig(C4957DIa c4957DIa) {
        C7384Etj.A0Y(c4957DIa, 0);
        ffLoggerQplConfig = c4957DIa;
        Callable callable = new Callable() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger.setFFLoggerQplConfig.1
            @Override // java.util.concurrent.Callable
            public final Void call() {
                AuraQuickPerformanceLogger.isConfigReady.set(true);
                AuraQuickPerformanceLogger.INSTANCE.maybeTransitionToMatureStage();
                return null;
            }
        };
        C4972DJl c4972DJlA00 = c4957DIa.A02;
        if (c4972DJlA00 == null) {
            c4972DJlA00 = c4957DIa.A00();
        }
        synchronized (c4972DJlA00) {
            c4972DJlA00.A0E = callable;
        }
        try {
            C4972DJl.A00(c4972DJlA00);
        } catch (Exception unused) {
            c4972DJlA00.A07.AMN();
        }
    }

    public final void setInstanceAvailableListener(Function0<Unit> function0) {
        boolean z;
        C7384Etj.A0Y(function0, 0);
        synchronized (this) {
            if (instanceAvailableListener != null) {
                throw C3cG.A0Q("Cannot set multiple listeners");
            }
            if (instanceBackingField == null) {
                instanceAvailableListener = function0;
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            function0.invoke();
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraDeviceType.values().length];
            try {
                AnonymousClass002.A13(AuraDeviceType.Phone, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraDeviceType.Foldable, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraDeviceType.Tablet, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraDeviceType.Watch, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraDeviceType.Automotive, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void addDebugEventListeners(List<DI6> list) {
        list.add(AuraFlipperQplListener.instance);
    }

    private final void addDynaQplListener(List<DI6> list) {
        list.add(new CP1());
    }

    private final void addProdEventListeners(List<DI6> list) {
        list.add(new C3469COs());
    }

    private final F18 createHoneyClientLoggerLazy() {
        return C134441.INSTANCE;
    }

    private final QuickPerformanceLogger createQuickPerformanceLogger() {
        DHu dHu;
        final AuraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1 auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1 = AuraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1.INSTANCE;
        final DGf dGf = new DGf();
        final AuraDebugAndTestConfig auraDebugAndTestConfig = new AuraDebugAndTestConfig();
        QuickPerformanceLoggerGKs quickPerformanceLoggerGKs = (QuickPerformanceLoggerGKs) C5246DeB.A01(C5249DeE.A00(), 65543);
        DIO dioA01 = DIO.A01();
        C4958DIb[] c4958DIbArr = {DIz.A00};
        boolean zOrangeBoxAllocateFileOnInit = quickPerformanceLoggerGKs.orangeBoxAllocateFileOnInit();
        int[] iArr = {c4958DIbArr[0].A00};
        Arrays.sort(iArr);
        final DI0 di0 = new DI0(new C4966DIx(iArr), new DID[]{new DIP(dioA01.A01), new DIQ(c4958DIbArr)}, zOrangeBoxAllocateFileOnInit);
        AbstractC3136BzG.A00(FGI.A0U("CreatingQPL", ffLoggerQplConfig != null ? "With" : "Without", "FFLoggerConfig"));
        try {
            if (ffLoggerQplConfig != null) {
                F18 f18 = new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$listenersHolderProvider$1
                    @Override // X.F18
                    /* renamed from: get */
                    public final DHy AMN() {
                        List listCreateEventListeners = AuraQuickPerformanceLogger.INSTANCE.createEventListeners();
                        DHy dHy = new DHy();
                        DI6[] di6Arr = (DI6[]) listCreateEventListeners.toArray(new DI6[0]);
                        dHy.A00((DI6[]) Arrays.copyOf(di6Arr, di6Arr.length));
                        AuraQuickPerformanceLogger.qplListenersListHolder = dHy;
                        return dHy;
                    }
                };
                AbstractC3136BzG.A00("QuickPerformanceLoggerImpl");
                dHu = new DHu(AwakeTimeSinceBootClock.INSTANCE, C9u.A00, quickPerformanceLoggerGKs, dGf, C79.A0W, C134441.INSTANCE, new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplImpl$1$1
                    @Override // X.F18
                    /* renamed from: get */
                    public final DIF AMN() {
                        C4957DIa c4957DIa = AuraQuickPerformanceLogger.ffLoggerQplConfig;
                        if (c4957DIa != null) {
                            return c4957DIa.A00();
                        }
                        return null;
                    }
                }, new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplImpl$1$2
                    @Override // X.F18
                    /* renamed from: get */
                    public final InterfaceC3472COx AMN() {
                        return new AuraDebugAndTestConfig();
                    }

                    @Override // X.F18
                    /* renamed from: get */
                    public /* bridge */ /* synthetic */ Object AMN() {
                        return new AuraDebugAndTestConfig();
                    }
                }, new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplImpl$1$3
                    @Override // X.F18
                    /* renamed from: get */
                    public final DGY AMN() {
                        DJH djh = DJH.A00;
                        if (djh == null) {
                            djh = new DJH();
                            DJH.A00 = djh;
                        }
                        C7384Etj.A0X(djh);
                        return djh;
                    }

                    @Override // X.F18
                    /* renamed from: get */
                    public /* bridge */ /* synthetic */ Object AMN() {
                        DJH djh = DJH.A00;
                        if (djh == null) {
                            djh = new DJH();
                            DJH.A00 = djh;
                        }
                        C7384Etj.A0X(djh);
                        return djh;
                    }
                }, f18, new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplImpl$1$4
                    @Override // X.F18
                    /* renamed from: get */
                    public final Collection<DJF> AMN() {
                        return AuraQuickPerformanceLogger.INSTANCE.createQPLVisitors(auraDebugAndTestConfig, new AuraQuickPerformanceLogger$sam$javax_inject_Provider$0(auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1), dGf);
                    }
                }, new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplImpl$1$5
                    @Override // X.F18
                    /* renamed from: get */
                    public final C4955DHq AMN() {
                        C7603F5q c7603F5qA00 = DIU.A00((DHp[]) Arrays.copyOf(AuraQuickPerformanceLogger.INSTANCE.createDataProviders(), 7));
                        if (c7603F5qA00 != null) {
                            return (C4955DHq) c7603F5qA00.AMN();
                        }
                        throw BV4.A0U();
                    }
                }, null, new AuraQuickPerformanceLogger$sam$javax_inject_Provider$0(auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1), null, new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplImpl$1$6
                    @Override // X.F18
                    /* renamed from: get */
                    public final DIA AMN() {
                        return di0;
                    }

                    @Override // X.F18
                    /* renamed from: get */
                    public /* bridge */ /* synthetic */ Object AMN() {
                        return di0;
                    }
                }, false);
                Trace.endSection();
                AbstractC3136BzG.A00("LightweightQPLLifecycleController");
                C4964DIr c4964DIr = new C4964DIr(dHu, DIO.A01(), new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$qplLifecycleController$1$1
                    @Override // X.F18
                    /* renamed from: get */
                    public final DIA AMN() {
                        return di0;
                    }

                    @Override // X.F18
                    /* renamed from: get */
                    public /* bridge */ /* synthetic */ Object AMN() {
                        return di0;
                    }
                }, new AuraQuickPerformanceLogger$sam$javax_inject_Provider$0(auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1));
                Trace.endSection();
                transitionToMatureStage = new AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$1(c4964DIr);
                AbstractC3136BzG.A00("transitToEarlyStage");
                try {
                    DHu dHu2 = c4964DIr.A01;
                    dHu2.A0g();
                    QuickPerformanceLoggerProvider.A00(dHu2);
                } catch (Throwable th) {
                    CFK.A08("LightweightQPLLifecycleController", "QPL failed to transit to early stage", th);
                }
                Trace.endSection();
                AbstractC3136BzG.A00("transitToWarmStage");
                try {
                    c4964DIr.A01.A0i();
                } catch (Throwable th2) {
                    CFK.A08("LightweightQPLLifecycleController", "QPL failed to transit to warm stage", th2);
                }
                Trace.endSection();
                AbstractC3136BzG.A00("initXplatQpl");
                AuraXAnalyticsProvider auraXAnalyticsProvider = AuraXAnalyticsProvider.INSTANCE;
                QPLXplatInitializerImpl qPLXplatInitializerImpl = new QPLXplatInitializerImpl();
                if (auraXAnalyticsProvider == null) {
                    throw BV4.A0U();
                }
                qPLXplatInitializerImpl.initialize(auraXAnalyticsProvider, quickPerformanceLoggerGKs, "aura_xplat_qpl");
                C4957DIa c4957DIa = ffLoggerQplConfig;
                if (c4957DIa != null) {
                    C4972DJl c4972DJlA00 = c4957DIa.A00();
                    C7384Etj.A0U(c4972DJlA00);
                    QPLConfigurationNativeBridge.qplConfiguration = c4972DJlA00;
                }
                Trace.endSection();
                QuickPerformanceLoggerProvider.A00(dHu);
            } else {
                AuraQuickPerformanceLogger auraQuickPerformanceLogger = INSTANCE;
                List<DI6> listCreateEventListeners = auraQuickPerformanceLogger.createEventListeners();
                DHy dHy = new DHy();
                qplListenersListHolder = dHy;
                DIO.A01().A01 = new AuraQuickPerformanceLogger$sam$javax_inject_Provider$0(auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1);
                Integer num = C79.A0W;
                F18 f182 = C134441.INSTANCE;
                DIF difCreateQPLSamplingConfig = auraQuickPerformanceLogger.createQPLSamplingConfig();
                AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                C7384Etj.A0U(awakeTimeSinceBootClock);
                C9u c9u = C9u.A00;
                DJH djh = DJH.A00;
                if (djh == null) {
                    djh = new DJH();
                    DJH.A00 = djh;
                }
                C7384Etj.A0X(djh);
                DIU diu = new DIU((AuraQplNameProvider) auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1.invoke(), awakeTimeSinceBootClock, c9u, djh, auraDebugAndTestConfig, difCreateQPLSamplingConfig, dGf, num, f182);
                List<DI6> list = diu.A0F;
                list.addAll(listCreateEventListeners);
                diu.A01 = dHy;
                List listCreateQPLVisitors = auraQuickPerformanceLogger.createQPLVisitors(auraDebugAndTestConfig, new AuraQuickPerformanceLogger$sam$javax_inject_Provider$0(auraQuickPerformanceLogger$createQuickPerformanceLogger$nameProvider$1), dGf);
                List<DJF> list2 = diu.A0E;
                list2.addAll(listCreateQPLVisitors);
                DHp[] dHpArr = (DHp[]) Arrays.copyOf(auraQuickPerformanceLogger.createDataProviders(), 7);
                C7384Etj.A0Y(dHpArr, 0);
                List<DHp<?, ?>> list3 = diu.A0C;
                list3.addAll(AbstractC0885AGm.A11(Arrays.copyOf(dHpArr, dHpArr.length)));
                diu.A03 = di0;
                diu.A02 = quickPerformanceLoggerGKs;
                if (diu.A01 == null) {
                    diu.A01 = new DHy(list);
                } else if (!list.isEmpty()) {
                    DHy dHy2 = diu.A01;
                    C7384Etj.A0X(dHy2);
                    DI6[] di6Arr = (DI6[]) list.toArray(new DI6[0]);
                    dHy2.A00((DI6[]) Arrays.copyOf(di6Arr, di6Arr.length));
                }
                DHy dHy3 = diu.A01;
                if (dHy3 == null) {
                    throw BV4.A0U();
                }
                DJY.A00 = dHy3;
                F18 f183 = diu.A04;
                C7603F5q c7603F5q = new C7603F5q(diu, 6);
                AwakeTimeSinceBootClock awakeTimeSinceBootClock2 = diu.A06;
                InterfaceC7539F0o interfaceC7539F0o = diu.A07;
                C7603F5q c7603F5q2 = new C7603F5q(diu, 7);
                C7603F5q c7603F5q3 = new C7603F5q(diu, 8);
                C7603F5q c7603F5q4 = new C7603F5q(dHy3, 9);
                C7603F5q c7603F5q5 = new C7603F5q(list2, 5);
                DHp[] dHpArr2 = (DHp[]) list3.toArray(new DHp[0]);
                dHu = new DHu(awakeTimeSinceBootClock2, interfaceC7539F0o, diu.A02, diu.A0A, diu.A0B, f183, c7603F5q, c7603F5q2, c7603F5q3, c7603F5q4, c7603F5q5, DIU.A00((DHp[]) Arrays.copyOf(dHpArr2, dHpArr2.length)), new C7603F5q(diu.A0D, 5), new C7603F5q(diu, 10), new C7603F5q(diu, 11), new C7603F5q(diu, 12), true);
                DIO.A01().A04(dHu, di0);
                QuickPerformanceLoggerProvider.A00(dHu);
                transitionToMatureStage = AuraQuickPerformanceLogger$createQuickPerformanceLogger$1$5.INSTANCE;
            }
            return dHu;
        } catch (Throwable th3) {
            throw th3;
        } finally {
            Trace.endSection();
        }
    }

    public final QuickPerformanceLogger getInstance() {
        Function0<Unit> function0;
        QuickPerformanceLogger quickPerformanceLoggerCreateQuickPerformanceLogger = instanceBackingField;
        if (quickPerformanceLoggerCreateQuickPerformanceLogger == null) {
            synchronized (this) {
                quickPerformanceLoggerCreateQuickPerformanceLogger = instanceBackingField;
                function0 = null;
                if (quickPerformanceLoggerCreateQuickPerformanceLogger == null) {
                    AuraQuickPerformanceLogger auraQuickPerformanceLogger = INSTANCE;
                    AbstractC3136BzG.A00("AuraQPL");
                    try {
                        quickPerformanceLoggerCreateQuickPerformanceLogger = auraQuickPerformanceLogger.createQuickPerformanceLogger();
                        Trace.endSection();
                        instanceBackingField = quickPerformanceLoggerCreateQuickPerformanceLogger;
                        Function0<Unit> function02 = instanceAvailableListener;
                        instanceAvailableListener = null;
                        function0 = function02;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            if (function0 != null) {
                function0.invoke();
                return quickPerformanceLoggerCreateQuickPerformanceLogger;
            }
        }
        return quickPerformanceLoggerCreateQuickPerformanceLogger;
    }

    public final DHy getQplListenersListHolder() {
        return qplListenersListHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DHp<?, ?>[] createDataProviders() {
        Object systemService = C4JM.A00().getSystemService("activity");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        return new DHp[]{new CAG((ActivityManager) systemService, CAI.A00), new C3172C1a(), new C3174C1d(new F18() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger.createDataProviders.1
            @Override // X.F18
            /* renamed from: get */
            public final PowerManager AMN() {
                Object systemService2 = C4JM.A00().getSystemService("power");
                C7384Etj.A0Z(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                return (PowerManager) systemService2;
            }
        }), new C18(C4JM.A00()), new AuraNetworkStatsProvider(), new AuraNetworkConnectivityProvider(C4JM.A00()), new AuraPowerStatsProvider(C4JM.A00())};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<DI6> createEventListeners() {
        ArrayList arrayListA0h = C3cG.A0h();
        INSTANCE.addProdEventListeners(arrayListA0h);
        arrayListA0h.add(QuickEventListenerSlot.INSTANCE);
        return arrayListA0h;
    }

    private final DIF createQPLSamplingConfig() {
        C5246DeB.A00(65552);
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ANALYTICS_SAMPLING_POLICY);
        return new AuraQPLConfiguration(new DJ8(new DJ9(new DJ7(new C4969DJf(), new MetaPrefsSamplingConfigAccessor(c4oT), c4oT), new Random())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List createQPLVisitors(InterfaceC3472COx interfaceC3472COx, F18 f18, InterfaceC4945DGj interfaceC4945DGj) {
        final String str;
        AII aiiA17 = AIM.A17();
        AuraDeviceType auraDeviceTypeType = AuraDevice.INSTANCE.type(C4JM.A00());
        final boolean zA1Z = AnonymousClass002.A1Z(auraDeviceTypeType, AuraDeviceType.Watch);
        int iOrdinal = auraDeviceTypeType.ordinal();
        if (iOrdinal == 0) {
            str = HatchLinkOrderSheetKt.PHONE;
        } else if (iOrdinal == 1) {
            str = "foldable";
        } else if (iOrdinal == 2) {
            str = "tablet";
        } else if (iOrdinal == 3) {
            str = "watch";
        } else {
            if (iOrdinal != 4) {
                throw C3cG.A0q();
            }
            str = "car";
        }
        aiiA17.add(new DJF() { // from class: com.facebook.aura.qpl.AuraQuickPerformanceLogger$createQPLVisitors$1$1
            @Override // X.DJF
            public void visit(COt cOt) {
                C7384Etj.A0Y(cOt, 0);
                boolean z = zA1Z;
                AbstractC4952DHl abstractC4952DHl = ((QuickEventImpl) cOt).A0R;
                abstractC4952DHl.A0D("is_watch", z);
                abstractC4952DHl.A0C(NavigationLoggerImpl.DEVICE_TYPE_KEY, str);
            }

            @Override // X.DJF
            public /* bridge */ int getPriority() {
                return 0;
            }
        });
        aiiA17.add(new C3470COv(interfaceC3472COx, DJe.A00, f18));
        return AIM.A18(aiiA17);
    }
}
