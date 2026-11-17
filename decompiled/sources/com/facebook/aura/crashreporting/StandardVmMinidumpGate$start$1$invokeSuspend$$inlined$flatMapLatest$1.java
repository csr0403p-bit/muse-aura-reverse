package com.facebook.aura.crashreporting;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Y;
import X.C20Z;
import X.C3pU;
import X.C3rb;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.crashreporting.StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1", f = "StandardVmMinidumpGate.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1 extends AbstractC07127nr implements G0W<C20Z<? super HxE<? extends Boolean, ? extends Boolean>>, ConfidentialSessionGate, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public Object L$2;
    public int label;

    public StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1(HtJ htJ) {
        super(3, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C20Q c20qA03;
        C20Z c20z = (C20Z) this.L$0;
        Object obj2 = this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConfidentialSessionGate confidentialSessionGate = (ConfidentialSessionGate) obj2;
            if (confidentialSessionGate == null) {
                Boolean boolA0h = AnonymousClass001.A0h();
                c20qA03 = new C20Y(new HxE(boolA0h, boolA0h));
            } else {
                c20qA03 = C3rb.A03(StandardVmMinidumpGate$start$1$2$1.INSTANCE, confidentialSessionGate.isStandardVmFlow, confidentialSessionGate.isConfidentialVmFlow);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (C3pU.A01(this, c20qA03, c20z) == enumC10460Hji) {
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

    @Override // X.G0W
    public final Object invoke(C20Z<? super HxE<? extends Boolean, ? extends Boolean>> c20z, ConfidentialSessionGate confidentialSessionGate, HtJ<? super Unit> htJ) {
        StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1 standardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1 = new StandardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1(htJ);
        standardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = c20z;
        standardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = confidentialSessionGate;
        return standardVmMinidumpGate$start$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
