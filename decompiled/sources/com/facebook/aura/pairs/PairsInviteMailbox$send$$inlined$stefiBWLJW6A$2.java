package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$send$$inlined$stefi-BWLJW6A$2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class PairsInviteMailbox$send$$inlined$stefiBWLJW6A$2 extends AbstractC7559F3s implements Function0<C9hr<PeerInviteSendResponseJson>> {
    public static final PairsInviteMailbox$send$$inlined$stefiBWLJW6A$2 INSTANCE = new PairsInviteMailbox$send$$inlined$stefiBWLJW6A$2();

    public PairsInviteMailbox$send$$inlined$stefiBWLJW6A$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<PeerInviteSendResponseJson> invoke() {
        return PeerInviteSendResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<PeerInviteSendResponseJson> invoke() {
        return PeerInviteSendResponseJson$$serializer.INSTANCE;
    }
}
