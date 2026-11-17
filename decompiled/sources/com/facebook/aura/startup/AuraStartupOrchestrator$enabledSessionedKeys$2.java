package com.facebook.aura.startup;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.startup.appjob.AppJobKey;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator$enabledSessionedKeys$2 extends AbstractC7559F3s implements Function0<int[]> {
    public static final AuraStartupOrchestrator$enabledSessionedKeys$2 INSTANCE = new AuraStartupOrchestrator$enabledSessionedKeys$2();

    public AuraStartupOrchestrator$enabledSessionedKeys$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final int[] invoke() {
        int[] iArrA0q = AnonymousClass801.A0q();
        ArrayList arrayListA0h = C3cG.A0h();
        int i = 0;
        do {
            int i2 = iArrA0q[i];
            AuraStartupOrchestrator auraStartupOrchestrator = AuraStartupOrchestrator.INSTANCE;
            AppJobKey appJobKeyA0B = AnonymousClass801.A0B(i2);
            C7384Etj.A0U(appJobKeyA0B);
            if (auraStartupOrchestrator.isJobEnabled(appJobKeyA0B)) {
                arrayListA0h.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < 48);
        return AbstractC0878AGe.A0n(arrayListA0h);
    }
}
