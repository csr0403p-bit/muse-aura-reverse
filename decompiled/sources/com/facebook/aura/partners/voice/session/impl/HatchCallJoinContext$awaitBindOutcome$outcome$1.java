package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10560Hsz;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$outcome$1", f = "HatchCallJoinContext.kt", l = {240}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HatchCallJoinContext$awaitBindOutcome$outcome$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCallJoinContext.BindOutcome>, Object> {
    public final /* synthetic */ HatchCallJoinContext.PendingBind $bind;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCallJoinContext$awaitBindOutcome$outcome$1(HatchCallJoinContext.PendingBind pendingBind, HtJ<? super HatchCallJoinContext$awaitBindOutcome$outcome$1> htJ) {
        super(2, htJ);
        this.$bind = pendingBind;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCallJoinContext$awaitBindOutcome$outcome$1(this.$bind, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchCallJoinContext.BindOutcome> htJ) {
        return new HatchCallJoinContext$awaitBindOutcome$outcome$1(this.$bind, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            InterfaceC10560Hsz<HatchCallJoinContext.BindOutcome> interfaceC10560Hsz = this.$bind.outcome;
            this.label = 1;
            obj = C3cG.A0W(interfaceC10560Hsz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }
}
