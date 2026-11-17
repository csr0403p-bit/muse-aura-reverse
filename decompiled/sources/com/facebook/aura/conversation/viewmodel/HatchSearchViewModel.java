package com.facebook.aura.conversation.viewmodel;

import X.AEs;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C1BN;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.repo.HatchSearchRepository;
import com.facebook.aura.conversation.repo.HatchSearchScrollAnchor;
import com.facebook.aura.conversation.repo.HatchSearchUiState;

/* loaded from: classes.dex */
public final class HatchSearchViewModel extends AEs {
    public static final int $stable = 8;
    public final HatchSearchRepository repository;
    public final C1BN<HatchSearchUiState> uiState;

    public final class Factory extends AuraViewModelFactory<HatchSearchViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchSearchViewModel create() {
            return new HatchSearchViewModel(HatchSearchRepository.Companion.getInstance(this.userSession));
        }
    }

    public HatchSearchViewModel(HatchSearchRepository hatchSearchRepository) {
        C7384Etj.A0Y(hatchSearchRepository, 0);
        this.repository = hatchSearchRepository;
        this.uiState = hatchSearchRepository.uiState;
    }

    public final void recordScrollAnchor(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.repository.recordScrollAnchor(str, i, i2);
    }

    public final void searchMessages(String str) {
        C7384Etj.A0Y(str, 0);
        this.repository.searchMessages(str);
    }

    public final void clearSearch() {
        this.repository.clearSearch();
    }

    public final C1BN<HatchSearchUiState> getUiState() {
        return this.uiState;
    }

    public final void loadMoreSearchResults() {
        this.repository.loadMoreSearchResults();
    }

    public final HatchSearchScrollAnchor scrollAnchorFor(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return this.repository.scrollAnchorFor(str, str2);
    }
}
