package com.facebook.aura.commands.sms;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3UX;
import X.EnumC10460Hji;
import X.EsN;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.commands.sms.MessageAttachmentGetHandler$execute$2$entries$1", f = "MessageAttachmentGetHandler.kt", l = {126}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MessageAttachmentGetHandler$execute$2$entries$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends JsonObject>>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ List<String> $requestedIds;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageAttachmentGetHandler$execute$2$entries$1(List<String> list, Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super MessageAttachmentGetHandler$execute$2$entries$1> htJ) {
        super(2, htJ);
        this.$requestedIds = list;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        MessageAttachmentGetHandler$execute$2$entries$1 messageAttachmentGetHandler$execute$2$entries$1 = new MessageAttachmentGetHandler$execute$2$entries$1(this.$requestedIds, this.$context, this.$userSession, htJ);
        messageAttachmentGetHandler$execute$2$entries$1.L$0 = obj;
        return messageAttachmentGetHandler$execute$2$entries$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends JsonObject>> htJ) {
        return invoke2(c3ux, (HtJ<? super List<JsonObject>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            List<String> list = this.$requestedIds;
            Context context = this.$context;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(AnonymousClass001.A10(new MessageAttachmentGetHandler$execute$2$entries$1$1$1(context, AnonymousClass005.A0j(it), abstractC3358CGz, null), c3ux));
            }
            this.L$0 = null;
            this.label = 1;
            obj = EsN.A00(arrayListA0i, this);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super List<JsonObject>> htJ) {
        return ((MessageAttachmentGetHandler$execute$2$entries$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
