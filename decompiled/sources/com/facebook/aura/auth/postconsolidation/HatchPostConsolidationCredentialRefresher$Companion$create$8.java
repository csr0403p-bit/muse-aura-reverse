package com.facebook.aura.auth.postconsolidation;

import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class HatchPostConsolidationCredentialRefresher$Companion$create$8 extends C7438Evz implements G0U<PostConsolidationCredentialRefreshResult, Unit> {
    public static final HatchPostConsolidationCredentialRefresher$Companion$create$8 INSTANCE = new HatchPostConsolidationCredentialRefresher$Companion$create$8();

    public HatchPostConsolidationCredentialRefresher$Companion$create$8() {
        super(1, HatchPostConsolidationCredentialRefresherKt.class, "logRefreshResult", "logRefreshResult(Lcom/facebook/aura/auth/postconsolidation/PostConsolidationCredentialRefreshResult;)V", 1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult) {
        invoke2(postConsolidationCredentialRefreshResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PostConsolidationCredentialRefreshResult postConsolidationCredentialRefreshResult) {
        C7384Etj.A0Y(postConsolidationCredentialRefreshResult, 0);
        HatchPostConsolidationCredentialRefresherKt.logRefreshResult(postConsolidationCredentialRefreshResult);
    }
}
