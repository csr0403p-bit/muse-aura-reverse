package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C20Q;
import X.C3Ue;
import X.C6v3;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement;
import com.facebook.aura.vds.compose.accessibility.ScreenReaderKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchReplyAnnouncementKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchReplyAnnouncementKt$HatchReplyAnnouncement$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C20Q<HatchConversationAnnouncement> $announcement;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C20Q<? extends HatchConversationAnnouncement> c20q, BRg bRg, int i, int i2) {
            super(2);
            this.$announcement = c20q;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchReplyAnnouncementKt.HatchReplyAnnouncement(this.$announcement, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchReplyAnnouncementKt$HatchReplyAnnouncement$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C20Q<HatchConversationAnnouncement> $announcement;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C20Q<? extends HatchConversationAnnouncement> c20q, BRg bRg, int i, int i2) {
            super(2);
            this.$announcement = c20q;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchReplyAnnouncementKt.HatchReplyAnnouncement(this.$announcement, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchReplyAnnouncement(C20Q<? extends HatchConversationAnnouncement> c20q, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        int i3;
        Object[] objArr;
        C7384Etj.A0Y(c20q, 0);
        bfm.AgG(1592399635);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(c20q, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            if (!ScreenReaderKt.rememberIsScreenReaderEnabled(bfm, 0)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(c20q, bRg, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            String strA01 = null;
            HatchConversationAnnouncement hatchConversationAnnouncement = (HatchConversationAnnouncement) C6v3.A00(bfm, null, null, c20q, 2).getValue();
            if (hatchConversationAnnouncement instanceof HatchConversationAnnouncement.Reply) {
                AnonymousClass003.A0l(bfm, 1287702583);
                strA01 = ((HatchConversationAnnouncement.Reply) hatchConversationAnnouncement).text;
            } else {
                if (hatchConversationAnnouncement instanceof HatchConversationAnnouncement.ReplyWithoutText) {
                    bfm.AgE(1287705217);
                    i3 = R.string._name_removed__res_0x7f120239;
                    objArr = new Object[]{((HatchConversationAnnouncement.ReplyWithoutText) hatchConversationAnnouncement).agentName};
                } else if (hatchConversationAnnouncement instanceof HatchConversationAnnouncement.AgentWorking) {
                    bfm.AgE(1287712076);
                    i3 = R.string._name_removed__res_0x7f120236;
                    HatchConversationAnnouncement.AgentWorking agentWorking = (HatchConversationAnnouncement.AgentWorking) hatchConversationAnnouncement;
                    String str = agentWorking.agentName;
                    String strA012 = agentWorking.statusText;
                    if (strA012 == null) {
                        bfm.AgE(1287716990);
                        strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121075);
                    } else {
                        bfm.AgE(1287716370);
                    }
                    AnonymousClass001.A1D(bfm);
                    objArr = new Object[]{str, strA012};
                } else if (hatchConversationAnnouncement instanceof HatchConversationAnnouncement.SendFailed) {
                    bfm.AgE(1287721033);
                    strA01 = AbstractC2271BQs.A01(bfm, HatchMessageItemKt.sendFailedTextRes(((HatchConversationAnnouncement.SendFailed) hatchConversationAnnouncement).category));
                    AnonymousClass001.A1D(bfm);
                } else {
                    if (hatchConversationAnnouncement != null) {
                        throw AnonymousClass005.A0k(bfm, 1287700602);
                    }
                    AnonymousClass003.A0l(bfm, 1264715242);
                }
                strA01 = AbstractC2271BQs.A02(bfm, objArr, i3);
                AnonymousClass001.A1D(bfm);
            }
            BRg bRgA07 = C10G.A07(bRg, 1.0f);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchReplyAnnouncementKt$HatchReplyAnnouncement$2$1(strA01);
                bfm.Ai0(objAaT);
            }
            C3Ue.A04(AnonymousClass001.A0Y(bRgA07, objAaT, false), bfm, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(c20q, bRg, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }
}
