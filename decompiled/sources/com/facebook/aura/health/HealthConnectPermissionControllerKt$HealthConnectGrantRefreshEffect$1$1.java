package com.facebook.aura.health;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06787bB;
import X.C10543Hqv;
import X.C1BO;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.InterfaceC06807bD;
import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRefreshed$delegate;
    public final /* synthetic */ C3UX $scope;

    @DebugMetadata(c = "com.facebook.aura.health.HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$1$1$1", f = "HealthConnectPermissionController.kt", l = {31}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.health.HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRefreshed$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Context context, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$currentOnRefreshed$delegate = c1bo;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$currentOnRefreshed$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HealthConnectPermissionUtils healthConnectPermissionUtils = HealthConnectPermissionUtils.INSTANCE;
                    Context context = this.$context;
                    this.label = 1;
                    if (healthConnectPermissionUtils.refreshGrantedState(context, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                C1BO.A0D(this.$currentOnRefreshed$delegate);
            } catch (Exception e) {
                if (e instanceof CancellationException) {
                    throw e;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, X.Hqc] */
    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        if (HealthConnectPermissionUtils.INSTANCE.isAvailable(this.$context) && HealthConnectPermissionControllerKt.getHealthConnectConnectorEnabled()) {
            c10543HqvA0z.element = AnonymousClass001.A11(new AnonymousClass1(this.$context, this.$currentOnRefreshed$delegate, null), this.$scope);
        }
        return new InterfaceC06807bD() { // from class: com.facebook.aura.health.HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
                AnonymousClass002.A1K((HoC) c10543HqvA0z.element);
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectPermissionControllerKt$HealthConnectGrantRefreshEffect$1$1(Context context, C3UX c3ux, C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$context = context;
        this.$scope = c3ux;
        this.$currentOnRefreshed$delegate = c1bo;
    }
}
