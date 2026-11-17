package X;

import android.os.StrictMode;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.InterruptedIOException;
import java.util.Set;

/* renamed from: X.Bqc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2975Bqc {
    public final Set<String> A00 = C60O.A13();

    public static int A00(C2975Bqc c2975Bqc, String str, byte[] bArr) {
        Set<String> set = c2975Bqc.A00;
        if (!set.contains(str)) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                int length = bArr.length;
                try {
                    FileDescriptor fileDescriptorOpen = Os.open(str, 0, 0);
                    try {
                        try {
                            int i = Os.read(fileDescriptorOpen, bArr, 0, length - 1);
                            if (i != -2147483647) {
                                return i;
                            }
                        } catch (ErrnoException | InterruptedIOException e) {
                            Log.i("NewProcReader", FGI.A0M("Unable to read process file: ", str), e);
                            try {
                                Os.close(fileDescriptorOpen);
                            } catch (ErrnoException unused) {
                            }
                        }
                    } finally {
                        try {
                            Os.close(fileDescriptorOpen);
                        } catch (ErrnoException unused2) {
                        }
                    }
                } catch (ErrnoException e2) {
                    Log.i("NewProcReader", FGI.A0M("Unable to raw open process file: ", str), e2);
                }
                set.add(str);
                if (threadPolicyAllowThreadDiskReads != null) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return -1;
                }
            } finally {
                if (threadPolicyAllowThreadDiskReads != null) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0142, code lost:
    
        if (r8 >= 2048) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0146, code lost:
    
        if (r12[r8] != 10) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0148, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009e, code lost:
    
        if (r8 >= r9) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        r0 = r12[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a2, code lost:
    
        if (r0 == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a4, code lost:
    
        if (r0 == 10) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x009e A[EDGE_INSN: B:126:0x009e->B:151:? BREAK  A[LOOP:2: B:17:0x0039->B:42:0x007e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[PHI: r25
  0x008b: PHI (r25v1 boolean) = (r25v3 boolean), (r25v4 boolean) binds: [B:46:0x0089, B:44:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9 A[LOOP:7: B:59:0x00a9->B:154:?, LOOP_START, PHI: r8
  0x00a9: PHI (r8v9 int) = (r8v8 int), (r8v10 int) binds: [B:50:0x0093, B:154:?] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(java.lang.String r25, long[] r26, java.lang.String[] r27, long r28) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2975Bqc.A01(java.lang.String, long[], java.lang.String[], long):void");
    }
}
