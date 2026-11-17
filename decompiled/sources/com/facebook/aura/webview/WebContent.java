package com.facebook.aura.webview;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0953AJg;
import X.C3cG;
import X.C7384Etj;
import X.InterfaceC0962AJp;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class WebContent {
    public static final int $stable = 8;

    public final class AuthenticatedUrl extends WebContent {
        public static final int $stable = 0;
        public final AHD<String> cookies;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AuthenticatedUrl) {
                    AuthenticatedUrl authenticatedUrl = (AuthenticatedUrl) obj;
                    if (!C7384Etj.areEqual(this.url, authenticatedUrl.url) || !C7384Etj.areEqual(this.cookies, authenticatedUrl.cookies)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AuthenticatedUrl copy$default(AuthenticatedUrl authenticatedUrl, String str, AHD ahd, int i, Object obj) {
            if ((i & 1) != 0) {
                str = authenticatedUrl.url;
            }
            if ((i & 2) != 0) {
                ahd = authenticatedUrl.cookies;
            }
            AnonymousClass003.A0u(str, ahd);
            return new AuthenticatedUrl(str, ahd);
        }

        public final String component1() {
            return this.url;
        }

        public final AHD<String> component2() {
            return this.cookies;
        }

        public final AHD<String> getCookies() {
            return this.cookies;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.cookies, AnonymousClass001.A0G(this.url));
        }

        public AuthenticatedUrl(String str, AHD<String> ahd) {
            AnonymousClass003.A0u(str, ahd);
            this.url = str;
            this.cookies = ahd;
        }

        public final AuthenticatedUrl copy(String str, AHD<String> ahd) {
            AnonymousClass003.A0u(str, ahd);
            return new AuthenticatedUrl(str, ahd);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Data extends WebContent {
        public static final int $stable = 0;
        public final String baseUrl;
        public final String data;
        public final String encoding;
        public final String historyUrl;
        public final String mimeType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    Data data = (Data) obj;
                    if (!C7384Etj.areEqual(this.data, data.data) || !C7384Etj.areEqual(this.baseUrl, data.baseUrl) || !C7384Etj.areEqual(this.encoding, data.encoding) || !C7384Etj.areEqual(this.mimeType, data.mimeType) || !C7384Etj.areEqual(this.historyUrl, data.historyUrl)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.data;
            }
            if ((i & 2) != 0) {
                str2 = data.baseUrl;
            }
            if ((i & 4) != 0) {
                str3 = data.encoding;
            }
            if ((i & 8) != 0) {
                str4 = data.mimeType;
            }
            if ((i & 16) != 0) {
                str5 = data.historyUrl;
            }
            return data.copy(str, str2, str3, str4, str5);
        }

        public final String component1() {
            return this.data;
        }

        public final String component2() {
            return this.baseUrl;
        }

        public final String component3() {
            return this.encoding;
        }

        public final String component4() {
            return this.mimeType;
        }

        public final String component5() {
            return this.historyUrl;
        }

        public final String getBaseUrl() {
            return this.baseUrl;
        }

        public final String getData() {
            return this.data;
        }

        public final String getEncoding() {
            return this.encoding;
        }

        public final String getHistoryUrl() {
            return this.historyUrl;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0I(this.encoding, (AnonymousClass001.A0G(this.data) + AnonymousClass006.A0G(this.baseUrl)) * 31) + AnonymousClass006.A0G(this.mimeType)) * 31) + AnonymousClass005.A0H(this.historyUrl);
        }

        public Data(String str, String str2, String str3, String str4, String str5) {
            AnonymousClass003.A0v(str, str3);
            this.data = str;
            this.baseUrl = str2;
            this.encoding = str3;
            this.mimeType = str4;
            this.historyUrl = str5;
        }

        public final Data copy(String str, String str2, String str3, String str4, String str5) {
            AnonymousClass003.A0v(str, str3);
            return new Data(str, str2, str3, str4, str5);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Data(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "utf-8" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }

    public final class NavigatorOnly extends WebContent {
        public static final int $stable = 0;
        public static final NavigatorOnly INSTANCE = new NavigatorOnly();
    }

    public final class Post extends WebContent {
        public static final int $stable = 0;
        public final byte[] postData;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Post) {
                    Post post = (Post) obj;
                    if (!C7384Etj.areEqual(this.url, post.url) || !C7384Etj.areEqual(this.postData, post.postData)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Post copy$default(Post post, String str, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                str = post.url;
            }
            if ((i & 2) != 0) {
                bArr = post.postData;
            }
            AnonymousClass003.A0u(str, bArr);
            return new Post(str, bArr);
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

        public Post(String str, byte[] bArr) {
            AnonymousClass003.A0u(str, bArr);
            this.url = str;
            this.postData = bArr;
        }

        public final Post copy(String str, byte[] bArr) {
            AnonymousClass003.A0u(str, bArr);
            return new Post(str, bArr);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Url extends WebContent {
        public static final int $stable = 0;
        public final InterfaceC0962AJp<String, String> additionalHttpHeaders;
        public final String url;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Url) {
                    Url url = (Url) obj;
                    if (!C7384Etj.areEqual(this.url, url.url) || !C7384Etj.areEqual(this.additionalHttpHeaders, url.additionalHttpHeaders)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Url copy$default(Url url, String str, InterfaceC0962AJp interfaceC0962AJp, int i, Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            if ((i & 2) != 0) {
                interfaceC0962AJp = url.additionalHttpHeaders;
            }
            AnonymousClass003.A0u(str, interfaceC0962AJp);
            return new Url(str, interfaceC0962AJp);
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

        public Url(String str, InterfaceC0962AJp<String, String> interfaceC0962AJp) {
            AnonymousClass003.A0u(str, interfaceC0962AJp);
            this.url = str;
            this.additionalHttpHeaders = interfaceC0962AJp;
        }

        public final Url copy(String str, InterfaceC0962AJp<String, String> interfaceC0962AJp) {
            AnonymousClass003.A0u(str, interfaceC0962AJp);
            return new Url(str, interfaceC0962AJp);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Url(String str, InterfaceC0962AJp interfaceC0962AJp, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? C0953AJg.A00() : interfaceC0962AJp);
        }
    }

    public final String getCurrentUrl() {
        if (this instanceof Url) {
            return ((Url) this).url;
        }
        if (this instanceof AuthenticatedUrl) {
            return ((AuthenticatedUrl) this).url;
        }
        if (this instanceof Data) {
            return ((Data) this).baseUrl;
        }
        if (this instanceof Post) {
            return ((Post) this).url;
        }
        if (this instanceof NavigatorOnly) {
            throw C3cG.A0Q("Unsupported");
        }
        throw C3cG.A0q();
    }

    public /* synthetic */ WebContent(C06H c06h) {
    }

    public WebContent() {
    }
}
