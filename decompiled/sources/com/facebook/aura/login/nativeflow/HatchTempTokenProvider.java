package com.facebook.aura.login.nativeflow;

import X.Bs8;
import X.C7384Etj;
import X.C7BY;
import X.C9258GBl;
import X.InterfaceC2261BLa;
import com.facebook.aura.auth.signout.SignOutCleanupHandler;
import com.facebook.aura.login.credentials.AuraSavedCredentialsStore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class HatchTempTokenProvider implements SignOutCleanupHandler {
    public static final HatchTempTokenProvider INSTANCE = new HatchTempTokenProvider();
    public static final InterfaceC2261BLa mutex = new C9258GBl();
    public static final AtomicReference<String> session = new AtomicReference<>(null);

    public final void invalidate(String str) {
        C7384Etj.A0Y(str, 0);
        AtomicReference<String> atomicReference = session;
        String str2 = atomicReference.get();
        if (str.equals(str2)) {
            Bs8.A00(str2, null, atomicReference);
        }
    }

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        session.set(null);
    }

    public final String current() {
        return session.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:27:0x0072, B:28:0x0077, B:30:0x007d, B:32:0x0090), top: B:40:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:27:0x0072, B:28:0x0077, B:30:0x007d, B:32:0x0090), top: B:40:0x0072 }] */
    /* renamed from: get-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1272getIoAF18A(X.HtJ<? super X.HsJ<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.login.nativeflow.HatchTempTokenProvider$get$1
            if (r0 == 0) goto L26
            r3 = r7
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider$get$1 r3 = (com.facebook.aura.login.nativeflow.HatchTempTokenProvider$get$1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 2
            r1 = 1
            r7 = 0
            if (r0 == 0) goto L39
            if (r0 == r1) goto L31
            if (r0 != r2) goto L2c
            java.lang.Object r6 = r3.L$0
            X.BLa r6 = (X.InterfaceC2261BLa) r6
            goto L72
        L26:
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider$get$1 r3 = new com.facebook.aura.login.nativeflow.HatchTempTokenProvider$get$1
            r3.<init>(r6, r7)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r6 = r3.L$0
            X.BLa r6 = (X.InterfaceC2261BLa) r6
            X.Hwg.A00(r5)
            goto L52
        L39:
            X.Hwg.A00(r5)
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.session
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L45
            return r0
        L45:
            X.BLa r6 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.mutex
            r3.L$0 = r6
            r3.label = r1
            java.lang.Object r0 = r6.APs(r7, r3)
            if (r0 != r4) goto L52
        L51:
            return r4
        L52:
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r0 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.session     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r5 = r0.get()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L9b
            if (r5 != 0) goto L97
            com.facebook.aura.login.nativeflow.HatchAuthApi r1 = com.facebook.aura.login.nativeflow.HatchAuthApi.INSTANCE     // Catch: java.lang.Throwable -> L9b
            com.facebook.aura.login.credentials.AuraSavedCredentialsStore r0 = com.facebook.aura.login.credentials.AuraSavedCredentialsStore.INSTANCE     // Catch: java.lang.Throwable -> L9b
            com.facebook.aura.login.credentials.SavedAYMHData r0 = r0.getSavedAYMHInfo()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r0.idForAYMH     // Catch: java.lang.Throwable -> L9b
            r3.L$0 = r6     // Catch: java.lang.Throwable -> L9b
            r3.label = r2     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r5 = r1.m1268startgIAlus(r0, r3)     // Catch: java.lang.Throwable -> L9b
            if (r5 == r4) goto L51
            r0 = r5
            goto L77
        L72:
            java.lang.Object r5 = X.AnonymousClass001.A0q(r5)     // Catch: java.lang.Throwable -> L95
            r0 = r5
        L77:
            boolean r1 = r5 instanceof X.C10571Hud     // Catch: java.lang.Throwable -> L95
            r4 = r1 ^ 1
            if (r4 == 0) goto L8e
            r3 = r5
            com.facebook.aura.login.nativeflow.HatchAuthStart r3 = (com.facebook.aura.login.nativeflow.HatchAuthStart) r3     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.atomic.AtomicReference<java.lang.String> r2 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.session     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r3.accessToken     // Catch: java.lang.Throwable -> L95
            r2.set(r1)     // Catch: java.lang.Throwable -> L95
            com.facebook.aura.login.nativeflow.HatchTempTokenProvider r2 = com.facebook.aura.login.nativeflow.HatchTempTokenProvider.INSTANCE     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r3.idForAymh     // Catch: java.lang.Throwable -> L95
            r2.saveIdForAymh(r1)     // Catch: java.lang.Throwable -> L95
        L8e:
            if (r4 == 0) goto L97
            com.facebook.aura.login.nativeflow.HatchAuthStart r0 = (com.facebook.aura.login.nativeflow.HatchAuthStart) r0     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = r0.accessToken     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r0 = move-exception
            goto L9c
        L97:
            r6.Ahe(r7)
            return r5
        L9b:
            r0 = move-exception
        L9c:
            r6.Ahe(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchTempTokenProvider.m1272getIoAF18A(X.HtJ):java.lang.Object");
    }

    public final String idForAymh() {
        String str = AuraSavedCredentialsStore.INSTANCE.getSavedAYMHInfo().idForAYMH;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return str;
    }

    private final void saveIdForAymh(String str) {
        if (C7BY.A0j(str)) {
            return;
        }
        AuraSavedCredentialsStore auraSavedCredentialsStore = AuraSavedCredentialsStore.INSTANCE;
        if (C7384Etj.areEqual(str, auraSavedCredentialsStore.getSavedAYMHInfo().idForAYMH)) {
            return;
        }
        auraSavedCredentialsStore.saveAYMHInfo(str);
    }
}
