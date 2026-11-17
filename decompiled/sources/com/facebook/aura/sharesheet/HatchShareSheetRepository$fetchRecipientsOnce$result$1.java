package com.facebook.aura.sharesheet;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$fetchRecipientsOnce$result$1", f = "HatchShareSheetRepository.kt", l = {652}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchShareSheetRepository$fetchRecipientsOnce$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends ShareRecipientsResponseJson>>, Object> {
    public final /* synthetic */ boolean $excludeOnboardedHatchUsers;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$fetchRecipientsOnce$result$1(boolean z, HtJ<? super HatchShareSheetRepository$fetchRecipientsOnce$result$1> htJ) {
        super(1, htJ);
        this.$excludeOnboardedHatchUsers = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchShareSheetRepository$fetchRecipientsOnce$result$1(this.$excludeOnboardedHatchUsers, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<ShareRecipientsResponseJson>> htJ) {
        return new HatchShareSheetRepository$fetchRecipientsOnce$result$1(this.$excludeOnboardedHatchUsers, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1596executeBodylessStefiRequestWithtZkwj4A;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            StefiHatchPath.SharingRecipients sharingRecipients = new StefiHatchPath.SharingRecipients(this.$excludeOnboardedHatchUsers, false);
            RequestType requestType = RequestType.GET;
            Long lA0S = C3cG.A0S(86400000L);
            C9jH c9jHA0E = AGH.A0E();
            HatchShareSheetRepository$fetchRecipientsOnce$result$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchShareSheetRepository$fetchRecipientsOnce$result$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchShareSheetRepository$fetchRecipientsOnce$result$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 1;
            objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchShareSheetRepository$fetchRecipientsOnce$result$1$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, sharingRecipients, requestType, lA0S, null, c9jHA0E, c9jHA0E, this);
            if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
        }
        return C3cG.A0t(objM1596executeBodylessStefiRequestWithtZkwj4A);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends ShareRecipientsResponseJson>> htJ) {
        return invoke2((HtJ<? super HsJ<ShareRecipientsResponseJson>>) htJ);
    }
}
