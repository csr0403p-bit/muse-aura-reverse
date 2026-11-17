package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$pending$$inlined$stefi-BWLJW6A$default$2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class PairsInviteMailbox$pending$$inlined$stefiBWLJW6A$default$2 extends AbstractC7559F3s implements Function0<C9hr<PeerInvitePendingResponseJson>> {
    public static final PairsInviteMailbox$pending$$inlined$stefiBWLJW6A$default$2 INSTANCE = new PairsInviteMailbox$pending$$inlined$stefiBWLJW6A$default$2();

    public PairsInviteMailbox$pending$$inlined$stefiBWLJW6A$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<PeerInvitePendingResponseJson> invoke() {
        int i = PeerInvitePendingResponseJson.$stable;
        return PeerInvitePendingResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<PeerInvitePendingResponseJson> invoke() {
        int i = PeerInvitePendingResponseJson.$stable;
        return PeerInvitePendingResponseJson$$serializer.INSTANCE;
    }
}
