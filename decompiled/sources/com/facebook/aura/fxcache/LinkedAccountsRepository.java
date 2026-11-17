package com.facebook.aura.fxcache;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import X.InterfaceC7549F2g;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class LinkedAccountsRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final String TAG = "LinkedAccountsRepository";
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.fxcache.LinkedAccountsRepository", f = "LinkedAccountsRepository.kt", l = {82}, m = "fetchLinkedFacebookAccount", v = 2)
    /* renamed from: com.facebook.aura.fxcache.LinkedAccountsRepository$fetchLinkedFacebookAccount$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkedAccountsRepository.this.fetchLinkedFacebookAccount(this);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchLinkedFacebookAccount(X.HtJ<? super com.facebook.aura.fxcache.LinkedFacebookAccount> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.fxcache.LinkedAccountsRepository.AnonymousClass1
            r5 = r18
            if (r0 == 0) goto L23
            r2 = r4
            com.facebook.aura.fxcache.LinkedAccountsRepository$fetchLinkedFacebookAccount$1 r2 = (com.facebook.aura.fxcache.LinkedAccountsRepository.AnonymousClass1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L23
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r1 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r10 = 0
            r14 = 1
            if (r0 == 0) goto L2e
            if (r0 != r14) goto L29
            goto L74
        L23:
            com.facebook.aura.fxcache.LinkedAccountsRepository$fetchLinkedFacebookAccount$1 r2 = new com.facebook.aura.fxcache.LinkedAccountsRepository$fetchLinkedFacebookAccount$1
            r2.<init>(r4)
            goto L16
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            com.facebook.aura.network.api.JarvisPath$FoaAccounts r7 = com.facebook.aura.network.api.JarvisPath.FoaAccounts.INSTANCE     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            X.CGz r9 = r5.userSession     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            java.lang.String r1 = "app"
            java.lang.String r0 = "facebook"
            X.HxE r0 = X.C3cG.A0r(r1, r0)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r6 = 0
            X.HxE[] r11 = new X.HxE[]{r0}     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            java.util.Set r13 = X.AnonymousClass004.A18()     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            X.9jH r15 = X.C9jH.A00     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            com.facebook.aura.fxcache.LinkedAccountsRepository$fetchLinkedFacebookAccount$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.fxcache.LinkedAccountsRepository$fetchLinkedFacebookAccount$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$0 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$1 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$2 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$3 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$4 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$5 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.L$6 = r10     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.I$0 = r14     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.I$1 = r14     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.I$2 = r6     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r2.label = r14     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r2
            java.lang.Object r1 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r1 != r3) goto L78
            return r3
        L74:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
        L78:
            java.lang.Throwable r0 = X.HsJ.A00(r1)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r0 != 0) goto La3
            com.facebook.aura.fxcache.LinkedFacebookAccountJson r1 = (com.facebook.aura.fxcache.LinkedFacebookAccountJson) r1     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            java.lang.String r0 = r1.fb_user_id     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r0 == 0) goto La3
            boolean r0 = X.C7BY.A0j(r0)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r0 != 0) goto La3
            java.lang.String r2 = r1.name     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r2 != 0) goto L90
            java.lang.String r2 = ""
        L90:
            java.lang.String r1 = r1.profile_pic_url     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r1 == 0) goto La0
            int r0 = r1.length()     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            if (r0 <= 0) goto La0
        L9a:
            com.facebook.aura.fxcache.LinkedFacebookAccount r3 = new com.facebook.aura.fxcache.LinkedFacebookAccount     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            r3.<init>(r2, r1)     // Catch: java.lang.Exception -> La4 java.util.concurrent.CancellationException -> Lad
            goto La2
        La0:
            r1 = r10
            goto L9a
        La2:
            return r3
        La3:
            return r10
        La4:
            r2 = move-exception
            java.lang.String r1 = "Failed to fetch linked FB account"
            java.lang.String r0 = "LinkedAccountsRepository"
            X.CFK.A08(r0, r1, r2)
            return r10
        Lad:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.fxcache.LinkedAccountsRepository.fetchLinkedFacebookAccount(X.HtJ):java.lang.Object");
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final LinkedAccountsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LinkedAccountsRepository) abstractC3358CGz.A03(LinkedAccountsRepository.class, new LinkedAccountsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LinkedAccountsRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
    }

    public /* synthetic */ LinkedAccountsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
