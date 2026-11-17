package com.facebook.aura.screenshot;

import X.AKO;
import X.AKQ;
import X.AT3;
import X.AVy;
import X.AWA;
import X.AWx;
import X.AaJ;
import X.AaM;
import X.AbstractC07117nq;
import X.AbstractC1561Alb;
import X.AbstractC1754Apr;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BIj;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BRr;
import X.C00x;
import X.C0z7;
import X.C0zJ;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1710Aot;
import X.C1DG;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.InterfaceC1074AXb;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchScreenshotModeKt {

    /* renamed from: com.facebook.aura.screenshot.HatchScreenshotModeKt$HatchScreenshotMode$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onImageSaved;
        public final /* synthetic */ Bitmap $screenshotBitmap;
        public final /* synthetic */ boolean $useTopControls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Bitmap bitmap, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$screenshotBitmap = bitmap;
            this.$onImageSaved = g0u;
            this.$onDismiss = function0;
            this.$useTopControls = z;
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
            HatchScreenshotModeKt.HatchScreenshotMode(this.$screenshotBitmap, this.$onImageSaved, this.$onDismiss, this.$useTopControls, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.screenshot.HatchScreenshotModeKt$ScreenshotTopControls$2, reason: invalid class name and case insensitive filesystem */
    public final class C134652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134652(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$onSave = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScreenshotModeKt.ScreenshotTopControls(this.$onDismiss, this.$onSave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchScreenshotMode(Bitmap bitmap, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        boolean zA1Z = AnonymousClass005.A1Z(bitmap, g0u, function0);
        bfm.AgG(127621467);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, bitmap) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, zA1K);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            zA1K = C3cG.A1K(i3, zA1K);
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new SnapshotStateList();
                BBI.A0O(bbi, objAaT);
            }
            final SnapshotStateList snapshotStateList = (SnapshotStateList) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new SnapshotStateList();
                BBI.A0O(bbi, objAaT2);
            }
            final SnapshotStateList snapshotStateList2 = (SnapshotStateList) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AbstractC1798ArH.A04(bbi, new AWA(0L));
            }
            MutableState mutableState = (MutableState) objAaT3;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgThen = bRg2.then(c1062ATq);
            long j = B6A.A01;
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(bRgThen, c1dm, j);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C0z7 c0z7 = C0z7.A00;
            Object objA0p = AnonymousClass001.A0p(bfm, -523171196);
            if (objA0p == obj) {
                objA0p = new HatchScreenshotModeKt$HatchScreenshotMode$1$1$1(mutableState);
                BBI.A0O(bbi, objA0p);
            }
            BRg bRgA00 = BIj.A00(c1062ATq, (G0U) objA0p);
            Unit unit = Unit.INSTANCE;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new PointerInputEventHandler() { // from class: com.facebook.aura.screenshot.HatchScreenshotModeKt$HatchScreenshotMode$1$2$1

                    @DebugMetadata(c = "com.facebook.aura.screenshot.HatchScreenshotModeKt$HatchScreenshotMode$1$2$1$1", f = "HatchScreenshotMode.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, 81}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.screenshot.HatchScreenshotModeKt$HatchScreenshotMode$1$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ SnapshotStateList<AWx> $currentPoints;
                        public final /* synthetic */ SnapshotStateList<List<AWx>> $paths;
                        public /* synthetic */ Object L$0;
                        public Object L$1;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(SnapshotStateList<AWx> snapshotStateList, SnapshotStateList<List<AWx>> snapshotStateList2, HtJ<? super AnonymousClass1> htJ) {
                            super(2, htJ);
                            this.$currentPoints = snapshotStateList;
                            this.$paths = snapshotStateList2;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentPoints, this.$paths, htJ);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x007e A[RETURN] */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
                        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007c -> B:7:0x0013). Please report as a decompilation issue!!! */
                        @Override // X.AbstractC8884Fsp
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                            /*
                                r7 = this;
                                java.lang.Object r5 = r7.L$0
                                X.AXb r5 = (X.InterfaceC1074AXb) r5
                                X.Hji r4 = X.EnumC10460Hji.A02
                                int r1 = r7.label
                                r3 = 2
                                r0 = 1
                                if (r1 == 0) goto L4b
                                if (r1 == r0) goto L5c
                                if (r1 != r3) goto L7f
                                X.Hwg.A00(r8)
                            L13:
                                X.Afe r8 = (X.C1247Afe) r8
                                java.util.List<X.Agk> r0 = r8.A05
                                java.lang.Object r6 = X.AbstractC0878AGe.A0G(r0)
                                X.Agk r6 = (X.C1299Agk) r6
                                if (r6 == 0) goto L39
                                boolean r0 = r6.A0F
                                if (r0 != 0) goto L3c
                                androidx.compose.runtime.snapshots.SnapshotStateList<java.util.List<X.AWx>> r2 = r7.$paths
                                androidx.compose.runtime.snapshots.SnapshotStateList<X.AWx> r1 = r7.$currentPoints
                                X.AN8 r0 = r1.A00
                                X.AN8 r0 = X.BDh.A07(r1, r0)
                                X.AMi r0 = (X.AMi) r0
                                X.AHc<? extends T> r0 = r0.A02
                                r2.add(r0)
                                androidx.compose.runtime.snapshots.SnapshotStateList<X.AWx> r0 = r7.$currentPoints
                                r0.clear()
                            L39:
                                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                                return r4
                            L3c:
                                androidx.compose.runtime.snapshots.SnapshotStateList<X.AWx> r2 = r7.$currentPoints
                                long r0 = r6.A0A
                                X.AWx r0 = X.AWx.A0B(r0)
                                r2.add(r0)
                                r6.A02()
                                goto L71
                            L4b:
                                X.Hwg.A00(r8)
                                r7.L$0 = r5
                                r7.label = r0
                                r1 = 0
                                X.AXj r0 = X.EnumC1080AXj.A04
                                java.lang.Object r8 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r5, r0, r7, r1)
                                if (r8 != r4) goto L5f
                                return r4
                            L5c:
                                X.Hwg.A00(r8)
                            L5f:
                                X.Agk r8 = (X.C1299Agk) r8
                                androidx.compose.runtime.snapshots.SnapshotStateList<X.AWx> r0 = r7.$currentPoints
                                r0.clear()
                                androidx.compose.runtime.snapshots.SnapshotStateList<X.AWx> r2 = r7.$currentPoints
                                long r0 = r8.A0A
                                X.AWx r0 = X.AWx.A0B(r0)
                                r2.add(r0)
                            L71:
                                r7.L$0 = r5
                                r0 = 0
                                r7.L$1 = r0
                                r7.label = r3
                                java.lang.Object r8 = X.InterfaceC1074AXb.A00(r5, r7)
                                if (r8 != r4) goto L13
                                return r4
                            L7f:
                                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.screenshot.HatchScreenshotModeKt$HatchScreenshotMode$1$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // X.G0V
                        public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                            return ((AnonymousClass1) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass006.A0l(bRr, htJ, new AnonymousClass1(snapshotStateList2, snapshotStateList, null));
                    }
                };
                BBI.A0O(bbi, objAaT4);
            }
            BRg bRgA002 = AaM.A00(bRgA00, (PointerInputEventHandler) objAaT4, unit);
            boolean zA67 = bfm.A67(bitmap);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == obj) {
                objAaT5 = new HatchScreenshotModeKt$HatchScreenshotMode$1$3$1(bitmap, snapshotStateList, snapshotStateList2);
                BBI.A0O(bbi, objAaT5);
            }
            C0zJ.A00(bRgA002, (G0U) objAaT5, bfm, 0);
            if (zA1K) {
                bfm.AgE(-521513007);
                boolean zA1M = AnonymousClass003.A1M(bfm, contextA00, bitmap) | AnonymousClass003.A1C(iA0T);
                Object objAaT6 = bfm.AaT();
                if (zA1M || objAaT6 == obj) {
                    objAaT6 = new HatchScreenshotModeKt$HatchScreenshotMode$1$4$1(contextA00, bitmap, snapshotStateList, g0u, mutableState);
                    BBI.A0O(bbi, objAaT6);
                }
                ScreenshotTopControls(function0, (Function0) objAaT6, C3U4.A0B(AbstractC1754Apr.A02(C1b8.A03(c0z7.A4C(C2VU.A0C, C10G.A02), c1dm, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.6f))), 16.0f, 8.0f), bfm, (iA0T >> 6) & 14, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-521036351);
                BBI.A0R(bbi, false);
                BRg bRgA0B = C3U4.A0B(C1b8.A03(c0z7.A4C(C2VU.A06, C10G.A02), c1dm, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.6f)), 16.0f, 16.0f);
                InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A03, bfm, C2VU.A04);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0b, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.trash_wght400_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7c);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.FLAT;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
                C1DG c1dgA0k = C8j3.A0k(20.0f);
                int i5 = AVy.$stable;
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, function0, null, false, null, c1dgA0k, null, null, bfm, AnonymousClass001.A0C(iA0T << 15, (i5 << 3) | 28032), 48, 14113);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7d), null, B6A.A08, C8j4.A0l(bfm).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 384, 0, 16370);
                AVy aVyA002 = BOf.A00(bfm, R.drawable.checkmark_outline_24, 0);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7e);
                boolean zA1M2 = AnonymousClass003.A1M(bfm, contextA00, bitmap) | AnonymousClass001.A1N(iA0T);
                Object objAaT7 = bfm.AaT();
                if (zA1M2 || objAaT7 == obj) {
                    objAaT7 = new HatchScreenshotModeKt$HatchScreenshotMode$1$5$1$1(contextA00, bitmap, snapshotStateList, g0u, mutableState);
                    BBI.A0O(bbi, objAaT7);
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA002, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA012, (Function0) objAaT7, null, false, null, C8j3.A0k(20.0f), null, null, bfm, (i5 << 3) | 28032, 48, 14113);
                BBI.A0R(bbi, zA1Z);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bitmap, g0u, function0, zA1K, bRg2, i, i2);
        }
    }

    public static final void ScreenshotTopControls(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(141971769);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A03, bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.caret_left, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7c);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.FLAT;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
            C1DG c1dgA0k = C8j3.A0k(20.0f);
            int i4 = AVy.$stable;
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, function0, null, false, null, c1dgA0k, null, null, bfm, (i4 << 3) | 28032 | ((iA0T << 21) & 29360128), 48, 14113);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7d), null, B6A.A08, C8j4.A0l(bfm).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 384, 0, 16370);
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, BOf.A00(bfm, R.drawable.checkmark_outline_24, 0), auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120e7e), function02, null, false, null, C8j3.A0k(20.0f), null, null, bfm, (i4 << 3) | 28032 | ((iA0T << 18) & 29360128), 48, 14113);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134652(function0, function02, bRg2, i, i2);
        }
    }

    /* renamed from: compositeDrawing-moWRBKg, reason: not valid java name */
    public static final Bitmap m1890compositeDrawingmoWRBKg(Bitmap bitmap, List<? extends List<AWx>> list, float f, long j) {
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapCopy);
        Paint paint = new Paint();
        paint.setColor(-256);
        paint.setStrokeWidth(8.0f / f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
        for (List<AWx> list2 : list) {
            if (list2.size() >= 2) {
                Path path = new Path();
                long jM1893screenToBitmapYOhFQsI = m1893screenToBitmapYOhFQsI(AWx.A09(list2, 0), f, j);
                path.moveTo(AnonymousClass001.A00(jM1893screenToBitmapYOhFQsI), AnonymousClass001.A01(jM1893screenToBitmapYOhFQsI, 4294967295L));
                int size = list2.size();
                for (int i = 1; i < size; i++) {
                    long jM1893screenToBitmapYOhFQsI2 = m1893screenToBitmapYOhFQsI(AWx.A09(list2, i), f, j);
                    path.lineTo(AnonymousClass001.A00(jM1893screenToBitmapYOhFQsI2), AnonymousClass001.A01(jM1893screenToBitmapYOhFQsI2, 4294967295L));
                }
                canvas.drawPath(path, paint);
            }
        }
        C7384Etj.A0X(bitmapCopy);
        return bitmapCopy;
    }

    /* renamed from: drawPathFromPoints-9LQNqLg, reason: not valid java name */
    public static final void m1891drawPathFromPoints9LQNqLg(AT3 at3, List<AWx> list, long j, AaJ aaJ) {
        if (list.size() >= 2) {
            C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
            float fA00 = AnonymousClass001.A00(AWx.A09(list, 0));
            float fA01 = AnonymousClass001.A01(AWx.A09(list, 0), 4294967295L);
            Path path = c1710AotA00.A03;
            path.moveTo(fA00, fA01);
            int size = list.size();
            for (int i = 1; i < size; i++) {
                path.lineTo(AnonymousClass001.A00(AWx.A09(list, i)), AnonymousClass001.A01(AWx.A09(list, i), 4294967295L));
            }
            at3.A9d(null, c1710AotA00, aaJ, 1.0f, 3, j);
        }
    }

    /* renamed from: saveScreenshotAnnotation-yzxVdVo, reason: not valid java name */
    public static final void m1892saveScreenshotAnnotationyzxVdVo(Context context, Bitmap bitmap, List<? extends List<AWx>> list, long j, G0U<? super String, Unit> g0u) throws IOException {
        if (!list.isEmpty()) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float fA00 = AnonymousClass001.A00(j);
            float fA01 = AnonymousClass001.A01(j, 4294967295L);
            float fMin = Math.min(fA00 / width, fA01 / height);
            bitmap = m1890compositeDrawingmoWRBKg(bitmap, list, fMin, AnonymousClass005.A0L((fA00 - (width * fMin)) / 2.0f, (fA01 - (height * fMin)) / 2.0f));
        }
        File file = new File(context.getCacheDir(), FGI.A0J("screenshot_", System.currentTimeMillis(), ".png"));
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            g0u.invoke(C60O.A0o(HatchFileProviderUtil.INSTANCE.getUriForFile(context, file)));
        } finally {
        }
    }

    /* renamed from: screenToBitmap-YOhFQsI, reason: not valid java name */
    public static final long m1893screenToBitmapYOhFQsI(long j, float f, long j2) {
        return AnonymousClass005.A0L((AnonymousClass001.A00(j) - AnonymousClass001.A00(j2)) / f, (AnonymousClass001.A01(j, 4294967295L) - AnonymousClass001.A01(j2, 4294967295L)) / f);
    }
}
