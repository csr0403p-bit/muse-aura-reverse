package com.facebook.aura.browsertask.view;

import X.AbstractC1742Apf;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C78N;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AgentComputerBackHandlerKt {
    public static final void AgentComputerBackHandler(final Function0<Unit> function0, final Function0<Unit> function02, BFM bfm, final int i) {
        boolean zA1a = AnonymousClass002.A1a(function0, function02);
        bfm.AgG(992338412);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            final boolean zA01 = AbstractC1742Apf.A01(bfm);
            boolean zA1C = AnonymousClass003.A1C(iA0T) | AnonymousClass003.A1B(iA0T) | bfm.A66(zA01);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.browsertask.view.AgentComputerBackHandlerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AgentComputerBackHandlerKt.AgentComputerBackHandler$lambda$0$0(zA01, function0, function02);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            B81.A00(zA1a, (Function0) objAaT, bfm, 6, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerBackHandlerKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function03 = function0;
                    Function0 function04 = function02;
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    AgentComputerBackHandlerKt.AgentComputerBackHandler(function03, function04, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit AgentComputerBackHandler$lambda$0$0(boolean z, Function0 function0, Function0 function02) {
        if (z) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerBackHandler$lambda$1(Function0 function0, Function0 function02, int i, BFM bfm, int i2) {
        AgentComputerBackHandler(function0, function02, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
