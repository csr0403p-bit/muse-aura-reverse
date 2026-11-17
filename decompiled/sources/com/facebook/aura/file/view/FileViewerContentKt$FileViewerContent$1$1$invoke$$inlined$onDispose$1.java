package com.facebook.aura.file.view;

import X.C78g;
import com.facebook.aura.file.view.ExternalFileSource;
import java.io.File;

/* loaded from: classes.dex */
public final class FileViewerContentKt$FileViewerContent$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ ExternalFileSource $externalSource$inlined;

    public FileViewerContentKt$FileViewerContent$1$1$invoke$$inlined$onDispose$1(ExternalFileSource externalFileSource) {
        this.$externalSource$inlined = externalFileSource;
    }

    @Override // X.C78g
    public void dispose() {
        ExternalFileSource.Staged staged;
        File file;
        ExternalFileSource externalFileSource = this.$externalSource$inlined;
        if (!(externalFileSource instanceof ExternalFileSource.Staged) || (staged = (ExternalFileSource.Staged) externalFileSource) == null || (file = staged.file) == null) {
            return;
        }
        StagedFileHandoff.INSTANCE.release(file);
    }
}
