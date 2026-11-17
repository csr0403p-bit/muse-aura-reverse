package libraries.fxmetalogin.accountscenter;

import X.AbstractC0885AGm;
import X.AbstractC2185B9e;
import X.AbstractC8276Fb0;
import X.AnonymousClass005;
import X.C061773r;
import X.C06827l3;
import X.C0881AGi;
import X.C10543Hqv;
import X.C3cG;
import X.C3cH;
import X.C4020Ck2;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6oL;
import X.C6oR;
import X.C6oc;
import X.C6od;
import X.C6t6;
import X.C6tF;
import X.C6to;
import X.C6tq;
import X.C7384Etj;
import X.C75I;
import X.C7BY;
import X.C7Je;
import X.C7oV;
import X.C8iM;
import X.CFK;
import X.Ck3;
import X.EnumC061973t;
import X.F2m;
import X.F60;
import X.G0U;
import X.HpR;
import X.HwU;
import X.InterfaceC062373z;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.aura.R;
import com.facebook.aura.accountcenter.AuraAccountsCenterActivity;
import com.facebook.aura.bloks.plugins.core.deeplinktootherappoverride.MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity;

/* loaded from: classes3.dex */
public abstract class WebViewAccountsCenterBaseActivity extends AppCompatActivity {
    public static final String TAG = "WebViewAccountsCenterBaseActivity";
    public HwU<Intent> authActivityLauncher;
    public List<String> externalDomains = C0881AGi.A00;
    public boolean initialCookieFetchStarted;
    public FrameLayout loadingOverlay;
    public ProgressBar prgInitialoader;
    public C6t6 webView;

    /* JADX INFO: Access modifiers changed from: private */
    public final void openAccountsCenterWithMetaCookie(String str, C6t6 c6t6, InterfaceC062373z interfaceC062373z) {
        ArrayList arrayListA11 = C60O.A11(4);
        List listAsList = Arrays.asList("https");
        if (listAsList.isEmpty()) {
            throw C60O.A0i("Cannot set 0 schemes");
        }
        arrayListA11.add(new C6to(listAsList));
        arrayListA11.add(new C6oL(new String[]{"meta.com"}));
        C6od c6odA00 = C6tq.A00(arrayListA11);
        C7384Etj.A0U(c6odA00);
        recordInitialLoadPhase(interfaceC062373z, EnumC061973t.A03, System.nanoTime(), c6t6);
        try {
            c6t6.loadUrlWithCookiesSecure(getWebViewEndpoint(), c6odA00, Collections.singletonList(str));
        } finally {
            recordInitialLoadPhase(interfaceC062373z, EnumC061973t.A02, System.nanoTime(), c6t6);
        }
    }

