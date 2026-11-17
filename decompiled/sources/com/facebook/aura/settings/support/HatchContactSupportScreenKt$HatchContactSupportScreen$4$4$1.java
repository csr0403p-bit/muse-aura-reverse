package com.facebook.aura.settings.support;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$HatchContactSupportScreen$4$4$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ HatchContactSupportViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        HatchContactSupportScreenKt.logContactSupportClick(HatchScreen.CONTACT_SUPPORT, HatchComponent.SUPPORT_TICKET_TOPIC_ROW, str);
        this.$viewModel.onTopicSelected(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchContactSupportScreenKt$HatchContactSupportScreen$4$4$1(HatchContactSupportViewModel hatchContactSupportViewModel) {
        super(1);
        this.$viewModel = hatchContactSupportViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
