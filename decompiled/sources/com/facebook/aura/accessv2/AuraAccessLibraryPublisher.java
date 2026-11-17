package com.facebook.aura.accessv2;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.BV7;
import X.BzK;
import X.C4JM;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.CQD;
import X.CQG;
import X.CallableC7565F4e;
import X.CallableC7567F4g;
import X.EO5;
import X.EOC;
import X.EOH;
import X.EOL;
import X.EnumC3451CNw;
import X.F08;
import X.F0C;
import X.F54;
import android.content.Context;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes5.dex */
public final class AuraAccessLibraryPublisher implements SignOutCleanupHandler {
    public static final AuraAccessLibraryPublisher INSTANCE = new AuraAccessLibraryPublisher();
    public static final F0C executor$delegate = AbstractC5321DgF.A03(AuraAccessLibraryPublisher$executor$2.INSTANCE);

    public final void publishIfChangedAsync(final Context context) {
        C7384Etj.A0Y(context, 0);
        F0C.A06(executor$delegate).execute(new Runnable() { // from class: com.facebook.aura.accessv2.AuraAccessLibraryPublisher.publishIfChangedAsync.1
            @Override // java.lang.Runnable
            public final void run() {
                AuraAccessLibraryPublisher.INSTANCE.publishIfChanged(AnonymousClass001.A0I(context));
            }
        });
    }

    private final ExecutorService getExecutor() {
        return (ExecutorService) executor$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveFinished(Context context, AbstractC3358CGz abstractC3358CGz, String str, EOL eol, boolean z) {
        if (!AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)) {
            removeActiveAccount(context);
            return;
        }
        if (z) {
            BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ACCESS_LIBRARY));
            bzKA02.AYr(AuraAccessLibraryPublisherKt.PUBLISHED_FRL_FINGERPRINT_KEY, str);
            bzKA02.apply();
        } else if (eol != null) {
            CFK.A06("AuraAccessLibraryPublisher", AnonymousClass007.A0a("Access Library save failed: ", eol.A02));
        }
    }

    public static /* synthetic */ void onSaveFinished$default(AuraAccessLibraryPublisher auraAccessLibraryPublisher, Context context, AbstractC3358CGz abstractC3358CGz, String str, EOL eol, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            z = AnonymousClass002.A1Y(eol);
        }
        auraAccessLibraryPublisher.onSaveFinished(context, abstractC3358CGz, str, eol, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishIfChanged(final Context context) {
        final String str;
        final AuraSessionManager.SessionSnapshot currentSessionSnapshot = AuraSessionManager.INSTANCE.getCurrentSessionSnapshot();
        if (currentSessionSnapshot == null || (str = currentSessionSnapshot.frlFingerprint) == null || str.equals(C4oT.A00(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ACCESS_LIBRARY), AuraAccessLibraryPublisherKt.PUBLISHED_FRL_FINGERPRINT_KEY))) {
            return;
        }
        AuraMetaFRLSecureTokenStore auraMetaFRLSecureTokenStore = AuraMetaFRLSecureTokenStore.INSTANCE;
        String metaAccessToken = auraMetaFRLSecureTokenStore.getMetaAccessToken();
        String metaAccountId = auraMetaFRLSecureTokenStore.getMetaAccountId();
        if (metaAccessToken == null || C7BY.A0j(metaAccessToken) || metaAccountId == null || C7BY.A0j(metaAccountId)) {
            CFK.A06("AuraAccessLibraryPublisher", "Skipping publish: FRL credentials incomplete");
            return;
        }
        if (str.equals(auraMetaFRLSecureTokenStore.frlFingerprint())) {
            F08 f08 = EOC.A00;
            EOH eoh = new EOH(AuraAccessLibraryPublisherKt.ACTIVE_ACCOUNT_ONLY, metaAccountId);
            EO5 eo5 = new EO5(metaAccessToken);
            C7384Etj.A0Y(context, 0);
            int iIncrementAndGet = EOC.A03.incrementAndGet();
            BV7.A15().A01(100346940, iIncrementAndGet, AuraAccessLibraryPublisherKt.LOG_LOCATION);
            ListenableFuture listenableFutureSubmit = EOC.A01.submit(new CallableC7567F4g(context, eoh, eo5, 2));
            C7384Etj.A0U(listenableFutureSubmit);
            CQD.A01(new F54(iIncrementAndGet, 2), listenableFutureSubmit, EnumC3451CNw.A01);
            CQD.A01(new CQG<EOL>() { // from class: com.facebook.aura.accessv2.AuraAccessLibraryPublisher.publishIfChanged.1
                @Override // X.CQG
                public void onFailure(Throwable th) {
                    C7384Etj.A0Y(th, 0);
                    CFK.A0K("AuraAccessLibraryPublisher", th, "Access Library save threw");
                    AuraAccessLibraryPublisher.INSTANCE.onSaveFinished(context, currentSessionSnapshot.session, str, null, false);
                }

                @Override // X.CQG
                public void onSuccess(EOL eol) {
                    AuraAccessLibraryPublisher.onSaveFinished$default(AuraAccessLibraryPublisher.INSTANCE, context, currentSessionSnapshot.session, str, eol, false, 16, null);
                }
            }, listenableFutureSubmit, F0C.A06(executor$delegate));
        }
    }

    private final C4oT publishedFingerprintPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ACCESS_LIBRARY);
    }

    private final void removeActiveAccount(Context context) {
        F08 f08 = EOC.A00;
        EOH eoh = new EOH(AuraAccessLibraryPublisherKt.ACTIVE_ACCOUNT_ONLY, null);
        C7384Etj.A0Y(context, 0);
        int iIncrementAndGet = EOC.A03.incrementAndGet();
        BV7.A15().A01(100349780, iIncrementAndGet, AuraAccessLibraryPublisherKt.LOG_LOCATION);
        ListenableFuture listenableFutureSubmit = EOC.A01.submit(new CallableC7565F4e(8, context, eoh));
        C7384Etj.A0U(listenableFutureSubmit);
        CQD.A01(new F54(iIncrementAndGet, 1), listenableFutureSubmit, EnumC3451CNw.A01);
        CQD.A01(new CQG<List<? extends EOL>>() { // from class: com.facebook.aura.accessv2.AuraAccessLibraryPublisher.removeActiveAccount.1
            @Override // X.CQG
            public void onFailure(Throwable th) {
                C7384Etj.A0Y(th, 0);
                CFK.A0K("AuraAccessLibraryPublisher", th, "Access Library remove threw");
            }

            /* renamed from: onSuccess, reason: avoid collision after fix types in other method */
            public void onSuccess2(List<EOL> list) {
                C7384Etj.A0Y(list, 0);
                if (list.isEmpty()) {
                    return;
                }
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                Iterator<EOL> it = list.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(it.next().A02);
                }
                CFK.A06("AuraAccessLibraryPublisher", AnonymousClass007.A0a("Access Library remove failed: ", arrayListA0i));
            }

            @Override // X.CQG
            public /* bridge */ /* synthetic */ void onSuccess(List<? extends EOL> list) {
                onSuccess2((List<EOL>) list);
            }
        }, listenableFutureSubmit, F0C.A06(executor$delegate));
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        BzK bzKA02 = BzK.A02(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ACCESS_LIBRARY));
        bzKA02.Aae(AuraAccessLibraryPublisherKt.PUBLISHED_FRL_FINGERPRINT_KEY);
        bzKA02.apply();
        removeActiveAccount(C4JM.A00());
    }
}
