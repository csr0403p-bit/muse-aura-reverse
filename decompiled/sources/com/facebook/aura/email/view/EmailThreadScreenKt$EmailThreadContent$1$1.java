package com.facebook.aura.email.view;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0CD;
import X.C1515AkP;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailThread;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailThreadScreenKt$EmailThreadContent$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ List<EmailMessage> $messages;
    public final /* synthetic */ EmailThread $thread;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final List<EmailMessage> list = this.$messages;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final String str = this.$environmentId;
        final EmailThread emailThread = this.$thread;
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadContent$1$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadContent$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                list.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadContent$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                EmailMessage emailMessage = (EmailMessage) list.get(i);
                bfm.AgE(-27829022);
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                if (i > 0) {
                    bfm.AgE(719150714);
                    AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                } else {
                    bfm.AgE(818848149);
                }
                BBI.A0R(bbi, false);
                EmailThreadScreenKt.EmailMessageCard(emailMessage, str, emailThread.summary.subject, null, bfm, 0, 8);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), list.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailThreadScreenKt$EmailThreadContent$1$1(List<EmailMessage> list, String str, EmailThread emailThread) {
        super(1);
        this.$messages = list;
        this.$environmentId = str;
        this.$thread = emailThread;
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<Integer, EmailMessage, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final Object invoke(int i, EmailMessage emailMessage) {
            C7384Etj.A0Y(emailMessage, 1);
            return emailMessage.id;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, EmailMessage emailMessage) {
            AnonymousClass005.A0w(num);
            EmailMessage emailMessage2 = emailMessage;
            C7384Etj.A0Y(emailMessage2, 1);
            return emailMessage2.id;
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
