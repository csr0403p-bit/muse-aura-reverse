package com.facebook.aura.whatsapp.view;

import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C3cH;
import X.C5wL;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionErrorType;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionFlowPhase;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionUiState;
import com.facebook.aura.whatsapp.viewmodel.WhatsAppCompanionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class WhatsAppCompanionScreenKt {

    /* renamed from: com.facebook.aura.whatsapp.view.WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ String $skillId;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            BBI bbi = (BBI) bfm;
            WhatsAppCompanionViewModel.Factory factory = new WhatsAppCompanionViewModel.Factory(AKO.A06(LocalUserSessionKt.LocalUserSession, bbi), this.$skillId, this.$origin);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            WhatsAppCompanionViewModel whatsAppCompanionViewModel = (WhatsAppCompanionViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), WhatsAppCompanionViewModel.class);
            C1BO c1boA02 = C2CK.A02(bfm, whatsAppCompanionViewModel.uiState);
            int iOrdinal = ((WhatsAppCompanionUiState) c1boA02.getValue()).phase.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-2062818848);
                String str = this.$iconUrl;
                boolean zA67 = bfm.A67(whatsAppCompanionViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$1$1(whatsAppCompanionViewModel);
                    BBI.A0O(bbi, objAaT);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                boolean zA672 = bfm.A67(whatsAppCompanionViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$2$1(whatsAppCompanionViewModel);
                    BBI.A0O(bbi, objAaT2);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                boolean zA673 = bfm.A67(whatsAppCompanionViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$3$1(whatsAppCompanionViewModel);
                    BBI.A0O(bbi, objAaT3);
                }
                WhatsAppCompanionPhoneInputContentKt.WhatsAppCompanionPhoneInputContent(str, g0u, function0, (Function0) ((InterfaceC7353EnQ) objAaT3), bfm, 0);
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass003.A0k(bfm, bbi, -2062820802);
                }
                bfm.AgE(-2062807819);
                String str2 = this.$iconUrl;
                String str3 = ((WhatsAppCompanionUiState) c1boA02.getValue()).linkCode;
                if (str3 == null) {
                    str3 = "";
                }
                boolean z = ((WhatsAppCompanionUiState) c1boA02.getValue()).isPolling;
                boolean z2 = ((WhatsAppCompanionUiState) c1boA02.getValue()).isConnected;
                WhatsAppCompanionErrorType whatsAppCompanionErrorType = ((WhatsAppCompanionUiState) c1boA02.getValue()).errorType;
                boolean zA674 = bfm.A67(whatsAppCompanionViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA674 || objAaT4 == C78N.A00) {
                    objAaT4 = new WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$4$1(whatsAppCompanionViewModel);
                    BBI.A0O(bbi, objAaT4);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT4);
                boolean zA675 = bfm.A67(whatsAppCompanionViewModel);
                Object objAaT5 = bfm.AaT();
                if (zA675 || objAaT5 == C78N.A00) {
                    objAaT5 = new WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$5$1(whatsAppCompanionViewModel);
                    BBI.A0O(bbi, objAaT5);
                }
                Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT5);
                boolean zA676 = bfm.A67(whatsAppCompanionViewModel);
                Object objAaT6 = bfm.AaT();
                if (zA676 || objAaT6 == C78N.A00) {
                    objAaT6 = new WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$6$1(whatsAppCompanionViewModel);
                    BBI.A0O(bbi, objAaT6);
                }
                WhatsAppCompanionCodeDisplayContentKt.WhatsAppCompanionCodeDisplayContent(str2, str3, z, z2, whatsAppCompanionErrorType, function02, function03, (Function0) ((InterfaceC7353EnQ) objAaT6), bfm, 0);
            }
            BBI.A0R(bbi, false);
        }

        /* renamed from: com.facebook.aura.whatsapp.view.WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WhatsAppCompanionFlowPhase.values().length];
                try {
                    AnonymousClass002.A13(WhatsAppCompanionFlowPhase.PHONE_INPUT, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(WhatsAppCompanionFlowPhase.CODE_DISPLAY, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, String str2) {
            super(3);
            this.$skillId = str;
            this.$origin = hatchSkillOAuthOrigin;
            this.$iconUrl = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.whatsapp.view.WhatsAppCompanionScreenKt$WhatsAppCompanionScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ String $skillId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i) {
            super(2);
            this.$skillId = str;
            this.$iconUrl = str2;
            this.$origin = hatchSkillOAuthOrigin;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            WhatsAppCompanionScreenKt.WhatsAppCompanionScreen(this.$skillId, this.$iconUrl, this.$origin, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void WhatsAppCompanionScreen(String str, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, BFM bfm, int i) {
        AnonymousClass002.A1A(str, 0, hatchSkillOAuthOrigin);
        bfm.AgG(967410245);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, hatchSkillOAuthOrigin.ordinal());
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, null, null, null, null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass1(str, hatchSkillOAuthOrigin, str2), -560805144), bfm, 0, 48, 2047);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, hatchSkillOAuthOrigin, i);
        }
    }
}
