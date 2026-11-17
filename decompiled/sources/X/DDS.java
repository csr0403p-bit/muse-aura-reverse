package X;

import android.util.ArrayMap;
import android.util.Log;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class DDS implements Serializable {
    public static final long serialVersionUID = 97435743598597292L;
    public final boolean disableSyncReadWrite;
    public final boolean enableShardCachedFiles;
    public final boolean fixReadWriteBlock;
    public final boolean skipCacheBeforeInited;
    public final long skipDeadSpanLockThresholdMs;
    public final boolean useSimpleLocks;
    public final String cacheDirectory = null;
    public final String oldCacheDirectory = null;
    public final boolean allowOldCacheCleanup = false;
    public final int cacheSizeInBytes = 104857600;
    public final boolean useFbLruCacheEvictor = true;
    public final boolean usePerVideoLruProtectCacheEvictor = false;
    public final int protectPrefetchCacheMinOffset = 1048576;
    public final double protectPrefetchCacheMaxPercent = 0.3d;
    public final boolean usePerVideoLruCache = false;
    public final boolean delayInitCache = false;
    public final boolean initCacheImmediatelyForPrefetch = false;
    public final int perVideoLRUMinOffset = 0;
    public final double perVideoLRUMaxPercent = 0.1d;
    public long timeToLiveMs = 0;
    public final long timeToLiveEvictionIntervalForegroundMs = 60000;
    public final long timeToLiveEvictionIntervalBackgroundMs = 3600000;
    public final boolean enableCacheInstrumentation = false;
    public final int cacheInstrumentationEventBatchPeriodS = 0;
    public final int cacheInstrumentationLowRamItemLimit = -1;
    public final int cacheInstrumentationHighRamItemLimit = -1;
    public final int numSubDirectory = 10;
    public final boolean enableOnlyCacheEvictionInstrumentation = false;
    public final boolean skipCacheQueriesForEvictionsOnlyLogging = false;
    public final boolean enableUtilisationInstrumentation = false;
    public final int cacheInstrumentationSamplingRate = 1;
    public final boolean cacheManagerWaitForCacheInitialization = false;
    public final boolean enableInitSegmentFix = false;
    public final boolean enableCacheEfficiencyLoggingExtraCheck = false;
    public final boolean useExoV2Cache = false;
    public final boolean trackLruEvictionsFix = false;
    public final boolean onlyRunStartupCriticalCacheInit = false;
    public final boolean enableDynamicCacheFileSizeInV2 = false;
    public final boolean enableCacheV2Optimizations = false;
    public final boolean useConcurrentCacheListeners = false;
    public final boolean useIsDirectory = false;
    public final boolean enableLightweightCacheDb = false;
    public final boolean deferCacheDirectoryLoad = false;
    public final long metadataCacheDbUpdateFrequencyMs = 0;
    public final boolean disableInitConditionVariable = false;
    public final boolean enableProgressiveCacheLoading = false;
    public final boolean enableLightCacheThreadGuard = false;
    public final boolean deferCacheInitUnlinks = false;
    public final boolean dedupeSpanRemovedNotification = false;
    public final boolean encodeLengthInCacheFileName = false;
    public final long earlyCommitMinBytes = 0;
    public final long earlyCommitMaxDelayMs = 200;
    public final boolean prefetchYieldToActiveWriter = false;

    public DDS(long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.fixReadWriteBlock = z;
        this.enableShardCachedFiles = z2;
        this.skipCacheBeforeInited = z3;
        this.skipDeadSpanLockThresholdMs = j;
        this.disableSyncReadWrite = z4;
        this.useSimpleLocks = z5;
    }

    public final String toString() throws JSONException {
        JSONObject jSONObjectA18 = BV4.A18();
        ArrayMap arrayMap = new ArrayMap();
        String str = this.cacheDirectory;
        String str2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        if (str == null) {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        arrayMap.put("cache_directory", str);
        String str3 = this.oldCacheDirectory;
        if (str3 != null) {
            str2 = str3;
        }
        arrayMap.put("old_cache_directory", str2);
        arrayMap.put("allow_old_cache_cleanup", String.valueOf(this.allowOldCacheCleanup));
        arrayMap.put("cache_size_in_bytes", String.valueOf(this.cacheSizeInBytes));
        arrayMap.put("use_fb_lru_cache_evictor", String.valueOf(this.useFbLruCacheEvictor));
        arrayMap.put("use_per_video_lru_protect_prefetch_cache_evictor", String.valueOf(this.usePerVideoLruProtectCacheEvictor));
        arrayMap.put("protect_prefetch_cache_min_offset", String.valueOf(this.protectPrefetchCacheMinOffset));
        arrayMap.put("protect_prefetch_cache_max_percent", String.valueOf(this.protectPrefetchCacheMaxPercent));
        arrayMap.put("use_per_video_lru_cache", String.valueOf(this.usePerVideoLruCache));
        arrayMap.put("delay_init_cache", String.valueOf(this.delayInitCache));
        arrayMap.put("init_cache_immediately_for_prefetch", String.valueOf(this.initCacheImmediatelyForPrefetch));
        arrayMap.put("per_video_lru_min_offset", String.valueOf(this.perVideoLRUMinOffset));
        arrayMap.put("per_video_lru_max_percent", String.valueOf(this.perVideoLRUMaxPercent));
        arrayMap.put("fix_read_write_block", String.valueOf(this.fixReadWriteBlock));
        arrayMap.put("enable_shard_cached_files", String.valueOf(this.enableShardCachedFiles));
        arrayMap.put("num_sub_directory", String.valueOf(this.numSubDirectory));
        arrayMap.put("skip_cache_before_inited", String.valueOf(this.skipCacheBeforeInited));
        arrayMap.put("skip_dead_span_lock_threshold_ms", String.valueOf(this.skipDeadSpanLockThresholdMs));
        arrayMap.put("cache_manager_wait_for_cache_initialization", String.valueOf(this.cacheManagerWaitForCacheInitialization));
        arrayMap.put("time_to_live_ms", String.valueOf(this.timeToLiveMs));
        arrayMap.put("time_to_live_eviction_interval_foreground_ms", String.valueOf(this.timeToLiveEvictionIntervalForegroundMs));
        arrayMap.put("time_to_live_eviction_interval_background_ms", String.valueOf(this.timeToLiveEvictionIntervalBackgroundMs));
        arrayMap.put("enable_cache_instrumentation", String.valueOf(this.enableCacheInstrumentation));
        arrayMap.put("cache_instrumentation_event_batch_period_s", String.valueOf(this.cacheInstrumentationEventBatchPeriodS));
        arrayMap.put("cache_instrumentation_low_ram_item_limit", String.valueOf(this.cacheInstrumentationLowRamItemLimit));
        arrayMap.put("cache_instrumentation_high_ram_item_limit", String.valueOf(this.cacheInstrumentationHighRamItemLimit));
        arrayMap.put("enable_only_cache_eviction_instrumentation", String.valueOf(this.enableOnlyCacheEvictionInstrumentation));
        arrayMap.put("skip_cache_queries_for_evictions_only_logging", String.valueOf(this.skipCacheQueriesForEvictionsOnlyLogging));
        arrayMap.put("enable_utilisation_instrumentation", String.valueOf(this.enableUtilisationInstrumentation));
        arrayMap.put("cache_instrumentation_sampling_rate", String.valueOf(this.cacheInstrumentationSamplingRate));
        arrayMap.put("enable_init_segment_fix", String.valueOf(this.enableInitSegmentFix));
        arrayMap.put("enable_cache_efficiency_logging_extra_check", String.valueOf(this.enableCacheEfficiencyLoggingExtraCheck));
        arrayMap.put("use_exo_v2_cache", String.valueOf(this.useExoV2Cache));
        arrayMap.put("track_lru_evictions_fix", String.valueOf(this.trackLruEvictionsFix));
        arrayMap.put("disable_sync_read_write", String.valueOf(this.disableSyncReadWrite));
        arrayMap.put("use_simple_locks", String.valueOf(this.useSimpleLocks));
        arrayMap.put("only_run_startup_critical_cache_init", String.valueOf(this.onlyRunStartupCriticalCacheInit));
        arrayMap.put("enable_dynamic_cache_file_size_in_v2", String.valueOf(this.enableDynamicCacheFileSizeInV2));
        arrayMap.put("enable_cache_v2_optimizations", String.valueOf(this.enableCacheV2Optimizations));
        arrayMap.put("use_concurrent_cache_listeners", String.valueOf(this.useConcurrentCacheListeners));
        arrayMap.put("use_is_directory", String.valueOf(this.useIsDirectory));
        arrayMap.put("disable_init_condition_variable", String.valueOf(this.disableInitConditionVariable));
        arrayMap.put("enable_progressive_cache_loading", String.valueOf(this.enableProgressiveCacheLoading));
        arrayMap.put("enable_light_cache_thread_guard", String.valueOf(this.enableLightCacheThreadGuard));
        arrayMap.put("defer_cache_init_unlinks", String.valueOf(this.deferCacheInitUnlinks));
        arrayMap.put("dedupe_span_removed_notification", String.valueOf(this.dedupeSpanRemovedNotification));
        arrayMap.put("encode_length_in_cache_file_name", String.valueOf(this.encodeLengthInCacheFileName));
        arrayMap.put("early_commit_min_bytes", String.valueOf(this.earlyCommitMinBytes));
        arrayMap.put("early_commit_max_delay_ms", String.valueOf(this.earlyCommitMaxDelayMs));
        arrayMap.put("prefetch_yield_to_active_writer", String.valueOf(this.prefetchYieldToActiveWriter));
        if (arrayMap.entrySet().isEmpty()) {
            return "";
        }
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            String strA0t = C60O.A0t(entryA0l);
            try {
                jSONObjectA18.put(strA0t, entryA0l.getValue());
            } catch (Exception e) {
                Log.w("CacheSetting", FGI.A0U("Unable to add ", strA0t, " to loggable JSON"), e);
            }
        }
        return C60O.A0o(jSONObjectA18);
    }
}
