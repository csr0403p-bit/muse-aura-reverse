package com.facebook.aura.login.nativeflow;

import X.AnonymousClass003;
import X.C7Bm;
import X.GBL;
import X.HtJ;
import X.HzP;
import android.app.Activity;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class NativeLoginGoogleSignIn {
    public static final int $stable = 0;
    public static final NativeLoginGoogleSignIn INSTANCE = new NativeLoginGoogleSignIn();
    public static final String TAG = "NativeLoginGoogleSignIn";

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn", f = "NativeLoginGoogleSignIn.kt", l = {53}, m = "mayHaveGoogleAccount", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn$mayHaveGoogleAccount$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginGoogleSignIn.this.mayHaveGoogleAccount(null, this);
        }
    }

    public final Object fetch(Activity activity, HtJ<? super NativeLoginGoogleCredential> htJ) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GBL.A04;
        final GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        AuraCredentialManagerFetchHelper.INSTANCE.fetchCredential(activity, new AuraCredentialManagerFetchHelper.RetrieveCredentialResultListener() { // from class: com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn$fetch$2$1
            @Override // com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.RetrieveCredentialResultListener
            public void onCredentialDataNull() {
                gbl.resumeWith(null);
            }

            @Override // com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.RetrieveCredentialResultListener
            public void onCredentialFetchException(String str, String str2) {
                gbl.resumeWith(null);
            }

            @Override // com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.RetrieveCredentialResultListener
            public void onGoogleIdTokenReceived(String str, String str2, String str3, String str4) {
                AnonymousClass003.A0w(str, str4);
                gbl.resumeWith(new NativeLoginGoogleCredential(str, str4));
            }
        }, Collections.singletonList("google_token"), false, true);
        return gbl.A0F();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mayHaveGoogleAccount(android.content.Context r9, X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn.AnonymousClass1
            if (r0 == 0) goto L1f
            r5 = r10
            com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn$mayHaveGoogleAccount$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L25
            goto L88
        L1f:
            com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn$mayHaveGoogleAccount$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn$mayHaveGoogleAccount$1
            r5.<init>(r10)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r2)
            java.lang.String r0 = "android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS"
            int r0 = r9.checkSelfPermission(r0)
            if (r0 != 0) goto Lc8
            com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig r0 = com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig.INSTANCE     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            X.Cst r0 = r0.googleIdOption()     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            java.util.List r1 = java.util.Collections.singletonList(r0)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r0 = 0
            X.Csh r8 = new X.Csh     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r8.<init>(r0, r1, r4)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r5.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r5.label = r3     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            X.GBL r6 = X.C7Bm.A04(r5)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            android.os.CancellationSignal r2 = new android.os.CancellationSignal     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r1 = 2
            X.F5d r0 = new X.F5d     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r0.<init>(r2, r1)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r6.AO2(r0)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            X.Ct1 r5 = new X.Ct1     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r5.<init>(r6)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            X.F52 r1 = new X.F52     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r1.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            X.CHc r0 = new X.CHc     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r0.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            X.Csx r0 = r0.A02(r4)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            if (r0 != 0) goto L83
            java.lang.String r2 = "No Credential Manager provider found"
            java.lang.String r1 = "androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"
            androidx.credentials.exceptions.GetCredentialProviderConfigurationException r0 = new androidx.credentials.exceptions.GetCredentialProviderConfigurationException     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r0.<init>(r1, r2)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            r5.AT2(r0)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
        L7c:
            java.lang.Object r2 = r6.A0F()     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            if (r2 != r7) goto L8b
            goto L87
        L83:
            r0.onPrepareCredential(r8, r2, r1, r5)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            goto L7c
        L87:
            return r7
        L88:
            X.Hwg.A00(r2)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
        L8b:
            X.CtC r2 = (X.C4314CtC) r2     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            X.G0U<java.lang.String, java.lang.Boolean> r0 = r2.A02     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            if (r0 == 0) goto L98
            boolean r0 = X.AnonymousClass003.A1X(r1, r0)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            goto L99
        L98:
            r0 = 0
        L99:
            if (r0 != 0) goto Lb3
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r2.A00     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            if (r0 == 0) goto La4
            boolean r0 = X.AnonymousClass003.A1Y(r0)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            goto La5
        La4:
            r0 = 0
        La5:
            if (r0 != 0) goto Lb3
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r2.A01     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            if (r0 == 0) goto Lb0
            boolean r0 = X.AnonymousClass003.A1Y(r0)     // Catch: java.util.concurrent.CancellationException -> Lb6 java.lang.Exception -> Lb8
            goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            if (r0 == 0) goto Lb4
        Lb3:
            r4 = 1
        Lb4:
            r3 = r4
            goto Lc8
        Lb6:
            r0 = move-exception
            throw r0
        Lb8:
            r0 = move-exception
            java.lang.String r0 = X.C3cI.A0Y(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "NativeLoginGoogleSignIn"
            java.lang.String r0 = "google account check failed: %s"
            X.CFK.A0H(r1, r0, r2)
        Lc8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginGoogleSignIn.mayHaveGoogleAccount(android.content.Context, X.HtJ):java.lang.Object");
    }
}
