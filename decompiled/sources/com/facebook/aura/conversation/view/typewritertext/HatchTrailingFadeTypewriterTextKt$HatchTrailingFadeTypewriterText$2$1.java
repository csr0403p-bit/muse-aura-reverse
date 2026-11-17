package com.facebook.aura.conversation.view.typewritertext;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$2$1", f = "HatchTrailingFadeTypewriterText.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $charAlphaAnimation;
    public final /* synthetic */ String $fullText;
    public final /* synthetic */ boolean $shouldAnimate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$2$1(boolean z, AT5<Float, AOW> at5, String str, HtJ<? super HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$2$1> htJ) {
        super(2, htJ);
        this.$shouldAnimate = z;
        this.$charAlphaAnimation = at5;
        this.$fullText = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$2$1(this.$shouldAnimate, this.$charAlphaAnimation, this.$fullText, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$shouldAnimate) {
                AT5<Float, AOW> at5 = this.$charAlphaAnimation;
                Float f = new Float(this.$fullText.length());
                this.label = 1;
                if (at5.A04(f, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
