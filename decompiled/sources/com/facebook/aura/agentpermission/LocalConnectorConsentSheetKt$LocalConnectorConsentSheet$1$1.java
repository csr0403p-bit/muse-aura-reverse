package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Unit> $ownedAccept;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1(Function0<Unit> function0) {
        super(1);
        this.$ownedAccept = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1$invoke$$inlined$onDispose$1(this.$ownedAccept);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new LocalConnectorConsentSheetKt$LocalConnectorConsentSheet$1$1$invoke$$inlined$onDispose$1(this.$ownedAccept);
    }
}
