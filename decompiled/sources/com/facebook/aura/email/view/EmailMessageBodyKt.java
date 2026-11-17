package com.facebook.aura.email.view;

import X.AHD;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC1913AtY;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.email.model.EmailBodyPart;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.ui.HatchMarkdownTextKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailMessageBodyKt {

    /* renamed from: com.facebook.aura.email.view.EmailMessageBodyKt$EmailMessageBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailMessage emailMessage, BRg bRg, int i, int i2) {
            super(2);
            this.$message = emailMessage;
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
            EmailMessageBodyKt.EmailMessageBody(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailMessageBodyKt$EmailPlainTextBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C117692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117692(EmailMessage emailMessage, BRg bRg, int i, int i2) {
            super(2);
            this.$message = emailMessage;
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
            EmailMessageBodyKt.EmailPlainTextBody(this.$message, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [X.Arm] */
    /* JADX WARN: Type inference failed for: r16v2, types: [X.G0U] */
    public static final void EmailMessageBody(EmailMessage emailMessage, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2;
        BRg bRg3 = bRg;
        C7384Etj.A0Y(emailMessage, 0);
        bfm.AgG(-982031501);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, emailMessage) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg3.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String str = emailMessage.authenticationVerdict;
            if (CvmMigrationStatusJson.STAGE_FAILED.equals(str)) {
                bfm.AgE(-2051886389);
                bRg2 = null;
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12093e), null, 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16382);
                BBI.A0R(bbi, false);
            } else {
                bRg2 = null;
                if ("UNVERIFIED".equals(str)) {
                    bfm.AgE(-2051883537);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12093f), null, 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16382);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(816193017);
                    BBI.A0R(bbi, false);
                }
            }
            String str2 = emailMessage.htmlBody;
            if (str2 != null) {
                bfm.AgE(816256629);
                String str3 = emailMessage.htmlPreamble;
                if (str3 == null || C7BY.A0j(str3)) {
                    bfm.AgE(816330377);
                } else {
                    bfm.AgE(816330378);
                    HatchMarkdownTextKt.m2319HatchMarkdownTextT042LqI(str3, C3U4.A03(c1062ATq, 12.0f), 0L, bRg2, bRg2, bfm, 48, 28);
                }
                BBI.A0R(bbi, false);
                String strA0L = emailMessage.htmlFallback;
                if (strA0L == null) {
                    bfm.AgE(-2051871225);
                    AHD<EmailBodyPart> ahd = emailMessage.body;
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = EmailMessageBodyKt$EmailMessageBody$1$3$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", ahd, (G0U) objAaT);
                } else {
                    bfm.AgE(-2051872372);
                }
                BBI.A0R(bbi, false);
                EmailHtmlBodyKt.EmailHtmlBody(str2, strA0L, bRg2, bfm, 0, 4);
            } else {
                bfm.AgE(816544464);
                EmailPlainTextBody(emailMessage, bRg2, bfm, iA0T & 14, 2);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(emailMessage, bRg3, i, i2);
        }
    }

    public static final void EmailPlainTextBody(EmailMessage emailMessage, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1892221981);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailMessage) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (emailMessage.body.isEmpty()) {
                bfm.AgE(-709376159);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120984), null, 0L, C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            } else {
                bfm.AgE(-515693751);
            }
            BBI.A0R(bbi, false);
            long j = AnonymousClass002.A0c(bfm).fillDivider;
            bfm.AgE(-709369063);
            Iterator it = emailMessage.body.iterator();
            while (it.hasNext()) {
                AbstractC1913AtY.A01(null, B1V.A00(bfm, new EmailMessageBodyKt$EmailPlainTextBody$1$1$1((EmailBodyPart) it.next(), j), -179366186), bfm, 48, 1);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117692(emailMessage, bRg2, i, i2);
        }
    }
}
