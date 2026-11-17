package X;

import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes5.dex */
public final class CI0 extends CI1 {
    public final File A00;
    public final FileOutputStream A01;
    public final /* synthetic */ C3377CHy A02;

    /* JADX WARN: Illegal instructions before constructor call */
    public CI0(C4C c4c, C3377CHy c3377CHy, File file) {
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        this.A02 = c3377CHy;
        super(c4c, c3377CHy, fileOutputStreamA0I);
        this.A00 = file;
        this.A01 = fileOutputStreamA0I;
    }
}
