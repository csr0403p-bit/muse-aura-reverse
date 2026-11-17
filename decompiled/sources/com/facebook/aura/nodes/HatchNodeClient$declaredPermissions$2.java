package com.facebook.aura.nodes;

import X.AbstractC7559F3s;
import X.BFI;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchNodeClient$declaredPermissions$2 extends AbstractC7559F3s implements Function0<Set<? extends String>> {
    public final /* synthetic */ HatchNodeClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$declaredPermissions$2(HatchNodeClient hatchNodeClient) {
        super(0);
        this.this$0 = hatchNodeClient;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends String> invoke() {
        String[] strArr = this.this$0.context.getPackageManager().getPackageInfo(this.this$0.context.getPackageName(), 4096).requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        return BFI.A0H(strArr);
    }
}
