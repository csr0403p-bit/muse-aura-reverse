package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HtmlWebViewLoadedContent extends C06G {
    public final String baseUrl;
    public final String html;
    public final String sourcePath;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HtmlWebViewLoadedContent) {
                HtmlWebViewLoadedContent htmlWebViewLoadedContent = (HtmlWebViewLoadedContent) obj;
                if (!C7384Etj.areEqual(this.html, htmlWebViewLoadedContent.html) || !C7384Etj.areEqual(this.baseUrl, htmlWebViewLoadedContent.baseUrl) || !C7384Etj.areEqual(this.sourcePath, htmlWebViewLoadedContent.sourcePath)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HtmlWebViewLoadedContent copy$default(HtmlWebViewLoadedContent htmlWebViewLoadedContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = htmlWebViewLoadedContent.html;
        }
        if ((i & 2) != 0) {
            str2 = htmlWebViewLoadedContent.baseUrl;
        }
        if ((i & 4) != 0) {
            str3 = htmlWebViewLoadedContent.sourcePath;
        }
        return htmlWebViewLoadedContent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.html;
    }

    public final String component2() {
        return this.baseUrl;
    }

    public final String component3() {
        return this.sourcePath;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.baseUrl, AnonymousClass001.A0G(this.html)) + AnonymousClass006.A0G(this.sourcePath);
    }

    public HtmlWebViewLoadedContent(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.html = str;
        this.baseUrl = str2;
        this.sourcePath = str3;
    }

    public final HtmlWebViewLoadedContent copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new HtmlWebViewLoadedContent(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
