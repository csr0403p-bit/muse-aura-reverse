package com.facebook.aura.localbrowser;

import X.AnonymousClass002;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C6li;
import X.C6oa;
import X.C6pD;
import X.C6xE;
import X.C6xU;
import X.C7384Etj;
import X.C9286GCn;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class LocalBrowserProfile {
    public static final int $stable = 8;
    public final C1BN<LocalBrowserProfileCleanup> cleanup;
    public final Handler handler;
    public final BLG<LocalBrowserProfileCleanup> mutableCleanup;
    public final String name;
    public final C6pD profile;

    public LocalBrowserProfile(C6pD c6pD) {
        C7384Etj.A0Y(c6pD, 0);
        this.profile = c6pD;
        String name = c6pD.getName();
        C7384Etj.A0U(name);
        this.name = name;
        this.handler = C60O.A02();
        C9286GCn c9286GCnA14 = C3cG.A14(LocalBrowserProfileCleanup.ACTIVE);
        this.mutableCleanup = c9286GCnA14;
        this.cleanup = C3Pi.A00(c9286GCnA14);
    }

    public static final void retire$lambda$1$0(LocalBrowserProfile localBrowserProfile, Runnable runnable) {
        localBrowserProfile.handler.removeCallbacks(runnable);
        if (localBrowserProfile.mutableCleanup.getValue() == LocalBrowserProfileCleanup.CLEARING) {
            AnonymousClass002.A1I(localBrowserProfile.mutableCleanup, LocalBrowserProfileCleanup.CLEARED_AWAITING_PROCESS_RESTART);
        }
    }

    public final C1BN<LocalBrowserProfileCleanup> getCleanup() {
        return this.cleanup;
    }

    public final String getName() {
        return this.name;
    }

    public final void retire() {
        if (!C3cH.A1K()) {
            throw C3cG.A0Q("Check failed.");
        }
        if (this.mutableCleanup.getValue() == LocalBrowserProfileCleanup.ACTIVE) {
            AnonymousClass002.A1I(this.mutableCleanup, LocalBrowserProfileCleanup.CLEARING);
            final Runnable runnable = new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserProfile$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass002.A1I(this.f$0.mutableCleanup, LocalBrowserProfileCleanup.FAILED);
                }
            };
            this.handler.postDelayed(runnable, 15000L);
            try {
                C6oa c6oa = (C6oa) this.profile;
                C6li c6li = C6xU.A0h;
                if (!c6li.A01()) {
                    throw C60Q.A0q();
                }
                c6oa.A00.getGeoLocationPermissions().clearAll();
                C6oa c6oa2 = (C6oa) this.profile;
                if (!c6li.A01()) {
                    throw C60Q.A0q();
                }
                C6xE.A00(c6oa2.A00.getWebStorage(), new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserProfile$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalBrowserProfile localBrowserProfile = this.f$0;
                        localBrowserProfile.handler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserProfile$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocalBrowserProfile.retire$lambda$1$0(this.f$0, runnable);
                            }
                        });
                    }
                });
            } catch (RuntimeException unused) {
                this.handler.removeCallbacks(runnable);
                AnonymousClass002.A1I(this.mutableCleanup, LocalBrowserProfileCleanup.FAILED);
            }
        }
    }
}
