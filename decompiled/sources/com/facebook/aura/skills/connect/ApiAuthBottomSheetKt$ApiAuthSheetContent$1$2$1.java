package com.facebook.aura.skills.connect;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ApiAuthBottomSheetKt$ApiAuthSheetContent$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $apiKey$delegate;
    public final /* synthetic */ String $apiKeyIdentifier;
    public final /* synthetic */ String $connectUrl;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchSkillOAuthOrigin $origin;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiAuthBottomSheetKt$ApiAuthSheetContent$1$2$1(HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str, AbstractC3358CGz abstractC3358CGz, String str2, Function0<Unit> function0, MutableState<String> mutableState) {
        super(0);
        this.$origin = hatchSkillOAuthOrigin;
        this.$apiKeyIdentifier = str;
        this.$userSession = abstractC3358CGz;
        this.$connectUrl = str2;
        this.$onDismiss = function0;
        this.$apiKey$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(this.$origin, HatchComponent.SKILL_API_KEY_SUBMITTED, AnonymousClass006.A10(HatchMetadataKey.PROVIDER.getValue(), this.$apiKeyIdentifier));
        HatchConnectorQplLogger.INSTANCE.markCredentialSubmitted();
        HatchConnectorCatalogRepository.Companion.getInstance(this.$userSession).sendApiKeyAuthCallback(this.$apiKeyIdentifier, MutableState.A05(this.$apiKey$delegate), this.$connectUrl, this.$origin);
        this.$onDismiss.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
