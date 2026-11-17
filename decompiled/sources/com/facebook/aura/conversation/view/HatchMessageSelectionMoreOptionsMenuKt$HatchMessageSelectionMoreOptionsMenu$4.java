package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BLU;
import X.BRg;
import X.C1DG;
import X.G0U;
import X.G0V;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuVerticalBand;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ C1DG $maxHeight;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onCopy;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onDownload;
    public final /* synthetic */ G0U<BLU, Unit> $onMenuBoundsPositioned;
    public final /* synthetic */ Function0<Unit> $onReply;
    public final /* synthetic */ Function0<Unit> $onSelect;
    public final /* synthetic */ Function0<Unit> $onShare;
    public final /* synthetic */ Function0<Unit> $onUnsend;
    public final /* synthetic */ Function0<Unit> $onViewSources;
    public final /* synthetic */ AHD<AuraContextMenuVerticalBand> $verticalBands;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageSelectionMoreOptionsMenuKt$HatchMessageSelectionMoreOptionsMenu$4(HatchMessageUiModel hatchMessageUiModel, boolean z, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, AHD<AuraContextMenuVerticalBand> ahd, C1DG c1dg, G0U<? super BLU, Unit> g0u, int i, int i2, int i3) {
        super(2);
        this.$message = hatchMessageUiModel;
        this.$expanded = z;
        this.$onDismiss = function0;
        this.$modifier = bRg;
        this.$onReply = function02;
        this.$onCopy = function03;
        this.$onShare = function04;
        this.$onDownload = function05;
        this.$onSelect = function06;
        this.$onViewSources = function07;
        this.$onUnsend = function08;
        this.$verticalBands = ahd;
        this.$maxHeight = c1dg;
        this.$onMenuBoundsPositioned = g0u;
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
        HatchMessageSelectionMoreOptionsMenuKt.m657HatchMessageSelectionMoreOptionsMenuYzniZNo(this.$message, this.$expanded, this.$onDismiss, this.$modifier, this.$onReply, this.$onCopy, this.$onShare, this.$onDownload, this.$onSelect, this.$onViewSources, this.$onUnsend, this.$verticalBands, this.$maxHeight, this.$onMenuBoundsPositioned, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
