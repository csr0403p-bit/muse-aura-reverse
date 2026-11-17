package com.facebook.aura.user.repo;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.user.provider.AuraUserData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.user.repo.AuraUserRepository$fetchUser$result$1", f = "AuraUserRepository.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class AuraUserRepository$fetchUser$result$1 extends AbstractC07127nr implements G0U<HtJ<? super AuraUserData>, Object> {
    public final /* synthetic */ boolean $isBlockingFetch;
    public int label;
    public final /* synthetic */ AuraUserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserRepository$fetchUser$result$1(AuraUserRepository auraUserRepository, boolean z, HtJ<? super AuraUserRepository$fetchUser$result$1> htJ) {
        super(1, htJ);
        this.this$0 = auraUserRepository;
        this.$isBlockingFetch = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AuraUserRepository$fetchUser$result$1(this.this$0, this.$isBlockingFetch, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraUserRepository auraUserRepository = this.this$0;
            boolean z = this.$isBlockingFetch;
            this.label = 1;
            obj = auraUserRepository.fetchUserOnce(z, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super AuraUserData> htJ) {
        return ((AuraUserRepository$fetchUser$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
