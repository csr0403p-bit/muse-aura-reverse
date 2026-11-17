package com.facebook.aura.appupdate;

import X.AIC;
import X.AKO;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C1HY;
import X.C1er;
import X.C3cG;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.C7bA;
import X.C8597Fgz;
import X.EnumC3085Bxl;
import X.F2N;
import X.G0U;
import X.G0V;
import X.InterfaceC3408CKu;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class PlayInAppUpdateEffectKt {

    /* renamed from: com.facebook.aura.appupdate.PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PlayInAppUpdateEffectKt.PlayInAppUpdateEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.appupdate.PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PlayInAppUpdateEffectKt.PlayInAppUpdateEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void PlayInAppUpdateEffect(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass5;
        bfm.AgG(-2015415846);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            BBI bbi = (BBI) bfm;
            if (!AuraInstallSourceDetector.INSTANCE.isPlayStoreInstall(AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass1(i);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            InterfaceC3408CKu auraPlayAppUpdateManager = AuraPlayAppUpdateManager.INSTANCE.getInstance();
            F2N lifecycle = ((C1HY) AKO.A07(AIC.A00, bbi)).getLifecycle();
            MutableState mutableStateA00 = C1er.A00(bfm, AuraPlayUpdatePromptsKt.rememberPlayUpdatePrompts(bfm, 0));
            boolean zA1K = AnonymousClass003.A1K(bfm, auraPlayAppUpdateManager, lifecycle);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new AuraPlayUpdateController(auraPlayAppUpdateManager, lifecycle, new PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$controller$1$1(mutableStateA00));
                BBI.A0O(bbi, objAaT);
            }
            AuraPlayUpdateController auraPlayUpdateController = (AuraPlayUpdateController) objAaT;
            C8597Fgz c8597Fgz = new C8597Fgz();
            boolean zA67 = bfm.A67(auraPlayUpdateController);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$launcher$1$1(auraPlayUpdateController);
                BBI.A0O(bbi, objAaT2);
            }
            C7OU c7ouA00 = C7OQ.A00(c8597Fgz, bfm, (G0U) objAaT2);
            boolean zA672 = bfm.A67(auraPlayUpdateController);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$2$1(auraPlayUpdateController);
                BBI.A0O(bbi, objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, auraPlayUpdateController);
            boolean zA1M = AnonymousClass003.A1M(bfm, auraPlayUpdateController, c7ouA00);
            Object objAaT4 = bfm.AaT();
            if (zA1M || objAaT4 == C78N.A00) {
                objAaT4 = new PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$3$1(auraPlayUpdateController, c7ouA00, null);
                BBI.A0O(bbi, objAaT4);
            }
            AnonymousClass001.A1A(bfm, objAaT4, auraPlayUpdateController, c7ouA00);
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA1M2 = AnonymousClass003.A1M(bfm, auraPlayUpdateController, c7ouA00);
            Object objAaT5 = bfm.AaT();
            if (zA1M2 || objAaT5 == C78N.A00) {
                objAaT5 = new PlayInAppUpdateEffectKt$PlayInAppUpdateEffect$4$1(auraPlayUpdateController, c7ouA00);
                BBI.A0O(bbi, objAaT5);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT5, 6, 2);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(i);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }
}
