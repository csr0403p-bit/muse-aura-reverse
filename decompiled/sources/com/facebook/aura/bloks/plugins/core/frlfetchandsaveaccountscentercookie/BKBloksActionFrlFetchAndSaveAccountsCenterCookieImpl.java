package com.facebook.aura.bloks.plugins.core.frlfetchandsaveaccountscentercookie;

import X.AbstractC7691FAk;
import X.AnonymousClass002;
import X.C4020Ck2;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.F2m;
import X.F6D;
import X.Hj6;
import X.HsM;
import android.os.Handler;
import com.facebook.aura.accountcenter.AuraMetaCookieRequestFactory;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;

/* loaded from: classes3.dex */
public final class BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl {
    public static final BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl INSTANCE = new BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl();
    public static final String TAG = "BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl";

    public static final Object evaluate(Hj6 hj6, final F6D f6d) {
        boolean zA1a = AnonymousClass002.A1a(hj6, f6d);
        Object obj = hj6.A01[0];
        obj.getClass();
        final HsM hsM = (HsM) obj;
        C7384Etj.A0U(hsM);
        Object obj2 = hj6.A01[zA1a ? 1 : 0];
        obj2.getClass();
        final HsM hsM2 = (HsM) obj2;
        C7384Etj.A0U(hsM2);
        new C4020Ck2(AuraMetaCookieRequestFactory.INSTANCE.getInstance()).A00(new F2m() { // from class: com.facebook.aura.bloks.plugins.core.frlfetchandsaveaccountscentercookie.BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl.evaluate.1
            @Override // X.F2m
            public void onFail(Throwable th) {
                CFK.A08(BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl.TAG, "Failed to fetch Meta cookie", th);
                Handler handlerA02 = C60O.A02();
                final HsM hsM3 = hsM2;
                final F6D f6d2 = f6d;
                handlerA02.post(new Runnable() { // from class: com.facebook.aura.bloks.plugins.core.frlfetchandsaveaccountscentercookie.BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl$evaluate$1$onFail$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HsM hsM4 = hsM3;
                        AbstractC7691FAk.A00(f6d2, Hj6.A02, hsM4);
                    }
                });
            }

            @Override // X.F2m
            public void onSuccess(String str) {
                CFK.A05(BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl.TAG, "Successfully fetched Meta cookie");
                if (str != null) {
                    AuraMetaFRLSecureTokenStore.INSTANCE.setMetaAccountCookie(str);
                }
                Handler handlerA02 = C60O.A02();
                final HsM hsM3 = hsM;
                final F6D f6d2 = f6d;
                handlerA02.post(new Runnable() { // from class: com.facebook.aura.bloks.plugins.core.frlfetchandsaveaccountscentercookie.BKBloksActionFrlFetchAndSaveAccountsCenterCookieImpl$evaluate$1$onSuccess$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HsM hsM4 = hsM3;
                        AbstractC7691FAk.A00(f6d2, Hj6.A02, hsM4);
                    }
                });
            }
        });
        return null;
    }
}
