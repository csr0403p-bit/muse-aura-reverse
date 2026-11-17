package com.facebook.aura.settings.support;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C7BY;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.support.HatchContactSupportApi$submitTicket$2", f = "HatchContactSupportApi.kt", l = {122, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchContactSupportApi$submitTicket$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ List<Uri> $attachments;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HelpTicketRequestJson $request;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportApi$submitTicket$2(List<? extends Uri> list, HelpTicketRequestJson helpTicketRequestJson, Context context, HtJ<? super HatchContactSupportApi$submitTicket$2> htJ) {
        super(2, htJ);
        this.$attachments = list;
        this.$request = helpTicketRequestJson;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchContactSupportApi$submitTicket$2(this.$attachments, this.$request, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1985submitWithAttachmentsBWLJW6A;
        String strA0M;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$attachments.isEmpty()) {
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                StefiHatchPath.HelpTicket helpTicket = StefiHatchPath.HelpTicket.INSTANCE;
                HelpTicketRequestJson helpTicketRequestJson = this.$request;
                RequestType requestType = RequestType.POST;
                C9jH c9jH = C9jH.A00;
                HatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                HatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                objM1985submitWithAttachmentsBWLJW6A = hatchHttpApi.m1604executeStefiRequestWithjLovISM(hatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchContactSupportApi$submitTicket$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, helpTicket, helpTicketRequestJson, requestType, c9jH, true, null, false, null, this);
            } else {
                HatchContactSupportApi hatchContactSupportApi = HatchContactSupportApi.INSTANCE;
                Context context = this.$context;
                HelpTicketRequestJson helpTicketRequestJson2 = this.$request;
                List<Uri> list = this.$attachments;
                this.label = 2;
                objM1985submitWithAttachmentsBWLJW6A = hatchContactSupportApi.m1985submitWithAttachmentsBWLJW6A(context, helpTicketRequestJson2, list, this);
            }
            if (objM1985submitWithAttachmentsBWLJW6A == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            objM1985submitWithAttachmentsBWLJW6A = AnonymousClass002.A0j(obj);
        }
        Throwable thA00 = HsJ.A00(objM1985submitWithAttachmentsBWLJW6A);
        if (thA00 == null) {
            HelpTicketResponseJson helpTicketResponseJson = (HelpTicketResponseJson) objM1985submitWithAttachmentsBWLJW6A;
            if (!C7BY.A0j(helpTicketResponseJson.case_id)) {
                return helpTicketResponseJson.case_id;
            }
            strA0M = "Help ticket accepted but response carried no case_id";
        } else {
            strA0M = FGI.A0M("Help ticket submission failed: ", thA00.getMessage());
        }
        CFK.A04(HatchContactSupportApiKt.TAG, strA0M);
        return null;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((HatchContactSupportApi$submitTicket$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
