package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.BL4;
import X.C3cH;
import android.view.Surface;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Integer> $attachedGeneration$delegate;
    public final /* synthetic */ MutableState<Surface> $attachedSurface$delegate;
    public final /* synthetic */ MutableState<BL4> $attachedSurfaceSize$delegate;
    public final /* synthetic */ boolean $isCompactHost;
    public final /* synthetic */ boolean $isHostVisible;
    public final /* synthetic */ MutableState<Boolean> $lifecycleStarted$delegate;
    public final /* synthetic */ MutableState<Boolean> $rendererAttached$delegate;
    public final /* synthetic */ Object $resourceOwner;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;
    public final /* synthetic */ VoiceCallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentSurfaceBindingKt$rememberEmbodimentSurfaceBinding$1$1(boolean z, VoiceCallStateHolder voiceCallStateHolder, boolean z2, MutableState<Boolean> mutableState, VoiceCallViewModel voiceCallViewModel, Object obj, MutableState<Surface> mutableState2, MutableState<BL4> mutableState3, MutableState<Boolean> mutableState4, MutableState<Integer> mutableState5) {
        super(0);
        this.$isHostVisible = z;
        this.$stateHolder = voiceCallStateHolder;
        this.$isCompactHost = z2;
        this.$lifecycleStarted$delegate = mutableState;
        this.$viewModel = voiceCallViewModel;
        this.$resourceOwner = obj;
        this.$attachedSurface$delegate = mutableState2;
        this.$attachedSurfaceSize$delegate = mutableState3;
        this.$rendererAttached$delegate = mutableState4;
        this.$attachedGeneration$delegate = mutableState5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(true, this.$lifecycleStarted$delegate);
        if (this.$isHostVisible && C3cH.A1R(this.$stateHolder.isCompactPresentationActive) == this.$isCompactHost && C3cH.A1R(this.$stateHolder.isEmbodimentDisplayEnabled) && !C3cH.A1R(HatchSystemPipRuntime.isPipStashed)) {
            EmbodimentSurfaceBindingKt.rememberEmbodimentSurfaceBinding$attachRendererIfNeeded(this.$viewModel, this.$stateHolder, this.$resourceOwner, this.$attachedSurface$delegate, this.$attachedSurfaceSize$delegate, this.$rendererAttached$delegate, this.$attachedGeneration$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
