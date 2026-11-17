package com.facebook.aura.localbrowser;

import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C05716xA;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C6x5;
import X.C6x6;
import X.C6x7;
import X.C6xD;
import X.C6xR;
import X.C6xT;
import X.C6xU;
import X.C6xj;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.FGI;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.localbrowser.LocalBrowserWebViewFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes3.dex */
public final class LocalBrowserWebViewFactory {
    public static final int $stable = 0;
    public static final LocalBrowserWebViewFactory INSTANCE = new LocalBrowserWebViewFactory();

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserWebViewFactory$configureRendererRecovery$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public Long unresponsiveSinceMs;

        public void onRenderProcessResponsive(WebView webView, C6xR c6xR) {
            Long l = this.unresponsiveSinceMs;
            if (l != null) {
                long jLongValue = l.longValue();
                this.unresponsiveSinceMs = null;
                LocalBrowserTelemetry.INSTANCE.rendererResponsive("unresponsive", C3cG.A04(jLongValue));
            }
        }

        public void onRenderProcessUnresponsive(WebView webView, C6xR c6xR) {
            long jLongValue;
            WebViewRenderProcess webViewRenderProcess;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Long l = this.unresponsiveSinceMs;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                this.unresponsiveSinceMs = Long.valueOf(jElapsedRealtime);
                jLongValue = jElapsedRealtime;
            }
            long j = jElapsedRealtime - jLongValue;
            if (j >= 30000) {
                this.unresponsiveSinceMs = Long.valueOf(jElapsedRealtime);
                boolean z = false;
                if (c6xR != null && (webViewRenderProcess = ((C6xT) c6xR).A00.get()) != null && webViewRenderProcess.terminate()) {
                    z = true;
                }
                LocalBrowserTelemetry.INSTANCE.rendererTerminated("unresponsive", z, j);
                CFK.A06("LocalBrowserWebView", FGI.A0r("Unresponsive renderer terminated=", z));
            }
        }

        public AnonymousClass1(int i) {
        }

        public AnonymousClass1() {
        }
    }

    public final LocalBrowserWebView create(Context context, String str) {
        ContextWrapper contextWrapper;
        Context baseContext;
        boolean zA1a = AnonymousClass002.A1a(context, str);
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
        if ((context instanceof MutableContextWrapper) && (contextWrapper = (ContextWrapper) context) != null && (baseContext = contextWrapper.getBaseContext()) != null) {
            context = baseContext;
        }
        LocalBrowserWebView localBrowserWebView = new LocalBrowserWebView(new MutableContextWrapper(context));
        try {
            if (!C6xU.A0h.A01()) {
                throw C60Q.A0q();
            }
            C6xj.A02(localBrowserWebView).A00.setProfile(str);
            configureRendererRecovery(localBrowserWebView);
            WebSettings settings = localBrowserWebView.getSettings();
            C7384Etj.A0U(settings);
            configureUserAgent(settings);
            WebSettings settings2 = localBrowserWebView.getSettings();
            settings2.setAllowFileAccess(false);
            settings2.setAllowContentAccess(false);
            settings2.setAllowFileAccessFromFileURLs(false);
            settings2.setAllowUniversalAccessFromFileURLs(false);
            settings2.setMixedContentMode(zA1a ? 1 : 0);
            settings2.setSafeBrowsingEnabled(zA1a);
            settings2.setJavaScriptEnabled(false);
            settings2.setDomStorageEnabled(false);
            settings2.setBlockNetworkLoads(zA1a);
            settings2.setOffscreenPreRaster(zA1a);
            settings2.setMediaPlaybackRequiresUserGesture(zA1a);
            settings2.setJavaScriptCanOpenWindowsAutomatically(false);
            settings2.setSupportMultipleWindows(zA1a);
            settings2.setGeolocationEnabled(false);
            settings2.setSupportZoom(zA1a);
            settings2.setBuiltInZoomControls(zA1a);
            settings2.setDisplayZoomControls(false);
            settings2.setUseWideViewPort(zA1a);
            settings2.setLoadWithOverviewMode(zA1a);
            settings2.setTextZoom(100);
            localBrowserWebView.setSaveEnabled(false);
            return localBrowserWebView;
        } catch (RuntimeException e) {
            try {
                localBrowserWebView.destroy();
            } catch (RuntimeException unused) {
            }
            throw e;
        }
    }

    private final void configureRendererRecovery(WebView webView) {
        if (C6xU.A00("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE") && C6xU.A00("WEB_VIEW_RENDERER_TERMINATE")) {
            final AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            webView.setWebViewRenderProcessClient(new WebViewRenderProcessClient(anonymousClass1) { // from class: X.6xQ
                public final LocalBrowserWebViewFactory.AnonymousClass1 A00;

                @Override // android.webkit.WebViewRenderProcessClient
                public final void onRenderProcessResponsive(WebView webView2, WebViewRenderProcess webViewRenderProcess) {
                    this.A00.onRenderProcessResponsive(webView2, C6xT.A00(webViewRenderProcess));
                }

                @Override // android.webkit.WebViewRenderProcessClient
                public final void onRenderProcessUnresponsive(WebView webView2, WebViewRenderProcess webViewRenderProcess) {
                    this.A00.onRenderProcessUnresponsive(webView2, C6xT.A00(webViewRenderProcess));
                }

                {
                    this.A00 = anonymousClass1;
                }
            });
        }
    }

    private final void configureUserAgent(WebSettings webSettings) {
        C6x5 c6x5;
        String[][] strArr;
        String[] strArr2;
        if (!C6xU.A00("USER_AGENT_METADATA")) {
            c6x5 = null;
        } else {
            if (!C6xU.A0y.A01()) {
                throw C60Q.A0q();
            }
            C6x7 c6x7A00 = C6xD.A00(webSettings);
            Map<String, Object> userAgentMetadataMap = c6x7A00 instanceof C05716xA ? Collections.EMPTY_MAP : c6x7A00.A00.getUserAgentMetadataMap();
            String str = null;
            String str2 = null;
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            Object obj = userAgentMetadataMap.get("BRAND_VERSION_LIST");
            if (obj != null) {
                arrayListA0h = C3cG.A0h();
                for (String[] strArr3 : (String[][]) obj) {
                    String str3 = strArr3[0];
                    if (C60Q.A1V(str3)) {
                        throw C60O.A0i("Brand should not be blank.");
                    }
                    String str4 = strArr3[1];
                    if (C60Q.A1V(str4)) {
                        throw C60O.A0i("MajorVersion should not be blank.");
                    }
                    String str5 = strArr3[2];
                    if (C60Q.A1V(str5)) {
                        throw C60O.A0i("FullVersion should not be blank.");
                    }
                    if (str3 == null || C60Q.A1V(str3) || C60Q.A1V(str4) || C60Q.A1V(str5)) {
                        throw C3cG.A0Q("Brand name, major version and full version should not be null or blank.");
                    }
                    arrayListA0h.add(new C6x6(str3, str4, str5));
                }
            }
            String strA0p = C60O.A0p("FULL_VERSION", userAgentMetadataMap);
            if (strA0p != null) {
                if (C60Q.A1V(strA0p)) {
                    throw C60O.A0i("Full version should not be blank.");
                }
                str = strA0p;
            }
            String strA0p2 = C60O.A0p("PLATFORM", userAgentMetadataMap);
            if (strA0p2 != null) {
                if (C60Q.A1V(strA0p2)) {
                    throw C60O.A0i("Platform should not be blank.");
                }
                str2 = strA0p2;
            }
            String strA0p3 = C60O.A0p("PLATFORM_VERSION", userAgentMetadataMap);
            String str6 = strA0p3 != null ? strA0p3 : null;
            String strA0p4 = C60O.A0p("ARCHITECTURE", userAgentMetadataMap);
            String str7 = strA0p4 != null ? strA0p4 : null;
            String strA0p5 = C60O.A0p("MODEL", userAgentMetadataMap);
            String str8 = strA0p5 != null ? strA0p5 : null;
            Boolean bool = (Boolean) userAgentMetadataMap.get("MOBILE");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
            Number number = (Number) userAgentMetadataMap.get("BITNESS");
            int iIntValue = number != null ? number.intValue() : 0;
            Boolean bool2 = (Boolean) userAgentMetadataMap.get("WOW64");
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            String[] strArr4 = (String[]) userAgentMetadataMap.get("FORM_FACTORS");
            if (strArr4 != null) {
                arrayListA0h2 = C3cG.A0h();
                for (String str9 : strArr4) {
                    arrayListA0h2.add(str9);
                }
                if (!C6xU.A0z.A01()) {
                    throw C60Q.A0q();
                }
                Iterator it = arrayListA0h2.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if (!C6x5.A0A.contains(strA0j)) {
                        throw C60Q.A0U("Invalid form factor: ", strA0j);
                    }
                }
            }
            c6x5 = new C6x5(str, str2, str6, str7, str8, arrayListA0h, arrayListA0h2, iIntValue, zBooleanValue, zBooleanValue2);
        }
        String userAgentString = webSettings.getUserAgentString();
        C7384Etj.A0U(userAgentString);
        webSettings.setUserAgentString(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(userAgentString, "; wv)", ")"), " Version/4.0 ", InviteCodeScratcherKt.CODE_SEPARATOR));
        if (c6x5 != null) {
            List<C6x6> list = c6x5.A08;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (C6x6 c6x6 : list) {
                if (C7BY.A0q(c6x6.A00, "WebView", true)) {
                    String str10 = c6x6.A02;
                    String str11 = c6x6.A01;
                    if (C60Q.A1V("Google Chrome")) {
                        throw C60O.A0i("Brand should not be blank.");
                    }
                    if (C60Q.A1V("Google Chrome") || C60Q.A1V(str10) || C60Q.A1V(str11)) {
                        throw C3cG.A0Q("Brand name, major version and full version should not be null or blank.");
                    }
                    c6x6 = new C6x6("Google Chrome", str10, str11);
                }
                arrayListA0i.add(c6x6);
            }
            C6x5 c6x52 = new C6x5(c6x5.A04, c6x5.A06, c6x5.A07, c6x5.A03, c6x5.A05, arrayListA0i, c6x5.A09, c6x5.A00, c6x5.A01, c6x5.A02);
            if (!C6xU.A0y.A01()) {
                throw C60Q.A0q();
            }
            C6x7 c6x7A002 = C6xD.A00(webSettings);
            if (c6x7A002 instanceof C05716xA) {
                return;
            }
            WebSettingsBoundaryInterface webSettingsBoundaryInterface = c6x7A002.A00;
            HashMap map = new HashMap();
            List<C6x6> list2 = c6x52.A08;
            if (list2.isEmpty()) {
                strArr = null;
            } else {
                strArr = (String[][]) Array.newInstance((Class<?>) String.class, list2.size(), 3);
                for (int i = 0; i < list2.size(); i++) {
                    strArr[i][0] = list2.get(i).A00;
                    strArr[i][1] = list2.get(i).A02;
                    strArr[i][2] = list2.get(i).A01;
                }
            }
            map.put("BRAND_VERSION_LIST", strArr);
            map.put("FULL_VERSION", c6x52.A04);
            map.put("PLATFORM", c6x52.A06);
            map.put("PLATFORM_VERSION", c6x52.A07);
            map.put("ARCHITECTURE", c6x52.A03);
            map.put("MODEL", c6x52.A05);
            map.put("MOBILE", Boolean.valueOf(c6x52.A01));
            map.put("BITNESS", Integer.valueOf(c6x52.A00));
            map.put("WOW64", Boolean.valueOf(c6x52.A02));
            if (C6xU.A0z.A01()) {
                List<String> list3 = c6x52.A09;
                if (list3 == null || list3.isEmpty()) {
                    strArr2 = null;
                } else {
                    strArr2 = new String[list3.size()];
                    for (int i2 = 0; i2 < list3.size(); i2++) {
                        strArr2[i2] = list3.get(i2);
                    }
                }
                map.put("FORM_FACTORS", strArr2);
            }
            webSettingsBoundaryInterface.setUserAgentMetadataFromMap(map);
        }
    }
}
