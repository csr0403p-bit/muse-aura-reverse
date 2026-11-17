package com.facebook.aura.network.fresco;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.C5074DUn;
import X.C7183Eht;
import X.C7184Ehu;
import X.C7384Etj;
import X.CCV;
import X.DV5;
import android.net.Uri;
import com.facebook.aura.network.AuraAuthHeaders;
import com.facebook.aura.network.api.CloudflareImageUrl;
import com.facebook.aura.network.api.MetaImageCdnHostsKt;
import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class AuraImageCacheKeyFactory extends DV5 {
    public static final AuraImageCacheKeyFactory INSTANCE = new AuraImageCacheKeyFactory();
    public static final ConcurrentMap<C7183Eht, ScopedRequest> requests = new MapMakerInternalMap(null, C5074DUn.A00, MapMakerInternalMap.Strength.A02, -1, -1);
    public static final Set<String> CDN_SIGNING_PARAMS = BFI.A0H(new String[]{"oh", "oe", "__gda__", "hdnea", "logcdn", "efg"});

    public final class ScopedRequest {
        public final String accountId;
        public final C7183Eht request;

        public ScopedRequest(String str, C7183Eht c7183Eht) {
            C7384Etj.A0Y(c7183Eht, 1);
            this.accountId = str;
            this.request = c7183Eht;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final C7183Eht getRequest() {
            return this.request;
        }
    }

    public final String accountIdFor(C7183Eht c7183Eht) {
        C7384Etj.A0Y(c7183Eht, 0);
        return scoped(c7183Eht).accountId;
    }

    @Override // X.DV5
    public CCV getBitmapCacheKey(C7183Eht c7183Eht, Object obj) {
        C7384Etj.A0Y(c7183Eht, 0);
        return super.getBitmapCacheKey(scoped(c7183Eht).request, obj);
    }

    @Override // X.DV5
    public Uri getCacheKeySourceUri(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        if (!MetaImageCdnHostsKt.isMetaImageCdnHost(uri.getHost())) {
            return uri;
        }
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            if (!strA0j.startsWith("_nc_") && !CDN_SIGNING_PARAMS.contains(strA0j)) {
                Iterator<String> it2 = uri.getQueryParameters(strA0j).iterator();
                while (it2.hasNext()) {
                    builderClearQuery.appendQueryParameter(strA0j, AnonymousClass005.A0j(it2));
                }
            }
        }
        Uri uriBuild = builderClearQuery.build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    @Override // X.DV5
    public CCV getPostprocessedBitmapCacheKey(C7183Eht c7183Eht, Object obj) {
        C7384Etj.A0Y(c7183Eht, 0);
        return super.getPostprocessedBitmapCacheKey(scoped(c7183Eht).request, obj);
    }

    private final ScopedRequest scoped(C7183Eht c7183Eht) {
        CloudflareImageUrl.Companion companion = CloudflareImageUrl.Companion;
        Uri uri = c7183Eht.A04;
        C7384Etj.A0U(uri);
        if (companion.parse(uri) == null) {
            return new ScopedRequest(null, c7183Eht);
        }
        ConcurrentMap<C7183Eht, ScopedRequest> concurrentMap = requests;
        ScopedRequest scopedRequestPutIfAbsent = concurrentMap.get(c7183Eht);
        if (scopedRequestPutIfAbsent == null) {
            String strCurrentUserIdForCache = AuraAuthHeaders.INSTANCE.currentUserIdForCache();
            C7184Ehu c7184EhuA00 = C7184Ehu.A00(c7183Eht);
            c7184EhuA00.A0F = INSTANCE.cacheUri(uri, strCurrentUserIdForCache).toString();
            ScopedRequest scopedRequest = new ScopedRequest(strCurrentUserIdForCache, c7184EhuA00.A01());
            scopedRequestPutIfAbsent = concurrentMap.putIfAbsent(c7183Eht, scopedRequest);
            if (scopedRequestPutIfAbsent == null) {
                scopedRequestPutIfAbsent = scopedRequest;
            }
        }
        return scopedRequestPutIfAbsent;
    }

    private final Uri cacheUri(Uri uri, String str) {
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        if (str == null) {
            str = "signed-out";
        }
        Uri uriBuild = builderClearQuery.fragment(str).build();
        C7384Etj.A0U(uriBuild);
        return uriBuild;
    }

    @Override // X.DV5
    public CCV getEncodedCacheKey(C7183Eht c7183Eht, Uri uri, Object obj) {
        AnonymousClass003.A0u(c7183Eht, uri);
        ScopedRequest scopedRequestScoped = scoped(c7183Eht);
        CloudflareImageUrl.Companion companion = CloudflareImageUrl.Companion;
        Uri uri2 = c7183Eht.A04;
        C7384Etj.A0U(uri2);
        if (companion.parse(uri2) != null) {
            uri = cacheUri(uri, scopedRequestScoped.accountId);
        }
        return super.getEncodedCacheKey(scopedRequestScoped.request, uri, obj);
    }
}
