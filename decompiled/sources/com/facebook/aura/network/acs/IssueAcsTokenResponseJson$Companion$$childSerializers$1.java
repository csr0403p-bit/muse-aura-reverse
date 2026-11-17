package com.facebook.aura.network.acs;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class IssueAcsTokenResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends AcsEvaluationJson>>> {
    public static final IssueAcsTokenResponseJson$Companion$$childSerializers$1 INSTANCE = new IssueAcsTokenResponseJson$Companion$$childSerializers$1();

    public IssueAcsTokenResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends AcsEvaluationJson>> invoke() {
        return C3cG.A19(AcsEvaluationJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends AcsEvaluationJson>> invoke() {
        return C3cG.A19(AcsEvaluationJson$$serializer.INSTANCE);
    }
}
