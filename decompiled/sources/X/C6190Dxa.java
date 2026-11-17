package X;

import java.nio.ByteBuffer;

/* renamed from: X.Dxa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6190Dxa extends Di2 {
    public int A00;
    public int A01;
    public long A02;

    public C6190Dxa() {
        super(2);
        this.A00 = 32;
    }

    public final boolean A05(Di2 di2) {
        ByteBuffer byteBuffer;
        C1G.A07(!AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1073741824, 1073741824));
        C1G.A07(!AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 268435456, 268435456));
        C1G.A07(!AbstractC5364DhG.A00(di2));
        int i = this.A01;
        if (i > 0) {
            if (i >= this.A00 || AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & Integer.MIN_VALUE, Integer.MIN_VALUE) != AnonymousClass002.A1Q(((AbstractC5364DhG) this).A00 & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = di2.A01;
            if (byteBuffer2 != null && (byteBuffer = super.A01) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 == 0) {
            ((Di2) this).A00 = di2.A00;
            if (AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & 1, 1)) {
                ((AbstractC5364DhG) this).A00 = 1;
            }
        }
        if (AnonymousClass002.A1Q(((AbstractC5364DhG) di2).A00 & Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            ((AbstractC5364DhG) this).A00 = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = di2.A01;
        if (byteBuffer3 != null) {
            A04(byteBuffer3.remaining());
            super.A01.put(byteBuffer3);
        }
        this.A02 = di2.A00;
        return true;
    }

    @Override // X.Di2
    public final void A02() {
        super.A02();
        this.A01 = 0;
    }
}