    private final void setupWebView(C6t6 c6t6) {
        ArrayList arrayListA0y = AbstractC0885AGm.A0y(AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX, "instagram.com", "meta.com", "oculus.com", "oculusdevelopers.zendesk.com", "metahorizondevelopers.zendesk.com");
        if (!getExternalDomains().isEmpty()) {
            arrayListA0y.addAll(getExternalDomains());
        }
        ArrayList arrayListA11 = C60O.A11(4);
        List listA16 = C60O.A16("https", AuraDeeplinkHandlerActivity.HTTP);
        if (listA16.isEmpty()) {
            throw C60O.A0i("Cannot set 0 schemes");
        }
        arrayListA11.add(new C6to(listA16));
        String[] strArr = (String[]) arrayListA0y.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length == 0) {
            throw C60O.A0i("Cannot set 0 domains");
        }
        arrayListA11.add(new C6oL(strArr2));
        C6od c6odA00 = C6tq.A00(arrayListA11);
        ArrayList arrayListA0s = C60Q.A0s(c6odA00);
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(c6odA00);
        C6oc c6oc = new C6oc(new C75I(), new C6oR(), arrayListA0s, arrayListA0h);
        C061773r c061773r = new C061773r(this);
        c061773r.mAdditionalLoadingControlChecksEnabled = true;
        c6t6.setJavaScriptEnabled(true);
        c6t6.mUriHandler = c6oc;
        c6t6.setWebViewClient(c061773r);
        c6t6.setWebChromeClient(new C6tF() { // from class: X.6sy
            @Override // X.C6tF
            public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                WebView.WebViewTransport webViewTransport;
                AnonymousClass002.A1B(webView, 0, message);
                final WebView webView2 = new WebView(webView.getContext());
                final WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity = this.A00;
                webView2.setWebViewClient(new WebViewClient() { // from class: X.7L8
                    @Override // android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                        String string;
                        String strA02;
                        C7384Etj.A0Y(webResourceRequest, 1);
                        Uri url = webResourceRequest.getUrl();
                        if (url != null && (string = url.toString()) != null && string.length() != 0) {
                            C7VN c7vn = new C7VN();
                            c7vn.A01.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
                            C7LB c7lbA02 = c7vn.A02();
                            WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity2 = webViewAccountsCenterBaseActivity;
                            C0881AGi c0881AGi = C0881AGi.A00;
                            List<ResolveInfo> listA00 = C7L9.A00(webViewAccountsCenterBaseActivity2, string);
                            if (!listA00.isEmpty() && (strA02 = AbstractC06907md.A02(listA00, c0881AGi)) != null) {
                                c7lbA02.A00.setPackage(strA02);
                            }
                            c7lbA02.A00(webViewAccountsCenterBaseActivity2, Uri.parse(string));
                        }
                        webView2.destroy();
                        return true;
                    }
                });
                Object obj = message.obj;
                if (!(obj instanceof WebView.WebViewTransport) || (webViewTransport = (WebView.WebViewTransport) obj) == null) {
                    webView2.destroy();
                    return false;
                }
                webViewTransport.setWebView(webView2);
                message.sendToTarget();
                return true;
            }
        });
        c6t6.setUserAgentString(C60R.A0d(c6t6));
        c6t6.setJavaScriptCanOpenWindowsAutomatically(true);
        c6t6.setSupportMultipleWindows(true);
        c6t6.setDomStorageEnabled(true);
        c6t6.setDatabaseEnabled(true);
    }

    public abstract void additionalWebViewSetup(C6t6 c6t6);

    public void fetchMetaSessionCookie(boolean z, F2m f2m) {
        C7384Etj.A0Y(f2m, 1);
        new C4020Ck2(((AuraAccountsCenterActivity) this).authenticatedRequestFactory).A00(f2m);
    }

    public abstract String getAuthUrls();

    public abstract Ck3 getAuthenticatedRequestFactory();

    public abstract List<String> getExternalDomains();

    public abstract String getFrlAppId();

    public abstract InterfaceC062373z getInitialLoadPhaseObserver();

    public abstract String getMetaToken();

    public abstract G0U<String, Boolean> getShouldInterceptURL();

    public abstract String getUserAgent(C6t6 c6t6);

    public abstract String getWebViewEndpoint();

    public abstract void onWebViewPageFinished();

    public abstract void onWebViewPageStarted();

    public abstract void setExternalDomains(List<String> list);

    /* JADX WARN: Multi-variable type inference failed */
    private final void getMetaCookieAndOpenAccountsCenter(final C6t6 c6t6) {
        boolean z = this.initialCookieFetchStarted;
        boolean z2 = !z;
        final InterfaceC062373z interfaceC062373z = !z ? ((AuraAccountsCenterActivity) this).initialLoadPhaseObserver : null;
        this.initialCookieFetchStarted = true;
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        c10543HqvA0z.element = "";
        if (((AuraAccountsCenterActivity) this).metaToken == null) {
            if (interfaceC062373z != null) {
                interfaceC062373z.onPhase(EnumC061973t.A07, System.nanoTime());
            }
            openAccountsCenterWithMetaCookie((String) c10543HqvA0z.element, c6t6, interfaceC062373z);
        } else {
            if (interfaceC062373z != null) {
                interfaceC062373z.onPhase(EnumC061973t.A08, System.nanoTime());
            }
            fetchMetaSessionCookie(z2, new F2m() { // from class: X.73s
                @Override // X.F2m
                public final void onFail(Throwable th) {
                    final long jNanoTime = System.nanoTime();
                    CFK.A08(WebViewAccountsCenterBaseActivity.TAG, "Meta cookie exchange failure", th);
                    Handler handlerA02 = C60O.A02();
                    final WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity = this;
                    final InterfaceC062373z interfaceC062373z2 = interfaceC062373z;
                    final C6t6 c6t62 = c6t6;
                    final C10543Hqv<String> c10543Hqv = c10543HqvA0z;
                    handlerA02.post(new Runnable() { // from class: X.73v
                        public static final String __redex_internal_original_name = "WebViewAccountsCenterBaseActivity$getMetaCookieAndOpenAccountsCenter$1$onFail$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity2 = webViewAccountsCenterBaseActivity;
                            InterfaceC062373z interfaceC062373z3 = interfaceC062373z2;
                            EnumC061973t enumC061973t = EnumC061973t.A05;
                            long j = jNanoTime;
                            C6t6 c6t63 = c6t62;
                            webViewAccountsCenterBaseActivity2.recordInitialLoadPhase(interfaceC062373z3, enumC061973t, j, c6t63);
                            webViewAccountsCenterBaseActivity2.recordInitialLoadPhase(interfaceC062373z3, EnumC061973t.A06, j, c6t63);
                            webViewAccountsCenterBaseActivity2.openAccountsCenterWithMetaCookie(c10543Hqv.element, c6t63, interfaceC062373z3);
                        }
                    });
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.F2m
                public final void onSuccess(final String str) {
                    final long jNanoTime = System.nanoTime();
                    if (str != 0) {
                        c10543HqvA0z.element = str;
                    }
                    Handler handlerA02 = C60O.A02();
                    final WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity = this;
                    final InterfaceC062373z interfaceC062373z2 = interfaceC062373z;
                    final C6t6 c6t62 = c6t6;
                    final C10543Hqv<String> c10543Hqv = c10543HqvA0z;
                    handlerA02.post(new Runnable() { // from class: X.73u
                        public static final String __redex_internal_original_name = "WebViewAccountsCenterBaseActivity$getMetaCookieAndOpenAccountsCenter$1$onSuccess$1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity2 = webViewAccountsCenterBaseActivity;
                            InterfaceC062373z interfaceC062373z3 = interfaceC062373z2;
                            EnumC061973t enumC061973t = EnumC061973t.A05;
                            long j = jNanoTime;
                            C6t6 c6t63 = c6t62;
                            webViewAccountsCenterBaseActivity2.recordInitialLoadPhase(interfaceC062373z3, enumC061973t, j, c6t63);
                            String str2 = str;
                            webViewAccountsCenterBaseActivity2.recordInitialLoadPhase(interfaceC062373z3, (str2 == null || str2.length() == 0) ? EnumC061973t.A04 : EnumC061973t.A09, j, c6t63);
                            webViewAccountsCenterBaseActivity2.openAccountsCenterWithMetaCookie(c10543Hqv.element, c6t63, interfaceC062373z3);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onActivityResult(ActivityResult activityResult) {
        Intent intent;
        String stringExtra;
        C6t6 c6t6;
        if (activityResult.A00 != -1 || (intent = activityResult.A01) == null || (stringExtra = intent.getStringExtra("CALLBACK_URI_KEY")) == null) {
            return;
        }
        String queryParameter = C7Je.A01(stringExtra).getQueryParameter(MWABKBloksActionDeeplinkToOtherAppOrDirectToAppStoreImpl.DESTINATION_URL_PARAM);
        if (queryParameter != null && (c6t6 = this.webView) != null) {
            c6t6.loadUrl(queryParameter);
        }
        ProgressBar progressBar = this.prgInitialoader;
        if (progressBar == null) {
            C7384Etj.A0b("prgInitialoader");
            throw F60.createAndThrow();
        }
        progressBar.setVisibility(0);
        FrameLayout frameLayout = this.loadingOverlay;
        if (frameLayout == null) {
            C7384Etj.A0b("loadingOverlay");
            throw F60.createAndThrow();
        }
        frameLayout.setVisibility(0);
    }

    public static /* synthetic */ void openAccountsCenterWithMetaCookie$default(WebViewAccountsCenterBaseActivity webViewAccountsCenterBaseActivity, String str, C6t6 c6t6, InterfaceC062373z interfaceC062373z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAccountsCenterWithMetaCookie");
        }
        if ((i & 4) != 0) {
            interfaceC062373z = null;
        }
        webViewAccountsCenterBaseActivity.openAccountsCenterWithMetaCookie(str, c6t6, interfaceC062373z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordInitialLoadPhase(InterfaceC062373z interfaceC062373z, EnumC061973t enumC061973t, long j, C6t6 c6t6) {
        if (this.webView != c6t6 || isFinishing() || isDestroyed() || interfaceC062373z == null) {
            return;
        }
        interfaceC062373z.onPhase(enumC061973t, j);
    }

    public final C6t6 getWebView() {
        C6t6 c6t6 = this.webView;
        if (c6t6 != null) {
            return c6t6;
        }
        throw C3cG.A0Q("Required value was null.");
    }

    public final void navigateHome() {
        C6t6 c6t6 = this.webView;
        if (c6t6 != null) {
            getMetaCookieAndOpenAccountsCenter(c6t6);
        }
    }

    public void onActivityResultCancelled() {
    }

    public void onActivityResultOk(String str) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ViewGroup viewGroup;
        HwU<Intent> hwU = this.authActivityLauncher;
        if (hwU != null) {
            try {
                hwU.A00();
            } catch (IllegalStateException e) {
                CFK.A08(TAG, "Failed to unregister authActivityLauncher. Non critical error.", e);
            }
        }
        C6t6 c6t6 = this.webView;
        if (c6t6 != null) {
            ViewParent parent = c6t6.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(c6t6);
            }
            c6t6.destroy();
        }
        this.webView = null;
        clearWebViewCookies();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrlWithAppId(String str) {
        Uri uriA01 = C7Je.A01(str);
        C7384Etj.A0U(uriA01);
        Set<String> queryParameterNames = uriA01.getQueryParameterNames();
        Uri.Builder builderClearQuery = uriA01.buildUpon().clearQuery();
        Iterator<String> it = queryParameterNames.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            builderClearQuery.appendQueryParameter(strA0j, JarvisProtocolKt.APP_ID_QUERY_PARAM.equals(strA0j) ? ((AuraAccountsCenterActivity) this).frlAppId : uriA01.getQueryParameter(strA0j));
        }
        return C60R.A0b(builderClearQuery);
    }

    private final void clearWebViewCookies() {
        try {
            CookieManager.getInstance().removeAllCookies(null);
        } catch (Exception e) {
            CFK.A08(TAG, "Error clearing WebView cookies", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesMatchAuthUrls(String str) {
        if (!C7BY.A0j(getAuthUrls())) {
            Iterator it = C7BY.A0e(getAuthUrls(), ",").iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (!C3cH.A1Q(strA0j) && str != null && C06827l3.A02(strA0j).A07(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (C7oV.A01().A00(this, getIntent(), this)) {
            super.onCreate(bundle);
            setContentView(R.layout._name_removed__res_0x7f0d0018);
            AbstractC8276Fb0 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A06(true);
            }
            final C6t6 c6t6 = (C6t6) findViewById(R.id.webview);
            this.webView = c6t6;
            View viewFindViewById = findViewById(R.id.prg_initial_load);
            C7384Etj.A0U(viewFindViewById);
            this.prgInitialoader = (ProgressBar) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.loading_overlay);
            C7384Etj.A0U(viewFindViewById2);
            FrameLayout frameLayout = (FrameLayout) viewFindViewById2;
            this.loadingOverlay = frameLayout;
            if (frameLayout == null) {
                C7384Etj.A0b("loadingOverlay");
                throw F60.createAndThrow();
            }
            frameLayout.setVisibility(8);
            this.authActivityLauncher = registerForActivityResult(new HpR(), new C8iM(this, 1));
            AuraAccountsCenterActivity auraAccountsCenterActivity = (AuraAccountsCenterActivity) this;
            InterfaceC062373z interfaceC062373z = auraAccountsCenterActivity.initialLoadPhaseObserver;
            if (interfaceC062373z != null) {
                interfaceC062373z.onPhase(EnumC061973t.A0B, System.nanoTime());
            }
            C7384Etj.A0X(c6t6);
            setupWebView(c6t6);
            InterfaceC062373z interfaceC062373z2 = auraAccountsCenterActivity.initialLoadPhaseObserver;
            if (interfaceC062373z2 != null) {
                interfaceC062373z2.onPhase(EnumC061973t.A0A, System.nanoTime());
            }
            additionalWebViewSetup(c6t6);
            getMetaCookieAndOpenAccountsCenter(c6t6);
            getOnBackPressedDispatcher().A01(new AbstractC2185B9e() { // from class: X.73x
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(true);
                }

                @Override // X.AbstractC2185B9e
                public final void A04() {
                    C6t6 c6t62 = c6t6;
                    if (c6t62.canGoBack()) {
                        c6t62.goBack();
                    } else {
                        this.onSupportNavigateUp();
                    }
                }
            }, this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        clearWebViewCookies();
        return true;
    }
}
