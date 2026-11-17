package com.facebook.aura.auth.postconsolidation;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.login.nativeflow.HatchAuthCredentials;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.auth.postconsolidation.HatchPostConsolidationCredentialRefresher$Companion$create$5", f = "HatchPostConsolidationCredentialRefresher.kt", l = {192}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchPostConsolidationCredentialRefresher$Companion$create$5 extends AbstractC07127nr implements G0W<PostConsolidationSessionCapture, HatchAuthCredentials, HtJ<? super AuraSessionManager.PostConsolidationCredentialReplacementResult>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public HatchPostConsolidationCredentialRefresher$Companion$create$5(HtJ<? super HatchPostConsolidationCredentialRefresher$Companion$create$5> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(PostConsolidationSessionCapture postConsolidationSessionCapture, HatchAuthCredentials hatchAuthCredentials, HtJ<? super AuraSessionManager.PostConsolidationCredentialReplacementResult> htJ) {
        HatchPostConsolidationCredentialRefresher$Companion$create$5 hatchPostConsolidationCredentialRefresher$Companion$create$5 = new HatchPostConsolidationCredentialRefresher$Companion$create$5(htJ);
        hatchPostConsolidationCredentialRefresher$Companion$create$5.L$0 = postConsolidationSessionCapture;
        hatchPostConsolidationCredentialRefresher$Companion$create$5.L$1 = hatchAuthCredentials;
        return hatchPostConsolidationCredentialRefresher$Companion$create$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        PostConsolidationSessionCapture postConsolidationSessionCapture = (PostConsolidationSessionCapture) this.L$0;
        HatchAuthCredentials hatchAuthCredentials = (HatchAuthCredentials) this.L$1;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = postConsolidationSessionCapture.session;
            String str = postConsolidationSessionCapture.accessToken;
            String str2 = hatchAuthCredentials.frlAccessToken;
            String str3 = hatchAuthCredentials.frlAccountId;
            String str4 = hatchAuthCredentials.abraUserId;
            String str5 = hatchAuthCredentials.abraAccessToken;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = auraSessionManager.replaceCredentialsAfterConsolidation(abstractC3358CGz, str, str2, str3, str4, str5, this);
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
