package com.facebook.aura.graphql;

import X.AbstractC7559F3s;
import com.facebook.aura.network.AuraUserAgent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLService$cachedExecutor$1$pandoExecutor$1 extends AbstractC7559F3s implements Function0<String> {
    public static final AuraGraphQLService$cachedExecutor$1$pandoExecutor$1 INSTANCE = new AuraGraphQLService$cachedExecutor$1$pandoExecutor$1();

    public AuraGraphQLService$cachedExecutor$1$pandoExecutor$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return AuraUserAgent.fullUserAgent.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ String invoke() {
        return AuraUserAgent.fullUserAgent.getValue();
    }
}
