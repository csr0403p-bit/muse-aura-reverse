package androidx.compose.animation.core;

import X.AOP;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {496}, m = "invokeSuspend", v = 1)
/* loaded from: classes4.dex */
public final class SeekableTransitionState$seekTo$3 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ float $fraction;
    public final /* synthetic */ S $oldTargetState;
    public final /* synthetic */ S $targetState;
    public final /* synthetic */ AOP<S> $transition;
    public int label;
    public final /* synthetic */ SeekableTransitionState<S> this$0;

    @DebugMetadata(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {518}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ float $fraction;
        public final /* synthetic */ S $oldTargetState;
        public final /* synthetic */ S $targetState;
        public final /* synthetic */ AOP<S> $transition;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ SeekableTransitionState<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (TS;TS;Landroidx/compose/animation/core/SeekableTransitionState<TS;>;LX/AOP<TS;>;FLX/HtJ<-Landroidx/compose/animation/core/SeekableTransitionState$seekTo$3$1;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SeekableTransitionState seekableTransitionState, AOP aop, Object obj, Object obj2, HtJ htJ, float f) {
            super(2, htJ);
            this.$targetState = obj;
            this.$oldTargetState = obj2;
            this.this$0 = seekableTransitionState;
            this.$transition = aop;
            this.$fraction = f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$transition, this.$targetState, this.$oldTargetState, htJ, this.$fraction);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        
            if (X.C7384Etj.areEqual(r1.A09(), r6.$targetState) != false) goto L7;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L14
                if (r0 != r4) goto L87
                X.Hwg.A00(r7)
            Lc:
                androidx.compose.animation.core.SeekableTransitionState<S> r0 = r6.this$0
                androidx.compose.animation.core.SeekableTransitionState.A07(r0)
            L11:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L14:
                X.Hwg.A00(r7)
                java.lang.Object r5 = r6.L$0
                X.3UX r5 = (X.C3UX) r5
                S r1 = r6.$targetState
                S r0 = r6.$oldTargetState
                boolean r2 = X.C7384Etj.areEqual(r1, r0)
                androidx.compose.animation.core.SeekableTransitionState<S> r1 = r6.this$0
                r0 = 0
                if (r2 != 0) goto L78
                androidx.compose.animation.core.SeekableTransitionState.A06(r1)
            L2b:
                S r1 = r6.$targetState
                S r0 = r6.$oldTargetState
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 != 0) goto L53
                X.AOP<S> r1 = r6.$transition
                S r0 = r6.$targetState
                r1.A0C(r0)
                X.AOP<S> r2 = r6.$transition
                r0 = 0
                r2.A09(r0)
                androidx.compose.animation.core.SeekableTransitionState<S> r0 = r6.this$0
                S r1 = r6.$targetState
                androidx.compose.runtime.MutableState r0 = r0.A0C
                r0.Af8(r1)
                X.AOP<S> r1 = r6.$transition
                float r0 = r6.$fraction
                r1.A07(r0)
            L53:
                androidx.compose.animation.core.SeekableTransitionState<S> r0 = r6.this$0
                float r1 = r6.$fraction
                X.00q r0 = r0.A0A
                r0.AdS(r1)
                androidx.compose.animation.core.SeekableTransitionState<S> r2 = r6.this$0
                X.AHo<X.AOV> r0 = r2.A08
                int r0 = r0.A00
                if (r0 == 0) goto L73
                r0 = 0
                X.BU2.A0P(r2, r5, r0)
            L68:
                androidx.compose.animation.core.SeekableTransitionState<S> r0 = r6.this$0
                r6.label = r4
                java.lang.Object r0 = androidx.compose.animation.core.SeekableTransitionState.A03(r0, r6)
                if (r0 != r3) goto Lc
                return r3
            L73:
                r0 = -9223372036854775808
                r2.A01 = r0
                goto L68
            L78:
                r1.A03 = r0
                java.lang.Object r1 = r1.A09()
                S r0 = r6.$targetState
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2b
                goto L11
            L87:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState$seekTo$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TS;TS;Landroidx/compose/animation/core/SeekableTransitionState<TS;>;LX/AOP<TS;>;FLX/HtJ<-Landroidx/compose/animation/core/SeekableTransitionState$seekTo$3;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public SeekableTransitionState$seekTo$3(SeekableTransitionState seekableTransitionState, AOP aop, Object obj, Object obj2, HtJ htJ, float f) {
        super(1, htJ);
        this.$targetState = obj;
        this.$oldTargetState = obj2;
        this.this$0 = seekableTransitionState;
        this.$transition = aop;
        this.$fraction = f;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new SeekableTransitionState$seekTo$3(this.this$0, this.$transition, this.$targetState, this.$oldTargetState, htJ, this.$fraction);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(HtJ<? super Unit> htJ) {
        return ((SeekableTransitionState$seekTo$3) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$transition, this.$targetState, this.$oldTargetState, null, this.$fraction);
            this.label = 1;
            if (Hxb.A00(anonymousClass1, this) == enumC10460Hji) {
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
}
