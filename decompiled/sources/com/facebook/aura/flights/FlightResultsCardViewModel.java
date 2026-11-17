package com.facebook.aura.flights;

import X.AEs;
import X.AbstractC3358CGz;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;

/* loaded from: classes2.dex */
public final class FlightResultsCardViewModel extends AEs {
    public static final int $stable = 8;
    public final FlightResultsRepository repository;

    public final class Factory extends AuraViewModelFactory<FlightResultsCardViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FlightResultsCardViewModel create() {
            return new FlightResultsCardViewModel(FlightResultsRepository.Companion.getInstance(this.userSession));
        }
    }

    public FlightResultsCardViewModel(FlightResultsRepository flightResultsRepository) {
        C7384Etj.A0Y(flightResultsRepository, 0);
        this.repository = flightResultsRepository;
    }

    public final void openOffer(FlightResults flightResults) {
        C7384Etj.A0Y(flightResults, 0);
        this.repository.put(flightResults);
    }
}
