package com.facebook.aura.explore.view.cards;

import X.ARL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class IdeaCardPreviewImageKt$IdeaCardPreviewImage$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ ARL $contentScale;
    public final /* synthetic */ int $imageRetryNonce;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $previewImageUrl;
    public final /* synthetic */ B6A $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardPreviewImageKt$IdeaCardPreviewImage$3(String str, BRg bRg, int i, ARL arl, String str2, B6A b6a, int i2, int i3) {
        super(2);
        this.$previewImageUrl = str;
        this.$modifier = bRg;
        this.$imageRetryNonce = i;
        this.$contentScale = arl;
        this.$contentDescription = str2;
        this.$tint = b6a;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(this.$previewImageUrl, this.$modifier, this.$imageRetryNonce, this.$contentScale, this.$contentDescription, this.$tint, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
