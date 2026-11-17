package com.facebook.aura.localbrowser;

import X.AFs;
import X.AFz;
import X.AWx;
import X.AaM;
import X.AbstractC1564Ale;
import X.AbstractC1578Alt;
import X.AbstractC1671Anw;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.Ao7;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BHP;
import X.BIj;
import X.BL4;
import X.BRg;
import X.BRr;
import X.C11U;
import X.C2av;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC0857A6e;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ZoomableBrowserPreviewKt {
    public static final Unit ZoomableBrowserPreview_4goxYXU$lambda$3$0(String str, String str2, String str3, String str4, final BrowserPreviewTransform browserPreviewTransform, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 5);
        AbstractC1564Ale.A08(interfaceC0857A6e, str);
        AbstractC1564Ale.A06(interfaceC0857A6e, 5);
        AbstractC1564Ale.A0C(interfaceC0857A6e, Arrays.asList(new BHP(str2, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                browserPreviewTransform.zoomBy(1.5f);
                return AnonymousClass001.A0i();
            }
        }), new BHP(str3, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                browserPreviewTransform.zoomBy(0.6666667f);
                return AnonymousClass001.A0i();
            }
        }), new BHP(str4, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                browserPreviewTransform.reset();
                return AnonymousClass001.A0i();
            }
        })));
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0C, new Ao7(false, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$3$0$3(browserPreviewTransform));
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$3$0$4(browserPreviewTransform));
            }
        }));
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0i, new Ao7(false, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$3$0$5(browserPreviewTransform));
            }
        }, new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$3$0$6(browserPreviewTransform));
            }
        }));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0L, interfaceC0857A6e, null, new G0V() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda7
            @Override // X.G0V
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$3$0$7(browserPreviewTransform, AnonymousClass001.A02(obj), AnonymousClass001.A02(obj2)));
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit ZoomableBrowserPreview_4goxYXU$lambda$6$0(BrowserPreviewTransform browserPreviewTransform, C2av c2av) {
        C7384Etj.A0Y(c2av, 1);
        c2av.AeX(browserPreviewTransform.zoom$delegate.AFn());
        c2av.AeY(browserPreviewTransform.zoom$delegate.AFn());
        c2av.Af5(AnonymousClass003.A03(AWx.A07(browserPreviewTransform.offset$delegate)));
        c2av.Af6(AnonymousClass004.A00(AWx.A07(browserPreviewTransform.offset$delegate)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ BrowserPreviewTransform $r8$lambda$Bjpz8Nik_M2TCfLZAjbgxB9WjZ4(long j, boolean z) {
        return new BrowserPreviewTransform(j, z);
    }

    public static /* synthetic */ boolean $r8$lambda$YwdJPba0jmBJYxvcqtZZNiQvHnw(BrowserPreviewTransform browserPreviewTransform) {
        browserPreviewTransform.zoomBy(1.5f);
        return true;
    }

    /* renamed from: ZoomableBrowserPreview-4goxYXU, reason: not valid java name */
    public static final void m1241ZoomableBrowserPreview4goxYXU(final long j, BRg bRg, boolean z, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        final boolean z2 = z;
        C7384Etj.A0Y(g0w, 3);
        bfm.AgG(364899644);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0M |= 384;
        } else if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0M |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0M & 1171, 1170), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = BrowserPreviewTransform.Companion.createSaver();
                bfm.Ai0(objAaT);
            }
            AFs aFs = (AFs) objAaT;
            Object[] objArr = {BL4.A00(j), Boolean.valueOf(z2)};
            boolean zA1B = AnonymousClass003.A1B(iA0M) | AnonymousClass004.A1K(iA0M);
            Object objAaT2 = bfm.AaT();
            if (zA1B || objAaT2 == obj) {
                objAaT2 = new Function0() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new BrowserPreviewTransform(j, z2);
                    }
                };
                BBI.A0T(bfm, objAaT2);
            }
            final BrowserPreviewTransform browserPreviewTransform = (BrowserPreviewTransform) AFz.A01(bfm, aFs, (Function0) objAaT2, objArr);
            final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c97);
            final String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c9a);
            final String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c9b);
            final String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c99);
            BRg bRgA00 = C11U.A00(bRg2);
            boolean zA67 = bfm.A67(browserPreviewTransform);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new ZoomableBrowserPreviewKt$ZoomableBrowserPreview$1$1(browserPreviewTransform);
                BBI.A0T(bfm, objAaT3);
            }
            BRg bRgA002 = BIj.A00(bRgA00, (G0U) objAaT3);
            boolean zA1W = AnonymousClass005.A1W(bfm, browserPreviewTransform, strA013, strA014, AnonymousClass003.A1K(bfm, strA01, strA012));
            Object objAaT4 = bfm.AaT();
            if (zA1W || objAaT4 == obj) {
                objAaT4 = new G0U() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda9
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$3$0(strA01, strA012, strA013, strA014, browserPreviewTransform, (InterfaceC0857A6e) obj2);
                    }
                };
                BBI.A0T(bfm, objAaT4);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA002, objAaT4, false);
            boolean zA672 = bfm.A67(browserPreviewTransform);
            Object objAaT5 = bfm.AaT();
            if (zA672 || objAaT5 == obj) {
                objAaT5 = new ZoomableBrowserPreviewKt$ZoomableBrowserPreview$3$1(browserPreviewTransform);
                BBI.A0T(bfm, objAaT5);
            }
            BRg bRgA003 = AaM.A00(bRgA0Y, (PointerInputEventHandler) objAaT5, browserPreviewTransform);
            boolean zA673 = bfm.A67(browserPreviewTransform);
            Object objAaT6 = bfm.AaT();
            if (zA673 || objAaT6 == obj) {
                objAaT6 = new PointerInputEventHandler() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$ZoomableBrowserPreview$4$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        final BrowserPreviewTransform browserPreviewTransform2 = browserPreviewTransform;
                        Object objA06 = TapGestureDetectorKt.A06(bRr, htJ, new G0U() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$ZoomableBrowserPreview$4$1$$ExternalSyntheticLambda0
                            @Override // X.G0U
                            public final Object invoke(Object obj2) {
                                browserPreviewTransform2.reset();
                                return Unit.INSTANCE;
                            }
                        }, null, null, TapGestureDetectorKt.A00);
                        return objA06 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA06;
                    }

                    public static final Unit invoke$lambda$0(BrowserPreviewTransform browserPreviewTransform2, AWx aWx) {
                        browserPreviewTransform2.reset();
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0T(bfm, objAaT6);
            }
            BRg bRgA004 = AaM.A00(bRgA003, (PointerInputEventHandler) objAaT6, browserPreviewTransform);
            boolean zA674 = bfm.A67(browserPreviewTransform);
            Object objAaT7 = bfm.AaT();
            if (zA674 || objAaT7 == obj) {
                objAaT7 = new G0U() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda10
                    @Override // X.G0U
                    public final Object invoke(Object obj2) {
                        return ZoomableBrowserPreviewKt.ZoomableBrowserPreview_4goxYXU$lambda$6$0(browserPreviewTransform, (C2av) obj2);
                    }
                };
                BBI.A0T(bfm, objAaT7);
            }
            AnonymousClass001.A1G(AnonymousClass001.A0W(bRgA004, objAaT7), bfm, g0w, (iA0M >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final boolean z3 = z2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.ZoomableBrowserPreviewKt$$ExternalSyntheticLambda11
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    long j2 = j;
                    BRg bRg3 = bRg2;
                    boolean z4 = z3;
                    G0W g0w2 = g0w;
                    int i5 = i;
                    ZoomableBrowserPreviewKt.m1241ZoomableBrowserPreview4goxYXU(j2, bRg3, z4, g0w2, (BFM) obj2, AnonymousClass011.A02(obj3, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final BrowserPreviewTransform ZoomableBrowserPreview_4goxYXU$lambda$1$0(long j, boolean z) {
        return new BrowserPreviewTransform(j, z);
    }

    public static final boolean ZoomableBrowserPreview_4goxYXU$lambda$3$0$0(BrowserPreviewTransform browserPreviewTransform) {
        browserPreviewTransform.zoomBy(1.5f);
        return true;
    }

    public static final boolean ZoomableBrowserPreview_4goxYXU$lambda$3$0$7(BrowserPreviewTransform browserPreviewTransform, float f, float f2) {
        browserPreviewTransform.m1203transformWko1d7g(0L, AnonymousClass005.A0J(-f, -f2), 1.0f);
        return true;
    }

    /* renamed from: $r8$lambda$oslCG3DElJDeUpGYiB-cB8frSCc, reason: not valid java name */
    public static /* synthetic */ boolean m1240$r8$lambda$oslCG3DElJDeUpGYiBcB8frSCc(BrowserPreviewTransform browserPreviewTransform) {
        browserPreviewTransform.reset();
        return true;
    }

    public static /* synthetic */ boolean $r8$lambda$uSZX2CsLO0kdoj4DRkGKneZ77SM(BrowserPreviewTransform browserPreviewTransform) {
        browserPreviewTransform.zoomBy(0.6666667f);
        return true;
    }

    public static final boolean ZoomableBrowserPreview_4goxYXU$lambda$3$0$1(BrowserPreviewTransform browserPreviewTransform) {
        browserPreviewTransform.zoomBy(0.6666667f);
        return true;
    }

    public static final boolean ZoomableBrowserPreview_4goxYXU$lambda$3$0$2(BrowserPreviewTransform browserPreviewTransform) {
        browserPreviewTransform.reset();
        return true;
    }

    public static final float ZoomableBrowserPreview_4goxYXU$lambda$3$0$3(BrowserPreviewTransform browserPreviewTransform) {
        return AnonymousClass001.A00(browserPreviewTransform.m1201getPanLimitF1C5BW0()) - AnonymousClass001.A00(AWx.A07(browserPreviewTransform.offset$delegate));
    }

    public static final float ZoomableBrowserPreview_4goxYXU$lambda$3$0$4(BrowserPreviewTransform browserPreviewTransform) {
        return AnonymousClass003.A03(browserPreviewTransform.m1201getPanLimitF1C5BW0()) * 2.0f;
    }

    public static final float ZoomableBrowserPreview_4goxYXU$lambda$3$0$5(BrowserPreviewTransform browserPreviewTransform) {
        return AnonymousClass001.A01(browserPreviewTransform.m1201getPanLimitF1C5BW0(), 4294967295L) - AnonymousClass001.A01(4294967295L, AWx.A07(browserPreviewTransform.offset$delegate));
    }

    public static final float ZoomableBrowserPreview_4goxYXU$lambda$3$0$6(BrowserPreviewTransform browserPreviewTransform) {
        return AnonymousClass004.A00(browserPreviewTransform.m1201getPanLimitF1C5BW0()) * 2.0f;
    }

    public static final Unit ZoomableBrowserPreview_4goxYXU$lambda$7(long j, BRg bRg, boolean z, G0W g0w, int i, int i2, BFM bfm, int i3) {
        m1241ZoomableBrowserPreview4goxYXU(j, bRg, z, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
