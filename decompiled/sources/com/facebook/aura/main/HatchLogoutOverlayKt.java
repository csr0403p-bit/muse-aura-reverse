package com.facebook.aura.main;

import X.AKQ;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1515AkP;
import X.C1BO;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C78N;
import X.EnumC10460Hji;
import X.F60;
import X.G0V;
import X.HtJ;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchLogoutOverlayKt {

    /* renamed from: com.facebook.aura.main.HatchLogoutOverlayKt$HatchLogoutOverlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
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
            HatchLogoutOverlayKt.HatchLogoutOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchLogoutOverlayKt$HatchLogoutOverlay$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(BRg bRg, int i, int i2) {
            super(2);
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
            HatchLogoutOverlayKt.HatchLogoutOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchLogoutOverlay(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(-1124629928);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (!C1BO.A0F(C2CK.A02(bfm, AuraLogoutHelper.isLoggingOut))) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass1(bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120703);
            BRg bRgA0N = C06G.A0N(bfm, AnonymousClass001.A0T(bRg2));
            Unit unit = Unit.INSTANCE;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.main.HatchLogoutOverlayKt$HatchLogoutOverlay$2$1

                    @DebugMetadata(c = "com.facebook.aura.main.HatchLogoutOverlayKt$HatchLogoutOverlay$2$1$1", f = "HatchLogoutOverlay.kt", l = {org.maplibre.android.R.styleable.maplibre_MapView_maplibre_uiTiltGestures}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.main.HatchLogoutOverlayKt$HatchLogoutOverlay$2$1$1, reason: invalid class name */
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
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchLogoutOverlayKt$HatchLogoutOverlay$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
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
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = AaM.A00(bRgA0N, (PointerInputEventHandler) objAaT, unit);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchLogoutOverlayKt$HatchLogoutOverlay$3$1(strA01);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA00, objAaT2, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, AuraSpinnerStyle.Companion.large(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 5);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C06G.A0C(bfm), C01N.A01(bfm, BRg.A00, AuraDimensKt.SpacingLarge).title2Medium, null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }
}
