package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImageGrid$6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AHD<HatchInlineImageData> $images;
    public final /* synthetic */ boolean $isLongPressShareTarget;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onImageClick;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ String $sharedElementKeyPrefix;
    public final /* synthetic */ float $singleImageSize;
    public final /* synthetic */ float $verticalPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineImageGrid$6(AHD<HatchInlineImageData> ahd, BRg bRg, float f, float f2, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, String str, boolean z, int i, int i2) {
        super(2);
        this.$images = ahd;
        this.$modifier = bRg;
        this.$singleImageSize = f;
        this.$verticalPadding = f2;
        this.$onImageClick = g0v;
        this.$onImageError = g0u;
        this.$sharedElementKeyPrefix = str;
        this.$isLongPressShareTarget = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchInlineImageKt.m677HatchInlineImageGridtw_glAc(this.$images, this.$modifier, this.$singleImageSize, this.$verticalPadding, this.$onImageClick, this.$onImageError, this.$sharedElementKeyPrefix, this.$isLongPressShareTarget, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
