package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$2", f = "HatchAuthApi.kt", l = {807, 823, 826}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$twoFactorConfirm$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ HatchAttestationRequest $attestationRequest;
    public final /* synthetic */ String $code;
    public final /* synthetic */ String $methodId;
    public final /* synthetic */ String $tempToken;
    public final /* synthetic */ String $tosContentVersion;
    public final /* synthetic */ String $twoFactorState;
    public Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$twoFactorConfirm$2(HatchAttestationRequest hatchAttestationRequest, String str, String str2, String str3, String str4, String str5, HtJ<? super HatchAuthApi$twoFactorConfirm$2> htJ) {
        super(2, htJ);
        this.$attestationRequest = hatchAttestationRequest;
        this.$tosContentVersion = str;
        this.$twoFactorState = str2;
        this.$methodId = str3;
        this.$code = str4;
        this.$tempToken = str5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$twoFactorConfirm$2(this.$attestationRequest, this.$tosContentVersion, this.$twoFactorState, this.$methodId, this.$code, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$twoFactorConfirm$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((HatchAuthApi$twoFactorConfirm$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
