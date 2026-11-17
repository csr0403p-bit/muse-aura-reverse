package com.facebook.aura.browsertask.view;

import X.AKO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C06787bB;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G0V;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class AgentComputerSystemBarsEffectKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC06807bD DarkAgentComputerSystemBarsEffect$lambda$0$0(android.view.View r6, final X.C06787bB r7) {
        /*
            r0 = 1
            r2 = r7
            X.C7384Etj.A0Y(r7, r0)
            android.content.Context r1 = r6.getContext()
            boolean r0 = r1 instanceof android.app.Activity
            r5 = 0
            if (r0 == 0) goto L4f
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 == 0) goto L4f
            android.view.Window r6 = r1.getWindow()
            if (r6 == 0) goto L50
            android.view.View r0 = r6.getDecorView()
            X.Avc r7 = new X.Avc
            r7.<init>(r0, r6)
            int r0 = r6.getStatusBarColor()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            X.AKh r1 = r7.A00
            boolean r0 = r1.A04()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A03()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L3b:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r6.setStatusBarColor(r0)
            r0 = 0
            if (r7 == 0) goto L49
            r7.A01(r0)
            r7.A00(r0)
        L49:
            com.facebook.aura.browsertask.view.AgentComputerSystemBarsEffectKt$DarkAgentComputerSystemBarsEffect$lambda$0$0$$inlined$onPauseOrDispose$1 r1 = new com.facebook.aura.browsertask.view.AgentComputerSystemBarsEffectKt$DarkAgentComputerSystemBarsEffect$lambda$0$0$$inlined$onPauseOrDispose$1
            r1.<init>()
            return r1
        L4f:
            r6 = r5
        L50:
            r7 = r5
            r3 = r5
            r4 = r5
            if (r6 == 0) goto L49
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerSystemBarsEffectKt.DarkAgentComputerSystemBarsEffect$lambda$0$0(android.view.View, X.7bB):X.7bD");
    }

    public static final void DarkAgentComputerSystemBarsEffect(BFM bfm, final int i) {
        bfm.AgG(-339277442);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            BBI bbi = (BBI) bfm;
            final View view = (View) AKO.A07(AndroidCompositionLocals_androidKt.A05, bbi);
            boolean zA67 = bfm.A67(view);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.browsertask.view.AgentComputerSystemBarsEffectKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return AgentComputerSystemBarsEffectKt.DarkAgentComputerSystemBarsEffect$lambda$0$0(view, (C06787bB) obj);
                    }
                };
                BBI.A0O(bbi, objAaT);
            }
            C7bA.A05(bfm, null, view, (G0U) objAaT, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerSystemBarsEffectKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    int i2 = i;
                    AnonymousClass001.A0F(obj2);
                    AgentComputerSystemBarsEffectKt.DarkAgentComputerSystemBarsEffect((BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit DarkAgentComputerSystemBarsEffect$lambda$1(int i, BFM bfm, int i2) {
        DarkAgentComputerSystemBarsEffect(bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }
}
