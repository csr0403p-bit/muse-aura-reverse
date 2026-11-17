package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class VoiceAvatarTakeoverKt$rememberHasWindowFocus$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $hasFocus$delegate;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$rememberHasWindowFocus$1$1(View view, MutableState<Boolean> mutableState) {
        super(1);
        this.$view = view;
        this.$hasFocus$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final MutableState<Boolean> mutableState = this.$hasFocus$delegate;
        final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberHasWindowFocus$1$1$listener$1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                MutableState<Boolean> mutableState2 = mutableState;
                float f = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
                MutableState.A09(z, mutableState2);
            }
        };
        this.$view.getViewTreeObserver().addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        MutableState<Boolean> mutableState2 = this.$hasFocus$delegate;
        boolean zHasWindowFocus = this.$view.hasWindowFocus();
        float f = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
        MutableState.A09(zHasWindowFocus, mutableState2);
        final View view = this.$view;
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceAvatarTakeoverKt$rememberHasWindowFocus$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                view.getViewTreeObserver().removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
        };
    }
}
