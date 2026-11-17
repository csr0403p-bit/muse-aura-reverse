package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.ResolvedNoisePrivateAuth;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class ResolvedNoisePrivateAuth$Authenticate$consume$1<T> extends AbstractC7559F3s implements G0U<byte[], T> {
    public final /* synthetic */ G0U<HatchNoisePrivateAuth, T> $block;
    public final /* synthetic */ ResolvedNoisePrivateAuth.Authenticate this$0;

    @Override // X.G0U
    public final T invoke(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        G0U<HatchNoisePrivateAuth, T> g0u = this.$block;
        ResolvedNoisePrivateAuth.Authenticate authenticate = this.this$0;
        return g0u.invoke(new HatchNoisePrivateAuth.Authenticate(authenticate.notaryEndorsement, bArr, authenticate.chipBindingPolicy));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ResolvedNoisePrivateAuth$Authenticate$consume$1(G0U<? super HatchNoisePrivateAuth, ? extends T> g0u, ResolvedNoisePrivateAuth.Authenticate authenticate) {
        super(1);
        this.$block = g0u;
        this.this$0 = authenticate;
    }
}
