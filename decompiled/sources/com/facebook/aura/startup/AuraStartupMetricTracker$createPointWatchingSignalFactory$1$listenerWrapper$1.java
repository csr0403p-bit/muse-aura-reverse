package com.facebook.aura.startup;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ G0V<String, String, Unit> $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraStartupMetricTracker$createPointWatchingSignalFactory$1$listenerWrapper$1(G0V<? super String, ? super String, Unit> g0v) {
        super(2);
        this.$listener = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.$listener.invoke(str, str2);
    }
}
