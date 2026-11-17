package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CWd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3594CWd implements InterfaceC3902Cgg {
    public final C3597CWg A00;
    public final C3596CWf A01;
    public final Map<String, InterfaceC3835CfO> A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.AbstractMap, java.util.HashMap] */
    @Override // X.InterfaceC3902Cgg
    public final synchronized InterfaceC3835CfO ABy(String str) {
        InterfaceC3835CfO c3831CfK;
        ?? A0u;
        PackageManager packageManager;
        Map<String, InterfaceC3835CfO> map = this.A02;
        if (!map.containsKey(str)) {
            C3596CWf c3596CWf = this.A01;
            Map<String, String> map2 = c3596CWf.A00;
            Map<String, String> map3 = map2;
            if (map2 == null) {
                Context context = c3596CWf.A01;
                try {
                    packageManager = context.getPackageManager();
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        Bundle bundle = ((PackageItemInfo) serviceInfo).metaData;
                        if (bundle != null) {
                            A0u = BV4.A0u();
                            Iterator itA0w = BV5.A0w(bundle);
                            while (itA0w.hasNext()) {
                                String strA0j = AnonymousClass005.A0j(itA0w);
                                Object obj = bundle.get(strA0j);
                                if ((obj instanceof String) && strA0j.startsWith("backend:")) {
                                    String[] strArrA1a = BV4.A1a((String) obj, ",");
                                    int length = strArrA1a.length;
                                    for (int i = 0; i < length; i++) {
                                        String strA0r = BV6.A0r(strArrA1a, i);
                                        if (!strA0r.isEmpty()) {
                                            A0u.put(strA0r, strA0j.substring(8));
                                        }
                                    }
                                }
                            }
                            c3596CWf.A00 = A0u;
                            map3 = A0u;
                        }
                    }
                }
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                A0u = Collections.EMPTY_MAP;
                c3596CWf.A00 = A0u;
                map3 = A0u;
            }
            String strA0p = C60O.A0p(str, map3);
            if (strA0p != null) {
                try {
                    try {
                        if (((InterfaceC3599CWj) BV5.A0b(Class.forName(strA0p).asSubclass(InterfaceC3599CWj.class))) != null) {
                            C3597CWg c3597CWg = this.A00;
                            Context context2 = c3597CWg.A00;
                            InterfaceC3770CeD interfaceC3770CeD = c3597CWg.A02;
                            InterfaceC3770CeD interfaceC3770CeD2 = c3597CWg.A01;
                            if (context2 == null) {
                                throw BV4.A0a("Null applicationContext");
                            }
                            if (interfaceC3770CeD == null) {
                                throw BV4.A0a("Null wallClock");
                            }
                            if (interfaceC3770CeD2 == null) {
                                throw BV4.A0a("Null monotonicClock");
                            }
                            if (str == null) {
                                throw BV4.A0a("Null backendName");
                            }
                            c3831CfK = new C3831CfK(context2, interfaceC3770CeD, interfaceC3770CeD2);
                            map.put(str, c3831CfK);
                        }
                    } catch (InstantiationException e) {
                        Log.w("BackendRegistry", String.format("Could not instantiate %s.", strA0p), e);
                    } catch (NoSuchMethodException e2) {
                        Log.w("BackendRegistry", String.format("Could not instantiate %s", strA0p), e2);
                    }
                } catch (ClassNotFoundException e3) {
                    Log.w("BackendRegistry", String.format("Class %s is not found.", strA0p), e3);
                } catch (IllegalAccessException e4) {
                    Log.w("BackendRegistry", String.format("Could not instantiate %s.", strA0p), e4);
                } catch (InvocationTargetException e5) {
                    Log.w("BackendRegistry", String.format("Could not instantiate %s", strA0p), e5);
                }
            }
            return null;
        }
        c3831CfK = map.get(str);
        return c3831CfK;
    }

    public C3594CWd(Context context, C3597CWg c3597CWg) {
        C3596CWf c3596CWf = new C3596CWf(context);
        this.A02 = BV4.A0u();
        this.A01 = c3596CWf;
        this.A00 = c3597CWg;
    }
}
