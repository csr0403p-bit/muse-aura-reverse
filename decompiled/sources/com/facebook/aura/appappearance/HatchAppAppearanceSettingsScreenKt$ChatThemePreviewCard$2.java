package com.facebook.aura.appappearance;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAppAppearanceSettingsScreenKt$ChatThemePreviewCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $agentBubble;
    public final /* synthetic */ AuraDrawableSource $avatarSource;
    public final /* synthetic */ long $background;
    public final /* synthetic */ long $borderColor;
    public final /* synthetic */ String $botName;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $userBubble;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAppAppearanceSettingsScreenKt$ChatThemePreviewCard$2(long j, long j2, long j3, long j4, AuraDrawableSource auraDrawableSource, String str, BRg bRg, int i, int i2) {
        super(2);
        this.$background = j;
        this.$userBubble = j2;
        this.$agentBubble = j3;
        this.$borderColor = j4;
        this.$avatarSource = auraDrawableSource;
        this.$botName = str;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchAppAppearanceSettingsScreenKt.m236ChatThemePreviewCardm5XamvU(this.$background, this.$userBubble, this.$agentBubble, this.$borderColor, this.$avatarSource, this.$botName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
