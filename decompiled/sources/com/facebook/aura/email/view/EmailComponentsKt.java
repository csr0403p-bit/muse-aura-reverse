package com.facebook.aura.email.view;

import X.AKH;
import X.AKQ;
import X.ARD;
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
import X.AuJ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C19h;
import X.C19i;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.email.viewmodel.EmailEnvironmentState;
import com.facebook.aura.email.viewmodel.EmailEnvironmentViewModel;
import com.facebook.aura.email.viewmodel.EmailError;
import com.facebook.aura.email.viewmodel.EmailState;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class EmailComponentsKt {

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailCardField$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $inputModifier;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onChange;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $supporting;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, boolean z, G0U<? super String, Unit> g0u, BRg bRg, AuJ auJ, C19h c19h, BRg bRg2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2) {
            super(2);
            this.$label = str;
            this.$value = str2;
            this.$enabled = z;
            this.$onChange = g0u;
            this.$modifier = bRg;
            this.$keyboardOptions = auJ;
            this.$visualTransformation = c19h;
            this.$inputModifier = bRg2;
            this.$trailingIcon = g0v;
            this.$supporting = g0v2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailComponentsKt.EmailCardField(this.$label, this.$value, this.$enabled, this.$onChange, this.$modifier, this.$keyboardOptions, this.$visualTransformation, this.$inputModifier, this.$trailingIcon, this.$supporting, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailEnvironment$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G2j<EmailViewModel, BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ G2j<EmailError, BRg, BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, BRg bRg, G2j<? super EmailError, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, G2j<? super EmailViewModel, ? super BRg, ? super BFM, ? super Integer, Unit> g2j2, int i, int i2) {
            super(2);
            this.$environmentId = str;
            this.$modifier = bRg;
            this.$errorContent = g2j;
            this.$content = g2j2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailComponentsKt.EmailEnvironment(this.$environmentId, this.$modifier, this.$errorContent, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailErrorMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C117571 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailError $error;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117571(EmailError emailError, BRg bRg, int i, int i2) {
            super(2);
            this.$error = emailError;
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
            EmailComponentsKt.EmailErrorMessage(this.$error, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailErrorMessage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailError $error;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EmailError emailError, BRg bRg, int i, int i2) {
            super(2);
            this.$error = emailError;
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
            EmailComponentsKt.EmailErrorMessage(this.$error, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailRetry$2, reason: invalid class name and case insensitive filesystem */
    public final class C117582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ EmailError $error;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117582(EmailError emailError, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$error = emailError;
            this.$onRetry = function0;
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
            EmailComponentsKt.EmailRetry(this.$error, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSettingsPage$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<EmailError, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ String $title;

        /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSettingsPage$4$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
            public final /* synthetic */ EmailError $error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(EmailError emailError) {
                super(4);
                this.$error = emailError;
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
                m749invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-i1RSzL4, reason: not valid java name */
            public final void m749invokei1RSzL4(float f, float f2, BFM bfm, int i) {
                if ((i & 6) == 0) {
                    i |= AnonymousClass004.A04(bfm, f);
                }
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 131, 130), bfm, i)) {
                    EmailComponentsKt.EmailErrorMessage(this.$error, C3U4.A09(C3U4.A04(BRg.A00, f), C06G.A00(bfm)), bfm, 0, 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, AuraNavigator auraNavigator) {
            super(4);
            this.$title = str;
            this.$navigator = auraNavigator;
        }

        public final void invoke(EmailError emailError, BRg bRg, BFM bfm, int i) {
            boolean zA1b = AnonymousClass004.A1b(emailError, bRg);
            int iA08 = (i & 6) == 0 ? i | AnonymousClass005.A08(bfm, emailError) : i;
            if ((i & 48) == 0) {
                iA08 |= AnonymousClass004.A0e(bfm, bRg);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
                bfm.Afo();
                return;
            }
            AuraContainer.SecondaryScreen secondaryScreen = AuraContainer.SecondaryScreen.INSTANCE;
            String str = this.$title;
            boolean zA67 = bfm.A67(this.$navigator);
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new EmailComponentsKt$EmailSettingsPage$4$1$1(auraNavigator);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(secondaryScreen, bRg, null, 0L, str, null, (Function0) objAaT, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new AnonymousClass2(emailError), 1170581536), bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, zA1b ? 1 : 0, 805306368, 536870828);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(EmailError emailError, BRg bRg, BFM bfm, Integer num) {
            invoke(emailError, bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSettingsPage$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<EmailViewModel, BRg, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $allowReset;
        public final /* synthetic */ G2j<C07C, EmailViewModel, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $contentFillsPage;
        public final /* synthetic */ G0W<EmailViewModel, BFM, Integer, Unit> $footer;
        public final /* synthetic */ G0U<EmailState, Boolean> $isBusy;
        public final /* synthetic */ G0U<EmailState, Boolean> $isRefreshing;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<EmailViewModel, Unit> $onBack;
        public final /* synthetic */ G0U<EmailViewModel, Unit> $onRefresh;
        public final /* synthetic */ G0U<EmailState, Boolean> $scrollable;
        public final /* synthetic */ String $title;

        /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSettingsPage$5$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
            public final /* synthetic */ G2j<C07C, EmailViewModel, BFM, Integer, Unit> $content;
            public final /* synthetic */ boolean $contentFillsPage;
            public final /* synthetic */ G0W<EmailViewModel, BFM, Integer, Unit> $footer;
            public final /* synthetic */ G0U<EmailState, Boolean> $isRefreshing;
            public final /* synthetic */ EmailViewModel $model;
            public final /* synthetic */ G0U<EmailViewModel, Unit> $onRefresh;
            public final /* synthetic */ boolean $resetBlocked;
            public final /* synthetic */ G0U<EmailState, Boolean> $scrollable;
            public final /* synthetic */ C1BO<EmailState> $state$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(boolean z, G0U<? super EmailState, Boolean> g0u, G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, boolean z2, EmailViewModel emailViewModel, C1BO<EmailState> c1bo, G2j<? super C07C, ? super EmailViewModel, ? super BFM, ? super Integer, Unit> g2j, G0U<? super EmailViewModel, Unit> g0u2, G0U<? super EmailState, Boolean> g0u3) {
                super(4);
                this.$contentFillsPage = z;
                this.$scrollable = g0u;
                this.$footer = g0w;
                this.$resetBlocked = z2;
                this.$model = emailViewModel;
                this.$state$delegate = c1bo;
                this.$content = g2j;
                this.$onRefresh = g0u2;
                this.$isRefreshing = g0u3;
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
                m750invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-i1RSzL4, reason: not valid java name */
            public final void m750invokei1RSzL4(float f, float f2, BFM bfm, int i) {
                BBI bbi;
                boolean z;
                int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
                if ((i & 48) == 0) {
                    iA04 |= AnonymousClass004.A05(bfm, f2);
                }
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                    bfm.Afo();
                    return;
                }
                if (this.$contentFillsPage) {
                    bfm.AgE(-609216687);
                    BS0 bs0 = BRg.A00;
                    BRg bRgA0C = C3U4.A0C(C10G.A01, 0.0f, f, 0.0f, f2);
                    G0U<EmailState, Boolean> g0u = this.$scrollable;
                    G0W<EmailViewModel, BFM, Integer, Unit> g0w = this.$footer;
                    boolean z2 = this.$resetBlocked;
                    EmailViewModel emailViewModel = this.$model;
                    C1BO<EmailState> c1bo = this.$state$delegate;
                    G2j<C07C, EmailViewModel, BFM, Integer, Unit> g2j = this.$content;
                    InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                    bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V != null) {
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                        z = true;
                        EmailComponentsKt.m746EmailSettingsScrolljIwJxvA(AnonymousClass001.A0R(C90l.A00.AiP(bs0, 1.0f, true)), null, false, 0.0f, AnonymousClass003.A1X(c1bo.getValue(), g0u), B1V.A00(bfm, new EmailComponentsKt$EmailSettingsPage$5$3$1$1(z2, g2j, emailViewModel), 2084111142), bfm, 196608, 14);
                        if (g0w == null || z2) {
                            bfm.AgE(1103794064);
                        } else {
                            bfm.AgE(2113815839);
                            AnonymousClass001.A1G(emailViewModel, bfm, g0w, 0);
                        }
                        BBI.A0R(bbi, false);
                        BBI.A0R(bbi, z);
                        BBI.A0R(bbi, false);
                        return;
                    }
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                bfm.AgE(-608775619);
                BS0 bs02 = BRg.A00;
                C1062ATq c1062ATq = C10G.A01;
                boolean z3 = this.$resetBlocked;
                G0U<EmailViewModel, Unit> g0u2 = this.$onRefresh;
                G0U<EmailState, Boolean> g0u3 = this.$isRefreshing;
                G0U<EmailState, Boolean> g0u4 = this.$scrollable;
                G0W<EmailViewModel, BFM, Integer, Unit> g0w2 = this.$footer;
                EmailViewModel emailViewModel2 = this.$model;
                C1BO<EmailState> c1bo2 = this.$state$delegate;
                G2j<C07C, EmailViewModel, BFM, Integer, Unit> g2j2 = this.$content;
                InterfaceC1380AiA interfaceC1380AiAA0U2 = AnonymousClass002.A0U(bfm);
                bbi = (BBI) bfm;
                int iA0J2 = AnonymousClass003.A0J(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U2, akqA042, bRgA012, iA0J2);
                    Function0 function03 = null;
                    z = true;
                    BRg bRgA0R = AnonymousClass001.A0R(C90l.A00.AiP(bs02, 1.0f, true));
                    if (z3) {
                        bfm.AgE(575986292);
                    } else {
                        bfm.AgE(576007652);
                        if (g0u2 == null) {
                            bfm.AgE(576007651);
                        } else {
                            bfm.AgE(576007652);
                            boolean zA1J = AnonymousClass003.A1J(bfm, g0u2, emailViewModel2);
                            Object objAaT = bfm.AaT();
                            if (zA1J || objAaT == C78N.A00) {
                                objAaT = new EmailComponentsKt$EmailSettingsPage$5$3$2$1$1$1(g0u2, emailViewModel2);
                                bfm.Ai0(objAaT);
                            }
                            function03 = (Function0) objAaT;
                        }
                        BBI.A0R(bbi, false);
                    }
                    BBI.A0R(bbi, false);
                    EmailComponentsKt.m746EmailSettingsScrolljIwJxvA(bRgA0R, function03, AnonymousClass003.A1X(c1bo2.getValue(), g0u3), f, AnonymousClass003.A1X(c1bo2.getValue(), g0u4), B1V.A00(bfm, new EmailComponentsKt$EmailSettingsPage$5$3$2$2(f, z3, g2j2, emailViewModel2), -1063830211), bfm, ((iA04 << 9) & 7168) | 196608, 0);
                    if (g0w2 == null || z3) {
                        bfm.AgE(576442489);
                    } else {
                        bfm.AgE(-2059615466);
                        AnonymousClass001.A1G(emailViewModel2, bfm, g0w2, 0);
                    }
                    BBI.A0R(bbi, false);
                    C01N.A08(bfm, bs02, f2);
                    BBI.A0R(bbi, z);
                    BBI.A0R(bbi, false);
                    return;
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(G0U<? super EmailState, Boolean> g0u, boolean z, G0U<? super EmailViewModel, Unit> g0u2, boolean z2, String str, AuraNavigator auraNavigator, G0U<? super EmailState, Boolean> g0u3, G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, G2j<? super C07C, ? super EmailViewModel, ? super BFM, ? super Integer, Unit> g2j, G0U<? super EmailViewModel, Unit> g0u4, G0U<? super EmailState, Boolean> g0u5) {
            super(4);
            this.$isBusy = g0u;
            this.$allowReset = z;
            this.$onBack = g0u2;
            this.$contentFillsPage = z2;
            this.$title = str;
            this.$navigator = auraNavigator;
            this.$scrollable = g0u3;
            this.$footer = g0w;
            this.$content = g2j;
            this.$onRefresh = g0u4;
            this.$isRefreshing = g0u5;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(com.facebook.aura.email.viewmodel.EmailViewModel r46, X.BRg r47, X.BFM r48, int r49) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailComponentsKt.AnonymousClass5.invoke(com.facebook.aura.email.viewmodel.EmailViewModel, X.BRg, X.BFM, int):void");
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(EmailViewModel emailViewModel, BRg bRg, BFM bfm, Integer num) {
            invoke(emailViewModel, bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSettingsPage$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $allowReset;
        public final /* synthetic */ G2j<C07C, EmailViewModel, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $contentFillsPage;
        public final /* synthetic */ String $environmentId;
        public final /* synthetic */ G0W<EmailViewModel, BFM, Integer, Unit> $footer;
        public final /* synthetic */ G0U<EmailState, Boolean> $isBusy;
        public final /* synthetic */ G0U<EmailState, Boolean> $isRefreshing;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<EmailViewModel, Unit> $onBack;
        public final /* synthetic */ G0U<EmailViewModel, Unit> $onRefresh;
        public final /* synthetic */ G0U<EmailState, Boolean> $scrollable;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, String str2, BRg bRg, boolean z, G0U<? super EmailState, Boolean> g0u, boolean z2, G0U<? super EmailState, Boolean> g0u2, G0U<? super EmailViewModel, Unit> g0u3, G0U<? super EmailViewModel, Unit> g0u4, G0U<? super EmailState, Boolean> g0u5, G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, G2j<? super C07C, ? super EmailViewModel, ? super BFM, ? super Integer, Unit> g2j, int i, int i2, int i3) {
            super(2);
            this.$environmentId = str;
            this.$title = str2;
            this.$modifier = bRg;
            this.$allowReset = z;
            this.$scrollable = g0u;
            this.$contentFillsPage = z2;
            this.$isBusy = g0u2;
            this.$onBack = g0u3;
            this.$onRefresh = g0u4;
            this.$isRefreshing = g0u5;
            this.$footer = g0w;
            this.$content = g2j;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailComponentsKt.EmailSettingsPage(this.$environmentId, this.$title, this.$modifier, this.$allowReset, this.$scrollable, this.$contentFillsPage, this.$isBusy, this.$onBack, this.$onRefresh, this.$isRefreshing, this.$footer, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSheetBackButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C117593 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117593(BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$onBack = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            EmailComponentsKt.EmailSheetBackButton(this.$modifier, this.$onBack, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailComponentsKt$EmailSheetHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C117602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C117602(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
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
            EmailComponentsKt.EmailSheetHeader(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailEnvironment(String str, BRg bRg, G2j<? super EmailError, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, G2j<? super EmailViewModel, ? super BRg, ? super BFM, ? super Integer, Unit> g2j2, BFM bfm, int i, int i2) {
        EmailError emailError;
        BRg bRg2 = bRg;
        G2j<? super EmailError, ? super BRg, ? super BFM, ? super Integer, Unit> g2j3 = g2j;
        AnonymousClass002.A1B(str, 0, g2j2);
        bfm.AgG(-1529815582);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g2j3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g2j2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g2j3 = ComposableSingletons$EmailComponentsKt.lambda$1649023266;
            }
            EmailEnvironmentState emailEnvironmentState = emailEnvironmentState(bfm, 0);
            if (str.equals(emailEnvironmentState.environmentId)) {
                emailError = emailEnvironmentState.error;
                if (emailError == null) {
                    bfm.AgE(-837525474);
                    AnonymousClass001.A1F(rememberEmailViewModel(str, bfm, iA0d & 14), bRg2, bfm, g2j2, ((iA0d >> 3) & 896) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
                }
                AnonymousClass001.A1D(bfm);
            } else {
                emailError = EmailError.LOAD;
            }
            bfm.AgE(-837570951);
            AnonymousClass001.A1F(emailError, bRg2, bfm, g2j3, iA0d & 1008);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, g2j3, g2j2, i, i2);
        }
    }

    public static final float emailFlowSheetHeight(BFM bfm, int i) {
        return AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.9f;
    }

    public static final EmailViewModel rememberEmailViewModel(String str, BFM bfm, int i) {
        C7384Etj.A0Y(str, 0);
        Object objA6v = bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration);
        StringBuilder sb = new StringBuilder("email:");
        sb.append(objA6v);
        sb.append(":");
        String strA0v = AnonymousClass001.A0v(str, sb);
        EmailViewModel.Factory factory = new EmailViewModel.Factory(AnonymousClass002.A0h(bfm), str);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        return (EmailViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), EmailViewModel.class, strA0v);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailError.values().length];
            try {
                AnonymousClass002.A13(EmailError.LOAD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(EmailError.SAVE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(EmailError.SETUP, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(EmailError.SENDERS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(EmailError.TEST, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(EmailError.PERMISSIONS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(EmailError.DELETE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(EmailError.RESET_REQUIRED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(EmailError.DELETE_RESET, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(EmailError.INVALID_ADDRESS, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(EmailError.OWNER_DOMAIN_BLOCKED, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(EmailError.RATE_LIMITED, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EmailError.UNAVAILABLE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EmailError.NOT_ENABLED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EmailError.TEST_UNCERTAIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void EmailCardField(String str, String str2, boolean z, G0U<? super String, Unit> g0u, BRg bRg, AuJ auJ, C19h c19h, BRg bRg2, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2, BFM bfm, int i, int i2) {
        G0V<? super BFM, ? super Integer, Unit> g0v3;
        BRg bRg3 = bRg;
        AuJ auJ2 = auJ;
        G0V<? super BFM, ? super Integer, Unit> g0v4 = g0v2;
        C19h c19h2 = c19h;
        BRg bRg4 = bRg2;
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(str2, 1, g0u);
        bfm.AgG(-836988830);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg3);
        }
        int i4 = i2 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, auJ2);
            iA0d |= iA0i;
        }
        int i5 = i2 & 64;
        int iA0j = 1572864;
        if (i5 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, c19h2);
            iA0d |= iA0j;
        }
        int i6 = i2 & 128;
        int iA0k = 12582912;
        if (i6 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg4);
            iA0d |= iA0k;
        }
        int i7 = i2 & 256;
        if (i7 != 0) {
            iA0d |= 100663296;
        } else if ((i & 100663296) == 0) {
            i7 = 0;
            iA0d |= AnonymousClass004.A0b(bfm, g0v);
        }
        int i8 = i2 & 512;
        int iA0c = 805306368;
        if (i8 != 0) {
            iA0d |= iA0c;
        } else if ((i & 805306368) == 0) {
            i8 = 0;
            iA0c = AnonymousClass004.A0c(bfm, g0v4);
            iA0d |= iA0c;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                auJ2 = AuJ.A04;
            }
            if (i5 != 0) {
                c19h2 = C19i.A00;
            }
            if (i6 != 0) {
                bRg4 = BRg.A00;
            }
            g0v3 = i7 == 0 ? g0v : null;
            if (i8 != 0) {
                g0v4 = ComposableSingletons$EmailComponentsKt.f46lambda$215089629;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg3);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 6.0f, 6);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).footnoteMedium;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0I(bfm, akh), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            int i9 = iA0d >> 3;
            AuraTextInputKt.AuraTextInput(str2, null, bRg4, null, auJ2, null, c19h2, null, true, 0, 0, null, g0v3, AuraColorsKt.m2821withBackgroundColor4WTKRHQ(AnonymousClass001.A0f(bfm, akh).textInput, C06G.A0J(bfm, akh)), null, z, false, false, false, C1D8.A00(14.0f), g0u, bfm, AnonymousClass001.A05(iA0d, (i9 & 57344) | (i9 & 14) | 100663296 | ((iA0d >> 15) & 896)), AnonymousClass001.A08(iA0d << 9, (iA0d >> 18) & 896), (iA0d >> 9) & 14, 478890);
            AnonymousClass004.A1C(bbi, bfm, g0v4, iA0d >> 27, true);
        } else {
            bfm.Afo();
            g0v3 = g0v;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, z, g0u, bRg3, auJ2, c19h2, bRg4, g0v3, g0v4, i, i2);
        }
    }

    public static final void EmailErrorMessage(EmailError emailError, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(230733421);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(emailError)) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (emailError == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new C117571(emailError, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            switch (emailError.ordinal()) {
                case 0:
                    i3 = R.string._name_removed__res_0x7f120961;
                    break;
                case 1:
                    i3 = R.string._name_removed__res_0x7f120965;
                    break;
                case 2:
                    i3 = R.string._name_removed__res_0x7f120967;
                    break;
                case 3:
                    i3 = R.string._name_removed__res_0x7f120966;
                    break;
                case 4:
                    i3 = R.string._name_removed__res_0x7f120968;
                    break;
                case 5:
                    i3 = R.string._name_removed__res_0x7f120963;
                    break;
                case 6:
                    i3 = R.string._name_removed__res_0x7f12095d;
                    break;
                case 7:
                    i3 = R.string._name_removed__res_0x7f12095e;
                    break;
                case 8:
                    i3 = R.string._name_removed__res_0x7f1209a2;
                    break;
                case 9:
                    i3 = R.string._name_removed__res_0x7f120960;
                    break;
                case 10:
                    i3 = R.string._name_removed__res_0x7f120962;
                    break;
                case 11:
                    i3 = R.string._name_removed__res_0x7f120964;
                    break;
                case 12:
                    i3 = R.string._name_removed__res_0x7f12096a;
                    break;
                case 13:
                    i3 = R.string._name_removed__res_0x7f12095f;
                    break;
                case 14:
                    i3 = R.string._name_removed__res_0x7f120969;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            long j = AnonymousClass002.A0c(bfm).errorText;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailComponentsKt$EmailErrorMessage$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRg2, (G0U) objAaT, false), j, c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(emailError, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final void EmailRetry(EmailError emailError, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(157388686);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(emailError)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0D |= 384;
        } else if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, 12.0f), bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            EmailErrorMessage(emailError, null, bfm, iA0D & 14, 2);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209a3), null, null, null, AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0D << 9) & 57344, 0, 134201309);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117582(emailError, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailSettingsPage(java.lang.String r45, java.lang.String r46, X.BRg r47, boolean r48, X.G0U<? super com.facebook.aura.email.viewmodel.EmailState, java.lang.Boolean> r49, boolean r50, X.G0U<? super com.facebook.aura.email.viewmodel.EmailState, java.lang.Boolean> r51, X.G0U<? super com.facebook.aura.email.viewmodel.EmailViewModel, kotlin.Unit> r52, X.G0U<? super com.facebook.aura.email.viewmodel.EmailViewModel, kotlin.Unit> r53, X.G0U<? super com.facebook.aura.email.viewmodel.EmailState, java.lang.Boolean> r54, X.G0W<? super com.facebook.aura.email.viewmodel.EmailViewModel, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r55, X.G2j<? super X.C07C, ? super com.facebook.aura.email.viewmodel.EmailViewModel, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r56, X.BFM r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailComponentsKt.EmailSettingsPage(java.lang.String, java.lang.String, X.BRg, boolean, X.G0U, boolean, X.G0U, X.G0U, X.G0U, X.G0U, X.G0W, X.G2j, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[PHI: r16
  0x00ac: PHI (r16v2 boolean) = (r16v1 boolean), (r16v4 boolean) binds: [B:32:0x0065, B:34:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: EmailSettingsScroll-jIwJxvA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m746EmailSettingsScrolljIwJxvA(X.BRg r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, boolean r21, float r22, boolean r23, X.G0W<? super X.C07C, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailComponentsKt.m746EmailSettingsScrolljIwJxvA(X.BRg, kotlin.jvm.functions.Function0, boolean, float, boolean, X.G0W, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmailSheetBackButton(X.BRg r21, kotlin.jvm.functions.Function0<kotlin.Unit> r22, X.BFM r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.email.view.EmailComponentsKt.EmailSheetBackButton(X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    /* renamed from: EmailSheetEnvironment-PfoAEA0, reason: not valid java name */
    public static final void m747EmailSheetEnvironmentPfoAEA0(String str, BRg bRg, G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w, boolean z, boolean z2, float f, G2j<? super EmailViewModel, ? super BRg, ? super BFM, ? super Integer, Unit> g2j, BFM bfm, int i, int i2) {
        G0W<? super EmailViewModel, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        boolean z3 = z;
        boolean z4 = z2;
        float f2 = f;
        BRg bRg2 = bRg;
        AnonymousClass002.A1E(str, 0, g2j);
        bfm.AgG(-620742490);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z4);
        }
        int i7 = i2 & 32;
        int iA09 = 196608;
        if (i7 != 0) {
            iA0d |= iA09;
        } else if ((196608 & i) == 0) {
            iA09 = AnonymousClass004.A09(bfm, f2);
            iA0d |= iA09;
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g2j);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0w2 = null;
            }
            if (i5 != 0) {
                z3 = false;
            }
            if (i6 != 0) {
                z4 = false;
            }
            if (i7 != 0) {
                f2 = 24.0f;
            }
            EmailEnvironment(str, bRg2, null, B1V.A00(bfm, new EmailComponentsKt$EmailSheetEnvironment$1(z4, z3, g0w2, g2j, f2), -91529788), bfm, (iA0d & 14) | 3072 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new EmailComponentsKt$EmailSheetEnvironment$2(str, bRg2, g0w2, z3, z4, f2, g2j, i, i2);
        }
    }

    public static final void EmailSheetHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(962033625);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            BRg bRgA01 = C10G.A01(C2VU.A04, C3U4.A03(AnonymousClass003.A0U(AnonymousClass001.A0R(bRg2)), 12.0f), false);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = EmailComponentsKt$EmailSheetHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA01, objAaT, false), 0L, c1822ArmA0W, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16308);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C117602(str, bRg2, i, i2);
        }
    }

    public static final EmailEnvironmentState emailEnvironmentState(BFM bfm, int i) {
        String strA0a = AnonymousClass007.A0a("email-environment:", bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration));
        EmailEnvironmentViewModel.Factory factory = new EmailEnvironmentViewModel.Factory(AnonymousClass002.A0h(bfm));
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        EmailEnvironmentViewModel emailEnvironmentViewModel = (EmailEnvironmentViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), strA0a, new C0861A6i(EmailEnvironmentViewModel.class));
        boolean zA67 = bfm.A67(emailEnvironmentViewModel);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new EmailComponentsKt$emailEnvironmentState$1$1(emailEnvironmentViewModel);
            bfm.Ai0(objAaT);
        }
        C7bA.A05(bfm, null, emailEnvironmentViewModel, (G0U) objAaT, 0, 2);
        return (EmailEnvironmentState) C1BO.A07(bfm, emailEnvironmentViewModel.state);
    }
}
