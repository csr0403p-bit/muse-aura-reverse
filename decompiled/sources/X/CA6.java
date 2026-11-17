package X;

import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class CA6 implements DS5 {
    public static final ConcurrentMap<File, CA6> A0A = C60O.A1C();
    public static volatile boolean A0B;
    public File A00;
    public final C1685AoO<Boolean> A01 = new C1685AoO<>();
    public final C1685AoO<Double> A02 = new C1685AoO<>();
    public final C1685AoO<Long> A03 = new C1685AoO<>();
    public final C1685AoO<String> A04 = new C1685AoO<>();
    public final Set<Long> A06 = C60O.A13();
    public final Map<Integer, long[][]> A07 = BV4.A0u();
    public final Map<Integer, F18<C3143BzU>> A05 = BV4.A0u();
    public volatile boolean A08 = false;
    public volatile boolean A09 = false;

    public final synchronized void A04(F18 f18, int i) {
        Map<Integer, long[][]> map = this.A07;
        Integer numValueOf = Integer.valueOf(i);
        map.put(numValueOf, null);
        this.A05.put(numValueOf, f18);
        A03();
    }

    public static long A00(long j) {
        return (0 << 62) | (0 << 61) | (((int) ((j >>> 54) & 63)) << 54) | (((int) ((j >>> 48) & 63)) << 48) | (0 << 16) | ((int) (j & 65535));
    }

    public static CA6 A01(File file) {
        CA6 ca6PutIfAbsent;
        ConcurrentMap<File, CA6> concurrentMap = A0A;
        CA6 ca6 = concurrentMap.get(file);
        return (ca6 != null || (ca6PutIfAbsent = concurrentMap.putIfAbsent(file, (ca6 = new CA6(file)))) == null) ? ca6 : ca6PutIfAbsent;
    }

    private void A02(long j) {
        this.A07.get(Integer.valueOf((int) ((j >>> 54) & 63)));
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0216 A[Catch: all -> 0x02dd, NullPointerException | NumberFormatException | JSONException -> 0x0304, NullPointerException | NumberFormatException | JSONException -> 0x0304, NullPointerException | NumberFormatException | JSONException -> 0x0304, TryCatch #0 {NullPointerException | NumberFormatException | JSONException -> 0x0304, blocks: (B:8:0x003b, B:10:0x004c, B:12:0x0052, B:15:0x0060, B:17:0x0068, B:18:0x0078, B:20:0x007e, B:22:0x008a, B:24:0x0099, B:25:0x00a4, B:37:0x00dc, B:37:0x00dc, B:37:0x00dc, B:38:0x00dd, B:38:0x00dd, B:38:0x00dd, B:39:0x00e4, B:39:0x00e4, B:39:0x00e4, B:47:0x0112, B:47:0x0112, B:47:0x0112, B:48:0x0113, B:48:0x0113, B:48:0x0113, B:54:0x011d, B:54:0x011d, B:54:0x011d, B:56:0x011f, B:56:0x011f, B:56:0x011f, B:58:0x0125, B:58:0x0125, B:58:0x0125, B:60:0x0133, B:60:0x0133, B:60:0x0133, B:64:0x014b, B:64:0x014b, B:64:0x014b, B:83:0x01ba, B:83:0x01ba, B:83:0x01ba, B:84:0x01c2, B:84:0x01c2, B:84:0x01c2, B:86:0x01c8, B:86:0x01c8, B:86:0x01c8, B:88:0x01de, B:88:0x01de, B:88:0x01de, B:90:0x01ea, B:90:0x01ea, B:90:0x01ea, B:92:0x01f0, B:92:0x01f0, B:92:0x01f0, B:93:0x0210, B:93:0x0210, B:93:0x0210, B:95:0x0216, B:95:0x0216, B:95:0x0216, B:96:0x021f, B:96:0x021f, B:96:0x021f, B:98:0x0225, B:98:0x0225, B:98:0x0225, B:99:0x023c, B:99:0x023c, B:99:0x023c, B:101:0x0242, B:101:0x0242, B:101:0x0242, B:105:0x024f, B:105:0x024f, B:105:0x024f, B:111:0x0261, B:111:0x0261, B:111:0x0261, B:113:0x026c, B:113:0x026c, B:113:0x026c, B:114:0x027e, B:114:0x027e, B:114:0x027e, B:120:0x0289, B:120:0x0289, B:120:0x0289, B:124:0x02d2, B:124:0x02d2, B:124:0x02d2, B:121:0x029c, B:121:0x029c, B:121:0x029c, B:123:0x02c0, B:123:0x02c0, B:123:0x02c0, B:122:0x02aa, B:122:0x02aa, B:122:0x02aa, B:107:0x0253, B:107:0x0253, B:107:0x0253, B:109:0x0259, B:109:0x0259, B:109:0x0259, B:125:0x02d5, B:125:0x02d5, B:125:0x02d5, B:126:0x02d9, B:126:0x02d9, B:126:0x02d9, B:70:0x015e, B:70:0x015e, B:70:0x015e, B:72:0x0164, B:72:0x0164, B:72:0x0164, B:73:0x016c, B:73:0x016c, B:73:0x016c, B:75:0x0172, B:75:0x0172, B:75:0x0172, B:77:0x0184, B:77:0x0184, B:77:0x0184, B:79:0x0190, B:79:0x0190, B:79:0x0190, B:81:0x0196, B:81:0x0196, B:81:0x0196, B:82:0x01b7, B:82:0x01b7, B:82:0x01b7, B:63:0x0141, B:63:0x0141, B:63:0x0141, B:69:0x0158, B:69:0x0158, B:69:0x0158), top: B:169:0x003b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A03() {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CA6.A03():void");
    }

    @Override // X.DS5
    public final boolean boolOverrideForParam(long j, boolean z) {
        if (!this.A08) {
            return z;
        }
        synchronized (this) {
            A02(j);
            Boolean boolA04 = this.A01.A04(A00(j));
            if (boolA04 != null) {
                z = boolA04.booleanValue();
            }
        }
        return z;
    }

    @Override // X.DS5
    public final double doubleOverrideForParam(long j, double d) {
        if (!this.A08) {
            return d;
        }
        synchronized (this) {
            A02(j);
            Double dA04 = this.A02.A04(A00(j));
            if (dA04 != null) {
                d = dA04.doubleValue();
            }
        }
        return d;
    }

    @Override // X.DS5
    public final boolean hasBoolOverrideForParam(long j) {
        boolean z;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long jA00 = A00(j);
            z = this.A01.A04(jA00) != null || this.A06.contains(Long.valueOf(jA00));
        }
        return z;
    }

    @Override // X.DS5
    public final boolean hasDoubleOverrideForParam(long j) {
        boolean z;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long jA00 = A00(j);
            z = this.A02.A04(jA00) != null || this.A06.contains(Long.valueOf(jA00));
        }
        return z;
    }

    @Override // X.DS5
    public final boolean hasIntOverrideForParam(long j) {
        boolean z;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long jA00 = A00(j);
            z = this.A03.A04(jA00) != null || this.A06.contains(Long.valueOf(jA00));
        }
        return z;
    }

    @Override // X.DS5
    public final boolean hasNullOverrideForParam(long j) {
        boolean zContains;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A02(j);
            zContains = this.A06.contains(Long.valueOf(A00(j)));
        }
        return zContains;
    }

    @Override // X.DS5
    public final boolean hasOverridesFile() {
        return this.A09;
    }

    @Override // X.DS5
    public final boolean hasStringOverrideForParam(long j) {
        boolean z;
        if (!this.A08) {
            return false;
        }
        synchronized (this) {
            A02(j);
            long jA00 = A00(j);
            z = this.A04.A04(jA00) != null || this.A06.contains(Long.valueOf(jA00));
        }
        return z;
    }

    @Override // X.DS5
    public final long intOverrideForParam(long j, long j2) {
        if (!this.A08) {
            return j2;
        }
        synchronized (this) {
            A02(j);
            Long lA04 = this.A03.A04(A00(j));
            if (lA04 != null) {
                j2 = lA04.longValue();
            }
        }
        return j2;
    }

    @Override // X.DS5
    public final String stringOverrideForParam(long j, String str) {
        if (!this.A08) {
            return str;
        }
        synchronized (this) {
            A02(j);
            String strA04 = this.A04.A04(A00(j));
            if (strA04 != null) {
                str = strA04;
            }
        }
        return str;
    }

    public CA6(File file) {
        this.A00 = file;
    }

    @Override // X.DS5
    public final String experimentOverrideForUniverse(String str) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final String groupOverrideForUniverse(String str) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final boolean hasOverrideForUniverse(String str) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void removeAllOverrides() {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void removeOverrideForParam(long j) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void removeOverridesForQEUniverse(String str) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void updateOverrideForParam(long j, double d) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void updateOverrideForQE(String str, String str2, String str3) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void updateOverrideForParam(long j, long j2) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void updateOverrideForParam(long j, String str) {
        throw C8j3.A17();
    }

    @Override // X.DS5
    public final void updateOverrideForParam(long j, boolean z) {
        throw C8j3.A17();
    }
}
