package com.facebook.aura.settings;

import X.C7384Etj;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class CountingOutputStream extends OutputStream {
    public long bytesWritten;
    public final OutputStream delegate;
    public Exception writeError;

    public CountingOutputStream(OutputStream outputStream) {
        C7384Etj.A0Y(outputStream, 0);
        this.delegate = outputStream;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws Exception {
        C7384Etj.A0Y(bArr, 0);
        try {
            this.delegate.write(bArr, i, i2);
            this.bytesWritten += i2;
        } catch (Exception e) {
            this.writeError = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    public final long getBytesWritten() {
        return this.bytesWritten;
    }

    public final Exception getWriteError() {
        return this.writeError;
    }

    private final void recordingWriteError(Function0<Unit> function0) throws Exception {
        try {
            function0.invoke();
        } catch (Exception e) {
            this.writeError = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws Exception {
        C7384Etj.A0Y(bArr, 0);
        try {
            this.delegate.write(bArr);
            this.bytesWritten += bArr.length;
        } catch (Exception e) {
            this.writeError = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i) throws Exception {
        try {
            this.delegate.write(i);
            this.bytesWritten++;
        } catch (Exception e) {
            this.writeError = e;
            throw e;
        }
    }
}
