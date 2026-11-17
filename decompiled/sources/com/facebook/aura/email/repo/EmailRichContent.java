package com.facebook.aura.email.repo;

import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class EmailRichContent {
    public final String fallback;
    public final String html;
    public final String preamble;

    public EmailRichContent(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.html = str;
        this.preamble = str2;
        this.fallback = str3;
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPreamble() {
        return this.preamble;
    }

    public /* synthetic */ EmailRichContent(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
