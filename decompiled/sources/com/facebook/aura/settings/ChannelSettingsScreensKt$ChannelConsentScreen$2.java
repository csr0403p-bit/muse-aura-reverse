package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.G0V;
import X.G0W;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChannelSettingsScreensKt$ChannelConsentScreen$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AuraButtonSize $connectButtonSize;
    public final /* synthetic */ String $connectButtonText;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentAfterDescription;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentBeforeConnectButton;
    public final /* synthetic */ BRg $contentModifier;
    public final /* synthetic */ String $description;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $icon;
    public final /* synthetic */ boolean $isConnecting;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onBack;
    public final /* synthetic */ Function0<Unit> $onConnect;
    public final /* synthetic */ String $title;
    public final /* synthetic */ float $topSpacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelSettingsScreensKt$ChannelConsentScreen$2(String str, String str2, String str3, boolean z, Function0<Unit> function0, Function0<Unit> function02, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BRg bRg2, boolean z2, float f, AuraButtonSize auraButtonSize, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, int i, int i2, int i3) {
        super(2);
        this.$title = str;
        this.$description = str2;
        this.$connectButtonText = str3;
        this.$isConnecting = z;
        this.$onBack = function0;
        this.$onConnect = function02;
        this.$icon = g0v;
        this.$modifier = bRg;
        this.$contentModifier = bRg2;
        this.$isLoading = z2;
        this.$topSpacing = f;
        this.$connectButtonSize = auraButtonSize;
        this.$contentAfterDescription = g0w;
        this.$contentBeforeConnectButton = g0w2;
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
        ChannelSettingsScreensKt.m1899ChannelConsentScreenWsuR4So(this.$title, this.$description, this.$connectButtonText, this.$isConnecting, this.$onBack, this.$onConnect, this.$icon, this.$modifier, this.$contentModifier, this.$isLoading, this.$topSpacing, this.$connectButtonSize, this.$contentAfterDescription, this.$contentBeforeConnectButton, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
