package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C98f;
import com.facebook.aura.analytics.waterfall.HatchNMEEntrypointLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$HatchPresentation$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $subscriptionEntryPointUrl;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new HatchNMEEntrypointLogger(null, 1, null).logImpression(C98f.A01, HatchConversationPresentationsKt.entrypointViewerData(this.$subscriptionEntryPointUrl));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationPresentationsKt$HatchPresentation$4$1(String str) {
        super(0);
        this.$subscriptionEntryPointUrl = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
