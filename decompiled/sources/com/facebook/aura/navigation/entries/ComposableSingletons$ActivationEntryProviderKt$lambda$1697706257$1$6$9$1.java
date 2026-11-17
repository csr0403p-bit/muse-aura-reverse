package com.facebook.aura.navigation.entries;

import X.AnonymousClass001;
import X.C7384Etj;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.activation.model.AuraInviteCodeViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$9$1 extends C7438Evz implements G0V<Boolean, String, Unit> {
    public final void invoke(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        ((AuraInviteCodeViewModel) this.receiver).onInviteStepChanged(z, str);
    }

    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$9$1(Object obj) {
        super(2, obj, AuraInviteCodeViewModel.class, "onInviteStepChanged", "onInviteStepChanged(ZLjava/lang/String;)V", 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
        invoke(AnonymousClass001.A1X(bool), str);
        return Unit.INSTANCE;
    }
}
