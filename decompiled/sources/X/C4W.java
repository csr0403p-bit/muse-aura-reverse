package X;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes5.dex */
public final /* synthetic */ class C4W implements FileFilter {
    public static final /* synthetic */ C4W A00 = new C4W();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}
