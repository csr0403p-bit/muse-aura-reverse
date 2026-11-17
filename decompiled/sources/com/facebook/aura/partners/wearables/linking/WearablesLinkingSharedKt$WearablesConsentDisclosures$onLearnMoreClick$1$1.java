package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.C31u;
import X.C7BY;
import android.content.Context;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingSharedKt$WearablesConsentDisclosures$onLearnMoreClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C31u<Object, String> $learnMoreUrl$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingSharedKt$WearablesConsentDisclosures$onLearnMoreClick$1$1(Context context, C31u<Object, String> c31u) {
        super(0);
        this.$context = context;
        this.$learnMoreUrl$delegate = c31u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C7BY.A0j(WearablesLinkingSharedKt.WearablesConsentDisclosures_N8B1yIo$lambda$0(this.$learnMoreUrl$delegate))) {
            return;
        }
        SecureUriKt.openInApp(SecureUriKt.asSecureUri(WearablesLinkingSharedKt.WearablesConsentDisclosures_N8B1yIo$lambda$0(this.$learnMoreUrl$delegate)), this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
