package com.facebook.aura.accountcenter;

import X.AbstractC0878AGe;
import X.AnonymousClass002;
import X.C3cG;
import X.C4020Ck2;
import X.C60O;
import X.C7384Etj;
import X.F2m;
import X.G0W;
import android.os.Handler;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraAccountsCenterCookieExchange {
    public static final long MAX_PENDING_MS = 30000;
    public static volatile PendingExchange pending;
    public static final AuraAccountsCenterCookieExchange INSTANCE = new AuraAccountsCenterCookieExchange();
    public static final Handler mainHandler = C60O.A02();

    public final class PendingExchange implements F2m {
        public boolean completed;
        public String cookie;
        public String credentialFingerprint;
        public boolean credentialRead;
        public Throwable error;
        public final Runnable expiry;
        public final Set<Long> generations;
        public final long startedAtNs;
        public Waiter waiter;

        public PendingExchange(Set<Long> set) {
            C7384Etj.A0Y(set, 0);
            this.expiry = new Runnable() { // from class: com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange$PendingExchange$expiry$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (AuraAccountsCenterCookieExchange.pending == this.this$0) {
                        AuraAccountsCenterCookieExchange.pending = null;
                    }
                }
            };
            this.generations = AbstractC0878AGe.A0f(set);
            this.startedAtNs = System.nanoTime();
        }

        private final void complete(String str, Throwable th) {
            synchronized (this) {
                if (this.completed) {
                    return;
                }
                this.completed = true;
                this.cookie = str;
                this.error = th;
                Waiter waiter = this.waiter;
                this.waiter = null;
                String str2 = this.credentialFingerprint;
                if (waiter != null) {
                    waiter.deliver(str2, str, th);
                }
            }
        }

        public final boolean accept(long j) {
            boolean z;
            synchronized (this) {
                if (!this.completed || this.error == null) {
                    this.generations.add(Long.valueOf(j));
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }

        public final Set<Long> acceptedGenerations() {
            Set<Long> setA0g;
            synchronized (this) {
                setA0g = AbstractC0878AGe.A0g(this.generations);
            }
            return setA0g;
        }

        public final boolean accepts(long j) {
            boolean zContains;
            synchronized (this) {
                zContains = this.generations.contains(Long.valueOf(j));
            }
            return zContains;
        }

        public final boolean join(String str, G0W<? super Long, ? super String, ? super Throwable, Unit> g0w, Function0<Unit> function0) {
            AnonymousClass002.A1A(g0w, 1, function0);
            Waiter waiter = new Waiter(str, this.startedAtNs, g0w, function0);
            synchronized (this) {
                if (this.credentialRead && !C7384Etj.areEqual(this.credentialFingerprint, str)) {
                    return false;
                }
                if (this.completed) {
                    waiter.deliver(this.credentialFingerprint, this.cookie, this.error);
                    return true;
                }
                this.waiter = waiter;
                return true;
            }
        }

        @Override // X.F2m
        public void onSuccess(String str) {
            complete(str, null);
        }

        public final Runnable getExpiry() {
            return this.expiry;
        }

        @Override // X.F2m
        public void onFail(Throwable th) {
            if (th == null) {
                th = C3cG.A0Q("Session cookie exchange failed");
            }
            complete(null, th);
        }

        public final void run() {
            AuraMetaFRLSecureTokenStore auraMetaFRLSecureTokenStore = AuraMetaFRLSecureTokenStore.INSTANCE;
            String metaAccessToken = auraMetaFRLSecureTokenStore.getMetaAccessToken();
            String strFrlFingerprint = auraMetaFRLSecureTokenStore.frlFingerprint();
            synchronized (this) {
                this.credentialFingerprint = strFrlFingerprint;
                this.credentialRead = true;
            }
            if (metaAccessToken == null) {
                complete(null, C3cG.A0Q("No Meta access token"));
            } else {
                new C4020Ck2(AuraMetaCookieRequestFactory.INSTANCE.getInstance()).A00(this);
            }
        }
    }

    public final class Waiter {
        public final String expectedFingerprint;
        public final Function0<Unit> fallback;
        public final G0W<Long, String, Throwable, Unit> onResult;
        public final long startedAtNs;

        /* JADX WARN: Multi-variable type inference failed */
        public Waiter(String str, long j, G0W<? super Long, ? super String, ? super Throwable, Unit> g0w, Function0<Unit> function0) {
            AnonymousClass002.A1B(g0w, 2, function0);
            this.expectedFingerprint = str;
            this.startedAtNs = j;
            this.onResult = g0w;
            this.fallback = function0;
        }

        public final void deliver(String str, String str2, Throwable th) {
            if (C7384Etj.areEqual(str, this.expectedFingerprint)) {
                this.onResult.invoke(Long.valueOf(this.startedAtNs), str2, th);
            } else {
                this.fallback.invoke();
            }
        }
    }

    public final boolean join(long j, String str, G0W<? super Long, ? super String, ? super Throwable, Unit> g0w, Function0<Unit> function0) {
        AnonymousClass002.A1B(g0w, 2, function0);
        PendingExchange pendingExchange = pending;
        if (pendingExchange == null || !pendingExchange.accepts(j)) {
            return false;
        }
        pending = null;
        mainHandler.removeCallbacks(pendingExchange.expiry);
        return pendingExchange.join(str, g0w, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start(long r3) {
        /*
            r2 = this;
            com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange$PendingExchange r1 = com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange.pending
            if (r1 == 0) goto L10
            boolean r0 = r1.accept(r3)
            if (r0 != 0) goto L36
            java.util.Set r1 = r1.acceptedGenerations()
            if (r1 != 0) goto L12
        L10:
            X.A3q r1 = X.A3q.A00
        L12:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.util.LinkedHashSet r0 = X.BGK.A02(r0, r1)
            com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange$PendingExchange r4 = new com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange$PendingExchange
            r4.<init>(r0)
            com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange.pending = r4
            android.os.Handler r3 = com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange.mainHandler
            java.lang.Runnable r2 = r4.expiry
            r0 = 30000(0x7530, double:1.4822E-319)
            r3.postDelayed(r2, r0)
            java.util.concurrent.ExecutorService r1 = X.C60O.A1D()
            com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange$start$1 r0 = new com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange$start$1
            r0.<init>()
            r1.execute(r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.accountcenter.AuraAccountsCenterCookieExchange.start(long):void");
    }
}
