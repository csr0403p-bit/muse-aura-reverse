package com.facebook.aura.email.view;

import X.AFz;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AXN;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
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
import X.BIj;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DP;
import X.C1EQ;
import X.C1OM;
import X.C1YY;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3TQ;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90l;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.email.model.EmailChatDraft;
import com.facebook.aura.email.model.EmailMailbox;
import com.facebook.aura.email.model.EmailMessage;
import com.facebook.aura.email.model.EmailThread;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailThreadExit;
import com.facebook.aura.email.viewmodel.EmailThreadSessionViewModel;
import com.facebook.aura.email.viewmodel.EmailThreadUiState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailThreadScreenKt {

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailMessageAvatar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $outbound;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$outbound = z;
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
            EmailThreadScreenKt.EmailMessageAvatar(this.$outbound, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailMessageCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ EmailMessage $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $threadSubject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EmailMessage emailMessage, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$message = emailMessage;
            this.$environmentId = str;
            this.$threadSubject = str2;
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
            EmailThreadScreenKt.EmailMessageCard(this.$message, this.$environmentId, this.$threadSubject, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C118072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C3TQ $contentPadding;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailThread $thread;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118072(EmailThread emailThread, String str, C3TQ c3tq, BRg bRg, int i, int i2) {
            super(2);
            this.$thread = emailThread;
            this.$environmentId = str;
            this.$contentPadding = c3tq;
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
            EmailThreadScreenKt.EmailThreadContent(this.$thread, this.$environmentId, this.$contentPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ EmailThread $thread;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EmailThread emailThread, BRg bRg, int i, int i2) {
            super(2);
            this.$thread = emailThread;
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
            EmailThreadScreenKt.EmailThreadHeader(this.$thread, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C118082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118082(String str, BRg bRg, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$content = g2j;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailThreadScreenKt.EmailThreadPage(this.$title, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C118092 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ String $loadKey;
        public final /* synthetic */ String $threadId;
        public final /* synthetic */ EmailThreadSessionViewModel $threadSession;

        /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadScreen$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
            public final /* synthetic */ String $environmentId;
            public final /* synthetic */ String $loadKey;
            public final /* synthetic */ EmailViewModel $model;
            public final /* synthetic */ C1BO<EmailState> $state$delegate;
            public final /* synthetic */ String $threadId;
            public final /* synthetic */ EmailThreadUiState $threadState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(EmailThreadUiState emailThreadUiState, EmailViewModel emailViewModel, String str, String str2, String str3, C1BO<EmailState> c1bo) {
                super(4);
                this.$threadState = emailThreadUiState;
                this.$model = emailViewModel;
                this.$threadId = str;
                this.$loadKey = str2;
                this.$environmentId = str3;
                this.$state$delegate = c1bo;
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
                m763invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-i1RSzL4, reason: not valid java name */
            public final void m763invokei1RSzL4(float f, float f2, BFM bfm, int i) {
                int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
                if ((i & 48) == 0) {
                    iA04 |= AnonymousClass004.A05(bfm, f2);
                }
                boolean z = false;
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                    bfm.Afo();
                    return;
                }
                EmailThreadUiState emailThreadUiState = this.$threadState;
                if (C7384Etj.areEqual(emailThreadUiState, EmailThreadUiState.Loading.INSTANCE)) {
                    bfm.AgE(-441592265);
                    HatchScreenLoadingStateKt.HatchScreenLoadingState(C10G.A01, bfm, 6, 0);
                } else if (C7384Etj.areEqual(emailThreadUiState, EmailThreadUiState.Error.INSTANCE)) {
                    bfm.AgE(-441589073);
                    EmailError emailError = EmailError.LOAD;
                    boolean zA1R = AnonymousClass001.A1R(bfm, this.$loadKey, AnonymousClass001.A1R(bfm, this.$threadId, bfm.A67(this.$model)));
                    EmailViewModel emailViewModel = this.$model;
                    String str = this.$threadId;
                    String str2 = this.$loadKey;
                    Object objAaT = bfm.AaT();
                    if (zA1R || objAaT == C78N.A00) {
                        objAaT = new EmailThreadScreenKt$EmailThreadScreen$2$3$1$1(emailViewModel, str, str2);
                        bfm.Ai0(objAaT);
                    }
                    EmailComponentsKt.EmailRetry(emailError, (Function0) objAaT, C3U4.A04(BRg.A00, f), bfm, 6, 0);
                } else {
                    if (!(emailThreadUiState instanceof EmailThreadUiState.Loaded)) {
                        throw AnonymousClass005.A0k(bfm, -441593585);
                    }
                    bfm.AgE(-441581968);
                    EmailThreadUiState.Loaded loaded = (EmailThreadUiState.Loaded) this.$threadState;
                    String str3 = this.$environmentId;
                    EmailMailbox emailMailbox = C1BO.A06(this.$state$delegate).mailbox;
                    if (emailMailbox != null && emailMailbox.getRequiresSenderNameChange()) {
                        z = true;
                    }
                    EmailThreadScreenKt.m758EmailLoadedThreadnSlTg7c(loaded, str3, z, f, f2, null, bfm, (iA04 << 9) & 64512, 32);
                }
                AnonymousClass002.A19(bfm);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118092(String str, String str2, EmailThreadSessionViewModel emailThreadSessionViewModel, String str3) {
            super(4);
            this.$threadId = str;
            this.$loadKey = str2;
            this.$threadSession = emailThreadSessionViewModel;
            this.$environmentId = str3;
        }

        public final void invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, int i) {
            boolean zA1b = AnonymousClass004.A1b(emailViewModel, bRg);
            C1BO c1boA02 = C2CK.A02(bfm, emailViewModel.state);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            String str = this.$threadId;
            String str2 = this.$loadKey;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$loadKey, AnonymousClass001.A1R(bfm, this.$threadId, bfm.A67(emailViewModel)));
            String str3 = this.$threadId;
            String str4 = this.$loadKey;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new EmailThreadScreenKt$EmailThreadScreen$2$1$1(emailViewModel, str3, str4);
                bfm.Ai0(objAaT);
            }
            C78e.A01(bfm, emailViewModel, str, str2, (G0U) objAaT);
            String str5 = C1BO.A06(c1boA02).deletedThreadKey;
            String str6 = this.$loadKey;
            boolean zA1T = AnonymousClass004.A1T(bfm, this.$threadSession, auraNavigatorA0b, AnonymousClass001.A1R(bfm, this.$loadKey, bfm.A65(c1boA02)));
            String str7 = this.$loadKey;
            EmailThreadSessionViewModel emailThreadSessionViewModel = this.$threadSession;
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                objAaT2 = new EmailThreadScreenKt$EmailThreadScreen$2$2$1(str7, emailThreadSessionViewModel, auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, str5, str6);
            EmailThreadScreenKt.EmailThreadPage("", bRg, B1V.A00(bfm, new AnonymousClass3(C1BO.A06(c1boA02).threadUiState, emailViewModel, this.$threadId, this.$loadKey, this.$environmentId, c1boA02), -1926714360), bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, zA1b ? 1 : 0);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
            invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailThreadScreenKt$EmailThreadScreen$3, reason: invalid class name and case insensitive filesystem */
    public final class C118103 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $threadId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118103(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$threadId = str2;
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
            EmailThreadScreenKt.EmailThreadScreen(this.$environmentId, this.$threadId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailMessageAvatar(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(249519106);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(-1164604196);
                AuraImageKt.AuraImage(AnonymousClass007.A0N(bfm).rememberDefaultAvatarSource(null, bfm, HatchIdentityProvider.$stable << 3, 1), C11U.A02(bRg2, 36.0f), null, null, false, false, null, false, null, bfm, 384, 504);
            } else {
                bfm.AgE(-1164331613);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.user_outline_24_wght400, 0);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                AuraIconKt.m2568AuraIconFyETyZw(C3U4.A09(C1b8.A03(bRg2, C1D8.A00, AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground), 8.0f), aVyA00, 20.0f, null, C06G.A0L(bfm, akh), null, bfm, AnonymousClass001.A04(), 32);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, bRg2, i, i2);
        }
    }

    public static final void EmailThreadScreen(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        int iA1b = AnonymousClass004.A1b(str, str2);
        bfm.AgG(-549961972);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[iA1b];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = EmailThreadScreenKt$EmailThreadScreen$loadKey$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            Object objA03 = AFz.A03(bfm, (Function0) objAaT, objArr);
            C7384Etj.A0U(objA03);
            String str3 = (String) objA03;
            EmailThreadSessionViewModel emailThreadSessionViewModelRememberEmailThreadSession = rememberEmailThreadSession(bfm, iA1b);
            boolean zA67 = bfm.A67(emailThreadSessionViewModelRememberEmailThreadSession) | AnonymousClass001.A1O(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new EmailThreadScreenKt$EmailThreadScreen$1$1(emailThreadSessionViewModelRememberEmailThreadSession, str2);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, emailThreadSessionViewModelRememberEmailThreadSession, str2);
            EmailComponentsKt.EmailEnvironment(str, bRg2, ComposableSingletons$EmailThreadScreenKt.f48lambda$1785584697, B1V.A00(bfm, new C118092(str2, str3, emailThreadSessionViewModelRememberEmailThreadSession, str), 1127351978), bfm, (iA0d & 14) | 3456 | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), iA1b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118103(str, str2, bRg2, i, i2);
        }
    }

    public static final boolean isSameDay(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    /* renamed from: EmailLoadedThread-nSlTg7c, reason: not valid java name */
    public static final void m758EmailLoadedThreadnSlTg7c(EmailThreadUiState.Loaded loaded, String str, boolean z, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        float f3;
        BRg bRg2 = bRg;
        bfm.AgG(-1250193557);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, loaded) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A08(bfm, f2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, C1DG.A03());
            }
            MutableState mutableState = (MutableState) objAaT;
            if (loaded.replyTarget == null || loaded.forwardTarget == null) {
                f3 = f2;
            } else {
                C1DG c1dg = new C1DG(f2);
                C1DG c1dg2 = new C1DG(EmailLoadedThread_nSlTg7c$lambda$1(mutableState));
                if (c1dg.compareTo(c1dg2) >= 0) {
                    c1dg2 = c1dg;
                }
                f3 = c1dg2.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0T(bRg2), 0.0f, f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            EmailThreadHeader(loaded.thread, null, bfm, 0, 2);
            BS0 bs0 = BRg.A00;
            BRg bRgA0R = AnonymousClass001.A0R(c90l.AiP(bs0, 1.0f, true));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0R);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            EmailThreadContent(loaded.thread, str, new C1DP(0.0f, 0.0f, 0.0f, f3), null, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 8);
            BRg bRgA4C = c0z7.A4C(C2VU.A06, bs0);
            boolean zA65 = bfm.A65(axnA0Y);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new EmailThreadScreenKt$EmailLoadedThread$1$1$1$1(axnA0Y, mutableState);
                bfm.Ai0(objAaT2);
            }
            m759EmailThreadActions942rkJo(loaded, z, f2, BIj.A00(bRgA4C, (G0U) objAaT2), bfm, (iA0T & 14) | ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0T >> 6) & 896), 0);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new EmailThreadScreenKt$EmailLoadedThread$2(loaded, str, z, f, f2, bRg2, i, i2);
        }
    }

    public static final void EmailMessageCard(EmailMessage emailMessage, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-175808854);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailMessage) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), 20.0f);
            C9m9 c9m9A00 = AcQ.A00(12.0f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C9m9 c9m9A002 = AcQ.A00(8.0f);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(c9m9A002, bfm, C2VU.A05, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            EmailMessageAvatar("OUTBOUND".equals(emailMessage.direction), null, bfm, 0, 2);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String strA0t = AnonymousClass001.A0t(bfm, AbstractC0878AGe.A0L(", ", "", "", emailMessage.headerTo, null), R.string._name_removed__res_0x7f1209b1);
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            if (emailMessage.headerCc.isEmpty()) {
                bfm.AgE(711353576);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(711166181);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, AbstractC0878AGe.A0L(", ", "", "", emailMessage.headerCc, null), R.string._name_removed__res_0x7f120942), null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, emailMessage.headerFrom, R.string._name_removed__res_0x7f12096e), null, 0L, AnonymousClass001.A0g(bfm, akh).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            AuraTextKt.m2639AuraTextUY9GdpU(emailThreadTime(emailMessage.createdAt, bfm, 0), null, C06G.A08(bfm), AnonymousClass001.A0g(bfm, akh).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            int i5 = iA0T & 14;
            int i6 = iA0T >> 3;
            int i7 = iA0T << 3;
            EmailMessageMenuKt.EmailMessageMenu(emailMessage, str2, str, null, bfm, (i6 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i5 | (i7 & 896), 8);
            BBI.A0R(bbi, true);
            EmailMessageBodyKt.EmailMessageBody(emailMessage, null, bfm, i5, 2);
            EmailAttachmentsKt.EmailAttachments(str, emailMessage, null, bfm, (i6 & 14) | (i7 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(emailMessage, str, str2, bRg2, i, i2);
        }
    }

    /* renamed from: EmailThreadActions-942rkJo, reason: not valid java name */
    public static final void m759EmailThreadActions942rkJo(EmailThreadUiState.Loaded loaded, boolean z, float f, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> emailThreadScreenKt$EmailThreadActions$2;
        BRg bRg2 = bRg;
        bfm.AgG(-1372101248);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, loaded) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            EmailMessage emailMessage = loaded.replyTarget;
            if (emailMessage == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    emailThreadScreenKt$EmailThreadActions$2 = new EmailThreadScreenKt$EmailThreadActions$replyTarget$1(loaded, z, f, bRg2, i, i2);
                }
            } else {
                EmailMessage emailMessage2 = loaded.forwardTarget;
                if (emailMessage2 == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        emailThreadScreenKt$EmailThreadActions$2 = new EmailThreadScreenKt$EmailThreadActions$forwardTarget$1(loaded, z, f, bRg2, i, i2);
                    }
                } else {
                    String str = loaded.thread.summary.subject;
                    String str2 = emailMessage.subject;
                    if (str2.length() == 0) {
                        str2 = str;
                    }
                    EmailChatDraft emailChatDraftEmailReplyDraft = EmailMessageMenuKt.emailReplyDraft(emailMessage, str2, bfm, 0);
                    String str3 = emailMessage2.subject;
                    if (str3.length() != 0) {
                        str = str3;
                    }
                    EmailChatDraft emailChatDraftEmailForwardDraft = EmailMessageMenuKt.emailForwardDraft(emailMessage2, str, bfm, 0);
                    G0V<EmailChatDraft, EmailThreadExit, Unit> g0vRememberEmailDraftInChat = EmailMessageMenuKt.rememberEmailDraftInChat(bfm, 0);
                    BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                    Float fValueOf = Float.valueOf(0.0f);
                    AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                    BRg bRgA0C = C3U4.A0C(C1b8.A02(bRgA0R, C1EQ.A02(new HxE[]{AnonymousClass007.A0h(fValueOf, 0.0f, C06G.A0K(bfm, akh)), new HxE(Float.valueOf(0.3f), new B6A(C06G.A0K(bfm, akh))), new HxE(Float.valueOf(1.0f), new B6A(C06G.A0K(bfm, akh)))}, Float.POSITIVE_INFINITY), C1OM.A00), 16.0f, 28.0f, 16.0f, f + 12.0f);
                    InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, 12.0f, 6);
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
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
                    C90m c90m = C90m.A00;
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12099f);
                    AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                    AuraLabelButtonStyle auraLabelButtonStyleSecondary = auraButtonStyles.secondary(null, bfm, 48, 1);
                    boolean z2 = !z;
                    BS0 bs0 = BRg.A00;
                    BRg bRgA00 = AbstractC07539Wl.A00(c90m.AiP(bs0, 1.0f, true), "email-thread-reply");
                    boolean zA1J = AnonymousClass003.A1J(bfm, g0vRememberEmailDraftInChat, emailChatDraftEmailReplyDraft);
                    Object objAaT = bfm.AaT();
                    if (zA1J || objAaT == C78N.A00) {
                        objAaT = new EmailThreadScreenKt$EmailThreadActions$1$1$1(g0vRememberEmailDraftInChat, emailChatDraftEmailReplyDraft);
                        bfm.Ai0(objAaT);
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA00, auraLabelButtonStyleSecondary, null, null, false, false, z2, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134200805);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12096b);
                    AuraLabelButtonStyle auraLabelButtonStyleSecondary2 = auraButtonStyles.secondary(null, bfm, 48, 1);
                    BRg bRgA002 = AbstractC07539Wl.A00(c90m.AiP(bs0, 1.0f, true), "email-thread-forward");
                    boolean zA1J2 = AnonymousClass003.A1J(bfm, g0vRememberEmailDraftInChat, emailChatDraftEmailForwardDraft);
                    Object objAaT2 = bfm.AaT();
                    if (zA1J2 || objAaT2 == C78N.A00) {
                        objAaT2 = new EmailThreadScreenKt$EmailThreadActions$1$2$1(g0vRememberEmailDraftInChat, emailChatDraftEmailForwardDraft);
                        bfm.Ai0(objAaT2);
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgA002, auraLabelButtonStyleSecondary2, null, null, false, false, z2, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134200805);
                    BBI.A0R(bbi, true);
                }
            }
            bBbAAc.A06 = emailThreadScreenKt$EmailThreadActions$2;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            emailThreadScreenKt$EmailThreadActions$2 = new EmailThreadScreenKt$EmailThreadActions$2(loaded, z, f, bRg2, i, i2);
            bBbAAc.A06 = emailThreadScreenKt$EmailThreadActions$2;
        }
    }

    public static final void EmailThreadContent(EmailThread emailThread, String str, C3TQ c3tq, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1146658735);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailThread) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, c3tq);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            List listA0V = AbstractC0878AGe.A0V(emailThread.messages);
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0T(bRg2), "email-thread");
            boolean zA1V = AnonymousClass002.A1V(bfm, emailThread, bfm.A67(listA0V), AnonymousClass001.A1O(iA0T));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new EmailThreadScreenKt$EmailThreadContent$1$1(listA0V, str, emailThread);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c3tq, null, bfm, null, bRgA00, (G0U) objAaT, iA0T & 896, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118072(emailThread, str, c3tq, bRg2, i, i2);
        }
    }

    public static final void EmailThreadHeader(EmailThread emailThread, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2072457009);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, emailThread) | i : i;
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
            bfm.AgE(-1233635894);
            String strA01 = emailThread.summary.subject;
            if (strA01.length() == 0) {
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120983);
            }
            AnonymousClass001.A1D(bfm);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Emphasized;
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0R(bRg2), 20.0f, 0.0f, 20.0f, 8.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailThreadScreenKt$EmailThreadHeader$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), 0L, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(emailThread, bRg2, i, i2);
        }
    }

    public static final void EmailThreadPage(String str, BRg bRg, G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1520908253);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            EmailThreadSessionViewModel emailThreadSessionViewModelRememberEmailThreadSession = rememberEmailThreadSession(bfm, 0);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            boolean zA1M = AnonymousClass003.A1M(bfm, emailThreadSessionViewModelRememberEmailThreadSession, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new EmailThreadScreenKt$EmailThreadPage$1$1(emailThreadSessionViewModelRememberEmailThreadSession, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRg2, null, 0L, str, null, (Function0) objAaT, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, C06G.A00(bfm), null, null, null, 0, null, null, null, false, g2j, bfm, AnonymousClass001.A0B(iA0d << 12, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 0, (iA0d << 21) & 1879048192, 535822252);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C118082(str, bRg2, g2j, i, i2);
        }
    }

    public static final EmailThreadSessionViewModel rememberEmailThreadSession(BFM bfm, int i) {
        EmailThreadSessionViewModel.Factory factory = new EmailThreadSessionViewModel.Factory();
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (EmailThreadSessionViewModel) AnonymousClass004.A14(factory, bodA00, AnonymousClass005.A0Y(bodA00), EmailThreadSessionViewModel.class);
        }
        throw AnonymousClass001.A0o();
    }

    public static final float EmailLoadedThread_nSlTg7c$lambda$1(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final String emailThreadTime(double d, BFM bfm, int i) {
        String strA0w;
        bfm.AgE(1565828952);
        Date date = new Date((long) (d * 1000.0d));
        Locale locale = Locale.getDefault();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        Object objClone = calendar2.clone();
        C7384Etj.A0Z(objClone, "null cannot be cast to non-null type android.icu.util.Calendar");
        Calendar calendar3 = (Calendar) objClone;
        calendar3.add(6, -1);
        RelativeDateTimeFormatter.Direction direction = isSameDay(calendar, calendar2) ? RelativeDateTimeFormatter.Direction.THIS : isSameDay(calendar, calendar3) ? RelativeDateTimeFormatter.Direction.LAST : null;
        if (direction == null) {
            strA0w = DateFormat.getDateTimeInstance(2, 3, locale).format(date);
            C7384Etj.A0U(strA0w);
        } else {
            String str = RelativeDateTimeFormatter.getInstance(ULocale.forLocale(locale), null, RelativeDateTimeFormatter.Style.LONG, DisplayContext.CAPITALIZATION_FOR_BEGINNING_OF_SENTENCE).format(direction, RelativeDateTimeFormatter.AbsoluteUnit.DAY);
            C7384Etj.A0X(str);
            String str2 = DateFormat.getTimeInstance(3, locale).format(date);
            C7384Etj.A0U(str2);
            strA0w = AnonymousClass006.A0w(bfm, str, str2, R.string._name_removed__res_0x7f12094d);
        }
        AnonymousClass002.A19(bfm);
        return strA0w;
    }
}
