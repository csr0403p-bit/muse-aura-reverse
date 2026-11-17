package X;

import com.facebook.aura.localbrowser.ManagedBrowserSitePolicy;
import java.io.EOFException;

/* renamed from: X.Eaf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6827Eaf {
    public static final byte[] A00 = C3cG.A1S(ManagedBrowserSitePolicy.HEX);

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        r0 = r9[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r16 == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[LOOP:0: B:7:0x0014->B:27:0x004e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051 A[PHI: r3 r4 r5 r6
  0x0051: PHI (r3v6 X.Eai) = (r3v5 X.Eai), (r3v8 X.Eai) binds: [B:19:0x0037, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r4v5 int) = (r4v4 int), (r4v7 int) binds: [B:19:0x0037, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r5v5 byte[]) = (r5v4 byte[]), (r5v7 byte[]) binds: [B:19:0x0037, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r6v4 int) = (r6v3 int), (r6v6 int) binds: [B:19:0x0037, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.C6818EaW r14, X.C6832Eak r15, boolean r16) {
        /*
            X.Eai r8 = r14.A01
            r14 = -2
            r7 = -1
            if (r8 != 0) goto L9
            if (r16 != 0) goto L7d
            return r7
        L9:
            byte[] r5 = r8.A06
            int r2 = r8.A01
            int r4 = r8.A00
            int[] r9 = r15.A00
            r3 = r8
            r1 = 0
            r13 = -1
        L14:
            int r0 = r1 + 1
            r11 = r9[r1]
            int r10 = r1 + 2
            r0 = r9[r0]
            if (r0 == r7) goto L1f
            r13 = r0
        L1f:
            if (r3 == 0) goto L7b
            r12 = 0
            if (r11 >= 0) goto L56
            int r0 = -r11
            int r11 = r10 + r0
        L27:
            int r6 = r2 + 1
            r0 = r5[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + 1
            r0 = r9[r10]
            if (r2 != r0) goto L7e
            r0 = 0
            if (r1 != r11) goto L37
            r0 = 1
        L37:
            if (r6 != r4) goto L51
            X.Eai r3 = r3.A02
            X.C7384Etj.A0X(r3)
            int r6 = r3.A01
            byte[] r5 = r3.A06
            int r4 = r3.A00
            if (r3 != r8) goto L51
            if (r0 == 0) goto L7b
            r3 = r12
        L49:
            r0 = r9[r1]
        L4b:
            if (r0 < 0) goto L4e
            return r0
        L4e:
            int r1 = -r0
            r2 = r6
            goto L14
        L51:
            if (r0 != 0) goto L49
            r2 = r6
            r10 = r1
            goto L27
        L56:
            int r6 = r2 + 1
            r0 = r5[r2]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r10 + r11
        L5e:
            if (r10 == r1) goto L7e
            r0 = r9[r10]
            if (r2 != r0) goto L78
            int r10 = r10 + r11
            r0 = r9[r10]
            if (r6 != r4) goto L4b
            X.Eai r3 = r3.A02
            X.C7384Etj.A0X(r3)
            int r6 = r3.A01
            byte[] r5 = r3.A06
            int r4 = r3.A00
            if (r3 != r8) goto L4b
            r3 = r12
            goto L4b
        L78:
            int r10 = r10 + 1
            goto L5e
        L7b:
            if (r16 == 0) goto L7e
        L7d:
            return r14
        L7e:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6827Eaf.A00(X.EaW, X.Eak, boolean):int");
    }

    public static final String A01(C6818EaW c6818EaW, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c6818EaW.A02(j2) == 13) {
                String strA00 = C6818EaW.A00(DCl.A05, c6818EaW, j2);
                c6818EaW.Afk(2L);
                return strA00;
            }
        }
        String strA002 = C6818EaW.A00(DCl.A05, c6818EaW, j);
        c6818EaW.Afk(1L);
        return strA002;
    }
}
