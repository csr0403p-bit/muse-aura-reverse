package com.facebook.aura.network.transport.cache;

import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFI;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C7Bm;
import X.GBL;
import X.Hm1;
import X.HtJ;
import com.facebook.aura.network.AuraAuthHeaders;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpCachePolicy;
import com.facebook.aura.network.transport.HatchHttpCacheStatus;
import com.facebook.aura.network.transport.HatchHttpMethod;
import com.facebook.aura.network.transport.HatchHttpRequest;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchRequestBody;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public abstract class CachingHatchHttpClientKt {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final Set<HatchHttpMethod> CACHEABLE_METHODS;
    public static final String CACHE_CONTROL_HEADER = "Cache-Control";
    public static final String COOKIE_HEADER = "Cookie";
    public static final Set<HatchHttpMethod> IDEMPOTENT_CACHEABLE_METHODS;
    public static final String PRAGMA_HEADER = "Pragma";
    public static final String RANGE_HEADER = "Range";
    public static final Set<String> SENSITIVE_RESPONSE_HEADERS;
    public static final String TAG = "CachingHatchHttpClient";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchAuthScheme.values().length];
            try {
                AnonymousClass002.A13(HatchAuthScheme.META_UNAUTH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchAuthScheme.META_BEARER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchAuthScheme.VM_JWT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchHttpMethod hatchHttpMethod = HatchHttpMethod.GET;
        CACHEABLE_METHODS = Collections.singleton(hatchHttpMethod);
        IDEMPOTENT_CACHEABLE_METHODS = BFI.A0H(new HatchHttpMethod[]{hatchHttpMethod, HatchHttpMethod.POST});
        SENSITIVE_RESPONSE_HEADERS = C60O.A1B("Authorization", "Proxy-Authorization", "Set-Cookie", "Set-Cookie2");
    }

    public static final String defaultCacheScope(HatchAuthScheme hatchAuthScheme, String str) {
        StringBuilder sbA0x;
        String strCurrentUserIdForCache = AuraAuthHeaders.INSTANCE.currentUserIdForCache();
        if (strCurrentUserIdForCache == null) {
            strCurrentUserIdForCache = "";
        }
        if (C7BY.A0j(strCurrentUserIdForCache)) {
            strCurrentUserIdForCache = "anonymous";
        }
        int iOrdinal = hatchAuthScheme.ordinal();
        if (iOrdinal == 2) {
            return "meta_unauth";
        }
        if (iOrdinal == 1) {
            sbA0x = C3cI.A0x("meta_bearer:", strCurrentUserIdForCache);
        } else {
            if (iOrdinal != 0) {
                throw C3cG.A0q();
            }
            String strHostForScope = HatchHttpCacheKey.INSTANCE.hostForScope(str);
            sbA0x = C3cI.A0x("vm_jwt:", strCurrentUserIdForCache);
            sbA0x.append(":");
            sbA0x.append(strHostForScope);
        }
        return sbA0x.toString();
    }

    public static final boolean isCacheableForPolicy(HatchHttpRequest hatchHttpRequest) {
        Map<String, String> map;
        String strA00;
        HatchHttpCachePolicy hatchHttpCachePolicy = hatchHttpRequest.cachePolicy;
        if (hatchHttpCachePolicy == null || !hatchHttpCachePolicy.idempotent) {
            if (!CACHEABLE_METHODS.contains(hatchHttpRequest.method) || !(hatchHttpRequest.body instanceof HatchRequestBody.Empty) || hasHeader(hatchHttpRequest.headers, "Authorization")) {
                return false;
            }
            if (!hasHeader(hatchHttpRequest.headers, COOKIE_HEADER) && !hasHeader(hatchHttpRequest.headers, RANGE_HEADER)) {
                map = hatchHttpRequest.headers;
                strA00 = C3cF.A00(5);
                if (headerContainsDirective(map, CACHE_CONTROL_HEADER, strA00) && !headerContainsDirective(hatchHttpRequest.headers, CACHE_CONTROL_HEADER, "no-store") && !headerContainsDirective(hatchHttpRequest.headers, PRAGMA_HEADER, strA00)) {
                    return true;
                }
            }
        } else if (IDEMPOTENT_CACHEABLE_METHODS.contains(hatchHttpRequest.method)) {
            if (!hasHeader(hatchHttpRequest.headers, COOKIE_HEADER)) {
                map = hatchHttpRequest.headers;
                strA00 = C3cF.A00(5);
                if (headerContainsDirective(map, CACHE_CONTROL_HEADER, strA00)) {
                }
            }
        }
        return false;
    }

    public static final Map<String, String> sanitizedForCacheStorage(Map<String, String> map) {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        TreeMap treeMap = new TreeMap(comparator);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            Object value = entryA0l.getValue();
            Set<String> set = SENSITIVE_RESPONSE_HEADERS;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC2159Azp.A12(AnonymousClass005.A0j(it), strA0t, true)) {
                        break;
                    }
                }
            }
            treeMap.put(strA0t, value);
        }
        return treeMap;
    }

    public static final NetworkResult toNetworkResult(HatchHttpResponse hatchHttpResponse) {
        return new NetworkResult(hatchHttpResponse.statusCode, hatchHttpResponse.statusMessage, hatchHttpResponse.headers, hatchHttpResponse.bodyBytes(), hatchHttpResponse.errorMessage, hatchHttpResponse.isSuccessful, hatchHttpResponse.cause);
    }

    public static final HatchHttpResponse withCacheStatus(HatchHttpResponse hatchHttpResponse, HatchHttpCacheStatus hatchHttpCacheStatus) {
        if (hatchHttpResponse.cacheStatus == hatchHttpCacheStatus) {
            return hatchHttpResponse;
        }
        byte[] bArrBodyBytes = hatchHttpResponse.bodyBytes();
        return HatchHttpResponse.Companion.of(hatchHttpResponse.statusCode, hatchHttpResponse.statusMessage, hatchHttpResponse.headers, bArrBodyBytes != null ? new ByteArrayInputStream(bArrBodyBytes) : null, hatchHttpResponse.errorMessage, hatchHttpResponse.isSuccessful, hatchHttpCacheStatus, hatchHttpResponse.cause);
    }

    public static final Object await(CompletableFuture<NetworkResult> completableFuture, HtJ<? super NetworkResult> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        completableFuture.whenComplete(new BiConsumer() { // from class: com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt$await$2$1
            @Override // java.util.function.BiConsumer
            public final void accept(NetworkResult networkResult, Throwable th) {
                if (gblA03.isActive()) {
                    Hm1<NetworkResult> hm1 = gblA03;
                    Object objA0s = networkResult;
                    if (th != null) {
                        objA0s = C3cG.A0s(th);
                    }
                    hm1.resumeWith(objA0s);
                }
            }
        });
        return gblA03.A0F();
    }

    public static final boolean hasHeader(Map<String, String> map, String str) {
        Set<String> setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                if (AbstractC2159Azp.A12(AnonymousClass005.A0j(it), str, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean headerContainsDirective(Map<String, String> map, String str, String str2) {
        Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
        if (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty()) {
            Iterator<Map.Entry<String, String>> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                if (AbstractC2159Azp.A12(C60O.A0t(entryA0l), str, true)) {
                    List listA0h = C7BY.A0h((CharSequence) entryA0l.getValue(), new char[1], ',');
                    if (!(listA0h instanceof Collection) || !listA0h.isEmpty()) {
                        Iterator it2 = listA0h.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC2159Azp.A12(C7BY.A0b(it2), str2, true)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
