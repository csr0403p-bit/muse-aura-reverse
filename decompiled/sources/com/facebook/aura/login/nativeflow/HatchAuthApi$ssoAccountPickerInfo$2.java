package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$2", f = "HatchAuthApi.kt", l = {425}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$ssoAccountPickerInfo$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchSsoAccountInfoResponse>>, Object> {
    public final /* synthetic */ List<HatchSsoAccountInfoRequest> $accounts;
    public final /* synthetic */ String $bearer;
    public final /* synthetic */ List<String> $drawnSavedAccountIds;
    public final /* synthetic */ String $idForAymh;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$ssoAccountPickerInfo$2(List<HatchSsoAccountInfoRequest> list, String str, List<String> list2, String str2, HtJ<? super HatchAuthApi$ssoAccountPickerInfo$2> htJ) {
        super(2, htJ);
        this.$accounts = list;
        this.$idForAymh = str;
        this.$drawnSavedAccountIds = list2;
        this.$bearer = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$ssoAccountPickerInfo$2(this.$accounts, this.$idForAymh, this.$drawnSavedAccountIds, this.$bearer, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchSsoAccountInfoResponse>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchSsoAccountInfoResponse>>) htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:(1:5)(2:50|51))(2:34|(3:36|37|38)(8:39|(2:42|40)|56|43|(2:46|44)|57|47|(1:49)))|6|52|7|10|(8:12|(1:26)|16|17|18|(1:20)|37|38)(5:(1:33)(2:54|30)|18|(0)|37|38)) */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = X.C3cG.A0J(r3, X.C3cG.A0I(null, r3), X.C3cH.A0d(r3, r4, r2), r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$ssoAccountPickerInfo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchSsoAccountInfoResponse>> htJ) {
        return ((HatchAuthApi$ssoAccountPickerInfo$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
