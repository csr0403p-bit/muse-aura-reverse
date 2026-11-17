package X;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class Di2 extends AbstractC5364DhG {
    public static final Di2 $redex_init_class = null;
    public long A00;
    public ByteBuffer A01;
    public ByteBuffer A02;
    public boolean A03;
    public final int A04;
    public final C5473Dj9 A05 = new C5473Dj9();

    public void A02() {
        super.A00 = 0;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.A03 = false;
    }

    static {
        C2369BVx.A00("media3.decoder");
    }

    public final void A03() {
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.A02;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final void A04(int i) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBuffer = this.A01;
        if (byteBuffer == null) {
            int i2 = this.A04;
            if (i2 == 1) {
                byteBufferAllocateDirect = ByteBuffer.allocate(i);
            } else {
                if (i2 != 2) {
                    throw new DecoderInputBuffer$InsufficientCapacityException(0, i);
                }
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(i);
            }
        } else {
            int iCapacity = byteBuffer.capacity();
            int iPosition = byteBuffer.position();
            int i3 = i + iPosition;
            if (iCapacity >= i3) {
                this.A01 = byteBuffer;
                return;
            }
            int i4 = this.A04;
            if (i4 == 1) {
                byteBufferAllocateDirect = ByteBuffer.allocate(i3);
            } else {
                if (i4 != 2) {
                    ByteBuffer byteBuffer2 = this.A01;
                    throw new DecoderInputBuffer$InsufficientCapacityException(byteBuffer2 == null ? 0 : byteBuffer2.capacity(), i3);
                }
                byteBufferAllocateDirect = ByteBuffer.allocateDirect(i3);
            }
            byteBufferAllocateDirect.order(byteBuffer.order());
            if (iPosition > 0) {
                byteBuffer.flip();
                byteBufferAllocateDirect.put(byteBuffer);
            }
        }
        this.A01 = byteBufferAllocateDirect;
    }

    public Di2(int i) {
        this.A04 = i;
    }
}
