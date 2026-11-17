package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: X.EaW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6818EaW implements InterfaceC6831Eaj, EcA, Cloneable, ByteChannel {
    public long A00;
    public C6830Eai A01;

    public final int A03(byte[] bArr, int i, int i2) {
        AbstractC6789EZy.A01(bArr.length, i, i2);
        C6830Eai c6830Eai = this.A01;
        if (c6830Eai == null) {
            return -1;
        }
        int i3 = c6830Eai.A00;
        int i4 = c6830Eai.A01;
        int iMin = Math.min(i2, i3 - i4);
        System.arraycopy(c6830Eai.A06, i4, bArr, i, (i4 + iMin) - i4);
        int i5 = c6830Eai.A01 + iMin;
        c6830Eai.A01 = i5;
        this.A00 -= iMin;
        if (i5 != c6830Eai.A00) {
            return iMin;
        }
        this.A01 = c6830Eai.A01();
        AbstractC6826Eae.A01(c6830Eai);
        return iMin;
    }

    public final long A04(byte b, long j, long j2) {
        C6830Eai c6830Eai;
        int i;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 > j || j > j4) {
            StringBuilder sbA0x = C60O.A0x("size=");
            sbA0x.append(this.A00);
            sbA0x.append(" fromIndex=");
            sbA0x.append(j3);
            throw C60O.A0i(BV7.A0z(" toIndex=", sbA0x, j4));
        }
        long j6 = this.A00;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 != j4 && (c6830Eai = this.A01) != null) {
            if (j6 - j3 < j3) {
                j5 = j6;
                while (j5 > j3) {
                    c6830Eai = c6830Eai.A03;
                    C7384Etj.A0X(c6830Eai);
                    j5 -= c6830Eai.A00 - c6830Eai.A01;
                }
                while (j5 < j4) {
                    byte[] bArr = c6830Eai.A06;
                    int i2 = c6830Eai.A00;
                    long j7 = c6830Eai.A01;
                    int iA01 = BV4.A01(i2, (j7 + j4) - j5);
                    i = (int) ((j7 + j3) - j5);
                    while (i < iA01) {
                        if (bArr[i] == b) {
                            return (i - c6830Eai.A01) + j5;
                        }
                        i++;
                    }
                    j5 += i2 - r12;
                    c6830Eai = c6830Eai.A02;
                    C7384Etj.A0X(c6830Eai);
                    j3 = j5;
                }
            } else {
                while (true) {
                    long j8 = (c6830Eai.A00 - c6830Eai.A01) + j5;
                    if (j8 > j3) {
                        break;
                    }
                    c6830Eai = c6830Eai.A02;
                    C7384Etj.A0X(c6830Eai);
                    j5 = j8;
                }
                while (j5 < j4) {
                    byte[] bArr2 = c6830Eai.A06;
                    long j9 = c6830Eai.A00;
                    long j10 = c6830Eai.A01;
                    int iA012 = BV4.A01(j9, (j10 + j4) - j5);
                    i = (int) ((j10 + j3) - j5);
                    while (i < iA012) {
                        if (bArr2[i] == b) {
                            return (i - c6830Eai.A01) + j5;
                        }
                        i++;
                    }
                    j5 += c6830Eai.A00 - c6830Eai.A01;
                    c6830Eai = c6830Eai.A02;
                    C7384Etj.A0X(c6830Eai);
                    j3 = j5;
                }
            }
        }
        return -1L;
    }

    public final C6830Eai A06(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C6830Eai c6830Eai = this.A01;
        if (c6830Eai == null) {
            C6830Eai c6830EaiA00 = AbstractC6826Eae.A00();
            this.A01 = c6830EaiA00;
            c6830EaiA00.A03 = c6830EaiA00;
            c6830EaiA00.A02 = c6830EaiA00;
            return c6830EaiA00;
        }
        C6830Eai c6830Eai2 = c6830Eai.A03;
        C7384Etj.A0X(c6830Eai2);
        if (c6830Eai2.A00 + i <= 8192 && c6830Eai2.A04) {
            return c6830Eai2;
        }
        C6830Eai c6830EaiA002 = AbstractC6826Eae.A00();
        c6830Eai2.A03(c6830EaiA002);
        return c6830EaiA002;
    }

    @Override // X.EcA
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void Aif(int i) {
        C6830Eai c6830EaiA06 = A06(1);
        byte[] bArr = c6830EaiA06.A06;
        int i2 = c6830EaiA06.A00;
        c6830EaiA06.A00 = i2 + 1;
        bArr[i2] = (byte) i;
        this.A00++;
    }

    @Override // X.EcA
    /* renamed from: A08, reason: merged with bridge method [inline-methods] */
    public final void Ain(int i) {
        C6830Eai c6830EaiA06 = A06(4);
        byte[] bArr = c6830EaiA06.A06;
        int i2 = c6830EaiA06.A00;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c6830EaiA06.A00 = i2 + 4;
        this.A00 += 4;
    }

    public final void A0C(C6818EaW c6818EaW, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        AbstractC6789EZy.A01(this.A00, j3, j4);
        if (j2 != 0) {
            c6818EaW.A00 += j2;
            C6830Eai c6830Eai = this.A01;
            while (true) {
                C7384Etj.A0X(c6830Eai);
                if (j3 < c6830Eai.A00 - c6830Eai.A01) {
                    break;
                }
                j3 -= c6830Eai.A00 - c6830Eai.A01;
                c6830Eai = c6830Eai.A02;
            }
            while (j4 > 0) {
                C7384Etj.A0X(c6830Eai);
                C6830Eai c6830EaiA02 = c6830Eai.A02();
                int i = c6830EaiA02.A01 + ((int) j3);
                c6830EaiA02.A01 = i;
                c6830EaiA02.A00 = Math.min(i + ((int) j4), c6830EaiA02.A00);
                C6830Eai c6830Eai2 = c6818EaW.A01;
                if (c6830Eai2 == null) {
                    c6830EaiA02.A03 = c6830EaiA02;
                    c6830EaiA02.A02 = c6830EaiA02;
                    c6818EaW.A01 = c6830EaiA02;
                } else {
                    C6830Eai c6830Eai3 = c6830Eai2.A03;
                    C7384Etj.A0X(c6830Eai3);
                    c6830Eai3.A03(c6830EaiA02);
                }
                j4 -= c6830EaiA02.A00 - c6830EaiA02.A01;
                c6830Eai = c6830Eai.A02;
                j3 = 0;
            }
        }
    }

    @Override // X.InterfaceC6831Eaj, X.EcA
    public final C6818EaW AD5() {
        return this;
    }

    @Override // X.InterfaceC6831Eaj
    public final long ANX(C6788EZx c6788EZx) {
        C7384Etj.A0Y(c6788EZx, 0);
        return A05(c6788EZx, 0L);
    }

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) {
        C7384Etj.A0Y(c6818EaW, 0);
        if (j < 0) {
            throw new IllegalArgumentException(FGI.A0B(j, "byteCount < 0: "));
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c6818EaW.Aib(this, j);
        return j;
    }

    @Override // X.InterfaceC6831Eaj
    public final int AcQ(C6832Eak c6832Eak) throws EOFException {
        C7384Etj.A0Y(c6832Eak, 0);
        int iA00 = AbstractC6827Eaf.A00(this, c6832Eak, false);
        if (iA00 == -1) {
            return -1;
        }
        Afk(c6832Eak.A01[iA00].A0C());
        return iA00;
    }

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) {
        int i;
        C6830Eai c6830EaiA00;
        C6830Eai c6830Eai;
        long j2 = j;
        C7384Etj.A0Y(c6818EaW, 0);
        if (c6818EaW == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC6789EZy.A01(c6818EaW.A00, 0L, j2);
        while (j2 > 0) {
            C6830Eai c6830Eai2 = c6818EaW.A01;
            C7384Etj.A0X(c6830Eai2);
            int i2 = c6830Eai2.A00;
            C7384Etj.A0X(c6818EaW.A01);
            if (j2 < i2 - r0.A01) {
                C6830Eai c6830Eai3 = this.A01;
                if (c6830Eai3 != null && (c6830Eai = c6830Eai3.A03) != null && c6830Eai.A04) {
                    if ((c6830Eai.A00 + j2) - (c6830Eai.A05 ? 0 : c6830Eai.A01) <= 8192) {
                        C6830Eai c6830Eai4 = c6818EaW.A01;
                        C7384Etj.A0X(c6830Eai4);
                        c6830Eai4.A04(c6830Eai, (int) j2);
                        c6818EaW.A00 -= j2;
                        this.A00 += j2;
                        return;
                    }
                }
                C6830Eai c6830Eai5 = c6818EaW.A01;
                C7384Etj.A0X(c6830Eai5);
                int i3 = (int) j2;
                if (i3 <= 0 || i3 > c6830Eai5.A00 - c6830Eai5.A01) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i3 >= 1024) {
                    c6830EaiA00 = c6830Eai5.A02();
                } else {
                    c6830EaiA00 = AbstractC6826Eae.A00();
                    byte[] bArr = c6830Eai5.A06;
                    byte[] bArr2 = c6830EaiA00.A06;
                    int i4 = c6830Eai5.A01;
                    System.arraycopy(bArr, i4, bArr2, 0, (i4 + i3) - i4);
                }
                c6830EaiA00.A00 = c6830EaiA00.A01 + i3;
                c6830Eai5.A01 += i3;
                C6830Eai c6830Eai6 = c6830Eai5.A03;
                C7384Etj.A0X(c6830Eai6);
                c6830Eai6.A03(c6830EaiA00);
                c6818EaW.A01 = c6830EaiA00;
            }
            C6830Eai c6830Eai7 = c6818EaW.A01;
            C7384Etj.A0X(c6830Eai7);
            long j3 = c6830Eai7.A00 - c6830Eai7.A01;
            c6818EaW.A01 = c6830Eai7.A01();
            C6830Eai c6830Eai8 = this.A01;
            if (c6830Eai8 == null) {
                this.A01 = c6830Eai7;
                c6830Eai7.A03 = c6830Eai7;
                c6830Eai7.A02 = c6830Eai7;
            } else {
                C6830Eai c6830Eai9 = c6830Eai8.A03;
                C7384Etj.A0X(c6830Eai9);
                c6830Eai9.A03(c6830Eai7);
                C6830Eai c6830Eai10 = c6830Eai7.A03;
                if (c6830Eai10 == c6830Eai7) {
                    throw new IllegalStateException("cannot compact");
                }
                C7384Etj.A0X(c6830Eai10);
                if (c6830Eai10.A04) {
                    int i5 = c6830Eai7.A00 - c6830Eai7.A01;
                    C6830Eai c6830Eai11 = c6830Eai7.A03;
                    C7384Etj.A0X(c6830Eai11);
                    int i6 = 8192 - c6830Eai11.A00;
                    C6830Eai c6830Eai12 = c6830Eai7.A03;
                    C7384Etj.A0X(c6830Eai12);
                    if (c6830Eai12.A05) {
                        i = 0;
                    } else {
                        C6830Eai c6830Eai13 = c6830Eai7.A03;
                        C7384Etj.A0X(c6830Eai13);
                        i = c6830Eai13.A01;
                    }
                    if (i5 <= i6 + i) {
                        C6830Eai c6830Eai14 = c6830Eai7.A03;
                        C7384Etj.A0X(c6830Eai14);
                        c6830Eai7.A04(c6830Eai14, i5);
                        c6830Eai7.A01();
                        AbstractC6826Eae.A01(c6830Eai7);
                    }
                }
            }
            c6818EaW.A00 -= j3;
            this.A00 += j3;
            j2 -= j3;
        }
    }

    @Override // X.EcA
    public final /* bridge */ /* synthetic */ void Aic(C6788EZx c6788EZx) {
        C7384Etj.A0Y(c6788EZx, 0);
        c6788EZx.A09(this, c6788EZx.A0C());
    }

    @Override // X.EcA
    public final /* bridge */ /* synthetic */ void Aiw(int i) {
        C6830Eai c6830EaiA06 = A06(2);
        byte[] bArr = c6830EaiA06.A06;
        int i2 = c6830EaiA06.A00;
        BV5.A1C(i >>> 8, bArr, i2);
        BV5.A1C(i, bArr, i2 + 1);
        c6830EaiA06.A00 = i2 + 2;
        this.A00 += 2;
    }

    @Override // X.EcA
    public final /* bridge */ /* synthetic */ void Aj6(String str) {
        A0B(str, 0, C8j3.A0J(str, 0));
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // X.EcA, X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        C6830Eai c6830Eai = this.A01;
        if (c6830Eai == null) {
            return -1;
        }
        int iRemaining = byteBuffer.remaining();
        int i = c6830Eai.A00;
        int i2 = c6830Eai.A01;
        int iA0F = C8j3.A0F(i, i2, iRemaining);
        byteBuffer.put(c6830Eai.A06, i2, iA0F);
        int i3 = c6830Eai.A01 + iA0F;
        c6830Eai.A01 = i3;
        this.A00 -= iA0F;
        C6830Eai.A00(this, c6830Eai, i3);
        return iA0F;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C6830Eai c6830EaiA06 = A06(1);
            int i2 = c6830EaiA06.A00;
            int iMin = Math.min(i, 8192 - i2);
            byteBuffer.get(c6830EaiA06.A06, i2, iMin);
            i -= iMin;
            c6830EaiA06.A00 += iMin;
        }
        this.A00 += iRemaining;
        return iRemaining;
    }

    public static final String A00(Charset charset, C6818EaW c6818EaW, long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(FGI.A0B(j, "byteCount: "));
        }
        if (c6818EaW.A00 < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        C6830Eai c6830Eai = c6818EaW.A01;
        C7384Etj.A0X(c6830Eai);
        int i = c6830Eai.A01;
        if (i + j > c6830Eai.A00) {
            return new String(c6818EaW.AZB(j), charset);
        }
        int i2 = (int) j;
        String str = new String(c6830Eai.A06, i, i2, charset);
        int i3 = c6830Eai.A01 + i2;
        c6830Eai.A01 = i3;
        c6818EaW.A00 -= j;
        if (i3 != c6830Eai.A00) {
            return str;
        }
        c6818EaW.A01 = c6830Eai.A01();
        AbstractC6826Eae.A01(c6830Eai);
        return str;
    }

    private final C6788EZx A01(int i) {
        if (i == 0) {
            return C6788EZx.A02;
        }
        AbstractC6789EZy.A01(this.A00, 0L, i);
        C6830Eai c6830Eai = this.A01;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C7384Etj.A0X(c6830Eai);
            if (c6830Eai.A00 == c6830Eai.A01) {
                throw BV4.A0N("s.limit == s.pos");
            }
            i3 += c6830Eai.A00 - c6830Eai.A01;
            i4++;
            c6830Eai = c6830Eai.A02;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        C6830Eai c6830Eai2 = this.A01;
        int i5 = 0;
        while (i2 < i) {
            C7384Etj.A0X(c6830Eai2);
            bArr[i5] = c6830Eai2.A06;
            int i6 = c6830Eai2.A00;
            int i7 = c6830Eai2.A01;
            i2 += i6 - i7;
            iArr[i5] = Math.min(i2, i);
            iArr[i4 + i5] = i7;
            c6830Eai2.A05 = true;
            i5++;
            c6830Eai2 = c6830Eai2.A02;
        }
        return new C6791Ea0(iArr, bArr);
    }

    public final byte A02(long j) {
        byte[] bArr;
        int i;
        AbstractC6789EZy.A01(this.A00, j, 1L);
        C6830Eai c6830Eai = this.A01;
        if (c6830Eai == null) {
            C7384Etj.A0X(null);
            throw F60.createAndThrow();
        }
        long j2 = this.A00;
        if (j2 - j >= j) {
            j2 = 0;
            while (true) {
                int i2 = c6830Eai.A00;
                i = c6830Eai.A01;
                long j3 = (i2 - i) + j2;
                if (j3 > j) {
                    break;
                }
                c6830Eai = c6830Eai.A02;
                C7384Etj.A0X(c6830Eai);
                j2 = j3;
            }
            bArr = c6830Eai.A06;
        } else {
            while (j2 > j) {
                c6830Eai = c6830Eai.A03;
                C7384Etj.A0X(c6830Eai);
                j2 -= c6830Eai.A00 - c6830Eai.A01;
            }
            bArr = c6830Eai.A06;
            i = c6830Eai.A01;
        }
        return bArr[(int) ((i + j) - j2)];
    }

    public final long A05(C6788EZx c6788EZx, long j) {
        int i;
        long j2 = j;
        long j3 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(FGI.A0B(j2, "fromIndex < 0: "));
        }
        C6830Eai c6830Eai = this.A01;
        if (c6830Eai != null) {
            long j4 = this.A00;
            if (j4 - j < j) {
                j3 = j4;
                while (j3 > j) {
                    c6830Eai = c6830Eai.A03;
                    C7384Etj.A0X(c6830Eai);
                    j3 -= c6830Eai.A00 - c6830Eai.A01;
                }
                if (c6788EZx.A0C() == 2) {
                    byte bA0B = c6788EZx.A0B(0);
                    byte bA0B2 = c6788EZx.A0B(1);
                    while (j3 < this.A00) {
                        byte[] bArr = c6830Eai.A06;
                        i = (int) ((c6830Eai.A01 + j2) - j3);
                        int i2 = c6830Eai.A00;
                        while (i < i2) {
                            byte b = bArr[i];
                            if (b == bA0B || b == bA0B2) {
                                return (i - c6830Eai.A01) + j3;
                            }
                            i++;
                        }
                        j3 += i2 - r4;
                        c6830Eai = c6830Eai.A02;
                        C7384Etj.A0X(c6830Eai);
                        j2 = j3;
                    }
                } else {
                    byte[] bArrA0A = c6788EZx.A0A();
                    while (j3 < this.A00) {
                        byte[] bArr2 = c6830Eai.A06;
                        i = (int) ((c6830Eai.A01 + j2) - j3);
                        int i3 = c6830Eai.A00;
                        while (i < i3) {
                            byte b2 = bArr2[i];
                            for (byte b3 : bArrA0A) {
                                if (b2 == b3) {
                                    return (i - c6830Eai.A01) + j3;
                                }
                            }
                            i++;
                        }
                        j3 += i3 - r5;
                        c6830Eai = c6830Eai.A02;
                        C7384Etj.A0X(c6830Eai);
                        j2 = j3;
                    }
                }
            } else {
                while (true) {
                    long j5 = (c6830Eai.A00 - c6830Eai.A01) + j3;
                    if (j5 > j) {
                        break;
                    }
                    c6830Eai = c6830Eai.A02;
                    C7384Etj.A0X(c6830Eai);
                    j3 = j5;
                }
                if (c6788EZx.A0C() == 2) {
                    byte bA0B3 = c6788EZx.A0B(0);
                    byte bA0B4 = c6788EZx.A0B(1);
                    while (j3 < this.A00) {
                        byte[] bArr3 = c6830Eai.A06;
                        i = (int) ((c6830Eai.A01 + j2) - j3);
                        int i4 = c6830Eai.A00;
                        while (i < i4) {
                            byte b4 = bArr3[i];
                            if (b4 == bA0B3 || b4 == bA0B4) {
                                return (i - c6830Eai.A01) + j3;
                            }
                            i++;
                        }
                        j3 += c6830Eai.A00 - c6830Eai.A01;
                        c6830Eai = c6830Eai.A02;
                        C7384Etj.A0X(c6830Eai);
                        j2 = j3;
                    }
                } else {
                    byte[] bArrA0A2 = c6788EZx.A0A();
                    while (j3 < this.A00) {
                        byte[] bArr4 = c6830Eai.A06;
                        i = (int) ((c6830Eai.A01 + j2) - j3);
                        int i5 = c6830Eai.A00;
                        while (i < i5) {
                            byte b5 = bArr4[i];
                            for (byte b6 : bArrA0A2) {
                                if (b5 == b6) {
                                    return (i - c6830Eai.A01) + j3;
                                }
                            }
                            i++;
                        }
                        j3 += c6830Eai.A00 - c6830Eai.A01;
                        c6830Eai = c6830Eai.A02;
                        C7384Etj.A0X(c6830Eai);
                        j2 = j3;
                    }
                }
            }
        }
        return -1L;
    }

    public final void A09(int i) {
        long j;
        long j2;
        if (i < 128) {
            Aif(i);
            return;
        }
        if (i < 2048) {
            C6830Eai c6830EaiA06 = A06(2);
            byte[] bArr = c6830EaiA06.A06;
            int i2 = c6830EaiA06.A00;
            bArr[i2] = (byte) ((i >> 6) | 192);
            BV6.A0x(i & 63, bArr, 128, i2 + 1);
            c6830EaiA06.A00 = i2 + 2;
            j = this.A00;
            j2 = 2;
        } else {
            if (55296 <= i && i < 57344) {
                Aif(63);
                return;
            }
            if (i < 65536) {
                C6830Eai c6830EaiA062 = A06(3);
                byte[] bArr2 = c6830EaiA062.A06;
                int i3 = c6830EaiA062.A00;
                bArr2[i3] = (byte) ((i >> 12) | 224);
                BV6.A0x((i >> 6) & 63, bArr2, 128, i3 + 1);
                BV6.A0x(i & 63, bArr2, 128, i3 + 2);
                c6830EaiA062.A00 = i3 + 3;
                j = this.A00;
                j2 = 3;
            } else {
                if (i > 1114111) {
                    throw C60Q.A0U("Unexpected code point: 0x", AbstractC6789EZy.A00(i));
                }
                C6830Eai c6830EaiA063 = A06(4);
                byte[] bArr3 = c6830EaiA063.A06;
                int i4 = c6830EaiA063.A00;
                bArr3[i4] = (byte) ((i >> 18) | 240);
                BV6.A0x((i >> 12) & 63, bArr3, 128, i4 + 1);
                BV6.A0x((i >> 6) & 63, bArr3, 128, i4 + 2);
                BV6.A0x(i & 63, bArr3, 128, i4 + 3);
                c6830EaiA063.A00 = i4 + 4;
                j = this.A00;
                j2 = 4;
            }
        }
        this.A00 = j + j2;
    }

    @Override // X.EcA
    /* renamed from: A0A, reason: merged with bridge method [inline-methods] */
    public final void Ail(long j) {
        if (j == 0) {
            Aif(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        C6830Eai c6830EaiA06 = A06(i);
        byte[] bArr = c6830EaiA06.A06;
        int i2 = c6830EaiA06.A00;
        int i3 = i2 + i;
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            bArr[i4] = AbstractC6827Eaf.A00[(int) (15 & j)];
            j >>>= 4;
        }
        c6830EaiA06.A00 = i3;
        this.A00 += i;
    }

    public final void A0B(String str, int i, int i2) {
        long j;
        long j2;
        if (i < 0) {
            throw new IllegalArgumentException(FGI.A0H("beginIndex < 0: ", i));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(FGI.A0T("endIndex < beginIndex: ", " < ", i2, i));
        }
        int length = str.length();
        if (i2 > length) {
            throw new IllegalArgumentException(FGI.A0T("endIndex > string.length: ", " > ", i2, length));
        }
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '\u0080') {
                C6830Eai c6830EaiA06 = A06(1);
                byte[] bArr = c6830EaiA06.A06;
                int i3 = c6830EaiA06.A00 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                while (true) {
                    bArr[i + i3] = (byte) cCharAt;
                    i = i4;
                    if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= '\u0080') {
                        break;
                    } else {
                        i4++;
                    }
                }
                int i5 = c6830EaiA06.A00;
                int i6 = (i3 + i4) - i5;
                c6830EaiA06.A00 = i5 + i6;
                this.A00 += i6;
            } else {
                if (cCharAt < '\u0800') {
                    C6830Eai c6830EaiA062 = A06(2);
                    byte[] bArr2 = c6830EaiA062.A06;
                    int i7 = c6830EaiA062.A00;
                    bArr2[i7] = (byte) ((cCharAt >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt & '?') | 128);
                    c6830EaiA062.A00 = i7 + 2;
                    j = this.A00;
                    j2 = 2;
                } else if (cCharAt < '\ud800' || cCharAt > '\udfff') {
                    C6830Eai c6830EaiA063 = A06(3);
                    byte[] bArr3 = c6830EaiA063.A06;
                    int i8 = c6830EaiA063.A00;
                    bArr3[i8] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                    bArr3[i8 + 2] = (byte) ((cCharAt & '?') | 128);
                    c6830EaiA063.A00 = i8 + 3;
                    j = this.A00;
                    j2 = 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt2 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt > '\udbff' || '\udc00' > cCharAt2 || cCharAt2 >= '\ue000') {
                        Aif(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt & '\u03ff') << 10) | (cCharAt2 & '\u03ff')) + 65536;
                        C6830Eai c6830EaiA064 = A06(4);
                        byte[] bArr4 = c6830EaiA064.A06;
                        int i11 = c6830EaiA064.A00;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        c6830EaiA064.A00 = i11 + 4;
                        this.A00 += 4;
                        i += 2;
                    }
                }
                this.A00 = j + j2;
                i++;
            }
        }
    }

    @Override // X.InterfaceC6831Eaj
    public final boolean AB9() {
        return AnonymousClass002.A1M((this.A00 > 0L ? 1 : (this.A00 == 0L ? 0 : -1)));
    }

    @Override // X.InterfaceC6831Eaj
    public final byte[] AZA() {
        return AZB(this.A00);
    }

    @Override // X.InterfaceC6831Eaj
    public final byte[] AZB(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(FGI.A0B(j, "byteCount: "));
        }
        if (this.A00 < j) {
            throw new EOFException();
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int iA03 = A03(bArr, i2, i - i2);
            if (iA03 == -1) {
                throw new EOFException();
            }
            i2 += iA03;
        }
        return bArr;
    }

    @Override // X.InterfaceC6831Eaj
    public final C6788EZx AZC(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(FGI.A0B(j, "byteCount: "));
        }
        if (this.A00 < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new C6788EZx(AZB(j));
        }
        C6788EZx c6788EZxA01 = A01((int) j);
        Afk(j);
        return c6788EZxA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005f A[EDGE_INSN: B:43:0x005f->B:32:0x005f BREAK  A[LOOP:0: B:5:0x000c->B:45:?], SYNTHETIC] */
    @Override // X.InterfaceC6831Eaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long AZN() throws java.io.EOFException {
        /*
            r15 = this;
            long r1 = r15.A00
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto Lac
            r4 = 0
            r5 = 0
            r12 = 0
        Lc:
            X.Eai r8 = r15.A01
            X.C7384Etj.A0X(r8)
            byte[] r9 = r8.A06
            int r7 = r8.A01
            int r3 = r8.A00
        L17:
            if (r7 >= r3) goto L4e
            r2 = r9[r7]
            r0 = 48
            if (r2 < r0) goto L4b
            r0 = 57
            if (r2 > r0) goto L35
            int r1 = r2 + (-48)
        L25:
            r10 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r10 = r10 & r5
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 != 0) goto L69
            r0 = 4
            long r5 = r5 << r0
            long r0 = (long) r1
            long r5 = r5 | r0
            int r7 = r7 + 1
            int r4 = r4 + 1
            goto L17
        L35:
            r0 = 97
            if (r2 < r0) goto L40
            r0 = 102(0x66, float:1.43E-43)
            if (r2 > r0) goto L4b
            int r1 = r2 + (-87)
            goto L25
        L40:
            r0 = 65
            if (r2 < r0) goto L4b
            r0 = 70
            if (r2 > r0) goto L4b
            int r1 = r2 + (-55)
            goto L25
        L4b:
            if (r4 == 0) goto L87
            r12 = 1
        L4e:
            if (r7 != r3) goto L66
            X.Eai r0 = r8.A01()
            r15.A01 = r0
            X.AbstractC6826Eae.A01(r8)
        L59:
            if (r12 != 0) goto L5f
            X.Eai r0 = r15.A01
            if (r0 != 0) goto Lc
        L5f:
            long r2 = r15.A00
            long r0 = (long) r4
            long r2 = r2 - r0
            r15.A00 = r2
            return r5
        L66:
            r8.A01 = r7
            goto L59
        L69:
            X.EaW r4 = new X.EaW
            r4.<init>()
            r4.Ail(r5)
            r4.Aif(r2)
            java.lang.String r3 = "Number too large: "
            long r1 = r4.A00
            java.nio.charset.Charset r0 = X.DCl.A05
            java.lang.String r0 = A00(r0, r4, r1)
            java.lang.String r0 = X.FGI.A0M(r3, r0)
            java.lang.NumberFormatException r0 = X.BV6.A0k(r0)
            throw r0
        L87:
            java.lang.String r4 = "Expected leading [0-9a-fA-F] character but was 0x"
            char[] r1 = X.AbstractC6790EZz.A00
            int r0 = r2 >> 4
            r0 = r0 & 15
            char r3 = r1[r0]
            r0 = r2 & 15
            char r2 = r1[r0]
            r0 = 2
            char[] r1 = new char[r0]
            r0 = 0
            r1[r0] = r3
            r0 = 1
            r1[r0] = r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            java.lang.String r0 = X.FGI.A0M(r4, r0)
            java.lang.NumberFormatException r0 = X.BV6.A0k(r0)
            throw r0
        Lac:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6818EaW.AZN():long");
    }

    @Override // X.InterfaceC6831Eaj
    public final String AZb(long j) throws EOFException {
        if (j < 0) {
            throw BV5.A0R("limit < 0: ", j);
        }
        long j2 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        if (j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            j2 = j + 1;
        }
        long jA04 = A04((byte) 10, 0L, j2);
        if (jA04 != -1) {
            return AbstractC6827Eaf.A01(this, jA04);
        }
        if (j2 < this.A00 && A02(j2 - 1) == 13 && A02(j2) == 10) {
            return AbstractC6827Eaf.A01(this, j2);
        }
        C6818EaW c6818EaW = new C6818EaW();
        A0C(c6818EaW, 0L, Math.min(32L, this.A00));
        StringBuilder sbA0x = C60O.A0x("\\n not found: limit=");
        sbA0x.append(Math.min(this.A00, j));
        sbA0x.append(" content=");
        sbA0x.append(c6818EaW.AZC(c6818EaW.A00).A06());
        throw new EOFException(C8j3.A16(sbA0x, '\u2026'));
    }

    @Override // X.InterfaceC6831Eaj
    public final boolean Ab8(long j) {
        return C8j3.A1Q((this.A00 > j ? 1 : (this.A00 == j ? 0 : -1)));
    }

    @Override // X.InterfaceC6831Eaj
    public final void AbC(long j) throws EOFException {
        if (this.A00 < j) {
            throw new EOFException();
        }
    }

    @Override // X.InterfaceC6831Eaj
    public final void Afk(long j) throws EOFException {
        while (j > 0) {
            C6830Eai c6830Eai = this.A01;
            if (c6830Eai == null) {
                throw new EOFException();
            }
            int i = c6830Eai.A00;
            int i2 = c6830Eai.A01;
            int iMin = (int) Math.min(j, i - i2);
            long j2 = iMin;
            this.A00 -= j2;
            j -= j2;
            int i3 = i2 + iMin;
            c6830Eai.A01 = i3;
            if (i3 == i) {
                this.A01 = c6830Eai.A01();
                AbstractC6826Eae.A01(c6830Eai);
            }
        }
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return C6848Eb1.A03;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C6818EaW c6818EaW = new C6818EaW();
        if (this.A00 != 0) {
            C6830Eai c6830Eai = this.A01;
            C7384Etj.A0X(c6830Eai);
            C6830Eai c6830EaiA02 = c6830Eai.A02();
            c6818EaW.A01 = c6830EaiA02;
            c6830EaiA02.A03 = c6830EaiA02;
            c6830EaiA02.A02 = c6830EaiA02;
            for (C6830Eai c6830Eai2 = c6830Eai.A02; c6830Eai2 != c6830Eai; c6830Eai2 = c6830Eai2.A02) {
                C6830Eai c6830Eai3 = c6830EaiA02.A03;
                C7384Etj.A0X(c6830Eai3);
                C7384Etj.A0X(c6830Eai2);
                c6830Eai3.A03(c6830Eai2.A02());
            }
            c6818EaW.A00 = this.A00;
        }
        return c6818EaW;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6818EaW) {
                long j = this.A00;
                C6818EaW c6818EaW = (C6818EaW) obj;
                if (j == c6818EaW.A00) {
                    if (j != 0) {
                        C6830Eai c6830Eai = this.A01;
                        C7384Etj.A0X(c6830Eai);
                        C6830Eai c6830Eai2 = c6818EaW.A01;
                        C7384Etj.A0X(c6830Eai2);
                        int i = c6830Eai.A01;
                        int i2 = c6830Eai2.A01;
                        long j2 = 0;
                        while (j2 < this.A00) {
                            long jA0F = C8j3.A0F(c6830Eai2.A00, i2, c6830Eai.A00 - i);
                            long j3 = 0;
                            while (j3 < jA0F) {
                                int i3 = i + 1;
                                int i4 = i2 + 1;
                                if (c6830Eai.A06[i] == c6830Eai2.A06[i2]) {
                                    j3++;
                                    i = i3;
                                    i2 = i4;
                                }
                            }
                            if (i == c6830Eai.A00) {
                                c6830Eai = c6830Eai.A02;
                                C7384Etj.A0X(c6830Eai);
                                i = c6830Eai.A01;
                            }
                            if (i2 == c6830Eai2.A00) {
                                c6830Eai2 = c6830Eai2.A02;
                                C7384Etj.A0X(c6830Eai2);
                                i2 = c6830Eai2.A01;
                            }
                            j2 += jA0F;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C6830Eai c6830Eai = this.A01;
        int i = 1;
        if (c6830Eai == null) {
            return 0;
        }
        do {
            int i2 = c6830Eai.A00;
            for (int i3 = c6830Eai.A01; i3 < i2; i3++) {
                i = (i * 31) + c6830Eai.A06[i3];
            }
            c6830Eai = c6830Eai.A02;
            C7384Etj.A0X(c6830Eai);
        } while (c6830Eai != this.A01);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // X.InterfaceC6831Eaj
    public final byte readByte() {
        if (this.A00 == 0) {
            throw new EOFException();
        }
        C6830Eai c6830Eai = this.A01;
        C7384Etj.A0X(c6830Eai);
        int i = c6830Eai.A01;
        int i2 = c6830Eai.A00;
        int i3 = i + 1;
        byte b = c6830Eai.A06[i];
        this.A00--;
        if (i3 != i2) {
            c6830Eai.A01 = i3;
            return b;
        }
        this.A01 = c6830Eai.A01();
        AbstractC6826Eae.A01(c6830Eai);
        return b;
    }

    @Override // X.InterfaceC6831Eaj
    public final int readInt() throws EOFException {
        if (this.A00 < 4) {
            throw new EOFException();
        }
        C6830Eai c6830Eai = this.A01;
        C7384Etj.A0X(c6830Eai);
        int i = c6830Eai.A01;
        int i2 = c6830Eai.A00;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c6830Eai.A06;
        int i3 = i + 4;
        int i4 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        this.A00 -= 4;
        if (i3 != i2) {
            c6830Eai.A01 = i3;
            return i4;
        }
        this.A01 = c6830Eai.A01();
        AbstractC6826Eae.A01(c6830Eai);
        return i4;
    }

    @Override // X.InterfaceC6831Eaj
    public final short readShort() throws EOFException {
        int i;
        if (this.A00 < 2) {
            throw new EOFException();
        }
        C6830Eai c6830Eai = this.A01;
        C7384Etj.A0X(c6830Eai);
        int i2 = c6830Eai.A01;
        int i3 = c6830Eai.A00;
        if (i3 - i2 < 2) {
            i = ((readByte() & 255) << 8) | (readByte() & 255);
        } else {
            byte[] bArr = c6830Eai.A06;
            int i4 = i2 + 1;
            int iA0D = BV6.A0D(bArr, i2);
            int i5 = i2 + 2;
            i = (bArr[i4] & 255) | iA0D;
            this.A00 -= 2;
            if (i5 == i3) {
                this.A01 = c6830Eai.A01();
                AbstractC6826Eae.A01(c6830Eai);
            } else {
                c6830Eai.A01 = i5;
            }
        }
        return (short) i;
    }

    public final String toString() {
        long j = this.A00;
        if (j <= 2147483647L) {
            return A01((int) j).toString();
        }
        throw C3cG.A0Q(FGI.A0B(j, "size > Int.MAX_VALUE: "));
    }

    @Override // X.InterfaceC6831Eaj
    public final String AZa() {
        return AZb(LinkEncryptedPairingKt.LINK_COUNTER_MAX);
    }
}
