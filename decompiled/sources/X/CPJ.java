package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CPJ {
    public int A00;
    public long[] A01;
    public final int A02;
    public final CLq A03;
    public final CMN[] A04;

    public static int A02(CPJ cpj, CMM cmm, int[] iArr, int i, int i2, int i3) {
        int iA01;
        CMN cmn;
        int i4 = i;
        int i5 = iArr[i];
        if (i5 >= cpj.A02 || (cmn = cpj.A04[i5]) == null) {
            cpj.A03.A03(cmm, i5);
            iA01 = CLp.A01(cmm, 16);
        } else {
            iA01 = CLp.A01(CMN.A00(cmn), 16);
        }
        if (iA01 == i3) {
            i4 = i + 1;
        }
        int iA02 = 1;
        if (i4 < i2) {
            while (true) {
                int i6 = i4;
                if (i4 >= i2) {
                    break;
                }
                int iA012 = A01(cpj, cmm, iArr[i4], i3);
                int i7 = iA02 + 1;
                while (i4 < i2 && A01(cpj, cmm, iArr[i4], i3) == iA012) {
                    i4++;
                }
                iA02 = i7 + A02(cpj, cmm, iArr, i6, i4, i3 + 1);
            }
        }
        return iA02;
    }

    public static int A00(CPM cpm, CPJ cpj, CMM cmm, int[] iArr, int i, int i2, int i3, int i4) {
        char c;
        int iA01;
        int i5;
        CMN cmn;
        CMN cmn2;
        CMN cmn3;
        int i6 = i;
        int i7 = iArr[i];
        int i8 = cpj.A02;
        CMM cmmA00 = cmm;
        if (i7 >= i8 || (cmn3 = cpj.A04[i7]) == null) {
            cpj.A03.A03(cmmA00, i7);
            c = 16;
            iA01 = CLp.A01(cmmA00, 16);
        } else {
            CMM cmmA002 = CMN.A00(cmn3);
            c = 16;
            iA01 = CLp.A01(cmmA002, 16);
        }
        if (iA01 == i3) {
            i5 = iArr[i];
            i6 = i + 1;
        } else {
            i5 = -1;
        }
        int i9 = 0;
        while (i6 < i2) {
            int iA012 = A01(cpj, cmmA00, iArr[i6], i3);
            int i10 = i4 + (i9 * 4);
            int i11 = i10 + 4;
            int[] iArrCopyOf = cpm.A00;
            int length = iArrCopyOf.length;
            if (i11 > length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(length * 2, i11));
                cpm.A00 = iArrCopyOf;
            }
            iArrCopyOf[i10] = iA012;
            iArrCopyOf[i10 + 1] = i6;
            while (i6 < i2 && A01(cpj, cmmA00, iArr[i6], i3) == iA012) {
                i6++;
            }
            cpm.A00[i10 + 2] = i6;
            i9++;
        }
        int i12 = i4 + (i9 * 4);
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = i4 + (i13 * 4);
            int[] iArr2 = cpm.A00;
            cpm.A00[i14 + 3] = A00(cpm, cpj, cmmA00, iArr, iArr2[i14 + 1], iArr2[i14 + 2], i3 + 1, i12);
        }
        if (i5 >= 65534) {
            throw C3cG.A0Q(FGI.A0I("MetadataRepo dataIndex overflow: ", i5, ". Flat Trie serialization supports at most 65,534 emojis."));
        }
        int i15 = cpj.A00;
        long j = ((i5 + 1) << c) | (65535 & i9);
        if (i5 >= 0) {
            CMM cmmA003 = cmmA00;
            if (i5 >= i8 || (cmn2 = cpj.A04[i5]) == null) {
                cpj.A03.A03(cmmA00, i5);
            } else {
                cmmA003 = CMN.A00(cmn2);
            }
            int iA02 = cmmA003.A02(10);
            long j2 = iA02 != 0 ? cmmA003.A04.getShort(iA02 + cmmA003.A00) : (short) 0;
            if (i5 >= i8 || (cmn = cpj.A04[i5]) == null) {
                cpj.A03.A03(cmmA00, i5);
            } else {
                cmmA00 = CMN.A00(cmn);
            }
            int iA022 = cmmA00.A02(6);
            j = j | ((65535 & j2) << 32) | (((iA022 == 0 || cmmA00.A04.get(iA022 + cmmA00.A00) == 0) ? 0L : 1L) << 48);
        }
        long[] jArr = cpj.A01;
        int i16 = cpj.A00;
        int i17 = i16 + 1;
        cpj.A00 = i17;
        jArr[i16] = j;
        for (int i18 = 0; i18 < i9; i18++) {
            int i19 = i4 + (i18 * 4);
            int[] iArr3 = cpm.A00;
            int i20 = i17;
            i17++;
            cpj.A00 = i17;
            jArr[i20] = (iArr3[i19 + 3] & 4294967295L) | (iArr3[i19] << 32);
        }
        return i15;
    }

    public static int A01(CPJ cpj, CMM cmm, int i, int i2) {
        CMN cmn;
        if (i < cpj.A02 && (cmn = cpj.A04[i]) != null) {
            return CMN.A00(cmn).A03(i2);
        }
        cpj.A03.A03(cmm, i);
        return cmm.A03(i2);
    }

    public CPJ(CLq cLq, CMN[] cmnArr, int i) {
        this.A03 = cLq;
        this.A04 = cmnArr;
        this.A02 = i;
    }
}
