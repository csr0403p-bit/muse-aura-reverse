package com.facebook.aura.components.reactions;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.components.reactions.AuraReactionAnimationKt$rememberAuraReactionEffects$2$1", f = "AuraReactionAnimation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraReactionAnimationKt$rememberAuraReactionEffects$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $burstEmoji$delegate;
    public final /* synthetic */ String $emoji;
    public final /* synthetic */ MutableState<Boolean> $isFirstEmoji$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraReactionAnimationKt$rememberAuraReactionEffects$2$1(String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, HtJ<? super AuraReactionAnimationKt$rememberAuraReactionEffects$2$1> htJ) {
        super(2, htJ);
        this.$emoji = str;
        this.$isFirstEmoji$delegate = mutableState;
        this.$burstEmoji$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraReactionAnimationKt$rememberAuraReactionEffects$2$1(this.$emoji, this.$isFirstEmoji$delegate, this.$burstEmoji$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$burstEmoji$delegate.Af8(MutableState.A0A((MutableState) this.$isFirstEmoji$delegate) ? null : this.$emoji);
        MutableState.A09(false, this.$isFirstEmoji$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraReactionAnimationKt$rememberAuraReactionEffects$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
