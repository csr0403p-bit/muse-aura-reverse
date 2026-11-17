package X;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: X.C3i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3207C3i extends C2x {
    public final ZipEntry A00;
    public final ZipFile A01;
    public final /* synthetic */ C3206C3h A02;

    public C3207C3i(C3206C3h c3206C3h) throws IOException {
        this.A02 = c3206C3h;
        ZipFile zipFile = new ZipFile(c3206C3h.A02.A02());
        try {
            this.A00 = zipFile.getEntry(c3206C3h.A00.A00(c3206C3h.A03));
            this.A01 = zipFile;
        } catch (Throwable th) {
            zipFile.close();
            throw th;
        }
    }
}
