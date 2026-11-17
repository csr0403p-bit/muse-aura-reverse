package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.BL4;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Integer> $attachedGeneration$delegate;
    public final /* synthetic */ MutableState<Surface> $attachedSurface$delegate;
    public final /* synthetic */ MutableState<BL4> $attachedSurfaceSize$delegate;
    public final /* synthetic */ boolean $playbackEnabled;
    public final /* synthetic */ MutableState<Boolean> $rendererAttached$delegate;
    public final /* synthetic */ Object $resourceOwner;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$3$1(boolean z, VoiceCallViewModel voiceCallViewModel, VoiceCallStateHolder voiceCallStateHolder, Object obj, MutableState<Surface> mutableState, MutableState<BL4> mutableState2, MutableState<Boolean> mutableState3, MutableState<Integer> mutableState4) {
        super(1);
        this.$playbackEnabled = z;
        this.$viewModel = voiceCallViewModel;
        this.$stateHolder = voiceCallStateHolder;
        this.$resourceOwner = obj;
        this.$attachedSurface$delegate = mutableState;
        this.$attachedSurfaceSize$delegate = mutableState2;
        this.$rendererAttached$delegate = mutableState3;
        this.$attachedGeneration$delegate = mutableState4;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        boolean z = this.$playbackEnabled;
        VoiceCallViewModel voiceCallViewModel = this.$viewModel;
        VoiceCallStateHolder voiceCallStateHolder = this.$stateHolder;
        Object obj = this.$resourceOwner;
        MutableState<Surface> mutableState = this.$attachedSurface$delegate;
        if (z) {
            EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$attachRendererIfNeeded(voiceCallViewModel, voiceCallStateHolder, obj, mutableState, this.$attachedSurfaceSize$delegate, this.$rendererAttached$delegate, this.$attachedGeneration$delegate);
        } else {
            EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$detachRendererIfNeeded(voiceCallViewModel, voiceCallStateHolder, obj, mutableState, this.$rendererAttached$delegate, this.$attachedGeneration$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
