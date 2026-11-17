package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super Boolean, Unit> g0u) {
            super(0);
            this.$onDecision = g0u;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AnonymousClass001.A1K(false, this.$onDecision);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraButtonGroupScope auraButtonGroupScope) {
        C7384Etj.A0Y(auraButtonGroupScope, 0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120bf5, null, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass1(this.$onDecision), null, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$2$1(boolean z, G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$isLoading = z;
        this.$onDecision = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
