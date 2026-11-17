package com.facebook.aura.spaces.model;

import X.AEs;
import X.AEu;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass441;
import X.BLG;
import X.C0943AIw;
import X.C1BN;
import X.C3Ek;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9286GCn;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;

/* loaded from: classes.dex */
public final class AuraNavBarViewModel extends AEs {
    public final BLG<Boolean> _isExpanded;
    public final PinnedItemsRepository pinnedItemsRepository;
    public final C1BN<NavBarUiState> uiState;

    public final class Factory extends AuraViewModelFactory<AuraNavBarViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraNavBarViewModel create() {
            return new AuraNavBarViewModel(PinnedItemsRepository.Companion.getInstance(this.userSession));
        }
    }

    public AuraNavBarViewModel(PinnedItemsRepository pinnedItemsRepository) {
        C7384Etj.A0Y(pinnedItemsRepository, 0);
        this.pinnedItemsRepository = pinnedItemsRepository;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isExpanded = c9286GCnA0v;
        C60I c60iA03 = C3rb.A03(new AuraNavBarViewModel$uiState$1(null), c9286GCnA0v, pinnedItemsRepository.pinnedItemIds);
        this.uiState = AnonymousClass441.A00(new NavBarUiState(false, C0943AIw.A03), AEu.A00(this), c60iA03, C3Ek.A00);
    }

    public final void pinItem(String str) {
        C7384Etj.A0Y(str, 0);
        this.pinnedItemsRepository.pin(str);
    }

    public final void unpinItem(String str) {
        C7384Etj.A0Y(str, 0);
        this.pinnedItemsRepository.unpin(str);
    }

    public final void collapse() {
        AnonymousClass004.A1D(false, this._isExpanded);
    }

    public final C1BN<NavBarUiState> getUiState() {
        return this.uiState;
    }
}
