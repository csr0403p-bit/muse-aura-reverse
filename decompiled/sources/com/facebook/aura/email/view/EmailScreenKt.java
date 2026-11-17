package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AZ3;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0v5;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3IL;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.icu.text.DateFormat;
import android.icu.util.Calendar;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailRestrictionAction;
import com.facebook.aura.email.model.EmailRestrictionActionKind;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import com.facebook.aura.email.model.EmailSummary;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailInboxEntryPoint;
import com.facebook.aura.email.viewmodel.EmailInboxSessionViewModel;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyleConfig;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailInboxHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
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
            EmailScreenKt.EmailInboxHeader(this.$environmentId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C117772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ EmailSummary $summary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117772(EmailSummary emailSummary, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$summary = emailSummary;
            this.$onClick = function0;
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
            EmailScreenKt.EmailRow(this.$summary, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailSetupLaunchEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C117782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $action;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailViewModel $model;
        public final /* synthetic */ Function0<Unit> $onHandled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117782(String str, EmailViewModel emailViewModel, String str2, Function0<Unit> function0, int i) {
            super(2);
            this.$environmentId = str;
            this.$model = emailViewModel;
            this.$action = str2;
            this.$onHandled = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailScreenKt.EmailSetupLaunchEffect(this.$environmentId, this.$model, this.$action, this.$onHandled, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailScreenKt$EmailSetupPromptContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C117792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ Function0<Unit> $onCreate;
        public final /* synthetic */ EmailRestrictionNotice $takenDownNotice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117792(String str, EmailRestrictionNotice emailRestrictionNotice, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$takenDownNotice = emailRestrictionNotice;
            this.$onCreate = function0;
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
            EmailScreenKt.EmailSetupPromptContent(this.$name, this.$takenDownNotice, this.$onCreate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: EmailInbox-nSlTg7c, reason: not valid java name */
    public static final void m752EmailInboxnSlTg7c(String str, EmailState emailState, EmailViewModel emailViewModel, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-143834870);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, emailState);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, emailViewModel);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            EmailInboxSessionViewModel emailInboxSessionViewModelRememberEmailInboxSession = rememberEmailInboxSession(bfm, 0);
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            if (emailState.nextCursor != null) {
                bfm.AgE(1393091387);
                boolean zA1M = AnonymousClass003.A1M(bfm, emailState, emailViewModel);
                Object objAaT = bfm.AaT();
                if (zA1M || objAaT == C78N.A00) {
                    objAaT = new EmailScreenKt$EmailInbox$1$1(emailState, emailViewModel);
                    bfm.Ai0(objAaT);
                }
                AutoLoadMoreKt.AutoLoadMore(lazyListStateA00, 0, (Function0<Unit>) objAaT, bfm, 0, 1);
            } else {
                bfm.AgE(1393273016);
            }
            AnonymousClass001.A1D(bfm);
            boolean z = emailState.pullRefreshing;
            boolean zA67 = bfm.A67(emailViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new EmailScreenKt$EmailInbox$2$1(emailViewModel);
                bfm.Ai0(objAaT2);
            }
            HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(z, (Function0) objAaT2, AnonymousClass001.A0T(bRg2), 0.0f, null, B1V.A00(bfm, new EmailScreenKt$EmailInbox$3(f, f2, lazyListStateA00, emailState, emailInboxSessionViewModelRememberEmailInboxSession, auraNavigatorA0b, str, emailViewModel), 1959732454), bfm, 196608, 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new EmailScreenKt$EmailInbox$4(str, emailState, emailViewModel, f, f2, bRg2, i, i2);
        }
    }

    public static final void EmailInboxHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1145037334);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            EmailInboxSessionViewModel emailInboxSessionViewModelRememberEmailInboxSession = rememberEmailInboxSession(bfm, 0);
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0R(bRg2), 16.0f, 0.0f, 4.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120974);
            C1822Arm c1822ArmA0X = C06G.A0X(bfm);
            BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailScreenKt$EmailInboxHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgAiP, objAaT, false), 0L, c1822ArmA0X, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.settings_gear_android_wght400_outline_24, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyleConfig auraIconButtonStyleConfig = new AuraIconButtonStyleConfig(C06G.A0C(bfm), B6A.A06, null, false, 0.0f);
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1209ad);
            boolean zA1M = AnonymousClass003.A1M(bfm, emailInboxSessionViewModelRememberEmailInboxSession, auraNavigatorA0b) | AnonymousClass002.A1O(iA0d & 14);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new EmailScreenKt$EmailInboxHeader$1$2$1(emailInboxSessionViewModelRememberEmailInboxSession, auraNavigatorA0b, str);
                bfm.Ai0(objAaT2);
            }
            AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyleConfig, strA0v, (Function0) objAaT2, null, false, null, null, auraIconButtonBackground, null, "email-inbox-settings", bfm, AnonymousClass001.A03(), 390, 3009);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, i, i2);
        }
    }

    public static final void EmailRow(EmailSummary emailSummary, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(357407180);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailSummary) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA0B = C3U4.A0B(C0v5.A04(C1b8.A01(bRgA0R, C06G.A0K(bfm, akh)), new C1YD(0), null, function0, true), 16.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1AC c1ac = C2VU.A04;
            C9m9 c9m9A00 = AcQ.A00(2.0f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0b, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            EmailMessage emailMessage = emailSummary.lastMessage;
            if ("OUTBOUND".equals(emailMessage.direction) && "SUBMITTED".equals(emailMessage.deliveryStatus)) {
                bfm.AgE(926475175);
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.arrowupright_outline_24_wght500, 0), 20.0f, AbstractC2271BQs.A01(bfm, R.string.email_sent), C06G.A0L(bfm, akh), null, bfm, AnonymousClass001.A03(), 33);
            } else {
                bfm.AgE(926729840);
            }
            BBI.A0R(bbi, false);
            String party = emailSummary.getParty();
            AKH<AuraTypography> akh2 = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(party, AnonymousClass001.A0O(c90m, bs0, true), 0L, AnonymousClass001.A0g(bfm, akh2).bodyEmphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14836);
            AuraTextKt.m2639AuraTextUY9GdpU(emailListDay(emailSummary.lastMessage.createdAt), C3U4.A0C(bs0, 4.0f, 0.0f, 0.0f, 0.0f), C06G.A09(bfm), AnonymousClass001.A0g(bfm, akh2).subheadlineRegular, null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306416, 0, 15856);
            BBI.A0R(bbi, true);
            bfm.AgE(1656387695);
            String strA01 = emailSummary.subject;
            if (strA01.length() == 0) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120983);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, 0L, AnonymousClass001.A0g(bfm, akh2).getSubheadlineCompactRegular(), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14838);
            String str = emailSummary.lastMessage.preview;
            if (str.length() > 0) {
                bfm.AgE(-191279408);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh2).getSubheadlineCompactRegular(), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            } else {
                bfm.AgE(-191062036);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117772(emailSummary, function0, bRg2, i, i2);
        }
    }

    /* renamed from: EmailScreen-X35cekY, reason: not valid java name */
    public static final void m753EmailScreenX35cekY(float f, float f2, String str, Function0<Unit> function0, EmailInboxEntryPoint emailInboxEntryPoint, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> emailScreenKt$EmailScreen$4;
        BRg bRg2 = bRg;
        int iA0D = AnonymousClass002.A0D(function0, emailInboxEntryPoint, 3);
        bfm.AgG(880701365);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A0G(bfm, emailInboxEntryPoint.ordinal());
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA04 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA04 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA04, 74898), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            EmailInboxSessionViewModel emailInboxSessionViewModelRememberEmailInboxSession = rememberEmailInboxSession(bfm, 0);
            boolean zA67 = bfm.A67(emailInboxSessionViewModelRememberEmailInboxSession) | AnonymousClass003.A1F(57344, iA04, 16384);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailScreenKt$EmailScreen$1$1(emailInboxSessionViewModelRememberEmailInboxSession, emailInboxEntryPoint);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, emailInboxSessionViewModelRememberEmailInboxSession);
            String str2 = EmailComponentsKt.emailEnvironmentState(bfm, 0).environmentId;
            if (str2 == null) {
                bfm.AgE(-980388212);
                EmailComponentsKt.EmailErrorMessage(EmailError.LOAD, bRg2, bfm, ((iA04 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    emailScreenKt$EmailScreen$4 = new EmailScreenKt$EmailScreen$2(f, f2, str, function0, emailInboxEntryPoint, bRg2, i, i2);
                    bBbAAc.A06 = emailScreenKt$EmailScreen$4;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -980325747);
            EmailComponentsKt.EmailEnvironment(str2, bRg2, null, B1V.A00(bfm, new EmailScreenKt$EmailScreen$3(str2, str, function0, f, f2, emailInboxSessionViewModelRememberEmailInboxSession), 1297927123), bfm, ((iA04 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 3072, iA0D);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            emailScreenKt$EmailScreen$4 = new EmailScreenKt$EmailScreen$4(f, f2, str, function0, emailInboxEntryPoint, bRg2, i, i2);
            bBbAAc.A06 = emailScreenKt$EmailScreen$4;
        }
    }

    /* renamed from: EmailSetupPrompt-cmh-DWc, reason: not valid java name */
    public static final void m754EmailSetupPromptcmhDWc(float f, float f2, BRg bRg, EmailRestrictionNotice emailRestrictionNotice, Function0<Unit> function0, BFM bfm, int i, int i2) {
        EmailRestrictionNotice emailRestrictionNotice2 = emailRestrictionNotice;
        Function0<Unit> function02 = function0;
        BRg bRg2 = bRg;
        bfm.AgG(1186483567);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA04 |= 3072;
        } else if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0W(bfm, emailRestrictionNotice2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA04 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A0X(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA04), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                emailRestrictionNotice2 = null;
            }
            if (i5 != 0) {
                function02 = null;
            }
            C3IL.A00(bfm, null, AbstractC07539Wl.A00(AnonymousClass001.A0T(bRg2), "email-setup"), B1V.A00(bfm, new EmailScreenKt$EmailSetupPrompt$1(emailRestrictionNotice2, function02, AnonymousClass002.A0H(bfm), f, f2, C2CK.A02(bfm, AnonymousClass007.A0N(bfm).aiIdentityName)), 968096729), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new EmailScreenKt$EmailSetupPrompt$2(f, f2, bRg2, emailRestrictionNotice2, function02, i, i2);
        }
    }

    public static final void EmailSetupPromptContent(String str, EmailRestrictionNotice emailRestrictionNotice, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        boolean z;
        String strA0v;
        String strA0t;
        String strA0s;
        BRg bRg2 = bRg;
        bfm.AgG(-1415368847);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, emailRestrictionNotice);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, 4.0f), bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            if (emailRestrictionNotice == null) {
                bfm.AgE(-388820285);
                z = true;
                AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.email_illustration, 0), 65.0f, null, B6A.A07, null, bfm, (AVy.$stable << 3) | 28032, 33);
            } else {
                z = true;
                bfm.AgE(-388631929);
            }
            BBI.A0R(bbi, false);
            if (emailRestrictionNotice == null || (strA0v = emailRestrictionNotice.title) == null) {
                bfm.AgE(957296829);
                strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12095c);
            } else {
                bfm.AgE(957295651);
            }
            BBI.A0R(bbi, false);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyMedium, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16310);
            if (emailRestrictionNotice == null || (strA0t = emailRestrictionNotice.body) == null) {
                bfm.AgE(957303474);
                strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f12095b);
            } else {
                bfm.AgE(957302699);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, C06G.A08(bfm), C06G.A0a(bfm, akh), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            if (emailRestrictionNotice == null) {
                bfm.AgE(957311850);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120949);
            } else {
                bfm.AgE(-387912574);
                BBI.A0R(bbi, false);
                EmailRestrictionAction emailRestrictionAction = emailRestrictionNotice.action;
                if (emailRestrictionAction != null && emailRestrictionAction.kind == EmailRestrictionActionKind.CREATE_EMAIL) {
                    strA0s = emailRestrictionAction.label;
                }
                bfm.AgE(-387650841);
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, z);
            }
            if (strA0s != null) {
                bfm.AgE(-387870910);
                BS0 bs0 = BRg.A00;
                C01N.A08(bfm, bs0, 8.0f);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, AbstractC07539Wl.A00(bs0, "email-setup-create"), null, AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d << 6) & 57344, 0, 134201301);
            } else {
                bfm.AgE(-387650841);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117792(str, emailRestrictionNotice, function0, bRg2, i, i2);
        }
    }

    public static final EmailInboxSessionViewModel rememberEmailInboxSession(BFM bfm, int i) {
        EmailInboxSessionViewModel.Factory factory = new EmailInboxSessionViewModel.Factory();
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (EmailInboxSessionViewModel) AnonymousClass004.A14(factory, bodA00, AnonymousClass005.A0Y(bodA00), EmailInboxSessionViewModel.class);
        }
        throw AnonymousClass001.A0o();
    }

    public static final void EmailSetupLaunchEffect(String str, EmailViewModel emailViewModel, String str2, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(1031646774);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, emailViewModel);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            EmailInboxSessionViewModel emailInboxSessionViewModelRememberEmailInboxSession = rememberEmailInboxSession(bfm, 0);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, emailInboxSessionViewModelRememberEmailInboxSession, auraNavigatorA0b, AnonymousClass001.A1T(bfm, emailViewModel, AnonymousClass003.A1D(iA0d)), AnonymousClass003.A1E(iA0d)) | AnonymousClass001.A1L(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new EmailScreenKt$EmailSetupLaunchEffect$1$1(str2, emailViewModel, function0, emailInboxSessionViewModelRememberEmailInboxSession, auraNavigatorA0b, str, null);
                bfm.Ai0(objAaT);
            }
            C78e.A02(bfm, emailViewModel, str2, auraNavigatorA0b, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117782(str, emailViewModel, str2, function0, i);
        }
    }

    public static final String emailListDay(double d) {
        Date date = new Date((long) (d * 1000.0d));
        Locale locale = Locale.getDefault();
        Calendar calendar = Calendar.getInstance(locale);
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTime(date);
        int i = calendar.get(20) - calendar2.get(20);
        String str = DateFormat.getInstanceForSkeleton(i == 0 ? "jmm" : (1 > i || i >= 7) ? calendar.get(1) == calendar2.get(1) ? "MMMd" : "yMMMd" : "EEE", locale).format(date);
        C7384Etj.A0U(str);
        return str;
    }
}
