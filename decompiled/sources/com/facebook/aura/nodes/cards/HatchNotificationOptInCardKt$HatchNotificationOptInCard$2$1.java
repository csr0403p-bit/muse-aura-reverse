package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.BL5;
import X.C2BR;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNotificationOptInCardKt$HatchNotificationOptInCard$2$1 extends AbstractC7559F3s implements G0U {
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ NotificationOptInStore $store;

    /* renamed from: com.facebook.aura.nodes.cards.HatchNotificationOptInCardKt$HatchNotificationOptInCard$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Override // X.G0U
    public final BL5 invoke(C2BR c2br) {
        C7384Etj.A0Y(c2br, 0);
        this.$store.onShown(this.$presentationId);
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        C7384Etj.A0Y(anonymousClass1, 0);
        return new BL5(anonymousClass1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationOptInCardKt$HatchNotificationOptInCard$2$1(NotificationOptInStore notificationOptInStore, String str) {
        super(1);
        this.$store = notificationOptInStore;
        this.$presentationId = str;
    }
}
