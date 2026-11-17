package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.connectorconsent.ConnectorConsentKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SkillConnectBottomSheetKt$SkillConnectSheetContent$6$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ SkillConnectViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.onTermsLinkTapped(this.$origin);
        ConnectorConsentKt.openConnectorConsentLink(this.$context, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillConnectBottomSheetKt$SkillConnectSheetContent$6$1(SkillConnectViewModel skillConnectViewModel, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Context context) {
        super(2);
        this.$viewModel = skillConnectViewModel;
        this.$origin = hatchSkillOAuthOrigin;
        this.$context = context;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
