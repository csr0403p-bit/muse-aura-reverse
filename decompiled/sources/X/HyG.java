package X;

import android.content.Context;
import android.os.UserManager;
import com.facebook.aura.commands.health.HealthSyncManagerKt;

/* loaded from: classes6.dex */
public abstract class HyG {
    public static final int A00(Context context) {
        Object systemService = context.getSystemService("user");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.os.UserManager");
        return (((UserManager) systemService).isProfile() || context.getSystemService(HealthSyncManagerKt.DEFAULT_PROVIDER_ID) == null) ? 1 : 3;
    }
}
