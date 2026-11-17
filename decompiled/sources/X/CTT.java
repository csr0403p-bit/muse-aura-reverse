package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.iid.zzm;

/* loaded from: classes5.dex */
public final class CTT {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public zzm A01;
    public final Context A03;
    public final CSi A05;
    public final DQZ<String, CSE<Bundle>> A04 = new DQZ<>(0);
    public Messenger A02 = new Messenger(new CTU(Looper.getMainLooper(), this));

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:64:0x010e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final android.os.Bundle A00(android.os.Bundle r11, X.CTT r12) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CTT.A00(android.os.Bundle, X.CTT):android.os.Bundle");
    }

    public static final void A01(Bundle bundle, CTT ctt, String str) {
        DQZ<String, CSE<Bundle>> dqz = ctt.A04;
        synchronized (dqz) {
            CSE<Bundle> cseRemove = dqz.remove(str);
            if (cseRemove == null) {
                String strValueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            } else {
                cseRemove.A02(bundle);
            }
        }
    }

    public CTT(Context context, CSi cSi) {
        this.A03 = context;
        this.A05 = cSi;
    }
}
