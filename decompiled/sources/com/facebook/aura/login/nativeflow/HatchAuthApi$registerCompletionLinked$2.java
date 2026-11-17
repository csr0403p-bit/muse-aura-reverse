package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$2", f = "HatchAuthApi.kt", l = {287, 314}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$registerCompletionLinked$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ HatchAttestationRequest $attestationRequest;
    public final /* synthetic */ String $contactPoint;
    public final /* synthetic */ boolean $drawsLinkingDisclosure;
    public final /* synthetic */ String $linkHandle;
    public final /* synthetic */ String $linkingDisclosureVersion;
    public final /* synthetic */ String $region;
    public final /* synthetic */ String $tempToken;
    public final /* synthetic */ String $tosContentVersion;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$registerCompletionLinked$2(HatchAttestationRequest hatchAttestationRequest, String str, String str2, String str3, String str4, boolean z, String str5, String str6, HtJ<? super HatchAuthApi$registerCompletionLinked$2> htJ) {
        super(2, htJ);
        this.$attestationRequest = hatchAttestationRequest;
        this.$linkHandle = str;
        this.$contactPoint = str2;
        this.$region = str3;
        this.$tosContentVersion = str4;
        this.$drawsLinkingDisclosure = z;
        this.$linkingDisclosureVersion = str5;
        this.$tempToken = str6;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$registerCompletionLinked$2(this.$attestationRequest, this.$linkHandle, this.$contactPoint, this.$region, this.$tosContentVersion, this.$drawsLinkingDisclosure, this.$linkingDisclosureVersion, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:(1:(6:6|7|62|26|29|(8:31|(1:45)|35|36|37|(2:64|53)|56|57)(5:(1:52)(2:60|49)|37|(0)|56|57))(2:58|59))(1:13))(2:8|(2:10|(1:12))(10:15|16|(3:18|(2:21|19)|66)(1:22)|23|(1:25)|7|62|26|29|(0)(0)))|14|16|(0)(0)|23|(0)|7|62|26|29|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        r0 = X.C3cG.A0J(r6, X.C3cG.A0I(null, r6), X.C3cH.A0d(r6, r4, r2), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$registerCompletionLinked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$registerCompletionLinked$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
