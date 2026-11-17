package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PptxViewerKt$PptxPresentation$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ File $file;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PptxViewerKt$PptxPresentation$3(File file, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$file = file;
        this.$contentBottomPadding = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        PptxViewerKt.m924PptxPresentationuFdPcIQ(this.$file, this.$contentBottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
