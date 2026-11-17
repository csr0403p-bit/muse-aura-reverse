package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraIacBottomSheetLauncherKt$IacSandboxSheet$dismiss$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIacBottomSheetLauncherKt$IacSandboxSheet$dismiss$1$1(G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
        super(0);
        this.$onClose = g0w;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1G(AuraIacBottomSheetLauncherKt.USER_CANCELLED_WIRE_VALUE, 2592000, this.$onClose, 120);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
