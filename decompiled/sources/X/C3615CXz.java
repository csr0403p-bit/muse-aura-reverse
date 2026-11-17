package X;

import com.facebook.tigon.iface.TigonPropertyContainer;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3615CXz {
    public static final CY6 A02(C3615CXz c3615CXz, C3614CXy c3614CXy) {
        HashMap map;
        Object objUnmodifiableMap;
        Object objValueOf;
        byte b = 0;
        byte bA00 = c3614CXy.A00();
        if (bA00 == 0) {
            objValueOf = Boolean.valueOf(c3614CXy.A00() != 0);
        } else {
            b = 1;
            if (bA00 != 1) {
                byte b2 = 2;
                if (bA00 == 2) {
                    objUnmodifiableMap = c3615CXz.A04(c3614CXy);
                } else {
                    b2 = 3;
                    if (bA00 == 3) {
                        map = A03(c3615CXz, c3614CXy);
                    } else {
                        b2 = 4;
                        if (bA00 == 4) {
                            int iA00 = A00(c3614CXy);
                            map = new HashMap(iA00);
                            for (int i = 0; i < iA00; i++) {
                                String strA04 = c3615CXz.A04(c3614CXy);
                                boolean z = false;
                                if (c3614CXy.A00() != 0) {
                                    z = true;
                                }
                                map.put(strA04, Boolean.valueOf(z));
                            }
                        } else {
                            b2 = 5;
                            if (bA00 != 5) {
                                throw new IllegalStateException(FGI.A0H("Unexpected property value type index: ", bA00));
                            }
                            int iA002 = A00(c3614CXy);
                            map = new HashMap(iA002);
                            for (int i2 = 0; i2 < iA002; i2++) {
                                map.put(c3615CXz.A04(c3614CXy), Long.valueOf(A01(c3614CXy)));
                            }
                        }
                    }
                    objUnmodifiableMap = Collections.unmodifiableMap(map);
                }
                return new CY6(objUnmodifiableMap, b2);
            }
            objValueOf = Long.valueOf(A01(c3614CXy));
        }
        return new CY6(objValueOf, b);
    }

    public final void A05(C3614CXy c3614CXy, TigonPropertyContainer tigonPropertyContainer) {
        int iA00 = A00(c3614CXy);
        for (int i = 0; i < iA00; i++) {
            CY4 cy4 = new CY4(A00(c3614CXy));
            byte bA00 = c3614CXy.A00();
            if (bA00 == 0) {
                int iA002 = A00(c3614CXy);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i2 = 0; i2 < iA002; i2++) {
                    int iA003 = A00(c3614CXy);
                    linkedHashMap.put(Integer.valueOf(iA003), A02(this, c3614CXy));
                }
                tigonPropertyContainer.setPropertyGroup(cy4, new TigonPropertyContainer.Group(linkedHashMap));
            } else {
                if (bA00 != 1) {
                    throw new IllegalStateException(FGI.A0H("Unexpected top-level property type: ", bA00));
                }
                CY6 cy6A02 = A02(this, c3614CXy);
                byte b = cy6A02.A00;
                if (b == 0) {
                    tigonPropertyContainer.setProperty(cy4, ((Boolean) cy6A02.A01).booleanValue(), true);
                } else if (b == 1) {
                    tigonPropertyContainer.setProperty(cy4, ((Number) cy6A02.A01).longValue(), true);
                } else if (b == 2) {
                    tigonPropertyContainer.setProperty(cy4, (String) cy6A02.A01, true);
                } else if (b == 3) {
                    tigonPropertyContainer.setProperty(cy4, (Map<String, String>) cy6A02.A01, true);
                } else if (b == 4) {
                    tigonPropertyContainer.setBooleanMapProperty(cy4, (Map) cy6A02.A01, true);
                } else {
                    if (b != 5) {
                        throw new IllegalStateException(FGI.A0H("Unexpected property value index: ", b));
                    }
                    tigonPropertyContainer.setLongMapProperty(cy4, (Map) cy6A02.A01, true);
                }
            }
        }
    }

    public static final int A00(C3614CXy c3614CXy) {
        byte bA00 = c3614CXy.A00();
        byte bA002 = c3614CXy.A00();
        return (c3614CXy.A00() << 24) + ((c3614CXy.A00() & 255) << 16) + ((bA002 & 255) << 8) + (bA00 & 255);
    }

    public static final long A01(C3614CXy c3614CXy) {
        long jA00 = c3614CXy.A00();
        long jA002 = c3614CXy.A00();
        long jA003 = c3614CXy.A00();
        long jA004 = c3614CXy.A00();
        long jA005 = c3614CXy.A00();
        return (c3614CXy.A00() << 56) + ((c3614CXy.A00() & 255) << 48) + ((c3614CXy.A00() & 255) << 40) + ((jA005 & 255) << 32) + ((jA004 & 255) << 24) + ((jA003 & 255) << 16) + ((jA002 & 255) << 8) + (jA00 & 255);
    }

    public static final HashMap A03(C3615CXz c3615CXz, C3614CXy c3614CXy) {
        int iA00 = A00(c3614CXy);
        HashMap map = new HashMap(iA00);
        for (int i = 0; i < iA00; i++) {
            map.put(c3615CXz.A04(c3614CXy), c3615CXz.A04(c3614CXy));
        }
        return map;
    }

    public final String A04(C3614CXy c3614CXy) {
        int iA00 = A00(c3614CXy);
        String str = new String(c3614CXy.A02, c3614CXy.A00, iA00, CY0.A01);
        int i = c3614CXy.A00 + iA00;
        if (i > c3614CXy.A01) {
            throw new IllegalStateException("Check failed.");
        }
        c3614CXy.A00 = i;
        return str;
    }
}
