package com.facebook.aura.conversation.view.typewritertext;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$3$1", f = "HatchTrailingFadeTypewriterText.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $fullText;
    public final /* synthetic */ boolean $hasReachedEnd;
    public final /* synthetic */ Function0<Unit> $onAnimationCompleted;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$3$1(boolean z, String str, Function0<Unit> function0, HtJ<? super HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$3$1> htJ) {
        super(2, htJ);
        this.$hasReachedEnd = z;
        this.$fullText = str;
        this.$onAnimationCompleted = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$3$1(this.$hasReachedEnd, this.$fullText, this.$onAnimationCompleted, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$hasReachedEnd && this.$fullText.length() > 0 && (function0 = this.$onAnimationCompleted) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
