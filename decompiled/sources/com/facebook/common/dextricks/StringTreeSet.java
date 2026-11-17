package com.facebook.common.dextricks;

import X.BV4;
import X.BV7;
import X.C3cG;
import X.C60O;
import android.os.Build;

/* loaded from: classes5.dex */
public class StringTreeSet {
    public static final int BITS_PER_PAYLOAD_UNIT = 6;
    public static final int CHILDREN_SIZE = 4;
    public static final int FLAG_NONTERMINAL = 16;
    public static final int FLAG_NO_PAYLOAD = 8;
    public static final int FLAG_PAYLOAD_UNIT = 64;
    public static final boolean IS_OS_VERSION_CHAOTIC = BV7.A1S(Build.VERSION.SDK_INT, 30);
    public static final int OFFSET_BASE_ENCODING = 127;
    public static final int PAYLOAD_MASK = 63;
    public static final int PAYLOAD_UNITS_MASK = 7;
    public static final int SINGLE_SYMBOL_MIN_VALUE = 32;
    public static final String TAG = "StringTreeSet";
    public static volatile Logger sLogger;

    public interface Logger {
        void onStringTreeLookup(String str);
    }

    public static boolean search(String str, String str2) {
        return searchMapAtPos(str, str2, 0, 1) != 1;
    }

    public static int searchMap(String str, String str2, int i) {
        return searchMapAtPos(str, str2, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int searchMapAtPos(java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r6 = 0
            r4 = r11
            r3 = 0
        L3:
            int r0 = r9.length()
            r5 = 3
            r1 = 32
            if (r3 >= r0) goto L56
            char r8 = r9.charAt(r3)
            int r2 = r4 + 1
            char r0 = r10.charAt(r4)
            if (r0 >= r1) goto L53
            r0 = r0 & 7
            int r2 = r2 + r0
            int r1 = r2 + 1
            char r7 = r10.charAt(r2)
            int r0 = r7 + (-1)
            r4 = 1
            if (r0 < r4) goto La0
            int r2 = r2 + 2
            char r1 = r10.charAt(r1)
            int r0 = r7 + (-2)
            if (r1 != r8) goto L37
            int r0 = r0 * 4
            int r2 = r2 + r0
        L33:
            r4 = r2
            int r3 = r3 + 1
            goto L3
        L37:
            int r1 = binarySearch(r8, r10, r2, r0)
            r0 = -1
            if (r1 == r0) goto La0
            int r0 = r1 * 4
            int r2 = r2 + r0
            r1 = 0
        L42:
            int r1 = r1 * 127
            int r0 = r2 + r5
            char r0 = r10.charAt(r0)
            int r1 = r1 + r0
            int r1 = r1 - r4
            int r5 = r5 + (-1)
            if (r5 > 0) goto L42
            int r2 = r1 + r11
            goto L33
        L53:
            if (r0 == r8) goto L33
            return r12
        L56:
            int r7 = r4 + 1
            char r2 = r10.charAt(r4)
            if (r2 >= r1) goto La0
            r1 = r2 & 16
            r0 = 16
            if (r1 == r0) goto La0
            r1 = r2 & 8
            r0 = 8
            if (r1 != r0) goto L6b
            return r6
        L6b:
            r4 = r2 & 7
            r12 = 0
        L6e:
            if (r6 >= r4) goto La0
            int r3 = r7 + 1
            char r2 = r10.charAt(r7)
            r1 = r2 & 64
            r0 = 64
            if (r1 != r0) goto L99
            r1 = r2 & 63
            r0 = 5
            if (r6 != r0) goto L8b
            if (r1 > r5) goto L91
        L83:
            int r0 = r6 * 6
            int r1 = r1 << r0
            r12 = r12 | r1
            int r6 = r6 + 1
            r7 = r3
            goto L6e
        L8b:
            r0 = 6
            if (r6 != r0) goto L83
            if (r1 != 0) goto L91
            goto L83
        L91:
            java.lang.String r1 = "overflow"
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r1)
            throw r0
        L99:
            java.lang.String r0 = "Bad data at "
            java.lang.IllegalStateException r0 = X.BV7.A0l(r0, r7)
            throw r0
        La0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.StringTreeSet.searchMapAtPos(java.lang.String, java.lang.String, int, int):int");
    }

    public static int binarySearch(char c, String str, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        int i5 = 0;
        while (true) {
            i3 = -1;
            if (i5 > i4) {
                break;
            }
            i3 = (i5 + i4) >> 1;
            char cCharAt = str.charAt((i3 * 4) + i);
            if (cCharAt == c) {
                break;
            }
            if (cCharAt > c) {
                i4 = i3 - 1;
            } else {
                i5 = i3 + 1;
            }
        }
        return i3;
    }

    public static Logger getLogger() {
        return sLogger;
    }

    public static int searchMapStringify(Object obj, String str, int i) {
        int iSearchMapAtPos;
        Logger logger = sLogger;
        if (obj == null) {
            if (logger != null) {
                logger.onStringTreeLookup(null);
            }
            return i;
        }
        if (!IS_OS_VERSION_CHAOTIC) {
            String name = obj instanceof Class ? ((Class) obj).getName() : obj.toString();
            if (logger != null) {
                logger.onStringTreeLookup(name);
            }
            return searchMapAtPos(name, str, 0, i);
        }
        synchronized (StringTreeSet.class) {
            String name2 = obj instanceof Class ? ((Class) obj).getName() : obj.toString();
            if (logger != null) {
                logger.onStringTreeLookup(name2);
            }
            iSearchMapAtPos = searchMapAtPos(name2, str, 0, i);
        }
        return iSearchMapAtPos;
    }

    public static int decodeBase127Int(String str, int i) {
        return (str.charAt(i) - 1) + ((str.charAt(i + 1) - 1) * 127) + ((str.charAt(i + 2) - 1) * 16129);
    }

    public static String searchStringToStringMap(String str, String str2, String str3) {
        int length = str2.length();
        if (length < 6) {
            throw C60O.A0i(String.valueOf(length));
        }
        int iDecodeBase127Int = decodeBase127Int(str2, 0);
        if (iDecodeBase127Int < 6) {
            throw BV4.A0T();
        }
        int iDecodeBase127Int2 = decodeBase127Int(str2, 3);
        if (iDecodeBase127Int2 < 6) {
            throw BV4.A0T();
        }
        int iSearchMapAtPos = searchMapAtPos(str, str2, iDecodeBase127Int, Integer.MAX_VALUE);
        if (iSearchMapAtPos == Integer.MAX_VALUE) {
            return str3;
        }
        if (iSearchMapAtPos < 0) {
            throw C3cG.A0Q(String.valueOf(iSearchMapAtPos));
        }
        int i = iSearchMapAtPos + iDecodeBase127Int2;
        int iDecodeBase127Int3 = decodeBase127Int(str2, i);
        int i2 = i + 3;
        return str2.substring(i2, iDecodeBase127Int3 + i2);
    }

    public static void setLogger(Logger logger) {
        sLogger = logger;
    }
}
