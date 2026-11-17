package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC0878AGe;
import X.AbstractC7608F5v;
import X.AnonymousClass002;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9658Gci;
import X.FGI;
import X.GRA;
import X.GRB;
import X.GRC;
import X.GRK;
import X.GRZ;
import X.HnJ;
import X.HrH;
import X.HwN;
import com.facebook.rsys.metaaivoicestate.gen.DeepDiveState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiConnectState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiSessionInfo;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiToolCallCancel;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiToolCallRequest;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceCommand;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.metaaivoicestate.gen.RealtimeaiInternalDebugContent;
import com.facebook.rsys.metaaivoicestate.gen.S2sConnectionState;
import com.facebook.rsys.metaaivoicestate.gen.StandardizedResponseItem;
import com.facebook.rsys.metaaivoicestate.gen.TurnMetaData;
import com.facebook.rsys.metaaivoicestate.gen.UgcBotChangeResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class MetaAiVoiceStateProxyImpl extends MetaAiVoiceStateProxy {
    public String A00;
    public final BLG<GRB> A01;
    public final BLG<GRA> A02;
    public final C22I<Unit> A03;
    public final C22I<S2sConnectionState> A04;
    public final C22I<MetaAiToolCallCancel> A05;
    public final C22I<MetaAiToolCallRequest> A06;
    public final C1BN<DeepDiveState> A07;
    public final C1BN<List<RealtimeaiInternalDebugContent>> A08;
    public final C1BN<MetaAiVoiceState> A09;
    public final C1BN<GRB> A0A;
    public final C1BN<MetaAiSessionInfo> A0B;
    public final C1BN<GRA> A0C;
    public final GRZ A0D;
    public final C3Em<Unit> A0E;
    public final C3Em<S2sConnectionState> A0F;
    public final C3Em<MetaAiToolCallCancel> A0G;
    public final C3Em<MetaAiToolCallRequest> A0H;
    public final BLG<DeepDiveState> A0I;
    public final BLG<List<RealtimeaiInternalDebugContent>> A0J;
    public final BLG<MetaAiSessionInfo> A0K;
    public final BLG<MetaAiConnectState> A0L;
    public final BLG<MetaAiVoiceState> A0M;
    public final BLG<UgcBotChangeResult> A0N;
    public final C1BN<MetaAiConnectState> A0O;

    public MetaAiVoiceStateProxyImpl(String str) {
        C7384Etj.A0Y(str, 0);
        HrH hrH = HwN.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(hrH);
        this.A0M = c9286GCnA14;
        this.A09 = C3cG.A11(c9286GCnA14);
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 16);
        this.A0F = c9290GCr;
        this.A04 = new C3pd(c9290GCr);
        C9286GCn c9286GCnA142 = C3cG.A14(hrH);
        this.A01 = c9286GCnA142;
        this.A0A = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(hrH);
        this.A02 = c9286GCnA143;
        this.A0C = C3cG.A11(c9286GCnA143);
        C9290GCr c9290GCr2 = new C9290GCr(num, 0, 16);
        this.A0H = c9290GCr2;
        this.A06 = new C3pd(c9290GCr2);
        C9290GCr c9290GCr3 = new C9290GCr(num, 0, 16);
        this.A0G = c9290GCr3;
        this.A05 = new C3pd(c9290GCr3);
        C9286GCn c9286GCnA144 = C3cG.A14(hrH);
        this.A0L = c9286GCnA144;
        this.A0O = C3cG.A11(c9286GCnA144);
        this.A0N = C3cG.A14(hrH);
        C9286GCn c9286GCnA145 = C3cG.A14(hrH);
        this.A0K = c9286GCnA145;
        this.A0B = C3cG.A11(c9286GCnA145);
        C9290GCr c9290GCr4 = new C9290GCr(num, 0, 1);
        this.A0E = c9290GCr4;
        this.A03 = new C3pd(c9290GCr4);
        C9286GCn c9286GCnA01 = HnJ.A01(C0881AGi.A00);
        this.A0J = c9286GCnA01;
        this.A08 = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA146 = C3cG.A14(hrH);
        this.A0I = c9286GCnA146;
        this.A07 = C3cG.A11(c9286GCnA146);
        this.A0D = GRK.A00(str);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onConnected(MetaAiConnectState metaAiConnectState) {
        C7384Etj.A0Y(metaAiConnectState, 0);
        AnonymousClass002.A1I(this.A0L, metaAiConnectState);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onDeepDiveState(DeepDiveState deepDiveState) {
        C7384Etj.A0Y(deepDiveState, 0);
        String strA0T = FGI.A0T("Received Deep Dive state: discussedSubjects=", ", snapshots=", deepDiveState.discussedSubjects.size(), deepDiveState.snapshots.size());
        C7384Etj.A0Y(strA0T, 1);
        AbstractC7608F5v.A1L(strA0T);
        AnonymousClass002.A1I(this.A0I, deepDiveState);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onInternalDebug(RealtimeaiInternalDebugContent realtimeaiInternalDebugContent) {
        List<RealtimeaiInternalDebugContent> value;
        C7384Etj.A0Y(realtimeaiInternalDebugContent, 0);
        BLG<List<RealtimeaiInternalDebugContent>> blg = this.A0J;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AbstractC0878AGe.A0Q(realtimeaiInternalDebugContent, value)));
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onSessionInfo(MetaAiSessionInfo metaAiSessionInfo) {
        C7384Etj.A0Y(metaAiSessionInfo, 0);
        String strA0d = FGI.A0d("Received session info: threadId=", metaAiSessionInfo.threadId, ", errorMsg=", metaAiSessionInfo.errorMsg);
        C7384Etj.A0Y(strA0d, 1);
        AbstractC7608F5v.A1L(strA0d);
        AnonymousClass002.A1I(this.A0K, metaAiSessionInfo);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onToolCallCancel(MetaAiToolCallCancel metaAiToolCallCancel) {
        C7384Etj.A0Y(metaAiToolCallCancel, 0);
        String strA0M = FGI.A0M("Received tool call cancel: toolCallId=", metaAiToolCallCancel.toolCallId);
        C7384Etj.A0Y(strA0M, 1);
        AbstractC7608F5v.A1L(strA0M);
        if (this.A0G.AhV(metaAiToolCallCancel)) {
            return;
        }
        String strA0M2 = FGI.A0M("Dropped tool call cancel, collector too far behind: toolCallId=", metaAiToolCallCancel.toolCallId);
        C7384Etj.A0Y(strA0M2, 1);
        AbstractC7608F5v.A1L(strA0M2);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onToolCallRequest(MetaAiToolCallRequest metaAiToolCallRequest) {
        C7384Etj.A0Y(metaAiToolCallRequest, 0);
        String strA0d = FGI.A0d("Received tool call request: toolCallId=", metaAiToolCallRequest.toolCallId, ", toolName=", metaAiToolCallRequest.toolName);
        C7384Etj.A0Y(strA0d, 1);
        AbstractC7608F5v.A1L(strA0d);
        if (this.A0H.AhV(metaAiToolCallRequest)) {
            return;
        }
        String strA0d2 = FGI.A0d("Dropped tool call request, collector too far behind: toolCallId=", metaAiToolCallRequest.toolCallId, ", toolName=", metaAiToolCallRequest.toolName);
        C7384Etj.A0Y(strA0d2, 1);
        AbstractC7608F5v.A1L(strA0d2);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onUgcBotChangeResult(UgcBotChangeResult ugcBotChangeResult) {
        C7384Etj.A0Y(ugcBotChangeResult, 0);
        AnonymousClass002.A1I(this.A0N, ugcBotChangeResult);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onUpdate(MetaAiVoiceState metaAiVoiceState) {
        StandardizedResponseItem standardizedResponseItemPrevious;
        StandardizedResponseItem next;
        String str;
        String str2;
        GRA value;
        GRA gra;
        String str3;
        GRB value2;
        GRB grb;
        C7384Etj.A0Y(metaAiVoiceState, 0);
        S2sConnectionState s2sConnectionState = metaAiVoiceState.s2sConnectionState;
        if (s2sConnectionState != null) {
            String strA0T = FGI.A0T("Received FAVO S2S connection state: state=", " reason=", s2sConnectionState.state, s2sConnectionState.reason);
            C7384Etj.A0Y(strA0T, 1);
            AbstractC7608F5v.A1L(strA0T);
            this.A0F.AhV(s2sConnectionState);
        }
        ArrayList<StandardizedResponseItem> arrayList = metaAiVoiceState.standardizedResponse;
        C7384Etj.A0T(arrayList);
        ListIterator<StandardizedResponseItem> listIterator = arrayList.listIterator(arrayList.size());
        do {
            standardizedResponseItemPrevious = null;
            if (!listIterator.hasPrevious()) {
                break;
            } else {
                standardizedResponseItemPrevious = listIterator.previous();
            }
        } while (standardizedResponseItemPrevious.type != 4);
        StandardizedResponseItem standardizedResponseItem = standardizedResponseItemPrevious;
        if (standardizedResponseItem != null && (str3 = standardizedResponseItem.payload) != null && str3.length() > 0) {
            BLG<GRB> blg = this.A01;
            do {
                value2 = blg.getValue();
                grb = value2;
            } while (!blg.A6e(value2, new GRB(str3, (grb != null ? grb.A00 : 0L) + 1)));
        }
        TurnMetaData turnMetaData = metaAiVoiceState.turnMetaData;
        if (turnMetaData != null && (str2 = turnMetaData.turnUuid) != null && str2.length() > 0 && !str2.equals(this.A00)) {
            this.A00 = str2;
            BLG<GRA> blg2 = this.A02;
            do {
                value = blg2.getValue();
                gra = value;
                if (gra == null || !str2.equals(gra.A00)) {
                    gra = null;
                }
            } while (!blg2.A6e(value, gra));
        }
        ArrayList<StandardizedResponseItem> arrayList2 = metaAiVoiceState.standardizedResponse;
        C7384Etj.A0T(arrayList2);
        Iterator<StandardizedResponseItem> it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.type == 1) {
                    break;
                }
            }
        }
        StandardizedResponseItem standardizedResponseItem2 = next;
        if (standardizedResponseItem2 != null && (str = standardizedResponseItem2.payload) != null && str.length() > 0) {
            AnonymousClass002.A1I(this.A02, new GRA(str, this.A00));
        }
        ((C9658Gci) this.A0D).A00.invoke(new GRC(metaAiVoiceState.state));
        AnonymousClass002.A1I(this.A0M, metaAiVoiceState);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onVoiceCommand(MetaAiVoiceCommand metaAiVoiceCommand) {
        C7384Etj.A0Y(metaAiVoiceCommand, 0);
        String strA0V = FGI.A0V("Received voice command: commandId=", metaAiVoiceCommand.commandId, ", commandType=", metaAiVoiceCommand.commandType);
        C7384Etj.A0Y(strA0V, 1);
        AbstractC7608F5v.A1L(strA0V);
    }

    @Override // com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy
    public final void onCosmosSessionCreated() {
        AbstractC7608F5v.A1L("Cosmos session created");
        this.A0E.AhV(Unit.INSTANCE);
    }
}
