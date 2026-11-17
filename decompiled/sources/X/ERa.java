package X;

import com.crossapp.tigonhttp.TigonHttpClientConfig;
import com.crossapp.tigonhttp.TigonQueuePolicyHolder;
import com.crossapp.tigonhttp.TigonRetryRulesHolder;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.crossapp.tigonhttp.noise.TigonHttpClientWithNoise$TigonHttpClientWithNoiseServiceHolder;
import com.facebook.jni.HybridData;
import com.facebook.tigon.interceptors.TigonXplatInterceptorsHolder;
import com.facebook.tigon.requestprioritization.calculatorprovider.HttpPriorityCalculatorProvider;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ERa {
    private final HybridData initHybrid(TigonHttpClientConfig tigonHttpClientConfig, String str, String str2, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, HucClient hucClient, XAnalyticsHolder xAnalyticsHolder, TigonXplatInterceptorsHolder tigonXplatInterceptorsHolder, HttpPriorityCalculatorProvider httpPriorityCalculatorProvider, TigonRetryRulesHolder tigonRetryRulesHolder, TigonQueuePolicyHolder tigonQueuePolicyHolder, Function0<Boolean> function0, NoiseChannelManagerHolder noiseChannelManagerHolder) {
        return TigonHttpClientWithNoise$TigonHttpClientWithNoiseServiceHolder.initHybrid(tigonHttpClientConfig, str, str2, scheduledExecutorService, executorService, hucClient, xAnalyticsHolder, tigonXplatInterceptorsHolder, httpPriorityCalculatorProvider, tigonRetryRulesHolder, tigonQueuePolicyHolder, function0, noiseChannelManagerHolder);
    }
}
