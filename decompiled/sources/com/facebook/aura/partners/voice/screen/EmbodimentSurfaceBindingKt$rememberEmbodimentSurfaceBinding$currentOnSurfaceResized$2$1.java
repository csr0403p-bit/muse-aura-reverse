package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BL4;
import X.C7384Etj;
import X.G0W;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$currentOnSurfaceResized$2$1 extends AbstractC7559F3s implements G0W<Surface, Integer, Integer, Unit> {
    public final /* synthetic */ MutableState<Surface> $attachedSurface$delegate;
    public final /* synthetic */ MutableState<BL4> $attachedSurfaceSize$delegate;
    public final /* synthetic */ MutableState<Boolean> $rendererAttached$delegate;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    public final void invoke(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        if (this.$attachedSurface$delegate.getValue() == surface) {
            EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$lambda$10(this.$attachedSurfaceSize$delegate, AnonymousClass007.A0C(i, i2));
            if (MutableState.A0A((MutableState) this.$rendererAttached$delegate)) {
                this.$viewModel.resizeEmbodimentSurface(surface, i, i2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$currentOnSurfaceResized$2$1(VoiceCallViewModel voiceCallViewModel, MutableState<Surface> mutableState, MutableState<BL4> mutableState2, MutableState<Boolean> mutableState3) {
        super(3);
        this.$viewModel = voiceCallViewModel;
        this.$attachedSurface$delegate = mutableState;
        this.$attachedSurfaceSize$delegate = mutableState2;
        this.$rendererAttached$delegate = mutableState3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Surface surface, Integer num, Integer num2) {
        invoke(surface, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
