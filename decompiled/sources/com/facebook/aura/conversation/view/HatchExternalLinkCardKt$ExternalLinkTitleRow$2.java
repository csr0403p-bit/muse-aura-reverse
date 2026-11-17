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
public final class HatchExternalLinkCardKt$ExternalLinkTitleRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $host;
    public final /* synthetic */ B6A $hostColor;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $title;
    public final /* synthetic */ B6A $titleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchExternalLinkCardKt$ExternalLinkTitleRow$2(String str, String str2, boolean z, B6A b6a, B6A b6a2, BRg bRg, int i, int i2) {
        super(2);
        this.$host = str;
        this.$title = str2;
        this.$isLoading = z;
        this.$titleColor = b6a;
        this.$hostColor = b6a2;
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
        HatchExternalLinkCardKt.m593ExternalLinkTitleRowKs3TJJE(this.$host, this.$title, this.$isLoading, this.$titleColor, this.$hostColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
