package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Function0<Unit> $onCancel;
    public final /* synthetic */ WearablesLinkingOrigin $origin;
    public final /* synthetic */ String $setupSessionId;
    public final /* synthetic */ String $utmMedium;

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function0) {
            super(0);
            this.$origin = wearablesLinkingOrigin;
            this.$utmMedium = str;
            this.$setupSessionId = str2;
            this.$onCancel = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            WearablesLinkingOriginKt.logWearablesConsentDismiss(this.$origin, this.$utmMedium, this.$setupSessionId);
            this.$onCancel.invoke();
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
        auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120c04, null, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, new AnonymousClass1(this.$origin, this.$utmMedium, this.$setupSessionId, this.$onCancel), null, BRg.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$2$1(boolean z, WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function0) {
        super(1);
        this.$isLoading = z;
        this.$origin = wearablesLinkingOrigin;
        this.$utmMedium = str;
        this.$setupSessionId = str2;
        this.$onCancel = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
