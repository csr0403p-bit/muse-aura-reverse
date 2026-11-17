package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* renamed from: X.C3d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3203C3d extends FilterInputStream {
    public final /* synthetic */ C3296CCo A00;
    public final /* synthetic */ ZipFile A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203C3d(C3296CCo c3296CCo, InputStream inputStream, ZipFile zipFile) {
        super(inputStream);
        this.A01 = zipFile;
        this.A00 = c3296CCo;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            super.close();
        } finally {
            this.A01.close();
        }
    }
}
