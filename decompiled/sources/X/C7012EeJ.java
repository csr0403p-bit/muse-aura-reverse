package X;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.EeJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7012EeJ {
    public final C6524EBy A00;

    public final void A00(InputStream inputStream, OutputStream outputStream) {
        C6524EBy c6524EBy = this.A00;
        byte[] bArr = (byte[]) c6524EBy.get(16384);
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 16384);
                if (i == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            } finally {
                c6524EBy.Aa9(bArr);
            }
        }
    }

    public C7012EeJ(C6524EBy c6524EBy) {
        this.A00 = c6524EBy;
    }
}
