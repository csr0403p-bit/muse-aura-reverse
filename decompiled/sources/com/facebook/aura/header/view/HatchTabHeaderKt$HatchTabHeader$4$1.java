package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C1DG;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Object $chromeOwner;
    public final /* synthetic */ Object $currentChromeOwner;
    public final /* synthetic */ Object $currentHeaderRowOwner;
    public final /* synthetic */ boolean $hasTrailingButtons;
    public final /* synthetic */ C1BO<Boolean> $isLiveSessionActive$delegate;
    public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
    public final /* synthetic */ C1DG $publishedChromeCenterY;
    public final /* synthetic */ float $publishedChromeWidth;
    public final /* synthetic */ C1DG $publishedHeaderRowBottom;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTabHeaderKt$HatchTabHeader$4$1(Object obj, HatchStatusPillMetrics hatchStatusPillMetrics, Object obj2, C1DG c1dg, Object obj3, boolean z, float f, C1DG c1dg2, C1BO<Boolean> c1bo) {
        super(0);
        this.$currentHeaderRowOwner = obj;
        this.$pillMetrics = hatchStatusPillMetrics;
        this.$chromeOwner = obj2;
        this.$publishedHeaderRowBottom = c1dg;
        this.$currentChromeOwner = obj3;
        this.$hasTrailingButtons = z;
        this.$publishedChromeWidth = f;
        this.$publishedChromeCenterY = c1dg2;
        this.$isLiveSessionActive$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchStatusPillMetrics hatchStatusPillMetrics;
        C1DG c1dg;
        if (this.$currentHeaderRowOwner == null) {
            this.$pillMetrics.setHeaderRowOwner(this.$chromeOwner);
        }
        if (this.$pillMetrics.headerRowOwner$delegate.getValue() == this.$chromeOwner) {
            this.$pillMetrics.m1007setHeaderRowBottomYLDhkOg(this.$publishedHeaderRowBottom);
        }
        if (this.$currentChromeOwner != this.$chromeOwner || this.$hasTrailingButtons || C1BO.A0F(this.$isLiveSessionActive$delegate)) {
            if (this.$currentChromeOwner == null && (this.$hasTrailingButtons || C1BO.A0F(this.$isLiveSessionActive$delegate))) {
                this.$pillMetrics.setTrailingChromeOwner(this.$chromeOwner);
            }
            if (this.$pillMetrics.trailingChromeOwner$delegate.getValue() != this.$chromeOwner) {
                return;
            }
            this.$pillMetrics.m1011setTrailingChromeWidth0680j_4(this.$publishedChromeWidth);
            hatchStatusPillMetrics = this.$pillMetrics;
            c1dg = this.$publishedChromeCenterY;
        } else {
            c1dg = null;
            this.$pillMetrics.setTrailingChromeOwner(null);
            this.$pillMetrics.m1011setTrailingChromeWidth0680j_4(0.0f);
            hatchStatusPillMetrics = this.$pillMetrics;
        }
        hatchStatusPillMetrics.m1010setTrailingChromeCenterYYLDhkOg(c1dg);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
