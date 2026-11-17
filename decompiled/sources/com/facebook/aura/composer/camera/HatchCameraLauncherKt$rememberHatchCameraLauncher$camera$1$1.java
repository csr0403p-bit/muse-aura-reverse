package com.facebook.aura.composer.camera;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class HatchCameraLauncherKt$rememberHatchCameraLauncher$camera$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ HatchCameraCaptureState $capture;
    public final /* synthetic */ G0U<Exception, Unit> $onFailure;
    public final /* synthetic */ G0U<File, Unit> $onPhotoCaptured;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AbstractC3358CGz $session;

    @DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraLauncherKt$rememberHatchCameraLauncher$camera$1$1$1", f = "HatchCameraLauncher.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.composer.camera.HatchCameraLauncherKt$rememberHatchCameraLauncher$camera$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchCameraCaptureState $capture;
        public final /* synthetic */ boolean $captured;
        public final /* synthetic */ G0U<Exception, Unit> $onFailure;
        public final /* synthetic */ G0U<File, Unit> $onPhotoCaptured;
        public final /* synthetic */ AbstractC3358CGz $session;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, boolean z, G0U<? super File, Unit> g0u, G0U<? super Exception, Unit> g0u2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$capture = hatchCameraCaptureState;
            this.$session = abstractC3358CGz;
            this.$captured = z;
            this.$onPhotoCaptured = g0u;
            this.$onFailure = g0u2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$capture, this.$session, this.$captured, this.$onPhotoCaptured, this.$onFailure, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchCameraCaptureState hatchCameraCaptureState = this.$capture;
                    AbstractC3358CGz abstractC3358CGz = this.$session;
                    boolean z = this.$captured;
                    this.label = 1;
                    obj = hatchCameraCaptureState.takeResult(abstractC3358CGz, z, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                File file = (File) obj;
                if (file != null) {
                    this.$onPhotoCaptured.invoke(file);
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
    public HatchCameraLauncherKt$rememberHatchCameraLauncher$camera$1$1(C3UX c3ux, HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, G0U<? super File, Unit> g0u, G0U<? super Exception, Unit> g0u2) {
        super(1);
        this.$scope = c3ux;
        this.$capture = hatchCameraCaptureState;
        this.$session = abstractC3358CGz;
        this.$onPhotoCaptured = g0u;
        this.$onFailure = g0u2;
    }

    public final void invoke(boolean z) {
        AnonymousClass001.A1J(new AnonymousClass1(this.$capture, this.$session, z, this.$onPhotoCaptured, this.$onFailure, null), this.$scope);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
