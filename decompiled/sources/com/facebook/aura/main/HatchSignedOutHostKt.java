package com.facebook.aura.main;

import X.AFz;
import X.AMl;
import X.ARD;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.BT9;
import X.BTC;
import X.C07759in;
import X.C07769ip;
import X.C0872AFu;
import X.C2293BSt;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C9jC;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC0857A6e;
import X.InterfaceC1074AXb;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import com.facebook.aura.login.nativeflow.PreloadsTosRouteKt;
import com.facebook.aura.navigation.AuraNavDisplayKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchSignedOutHostKt {

    /* renamed from: com.facebook.aura.main.HatchSignedOutHostKt$HatchSignedOutHost$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ BRg $contentModifier;
        public final /* synthetic */ boolean $isInteractive;
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, BRg bRg, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator) {
            super(2);
            this.$isInteractive = z;
            this.$contentModifier = bRg;
            this.$backStack = navBackStack;
            this.$navigator = auraNavigator;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean z = this.$isInteractive;
            BRg bRgInertDuringHandoff = this.$contentModifier;
            if (!z) {
                bRgInertDuringHandoff = HatchSignedOutHostKt.inertDuringHandoff(bRgInertDuringHandoff);
            }
            AuraNavDisplayKt.AuraLoggedOutNavDisplay(this.$backStack, this.$navigator, bRgInertDuringHandoff, z, null, bfm, 0, 16);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.main.HatchSignedOutHostKt$HatchSignedOutHost$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isColdStart;
        public final /* synthetic */ boolean $isInteractive;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraRageShakeManager $rageShakeManager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, boolean z2, AuraRageShakeManager auraRageShakeManager, BRg bRg, int i, int i2) {
            super(2);
            this.$isColdStart = z;
            this.$isInteractive = z2;
            this.$rageShakeManager = auraRageShakeManager;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSignedOutHostKt.HatchSignedOutHost(this.$isColdStart, this.$isInteractive, this.$rageShakeManager, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchSignedOutHost(boolean z, boolean z2, AuraRageShakeManager auraRageShakeManager, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        C7384Etj.A0Y(auraRageShakeManager, 2);
        bfm.AgG(1481289291);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass003.A05(AnonymousClass004.A1Z(auraRageShakeManager, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg);
        }
        boolean z3 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraNavKey auraNavKeyRememberNativeLoginStartKey = PreloadsTosRouteKt.rememberNativeLoginStartKey(z, bfm, iA0n & 14);
            if (auraNavKeyRememberNativeLoginStartKey == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new HatchSignedOutHostKt$HatchSignedOutHost$initialKey$1(z, z2, auraRageShakeManager, bRg, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            AMl[] aMlArr = {auraNavKeyRememberNativeLoginStartKey};
            Object[] objArr = new Object[0];
            C07759in c07759in = new C07759in(new C07769ip());
            boolean zA67 = bfm.A67(aMlArr);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = C2293BSt.A00(aMlArr, 34);
                bfm.Ai0(objAaT);
            }
            C9jC c9jC = C9jC.A01;
            NavBackStack navBackStack = (NavBackStack) AFz.A02(bfm, new C0872AFu(new BTC(14, c07759in, c9jC), new BT9(16, c9jC, c07759in)), (Function0) objAaT, Arrays.copyOf(objArr, 0), 0);
            C7384Etj.A0Z(navBackStack, "null cannot be cast to non-null type androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey>");
            AuraNavigator auraNavigatorRememberAuraNavigator = AuraNavigatorKt.rememberAuraNavigator(navBackStack, bfm, 0);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zA1C = AnonymousClass003.A1C(iA0n);
            if ((iA0n & 896) == 256 || ((iA0n & 512) != 0 && bfm.A67(auraRageShakeManager))) {
                z3 = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorRememberAuraNavigator, zA1C, z3);
            Object objAaT2 = bfm.AaT();
            if (zA1V || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSignedOutHostKt$HatchSignedOutHost$1$1(z2, auraRageShakeManager, auraNavigatorRememberAuraNavigator);
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, auraNavigatorRememberAuraNavigator, boolValueOf);
            AnonymousClass006.A15(bfm, AuraNavigatorKt.LocalNavigator.A04(auraNavigatorRememberAuraNavigator), new AnonymousClass2(z2, AnonymousClass001.A0T(bRg), navBackStack, auraNavigatorRememberAuraNavigator), -291433717);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(z, z2, auraRageShakeManager, bRg, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }

    public static final BRg inertDuringHandoff(BRg bRg) {
        return ARD.A00(AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.main.HatchSignedOutHostKt.inertDuringHandoff.1

            @DebugMetadata(c = "com.facebook.aura.main.HatchSignedOutHostKt$inertDuringHandoff$1$1", f = "HatchSignedOutHost.kt", l = {55}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.main.HatchSignedOutHostKt$inertDuringHandoff$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02351 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public /* synthetic */ Object L$0;
                public int label;

                public C02351(HtJ<? super C02351> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C02351 c02351 = new C02351(htJ);
                    c02351.L$0 = obj;
                    return c02351;
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
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchSignedOutHostKt.AnonymousClass1.C02351.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    C02351 c02351 = new C02351(htJ);
                    c02351.L$0 = interfaceC1074AXb;
                    return c02351.invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                Object objA50 = bRr.A50(new C02351(null), htJ);
                return objA50 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA50;
            }
        }, Unit.INSTANCE), C126582.INSTANCE);
    }

    /* renamed from: com.facebook.aura.main.HatchSignedOutHostKt$inertDuringHandoff$2, reason: invalid class name and case insensitive filesystem */
    public final class C126582 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
        public static final C126582 INSTANCE = new C126582();

        public C126582() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        }
    }
}
