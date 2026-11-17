package X;

import X.DJK;
import X.DJQ;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class DIe<K extends DJK, V extends DJQ> {
    public final int A00;
    public final int A01;
    public final K A02;
    public final V A03;
    public final ByteBuffer A04;

    /* JADX WARN: Multi-variable type inference failed */
    public DIe(DJK djk, DJQ djq, ByteBuffer byteBuffer, int i) {
        int i2 = i + 8;
        int iLimit = (byteBuffer.limit() / i2) / 3;
        if (iLimit <= 0) {
            throw C60O.A0i("Buffer should be greater then 0");
        }
        int i3 = iLimit * 3 * i2;
        if (byteBuffer.limit() < i3) {
            throw C8j3.A0v("Buffer is too small. MinimumSize=", ", but got ", i3, byteBuffer.limit());
        }
        this.A01 = iLimit;
        this.A00 = i2;
        this.A04 = byteBuffer;
        this.A02 = djk;
        this.A03 = djq;
    }
}
