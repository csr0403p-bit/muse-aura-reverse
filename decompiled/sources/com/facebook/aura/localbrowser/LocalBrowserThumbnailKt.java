package com.facebook.aura.localbrowser;

import X.AIC;
import X.AKO;
import X.ARL;
import X.ASZ;
import X.AVy;
import X.AaC;
import X.AbstractC1496Ak3;
import X.AbstractC1564Ale;
import X.AbstractC1798ArH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B15;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1HY;
import X.C1Hg;
import X.C1SA;
import X.C2Cx;
import X.C2VU;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C9Ux;
import X.Ejq;
import X.F0C;
import X.F2N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC0857A6e;
import X.InterfaceC1497Ak4;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class LocalBrowserThumbnailKt {
    public static final void LocalBrowserLoadingPreview(final String str, final BRg bRg, BFM bfm, final int i, final int i2) {
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-861866629);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraSpinnerStyle auraSpinnerStyleLarge = AuraSpinnerStyle.Companion.large(bfm, 6);
            BRg bRgA02 = C10G.A02(C2VU.A09, bRg, false);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$$ExternalSyntheticLambda4
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserThumbnailKt.LocalBrowserLoadingPreview$lambda$0$0(str, (InterfaceC0857A6e) obj);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bRgA02, objAaT, false), auraSpinnerStyleLarge, 0L, bfm, AuraSpinnerStyle.$stable << 3, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$$ExternalSyntheticLambda5
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg2 = bRg;
                    int i4 = i;
                    LocalBrowserThumbnailKt.LocalBrowserLoadingPreview(str2, bRg2, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserLoadingPreview$lambda$0$0(String str, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A08(interfaceC0857A6e, str);
        AbstractC1564Ale.A04(interfaceC0857A6e);
        AbstractC1564Ale.A01(C2Cx.A03, interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserThumbnail$lambda$7$0(MutableState mutableState, InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 1);
        boolean z = false;
        AaC aaCA00 = AbstractC1496Ak3.A00(interfaceC1497Ak4, true);
        if (aaCA00.A02 - aaCA00.A01 > 0.0f && aaCA00.A00 - aaCA00.A03 > 0.0f) {
            z = true;
        }
        MutableState.A09(z, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserThumbnail$lambda$8(Bitmap bitmap, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 1);
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            LocalBrowserImage(bitmap, bRg, null, null, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 12);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void LocalBrowserImage(final Bitmap bitmap, BRg bRg, ARL arl, Alignment alignment, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        ARL arl2 = arl;
        Alignment alignment2 = alignment;
        bfm.AgG(1744199122);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, bitmap) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, arl2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, alignment2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                arl2 = B18.A02;
            }
            if (i5 != 0) {
                alignment2 = C2VU.A09;
            }
            boolean zA65 = bfm.A65(bitmap);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                F0C f0c = B15.A02;
                C7384Etj.A0Y(bitmap, 0);
                objAaT = new C9Ux(bitmap);
                BBI.A0T(bfm, objAaT);
            }
            C1SA.A00(bfm, alignment2, bRg2, null, C1Hg.A00(bfm, null, null, null, (Ejq) objAaT, "LocalBrowserThumbnail", 6, 124, false), arl2, null, 0.0f, AVy.$stable | 48 | ((iA0T << 3) & 896) | (iA0T & 7168) | ((iA0T << 6) & 57344), 96);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final ARL arl3 = arl2;
            final Alignment alignment3 = alignment2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$$ExternalSyntheticLambda3
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    Bitmap bitmap2 = bitmap;
                    BRg bRg4 = bRg3;
                    ARL arl4 = arl3;
                    Alignment alignment4 = alignment3;
                    int i6 = i;
                    LocalBrowserThumbnailKt.LocalBrowserImage(bitmap2, bRg4, arl4, alignment4, (BFM) obj, AnonymousClass011.A02(obj2, i6), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LocalBrowserThumbnail(final LocalBrowserTarget localBrowserTarget, BRg bRg, boolean z, boolean z2, ARL arl, Alignment alignment, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i, final int i2) {
        char c;
        BRg bRg2 = bRg;
        final boolean z3 = z;
        ARL arl2 = arl;
        Alignment alignment2 = alignment;
        boolean zA1K = z2;
        G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        C7384Etj.A0Y(localBrowserTarget, 0);
        bfm.AgG(-955044120);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(localBrowserTarget, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z3);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, zA1K);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
            c = ' ';
        } else {
            c = ' ';
            if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
                iA05 |= AnonymousClass004.A0h(bfm, arl2);
            }
        }
        int i7 = i2 & 32;
        int iA0i = 196608;
        if (i7 != 0) {
            iA05 |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, alignment2);
            iA05 |= iA0i;
        }
        int i8 = i2 & 64;
        int iA0Z = 1572864;
        if (i8 != 0) {
            iA05 |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0w2);
            iA05 |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            if (i6 != 0) {
                arl2 = B18.A02;
            }
            if (i7 != 0) {
                alignment2 = C2VU.A09;
            }
            if (i8 != 0) {
                g0w2 = ComposableSingletons$LocalBrowserThumbnailKt.lambda$2103289879;
            }
            BBI bbi = (BBI) bfm;
            F2N lifecycle = ((C1HY) AKO.A07(AIC.A00, bbi)).getLifecycle();
            int i9 = iA05 & 14;
            boolean z4 = i9 == 4 || ((iA05 & 8) != 0 && bfm.A65(localBrowserTarget));
            Object objAaT = bfm.AaT();
            if (z4 || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A08(false);
                BBI.A0O(bbi, objAaT);
            }
            final MutableState mutableState = (MutableState) objAaT;
            boolean z5 = i9 == 4 || ((iA05 & 8) != 0 && bfm.A65(localBrowserTarget));
            Object objAaT2 = bfm.AaT();
            if (z5 || objAaT2 == C78N.A00) {
                objAaT2 = AbstractC1798ArH.A04(bbi, localBrowserTarget.lastUserThumbnail);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            Object[] objArr = {localBrowserTarget, lifecycle, Boolean.valueOf(MutableState.A0A(mutableState)), Boolean.valueOf(z3)};
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableState2, (i9 == 4 || ((iA05 & 8) != 0 && bfm.A67(localBrowserTarget))) | AnonymousClass003.A1J(bfm, mutableState, lifecycle), AnonymousClass004.A1K(iA05));
            Object objAaT3 = bfm.AaT();
            if (zA1W || objAaT3 == C78N.A00) {
                objAaT3 = new LocalBrowserThumbnailKt$LocalBrowserThumbnail$1$1(lifecycle, mutableState, localBrowserTarget, z3, mutableState2, null);
                BBI.A0O(bbi, objAaT3);
            }
            C78e.A08(bfm, (G0V) objAaT3, objArr);
            final Bitmap bitmap = (Bitmap) mutableState2.getValue();
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == C78N.A00) {
                objAaT4 = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return LocalBrowserThumbnailKt.LocalBrowserThumbnail$lambda$7$0(mutableState, (InterfaceC1497Ak4) obj);
                    }
                };
                BBI.A0O(bbi, objAaT4);
            }
            BRg bRgA00 = ASZ.A00(bRg2, (G0U) objAaT4);
            if (bitmap == null) {
                bfm.AgE(-1854773128);
                AnonymousClass001.A1G(bRgA00, bfm, g0w2, (iA05 >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            } else if (zA1K) {
                bfm.AgE(-1854714569);
                ZoomableBrowserPreviewKt.m1241ZoomableBrowserPreview4goxYXU(AnonymousClass002.A0G(bitmap.getHeight(), bitmap.getWidth() << c), bRgA00, false, B1V.A00(bfm, new G0W() { // from class: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$$ExternalSyntheticLambda1
                    @Override // X.G0W
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return LocalBrowserThumbnailKt.LocalBrowserThumbnail$lambda$8(bitmap, (BRg) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                    }
                }, -1413144738), bfm, 3072, 4);
            } else {
                bfm.AgE(-1854541558);
                LocalBrowserImage(bitmap, bRgA00, arl2, alignment2, bfm, (iA05 >> 6) & 8064, 0);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final boolean z6 = zA1K;
            final ARL arl3 = arl2;
            final Alignment alignment3 = alignment2;
            final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w3 = g0w2;
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserThumbnailKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    LocalBrowserTarget localBrowserTarget2 = localBrowserTarget;
                    BRg bRg4 = bRg3;
                    boolean z7 = z3;
                    boolean z8 = z6;
                    ARL arl4 = arl3;
                    Alignment alignment4 = alignment3;
                    G0W g0w4 = g0w3;
                    int i10 = i;
                    LocalBrowserThumbnailKt.LocalBrowserThumbnail(localBrowserTarget2, bRg4, z7, z8, arl4, alignment4, g0w4, (BFM) obj, AnonymousClass011.A02(obj2, i10), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserImage$lambda$1(Bitmap bitmap, BRg bRg, ARL arl, Alignment alignment, int i, int i2, BFM bfm, int i3) {
        LocalBrowserImage(bitmap, bRg, arl, alignment, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserLoadingPreview$lambda$1(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserLoadingPreview(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserThumbnail$lambda$9(LocalBrowserTarget localBrowserTarget, BRg bRg, boolean z, boolean z2, ARL arl, Alignment alignment, G0W g0w, int i, int i2, BFM bfm, int i3) {
        LocalBrowserThumbnail(localBrowserTarget, bRg, z, z2, arl, alignment, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
