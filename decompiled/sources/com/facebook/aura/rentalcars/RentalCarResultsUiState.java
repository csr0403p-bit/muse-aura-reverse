package com.facebook.aura.rentalcars;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class RentalCarResultsUiState extends C06G {
    public static final int $stable = 8;
    public final RentalCarResultsHeader header;
    public final RentalCarResults results;

    public RentalCarResultsUiState(RentalCarResults rentalCarResults, RentalCarResultsHeader rentalCarResultsHeader) {
        C7384Etj.A0Y(rentalCarResults, 0);
        this.results = rentalCarResults;
        this.header = rentalCarResultsHeader;
    }

    public final RentalCarResultsUiState copy(RentalCarResults rentalCarResults, RentalCarResultsHeader rentalCarResultsHeader) {
        C7384Etj.A0Y(rentalCarResults, 0);
        return new RentalCarResultsUiState(rentalCarResults, rentalCarResultsHeader);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RentalCarResultsUiState) {
                RentalCarResultsUiState rentalCarResultsUiState = (RentalCarResultsUiState) obj;
                if (!C7384Etj.areEqual(this.results, rentalCarResultsUiState.results) || !C7384Etj.areEqual(this.header, rentalCarResultsUiState.header)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RentalCarResultsUiState copy$default(RentalCarResultsUiState rentalCarResultsUiState, RentalCarResults rentalCarResults, RentalCarResultsHeader rentalCarResultsHeader, int i, Object obj) {
        if ((i & 1) != 0) {
            rentalCarResults = rentalCarResultsUiState.results;
        }
        if ((i & 2) != 0) {
            rentalCarResultsHeader = rentalCarResultsUiState.header;
        }
        C7384Etj.A0Y(rentalCarResults, 0);
        return new RentalCarResultsUiState(rentalCarResults, rentalCarResultsHeader);
    }

    public final RentalCarResults component1() {
        return this.results;
    }

    public final RentalCarResultsHeader component2() {
        return this.header;
    }

    public final RentalCarResultsHeader getHeader() {
        return this.header;
    }

    public final RentalCarResults getResults() {
        return this.results;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.results) + AnonymousClass006.A0D(this.header);
    }

    public String toString() {
        return super.toString();
    }
}
