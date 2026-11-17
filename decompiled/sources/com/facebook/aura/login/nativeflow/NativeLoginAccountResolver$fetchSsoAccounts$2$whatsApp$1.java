package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1", f = "NativeLoginAccountResolver.kt", l = {154}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NativeLoginSsoAccount>, Object> {
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1(Context context, HtJ<? super NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1(this.$context, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super NativeLoginSsoAccount> htJ) {
        return new NativeLoginAccountResolver$fetchSsoAccounts$2$whatsApp$1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            NativeLoginAccountResolver nativeLoginAccountResolver = NativeLoginAccountResolver.INSTANCE;
            Context context = this.$context;
            this.label = 1;
            obj = nativeLoginAccountResolver.fetchWhatsAppAccount(context, this);
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
}
