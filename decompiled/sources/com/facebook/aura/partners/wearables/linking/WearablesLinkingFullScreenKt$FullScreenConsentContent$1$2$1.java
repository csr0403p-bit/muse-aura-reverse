package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.BRg;
import X.BS0;
import X.C7384Etj;
import X.G0U;
import android.graphics.drawable.Drawable;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupScope;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingFullScreenKt$FullScreenConsentContent$1$2$1 extends AbstractC7559F3s implements G0U<AuraButtonGroupScope, Unit> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Function0<Unit> $onEnable;
    public final /* synthetic */ Function0<Unit> $onNotNow;
    public final /* synthetic */ WearablesLinkingOrigin $origin;
    public final /* synthetic */ String $setupSessionId;
    public final /* synthetic */ String $utmMedium;

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$FullScreenConsentContent$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> $onEnable;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function0) {
            super(0);
            this.$origin = wearablesLinkingOrigin;
            this.$utmMedium = str;
            this.$setupSessionId = str2;
            this.$onEnable = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            WearablesLinkingOrigin wearablesLinkingOrigin = this.$origin;
            hatchInteractionLogger.logClick(wearablesLinkingOrigin.getSurface(), wearablesLinkingOrigin.getSubsurface(), HatchScreen.WEARABLES_LINKING, HatchComponent.ENABLE_ON_GLASSES_BUTTON, null, WearablesLinkingOriginKt.wearablesLinkingMetadata(this.$utmMedium, this.$setupSessionId), null);
            this.$onEnable.invoke();
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
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$origin, this.$utmMedium, this.$setupSessionId, this.$onEnable);
        BS0 bs0 = BRg.A00;
        auraButtonGroupScope.primaryButton(R.string._name_removed__res_0x7f120c06, (Object[]) null, (Drawable) null, !z, z, AuraButtonGroupsKt.DEFAULT_PRIMARY_BUTTON_ID, anonymousClass1, (String) null, bs0);
        Function0<Unit> function0 = this.$onNotNow;
        if (function0 != null) {
            auraButtonGroupScope.secondaryButton(R.string._name_removed__res_0x7f120c18, null, null, !this.$isLoading, false, AuraButtonGroupsKt.DEFAULT_SECONDARY_BUTTON_ID, function0, null, bs0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingFullScreenKt$FullScreenConsentContent$1$2$1(boolean z, Function0<Unit> function0, WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, Function0<Unit> function02) {
        super(1);
        this.$isLoading = z;
        this.$onNotNow = function0;
        this.$origin = wearablesLinkingOrigin;
        this.$utmMedium = str;
        this.$setupSessionId = str2;
        this.$onEnable = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraButtonGroupScope auraButtonGroupScope) {
        invoke2(auraButtonGroupScope);
        return Unit.INSTANCE;
    }
}
