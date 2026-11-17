package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1", f = "NativeLoginViewModel.kt", l = {5952}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends String>>, Object> {
    public final /* synthetic */ String $rawUrl;
    public final /* synthetic */ String $resumeToken;
    public int label;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1(NativeLoginViewModel nativeLoginViewModel, String str, String str2, HtJ<? super NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1> htJ) {
        super(2, htJ);
        this.this$0 = nativeLoginViewModel;
        this.$rawUrl = str;
        this.$resumeToken = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1(this.this$0, this.$rawUrl, this.$resumeToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<String>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1276decryptAccessToken0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            NativeLoginCheckpointContinuation nativeLoginCheckpointContinuation = this.this$0.checkpointContinuation;
            String str = this.$rawUrl;
            String str2 = this.$resumeToken;
            this.label = 1;
            objM1276decryptAccessToken0E7RQCE = nativeLoginCheckpointContinuation.m1276decryptAccessToken0E7RQCE(str, str2, this);
            if (objM1276decryptAccessToken0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1276decryptAccessToken0E7RQCE = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1276decryptAccessToken0E7RQCE);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<String>> htJ) {
        return ((NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
