package com.facebook.aura.subscription.repo;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3cI;
import X.C78W;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraSubscriptionRepository$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<AuraSubscriptionRepository> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.subscription.repo.AuraSubscriptionRepository$Companion$getInstance$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return C3cI.A0O();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return C3cI.A0O();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionRepository$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AuraSubscriptionRepository invoke() {
        return new AuraSubscriptionRepository(this.$userSession, C78W.A03(), AnonymousClass1.INSTANCE);
    }
}
