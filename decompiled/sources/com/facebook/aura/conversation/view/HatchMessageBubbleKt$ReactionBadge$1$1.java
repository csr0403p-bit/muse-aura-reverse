package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageBubbleKt$ReactionBadge$1$1", f = "HatchMessageBubble.kt", l = {519, 519}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageBubbleKt$ReactionBadge$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $badgeScale;
    public final /* synthetic */ boolean $badgeVisible;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleKt$ReactionBadge$1$1(boolean z, AT5<Float, AOW> at5, HtJ<? super HatchMessageBubbleKt$ReactionBadge$1$1> htJ) {
        super(2, htJ);
        this.$badgeVisible = z;
        this.$badgeScale = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageBubbleKt$ReactionBadge$1$1(this.$badgeVisible, this.$badgeScale, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA04;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            boolean z = this.$badgeVisible;
            AT5<Float, AOW> at5 = this.$badgeScale;
            if (z) {
                Float fA0m = AnonymousClass001.A0m();
                C1003AOr<Float> c1003AOr = HatchMessageBubbleKt.ReactionBadgePopSpec;
                this.label = 1;
                objA04 = AnonymousClass002.A0i(at5, c1003AOr, fA0m, this, null);
            } else {
                Float fA0l = AnonymousClass001.A0l();
                this.label = 2;
                objA04 = at5.A04(fA0l, this);
            }
            if (objA04 == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageBubbleKt$ReactionBadge$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
