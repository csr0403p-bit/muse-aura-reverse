package com.facebook.aura.pairs;

import X.AbstractC0903AHf;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.pairs.WireValue;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class PairsWireReader {
    public static final int $stable = 0;
    public static final PairsWireReader INSTANCE = new PairsWireReader();

    public final Map<Long, WireValue> fields(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        HashMap map = new HashMap();
        int iA0F = 0;
        while (true) {
            int length = bArr.length;
            if (iA0F >= length) {
                return map;
            }
            HxE<Long, Integer> varint = readVarint(bArr, iA0F);
            if (varint == null) {
                break;
            }
            long jA05 = C3cG.A05(varint.first);
            int iA0F2 = AnonymousClass001.A0F(varint.second);
            long j = jA05 >>> 3;
            if (j <= 0) {
                break;
            }
            long j2 = jA05 & 7;
            if (j2 == 0) {
                HxE<Long, Integer> varint2 = readVarint(bArr, iA0F2);
                if (varint2 == null) {
                    break;
                }
                long jA052 = C3cG.A05(varint2.first);
                iA0F = AnonymousClass001.A0F(varint2.second);
                map.put(Long.valueOf(j), new WireValue.Varint(jA052));
            } else if (j2 == 1) {
                if (length - iA0F2 < 8) {
                    break;
                }
                iA0F = iA0F2 + 8;
            } else if (j2 == 2) {
                HxE<Long, Integer> varint3 = readVarint(bArr, iA0F2);
                if (varint3 == null) {
                    break;
                }
                long jA053 = C3cG.A05(varint3.first);
                int iA0F3 = AnonymousClass001.A0F(varint3.second);
                if (jA053 < 0 || jA053 > length - iA0F3) {
                    break;
                }
                iA0F = ((int) jA053) + iA0F3;
                map.put(Long.valueOf(j), new WireValue.Bytes(AbstractC0903AHf.A06(bArr, iA0F3, iA0F)));
            } else {
                if (j2 != 5 || length - iA0F2 < 4) {
                    break;
                }
                iA0F = iA0F2 + 4;
            }
        }
        return null;
    }

    private final HxE<Long, Integer> readVarint(byte[] bArr, int i) {
        long j = 0;
        for (int i2 = 0; i2 < 10 && i < bArr.length; i2++) {
            byte b = bArr[i];
            i++;
            j |= (b & Byte.MAX_VALUE) << (i2 * 7);
            if ((b & 128) == 0) {
                return AnonymousClass002.A0p(Long.valueOf(j), i);
            }
        }
        return null;
    }
}
