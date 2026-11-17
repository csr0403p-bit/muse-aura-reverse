package X;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class Gn3 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public BitSet A04;
    public boolean A05;
    public boolean A06;
    public C10161GqW[] A07;
    public String[] A08;
    public final int A09;
    public final int A0A;
    public final Gn3 A0B;
    public final AtomicReference<C10081Gp2> A0C;
    public final C10002GnY A0D;

    public final Gn3 A00() {
        return new Gn3(this.A0D, this.A0C.get(), this, this.A09, this.A0A);
    }

    public final String A01(char[] cArr, int i, int i2, int i3) throws StreamConstraintsException {
        int i4;
        int iMax;
        if (i2 < 1) {
            return "";
        }
        if (!this.A05) {
            this.A0D.A04(i2);
            return new String(cArr, i, i2);
        }
        int i5 = i3 + (i3 >>> 15);
        int i6 = i5 ^ (i5 << 7);
        int i7 = (i6 + (i6 >>> 3)) & this.A00;
        String str = this.A08[i7];
        if (str != null) {
            if (str.length() == i2) {
                int i8 = 0;
                while (str.charAt(i8) == cArr[i + i8]) {
                    i8++;
                    if (i8 == i2) {
                        return str;
                    }
                }
            }
            C10161GqW c10161GqW = this.A07[i7 >> 1];
            if (c10161GqW != null) {
                String str2 = c10161GqW.A02;
                if (str2.length() == i2) {
                    int i9 = 0;
                    while (str2.charAt(i9) == cArr[i + i9]) {
                        i9++;
                        if (i9 >= i2) {
                            return str2;
                        }
                    }
                }
                while (true) {
                    c10161GqW = c10161GqW.A01;
                    if (c10161GqW == null) {
                        break;
                    }
                    String str3 = c10161GqW.A02;
                    if (str3.length() == i2) {
                        int i10 = 0;
                        while (str3.charAt(i10) == cArr[i + i10]) {
                            i10++;
                            if (i10 >= i2) {
                                return str3;
                            }
                        }
                    }
                }
            }
        }
        this.A0D.A04(i2);
        if (this.A06) {
            String[] strArr = this.A08;
            this.A08 = (String[]) Arrays.copyOf(strArr, strArr.length);
            C10161GqW[] c10161GqWArr = this.A07;
            this.A07 = (C10161GqW[]) Arrays.copyOf(c10161GqWArr, c10161GqWArr.length);
            this.A06 = false;
        } else if (this.A02 >= this.A03) {
            String[] strArr2 = this.A08;
            int length = strArr2.length;
            int i11 = length + length;
            if (i11 > 65536) {
                this.A02 = 0;
                this.A05 = false;
                this.A08 = new String[64];
                this.A07 = new C10161GqW[32];
                this.A00 = 63;
                i4 = 63;
                this.A06 = false;
            } else {
                C10161GqW[] c10161GqWArr2 = this.A07;
                this.A08 = new String[i11];
                this.A07 = new C10161GqW[i11 >> 1];
                i4 = i11 - 1;
                this.A00 = i4;
                this.A03 = i11 - (i11 >> 2);
                int i12 = 0;
                int iMax2 = 0;
                for (String str4 : strArr2) {
                    if (str4 != null) {
                        i12++;
                        int length2 = str4.length();
                        int iCharAt = this.A0A;
                        for (int i13 = 0; i13 < length2; i13++) {
                            iCharAt = (iCharAt * 33) + str4.charAt(i13);
                        }
                        if (iCharAt == 0) {
                            iCharAt = 1;
                        }
                        int i14 = iCharAt + (iCharAt >>> 15);
                        int i15 = i14 ^ (i14 << 7);
                        i4 = this.A00;
                        int i16 = (i15 + (i15 >>> 3)) & i4;
                        String[] strArr3 = this.A08;
                        if (strArr3[i16] == null) {
                            strArr3[i16] = str4;
                        } else {
                            int i17 = i16 >> 1;
                            C10161GqW[] c10161GqWArr3 = this.A07;
                            C10161GqW c10161GqW2 = new C10161GqW(c10161GqWArr3[i17], str4);
                            c10161GqWArr3[i17] = c10161GqW2;
                            iMax2 = Math.max(iMax2, c10161GqW2.A00);
                        }
                    }
                }
                int i18 = length >> 1;
                for (int i19 = 0; i19 < i18; i19++) {
                    for (C10161GqW c10161GqW3 = c10161GqWArr2[i19]; c10161GqW3 != null; c10161GqW3 = c10161GqW3.A01) {
                        i12++;
                        String str5 = c10161GqW3.A02;
                        int length3 = str5.length();
                        int iCharAt2 = this.A0A;
                        for (int i20 = 0; i20 < length3; i20++) {
                            iCharAt2 = (iCharAt2 * 33) + str5.charAt(i20);
                        }
                        if (iCharAt2 == 0) {
                            iCharAt2 = 1;
                        }
                        int i21 = iCharAt2 + (iCharAt2 >>> 15);
                        int i22 = i21 ^ (i21 << 7);
                        i4 = this.A00;
                        int i23 = (i22 + (i22 >>> 3)) & i4;
                        String[] strArr4 = this.A08;
                        if (strArr4[i23] == null) {
                            strArr4[i23] = str5;
                        } else {
                            int i24 = i23 >> 1;
                            C10161GqW[] c10161GqWArr4 = this.A07;
                            C10161GqW c10161GqW4 = new C10161GqW(c10161GqWArr4[i24], str5);
                            c10161GqWArr4[i24] = c10161GqW4;
                            iMax2 = Math.max(iMax2, c10161GqW4.A00);
                        }
                    }
                }
                this.A01 = iMax2;
                this.A04 = null;
                int i25 = this.A02;
                if (i12 != i25) {
                    throw BV5.A0W("Internal error on SymbolTable.rehash(): had %d entries; now have %d", BV5.A1Z(i25, i12));
                }
            }
            int i26 = this.A0A;
            int i27 = i2 + i;
            for (int i28 = i; i28 < i27; i28++) {
                i26 = (i26 * 33) + cArr[i28];
            }
            if (i26 == 0) {
                i26 = 1;
            }
            int i29 = i26 + (i26 >>> 15);
            int i30 = i29 ^ (i29 << 7);
            i7 = (i30 + (i30 >>> 3)) & i4;
        }
        String str6 = new String(cArr, i, i2);
        EnumC10039GoJ enumC10039GoJ = EnumC10039GoJ.INTERN_FIELD_NAMES;
        int i31 = this.A09;
        if (AbstractC7609F5w.A1U(i31, AbstractC7609F5w.A0F(enumC10039GoJ))) {
            str6 = HlK.A00.A00(str6);
        }
        int i32 = this.A02 + 1;
        this.A02 = i32;
        String[] strArr5 = this.A08;
        if (strArr5[i7] == null) {
            strArr5[i7] = str6;
            return str6;
        }
        int i33 = i7 >> 1;
        C10161GqW[] c10161GqWArr5 = this.A07;
        C10161GqW c10161GqW5 = new C10161GqW(c10161GqWArr5[i33], str6);
        int i34 = c10161GqW5.A00;
        if (i34 > 150) {
            BitSet bitSet = this.A04;
            if (bitSet == null) {
                bitSet = new BitSet();
                this.A04 = bitSet;
            } else {
                if (bitSet.get(i33)) {
                    if (AbstractC7609F5w.A1U(i31, AbstractC7609F5w.A0F(EnumC10039GoJ.FAIL_ON_SYMBOL_HASH_OVERFLOW))) {
                        throw new StreamConstraintsException(FGI.A0Y("Longest collision chain in symbol table (of size ", ") now exceeds maximum, ", " -- suspect a DoS attack based on hash collisions", i32, 150));
                    }
                    this.A05 = false;
                }
                this.A08[i7] = c10161GqW5.A02;
                this.A07[i33] = null;
                this.A02 -= i34;
                iMax = -1;
            }
            bitSet.set(i33);
            this.A08[i7] = c10161GqW5.A02;
            this.A07[i33] = null;
            this.A02 -= i34;
            iMax = -1;
        } else {
            c10161GqWArr5[i33] = c10161GqW5;
            iMax = Math.max(i34, this.A01);
        }
        this.A01 = iMax;
        return str6;
    }

    public Gn3(C10002GnY c10002GnY, int i, int i2) {
        this.A0B = null;
        this.A0A = i2;
        this.A0D = c10002GnY;
        this.A05 = true;
        this.A09 = i;
        this.A06 = false;
        this.A01 = 0;
        this.A0C = BV4.A16(new C10081Gp2(new C10161GqW[32], new String[64]));
    }

    public Gn3(C10002GnY c10002GnY, C10081Gp2 c10081Gp2, Gn3 gn3, int i, int i2) {
        this.A0B = gn3;
        this.A0D = c10002GnY;
        this.A0A = i2;
        this.A0C = null;
        this.A09 = i;
        this.A05 = AbstractC7609F5w.A1U(i, AbstractC7609F5w.A0F(EnumC10039GoJ.CANONICALIZE_FIELD_NAMES));
        String[] strArr = c10081Gp2.A03;
        this.A08 = strArr;
        this.A07 = c10081Gp2.A02;
        this.A02 = c10081Gp2.A01;
        this.A01 = c10081Gp2.A00;
        int length = strArr.length;
        this.A03 = length - (length >> 2);
        this.A00 = length - 1;
        this.A06 = true;
    }
}
