package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;

/* renamed from: X.EJz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6609EJz implements Runnable {
    public int A00 = 0;
    public final Context A01;
    public final EK5 A02;
    public final EK4 A03;
    public static final String __redex_internal_original_name = "ForceStopRunnable";
    public static final String A04 = EK9.A01(__redex_internal_original_name);

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + 315360000000L;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0386, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0387, code lost:
    
        r8.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x038a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01be, code lost:
    
        X.EK9.A00().A02(X.EKB.A05, "Reconciling jobs");
        r18 = true;
        r8.beginTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ce, code lost:
    
        r14 = r13.A06.getValue();
        r15 = r19.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01de, code lost:
    
        if (r15.hasNext() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e0, code lost:
    
        r14.AQB((java.lang.String) r15.next(), -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ec, code lost:
    
        r8.setTransactionSuccessful();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ef, code lost:
    
        r8.endTransaction();
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0376 A[Catch: SQLiteException -> 0x038b, all -> 0x0427, TryCatch #6 {SQLiteException -> 0x038b, blocks: (B:33:0x0136, B:35:0x0160, B:36:0x0164, B:39:0x016e, B:41:0x0174, B:42:0x0178, B:44:0x017e, B:46:0x018c, B:48:0x0192, B:49:0x019e, B:50:0x01a2, B:51:0x01aa, B:52:0x01ae, B:54:0x01b4, B:56:0x01be, B:62:0x01ef, B:117:0x0387, B:118:0x038a, B:63:0x01f2, B:74:0x0255, B:79:0x0260, B:81:0x0281, B:83:0x028b, B:84:0x02a2, B:85:0x02bd, B:88:0x02c7, B:91:0x02e6, B:92:0x02e9, B:94:0x02f7, B:96:0x02fd, B:98:0x031e, B:101:0x0326, B:103:0x032c, B:105:0x033a, B:113:0x0355, B:108:0x0343, B:115:0x0376, B:110:0x0348, B:112:0x034d), top: B:175:0x0136, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC6609EJz.run():void");
    }

    public RunnableC6609EJz(Context context, EK5 workManager) {
        this.A01 = context.getApplicationContext();
        this.A02 = workManager;
        this.A03 = workManager.A05;
    }
}
