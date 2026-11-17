package com.facebook.aura.pairs;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.DCl;
import X.FGI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Bech32m {
    public static final String ALPHABET = "qpzry9x8gf2tvdw0s3jn54khce6mua7l";
    public static final int CHECKSUM_CONSTANT = 734539939;
    public static final int CHECKSUM_LENGTH = 6;
    public static final Bech32m INSTANCE = new Bech32m();
    public static final int[] GENERATOR = {996825010, 642813549, 513874426, 1027748829, 705979059};

    private final List<Integer> fiveBitGroups(byte[] bArr) {
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            i2 = ((i2 << 8) | (b & 255)) & 4095;
            i += 8;
            while (i >= 5) {
                i -= 5;
                C60Q.A1P(arrayListA0h, (i2 >>> i) & 31);
            }
        }
        if (i > 0) {
            C60Q.A1P(arrayListA0h, (i2 << (5 - i)) & 31);
        }
        return arrayListA0h;
    }

    private final int polymod(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int iA03 = 1;
        while (it.hasNext()) {
            int i = iA03 >>> 25;
            iA03 = ((iA03 & 33554431) << 5) ^ C60Q.A03(it);
            int[] iArr = GENERATOR;
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (((i >>> i2) & 1) == 1) {
                    iA03 ^= iArr[i2];
                }
            }
        }
        return iA03;
    }

    public final String encode(String str, byte[] bArr) {
        boolean zA1b = AnonymousClass004.A1b(str, bArr);
        byte[] bytes = str.getBytes(DCl.A01);
        ArrayList arrayListA11 = C60O.A11(bytes.length);
        int i = 0;
        Integer numValueOf = Integer.valueOf(zA1b ? 1 : 0);
        for (byte b : bytes) {
            C60Q.A1P(arrayListA11, b);
        }
        List<Integer> listFiveBitGroups = fiveBitGroups(bArr);
        ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA11);
        Iterator it = arrayListA11.iterator();
        while (it.hasNext()) {
            C60Q.A1P(arrayListA0m, C60Q.A03(it) >> 5);
        }
        ArrayList arrayListA0Q = AbstractC0878AGe.A0Q(numValueOf, arrayListA0m);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA11);
        Iterator it2 = arrayListA11.iterator();
        while (it2.hasNext()) {
            C60Q.A1P(arrayListA0m2, C60Q.A03(it2) & 31);
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(listFiveBitGroups, AbstractC0878AGe.A0P(arrayListA0m2, arrayListA0Q));
        ArrayList arrayListA112 = C60O.A11(6);
        int i2 = 0;
        do {
            arrayListA112.add(numValueOf);
            i2++;
        } while (i2 < 6);
        int iPolymod = polymod(AbstractC0878AGe.A0P(arrayListA112, arrayListA0P)) ^ CHECKSUM_CONSTANT;
        ArrayList arrayListA113 = C60O.A11(6);
        do {
            C60Q.A1P(arrayListA113, (iPolymod >>> ((5 - i) * 5)) & 31);
            i++;
        } while (i < 6);
        ArrayList arrayListA0P2 = AbstractC0878AGe.A0P(arrayListA113, listFiveBitGroups);
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(arrayListA0P2);
        Iterator it3 = arrayListA0P2.iterator();
        while (it3.hasNext()) {
            arrayListA0m3.add(Character.valueOf(ALPHABET.charAt(C60Q.A03(it3))));
        }
        return FGI.A0U(str, "1", AbstractC0878AGe.A0L("", "", "", arrayListA0m3, null));
    }
}
