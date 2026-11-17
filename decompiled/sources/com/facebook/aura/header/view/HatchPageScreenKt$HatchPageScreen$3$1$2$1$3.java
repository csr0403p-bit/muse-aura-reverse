package com.facebook.aura.header.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPageScreenKt$HatchPageScreen$3$1$2$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ G0V<BFM, Integer, Unit> $actions;
    public final /* synthetic */ HatchBackClickAnalytics $backClickAnalytics;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ boolean $closesModalFlow;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ BRg $headerModifier;
    public final /* synthetic */ boolean $logBackClick;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPageScreenKt$HatchPageScreen$3$1$2$1$3(boolean z, int i, String str, String str2, String str3, Function0<Unit> function0, BRg bRg, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z2, G0V<? super BFM, ? super Integer, Unit> g0v, AHD<? extends HeaderButton> ahd, G0U<? super HeaderButton, Unit> g0u, AHD<HeaderAction> ahd2, G0V<? super BFM, ? super Integer, Unit> g0v2, long j, long j2, C1822Arm c1822Arm, BRg bRg2, int i2, G0V<? super BFM, ? super Integer, Unit> g0v3, HatchBackClickAnalytics hatchBackClickAnalytics, boolean z3) {
        super(2);
        this.$closesModalFlow = z;
        this.$navigationIcon = i;
        this.$navigationContentDescription = str;
        this.$title = str2;
        this.$subtitle = str3;
        this.$onBackClick = function0;
        this.$headerModifier = bRg;
        this.$titleAlignment = hatchHeaderTitleAlignment;
        this.$showNavigationButton = z2;
        this.$navigationContent = g0v;
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
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        int i2;
        String strA0e;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            if (this.$closesModalFlow) {
                i2 = R.drawable.x_wght400_outline_24;
                bfm.AgE(64344113);
                strA0e = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f1206ed);
            } else {
                i2 = this.$navigationIcon;
                AnonymousClass003.A0l(bfm, 64346463);
                strA0e = this.$navigationContentDescription;
            }
            int i3 = i2;
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(this.$title, this.$subtitle, this.$onBackClick, this.$headerModifier, this.$titleAlignment, this.$showNavigationButton, i3, strA0e, this.$navigationContent, false, this.$headerButtons, this.$onHeaderButtonClick, this.$headerActions, this.$actions, this.$titleColor, this.$subtitleColor, this.$subtitleStyle, this.$titleModifier, this.$titleOverflow, this.$centerContent, this.$backClickAnalytics, this.$logBackClick, bfm, 0, 0, HatchBackClickAnalytics.$stable, 512);
            return;
        }
        bfm.Afo();
    }
}
