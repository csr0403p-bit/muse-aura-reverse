package com.facebook.aura.file.view;

import X.C78g;
import java.io.File;

/* loaded from: classes3.dex */
public final class PptxViewerKt$PptxPresentation$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ File $file$inlined;

    public PptxViewerKt$PptxPresentation$1$1$invoke$$inlined$onDispose$1(File file) {
        this.$file$inlined = file;
    }

    @Override // X.C78g
    public void dispose() {
        StagedFileHandoff.INSTANCE.release(this.$file$inlined);
    }
}
