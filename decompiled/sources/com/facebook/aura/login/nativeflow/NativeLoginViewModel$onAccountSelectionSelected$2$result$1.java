package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onAccountSelectionSelected$2$result$1", f = "NativeLoginViewModel.kt", l = {4281}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onAccountSelectionSelected$2$result$1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $ref;
    public final /* synthetic */ String $state;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onAccountSelectionSelected$2$result$1(String str, String str2, HtJ<? super NativeLoginViewModel$onAccountSelectionSelected$2$result$1> htJ) {
        super(2, htJ);
        this.$state = str;
        this.$ref = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$onAccountSelectionSelected$2$result$1 nativeLoginViewModel$onAccountSelectionSelected$2$result$1 = new NativeLoginViewModel$onAccountSelectionSelected$2$result$1(this.$state, this.$ref, htJ);
        nativeLoginViewModel$onAccountSelectionSelected$2$result$1.L$0 = obj;
        return nativeLoginViewModel$onAccountSelectionSelected$2$result$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1263selectAccountBWLJW6A;
        String str = (String) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
            String str2 = this.$state;
            String str3 = this.$ref;
            this.L$0 = null;
            this.label = 1;
            objM1263selectAccountBWLJW6A = hatchAuthApi.m1263selectAccountBWLJW6A(str, str2, str3, this);
            if (objM1263selectAccountBWLJW6A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1263selectAccountBWLJW6A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1263selectAccountBWLJW6A);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((NativeLoginViewModel$onAccountSelectionSelected$2$result$1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
