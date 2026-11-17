package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class C13 extends FileOutputStream {
    public final /* synthetic */ File A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13(File file, File file2, String str) {
        super(file);
        this.A01 = file;
        this.A02 = str;
        this.A00 = file2;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int length;
        super.close();
        String str = String.format(Locale.US, "qpl_sampling_config_v2.%s", Arrays.copyOf(new Object[]{this.A02}, 1));
        File file = this.A01;
        File file2 = this.A00;
        if (!file.renameTo(C3cG.A0O(file2, str))) {
            throw BV4.A0K("Failed to rename file");
        }
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null || (length = fileArrListFiles.length) <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, C14.A01);
        int i = length - 5;
        for (int i2 = 0; i2 < i; i2++) {
            fileArrListFiles[i2].delete();
        }
    }
}
