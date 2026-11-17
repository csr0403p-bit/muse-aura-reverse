package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C0Yr;
import X.C1BO;
import X.C3Em;
import X.C3cG;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$ForegroundOnlyToast$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<T, Boolean>> $currentStillRelevant$delegate;
    public final /* synthetic */ boolean $foreground;
    public final /* synthetic */ MutableState<T> $pendingUntilForeground$delegate;
    public final /* synthetic */ C3Em<Unit> $toasts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceGlobalEffectsKt$ForegroundOnlyToast$2$1(boolean z, C3Em<Unit> c3Em, MutableState<T> mutableState, C1BO<? extends G0U<? super T, Boolean>> c1bo) {
        super(1);
        this.$foreground = z;
        this.$toasts = c3Em;
        this.$pendingUntilForeground$delegate = mutableState;
        this.$currentStillRelevant$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Object value = this.$pendingUntilForeground$delegate.getValue();
        if (this.$foreground && value != null) {
            this.$pendingUntilForeground$delegate.Af8(null);
            if (AnonymousClass003.A1X(value, C1BO.A0B(this.$currentStillRelevant$delegate))) {
                C3cG.A1I(this.$toasts);
            }
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.VoiceGlobalEffectsKt$ForegroundOnlyToast$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
