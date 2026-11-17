package com.facebook.aura.navigation;

import X.AKH;
import X.AKJ;
import X.AKQ;
import X.ARi;
import X.ASj;
import X.AbstractC0878AGe;
import X.AbstractC1754Apr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.B81;
import X.BA3;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRL;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1er;
import X.C2HU;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3Ue;
import X.C3cG;
import X.C78N;
import X.C79;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.toast.HatchToastHostKt;
import com.facebook.aura.ui.adaptive.AuraPageCardKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetStateKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BottomSheetScene$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ BottomSheetScene<T> this$0;

    /* renamed from: com.facebook.aura.navigation.BottomSheetScene$content$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRL<T> $currentEntry;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ AtomicBoolean $isDismissing;
        public final /* synthetic */ AuraThemeMode $overlaidMode;
        public final /* synthetic */ BottomSheetScene$content$1$sheetNavigator$1$1 $sheetNavigator;
        public final /* synthetic */ AuraSheetState $sheetState;

        /* renamed from: com.facebook.aura.navigation.BottomSheetScene$content$1$2$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ BRL<T> $currentEntry;
            public final /* synthetic */ boolean $dismissible;
            public final /* synthetic */ AtomicBoolean $isDismissing;
            public final /* synthetic */ AuraThemeMode $overlaidMode;
            public final /* synthetic */ BottomSheetScene$content$1$sheetNavigator$1$1 $sheetNavigator;
            public final /* synthetic */ AuraSheetState $sheetState;

            /* renamed from: com.facebook.aura.navigation.BottomSheetScene$content$1$2$3$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ BRL<T> $currentEntry;
                public final /* synthetic */ boolean $dismissible;
                public final /* synthetic */ AtomicBoolean $isDismissing;
                public final /* synthetic */ BottomSheetScene$content$1$sheetNavigator$1$1 $sheetNavigator;
                public final /* synthetic */ AuraSheetState $sheetState;

                /* renamed from: com.facebook.aura.navigation.BottomSheetScene$content$1$2$3$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02401 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                    public final /* synthetic */ BRL<T> $currentEntry;
                    public final /* synthetic */ boolean $dismissible;
                    public final /* synthetic */ AtomicBoolean $isDismissing;
                    public final /* synthetic */ BottomSheetScene$content$1$sheetNavigator$1$1 $sheetNavigator;
                    public final /* synthetic */ AuraSheetState $sheetState;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02401(boolean z, BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1, AtomicBoolean atomicBoolean, AuraSheetState auraSheetState, BRL<T> brl) {
                        super(2);
                        this.$dismissible = z;
                        this.$sheetNavigator = bottomSheetScene$content$1$sheetNavigator$1$1;
                        this.$isDismissing = atomicBoolean;
                        this.$sheetState = auraSheetState;
                        this.$currentEntry = brl;
                    }

                    @Override // X.G0V
                    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                        invoke(bfm, AnonymousClass001.A0F(num));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BFM bfm, int i) {
                        if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                            if (!this.$dismissible) {
                                Object objA0p = AnonymousClass001.A0p(bfm, 1983847748);
                                if (objA0p == C78N.A00) {
                                    objA0p = BottomSheetScene$content$1$2$3$1$1$1$1.INSTANCE;
                                    bfm.Ai0(objA0p);
                                }
                                B81.A00(true, (Function0) objA0p, bfm, 54, 0);
                            } else {
                                bfm.AgE(1983913933);
                                boolean zA67 = bfm.A67(this.$sheetNavigator);
                                BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1 = this.$sheetNavigator;
                                Object objAaT = bfm.AaT();
                                if (zA67 || objAaT == C78N.A00) {
                                    objAaT = new BottomSheetScene$content$1$2$3$1$1$2$1(bottomSheetScene$content$1$sheetNavigator$1$1);
                                    bfm.Ai0(objAaT);
                                }
                                B81.A00(true, (Function0) objAaT, bfm, 6, 0);
                            }
                            BBI bbi = (BBI) bfm;
                            BBI.A0R(bbi, false);
                            BS0 bs0 = BRg.A00;
                            C1062ATq c1062ATq = C10G.A02;
                            AtomicBoolean atomicBoolean = this.$isDismissing;
                            AuraSheetState auraSheetState = this.$sheetState;
                            BRL<T> brl = this.$currentEntry;
                            Alignment alignment = C2VU.A0E;
                            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                            long j = bbi.A06;
                            int i2 = (int) (j ^ (j >>> 32));
                            AKQ akqA04 = BBI.A04(bbi);
                            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                            if (bbi.A0V == null) {
                                C00x.A00();
                                throw F60.createAndThrow();
                            }
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
                            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                            C0z7 c0z7 = C0z7.A00;
                            BRg bRgThen = C11U.A00(c1062ATq).then(new ARi(new ASj(C2HU.A01, 250, 0), C2VU.A0C));
                            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                            int iA0D = AnonymousClass001.A0D(bbi);
                            AKQ akqA042 = BBI.A04(bbi);
                            BRg bRgA012 = AxM.A01(bfm, bRgThen);
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            BPg.A02(bfm, interfaceC1380AiAA012, g0v);
                            BPg.A02(bfm, akqA042, g0v2);
                            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                            BPg.A02(bfm, bRgA012, g0vA0u);
                            bfm.Ag8(-51159227, brl.A00);
                            brl.A00(bfm, 0);
                            BBI.A0R(bbi, false);
                            BBI.A0R(bbi, true);
                            BRg bRgA09 = C3U4.A09(AbstractC1754Apr.A01(c0z7.A4C(C2VU.A06, bs0)), C06G.A00(bfm));
                            boolean zA1N = AnonymousClass003.A1N(bfm, atomicBoolean, auraSheetState);
                            Object objAaT2 = bfm.AaT();
                            if (zA1N || objAaT2 == C78N.A00) {
                                objAaT2 = new BottomSheetScene$content$1$2$3$1$1$3$2$1(atomicBoolean, auraSheetState);
                                bfm.Ai0(objAaT2);
                            }
                            HatchToastHostKt.HatchToastHostOverlay(bRgA09, (Function0) objAaT2, bfm, 0, 0);
                            BBI.A0R(bbi, true);
                            return;
                        }
                        bfm.Afo();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1, AuraSheetState auraSheetState, boolean z, AtomicBoolean atomicBoolean, BRL<T> brl) {
                    super(2);
                    this.$sheetNavigator = bottomSheetScene$content$1$sheetNavigator$1$1;
                    this.$sheetState = auraSheetState;
                    this.$dismissible = z;
                    this.$isDismissing = atomicBoolean;
                    this.$currentEntry = brl;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                        AKH<AuraNavigator> akh = AuraNavigatorKt.LocalNavigator;
                        BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1 = this.$sheetNavigator;
                        AKJ<AuraNavigator> akjA04 = akh.A04(bottomSheetScene$content$1$sheetNavigator$1$1);
                        AKH<AuraSheetState> akh2 = AuraSheetStateKt.LocalAuraSheetState;
                        AuraSheetState auraSheetState = this.$sheetState;
                        AnonymousClass003.A0p(bfm, new C02401(this.$dismissible, bottomSheetScene$content$1$sheetNavigator$1$1, this.$isDismissing, auraSheetState, this.$currentEntry), new AKJ[]{akjA04, akh2.A04(auraSheetState), AuraPageCardKt.LocalAuraPageCardSuppressed.A04(true)}, 1203885762);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AuraThemeMode auraThemeMode, BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1, AuraSheetState auraSheetState, boolean z, AtomicBoolean atomicBoolean, BRL<T> brl) {
                super(3);
                this.$overlaidMode = auraThemeMode;
                this.$sheetNavigator = bottomSheetScene$content$1$sheetNavigator$1$1;
                this.$sheetState = auraSheetState;
                this.$dismissible = z;
                this.$isDismissing = atomicBoolean;
                this.$currentEntry = brl;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                    BottomSheetSceneStrategyKt.SystemBarsModeEffect(this.$overlaidMode, bfm, 0);
                    ProvideWindowBackDispatcherKt.ProvideWindowBackDispatcher(B1V.A00(bfm, new AnonymousClass1(this.$sheetNavigator, this.$sheetState, this.$dismissible, this.$isDismissing, this.$currentEntry), 68964866), bfm, 6);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1, AuraSheetState auraSheetState, AuraThemeMode auraThemeMode, AtomicBoolean atomicBoolean, BRL<T> brl) {
            super(2);
            this.$dismissible = z;
            this.$sheetNavigator = bottomSheetScene$content$1$sheetNavigator$1$1;
            this.$sheetState = auraSheetState;
            this.$overlaidMode = auraThemeMode;
            this.$isDismissing = atomicBoolean;
            this.$currentEntry = brl;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            Function0 function0;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                BRg bRgA02 = AbstractC1754Apr.A02(BRg.A00);
                if (this.$dismissible) {
                    bfm.AgE(-46934969);
                    boolean zA67 = bfm.A67(this.$sheetNavigator);
                    BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1 = this.$sheetNavigator;
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new BottomSheetScene$content$1$2$1$1(bottomSheetScene$content$1$sheetNavigator$1$1);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                } else {
                    Object objA0p = AnonymousClass001.A0p(bfm, -46884687);
                    if (objA0p == C78N.A00) {
                        objA0p = BottomSheetScene$content$1$2$2$1.INSTANCE;
                        bfm.Ai0(objA0p);
                    }
                    function0 = (Function0) objA0p;
                }
                boolean zA1V = AnonymousClass001.A1V(bfm);
                long j = AnonymousClass002.A0c(bfm).modal;
                BA3 ba3 = new BA3(C79.A00, zA1V);
                AuraSheetState auraSheetState = this.$sheetState;
                AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(bRgA02, function0, ba3, auraSheetState, j, zA1V, zA1V, B1V.A00(bfm, new AnonymousClass3(this.$overlaidMode, this.$sheetNavigator, auraSheetState, this.$dismissible, this.$isDismissing, this.$currentEntry), 841969302), bfm, 12583296, 96);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScene$content$1(BottomSheetScene<T> bottomSheetScene) {
        super(2);
        this.this$0 = bottomSheetScene;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        Object objPrevious;
        Object obj;
        AuraThemeMode auraThemeMode;
        Map<String, Object> map;
        Boolean bool = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BottomSheetSceneState sceneState = this.this$0.getSceneState();
            BRL brl = (BRL) AbstractC0878AGe.A0H(sceneState.sheetEntries);
            Object obj2 = brl.A02.get(BottomSheetSceneStrategy.DISMISSIBLE_KEY);
            AuraThemeMode auraThemeMode2 = null;
            if (!(obj2 instanceof Boolean)) {
                obj2 = null;
            }
            boolean z = !bool.equals(obj2);
            Object obj3 = ((BRL) AbstractC0878AGe.A0F(sceneState.sheetEntries)).A02.get(BottomSheetSceneStrategy.SKIP_PARTIALLY_EXPANDED_KEY);
            if (!(obj3 instanceof Boolean)) {
                obj3 = null;
            }
            boolean z2 = !bool.equals(obj3);
            ListIterator listIteratorA0n = C3cG.A0n(sceneState.overlaidEntries);
            while (true) {
                if (listIteratorA0n.hasPrevious()) {
                    objPrevious = listIteratorA0n.previous();
                    if (!C3cG.A1P(((BRL) objPrevious).A02.get(BottomSheetSceneStrategy.BOTTOM_SHEET_KEY), true)) {
                        break;
                    }
                } else {
                    objPrevious = null;
                    break;
                }
            }
            BRL brl2 = (BRL) objPrevious;
            if (brl2 != null && (map = brl2.A02) != null) {
                obj = map.get(AuraModeMetadata.MODE_KEY);
            } else {
                obj = null;
            }
            if (obj instanceof AuraThemeMode) {
                auraThemeMode2 = (AuraThemeMode) obj;
            }
            boolean zA65 = bfm.A65(this.this$0);
            BottomSheetScene<T> bottomSheetScene = this.this$0;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new BottomSheetScene$content$1$rememberedSheetState$1$1(bottomSheetScene);
                bfm.Ai0(objAaT);
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(z2, (G0U) objAaT, false, bfm, 0, 4);
            BottomSheetScene<T> bottomSheetScene2 = this.this$0;
            AuraSheetState auraSheetState = bottomSheetScene2.retainedSheetState;
            if (auraSheetState == null) {
                auraSheetState = auraSheetStateRememberAuraBottomSheetState;
            }
            boolean zA1K = AnonymousClass003.A1K(bfm, bottomSheetScene2, auraSheetState);
            BottomSheetScene<T> bottomSheetScene3 = this.this$0;
            Object objAaT2 = bfm.AaT();
            if (zA1K || objAaT2 == C78N.A00) {
                objAaT2 = new BottomSheetScene$content$1$1$1(bottomSheetScene3, auraSheetState);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, auraSheetState);
            Object objAaT3 = bfm.AaT();
            Object obj4 = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT3, obj4);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj4) {
                objAaT4 = new AtomicBoolean(false);
                bfm.Ai0(objAaT4);
            }
            AtomicBoolean atomicBoolean = (AtomicBoolean) objAaT4;
            MutableState mutableStateA00 = C1er.A00(bfm, Integer.valueOf(sceneState.sheetEntries.size()));
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA00, AnonymousClass005.A1T(bfm, auraSheetState, c3ux, atomicBoolean, bfm.A65(auraNavigatorA0b)));
            Object objAaT5 = bfm.AaT();
            if (zA1R || objAaT5 == obj4) {
                objAaT5 = new BottomSheetScene$content$1$sheetNavigator$1$1(auraNavigatorA0b, mutableStateA00, atomicBoolean, c3ux, auraSheetState);
                bfm.Ai0(objAaT5);
            }
            BottomSheetScene$content$1$sheetNavigator$1$1 bottomSheetScene$content$1$sheetNavigator$1$1 = (BottomSheetScene$content$1$sheetNavigator$1$1) objAaT5;
            if (auraThemeMode2 == null) {
                auraThemeMode = AuraThemeMode.DEFAULT;
            } else {
                auraThemeMode = auraThemeMode2;
            }
            AuraModeOverriderKt.AuraModeOverrider(auraThemeMode, null, B1V.A00(bfm, new AnonymousClass2(z, bottomSheetScene$content$1$sheetNavigator$1$1, auraSheetState, auraThemeMode2, atomicBoolean, brl), 623821839), bfm, 384, 2);
            return;
        }
        bfm.Afo();
    }
}
