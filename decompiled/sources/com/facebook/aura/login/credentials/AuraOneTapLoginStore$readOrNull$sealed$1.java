package com.facebook.aura.login.credentials;

import X.AbstractC7559F3s;
import X.C4oT;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraOneTapLoginStore$readOrNull$sealed$1 extends AbstractC7559F3s implements Function0<String> {
    public final /* synthetic */ C4oT $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraOneTapLoginStore$readOrNull$sealed$1(C4oT c4oT) {
        super(0);
        this.$store = c4oT;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        if (this.$store.getInt("version", 0) != 1) {
            return null;
        }
        String string = this.$store.getString(AuraOneTapLoginStoreKt.KEY_LOGINS, null);
        return string == null ? "" : string;
    }
}
