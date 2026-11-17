package X;

import android.content.Context;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.CCy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3301CCy {
    public static C3301CCy A04;
    public static final CD7 A05 = new CD7();
    public static final AtomicInteger A06 = BV5.A17();
    public final Context A00;
    public final CCz A01;
    public final CD8 A02;
    public final ReentrantLock A03 = new ReentrantLock();

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A00(java.io.File r4) {
        /*
            if (r4 != 0) goto L5
            java.lang.String r0 = "NoSplitFile"
            return r0
        L5:
            boolean r3 = r4.exists()
            if (r3 == 0) goto L3a
            boolean r0 = r4.canWrite()
            if (r0 != 0) goto L1e
            boolean r0 = r4.canExecute()
            if (r0 != 0) goto L1e
            boolean r1 = r4.canRead()
            r0 = 1
            if (r1 != 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L23:
            java.lang.String r0 = r4.getCanonicalPath()
            java.lang.StringBuilder r1 = X.C3cG.A0g(r0)
            java.lang.String r0 = " exists: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", read only:"
            java.lang.String r0 = X.AnonymousClass006.A0y(r2, r0, r1)
            return r0
        L3a:
            java.lang.String r2 = "n/a"
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3301CCy.A00(java.io.File):java.lang.String");
    }

    public C3301CCy(Context context, CCz cCz, CD8 cd8) {
        this.A00 = context;
        this.A02 = cd8;
        this.A01 = cCz;
        CDH.A04.A00().A00.A05(context);
    }

    public static final String A01(List<? extends File> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        for (File file : list) {
            File file2 = file;
            if (file2 != null && !file2.exists()) {
                arrayListA0h.add(file);
            }
        }
        return AbstractC06907md.A01(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0h, new EY5(21));
    }

    public static final void A02(File file, String str) {
        CD1 cd1A00;
        CD2 cd2;
        int iA00 = CD0.A00(str);
        if (CD0.A02(iA00)) {
            boolean zExists = file.exists();
            CDC cdc = CD1.A06;
            if (zExists) {
                cd1A00 = cdc.A00();
                cd2 = CD2.A04;
            } else {
                if (cdc.A00().A00(iA00) == CD2.A03) {
                    return;
                }
                cd1A00 = cdc.A00();
                cd2 = CD2.A05;
            }
            synchronized (cd1A00) {
                CD2[] cd2Arr = cd1A00.A04;
                if (cd2Arr[iA00] != cd2) {
                    CD0.A01(iA00);
                    cd2Arr[iA00] = cd2;
                }
            }
        }
    }
}
