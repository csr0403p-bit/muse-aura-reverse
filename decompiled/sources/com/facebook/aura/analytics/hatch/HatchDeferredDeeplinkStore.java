package com.facebook.aura.analytics.hatch;

import X.AbstractC06907md;
import X.AnonymousClass002;
import X.BzK;
import X.C3cG;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.DCl;
import android.net.Uri;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchDeferredDeeplinkStore {
    public static final int $stable = 0;
    public static final String ENTRY_CONTEXT_TOKEN_PARAM = "entry_context_token";
    public static final HatchDeferredDeeplinkStore INSTANCE = new HatchDeferredDeeplinkStore();
    public static final String KEY_ATTEMPTS = "hatch_deferred_deeplink_attempts";
    public static final String KEY_CAPTURED_AT_MS = "hatch_deferred_deeplink_captured_at_ms";
    public static final String KEY_TOKEN = "hatch_deferred_deeplink_token";
    public static final int MAX_ATTEMPTS = 3;
    public static final int MAX_TOKEN_BYTES = 4096;
    public static final String TAG = "HatchDeferredDeeplinkStore";
    public static final long TOKEN_LIFETIME_MS = 604800000;

    public final synchronized void captureFromAppManagerCustomData(String str, long j) {
        Object next;
        String strA0Q;
        String str2;
        if (str != null) {
            if (!C7BY.A0j(str)) {
                Iterator it = C7BY.A0h(str, new char[1], '&').iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    next = it.next();
                    str2 = (String) next;
                } while (!"entry_context_token".equals(C7BY.A0S(str2, str2, '=')));
                String str3 = (String) next;
                if (str3 == null || (strA0Q = C7BY.A0Q(str3, "", '=')) == null) {
                    storeToken(str, j);
                } else {
                    try {
                        str = URLDecoder.decode(strA0Q, DCl.A05.name());
                        storeToken(str, j);
                    } catch (IllegalArgumentException e) {
                        CFK.A0K(TAG, e, "Rejecting malformed App Manager entry-context token");
                    }
                }
            }
        }
    }

    public final synchronized void captureFromReferrer(String str, long j) {
        String strDecodedValue = HatchInstallReferrerParams.INSTANCE.decodedValue(str, "entry_context_token");
        if (strDecodedValue != null) {
            storeToken(strDecodedValue, j);
        }
    }

    public final synchronized void captureFromUri(Uri uri, long j) {
        String queryParameter = null;
        if (uri != null) {
            try {
                queryParameter = uri.getQueryParameter("entry_context_token");
            } catch (UnsupportedOperationException e) {
                CFK.A0K(TAG, e, "Rejecting opaque entry-context deeplink");
            }
            storeToken(queryParameter, j);
        } else {
            storeToken(queryParameter, j);
        }
    }

    public final synchronized boolean clearIfMatches(String str) {
        C7384Etj.A0Y(str, 0);
        if (!str.equals(C4oT.A00(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER), KEY_TOKEN))) {
            return false;
        }
        clearStoredHandoff();
        return true;
    }

    public final synchronized String getPendingToken(long j) {
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
        String string = c4oT.getString(KEY_TOKEN, null);
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                long j2 = c4oT.getLong(KEY_CAPTURED_AT_MS, 0L);
                int i = c4oT.getInt(KEY_ATTEMPTS, 0);
                if (j2 > 0 && j >= j2 && j - j2 <= 604800000 && i < 3) {
                    return string;
                }
                clearIfMatches(string);
                return null;
            }
        }
        return null;
    }

    public final boolean hasEntryContextToken(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            return uri.getQueryParameter("entry_context_token") != null;
        } catch (UnsupportedOperationException unused) {
            return false;
        }
    }

    public final synchronized boolean recordAttemptIfMatches(String str) {
        C7384Etj.A0Y(str, 0);
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
        if (str.equals(C4oT.A00(c4oT, KEY_TOKEN))) {
            int i = c4oT.getInt(KEY_ATTEMPTS, 0) + 1;
            if (i < 3) {
                BzK bzKA9q = c4oT.A9q();
                bzKA9q.AYo(KEY_ATTEMPTS, i);
                bzKA9q.commit();
                return true;
            }
            clearStoredHandoff();
        }
        return false;
    }

    public static /* synthetic */ void captureFromAppManagerCustomData$default(HatchDeferredDeeplinkStore hatchDeferredDeeplinkStore, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredDeeplinkStore.captureFromAppManagerCustomData(str, j);
    }

    public static /* synthetic */ void captureFromReferrer$default(HatchDeferredDeeplinkStore hatchDeferredDeeplinkStore, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredDeeplinkStore.captureFromReferrer(str, j);
    }

    public static /* synthetic */ void captureFromUri$default(HatchDeferredDeeplinkStore hatchDeferredDeeplinkStore, Uri uri, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        hatchDeferredDeeplinkStore.captureFromUri(uri, j);
    }

    private final void clearStoredHandoff() {
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.INSTALL_REFERRER, AuraDevicePrefs.INSTANCE);
        bzKA0F.Aae(KEY_TOKEN);
        bzKA0F.Aae(KEY_CAPTURED_AT_MS);
        bzKA0F.Aae(KEY_ATTEMPTS);
        bzKA0F.commit();
    }

    public static /* synthetic */ String getPendingToken$default(HatchDeferredDeeplinkStore hatchDeferredDeeplinkStore, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return hatchDeferredDeeplinkStore.getPendingToken(j);
    }

    private final C4oT getPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
    }

    private final void storeToken(String str, long j) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) {
            return;
        }
        int length = C3cG.A1S(strA0l).length;
        if (strA0l.length() == 0 || length > 4096) {
            return;
        }
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.INSTALL_REFERRER, AuraDevicePrefs.INSTANCE);
        bzKA0F.AYr(KEY_TOKEN, strA0l);
        bzKA0F.AYp(KEY_CAPTURED_AT_MS, j);
        bzKA0F.Aae(KEY_ATTEMPTS);
        bzKA0F.commit();
    }

    public final Uri withoutEntryContextToken(Uri uri) {
        String encodedQuery;
        if (uri == null || (encodedQuery = uri.getEncodedQuery()) == null) {
            return uri;
        }
        List listA0d = C7BY.A0d(encodedQuery);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            if (!"entry_context_token".equals(Uri.decode(C7BY.A0S(str, str, '=')))) {
                arrayListA0h.add(next);
            }
        }
        String strA01 = AbstractC06907md.A01("&", arrayListA0h, null);
        return uri.buildUpon().encodedQuery(strA01.length() != 0 ? strA01 : null).build();
    }

    public final String withoutEntryContextToken(String str) {
        return HatchInstallReferrerParams.INSTANCE.without(str, "entry_context_token");
    }
}
