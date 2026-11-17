package com.facebook.aura.file.view;

import X.AKQ;
import X.AWx;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.C00x;
import X.C1515AkP;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FileViewerZoomKt {
    public static final float MAX_DOC_SCALE = 5.0f;

    /* renamed from: com.facebook.aura.file.view.FileViewerZoomKt$ZoomableContainer$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<Boolean, BFM, Integer, Unit> $content;
        public final /* synthetic */ float $maxScale;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(BRg bRg, float f, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$maxScale = f;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FileViewerZoomKt.ZoomableContainer(this.$modifier, this.$maxScale, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ZoomableContainer(BRg bRg, float f, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        C7384Etj.A0Y(g0w, 2);
        bfm.AgG(-1149159975);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 5.0f;
            }
            int i5 = iA0d >> 3;
            final ZoomState zoomStateRememberZoomState = rememberZoomState(Float.valueOf(f2), bfm, i5 & 14, 0);
            BRg bRgZoomGestures = zoomGestures(bRg2, zoomStateRememberZoomState, true);
            Unit unit = Unit.INSTANCE;
            boolean zA65 = bfm.A65(zoomStateRememberZoomState);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.file.view.FileViewerZoomKt$ZoomableContainer$1$1

                    /* renamed from: com.facebook.aura.file.view.FileViewerZoomKt$ZoomableContainer$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ ZoomState $zoomState;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(ZoomState zoomState) {
                            super(1);
                            this.$zoomState = zoomState;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m899invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m899invokek4lQ0M(long j) {
                            if (C1BO.A0F(this.$zoomState.isZoomed$delegate)) {
                                this.$zoomState.resetZoomAnimated();
                            }
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        Object objA06 = TapGestureDetectorKt.A06(bRr, htJ, new AnonymousClass1(zoomStateRememberZoomState), null, null, TapGestureDetectorKt.A00);
                        return objA06 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA06;
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = AaM.A00(bRgZoomGestures, (PointerInputEventHandler) objAaT, unit);
            boolean zA652 = bfm.A65(zoomStateRememberZoomState);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new FileViewerZoomKt$ZoomableContainer$2$1(zoomStateRememberZoomState);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0W = AnonymousClass001.A0W(bRgA00, objAaT2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0W);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(Boolean.valueOf(C1BO.A0F(zoomStateRememberZoomState.isZoomed$delegate)), bfm, g0w, i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(bRg2, f2, g0w, i, i2);
        }
    }

    public static final ZoomState rememberZoomState(Float f, BFM bfm, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            f = null;
        }
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
        if ((((i & 14) ^ 6) <= 4 || !bfm.A65(f)) && (i & 6) != 4) {
            z = false;
        }
        Object objAaT2 = bfm.AaT();
        if (z || objAaT2 == obj) {
            objAaT2 = new ZoomState(c3ux, f);
            bfm.Ai0(objAaT2);
        }
        return (ZoomState) objAaT2;
    }

    public static /* synthetic */ BRg zoomGestures$default(BRg bRg, ZoomState zoomState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return zoomGestures(bRg, zoomState, z);
    }

    public static final BRg zoomGestures(BRg bRg, final ZoomState zoomState, boolean z) {
        AnonymousClass003.A0u(bRg, zoomState);
        if (!z) {
            return bRg;
        }
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.file.view.FileViewerZoomKt.zoomGestures.1

            @DebugMetadata(c = "com.facebook.aura.file.view.FileViewerZoomKt$zoomGestures$1$1", f = "FileViewerZoom.kt", l = {145, 153}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.file.view.FileViewerZoomKt$zoomGestures$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01591 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ ZoomState $state;
                public float F$0;
                public float F$1;
                public int I$0;
                public long J$0;
                public /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01591(ZoomState zoomState, HtJ<? super C01591> htJ) {
                    super(2, htJ);
                    this.$state = zoomState;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C01591 c01591 = new C01591(this.$state, htJ);
                    c01591.L$0 = obj;
                    return c01591;
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
                
                    if (r14 == r7) goto L39;
                 */
                /* JADX WARN: Path cross not found for [B:13:0x0043, B:19:0x0063], limit reached: 49 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e2 -> B:8:0x0025). Please report as a decompilation issue!!! */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 244
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FileViewerZoomKt.AnonymousClass1.C01591.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((C01591) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return AnonymousClass006.A0l(bRr, htJ, new C01591(zoomState, null));
            }
        }, Unit.INSTANCE);
    }
}
