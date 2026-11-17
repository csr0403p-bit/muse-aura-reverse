package com.facebook.aura.network.transport;

import X.AnonymousClass005;
import java.io.File;

/* loaded from: classes5.dex */
public final class HatchMultipartFilePart {
    public final String contentType;
    public final File file;
    public final String filename;
    public final String name;

    public HatchMultipartFilePart(String str, String str2, String str3, File file) {
        AnonymousClass005.A11(str, str3, file, 0);
        this.name = str;
        this.filename = str2;
        this.contentType = str3;
        this.file = file;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getName() {
        return this.name;
    }
}
