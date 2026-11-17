package com.facebook.aura.conversation.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C28s;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$messageEntryAnimation$1$1", f = "HatchMessageEntryAnimations.kt", l = {66}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageEntryAnimationsKt$messageEntryAnimation$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $growUserFromEnd;
    public final /* synthetic */ boolean $playUserScaleIn;
    public final /* synthetic */ AT5<Float, AOW> $userScale;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageEntryAnimationsKt$messageEntryAnimation$1$1(boolean z, AT5<Float, AOW> at5, boolean z2, HtJ<? super HatchMessageEntryAnimationsKt$messageEntryAnimation$1$1> htJ) {
        super(2, htJ);
        this.$playUserScaleIn = z;
        this.$userScale = at5;
        this.$growUserFromEnd = z2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageEntryAnimationsKt$messageEntryAnimation$1$1(this.$playUserScaleIn, this.$userScale, this.$growUserFromEnd, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i;
        C28s c28s;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i2 = this.label;
        if (i2 == 0) {
            Hwg.A00(obj);
            if (this.$playUserScaleIn) {
                AT5<Float, AOW> at5 = this.$userScale;
                Float fA0m = AnonymousClass001.A0m();
                if (this.$growUserFromEnd) {
                    i = 200;
                    c28s = C2HU.A03;
                } else {
                    i = 220;
                    c28s = C2HU.A01;
                }
                ASj aSjA0J = AnonymousClass002.A0J(c28s, i);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, aSjA0J, fA0m, this, null) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchMessageEntryAnimationsKt$messageEntryAnimation$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
