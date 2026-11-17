package com.facebook.aura.ageverification;

import X.AFz;
import X.AKL;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass794;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.C7bA;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.utils.HatchPermissionUtils;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class CameraPermissionGateKt {

    /* renamed from: com.facebook.aura.ageverification.CameraPermissionGateKt$CameraPermissionGate$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ int $explanationRes;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(int i, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i2, int i3) {
            super(2);
            this.$explanationRes = i;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CameraPermissionGateKt.CameraPermissionGate(this.$explanationRes, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.CameraPermissionGateKt$CameraPermissionRequest$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $explanationRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onGranted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$explanationRes = i;
            this.$onGranted = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            CameraPermissionGateKt.CameraPermissionRequest(this.$explanationRes, this.$onGranted, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CameraPermissionGate(int i, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0w, 2);
        bfm.AgG(-1556546914);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass005.A0S(bfm, HatchPermissionUtils.INSTANCE.hasPermission(contextA0H, "android.permission.CAMERA"));
            }
            MutableState mutableState = (MutableState) objAaT;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new CameraPermissionGateKt$CameraPermissionGate$1$1(contextA0H, mutableState);
                bfm.Ai0(objAaT2);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT2, 6, 2);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(1673245033);
                AnonymousClass001.A1G(bRg2, bfm, g0w, (iA0D >> 3) & 126);
            } else {
                Object objA0p = AnonymousClass001.A0p(bfm, 1673281582);
                if (objA0p == obj) {
                    objA0p = new CameraPermissionGateKt$CameraPermissionGate$2$1(mutableState);
                    bfm.Ai0(objA0p);
                }
                CameraPermissionRequest(i, (Function0) objA0p, bRg2, bfm, (iA0D & 14) | 48 | ((iA0D << 3) & 896), 0);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i, bRg2, g0w, i2, i3);
        }
    }

    public static final void CameraPermissionRequest(int i, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRgA0P = bRg;
        bfm.AgG(259261394);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i4 != 0) {
                bRgA0P = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = CameraPermissionGateKt$CameraPermissionRequest$deniedPermanently$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr);
            AnonymousClass794 anonymousClass794 = new AnonymousClass794();
            boolean zA1O = AnonymousClass003.A1O(bfm, activity, mutableState, AnonymousClass003.A1C(iA0D));
            Object objAaT2 = bfm.AaT();
            if (zA1O || objAaT2 == obj) {
                objAaT2 = new CameraPermissionGateKt$CameraPermissionRequest$request$1$1(function0, activity, mutableState);
                bfm.Ai0(objAaT2);
            }
            C7OU c7ouA00 = C7OQ.A00(anonymousClass794, bfm, (G0U) objAaT2);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0T(bRgA0P), AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, AuraDimensKt.SpacingMedium), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0D2);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i), null, C06G.A0C(bfm), C06G.A0U(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            boolean zA0A = MutableState.A0A(mutableState);
            int i5 = R.string._name_removed__res_0x7f12004d;
            if (zA0A) {
                i5 = R.string._name_removed__res_0x7f12004e;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i5);
            C1062ATq c1062ATq = C10G.A02;
            boolean zA1T = AnonymousClass004.A1T(bfm, contextA0H, c7ouA00, bfm.A65(mutableState));
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == obj) {
                objAaT3 = new CameraPermissionGateKt$CameraPermissionRequest$1$1$1(contextA0H, c7ouA00, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, null, null, null, false, false, false, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, 0, 0, 134201333);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, function0, bRgA0P, i2, i3);
        }
    }
}
