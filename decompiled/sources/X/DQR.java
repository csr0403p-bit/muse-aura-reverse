package X;

import com.google.common.base.Objects;

/* loaded from: classes5.dex */
public abstract class DQR {
    public static Object A02(int buckets) {
        if (buckets < 2 || buckets > 1073741824 || Integer.highestOneBit(buckets) != buckets) {
            throw BV5.A0Q(AbstractC7606F5t.A00(46), buckets);
        }
        return buckets <= 256 ? new byte[buckets] : buckets <= 65536 ? new short[buckets] : new int[buckets];
    }

    public static int A00(Object table, int index) {
        return table instanceof byte[] ? ((byte[]) table)[index] & 255 : table instanceof short[] ? ((short[]) table)[index] & 65535 : ((int[]) table)[index];
    }

    public static void A03(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
        } else if (table instanceof short[]) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }

    public static int A01(Object key, Object value, Object mask, int[] table, Object[] entries, Object[] keys, int values) {
        int i;
        int i2;
        int iA01 = DNI.A01(AnonymousClass006.A0D(key));
        int i3 = iA01 & values;
        int iA00 = A00(mask, i3);
        if (iA00 != 0) {
            int i4 = values ^ (-1);
            int i5 = iA01 & i4;
            int i6 = -1;
            while (true) {
                i = iA00 - 1;
                i2 = table[i];
                if ((i2 & i4) != i5 || !Objects.equal(key, entries[i]) || (keys != null && !Objects.equal(value, keys[i]))) {
                    iA00 = i2 & values;
                    if (iA00 == 0) {
                        break;
                    }
                    i6 = i;
                } else {
                    break;
                }
            }
            int i7 = i2 & values;
            if (i6 == -1) {
                A03(mask, i3, i7);
                return i;
            }
            table[i6] = (table[i6] & i4) | (i7 & values);
            return i;
        }
        return -1;
    }
}
