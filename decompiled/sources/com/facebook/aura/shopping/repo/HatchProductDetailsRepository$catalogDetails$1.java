package com.facebook.aura.shopping.repo;

import X.AbstractC7559F3s;
import android.util.LruCache;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository$catalogDetails$1 extends AbstractC7559F3s implements Function0<LruCache<HatchProductDetailsRepository.CatalogDetailsKey, HatchProductDetailsRepository.CatalogDetailsEntry>> {
    public static final HatchProductDetailsRepository$catalogDetails$1 INSTANCE = new HatchProductDetailsRepository$catalogDetails$1();

    public HatchProductDetailsRepository$catalogDetails$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LruCache<HatchProductDetailsRepository.CatalogDetailsKey, HatchProductDetailsRepository.CatalogDetailsEntry> invoke() {
        return new LruCache<>(64);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LruCache<HatchProductDetailsRepository.CatalogDetailsKey, HatchProductDetailsRepository.CatalogDetailsEntry> invoke() {
        return new LruCache<>(64);
    }
}
