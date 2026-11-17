package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class WatchHandoffRenewal$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<WatchHandoffRenewal> {
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchHandoffRenewal$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$session = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final WatchHandoffRenewal invoke() {
        return new WatchHandoffRenewal(this.$session);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ WatchHandoffRenewal invoke() {
        return new WatchHandoffRenewal(this.$session);
    }
}
