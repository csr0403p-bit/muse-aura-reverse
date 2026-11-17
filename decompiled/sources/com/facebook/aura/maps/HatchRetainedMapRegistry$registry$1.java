package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchRetainedMapRegistry$registry$1 extends AbstractC7559F3s implements G0U<HatchRetainedMapPresentation, Unit> {
    public static final HatchRetainedMapRegistry$registry$1 INSTANCE = new HatchRetainedMapRegistry$registry$1();

    /* renamed from: com.facebook.aura.maps.HatchRetainedMapRegistry$registry$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchRetainedMapPresentation $presentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
            super(0);
            this.$presentation = hatchRetainedMapPresentation;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$presentation.close();
        }
    }

    public HatchRetainedMapRegistry$registry$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
        C7384Etj.A0Y(hatchRetainedMapPresentation, 0);
        HatchRetainedMapRegistryKt.onUiThread(new AnonymousClass1(hatchRetainedMapPresentation));
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
        invoke2(hatchRetainedMapPresentation);
        return Unit.INSTANCE;
    }
}
