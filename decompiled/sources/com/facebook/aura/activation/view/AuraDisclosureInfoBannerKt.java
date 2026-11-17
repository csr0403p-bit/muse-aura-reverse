package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.ApQ;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BQN;
import X.BRg;
import X.C06G;
import X.C0861A6i;
import X.C0953AJg;
import X.C14P;
import X.C1822Arm;
import X.C1BO;
import X.C1YL;
import X.C2CK;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.activity.ComponentActivity;
import com.facebook.aura.activation.model.AuraDisclosureViewModel;
import com.facebook.aura.navigation.AuraNavigator;
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
public abstract class AuraDisclosureInfoBannerKt {

    /* renamed from: com.facebook.aura.activation.view.AuraDisclosureInfoBannerKt$AuraDisclosureInfoBanner$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
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
            AuraDisclosureInfoBannerKt.AuraDisclosureInfoBanner(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraDisclosureInfoBanner(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        BRg bRg2 = bRg;
        bfm.AgG(-1043304120);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraDisclosureViewModel.Factory factory = new AuraDisclosureViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            AuraDisclosureViewModel auraDisclosureViewModel = (AuraDisclosureViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(AuraDisclosureViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, auraDisclosureViewModel.uiState);
            AuraDisclosureViewModel.InfoBanner infoBanner = ((AuraDisclosureViewModel.UiState) c1boA02.getValue()).infoBanner;
            if (infoBanner == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AuraDisclosureInfoBannerKt$AuraDisclosureInfoBanner$banner$1(bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            boolean z = !((AuraDisclosureViewModel.UiState) c1boA02.getValue()).isLoading;
            String str = infoBanner.text;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.B2;
            B6A b6a = new B6A(C06G.A08(bfm));
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, b6a, (ApQ) null, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (String) null, true, false, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$AuraDisclosureInfoBannerKt.f2lambda$1032673300;
            boolean zA1M = AnonymousClass003.A1M(bfm, auraDisclosureViewModel, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new AuraDisclosureInfoBannerKt$AuraDisclosureInfoBanner$1$1(auraDisclosureViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, z, false, null, null, 0L, false, null, null, bfm, (iA0d & 14) | 27648, 0, 261024);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(bRg2, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }
}
