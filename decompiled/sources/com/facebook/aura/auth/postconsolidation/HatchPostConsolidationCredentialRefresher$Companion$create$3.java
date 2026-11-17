package com.facebook.aura.auth.postconsolidation;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.login.nativeflow.HatchTempTokenProvider;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class HatchPostConsolidationCredentialRefresher$Companion$create$3 extends C7438Evz implements G0U<String, Unit> {
    public HatchPostConsolidationCredentialRefresher$Companion$create$3(Object obj) {
        super(1, obj, HatchTempTokenProvider.class, "invalidate", "invalidate(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchTempTokenProvider) AnonymousClass006.A0o(str, this)).invalidate(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
