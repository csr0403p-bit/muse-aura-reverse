package com.facebook.aura.tabs;

import X.AOP;
import X.AbstractC7559F3s;
import X.EnumC04711Bv;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTabPageKt$AuraTabPage$leavingTab$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AuraTabRootNavKey $tabRoot;
    public final /* synthetic */ AOP<EnumC04711Bv> $transition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTabPageKt$AuraTabPage$leavingTab$1$1(AOP<EnumC04711Bv> aop, AuraNavigator auraNavigator, AuraTabRootNavKey auraTabRootNavKey) {
        super(0);
        this.$transition = aop;
        this.$navigator = auraNavigator;
        this.$tabRoot = auraTabRootNavKey;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            X.AOP<X.1Bv> r0 = r2.$transition
            androidx.compose.runtime.MutableState r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.1Bv r0 = X.EnumC04711Bv.A02
            if (r1 != r0) goto L25
            com.facebook.aura.navigation.AuraNavigator r0 = r2.$navigator
            com.facebook.aura.navigation.AuraTabRootNavKey r1 = r0.currentTabRoot()
            com.facebook.aura.navigation.AuraTabRootNavKey r0 = r2.$tabRoot
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L25
            com.facebook.aura.navigation.AuraNavigator r1 = r2.$navigator
            com.facebook.aura.navigation.AuraTabRootNavKey r0 = r2.$tabRoot
            boolean r1 = r1.isInBackStack(r0)
            r0 = 1
            if (r1 != 0) goto L26
        L25:
            r0 = 0
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraTabPageKt$AuraTabPage$leavingTab$1$1.invoke():java.lang.Boolean");
    }
}
