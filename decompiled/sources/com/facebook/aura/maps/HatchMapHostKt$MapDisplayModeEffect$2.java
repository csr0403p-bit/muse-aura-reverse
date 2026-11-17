package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.C1BO;
import X.C1DG;
import X.G0V;
import com.meta.maps.display.SDKInsets;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapHostKt$MapDisplayModeEffect$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ SDKInsets $cameraInsets;
    public final /* synthetic */ float $carouselSectionFloor;
    public final /* synthetic */ HatchMapDisplayMode $displayMode;
    public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
    public final /* synthetic */ C1BO<C1DG> $measuredCarouselSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapHostKt$MapDisplayModeEffect$2(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, HatchMapDisplayMode hatchMapDisplayMode, SDKInsets sDKInsets, float f, C1BO<C1DG> c1bo, int i) {
        super(2);
        this.$flow = hatchMapAgenticSceneFlow;
        this.$displayMode = hatchMapDisplayMode;
        this.$cameraInsets = sDKInsets;
        this.$carouselSectionFloor = f;
        this.$measuredCarouselSection = c1bo;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        HatchMapHostKt.m1352MapDisplayModeEffectjt2gSs(this.$flow, this.$displayMode, this.$cameraInsets, this.$carouselSectionFloor, this.$measuredCarouselSection, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
