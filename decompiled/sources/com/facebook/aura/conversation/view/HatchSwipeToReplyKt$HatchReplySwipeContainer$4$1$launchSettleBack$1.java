package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C00q;
import X.C1003AOr;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1", f = "HatchSwipeToReply.kt", l = {193}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00q $translationPx;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Float, Float, Unit> {
        public final /* synthetic */ C00q $translationPx;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C00q c00q) {
            super(2);
            this.$translationPx = c00q;
        }

        public final void invoke(float f, float f2) {
            this.$translationPx.AdS(f);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(Float f, Float f2) {
            float fA02 = AnonymousClass001.A02(f);
            f2.floatValue();
            this.$translationPx.AdS(fA02);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1(C00q c00q, HtJ<? super HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1> htJ) {
        super(2, htJ);
        this.$translationPx = c00q;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1(this.$translationPx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            float fAFn = this.$translationPx.AFn();
            C1003AOr c1003AOrA0Q = AnonymousClass003.A0Q(null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$translationPx);
            this.label = 1;
            if (SuspendAnimationKt.A03(c1003AOrA0Q, this, anonymousClass1, fAFn, 0.0f, 0.0f) == enumC10460Hji) {
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
        return new HatchSwipeToReplyKt$HatchReplySwipeContainer$4$1$launchSettleBack$1(this.$translationPx, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
