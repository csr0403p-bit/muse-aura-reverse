package com.facebook.aura.applock;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ AppLockRepository $repository;
    public final /* synthetic */ AppLockTimeout $timeoutOption;

    @DebugMetadata(c = "com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1$1$1$1", f = "BiometricsSettingsScreen.kt", l = {192}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AppLockRepository $repository;
        public final /* synthetic */ AppLockTimeout $timeoutOption;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AppLockRepository appLockRepository, AppLockTimeout appLockTimeout, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = appLockRepository;
            this.$timeoutOption = appLockTimeout;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$repository, this.$timeoutOption, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AppLockRepository appLockRepository = this.$repository;
                AppLockTimeout appLockTimeout = this.$timeoutOption;
                this.label = 1;
                if (appLockRepository.setTimeout(appLockTimeout, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1$1$1$1$1(C3UX c3ux, AppLockRepository appLockRepository, AppLockTimeout appLockTimeout) {
        super(1);
        this.$coroutineScope = c3ux;
        this.$repository = appLockRepository;
        this.$timeoutOption = appLockTimeout;
    }

    public final void invoke(boolean z) {
        if (z) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.BIOMETRICS, HatchScreen.BIOMETRICS, HatchComponent.APP_LOCK_TIMEOUT_OPTION, null, null, null);
            AnonymousClass001.A1J(new AnonymousClass1(this.$repository, this.$timeoutOption, null), this.$coroutineScope);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
