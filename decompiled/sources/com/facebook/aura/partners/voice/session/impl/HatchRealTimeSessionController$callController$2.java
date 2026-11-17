package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C5048DQu;
import com.facebook.rp.platform.calling.CallControllerImpl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$callController$2 extends AbstractC7559F3s implements Function0<CallControllerImpl> {
    public final /* synthetic */ HatchRealTimeSessionController this$0;

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchRealTimeSessionController$callController$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C5048DQu> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final C5048DQu invoke() {
            return new C5048DQu();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C5048DQu invoke() {
            return new C5048DQu();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$callController$2(HatchRealTimeSessionController hatchRealTimeSessionController) {
        super(0);
        this.this$0 = hatchRealTimeSessionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CallControllerImpl invoke() {
        HatchRealTimeSessionController hatchRealTimeSessionController = this.this$0;
        return new CallControllerImpl(hatchRealTimeSessionController.context, hatchRealTimeSessionController.config, hatchRealTimeSessionController.mcProvider, AnonymousClass1.INSTANCE);
    }
}
