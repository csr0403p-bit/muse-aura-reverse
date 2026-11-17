package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$1$1(G0U<? super Boolean, Unit> g0u) {
        super(0);
        this.$onDecision = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1K(true, this.$onDecision);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
