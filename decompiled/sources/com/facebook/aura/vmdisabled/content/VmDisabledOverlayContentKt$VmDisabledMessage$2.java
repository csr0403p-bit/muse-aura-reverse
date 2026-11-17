package com.facebook.aura.vmdisabled.content;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class VmDisabledOverlayContentKt$VmDisabledMessage$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $body;
    public final /* synthetic */ float $logoSize;
    public final /* synthetic */ float $logoToTitleSpacing;
    public final /* synthetic */ float $logoTopOffset;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VmDisabledOverlayContentKt$VmDisabledMessage$2(String str, float f, float f2, float f3, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$title = str;
        this.$logoTopOffset = f;
        this.$logoSize = f2;
        this.$logoToTitleSpacing = f3;
        this.$modifier = bRg;
        this.$body = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        VmDisabledOverlayContentKt.m3145VmDisabledMessageKLGhzwk(this.$title, this.$logoTopOffset, this.$logoSize, this.$logoToTitleSpacing, this.$modifier, this.$body, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
