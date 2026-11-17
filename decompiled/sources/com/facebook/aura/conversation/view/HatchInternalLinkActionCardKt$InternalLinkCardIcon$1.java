package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInternalLinkActionCardKt$InternalLinkCardIcon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $fallbackIconRes;
    public final /* synthetic */ B6A $fallbackTint;
    public final /* synthetic */ String $iconUrl;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInternalLinkActionCardKt$InternalLinkCardIcon$1(String str, int i, BRg bRg, B6A b6a, int i2, int i3) {
        super(2);
        this.$iconUrl = str;
        this.$fallbackIconRes = i;
        this.$modifier = bRg;
        this.$fallbackTint = b6a;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInternalLinkActionCardKt.m630InternalLinkCardIconxqIIw2o(this.$iconUrl, this.$fallbackIconRes, this.$modifier, this.$fallbackTint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
