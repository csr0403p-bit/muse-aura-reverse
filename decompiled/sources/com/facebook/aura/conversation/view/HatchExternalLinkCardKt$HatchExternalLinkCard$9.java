package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchExternalLinkCardKt$HatchExternalLinkCard$9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ B6A $hostColor;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ Function0<Unit> $onOpen;
    public final /* synthetic */ B6A $titleColor;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExternalLinkCardKt$HatchExternalLinkCard$9(String str, BRg bRg, long j, B6A b6a, B6A b6a2, C1D3 c1d3, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$url = str;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$titleColor = b6a;
        this.$hostColor = b6a2;
        this.$containerShape = c1d3;
        this.$onDismiss = function0;
        this.$onOpen = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchExternalLinkCardKt.m594HatchExternalLinkCardy8DT0do(this.$url, this.$modifier, this.$backgroundColor, this.$titleColor, this.$hostColor, this.$containerShape, this.$onDismiss, this.$onOpen, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
