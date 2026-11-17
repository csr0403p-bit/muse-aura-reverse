package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BL4;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$ProgressiveViewerImage$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $containerSize;
    public final /* synthetic */ boolean $cropToBounds;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ Float $initialAspectRatio;
    public final /* synthetic */ boolean $isLowRamDevice;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ BL4 $previewDecodeSize;
    public final /* synthetic */ String $previewUri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ProgressiveViewerImage$2(String str, String str2, BL4 bl4, long j, boolean z, boolean z2, BRg bRg, Float f, int i, int i2) {
        super(2);
        this.$imageUri = str;
        this.$previewUri = str2;
        this.$previewDecodeSize = bl4;
        this.$containerSize = j;
        this.$isLowRamDevice = z;
        this.$cropToBounds = z2;
        this.$modifier = bRg;
        this.$initialAspectRatio = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        MediaViewerContentKt.m906ProgressiveViewerImage7RoMKGQ(this.$imageUri, this.$previewUri, this.$previewDecodeSize, this.$containerSize, this.$isLowRamDevice, this.$cropToBounds, this.$modifier, this.$initialAspectRatio, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
