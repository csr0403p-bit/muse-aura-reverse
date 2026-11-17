package com.facebook.aura.opengraph;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;

/* loaded from: classes5.dex */
public final class HatchOpenGraphRepository$cache$1 extends AbstractC7559F3s implements G0V<String, HatchOpenGraphRepository.CacheEntry, Long> {
    public static final HatchOpenGraphRepository$cache$1 INSTANCE = new HatchOpenGraphRepository$cache$1();

    public HatchOpenGraphRepository$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(String str, HatchOpenGraphRepository.CacheEntry cacheEntry) {
        AnonymousClass003.A0u(str, cacheEntry);
        return Long.valueOf((str.length() + HatchWebPageMetadataKt.approximateSizeChars(cacheEntry.metadata)) * 2);
    }
}
