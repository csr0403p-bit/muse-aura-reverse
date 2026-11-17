package X;

import com.facebook.tigon.TigonBodyStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class CYK extends OutputStream {
    public ByteBuffer A00;
    public boolean A01;
    public final int A02;
    public final TigonBodyStream A03;
    public final /* synthetic */ CYI A04;

    public CYK(TigonBodyStream tigonBodyStream, CYI cyi, int i) {
        this.A04 = cyi;
        int iMax = Math.max(i, 4096);
        this.A02 = iMax;
        this.A00 = ByteBuffer.allocateDirect(iMax);
        this.A03 = tigonBodyStream;
    }

    public final void A00() {
        if (this.A00.position() > 0) {
            TigonBodyStream tigonBodyStream = this.A03;
            ByteBuffer byteBuffer = this.A00;
            if (1 == tigonBodyStream.transferBytes(byteBuffer, byteBuffer.position())) {
                this.A01 = true;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (!this.A00.hasRemaining()) {
            A00();
            this.A00 = ByteBuffer.allocateDirect(this.A02);
        }
        if (this.A01) {
            return;
        }
        if (!this.A00.hasRemaining()) {
            throw BV4.A0T();
        }
        this.A00.put((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            if (!this.A00.hasRemaining()) {
                A00();
                this.A00 = ByteBuffer.allocateDirect(this.A02);
            }
            if (!this.A01) {
                if (this.A00.hasRemaining()) {
                    int iMin = Math.min(this.A00.remaining(), i2);
                    this.A00.put(bArr, i, iMin);
                    i += iMin;
                    i2 -= iMin;
                } else {
                    throw BV4.A0T();
                }
            } else {
                return;
            }
        }
    }
}
