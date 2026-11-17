package com.facebook.aura.navigation.entries;

import X.AnonymousClass006;
import X.C3cF;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.activation.model.HatchRedeemInviteCodeViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$1$1 extends C7438Evz implements G0U<String, Unit> {
    public ComposableSingletons$RedeemInviteCodeEntryProviderKt$lambda$152792668$1$1$1(Object obj) {
        super(1, obj, HatchRedeemInviteCodeViewModel.class, "onInviteCodeChange", C3cF.A00(46), 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchRedeemInviteCodeViewModel) AnonymousClass006.A0o(str, this)).onInviteCodeChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
