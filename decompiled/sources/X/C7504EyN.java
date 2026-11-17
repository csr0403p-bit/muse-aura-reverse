package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.EyN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7504EyN extends ByteArrayOutputStream {
    public final void A00(byte[] bArr, int i) {
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i, ((ByteArrayOutputStream) this).count);
    }
}
