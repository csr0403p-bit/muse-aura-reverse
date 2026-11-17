package com.facebook.aura.auth.credentialmanager;

import X.AbstractC07127nr;
import X.AbstractC4300Cso;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C1HY;
import X.C3UX;
import X.C3cG;
import X.C4306Csu;
import X.C4381Cug;
import X.C4402CvF;
import X.CFK;
import X.EnumC10460Hji;
import X.F31;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.net.Uri;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class AuraCredentialManagerFetchHelper {
    public static final AuraCredentialManagerFetchHelper INSTANCE = new AuraCredentialManagerFetchHelper();
    public static final String PROVIDER_CLASS = "com.google.android.gms.auth.api.credentials.credman.service.PasswordAndPasskeyService";
    public static final String PROVIDER_PACKAGE = "com.google.android.gms";
    public static final String TAG = "AuraCredentialManagerFetch";

    public interface RetrieveCredentialResultListener {
        void onCredentialDataNull();

        void onCredentialFetchException(String str, String str2);

        void onGoogleIdTokenReceived(String str, String str2, String str3, String str4);
    }

    @DebugMetadata(c = "com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper", f = "AuraCredentialManagerFetchHelper.kt", l = {87}, m = "doFetch", v = 2)
    /* renamed from: com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$doFetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraCredentialManagerFetchHelper.this.doFetch(null, null, null, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$fetchCredential$1", f = "AuraCredentialManagerFetchHelper.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$fetchCredential$1, reason: invalid class name and case insensitive filesystem */
    public final class C109861 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ List<String> $credentialsToDisplay;
        public final /* synthetic */ boolean $displayBrandingUI;
        public final /* synthetic */ RetrieveCredentialResultListener $listener;
        public final /* synthetic */ boolean $useBottomSheetForGoogle;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109861(Context context, RetrieveCredentialResultListener retrieveCredentialResultListener, List<String> list, boolean z, boolean z2, HtJ<? super C109861> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$listener = retrieveCredentialResultListener;
            this.$credentialsToDisplay = list;
            this.$displayBrandingUI = z;
            this.$useBottomSheetForGoogle = z2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C109861(this.$context, this.$listener, this.$credentialsToDisplay, this.$displayBrandingUI, this.$useBottomSheetForGoogle, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraCredentialManagerFetchHelper auraCredentialManagerFetchHelper = AuraCredentialManagerFetchHelper.INSTANCE;
                Context context = this.$context;
                RetrieveCredentialResultListener retrieveCredentialResultListener = this.$listener;
                List<String> list = this.$credentialsToDisplay;
                boolean z = this.$displayBrandingUI;
                boolean z2 = this.$useBottomSheetForGoogle;
                this.label = 1;
                if (auraCredentialManagerFetchHelper.doFetch(context, retrieveCredentialResultListener, list, z, z2, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C109861) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchCredential(Context context, RetrieveCredentialResultListener retrieveCredentialResultListener, List<String> list, boolean z, boolean z2) {
        C1HY c1hy;
        AnonymousClass005.A0x(context, retrieveCredentialResultListener, list);
        if (!AuraCredentialManagerConfig.INSTANCE.isGoogleIdTokenEnabled()) {
            retrieveCredentialResultListener.onCredentialDataNull();
        } else if ((context instanceof C1HY) && (c1hy = (C1HY) context) != null) {
            AnonymousClass001.A1J(new C109861(context, retrieveCredentialResultListener, list, z, z2, null), F31.A00(c1hy));
        } else {
            CFK.A04(TAG, "Context must be a LifecycleOwner");
            retrieveCredentialResultListener.onCredentialFetchException("invalid_context", "Context must be a LifecycleOwner");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doFetch(android.content.Context r9, com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.RetrieveCredentialResultListener r10, java.util.List<java.lang.String> r11, boolean r12, boolean r13, X.HtJ<? super kotlin.Unit> r14) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.AnonymousClass1
            if (r0 == 0) goto L22
            r5 = r14
            com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$doFetch$1 r5 = (com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L28
            java.lang.Object r10 = r5.L$1
            com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$RetrieveCredentialResultListener r10 = (com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.RetrieveCredentialResultListener) r10
            goto L8e
        L22:
            com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$doFetch$1 r5 = new com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$doFetch$1
            r5.<init>(r14)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.lang.String r0 = "google_token"
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L4d
            com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig r1 = com.facebook.aura.auth.credentialmanager.AuraCredentialManagerConfig.INSTANCE
            boolean r0 = r1.isGoogleIdTokenEnabled()
            if (r0 == 0) goto L4d
            if (r13 == 0) goto L97
            X.Cst r0 = r1.googleIdOption()
        L4a:
            r2.add(r0)
        L4d:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L59
            r10.onCredentialDataNull()
        L56:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L59:
            r7 = 0
            r3 = 0
            java.util.ArrayList r2 = X.BV4.A0t(r2)
            if (r12 == 0) goto L6a
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = "com.google.android.gms.auth.api.credentials.credman.service.PasswordAndPasskeyService"
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r1, r0)
        L6a:
            java.util.List r2 = X.AbstractC0878AGe.A0X(r2)
            r1 = 0
            X.Csh r0 = new X.Csh
            r0.<init>(r3, r2, r1)
            X.C7384Etj.A0Y(r9, r1)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.L$0 = r7     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.L$1 = r10     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.L$2 = r7     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.L$3 = r7     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.L$4 = r7     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.Z$0 = r12     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.Z$1 = r13     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r5.label = r4     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            java.lang.Object r1 = X.AbstractC4310Csy.A00(r9, r0, r5)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            if (r1 != r6) goto L91
            goto L9d
        L8e:
            X.Hwg.A00(r1)     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
        L91:
            X.Cug r1 = (X.C4381Cug) r1     // Catch: androidx.credentials.exceptions.GetCredentialException -> L9e
            r8.handleResponse(r1, r10)
            goto L56
        L97:
            X.Csv r0 = new X.Csv
            r0.<init>()
            goto L4a
        L9d:
            return r6
        L9e:
            r0 = move-exception
            r0.getMessage()
            r8.handleException(r0, r10)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper.doFetch(android.content.Context, com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper$RetrieveCredentialResultListener, java.util.List, boolean, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCredential$default(AuraCredentialManagerFetchHelper auraCredentialManagerFetchHelper, Context context, RetrieveCredentialResultListener retrieveCredentialResultListener, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            list = Collections.singletonList("google_token");
        }
        auraCredentialManagerFetchHelper.fetchCredential(context, retrieveCredentialResultListener, list, C3cG.A1K(i & 8, z), C3cG.A1K(i & 16, z2));
    }

    private final void handleException(GetCredentialException getCredentialException, RetrieveCredentialResultListener retrieveCredentialResultListener) {
        String message;
        String str = getCredentialException instanceof GetPublicKeyCredentialException ? ((GetPublicKeyCredentialException) getCredentialException).type : getCredentialException instanceof GetCredentialCustomException ? ((GetCredentialCustomException) getCredentialException).type : getCredentialException.type;
        if ("android.credentials.GetCredentialException.TYPE_USER_CANCELED".equals(str)) {
            str = "user_canceled";
            message = "User canceled credential selection";
        } else {
            if ("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL".equals(str)) {
                retrieveCredentialResultListener.onCredentialDataNull();
                return;
            }
            message = getCredentialException.getMessage();
        }
        retrieveCredentialResultListener.onCredentialFetchException(str, message);
    }

    private final void handleResponse(C4381Cug c4381Cug, RetrieveCredentialResultListener retrieveCredentialResultListener) {
        AbstractC4300Cso abstractC4300Cso = c4381Cug.A00;
        if (!(abstractC4300Cso instanceof C4402CvF) || !"com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL".equals(abstractC4300Cso.A01)) {
            retrieveCredentialResultListener.onCredentialDataNull();
            return;
        }
        try {
            C4306Csu c4306CsuA02 = C4306Csu.A02(abstractC4300Cso.A00);
            String str = c4306CsuA02.A01;
            String str2 = c4306CsuA02.A03;
            if (str2 == null) {
                str2 = "";
            }
            Uri uri = c4306CsuA02.A00;
            retrieveCredentialResultListener.onGoogleIdTokenReceived(str, str2, uri != null ? uri.toString() : null, c4306CsuA02.A02);
        } catch (Exception e) {
            CFK.A08(TAG, "Failed to parse Google ID token", e);
            retrieveCredentialResultListener.onCredentialFetchException("google_id_token_parse_error", e.getMessage());
        }
    }
}
