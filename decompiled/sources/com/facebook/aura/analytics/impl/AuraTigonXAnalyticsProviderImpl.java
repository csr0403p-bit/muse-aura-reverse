package com.facebook.aura.analytics.impl;

import X.AbstractC7559F3s;
import X.BV4;
import X.DFX;
import com.facebook.aura.network.tigon.AuraTigonXAnalyticsProvider;
import com.facebook.xanalytics.XAnalyticsHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraTigonXAnalyticsProviderImpl implements AuraTigonXAnalyticsProvider {
    public static final AuraTigonXAnalyticsProviderImpl INSTANCE = new AuraTigonXAnalyticsProviderImpl();

    /* renamed from: com.facebook.aura.analytics.impl.AuraTigonXAnalyticsProviderImpl$provide$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<DFX> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DFX invoke() {
            return BV4.A0C();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ DFX invoke() {
            return BV4.A0C();
        }
    }

    @Override // com.facebook.aura.network.tigon.AuraTigonXAnalyticsProvider
    public XAnalyticsHolder provide() {
        return new AuraXNativeHolderProvider(AnonymousClass1.INSTANCE).xAnalyticsAdapter;
    }
}
