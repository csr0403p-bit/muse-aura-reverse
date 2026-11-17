package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$2", f = "HatchAuthApi.kt", l = {660}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuthApi$dblProvision$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchDblProvision>>, Object> {
    public final /* synthetic */ String $aymhDeviceId;
    public final /* synthetic */ String $frlAccessToken;
    public final /* synthetic */ String $tempToken;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuthApi$dblProvision$2(String str, String str2, String str3, HtJ<? super HatchAuthApi$dblProvision$2> htJ) {
        super(2, htJ);
        this.$frlAccessToken = str;
        this.$aymhDeviceId = str2;
        this.$tempToken = str3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuthApi$dblProvision$2(this.$frlAccessToken, this.$aymhDeviceId, this.$tempToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchDblProvision>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchDblProvision>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.HatchAuthApi$dblProvision$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchDblProvision>> htJ) {
        return ((HatchAuthApi$dblProvision$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
