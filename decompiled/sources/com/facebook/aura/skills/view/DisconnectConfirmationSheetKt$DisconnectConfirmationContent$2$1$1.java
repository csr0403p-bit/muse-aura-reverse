package com.facebook.aura.skills.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $learnMoreUrl;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ Skill $skill;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisconnectConfirmationSheetKt$DisconnectConfirmationContent$2$1$1(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Skill skill, String str, Context context) {
        super(1);
        this.$origin = hatchSkillOAuthOrigin;
        this.$skill = skill;
        this.$learnMoreUrl = str;
        this.$context = context;
    }

    public final void invoke(int i) {
        HatchInteractionLogger.INSTANCE.logClick(this.$origin, HatchComponent.EXTERNAL_LINK, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$skill.id));
        SecureUriKt.openInApp(SecureUriKt.asSecureUri(this.$learnMoreUrl), this.$context);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
