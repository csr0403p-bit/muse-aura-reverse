package com.facebook.aura.appmodules;

import X.AbstractC7559F3s;
import X.C3302CDa;
import X.C4JM;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraAppModules$manager$2 extends AbstractC7559F3s implements Function0 {
    public static final AuraAppModules$manager$2 INSTANCE = new AuraAppModules$manager$2();

    public AuraAppModules$manager$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C3302CDa invoke() {
        return AuraAppModules.INSTANCE.createManager(C4JM.A00());
    }
}
