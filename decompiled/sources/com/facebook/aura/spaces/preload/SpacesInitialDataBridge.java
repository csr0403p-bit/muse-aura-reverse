package com.facebook.aura.spaces.preload;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C60Q;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.DCl;
import X.FGI;
import android.webkit.JavascriptInterface;
import com.facebook.aura.spaces.cache.SpacesDiskCache;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;

/* loaded from: classes3.dex */
public final class SpacesInitialDataBridge {
    public static final Companion Companion = new Companion();
    public static final String INITIAL_DATA_PREFIX = "INITIAL:";
    public static final String MIME_JSON = "application/json";
    public static final String TAG = "SpacesInitialDataBridge";
    public final SpacesDiskCache diskCache;
    public volatile C6t6 secureWebView;

    public SpacesInitialDataBridge(SpacesDiskCache spacesDiskCache) {
        C7384Etj.A0Y(spacesDiskCache, 0);
        this.diskCache = spacesDiskCache;
    }

    private final boolean validateToken(String str) {
        try {
            C6t6 c6t6 = this.secureWebView;
            if (c6t6 == null || !c6t6.validateJsInterfaceToken(str)) {
                return false;
            }
            return SpacesWebViewSessionKt.isOnGrantedSpaceOrigin(c6t6);
        } catch (RuntimeException e) {
            CFK.A08(TAG, "Exception validating JS bridge token", e);
            return false;
        }
    }

    public final C6t6 getSecureWebView() {
        return this.secureWebView;
    }

    @JavascriptInterface
    public final String load(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (!validateToken(str)) {
            C3cG.A1G("load: token validation failed for ", str2, TAG);
        } else if (!C7BY.A0j(str2)) {
            try {
                SpacesDiskCache.CachedAsset blocking = this.diskCache.getBlocking(FGI.A0M(INITIAL_DATA_PREFIX, str2));
                if (blocking == null) {
                    C60Q.A1I("load: cache miss for ", str2, TAG);
                    return "";
                }
                CFK.A05(TAG, FGI.A0A(blocking.bytes.length, "load: cache hit for ", str2, " (", " bytes)"));
                return new String(blocking.bytes, DCl.A05);
            } catch (Exception e) {
                C60Q.A1K("Failed to load INITIAL_DATA for ", str2, ": ", e.getMessage(), TAG);
                return "";
            }
        }
        return "";
    }

    @JavascriptInterface
    public final void persist(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        if (!validateToken(str)) {
            C3cG.A1G("persist: token validation failed for ", str2, TAG);
            return;
        }
        if (C7BY.A0j(str2) || C7BY.A0j(str3)) {
            return;
        }
        try {
            this.diskCache.putBlocking(FGI.A0M(INITIAL_DATA_PREFIX, str2), C3cG.A1S(str3), "application/json");
            CFK.A05(TAG, FGI.A0A(str3.length(), "Persisted INITIAL_DATA for ", str2, " (", " chars)"));
        } catch (Exception e) {
            C60Q.A1K("Failed to persist INITIAL_DATA for ", str2, ": ", e.getMessage(), TAG);
        }
    }

    public final void setSecureWebView(C6t6 c6t6) {
        this.secureWebView = c6t6;
    }

    public final class Companion {
        public final String initialDataKey$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload(String str) {
            C7384Etj.A0Y(str, 0);
            return FGI.A0M(SpacesInitialDataBridge.INITIAL_DATA_PREFIX, str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
