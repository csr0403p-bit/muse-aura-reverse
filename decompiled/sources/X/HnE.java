package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public final class HnE extends DRt {
    public static HnE A00(ByteBuffer byteBuffer) {
        HnE hnE = new HnE();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        hnE.A00 = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        hnE.A01 = byteBuffer;
        hnE.A01.getInt(hnE.A01(8) + hnE.A00);
        hnE.A01.getInt(hnE.A01(14) + hnE.A00);
        hnE.A01.getInt(hnE.A01(20) + hnE.A00);
        return hnE;
    }

    public final HjM A05(int i) {
        HjM hjM = new HjM();
        int iA01 = A01(26);
        if (iA01 == 0) {
            return null;
        }
        int iA02 = A02(iA01) + (i * 4);
        int i2 = iA02 + this.A01.getInt(iA02);
        ByteBuffer byteBuffer = this.A01;
        hjM.A00 = i2;
        hjM.A01 = byteBuffer;
        return hjM;
    }
}
