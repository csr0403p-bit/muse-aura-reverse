package com.facebook.aura.network.transport.flipper;

import X.AnonymousClass003;
import X.BV4;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.G0U;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class FlipperCapturingInputStream extends InputStream {
    public final ByteArrayOutputStream captured;
    public boolean discardBody;
    public final InputStream input;
    public final Object lock;
    public final int maxBytes;
    public final G0U<byte[], Unit> onComplete;
    public final AtomicBoolean reported;

    private final void capture(int i) {
        synchronized (this.lock) {
            if (!this.discardBody) {
                if (this.captured.size() == this.maxBytes) {
                    this.discardBody = true;
                    this.captured.reset();
                } else {
                    this.captured.write(i);
                }
            }
        }
    }

    private final void reportCapturedBody() {
        byte[] byteArray;
        if (C3cI.A1W(this.reported)) {
            synchronized (this.lock) {
                ByteArrayOutputStream byteArrayOutputStream = this.captured;
                byteArray = null;
                if (!this.discardBody && byteArrayOutputStream.size() != 0) {
                    byteArray = byteArrayOutputStream.toByteArray();
                }
            }
            this.onComplete.invoke(byteArray);
        }
    }

    private final void reportMetadataOnly() {
        synchronized (this.lock) {
            this.discardBody = true;
            this.captured.reset();
        }
        reportCapturedBody();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.input.available();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            int i = this.input.read();
            if (i == -1) {
                reportCapturedBody();
                return i;
            }
            capture(i);
            return i;
        } catch (Throwable th) {
            reportMetadataOnly();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        synchronized (this.lock) {
            this.discardBody = true;
            this.captured.reset();
        }
        return this.input.skip(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlipperCapturingInputStream(InputStream inputStream, int i, G0U<? super byte[], Unit> g0u) {
        AnonymousClass003.A0v(inputStream, g0u);
        this.maxBytes = i;
        this.onComplete = g0u;
        this.captured = BV4.A0F();
        this.reported = new AtomicBoolean();
        this.lock = C3cG.A0T();
        this.input = inputStream;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            reportCapturedBody();
        } finally {
            this.input.close();
        }
    }

    private final void capture(byte[] bArr, int i, int i2) {
        synchronized (this.lock) {
            if (!this.discardBody) {
                if (this.captured.size() + i2 > this.maxBytes) {
                    this.discardBody = true;
                    this.captured.reset();
                } else {
                    this.captured.write(bArr, i, i2);
                }
            }
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        try {
            int i3 = this.input.read(bArr, i, i2);
            if (i3 == -1) {
                reportCapturedBody();
                return i3;
            }
            if (i3 > 0) {
                capture(bArr, i, i3);
            }
            return i3;
        } catch (Throwable th) {
            reportMetadataOnly();
            throw th;
        }
    }
}
