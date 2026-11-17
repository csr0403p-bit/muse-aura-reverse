package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchAgentPermissionsRepository$sendServerDecisions$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class HatchAgentPermissionsRepository$sendServerDecisions$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<DecideApprovalsRequestJson>> {
    public static final HatchAgentPermissionsRepository$sendServerDecisions$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchAgentPermissionsRepository$sendServerDecisions$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchAgentPermissionsRepository$sendServerDecisions$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<DecideApprovalsRequestJson> invoke() {
        int i = DecideApprovalsRequestJson.$stable;
        return DecideApprovalsRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<DecideApprovalsRequestJson> invoke() {
        int i = DecideApprovalsRequestJson.$stable;
        return DecideApprovalsRequestJson$$serializer.INSTANCE;
    }
}
