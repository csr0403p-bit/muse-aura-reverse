package X;

import androidx.media3.common.ParserException;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;

/* renamed from: X.E3q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6388E3q implements E50 {
    public static final int[] A0C = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] A0D = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final C6403E4f A05;
    public final int A06;
    public final C6154Dwx A07;
    public final E1P A08;
    public final InterfaceC6413E4p A09;
    public final InterfaceC5563Dkg A0A;
    public final byte[] A0B;

    @Override // X.E50
    public final void AbK(long j) {
        this.A00 = 0;
        this.A03 = j;
        this.A01 = 0;
        this.A02 = 0L;
    }

    private void A00(int i) {
        long j = this.A03;
        long j2 = this.A02;
        C6403E4f c6403E4f = this.A05;
        long jA0I = j + BV8.A0I(j2, c6403E4f.A03);
        int i2 = i * 2 * c6403E4f.A04;
        this.A0A.Abz(null, 1, i2, this.A01 - i2, jA0I);
        this.A02 += i;
        this.A01 -= i2;
    }

    @Override // X.E50
    public final void ANY(int i, long j) {
        E4A e4a = new E4A(this.A05, this.A04, i, j);
        this.A09.AcM(e4a);
        InterfaceC5563Dkg interfaceC5563Dkg = this.A0A;
        interfaceC5563Dkg.ABq(this.A07);
        interfaceC5563Dkg.A9m(e4a.A01);
    }

    @Override // X.E50
    public final boolean Abx(E2K e2k, long j) {
        int i;
        int i2 = this.A06;
        int i3 = this.A01;
        C6403E4f c6403E4f = this.A05;
        int i4 = c6403E4f.A04;
        int i5 = i4 * 2;
        int i6 = this.A04;
        int i7 = c6403E4f.A01;
        int i8 = ((((i2 - (i3 / i5)) + i6) - 1) / i6) * i7;
        boolean z = false;
        if (j == 0) {
            z = true;
        } else {
            while (true) {
                int i9 = this.A00;
                if (i9 >= i8) {
                    break;
                }
                int i10 = e2k.read(this.A0B, i9, BV4.A01(i8 - i9, j));
                if (i10 == -1) {
                    break;
                }
                this.A00 += i10;
            }
            z = true;
        }
        int i11 = this.A00 / i7;
        if (i11 > 0) {
            byte[] bArr = this.A0B;
            E1P e1p = this.A08;
            int i12 = 0;
            do {
                for (int i13 = 0; i13 < i4; i13++) {
                    byte[] bArr2 = e1p.A02;
                    int i14 = (i12 * i7) + (i13 * 4);
                    int i15 = (i4 * 4) + i14;
                    int i16 = (i7 / i4) - 4;
                    int iA0D = (short) (BV6.A0D(bArr, i14 + 1) | (bArr[i14] & 255));
                    int iMin = Math.min(bArr[i14 + 2] & 255, 88);
                    int[] iArr = A0D;
                    int i17 = iArr[iMin];
                    int i18 = ((i12 * i6 * i4) + i13) * 2;
                    BV5.A1C(iA0D, bArr2, i18);
                    bArr2[i18 + 1] = (byte) (iA0D >> 8);
                    for (int i19 = 0; i19 < i16 * 2; i19++) {
                        byte b = bArr[((i19 / 8) * i4 * 4) + i15 + ((i19 / 2) % 4)];
                        int i20 = (b & 255) >> 4;
                        if (i19 % 2 == 0) {
                            i20 = b & 15;
                        }
                        int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                        if ((i20 & 8) != 0) {
                            i21 = -i21;
                        }
                        iA0D = BV5.A02(iA0D + i21, 32767, -32768);
                        i18 += i5;
                        BV5.A1C(iA0D, bArr2, i18);
                        bArr2[i18 + 1] = (byte) (iA0D >> 8);
                        iMin = BV5.A02(iMin + A0C[i20], 88, 0);
                        i17 = iArr[iMin];
                    }
                }
                i12++;
            } while (i12 < i11);
            e1p.A0R(0);
            e1p.A0Q(i6 * i11 * 2 * i4);
            this.A00 -= i11 * i7;
            int i22 = e1p.A00;
            this.A0A.Abv(e1p, i22);
            int i23 = this.A01 + i22;
            this.A01 = i23;
            if (i23 / i5 >= i2) {
                A00(i2);
            }
        }
        if (z && (i = this.A01 / i5) > 0) {
            A00(i);
        }
        return z;
    }

    public C6388E3q(InterfaceC6413E4p interfaceC6413E4p, InterfaceC5563Dkg interfaceC5563Dkg, C6403E4f c6403E4f) throws ParserException {
        this.A09 = interfaceC6413E4p;
        this.A0A = interfaceC5563Dkg;
        this.A05 = c6403E4f;
        int i = c6403E4f.A03;
        int iMax = Math.max(1, i / 10);
        this.A06 = iMax;
        E1P e1pA0Z = BV6.A0Z(c6403E4f.A05);
        e1pA0Z.A08();
        int iA08 = e1pA0Z.A08();
        this.A04 = iA08;
        int i2 = c6403E4f.A04;
        int i3 = c6403E4f.A01;
        int i4 = (((i3 - (i2 * 4)) * 8) / (c6403E4f.A00 * i2)) + 1;
        if (iA08 != i4) {
            throw BV7.A0c(FGI.A0T("Expected frames per block: ", "; got: ", i4, iA08));
        }
        int i5 = ((iMax + iA08) - 1) / iA08;
        this.A0B = new byte[i3 * i5];
        this.A08 = BV6.A0Y(i5 * iA08 * 2 * i2);
        int i6 = ((i * i3) * 8) / iA08;
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        c6162Dx5A00.A06("audio/raw");
        c6162Dx5A00.A03 = i6;
        c6162Dx5A00.A0G = i6;
        c6162Dx5A00.A0C = iMax * 2 * i2;
        c6162Dx5A00.A04 = i2;
        c6162Dx5A00.A0J = i;
        c6162Dx5A00.A0F = 2;
        this.A07 = BV6.A0U(c6162Dx5A00);
    }
}
