package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06H;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.partners.voice.intf.Voice;
import com.facebook.aura.settings.api.SettingsGeneralRowContributor;
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
public final class VoiceControlsSettingsRow implements SettingsGeneralRowContributor {
    public static final VoiceControlsSettingsRow INSTANCE = new VoiceControlsSettingsRow();

    /* renamed from: com.facebook.aura.partners.voice.impl.VoiceControlsSettingsRow$Row$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceControlsSettingsRow.this.Row(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.aura.settings.api.SettingsGeneralRowContributor
    public void Row(BRg bRg, BFM bfm, int i) {
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(-1772650578);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            long j = 0;
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, R.string._name_removed__res_0x7f12065f), auraIconAndHeadlineStyle, (BO6) null, (B6A) (0 == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (G0U) (0 == true ? 1 : 0), (AuraIconAndBodyStyle) (0 == true ? 1 : 0), (B6A) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), i2, (int) (objArr4 == true ? 1 : 0), (int) (objArr3 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (boolean) (objArr2 == true ? 1 : 0), (boolean) (objArr == true ? 1 : 0), (ApQ) (0 == true ? 1 : 0), (C1822Arm) (0 == true ? 1 : 0), j, j, (C1YL) (0 == true ? 1 : 0), 2097148, (C06H) (0 == true ? 1 : 0));
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$VoiceControlsSettingsRowKt.f218lambda$1401731246;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VoiceControlsSettingsRow$Row$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRg, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT, null, null, null, false, false, null, null, 0L, false, null, null, bfm, (iA0d & 14) | 27648, 0, 262048);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i);
        }
    }

    @Override // com.facebook.aura.settings.api.SettingsGeneralRowContributor
    public boolean rememberIsVisible(BFM bfm, int i) {
        bfm.AgE(-701902290);
        boolean zIsCallSupported = Voice.INSTANCE.isCallSupported(AnonymousClass002.A0h(bfm));
        AnonymousClass002.A19(bfm);
        return zIsCallSupported;
    }
}
