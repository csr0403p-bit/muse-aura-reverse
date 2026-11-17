package com.facebook.aura.vmdisabled.content;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
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
import X.C06G;
import X.C1515AkP;
import X.C1b8;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VmRecoveryFlowPreviewScreenKt {

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoveryFlowPreviewScreenKt$VmRecoveryFlowPreviewScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $flowType;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = str;
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
            VmRecoveryFlowPreviewScreenKt.VmRecoveryFlowPreviewScreen(this.$flowType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void VmRecoveryFlowPreviewScreen(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-539659514);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            Object objA6v = bfm.A6v(AuraNavigatorKt.LocalNavigator);
            VmRecoveryFlowType vmRecoveryFlowTypeFromWire = VmRecoveryFlowType.Companion.fromWire(str);
            if (vmRecoveryFlowTypeFromWire == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new VmRecoveryFlowPreviewScreenKt$VmRecoveryFlowPreviewScreen$flow$1(str, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass2;
                }
                return;
            }
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(bRg2), C06G.A0B(bfm));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            VmRecoveryFlowBodyKt.VmRecoveryFlowBody(vmRecoveryFlowTypeFromWire, true, null, bfm, 48, 4);
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            boolean zA67 = bfm.A67(objA6v);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VmRecoveryFlowPreviewScreenKt$VmRecoveryFlowPreviewScreen$1$1$1(objA6v);
                bfm.Ai0(objAaT);
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, (Function0) objAaT, null, hatchHeaderTitleAlignment, false, 0, null, null, false, null, null, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, RuntimeInternals.IOPRIO_BACKGROUND, 0, 0, 4194283);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(str, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass2;
        }
    }
}
