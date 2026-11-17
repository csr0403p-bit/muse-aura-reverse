package X;

import androidx.glance.appwidget.protobuf.CodedOutputStream;

/* loaded from: classes6.dex */
public final class GG5 extends CodedOutputStream {
    public int A00;
    public final int A01;
    public final byte[] A02;

    public GG5(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            throw BV5.A0T("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", AbstractC7611F5y.A1C(length, 0, i));
        }
        this.A02 = bArr;
        this.A00 = 0;
        this.A01 = i;
    }
}
