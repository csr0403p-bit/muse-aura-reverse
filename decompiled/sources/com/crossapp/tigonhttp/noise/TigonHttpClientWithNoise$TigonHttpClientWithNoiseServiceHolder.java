package com.crossapp.tigonhttp.noise;

import X.AnonymousClass005;
import X.C7384Etj;
import X.ERa;
import X.ETi;
import com.crossapp.tigonhttp.TigonHttpClient$TigonHttpClientServiceHolder;
import com.crossapp.tigonhttp.TigonHttpClientConfig;
import com.crossapp.tigonhttp.TigonQueuePolicyHolder;
import com.crossapp.tigonhttp.TigonRetryRulesHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.TigonXplatInterceptorsHolder;
import com.facebook.tigon.requestprioritization.calculatorprovider.HttpPriorityCalculatorProvider;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonHttpClientWithNoise$TigonHttpClientWithNoiseServiceHolder extends TigonHttpClient$TigonHttpClientServiceHolder {
    public static final ERa Companion = new ERa();
    public final NoiseChannelManagerHolder noiseChannelManagerHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonHttpClientWithNoise$TigonHttpClientWithNoiseServiceHolder(TigonHttpClientConfig tigonHttpClientConfig, String str, String str2, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, HucClient hucClient, XAnalyticsHolder xAnalyticsHolder, TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder, HttpPriorityCalculatorProvider httpPriorityCalculatorProvider, TigonRetryRulesHolder tigonRetryRulesHolder, TigonQueuePolicyHolder tigonQueuePolicyHolder, Function0<Boolean> function0, NoiseChannelManagerHolder noiseChannelManagerHolder) {
        super(initHybrid(tigonHttpClientConfig, str, str2, scheduledExecutorService, executorService, hucClient, xAnalyticsHolder, tigonXplatInterceptorsHolder, httpPriorityCalculatorProvider, tigonRetryRulesHolder, tigonQueuePolicyHolder, function0, noiseChannelManagerHolder));
        AnonymousClass005.A14(tigonHttpClientConfig, str, str2, scheduledExecutorService);
        C7384Etj.A0Y(noiseChannelManagerHolder, 12);
        this.noiseChannelManagerHolder = noiseChannelManagerHolder;
    }

    public static /* synthetic */ void getNoiseChannelManagerHolder$annotations() {
    }

    public static final native HybridData initHybrid(TigonHttpClientConfig tigonHttpClientConfig, String str, String str2, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, HucClient hucClient, XAnalyticsHolder xAnalyticsHolder, TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder, HttpPriorityCalculatorProvider httpPriorityCalculatorProvider, TigonRetryRulesHolder tigonRetryRulesHolder, TigonQueuePolicyHolder tigonQueuePolicyHolder, Function0<Boolean> function0, NoiseChannelManagerHolder noiseChannelManagerHolder);

    static {
        ETi.loadLibrary("tigonhttpclient-jni");
        ETi.loadLibrary("mnscertificateverifier");
        ETi.loadLibrary("noise-channel-manager-jni");
    }
}
