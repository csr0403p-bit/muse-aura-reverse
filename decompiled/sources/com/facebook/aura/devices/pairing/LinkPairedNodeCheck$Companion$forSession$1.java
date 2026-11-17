package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.token.LinkPairedNodes;
import com.facebook.aura.nodes.json.NodeListEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkPairedNodeCheck$Companion$forSession$1", f = "LinkPairedNodeCheck.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class LinkPairedNodeCheck$Companion$forSession$1 extends AbstractC07127nr implements G0U<HtJ<? super List<? extends NodeListEntry>>, Object> {
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPairedNodeCheck$Companion$forSession$1(AbstractC3358CGz abstractC3358CGz, HtJ<? super LinkPairedNodeCheck$Companion$forSession$1> htJ) {
        super(1, htJ);
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new LinkPairedNodeCheck$Companion$forSession$1(this.$userSession, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(HtJ<? super List<NodeListEntry>> htJ) {
        return new LinkPairedNodeCheck$Companion$forSession$1(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            LinkPairedNodes linkPairedNodes = LinkPairedNodes.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 1;
            obj = linkPairedNodes.read(abstractC3358CGz, this);
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

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(HtJ<? super List<? extends NodeListEntry>> htJ) {
        return invoke2((HtJ<? super List<NodeListEntry>>) htJ);
    }
}
