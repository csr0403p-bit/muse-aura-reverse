package com.facebook.aura.conversation.viewmodel;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BGK;
import X.BLG;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.composer.upload.AttachmentCategory;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect;
import com.facebook.aura.model.HatchSendMessage;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchConversationAttachments$addPendingImageUris$staging$1", f = "HatchConversationAttachments.kt", l = {146}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchConversationAttachments$addPendingImageUris$staging$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ List<String> $uris;
    public int label;
    public final /* synthetic */ HatchConversationAttachments this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationAttachments$addPendingImageUris$staging$1(HatchConversationAttachments hatchConversationAttachments, List<String> list, HtJ<? super HatchConversationAttachments$addPendingImageUris$staging$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchConversationAttachments;
        this.$uris = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationAttachments$addPendingImageUris$staging$1(this.this$0, this.$uris, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HatchSendMessage value;
        HatchSendMessage hatchSendMessage;
        List listA0a;
        Object objAcceptableImageUris = obj;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objAcceptableImageUris);
            HatchConversationAttachments hatchConversationAttachments = this.this$0;
            List<String> list = this.$uris;
            this.label = 1;
            objAcceptableImageUris = hatchConversationAttachments.acceptableImageUris(list, this);
            if (objAcceptableImageUris == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(objAcceptableImageUris);
        }
        List list2 = (List) objAcceptableImageUris;
        if (!list2.isEmpty()) {
            BLG<HatchSendMessage> blg = this.this$0.pendingMessage;
            do {
                value = blg.getValue();
                hatchSendMessage = value;
                int size = (10 - hatchSendMessage.imageUris.size()) - hatchSendMessage.fileUris.size();
                if (size < 0) {
                    size = 0;
                }
                listA0a = AbstractC0878AGe.A0a(list2, size);
            } while (!blg.A6e(value, HatchSendMessage.copy$default(hatchSendMessage, null, null, null, AbstractC0878AGe.A0P(listA0a, hatchSendMessage.imageUris), null, null, null, null, null, false, null, null, null, 8183, null)));
            HatchConversationAttachments hatchConversationAttachments2 = this.this$0;
            hatchConversationAttachments2.linkImageUris = BGK.A03(AbstractC0878AGe.A0g(listA0a), hatchConversationAttachments2.linkImageUris);
            if (listA0a.size() < list2.size()) {
                AttachmentUploadAnalytics.INSTANCE.rejected(UploadRejectionReason.AttachmentCap, AttachmentCategory.IMAGE, list2.size() - listA0a.size());
                this.this$0.viewEffects.AhV(HatchConversationViewEffect.ShowAttachmentLimitReached.INSTANCE);
            }
            HatchConversationAttachments hatchConversationAttachments3 = this.this$0;
            Iterator it = listA0a.iterator();
            while (it.hasNext()) {
                hatchConversationAttachments3.startEagerImageUpload(AnonymousClass005.A0j(it));
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationAttachments$addPendingImageUris$staging$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
