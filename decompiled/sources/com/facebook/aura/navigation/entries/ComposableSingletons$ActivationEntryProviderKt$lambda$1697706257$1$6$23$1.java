package com.facebook.aura.navigation.entries;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C5as;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.perf.HatchActivationQplLogger;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$23$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$23$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, null, null, false, false, C5as.A03, null, false, false, false, null, false, null, null, null, null, null, null, null, null, null, 16776959, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$23$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchActivationQplLogger.INSTANCE.pointFlow("age_verified");
        AuraViewerDataProvider.Companion.getInstance(this.$userSession).atomicUpdate(AnonymousClass1.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
