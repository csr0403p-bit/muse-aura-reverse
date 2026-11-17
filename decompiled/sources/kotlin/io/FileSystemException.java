package kotlin.io;

import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C60O;
import X.FGI;
import com.facebook.acra.util.JavaProcFileReader;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FileSystemException extends IOException {
    public final File file;
    public final File other;
    public final String reason;

    /* JADX WARN: Illegal instructions before constructor call */
    public FileSystemException(File file, File file2, String str) {
        StringBuilder sbA0x = C60O.A0x(file.toString());
        if (file2 != null) {
            sbA0x.append(AnonymousClass007.A0a(JavaProcFileReader.LS_SYMLINK_ARROW, file2));
        }
        super(AnonymousClass001.A0v(FGI.A0M(": ", str), sbA0x));
        this.file = file;
        this.other = file2;
        this.reason = str;
    }
}
