package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass002;
import X.HxE;

/* loaded from: classes2.dex */
public final class AvatarRequest {
    public final String cacheKey;
    public final boolean isCommitted;
    public final long refresh;
    public final String url;
    public final HxE<String, String> vm;

    public AvatarRequest(String str, String str2, long j, HxE<String, String> hxE, boolean z) {
        AnonymousClass002.A1B(str2, 1, hxE);
        this.url = str;
        this.cacheKey = str2;
        this.refresh = j;
        this.vm = hxE;
        this.isCommitted = z;
    }

    public final String getCacheKey() {
        return this.cacheKey;
    }

    public final long getRefresh() {
        return this.refresh;
    }

    public final String getUrl() {
        return this.url;
    }

    public final HxE<String, String> getVm() {
        return this.vm;
    }

    public final boolean isCommitted() {
        return this.isCommitted;
    }
}
