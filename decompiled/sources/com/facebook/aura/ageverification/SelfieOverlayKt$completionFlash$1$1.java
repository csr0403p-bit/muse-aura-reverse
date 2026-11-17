package com.facebook.aura.ageverification;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.ageverification.SelfieOverlayKt$completionFlash$1$1", f = "SelfieOverlay.kt", l = {73, 74}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SelfieOverlayKt$completionFlash$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $flash;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayKt$completionFlash$1$1(AT5<Float, AOW> at5, HtJ<? super SelfieOverlayKt$completionFlash$1$1> htJ) {
        super(2, htJ);
        this.$flash = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SelfieOverlayKt$completionFlash$1$1(this.$flash, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.label = 1;
            if (C7Bq.A01(400L, this) == enumC10460Hji) {
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
        AT5<Float, AOW> at5 = this.$flash;
        Float fA0l = AnonymousClass001.A0l();
        ASj aSjA0K = AnonymousClass001.A0K(200, 0);
        this.label = 2;
        if (AnonymousClass002.A0i(at5, aSjA0K, fA0l, this, null) == enumC10460Hji) {
            return enumC10460Hji;
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new SelfieOverlayKt$completionFlash$1$1(this.$flash, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
