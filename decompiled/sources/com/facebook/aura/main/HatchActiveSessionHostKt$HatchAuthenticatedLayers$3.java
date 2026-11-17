package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchAuthenticatedLayers$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
    public final /* synthetic */ HatchSidePanelDockState $dockState;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
    public final /* synthetic */ float $panelWidthPx;
    public final /* synthetic */ boolean $requireBlockingOverlay;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ long $shadowColor;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchActiveSessionHostKt$HatchAuthenticatedLayers$3(AbstractC3358CGz abstractC3358CGz, boolean z, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, long j, float f, HatchSidePanelDockState hatchSidePanelDockState, G0U<? super AbstractC3358CGz, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$session = abstractC3358CGz;
        this.$requireBlockingOverlay = z;
        this.$backStack = navBackStack;
        this.$navigator = auraNavigator;
        this.$sidePanelController = hatchSidePanelController;
        this.$shadowColor = j;
        this.$panelWidthPx = f;
        this.$dockState = hatchSidePanelDockState;
        this.$onInitialContentRendered = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchActiveSessionHostKt.m1336HatchAuthenticatedLayersYod850M(this.$session, this.$requireBlockingOverlay, this.$backStack, this.$navigator, this.$sidePanelController, this.$shadowColor, this.$panelWidthPx, this.$dockState, this.$onInitialContentRendered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
