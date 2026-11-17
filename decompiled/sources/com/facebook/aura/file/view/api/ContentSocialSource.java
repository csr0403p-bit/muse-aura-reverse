package com.facebook.aura.file.view.api;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentSocialSource extends C06G {
    public static final int $stable = 0;
    public final String author;
    public final Function0<Unit> onOpen;
    public final String sourceIconUrl;
    public final String sourceName;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContentSocialSource) {
                ContentSocialSource contentSocialSource = (ContentSocialSource) obj;
                if (!C7384Etj.areEqual(this.url, contentSocialSource.url) || !C7384Etj.areEqual(this.author, contentSocialSource.author) || !C7384Etj.areEqual(this.sourceName, contentSocialSource.sourceName) || !C7384Etj.areEqual(this.sourceIconUrl, contentSocialSource.sourceIconUrl) || !C7384Etj.areEqual(this.onOpen, contentSocialSource.onOpen)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentSocialSource copy$default(ContentSocialSource contentSocialSource, String str, String str2, String str3, String str4, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentSocialSource.url;
        }
        if ((i & 2) != 0) {
            str2 = contentSocialSource.author;
        }
        if ((i & 4) != 0) {
            str3 = contentSocialSource.sourceName;
        }
        if ((i & 8) != 0) {
            str4 = contentSocialSource.sourceIconUrl;
        }
        if ((i & 16) != 0) {
            function0 = contentSocialSource.onOpen;
        }
        return contentSocialSource.copy(str, str2, str3, str4, function0);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.author;
    }

    public final String component3() {
        return this.sourceName;
    }

    public final String component4() {
        return this.sourceIconUrl;
    }

    public final Function0<Unit> component5() {
        return this.onOpen;
    }

    public final ContentSocialSource copy(String str, String str2, String str3, String str4, Function0<Unit> function0) {
        return new ContentSocialSource(str, str2, str3, str4, function0);
    }

    public final String getAuthor() {
        return this.author;
    }

    public final boolean getHasAttribution() {
        return (this.author == null && this.sourceName == null && this.sourceIconUrl == null) ? false : true;
    }

    public final Function0<Unit> getOnOpen() {
        return this.onOpen;
    }

    public final String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    public final String getSourceName() {
        return this.sourceName;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0G(this.url) * 31) + AnonymousClass006.A0G(this.author)) * 31) + AnonymousClass006.A0G(this.sourceName)) * 31) + AnonymousClass006.A0G(this.sourceIconUrl)) * 31) + C06G.A04(this.onOpen);
    }

    public ContentSocialSource(String str, String str2, String str3, String str4, Function0<Unit> function0) {
        this.url = str;
        this.author = str2;
        this.sourceName = str3;
        this.sourceIconUrl = str4;
        this.onOpen = function0;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ContentSocialSource(String str, String str2, String str3, String str4, Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : function0);
    }

    public ContentSocialSource() {
        this(null, null, null, null, null);
    }
}
