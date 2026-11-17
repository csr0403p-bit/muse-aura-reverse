package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.Trace;
import com.facebook.analytics2.logger.legacy.uploader.PrivacyControlledUploader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ckl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC4042Ckl extends Handler {
    public PrivacyControlledUploader A00;
    public C4011Cjp A01;
    public Iterator<InterfaceC3367CHl> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final DQZ<String, File> A07;
    public final C3366CHk A08;
    public final C4065ClC A09;
    public final InterfaceC4069ClG A0A;
    public final HandlerThread A0B;
    public final boolean A0C;
    public static final C3339CFj A0E = new C3339CFj();
    public static final C4015Cjv A0D = new C4015Cjv();

    public HandlerC4042Ckl(Context context, HandlerThread handlerThread, C4065ClC c4065ClC, InterfaceC4069ClG interfaceC4069ClG) {
        super(handlerThread.getLooper());
        this.A07 = new DQZ<>(2);
        this.A03 = false;
        this.A04 = false;
        this.A08 = new C3366CHk(this);
        this.A06 = context;
        this.A0B = handlerThread;
        this.A09 = c4065ClC;
        this.A0A = interfaceC4069ClG;
        this.A0C = true;
    }

    private void A00() {
        PendingIntent broadcast;
        String nameForUid;
        String str;
        AbstractC3136BzG.A00("exitStateMachine");
        try {
            Context context = this.A06;
            C4065ClC c4065ClC = this.A09;
            int i = c4065ClC.A00;
            String str2 = c4065ClC.A02;
            boolean z = this.A05;
            DQZ<String, File> dqz = this.A07;
            if (i == -1) {
                throw C60O.A0i("jobId = -1");
            }
            Intent intent = C60P.A03("com.facebook.analytics2.action.UPLOAD_JOB_RAN").setPackage(context.getPackageName());
            Bundle bundleA0N = BV6.A0N();
            bundleA0N.putInt("job_id", i);
            bundleA0N.putString("hack_action", str2);
            bundleA0N.putBoolean("will_retry", z);
            int size = dqz.size();
            ArrayList<String> arrayListA11 = C60O.A11(size);
            ArrayList<String> arrayListA112 = C60O.A11(size);
            for (int i2 = 0; i2 < size; i2++) {
                File fileA07 = dqz.A07(i2);
                arrayListA11.add(dqz.A05(i2));
                arrayListA112.add(fileA07 != null ? fileA07.getAbsolutePath() : null);
            }
            bundleA0N.putStringArrayList("successful_processes", arrayListA11);
            bundleA0N.putStringArrayList("newest_files_uploaded", arrayListA112);
            Intent intentPutExtras = intent.putExtras(bundleA0N);
            Intent intentA03 = C60P.A03("com.facebook.analytics2.action.UPLOAD_JOB_RAN.token");
            intentA03.setPackage(context.getPackageName());
            try {
                broadcast = PendingIntent.getBroadcast(context, 0, intentA03, Build.VERSION.SDK_INT >= 30 ? 1140850688 : 1073741824);
            } catch (SecurityException e) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int iMyUid = Process.myUid();
                broadcast = null;
                String nameForUid2 = packageManager != null ? packageManager.getNameForUid(iMyUid) : null;
                int callingUid = Binder.getCallingUid();
                if (packageManager != null) {
                    nameForUid = packageManager.getNameForUid(callingUid);
                    List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
                    if (installedPackages != null) {
                        for (PackageInfo packageInfo : installedPackages) {
                            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                            if (applicationInfo != null && applicationInfo.uid == iMyUid) {
                                str = packageInfo.packageName;
                                break;
                            }
                        }
                    }
                } else {
                    nameForUid = null;
                }
                str = null;
                CFK.A0H("UploadServiceBus", "%s, ctx_pm=%s, uid=%d, uid_pn=%s, calling_uid=%d, calling_uid_pn=%s, pi_pn=%s", e.getMessage(), packageName, Integer.valueOf(iMyUid), nameForUid2, Integer.valueOf(callingUid), nameForUid, str);
            }
            try {
                context.sendBroadcast(intentPutExtras.putExtra("uploader_service_broadcast_auth_token", broadcast));
            } catch (RuntimeException e2) {
                if (e2 instanceof SecurityException) {
                    CFK.A0B("UploadServiceBus", "Analytics2 not allowed in this application.", e2);
                } else {
                    Throwable cause = e2.getCause();
                    if (cause == null) {
                        throw e2;
                    }
                    while (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    if (!(cause instanceof DeadObjectException)) {
                        throw e2;
                    }
                    CFK.A08("UploadServiceBus", "Failed to send broadcast. Handler may have died", e2);
                }
            }
            this.A0A.ATB();
            if (this.A0C) {
                this.A0B.quit();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x017a, TryCatch #1 {all -> 0x017a, blocks: (B:15:0x0021, B:17:0x0029, B:18:0x002f, B:22:0x0045, B:28:0x005b, B:30:0x0065, B:31:0x006a, B:33:0x0077, B:34:0x007d, B:36:0x008d, B:38:0x0091, B:39:0x009d, B:41:0x00a3, B:42:0x00af, B:44:0x00b3, B:47:0x00c6, B:49:0x00d3, B:50:0x00dc, B:53:0x00ea, B:56:0x0102, B:58:0x0115, B:59:0x0120, B:61:0x013d, B:62:0x0142, B:63:0x0147, B:55:0x00f8, B:69:0x0166, B:70:0x0179, B:46:0x00c1, B:52:0x00e7, B:67:0x0151), top: B:77:0x000b, inners: #0, #2, #3 }] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r20) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC4042Ckl.handleMessage(android.os.Message):void");
    }
}
