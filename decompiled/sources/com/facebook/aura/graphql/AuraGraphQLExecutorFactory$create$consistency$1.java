package com.facebook.aura.graphql;

import X.AbstractC7559F3s;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLExecutorFactory$create$consistency$1 extends AbstractC7559F3s implements Function0<PandoGraphQLConsistencyJNI> {
    public static final AuraGraphQLExecutorFactory$create$consistency$1 INSTANCE = new AuraGraphQLExecutorFactory$create$consistency$1();

    public AuraGraphQLExecutorFactory$create$consistency$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PandoGraphQLConsistencyJNI invoke() {
        PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = PandoGraphQLConsistencyJNI.$redex_init_class;
        return new PandoGraphQLConsistencyJNI(AuraGraphQLExecutorFactory.INSTANCE.createConsistencyService(), null, null, 0, null, 30, null);
    }
}
