package com.facebook.aura.login.nativeflow;

import X.BO6;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NativeLoginPickerPayload extends C06G {
    public final BO6<String, NativeLoginSsoAccount> accountsByRef;
    public final HatchSsoAccountInfoResponse info;
    public final Throwable infoFailure;

    public NativeLoginPickerPayload(BO6<String, NativeLoginSsoAccount> bo6, HatchSsoAccountInfoResponse hatchSsoAccountInfoResponse, Throwable th) {
        C7384Etj.A0Y(bo6, 0);
        this.accountsByRef = bo6;
        this.info = hatchSsoAccountInfoResponse;
        this.infoFailure = th;
    }

    public final NativeLoginPickerPayload copy(BO6<String, NativeLoginSsoAccount> bo6, HatchSsoAccountInfoResponse hatchSsoAccountInfoResponse, Throwable th) {
        C7384Etj.A0Y(bo6, 0);
        return new NativeLoginPickerPayload(bo6, hatchSsoAccountInfoResponse, th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeLoginPickerPayload copy$default(NativeLoginPickerPayload nativeLoginPickerPayload, BO6 bo6, HatchSsoAccountInfoResponse hatchSsoAccountInfoResponse, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            bo6 = nativeLoginPickerPayload.accountsByRef;
        }
        if ((i & 2) != 0) {
            hatchSsoAccountInfoResponse = nativeLoginPickerPayload.info;
        }
        if ((i & 4) != 0) {
            th = nativeLoginPickerPayload.infoFailure;
        }
        return nativeLoginPickerPayload.copy(bo6, hatchSsoAccountInfoResponse, th);
    }

    public final BO6<String, NativeLoginSsoAccount> component1() {
        return this.accountsByRef;
    }

    public final HatchSsoAccountInfoResponse component2() {
        return this.info;
    }

    public final Throwable component3() {
        return this.infoFailure;
    }

    public final BO6<String, NativeLoginSsoAccount> getAccountsByRef() {
        return this.accountsByRef;
    }

    public final HatchSsoAccountInfoResponse getInfo() {
        return this.info;
    }

    public final Throwable getInfoFailure() {
        return this.infoFailure;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginPickerPayload(BO6 bo6, HatchSsoAccountInfoResponse hatchSsoAccountInfoResponse, Throwable th, int i, C06H c06h) {
        this(bo6, hatchSsoAccountInfoResponse, (i & 4) != 0 ? null : th);
    }
}
