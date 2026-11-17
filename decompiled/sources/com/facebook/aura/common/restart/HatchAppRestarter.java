package com.facebook.aura.common.restart;

import X.C3cG;
import X.C60R;
import X.C6T;
import X.C7384Etj;
import X.C77m;
import X.FGI;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.facebook.common.exceptionhandler.UserInitiatedExpectedAppExitException;

/* loaded from: classes3.dex */
public final class HatchAppRestarter {
    public static final String EXTRA_REPLAY_SPLASH = "replay_splash";
    public static final HatchAppRestarter INSTANCE = new HatchAppRestarter();

    public final void exitApp(String str) {
        C7384Etj.A0Y(str, 0);
        C6T.A00(new UserInitiatedExpectedAppExitException(str));
        Process.killProcess(Process.myPid());
    }

    public final void relaunchApp(String str, Context context, Intent intent, boolean z) {
        Context contextA06;
        C7384Etj.A0Y(str, 0);
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        if (context == null || (contextA06 = context.getApplicationContext()) == null) {
            contextA06 = C3cG.A06();
        }
        if (intent == null) {
            intent = launchIntent(context);
        }
        C77m.A00(contextA06, intent);
        if (z) {
            exitApp(FGI.A0M("Expected application restart: ", str));
        }
    }

    public static /* synthetic */ Intent launchIntent$default(HatchAppRestarter hatchAppRestarter, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return hatchAppRestarter.launchIntent(context);
    }

    public static /* synthetic */ void relaunchApp$default(HatchAppRestarter hatchAppRestarter, String str, Context context, Intent intent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            context = null;
        }
        if ((i & 4) != 0) {
            intent = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        hatchAppRestarter.relaunchApp(str, context, intent, z);
    }

    public final Intent launchIntent(Context context) {
        Context contextA06;
        if (context == null || (contextA06 = context.getApplicationContext()) == null) {
            contextA06 = C3cG.A06();
        }
        Intent intentA08 = C60R.A08(contextA06);
        if (intentA08 != null) {
            return intentA08.addFlags(268435456);
        }
        return null;
    }
}
