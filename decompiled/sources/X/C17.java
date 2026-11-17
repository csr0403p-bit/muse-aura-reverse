package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C17 {
    public Map<String, Integer> A00 = BV4.A0u();
    public long A01 = System.currentTimeMillis() - 200;
    public static final String[] A02 = {"battery", "mtktsbattery", "Battery"};
    public static final String[] A07 = {"mtktscpu", "exynos-therm", "soc_thermal"};
    public static final String[] A06 = {"cpu0-gold-usr", "cpu1-gold-usr", "cpu2-gold-usr", "cpu3-gold-usr"};
    public static final String[] A09 = {"therm_zone0", "therm_zone1"};
    public static final String[] A05 = {"cluster0", "cluster1"};
    public static final String[] A03 = {"apc1-cpu0-usr", "apc1-cpu1-usr", "apc1-cpu2-usr", "apc1-cpu3-usr"};
    public static final String[] A08 = {"cpu-1-0-usr", "cpu-1-1-usr", "cpu-1-2-usr", "cpu-1-3-usr", "cpu-1-4-usr", "cpu-1-5-usr", "cpu-1-6-usr", "cpu-1-7-usr"};
    public static final String[] A04 = {"BIG", "LITTLE"};
    public static final String[] A0B = {"gpu0-usr", "gpu1-usr"};
    public static final String[] A0A = {"gpuss-0-usr", "gpuss-1-usr"};

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;)I */
    public static int A01(Map map, String[] strArr) {
        int iMax = Integer.MIN_VALUE;
        for (String str : strArr) {
            if (map.containsKey(str)) {
                iMax = Math.max(iMax, BV7.A0H(str, map));
            }
        }
        return iMax;
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r9v0 X.C17) */
    public static synchronized void A03(C17 c17) {
        File[] fileArrListFiles;
        int length;
        File fileA0K;
        StringBuilder sbA0w;
        synchronized (c17) {
            if (System.currentTimeMillis() >= c17.A01 + 100) {
                HashMap mapA0u = BV4.A0u();
                c17.A04("/sys/class/thermal/", mapA0u);
                if (mapA0u.size() == 0) {
                    c17.A04("/sys/devices/virtual/thermal/", mapA0u);
                }
                if (mapA0u.size() == 0) {
                    File fileA0G = BV4.A0G("/sys/class/hwmon/");
                    if (fileA0G.exists() && (fileArrListFiles = fileA0G.listFiles()) != null && (length = fileArrListFiles.length) != 0) {
                        int i = 0;
                        do {
                            File file = fileArrListFiles[i];
                            try {
                                File fileA0K2 = BV5.A0K(file.getCanonicalPath(), "/device");
                                if (fileA0K2.exists() && fileA0K2.isDirectory()) {
                                    fileA0K = BV5.A0K(fileA0K2.getCanonicalPath(), "/name");
                                    sbA0w = C60O.A0w();
                                    sbA0w.append(fileA0K2.getCanonicalPath());
                                    sbA0w.append("/temperature");
                                } else {
                                    fileA0K = BV5.A0K(file.getCanonicalPath(), "/name");
                                    sbA0w = C60O.A0w();
                                    sbA0w.append(file.getCanonicalPath());
                                    sbA0w.append("/temp1_input");
                                }
                                File fileA0G2 = BV4.A0G(sbA0w.toString());
                                if (fileA0K.canRead() && fileA0G2.canRead()) {
                                    C8j4.A1O(A02(fileA0K), mapA0u, A00(A02(fileA0G2)));
                                }
                            } catch (Exception e) {
                                CFK.A0F("ThermalManager", "can't read %s, err=%s", file.getName(), e.getMessage());
                            }
                            i++;
                        } while (i < length);
                    }
                }
                c17.A00 = mapA0u;
                c17.A01 = System.currentTimeMillis();
            }
        }
    }

    public static int A00(String str) throws NumberFormatException {
        int i = Integer.MIN_VALUE;
        if (str != null && str.length() != 0) {
            try {
                i = Integer.parseInt(str);
                return i;
            } catch (Exception e) {
                BzX.A00("ThermalManager", "Failed to parse temperature string", e);
            }
        }
        return i;
    }

    public static String A02(File file) throws IOException {
        byte[] bArr = new byte[64];
        FileInputStream fileInputStreamA0H = BV4.A0H(file);
        try {
            int i = fileInputStreamA0H.read(bArr);
            if (i <= 0) {
                fileInputStreamA0H.close();
                return null;
            }
            int i2 = i - 1;
            if (bArr[i2] == 10) {
                i = i2;
            }
            return new String(bArr, 0, i);
        } finally {
            fileInputStreamA0H.close();
        }
    }

    public C17() {
        A03(this);
    }

    private void A04(String str, Map<String, Integer> map) throws IOException {
        File[] fileArrListFiles;
        int length;
        File fileA0G = BV4.A0G(str);
        if (!fileA0G.exists() || (fileArrListFiles = fileA0G.listFiles()) == null || (length = fileArrListFiles.length) == 0) {
            return;
        }
        int i = 0;
        do {
            File file = fileArrListFiles[i];
            try {
                String canonicalPath = file.getCanonicalPath();
                File fileA0K = BV5.A0K(canonicalPath, "/type");
                File fileA0K2 = BV5.A0K(canonicalPath, "/temp");
                if (fileA0K.canRead() && fileA0K2.canRead()) {
                    BV4.A1H(A02(fileA0K), map, A00(A02(fileA0K2)));
                }
            } catch (Exception e) {
                CFK.A0F("ThermalManager", "can't read %s, err=%s", file.getName(), e.getMessage());
            }
            i++;
        } while (i < length);
    }
}
