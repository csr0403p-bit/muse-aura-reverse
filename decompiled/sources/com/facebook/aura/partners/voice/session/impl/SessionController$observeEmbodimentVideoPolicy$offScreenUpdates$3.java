package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3", f = "SessionController.kt", l = {4989}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3(HtJ<? super SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3 sessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3 = new SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3(htJ);
        sessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3.L$0 = obj;
        return sessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Z c20z = (C20Z) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Boolean boolA0h = AnonymousClass001.A0h();
            this.L$0 = null;
            this.label = 1;
            if (c20z.emit(boolA0h, this) == enumC10460Hji) {
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
    public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
        SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3 sessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3 = new SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3(htJ);
        sessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3.L$0 = c20z;
        return sessionController$observeEmbodimentVideoPolicy$offScreenUpdates$3.invokeSuspend(Unit.INSTANCE);
    }
}
