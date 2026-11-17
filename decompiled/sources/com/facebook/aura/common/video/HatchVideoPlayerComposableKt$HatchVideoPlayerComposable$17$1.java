package com.facebook.aura.common.video;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C05663ul;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.settings.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1", f = "HatchVideoPlayerComposable.kt", l = {MC.mwa_help_and_support.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $currentPlayWhenReady$delegate;
    public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;
    public int label;

    /* renamed from: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState) {
            super(0);
            this.$renderedFirstFrame = mutableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$renderedFirstFrame.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1(MutableState<Boolean> mutableState, HatchVideoPlayer hatchVideoPlayer, C1BO<Boolean> c1bo, HtJ<? super HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1> htJ) {
        super(2, htJ);
        this.$renderedFirstFrame = mutableState;
        this.$videoPlayer = hatchVideoPlayer;
        this.$currentPlayWhenReady$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1(this.$renderedFirstFrame, this.$videoPlayer, this.$currentPlayWhenReady$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C05663ul c05663ulA01 = C6v3.A01(new AnonymousClass1(this.$renderedFirstFrame));
            final HatchVideoPlayer hatchVideoPlayer = this.$videoPlayer;
            final C1BO<Boolean> c1bo = this.$currentPlayWhenReady$delegate;
            C20Z c20z = new C20Z() { // from class: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1.2
                public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                    if (z && !C1BO.A0F(c1bo)) {
                        hatchVideoPlayer.pause();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
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
        return ((HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$17$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
