package com.facebook.aura.vds.font.api;

import X.AbstractC7559F3s;
import X.C60Q;
import X.DFI;
import X.F60;
import com.facebook.aura.R;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraAppTypeface$optimisticAi$2 extends AbstractC7559F3s implements Function0<Integer> {
    public static final AuraAppTypeface$optimisticAi$2 INSTANCE = new AuraAppTypeface$optimisticAi$2();

    public AuraAppTypeface$optimisticAi$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Iterator<E> it = new DFI(new int[0], 1).iterator();
        if (!it.hasNext()) {
            return Integer.valueOf(R.font.optimistic_ai_vf);
        }
        AuraAppTypefaceOverrideStatic.optimisticAiFontRes(C60Q.A03(it));
        throw F60.createAndThrow();
    }
}
