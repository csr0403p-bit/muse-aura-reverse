package com.facebook.aura.analytics.impl;

import X.AGH;
import X.AbstractC4063Cl8;
import X.C06H;
import X.C5246DeB;
import X.C5249DeE;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.CFK;
import X.DFV;
import X.FGI;
import X.InterfaceC4083Clb;
import android.os.HandlerThread;
import com.facebook.aura.analytics.impl.config.MetaAnalyticsMC;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class MetaMicroBatchConfigProvider implements DFV {
    public static final Companion Companion = new Companion();
    public static final String HIGH_PRI_KEY = "realtime_event_latencies";
    public static final String NORMAL_PRI_KEY = "non_realtime_event_latencies";
    public static final String TAG = "MetaMicroBatchConfigProvider";
    public String eventLatencyOverrideStr = "";
    public JsonObject eventLatencyOverride = new JsonObject(AGH.A0E());

    @Override // X.DFV
    public long getEventLatencyOverride(String str) {
        C7384Etj.A0Y(str, 0);
        return fetchLatencyOverride(str, deserializeEventLatencyOverrides(getMetaAnalyticsMC().eventLatencyOverride));
    }

    @Override // X.DFV
    public long getHighPriEventLatencyOverride(String str) {
        C7384Etj.A0Y(str, 0);
        return getHighPriLatencyOverride(str, getMetaAnalyticsMC().eventLatencyOverride);
    }

    @Override // X.DFV
    public long getNormalPriEventLatencyOverride(String str) {
        C7384Etj.A0Y(str, 0);
        return getNormalPriLatencyOverride(str, getMetaAnalyticsMC().eventLatencyOverride);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final JsonObject deserializeEventLatencyOverrides(String str) {
        if (C7384Etj.areEqual(this.eventLatencyOverrideStr, str)) {
            return this.eventLatencyOverride;
        }
        if (C7BY.A0j(str)) {
            return new JsonObject(AGH.A0E());
        }
        try {
            JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(HatchJsonKt.HatchJson.A04(str));
            if (jsonObjectAsJsonObjectOrNull == null) {
                return this.eventLatencyOverride;
            }
            this.eventLatencyOverrideStr = str;
            this.eventLatencyOverride = jsonObjectAsJsonObjectOrNull;
            return jsonObjectAsJsonObjectOrNull;
        } catch (Exception e) {
            CFK.A0B(TAG, FGI.A0M("json exception when fetching latency overrides: ", str), e);
            return this.eventLatencyOverride;
        }
    }

    public long getBatchMaxLatencyMode() {
        return 0L;
    }

    public HandlerThread getHandlerThread() {
        return null;
    }

    @Override // X.DFV
    public InterfaceC4083Clb getHighPriUploadSchedulerParamsProvider() {
        return new HighPriUploadSchedulerParamsProvider();
    }

    @Override // X.DFV
    public InterfaceC4083Clb getNormalPriUploadSchedulerParamsProvider() {
        return new RegularPriUploadSchedulerParamsProvider();
    }

    public AbstractC4063Cl8 getUploadScheduler() {
        return null;
    }

    public boolean isCatchUpSchedulingEnabled() {
        return true;
    }

    public boolean isUploadInProcess() {
        return false;
    }

    public Executor provideExecutor() {
        return null;
    }

    public boolean useExecutor() {
        return false;
    }

    public boolean useInMemoryFallback() {
        return true;
    }

    private final long fetchLatencyOverride(String str, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitiveAsJsonPrimitiveOrNull = JsonObjectExtensionsKt.asJsonPrimitiveOrNull((JsonElement) jsonObject.get(str));
        if (jsonPrimitiveAsJsonPrimitiveOrNull != null) {
            Long lA03 = C9oY.A03(jsonPrimitiveAsJsonPrimitiveOrNull);
            if (lA03 != null) {
                return lA03.longValue();
            }
            CFK.A0B(TAG, FGI.A0M("value is not long for eventName: ", str), null);
        }
        return -1L;
    }

    private final long getBaseLatencyOverride(String str, String str2) {
        return fetchLatencyOverride(str, deserializeEventLatencyOverrides(str2));
    }

    private final long getHighPriLatencyOverride(String str, String str2) {
        JsonObject jsonObjectDeserializeEventLatencyOverrides = deserializeEventLatencyOverrides(str2);
        if (!JsonObjectExtensionsKt.has(jsonObjectDeserializeEventLatencyOverrides, HIGH_PRI_KEY)) {
            return -1L;
        }
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectDeserializeEventLatencyOverrides, HIGH_PRI_KEY);
        if (jsonObjectOptJsonObject != null) {
            return fetchLatencyOverride(str, jsonObjectOptJsonObject);
        }
        CFK.A0B(TAG, "value is not json object for realtime_event_latencies", null);
        return -1L;
    }

    private final MetaAnalyticsMC getMetaAnalyticsMC() {
        return (MetaAnalyticsMC) C5246DeB.A01(C5249DeE.A00(), 65563);
    }

    private final long getNormalPriLatencyOverride(String str, String str2) {
        JsonObject jsonObjectDeserializeEventLatencyOverrides = deserializeEventLatencyOverrides(str2);
        if (!JsonObjectExtensionsKt.has(jsonObjectDeserializeEventLatencyOverrides, NORMAL_PRI_KEY)) {
            return -1L;
        }
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObjectDeserializeEventLatencyOverrides, NORMAL_PRI_KEY);
        if (jsonObjectOptJsonObject != null) {
            return fetchLatencyOverride(str, jsonObjectOptJsonObject);
        }
        CFK.A0B(TAG, "value is not json object for non_realtime_event_latencies", null);
        return -1L;
    }

    public int analyticsBatchInfoSize() {
        return getMetaAnalyticsMC().analyticsBatchInfoSize;
    }

    @Override // X.DFV
    public long getInMemoryUploadDelay() {
        return getMetaAnalyticsMC().inMemoryUploadDelay;
    }

    @Override // X.DFV
    public long getLatencyWindowMultiplier() {
        return getMetaAnalyticsMC().latencyWindowMultiplier;
    }

    @Override // X.DFV
    public long getRealTimeExemptLatency() {
        return getMetaAnalyticsMC().realTimeExemptLatency;
    }

    @Override // X.DFV
    public long getRegularExemptLatency() {
        return getMetaAnalyticsMC().regularExemptLatency;
    }

    public boolean isExemptFromMicroBatching(String str) {
        return false;
    }

    @Override // X.DFV
    public boolean isMicroBatchingEnabled() {
        return getMetaAnalyticsMC().microBatchEnabled;
    }

    @Override // X.DFV
    public int multiBatchPayloadSize() {
        return getMetaAnalyticsMC().multiBatchPayloadSize;
    }

    public int regularUploadDelay() {
        return getMetaAnalyticsMC().regularUploadDelay;
    }

    @Override // X.DFV
    public boolean shouldNotifyOnBatchReady() {
        return getMetaAnalyticsMC().shouldNotifyOnBatchReady;
    }

    public boolean isExemptFromChangesInDefaultLatency(String str, boolean z) {
        return false;
    }
}
