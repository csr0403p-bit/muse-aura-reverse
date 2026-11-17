package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1003AOr;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1", f = "HatchMessageLongPressMenuHost.kt", l = {908, 909}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $entryDelayMillis;
    public final /* synthetic */ AT5<Float, AOW> $entryScale;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1(int i, AT5<Float, AOW> at5, HtJ<? super HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1> htJ) {
        super(2, htJ);
        this.$entryDelayMillis = i;
        this.$entryScale = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1(this.$entryDelayMillis, this.$entryScale, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$entryDelayMillis;
            this.label = 1;
            if (C7Bq.A01(j, this) == enumC10460Hji) {
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
        AT5<Float, AOW> at5 = this.$entryScale;
        Float fA0m = AnonymousClass001.A0m();
        C1003AOr<Float> c1003AOr = HatchMessageLongPressMenuHostKt.ReactionEntrySpring;
        this.label = 2;
        if (AnonymousClass002.A0i(at5, c1003AOr, fA0m, this, null) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageLongPressMenuHostKt$InlineReactionButtonSurface$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
