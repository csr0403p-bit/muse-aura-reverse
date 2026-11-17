package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: X.DJp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4974DJp extends DKF {
    public boolean A00;
    public final int A01;
    public final MessageDigest A02;
    public final ByteBuffer A03;

    public C4974DJp() {
        this.A03 = BV5.A0t(8);
    }

    public C4974DJp(MessageDigest digest, int bytes) {
        this();
        this.A02 = digest;
        this.A01 = bytes;
    }
}
