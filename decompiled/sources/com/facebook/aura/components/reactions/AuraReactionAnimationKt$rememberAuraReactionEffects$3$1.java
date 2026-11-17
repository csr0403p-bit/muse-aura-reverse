package com.facebook.aura.components.reactions;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.components.reactions.AuraReactionAnimationKt$rememberAuraReactionEffects$3$1", f = "AuraReactionAnimation.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AuraReactionAnimationKt$rememberAuraReactionEffects$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $active$delegate;
    public final /* synthetic */ AuraReactionAnimation $animation;
    public final /* synthetic */ MutableState<String> $burstEmoji$delegate;
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraReactionAnimationKt$rememberAuraReactionEffects$3$1(Context context, AuraReactionAnimation auraReactionAnimation, MutableState<String> mutableState, MutableState<Boolean> mutableState2, HtJ<? super AuraReactionAnimationKt$rememberAuraReactionEffects$3$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$animation = auraReactionAnimation;
        this.$burstEmoji$delegate = mutableState;
        this.$active$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraReactionAnimationKt$rememberAuraReactionEffects$3$1(this.$context, this.$animation, this.$burstEmoji$delegate, this.$active$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        MutableState.A09(AnonymousClass002.A1X(this.$burstEmoji$delegate.getValue()), this.$active$delegate);
        AuraReactionHapticsKt.playAuraReactionHaptic(this.$context, this.$animation);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraReactionAnimationKt$rememberAuraReactionEffects$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
