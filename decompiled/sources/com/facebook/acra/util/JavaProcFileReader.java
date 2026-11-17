package com.facebook.acra.util;

import X.BV4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.CFK;
import X.FGI;
import android.os.Process;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class JavaProcFileReader extends ProcFileReader {
    public static final String FD_DIR_STRING = "/fd/";
    public static final String LS_SYMLINK_ARROW = " -> ";
    public static final String PIPE_STRING = "pipe";
    public static final int PROC_LINE_READ_LIMIT = 128;
    public static final int PROC_SCHED_READ_LIMIT = 16384;
    public static final String SOCKET_STRING = "socket";
    public static final String TAG = "JavaProcFileReader";
    public static JavaProcFileReader sInstance;
    public static final ThreadLocal<byte[]> PROC_LINE_BUFFER = new ThreadLocal<byte[]>() { // from class: com.facebook.acra.util.JavaProcFileReader.1
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ byte[] initialValue() {
            return new byte[128];
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue, reason: avoid collision after fix types in other method */
        public byte[] initialValue2() {
            return new byte[128];
        }
    };
    public static final ThreadLocal<byte[]> PROC_SCHED_BUFFER = new ThreadLocal<byte[]>() { // from class: com.facebook.acra.util.JavaProcFileReader.2
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ byte[] initialValue() {
            return new byte[16384];
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: initialValue, reason: avoid collision after fix types in other method */
        public byte[] initialValue2() {
            return new byte[16384];
        }
    };
    public static final String FD_DIR = FGI.A0I("/proc/", Process.myPid(), "/fd");
    public static final int[] PROC_OPEN_FD_LIMITS_FORMAT = {32, 32, 288, 4384, 4384, 288};

    public static int findNewLineOrEnd(byte[] bArr, int i) {
        byte b;
        int length = bArr.length;
        if (i >= length) {
            return -1;
        }
        while (i < length - 1 && (b = bArr[i]) != 10 && b != 0) {
            i++;
        }
        return i;
    }

    public static int parseSchedCounters(byte[] bArr, int i, long[] jArr) {
        if (jArr.length < 3) {
            throw C60O.A0i("outNanos must hold at least 3 values");
        }
        int iMin = Math.min(i, bArr.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < iMin) {
            int i4 = i2;
            while (i4 < iMin && bArr[i4] != 10) {
                i4++;
            }
            int iSchedCounterField = schedCounterField(bArr, i2, i4);
            if (iSchedCounterField >= 0) {
                while (i2 < i4 && bArr[i2] != 58) {
                    i2++;
                }
                long decimalMilliseconds = parseDecimalMilliseconds(bArr, i2 + 1, i4);
                if (i2 == i4 || decimalMilliseconds < 0) {
                    return -1;
                }
                jArr[iSchedCounterField] = decimalMilliseconds;
                i3 = (1 << iSchedCounterField) | i3;
            }
            i2 = i4 + 1;
        }
        return i3;
    }

    public static boolean parseSchedStat(byte[] bArr, int i, long[] jArr) {
        int iMin = Math.min(i, bArr.length);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= iMin || bArr[i3] != 32) {
                long j = 0;
                int i4 = 0;
                while (i3 < iMin) {
                    byte b = bArr[i3];
                    if (b < 48 || b > 57) {
                        break;
                    }
                    long j2 = b - 48;
                    if (j > (LinkEncryptedPairingKt.LINK_COUNTER_MAX - j2) / 10) {
                        return false;
                    }
                    j = (j * 10) + j2;
                    i3++;
                    i4++;
                }
                if (i4 == 0) {
                    return false;
                }
                jArr[i2] = j;
                i2++;
                if (i2 >= 2) {
                    return true;
                }
            } else {
                i3++;
            }
        }
    }

    public static int parseThreadStateChar(byte[] bArr, int i) {
        int iMin = Math.min(i, bArr.length);
        for (int i2 = iMin - 1; i2 >= 0; i2--) {
            if (bArr[i2] == 41) {
                int i3 = i2 + 2;
                if (i3 >= iMin || bArr[i2 + 1] != 32) {
                    return 0;
                }
                return bArr[i3] & 255;
            }
        }
        return 0;
    }

    public static boolean startsWithOffset(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public int readSchedCounters(int i, long[] jArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (jArr.length < 3) {
            throw C60O.A0i("outNanos must hold at least 3 values");
        }
        byte[] bArr = PROC_SCHED_BUFFER.get();
        int procFileHead = readProcFileHead(ProcFileReader.threadFilePath(i, "sched"), bArr);
        if (procFileHead <= 0) {
            return -1;
        }
        return parseSchedCounters(bArr, procFileHead, jArr);
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public boolean readSchedStat(int i, long[] jArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (jArr.length < 2) {
            throw C60O.A0i("outNanos must hold at least 2 values");
        }
        byte[] bArr = PROC_LINE_BUFFER.get();
        int procFileHead = readProcFileHead(ProcFileReader.threadFilePath(i, "schedstat"), bArr);
        if (procFileHead <= 0) {
            return false;
        }
        return parseSchedStat(bArr, procFileHead, jArr);
    }

    public class Counter {
        public int count;

        public /* synthetic */ Counter(JavaProcFileReaderIA javaProcFileReaderIA) {
        }

        public Counter() {
        }
    }

    public static synchronized JavaProcFileReader getInstance() {
        JavaProcFileReader javaProcFileReader;
        javaProcFileReader = sInstance;
        if (javaProcFileReader == null) {
            javaProcFileReader = new JavaProcFileReader();
            sInstance = javaProcFileReader;
        }
        return javaProcFileReader;
    }

    public static boolean matchesKey(byte[] bArr, int i, int i2, String str) {
        int i3 = i2 - i;
        int length = str.length();
        int i4 = i2 - length;
        if (i4 >= i) {
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    if (i3 != length) {
                        if (i3 == length + 14) {
                            int i6 = 0;
                            while (bArr[i + i6] == "se.statistics.".charAt(i6)) {
                                i6++;
                                if (i6 < 14) {
                                }
                            }
                        }
                    }
                    return true;
                }
                if (bArr[i4 + i5] != str.charAt(i5)) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076 A[LOOP:4: B:43:0x0076->B:45:0x007a, LOOP_START, PHI: r2 r15
  0x0076: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:41:0x0073, B:45:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r15v2 long) = (r15v1 long), (r15v3 long) binds: [B:41:0x0073, B:45:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long parseDecimalMilliseconds(byte[] r19, int r20, int r21) {
        /*
            r6 = r20
        L2:
            r4 = 9
            r3 = 32
            r5 = r21
            if (r6 >= r5) goto L13
            r0 = r19[r6]
            if (r0 == r3) goto L10
            if (r0 != r4) goto L13
        L10:
            int r6 = r6 + 1
            goto L2
        L13:
            r17 = -1
            if (r6 == r5) goto L8e
            r2 = 0
            r15 = 0
            r13 = 0
            r12 = 0
        L1d:
            r9 = 57
            r10 = 10
            r8 = 48
            if (r6 >= r5) goto L40
            r0 = r19[r6]
            if (r0 < r8) goto L40
            if (r0 > r9) goto L40
            int r6 = r6 + 1
            int r0 = r0 + (-48)
            long r0 = (long) r0
            r8 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            long r8 = r8 - r0
            long r8 = r8 / r10
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 > 0) goto L8e
            long r13 = r13 * r10
            long r13 = r13 + r0
            int r12 = r12 + 1
            goto L1d
        L40:
            if (r12 == 0) goto L8e
            r7 = 6
            if (r6 >= r5) goto L64
            r1 = r19[r6]
            r0 = 46
            if (r1 != r0) goto L64
            int r6 = r6 + 1
        L4d:
            if (r6 >= r5) goto L61
            r0 = r19[r6]
            if (r0 < r8) goto L61
            if (r0 > r9) goto L61
            if (r2 == r7) goto L8e
            long r15 = r15 * r10
            int r6 = r6 + 1
            int r0 = r0 + (-48)
            long r0 = (long) r0
            long r15 = r15 + r0
            int r2 = r2 + 1
            goto L4d
        L61:
            if (r2 != 0) goto L64
            return r17
        L64:
            if (r6 >= r5) goto L73
            r1 = r19[r6]
            if (r1 == r3) goto L70
            if (r1 == r4) goto L70
            r0 = 13
            if (r1 != r0) goto L73
        L70:
            int r6 = r6 + 1
            goto L64
        L73:
            if (r6 == r5) goto L76
            return r17
        L76:
            int r0 = r2 + 1
            if (r2 >= r7) goto L7d
            long r15 = r15 * r10
            r2 = r0
            goto L76
        L7d:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = r3 - r15
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r1
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 > 0) goto L8e
            long r13 = r13 * r1
            long r13 = r13 + r15
            return r13
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.JavaProcFileReader.parseDecimalMilliseconds(byte[], int, int):long");
    }

    public static int readProcFileHead(String str, byte[] bArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                int i = fileInputStream.read(bArr);
                fileInputStream.close();
                return i;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException unused) {
            return -1;
        }
    }

    public static int schedCounterField(byte[] bArr, int i, int i2) {
        byte b;
        while (i < i2 && ((b = bArr[i]) == 32 || b == 9)) {
            i++;
        }
        int i3 = i;
        while (i3 < i2) {
            byte b2 = bArr[i3];
            if (b2 == 32 || b2 == 9 || b2 == 58) {
                break;
            }
            i3++;
        }
        if (matchesKey(bArr, i, i3, "sum_sleep_runtime")) {
            return 0;
        }
        if (matchesKey(bArr, i, i3, "sum_block_runtime")) {
            return 1;
        }
        return matchesKey(bArr, i, i3, "iowait_sum") ? 2 : -1;
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public int getOpenFDCount() {
        try {
            String[] list = BV4.A0G(FD_DIR).list();
            if (list != null) {
                return list.length;
            }
            return -1;
        } catch (SecurityException e) {
            CFK.A04(TAG, e.getMessage());
            return -2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0060 A[SYNTHETIC] */
    @Override // com.facebook.acra.util.ProcFileReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.acra.util.ProcFileReader.OpenFDLimits getOpenFDLimits() throws java.lang.IllegalAccessException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.util.JavaProcFileReader.getOpenFDLimits():com.facebook.acra.util.ProcFileReader$OpenFDLimits");
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public int readThreadStateChar(int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        byte[] bArr = PROC_LINE_BUFFER.get();
        int procFileHead = readProcFileHead(ProcFileReader.threadFilePath(i, "stat"), bArr);
        if (procFileHead <= 0) {
            return 0;
        }
        return parseThreadStateChar(bArr, procFileHead);
    }

    @Override // com.facebook.acra.util.ProcFileReader
    public String getOpenFileDescriptors() {
        StringBuilder sbA0w = C60O.A0w();
        try {
            String[] strArrSplit = CommandOutputCollector.collect("/system/bin/ls", "-l", String.format(FD_DIR, BV4.A1W())).split(PairsDiscretionDocument.TERMINATOR);
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            for (int i = 1; i < strArrSplit.length; i++) {
                String str = strArrSplit[i];
                int iLastIndexOf = str.lastIndexOf(LS_SYMLINK_ARROW);
                if (iLastIndexOf != -1) {
                    String strSubstring = str.substring(iLastIndexOf + 4);
                    int iLastIndexOf2 = strSubstring.lastIndexOf(FD_DIR_STRING);
                    String strSubstring2 = iLastIndexOf2 == -1 ? strSubstring : strSubstring.substring(iLastIndexOf2 + 4);
                    if (strSubstring2.startsWith(PIPE_STRING)) {
                        strSubstring = PIPE_STRING;
                    } else if (strSubstring2.startsWith(SOCKET_STRING)) {
                        strSubstring = SOCKET_STRING;
                    }
                    Counter counter = (Counter) linkedHashMapA0j.get(strSubstring);
                    if (counter == null) {
                        counter = new Counter();
                        linkedHashMapA0j.put(strSubstring, counter);
                    }
                    counter.count++;
                }
            }
            Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                sbA0w.append(C60O.A0t(entryA0l));
                sbA0w.append(InviteCodeScratcherKt.CODE_SEPARATOR);
                sbA0w.append(((Counter) entryA0l.getValue()).count);
                sbA0w.append(PairsDiscretionDocument.TERMINATOR);
            }
            return sbA0w.toString();
        } catch (IOException | IndexOutOfBoundsException | SecurityException e) {
            CFK.A0J(TAG, e, "Exception caught while reading open file descriptors");
            return e.getMessage() != null ? e.getMessage() : "Exception caught while reading open file descriptors";
        }
    }
}
