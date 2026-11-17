package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import java.util.List;

/* loaded from: classes.dex */
public final class AuraSidePanelCollapseState$Companion$Saver$2 extends AbstractC7559F3s implements G0U<List<? extends Boolean>, AuraSidePanelCollapseState> {
    public static final AuraSidePanelCollapseState$Companion$Saver$2 INSTANCE = new AuraSidePanelCollapseState$Companion$Saver$2();

    public AuraSidePanelCollapseState$Companion$Saver$2() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AuraSidePanelCollapseState invoke2(List<Boolean> list) {
        C7384Etj.A0Y(list, 0);
        int i = AuraSidePanelCollapseState.$stable;
        return new AuraSidePanelCollapseState(AnonymousClass001.A1X(list.get(0)), AnonymousClass001.A1X(list.get(1)), AnonymousClass001.A1X(list.get(2)));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ AuraSidePanelCollapseState invoke(List<? extends Boolean> list) {
        return invoke2((List<Boolean>) list);
    }
}
