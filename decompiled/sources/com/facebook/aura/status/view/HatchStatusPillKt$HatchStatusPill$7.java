package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.G0V;
import X.InterfaceC05151eP;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchStatusPillKt$HatchStatusPill$7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $applyStatusBarPadding;
    public final /* synthetic */ String $avatarContentDescription;
    public final /* synthetic */ boolean $canReportAvatarBounds;
    public final /* synthetic */ C1DG $compactAvatarSize;
    public final /* synthetic */ C1DG $compactAvatarTop;
    public final /* synthetic */ boolean $consumeAvatarDragGestures;
    public final /* synthetic */ boolean $isConversationSurface;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ boolean $isHostVisible;
    public final /* synthetic */ AuraThemeMode $modeOverride;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onPillContentClicked;
    public final /* synthetic */ String $subthreadSessionId;
    public final /* synthetic */ boolean $suppressAvatar;
    public final /* synthetic */ InterfaceC05151eP $this_HatchStatusPill;
    public final /* synthetic */ boolean $wrapContent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusPillKt$HatchStatusPill$7(InterfaceC05151eP interfaceC05151eP, BRg bRg, Function0<Unit> function0, boolean z, AuraThemeMode auraThemeMode, boolean z2, boolean z3, String str, boolean z4, String str2, boolean z5, boolean z6, boolean z7, C1DG c1dg, boolean z8, C1DG c1dg2, int i, int i2, int i3) {
        super(2);
        this.$this_HatchStatusPill = interfaceC05151eP;
        this.$modifier = bRg;
        this.$onPillContentClicked = function0;
        this.$applyStatusBarPadding = z;
        this.$modeOverride = auraThemeMode;
        this.$isExpanded = z2;
        this.$isConversationSurface = z3;
        this.$subthreadSessionId = str;
        this.$isHostVisible = z4;
        this.$avatarContentDescription = str2;
        this.$consumeAvatarDragGestures = z5;
        this.$suppressAvatar = z6;
        this.$canReportAvatarBounds = z7;
        this.$compactAvatarSize = c1dg;
        this.$wrapContent = z8;
        this.$compactAvatarTop = c1dg2;
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
        HatchStatusPillKt.m2233HatchStatusPillrBjAxNU(this.$this_HatchStatusPill, this.$modifier, this.$onPillContentClicked, this.$applyStatusBarPadding, this.$modeOverride, this.$isExpanded, this.$isConversationSurface, this.$subthreadSessionId, this.$isHostVisible, this.$avatarContentDescription, this.$consumeAvatarDragGestures, this.$suppressAvatar, this.$canReportAvatarBounds, this.$compactAvatarSize, this.$wrapContent, this.$compactAvatarTop, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
