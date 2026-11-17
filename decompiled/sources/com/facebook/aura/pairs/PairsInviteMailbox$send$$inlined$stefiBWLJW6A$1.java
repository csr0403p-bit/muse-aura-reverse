package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$send$$inlined$stefi-BWLJW6A$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class PairsInviteMailbox$send$$inlined$stefiBWLJW6A$1 extends AbstractC7559F3s implements Function0<C9hr<PeerInviteSendRequestJson>> {
    public static final PairsInviteMailbox$send$$inlined$stefiBWLJW6A$1 INSTANCE = new PairsInviteMailbox$send$$inlined$stefiBWLJW6A$1();

    public PairsInviteMailbox$send$$inlined$stefiBWLJW6A$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<PeerInviteSendRequestJson> invoke() {
        return PeerInviteSendRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<PeerInviteSendRequestJson> invoke() {
        return PeerInviteSendRequestJson$$serializer.INSTANCE;
    }
}
