package com.facebook.aura.pairs;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class PairsGuidanceUiState {
    public static final int $stable = 0;
    public final String draft;
    public final PairsGuidanceLoad load;
    public final PairsGuidanceSaveState save;

    public final String getDraft() {
        return this.draft;
    }

    public final PairsGuidanceLoad getLoad() {
        return this.load;
    }

    public final PairsGuidanceSaveState getSave() {
        return this.save;
    }

    public PairsGuidanceUiState(PairsGuidanceLoad pairsGuidanceLoad, String str, PairsGuidanceSaveState pairsGuidanceSaveState) {
        AnonymousClass003.A0v(pairsGuidanceLoad, pairsGuidanceSaveState);
        this.load = pairsGuidanceLoad;
        this.draft = str;
        this.save = pairsGuidanceSaveState;
    }
}
