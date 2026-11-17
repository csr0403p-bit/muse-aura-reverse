package com.facebook.aura.main;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$1$1", f = "HatchSidePanelHost.kt", l = {128}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$ModalSidePanel$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $revealPx;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public int label;

    /* renamed from: com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Float> {
        public final /* synthetic */ AT5<Float, AOW> $revealPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AT5<Float, AOW> at5) {
            super(0);
            this.$revealPx = at5;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return (Float) this.$revealPx.A04.A05.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$ModalSidePanel$1$1(AT5<Float, AOW> at5, HatchSidePanelController hatchSidePanelController, HtJ<? super HatchSidePanelHostKt$ModalSidePanel$1$1> htJ) {
        super(2, htJ);
        this.$revealPx = at5;
        this.$sidePanelController = hatchSidePanelController;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSidePanelHostKt$ModalSidePanel$1$1(this.$revealPx, this.$sidePanelController, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$revealPx));
            final HatchSidePanelController hatchSidePanelController = this.$sidePanelController;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.main.HatchSidePanelHostKt$ModalSidePanel$1$1.2
                public final Object emit(float f, HtJ<? super Unit> htJ) {
                    hatchSidePanelController.updateRevealOffset(f);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    hatchSidePanelController.updateRevealOffset(AnonymousClass001.A02(obj2));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c05663ulA01.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSidePanelHostKt$ModalSidePanel$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
