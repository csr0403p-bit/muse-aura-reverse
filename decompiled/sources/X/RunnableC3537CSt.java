package X;

import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: X.CSt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3537CSt implements Runnable {
    public static final String __redex_internal_original_name = "zzax";
    public final FirebaseInstanceId A00;
    public final long A01;
    public final PowerManager.WakeLock A02;
    public final C3538CSv A03;

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02e7, code lost:
    
        if (X.BV4.A1U("FirebaseInstanceId") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e9, code lost:
    
        android.util.Log.d("FirebaseInstanceId", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0300, code lost:
    
        throw X.BV4.A0K("token not available");
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0150 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6 A[Catch: all -> 0x0350, TryCatch #0 {all -> 0x0350, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x001b, B:8:0x001e, B:9:0x001f, B:11:0x0029, B:13:0x0034, B:15:0x003e, B:16:0x0044, B:18:0x004c, B:20:0x0055, B:21:0x005a, B:23:0x0062, B:25:0x006f, B:27:0x0075, B:29:0x007b, B:31:0x008a, B:32:0x008f, B:33:0x00a6, B:35:0x00b6, B:37:0x00c4, B:39:0x00e7, B:131:0x0319, B:40:0x00ee, B:42:0x00f4, B:44:0x00fb, B:46:0x0103, B:47:0x0128, B:48:0x012e, B:54:0x014d, B:55:0x014f, B:60:0x015d, B:62:0x0167, B:63:0x016c, B:67:0x0178, B:69:0x0180, B:71:0x018e, B:73:0x01a5, B:74:0x01a9, B:76:0x01bf, B:77:0x01c3, B:79:0x01e7, B:80:0x01ef, B:81:0x01f5, B:124:0x02f9, B:125:0x0300, B:82:0x01fb, B:84:0x0203, B:86:0x0211, B:88:0x0228, B:89:0x022c, B:91:0x023b, B:92:0x023f, B:94:0x0263, B:95:0x026a, B:96:0x0270, B:123:0x02f1, B:127:0x0302, B:129:0x0312, B:130:0x0316, B:132:0x031f, B:97:0x0276, B:118:0x02e1, B:159:0x034f, B:50:0x0130, B:52:0x0140, B:53:0x0146, B:147:0x0333, B:149:0x0336), top: B:165:0x0000, inners: #3, #7 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC3537CSt.run():void");
    }

    public RunnableC3537CSt(FirebaseInstanceId firebaseInstanceId, C3538CSv c3538CSv, long j) {
        this.A00 = firebaseInstanceId;
        this.A03 = c3538CSv;
        this.A01 = j;
        C3554CTr c3554CTr = firebaseInstanceId.A02;
        C3554CTr.A01(c3554CTr);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) c3554CTr.A00.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A02 = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }
}
