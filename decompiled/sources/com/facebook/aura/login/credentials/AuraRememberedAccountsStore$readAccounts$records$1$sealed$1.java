package com.facebook.aura.login.credentials;

import X.AbstractC7559F3s;
import X.C4oT;
import X.FGI;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraRememberedAccountsStore$readAccounts$records$1$sealed$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ RecordSlot $slot;
    public final /* synthetic */ C4oT $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRememberedAccountsStore$readAccounts$records$1$sealed$1(C4oT c4oT, RecordSlot recordSlot) {
        super(0);
        this.$store = c4oT;
        this.$slot = recordSlot;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return C4oT.A00(this.$store, FGI.A0M(AuraRememberedAccountsStoreKt.KEY_RECORD_PREFIX, this.$slot.slot));
    }
}
