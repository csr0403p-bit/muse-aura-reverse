package X;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: X.BqI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2966BqI extends FilterOutputStream {
    public static final byte[] A06 = "Exif\u0000\u0000".getBytes(C2967BqK.A03);
    public int A00;
    public int A01;
    public int A02;
    public final BqH A03;
    public final ByteBuffer A04;
    public final byte[] A05;

    public static void A00(BqH bqH, C2965BqG c2965BqG, Map map) {
        map.put(c2965BqG.A03, C2967BqK.A00(bqH.A00, new long[]{0}));
    }

    public C2966BqI(BqH bqH, OutputStream outputStream) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.A05 = new byte[1];
        this.A04 = ByteBuffer.allocate(4);
        this.A02 = 0;
        this.A03 = bqH;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.A05;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(byte[] r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2966BqI.write(byte[], int, int):void");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
