package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInternalLinkActionCardKt$InternalLinkCardButton$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $cardType;
    public final /* synthetic */ B6A $contentColor;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInternalLinkActionCardKt$InternalLinkCardButton$3(String str, String str2, Function0<Unit> function0, BRg bRg, boolean z, String str3, B6A b6a, int i, int i2) {
        super(2);
        this.$cardType = str;
        this.$text = str2;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$enabled = z;
        this.$onClickLabel = str3;
        this.$contentColor = b6a;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInternalLinkActionCardKt.m628InternalLinkCardButtonPIknLig(this.$cardType, this.$text, this.$onClick, this.$modifier, this.$enabled, this.$onClickLabel, this.$contentColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
