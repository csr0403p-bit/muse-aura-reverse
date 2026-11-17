package com.facebook.aura.network.acs;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IssueAcsTokenResponseJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends AcsProofJson>>> {
    public static final IssueAcsTokenResponseJson$Companion$$childSerializers$2 INSTANCE = new IssueAcsTokenResponseJson$Companion$$childSerializers$2();

    public IssueAcsTokenResponseJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends AcsProofJson>> invoke() {
        return C3cG.A19(AcsProofJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends AcsProofJson>> invoke() {
        return C3cG.A19(AcsProofJson$$serializer.INSTANCE);
    }
}
