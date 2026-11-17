package com.facebook.aura.file.view;

import X.C60O;
import X.C78g;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class PDFContentViewKt$PDFContent$4$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ PdfRendererHolder $rendererHolder$inlined;

    public PDFContentViewKt$PDFContent$4$1$invoke$$inlined$onDispose$1(PdfRendererHolder pdfRendererHolder) {
        this.$rendererHolder$inlined = pdfRendererHolder;
    }

    @Override // X.C78g
    public void dispose() {
        ExecutorService executorServiceA1D = C60O.A1D();
        final PdfRendererHolder pdfRendererHolder = this.$rendererHolder$inlined;
        executorServiceA1D.execute(new Runnable() { // from class: com.facebook.aura.file.view.PDFContentViewKt$PDFContent$4$1$1$1
            @Override // java.lang.Runnable
            public final void run() {
                pdfRendererHolder.close();
            }
        });
    }
}
