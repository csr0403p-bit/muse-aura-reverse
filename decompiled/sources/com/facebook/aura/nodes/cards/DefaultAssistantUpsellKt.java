package com.facebook.aura.nodes.cards;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.C7mU;
import X.CFK;
import X.F60;
import X.G0U;
import X.G0V;
import X.HpR;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.nodes.cards.DefaultAssistantUpsellGate;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class DefaultAssistantUpsellKt {
    public static final String TAG = "DefaultAssistantUpsell";

    /* renamed from: com.facebook.aura.nodes.cards.DefaultAssistantUpsellKt$DefaultAssistantUpsell$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFreshlyArrived;
        public final /* synthetic */ String $messageKey;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$messageKey = str;
            this.$isFreshlyArrived = z;
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
            DefaultAssistantUpsellKt.DefaultAssistantUpsell(this.$messageKey, this.$isFreshlyArrived, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.nodes.cards.DefaultAssistantUpsellKt$DefaultAssistantUpsell$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isFreshlyArrived;
        public final /* synthetic */ String $messageKey;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$messageKey = str;
            this.$isFreshlyArrived = z;
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
            DefaultAssistantUpsellKt.DefaultAssistantUpsell(this.$messageKey, this.$isFreshlyArrived, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DefaultAssistantUpsell(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-899295330);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = DefaultAssistantUpsellGate.INSTANCE.decide(contextA0H, str, z);
                bfm.Ai0(objAaT);
            }
            DefaultAssistantUpsellGate.Decision decision = (DefaultAssistantUpsellGate.Decision) objAaT;
            if (!decision.show) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(str, z, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            String str2 = decision.recordKey;
            if (str2 == null) {
                bfm.AgE(1099427243);
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(str2, bfm, 1099427244);
                Object objAaT2 = bfm.AaT();
                if (zA1Y || objAaT2 == C78N.A00) {
                    objAaT2 = new DefaultAssistantUpsellKt$DefaultAssistantUpsell$2$1$1(str2);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, str2);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            HpR hpR = new HpR();
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new DefaultAssistantUpsellKt$DefaultAssistantUpsell$roleRequestLauncher$1$1(contextA0H);
                bfm.Ai0(objAaT3);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT3);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(8.0f), bfm, C2VU.A02, 6);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120b09);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120b07), null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b08);
            AuraLabelButtonStyle auraLabelButtonStyleSecondaryOutlined = AuraButtonStyles.INSTANCE.secondaryOutlined(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA1M = AnonymousClass003.A1M(bfm, contextA0H, c7ouA00);
            Object objAaT4 = bfm.AaT();
            if (zA1M || objAaT4 == C78N.A00) {
                objAaT4 = new DefaultAssistantUpsellKt$DefaultAssistantUpsell$3$1$1(contextA0H, c7ouA00);
                bfm.Ai0(objAaT4);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, auraLabelButtonStyleSecondaryOutlined, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT4, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, z, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void launchDefaultAssistantSettings(Context context) {
        Intent intent = new Intent("android.settings.VOICE_INPUT_SETTINGS");
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            intent = new Intent("android.settings.MANAGE_DEFAULT_APPS_SETTINGS");
            if (intent.resolveActivity(context.getPackageManager()) == null) {
                intent = new Intent("android.settings.SETTINGS");
            }
        }
        try {
            C7mU.A00().A03().A05(context, intent);
        } catch (ActivityNotFoundException e) {
            CFK.A0A(TAG, "No settings activity available for default assistant", e);
        }
    }
}
