package com.facebook.aura.identity.provider;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.identity.provider.HatchIdentityProvider$fetchChatThemesIfNeeded$fetchJob$1$2", f = "HatchIdentityProvider.kt", l = {273}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchIdentityProvider$fetchChatThemesIfNeeded$fetchJob$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ HatchIdentityProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdentityProvider$fetchChatThemesIfNeeded$fetchJob$1$2(HatchIdentityProvider hatchIdentityProvider, HtJ<? super HatchIdentityProvider$fetchChatThemesIfNeeded$fetchJob$1$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchIdentityProvider;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdentityProvider$fetchChatThemesIfNeeded$fetchJob$1$2(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchIdentityProvider hatchIdentityProvider = this.this$0;
            this.label = 1;
            if (hatchIdentityProvider.fetchChatThemesInternal(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchIdentityProvider$fetchChatThemesIfNeeded$fetchJob$1$2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
