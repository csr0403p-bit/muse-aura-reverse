package X;

import java.nio.ByteBuffer;

/* renamed from: X.Bys, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3127Bys {
    public static long A00(C3121Byl c3121Byl) {
        byte[] bArr = c3121Byl.A01.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
