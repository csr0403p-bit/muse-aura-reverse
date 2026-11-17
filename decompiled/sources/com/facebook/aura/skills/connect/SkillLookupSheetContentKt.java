package com.facebook.aura.skills.connect;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBI;
import X.BFM;
import X.BOD;
import X.BRg;
import X.C07C;
import X.C10G;
import X.C1BO;
import X.C2CK;
import X.C3U4;
import X.C5wL;
import X.C78N;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.ConnectorLookupUiState;
import com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SkillLookupSheetContentKt {

    /* renamed from: com.facebook.aura.skills.connect.SkillLookupSheetContentKt$SkillLookupSheetContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ G2j<Skill, HatchConnectorLookupViewModel, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $trackConsentLoading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, boolean z, G2j<? super Skill, ? super HatchConnectorLookupViewModel, ? super BFM, ? super Integer, Unit> g2j) {
            super(3);
            this.$connectorId = str;
            this.$trackConsentLoading = z;
            this.$content = g2j;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
                String str = this.$connectorId;
                HatchConnectorLookupViewModel.Factory factory = new HatchConnectorLookupViewModel.Factory(abstractC3358CGzA0h, str);
                BOD bodA00 = C5wL.A00(bfm);
                if (bodA00 != null) {
                    HatchConnectorLookupViewModel hatchConnectorLookupViewModel = (HatchConnectorLookupViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), HatchConnectorLookupViewModel.class, str);
                    C1BO c1boA02 = C2CK.A02(bfm, hatchConnectorLookupViewModel.uiState);
                    Skill skill = ((ConnectorLookupUiState) c1boA02.getValue()).skill;
                    if (this.$trackConsentLoading) {
                        bfm.AgE(1959045426);
                        ConnectorAuthQplEffectsKt.ConnectorAuthConsentQplEffects(this.$connectorId, AnonymousClass002.A1X(skill), ((ConnectorLookupUiState) c1boA02.getValue()).isLoading, skill, bfm, 0);
                    } else {
                        bfm.AgE(1959233782);
                    }
                    BBI bbi = (BBI) bfm;
                    BBI.A0R(bbi, false);
                    if (((ConnectorLookupUiState) c1boA02.getValue()).isLoading) {
                        bfm.AgE(1959288745);
                        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120adc);
                        BRg bRgA06 = C3U4.A06(C10G.A02, 48.0f);
                        boolean zA65 = bfm.A65(strA01);
                        Object objAaT = bfm.AaT();
                        if (zA65 || objAaT == C78N.A00) {
                            objAaT = new SkillLookupSheetContentKt$SkillLookupSheetContent$2$1$1(strA01);
                            bfm.Ai0(objAaT);
                        }
                        HatchScreenLoadingStateKt.HatchScreenLoadingState(AnonymousClass001.A0Y(bRgA06, objAaT, false), bfm, 0, 0);
                    } else if (skill != null) {
                        bfm.AgE(-1737900341);
                        AnonymousClass001.A1F(skill, hatchConnectorLookupViewModel, bfm, this.$content, 0);
                    } else {
                        bfm.AgE(-1737898331);
                        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b7d);
                        boolean zA67 = bfm.A67(hatchConnectorLookupViewModel);
                        Object objAaT2 = bfm.AaT();
                        if (zA67 || objAaT2 == C78N.A00) {
                            objAaT2 = new SkillLookupSheetContentKt$SkillLookupSheetContent$2$2$1(hatchConnectorLookupViewModel);
                            bfm.Ai0(objAaT2);
                        }
                        HatchScreenErrorStateKt.HatchScreenErrorState(strA012, (Function0) ((InterfaceC7353EnQ) objAaT2), C3U4.A06(C10G.A02, 32.0f), null, null, null, null, bfm, 384, 120);
                    }
                    BBI.A0R(bbi, false);
                    return;
                }
                throw AnonymousClass001.A0o();
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.SkillLookupSheetContentKt$SkillLookupSheetContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ G2j<Skill, HatchConnectorLookupViewModel, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ boolean $trackConsentLoading;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, BRg bRg, boolean z, Function0<Unit> function0, G2j<? super Skill, ? super HatchConnectorLookupViewModel, ? super BFM, ? super Integer, Unit> g2j, int i, int i2) {
            super(2);
            this.$connectorId = str;
            this.$modifier = bRg;
            this.$trackConsentLoading = z;
            this.$onDismissRequest = function0;
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
            SkillLookupSheetContentKt.SkillLookupSheetContent(this.$connectorId, this.$modifier, this.$trackConsentLoading, this.$onDismissRequest, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SkillLookupSheetContent(java.lang.String r20, X.BRg r21, boolean r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, X.G2j<? super com.facebook.aura.skills.model.Skill, ? super com.facebook.aura.skills.viewmodel.HatchConnectorLookupViewModel, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.connect.SkillLookupSheetContentKt.SkillLookupSheetContent(java.lang.String, X.BRg, boolean, kotlin.jvm.functions.Function0, X.G2j, X.BFM, int, int):void");
    }
}
