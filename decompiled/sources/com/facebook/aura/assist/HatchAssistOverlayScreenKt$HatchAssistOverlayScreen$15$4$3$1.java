package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$3$1", f = "HatchAssistOverlayScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Integer> $hitlHeightPx$delegate;
    public final /* synthetic */ int $pendingHitlCount;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$3$1(int i, MutableState<Integer> mutableState, HtJ<? super HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$3$1> htJ) {
        super(2, htJ);
        this.$pendingHitlCount = i;
        this.$hitlHeightPx$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$3$1(this.$pendingHitlCount, this.$hitlHeightPx$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$pendingHitlCount == 0) {
            MutableState.A07(0, this.$hitlHeightPx$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$15$4$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
