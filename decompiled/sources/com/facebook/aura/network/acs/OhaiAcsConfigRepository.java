package com.facebook.aura.network.acs;

import X.A7u;
import X.HtJ;
import com.facebook.aura.network.acs.OhaiAcsConfigFetcher;

/* loaded from: classes4.dex */
public final class OhaiAcsConfigRepository {
    public static final OhaiAcsConfigRepository INSTANCE = new OhaiAcsConfigRepository();
    public static final OhaiAcsConfigFetcher fetcher = new OhaiAcsConfigFetcher(OhaiAcsConfigFetcher.AnonymousClass1.INSTANCE);
    public static final OhaiAcsConfigStore store = new OhaiAcsConfigStore();
    public static final OhaiAcsConfigCache delegate = new OhaiAcsConfigCache(new OhaiAcsConfigRepository$delegate$1(null), OhaiAcsConfigRepository$delegate$2.INSTANCE, OhaiAcsConfigRepository$delegate$3.INSTANCE, OhaiAcsConfigRepository$delegate$4.INSTANCE);

    public final Object getAcsServerConfig(String str, HtJ<? super A7u> htJ) {
        return delegate.getAcsServerConfig(str, htJ);
    }

    public final Object getConfig(String str, boolean z, HtJ<? super OhaiAcsConfig> htJ) {
        return delegate.getConfig(str, z, htJ);
    }
}
