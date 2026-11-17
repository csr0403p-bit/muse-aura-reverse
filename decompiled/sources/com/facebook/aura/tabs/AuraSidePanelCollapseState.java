package com.facebook.aura.tabs;

import X.AFs;
import X.AGE;
import X.AGF;
import X.AbstractC0871AFr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes.dex */
public final class AuraSidePanelCollapseState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final AFs<AuraSidePanelCollapseState, Object> Saver = AbstractC0871AFr.A00(AuraSidePanelCollapseState$Companion$Saver$2.INSTANCE, AuraSidePanelCollapseState$Companion$Saver$1.INSTANCE);
    public final MutableState sideChatsCollapsed$delegate;
    public final MutableState spacesCollapsed$delegate;
    public final MutableState tabsCollapsed$delegate;

    public final class Companion {
        public final AFs<AuraSidePanelCollapseState, Object> getSaver() {
            return AuraSidePanelCollapseState.Saver;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final boolean getSideChatsCollapsed() {
        return MutableState.A0A(this.sideChatsCollapsed$delegate);
    }

    public final boolean getSpacesCollapsed() {
        return MutableState.A0A(this.spacesCollapsed$delegate);
    }

    public final boolean getTabsCollapsed() {
        return MutableState.A0A(this.tabsCollapsed$delegate);
    }

    public final void setSideChatsCollapsed(boolean z) {
        MutableState.A09(z, this.sideChatsCollapsed$delegate);
    }

    public final void setSpacesCollapsed(boolean z) {
        MutableState.A09(z, this.spacesCollapsed$delegate);
    }

    public final void setTabsCollapsed(boolean z) {
        MutableState.A09(z, this.tabsCollapsed$delegate);
    }

    public AuraSidePanelCollapseState(boolean z, boolean z2, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z);
        AGE ageA01 = AGF.A01();
        this.tabsCollapsed$delegate = new ParcelableSnapshotMutableState(ageA01, boolValueOf);
        this.spacesCollapsed$delegate = new ParcelableSnapshotMutableState(ageA01, Boolean.valueOf(z2));
        this.sideChatsCollapsed$delegate = new ParcelableSnapshotMutableState(ageA01, Boolean.valueOf(z3));
    }

    public /* synthetic */ AuraSidePanelCollapseState(boolean z, boolean z2, boolean z3, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3));
    }

    public AuraSidePanelCollapseState() {
        this(false, false, false);
    }
}
