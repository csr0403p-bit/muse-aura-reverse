package com.facebook.aura.vds.toolbar;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTitleBarKt$TitleBarIcon$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraIconButtonStyle $buttonStyle;
    public final /* synthetic */ IconBadgeLocation $iconBadgeLocation;
    public final /* synthetic */ int $iconDrawableId;
    public final /* synthetic */ String $iconLabel;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onIconClick;
    public final /* synthetic */ Function0<Unit> $onIconLongClick;
    public final /* synthetic */ boolean $showBadge;
    public final /* synthetic */ boolean $showShadow;
    public final /* synthetic */ boolean $sideBarRedesignEnabled;
    public final /* synthetic */ Function0<B6A> $titleBarIconBackground;
    public final /* synthetic */ boolean $useUpdatedStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTitleBarKt$TitleBarIcon$5(Function0<Unit> function0, int i, BRg bRg, Function0<Unit> function02, String str, boolean z, IconBadgeLocation iconBadgeLocation, Function0<B6A> function03, long j, boolean z2, boolean z3, AuraIconButtonStyle auraIconButtonStyle, boolean z4, int i2, int i3, int i4) {
        super(2);
        this.$onIconClick = function0;
        this.$iconDrawableId = i;
        this.$modifier = bRg;
        this.$onIconLongClick = function02;
        this.$iconLabel = str;
        this.$showBadge = z;
        this.$iconBadgeLocation = iconBadgeLocation;
        this.$titleBarIconBackground = function03;
        this.$iconTint = j;
        this.$showShadow = z2;
        this.$useUpdatedStyle = z3;
        this.$buttonStyle = auraIconButtonStyle;
        this.$sideBarRedesignEnabled = z4;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraTitleBarKt.m3121TitleBarIconzILrveg(this.$onIconClick, this.$iconDrawableId, this.$modifier, this.$onIconLongClick, this.$iconLabel, this.$showBadge, this.$iconBadgeLocation, this.$titleBarIconBackground, this.$iconTint, this.$showShadow, this.$useUpdatedStyle, this.$buttonStyle, this.$sideBarRedesignEnabled, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
