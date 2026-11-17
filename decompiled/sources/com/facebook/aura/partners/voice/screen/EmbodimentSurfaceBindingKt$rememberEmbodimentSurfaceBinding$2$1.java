package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $attachedGeneration$delegate;
    public final /* synthetic */ MutableState<Surface> $attachedSurface$delegate;
    public final /* synthetic */ MutableState<Boolean> $lifecycleStarted$delegate;
    public final /* synthetic */ MutableState<Boolean> $rendererAttached$delegate;
    public final /* synthetic */ Object $resourceOwner;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$2$1(MutableState<Boolean> mutableState, VoiceCallViewModel voiceCallViewModel, VoiceCallStateHolder voiceCallStateHolder, Object obj, MutableState<Surface> mutableState2, MutableState<Boolean> mutableState3, MutableState<Integer> mutableState4) {
        super(0);
        this.$lifecycleStarted$delegate = mutableState;
        this.$viewModel = voiceCallViewModel;
        this.$stateHolder = voiceCallStateHolder;
        this.$resourceOwner = obj;
        this.$attachedSurface$delegate = mutableState2;
        this.$rendererAttached$delegate = mutableState3;
        this.$attachedGeneration$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$lifecycleStarted$delegate);
        EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$detachRendererIfNeeded(this.$viewModel, this.$stateHolder, this.$resourceOwner, this.$attachedSurface$delegate, this.$rendererAttached$delegate, this.$attachedGeneration$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
