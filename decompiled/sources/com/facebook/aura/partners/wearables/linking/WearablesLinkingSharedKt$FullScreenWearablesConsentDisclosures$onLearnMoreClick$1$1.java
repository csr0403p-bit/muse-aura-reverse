package com.facebook.aura.partners.wearables.linking;

import X.AbstractC7559F3s;
import X.C31u;
import X.C60R;
import X.C7BY;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.utils.navigation.SecureUriKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class WearablesLinkingSharedKt$FullScreenWearablesConsentDisclosures$onLearnMoreClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C31u<Object, String> $learnMoreUrl$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WearablesLinkingSharedKt$FullScreenWearablesConsentDisclosures$onLearnMoreClick$1$1(Context context, C31u<Object, String> c31u) {
        super(0);
        this.$context = context;
        this.$learnMoreUrl$delegate = c31u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        C31u<Object, String> c31u = this.$learnMoreUrl$delegate;
        InterfaceC7359EnW<Object>[] interfaceC7359EnWArr = WearablesLinkingSharedKt.$$delegatedProperties;
        if (C7BY.A0j(C60R.A0j(c31u, interfaceC7359EnWArr, 1))) {
            return;
        }
        SecureUriKt.openInApp(SecureUriKt.asSecureUri(C60R.A0j(this.$learnMoreUrl$delegate, interfaceC7359EnWArr, 1)), this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
