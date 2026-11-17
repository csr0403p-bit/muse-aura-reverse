package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0U;
import X.G0V;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchHeaderKt$HatchPageHeader$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ boolean $logBackClick;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $navigationContent;
    public final /* synthetic */ String $navigationContentDescription;
    public final /* synthetic */ int $navigationIcon;
    public final /* synthetic */ Function0<Unit> $onBackClick;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ boolean $showNavigationButton;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ long $subtitleColor;
    public final /* synthetic */ C1822Arm $subtitleStyle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ long $titleColor;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ int $titleOverflow;
    public final /* synthetic */ boolean $trackNavigationBounds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchHeaderKt$HatchPageHeader$4(String str, String str2, Function0<Unit> function0, BRg bRg, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z, int i, String str3, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z2, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, G0V<? super BFM, ? super Integer, Unit> g0v2, long j, long j2, C1822Arm c1822Arm, BRg bRg2, int i2, G0V<? super BFM, ? super Integer, Unit> g0v3, HatchBackClickAnalytics hatchBackClickAnalytics, boolean z3, int i3, int i4, int i5, int i6) {
        super(2);
        this.$title = str;
        this.$subtitle = str2;
        this.$onBackClick = function0;
        this.$modifier = bRg;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$showNavigationButton = z;
        this.$navigationIcon = i;
        this.$navigationContentDescription = str3;
        this.$navigationContent = g0v;
        this.$trackNavigationBounds = z2;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$headerActions = ahd2;
        this.$actions = g0v2;
        this.$titleColor = j;
        this.$subtitleColor = j2;
        this.$subtitleStyle = c1822Arm;
        this.$titleModifier = bRg2;
        this.$titleOverflow = i2;
        this.$centerContent = g0v3;
        this.$backClickAnalytics = hatchBackClickAnalytics;
        this.$logBackClick = z3;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$changed2 = i5;
        this.$$default = i6;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchHeaderKt.m994HatchPageHeaderOT94q8g(this.$title, this.$subtitle, this.$onBackClick, this.$modifier, this.$titleAlignment, this.$showNavigationButton, this.$navigationIcon, this.$navigationContentDescription, this.$navigationContent, this.$trackNavigationBounds, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$actions, this.$titleColor, this.$subtitleColor, this.$subtitleStyle, this.$titleModifier, this.$titleOverflow, this.$centerContent, this.$backClickAnalytics, this.$logBackClick, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
    }
}
