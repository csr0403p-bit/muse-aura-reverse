package com.facebook.aura.file.view;

import X.C78g;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;

/* loaded from: classes3.dex */
public final class PDFContentViewKt$PdfPage$2$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ MutableState $bitmap$delegate$inlined;

    public PDFContentViewKt$PdfPage$2$1$invoke$$inlined$onDispose$1(MutableState mutableState) {
        this.$bitmap$delegate$inlined = mutableState;
    }

    @Override // X.C78g
    public void dispose() {
        Bitmap bitmap = (Bitmap) this.$bitmap$delegate$inlined.getValue();
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.$bitmap$delegate$inlined.Af8(null);
    }
}
