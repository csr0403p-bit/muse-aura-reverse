package com.facebook.pando;

import X.A7O;
import X.AGH;
import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.BWT;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import X.CGM;
import X.DY4;
import X.DY5;
import X.DY7;
import X.DYA;
import X.DYB;
import X.DYC;
import X.DYE;
import X.DYF;
import X.DYI;
import X.EP6;
import X.ETi;
import X.EuF;
import X.F60;
import X.G0U;
import com.facebook.graphql.query.interfaces.IGraphQLRealtimeStatusListener;
import com.facebook.jni.HybridData;
import com.facebook.nativeutil.NativeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class PandoGraphQLRequest implements DYI, DY5 {
    public static final int INJECT_ACTOR_ID = 4;
    public static final int INJECT_CLIENT_MUTATION_ID = 8;
    public static final int INJECT_CLIENT_SUBSCRIPTION_ID = 16;
    public static final int OPTIONAL_ACTOR_ID = 32;
    public static final int OPTIONAL_CLIENT_MUTATION_ID = 64;
    public static final int REQUIRE_ACS_TOKEN = 128;
    public static final int REQUIRE_OHAI_CONFIG = 256;
    public static volatile boolean useWeakJavaRequestReference;
    public boolean _hasAcsToken;
    public boolean _hasOhaiConfig;
    public final List<String> analyticsTags;
    public final String buildConfigName;
    public PandoError error;
    public G0U<? super A7O, ? extends A7O> graphQLDataWrapper_EXPERIMENTAL;
    public final int injectionCapabilities;
    public final HybridData mHybridData;
    public final Map<String, Object> params;
    public final String queryName;
    public final G0U<A7O, T> responseConstructor;
    public final String rootCallVariable;
    public final String rootFieldName;
    public String schemaName;
    public final Map<String, Object> transientParams;

    /* JADX WARN: Multi-variable type inference failed */
    public PandoGraphQLRequest(CGM cgm, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Class<? extends TreeJNI> cls, G0U<? super A7O, ? extends T> g0u, boolean z, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, int i, String str2, String str3, List<PandoGraphQLConnectionConfig> list) {
        Map<String, ? extends Object> map3 = map;
        Map<String, ? extends Object> map4 = map2;
        List<PandoGraphQLConnectionConfig> list2 = list;
        AnonymousClass003.A0u(cgm, str);
        C7384Etj.A0Y(cls, 4);
        this.responseConstructor = g0u;
        this.injectionCapabilities = i;
        this.rootCallVariable = str2;
        this.rootFieldName = str3;
        this.analyticsTags = C3cG.A0h();
        String strClientDocIdForQuery = cgm.clientDocIdForQuery(str);
        String strPersistIdForQuery = strClientDocIdForQuery == null ? cgm.persistIdForQuery(str) : null;
        this.queryName = str;
        this.schemaName = cgm.schemaForQuery(str);
        String strBuildConfigName = cgm.buildConfigName();
        this.buildConfigName = strBuildConfigName == null ? "" : strBuildConfigName;
        if (list != null) {
            Iterator<PandoGraphQLConnectionConfig> it = list2.iterator();
            while (it.hasNext()) {
                it.next().setGeneratedPaginationQueryClientDocId(cgm);
            }
        }
        this.params = map3;
        this.transientParams = map4;
        strPersistIdForQuery = strPersistIdForQuery == null ? "" : strPersistIdForQuery;
        strClientDocIdForQuery = strClientDocIdForQuery == null ? "" : strClientDocIdForQuery;
        String str4 = this.rootFieldName;
        str4 = str4 == null ? "" : str4;
        String str5 = this.buildConfigName;
        NativeMap nativeMap = NativeMap.$redex_init_class;
        NativeMap nativeMap2 = new NativeMap(map == null ? AGH.A0E() : map3);
        NativeMap nativeMap3 = new NativeMap(map4 == null ? AGH.A0E() : map4);
        list2 = list == null ? C0881AGi.A00 : list2;
        String str6 = this.schemaName;
        this.mHybridData = initHybridData(strPersistIdForQuery, strClientDocIdForQuery, str, str4, z, str5, nativeMap2, nativeMap3, cls, pandoRealtimeInfoJNI, list2, str6 == null ? "" : str6, useWeakJavaRequestReference);
    }

    private final native void addAdditionalHttpHeaderNative(String str, String str2);

    private final native void addAdditionalHttpRequestParamNative(String str, String str2);

    private final native void addTrackedHttpResponseHeaderNative(String str);

    private final native void enableStreamBatchingNative();

    private final native boolean getIsStreamBatchingEnabledNative();

    public static /* synthetic */ void getSchemaName$annotations() {
    }

    private final native int getTimeoutSeconds();

    private final native boolean hasRealtimeSubscriptionInfo();

    private final native HybridData initHybridData(String str, String str2, String str3, String str4, boolean z, String str5, NativeMap nativeMap, NativeMap nativeMap2, Class<? extends TreeJNI> cls, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, List<PandoGraphQLConnectionConfig> list, String str6, boolean z2);

    private final native boolean isOhaiStreamedNative();

    private final native void removeAdditionalHttpHeaderNative(String str);

    private final native String serializeAsJsonNative();

    private final native void setAcsTokenNative(String str, String str2, String str3, String str4, String str5, String str6);

    private final native void setCacheFallbackByDuration_EXPERIMENTALNative(long j);

    private final native void setCacheTtlMs(long j);

    private final native void setCallerQPLConfigNative(int i, int i2, String str);

    private final native void setEnableCacheReadWriteOnCallerThreadNative(boolean z);

    private final native void setEnsureCacheWriteNative(boolean z);

    private final native void setFreshCacheTtlMs(long j);

    private final native void setLogNamespaceNative(String str);

    private final native void setOhaiConfigNative(int i, String str, int i2, int i3, int i4);

    private final native void setOhaiStreamedNative(boolean z);

    private final native void setOptimisticUpdater(TreeUpdaterJNI treeUpdaterJNI);

    private final native void setOverrideRequestURLNative(String str);

    private final native void setPlatformRequestContextNative(Object obj);

    private final native void setPublishMode(int i);

    private final native void setQueryVariablesNative(NativeMap nativeMap, NativeMap nativeMap2);

    private final native void setRealtimeBackgroundPolicyNative(int i);

    private final native void setRenderFromStorePolicyNative(int i);

    private final native void setRequestPurposeNative(int i);

    private final native void setSequencingKeyNative(String str);

    private final native void setTimeoutSeconds(int i);

    private final native void setUseSegmentedCanonicalArgumentsNative(boolean z);

    /* renamed from: addAdditionalHttpHeader, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3172addAdditionalHttpHeader(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str2 != null) {
            addAdditionalHttpHeaderNative(str, str2);
            return this;
        }
        removeAdditionalHttpHeaderNative(str);
        return this;
    }

    /* renamed from: addAdditionalHttpRequestParam, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3173addAdditionalHttpRequestParam(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str2 != null) {
            addAdditionalHttpRequestParamNative(str, str2);
        }
        return this;
    }

    public DYI<T> addAnalyticTag(String str) {
        C7384Etj.A0Y(str, 0);
        this.analyticsTags.add(str);
        return this;
    }

    /* renamed from: addTrackedHttpResponseHeader, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3174addTrackedHttpResponseHeader(String str) {
        C7384Etj.A0Y(str, 0);
        addTrackedHttpResponseHeaderNative(str);
        return this;
    }

    public final native String getAdditionalCacheKeyValueNative();

    public native long getCacheFallbackByDuration_EXPERIMENTAL();

    public native boolean getEnsureCacheWrite();

    public native long getFreshCacheAgeMs();

    public final native String getFriendlyNameNative();

    public native long getMaxToleratedCacheAgeMs();

    public native String getOverrideRequestURL();

    public final native Object getPlatformRequestContext();

    public native int getRenderFromStorePolicy_EXPERIMENTAL();

    public native int getRequestPurpose();

    public native int getRetryPolicy();

    public native boolean getRetryable();

    public native String getSequencingKey();

    public native boolean getUseSafeStack();

    public final native boolean hasCallerQPLConfig();

    public native boolean isMutation();

    /* renamed from: setAcsToken, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3177setAcsToken(DYA dya) {
        this._hasAcsToken = true;
        throw BV4.A0a("getProjectName");
    }

    public final native void setActiveFieldsProviderFromTree(TreeJNI treeJNI);

    /* renamed from: setAdditionalCacheKeyValue, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3178setAdditionalCacheKeyValue(String str) {
        C7384Etj.A0Y(str, 0);
        setAdditionalCacheKeyValueNative(str);
        return this;
    }

    public final native void setAdditionalCacheKeyValueNative(String str);

    /* renamed from: setFriendlyName, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3184setFriendlyName(String str) {
        C7384Etj.A0Y(str, 0);
        setFriendlyNameNative(str);
        return this;
    }

    public final native void setFriendlyNameNative(String str);

    public final native void setLocale(String str);

    public final PandoGraphQLRequest<T> setLogNamespace(String str) {
        C7384Etj.A0Y(str, 0);
        setLogNamespaceNative(str);
        return this;
    }

    public final native void setManuallyManageActiveFieldUpdates(boolean z);

    /* renamed from: setNetworkTimeoutSeconds, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3187setNetworkTimeoutSeconds(int i) {
        setTimeoutSeconds(Math.max(i, 0));
        return this;
    }

    /* renamed from: setOhaiConfig, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3188setOhaiConfig(DYB dyb) {
        this._hasOhaiConfig = true;
        throw BV4.A0a("getKeyId");
    }

    /* renamed from: setOptimisticBuilder, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3189setOptimisticBuilder(DYC dyc) {
        C7384Etj.A0Y(dyc, 0);
        throw BV5.A0O(dyc.getClass(), "Unsupported builder type: ");
    }

    @Override // X.DYI
    public DYI<T> setOverrideRequestURL(BWT bwt) {
        C7384Etj.A0Y(bwt, 0);
        setOverrideRequestURLNative(bwt.url);
        return this;
    }

    public final void setOverrideRequestURLString(String str) {
        C7384Etj.A0Y(str, 0);
        setOverrideRequestURLNative(str);
    }

    public final native void setPerformOptimisticMerge(boolean z);

    public final PandoGraphQLRequest<T> setPublishMode(EuF euF) {
        C7384Etj.A0Y(euF, 0);
        setPublishMode(euF.intMode);
        return this;
    }

    public final native void setRealtimeForceLogContext(String str);

    public final native void setRealtimeResumptionGroupName(String str);

    public final native void setRetryPolicyNative(int i);

    public final native void setRetryableNative(boolean z);

    /* renamed from: setSchemaOverride, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3195setSchemaOverride(String str) {
        C7384Etj.A0Y(str, 0);
        this.schemaName = str;
        return this;
    }

    /* renamed from: setSequencingKey, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3196setSequencingKey(String str) {
        C7384Etj.A0Y(str, 0);
        setSequencingKeyNative(str);
        return this;
    }

    public final native void setUseSafeStackNative(boolean z);

    static {
        ETi.loadLibrary("pando-graphql-jni");
    }

    public List<String> getAnalyticTags() {
        return AbstractC0878AGe.A0X(this.analyticsTags);
    }

    public final String getBuildConfigName() {
        return this.buildConfigName;
    }

    public String getCallName() {
        return this.queryName;
    }

    public boolean getDidSetEnsureCacheWrite() {
        return false;
    }

    public boolean getDidSetMaxToleratedCacheAge() {
        return false;
    }

    public /* synthetic */ boolean getEnableExtendedUploadCallbacks() {
        return false;
    }

    public final PandoError getError$fbandroid_libraries_pando_graphql_pando_graphql() {
        return this.error;
    }

    public final G0U<A7O, A7O> getGraphQLDataWrapper_EXPERIMENTAL() {
        return this.graphQLDataWrapper_EXPERIMENTAL;
    }

    public boolean getIgnoreNonCriticalErrors() {
        return true;
    }

    public final Map<String, Object> getParams() {
        return this.params;
    }

    public DYE getQueryParams() {
        Map mapA0E = this.params;
        if (mapA0E == null) {
            mapA0E = AGH.A0E();
        }
        Map mapA0E2 = this.transientParams;
        if (mapA0E2 == null) {
            mapA0E2 = AGH.A0E();
        }
        return new DY4(AGH.A02(mapA0E, mapA0E2));
    }

    public String getResolvedBuildConfigName() {
        return this.buildConfigName;
    }

    public final G0U<A7O, T> getResponseBuilder() {
        G0U<A7O, T> g0u = this.responseConstructor;
        if (g0u == 0) {
            return null;
        }
        G0U<? super A7O, ? extends A7O> g0u2 = this.graphQLDataWrapper_EXPERIMENTAL;
        return g0u2 != null ? new EP6(0, g0u2, this) : g0u;
    }

    public final G0U<A7O, T> getResponseConstructor() {
        return this.responseConstructor;
    }

    public final String getRootCallVariable() {
        return this.rootCallVariable;
    }

    public String getSchema() {
        return this.schemaName;
    }

    public /* synthetic */ boolean getSyncNetworkDataToConsistency() {
        return false;
    }

    public final Map<String, Object> getTransientParams() {
        return this.transientParams;
    }

    public final boolean get_hasAcsToken() {
        return this._hasAcsToken;
    }

    public final boolean get_hasOhaiConfig() {
        return this._hasOhaiConfig;
    }

    public boolean hasAcsToken() {
        return this._hasAcsToken;
    }

    public boolean hasOhaiConfig() {
        return this._hasOhaiConfig;
    }

    public final boolean optionalActorId() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 32, 32);
    }

    public final boolean optionalClientMutationId() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 64, 64);
    }

    public final boolean requireAcsToken() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 128, 128);
    }

    public final boolean requireOhaiConfig() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 256, 256);
    }

    public final void setQueryVariables(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        NativeMap nativeMap = NativeMap.$redex_init_class;
        if (map == null) {
            map = AGH.A0E();
        }
        NativeMap nativeMap2 = new NativeMap(map);
        if (map2 == null) {
            map2 = AGH.A0E();
        }
        setQueryVariablesNative(nativeMap2, new NativeMap(map2));
    }

    public final boolean shouldInjectActorId() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 4, 4);
    }

    public final boolean shouldInjectClientMutationId() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 8, 8);
    }

    public final boolean shouldInjectClientSubscriptionId() {
        return AnonymousClass002.A1Q(this.injectionCapabilities & 16, 16);
    }

    public DYI<T> enableFullConsistency() {
        throw C8j3.A17();
    }

    public /* bridge */ /* synthetic */ DYI enableStreamBatching() {
        enableStreamBatchingNative();
        return this;
    }

    public Map<String, String> getAdaptiveFetchClientParams() {
        throw C8j3.A17();
    }

    public String getAdditionalCacheKeyValue() {
        return getAdditionalCacheKeyValueNative();
    }

    public Map<String, String> getAdditionalHttpHeaders() {
        throw C8j3.A17();
    }

    public Map<String, String> getAdditionalHttpRequestParams() {
        throw C8j3.A17();
    }

    public String getClientTraceId() {
        throw C8j3.A17();
    }

    public boolean getEnableOfflineCaching() {
        throw C8j3.A17();
    }

    public String getFriendlyName() {
        return getFriendlyNameNative();
    }

    public boolean getIsStreamBatchingEnabled() {
        return getIsStreamBatchingEnabledNative();
    }

    public boolean getMarkHttpRequestAsReplaySafe() {
        throw C8j3.A17();
    }

    public int getNetworkTimeoutSeconds() {
        return getTimeoutSeconds();
    }

    public boolean getOnlyCacheInitialNetworkResponse() {
        throw C8j3.A17();
    }

    public boolean getParseOnClientExecutor() {
        throw C8j3.A17();
    }

    public DY7<T> getQuery() {
        throw C8j3.A17();
    }

    public boolean getTerminateAfterFreshResponse() {
        throw C8j3.A17();
    }

    public Class<?> getTreeModelType() {
        throw C8j3.A17();
    }

    public /* bridge */ /* synthetic */ Boolean isOhaiStreamed() {
        return Boolean.valueOf(isOhaiStreamedNative());
    }

    public final boolean isSubscription() {
        return hasRealtimeSubscriptionInfo();
    }

    public final String serializeAsJson() {
        return serializeAsJsonNative();
    }

    public /* bridge */ /* synthetic */ DYI setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        setCacheFallbackByDuration_EXPERIMENTALNative(j);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setCallerQPLConfig(DYF dyf) {
        m3180setCallerQPLConfig(dyf);
        throw F60.createAndThrow();
    }

    public /* bridge */ /* synthetic */ DYI setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(boolean z) {
        setEnableCacheReadWriteOnCallerThreadNative(z);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setEnsureCacheWrite(boolean z) {
        setEnsureCacheWriteNative(z);
        return this;
    }

    public final void setError$fbandroid_libraries_pando_graphql_pando_graphql(PandoError pandoError) {
        this.error = pandoError;
    }

    public /* bridge */ /* synthetic */ DYI setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    public final void setGraphQLDataWrapper_EXPERIMENTAL(G0U<? super A7O, ? extends A7O> g0u) {
        this.graphQLDataWrapper_EXPERIMENTAL = g0u;
    }

    public /* bridge */ /* synthetic */ DYI setIgnoreNonCriticalErrors(boolean z) {
        throw C8j3.A17();
    }

    public /* bridge */ /* synthetic */ DYI setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setOhaiStreamed(Boolean bool) {
        setOhaiStreamedNative(bool.booleanValue());
        return this;
    }

    public final PandoGraphQLRequest<T> setPlatformRequestContext(Object obj) {
        setPlatformRequestContextNative(obj);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setRealtimeBackgroundPolicy(int i) {
        setRealtimeBackgroundPolicyNative(i);
        return this;
    }

    public /* synthetic */ DYI setRealtimeStatusListener_EXPERIMENTAL(IGraphQLRealtimeStatusListener iGraphQLRealtimeStatusListener) {
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setRenderFromStorePolicy_EXPERIMENTAL(int i) {
        setRenderFromStorePolicyNative(i);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setRequestPurpose(int i) {
        setRequestPurposeNative(i);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setRetryPolicy(int i) {
        setRetryPolicyNative(i);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setRetryable(boolean z) {
        setRetryableNative(z);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setUseSafeStack_DO_NOT_USE(boolean z) {
        setUseSafeStackNative(z);
        return this;
    }

    public final void setUseSegmentedCanonicalArguments$fbandroid_libraries_pando_graphql_pando_graphql(boolean z) {
        setUseSegmentedCanonicalArgumentsNative(z);
    }

    public final void set_hasAcsToken(boolean z) {
        this._hasAcsToken = z;
    }

    public final void set_hasOhaiConfig(boolean z) {
        this._hasOhaiConfig = z;
    }

    public /* synthetic */ PandoGraphQLRequest(CGM cgm, String str, Map map, Map map2, Class cls, G0U g0u, boolean z, PandoRealtimeInfoJNI pandoRealtimeInfoJNI, int i, String str2, String str3, List list, int i2, C06H c06h) {
        this(cgm, str, map, map2, (i2 & 16) != 0 ? TreeWithGraphQL.class : cls, g0u, z, pandoRealtimeInfoJNI, i, str2, str3, list);
    }

    public /* bridge */ /* synthetic */ DYI addAdditionalHttpHeader(String str, String str2) {
        m3172addAdditionalHttpHeader(str, str2);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI addAdditionalHttpRequestParam(String str, String str2) {
        m3173addAdditionalHttpRequestParam(str, str2);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI addTrackedHttpResponseHeader(String str) {
        m3174addTrackedHttpResponseHeader(str);
        return this;
    }

    /* renamed from: enableStreamBatching, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3175enableStreamBatching() {
        enableStreamBatchingNative();
        return this;
    }

    /* renamed from: isOhaiStreamed, reason: collision with other method in class */
    public boolean m3176isOhaiStreamed() {
        return isOhaiStreamedNative();
    }

    public /* bridge */ /* synthetic */ DYI setAcsToken(DYA dya) {
        m3177setAcsToken(dya);
        throw F60.createAndThrow();
    }

    public /* bridge */ /* synthetic */ DYI setAdditionalCacheKeyValue(String str) {
        m3178setAdditionalCacheKeyValue(str);
        return this;
    }

    /* renamed from: setCacheFallbackByDuration_EXPERIMENTAL, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3179setCacheFallbackByDuration_EXPERIMENTAL(long j) {
        setCacheFallbackByDuration_EXPERIMENTALNative(j);
        return this;
    }

    /* renamed from: setCallerQPLConfig, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3180setCallerQPLConfig(DYF dyf) {
        throw BV4.A0a("getMarkerId");
    }

    /* renamed from: setEnableCacheReadWriteOnCallerThread_DO_NOT_USE, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3181setEnableCacheReadWriteOnCallerThread_DO_NOT_USE(boolean z) {
        setEnableCacheReadWriteOnCallerThreadNative(z);
        return this;
    }

    /* renamed from: setEnsureCacheWrite, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3182setEnsureCacheWrite(boolean z) {
        setEnsureCacheWriteNative(z);
        return this;
    }

    /* renamed from: setFreshCacheAgeMs, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3183setFreshCacheAgeMs(long j) {
        setFreshCacheTtlMs(j);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setFriendlyName(String str) {
        m3184setFriendlyName(str);
        return this;
    }

    /* renamed from: setIgnoreNonCriticalErrors, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3185setIgnoreNonCriticalErrors(boolean z) {
        throw C8j3.A17();
    }

    /* renamed from: setMaxToleratedCacheAgeMs, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3186setMaxToleratedCacheAgeMs(long j) {
        setCacheTtlMs(j);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setNetworkTimeoutSeconds(int i) {
        m3187setNetworkTimeoutSeconds(i);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setOhaiConfig(DYB dyb) {
        m3188setOhaiConfig(dyb);
        throw F60.createAndThrow();
    }

    public PandoGraphQLRequest<T> setOhaiStreamed(boolean z) {
        setOhaiStreamedNative(z);
        return this;
    }

    public /* bridge */ /* synthetic */ DY5 setOptimisticBuilder(DYC dyc) {
        m3189setOptimisticBuilder(dyc);
        throw F60.createAndThrow();
    }

    /* renamed from: setRealtimeBackgroundPolicy, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3190setRealtimeBackgroundPolicy(int i) {
        setRealtimeBackgroundPolicyNative(i);
        return this;
    }

    /* renamed from: setRenderFromStorePolicy_EXPERIMENTAL, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3191setRenderFromStorePolicy_EXPERIMENTAL(int i) {
        setRenderFromStorePolicyNative(i);
        return this;
    }

    /* renamed from: setRequestPurpose, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3192setRequestPurpose(int i) {
        setRequestPurposeNative(i);
        return this;
    }

    /* renamed from: setRetryPolicy, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3193setRetryPolicy(int i) {
        setRetryPolicyNative(i);
        return this;
    }

    /* renamed from: setRetryable, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3194setRetryable(boolean z) {
        setRetryableNative(z);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setSchemaOverride(String str) {
        m3195setSchemaOverride(str);
        return this;
    }

    public /* bridge */ /* synthetic */ DYI setSequencingKey(String str) {
        m3196setSequencingKey(str);
        return this;
    }

    /* renamed from: setUseSafeStack_DO_NOT_USE, reason: collision with other method in class */
    public PandoGraphQLRequest<T> m3197setUseSafeStack_DO_NOT_USE(boolean z) {
        setUseSafeStackNative(z);
        return this;
    }
}
