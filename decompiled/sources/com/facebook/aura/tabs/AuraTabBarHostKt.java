package com.facebook.aura.tabs;

import X.AGO;
import X.AKH;
import X.AKQ;
import X.AXN;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC7559F3s;
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
import X.BRr;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C1DG;
import X.C1b8;
import X.C3Ue;
import X.C78N;
import X.EnumC10460Hji;
import X.F60;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.ui.HatchWindowGeometry;
import com.facebook.aura.ui.HatchWindowGeometryKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraTabBarHostKt {
    public static final AKH<AuraTabBarHostState> LocalAuraTabBarHostState = new AGO(AuraTabBarHostKt$LocalAuraTabBarHostState$1.INSTANCE);
    public static final AKH<C1DG> LocalAuraTabBarBottomPadding = new AGO(AuraTabBarHostKt$LocalAuraTabBarBottomPadding$1.INSTANCE);
    public static final AKH<C1DG> LocalAuraTabBarHeight = new AGO(AuraTabBarHostKt$LocalAuraTabBarHeight$1.INSTANCE);

    /* renamed from: com.facebook.aura.tabs.AuraTabBarHostKt$AuraTabBarHost$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraTabBarHostState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraTabRootNavKey auraTabRootNavKey, AuraTabBarHostState auraTabBarHostState, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$currentTabRoot = auraTabRootNavKey;
            this.$state = auraTabBarHostState;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTabBarHostKt.AuraTabBarHost(this.$currentTabRoot, this.$state, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraTabBarHost(AuraTabRootNavKey auraTabRootNavKey, AuraTabBarHostState auraTabBarHostState, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2;
        BRg bRgA0X;
        BBI bbiA0M;
        BRg bRgA0Q = bRg;
        boolean z2 = z;
        boolean zA1a = AnonymousClass002.A1a(auraTabRootNavKey, auraTabBarHostState);
        bfm.AgG(-15567945);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraTabRootNavKey, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, auraTabBarHostState);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            HatchWindowGeometry hatchWindowGeometry = (HatchWindowGeometry) bfm.A6v(HatchWindowGeometryKt.LocalHatchWindowGeometry);
            float fAgy = axnA0Y.Agy(hatchWindowGeometry.getNavigationBarLeftPx());
            float fAgy2 = axnA0Y.Agy(hatchWindowGeometry.getNavigationBarRightPx());
            float fAgy3 = axnA0Y.Agy(hatchWindowGeometry.getNavigationBarBottomPx());
            BRg bRgTrackFloatingChromeObstacle = HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(AnonymousClass001.A0R(bRgA0Q), zA1a, bfm, 48, 0);
            if (z2) {
                bbiA0M = AnonymousClass002.A0M(bfm, -2075870625);
                bRgA0X = BRg.A00;
                bRg2 = bRgA0X;
            } else {
                bfm.AgE(-2075869874);
                bRg2 = BRg.A00;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AuraTabBarHostKt$AuraTabBarHost$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                bRgA0X = AnonymousClass001.A0X(bRg2, objAaT);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            BRg bRgThen = bRgTrackFloatingChromeObstacle.then(bRgA0X);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            long j = bbiA0M.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i5);
            C0z7 c0z7 = C0z7.A00;
            int i6 = iA05 & 14;
            boolean zA1C = AnonymousClass003.A1C(iA05) | (i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(auraTabRootNavKey)));
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new AuraTabBarHostKt$AuraTabBarHost$2$1$1(auraTabBarHostState, auraTabRootNavKey);
                bfm.Ai0(objAaT2);
            }
            AuraFixedNavBarKt.m2287AuraFixedNavBarXiNizjQ(auraTabRootNavKey, fAgy3, fAgy, fAgy2, null, (Function0) objAaT2, null, bfm, i6, 80);
            if (auraTabBarHostState.isDimmed(auraTabRootNavKey)) {
                bfm.AgE(1405633494);
                C1b8.A04(bfm, c0z7.AQJ(bRg2), AnonymousClass002.A0c(bfm).scrim);
            } else {
                bfm.AgE(1405720945);
            }
            BBI.A0R(bbiA0M, false);
            if (z2) {
                bfm.AgE(1406072113);
            } else {
                bfm.AgE(1405750178);
                BRg bRgAQJ = c0z7.AQJ(bRg2);
                Unit unit = Unit.INSTANCE;
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == C78N.A00) {
                    objAaT3 = new PointerInputEventHandler() { // from class: com.facebook.aura.tabs.AuraTabBarHostKt$AuraTabBarHost$2$2$1

                        @DebugMetadata(c = "com.facebook.aura.tabs.AuraTabBarHostKt$AuraTabBarHost$2$2$1$1", f = "AuraTabBarHost.kt", l = {149}, m = "invokeSuspend", v = 2)
                        /* renamed from: com.facebook.aura.tabs.AuraTabBarHostKt$AuraTabBarHost$2$2$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                            public /* synthetic */ Object L$0;
                            public int label;

                            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                                super(2, htJ);
                            }

                            @Override // X.AbstractC8884Fsp
                            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
                            /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[LOOP:0: B:7:0x0018->B:9:0x001e, LOOP_END] */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002f -> B:6:0x0010). Please report as a decompilation issue!!! */
                            @Override // X.AbstractC8884Fsp
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                                /*
                                    r5 = this;
                                    java.lang.Object r4 = r5.L$0
                                    X.AXb r4 = (X.InterfaceC1074AXb) r4
                                    X.Hji r3 = X.EnumC10460Hji.A02
                                    int r0 = r5.label
                                    r2 = 1
                                    if (r0 == 0) goto L22
                                    if (r0 != r2) goto L32
                                    X.Hwg.A00(r6)
                                L10:
                                    X.Afe r6 = (X.C1247Afe) r6
                                    java.util.List<X.Agk> r0 = r6.A05
                                    java.util.Iterator r1 = r0.iterator()
                                L18:
                                    boolean r0 = r1.hasNext()
                                    if (r0 == 0) goto L25
                                    X.AnonymousClass006.A1S(r1)
                                    goto L18
                                L22:
                                    X.Hwg.A00(r6)
                                L25:
                                    X.AXj r0 = X.EnumC1080AXj.A03
                                    r5.L$0 = r4
                                    r5.label = r2
                                    java.lang.Object r6 = r4.A4z(r0, r5)
                                    if (r6 != r3) goto L10
                                    return r3
                                L32:
                                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraTabBarHostKt$AuraTabBarHost$2$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            @Override // X.G0V
                            public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                                anonymousClass1.L$0 = interfaceC1074AXb;
                                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                            Object objA50 = bRr.A50(new AnonymousClass1(null), htJ);
                            return objA50 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA50;
                        }
                    };
                    bfm.Ai0(objAaT3);
                }
                C3Ue.A04(AaM.A00(bRgAQJ, (PointerInputEventHandler) objAaT3, unit), bfm, 0);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbiA0M, bRgA0Q, false, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(auraTabRootNavKey, auraTabBarHostState, bRgA0Q, z2, i, i2);
        }
    }

    public static final AKH<C1DG> getLocalAuraTabBarBottomPadding() {
        return LocalAuraTabBarBottomPadding;
    }

    public static final AKH<C1DG> getLocalAuraTabBarHeight() {
        return LocalAuraTabBarHeight;
    }

    public static final AKH<AuraTabBarHostState> getLocalAuraTabBarHostState() {
        return LocalAuraTabBarHostState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberTabBarRegistration(com.facebook.aura.navigation.AuraTabRootNavKey r16, boolean r17, boolean r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.BFM r20, int r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.AuraTabBarHostKt.rememberTabBarRegistration(com.facebook.aura.navigation.AuraTabRootNavKey, boolean, boolean, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }

    public static final AuraTabBarHostState rememberAuraTabBarHostState(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new AuraTabBarHostState();
            bfm.Ai0(objAaT);
        }
        return (AuraTabBarHostState) objAaT;
    }
}
