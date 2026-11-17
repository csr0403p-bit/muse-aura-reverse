package com.facebook.aura.email.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C02i;
import X.C06G;
import X.C06I;
import X.C0AU;
import X.C0CD;
import X.C1515AkP;
import X.C1Z5;
import X.C2VU;
import X.C3TH;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailInbox$3$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $environmentId;
    public final /* synthetic */ EmailInboxSessionViewModel $inboxSession;
    public final /* synthetic */ EmailViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ EmailState $state;

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ String $environmentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(3);
            this.$environmentId = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                EmailScreenKt.EmailInboxHeader(this.$environmentId, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EmailState emailState, EmailViewModel emailViewModel) {
            super(3);
            this.$state = emailState;
            this.$model = emailViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                EmailError emailError = this.$state.error;
                EmailViewModel emailViewModel = this.$model;
                boolean zA67 = bfm.A67(emailViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new EmailScreenKt$EmailInbox$3$1$1$3$1$1(emailViewModel);
                    bfm.Ai0(objAaT);
                }
                EmailComponentsKt.EmailRetry(emailError, (Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ EmailState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(EmailState emailState) {
            super(3);
            this.$state = emailState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            String str;
            int iA0d = i;
            C7384Etj.A0Y(anonymousClass037, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, anonymousClass037);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                BRg bRgA0R = AnonymousClass001.A0R(BRg.A00.then(new C1Z5(null, ((C0AU) anonymousClass037).A00, "fillParentMaxHeight", 0.65f)));
                C3TH c3th = C2VU.A00;
                C02i c02i = AcQ.A02;
                EmailState emailState = this.$state;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c02i, bfm, c3th, 54);
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
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                EmailMailbox emailMailbox = emailState.mailbox;
                if (emailMailbox == null || (str = emailMailbox.emailAddress) == null) {
                    str = "";
                }
                AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120982), null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        EmailRestrictionNotice senderNameNotice;
        C7384Etj.A0Y(c0cd, 0);
        EmailMailbox emailMailbox = this.$state.mailbox;
        if (emailMailbox != null && (senderNameNotice = emailMailbox.getSenderNameNotice()) != null) {
            c0cd.APJ("restriction", null, B1V.A01(new EmailScreenKt$EmailInbox$3$1$1$1$1(senderNameNotice, this.$inboxSession, this.$navigator, this.$environmentId), 1883122386, true));
        }
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass2(this.$environmentId), -1344484677, true));
        EmailState emailState = this.$state;
        if (emailState.error != null) {
            c0cd.APJ(null, null, B1V.A01(new AnonymousClass3(emailState, this.$model), 1003046422, true));
        }
        if (this.$state.threads.isEmpty()) {
            EmailState emailState2 = this.$state;
            if (emailState2.error == null && emailState2.hasLoaded) {
                c0cd.APJ(null, null, B1V.A01(new AnonymousClass4(emailState2), -375987059, true));
            }
        }
        final AHD<EmailSummary> ahd = this.$state.threads;
        final AnonymousClass5 anonymousClass5 = AnonymousClass5.INSTANCE;
        final EmailViewModel emailViewModel = this.$model;
        final EmailInboxSessionViewModel emailInboxSessionViewModel = this.$inboxSession;
        final AuraNavigator auraNavigator = this.$navigator;
        final String str = this.$environmentId;
        c0cd.APL(anonymousClass5 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$invoke$$inlined$itemsIndexed$default$1
            public final Object invoke(int i) {
                return AnonymousClass006.A0n(Integer.valueOf(i), ahd, anonymousClass5, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return null;
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$invoke$$inlined$itemsIndexed$default$3
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                EmailSummary emailSummary = (EmailSummary) ahd.get(i);
                bfm.AgE(639157038);
                EmailSwipeRowKt.EmailSwipeRow(emailSummary, emailViewModel, null, B1V.A00(bfm, new EmailScreenKt$EmailInbox$3$1$1$6$1(emailSummary, i, emailInboxSessionViewModel, auraNavigator, str), -143052927), bfm, 3072, 4);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996, true), ahd.size());
        if (this.$state.loadingMore) {
            c0cd.APJ("loading-more", null, ComposableSingletons$EmailScreenKt.lambda$1571743374);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailInbox$3$1$1(EmailState emailState, EmailInboxSessionViewModel emailInboxSessionViewModel, AuraNavigator auraNavigator, String str, EmailViewModel emailViewModel) {
        super(1);
        this.$state = emailState;
        this.$inboxSession = emailInboxSessionViewModel;
        this.$navigator = auraNavigator;
        this.$environmentId = str;
        this.$model = emailViewModel;
    }

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailInbox$3$1$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<Integer, EmailSummary, Object> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(2);
        }

        public final Object invoke(int i, EmailSummary emailSummary) {
            C7384Etj.A0Y(emailSummary, 1);
            return emailSummary.id;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, EmailSummary emailSummary) {
            AnonymousClass005.A0w(num);
            EmailSummary emailSummary2 = emailSummary;
            C7384Etj.A0Y(emailSummary2, 1);
            return emailSummary2.id;
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
