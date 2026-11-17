package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.File;

/* loaded from: classes5.dex */
public final class C2W {
    public final String[] A01 = new String[5];
    public int A00 = 0;

    public final synchronized void A00(StringBuilder sb) {
        sb.append("Previously recorded ");
        int i = this.A00;
        sb.append(i);
        sb.append(" base apk paths.");
        if (i > 0) {
            sb.append(" Most recent ones:");
        }
        int i2 = 0;
        while (true) {
            String[] strArr = this.A01;
            if (i2 < 5) {
                int i3 = (this.A00 - i2) - 1;
                if (i3 >= 0) {
                    String str = strArr[i3 % 5];
                    sb.append(PairsDiscretionDocument.TERMINATOR);
                    sb.append(str);
                    sb.append(" (");
                    sb.append(new File(str).exists() ? "exists" : "does not exist");
                    sb.append(")");
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r1 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (android.util.Log.isLoggable("SoLoader", 4) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        android.util.Log.i("SoLoader", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = r6.A00;
        r4[r1 % 5] = r7;
        r2 = true;
        r6.A00 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        android.util.Log.w("SoLoader", r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        r3 = X.C3cI.A0x("Recording new base apk path: ", r7);
        r3.append(com.facebook.aura.pairs.PairsDiscretionDocument.TERMINATOR);
        A00(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r6.A00 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A01(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String[] r4 = r6.A01     // Catch: java.lang.Throwable -> L4c
            r5 = 5
            r2 = 0
            r1 = 0
        L6:
            r0 = r4[r1]     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r7.equals(r0)     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L4a
            int r1 = r1 + 1
            if (r1 < r5) goto L6
            java.lang.String r0 = "Recording new base apk path: "
            java.lang.StringBuilder r3 = X.C3cI.A0x(r0, r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = "\n"
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c
            r6.A00(r3)     // Catch: java.lang.Throwable -> L4c
            int r0 = r6.A00     // Catch: java.lang.Throwable -> L4c
            if (r0 != 0) goto L40
            java.lang.String r2 = "SoLoader"
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            r0 = 4
            boolean r0 = android.util.Log.isLoggable(r2, r0)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L34
            android.util.Log.i(r2, r1)     // Catch: java.lang.Throwable -> L4c
        L34:
            int r1 = r6.A00     // Catch: java.lang.Throwable -> L4c
            int r0 = r1 % r5
            r4[r0] = r7     // Catch: java.lang.Throwable -> L4c
            r2 = 1
            int r0 = r1 + 1
            r6.A00 = r0     // Catch: java.lang.Throwable -> L4c
            goto L4a
        L40:
            java.lang.String r1 = "SoLoader"
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4c
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L4c
            goto L34
        L4a:
            monitor-exit(r6)
            return r2
        L4c:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2W.A01(java.lang.String):boolean");
    }
}
