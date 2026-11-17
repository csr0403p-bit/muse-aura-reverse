package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$onCheckpointWebCallback$job$1$1", f = "NativeLoginViewModel.kt", l = {5951, 5964}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$onCheckpointWebCallback$job$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ int $generation;
    public final /* synthetic */ String $rawUrl;
    public final /* synthetic */ String $resumeToken;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ NativeLoginViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$onCheckpointWebCallback$job$1$1(NativeLoginViewModel nativeLoginViewModel, int i, String str, String str2, HtJ<? super NativeLoginViewModel$onCheckpointWebCallback$job$1$1> htJ) {
        super(2, htJ);
        this.this$0 = nativeLoginViewModel;
        this.$generation = i;
        this.$rawUrl = str;
        this.$resumeToken = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginViewModel$onCheckpointWebCallback$job$1$1(this.this$0, this.$generation, this.$rawUrl, this.$resumeToken, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        boolean zA1Q;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1 nativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1 = new NativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1(this.this$0, this.$rawUrl, this.$resumeToken, null);
            this.label = 1;
            obj = GAo.A00(this, c78tA0s, nativeLoginViewModel$onCheckpointWebCallback$job$1$1$decrypted$1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
        }
        Object obj2 = ((HsJ) obj).value;
        NativeLoginViewModel nativeLoginViewModel = this.this$0;
        if (AnonymousClass002.A1Q(nativeLoginViewModel.checkpointGeneration, this.$generation)) {
            NativeLoginViewModel nativeLoginViewModel2 = this.this$0;
            int i2 = this.$generation;
            if (HsJ.A00(obj2) == null) {
                String str = (String) obj2;
                synchronized (nativeLoginViewModel2.checkpointLock) {
                    zA1Q = AnonymousClass002.A1Q(nativeLoginViewModel2.checkpointGeneration, i2);
                }
                if (zA1Q) {
                    NativeLoginViewModel nativeLoginViewModel3 = this.this$0;
                    int i3 = this.$generation;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (nativeLoginViewModel3.exchangeCheckpointAccessToken(str, i3, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else {
                nativeLoginViewModel2.presentCheckpointLocalFailure(i2);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NativeLoginViewModel$onCheckpointWebCallback$job$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
