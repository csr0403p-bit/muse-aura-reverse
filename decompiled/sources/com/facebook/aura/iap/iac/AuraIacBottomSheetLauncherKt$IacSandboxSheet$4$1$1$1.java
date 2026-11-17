package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.EnumC7495EyA;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraIacBottomSheetLauncherKt$IacSandboxSheet$4$1$1$1 extends AbstractC7559F3s implements G0W<EnumC7495EyA, Integer, Integer, Unit> {
    public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIacBottomSheetLauncherKt$IacSandboxSheet$4$1$1$1(G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
        super(3);
        this.$onClose = g0w;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(EnumC7495EyA enumC7495EyA, Integer num, Integer num2) {
        invoke(enumC7495EyA, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(EnumC7495EyA enumC7495EyA, int i, int i2) {
        C7384Etj.A0Y(enumC7495EyA, 0);
        AnonymousClass001.A1G(enumC7495EyA.bloksValue, Integer.valueOf(i), this.$onClose, i2);
    }
}
