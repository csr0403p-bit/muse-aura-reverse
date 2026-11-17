package com.facebook.aura.sharesheet;

import X.C7384Etj;
import X.G0U;
import com.facebook.aura.explore.view.cards.IdeaIcon;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeaShareAction {
    public static final int $stable = 0;
    public final boolean isPreparing;
    public final G0U<IdeaIcon, Unit> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeaShareAction(G0U<? super IdeaIcon, Unit> g0u, boolean z) {
        C7384Etj.A0Y(g0u, 0);
        this.onClick = g0u;
        this.isPreparing = z;
    }

    public final G0U<IdeaIcon, Unit> getOnClick() {
        return this.onClick;
    }

    public final boolean isPreparing() {
        return this.isPreparing;
    }
}
