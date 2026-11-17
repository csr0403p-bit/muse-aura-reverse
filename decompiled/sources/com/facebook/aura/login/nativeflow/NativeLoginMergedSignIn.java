package com.facebook.aura.login.nativeflow;

import X.C4425Cvl;
import X.C4432Cvt;
import X.Cw0;
import X.HtJ;
import X.HzP;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.facebook.aura.analytics.hatch.passkey.HatchPasskeyErrorType;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class NativeLoginMergedSignIn {
    public static final int $stable = 0;
    public static final NativeLoginMergedSignIn INSTANCE = new NativeLoginMergedSignIn();
    public static final String TAG = "NativeLoginMergedSignIn";

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginMergedSignIn", f = "NativeLoginMergedSignIn.kt", l = {80}, m = "offer", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginMergedSignIn$offer$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NativeLoginMergedSignIn.this.offer(null, null, false, this);
        }
    }

    private final HatchPasskeyErrorType passkeyErrorType(GetCredentialException getCredentialException) {
        if (getCredentialException instanceof GetPublicKeyCredentialDomException) {
            Cw0 cw0 = ((GetPublicKeyCredentialDomException) getCredentialException).domError;
            if (cw0 instanceof C4425Cvl) {
                return HatchPasskeyErrorType.USER_CANCELED;
            }
            if (cw0 instanceof C4432Cvt) {
                return HatchPasskeyErrorType.INVALID_DOMAIN;
            }
        } else {
            if (getCredentialException instanceof GetCredentialUnsupportedException) {
                return HatchPasskeyErrorType.UNSUPPORTED_PLATFORM;
            }
            if (getCredentialException instanceof GetCredentialInterruptedException) {
                return HatchPasskeyErrorType.INTERRUPTED_OPERATION;
            }
            if (getCredentialException instanceof GetCredentialProviderConfigurationException) {
                return HatchPasskeyErrorType.PROVIDER_CONFIGURATION_FAILURE;
            }
        }
        return HatchPasskeyErrorType.ASSERTION_FAILED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object offer(android.app.Activity r12, java.lang.String r13, boolean r14, X.HtJ<? super com.facebook.aura.login.nativeflow.NativeLoginMergedPick> r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginMergedSignIn.offer(android.app.Activity, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }
}
