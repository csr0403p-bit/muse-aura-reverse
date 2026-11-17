package com.facebook.aura.analytics.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.F0C;
import X.InterfaceC4071ClJ;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MetaAnalyticsBuilder$createHealthCounterLoggerProvider$isFfdbEnabled$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ F0C<InterfaceC4071ClJ> $ffdbProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MetaAnalyticsBuilder$createHealthCounterLoggerProvider$isFfdbEnabled$2(F0C<? extends InterfaceC4071ClJ> f0c) {
        super(0);
        this.$ffdbProvider = f0c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(AnonymousClass002.A1N(this.$ffdbProvider.getValue().getFFDBToken().length()));
    }
}
