package com.facebook.aura.main;

import X.AOW;
import X.AT5;
import X.AXN;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C1BO;
import X.C1Cd;
import X.C1DG;
import X.G0W;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $canProvideAvatar;
    public final /* synthetic */ C1DG $compactSpaceAvatarSize;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ AT5<Float, AOW> $hostAlpha;
    public final /* synthetic */ C1BO<Boolean> $isExpanded$delegate;
    public final /* synthetic */ int $parkedOffsetPx;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ C1BO<String> $pillSessionId$delegate;
    public final /* synthetic */ boolean $pillVisible;
    public final /* synthetic */ boolean $reportsPillBottom;
    public final /* synthetic */ C1BO<Float> $revealAlpha;
    public final /* synthetic */ C1BO<Float> $sidePanelAlpha$delegate;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ boolean $sidePanelHidesPill;
    public final /* synthetic */ C1BO<AuraNavKey> $topNonOverlay$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4(boolean z, HatchStatusPillMetrics hatchStatusPillMetrics, AXN axn, boolean z2, HatchSidePanelController hatchSidePanelController, int i, AT5<Float, AOW> at5, C1BO<Float> c1bo, C1BO<Float> c1bo2, C1DG c1dg, boolean z3, boolean z4, C1BO<Boolean> c1bo3, C1BO<? extends AuraNavKey> c1bo4, C1BO<String> c1bo5) {
        super(3);
        this.$reportsPillBottom = z;
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$density = axn;
        this.$pillVisible = z2;
        this.$sidePanelController = hatchSidePanelController;
        this.$parkedOffsetPx = i;
        this.$hostAlpha = at5;
        this.$sidePanelAlpha$delegate = c1bo;
        this.$revealAlpha = c1bo2;
        this.$compactSpaceAvatarSize = c1dg;
        this.$sidePanelHidesPill = z3;
        this.$canProvideAvatar = z4;
        this.$isExpanded$delegate = c1bo3;
        this.$topNonOverlay$delegate = c1bo4;
        this.$pillSessionId$delegate = c1bo5;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.C1Cd r30, X.BFM r31, int r32) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4.invoke(X.1Cd, X.BFM, int):void");
    }
}
