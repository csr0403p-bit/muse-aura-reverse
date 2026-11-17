package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;

/* loaded from: classes3.dex */
public final class PDFContentViewKt$PdfPage$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Bitmap> $bitmap$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFContentViewKt$PdfPage$2$1(MutableState<Bitmap> mutableState) {
        super(1);
        this.$bitmap$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new PDFContentViewKt$PdfPage$2$1$invoke$$inlined$onDispose$1(this.$bitmap$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new PDFContentViewKt$PdfPage$2$1$invoke$$inlined$onDispose$1(this.$bitmap$delegate);
    }
}
