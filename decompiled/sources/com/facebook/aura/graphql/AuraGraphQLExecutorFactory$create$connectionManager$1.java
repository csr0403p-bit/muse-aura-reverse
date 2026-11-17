package com.facebook.aura.graphql;

import X.AbstractC7559F3s;
import com.facebook.pando.ConnectionManager;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLExecutorFactory$create$connectionManager$1 extends AbstractC7559F3s implements Function0<ConnectionManager> {
    public static final AuraGraphQLExecutorFactory$create$connectionManager$1 INSTANCE = new AuraGraphQLExecutorFactory$create$connectionManager$1();

    public AuraGraphQLExecutorFactory$create$connectionManager$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ConnectionManager invoke() {
        return new ConnectionManager();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ConnectionManager invoke() {
        return new ConnectionManager();
    }
}
