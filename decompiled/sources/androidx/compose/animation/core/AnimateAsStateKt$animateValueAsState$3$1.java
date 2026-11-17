package androidx.compose.animation.core;

import X.AOc;
import X.AT5;
import X.AbstractC07127nr;
import X.C1BO;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HzR;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {430}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AOc<T>> $animSpec$delegate;
    public final /* synthetic */ AT5<T, V> $animatable;
    public final /* synthetic */ HzR<T> $channel;
    public final /* synthetic */ C1BO<G0U<T, Unit>> $listener$delegate;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/HzR<TT;>;LX/AT5<TT;TV;>;LX/1BO<+LX/AOc<TT;>;>;LX/1BO<+LX/G0U<-TT;Lkotlin/Unit;>;>;LX/HtJ<-Landroidx/compose/animation/core/AnimateAsStateKt$animateValueAsState$3$1;>;)V */
    public AnimateAsStateKt$animateValueAsState$3$1(AT5 at5, C1BO c1bo, C1BO c1bo2, HtJ htJ, HzR hzR) {
        super(2, htJ);
        this.$channel = hzR;
        this.$animatable = at5;
        this.$animSpec$delegate = c1bo;
        this.$listener$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AnimateAsStateKt$animateValueAsState$3$1 animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(this.$animatable, this.$animSpec$delegate, this.$listener$delegate, htJ, this.$channel);
        animateAsStateKt$animateValueAsState$3$1.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3$1;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AnimateAsStateKt$animateValueAsState$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004b -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r3 = 1
            if (r0 == 0) goto L4e
            if (r0 != r3) goto L5f
            java.lang.Object r5 = r13.L$1
            X.GCW r5 = (X.GCW) r5
            java.lang.Object r1 = r13.L$0
            X.3UX r1 = (X.C3UX) r1
            X.Hwg.A00(r14)
        L14:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r0 = r14.booleanValue()
            if (r0 == 0) goto L5c
            java.lang.Object r2 = r5.A00()
            X.HzR<T> r0 = r13.$channel
            java.lang.Object r10 = r0.AhX()
            boolean r0 = r10 instanceof X.C2zT
            if (r0 != 0) goto L2c
            if (r10 != 0) goto L2d
        L2c:
            r10 = r2
        L2d:
            X.AT5<T, V> r7 = r13.$animatable
            X.1BO<X.AOc<T>> r8 = r13.$animSpec$delegate
            X.1BO<X.G0U<T, kotlin.Unit>> r9 = r13.$listener$delegate
            r11 = 0
            r12 = 0
            X.3bm r6 = new X.3bm
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.6ys r2 = X.C6ys.A00
            java.lang.Integer r0 = X.C79.A00
            X.GAo.A02(r0, r2, r6, r1)
        L41:
            r13.L$0 = r1
            r13.L$1 = r5
            r13.label = r3
            java.lang.Object r14 = r5.A01(r13)
            if (r14 != r4) goto L14
            return r4
        L4e:
            X.Hwg.A00(r14)
            java.lang.Object r1 = r13.L$0
            X.3UX r1 = (X.C3UX) r1
            X.HzR<T> r0 = r13.$channel
            X.GCW r5 = r0.APO()
            goto L41
        L5c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L5f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
