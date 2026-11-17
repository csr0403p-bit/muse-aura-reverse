package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.CZj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3620CZj {
    public final CQP A00;
    public final CZz A01;
    public final C3534CSp A02;
    public final CZy A03;
    public final CZk A04;

    public static Set<String> A00(PackageInfo packageInfo) {
        int[] iArr;
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null || (iArr = packageInfo.requestedPermissionsFlags) == null || strArr.length != iArr.length) {
            return C60O.A13();
        }
        HashSet hashSetA13 = C60O.A13();
        int i = 0;
        while (true) {
            String[] strArr2 = packageInfo.requestedPermissions;
            if (i >= strArr2.length) {
                return hashSetA13;
            }
            String str = strArr2[i];
            if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                hashSetA13.add(str);
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0319, code lost:
    
        if (r13.A01 >= 63328846) goto L163;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.util.AbstractCollection, java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.util.AbstractCollection, java.util.HashSet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.CZl A01() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 823
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3620CZj.A01():X.CZl");
    }

    public final boolean A02(int i) throws PackageManager.NameNotFoundException {
        CZx cZxA00 = this.A00.A00();
        return cZxA00 != null && cZxA00.A05 && cZxA00.A00 >= i;
    }

    public C3620CZj(Context context, PackageManager packageManager) {
        this.A01 = new CZz(packageManager);
        this.A03 = new CZy(packageManager);
        this.A00 = new CQP(packageManager);
        this.A02 = new C3534CSp(context, packageManager);
        this.A04 = new CZk(packageManager);
    }
}
