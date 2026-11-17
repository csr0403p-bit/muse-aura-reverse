package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1Cd;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HeaderButtonKt$HatchHeaderButtonRow$2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ HeaderButton $badgedButton;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ G0U<HeaderAction, Unit> $onHeaderActionClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ OnScreenState $row;
    public final /* synthetic */ boolean $showButtons;
    public final /* synthetic */ B6A $singleButtonTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HeaderButtonKt$HatchHeaderButtonRow$2(AHD<? extends HeaderButton> ahd, boolean z, AHD<HeaderAction> ahd2, G0U<? super HeaderButton, Unit> g0u, G0U<? super HeaderAction, Unit> g0u2, B6A b6a, HeaderButton headerButton, OnScreenState onScreenState) {
        super(3);
        this.$headerButtons = ahd;
        this.$showButtons = z;
        this.$headerActions = ahd2;
        this.$onHeaderButtonClick = g0u;
        this.$onHeaderActionClick = g0u2;
        this.$singleButtonTint = b6a;
        this.$badgedButton = headerButton;
        this.$row = onScreenState;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        BRg bRgTrackFloatingChromeObstacle;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            AHD<HeaderButton> ahd = this.$headerButtons;
            boolean z = this.$showButtons;
            AHD<HeaderAction> ahd2 = this.$headerActions;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onHeaderButtonClick, bfm.A66(z));
            boolean z2 = this.$showButtons;
            G0U<HeaderButton, Unit> g0u = this.$onHeaderButtonClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HeaderButtonKt$HatchHeaderButtonRow$2$1$1(z2, g0u);
                bfm.Ai0(objAaT);
            }
            G0U g0u2 = (G0U) objAaT;
            G0U<HeaderAction, Unit> g0u3 = this.$onHeaderActionClick;
            boolean zA65 = bfm.A65(g0u3) | bfm.A66(this.$showButtons);
            boolean z3 = this.$showButtons;
            G0U<HeaderAction, Unit> g0u4 = this.$onHeaderActionClick;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HeaderButtonKt$HatchHeaderButtonRow$2$2$1(z3, g0u4);
                bfm.Ai0(objAaT2);
            }
            G0U g0u5 = (G0U) objAaT2;
            B6A b6a = this.$singleButtonTint;
            HeaderButton headerButton = this.$badgedButton;
            OnScreenState onScreenState = this.$row;
            if (this.$showButtons) {
                AHD<HeaderAction> ahd3 = this.$headerActions;
                if (!(ahd3 instanceof Collection) || !ahd3.isEmpty()) {
                    Iterator it = ahd3.iterator();
                    while (it.hasNext()) {
                        if (!((HeaderAction) it.next()).tracksChromeObstacle) {
                            AnonymousClass003.A0l(bfm, 245319225);
                            bRgTrackFloatingChromeObstacle = BRg.A00;
                            break;
                        }
                    }
                }
                bfm.AgE(245246747);
                bRgTrackFloatingChromeObstacle = HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(BRg.A00, false, bfm, 6, 1);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, 245319225);
                bRgTrackFloatingChromeObstacle = BRg.A00;
                break;
            }
            HeaderButtonKt.m1028HeaderIconButtonsIqSmMA(ahd, z, ahd2, g0u2, g0u5, b6a, headerButton, onScreenState, bRgTrackFloatingChromeObstacle, bfm, 0, 0);
            return;
        }
        bfm.Afo();
    }
}
