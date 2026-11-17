package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Boolean> $close;
    public final /* synthetic */ boolean $offersMoreAccounts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$1$1(boolean z, Function0<Boolean> function0) {
        super(1);
        this.$offersMoreAccounts = z;
        this.$close = function0;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$offersMoreAccounts) {
            this.$close.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.login.nativeflow.NativeLoginRoutesKt$NativeLoginMoreAccountsSheetRoute$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
