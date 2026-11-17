package com.facebook.aura.ageverification;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.user.provider.AgeCheckMethod;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AgeMethodListScreenKt$AgeMethodListScreen$loggedPick$1$1 extends AbstractC7559F3s implements G0U<G0V<? super AgeCheckMethod, ? super Integer, ? extends Unit>, G0U<? super AgeCheckMethod, ? extends Unit>> {
    public final /* synthetic */ AHD<AgeCheckMethod> $accounts;
    public final /* synthetic */ AHD<AgeCheckMethod> $primary;

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodListScreen$loggedPick$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AgeCheckMethod, Unit> {
        public final /* synthetic */ AHD<AgeCheckMethod> $accounts;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $handler;
        public final /* synthetic */ AHD<AgeCheckMethod> $primary;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AgeCheckMethod ageCheckMethod) {
            C7384Etj.A0Y(ageCheckMethod, 0);
            SelfieAgeStepAnalytics.INSTANCE.logClick(AgeMethodListScreenKt.getPickComponent(ageCheckMethod), AgeMethodListScreenKt.AGE_METHODS_SCREEN);
            AnonymousClass001.A1H(ageCheckMethod, this.$handler, AbstractC0878AGe.A0P(this.$accounts, this.$primary).indexOf(ageCheckMethod) + 1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2) {
            super(1);
            this.$handler = g0v;
            this.$primary = ahd;
            this.$accounts = ahd2;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AgeCheckMethod ageCheckMethod) {
            invoke2(ageCheckMethod);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final G0U<AgeCheckMethod, Unit> invoke2(G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        return new AnonymousClass1(g0v, this.$primary, this.$accounts);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AgeMethodListScreenKt$AgeMethodListScreen$loggedPick$1$1(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2) {
        super(1);
        this.$primary = ahd;
        this.$accounts = ahd2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ G0U<? super AgeCheckMethod, ? extends Unit> invoke(G0V<? super AgeCheckMethod, ? super Integer, ? extends Unit> g0v) {
        return invoke2((G0V<? super AgeCheckMethod, ? super Integer, Unit>) g0v);
    }
}
