package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BL4;
import X.C7384Etj;
import X.G0W;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$currentOnSurfaceAvailable$2$1 extends AbstractC7559F3s implements G0W<Surface, Integer, Integer, Unit> {
    public final /* synthetic */ MutableState<Integer> $attachedGeneration$delegate;
    public final /* synthetic */ MutableState<Surface> $attachedSurface$delegate;
    public final /* synthetic */ MutableState<BL4> $attachedSurfaceSize$delegate;
    public final /* synthetic */ boolean $playbackEnabled;
    public final /* synthetic */ MutableState<Boolean> $rendererAttached$delegate;
    public final /* synthetic */ Object $resourceOwner;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    public final void invoke(Surface surface, int i, int i2) {
        C7384Etj.A0Y(surface, 0);
        if (this.$attachedSurface$delegate.getValue() != surface) {
            EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$detachRendererIfNeeded(this.$viewModel, this.$stateHolder, this.$resourceOwner, this.$attachedSurface$delegate, this.$rendererAttached$delegate, this.$attachedGeneration$delegate);
        }
        this.$attachedSurface$delegate.Af8(surface);
        EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$lambda$10(this.$attachedSurfaceSize$delegate, (i2 & 4294967295L) | (i << 32));
        if (this.$playbackEnabled) {
            EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$attachRendererIfNeeded(this.$viewModel, this.$stateHolder, this.$resourceOwner, this.$attachedSurface$delegate, this.$attachedSurfaceSize$delegate, this.$rendererAttached$delegate, this.$attachedGeneration$delegate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$currentOnSurfaceAvailable$2$1(boolean z, MutableState<Surface> mutableState, VoiceCallViewModel voiceCallViewModel, VoiceCallStateHolder voiceCallStateHolder, Object obj, MutableState<Boolean> mutableState2, MutableState<Integer> mutableState3, MutableState<BL4> mutableState4) {
        super(3);
        this.$playbackEnabled = z;
        this.$attachedSurface$delegate = mutableState;
        this.$viewModel = voiceCallViewModel;
        this.$stateHolder = voiceCallStateHolder;
        this.$resourceOwner = obj;
        this.$rendererAttached$delegate = mutableState2;
        this.$attachedGeneration$delegate = mutableState3;
        this.$attachedSurfaceSize$delegate = mutableState4;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Surface surface, Integer num, Integer num2) {
        invoke(surface, AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
