package com.facebook.aura.ccv.accountlink;

import X.AbstractC7559F3s;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchFOAAccountLinkScreenKt$HatchFOAAccountLinkContent$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FragmentActivity $hostActivity;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchAccountLinkingTarget $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFOAAccountLinkScreenKt$HatchFOAAccountLinkContent$1$1(HatchAccountLinkingTarget hatchAccountLinkingTarget, FragmentActivity fragmentActivity, Function0<Unit> function0) {
        super(0);
        this.$target = hatchAccountLinkingTarget;
        this.$hostActivity = fragmentActivity;
        this.$onDismiss = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentActivity fragmentActivity;
        HatchAccountLinkingTarget hatchAccountLinkingTarget = this.$target;
        if (hatchAccountLinkingTarget != null && (fragmentActivity = this.$hostActivity) != null) {
            CcvBloksHelperKt.openAccountLinkingUpsellBloksScreen(fragmentActivity, hatchAccountLinkingTarget, false, CcvBloksHelperKt.AnonymousClass1.INSTANCE, CcvBloksHelperKt.AnonymousClass2.INSTANCE);
        }
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
