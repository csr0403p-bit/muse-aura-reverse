package com.facebook.aura.network.api;

import X.C7384Etj;
import X.DCl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class HttpResponseBytesKt {
    public static final long MAX_IN_MEMORY_BODY_BYTES = 50331648;
    public static final long MAX_PRESIZE_BYTES = 4194304;

    /* renamed from: com.facebook.aura.network.api.HttpResponseBytesKt$withByteLimit$3, reason: invalid class name */
    public final class AnonymousClass3 extends OutputStream {
        public final /* synthetic */ long $maxBytes;
        public final /* synthetic */ OutputStream $output;
        public long bytesWritten;

        private final void checkLimit(int i) throws ByteLimitExceededException {
            long j = i;
            long j2 = this.$maxBytes;
            if (j > j2 - this.bytesWritten) {
                throw new ByteLimitExceededException(j2, 1 + j2, false);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            C7384Etj.A0Y(bArr, 0);
            checkLimit(i2);
            this.$output.write(bArr, i, i2);
            this.bytesWritten += i2;
        }

        public AnonymousClass3(OutputStream outputStream, long j) {
            this.$output = outputStream;
            this.$maxBytes = j;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.$output.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.$output.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            checkLimit(1);
            this.$output.write(i);
            this.bytesWritten++;
        }
    }

    public static final byte[] readBoundedBytes(InputStream inputStream, long j, long j2) throws IOException {
        C7384Etj.A0Y(inputStream, 0);
        InputStream inputStreamWithByteLimit = withByteLimit(inputStream, j, j2);
        UncopiedByteArrayOutputStream uncopiedByteArrayOutputStream = new UncopiedByteArrayOutputStream(initialCapacityFor(j2, j));
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStreamWithByteLimit.read(bArr);
            if (i < 0) {
                return uncopiedByteArrayOutputStream.takeByteArray();
            }
            uncopiedByteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static final String readBoundedString(InputStream inputStream, long j, long j2) {
        C7384Etj.A0Y(inputStream, 0);
        return new String(readBoundedBytes(inputStream, j, j2), DCl.A05);
    }

    public static final InputStream withByteLimit(InputStream inputStream, long j, long j2) throws ByteLimitExceededException {
        C7384Etj.A0Y(inputStream, 0);
        if (j < 0) {
            throw new IllegalArgumentException("maxBytes must be non-negative");
        }
        if (j2 <= j) {
            return new ByteLimitedInputStream(inputStream, j);
        }
        throw new ByteLimitExceededException(j, j2, true);
    }

    public static final int initialCapacityFor(long j, long j2) {
        if (j < 0 || j > j2) {
            return 8192;
        }
        if (j > 4194304) {
            j = 4194304;
        }
        return (int) j;
    }

    public static /* synthetic */ byte[] readBoundedBytes$default(InputStream inputStream, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = -1;
        }
        return readBoundedBytes(inputStream, j, j2);
    }

    public static /* synthetic */ String readBoundedString$default(InputStream inputStream, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = -1;
        }
        return readBoundedString(inputStream, j, j2);
    }

    public static /* synthetic */ InputStream withByteLimit$default(InputStream inputStream, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = -1;
        }
        return withByteLimit(inputStream, j, j2);
    }

    public static final OutputStream withByteLimit(OutputStream outputStream, long j) {
        C7384Etj.A0Y(outputStream, 0);
        if (j >= 0) {
            return new AnonymousClass3(outputStream, j);
        }
        throw new IllegalArgumentException("maxBytes must be non-negative");
    }
}
