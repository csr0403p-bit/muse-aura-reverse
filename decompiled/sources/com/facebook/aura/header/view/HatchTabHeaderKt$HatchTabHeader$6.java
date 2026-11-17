package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ HeaderButton $badgedHeaderButton;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ boolean $isTitleCompact;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ boolean $leadingButtonEnabled;
    public final /* synthetic */ boolean $leadingButtonRotating;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;
    public final /* synthetic */ ScrimConfig $scrim;
    public final /* synthetic */ float $scrimProgress;
    public final /* synthetic */ boolean $showStatusPill;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ float $titleAlpha;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ B6A $trailingButtonTint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabHeaderKt$HatchTabHeader$6(BRg bRg, String str, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, HeaderButton headerButton, HeaderLeadingButton headerLeadingButton, boolean z, boolean z2, G0U<? super HeaderLeadingButton, Unit> g0u2, ScrimConfig scrimConfig, float f, BRg bRg2, float f2, boolean z3, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, String str2, B6A b6a, boolean z4, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2, int i3) {
        super(2);
        this.$modifier = bRg;
        this.$title = str;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u;
        this.$headerActions = ahd2;
        this.$badgedHeaderButton = headerButton;
        this.$leadingButton = headerLeadingButton;
        this.$leadingButtonEnabled = z;
        this.$leadingButtonRotating = z2;
        this.$onLeadingButtonClick = g0u2;
        this.$scrim = scrimConfig;
        this.$scrimProgress = f;
        this.$titleModifier = bRg2;
        this.$titleAlpha = f2;
        this.$isTitleCompact = z3;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$subtitle = str2;
        this.$trailingButtonTint = b6a;
        this.$showStatusPill = z4;
        this.$centerContent = g0v;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchTabHeaderKt.m1019HatchTabHeadermLtqdTI(this.$modifier, this.$title, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$badgedHeaderButton, this.$leadingButton, this.$leadingButtonEnabled, this.$leadingButtonRotating, this.$onLeadingButtonClick, this.$scrim, this.$scrimProgress, this.$titleModifier, this.$titleAlpha, this.$isTitleCompact, this.$titleAlignment, this.$subtitle, this.$trailingButtonTint, this.$showStatusPill, this.$centerContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
