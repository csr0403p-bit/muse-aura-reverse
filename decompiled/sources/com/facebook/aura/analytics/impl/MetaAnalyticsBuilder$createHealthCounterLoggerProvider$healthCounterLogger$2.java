package com.facebook.aura.analytics.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C4943DGh;
import X.C4947DGs;
import X.C4950DGx;
import X.C7384Etj;
import X.DGS;
import X.DH5;
import X.DH8;
import X.DHE;
import X.DHH;
import X.DHL;
import X.EQe;
import X.ETi;
import X.EWq;
import X.F0C;
import X.F18;
import X.F60;
import X.HandlerC4951DGy;
import android.content.Context;
import android.os.Looper;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.falco.sampling.FFSamplingBridgeJava;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MetaAnalyticsBuilder$createHealthCounterLoggerProvider$healthCounterLogger$2 extends AbstractC7559F3s implements Function0<DGS> {
    public final /* synthetic */ F0C<Boolean> $isDebugBuild$delegate;
    public final /* synthetic */ F0C<Boolean> $isFfdbEnabled$delegate;
    public final /* synthetic */ C4947DGs $oneFabricEventHandler;
    public final /* synthetic */ MetaAnalyticsBuilder this$0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DGS invoke() {
        C4950DGx c4950DGx;
        DHL dhl = C4950DGx.A08;
        Context contextA06 = C3cG.A06();
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor("HCFlushExecutor", null);
        DH8 dh8CreateFFA2UploadConfiguration = this.this$0.createFFA2UploadConfiguration();
        String baseFilePath = this.this$0.getBaseFilePath();
        C4943DGh c4943DGh = new C4943DGh();
        Looper looperA0D = BV5.A0D("a2_hc_logger");
        C7384Etj.A0U(looperA0D);
        boolean zA1X = AnonymousClass001.A1X(this.$isFfdbEnabled$delegate.getValue());
        DHH dhh = new DHH();
        C4947DGs c4947DGs = this.$oneFabricEventHandler;
        boolean zA1X2 = AnonymousClass001.A1X(this.$isDebugBuild$delegate.getValue());
        synchronized (dhl) {
            C7384Etj.A0Y(contextA06, 0);
            c4950DGx = C4950DGx.A01;
            if (c4950DGx == null) {
                c4950DGx = new C4950DGx();
                C4950DGx.A05 = c4943DGh;
                C4950DGx.A03 = dhh;
                c4950DGx.A00 = c4947DGs;
                C4950DGx.A07 = zA1X;
                C4950DGx.A06 = zA1X2;
                C4950DGx.A04 = new HandlerC4951DGy(looperA0D, new EWq(c4950DGx, 3), new EQe(c4950DGx, 6));
                DHH dhh2 = C4950DGx.A03;
                if (dhh2 == null) {
                    C7384Etj.A0b("samplingConfig");
                    throw F60.createAndThrow();
                }
                C4950DGx.A02 = new DHE(dhh2);
                try {
                    if (c4950DGx.A00 == null) {
                        ETi.A06(contextA06.getApplicationContext(), 0);
                        FFSingletonJNILogger.setAppId("4331325740476680");
                        FFSingletonJNILogger.setAppVersion("16.0.0.11.159");
                        FFSingletonJNILogger.setClientToken(dh8CreateFFA2UploadConfiguration.A00);
                        FFSingletonJNILogger.setUserAgent(dh8CreateFFA2UploadConfiguration.A01);
                        FFSingletonJNILogger.setBaseFilePath(baseFilePath);
                        F18<TigonServiceHolder> f18 = dh8CreateFFA2UploadConfiguration.A02;
                        boolean z = FFSamplingBridgeJava.sIsInitialized;
                        synchronized (FFSamplingBridgeJava.class) {
                            try {
                                if (!FFSamplingBridgeJava.sIsInitialized) {
                                    FFSamplingBridgeJava.sHyperThrift = null;
                                    FFSamplingBridgeJava.sQPLConfigHandlerProvider = null;
                                    FFSamplingBridgeJava.sTigonServiceHolderProvider = f18;
                                    FFSamplingBridgeJava.sUploader = null;
                                    FFSamplingBridgeJava.sUploadCallback = null;
                                    FFSamplingBridgeJava.sContext = null;
                                    FFSamplingBridgeJava.initNative();
                                    FFSamplingBridgeJava.sIsInitialized = true;
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                    if (zA1X) {
                        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new DH5(c4950DGx), 0L, 1000L, TimeUnit.MILLISECONDS);
                    }
                    if (zA1X2) {
                        FFSingletonJNILogger.enableEventListeners();
                        FFSingletonJNILogger.setOneFabricHCEnabled(true);
                        FFSingletonJNILogger.setEnableInternalDebugLogging(true);
                    }
                    C4950DGx.A01 = c4950DGx;
                } catch (IOException e) {
                    throw BV4.A0d("SoLoader.init() failed", e);
                }
            }
        }
        return c4950DGx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAnalyticsBuilder$createHealthCounterLoggerProvider$healthCounterLogger$2(MetaAnalyticsBuilder metaAnalyticsBuilder, C4947DGs c4947DGs, F0C<Boolean> f0c, F0C<Boolean> f0c2) {
        super(0);
        this.this$0 = metaAnalyticsBuilder;
        this.$oneFabricEventHandler = c4947DGs;
        this.$isFfdbEnabled$delegate = f0c;
        this.$isDebugBuild$delegate = f0c2;
    }
}
