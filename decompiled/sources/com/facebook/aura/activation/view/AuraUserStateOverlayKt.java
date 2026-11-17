package com.facebook.aura.activation.view;

import X.AKQ;
import X.AWx;
import X.AYD;
import X.AaM;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass604;
import X.AnonymousClass605;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0v5;
import X.C10G;
import X.C11H;
import X.C11S;
import X.C11U;
import X.C1299Agk;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C1AC;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C5as;
import X.C5b2;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.view.View;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraUserStateOverlayKt {

    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$AuraUserStateOverlay$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ AuraUserData $userData;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AuraUserData auraUserData, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$userData = auraUserData;
            this.$userSession = abstractC3358CGz;
            this.$onClose = function0;
            this.$onLogOut = function02;
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
            AuraUserStateOverlayKt.AuraUserStateOverlay(this.$userData, this.$userSession, this.$onClose, this.$onLogOut, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$StateRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $label;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, int i) {
            super(2);
            this.$label = str;
            this.$value = str2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraUserStateOverlayKt.StateRow(this.$label, this.$value, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onStatusChangeFinished;
        public final /* synthetic */ Function0<Unit> $onStatusChangeStarted;
        public final /* synthetic */ View $parentView;
        public final /* synthetic */ List<C5b2> $statusOptions;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends C5b2> list, Function0<Unit> function0, Function0<Unit> function02, C3UX c3ux, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function03, View view) {
            super(3);
            this.$statusOptions = list;
            this.$onDismissRequest = function0;
            this.$onStatusChangeStarted = function02;
            this.$coroutineScope = c3ux;
            this.$userSession = abstractC3358CGz;
            this.$onStatusChangeFinished = function03;
            this.$parentView = view;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                List<C5b2> list = this.$statusOptions;
                Function0<Unit> function0 = this.$onDismissRequest;
                Function0<Unit> function02 = this.$onStatusChangeStarted;
                C3UX c3ux = this.$coroutineScope;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                Function0<Unit> function03 = this.$onStatusChangeFinished;
                View view = this.$parentView;
                for (C5b2 c5b2 : list) {
                    String strA0M = FGI.A0M("Waitlist status set to ", c5b2.name());
                    B1U b1uA00 = B1V.A00(bfm, new AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$1(c5b2), -845932828);
                    boolean zA1U = AnonymousClass005.A1U(bfm, function03, view, strA0M, AnonymousClass003.A1H(bfm, c5b2, AnonymousClass005.A1Y(bfm, c3ux, abstractC3358CGz, bfm.A65(function0), bfm.A65(function02))));
                    Object objAaT = bfm.AaT();
                    if (zA1U || objAaT == C78N.A00) {
                        objAaT = new AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$1$1$2$1(function0, function02, c3ux, abstractC3358CGz, c5b2, function03, view, strA0M, "Failed to set waitlist status");
                        bfm.Ai0(objAaT);
                    }
                    C11H.A01(null, null, null, bfm, null, (Function0) objAaT, b1uA00, null, null, 6, 508, false);
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$WaitlistStatusDropdownMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C107202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ Function0<Unit> $onStatusChangeFinished;
        public final /* synthetic */ Function0<Unit> $onStatusChangeStarted;
        public final /* synthetic */ View $parentView;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107202(boolean z, Function0<Unit> function0, AbstractC3358CGz abstractC3358CGz, View view, C3UX c3ux, Function0<Unit> function02, Function0<Unit> function03, int i) {
            super(2);
            this.$expanded = z;
            this.$onDismissRequest = function0;
            this.$userSession = abstractC3358CGz;
            this.$parentView = view;
            this.$coroutineScope = c3ux;
            this.$onStatusChangeStarted = function02;
            this.$onStatusChangeFinished = function03;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraUserStateOverlayKt.WaitlistStatusDropdownMenu(this.$expanded, this.$onDismissRequest, this.$userSession, this.$parentView, this.$coroutineScope, this.$onStatusChangeStarted, this.$onStatusChangeFinished, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void WaitlistStatusDropdownMenu(boolean z, Function0<Unit> function0, AbstractC3358CGz abstractC3358CGz, View view, C3UX c3ux, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 1);
        AnonymousClass005.A16(abstractC3358CGz, view, c3ux, function02, 2);
        C7384Etj.A0Y(function03, 6);
        bfm.AgG(1351824315);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, abstractC3358CGz);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, view);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A1R(bfm, c3ux, 32768, i) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA0n |= AnonymousClass004.A0Z(bfm, function03);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0n), bfm, iA0n)) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = Arrays.asList(C5b2.A06, C5b2.A04, C5b2.A03, C5b2.A02);
                bfm.Ai0(objAaT);
            }
            C11H.A00(null, null, bfm, null, null, null, function0, B1V.A00(bfm, new AnonymousClass1((List) objAaT, function0, function02, c3ux, abstractC3358CGz, function03, view), -907564938), 0.0f, 0.0f, iA0n & 126, 48, 2044, 0L, 0L, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107202(z, function0, abstractC3358CGz, view, c3ux, function02, function03, i);
        }
    }

    public static final void AuraUserStateOverlay(AuraUserData auraUserData, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(abstractC3358CGz, function0, function02, 1);
        bfm.AgG(171523461);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, auraUserData) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, abstractC3358CGz);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ParcelableSnapshotMutableFloatState(0.0f);
                bfm.Ai0(objAaT);
            }
            final C00q c00q = (C00q) objAaT;
            final C00q c00q2 = (C00q) AnonymousClass007.A0T(bfm, obj);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, bfm.AaT(), obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            MutableState mutableState3 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            BRg bRgA03 = C10G.A03(bRg2, 0.7f);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new AuraUserStateOverlayKt$AuraUserStateOverlay$1$1(c00q, c00q2);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA032 = AYD.A03(bRgA03, (G0U) objAaT3);
            Unit unit = Unit.INSTANCE;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new PointerInputEventHandler() { // from class: com.facebook.aura.activation.view.AuraUserStateOverlayKt$AuraUserStateOverlay$2$1

                    /* renamed from: com.facebook.aura.activation.view.AuraUserStateOverlayKt$AuraUserStateOverlay$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<C1299Agk, AWx, Unit> {
                        public final /* synthetic */ C00q $offsetX$delegate;
                        public final /* synthetic */ C00q $offsetY$delegate;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(C00q c00q, C00q c00q2) {
                            super(2);
                            this.$offsetX$delegate = c00q;
                            this.$offsetY$delegate = c00q2;
                        }

                        @Override // X.G0V
                        public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, AWx aWx) {
                            m132invokeUv8p0NA(c1299Agk, aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                        public final void m132invokeUv8p0NA(C1299Agk c1299Agk, long j) {
                            C3cI.A1B(c1299Agk);
                            C00q c00q = this.$offsetX$delegate;
                            c00q.AdS(c00q.AFn() + AnonymousClass003.A03(j));
                            C00q c00q2 = this.$offsetY$delegate;
                            c00q2.AdS(c00q2.AFn() + AnonymousClass004.A00(j));
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        Object objA0C = DragGestureDetectorKt.A0C(bRr, htJ, new AnonymousClass605(0), new AnonymousClass605(1), new AnonymousClass604(0), new AnonymousClass1(c00q, c00q2));
                        return objA0C != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0C;
                    }
                };
                bfm.Ai0(objAaT4);
            }
            BRg bRgA00 = C11S.A00(C11U.A01(AaM.A00(bRgA032, (PointerInputEventHandler) objAaT4, unit), 12.0f), 0.7f);
            long j = colors.background;
            C1DM c1dm = C1OM.A00;
            BRg bRgA09 = C3U4.A09(C1b8.A03(bRgA00, c1dm, j), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            AuraTextKt.m2639AuraTextUY9GdpU("Debug Activation State", null, 0L, C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16374);
            C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            boolean zA1K = AnonymousClass004.A1K(iA0T);
            Object objAaT5 = bfm.AaT();
            if (zA1K || objAaT5 == obj) {
                objAaT5 = new AuraUserStateOverlayKt$AuraUserStateOverlay$3$1$1$1(function0);
                bfm.Ai0(objAaT5);
            }
            AuraTextKt.m2639AuraTextUY9GdpU("\u2715", C3U4.A09(C0v5.A04(bs0, null, null, (Function0) objAaT5, true), 4.0f), 0L, c1822ArmA0B, null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16372);
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, 8.0f);
            if (auraUserData == null) {
                AuraTextKt.m2639AuraTextUY9GdpU("No user data", null, 0L, C3cH.A0X(bfm, auraTheme, 1737401841).caption2Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16374);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1737638030);
                StateRow("hasHatchAccess", String.valueOf(auraUserData.hasHatchAccess), bfm, 6);
                StateRow("hasClearedAcquisition", String.valueOf(auraUserData.hasClearedAcquisition), bfm, 6);
                StateRow("isInviteCodeEntryAvailable", String.valueOf(auraUserData.isInviteCodeEntryAvailable), bfm, 6);
                StateRow("isWaitlistAvailable", String.valueOf(auraUserData.isWaitlistAvailable), bfm, 6);
                C5b2 c5b2 = auraUserData.waitlistStatus;
                String strName = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                StateRow("waitlistStatus", c5b2 != null ? c5b2.name() : HatchCcvLoggingKt.NO_POSTAL_FIELD, bfm, 6);
                StateRow("hasRedeemedInviteCode", String.valueOf(auraUserData.hasRedeemedInviteCode), bfm, 6);
                StateRow("hasAcceptedTos", String.valueOf(auraUserData.hasAcceptedTos), bfm, 6);
                C5as c5as = auraUserData.ageConfirmationStatus;
                if (c5as != null) {
                    strName = c5as.name();
                }
                StateRow("ageConfirmationStatus", strName, bfm, 6);
                StateRow("ageVerificationMethods", AbstractC0878AGe.A0L(", ", "", "", auraUserData.ageVerificationMethods, null), bfm, 6);
                StateRow("ageVerificationLayout", String.valueOf(auraUserData.ageVerificationLayout), bfm, 6);
                StateRow("isPassGeogating", String.valueOf(auraUserData.isPassGeogating), bfm, 6);
                StateRow("hasCompletedHatchActivation", String.valueOf(auraUserData.hasCompletedHatchActivation), bfm, 6);
                StateRow("activationState", auraUserData.getCurrentActivationState(false, false, false).name(), bfm, 6);
                BBI.A0R(bbi, false);
            }
            C01N.A08(bfm, bs0, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String str = MutableState.A0A(mutableState2) ? "Setting status..." : "Set Waitlist Status \u25be";
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).caption1Regular;
            C1736ApY c1736ApY = C1736ApY.A01;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822Arm, null, null, c1736ApY, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L);
            BRg bRgA033 = C1b8.A03(C11U.A01(bs0, 8.0f), c1dm, colors.secondaryButtonBackground);
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new AuraUserStateOverlayKt$AuraUserStateOverlay$3$2$1$1(mutableState2, mutableState);
                bfm.Ai0(objAaT6);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(C0v5.A04(bRgA033, null, null, (Function0) objAaT6, true), 12.0f, 8.0f), 0L, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            boolean zA0A = MutableState.A0A(mutableState);
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new AuraUserStateOverlayKt$AuraUserStateOverlay$3$2$2$1(mutableState);
                bfm.Ai0(objAaT7);
            }
            Function0 function04 = (Function0) objAaT7;
            Object objAaT8 = bfm.AaT();
            if (objAaT8 == obj) {
                objAaT8 = new AuraUserStateOverlayKt$AuraUserStateOverlay$3$2$3$1(mutableState2);
                bfm.Ai0(objAaT8);
            }
            Function0 function05 = (Function0) objAaT8;
            Object objAaT9 = bfm.AaT();
            if (objAaT9 == obj) {
                objAaT9 = new AuraUserStateOverlayKt$AuraUserStateOverlay$3$2$4$1(mutableState2);
                bfm.Ai0(objAaT9);
            }
            WaitlistStatusDropdownMenu(zA0A, function04, abstractC3358CGz, view, c3ux, function05, (Function0) objAaT9, bfm, ((iA0T << 3) & 896) | 1769520);
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, 8.0f);
            String str2 = MutableState.A0A(mutableState3) ? "Resetting..." : "Reset Hatch Activation";
            C1822Arm c1822ArmA002 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).caption1Regular, null, null, c1736ApY, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L);
            long j2 = colors.negativeAccent;
            BRg bRgA034 = C1b8.A03(C11U.A01(bs0, 8.0f), c1dm, colors.secondaryButtonBackground);
            boolean zA1V = AnonymousClass002.A1V(bfm, view, AnonymousClass003.A1M(bfm, c3ux, abstractC3358CGz), (iA0T & 7168) == 2048);
            Object objAaT10 = bfm.AaT();
            if (zA1V || objAaT10 == obj) {
                objAaT10 = new AuraUserStateOverlayKt$AuraUserStateOverlay$3$3$1(c3ux, mutableState3, abstractC3358CGz, function02, view, "Reset failed");
                bfm.Ai0(objAaT10);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A0B(C0v5.A04(bRgA034, null, null, (Function0) objAaT10, true), 12.0f, 8.0f), j2, c1822ArmA002, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(auraUserData, abstractC3358CGz, function0, function02, bRg2, i, i2);
        }
    }

    public static final void StateRow(String str, String str2, BFM bfm, int i) {
        bfm.AgG(-1975924103);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            String strA0M = FGI.A0M(str, ":");
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0M, null, 0L, auraTheme.getTypography(bfm, 6).caption2Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            C01N.A09(bfm, bs0, 4.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, 0L, auraTheme.getTypography(bfm, 6).caption2Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16374);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, i);
        }
    }
}
