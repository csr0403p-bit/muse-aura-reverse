package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTabScreenKt$HatchTabScreenLayout$2$1$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HeaderButton $badgedHeaderButton;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ float $contentTopSpacing;
    public final /* synthetic */ ScrimConfig $effectiveScrim;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $handleLeadingButtonClick;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ boolean $isTitleCompact;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ boolean $leadingButtonEnabled;
    public final /* synthetic */ boolean $leadingButtonRotating;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $pageHeaderActions;
    public final /* synthetic */ float $scrimProgress;
    public final /* synthetic */ boolean $showStatusPill;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ HatchHeaderTitleAlignment $titleAlignment;
    public final /* synthetic */ float $titleAlpha;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ B6A $trailingButtonTint;
    public final /* synthetic */ boolean $usePageHeader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabScreenKt$HatchTabScreenLayout$2$1$2(boolean z, ScrimConfig scrimConfig, float f, float f2, String str, HeaderLeadingButton headerLeadingButton, G0U<? super HeaderLeadingButton, Unit> g0u, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u2, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, AHD<HeaderAction> ahd2, HeaderButton headerButton, boolean z2, boolean z3, float f3, boolean z4, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, String str2, B6A b6a, boolean z5, G0V<? super BFM, ? super Integer, Unit> g0v2) {
        super(2);
        this.$usePageHeader = z;
        this.$effectiveScrim = scrimConfig;
        this.$contentTopSpacing = f;
        this.$scrimProgress = f2;
        this.$title = str;
        this.$leadingButton = headerLeadingButton;
        this.$handleLeadingButtonClick = g0u;
        this.$headerButtons = ahd;
        this.$onHeaderButtonClick = g0u2;
        this.$pageHeaderActions = g0v;
        this.$titleModifier = bRg;
        this.$headerActions = ahd2;
        this.$badgedHeaderButton = headerButton;
        this.$leadingButtonEnabled = z2;
        this.$leadingButtonRotating = z3;
        this.$titleAlpha = f3;
        this.$isTitleCompact = z4;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$subtitle = str2;
        this.$trailingButtonTint = b6a;
        this.$showStatusPill = z5;
        this.$centerContent = g0v2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r50, int r51) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchTabScreenKt$HatchTabScreenLayout$2$1$2.invoke(X.BFM, int):void");
    }
}
