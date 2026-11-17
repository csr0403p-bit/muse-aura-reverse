package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BoY;
import X.Bs1;
import X.C0Yr;
import X.C1BO;
import X.C1HY;
import X.C7384Etj;
import X.C78g;
import X.EvM;
import X.G0U;
import android.view.Display;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchCameraPreviewKt$HatchCameraPreview$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ HatchCameraSession $camera;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnReady$delegate;
    public final /* synthetic */ G0U<Function0<Unit>, Unit> $onCaptureAction;
    public final /* synthetic */ C1HY $owner;
    public final /* synthetic */ BoY $view;

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ HatchCameraSession $camera;
        public final /* synthetic */ BoY $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchCameraSession hatchCameraSession, BoY boY) {
            super(0);
            this.$camera = hatchCameraSession;
            this.$view = boY;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchCameraSession hatchCameraSession = this.$camera;
            Display display = this.$view.getDisplay();
            hatchCameraSession.takePhoto(display != null ? display.getRotation() : 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCameraPreviewKt$HatchCameraPreview$1$1(BoY boY, C1HY c1hy, G0U<? super Function0<Unit>, Unit> g0u, C1BO<? extends G0U<? super Boolean, Unit>> c1bo, HatchCameraSession hatchCameraSession) {
        super(1);
        this.$view = boY;
        this.$owner = c1hy;
        this.$onCaptureAction = g0u;
        this.$currentOnReady$delegate = c1bo;
        this.$camera = hatchCameraSession;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final C1BO<G0U<Boolean, Unit>> c1bo = this.$currentOnReady$delegate;
        final Bs1<? super EvM> bs1 = new Bs1() { // from class: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$1$1$observer$1
            @Override // X.Bs1
            public final void onChanged(EvM evM) {
                C7384Etj.A0Y(evM, 0);
                AnonymousClass001.A1K(AnonymousClass002.A1Z(evM, EvM.STREAMING), C1BO.A0B(c1bo));
            }
        };
        this.$view.A0E.A05(this.$owner, bs1);
        this.$onCaptureAction.invoke(new AnonymousClass1(this.$camera, this.$view));
        final BoY boY = this.$view;
        return new C78g() { // from class: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                boY.A0E.A07(bs1);
            }
        };
    }
}
