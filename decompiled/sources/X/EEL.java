package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public final class EEL extends EEM {
    public boolean A00;
    public long A01;
    public final int A02;
    public final /* synthetic */ EEE A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EEL(EEE eee, OutputStream outputStream, int i) {
        super(outputStream);
        C7384Etj.A0Y(outputStream, 1);
        this.A03 = eee;
        this.A02 = i;
    }

    private final void A00(IOException iOException) throws IOException {
        this.A00 = true;
        this.A03.A01.markerEnd(42991646, this.A02, (short) 3);
        throw iOException;
    }

    @Override // X.EEM, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        try {
            super.write(bArr);
            this.A01 += bArr.length;
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.EEM, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i;
        if (!this.A00 && (i = this.A02) != 0) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03.A01;
            lightweightQuickPerformanceLogger.markerAnnotate(42991646, i, "written_bytes", this.A01);
            lightweightQuickPerformanceLogger.markerEnd(42991646, i, (short) 2);
        }
        try {
            super.close();
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.EEM, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.EEM, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C7384Etj.A0Y(bArr, 0);
        try {
            super.write(bArr, i, i2);
            this.A01 += i2;
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }

    @Override // X.EEM, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            super.write(i);
            this.A01++;
        } catch (IOException e) {
            A00(e);
            throw F60.createAndThrow();
        }
    }
}
