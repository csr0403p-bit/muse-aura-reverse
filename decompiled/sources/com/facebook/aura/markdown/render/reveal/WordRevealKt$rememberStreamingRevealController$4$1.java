package com.facebook.aura.markdown.render.reveal;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1", f = "WordReveal.kt", l = {186, 189, 191}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class WordRevealKt$rememberStreamingRevealController$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $completionReported$delegate;
    public final /* synthetic */ WordRevealController $controller;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnRevealCompleted$delegate;
    public final /* synthetic */ MutableState<Boolean> $revealing$delegate;
    public final /* synthetic */ C1BO<Boolean> $shouldAnimateState;
    public final /* synthetic */ C1BO<Boolean> $streamingState;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$2", f = "WordReveal.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$4", f = "WordReveal.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Boolean>, Object> {
        public /* synthetic */ int I$0;
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(htJ);
            anonymousClass4.I$0 = AnonymousClass001.A0F(obj);
            return anonymousClass4;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass002.A1N(i));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A0F(num), htJ);
        }

        public final Object invoke(int i, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass4) create(Integer.valueOf(i), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WordRevealKt$rememberStreamingRevealController$4$1(WordRevealController wordRevealController, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState, C1BO<Boolean> c1bo2, C1BO<? extends Function0<Unit>> c1bo3, MutableState<Boolean> mutableState2, HtJ<? super WordRevealKt$rememberStreamingRevealController$4$1> htJ) {
        super(2, htJ);
        this.$controller = wordRevealController;
        this.$streamingState = c1bo;
        this.$revealing$delegate = mutableState;
        this.$shouldAnimateState = c1bo2;
        this.$currentOnRevealCompleted$delegate = c1bo3;
        this.$completionReported$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new WordRevealKt$rememberStreamingRevealController$4$1(this.$controller, this.$streamingState, this.$revealing$delegate, this.$shouldAnimateState, this.$currentOnRevealCompleted$delegate, this.$completionReported$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 0
            r3 = 3
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L1d
            if (r0 == r6) goto L41
            if (r0 == r4) goto L19
            if (r0 != r3) goto L14
            X.Hwg.A00(r8)     // Catch: java.lang.Throwable -> L7f
            goto L6f
        L14:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L19:
            X.Hwg.A00(r8)
            goto L62
        L1d:
            X.Hwg.A00(r8)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$revealing$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 != 0) goto L49
            X.1BO<java.lang.Boolean> r1 = r7.$shouldAnimateState
            com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$$ExternalSyntheticLambda0 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$$ExternalSyntheticLambda0
            r0.<init>()
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$2 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$2
            r0.<init>(r5)
            r7.label = r6
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r2) goto L44
            return r2
        L41:
            X.Hwg.A00(r8)
        L44:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$revealing$delegate
            androidx.compose.runtime.MutableState.A09(r6, r0)
        L49:
            com.facebook.aura.markdown.render.reveal.WordRevealController r1 = r7.$controller
            com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$$ExternalSyntheticLambda1 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$$ExternalSyntheticLambda1
            r0.<init>()
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$4 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1$4
            r0.<init>(r5)
            r7.label = r4
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r2) goto L62
            return r2
        L62:
            com.facebook.aura.markdown.render.reveal.WordRevealController r1 = r7.$controller     // Catch: java.lang.Throwable -> L7f
            X.1BO<java.lang.Boolean> r0 = r7.$streamingState     // Catch: java.lang.Throwable -> L7f
            r7.label = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r1.run(r0, r7)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r2) goto L6f
            return r2
        L6f:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$revealing$delegate
            r0 = 0
            androidx.compose.runtime.MutableState.A09(r0, r1)
            X.1BO<kotlin.jvm.functions.Function0<kotlin.Unit>> r1 = r7.$currentOnRevealCompleted$delegate
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$completionReported$delegate
            com.facebook.aura.markdown.render.reveal.WordRevealKt.rememberStreamingRevealController$reportRevealCompleted(r1, r0)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L7f:
            r2 = move-exception
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$revealing$delegate
            r0 = 0
            androidx.compose.runtime.MutableState.A09(r0, r1)
            X.1BO<kotlin.jvm.functions.Function0<kotlin.Unit>> r1 = r7.$currentOnRevealCompleted$delegate
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$completionReported$delegate
            com.facebook.aura.markdown.render.reveal.WordRevealKt.rememberStreamingRevealController$reportRevealCompleted(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.reveal.WordRevealKt$rememberStreamingRevealController$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((WordRevealKt$rememberStreamingRevealController$4$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
