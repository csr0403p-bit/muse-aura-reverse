package com.facebook.aura.bloks.extensions.fx;

import X.AbstractC7691FAk;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C3cG;
import X.C7384Etj;
import X.C8j4;
import X.C9115Fyg;
import X.CFK;
import X.EPC;
import X.EPL;
import X.EPP;
import X.EPY;
import X.F6D;
import X.FBD;
import X.Hj6;
import X.HoH;
import X.HsM;
import android.content.Context;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AuraFXCalExtensions {
    public static final AuraFXCalExtensions INSTANCE = new AuraFXCalExtensions();
    public static final String TAG = "FXCalExtension";

    public static final Object fetchAllNativeAuthData(FBD fbd, F6D f6d, Hj6 hj6) {
        int iA0C = AnonymousClass002.A0C(f6d, hj6, 1);
        Object[] objArr = hj6.A01;
        String str = (String) objArr[0];
        HsM hsMA0B = C7384Etj.A0B(objArr, iA0C);
        List<Object> authData = INSTANCE.getAuthData(str, null);
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(authData, 0);
        AbstractC7691FAk.A00(f6d, c9115Fyg.A05(), hsMA0B);
        return null;
    }

    public static final Object fetchAllNativeAuthDataForCaller(FBD fbd, F6D f6d, Hj6 hj6) {
        int iA0C = AnonymousClass002.A0C(f6d, hj6, 1);
        Object[] objArr = hj6.A01;
        String str = (String) objArr[0];
        HsM hsMA0B = C7384Etj.A0B(objArr, iA0C);
        String str2 = (String) hj6.A01[3];
        List<Object> authData = str2 != null ? INSTANCE.getAuthData(str, str2) : C3cG.A0h();
        C9115Fyg c9115Fyg = new C9115Fyg();
        c9115Fyg.A06(authData, 0);
        AbstractC7691FAk.A00(f6d, c9115Fyg.A05(), hsMA0B);
        return null;
    }

    public static final Object loadingOverlay(F6D f6d, Hj6 hj6) {
        HsM hsM;
        boolean zA1a = AnonymousClass002.A1a(f6d, hj6);
        HoH.A01(hj6.A01[0]);
        HoH.A01(hj6.A01[zA1a ? 1 : 0]);
        Object obj = hj6.A01[2];
        if ((obj instanceof HsM) && (hsM = (HsM) obj) != null) {
            AbstractC7691FAk.A00(f6d, Hj6.A02, hsM);
        }
        return null;
    }

    private final List<Object> getAuthData(String str, String str2) {
        List<Object> mwaCurrentActiveCredential;
        if (str == null) {
            str = "";
        }
        ArrayList arrayListA0h = C3cG.A0h();
        if (str.equals("Facebook")) {
            mwaCurrentActiveCredential = getFbCurrentActiveCredential(str2);
        } else if (str.equals("Instagram")) {
            mwaCurrentActiveCredential = getIgCredential(str2);
        } else {
            arrayListA0h.addAll(getFbCurrentActiveCredential(str2));
            arrayListA0h.addAll(getIgCredential(str2));
            mwaCurrentActiveCredential = getMwaCurrentActiveCredential(str2);
        }
        arrayListA0h.addAll(mwaCurrentActiveCredential);
        return BV4.A0t(arrayListA0h);
    }

    private final List<Object> getCurrentActiveCredential(String str, String str2, EPL epl, String str3) {
        ArrayList arrayListA0h;
        EPC epc = new EPC(new EPP());
        try {
            Context contextA06 = C3cG.A06();
            HashSet hashSetA0x = BV4.A0x(Collections.singletonList(epl));
            String str4 = str3;
            if (str3 == null) {
                str4 = TAG;
            }
            arrayListA0h = epc.A0E(contextA06, str4, hashSetA0x);
        } catch (Exception e) {
            if (str3 == null) {
                str3 = TAG;
            }
            CFK.A0C(TAG, "SSO credential fetch failed for %s", e, str3);
            arrayListA0h = C3cG.A0h();
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0h2.add(wrapAccountItem((EPY) it.next(), str, MAHatchNativeAuthAppStartLoggerKt.ACTIVE_ACCOUNT, str2));
        }
        return arrayListA0h2;
    }

    private final List<Object> getFbCurrentActiveCredential(String str) {
        return getCurrentActiveCredential("Facebook", "Facebook", EPL.A05, str);
    }

    private final List<Object> getIgCurrentActiveCredential(String str) {
        return getCurrentActiveCredential("Instagram", "Instagram", EPL.A0D, str);
    }

    private final List<Object> getIgMasCredentials(String str) {
        ArrayList arrayListA0h = C3cG.A0h();
        try {
            EPC epc = new EPC(new EPP());
            Context contextA06 = C3cG.A06();
            ArrayList arrayListA0t = BV4.A0t(Collections.singletonList(EPL.A0D));
            AnonymousClass003.A0u(contextA06, arrayListA0t);
            Iterator it = epc.A07(contextA06, BV5.A0j(), str, arrayListA0t).iterator();
            while (it.hasNext()) {
                arrayListA0h.add(wrapAccountItem((EPY) it.next(), "Instagram", MAHatchNativeAuthAppStartLoggerKt.INACTIVE_LOGGED_IN_ACCOUNTS, "Instagram"));
            }
            return arrayListA0h;
        } catch (SecurityException e) {
            CFK.A0J(TAG, e, "SecurityException at fetching multi-IG data");
            return arrayListA0h;
        }
    }

    private final List<Object> getMwaCurrentActiveCredential(String str) {
        return getCurrentActiveCredential("Facebook", "Oculus", EPL.A0J, str);
    }

    public static final Object getFamilyDeviceId() {
        String strA0f = BV4.A0f();
        C7384Etj.A0U(strA0f);
        return strA0f;
    }

    private final List<Object> getIgCredential(String str) {
        Object next;
        Object next2;
        Object value;
        ArrayList arrayListA0h = C3cG.A0h();
        List<Object> igCurrentActiveCredential = getIgCurrentActiveCredential(str);
        List<Object> igMasCredentials = getIgMasCredentials(str);
        arrayListA0h.addAll(igCurrentActiveCredential);
        if (igCurrentActiveCredential.isEmpty()) {
            arrayListA0h.addAll(igMasCredentials);
        } else {
            Object objA0p = C8j4.A0p(igCurrentActiveCredential);
            C7384Etj.A0Z(objA0p, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Iterator itA0n = AnonymousClass002.A0n((Map) objA0p);
            while (true) {
                if (!itA0n.hasNext()) {
                    next = null;
                    break;
                }
                next = itA0n.next();
                if (C7384Etj.areEqual(((Map.Entry) next).getKey(), NodeCommandFallbackWorker.KEY_USER_ID)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) next;
            Object value2 = entry != null ? entry.getValue() : null;
            for (Object obj : igMasCredentials) {
                C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                Iterator itA0n2 = AnonymousClass002.A0n((Map) obj);
                while (true) {
                    if (!itA0n2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = itA0n2.next();
                    if (C7384Etj.areEqual(((Map.Entry) next2).getKey(), NodeCommandFallbackWorker.KEY_USER_ID)) {
                        break;
                    }
                }
                Map.Entry entry2 = (Map.Entry) next2;
                if (entry2 == null || (value = entry2.getValue()) == null || !value.equals(value2)) {
                    arrayListA0h.add(obj);
                }
            }
        }
        return arrayListA0h;
    }

    private final Object wrapAccountItem(EPY epy, String str, String str2, String str3) {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(NodeCommandFallbackWorker.KEY_USER_ID, epy.A03);
        mapA0u.put("auth_token", epy.A02);
        mapA0u.put("account_type", str);
        mapA0u.put("account_source", str2);
        mapA0u.put("app_source", str3);
        return mapA0u;
    }
}
