package com.facebook.aura.partners.voice.screen;

import X.AKL;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import android.content.Context;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.viewmodel.VoiceCallViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class VoiceCallSurfacesKt {

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallSurfacesKt$VoiceCallLifecycleEffect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallSurfacesKt.VoiceCallLifecycleEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceCallSurfacesKt$VoiceCallLifecycleEffect$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            VoiceCallSurfacesKt.VoiceCallLifecycleEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void VoiceCallLifecycleEffect(BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass3;
        bfm.AgG(-1430117972);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            VoiceCallStateHolder companion = VoiceCallStateHolder.Companion.getInstance(AnonymousClass002.A0h(bfm));
            C1BO c1boA02 = C2CK.A02(bfm, companion.pendingCallStart);
            C1BO c1boA022 = C2CK.A02(bfm, companion.isCallActive);
            if (c1boA02.getValue() == null && !C1BO.A0F(c1boA022)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(i);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            VoiceCallViewModel voiceCallViewModelRememberVoiceCallViewModel = rememberVoiceCallViewModel(bfm, 0);
            Object value = c1boA02.getValue();
            boolean zA1O = C3cH.A1O(bfm, c1boA02, companion, voiceCallViewModelRememberVoiceCallViewModel);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new VoiceCallSurfacesKt$VoiceCallLifecycleEffect$2$1(c1boA02, companion, voiceCallViewModelRememberVoiceCallViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, voiceCallViewModelRememberVoiceCallViewModel, value);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(i);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final /* synthetic */ Long access$VoiceCallLifecycleEffect$lambda$0(C1BO c1bo) {
        return (Long) c1bo.getValue();
    }

    public static final VoiceCallViewModel rememberVoiceCallViewModel(BFM bfm, int i) {
        BOD bodA00;
        Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        Object objA6v = bfm.A6v(AKL.A00);
        if (!(objA6v instanceof BOD) || (bodA00 = (BOD) objA6v) == null) {
            bfm.AgE(899757088);
            bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
        } else {
            bfm.AgE(899755073);
        }
        AnonymousClass002.A19(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            C7384Etj.A0X(applicationContext);
            objAaT = new VoiceCallViewModel.Factory(applicationContext, abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        return (VoiceCallViewModel) BQN.A00((AuraViewModelFactory) objAaT, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(VoiceCallViewModel.class));
    }
}
