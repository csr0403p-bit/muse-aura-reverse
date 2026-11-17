package com.facebook.aura.file.view;

import X.C78g;
import com.facebook.aura.file.view.ExternalFileSource;
import com.facebook.aura.file.view.FileContentType;
import java.io.File;

/* loaded from: classes.dex */
public final class FileViewerContentKt$FileViewerContent$2$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ FileContentType $contentType$inlined;

    public FileViewerContentKt$FileViewerContent$2$1$invoke$$inlined$onDispose$1(FileContentType fileContentType) {
        this.$contentType$inlined = fileContentType;
    }

    @Override // X.C78g
    public void dispose() {
        ExternalFileSource.Staged staged;
        File file;
        ExternalFileSource externalFileSource = ((FileContentType.ExternalPreview) this.$contentType$inlined).source;
        if (!(externalFileSource instanceof ExternalFileSource.Staged) || (staged = (ExternalFileSource.Staged) externalFileSource) == null || (file = staged.file) == null) {
            return;
        }
        StagedFileHandoff.INSTANCE.release(file);
    }
}
