package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$result$1", f = "NativeLoginViewModel.kt", l = {5981}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$exchangeCheckpointAccessToken$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
    public final /* synthetic */ String $frlAccessToken;
    public final /* synthetic */ int $generation;
    public int label;
    public final /* synthetic */ NativeLoginViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$result$1$1", f = "NativeLoginViewModel.kt", l = {5981}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$exchangeCheckpointAccessToken$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends HatchAuthCredentials>>, Object> {
        public final /* synthetic */ String $frlAccessToken;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$frlAccessToken = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$frlAccessToken, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
            return invoke2(str, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1267ssoExchangetZkwj4A;
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
                HatchSsoSourceApp hatchSsoSourceApp = HatchSsoSourceApp.META;
                String str2 = this.$frlAccessToken;
                this.L$0 = null;
                this.label = 1;
                objM1267ssoExchangetZkwj4A = hatchAuthApi.m1267ssoExchangetZkwj4A(str, hatchSsoSourceApp, str2, null, null, null, null, false, this);
                if (objM1267ssoExchangetZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1267ssoExchangetZkwj4A = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM1267ssoExchangetZkwj4A);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
            return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$exchangeCheckpointAccessToken$result$1(NativeLoginViewModel nativeLoginViewModel, int i, String str, HtJ<? super NativeLoginViewModel$exchangeCheckpointAccessToken$result$1> htJ) {
        super(2, htJ);
        this.this$0 = nativeLoginViewModel;
        this.$generation = i;
        this.$frlAccessToken = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginViewModel$exchangeCheckpointAccessToken$result$1(this.this$0, this.$generation, this.$frlAccessToken, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends HatchAuthCredentials>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<HatchAuthCredentials>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!AnonymousClass002.A1Q(this.this$0.checkpointGeneration, this.$generation)) {
                return null;
            }
            NativeLoginViewModel nativeLoginViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$frlAccessToken, null);
            this.label = 1;
            obj = C3cH.A0Y(nativeLoginViewModel, this, anonymousClass1);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj == null ? C3cG.A0t(C3cG.A0s(new CheckpointTempTokenUnavailableException())) : obj;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<HatchAuthCredentials>> htJ) {
        return ((NativeLoginViewModel$exchangeCheckpointAccessToken$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
