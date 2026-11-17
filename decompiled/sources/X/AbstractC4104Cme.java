package X;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;

/* renamed from: X.Cme, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4104Cme {
    public static int A00(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strPermissionToOp = AppOpsManager.permissionToOp(str);
        if (strPermissionToOp == null) {
            return 0;
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && Ht0.A00(packageName2, packageName)) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
            int callingUid = Binder.getCallingUid();
            if (appOpsManager == null || appOpsManager.checkOpNoThrow(strPermissionToOp, callingUid, packageName) != 0) {
                return -2;
            }
            iNoteProxyOpNoThrow = appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, context.getOpPackageName());
        } else {
            iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
        }
        return iNoteProxyOpNoThrow == 0 ? 0 : -2;
    }
}
