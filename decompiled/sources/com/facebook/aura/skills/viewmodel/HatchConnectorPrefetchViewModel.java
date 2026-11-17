package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;

/* loaded from: classes.dex */
public final class HatchConnectorPrefetchViewModel extends AEs {
    public final HatchConnectorCatalogRepository repository;

    public final class Factory extends AuraViewModelFactory<HatchConnectorPrefetchViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new HatchConnectorPrefetchViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchConnectorPrefetchViewModel create() {
            return new HatchConnectorPrefetchViewModel(this.userSession);
        }
    }

    public HatchConnectorPrefetchViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.repository = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
    }

    public final void onScreenEntered() {
        this.repository.prefetchHomepage();
    }
}
