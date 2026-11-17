package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConnectedScreen$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraButtonSize $chatButtonSize;
    public final /* synthetic */ String $chatButtonText;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentAfterStatus;
    public final /* synthetic */ BRg $contentModifier;
    public final /* synthetic */ String $disconnectDialogBody;
    public final /* synthetic */ String $disconnectDialogTitle;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $icon;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $needsAttention;
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ Function0<Unit> $onChatClick;
    public final /* synthetic */ Function0<Unit> $onDisconnect;
    public final /* synthetic */ Function0<Unit> $onDismissDisconnectDialog;
    public final /* synthetic */ Function0<Unit> $onShowDisconnectDialog;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ boolean $showDisconnectDialog;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSettingsScreensKt$ChannelConnectedScreen$4(HatchScreen hatchScreen, String str, String str2, AuraButtonSize auraButtonSize, boolean z, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BRg bRg2, float f, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, boolean z2, int i, int i2, int i3) {
        super(2);
        this.$screen = hatchScreen;
        this.$title = str;
        this.$chatButtonText = str2;
        this.$chatButtonSize = auraButtonSize;
        this.$showDisconnectDialog = z;
        this.$disconnectDialogTitle = str3;
        this.$disconnectDialogBody = str4;
        this.$onBack = function0;
        this.$onChatClick = function02;
        this.$onShowDisconnectDialog = function03;
        this.$onDismissDisconnectDialog = function04;
        this.$onDisconnect = function05;
        this.$icon = g0v;
        this.$modifier = bRg;
        this.$contentModifier = bRg2;
        this.$topSpacing = f;
        this.$contentAfterStatus = g0w;
        this.$needsAttention = z2;
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
        ChannelSettingsScreensKt.m1898ChannelConnectedScreenZSrRDQQ(this.$screen, this.$title, this.$chatButtonText, this.$chatButtonSize, this.$showDisconnectDialog, this.$disconnectDialogTitle, this.$disconnectDialogBody, this.$onBack, this.$onChatClick, this.$onShowDisconnectDialog, this.$onDismissDisconnectDialog, this.$onDisconnect, this.$icon, this.$modifier, this.$contentModifier, this.$topSpacing, this.$contentAfterStatus, this.$needsAttention, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
