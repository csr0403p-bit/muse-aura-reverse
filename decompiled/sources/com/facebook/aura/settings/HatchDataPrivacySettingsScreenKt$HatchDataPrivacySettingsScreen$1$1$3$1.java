package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06H;
import X.C07C;
import X.C0881AGi;
import X.C08R;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.utils.HatchUtil;
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
public final class HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $exportingLabel;
    public final /* synthetic */ boolean $isExporting;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<Boolean> $showDownloadDialog$delegate;

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator) {
            super(3);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f120ecf), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$1$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator) {
            super(3);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
                C1062ATq c1062ATq = C10G.A02;
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass005.A0X(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120f0e)), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$2$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(c1062ATq, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, null, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 3078, 0, 262064);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $exportingLabel;
        public final /* synthetic */ boolean $isExporting;
        public final /* synthetic */ MutableState<Boolean> $showDownloadDialog$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, String str, MutableState<Boolean> mutableState) {
            super(3);
            this.$isExporting = z;
            this.$exportingLabel = str;
            this.$showDownloadDialog$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            ApQ apQ;
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraCardType.Clickable clickable = AuraCardType.Clickable.INSTANCE;
                C1062ATq c1062ATq = C10G.A02;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$exportingLabel, bfm.A66(this.$isExporting));
                boolean z = this.$isExporting;
                String str = this.$exportingLabel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$3$1$1(z, str);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq, objAaT, false);
                AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
                AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1208b3);
                C0881AGi c0881AGi = C0881AGi.A00;
                ApQ apQ2 = new ApQ(strA01, c0881AGi);
                if (this.$isExporting) {
                    apQ = new ApQ(this.$exportingLabel, c0881AGi);
                } else {
                    apQ = null;
                }
                AuraCardContent auraCardContent = new AuraCardContent(apQ2, auraIconAndHeadlineStyle, (BO6) null, (B6A) null, apQ, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097132, (C06H) null);
                boolean z2 = this.$isExporting;
                boolean z3 = !z2;
                G0W<C08R, BFM, Integer, Unit> g0w = ComposableSingletons$HatchDataPrivacySettingsScreenKt.f235lambda$763501391;
                boolean zA66 = bfm.A66(z2);
                boolean z4 = this.$isExporting;
                MutableState<Boolean> mutableState = this.$showDownloadDialog$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA66 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1$3$2$1(z4, mutableState);
                    bfm.Ai0(objAaT2);
                }
                AuraCardKt.m2484AuraCardjQVUvHA(bRgA0Y, auraCardStyleCardStyleForSettings, auraCardContent, clickable, null, g0w, (Function0) objAaT2, null, null, null, z3, false, null, null, 0L, false, null, null, bfm, 199680, 0, 261008);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$navigator), -2024775671);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$navigator), 2138928512);
        if (HatchUtil.INSTANCE.isNativeDataExportEnabled()) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass3(this.$isExporting, this.$exportingLabel, this.$showDownloadDialog$delegate), 1036982436);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDataPrivacySettingsScreenKt$HatchDataPrivacySettingsScreen$1$1$3$1(AuraNavigator auraNavigator, boolean z, String str, MutableState<Boolean> mutableState) {
        super(1);
        this.$navigator = auraNavigator;
        this.$isExporting = z;
        this.$exportingLabel = str;
        this.$showDownloadDialog$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
