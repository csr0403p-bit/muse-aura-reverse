package com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.F6D;
import X.G0V;
import X.HoC;
import X.HsM;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialCarrier;
import com.facebook.aura.auth.postconsolidation.PostConsolidationCredentialRefreshResult;
import com.facebook.aura.ccv.relay.HatchCcvPresentationScope;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class BKBloksActionHatchRefreshPostConsolidationCredentialsImpl$evaluate$job$1 extends AbstractC7559F3s implements Function0<HoC> {
    public final /* synthetic */ HatchPostConsolidationCredentialCarrier $credentialCarrier;
    public final /* synthetic */ F6D $environment;
    public final /* synthetic */ HsM $onFailure;
    public final /* synthetic */ HsM $onSuccess;
    public final /* synthetic */ HatchCcvPresentationScope.Presentation $presentation;

    @DebugMetadata(c = "com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.BKBloksActionHatchRefreshPostConsolidationCredentialsImpl$evaluate$job$1$1", f = "BKBloksActionHatchRefreshPostConsolidationCredentialsImpl.kt", l = {68}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bloks.signatures.bkactionhatchrefreshpostconsolidationcredentials.BKBloksActionHatchRefreshPostConsolidationCredentialsImpl$evaluate$job$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPostConsolidationCredentialCarrier $credentialCarrier;
        public final /* synthetic */ F6D $environment;
        public final /* synthetic */ HsM $onFailure;
        public final /* synthetic */ HsM $onSuccess;
        public final /* synthetic */ HatchCcvPresentationScope.Presentation $presentation;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPostConsolidationCredentialCarrier hatchPostConsolidationCredentialCarrier, HsM hsM, HsM hsM2, HatchCcvPresentationScope.Presentation presentation, F6D f6d, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$credentialCarrier = hatchPostConsolidationCredentialCarrier;
            this.$onSuccess = hsM;
            this.$onFailure = hsM2;
            this.$presentation = presentation;
            this.$environment = f6d;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$credentialCarrier, this.$onSuccess, this.$onFailure, this.$presentation, this.$environment, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPostConsolidationCredentialCarrier hatchPostConsolidationCredentialCarrier = this.$credentialCarrier;
                this.label = 1;
                obj = hatchPostConsolidationCredentialCarrier.consume(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BKBloksActionHatchRefreshPostConsolidationCredentialsImpl.INSTANCE.reportCallbackIfActive(this.$presentation, obj == PostConsolidationCredentialRefreshResult.SUCCESS ? this.$onSuccess : this.$onFailure, this.$environment);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKBloksActionHatchRefreshPostConsolidationCredentialsImpl$evaluate$job$1(HatchCcvPresentationScope.Presentation presentation, HatchPostConsolidationCredentialCarrier hatchPostConsolidationCredentialCarrier, HsM hsM, HsM hsM2, F6D f6d) {
        super(0);
        this.$presentation = presentation;
        this.$credentialCarrier = hatchPostConsolidationCredentialCarrier;
        this.$onSuccess = hsM;
        this.$onFailure = hsM2;
        this.$environment = f6d;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HoC invoke() {
        HatchCcvPresentationScope.Presentation presentation = this.$presentation;
        return presentation.launch(new AnonymousClass1(this.$credentialCarrier, this.$onSuccess, this.$onFailure, presentation, this.$environment, null));
    }
}
