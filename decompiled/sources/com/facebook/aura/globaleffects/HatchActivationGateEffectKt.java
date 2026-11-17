package com.facebook.aura.globaleffects;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1BO;
import X.C2CK;
import X.C3cH;
import X.C78N;
import X.G0V;
import androidx.activity.ComponentActivity;
import com.facebook.aura.activation.model.HatchActivationGateViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchActivationGateEffectKt {

    /* renamed from: com.facebook.aura.globaleffects.HatchActivationGateEffectKt$HatchActivationGateEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActivationGateEffectKt.HatchActivationGateEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchActivationGateEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -209488785, i), bfm, i)) {
            HatchActivationGateViewModel.Factory factory = new HatchActivationGateViewModel.Factory(AnonymousClass002.A0h(bfm));
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchActivationGateViewModel hatchActivationGateViewModel = (HatchActivationGateViewModel) C3cH.A0G(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), HatchActivationGateViewModel.class);
            C1BO c1boA02 = C2CK.A02(bfm, hatchActivationGateViewModel.isGateRequired);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(c1boA02));
            boolean zA1O = C3cH.A1O(bfm, c1boA02, auraNavigatorA0b, hatchActivationGateViewModel);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchActivationGateEffectKt$HatchActivationGateEffect$1$1(auraNavigatorA0b, hatchActivationGateViewModel, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
