package androidx.profileinstaller;

import X.AbstractC4857D9c;
import X.C3cG;
import X.C4496CxT;
import X.F52;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes5.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Bundle extras;
        C4496CxT c4496CxT;
        int iMyPid;
        Object obj;
        int i;
        F52 f52;
        final C4496CxT c4496CxT2;
        final Object obj2;
        final int i2;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                AbstractC4857D9c.A00(context, new C4496CxT(this), new F52(1), true);
                return;
            }
            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        f52 = new F52(1);
                        c4496CxT2 = new C4496CxT(this);
                        try {
                            AbstractC4857D9c.A01(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            obj2 = null;
                            i2 = 10;
                        } catch (PackageManager.NameNotFoundException e) {
                            final int i3 = 7;
                            f52.execute(new Runnable() { // from class: X.CxU
                                public static final String __redex_internal_original_name = "ProfileInstaller$$ExternalSyntheticLambda0";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    c4496CxT2.AVZ(i3, e);
                                }
                            });
                            return;
                        }
                    } else {
                        if (!"DELETE_SKIP_FILE".equals(string)) {
                            return;
                        }
                        f52 = new F52(1);
                        c4496CxT2 = new C4496CxT(this);
                        C3cG.A0O(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        obj2 = null;
                        i2 = 11;
                    }
                    f52.execute(new Runnable() { // from class: X.CxU
                        public static final String __redex_internal_original_name = "ProfileInstaller$$ExternalSyntheticLambda0";

                        @Override // java.lang.Runnable
                        public final void run() {
                            c4496CxT2.AVZ(i2, obj2);
                        }
                    });
                    return;
                }
                return;
            }
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                c4496CxT = new C4496CxT(this);
                iMyPid = Process.myPid();
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                c4496CxT = new C4496CxT(this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    obj = null;
                    i = 15;
                    if (A00(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                        i = 14;
                    }
                    c4496CxT.AVZ(i, obj);
                }
                if (!"SAVE_PROFILE".equals(string2)) {
                    c4496CxT.AVZ(16, null);
                    return;
                }
                iMyPid = extras.getInt("EXTRA_PID", Process.myPid());
            }
            obj = null;
            Process.sendSignal(iMyPid, 10);
            i = 12;
            c4496CxT.AVZ(i, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A00(java.io.File r4) {
        /*
            boolean r1 = r4.isDirectory()
            r0 = 1
            if (r1 == 0) goto L24
            java.io.File[] r4 = r4.listFiles()
            r0 = 0
            if (r4 == 0) goto L27
            int r3 = r4.length
            r2 = 0
            r1 = 1
        L11:
            if (r2 >= r3) goto L23
            r0 = r4[r2]
            boolean r0 = A00(r0)
            if (r0 == 0) goto L1f
            r0 = r1
            r1 = 1
            if (r0 != 0) goto L20
        L1f:
            r1 = 0
        L20:
            int r2 = r2 + 1
            goto L11
        L23:
            return r1
        L24:
            r4.delete()
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileInstallReceiver.A00(java.io.File):boolean");
    }
}
