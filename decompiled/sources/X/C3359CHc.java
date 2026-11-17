package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CHc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3359CHc {
    public final Context A00;

    public static final InterfaceC4309Csx A00(C3359CHc c3359CHc) throws PackageManager.NameNotFoundException {
        String string;
        Context context = c3359CHc.A00;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayListA0h = C3cG.A0h();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (((PackageItemInfo) serviceInfo).metaData != null && (string = ((PackageItemInfo) serviceInfo).metaData.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayListA0h.add(string);
                }
            }
        }
        List listA0X = AbstractC0878AGe.A0X(arrayListA0h);
        if (listA0X.isEmpty()) {
            return null;
        }
        Iterator it = listA0X.iterator();
        InterfaceC4309Csx interfaceC4309Csx = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName(AnonymousClass005.A0j(it)).getConstructor(Context.class).newInstance(context);
                C7384Etj.A0Z(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC4309Csx interfaceC4309Csx2 = (InterfaceC4309Csx) objNewInstance;
                if (!interfaceC4309Csx2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC4309Csx != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC4309Csx = interfaceC4309Csx2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC4309Csx;
    }

    private final C4301Csp A01() {
        C4301Csp c4301Csp = new C4301Csp(this.A00);
        if (c4301Csp.isAvailableOnDevice()) {
            return c4301Csp;
        }
        return null;
    }

    public final InterfaceC4309Csx A02(boolean z) {
        C4301Csp c4301CspA01;
        Context context = this.A00;
        return (context.getPackageManager().hasSystemFeature(C8j2.A00(63)) || context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") || Build.VERSION.SDK_INT < 34 || ((c4301CspA01 = A01()) == null && z)) ? A00(this) : c4301CspA01;
    }

    public C3359CHc(Context context) {
        this.A00 = context;
    }
}
