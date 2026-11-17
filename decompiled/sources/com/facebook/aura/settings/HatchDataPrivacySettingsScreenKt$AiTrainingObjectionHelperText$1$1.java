package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$AiTrainingObjectionHelperText$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$AiTrainingObjectionHelperText$1$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SecureUriKt.openInBrowser(AuraExternalUriRegistry.INSTANCE.getAiGuideLearnMoreUri(), this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
