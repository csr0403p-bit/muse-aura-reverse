package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C3cG;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.SharingStefiPath;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetRepository$sendMedia$2", f = "HatchShareSheetRepository.kt", l = {HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 655}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchShareSheetRepository$sendMedia$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends ShareSendResponseJson>>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchPreparedShareMedia $media;
    public final /* synthetic */ HatchShareRecipient $recipient;
    public final /* synthetic */ String $text;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ HatchShareSheetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetRepository$sendMedia$2(HatchShareSheetRepository hatchShareSheetRepository, Context context, HatchPreparedShareMedia hatchPreparedShareMedia, HatchShareRecipient hatchShareRecipient, String str, HtJ<? super HatchShareSheetRepository$sendMedia$2> htJ) {
        super(2, htJ);
        this.this$0 = hatchShareSheetRepository;
        this.$context = context;
        this.$media = hatchPreparedShareMedia;
        this.$recipient = hatchShareRecipient;
        this.$text = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchShareSheetRepository$sendMedia$2(this.this$0, this.$context, this.$media, this.$recipient, this.$text, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objA0s;
        Object objM2004uploadMedia0E7RQCE;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            objA0s = C3cG.A0s(e2);
        }
        if (i == 0) {
            Hwg.A00(obj);
            HatchShareSheetRepository hatchShareSheetRepository = this.this$0;
            Context context = this.$context;
            HatchPreparedShareMedia hatchPreparedShareMedia = this.$media;
            this.label = 1;
            objM2004uploadMedia0E7RQCE = hatchShareSheetRepository.m2004uploadMedia0E7RQCE(context, hatchPreparedShareMedia, this);
            if (objM2004uploadMedia0E7RQCE == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                objA0s = AnonymousClass002.A0j(obj);
                return C3cG.A0t(objA0s);
            }
            objM2004uploadMedia0E7RQCE = AnonymousClass002.A0j(obj);
        }
        Hwg.A00(objM2004uploadMedia0E7RQCE);
        HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
        SharingStefiPath.SharingSend sharingSend = SharingStefiPath.SharingSend.INSTANCE;
        HatchShareRecipient hatchShareRecipient = this.$recipient;
        ShareSendRequestJson shareSendRequestJson = new ShareSendRequestJson(hatchShareRecipient.recipientType, hatchShareRecipient.recipientId, hatchShareRecipient.senderAccountId, this.$text, (String) objM2004uploadMedia0E7RQCE, AnonymousClass002.A0k());
        RequestType requestType = RequestType.POST;
        C9jH c9jH = C9jH.A00;
        HatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
        HatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.I$0 = 1;
        this.I$1 = 0;
        this.label = 2;
        objA0s = hatchHttpApi.m1604executeStefiRequestWithjLovISM(hatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchShareSheetRepository$sendMedia$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, sharingSend, shareSendRequestJson, requestType, c9jH, true, null, false, null, this);
        if (objA0s == enumC10460Hji) {
            return enumC10460Hji;
        }
        return C3cG.A0t(objA0s);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<ShareSendResponseJson>> htJ) {
        return ((HatchShareSheetRepository$sendMedia$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends ShareSendResponseJson>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<ShareSendResponseJson>>) htJ);
    }
}
