package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C9xo;
import X.C9xt;
import X.EnumC7495EyA;
import X.G0W;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IacSandboxSheetContentKt$IacSandboxSheetFooter$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C9xo $display;
    public final /* synthetic */ G0W<EnumC7495EyA, Integer, Integer, Unit> $onConfirm;
    public final /* synthetic */ IacSandboxSheetState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IacSandboxSheetContentKt$IacSandboxSheetFooter$1$1$1(G0W<? super EnumC7495EyA, ? super Integer, ? super Integer, Unit> g0w, IacSandboxSheetState iacSandboxSheetState, C9xo c9xo) {
        super(0);
        this.$onConfirm = g0w;
        this.$state = iacSandboxSheetState;
        this.$display = c9xo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0W<EnumC7495EyA, Integer, Integer, Unit> g0w = this.$onConfirm;
        EnumC7495EyA enumC7495EyAOutcomeAt = IacSandboxSheetContentKt.outcomeAt(MutableState.A02(this.$state.outcomeIndex$delegate));
        C9xo c9xo = this.$display;
        int iA02 = MutableState.A02(this.$state.cadenceSeconds$delegate);
        C9xt c9xt = c9xo.A01;
        if (c9xt != null) {
            iA02 = c9xt.A00;
        }
        AnonymousClass001.A1G(enumC7495EyAOutcomeAt, Integer.valueOf(iA02), g0w, MutableState.A02(this.$state.maxRenewals$delegate));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
