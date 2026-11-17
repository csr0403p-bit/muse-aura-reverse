package com.facebook.aura.bloks.fbpay.pttprovider;

import X.AIF;
import X.AbstractC3358CGz;
import X.C3cH;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.EVP;
import X.EVT;
import X.EVa;
import X.EWD;
import X.F3H;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes5.dex */
public final class AuraPttManagerProvider$CREATOR$1<T> implements AIF {
    public static final AuraPttManagerProvider$CREATOR$1<T> INSTANCE = new AuraPttManagerProvider$CREATOR$1<>();

    /* renamed from: create, reason: merged with bridge method [inline-methods] */
    public final EWD m284create(Context context) {
        F3H f3h;
        C7384Etj.A0Y(context, 0);
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        String str = currentUserSession != null ? ((CH0) currentUserSession).A01 : "";
        SharedPreferences sharedPreferences = context.getSharedPreferences("aura_ptt", 0);
        EVT evt = new EVT(new EVP(C3cH.A0I()));
        AuraFBPayExecutors auraFBPayExecutors = new AuraFBPayExecutors();
        Context applicationContext = context.getApplicationContext();
        NoopAuthTicketApi noopAuthTicketApi = new NoopAuthTicketApi();
        try {
            f3h = new F3H(applicationContext);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            CFK.A08("DefaultAuthTicketManager", "Failed to create store", e);
            f3h = null;
        }
        return new EWD(auraFBPayExecutors, new NoopServerCertApi(), evt, new EVa(sharedPreferences, auraFBPayExecutors, noopAuthTicketApi, f3h, str));
    }
}
