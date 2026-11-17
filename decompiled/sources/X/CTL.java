package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CTL {
    public CTO A00;
    public Boolean A01;
    public final CT8 A02;
    public final boolean A03;
    public final /* synthetic */ FirebaseInstanceId A04;

    public final synchronized boolean A00() {
        boolean z;
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.A03) {
            C3554CTr c3554CTr = this.A04.A02;
            C3554CTr.A01(c3554CTr);
            CTN ctn = c3554CTr.A03.get();
            synchronized (ctn) {
                z = ctn.A00;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.CTO, java.lang.Object] */
    public CTL(CT8 ct8, FirebaseInstanceId firebaseInstanceId) throws ClassNotFoundException {
        boolean z;
        Boolean boolValueOf;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.A04 = firebaseInstanceId;
        this.A02 = ct8;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            C3554CTr c3554CTr = firebaseInstanceId.A02;
            C3554CTr.A01(c3554CTr);
            Context context = c3554CTr.A00;
            Intent intentA03 = C60P.A03("com.google.firebase.MESSAGING_EVENT");
            intentA03.setPackage(context.getPackageName());
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentA03, 0);
            z = (resolveInfoResolveService == null || resolveInfoResolveService.serviceInfo == null) ? false : true;
        }
        this.A03 = z;
        C3554CTr c3554CTr2 = this.A04.A02;
        C3554CTr.A01(c3554CTr2);
        Context context2 = c3554CTr2.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                packageManager = context2.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = ((PackageItemInfo) applicationInfo).metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) ? null : Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        }
        this.A01 = boolValueOf;
        if (boolValueOf == null && z) {
            ?? r4 = new Object(this) { // from class: X.CTO
                public final CTL A00;

                {
                    this.A00 = this;
                }
            };
            this.A00 = r4;
            CTM ctm = (CTM) ct8;
            Executor executor = ctm.A02;
            synchronized (ctm) {
                Map map = ctm.A01;
                if (!map.containsKey(CTP.class)) {
                    map.put(CTP.class, C60O.A1C());
                }
                ((ConcurrentHashMap) map.get(CTP.class)).put(r4, executor);
            }
        }
    }
}
