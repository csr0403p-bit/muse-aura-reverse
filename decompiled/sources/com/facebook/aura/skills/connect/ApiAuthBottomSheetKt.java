package com.facebook.aura.skills.connect;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1736ApY;
import X.C1YP;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ApiAuthBottomSheetKt {

    /* renamed from: com.facebook.aura.skills.connect.ApiAuthBottomSheetKt$ApiAuthSheetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $apiKeyIdentifier;
        public final /* synthetic */ String $connectUrl;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchSkillOAuthOrigin $origin;
        public final /* synthetic */ Skill $skill;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Skill skill, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$apiKeyIdentifier = str;
            this.$skill = skill;
            this.$connectUrl = str2;
            this.$origin = hatchSkillOAuthOrigin;
            this.$onDismiss = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ApiAuthBottomSheetKt.ApiAuthSheetContent(this.$apiKeyIdentifier, this.$skill, this.$connectUrl, this.$origin, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ApiAuthSheetContent(String str, Skill skill, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, Function0<Unit> function0, BFM bfm, int i, int i2) {
        String serviceDisplayName;
        C1736ApY c1736ApY;
        String str3;
        Skill skill2 = skill;
        String str4 = str2;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin2 = hatchSkillOAuthOrigin;
        AnonymousClass002.A0D(str, function0, 0);
        bfm.AgG(-163863239);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, skill2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str4);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, AnonymousClass003.A0K(hatchSkillOAuthOrigin2));
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                skill2 = null;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (i5 != 0) {
                hatchSkillOAuthOrigin2 = HatchSkillOAuthOrigin.CHAT;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState = (MutableState) objAaT;
            if (skill2 == null || (serviceDisplayName = skill2.displayName) == null || serviceDisplayName.length() <= 0) {
                serviceDisplayName = ServiceDisplayNameFormatterKt.formatServiceDisplayName(str);
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall), hatchSkillOAuthOrigin2.getImpressionOrigin(), hatchSkillOAuthOrigin2.getSurface(), HatchSubsurface.CONNECTOR_AUTH, HatchScreen.CONNECTOR_API_KEY_INPUT, HatchComponent.SKILL_API_KEY_INPUT, null, AnonymousClass007.A0c(HatchMetadataKey.SERVICE, str), null, 500L, 0.0f, null, null, null);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            if (skill2 == null || (str3 = skill2.iconUrl) == null) {
                bfm.AgE(-1173291137);
                c1736ApY = null;
                AuraImageKt.AuraImage(new AuraDrawableSourceResource(R.drawable.wrench_wght400_outline_24), C10G.A07(bs0, 48.0f), null, null, false, false, null, false, null, bfm, 48, 508);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1173428901);
                c1736ApY = null;
                AuraImageKt.m2573AuraImageXRP3Ue8(str3, C11U.A01(C10G.A07(bs0, 48.0f), 12.0f), null, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 0, 0, 32764);
                BBI.A0R(bbi, false);
            }
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            boolean z = false;
            AuraTextKt.m2639AuraTextUY9GdpU(serviceDisplayName, null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, c1736ApY, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12015d), null, C06G.A08(bfm), C06G.A0Z(bfm), null, c1736ApY, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            String strA05 = MutableState.A05(mutableState);
            AuJ auJ = new AuJ(false, -1, 7, -1);
            C1YP c1yp = new C1YP();
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$ApiAuthBottomSheetKt.f276lambda$1330662121;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new ApiAuthBottomSheetKt$ApiAuthSheetContent$1$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraTextInputKt.AuraTextInput(strA05, null, c1062ATq, g0v, auJ, null, c1yp, null, true, 0, 0, null, null, null, null, false, false, false, false, null, (G0U) objAaT2, bfm, 100691328, 0, 6, 1048226);
            C01N.A08(bfm, bs0, f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12015c);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            if (MutableState.A01(mutableState) > 0) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, abstractC3358CGzA0h, AnonymousClass004.A1M(iA0d), AnonymousClass003.A1B(iA0d)) | AnonymousClass004.A1K(iA0d) | AnonymousClass005.A1M(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new ApiAuthBottomSheetKt$ApiAuthSheetContent$1$2$1(hatchSkillOAuthOrigin2, str, abstractC3358CGzA0h, str4, function0, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, skill2, str4, hatchSkillOAuthOrigin2, function0, i, i2);
        }
    }
}
