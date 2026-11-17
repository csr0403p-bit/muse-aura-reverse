package com.facebook.aura.pairs;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class SpacePickerUiState {
    public static final int $stable;
    public final boolean atLimit;
    public final AHD<SpacePickerPerson> connections;
    public final boolean inviting;
    public final boolean mintingLink;
    public final SpacePickerPhase phase;
    public final String query;
    public final AHD<SpacePickerPerson> selected;
    public final AHD<SpacePickerPerson> suggested;
    public final boolean suggestionsFailed;

    public final boolean isSelected(SpacePickerPerson spacePickerPerson) {
        C7384Etj.A0Y(spacePickerPerson, 0);
        AHD<SpacePickerPerson> ahd = this.selected;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(((SpacePickerPerson) it.next()).id, spacePickerPerson.id)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        int i = PairsSuggestion.$stable;
        int i2 = PairsContact.$stable;
        $stable = i | i2 | i | i2 | i | i2;
    }

    public final boolean getAtLimit() {
        return this.atLimit;
    }

    public final AHD<SpacePickerPerson> getConnections() {
        return this.connections;
    }

    public final boolean getHasNoMatches() {
        return this.phase == SpacePickerPhase.READY && !C7BY.A0j(this.query) && this.connections.isEmpty() && this.suggested.isEmpty();
    }

    public final boolean getInviting() {
        return this.inviting;
    }

    public final boolean getMintingLink() {
        return this.mintingLink;
    }

    public final SpacePickerPhase getPhase() {
        return this.phase;
    }

    public final String getQuery() {
        return this.query;
    }

    public final AHD<SpacePickerPerson> getSelected() {
        return this.selected;
    }

    public final AHD<SpacePickerPerson> getSuggested() {
        return this.suggested;
    }

    public final boolean getSuggestionsFailed() {
        return this.suggestionsFailed;
    }

    public SpacePickerUiState(SpacePickerPhase spacePickerPhase, String str, AHD<SpacePickerPerson> ahd, AHD<SpacePickerPerson> ahd2, boolean z, AHD<SpacePickerPerson> ahd3, boolean z2, boolean z3, boolean z4) {
        AnonymousClass005.A14(spacePickerPhase, str, ahd, ahd2);
        C7384Etj.A0Y(ahd3, 5);
        this.phase = spacePickerPhase;
        this.query = str;
        this.connections = ahd;
        this.suggested = ahd2;
        this.suggestionsFailed = z;
        this.selected = ahd3;
        this.atLimit = z2;
        this.inviting = z3;
        this.mintingLink = z4;
    }

    public /* synthetic */ SpacePickerUiState(SpacePickerPhase spacePickerPhase, String str, AHD ahd, AHD ahd2, boolean z, AHD ahd3, boolean z2, boolean z3, boolean z4, int i, C06H c06h) {
        this((i & 1) != 0 ? SpacePickerPhase.LOADING : spacePickerPhase, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? AHI.A01 : ahd, (i & 8) != 0 ? AHI.A01 : ahd2, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? AHI.A01 : ahd3, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, C3cG.A1K(i & 256, z4));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public SpacePickerUiState() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, z, z, z, 511, 0 == true ? 1 : 0);
    }
}
