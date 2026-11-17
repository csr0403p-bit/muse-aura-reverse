package com.facebook.aura.main;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$HatchActiveSessionHost$4$1 extends AbstractC7559F3s implements G0U<AuraNavKey, Unit> {
    public final /* synthetic */ AbstractC3358CGz $session;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        HatchActiveSessionHostKt.maybeStartRootNavigationTrace(this.$session, auraNavKey, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$HatchActiveSessionHost$4$1(AbstractC3358CGz abstractC3358CGz) {
        super(1);
        this.$session = abstractC3358CGz;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraNavKey auraNavKey) {
        invoke2(auraNavKey);
        return Unit.INSTANCE;
    }
}
