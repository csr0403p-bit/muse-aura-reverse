package com.facebook.aura.vds.compose.picker;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.C0z3;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePicker$2$1", f = "AuraDatePicker.kt", l = {133}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraDatePickerKt$AuraDatePicker$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<G0U<LocalDate, Unit>> $currentOnDateSelected;
    public final /* synthetic */ C0z3 $state;
    public int label;

    /* renamed from: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePicker$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Long> {
        public final /* synthetic */ C0z3 $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0z3 c0z3) {
            super(0);
            this.$state = c0z3;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return this.$state.AKE();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return this.$state.AKE();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraDatePickerKt$AuraDatePicker$2$1(C0z3 c0z3, C1BO<? extends G0U<? super LocalDate, Unit>> c1bo, HtJ<? super AuraDatePickerKt$AuraDatePicker$2$1> htJ) {
        super(2, htJ);
        this.$state = c0z3;
        this.$currentOnDateSelected = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraDatePickerKt$AuraDatePicker$2$1(this.$state, this.$currentOnDateSelected, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass602 anonymousClass602 = new AnonymousClass602(C6v3.A01(new AnonymousClass1(this.$state)), 0);
            final C1BO<G0U<LocalDate, Unit>> c1bo = this.$currentOnDateSelected;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.vds.compose.picker.AuraDatePickerKt$AuraDatePicker$2$1.2
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Long) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(Long l, HtJ<? super Unit> htJ) {
                    if (l != null) {
                        C1BO.A0B(c1bo).invoke(AuraDatePickerKt.toLocalDateAtUtc(l.longValue()));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (anonymousClass602.collect(c20z, this) == enumC10460Hji) {
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
        return ((AuraDatePickerKt$AuraDatePicker$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
