package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsRepository$createInvite$$inlined$write$default$1 extends AbstractC7559F3s implements Function0<C9hr<PeerInviteCreateRequestJson>> {
    public static final PairsRepository$createInvite$$inlined$write$default$1 INSTANCE = new PairsRepository$createInvite$$inlined$write$default$1();

    public PairsRepository$createInvite$$inlined$write$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<PeerInviteCreateRequestJson> invoke() {
        return PeerInviteCreateRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<PeerInviteCreateRequestJson> invoke() {
        return PeerInviteCreateRequestJson$$serializer.INSTANCE;
    }
}
