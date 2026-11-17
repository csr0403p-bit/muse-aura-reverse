package com.facebook.aura.graphql;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.CPS;
import X.G0U;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class AuraGraphQLQueryExecutor$executeAndSubscribe$1$1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ CPS $callback;
    public final /* synthetic */ AuraSessionManager.SessionSnapshot $sessionSnapshot;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        C7384Etj.A0Y(th, 0);
        this.$callback.invoke(AuraGraphQLQueryExecutor.Companion.ensureException(th, this.$sessionSnapshot));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraGraphQLQueryExecutor$executeAndSubscribe$1$1(CPS cps, AuraSessionManager.SessionSnapshot sessionSnapshot) {
        super(1);
        this.$callback = cps;
        this.$sessionSnapshot = sessionSnapshot;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
