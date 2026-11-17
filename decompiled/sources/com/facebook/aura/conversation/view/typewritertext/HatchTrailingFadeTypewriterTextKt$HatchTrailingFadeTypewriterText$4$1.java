package com.facebook.aura.conversation.view.typewritertext;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C0Yr;
import X.C2HU;
import X.C3UX;
import X.C7384Etj;
import X.C78g;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<HoC> $animationJob;
    public final /* synthetic */ AT5<Float, AOW> $charAlphaAnimation;
    public final /* synthetic */ int $fadeInDuration;
    public final /* synthetic */ String $fullText;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ boolean $shouldAnimate;
    public final /* synthetic */ long $typingSpeed;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1$1", f = "HatchTrailingFadeTypewriterText.kt", l = {131, 135}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AT5<Float, AOW> $charAlphaAnimation;
        public final /* synthetic */ int $fadeInDuration;
        public final /* synthetic */ int $newLength;
        public final /* synthetic */ long $typingSpeed;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AT5<Float, AOW> at5, int i, long j, int i2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$charAlphaAnimation = at5;
            this.$newLength = i;
            this.$typingSpeed = j;
            this.$fadeInDuration = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$charAlphaAnimation, this.$newLength, this.$typingSpeed, this.$fadeInDuration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = this.$charAlphaAnimation;
                Float f = new Float(this.$newLength - 20.0f);
                this.label = 1;
                if (at5.A04(f, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            int iA00 = (int) (((this.$newLength - ((int) MutableState.A00(this.$charAlphaAnimation))) * this.$typingSpeed) + this.$fadeInDuration);
            AT5<Float, AOW> at52 = this.$charAlphaAnimation;
            Float f2 = new Float(this.$newLength);
            ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, iA00);
            this.I$0 = iA00;
            this.label = 2;
            if (AnonymousClass002.A0i(at52, aSjA0J, f2, this, null) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1$2", f = "HatchTrailingFadeTypewriterText.kt", l = {142}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $animationDuration;
        public final /* synthetic */ AT5<Float, AOW> $charAlphaAnimation;
        public final /* synthetic */ int $newLength;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AT5<Float, AOW> at5, int i, int i2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$charAlphaAnimation = at5;
            this.$newLength = i;
            this.$animationDuration = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$charAlphaAnimation, this.$newLength, this.$animationDuration, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AT5<Float, AOW> at5 = this.$charAlphaAnimation;
                Float f = new Float(this.$newLength);
                ASj aSjA0J = AnonymousClass002.A0J(C2HU.A02, this.$animationDuration);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, aSjA0J, f, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
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
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C7384Etj.A0Y(c0Yr, 0);
        if (this.$shouldAnimate) {
            int iA00 = (int) MutableState.A00(this.$charAlphaAnimation);
            int length = this.$fullText.length();
            int i = length - iA00;
            if (length > iA00) {
                HtJ htJA13 = AnonymousClass006.A13(this.$animationJob.getValue());
                long j = this.$typingSpeed;
                int i2 = this.$fadeInDuration;
                int i3 = (int) ((i * j) + i2);
                MutableState<HoC> mutableState = this.$animationJob;
                C3UX c3ux = this.$scope;
                AT5<Float, AOW> at5 = this.$charAlphaAnimation;
                mutableState.Af8(AnonymousClass001.A11(i > 100 ? new AnonymousClass1(at5, length, j, i2, htJA13) : new AnonymousClass2(at5, length, i3, htJA13), c3ux));
            }
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTrailingFadeTypewriterTextKt$HatchTrailingFadeTypewriterText$4$1(boolean z, AT5<Float, AOW> at5, String str, MutableState<HoC> mutableState, long j, int i, C3UX c3ux) {
        super(1);
        this.$shouldAnimate = z;
        this.$charAlphaAnimation = at5;
        this.$fullText = str;
        this.$animationJob = mutableState;
        this.$typingSpeed = j;
        this.$fadeInDuration = i;
        this.$scope = c3ux;
    }
}
