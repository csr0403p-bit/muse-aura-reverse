package com.facebook.aura.vds.compose.toast;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraToastContentKt$AuraToastContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Integer $leadingIcon;
    public final /* synthetic */ AuraIconSize $leadingIconSize;
    public final /* synthetic */ B6A $leadingIconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ AuraToastOption $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraToastContentKt$AuraToastContent$2(String str, BRg bRg, String str2, Integer num, Function0<Unit> function0, AuraToastOption auraToastOption, AuraIconSize auraIconSize, B6A b6a, int i, int i2) {
        super(2);
        this.$title = str;
        this.$modifier = bRg;
        this.$subtitle = str2;
        this.$leadingIcon = num;
        this.$onClick = function0;
        this.$type = auraToastOption;
        this.$leadingIconSize = auraIconSize;
        this.$leadingIconTint = b6a;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraToastContentKt.m3084AuraToastContentAAXhOkM(this.$title, this.$modifier, this.$subtitle, this.$leadingIcon, this.$onClick, this.$type, this.$leadingIconSize, this.$leadingIconTint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
