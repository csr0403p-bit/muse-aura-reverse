package com.facebook.aura.shopping.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.C1BN;
import X.C3Es;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;

/* loaded from: classes4.dex */
public final class ShoppingResultsCardViewModel extends AEs {
    public static final int $stable = 8;
    public final ShoppingResultsCardInputs inputs;
    public final C1BN<ShoppingResultsCardDisplayState> uiState;

    public final class Factory extends AuraViewModelFactory<ShoppingResultsCardViewModel> {
        public static final int $stable = 8;
        public final ShoppingResultsCardInputs inputs;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ShoppingResultsCardViewModel create() {
            return new ShoppingResultsCardViewModel(HatchProductDetailsRepository.Companion.getInstance(this.userSession), this.inputs);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, ShoppingResultsCardInputs shoppingResultsCardInputs) {
            AnonymousClass003.A0u(abstractC3358CGz, shoppingResultsCardInputs);
            this.userSession = abstractC3358CGz;
            this.inputs = shoppingResultsCardInputs;
        }
    }

    public final C1BN<ShoppingResultsCardDisplayState> getUiState() {
        return this.uiState;
    }

    public ShoppingResultsCardViewModel(HatchProductDetailsRepository hatchProductDetailsRepository, ShoppingResultsCardInputs shoppingResultsCardInputs) {
        AnonymousClass003.A0u(hatchProductDetailsRepository, shoppingResultsCardInputs);
        this.inputs = shoppingResultsCardInputs;
        ShoppingResultsCardViewModel$special$$inlined$map$1 shoppingResultsCardViewModel$special$$inlined$map$1 = new ShoppingResultsCardViewModel$special$$inlined$map$1(hatchProductDetailsRepository.couponPrices, this);
        this.uiState = AnonymousClass441.A00(ShoppingResultsCardViewModelKt.displayState(shoppingResultsCardInputs, hatchProductDetailsRepository.couponPrices.getValue()), AEu.A00(this), shoppingResultsCardViewModel$special$$inlined$map$1, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
    }
}
