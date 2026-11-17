package com.facebook.aura.sharesheet;

import X.AHD;
import X.AKQ;
import X.ATD;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B15;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1DG;
import X.C1SA;
import X.C1b8;
import X.C2VU;
import X.C2eD;
import X.C2eL;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C7481Exe;
import X.C78N;
import X.C90m;
import X.Ejq;
import X.F0C;
import X.F13;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchOpenGraphPreviewState;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPublishLinkSharePreviewKt {
    public static final float DefaultPreviewAspectRatio = 1.5f;
    public static final float MaxPreviewAspectRatio = 3.0f;
    public static final float MinPreviewAspectRatio = 0.5f;
    public static final C7197Ei9 PreviewImageOptions;

    /* renamed from: com.facebook.aura.sharesheet.HatchPublishLinkSharePreviewKt$HatchOpenGraphFallback$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $contentDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i) {
            super(2);
            this.$contentDescription = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishLinkSharePreviewKt.HatchOpenGraphFallback(this.$contentDescription, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchPublishLinkSharePreviewKt$HatchOpenGraphPreviewImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ HatchOpenGraphPreviewState $previewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchOpenGraphPreviewState hatchOpenGraphPreviewState, String str, int i) {
            super(2);
            this.$previewState = hatchOpenGraphPreviewState;
            this.$contentDescription = str;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishLinkSharePreviewKt.HatchOpenGraphPreviewImage(this.$previewState, this.$contentDescription, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchPublishLinkSharePreviewKt$HatchPublishLinkSharePreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C136672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchOpenGraphPreviewState $openGraphPreviewState;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $thumbnailUri;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136672(String str, HatchOpenGraphPreviewState hatchOpenGraphPreviewState, String str2, String str3, String str4, BRg bRg, int i, int i2) {
            super(2);
            this.$thumbnailUri = str;
            this.$openGraphPreviewState = hatchOpenGraphPreviewState;
            this.$title = str2;
            this.$subtitle = str3;
            this.$contentDescription = str4;
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
            HatchPublishLinkSharePreviewKt.HatchPublishLinkSharePreview(this.$thumbnailUri, this.$openGraphPreviewState, this.$title, this.$subtitle, this.$contentDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchPublishLinkSharePreviewKt$HatchPublishLinkThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C136682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ String $thumbnailUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136682(String str, String str2, int i) {
            super(2);
            this.$thumbnailUri = str;
            this.$contentDescription = str2;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishLinkSharePreviewKt.HatchPublishLinkThumbnail(this.$thumbnailUri, this.$contentDescription, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    static {
        C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
        ((C7195Ei7) c7196Ei8).A06 = new C7481Exe(512, 512);
        PreviewImageOptions = new C7197Ei9(c7196Ei8);
    }

    public static final void HatchPublishLinkSharePreview(String str, HatchOpenGraphPreviewState hatchOpenGraphPreviewState, String str2, String str3, String str4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(hatchOpenGraphPreviewState, str2, str3, 1);
        C7384Etj.A0Y(str4, 4);
        bfm.AgG(-1287557014);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchOpenGraphPreviewState, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str4);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            BRg bRgA012 = C1b8.A01(C11U.A01(C10G.A08(bs0, 280.0f), 24.0f), auraColorsA0c.secondaryButtonBackground);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            int i5 = iA0d >> 9;
            int i6 = i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            HatchOpenGraphPreviewImage(hatchOpenGraphPreviewState, str4, bfm, ((iA0d >> 3) & 14) | i6);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 12.0f, 6.0f, 16.0f, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA014 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA014, g0vA0u);
            C90m c90m = C90m.A00;
            HatchPublishLinkThumbnail(str, str4, bfm, (iA0d & 14) | i6);
            C3Ue.A04(C10G.A08(bs0, 12.0f), bfm, 6);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA044 = BBI.A04(bbi);
            BRg bRgA015 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA044, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA015, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.primaryText, auraTypographyA0f.bodyMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 6) & 14) | 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, auraColorsA0c.secondaryText, auraTypographyA0f.footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, (i5 & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136672(str, hatchOpenGraphPreviewState, str2, str3, str4, bRg2, i, i2);
        }
    }

    public static final void HatchOpenGraphFallback(String str, BFM bfm, int i) {
        bfm.AgG(973808971);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            C1SA.A00(bfm, null, C3U4.A09(C10G.A01, 16.0f), null, BOf.A00(bfm, R.drawable.muse_wordmark, 0), B18.A02, str, 0.0f, AVy.$stable | 24960 | ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 104);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, i);
        }
    }

    public static final void HatchOpenGraphPreviewImage(HatchOpenGraphPreviewState hatchOpenGraphPreviewState, String str, BFM bfm, int i) {
        HatchOpenGraphPreviewState.Available available;
        bfm.AgG(-1107389437);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(hatchOpenGraphPreviewState, bfm, i) ? 1 : 0) : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205db);
            boolean z = hatchOpenGraphPreviewState instanceof HatchOpenGraphPreviewState.Available;
            AHD<String> ahd = (!z || (available = (HatchOpenGraphPreviewState.Available) hatchOpenGraphPreviewState) == null) ? null : available.imageUrls;
            boolean zA65 = bfm.A65(ahd);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ParcelableSnapshotMutableFloatState(1.5f);
                bfm.Ai0(objAaT);
            }
            final C00q c00q = (C00q) objAaT;
            boolean zA652 = bfm.A65(ahd);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass004.A11(bfm, ImageLoadState.LOADING);
            }
            final MutableState mutableState = (MutableState) objAaT2;
            boolean zA653 = bfm.A65(ahd);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = new F13() { // from class: com.facebook.aura.sharesheet.HatchPublishLinkSharePreviewKt$HatchOpenGraphPreviewImage$imageListener$1$1
                    @Override // X.F13, X.Ej6
                    public void onFailure(long j, Drawable drawable, Throwable th) {
                        C00q c00q2 = c00q;
                        float f = HatchPublishLinkSharePreviewKt.DefaultPreviewAspectRatio;
                        c00q2.AdS(1.5f);
                        mutableState.Af8(ImageLoadState.FAILED);
                    }

                    @Override // X.F13, X.Ej6
                    public void onFinalImageSet(long j, int i2, C2eL c2eL, Drawable drawable) {
                        int intrinsicWidth;
                        int intrinsicHeight;
                        MutableState<ImageLoadState> mutableState2 = mutableState;
                        ImageLoadState imageLoadState = ImageLoadState.LOADED;
                        float f = HatchPublishLinkSharePreviewKt.DefaultPreviewAspectRatio;
                        mutableState2.Af8(imageLoadState);
                        if (c2eL != null) {
                            intrinsicWidth = c2eL.getWidth();
                            intrinsicHeight = c2eL.getHeight();
                        } else {
                            if (drawable == null) {
                                return;
                            }
                            intrinsicWidth = drawable.getIntrinsicWidth();
                            intrinsicHeight = drawable.getIntrinsicHeight();
                        }
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            return;
                        }
                        c00q.AdS(ATD.A03(intrinsicWidth / intrinsicHeight, 0.5f, 3.0f));
                    }
                };
                bfm.Ai0(objAaT3);
            }
            F13 f13 = (F13) objAaT3;
            BS0 bs0 = BRg.A00;
            BRg bRgA01 = C1b8.A01(C11U.A01(BJe.A00(C3U4.A09(C10G.A02, 6.0f), c00q.AFn(), false), 18.0f), B6A.A08);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            if (ahd != null) {
                boolean zA1Y = AnonymousClass001.A1Y(ahd, bfm, -765094158);
                Object objAaT4 = bfm.AaT();
                if (zA1Y || objAaT4 == C78N.A00) {
                    F0C f0c = B15.A02;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                    Iterator it = ahd.iterator();
                    while (it.hasNext()) {
                        arrayListA0i.add(B15.A01(AnonymousClass005.A0j(it)));
                    }
                    Ejq[] ejqArr = (Ejq[]) arrayListA0i.toArray(new Ejq[0]);
                    Ejq[] ejqArr2 = (Ejq[]) Arrays.copyOf(ejqArr, ejqArr.length);
                    C7384Etj.A0Y(ejqArr2, 0);
                    objAaT4 = new C2eD(ejqArr2);
                    bfm.Ai0(objAaT4);
                }
                AuraImageKt.AuraImage(C10G.A01, (Ejq) objAaT4, str, PreviewImageOptions, false, null, f13, false, false, false, B18.A02, null, null, null, false, null, bfm, ((iA05 << 3) & 896) | 100663302, 3078, 55984);
            } else {
                bfm.AgE(-764564647);
            }
            BBI.A0R(bbi, false);
            if (hatchOpenGraphPreviewState == HatchOpenGraphPreviewState.Loading.INSTANCE || (z && mutableState.getValue() == ImageLoadState.LOADING)) {
                boolean zA1Y2 = AnonymousClass001.A1Y(strA01, bfm, 806627470);
                Object objAaT5 = bfm.AaT();
                if (zA1Y2 || objAaT5 == C78N.A00) {
                    objAaT5 = new HatchPublishLinkSharePreviewKt$HatchOpenGraphPreviewImage$1$1$1(strA01);
                    bfm.Ai0(objAaT5);
                }
                AnonymousClass007.A0v(bfm, bs0, (G0U) objAaT5);
            } else if (hatchOpenGraphPreviewState == HatchOpenGraphPreviewState.Unavailable.INSTANCE || mutableState.getValue() == ImageLoadState.FAILED) {
                bfm.AgE(806638419);
                HatchOpenGraphFallback(str, bfm, (iA05 >> 3) & 14);
            } else {
                bfm.AgE(-763966471);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchOpenGraphPreviewState, str, i);
        }
    }

    public static final void HatchPublishLinkThumbnail(String str, String str2, BFM bfm, int i) {
        bfm.AgG(1792565207);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            BRg bRgA01 = C1b8.A01(C11U.A01(C10G.A07(bs0, 40.0f), 8.0f), B6A.A08);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            if (str != null) {
                bfm.AgE(-705529336);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A01, B18.A02, str2, null, false, new C1DG(48.0f), 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 1573296 | ((iA0d << 6) & 7168), 0, 32688);
            } else {
                bfm.AgE(-705294139);
                C1SA.A00(bfm, null, AnonymousClass001.A0S(bs0), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 432, 120);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C136682(str, str2, i);
        }
    }
}
