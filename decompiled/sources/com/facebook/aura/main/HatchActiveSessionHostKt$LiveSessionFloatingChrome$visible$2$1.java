package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchActiveSessionHostKt$LiveSessionFloatingChrome$visible$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchActiveSessionHostKt$LiveSessionFloatingChrome$visible$2$1(NavBackStack<AuraNavKey> navBackStack) {
        super(0);
        this.$backStack = navBackStack;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[EDGE_INSN: B:18:0x0017->B:8:0x0017 BREAK  A[LOOP:0: B:12:0x0021->B:19:?]] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r1 = r2.$backStack
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L1d
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1d
        Lc:
            androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r0 = r2.$backStack
            java.lang.Object r0 = X.AbstractC0878AGe.A0I(r0)
            boolean r1 = r0 instanceof com.facebook.aura.navigation.AuraBottomSheetNavKey
            r0 = 1
            if (r1 == 0) goto L18
        L17:
            r0 = 0
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1d:
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof com.facebook.aura.navigation.AuraOverlayNavKey
            if (r0 == 0) goto L21
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchActiveSessionHostKt$LiveSessionFloatingChrome$visible$2$1.invoke():java.lang.Boolean");
    }
}
