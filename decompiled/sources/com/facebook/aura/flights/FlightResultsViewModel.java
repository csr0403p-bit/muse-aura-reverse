package com.facebook.aura.flights;

import X.AEs;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;

/* loaded from: classes2.dex */
public final class FlightResultsViewModel extends AEs {
    public static final int $stable = 8;
    public final FlightResultsRepository repository;
    public final FlightResults results;

    public final class Factory extends AuraViewModelFactory<FlightResultsViewModel> {
        public static final int $stable = 8;
        public final String presentationId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FlightResultsViewModel create() {
            return new FlightResultsViewModel(FlightResultsRepository.Companion.getInstance(this.userSession), this.presentationId);
        }

        public Factory(String str, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(str, abstractC3358CGz);
            this.presentationId = str;
            this.userSession = abstractC3358CGz;
        }
    }

    public final void onSeeAllClicked(FlightResults flightResults) {
        C7384Etj.A0Y(flightResults, 0);
        this.repository.put(flightResults);
    }

    public final FlightResults getResults() {
        return this.results;
    }

    public FlightResultsViewModel(FlightResultsRepository flightResultsRepository, String str) {
        AnonymousClass003.A0u(flightResultsRepository, str);
        this.repository = flightResultsRepository;
        this.results = flightResultsRepository.get(str);
    }
}
