package com.crossapp.tigonhttp;

import X.AnonymousClass005;
import X.C7384Etj;
import X.ERb;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonXplatService;
import com.facebook.tigon.interceptors.TigonXplatInterceptorsHolder;
import com.facebook.tigon.requestprioritization.calculatorprovider.HttpPriorityCalculatorProvider;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public class TigonHttpClient$TigonHttpClientServiceHolder extends TigonXplatService {
    public static final ERb Companion = new ERb();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonHttpClient$TigonHttpClientServiceHolder(HybridData hybridData) {
        super(hybridData, null, null);
        C7384Etj.A0Y(hybridData, 0);
    }

    public static final native HybridData initHybrid(TigonHttpClientConfig tigonHttpClientConfig, String str, String str2, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, HucClient hucClient, XAnalyticsHolder xAnalyticsHolder, TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder, HttpPriorityCalculatorProvider httpPriorityCalculatorProvider, TigonRetryRulesHolder tigonRetryRulesHolder, TigonQueuePolicyHolder tigonQueuePolicyHolder, Function0<Boolean> function0);

    public final native void cancelWebSocketPreconnect();

    @Override // com.facebook.tigon.TigonXplatService, com.facebook.tigon.iface.TigonServiceHolder
    public native String generateBugReport();

    public final native void onAppStateChange(boolean z);

    @Override // com.facebook.tigon.iface.TigonServiceHolder
    public native void preconnect(String str);

    public final native boolean preconnectWebSocket(String str, boolean z);

    public final native void runEventLoop();

    public final native void setProxyClientIPAddress(String str, int i, String str2);

    public final native void setProxyHostAndPort(String str, int i, boolean z);

    public final native void syncDiskCachesForTest();

    static {
        ETi.loadLibrary("tigonhttpclient-jni");
        ETi.loadLibrary("mnscertificateverifier");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TigonHttpClient$TigonHttpClientServiceHolder(TigonHttpClientConfig tigonHttpClientConfig, String str, String str2, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, HucClient hucClient, XAnalyticsHolder xAnalyticsHolder, TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder, HttpPriorityCalculatorProvider httpPriorityCalculatorProvider, TigonRetryRulesHolder tigonRetryRulesHolder, TigonQueuePolicyHolder tigonQueuePolicyHolder, Function0<Boolean> function0) {
        this(initHybrid(tigonHttpClientConfig, str, str2, scheduledExecutorService, executorService, hucClient, xAnalyticsHolder, tigonXplatInterceptorsHolder, httpPriorityCalculatorProvider, tigonRetryRulesHolder, tigonQueuePolicyHolder, function0));
        AnonymousClass005.A14(tigonHttpClientConfig, str, str2, scheduledExecutorService);
    }
}
