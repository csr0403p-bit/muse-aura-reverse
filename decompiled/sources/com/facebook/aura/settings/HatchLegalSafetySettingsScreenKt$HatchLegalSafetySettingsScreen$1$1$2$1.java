package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C06H;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.utils.navigation.SecureUri;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $metaAiTermsTitle;
    public final /* synthetic */ String $metaPrivacyTitle;
    public final /* synthetic */ String $metaTermsTitle;
    public final /* synthetic */ String $mptSupplementalTermsTitle;
    public final /* synthetic */ SecureUri $museSupplementalPrivacyPolicyUri;
    public final /* synthetic */ String $museSupplementalPrivacyTitle;
    public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;
    public final /* synthetic */ boolean $showHatchSupplementalTerms;
    public final /* synthetic */ String $supplementalPrivacyTitle;
    public final /* synthetic */ String $supplementalTermsTitle;

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;
        public final /* synthetic */ String $supplementalTermsTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$supplementalTermsTitle = str;
            this.$onOpenLegalPage = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$supplementalTermsTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$supplementalTermsTitle, bfm.A65(this.$onOpenLegalPage));
                String str = this.$supplementalTermsTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$1$1$1(str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ SecureUri $museSupplementalPrivacyPolicyUri;
        public final /* synthetic */ String $museSupplementalPrivacyTitle;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, G0V<? super String, ? super String, Unit> g0v, SecureUri secureUri) {
            super(3);
            this.$museSupplementalPrivacyTitle = str;
            this.$onOpenLegalPage = g0v;
            this.$museSupplementalPrivacyPolicyUri = secureUri;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$museSupplementalPrivacyTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$museSupplementalPrivacyTitle, AnonymousClass001.A1T(bfm, this.$museSupplementalPrivacyPolicyUri, bfm.A65(this.$onOpenLegalPage)));
                SecureUri secureUri = this.$museSupplementalPrivacyPolicyUri;
                String str = this.$museSupplementalPrivacyTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$2$1$1(secureUri, str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $metaAiTermsTitle;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$metaAiTermsTitle = str;
            this.$onOpenLegalPage = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$metaAiTermsTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$metaAiTermsTitle, bfm.A65(this.$onOpenLegalPage));
                String str = this.$metaAiTermsTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$3$1$1(str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $metaTermsTitle;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$metaTermsTitle = str;
            this.$onOpenLegalPage = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$metaTermsTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$metaTermsTitle, bfm.A65(this.$onOpenLegalPage));
                String str = this.$metaTermsTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$4$1$1(str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $metaPrivacyTitle;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(String str, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$metaPrivacyTitle = str;
            this.$onOpenLegalPage = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$metaPrivacyTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$metaPrivacyTitle, bfm.A65(this.$onOpenLegalPage));
                String str = this.$metaPrivacyTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$5$1$1(str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $mptSupplementalTermsTitle;
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$mptSupplementalTermsTitle = str;
            this.$onOpenLegalPage = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$mptSupplementalTermsTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$mptSupplementalTermsTitle, bfm.A65(this.$onOpenLegalPage));
                String str = this.$mptSupplementalTermsTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$6$1$1(str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<String, String, Unit> $onOpenLegalPage;
        public final /* synthetic */ String $supplementalPrivacyTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(String str, G0V<? super String, ? super String, Unit> g0v) {
            super(3);
            this.$supplementalPrivacyTitle = str;
            this.$onOpenLegalPage = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(C07C c07c, BFM bfm, int i) {
            int i2 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ExternalNavigation externalNavigation = AuraCardType.ExternalNavigation.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                ApQ apQA0X = AnonymousClass005.A0X(this.$supplementalPrivacyTitle);
                long j = 0;
                Object[] objArr5 = objArr4 == true ? 1 : 0;
                Object[] objArr6 = objArr3 == true ? 1 : 0;
                Object[] objArr7 = objArr2 == true ? 1 : 0;
                Object[] objArr8 = objArr == true ? 1 : 0;
                AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) objArr5, (int) objArr6, (String) (0 == true ? 1 : 0), (boolean) objArr7, (boolean) objArr8, (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$supplementalPrivacyTitle, bfm.A65(this.$onOpenLegalPage));
                String str = this.$supplementalPrivacyTitle;
                G0V<String, String, Unit> g0v = this.$onOpenLegalPage;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1$7$1$1(str, g0v);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, externalNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        if (this.$showHatchSupplementalTerms) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$supplementalTermsTitle, this.$onOpenLegalPage), 440503144);
        }
        SecureUri secureUri = this.$museSupplementalPrivacyPolicyUri;
        if (secureUri != null) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$museSupplementalPrivacyTitle, this.$onOpenLegalPage, secureUri), -873073185);
        }
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass3(this.$metaAiTermsTitle, this.$onOpenLegalPage), 412570125);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass4(this.$metaTermsTitle, this.$onOpenLegalPage), -1946900668);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass5(this.$metaPrivacyTitle, this.$onOpenLegalPage), -1896215675);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass6(this.$mptSupplementalTermsTitle, this.$onOpenLegalPage), -1845530682);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass7(this.$supplementalPrivacyTitle, this.$onOpenLegalPage), -1794845689);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLegalSafetySettingsScreenKt$HatchLegalSafetySettingsScreen$1$1$2$1(boolean z, SecureUri secureUri, String str, G0V<? super String, ? super String, Unit> g0v, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(1);
        this.$showHatchSupplementalTerms = z;
        this.$museSupplementalPrivacyPolicyUri = secureUri;
        this.$supplementalTermsTitle = str;
        this.$onOpenLegalPage = g0v;
        this.$museSupplementalPrivacyTitle = str2;
        this.$metaAiTermsTitle = str3;
        this.$metaTermsTitle = str4;
        this.$metaPrivacyTitle = str5;
        this.$mptSupplementalTermsTitle = str6;
        this.$supplementalPrivacyTitle = str7;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
