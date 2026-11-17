package com.facebook.aura.accountcenter;

import X.AbstractC7559F3s;
import X.C7BY;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraAccountsCenterActivity$externalDomains$2 extends AbstractC7559F3s implements Function0<List<? extends String>> {
    public static final AuraAccountsCenterActivity$externalDomains$2 INSTANCE = new AuraAccountsCenterActivity$externalDomains$2();

    public AuraAccountsCenterActivity$externalDomains$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends String> invoke() {
        return C7BY.A0e(AuraAccountsCenterActivityKt.getExternalDomainsRaw(), ",");
    }
}
