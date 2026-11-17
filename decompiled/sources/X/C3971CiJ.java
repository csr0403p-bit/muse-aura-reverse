package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.CiJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3971CiJ {
    public static C3971CiJ A02;
    public final PowerManager A00;
    public final ExecutorService A01 = Executors.newSingleThreadExecutor();

    public C3971CiJ(Context context) {
        this.A00 = (PowerManager) context.getSystemService("power");
    }
}
