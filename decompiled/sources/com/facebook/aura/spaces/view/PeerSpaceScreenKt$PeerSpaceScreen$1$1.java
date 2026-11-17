package com.facebook.aura.spaces.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;

/* loaded from: classes.dex */
public final class PeerSpaceScreenKt$PeerSpaceScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ PeerSpaceScreenKey $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PeerSpaceScreenKt$PeerSpaceScreen$1$1(PeerSpaceScreenKey peerSpaceScreenKey) {
        super(1);
        this.$key = peerSpaceScreenKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new PeerSpaceScreenKt$PeerSpaceScreen$1$1$invoke$$inlined$onDispose$1(this.$key);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new PeerSpaceScreenKt$PeerSpaceScreen$1$1$invoke$$inlined$onDispose$1(this.$key);
    }
}
