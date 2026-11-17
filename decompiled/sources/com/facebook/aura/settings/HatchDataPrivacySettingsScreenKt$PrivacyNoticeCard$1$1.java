package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsScreenKt$PrivacyNoticeCard$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$PrivacyNoticeCard$1$1(Context context) {
        super(1);
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        AnonymousClass006.A0b(str).logClick(HatchSurface.SETTINGS, HatchSubsurface.DATA_CONTROLS, HatchScreen.DATA_CONTROLS, HatchComponent.AI_TRAINING_LEARN_MORE, null, null, null);
        SecureUriKt.openInBrowser(SecureUriKt.asSecureUri(str), this.$context);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
