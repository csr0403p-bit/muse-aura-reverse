package com.facebook.aura.globaleffects;

import X.AKH;
import X.AKL;
import X.AbstractC1772AqQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C2186B9f;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.G0U;
import X.G0V;
import X.InterfaceC2262BMi;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class HatchUiControlEffectsKt {

    /* renamed from: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$HatchUiControlEffects$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUiControlEffectsKt.HatchUiControlEffects(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlBackEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUiControlEffectsKt.UiControlBackEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlChatThemeEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C121692 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121692(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUiControlEffectsKt.UiControlChatThemeEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlNavigationEffect$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUiControlEffectsKt.UiControlNavigationEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlNavigationHostEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C121702 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121702(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchUiControlEffectsKt.UiControlNavigationHostEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchUiControlEffects(BFM bfm, int i) {
        bfm.AgG(-1910051313);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            UiControlNavigationEffect(bfm, 0);
            UiControlBackEffect(bfm, 0);
            UiControlNavigationHostEffect(bfm, 0);
            UiControlChatThemeEffect(bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }

    public static final void UiControlBackEffect(BFM bfm, int i) {
        bfm.AgG(1606752247);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            UiControlActionSink companion = UiControlActionSink.Companion.getInstance(AnonymousClass002.A0h(bfm));
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            InterfaceC2262BMi interfaceC2262BMiA00 = AbstractC1772AqQ.A00(bfm);
            C2186B9f onBackPressedDispatcher = interfaceC2262BMiA00 != null ? interfaceC2262BMiA00.getOnBackPressedDispatcher() : null;
            Object[] objArr = {companion, auraNavigatorA0b, activity, onBackPressedDispatcher};
            boolean zA1V = AnonymousClass005.A1V(bfm, activity, onBackPressedDispatcher, companion, bfm.A67(auraNavigatorA0b));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchUiControlEffectsKt$UiControlBackEffect$1$1(companion, auraNavigatorA0b, activity, onBackPressedDispatcher);
                bfm.Ai0(objAaT);
            }
            C7bA.A07(bfm, null, (G0U) objAaT, objArr, 0, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }

    public static final void UiControlChatThemeEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -2106940789, i), bfm, i)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            UiControlActionSink companion = UiControlActionSink.Companion.getInstance(abstractC3358CGzA0h);
            HatchIdentityProvider companion2 = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
            boolean zA1M = AnonymousClass003.A1M(bfm, companion, companion2);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1(companion, companion2, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, companion, companion2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121692(i);
        }
    }

    public static final void UiControlNavigationEffect(BFM bfm, int i) {
        bfm.AgG(-978845148);
        if (AnonymousClass001.A1b(AnonymousClass002.A1L(i), bfm, i)) {
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            HatchIntentViewModel.Factory factory = new HatchIntentViewModel.Factory();
            AKH<Activity> akh = AKL.A00;
            Object objA6v = bfm.A6v(akh);
            C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
            ComponentActivity componentActivity = (ComponentActivity) objA6v;
            HatchIntentViewModel hatchIntentViewModel = (HatchIntentViewModel) C3cH.A0H(factory, componentActivity, AnonymousClass003.A0Z(componentActivity), C3cG.A0x(HatchIntentViewModel.class));
            UiControlActionSink companion = UiControlActionSink.Companion.getInstance(abstractC3358CGzA0h);
            Activity activity = (Activity) bfm.A6v(akh);
            boolean zA1M = AnonymousClass003.A1M(bfm, activity, companion);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchUiControlEffectsKt$UiControlNavigationEffect$1$1(companion, activity);
                bfm.Ai0(objAaT);
            }
            C7bA.A04(bfm, null, companion, activity, (G0U) objAaT, 0, 4);
            boolean zA1S = AnonymousClass005.A1S(bfm, companion, hatchIntentViewModel, abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == C78N.A00) {
                objAaT2 = new HatchUiControlEffectsKt$UiControlNavigationEffect$2$1(companion, hatchIntentViewModel, abstractC3358CGzA0h, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A1A(bfm, objAaT2, companion, abstractC3358CGzA0h);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i);
        }
    }

    public static final void UiControlNavigationHostEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 1159470700, i), bfm, i)) {
            UiControlActionSink companion = UiControlActionSink.Companion.getInstance(AnonymousClass002.A0h(bfm));
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA0b, companion);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HatchUiControlEffectsKt$UiControlNavigationHostEffect$1$1(auraNavigatorA0b, companion);
                bfm.Ai0(objAaT);
            }
            C7bA.A04(bfm, null, companion, auraNavigatorA0b, (G0U) objAaT, 0, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121702(i);
        }
    }
}
