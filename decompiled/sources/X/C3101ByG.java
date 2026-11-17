package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.ByG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3101ByG extends ByF {
    public boolean A00;
    public long A01;
    public final int A02;
    public final /* synthetic */ EEE A03;

    private final void A00(IOException iOException) throws IOException {
        this.A00 = true;
        this.A03.A01.markerEnd(42991645, this.A02, (short) 3);
        throw iOException;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        try {
            int i = super.A00.read(bArr);
            if (i != -1) {
                this.A01 += i;
            }
            return i;
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3101ByG(EEE eee, InputStream inputStream, int i) {
        super(inputStream);
        this.A03 = eee;
        this.A02 = i;
    }

    @Override // X.ByF, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        if (!this.A00 && (i = this.A02) != 0) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(42991645, i, "read_bytes", this.A01);
            lightweightQuickPerformanceLogger.markerEnd(42991645, i, (short) 2);
        }
        try {
            super.close();
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.ByF, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 != -1) {
                this.A01 += i3;
            }
            return i3;
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            int i = super.A00.read();
            if (i != -1) {
                this.A01++;
            }
            return i;
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }
}
