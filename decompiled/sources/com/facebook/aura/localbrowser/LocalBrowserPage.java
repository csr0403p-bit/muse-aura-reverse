package com.facebook.aura.localbrowser;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import X.G0U;
import android.os.Handler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalBrowserPage {
    public static final int $stable = 8;
    public G0U<? super LocalBrowserBlockSignal, Unit> blockSignal;
    public volatile G0U<? super String, ? extends WebResourceResponse> blocklistScreen;
    public final WebViewClient client;
    public volatile boolean closed;
    public final Set<String> httpsUpgrades;
    public final Handler mainHandler;
    public final BLG<Boolean> mutablePolicyBlocked;
    public final BLG<LocalBrowserPageState> mutableState;
    public volatile G0U<? super String, Boolean> navigationPolicy;
    public final Function0<Unit> onNavigationStarted;
    public final Function0<Unit> onRendererGone;
    public final Function0<Unit> onStateChanged;
    public final C1BN<Boolean> policyBlocked;
    public final C1BN<LocalBrowserPageState> state;
    public final WebView webView;

    public final boolean allowsNavigation(String str) {
        C7384Etj.A0Y(str, 0);
        return (this.closed || acceptedUrl(str) == null) ? false : true;
    }

    public final void bindBlockSignal(G0U<? super LocalBrowserBlockSignal, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.blockSignal = g0u;
    }

    public final void bindBlocklistScreen(G0U<? super String, ? extends WebResourceResponse> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.blocklistScreen = g0u;
    }

    public final void bindNavigationPolicy(G0U<? super String, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        if (this.navigationPolicy != null || this.state.getValue().phase != LocalBrowserPagePhase.BLANK) {
            throw C3cG.A0Q("Check failed.");
        }
        this.navigationPolicy = g0u;
    }

    public final void close() {
        this.closed = true;
        publish(new LocalBrowserPageState(AnonymousClass002.A0k(), "about:blank", LocalBrowserPagePhase.CLOSED, null, null, false, false));
    }

    public final void fail(LocalBrowserPageFailure localBrowserPageFailure, Integer num) {
        C7384Etj.A0Y(localBrowserPageFailure, 0);
        if (this.closed) {
            return;
        }
        this.httpsUpgrades.clear();
        publish(new LocalBrowserPageState(AnonymousClass002.A0k(), this.state.getValue().url, LocalBrowserPagePhase.FAILED, localBrowserPageFailure, num, false, false));
    }

    public final void reportBlockSignal(LocalBrowserBlockSignal localBrowserBlockSignal) {
        G0U<? super LocalBrowserBlockSignal, Unit> g0u;
        C7384Etj.A0Y(localBrowserBlockSignal, 0);
        if (this.closed || (g0u = this.blockSignal) == null) {
            return;
        }
        g0u.invoke(localBrowserBlockSignal);
    }

    public /* synthetic */ LocalBrowserPage(WebView webView, Function0 function0, Function0 function02, Function0 function03, int i, C06H c06h) {
        this(webView, function0, function02, (i & 8) != 0 ? new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserPage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function03);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String acceptedUrl(String str) {
        String strNavigationUrl = LocalBrowserUrlPolicy.INSTANCE.navigationUrl(str);
        if (strNavigationUrl != null) {
            G0U<? super String, Boolean> g0u = this.navigationPolicy;
            if (g0u == null || AnonymousClass003.A1X(strNavigationUrl, g0u)) {
                return strNavigationUrl;
            }
            AnonymousClass003.A14(this.mutablePolicyBlocked, true);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitLoading(String str) {
        String strAcceptedUrl;
        LocalBrowserPageState value = this.state.getValue();
        if (this.closed || value.phase != LocalBrowserPagePhase.LOADING) {
            return;
        }
        if (str == null || str.equals(this.webView.getUrl())) {
            if (str != null) {
                strAcceptedUrl = acceptedUrl(str);
                if (strAcceptedUrl == null) {
                    this.webView.stopLoading();
                    fail(LocalBrowserPageFailure.URL_UNSUPPORTED, null);
                    return;
                }
            } else {
                strAcceptedUrl = null;
            }
            this.httpsUpgrades.clear();
            String str2 = value.document;
            if (strAcceptedUrl == null) {
                strAcceptedUrl = value.url;
            }
            publish(new LocalBrowserPageState(str2, strAcceptedUrl, LocalBrowserPagePhase.READY, null, null, false, false));
        }
    }

    public static /* synthetic */ void fail$default(LocalBrowserPage localBrowserPage, LocalBrowserPageFailure localBrowserPageFailure, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        localBrowserPage.fail(localBrowserPageFailure, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publish(LocalBrowserPageState localBrowserPageState) {
        BLG<LocalBrowserPageState> blg = this.mutableState;
        String str = localBrowserPageState.document;
        String str2 = localBrowserPageState.url;
        LocalBrowserPagePhase localBrowserPagePhase = localBrowserPageState.phase;
        LocalBrowserPageFailure localBrowserPageFailure = localBrowserPageState.failure;
        Integer num = localBrowserPageState.httpStatus;
        boolean z = false;
        boolean z2 = !this.closed && this.webView.canGoBack();
        if (!this.closed && this.webView.canGoForward()) {
            z = true;
        }
        AnonymousClass002.A1I(blg, new LocalBrowserPageState(str, str2, localBrowserPagePhase, localBrowserPageFailure, num, z2, z));
        this.onStateChanged.invoke();
    }

    public final void clearPolicyBlock() {
        AnonymousClass004.A1D(false, this.mutablePolicyBlocked);
    }

    public final WebViewClient getClient() {
        return this.client;
    }

    public final C1BN<Boolean> getPolicyBlocked() {
        return this.policyBlocked;
    }

    public final C1BN<LocalBrowserPageState> getState() {
        return this.state;
    }

    private final String newDocument() {
        return AnonymousClass002.A0k();
    }

    public LocalBrowserPage(WebView webView, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        C7384Etj.A0Y(webView, 0);
        AnonymousClass005.A11(function0, function02, function03, 1);
        this.webView = webView;
        this.onRendererGone = function0;
        this.onNavigationStarted = function02;
        this.onStateChanged = function03;
        C9286GCn c9286GCnA14 = C3cG.A14(new LocalBrowserPageState(AnonymousClass002.A0k(), "about:blank", LocalBrowserPagePhase.BLANK, null, null, false, false));
        this.mutableState = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
        this.httpsUpgrades = C3cG.A0k();
        this.mainHandler = C60O.A02();
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this.mutablePolicyBlocked = c9286GCnA0v;
        this.policyBlocked = C3cG.A11(c9286GCnA0v);
        this.client = new LocalBrowserPage$client$1(this);
    }
}
