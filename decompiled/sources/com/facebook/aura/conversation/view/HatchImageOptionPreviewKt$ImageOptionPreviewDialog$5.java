package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $aspectRatio;
    public final /* synthetic */ boolean $canShare;
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ long $dimColor;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ G0U<ImageOptionPreviewExit, Unit> $onClosed;
    public final /* synthetic */ AaC $sourceBounds;
    public final /* synthetic */ float $sourceDim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$5(String str, String str2, AaC aaC, float f, long j, float f2, boolean z, G0U<? super ImageOptionPreviewExit, Unit> g0u, int i) {
        super(2);
        this.$imageUri = str;
        this.$contentDescription = str2;
        this.$sourceBounds = aaC;
        this.$sourceDim = f;
        this.$dimColor = j;
        this.$aspectRatio = f2;
        this.$canShare = z;
        this.$onClosed = g0u;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchImageOptionPreviewKt.m610ImageOptionPreviewDialog3f6hBDE(this.$imageUri, this.$contentDescription, this.$sourceBounds, this.$sourceDim, this.$dimColor, this.$aspectRatio, this.$canShare, this.$onClosed, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
