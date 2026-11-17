package com.facebook.aura.productactions.lightbox;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.C1BN;
import X.C3Es;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.shopping.model.ShoppingDisplayPrices;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;

/* loaded from: classes4.dex */
public final class FeaturedProductLightboxViewModel extends AEs {
    public static final int $stable = 8;
    public final FeaturedProductLightboxInputs inputs;
    public final C1BN<ShoppingDisplayPrices> uiState;

    public final class Factory extends AuraViewModelFactory<FeaturedProductLightboxViewModel> {
        public static final int $stable = 8;
        public final FeaturedProductLightboxInputs inputs;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FeaturedProductLightboxViewModel create() {
            return new FeaturedProductLightboxViewModel(HatchProductDetailsRepository.Companion.getInstance(this.userSession), this.inputs);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, FeaturedProductLightboxInputs featuredProductLightboxInputs) {
            AnonymousClass003.A0u(abstractC3358CGz, featuredProductLightboxInputs);
            this.userSession = abstractC3358CGz;
            this.inputs = featuredProductLightboxInputs;
        }
    }

    public final C1BN<ShoppingDisplayPrices> getUiState() {
        return this.uiState;
    }

    public FeaturedProductLightboxViewModel(HatchProductDetailsRepository hatchProductDetailsRepository, FeaturedProductLightboxInputs featuredProductLightboxInputs) {
        AnonymousClass003.A0u(hatchProductDetailsRepository, featuredProductLightboxInputs);
        this.inputs = featuredProductLightboxInputs;
        FeaturedProductLightboxViewModel$special$$inlined$map$1 featuredProductLightboxViewModel$special$$inlined$map$1 = new FeaturedProductLightboxViewModel$special$$inlined$map$1(hatchProductDetailsRepository.couponPrices, this);
        this.uiState = AnonymousClass441.A00(FeaturedProductLightboxViewModelKt.displayPrices(featuredProductLightboxInputs, hatchProductDetailsRepository.couponPrices.getValue()), AEu.A00(this), featuredProductLightboxViewModel$special$$inlined$map$1, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
    }
}
