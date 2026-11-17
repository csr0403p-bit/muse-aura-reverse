package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$FullScreenCommsConsentFooter$1$1$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$FullScreenCommsConsentFooter$1$1$1$1, reason: invalid class name */
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
            AnonymousClass001.A1K(true, this.$onDecision);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$FullScreenCommsConsentFooter$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super Boolean, Unit> g0u) {
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
        boolean z = this.$isLoading;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDecision);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f120bfd, (Object[]) null, (Drawable) null, !z, z, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, anonymousClass1, (String) null, bs0);
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120bf5, null, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass2(this.$onDecision), null, bs0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WearablesLinkingFullScreenKt$FullScreenCommsConsentFooter$1$1$1(boolean z, G0U<? super Boolean, Unit> g0u) {
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
