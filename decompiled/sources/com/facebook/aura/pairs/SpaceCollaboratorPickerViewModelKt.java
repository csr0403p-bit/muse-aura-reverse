package com.facebook.aura.pairs;

import X.AHD;

/* loaded from: classes3.dex */
public abstract class SpaceCollaboratorPickerViewModelKt {
    public static final int PICKER_MAX_SEARCH_LENGTH = 100;
    public static final int PICKER_MIN_SEARCH_LENGTH = 2;
    public static final long PICKER_SEARCH_DEBOUNCE_MS = 300;

    public static final SpacePickerUiState copyState(SpacePickerUiState spacePickerUiState, SpacePickerPhase spacePickerPhase, String str, AHD<SpacePickerPerson> ahd, AHD<SpacePickerPerson> ahd2, boolean z, AHD<SpacePickerPerson> ahd3, boolean z2, boolean z3, boolean z4) {
        return new SpacePickerUiState(spacePickerPhase, str, ahd, ahd2, z, ahd3, z2, z3, z4);
    }

    public static /* synthetic */ SpacePickerUiState copyState$default(SpacePickerUiState spacePickerUiState, SpacePickerPhase spacePickerPhase, String str, AHD ahd, AHD ahd2, boolean z, AHD ahd3, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        SpacePickerPhase spacePickerPhase2 = spacePickerPhase;
        String str2 = str;
        AHD ahd4 = ahd;
        AHD ahd5 = ahd2;
        boolean z5 = z;
        AHD ahd6 = ahd3;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        if ((i & 1) != 0) {
            spacePickerPhase2 = spacePickerUiState.phase;
        }
        if ((i & 2) != 0) {
            str2 = spacePickerUiState.query;
        }
        if ((i & 4) != 0) {
            ahd4 = spacePickerUiState.connections;
        }
        if ((i & 8) != 0) {
            ahd5 = spacePickerUiState.suggested;
        }
        if ((i & 16) != 0) {
            z5 = spacePickerUiState.suggestionsFailed;
        }
        if ((i & 32) != 0) {
            ahd6 = spacePickerUiState.selected;
        }
        if ((i & 64) != 0) {
            z6 = spacePickerUiState.atLimit;
        }
        if ((i & 128) != 0) {
            z7 = spacePickerUiState.inviting;
        }
        if ((i & 256) != 0) {
            z8 = spacePickerUiState.mintingLink;
        }
        return new SpacePickerUiState(spacePickerPhase2, str2, ahd4, ahd5, z5, ahd6, z6, z7, z8);
    }
}
