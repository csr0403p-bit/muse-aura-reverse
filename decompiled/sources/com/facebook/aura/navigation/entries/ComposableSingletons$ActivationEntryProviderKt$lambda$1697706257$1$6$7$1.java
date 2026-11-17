package com.facebook.aura.navigation.entries;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.activation.model.AuraInviteCodeViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$7$1 extends C7438Evz implements G0U<String, Unit> {
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$7$1(Object obj) {
        super(1, obj, AuraInviteCodeViewModel.class, "onInviteCodeChange", "onInviteCodeChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((AuraInviteCodeViewModel) AnonymousClass006.A0o(str, this)).onInviteCodeChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
