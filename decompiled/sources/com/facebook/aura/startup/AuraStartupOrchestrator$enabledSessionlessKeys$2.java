package com.facebook.aura.startup;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C3cG;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator$enabledSessionlessKeys$2 extends AbstractC7559F3s implements Function0<int[]> {
    public static final AuraStartupOrchestrator$enabledSessionlessKeys$2 INSTANCE = new AuraStartupOrchestrator$enabledSessionlessKeys$2();

    public AuraStartupOrchestrator$enabledSessionlessKeys$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final int[] invoke() {
        int[] iArrA0r = AnonymousClass801.A0r();
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            int i2 = iArrA0r[i];
            if (AuraStartupOrchestrator.INSTANCE.isJobEnabled(AnonymousClass801.A0A(i2))) {
                arrayListA0h.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < 11);
        return AbstractC0878AGe.A0n(arrayListA0h);
    }
}
