package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$1$1$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ List<CheckoutAmountPresentation> $group;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        Iterator<CheckoutAmountPresentation> it = this.$group.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$1$1$1$1$1$1$1(it.next()), -1326786980);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutApprovalSummaryBodyKt$CheckoutSummaryGroups$1$1$1$1$1(List<CheckoutAmountPresentation> list) {
        super(1);
        this.$group = list;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
