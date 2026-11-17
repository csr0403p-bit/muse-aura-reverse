package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchRetainedMapRegistry$acquire$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchRetainedMapRegistry this$0;

    /* renamed from: com.facebook.aura.maps.HatchRetainedMapRegistry$acquire$3$1$1$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<HatchRetainedMapPresentation, Boolean> {
        public AnonymousClass1(Object obj) {
            super(1, obj, HatchRetainedMapRegistry.class, "isDead", "isDead(Lcom/facebook/aura/maps/HatchRetainedMapPresentation;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
            return Boolean.valueOf(((HatchRetainedMapRegistry) AnonymousClass006.A0o(hatchRetainedMapPresentation, this)).isDead(hatchRetainedMapPresentation));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRetainedMapRegistry$acquire$3$1$1(HatchRetainedMapRegistry hatchRetainedMapRegistry) {
        super(0);
        this.this$0 = hatchRetainedMapRegistry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchRetainedMapRegistry hatchRetainedMapRegistry = this.this$0;
        hatchRetainedMapRegistry.registry.evictUnheld(new AnonymousClass1(hatchRetainedMapRegistry));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
