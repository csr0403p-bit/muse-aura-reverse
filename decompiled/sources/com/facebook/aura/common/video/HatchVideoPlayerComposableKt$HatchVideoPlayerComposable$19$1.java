package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.C8j4;
import X.G0U;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$19$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<Function0<Bitmap>, Unit>> $currentOnFrameCaptureAvailable$delegate;
    public final /* synthetic */ C1BO<G0U<View, Unit>> $currentOnSamplingViewChanged$delegate;
    public final /* synthetic */ AspectRatioFrameLayout $layout;
    public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;

    /* renamed from: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$19$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Bitmap> {
        public final /* synthetic */ AspectRatioFrameLayout $layout;
        public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState, AspectRatioFrameLayout aspectRatioFrameLayout) {
            super(0);
            this.$renderedFirstFrame = mutableState;
            this.$layout = aspectRatioFrameLayout;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Bitmap invoke() {
            if (MutableState.A0A((MutableState) this.$renderedFirstFrame)) {
                return HatchVideoPlayerComposableKt.captureVideoBitmap(this.$layout);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$19$1(AspectRatioFrameLayout aspectRatioFrameLayout, C1BO<? extends G0U<? super View, Unit>> c1bo, C1BO<? extends G0U<? super Function0<Bitmap>, Unit>> c1bo2, MutableState<Boolean> mutableState) {
        super(1);
        this.$layout = aspectRatioFrameLayout;
        this.$currentOnSamplingViewChanged$delegate = c1bo;
        this.$currentOnFrameCaptureAvailable$delegate = c1bo2;
        this.$renderedFirstFrame = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO.A0B(this.$currentOnSamplingViewChanged$delegate).invoke(this.$layout);
        C1BO.A0B(this.$currentOnFrameCaptureAvailable$delegate).invoke(new AnonymousClass1(this.$renderedFirstFrame, this.$layout));
        final C1BO<G0U<Function0<Bitmap>, Unit>> c1bo = this.$currentOnFrameCaptureAvailable$delegate;
        final C1BO<G0U<View, Unit>> c1bo2 = this.$currentOnSamplingViewChanged$delegate;
        return new C78g() { // from class: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$19$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                C1BO.A0B(c1bo).invoke(null);
                C8j4.A1J(c1bo2, null);
            }
        };
    }
}
