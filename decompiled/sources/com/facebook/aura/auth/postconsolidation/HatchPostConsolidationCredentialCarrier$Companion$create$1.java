package com.facebook.aura.auth.postconsolidation;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialCarrier$Companion$create$1", f = "HatchPostConsolidationCredentialCarrier.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialCarrier$Companion$create$1 extends AbstractC07127nr implements G0V<PostConsolidationSurvivorFrlCredential, HtJ<? super PostConsolidationCredentialRefreshResult>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public HatchPostConsolidationCredentialCarrier$Companion$create$1(HtJ<? super HatchPostConsolidationCredentialCarrier$Companion$create$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchPostConsolidationCredentialCarrier$Companion$create$1 hatchPostConsolidationCredentialCarrier$Companion$create$1 = new HatchPostConsolidationCredentialCarrier$Companion$create$1(htJ);
        hatchPostConsolidationCredentialCarrier$Companion$create$1.L$0 = obj;
        return hatchPostConsolidationCredentialCarrier$Companion$create$1;
    }

    @Override // X.G0V
    public final Object invoke(PostConsolidationSurvivorFrlCredential postConsolidationSurvivorFrlCredential, HtJ<? super PostConsolidationCredentialRefreshResult> htJ) {
        HatchPostConsolidationCredentialCarrier$Companion$create$1 hatchPostConsolidationCredentialCarrier$Companion$create$1 = new HatchPostConsolidationCredentialCarrier$Companion$create$1(htJ);
        hatchPostConsolidationCredentialCarrier$Companion$create$1.L$0 = postConsolidationSurvivorFrlCredential;
        return hatchPostConsolidationCredentialCarrier$Companion$create$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        PostConsolidationSurvivorFrlCredential postConsolidationSurvivorFrlCredential = (PostConsolidationSurvivorFrlCredential) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPostConsolidationCredentialRefresher hatchPostConsolidationCredentialRefresherCreate = HatchPostConsolidationCredentialRefresher.Companion.create();
            this.L$0 = null;
            this.label = 1;
            obj = hatchPostConsolidationCredentialRefresherCreate.refresh$fbandroid_express_aura_java_com_facebook_aura_auth_postconsolidation_postconsolidation(postConsolidationSurvivorFrlCredential, this);
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
