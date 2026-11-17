package com.facebook.aura.vmavailability.content;

import X.AGI;
import X.AHH;
import X.AKQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.activation.view.AuraGatingScreenKt;
import com.facebook.aura.gateway.HatchVmAvailabilityStore;
import com.facebook.aura.gateway.VmFetchError;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vmavailability.VmUnavailableViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class VmUnavailableOverlayContentKt {

    /* renamed from: com.facebook.aura.vmavailability.content.VmUnavailableOverlayContentKt$VmUnavailableOverlayContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
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
            VmUnavailableOverlayContentKt.VmUnavailableOverlayContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void VmUnavailableOverlayContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-380977870);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            VmUnavailableViewModel.Factory factory = new VmUnavailableViewModel.Factory(abstractC3358CGzA0h);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            VmUnavailableViewModel vmUnavailableViewModel = (VmUnavailableViewModel) C3cH.A0H(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), C3cG.A0x(VmUnavailableViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, HatchVmAvailabilityStore.Companion.getInstance(abstractC3358CGzA0h).vmFetchError);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = VmUnavailableOverlayContentKt$VmUnavailableOverlayContent$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            VmFetchError vmFetchError = (VmFetchError) c1boA02.getValue();
            String str = vmFetchError != null ? vmFetchError.title : null;
            VmFetchError vmFetchError2 = (VmFetchError) c1boA02.getValue();
            AuraGatingScreenKt.AuraGatingScreen(null, str, vmFetchError2 != null ? vmFetchError2.summary : null, null, null, bfm, 0, 25);
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            AHH ahhA0E = AGI.A0E(HeaderButton.Settings);
            boolean zA1M = AnonymousClass003.A1M(bfm, vmUnavailableViewModel, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == obj) {
                objAaT2 = new VmUnavailableOverlayContentKt$VmUnavailableOverlayContent$2$1$1(vmUnavailableViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, null, null, hatchHeaderTitleAlignment, false, 0, null, null, false, ahhA0E, (G0U) objAaT2, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, 221184, 6, 0, 4191183);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, i, i2);
        }
    }
}
