package com.facebook.aura.mobileconfig.session;

import X.AGH;
import X.AbstractC3145Bzb;
import X.AbstractC5321DgF;
import X.AbstractC7496EyB;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C0861A6i;
import X.C3143BzU;
import X.C3146Bzc;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5055DRf;
import X.C5057DRi;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C7Bm;
import X.C8ee;
import X.C9X;
import X.CFK;
import X.CGP;
import X.DNO;
import X.DRX;
import X.DRZ;
import X.DS1;
import X.DS4;
import X.DSB;
import X.DSU;
import X.F0C;
import X.F18;
import X.F1F;
import X.FGI;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.InterfaceC5058DRj;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Pair;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.mobileconfig.emergencypush.AuraMobileConfigEmergencyPushHandler;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.debug.tracer.Tracer;
import com.facebook.mobileconfig.MobileConfigFetcher;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigManagerParamsHolder;
import com.facebook.mobileconfig.MobileConfigUsingPureJavaDependencies;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraMobileConfigSession {
    public final F0C _e2eMobileConfigAccessListenerImpl$delegate;
    public final String deviceId;
    public final F0C executorFactory$delegate;
    public DRX mobileConfig;
    public final int unitType;
    public final Function0<String> userIdProvider;

    /* renamed from: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession$getLegacyMobileConfigWithCrudo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<File, String, MobileConfigManagerHolderImpl> {
        public final /* synthetic */ String $appVersion;
        public final /* synthetic */ AssetManager $assetManager;
        public final /* synthetic */ MobileConfigUsingPureJavaDependencies $cppMobileConfig;
        public final /* synthetic */ String $deviceVersion;
        public final /* synthetic */ Map<String, String> $extraUrlParams;
        public final /* synthetic */ MobileConfigManagerParamsHolder $initParamsHolder;
        public final /* synthetic */ String $overrideParamsMapPath;
        public final /* synthetic */ AuraMobileConfigSession this$0;

        @Override // X.G0V
        public final MobileConfigManagerHolderImpl invoke(File file, String str) {
            boolean zA1b = AnonymousClass004.A1b(file, str);
            MobileConfigManagerHolderImpl mobileConfigManagerHolderImplCreateManager = this.$cppMobileConfig.createManager(file, this.$appVersion, this.$deviceVersion, str, this.this$0.unitType, this.$overrideParamsMapPath, this.$assetManager, zA1b, this.$initParamsHolder, this.$extraUrlParams, null, null, null, zA1b, null);
            C7384Etj.A0U(mobileConfigManagerHolderImplCreateManager);
            return mobileConfigManagerHolderImplCreateManager;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies, String str, String str2, AuraMobileConfigSession auraMobileConfigSession, String str3, AssetManager assetManager, MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder, Map<String, String> map) {
            super(2);
            this.$cppMobileConfig = mobileConfigUsingPureJavaDependencies;
            this.$appVersion = str;
            this.$deviceVersion = str2;
            this.this$0 = auraMobileConfigSession;
            this.$overrideParamsMapPath = str3;
            this.$assetManager = assetManager;
            this.$initParamsHolder = mobileConfigManagerParamsHolder;
            this.$extraUrlParams = map;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.aura.mobileconfig.session.AuraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0] */
    public final void create(MobileConfigFetcher mobileConfigFetcher, F18<C3143BzU> f18, File file, C5057DRi c5057DRi, AssetManager assetManager, String str, String str2, boolean z) {
        boolean z2;
        String userId;
        C3146Bzc c3146Bzc;
        C3146Bzc c3146Bzc2;
        boolean zA1a = AnonymousClass002.A1a(mobileConfigFetcher, f18);
        AnonymousClass005.A16(file, c5057DRi, assetManager, str, 2);
        C7384Etj.A0Y(str2, 6);
        final G0V<File, String, MobileConfigManagerHolderImpl> legacyMobileConfigWithCrudo = getLegacyMobileConfigWithCrudo(mobileConfigFetcher, str, this.deviceId, str2, assetManager);
        F18 f182 = setupApiLogger(this.deviceId);
        AuraMobileConfigEmergencyPushHandler emergencyPushHandler = getEmergencyPushHandler();
        int i = this.unitType;
        Set setA13 = C60O.A13();
        AuraMobileConfigSession$create$builder$1 auraMobileConfigSession$create$builder$1 = new AuraMobileConfigSession$create$builder$1(this);
        Context contextA06 = C3cG.A06();
        if (new Random().nextInt(60) == 0) {
            int iA02 = (int) C3cI.A02();
            String strA0M = FGI.A0M("mc_ratelimit_", "api2");
            C3146Bzc c3146Bzc3 = new C3146Bzc();
            c3146Bzc3.A00 = contextA06;
            int iA00 = AbstractC3145Bzb.A00(c3146Bzc3, strA0M);
            if (iA00 == 0) {
                int iRandom = iA02 - ((int) (Math.random() * 2592000.0d));
                String strA0M2 = FGI.A0M("mc_ratelimit_", "api2");
                if (contextA06 == null) {
                    c3146Bzc2 = null;
                } else {
                    c3146Bzc2 = new C3146Bzc();
                    c3146Bzc2.A00 = contextA06;
                }
                AbstractC3145Bzb.A03(c3146Bzc2, strA0M2, iRandom);
            } else if (iA00 + 2592000 <= iA02) {
                String strA0M3 = FGI.A0M("mc_ratelimit_", "api2");
                if (contextA06 == null) {
                    c3146Bzc = null;
                } else {
                    c3146Bzc = new C3146Bzc();
                    c3146Bzc.A00 = contextA06;
                }
                AbstractC3145Bzb.A03(c3146Bzc, strA0M3, iA02);
                z2 = true;
            }
            z2 = false;
        } else {
            z2 = false;
        }
        ?? r2 = new Object(legacyMobileConfigWithCrudo) { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0
            public final /* synthetic */ G0V function;

            {
                C7384Etj.A0Y(legacyMobileConfigWithCrudo, 0);
                this.function = legacyMobileConfigWithCrudo;
            }

            public final /* synthetic */ InterfaceC5058DRj create(File file2, String str3) {
                return (InterfaceC5058DRj) this.function.invoke(file2, str3);
            }

            public /* synthetic */ InterfaceC5058DRj create(File file2, String str3, boolean z3) {
                return create(file2, str3);
            }

            public /* synthetic */ InterfaceC5058DRj create(File file2, String str3, boolean z3, boolean z4) {
                return create(file2, str3);
            }

            public /* synthetic */ InterfaceC5058DRj create(File file2, String str3, boolean z3, boolean z4, boolean z5) {
                return create(file2, str3);
            }
        };
        if (C9X.A04()) {
            CFK.A05(AuraMobileConfigSessionKt.TAG, "creating sessioned MC with E2E access listener");
            setA13 = Collections.singleton(get_e2eMobileConfigAccessListenerImpl());
        }
        CFK.A03(Integer.valueOf(i), "MobileConfigFactoryImpl", "Created MobileConfigFactoryImpl, unitType:%s");
        DRZ drz = new DRZ(assetManager, emergencyPushHandler, auraMobileConfigSession$create$builder$1, r2, new DS4(), c5057DRi, file, setA13, f182, f18, i, z2);
        AtomicBoolean atomicBoolean = drz.A0E;
        if (!atomicBoolean.get()) {
            AuraMobileConfigSession$create$builder$1 auraMobileConfigSession$create$builder$12 = drz.A05;
            if (auraMobileConfigSession$create$builder$12 == null || (userId = auraMobileConfigSession$create$builder$12.getUserId()) == null) {
                userId = "";
            }
            synchronized (drz.A0B) {
                if (atomicBoolean.compareAndSet(false, zA1a)) {
                    AuraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0 auraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0 = drz.A06;
                    if (auraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0 == null) {
                        CFK.A0H("MobileConfigFactoryImpl", "Calling initCppManagerIfNeeded with null mCppManagerCreator, userId:%s", userId);
                    } else {
                        int i2 = drz.A03;
                        if ((i2 != 2 && i2 != 4) || (!userId.isEmpty() && !userId.equals(HatchPriceImpressionEventDataKt.NO_DISCOUNT))) {
                            Tracer.A02("MobileConfigFactoryImpl.initCppManager %s", DSB.A00(i2));
                            try {
                                InterfaceC5058DRj interfaceC5058DRjCreate = auraMobileConfigSessionKt$sam$com_facebook_mobileconfig_impl_MobileConfigFactoryImpl_ManagerHolderCreator$0.create(drz.A0A, userId);
                                if (interfaceC5058DRjCreate != null) {
                                    AtomicReferenceArray<DSU> atomicReferenceArray = drz.A0V;
                                    ArrayList arrayListA0h = C3cG.A0h();
                                    for (int i3 = 0; i3 < atomicReferenceArray.length(); i3++) {
                                        if (atomicReferenceArray.get(i3) != null) {
                                            arrayListA0h.add(Integer.valueOf(i3));
                                        }
                                    }
                                    int[] iArrA00 = AbstractC7496EyB.A00(arrayListA0h);
                                    synchronized (drz) {
                                        drz.A0G.set(zA1a);
                                        drz.A0C(interfaceC5058DRjCreate);
                                        drz.A0B();
                                    }
                                    for (int i4 : iArrA00) {
                                        drz.A07(i4);
                                    }
                                }
                                Tracer.A00();
                            } catch (Throwable th) {
                                Tracer.A00();
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            drz.A09().tryUpdateConfigsSynchronously(0);
        }
        this.mobileConfig = drz;
        CFK.A05(AuraMobileConfigSessionKt.TAG, "inited sessioned MC.");
        F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate).execute(new Runnable() { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession.create.2
            @Override // java.lang.Runnable
            public final void run() {
                int size;
                DNO dno = DNO.A08;
                synchronized (dno.A04) {
                    List<Pair<String, String>> list = dno.A05;
                    size = list.size();
                    for (Pair<String, String> pair : list) {
                        DNO.A00(dno, (String) pair.first, (String) pair.second);
                    }
                    list.clear();
                }
                dno.A06.set(true);
                BV4.A1B(size, "MobileConfigApiGeneralLoggerImpl", "MobileConfigApiGeneralLoggerImpl inited, logged %s early access config");
            }
        });
    }

    public /* synthetic */ AuraMobileConfigSession(Function0 function0, String str, int i, int i2, C06H c06h) {
        this(function0, str, (i2 & 4) != 0 ? 2 : i);
    }

    public static /* synthetic */ void create$default(AuraMobileConfigSession auraMobileConfigSession, MobileConfigFetcher mobileConfigFetcher, F18 f18, File file, C5057DRi c5057DRi, AssetManager assetManager, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            file = C3cG.A06().getFilesDir();
            C7384Etj.A0U(file);
        }
        if ((i & 8) != 0) {
            int i2 = auraMobileConfigSession.unitType;
            c5057DRi = new C5057DRi();
            c5057DRi.A01 = null;
            c5057DRi.A00 = null;
            c5057DRi.A02 = new C5055DRf(file, f18, i2);
        }
        if ((i & 16) != 0) {
            assetManager = C3cG.A06().getAssets();
            C7384Etj.A0U(assetManager);
        }
        if ((i & 32) != 0) {
            str = auraMobileConfigSession.getAppVersion();
        }
        if ((i & 64) != 0) {
            str2 = "";
        }
        if ((i & 128) != 0) {
            z = true;
        }
        auraMobileConfigSession.create(mobileConfigFetcher, f18, file, c5057DRi, assetManager, str, str2, z);
    }

    private final AuraMobileConfigEmergencyPushHandler getEmergencyPushHandler() {
        if (this.unitType == 2) {
            return new AuraMobileConfigEmergencyPushHandler();
        }
        return null;
    }

    private final AndroidAsyncExecutorFactory getExecutorFactory() {
        return (AndroidAsyncExecutorFactory) this.executorFactory$delegate.getValue();
    }

    private final G0V<File, String, MobileConfigManagerHolderImpl> getLegacyMobileConfigWithCrudo(MobileConfigFetcher mobileConfigFetcher, String str, String str2, String str3, AssetManager assetManager) {
        MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies = MobileConfigUsingPureJavaDependencies.$redex_init_class;
        MobileConfigUsingPureJavaDependencies mobileConfigUsingPureJavaDependencies2 = new MobileConfigUsingPureJavaDependencies(getExecutorFactory(), mobileConfigFetcher, AnonymousClass002.A1Q(this.unitType, 2), AuraMobileConfigLogger.instance, null, null);
        Map mapA10 = this.unitType == 1 ? AnonymousClass006.A10(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM, FGI.A0U("4331325740476680", "|", "330bd45681a06ad240322862d206c0be")) : AGH.A0E();
        MobileConfigManagerParamsHolder mobileConfigManagerParamsHolder = new MobileConfigManagerParamsHolder();
        mobileConfigManagerParamsHolder.setUsePartialAndFullSyncFetch(false);
        return new AnonymousClass1(mobileConfigUsingPureJavaDependencies2, str, str2, this, str3, assetManager, mobileConfigManagerParamsHolder, mapA10);
    }

    private final CGP get_e2eMobileConfigAccessListenerImpl() {
        return (CGP) this._e2eMobileConfigAccessListenerImpl$delegate.getValue();
    }

    private final DRX resetMC() {
        C5057DRi c5057DRi = new C5057DRi();
        int i = this.unitType;
        HashSet hashSetA13 = C60O.A13();
        CFK.A03(Integer.valueOf(i), "MobileConfigFactoryImpl", "Created MobileConfigFactoryImpl, unitType:%s");
        DRZ drz = new DRZ(null, null, null, null, new DS4(), c5057DRi, null, hashSetA13, null, null, i, false);
        C0861A6i.A01(drz.getClass());
        return drz;
    }

    private final F18 setupApiLogger(String str) {
        final DNO dno = DNO.A08;
        F18 f18 = new F18() { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession.setupApiLogger.1
            @Override // X.F18
            /* renamed from: get */
            public final C8ee<?> AMN() {
                return C3cH.A0I();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return C3cH.A0I();
            }
        };
        F18 f182 = new F18() { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession.setupApiLogger.2
            @Override // X.F18
            /* renamed from: get */
            public final ExecutorService AMN() {
                return (ExecutorService) AuraExecutors.backgroundThreadExecutor$delegate.getValue();
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return AuraExecutors.backgroundThreadExecutor$delegate.getValue();
            }
        };
        synchronized (dno) {
            AtomicBoolean atomicBoolean = dno.A07;
            if (!atomicBoolean.get()) {
                dno.A03 = f18;
                dno.A02 = f182;
                dno.A00 = str;
                dno.A01 = "hatch";
                atomicBoolean.set(true);
            }
        }
        return new F18() { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession.setupApiLogger.3
            @Override // X.F18
            /* renamed from: get */
            public final DNO AMN() {
                return dno;
            }

            @Override // X.F18
            /* renamed from: get */
            public /* bridge */ /* synthetic */ Object AMN() {
                return dno;
            }
        };
    }

    public final DRZ getMCFactory() {
        DRX drx = this.mobileConfig;
        if (drx instanceof DRZ) {
            return (DRZ) drx;
        }
        return null;
    }

    public final DRX getMobileConfig() {
        return this.mobileConfig;
    }

    private final String getAppVersion() {
        try {
            String str = BV5.A0A(C3cG.A06()).versionName;
            return str == null ? "unknown" : str;
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public final void fetchConfigs() {
        final DRZ mCFactory = getMCFactory();
        if (mCFactory != null) {
            DS1 ds1 = new DS1();
            ds1.A06 = true;
            ds1.A01 = new MobileConfigUpdateConfigsCallback() { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession$fetchConfigs$options$1$1
                @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
                public final void onNetworkComplete(boolean z) {
                    if (z) {
                        DRZ mCFactory2 = this.this$0.getMCFactory();
                        DRZ drz = mCFactory;
                        if (mCFactory2 == drz) {
                            drz.A0B();
                        }
                    }
                }

                @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
                public /* synthetic */ void onNetworkCompleteWithMessage(boolean z, String str) {
                    onNetworkComplete(z);
                }

                @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
                public /* synthetic */ void onNetworkCompleteWithResult(boolean z, String str, Integer num) {
                    onNetworkCompleteWithMessage(z, str);
                }
            };
            CFK.A03(Boolean.valueOf(mCFactory.A09().A02.updateConfigs(ds1)), AuraMobileConfigSessionKt.TAG, "Scheduled sessioned MC fetch: %s");
        }
    }

    public final Object fetchConfigsSynchronously(HtJ<? super Boolean> htJ) {
        final DRZ mCFactory = getMCFactory();
        if (mCFactory == null) {
            return AnonymousClass001.A0h();
        }
        final GBL gblA03 = C7Bm.A03(htJ);
        DS1 ds1 = new DS1();
        final F1F f1f = new F1F();
        ds1.A01 = new MobileConfigUpdateConfigsCallback() { // from class: com.facebook.aura.mobileconfig.session.AuraMobileConfigSession$fetchConfigsSynchronously$2$1
            @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
            public final void onNetworkComplete(boolean z) {
                F1F f1f2 = f1f;
                if (f1f2.element) {
                    CFK.A07(AuraMobileConfigSessionKt.TAG, "Synchronous fetch completed twice");
                    return;
                }
                f1f2.element = true;
                if (z) {
                    DRZ mCFactory2 = this.getMCFactory();
                    DRZ drz = mCFactory;
                    if (mCFactory2 == drz) {
                        drz.A0B();
                    }
                    CFK.A05(AuraMobileConfigSessionKt.TAG, "Synchronous fetch completed");
                } else {
                    CFK.A06(AuraMobileConfigSessionKt.TAG, "Synchronous fetch FAILED");
                }
                gblA03.resumeWith(Boolean.valueOf(z));
            }

            @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
            public /* synthetic */ void onNetworkCompleteWithMessage(boolean z, String str) {
                onNetworkComplete(z);
            }

            @Override // com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback
            public /* synthetic */ void onNetworkCompleteWithResult(boolean z, String str, Integer num) {
                onNetworkCompleteWithMessage(z, str);
            }
        };
        mCFactory.A09().updateConfigs(ds1);
        return gblA03.A0F();
    }

    public final void reset() {
        this.mobileConfig = resetMC();
    }

    public AuraMobileConfigSession(Function0<String> function0, String str, int i) {
        AnonymousClass003.A0u(function0, str);
        this.userIdProvider = function0;
        this.deviceId = str;
        this.unitType = i;
        this.mobileConfig = resetMC();
        this._e2eMobileConfigAccessListenerImpl$delegate = AbstractC5321DgF.A02(C79.A00, AuraMobileConfigSession$_e2eMobileConfigAccessListenerImpl$2.INSTANCE);
        this.executorFactory$delegate = AbstractC5321DgF.A03(AuraMobileConfigSession$executorFactory$2.INSTANCE);
    }
}
