package com.facebook.aura.onboarding;

import X.A3q;
import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.BGK;
import X.BzK;
import X.C06H;
import X.C0924AIa;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C5246DeB;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.C7qW;
import X.C9oY;
import X.CFK;
import X.G0V;
import X.HtJ;
import X.Hy1;
import X.HzP;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.common.video.HatchVideoPrefetcher;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class OnboardingAssetPrefetchRepo {
    public static final Companion Companion = new Companion();
    public PrefetchState state;
    public final C3UX scope = C78W.A04(new Hy1(AuraExecutors.INSTANCE.getBackgroundThreadExecutor()));
    public final Object lock = C3cG.A0T();

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo$ensureUnauthenticatedAssetsPrefetched$1", f = "OnboardingAssetPrefetchRepo.kt", l = {163, 165}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo$ensureUnauthenticatedAssetsPrefetched$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PrefetchFetchPlan $fetchPlan;
        public final /* synthetic */ Set<String> $normalizedAssetNames;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ OnboardingAssetPrefetchRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PrefetchFetchPlan prefetchFetchPlan, OnboardingAssetPrefetchRepo onboardingAssetPrefetchRepo, Set<String> set, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$fetchPlan = prefetchFetchPlan;
            this.this$0 = onboardingAssetPrefetchRepo;
            this.$normalizedAssetNames = set;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$fetchPlan, this.this$0, this.$normalizedAssetNames, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:30:0x0093, B:31:0x0096, B:32:0x0098, B:34:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00ca, B:44:0x00d2, B:46:0x00da, B:47:0x00e0, B:48:0x00e9, B:43:0x00cf, B:25:0x007d, B:26:0x0080, B:11:0x0024, B:13:0x002a, B:14:0x0034, B:16:0x0044, B:18:0x004c, B:22:0x006f, B:27:0x0083, B:19:0x0068), top: B:80:0x0006, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00fb A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #0 {, blocks: (B:51:0x00fb, B:53:0x00ff, B:55:0x0105, B:59:0x0125, B:60:0x0132, B:58:0x010c, B:66:0x013e, B:68:0x0142, B:70:0x0148, B:73:0x014e, B:74:0x015c, B:30:0x0093, B:31:0x0096, B:32:0x0098, B:34:0x00b7, B:35:0x00be, B:37:0x00c4, B:40:0x00ca, B:44:0x00d2, B:46:0x00da, B:47:0x00e0, B:48:0x00e9, B:43:0x00cf, B:25:0x007d, B:26:0x0080, B:11:0x0024, B:13:0x002a, B:14:0x0034, B:16:0x0044, B:18:0x004c, B:22:0x006f, B:27:0x0083, B:19:0x0068), top: B:80:0x0006, inners: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x014d  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 377
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo", f = "OnboardingAssetPrefetchRepo.kt", l = {233}, m = "fetchPublicAssetUrls", v = 2)
    /* renamed from: com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo$fetchPublicAssetUrls$1, reason: invalid class name and case insensitive filesystem */
    public final class C127911 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C127911(HtJ<? super C127911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OnboardingAssetPrefetchRepo.this.fetchPublicAssetUrls(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetchCachedUrlsIfNeeded(Set<String> set) {
        boolean z;
        Map<String, String> mapLoadCachedPublicUrls = loadCachedPublicUrls();
        int i = 0;
        for (String str : set) {
            String str2 = mapLoadCachedPublicUrls.get(str);
            if (str2 != null && isVideoUrl(str2)) {
                synchronized (this.lock) {
                    if (this.state.prefetchedUrls.contains(str2)) {
                        z = false;
                    } else {
                        PrefetchState prefetchState = this.state;
                        this.state = prefetchState.copy(prefetchState.cachedPublicUrls, prefetchState.isFullAssetFetchInFlight, prefetchState.hasFetchedFullAssetCatalog, prefetchState.inFlightAssetNames, BGK.A02(str2, prefetchState.prefetchedUrls));
                        z = true;
                    }
                }
                if (z) {
                    i++;
                    HatchVideoPrefetcher.Companion.getInstance().prefetchVideoByUri(AuraAppContext.INSTANCE.requireContext(), str, str2, null, 1048576, false);
                }
            }
        }
        CFK.A01(Integer.valueOf(set.size()), Integer.valueOf(mapLoadCachedPublicUrls.size()), Integer.valueOf(i), OnboardingAssetPrefetchRepoKt.TAG, "Prefetch scan complete requested=%s cached=%s queued=%s");
    }

    public final class Companion {
        public final OnboardingAssetPrefetchRepo getInstance() {
            return (OnboardingAssetPrefetchRepo) C5246DeB.A00(32771);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchPublicAssetUrls(java.util.Set<java.lang.String> r17, X.HtJ<? super com.facebook.aura.onboarding.PublicAssetFetchResult> r18) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onboarding.OnboardingAssetPrefetchRepo.fetchPublicAssetUrls(java.util.Set, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fetchPublicAssetUrls$default(OnboardingAssetPrefetchRepo onboardingAssetPrefetchRepo, Set set, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            set = A3q.A00;
        }
        return onboardingAssetPrefetchRepo.fetchPublicAssetUrls(set, htJ);
    }

    private final boolean isVideoUrl(String str) {
        return OnboardingAssetPrefetchRepoKt.VIDEO_EXTENSIONS.contains(C7BY.A0N(C7BY.A0M(C7BY.A0S(str, str, '?'))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> loadCachedPublicUrls() {
        Map<String, String> mapA0E;
        Map<String, String> mapA0E2;
        Object obj = this.lock;
        synchronized (obj) {
            mapA0E = this.state.cachedPublicUrls;
            if (mapA0E == null) {
            }
            return mapA0E;
        }
        String string = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ONBOARDING_ASSET_PREFETCH).getString(OnboardingAssetPrefetchRepoKt.KEY_CACHED_PUBLIC_URLS_JSON, "");
        if (string == null) {
            string = "";
        }
        if (!C7BY.A0j(string)) {
            try {
                JsonObject jsonObjectA1H = C60O.A1H(string);
                C0924AIa c0924AIaA0u = C3cG.A0u();
                if (jsonObjectA1H != null) {
                    for (Map.Entry<String, JsonElement> entry : jsonObjectA1H.entrySet()) {
                        String key = entry.getKey();
                        JsonPrimitive jsonPrimitiveAsJsonPrimitiveOrNull = JsonObjectExtensionsKt.asJsonPrimitiveOrNull(entry.getValue());
                        String strA04 = jsonPrimitiveAsJsonPrimitiveOrNull != null ? C9oY.A04(jsonPrimitiveAsJsonPrimitiveOrNull) : null;
                        if (strA04 != null && !C7BY.A0j(strA04)) {
                            c0924AIaA0u.put(key, strA04);
                        }
                    }
                }
                mapA0E2 = AIW.A0K(c0924AIaA0u);
            } catch (Exception e) {
                CFK.A08(OnboardingAssetPrefetchRepoKt.TAG, "Failed to parse cached onboarding asset URLs", e);
                mapA0E2 = AGH.A0E();
            }
            obj = this.lock;
            synchronized (obj) {
                PrefetchState prefetchState = this.state;
                mapA0E = prefetchState.cachedPublicUrls;
                if (mapA0E == null) {
                    this.state = prefetchState.copy(mapA0E2, prefetchState.isFullAssetFetchInFlight, prefetchState.hasFetchedFullAssetCatalog, prefetchState.inFlightAssetNames, prefetchState.prefetchedUrls);
                }
            }
            return mapA0E2;
        }
        obj = this.lock;
        synchronized (obj) {
            PrefetchState prefetchStateCopy = this.state;
            if (prefetchStateCopy.cachedPublicUrls == null) {
                prefetchStateCopy = prefetchStateCopy.copy(AGH.A0E(), prefetchStateCopy.isFullAssetFetchInFlight, prefetchStateCopy.hasFetchedFullAssetCatalog, prefetchStateCopy.inFlightAssetNames, prefetchStateCopy.prefetchedUrls);
                this.state = prefetchStateCopy;
            }
            mapA0E = prefetchStateCopy.cachedPublicUrls;
            if (mapA0E == null) {
                mapA0E = AGH.A0E();
            }
        }
        return mapA0E;
    }

    public final void ensureUnauthenticatedAssetsPrefetched() {
        PrefetchFetchPlan prefetchFetchPlan;
        PrefetchState prefetchState;
        boolean z;
        Set setSingleton = Collections.singleton(OnboardingAssetPrefetchRepoKt.GREETING_VIDEO_ASSET);
        synchronized (this.lock) {
            boolean zIsEmpty = setSingleton.isEmpty();
            if (zIsEmpty && !(z = (prefetchState = this.state).hasFetchedFullAssetCatalog) && !prefetchState.isFullAssetFetchInFlight) {
                this.state = prefetchState.copy(prefetchState.cachedPublicUrls, true, z, prefetchState.inFlightAssetNames, prefetchState.prefetchedUrls);
                prefetchFetchPlan = new PrefetchFetchPlan(true, true, A3q.A00);
            } else if (zIsEmpty) {
                prefetchFetchPlan = new PrefetchFetchPlan(true, false, A3q.A00);
            } else {
                PrefetchState prefetchState2 = this.state;
                if (prefetchState2.hasFetchedFullAssetCatalog || prefetchState2.isFullAssetFetchInFlight) {
                    prefetchFetchPlan = new PrefetchFetchPlan(false, false, A3q.A00);
                } else {
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (Object obj : setSingleton) {
                        if (!this.state.inFlightAssetNames.contains((String) obj)) {
                            arrayListA0h.add(obj);
                        }
                    }
                    Set setA0g = AbstractC0878AGe.A0g(arrayListA0h);
                    PrefetchState prefetchState3 = this.state;
                    this.state = prefetchState3.copy(prefetchState3.cachedPublicUrls, prefetchState3.isFullAssetFetchInFlight, prefetchState3.hasFetchedFullAssetCatalog, BGK.A01(setA0g, prefetchState3.inFlightAssetNames), prefetchState3.prefetchedUrls);
                    prefetchFetchPlan = new PrefetchFetchPlan(false, false, setA0g);
                }
            }
        }
        CFK.A02(Boolean.valueOf(prefetchFetchPlan.shouldFetchAllAssets), Boolean.valueOf(prefetchFetchPlan.shouldStartFullAssetFetch), OnboardingAssetPrefetchRepoKt.TAG, "ensureUnauthenticatedAssetsPrefetched fetchAll=%s startFullFetch=%s");
        AnonymousClass001.A1J(new AnonymousClass1(prefetchFetchPlan, this, setSingleton, null), this.scope);
    }

    public final boolean hasPrefetched() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ONBOARDING_ASSET_PREFETCH).getBoolean(OnboardingAssetPrefetchRepoKt.KEY_PREFETCH_COMPLETED, false);
    }

    public final void setPrefetched(boolean z) {
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.ONBOARDING_ASSET_PREFETCH, AuraDevicePrefs.INSTANCE);
        bzKA0F.A0A(OnboardingAssetPrefetchRepoKt.KEY_PREFETCH_COMPLETED, z);
        bzKA0F.commit();
    }

    public OnboardingAssetPrefetchRepo() {
        A3q a3q = A3q.A00;
        this.state = new PrefetchState(null, false, false, a3q, a3q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cachePublicUrls(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        Map<String, String> mapLoadCachedPublicUrls = loadCachedPublicUrls();
        C7384Etj.A0Y(mapLoadCachedPublicUrls, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLoadCachedPublicUrls);
        linkedHashMap.putAll(map);
        C2nw c2nwA1K = C60O.A1K();
        Iterator itA0i = C3cG.A0i(linkedHashMap);
        while (itA0i.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0i.next();
            C7qW.A06((String) entry.getKey(), (String) entry.getValue(), c2nwA1K);
        }
        String strA0v = C60O.A0v(c2nwA1K);
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.ONBOARDING_ASSET_PREFETCH, AuraDevicePrefs.INSTANCE);
        bzKA0F.AYr(OnboardingAssetPrefetchRepoKt.KEY_CACHED_PUBLIC_URLS_JSON, strA0v);
        bzKA0F.apply();
        CFK.A03(Integer.valueOf(linkedHashMap.size()), OnboardingAssetPrefetchRepoKt.TAG, "Cached onboarding asset URLs count=%s");
        synchronized (this.lock) {
            PrefetchState prefetchState = this.state;
            this.state = prefetchState.copy(linkedHashMap, prefetchState.isFullAssetFetchInFlight, prefetchState.hasFetchedFullAssetCatalog, prefetchState.inFlightAssetNames, prefetchState.prefetchedUrls);
        }
    }

    public final String greetingVideoUrl() {
        String strA0p = C60O.A0p(OnboardingAssetPrefetchRepoKt.GREETING_VIDEO_ASSET, loadCachedPublicUrls());
        if (strA0p == null || !isVideoUrl(strA0p)) {
            return null;
        }
        return strA0p;
    }
}
