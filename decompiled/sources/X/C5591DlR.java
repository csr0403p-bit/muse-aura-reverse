package X;

import androidx.media3.common.util.Util;
import java.util.Arrays;

/* renamed from: X.DlR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5591DlR implements InterfaceC5509Djl {
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    @Override // X.InterfaceC5509Djl
    public final long AEy() {
        return this.A05;
    }

    @Override // X.InterfaceC5509Djl
    public final DkQ AK7(long j) {
        long[] jArr = this.A04;
        int iA08 = Util.A08(jArr, j, true);
        long j2 = jArr[iA08];
        long[] jArr2 = this.A03;
        E29 e29 = new E29(j2, jArr2[iA08]);
        if (e29.A01 >= j || iA08 == this.A00 - 1) {
            return new DkQ(e29, e29);
        }
        int i = iA08 + 1;
        return DkQ.A00(e29, jArr[i], jArr2[i]);
    }

    @Override // X.InterfaceC5509Djl
    public final boolean isSeekable() {
        return true;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ChunkIndex(length=");
        sbA0x.append(this.A00);
        sbA0x.append(", sizes=");
        sbA0x.append(Arrays.toString(this.A01));
        sbA0x.append(", offsets=");
        sbA0x.append(Arrays.toString(this.A03));
        sbA0x.append(", timeUs=");
        sbA0x.append(Arrays.toString(this.A04));
        sbA0x.append(", durationsUs=");
        sbA0x.append(Arrays.toString(this.A02));
        return BV7.A10(sbA0x);
    }

    public C5591DlR(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        int length = iArr.length;
        this.A00 = length;
        if (length > 0) {
            int i = length - 1;
            this.A05 = jArr2[i] + jArr3[i];
        }
    }
}
