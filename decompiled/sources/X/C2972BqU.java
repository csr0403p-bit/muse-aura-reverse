package X;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: X.BqU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2972BqU extends MediaDataSource {
    public long A00;
    public final /* synthetic */ C2974BqZ A01;
    public final /* synthetic */ BqQ A02;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C2972BqU(C2974BqZ c2974BqZ, BqQ bqQ) {
        this.A02 = bqQ;
        this.A01 = c2974BqZ;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.A00;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.A01.A04.available()) {
                    return -1;
                }
                this.A01.A01(j);
                this.A00 = j;
            }
            C2974BqZ c2974BqZ = this.A01;
            DataInputStream dataInputStream = c2974BqZ.A04;
            if (i2 > dataInputStream.available()) {
                i2 = dataInputStream.available();
            }
            int i3 = c2974BqZ.read(bArr, i, i2);
            if (i3 >= 0) {
                this.A00 += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.A00 = -1L;
        return -1;
    }
}
