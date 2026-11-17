package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$2", f = "HatchAuthApi.kt", l = {225, 245}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$registerCompletion$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ HatchAttestationRequest $attestationRequest;
    public final /* synthetic */ String $completionHandle;
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ String $dateOfBirth;
    public final /* synthetic */ String $firstName;
    public final /* synthetic */ String $lastName;
    public final /* synthetic */ String $password;
    public final /* synthetic */ String $region;
    public final /* synthetic */ String $tempToken;
    public final /* synthetic */ String $tosContentVersion;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$registerCompletion$2(HatchAttestationRequest hatchAttestationRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HtJ<? super HatchAuthApi$registerCompletion$2> htJ) {
        super(2, htJ);
        this.$attestationRequest = hatchAttestationRequest;
        this.$completionHandle = str;
        this.$contactPoint = str2;
        this.$region = str3;
        this.$dateOfBirth = str4;
        this.$firstName = str5;
        this.$lastName = str6;
        this.$password = str7;
        this.$tosContentVersion = str8;
        this.$tempToken = str9;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$registerCompletion$2(this.$attestationRequest, this.$completionHandle, this.$contactPoint, this.$region, this.$dateOfBirth, this.$firstName, this.$lastName, this.$password, this.$tosContentVersion, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(6:6|7|50|19|22|(8:24|(1:40)|28|29|30|(1:32)|33|34)(5:(1:47)(2:52|44)|30|(0)|33|34))(2:48|49))(1:13))(2:8|(2:10|(1:12))(8:15|16|(1:18)|7|50|19|22|(0)(0)))|14|16|(0)|7|50|19|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        r0 = X.C3cG.A0J(r3, X.C3cG.A0I(null, r3), X.C3cH.A0d(r3, r4, r2), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletion$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$registerCompletion$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
