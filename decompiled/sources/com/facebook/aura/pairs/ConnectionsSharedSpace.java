package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionsSharedSpace {
    public static final int $stable = 0;
    public final String iconUrl;
    public final int memberCount;
    public final String name;
    public final String slug;

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public /* synthetic */ ConnectionsSharedSpace(String str, int i, String str2, String str3, int i2, C06H c06h) {
        this(str, i, str2, AnonymousClass006.A0u(i2, str3));
    }

    public ConnectionsSharedSpace(String str, int i, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
        this.memberCount = i;
        this.slug = str2;
        this.iconUrl = str3;
    }
}
