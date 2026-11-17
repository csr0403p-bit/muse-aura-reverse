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
public final class DocxWebViewerKt$DocxWebContent$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $contentBottomPadding;
    public final /* synthetic */ File $file;
    public final /* synthetic */ BRg $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocxWebViewerKt$DocxWebContent$1(File file, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$file = file;
        this.$modifier = bRg;
        this.$contentBottomPadding = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        DocxWebViewerKt.m887DocxWebContent6a0pyJM(this.$file, this.$modifier, this.$contentBottomPadding, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
