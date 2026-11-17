package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.flexiblesampling.QPLSupportedSamplingPolicyConfig;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.C2q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3192C2q {
    public static final byte[] A02 = new byte[100];
    public static final char[] A03 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final InterfaceC3189C2f A00;
    public final Map A01;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    public final void A02(File file, String str, Properties properties) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ?? ListFiles;
        long filePointer;
        String str2 = str;
        try {
            if (QPLSupportedSamplingPolicyConfig.PERF_EVENT_NAME.equals(str2)) {
                try {
                    Map map = this.A01;
                    C3193C2r c3193C2rA7U = (C3193C2r) map.get(file.getPath());
                    if (c3193C2rA7U == null) {
                        c3193C2rA7U = this.A00.A7U(file, 4096);
                        C1H.A00(c3193C2rA7U);
                        map.put(file.getPath(), c3193C2rA7U);
                    }
                    MappedByteBuffer mappedByteBuffer = c3193C2rA7U.A00;
                    mappedByteBuffer.clear();
                    for (Map.Entry entry : properties.entrySet()) {
                        String string = entry.getKey().toString();
                        String string2 = entry.getValue().toString();
                        mappedByteBuffer.put(A00(string, true).getBytes("Ascii"));
                        mappedByteBuffer.put(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes("Ascii"));
                        mappedByteBuffer.put(A00(string2, false).getBytes("Ascii"));
                        mappedByteBuffer.put(PairsDiscretionDocument.TERMINATOR.getBytes("Ascii"));
                    }
                    ListFiles = "#";
                    mappedByteBuffer.put("#".getBytes("Ascii"));
                    return;
                } catch (Throwable th) {
                    ListFiles = "MappedPropStore";
                    C2Q.A00().AT9("MappedPropStore", th, null);
                    FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
                    if (str == null) {
                        str2 = "";
                    }
                    try {
                        properties.store(fileOutputStreamA0I, FGI.A0M("fallover ", str2));
                        fileOutputStreamA0I.close();
                        return;
                    } catch (Throwable th2) {
                        fileOutputStreamA0I.close();
                        throw th2;
                    }
                }
            }
            File fileA0K = BV5.A0K(file.getPath(), "_tmp");
            if (str != null) {
                C3194C2s c3194C2sA00 = C3194C2s.A00(str2);
                synchronized (c3194C2sA00.A03) {
                    BeS.A03(c3194C2sA00.A02, FGI.A0M("Did you call FixedLengthFiles.init()? - pool: ", c3194C2sA00.A04));
                    BeS.A06(!c3194C2sA00.A02.getPath().equals(fileA0K.getParent()), "Destination file cannot be in the pool directory");
                    ListFiles = c3194C2sA00.A02.listFiles();
                    try {
                        if (ListFiles != 0 && ListFiles.length > 0 && ListFiles[0].renameTo(fileA0K)) {
                            try {
                                RandomAccessFile randomAccessFileA0M = BV4.A0M(fileA0K);
                                randomAccessFileA0M.write("# ".getBytes("Ascii"));
                                randomAccessFileA0M.write(str2.getBytes("Ascii"));
                                randomAccessFileA0M.write(PairsDiscretionDocument.TERMINATOR.getBytes("Ascii"));
                                Iterator it = properties.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it.next();
                                        String string3 = entry2.getKey().toString();
                                        String string4 = entry2.getValue().toString();
                                        byte[] bytes = A00(string3, true).getBytes("Ascii");
                                        byte[] bytes2 = A00(string4, false).getBytes("Ascii");
                                        if (randomAccessFileA0M.getFilePointer() + bytes.length + bytes2.length + 25 > randomAccessFileA0M.length()) {
                                            randomAccessFileA0M.write("trimmed_report=true\n#".getBytes("Ascii"));
                                            randomAccessFileA0M.close();
                                            A01(fileA0K, str2, " store (too large) ", properties);
                                            break;
                                        } else {
                                            randomAccessFileA0M.write(bytes);
                                            randomAccessFileA0M.write(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR.getBytes("Ascii"));
                                            randomAccessFileA0M.write(bytes2);
                                            randomAccessFileA0M.write(PairsDiscretionDocument.TERMINATOR.getBytes("Ascii"));
                                        }
                                    } else {
                                        byte[] bytes3 = "# ".getBytes("Ascii");
                                        do {
                                            randomAccessFileA0M.write(bytes3);
                                            filePointer = randomAccessFileA0M.getFilePointer();
                                            bytes3 = A02;
                                        } while (filePointer + 100 < randomAccessFileA0M.length());
                                        while (randomAccessFileA0M.getFilePointer() + 100 < randomAccessFileA0M.length()) {
                                            randomAccessFileA0M.writeByte(0);
                                        }
                                        randomAccessFileA0M.close();
                                    }
                                }
                                randomAccessFileA0M.close();
                            } catch (FileNotFoundException e) {
                                C2Q.A00().AT9("FixedLenFilesReserve", e, null);
                                CFK.A0A(C9Y.TAG, "Cannot reserve file", e);
                            }
                        }
                        A01(fileA0K, str2, " store (reserve)", properties);
                    } finally {
                    }
                }
            } else {
                A01(fileA0K, "", "no pool", properties);
            }
            if (!fileA0K.renameTo(file)) {
                throw BV5.A0M("Could not rename file: ", file.getName());
            }
            return;
        } catch (Throwable th3) {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(ListFiles, th3);
            throw ListFiles;
        }
        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(ListFiles, th3);
        throw ListFiles;
    }

    public C3192C2q(InterfaceC3189C2f interfaceC3189C2f) {
        this.A01 = C60O.A1C();
        this.A00 = interfaceC3189C2f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 < r4) goto L9;
     */
    /* JADX WARN: Path cross not found for [B:8:0x001c, B:4:0x000e], limit reached: 38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(java.lang.String r7, boolean r8) {
        /*
            int r4 = r7.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r2 = 32
            r1 = 0
            if (r8 != 0) goto L1c
            if (r4 <= 0) goto L83
            char r0 = r7.charAt(r1)
            if (r0 != r2) goto L1e
            java.lang.String r0 = "\\ "
            r3.append(r0)
            r1 = 1
        L1c:
            if (r1 >= r4) goto L83
        L1e:
            char r5 = r7.charAt(r1)
            switch(r5) {
                case 9: goto L7a;
                case 10: goto L77;
                case 11: goto L25;
                case 12: goto L74;
                case 13: goto L7d;
                default: goto L25;
            }
        L25:
            r6 = 92
            if (r8 == 0) goto L2b
            if (r5 == r2) goto L70
        L2b:
            if (r5 == r6) goto L70
            r0 = 35
            if (r5 == r0) goto L70
            r0 = 33
            if (r5 == r0) goto L70
            r0 = 58
            if (r5 == r0) goto L70
            r0 = 61
            if (r5 == r0) goto L70
            if (r5 < r2) goto L49
            r0 = 126(0x7e, float:1.77E-43)
            if (r5 > r0) goto L49
        L43:
            r3.append(r5)
        L46:
            int r1 = r1 + 1
            goto L1c
        L49:
            java.lang.String r0 = "\\u"
            r3.append(r0)
            char[] r6 = X.C3192C2q.A03
            int r0 = r5 >>> 12
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 8
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            int r0 = r5 >>> 4
            r0 = r0 & 15
            char r0 = r6[r0]
            r3.append(r0)
            r0 = r5 & 15
            char r5 = r6[r0]
            goto L43
        L70:
            r3.append(r6)
            goto L43
        L74:
            java.lang.String r0 = "\\f"
            goto L7f
        L77:
            java.lang.String r0 = "\\n"
            goto L7f
        L7a:
            java.lang.String r0 = "\\t"
            goto L7f
        L7d:
            java.lang.String r0 = "\\r"
        L7f:
            r3.append(r0)
            goto L46
        L83:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3192C2q.A00(java.lang.String, boolean):java.lang.String");
    }

    public static void A01(File file, String str, String str2, Properties properties) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        FileOutputStream fileOutputStreamA0I = BV4.A0I(file);
        try {
            properties.store(fileOutputStreamA0I, FGI.A0M(str2, str));
            fileOutputStreamA0I.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamA0I.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public C3192C2q() {
    }
}
