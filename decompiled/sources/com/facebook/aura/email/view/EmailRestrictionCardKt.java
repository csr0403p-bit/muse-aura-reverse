package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.ARD;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.email.model.EmailRestrictionAction;
import com.facebook.aura.email.model.EmailRestrictionActionKind;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailRestrictionCardKt {

    /* renamed from: com.facebook.aura.email.view.EmailRestrictionCardKt$EmailRestrictionCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailRestrictionNotice $notice;
        public final /* synthetic */ G0U<EmailRestrictionActionKind, Unit> $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(EmailRestrictionNotice emailRestrictionNotice, G0U<? super EmailRestrictionActionKind, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$notice = emailRestrictionNotice;
            this.$onAction = g0u;
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
            EmailRestrictionCardKt.EmailRestrictionCard(this.$notice, this.$onAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailRestrictionCard(EmailRestrictionNotice emailRestrictionNotice, G0U<? super EmailRestrictionActionKind, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1a = AnonymousClass002.A1a(emailRestrictionNotice, g0u);
        bfm.AgG(1919801943);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailRestrictionNotice) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA00 = AbstractC07539Wl.A00(C3U4.A09(C1b8.A03(C3U4.A08(bRgA0Q.then(c1062ATq), 16.0f), C06G.A0R(bfm), AnonymousClass002.A0c(bfm).card), 16.0f), "email-restriction-notice");
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, i4);
            bfm.AgE(657310641);
            String str = emailRestrictionNotice.title;
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            C1822Arm c1822Arm = AnonymousClass001.A0g(bfm, akh).bodyMedium;
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailRestrictionCardKt$EmailRestrictionCard$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bs0, (G0U) objAaT, false), 0L, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            AuraTextKt.m2639AuraTextUY9GdpU(emailRestrictionNotice.body, null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            EmailRestrictionAction emailRestrictionAction = emailRestrictionNotice.action;
            if (emailRestrictionAction != null) {
                C01N.A08(bfm, bs0, 10.0f);
                String str2 = emailRestrictionAction.label;
                AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
                BRg bRgA002 = AbstractC07539Wl.A00(c1062ATq, "email-restriction-action");
                boolean zA1S = AnonymousClass001.A1S(bfm, emailRestrictionAction, AnonymousClass001.A1O(iA0T));
                Object objAaT2 = bfm.AaT();
                if (zA1S || objAaT2 == obj) {
                    objAaT2 = new EmailRestrictionCardKt$EmailRestrictionCard$1$2$1(g0u, emailRestrictionAction);
                    bfm.Ai0(objAaT2);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str2, null, bRgA002, null, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201301);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(emailRestrictionNotice, g0u, bRgA0Q, i, i2);
        }
    }
}
