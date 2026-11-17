package androidx.legacy.content;

import X.BV4;
import android.content.BroadcastReceiver;
import android.os.PowerManager;
import android.util.SparseArray;

@Deprecated
/* loaded from: classes5.dex */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {
    public static int A00 = 1;
    public static final SparseArray<PowerManager.WakeLock> A01 = BV4.A0B();
}
