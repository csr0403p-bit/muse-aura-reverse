package com.facebook.aura.iap.iac;

import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C07C;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C9xk;
import X.C9xo;
import X.EnumC7495EyA;
import X.G0V;
import X.G0W;
import X.Hon;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraIacBottomSheetLauncherKt {
    public static final String USER_CANCELLED_WIRE_VALUE = EnumC7495EyA.A06.bloksValue;

    /* renamed from: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;
        public final /* synthetic */ String $quoteId;
        public final /* synthetic */ Hon $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Hon hon, String str, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$session = hon;
            this.$quoteId = str;
            this.$onClose = g0w;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraIacBottomSheetLauncherKt.IacSandboxSheet(this.$session, this.$quoteId, this.$onClose, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C9xk $content;
        public final /* synthetic */ Function0<Unit> $dismiss;
        public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;
        public final /* synthetic */ C9xo $resolvedDisplay;
        public final /* synthetic */ IacSandboxSheetState $state;

        /* renamed from: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ C9xk $content;
            public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;
            public final /* synthetic */ C9xo $resolvedDisplay;
            public final /* synthetic */ IacSandboxSheetState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(C9xo c9xo, C9xk c9xk, IacSandboxSheetState iacSandboxSheetState, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
                super(2);
                this.$resolvedDisplay = c9xo;
                this.$content = c9xk;
                this.$state = iacSandboxSheetState;
                this.$onClose = g0w;
            }

            public final void invoke(BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                C9xo c9xo = this.$resolvedDisplay;
                C9xk c9xk = this.$content;
                IacSandboxSheetState iacSandboxSheetState = this.$state;
                boolean zA65 = bfm.A65(this.$onClose);
                G0W<String, Integer, Integer, Unit> g0w = this.$onClose;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new AuraIacBottomSheetLauncherKt$IacSandboxSheet$4$1$1$1(g0w);
                    BBI.A0T(bfm, objAaT);
                }
                IacSandboxSheetContentKt.IacSandboxSheetFooter(c9xo, c9xk, iacSandboxSheetState, (G0W) objAaT, bfm, IacSandboxSheetState.$stable << 6);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* renamed from: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$4$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
            public final /* synthetic */ C9xk $content;
            public final /* synthetic */ C9xo $resolvedDisplay;
            public final /* synthetic */ IacSandboxSheetState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C9xo c9xo, C9xk c9xk, IacSandboxSheetState iacSandboxSheetState) {
                super(3);
                this.$resolvedDisplay = c9xo;
                this.$content = c9xk;
                this.$state = iacSandboxSheetState;
            }

            public final void invoke(C07C c07c, BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                    IacSandboxSheetContentKt.IacSandboxSheetBody(this.$resolvedDisplay, this.$content, this.$state, bfm, IacSandboxSheetState.$stable << 6);
                } else {
                    bfm.Afo();
                }
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
                invoke(c07c, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraBottomSheetContentKt.AuraBottomSheetContent(null, null, null, new AuraBottomSheetHeaderConfig(this.$content.A08, null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass1(this.$resolvedDisplay, this.$content, this.$state, this.$onClose), -2119729477), null, this.$dismiss, false, false, false, null, B1V.A00(bfm, new AnonymousClass2(this.$resolvedDisplay, this.$content, this.$state), 1009382263), bfm, RuntimeInternals.IOPRIO_BACKGROUND, 48, 1959);
            } else {
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C9xk c9xk, Function0<Unit> function0, C9xo c9xo, IacSandboxSheetState iacSandboxSheetState, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w) {
            super(3);
            this.$content = c9xk;
            this.$dismiss = function0;
            this.$resolvedDisplay = c9xo;
            this.$state = iacSandboxSheetState;
            this.$onClose = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<String, Integer, Integer, Unit> $onClose;
        public final /* synthetic */ String $quoteId;
        public final /* synthetic */ Hon $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Hon hon, String str, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$session = hon;
            this.$quoteId = str;
            this.$onClose = g0w;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraIacBottomSheetLauncherKt.IacSandboxSheet(this.$session, this.$quoteId, this.$onClose, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void IacSandboxSheet(Hon hon, String str, G0W<? super String, ? super Integer, ? super Integer, Unit> g0w, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass5;
        bfm.AgG(-361005939);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hon, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A07(null, bfm);
            }
            MutableState mutableState = (MutableState) objAaT;
            MutableState mutableState2 = (MutableState) C8j3.A0z(bfm, obj, false);
            boolean zA1C = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hon))) | AnonymousClass003.A1C(iA05);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new AuraIacBottomSheetLauncherKt$IacSandboxSheet$1$1(str, hon, mutableState, mutableState2, null);
                BBI.A0T(bfm, objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, str);
            boolean zA1D = AnonymousClass003.A1D(iA05);
            Object objAaT3 = bfm.AaT();
            if (zA1D || objAaT3 == obj) {
                objAaT3 = new AuraIacBottomSheetLauncherKt$IacSandboxSheet$dismiss$1$1(g0w);
                BBI.A0T(bfm, objAaT3);
            }
            Function0 function0 = (Function0) objAaT3;
            IacSandboxSheetState iacSandboxSheetStateRememberIacSandboxSheetState = IacSandboxSheetContentKt.rememberIacSandboxSheetState(bfm, 0);
            C9xo c9xo = (C9xo) mutableState.getValue();
            C9xk c9xk = c9xo != null ? c9xo.A00 : null;
            Boolean boolValueOf = Boolean.valueOf(MutableState.A0A(mutableState2));
            boolean zA1N = AnonymousClass003.A1N(bfm, c9xk, function0);
            Object objAaT4 = bfm.AaT();
            if (zA1N || objAaT4 == obj) {
                objAaT4 = new AuraIacBottomSheetLauncherKt$IacSandboxSheet$2$1(c9xk, function0, mutableState2);
                BBI.A0T(bfm, objAaT4);
            }
            AnonymousClass001.A19(bfm, objAaT4, boolValueOf, c9xk);
            if (c9xo == null || c9xk == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass3(hon, str, g0w, i);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            AuraModalBottomSheetWrapperKt.m2406AuraModalBottomSheetWrapperNpZTi58(null, function0, null, null, 0L, false, false, B1V.A00(bfm, new AnonymousClass4(c9xk, function0, c9xo, iacSandboxSheetStateRememberIacSandboxSheetState, g0w), 1999195284), bfm, 12582912, 125);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(hon, str, g0w, i);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }
}
