package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C10543Hqv;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class NativeLoginOneTap$removeAccount$savedAccountId$1$1 extends AbstractC7559F3s implements G0U<AuraRememberedAccount, Unit> {
    public final /* synthetic */ C10543Hqv<AuraRememberedAccount> $removed;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraRememberedAccount auraRememberedAccount) {
        C7384Etj.A0Y(auraRememberedAccount, 0);
        this.$removed.element = auraRememberedAccount;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginOneTap$removeAccount$savedAccountId$1$1(C10543Hqv<AuraRememberedAccount> c10543Hqv) {
        super(1);
        this.$removed = c10543Hqv;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraRememberedAccount auraRememberedAccount) {
        invoke2(auraRememberedAccount);
        return Unit.INSTANCE;
    }
}
