package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.aura.file.actions.HatchShareKt;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.7n0, reason: invalid class name */
/* loaded from: classes3.dex */
public class C7n0 extends C77m {
    public final C7mJ A00;
    public final String A01;
    public final List A02;
    public final Set A03;

    @Override // X.C77m
    public final boolean A05(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        C7n7 c7n7A01 = A01(context, intent, this);
        C7mJ c7mJ = this.A00;
        Intent intentAAf = c7mJ.AAf(context, intent, this.A01);
        if (intentAAf == null) {
            return false;
        }
        Bundle bundle = null;
        A03(context);
        if (C77m.A02(context, intentAAf)) {
            c7mJ.A01.Ab1("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        A04(context, intent, intentAAf, this, c7n7A01);
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setShareIdentityEnabled(c7mJ.AKY());
            bundle = activityOptionsMakeBasic.toBundle();
        }
        context.startActivity(intentAAf, bundle);
        return true;
    }

    public final boolean A08(Context context, Intent intent) {
        if (intent.getPackage() == null && intent.getComponent() == null && intent.getSelector() == null) {
            StrictMode.noteSlowCall("Implicit intents using ScopedIntentLauncher queries all packages.");
        }
        C7n7 c7n7A01 = A01(context, intent, this);
        C7mJ c7mJ = this.A00;
        List<Intent> listAAg = c7mJ.AAg(context, intent, this.A01);
        if (listAAg.isEmpty()) {
            return false;
        }
        for (Intent intent2 : listAAg) {
            A04(context, intent, intent2, this, c7n7A01);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    BroadcastOptions broadcastOptionsMakeBasic = BroadcastOptions.makeBasic();
                    broadcastOptionsMakeBasic.setShareIdentityEnabled(c7mJ.AKY());
                    context.sendBroadcast(intent2, null, broadcastOptionsMakeBasic.toBundle());
                } else {
                    context.sendBroadcast(intent2, null);
                }
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof DeadObjectException)) {
                    throw e;
                }
            }
        }
        return true;
    }

    public static final C7n7 A01(Context context, Intent intent, C7n0 c7n0) {
        C7n7 c7n7;
        if (context != null) {
            List list = c7n0.A02;
            if (!list.isEmpty()) {
                synchronized (C7n7.class) {
                    if (TextUtils.isEmpty(intent.getStringExtra("MSF_INTENT_METADATA_ID"))) {
                        byte[] bArr = new byte[16];
                        new SecureRandom().nextBytes(bArr);
                        String strEncodeToString = Base64.encodeToString(bArr, 8);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String packageName = context.getPackageName();
                        intent.putExtra("MSF_INTENT_METADATA_ID", strEncodeToString);
                        intent.putExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", jCurrentTimeMillis);
                        intent.putExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME", packageName);
                        c7n7 = new C7n7();
                    } else {
                        intent.getLongExtra("MSF_INTENT_METADATA_LAUNCH_START_TIME", -1L);
                        intent.getStringExtra("MSF_INTENT_METADATA_ORIGIN_PACKAGE_NAME");
                        c7n7 = new C7n7();
                    }
                }
                new Intent(intent);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                    try {
                        throw new NullPointerException("shouldObserve");
                    } catch (Exception unused) {
                    }
                }
                return c7n7;
            }
        }
        return null;
    }

    private void A03(Context context) {
        if (context != null) {
            Set set = this.A03;
            if (set.isEmpty()) {
                return;
            }
            synchronized (set) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public static final void A04(Context context, Intent intent, Intent intent2, C7n0 c7n0, C7n7 c7n7) {
        if (context == null || c7n7 == null) {
            return;
        }
        List list = c7n0.A02;
        if (list.isEmpty()) {
            return;
        }
        new Intent(intent);
        new Intent(intent2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
            try {
                throw new NullPointerException("shouldObserve");
            } catch (Exception unused) {
            }
        }
    }

    public final C7n0 A06(String str) {
        if (this instanceof C7n2) {
            return new C7n2(this.A00, str, this.A02, this.A03);
        }
        if (this instanceof C7n3) {
            return new C7n3(this.A00, str, this.A02, this.A03);
        }
        if (this instanceof C7n6) {
            return new C7n6(this.A00, str, this.A02, this.A03);
        }
        if (this instanceof C7n5) {
            return new C7n5(this.A00, str, this.A02, this.A03);
        }
        boolean z = this instanceof C7n4;
        C7mJ c7mJ = this.A00;
        Set set = this.A03;
        List list = this.A02;
        return z ? new C7n4(c7mJ, str, list, set) : new C7n0(c7mJ, str, list, set);
    }

    public final boolean A07(Activity activity, Intent intent) {
        C7n7 c7n7A01 = A01(activity, intent, this);
        C7mJ c7mJ = this.A00;
        Intent intentAAf = c7mJ.AAf(activity, intent, this.A01);
        if (intentAAf == null) {
            return false;
        }
        A03(activity);
        A04(activity, intent, intentAAf, this, c7n7A01);
        Bundle bundle = null;
        if (Build.VERSION.SDK_INT >= 34) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            activityOptionsMakeBasic.setShareIdentityEnabled(c7mJ.AKY());
            bundle = activityOptionsMakeBasic.toBundle();
        }
        activity.startActivityForResult(intentAAf, HatchShareKt.MESSENGER_IMAGE_SHARE_REQUEST_CODE, bundle);
        return true;
    }

    public C7n0(C7mJ c7mJ, String str, List list, Set set) {
        this.A00 = c7mJ;
        this.A03 = set;
        this.A02 = list;
        this.A01 = str;
    }
}
