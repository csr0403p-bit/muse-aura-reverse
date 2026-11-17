package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C8j2;

/* loaded from: classes6.dex */
public final class PageMetadata {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String contentType;
    public String title;
    public String url;
    public Viewport viewport;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageMetadata) {
                PageMetadata pageMetadata = (PageMetadata) obj;
                if (!C7384Etj.areEqual(this.url, pageMetadata.url) || !C7384Etj.areEqual(this.title, pageMetadata.title) || !C7384Etj.areEqual(this.viewport, pageMetadata.viewport) || !C7384Etj.areEqual(this.contentType, pageMetadata.contentType)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setTitle(String str) {
        C7384Etj.A0Y(str, 0);
        this.title = str;
    }

    public final void setUrl(String str) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageMetadata copy$default(PageMetadata pageMetadata, String str, String str2, Viewport viewport, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageMetadata.url;
        }
        if ((i & 2) != 0) {
            str2 = pageMetadata.title;
        }
        if ((i & 4) != 0) {
            viewport = pageMetadata.viewport;
        }
        if ((i & 8) != 0) {
            str3 = pageMetadata.contentType;
        }
        AnonymousClass003.A0u(str, str2);
        return new PageMetadata(str, str2, viewport, str3);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final Viewport component3() {
        return this.viewport;
    }

    public final String component4() {
        return this.contentType;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Viewport getViewport() {
        return this.viewport;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.url)) + AnonymousClass006.A0D(this.viewport)) * 31) + AnonymousClass005.A0H(this.contentType);
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }

    public String toString() {
        String str = this.url;
        String str2 = this.title;
        Viewport viewport = this.viewport;
        String str3 = this.contentType;
        StringBuilder sbA0x = C3cI.A0x("PageMetadata(url=", str);
        sbA0x.append(", title=");
        sbA0x.append(str2);
        sbA0x.append(", viewport=");
        sbA0x.append(viewport);
        return C3cJ.A0N(C8j2.A00(9), str3, sbA0x);
    }

    public PageMetadata(String str, String str2, Viewport viewport, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.title = str2;
        this.viewport = viewport;
        this.contentType = str3;
    }

    public final PageMetadata copy(String str, String str2, Viewport viewport, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new PageMetadata(str, str2, viewport, str3);
    }
}
