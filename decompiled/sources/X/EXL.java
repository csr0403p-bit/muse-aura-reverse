package X;

import com.facebook.aura.gateway.connection.ConnectionEngineKt;
import com.facebook.aura.partners.voice.viewmodel.RtcPreviewPlayoutKt;
import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public abstract class EXL {
    public static final BigInteger A00 = BigInteger.valueOf(5);
    public static final BigInteger A02 = BigInteger.valueOf(10000000000000000L);
    public static final BigInteger A01 = BigInteger.valueOf(152587890625L);
    public static final BigInteger[] A03 = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(RtcPreviewPlayoutKt.FRAME_INTERVAL_NANOS), BigInteger.valueOf(100000000), BigInteger.valueOf(1000000000), BigInteger.valueOf(ConnectionEngineKt.NETWORK_RECOVERY_MIN_GAP_NS), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    public static BigInteger A00(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        BigInteger[] bigIntegerArr = A03;
        if (i < 16) {
            return bigIntegerArr[i];
        }
        if (navigableMap == null) {
            return A00.pow(i).shiftLeft(i);
        }
        Map.Entry<Integer, BigInteger> entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i));
        int iA0N = BV7.A0N(entryFloorEntry);
        BigInteger value = entryFloorEntry.getValue();
        return iA0N != i ? EZI.A05(value, A00(navigableMap, i - iA0N)) : value;
    }

    public static BigInteger A01(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        int i2 = i & (-16);
        Map.Entry<Integer, BigInteger> entryFloorEntry = navigableMap.floorEntry(Integer.valueOf(i2));
        int iA0N = BV7.A0N(entryFloorEntry);
        BigInteger value = entryFloorEntry.getValue();
        if (iA0N == i2) {
            return value;
        }
        int i3 = i2 - iA0N;
        Integer numValueOf = Integer.valueOf(i3);
        BigInteger bigIntegerA01 = navigableMap.get(numValueOf);
        if (bigIntegerA01 == null) {
            bigIntegerA01 = A01(navigableMap, i3);
            navigableMap.put(numValueOf, bigIntegerA01);
        }
        return EZI.A05(value, bigIntegerA01);
    }

    public static NavigableMap<Integer, BigInteger> A02() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(BV4.A0V(), BigInteger.ONE);
        treeMap.put(16, A02);
        return treeMap;
    }

    public static void A03(NavigableMap<Integer, BigInteger> navigableMap, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 18) {
            int i4 = i2 - (((i3 + 31) >>> 5) << 4);
            int i5 = i2 - i4;
            Integer numValueOf = Integer.valueOf(i5);
            if (navigableMap.containsKey(numValueOf)) {
                return;
            }
            A03(navigableMap, i, i4);
            A03(navigableMap, i4, i2);
            navigableMap.put(numValueOf, A01(navigableMap, i5));
        }
    }
}
