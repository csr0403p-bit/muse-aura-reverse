package com.facebook.aura.conversation.view;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1", f = "HatchMessageEntryAnimations.kt", l = {142}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $play;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1(boolean z, AT5<Float, AOW> at5, HtJ<? super HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1> htJ) {
        super(2, htJ);
        this.$play = z;
        this.$progress = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1(this.$play, this.$progress, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$play) {
                AT5<Float, AOW> at5 = this.$progress;
                Float fA0m = AnonymousClass001.A0m();
                ASj aSjA0J = AnonymousClass002.A0J(C2HU.A01, 280);
                this.label = 1;
                if (AnonymousClass002.A0i(at5, aSjA0J, fA0m, this, null) == enumC10460Hji) {
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
        return ((HatchMessageEntryAnimationsKt$presentationEntryAnimation$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
