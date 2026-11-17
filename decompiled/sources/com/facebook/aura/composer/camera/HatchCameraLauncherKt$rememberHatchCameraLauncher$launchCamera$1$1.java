package com.facebook.aura.composer.camera;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C7OU;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchCameraLauncherKt$rememberHatchCameraLauncher$launchCamera$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C7OU<Uri, Boolean> $camera;
    public final /* synthetic */ HatchCameraCaptureState $capture;
    public final /* synthetic */ G0U<Exception, Unit> $onFailure;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AbstractC3358CGz $session;

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraLauncherKt$rememberHatchCameraLauncher$launchCamera$1$1$1", f = "HatchCameraLauncher.kt", l = {54}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraLauncherKt$rememberHatchCameraLauncher$launchCamera$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C7OU<Uri, Boolean> $camera;
        public final /* synthetic */ HatchCameraCaptureState $capture;
        public final /* synthetic */ G0U<Exception, Unit> $onFailure;
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* renamed from: com.facebook.aura.composer.camera.HatchCameraLauncherKt$rememberHatchCameraLauncher$launchCamera$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00691 extends AbstractC7559F3s implements G0U<Uri, Unit> {
            public final /* synthetic */ C7OU<Uri, Boolean> $camera;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Uri uri) {
                C7384Etj.A0Y(uri, 0);
                A02(uri);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00691(C7OU<Uri, Boolean> c7ou) {
                super(1);
                this.$camera = c7ou;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
                invoke2(uri);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, G0U<? super Exception, Unit> g0u, C7OU<Uri, Boolean> c7ou, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$capture = hatchCameraCaptureState;
            this.$session = abstractC3358CGz;
            this.$onFailure = g0u;
            this.$camera = c7ou;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$capture, this.$session, this.$onFailure, this.$camera, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCameraCaptureState hatchCameraCaptureState = this.$capture;
                    AbstractC3358CGz abstractC3358CGz = this.$session;
                    C00691 c00691 = new C00691(this.$camera);
                    this.label = 1;
                    if (hatchCameraCaptureState.launch(abstractC3358CGz, c00691, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (Exception e) {
                this.$onFailure.invoke(e);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCameraLauncherKt$rememberHatchCameraLauncher$launchCamera$1$1(C3UX c3ux, HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, G0U<? super Exception, Unit> g0u, C7OU<Uri, Boolean> c7ou) {
        super(0);
        this.$scope = c3ux;
        this.$capture = hatchCameraCaptureState;
        this.$session = abstractC3358CGz;
        this.$onFailure = g0u;
        this.$camera = c7ou;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$capture, this.$session, this.$onFailure, this.$camera, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
