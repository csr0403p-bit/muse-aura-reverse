package com.facebook.aura.startup.userdata;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.repo.AuraUserRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.userdata.AuraUserDataStartupJob$fetchIfNeeded$fetchedUserData$1", f = "AuraUserDataStartupJob.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class AuraUserDataStartupJob$fetchIfNeeded$fetchedUserData$1 extends AbstractC07127nr implements G0U<HtJ<? super AuraUserData>, Object> {
    public final /* synthetic */ boolean $isBlocking;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraUserDataStartupJob$fetchIfNeeded$fetchedUserData$1(AbstractC3358CGz abstractC3358CGz, boolean z, HtJ<? super AuraUserDataStartupJob$fetchIfNeeded$fetchedUserData$1> htJ) {
        super(1, htJ);
        this.$userSession = abstractC3358CGz;
        this.$isBlocking = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new AuraUserDataStartupJob$fetchIfNeeded$fetchedUserData$1(this.$userSession, this.$isBlocking, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraUserRepository companion = AuraUserRepository.Companion.getInstance(this.$userSession);
            boolean z = this.$isBlocking;
            this.label = 1;
            obj = companion.fetchUser(z, this);
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
        return ((AuraUserDataStartupJob$fetchIfNeeded$fetchedUserData$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
