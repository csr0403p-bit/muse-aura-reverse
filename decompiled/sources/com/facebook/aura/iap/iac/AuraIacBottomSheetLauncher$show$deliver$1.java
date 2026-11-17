package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.F1F;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraIacBottomSheetLauncher$show$deliver$1 extends AbstractC7559F3s implements G0W<String, Integer, Integer, Unit> {
    public final /* synthetic */ F1F $delivered;
    public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;

    public final void invoke(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        F1F f1f = this.$delivered;
        if (f1f.element) {
            return;
        }
        f1f.element = true;
        AnonymousClass001.A1G(str, Integer.valueOf(i), this.$onClose, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIacBottomSheetLauncher$show$deliver$1(F1F f1f, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
        super(3);
        this.$delivered = f1f;
        this.$onClose = g0w;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Integer num2) {
        invoke(str, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
