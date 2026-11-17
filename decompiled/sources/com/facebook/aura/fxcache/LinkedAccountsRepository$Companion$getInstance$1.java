package com.facebook.aura.fxcache;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LinkedAccountsRepository$Companion$getInstance$1 extends AbstractC7559F3s implements Function0<LinkedAccountsRepository> {
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedAccountsRepository$Companion$getInstance$1(AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$userSession = abstractC3358CGz;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinkedAccountsRepository invoke() {
        return new LinkedAccountsRepository(this.$userSession);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LinkedAccountsRepository invoke() {
        return new LinkedAccountsRepository(this.$userSession);
    }
}
