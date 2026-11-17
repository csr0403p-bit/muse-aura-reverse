package com.facebook.aura.auth;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.AuraSessionManager$redeemRefreshToken$refreshToken$1", f = "AuraSessionManager.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AuraSessionManager$redeemRefreshToken$refreshToken$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public int label;

    public AuraSessionManager$redeemRefreshToken$refreshToken$1(HtJ<? super AuraSessionManager$redeemRefreshToken$refreshToken$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraSessionManager$redeemRefreshToken$refreshToken$1(htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return new AuraSessionManager$redeemRefreshToken$refreshToken$1(htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AuraMetaFRLSecureTokenStore.INSTANCE.getRefreshToken();
    }
}
