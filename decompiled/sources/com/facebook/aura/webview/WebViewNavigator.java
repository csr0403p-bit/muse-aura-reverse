package com.facebook.aura.webview;

import X.AGE;
import X.AGF;
import X.AbstractC10623Hzj;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.HtJ;
import X.HzR;
import X.InterfaceC0962AJp;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.executors.AuraDispatchers;
import java.util.Arrays;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class WebViewNavigator {
    public static final int $stable = 0;
    public final MutableState canGoBack$delegate;
    public final MutableState canGoForward$delegate;
    public final HzR<NavigationEvent> navigationEvents = AbstractC10623Hzj.A00(C79.A01, 16);

    public interface NavigationEvent {

        public final class Back implements NavigationEvent {
            public static final int $stable = 0;
            public static final Back INSTANCE = new Back();
        }

        public final class Forward implements NavigationEvent {
            public static final int $stable = 0;
            public static final Forward INSTANCE = new Forward();
        }

        public final class LoadHtml extends C06G implements NavigationEvent {
            public static final int $stable = 0;
            public final String baseUrl;
            public final String encoding;
            public final String historyUrl;
            public final String html;
            public final String mimeType;

            public LoadHtml(String str, String str2, String str3, String str4, String str5) {
                C7384Etj.A0Y(str, 0);
                this.html = str;
                this.baseUrl = str2;
                this.mimeType = str3;
                this.encoding = str4;
                this.historyUrl = str5;
            }

            public final LoadHtml copy(String str, String str2, String str3, String str4, String str5) {
                C7384Etj.A0Y(str, 0);
                return new LoadHtml(str, str2, str3, str4, str5);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof LoadHtml) {
                        LoadHtml loadHtml = (LoadHtml) obj;
                        if (!C7384Etj.areEqual(this.html, loadHtml.html) || !C7384Etj.areEqual(this.baseUrl, loadHtml.baseUrl) || !C7384Etj.areEqual(this.mimeType, loadHtml.mimeType) || !C7384Etj.areEqual(this.encoding, loadHtml.encoding) || !C7384Etj.areEqual(this.historyUrl, loadHtml.historyUrl)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ LoadHtml copy$default(LoadHtml loadHtml, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loadHtml.html;
                }
                if ((i & 2) != 0) {
                    str2 = loadHtml.baseUrl;
                }
                if ((i & 4) != 0) {
                    str3 = loadHtml.mimeType;
                }
                if ((i & 8) != 0) {
                    str4 = loadHtml.encoding;
                }
                if ((i & 16) != 0) {
                    str5 = loadHtml.historyUrl;
                }
                return loadHtml.copy(str, str2, str3, str4, str5);
            }

            public final String component1() {
                return this.html;
            }

            public final String component2() {
                return this.baseUrl;
            }

            public final String component3() {
                return this.mimeType;
            }

            public final String component4() {
                return this.encoding;
            }

            public final String component5() {
                return this.historyUrl;
            }

            public final String getBaseUrl() {
                return this.baseUrl;
            }

            public final String getEncoding() {
                return this.encoding;
            }

            public final String getHistoryUrl() {
                return this.historyUrl;
            }

            public final String getHtml() {
                return this.html;
            }

            public final String getMimeType() {
                return this.mimeType;
            }

            public int hashCode() {
                return ((((((AnonymousClass001.A0G(this.html) + AnonymousClass006.A0G(this.baseUrl)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + AnonymousClass006.A0G(this.encoding)) * 31) + AnonymousClass005.A0H(this.historyUrl);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ LoadHtml(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "utf-8" : str4, (i & 16) != 0 ? null : str5);
            }
        }

        public final class LoadUrl extends C06G implements NavigationEvent {
            public static final int $stable = 0;
            public final InterfaceC0962AJp<String, String> additionalHttpHeaders;
            public final String url;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof LoadUrl) {
                        LoadUrl loadUrl = (LoadUrl) obj;
                        if (!C7384Etj.areEqual(this.url, loadUrl.url) || !C7384Etj.areEqual(this.additionalHttpHeaders, loadUrl.additionalHttpHeaders)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ LoadUrl copy$default(LoadUrl loadUrl, String str, InterfaceC0962AJp interfaceC0962AJp, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loadUrl.url;
                }
                if ((i & 2) != 0) {
                    interfaceC0962AJp = loadUrl.additionalHttpHeaders;
                }
                AnonymousClass003.A0u(str, interfaceC0962AJp);
                return new LoadUrl(str, interfaceC0962AJp);
            }

            public final String component1() {
                return this.url;
            }

            public final InterfaceC0962AJp<String, String> component2() {
                return this.additionalHttpHeaders;
            }

            public final InterfaceC0962AJp<String, String> getAdditionalHttpHeaders() {
                return this.additionalHttpHeaders;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return AnonymousClass005.A0G(this.additionalHttpHeaders, AnonymousClass001.A0G(this.url));
            }

            public LoadUrl(String str, InterfaceC0962AJp<String, String> interfaceC0962AJp) {
                AnonymousClass003.A0u(str, interfaceC0962AJp);
                this.url = str;
                this.additionalHttpHeaders = interfaceC0962AJp;
            }

            public final LoadUrl copy(String str, InterfaceC0962AJp<String, String> interfaceC0962AJp) {
                AnonymousClass003.A0u(str, interfaceC0962AJp);
                return new LoadUrl(str, interfaceC0962AJp);
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ LoadUrl(String str, InterfaceC0962AJp interfaceC0962AJp, int i, C06H c06h) {
                this(str, (i & 2) != 0 ? C0953AJg.A00() : interfaceC0962AJp);
            }
        }

        public final class PostUrl extends C06G implements NavigationEvent {
            public static final int $stable = 0;
            public final byte[] postData;
            public final String url;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof PostUrl) {
                        PostUrl postUrl = (PostUrl) obj;
                        if (!C7384Etj.areEqual(this.url, postUrl.url) || !C7384Etj.areEqual(this.postData, postUrl.postData)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ PostUrl copy$default(PostUrl postUrl, String str, byte[] bArr, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = postUrl.url;
                }
                if ((i & 2) != 0) {
                    bArr = postUrl.postData;
                }
                AnonymousClass003.A0u(str, bArr);
                return new PostUrl(str, bArr);
            }

            public final String component1() {
                return this.url;
            }

            public final byte[] component2() {
                return this.postData;
            }

            public final byte[] getPostData() {
                return this.postData;
            }

            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return AnonymousClass001.A0G(this.url) + Arrays.hashCode(this.postData);
            }

            public PostUrl(String str, byte[] bArr) {
                AnonymousClass003.A0u(str, bArr);
                this.url = str;
                this.postData = bArr;
            }

            public final PostUrl copy(String str, byte[] bArr) {
                AnonymousClass003.A0u(str, bArr);
                return new PostUrl(str, bArr);
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Reload implements NavigationEvent {
            public static final int $stable = 0;
            public static final Reload INSTANCE = new Reload();
        }

        public final class StopLoading implements NavigationEvent {
            public static final int $stable = 0;
            public static final StopLoading INSTANCE = new StopLoading();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadUrl$default(WebViewNavigator webViewNavigator, String str, InterfaceC0962AJp interfaceC0962AJp, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC0962AJp = C0953AJg.A00();
        }
        webViewNavigator.loadUrl(str, interfaceC0962AJp);
    }

    public final boolean getCanGoBack() {
        return MutableState.A0A(this.canGoBack$delegate);
    }

    public final boolean getCanGoForward() {
        return MutableState.A0A(this.canGoForward$delegate);
    }

    public final Object handleNavigationEvents$fbandroid_express_aura_java_com_facebook_aura_webview_webview(WebView webView, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AuraDispatchers.main, new WebViewNavigator$handleNavigationEvents$2(this, webView, null));
    }

    public final void navigateBack() {
        this.navigationEvents.AhZ(NavigationEvent.Back.INSTANCE);
    }

    public final void reload() {
        this.navigationEvents.AhZ(NavigationEvent.Reload.INSTANCE);
    }

    public final void setCanGoBack$fbandroid_express_aura_java_com_facebook_aura_webview_webview(boolean z) {
        MutableState.A09(z, this.canGoBack$delegate);
    }

    public final void setCanGoForward$fbandroid_express_aura_java_com_facebook_aura_webview_webview(boolean z) {
        MutableState.A09(z, this.canGoForward$delegate);
    }

    public final void stopLoading() {
        this.navigationEvents.AhZ(NavigationEvent.StopLoading.INSTANCE);
    }

    public WebViewNavigator() {
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE ageA01 = AGF.A01();
        this.canGoBack$delegate = C3cG.A08(ageA01, boolA0h);
        this.canGoForward$delegate = C3cG.A08(ageA01, boolA0h);
    }

    public final void loadUrl(String str, InterfaceC0962AJp<String, String> interfaceC0962AJp) {
        AnonymousClass003.A0u(str, interfaceC0962AJp);
        this.navigationEvents.AhZ(new NavigationEvent.LoadUrl(str, interfaceC0962AJp));
    }

    public final void postUrl(String str, byte[] bArr) {
        AnonymousClass003.A0u(str, bArr);
        this.navigationEvents.AhZ(new NavigationEvent.PostUrl(str, bArr));
    }
}
