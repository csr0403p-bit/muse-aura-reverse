package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$2$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;

    /* renamed from: com.facebook.aura.agentpermission.AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState) {
            super(0);
            this.$isVisible$delegate = mutableState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MutableState.A09(false, this.$isVisible$delegate);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        MutableState.A09(true, this.$isVisible$delegate);
        return new BL5(new AnonymousClass1(this.$isVisible$delegate));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$agentPermissionApprovalImpressions$2$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isVisible$delegate = mutableState;
    }
}
