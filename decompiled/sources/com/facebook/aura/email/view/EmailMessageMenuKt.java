package com.facebook.aura.email.view;

import X.AGI;
import X.AHD;
import X.AHH;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C0861A6i;
import X.C78N;
import X.C7BY;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.email.model.EmailChatDraft;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailReplyTargetJsonKt;
import com.facebook.aura.email.viewmodel.EmailThreadExit;
import com.facebook.aura.email.viewmodel.EmailThreadSessionViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailMessageMenuKt {
    public static final int DELETE = 2;
    public static final int FORWARD = 1;
    public static final int REPLY = 0;

    /* renamed from: com.facebook.aura.email.view.EmailMessageMenuKt$EmailMessageActions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, AHD<? extends AuraContextMenuItem>> {
        public final /* synthetic */ boolean $sendEnabled;
        public final /* synthetic */ boolean $showDelete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2) {
            super(2);
            this.$sendEnabled = z;
            this.$showDelete = z2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ AHD<? extends AuraContextMenuItem> invoke(BFM bfm, Integer num) {
            return invoke(bfm, AnonymousClass001.A0F(num));
        }

        public final AHD<AuraContextMenuItem> invoke(BFM bfm, int i) {
            bfm.AgE(25219348);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12096b);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.chevronrightstack_outline_24_wght400, 0);
            boolean z = this.$sendEnabled;
            BS0 bs0 = BRg.A00;
            AuraContextMenuItem auraContextMenuItem = new AuraContextMenuItem(1, strA01, null, aVyA00, null, null, false, false, false, z, false, AbstractC07539Wl.A00(bs0, "email-message-forward"), 1, 1);
            AuraContextMenuItem auraContextMenuItem2 = new AuraContextMenuItem(2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12094f), null, BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0), null, null, false, false, false, true, true, AbstractC07539Wl.A00(bs0, "email-message-delete"), 1, 1);
            AHH ahhA0E = AGI.A0E(new AuraContextMenuItem(0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12099f), null, BOf.A00(bfm, R.drawable.arrow_big_reply_wght400_outline_24, 0), null, null, false, false, false, this.$sendEnabled, false, AbstractC07539Wl.A00(bs0, "email-message-reply"), 1, 2), auraContextMenuItem);
            if (this.$showDelete) {
                ahhA0E = ahhA0E.A34(auraContextMenuItem2);
            }
            AnonymousClass001.A1D(bfm);
            return ahhA0E;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailMessageMenuKt$EmailMessageActions$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDelete;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ boolean $sendEnabled;
        public final /* synthetic */ boolean $showDelete;
        public final /* synthetic */ String $subject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EmailMessage emailMessage, String str, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$message = emailMessage;
            this.$subject = str;
            this.$onDismiss = function0;
            this.$onDelete = function02;
            this.$showDelete = z;
            this.$sendEnabled = z2;
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
            EmailMessageMenuKt.EmailMessageActions(this.$message, this.$subject, this.$onDismiss, this.$onDelete, this.$showDelete, this.$sendEnabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailMessageMenuKt$EmailMessageMenu$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $threadSubject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(EmailMessage emailMessage, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$message = emailMessage;
            this.$threadSubject = str;
            this.$environmentId = str2;
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
            EmailMessageMenuKt.EmailMessageMenu(this.$message, this.$threadSubject, this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final EmailChatDraft emailForwardDraft(EmailMessage emailMessage, String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        AnonymousClass004.A1b(emailMessage, str);
        if (str.length() == 0) {
            bfm.AgE(-321843867);
            i2 = R.string._name_removed__res_0x7f12096d;
            objArr = new Object[]{emailMessage.headerFrom};
        } else {
            bfm.AgE(-321840957);
            i2 = R.string._name_removed__res_0x7f12096c;
            objArr = new Object[]{emailMessage.headerFrom, str};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return emailChatDraft(emailMessage, str, "forward", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120998), strA02, bfm, (i & 14) | 384 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
    }

    public static final EmailChatDraft emailReplyDraft(EmailMessage emailMessage, String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        AnonymousClass004.A1b(emailMessage, str);
        if (str.length() == 0) {
            bfm.AgE(979739464);
            i2 = R.string._name_removed__res_0x7f1209a1;
            objArr = new Object[]{emailMessage.headerFrom};
        } else {
            bfm.AgE(979742310);
            i2 = R.string._name_removed__res_0x7f1209a0;
            objArr = new Object[]{emailMessage.headerFrom, str};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return emailChatDraft(emailMessage, str, "reply", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120999), strA02, bfm, (i & 14) | 384 | (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
    }

    public static final void EmailMessageActions(EmailMessage emailMessage, String str, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1109818460);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailMessage) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0s(bfm, z2);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0T, 599186), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T & 126;
            EmailChatDraft emailChatDraftEmailReplyDraft = emailReplyDraft(emailMessage, str, bfm, i4);
            EmailChatDraft emailChatDraftEmailForwardDraft = emailForwardDraft(emailMessage, str, bfm, i4);
            G0V<EmailChatDraft, EmailThreadExit, Unit> g0vRememberEmailDraftInChat = rememberEmailDraftInChat(bfm, 0);
            long jA0B = AnonymousClass007.A0B(0.0f, 8.0f);
            int i5 = iA0T & 896;
            boolean zA1Y = AnonymousClass005.A1Y(bfm, emailChatDraftEmailReplyDraft, emailChatDraftEmailForwardDraft, AnonymousClass003.A19(i5), bfm.A65(g0vRememberEmailDraftInChat)) | AnonymousClass006.A1X(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new EmailMessageMenuKt$EmailMessageActions$1$1(function0, g0vRememberEmailDraftInChat, emailChatDraftEmailReplyDraft, emailChatDraftEmailForwardDraft, function02);
                bfm.Ai0(objAaT);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(bRg2, (G0U) objAaT, function0, true, null, jA0B, null, false, new AnonymousClass2(z2, z), false, null, null, null, false, bfm, ((iA0T >> 18) & 14) | 199680 | i5, 0, 16080);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(emailMessage, str, function0, function02, z, z2, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailMessageMenu(com.facebook.aura.email.model.EmailMessage r37, java.lang.String r38, java.lang.String r39, X.BRg r40, X.BFM r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailMessageMenuKt.EmailMessageMenu(com.facebook.aura.email.model.EmailMessage, java.lang.String, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    public static final EmailChatDraft emailChatDraft(EmailMessage emailMessage, String str, String str2, String str3, String str4, BFM bfm, int i) {
        String str5 = emailMessage.id;
        String str6 = emailMessage.headerFrom;
        bfm.AgE(610980075);
        if (C7BY.A0j(str)) {
            str = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120983);
        }
        AnonymousClass002.A19(bfm);
        return new EmailChatDraft(str3, EmailReplyTargetJsonKt.emailReplyAttribution(str5, str2, str6, str, str4));
    }

    public static final G0V<EmailChatDraft, EmailThreadExit, Unit> rememberEmailDraftInChat(BFM bfm, int i) {
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        Context contextA0H = AnonymousClass002.A0H(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        EmailThreadSessionViewModel emailThreadSessionViewModelRememberEmailThreadSession = EmailThreadScreenKt.rememberEmailThreadSession(bfm, 0);
        HatchConversationViewModel.Factory factory = new HatchConversationViewModel.Factory(AnonymousClass001.A0I(contextA0H), abstractC3358CGzA0g, "primary_session_id", false, false);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchConversationViewModel hatchConversationViewModel = (HatchConversationViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), "primary_session_id", new C0861A6i(HatchConversationViewModel.class));
        boolean zA1S = AnonymousClass005.A1S(bfm, emailThreadSessionViewModelRememberEmailThreadSession, hatchConversationViewModel, auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA1S || objAaT == C78N.A00) {
            objAaT = new EmailMessageMenuKt$rememberEmailDraftInChat$1$1(emailThreadSessionViewModelRememberEmailThreadSession, hatchConversationViewModel, auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        return (G0V) objAaT;
    }
}
