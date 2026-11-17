package com.facebook.aura.identity.provider;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$downloadAndCacheAvatar$3$1$1", f = "HatchIdentityProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchIdentityProvider$downloadAndCacheAvatar$3$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ byte[] $bytes;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdentityProvider$downloadAndCacheAvatar$3$1$1(byte[] bArr, HtJ<? super HatchIdentityProvider$downloadAndCacheAvatar$3$1$1> htJ) {
        super(2, htJ);
        this.$bytes = bArr;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdentityProvider$downloadAndCacheAvatar$3$1$1(this.$bytes, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Boolean.valueOf(HatchIdentityProviderKt.isDecodableImage(this.$bytes));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchIdentityProvider$downloadAndCacheAvatar$3$1$1(this.$bytes, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
