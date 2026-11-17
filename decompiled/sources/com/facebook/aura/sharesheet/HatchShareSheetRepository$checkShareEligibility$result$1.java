package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3cG;
import X.C60O;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import X.HxE;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.SharingJarvisPath;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$checkShareEligibility$result$1", f = "HatchShareSheetRepository.kt", l = {659}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$checkShareEligibility$result$1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends ShareEligibilityResponseJson>>, Object> {
    public final /* synthetic */ String $contentId;
    public final /* synthetic */ String $contentType;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$checkShareEligibility$result$1(HatchShareSheetRepository hatchShareSheetRepository, String str, String str2, HtJ<? super HatchShareSheetRepository$checkShareEligibility$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchShareSheetRepository;
        this.$contentType = str;
        this.$contentId = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchShareSheetRepository$checkShareEligibility$result$1(this.this$0, this.$contentType, this.$contentId, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
            SharingJarvisPath.SharingEligibility sharingEligibility = SharingJarvisPath.SharingEligibility.INSTANCE;
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r("content_type", this.$contentType), C3cG.A0r("content_id", this.$contentId)};
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jH = C9jH.A00;
            HatchShareSheetRepository$checkShareEligibility$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 hatchShareSheetRepository$checkShareEligibility$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = HatchShareSheetRepository$checkShareEligibility$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApiA06.m1595executeBodylessJarvisRequestWithp3iPjrY(hatchShareSheetRepository$checkShareEligibility$result$1$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, sharingEligibility, requestType, abstractC3358CGz, null, hxEArr, null, setA18, true, c9jH, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        return C3cG.A0t(objM1595executeBodylessJarvisRequestWithp3iPjrY);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super HsJ<ShareEligibilityResponseJson>> htJ) {
        return ((HatchShareSheetRepository$checkShareEligibility$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends ShareEligibilityResponseJson>> htJ) {
        return invoke2((HtJ<? super HsJ<ShareEligibilityResponseJson>>) htJ);
    }
}
