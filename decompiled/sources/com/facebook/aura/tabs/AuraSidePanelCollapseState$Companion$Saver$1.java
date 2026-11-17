package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C1bi;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraSidePanelCollapseState$Companion$Saver$1 extends AbstractC7559F3s implements G0V<C1bi, AuraSidePanelCollapseState, List<? extends Boolean>> {
    public static final AuraSidePanelCollapseState$Companion$Saver$1 INSTANCE = new AuraSidePanelCollapseState$Companion$Saver$1();

    public AuraSidePanelCollapseState$Companion$Saver$1() {
        super(2);
    }

    @Override // X.G0V
    public final List<Boolean> invoke(C1bi c1bi, AuraSidePanelCollapseState auraSidePanelCollapseState) {
        C7384Etj.A0Y(auraSidePanelCollapseState, 1);
        return Arrays.asList(Boolean.valueOf(MutableState.A0A(auraSidePanelCollapseState.tabsCollapsed$delegate)), Boolean.valueOf(MutableState.A0A(auraSidePanelCollapseState.spacesCollapsed$delegate)), Boolean.valueOf(MutableState.A0A(auraSidePanelCollapseState.sideChatsCollapsed$delegate)));
    }
}
