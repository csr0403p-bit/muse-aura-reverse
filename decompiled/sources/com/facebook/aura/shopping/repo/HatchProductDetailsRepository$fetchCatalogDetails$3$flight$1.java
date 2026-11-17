package com.facebook.aura.shopping.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.ProductDetailsFetchResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.repo.HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1", f = "HatchProductDetailsRepository.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1 extends AbstractC07127nr implements G0U<HtJ<? super ProductDetailsFetchResult>, Object> {
    public final /* synthetic */ HatchProductDetailsRepository.CatalogDetailsKey $key;
    public int label;
    public final /* synthetic */ HatchProductDetailsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1(HatchProductDetailsRepository hatchProductDetailsRepository, HatchProductDetailsRepository.CatalogDetailsKey catalogDetailsKey, HtJ<? super HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchProductDetailsRepository;
        this.$key = catalogDetailsKey;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1(this.this$0, this.$key, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ProductDetailsPresentation productDetailsPresentationCachedCatalogDetails = this.this$0.cachedCatalogDetails(this.$key);
            if (productDetailsPresentationCachedCatalogDetails != null) {
                return new ProductDetailsFetchResult.Success(productDetailsPresentationCachedCatalogDetails);
            }
            HatchProductDetailsRepository hatchProductDetailsRepository = this.this$0;
            HatchProductDetailsRepository.CatalogDetailsKey catalogDetailsKey = this.$key;
            this.label = 1;
            obj = hatchProductDetailsRepository.fetchCatalogDetailsUncached(catalogDetailsKey, C3cG.A1J(2, false), this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super ProductDetailsFetchResult> htJ) {
        return ((HatchProductDetailsRepository$fetchCatalogDetails$3$flight$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
