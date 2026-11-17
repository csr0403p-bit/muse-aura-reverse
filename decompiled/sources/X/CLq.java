package X;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class CLq extends CLp {
    public final void A03(CMM cmm, int i) {
        short s;
        int iA02 = A02(6);
        if (iA02 != 0) {
            int i2 = iA02 + this.A00;
            int i3 = i2 + this.A04.getInt(i2) + 4 + (i * 4);
            int i4 = i3 + this.A04.getInt(i3);
            ByteBuffer byteBuffer = this.A04;
            cmm.A04 = byteBuffer;
            if (byteBuffer != null) {
                cmm.A00 = i4;
                int i5 = i4 - byteBuffer.getInt(i4);
                cmm.A02 = i5;
                s = cmm.A04.getShort(i5);
            } else {
                s = 0;
                cmm.A00 = 0;
                cmm.A02 = 0;
            }
            cmm.A01 = s;
        }
    }
}
