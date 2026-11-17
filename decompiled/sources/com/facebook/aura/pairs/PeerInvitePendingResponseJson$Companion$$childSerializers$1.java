package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PeerInvitePendingResponseJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends PeerInvitePendingItemJson>>> {
    public static final PeerInvitePendingResponseJson$Companion$$childSerializers$1 INSTANCE = new PeerInvitePendingResponseJson$Companion$$childSerializers$1();

    public PeerInvitePendingResponseJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends PeerInvitePendingItemJson>> invoke() {
        return C3cG.A19(PeerInvitePendingItemJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends PeerInvitePendingItemJson>> invoke() {
        return C3cG.A19(PeerInvitePendingItemJson$$serializer.INSTANCE);
    }
}
