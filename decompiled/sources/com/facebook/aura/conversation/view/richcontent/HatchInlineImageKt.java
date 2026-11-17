package com.facebook.aura.conversation.view.richcontent;

import X.ADq;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ATD;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BNt;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0sT;
import X.C0v5;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DM;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7LE;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC2178B0w;
import X.InterfaceC8647Fhz;
import android.text.BidiFormatter;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.gestures.ChildPressTrackerKt;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchInlineImageKt {
    public static final C7197Ei9 CENTER_CROP;
    public static final float DefaultInlineImageSize = 220.0f;
    public static final C1D3 IMAGE_SHAPE = C1D8.A00(16.0f);
    public static final String MEDIA_TYPE_IMAGE = "image";
    public static final String MEDIA_TYPE_VIDEO = "video";

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$GridImageCell$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $imageContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$imageContent = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
            invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AnonymousClass006.A1Q(bfm, this.$imageContent);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$GridImageCell$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $alt;
        public final /* synthetic */ int $count;
        public final /* synthetic */ boolean $deleted;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ G0U<String, Unit> $onImageError;
        public final /* synthetic */ int $position;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ String $url;
        public final /* synthetic */ String $workspacePath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(String str, String str2, int i, int i2, Function0<Unit> function0, BRg bRg, boolean z, String str3, G0U<? super String, Unit> g0u, String str4, int i3, int i4) {
            super(2);
            this.$url = str;
            this.$alt = str2;
            this.$position = i;
            this.$count = i2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$deleted = z;
            this.$workspacePath = str3;
            this.$onImageError = g0u;
            this.$sharedElementKey = str4;
            this.$$changed = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineImageKt.GridImageCell(this.$url, this.$alt, this.$position, this.$count, this.$onClick, this.$modifier, this.$deleted, this.$workspacePath, this.$onImageError, this.$sharedElementKey, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$MediaNotAvailableView$2, reason: invalid class name and case insensitive filesystem */
    public final class C115182 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $aspectRatio;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115182(BRg bRg, float f, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$aspectRatio = f;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineImageKt.MediaNotAvailableView(this.$modifier, this.$aspectRatio, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt$VideoPosterPlaceholder$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $aspectRatio;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, BRg bRg, int i, int i2) {
            super(2);
            this.$aspectRatio = f;
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
            HatchInlineImageKt.VideoPosterPlaceholder(this.$aspectRatio, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String inlineImageGridKeySuffix(List<HatchInlineImageData> list, int i) {
        C7384Etj.A0Y(list, 0);
        int i2 = 0;
        Iterable iterableA0C = ATD.A0C(0, i);
        if ((iterableA0C instanceof Collection) && ((Collection) iterableA0C).isEmpty()) {
            return "";
        }
        Iterator<Integer> it = iterableA0C.iterator();
        while (it.hasNext()) {
            if (C7384Etj.areEqual(list.get(((BNt) it).A00()).url, list.get(i).url) && (i2 = i2 + 1) < 0) {
                AbstractC0885AGm.A13();
                throw F60.createAndThrow();
            }
        }
        return i2 > 0 ? FGI.A0H("_", i2) : "";
    }

    public static final boolean isImageFileName(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (C7LE.A00(str.charAt(i))) {
                return false;
            }
        }
        return HatchFileUIUtils.FileExtensions.IMAGE.contains(AnonymousClass001.A0u(C7BY.A0R(str, "", '.')));
    }

    static {
        C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
        c7196Ei8.A0I = true;
        c7196Ei8.A00(InterfaceC8647Fhz.A01);
        CENTER_CROP = new C7197Ei9(c7196Ei8);
    }

    public static final void GridImageCell(String str, String str2, int i, int i2, Function0<Unit> function0, BRg bRg, boolean z, String str3, G0U<? super String, Unit> g0u, String str4, BFM bfm, int i3, int i4) {
        BBI bbiA0M;
        BRg bRg2 = bRg;
        boolean z2 = z;
        String str5 = str3;
        G0U<? super String, Unit> g0u2 = g0u;
        String str6 = str4;
        bfm.AgG(1291308218);
        int iA0d = (i3 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i3 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i3 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i2);
        }
        if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i5 = i4 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i3) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i6 = i4 & 64;
        if (i6 != 0) {
            iA0d |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z2);
        }
        int i7 = i4 & 128;
        int iA0k = 12582912;
        if (i7 != 0) {
            iA0d |= iA0k;
        } else if ((12582912 & i3) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, str5);
            iA0d |= iA0k;
        }
        int i8 = i4 & 256;
        int iA0b = 100663296;
        if (i8 != 0) {
            iA0d |= iA0b;
        } else if ((100663296 & i3) == 0) {
            i8 = 0;
            iA0b = AnonymousClass004.A0b(bfm, g0u2);
            iA0d |= iA0b;
        }
        int i9 = i4 & 512;
        if (i9 != 0) {
            iA0d |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            i9 = 0;
            iA0d |= AnonymousClass004.A0m(bfm, str6);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 306783379, 306783378), bfm, iA0d)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i7 != 0) {
                str5 = null;
            }
            if (i8 != 0) {
                g0u2 = null;
            }
            if (i9 != 0) {
                str6 = null;
            }
            int i10 = iA0d & 14;
            int i11 = iA0d >> 15;
            boolean zIsMediaDeleted = LocalDeletedMediaKeysKt.isMediaDeleted(str, z2, str5, bfm, (i11 & 896) | (i11 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i10, 0);
            boolean zA1U = AnonymousClass001.A1U(bfm, zIsMediaDeleted, AnonymousClass003.A17(i10));
            Object objAaT = bfm.AaT();
            if (zA1U || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0R(bfm, zIsMediaDeleted);
            }
            MutableState mutableState = (MutableState) objAaT;
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(inlineImageDescription(str2, MutableState.A0A(mutableState), bfm, (iA0d >> 3) & 14));
            C7384Etj.A0U(strUnicodeWrap);
            String strA02 = AbstractC2271BQs.A02(bfm, new Object[]{strUnicodeWrap, Integer.valueOf(i), Integer.valueOf(i2)}, R.string._name_removed__res_0x7f120b20);
            BRg bRgA04 = BRg.A00;
            BRg bRgA00 = BJe.A00(bRgA04, 1.0f, false);
            C1D3 c1d3 = HatchAdaptiveMediaGridKt.HatchMediaGridCellShape;
            BRg bRgA03 = C11U.A03(bRgA00, c1d3);
            boolean zA65 = bfm.A65(strA02);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchInlineImageKt$GridImageCell$boxModifier$1$1(strA02);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA03, objAaT2, false);
            if (MutableState.A0A(mutableState) || function0 == null) {
                bbiA0M = AnonymousClass002.A0M(bfm, -657719426);
            } else {
                bfm.AgE(-657928490);
                C1YD c1yd = new C1YD(0);
                boolean zA1T = AnonymousClass001.A1T(bfm, mapCurrentChatThreadLogMetadata, AnonymousClass002.A1U(bfm, hatchScreenA0M)) | AnonymousClass005.A1M(iA0d);
                Object objAaT3 = bfm.AaT();
                if (zA1T || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchInlineImageKt$GridImageCell$boxModifier$2$1(hatchScreenA0M, mapCurrentChatThreadLogMetadata, function0);
                    bfm.Ai0(objAaT3);
                }
                bRgA04 = C0v5.A04(bRgA04, c1yd, null, (Function0) objAaT3, true);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            BRg bRgThen = bRgA0Y.then(bRgA04);
            B1U b1uA00 = B1V.A00(bfm, new HatchInlineImageKt$GridImageCell$imageContent$1(str, mutableState, g0u2), -1438120670);
            if (str6 == null) {
                bfm.AgE(-656522702);
                BRg bRgThen2 = bRg2.then(bRgThen);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0J = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA04 = BBI.A04(bbiA0M);
                BRg bRgA01 = AxM.A01(bfm, bRgThen2);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                    AnonymousClass001.A1B(b1uA00, bfm, 6);
                    BBI.A0R(bbiA0M, true);
                    BBI.A0R(bbiA0M, false);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(-657145430);
            if (HatchSharedElementKt.isHatchSharedTransitionAvailable(bfm, 0)) {
                bfm.AgE(-657112322);
                BRg bRgThen3 = bRg2.then(bRgThen);
                InterfaceC1380AiA interfaceC1380AiAA0a2 = AnonymousClass001.A0a();
                int iA0J2 = AnonymousClass003.A0J(bbiA0M);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bRgThen3);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function03);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a2, akqA042, bRgA012, iA0J2);
                    HatchSharedElementKt.HatchSharedElement(str6, c1d3, null, null, null, null, B1V.A00(bfm, new HatchInlineImageKt$GridImageCell$1$1(b1uA00), 1132648180), bfm, ((iA0d >> 27) & 14) | 1572864, 60);
                    BBI.A0R(bbiA0M, true);
                }
                C00x.A00();
                throw F60.createAndThrow();
            }
            bfm.AgE(-656863206);
            C0sT.A00(C0sT.A01, C0sT.A00, null, bfm, bRg2.then(bRgThen), str6, FGI.A0M("lobster_inline_", str6), null, null, B1V.A00(bfm, new AnonymousClass2(b1uA00), 474202694), 0.0f, ((iA0d >> 27) & 14) | 805306368, 408);
            BBI.A0R(bbiA0M, false);
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, str2, i, i2, function0, bRg2, z2, str5, g0u2, str6, i3, i4);
        }
    }

    /* renamed from: HatchInlineImage-TxD2sAc, reason: not valid java name */
    public static final void m676HatchInlineImageTxD2sAc(String str, String str2, BRg bRg, float f, float f2, boolean z, String str3, Function0<Unit> function0, G0U<? super String, Unit> g0u, String str4, BFM bfm, int i, int i2) {
        BBI bbi;
        BRg bRg2 = bRg;
        float f3 = f;
        float f4 = f2;
        boolean z2 = z;
        String str5 = str3;
        G0U<? super String, Unit> g0u2 = g0u;
        String str6 = str4;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        bfm.AgG(1500055257);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f4);
        }
        int i6 = i2 & 32;
        int iA0s = 196608;
        if (i6 != 0) {
            iA0d |= iA0s;
        } else if ((i & 196608) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z2);
            iA0d |= iA0s;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            iA0d |= 1572864;
        } else if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, str5);
        }
        int i8 = i2 & 128;
        int iA0a = 12582912;
        if (i8 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, function0);
            iA0d |= iA0a;
        }
        int i9 = i2 & 256;
        int iA0b = 100663296;
        if (i9 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            i9 = 0;
            iA0b = AnonymousClass004.A0b(bfm, g0u2);
            iA0d |= iA0b;
        }
        int i10 = i2 & 512;
        if (i10 != 0) {
            iA0d |= 805306368;
        } else if ((i & 805306368) == 0) {
            i10 = 0;
            iA0d |= AnonymousClass004.A0m(bfm, str6);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f3 = DefaultInlineImageSize;
            }
            if (i5 != 0) {
                f4 = 16.0f;
            }
            if (i6 != 0) {
                z2 = false;
            }
            if (i7 != 0) {
                str5 = null;
            }
            if (i8 != 0) {
                function0 = null;
            }
            if (i9 != 0) {
                g0u2 = null;
            }
            if (i10 != 0) {
                str6 = null;
            }
            int i11 = iA0d & 14;
            int i12 = iA0d >> 12;
            boolean zIsMediaDeleted = LocalDeletedMediaKeysKt.isMediaDeleted(str, z2, str5, bfm, (i12 & 896) | (i12 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i11, 0);
            boolean zA1U = AnonymousClass001.A1U(bfm, zIsMediaDeleted, AnonymousClass003.A17(i11));
            Object objAaT = bfm.AaT();
            if (zA1U || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, zIsMediaDeleted);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA17 = AnonymousClass003.A17(i11) | AnonymousClass005.A1B(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA17 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass001.A0j(bfm, HatchFileUIUtils.FileExtensions.INSTANCE.isSvg(null, str5 == null ? "" : str5, str));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT2);
            C7197Ei9 c7197Ei9M679rememberSingleImageOptions8Feqmps = m679rememberSingleImageOptions8Feqmps(f3, bfm, (iA0d >> 9) & 14);
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            C1DM c1dm = (C1DM) bfm.A6v(LocalAttachmentCardShapeKt.LocalAttachmentCardShape);
            if (c1dm == null) {
                c1dm = IMAGE_SHAPE;
            }
            BRg bRgA0B = C3U4.A0B(BRg.A00, 0.0f, f4);
            B1U b1uA00 = B1V.A00(bfm, new HatchInlineImageKt$HatchInlineImage$content$1(str2, bRg2, zA1X, f3, function0, mutableState, hatchScreenA0M, mapCurrentChatThreadLogMetadata, str, c7197Ei9M679rememberSingleImageOptions8Feqmps, g0u2, str6), -976030758);
            if (str6 != null) {
                bfm.AgE(-985732653);
                if (HatchSharedElementKt.isHatchSharedTransitionAvailable(bfm, 0)) {
                    bfm.AgE(-985692260);
                    HatchSharedElementKt.HatchSharedElement(str6, c1dm, bRgA0B, null, null, null, B1V.A00(bfm, new HatchInlineImageKt$HatchInlineImage$1(b1uA00), 1920456281), bfm, ((iA0d >> 27) & 14) | 1572864, 56);
                } else {
                    bfm.AgE(-985495596);
                    C0sT.A00(C0sT.A01, C0sT.A00, null, bfm, C11U.A03(bRgA0B, c1dm), str6, FGI.A0M("lobster_inline_", str6), null, null, B1V.A00(bfm, new HatchInlineImageKt$HatchInlineImage$2(b1uA00), 1939587789), 0.0f, ((iA0d >> 27) & 14) | 805306368, 408);
                }
                bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-985149605);
                BRg bRgA03 = C11U.A03(bRgA0B, c1dm);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA03);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                AnonymousClass001.A1B(b1uA00, bfm, 6);
                BBI.A0R(bbi, zA1a);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchInlineImageKt$HatchInlineImage$4(str, str2, bRg2, f3, f4, z2, str5, function0, g0u2, str6, i, i2);
        }
    }

    /* renamed from: HatchInlineImageGrid-tw_glAc, reason: not valid java name */
    public static final void m677HatchInlineImageGridtw_glAc(AHD<HatchInlineImageData> ahd, BRg bRg, float f, float f2, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u, String str, boolean z, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> hatchInlineImageKt$HatchInlineImageGrid$6;
        ArrayList arrayListA0i;
        String strA0f;
        BRg bRg2 = bRg;
        float f3 = f2;
        G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v2 = g0v;
        String str2 = str;
        boolean z2 = z;
        float f4 = f;
        C7384Etj.A0Y(ahd, 0);
        bfm.AgG(-1461001264);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f4);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        int i7 = i2 & 32;
        int iA0Y = 196608;
        if (i7 != 0) {
            iA0d |= iA0Y;
        } else if ((i & 196608) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u);
            iA0d |= iA0Y;
        }
        int i8 = i2 & 64;
        int iA0j = 1572864;
        if (i8 != 0) {
            iA0d |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, str2);
            iA0d |= iA0j;
        }
        int i9 = i2 & 128;
        int iA0u = 12582912;
        if (i9 != 0) {
            iA0d |= iA0u;
        } else if ((i & 12582912) == 0) {
            iA0u = AnonymousClass004.A0u(bfm, z2);
            iA0d |= iA0u;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f4 = DefaultInlineImageSize;
            }
            if (i5 != 0) {
                f3 = 16.0f;
            }
            Function0 function0 = null;
            if (i6 != 0) {
                g0v2 = null;
            }
            if (i7 != 0) {
                g0u = null;
            }
            if (i8 != 0) {
                str2 = null;
            }
            if (i9 != 0) {
                z2 = false;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    hatchInlineImageKt$HatchInlineImageGrid$6 = new HatchInlineImageKt$HatchInlineImageGrid$1(ahd, bRg2, f4, f3, g0v2, g0u, str2, z2, i, i2);
                }
            } else if (ahd.size() == 1) {
                bfm.AgE(510440472);
                String strA0U = str2 != null ? FGI.A0U(str2, "_", ((HatchInlineImageData) ahd.get(0)).url) : null;
                String str3 = ((HatchInlineImageData) ahd.get(0)).url;
                String str4 = ((HatchInlineImageData) ahd.get(0)).alt;
                BRg bRgLongPressMediaTarget = (!z2 || strA0U == null) ? bRg2 : ChildPressTrackerKt.longPressMediaTarget(bRg2, strA0U);
                boolean z3 = ((HatchInlineImageData) ahd.get(0)).deleted;
                String str5 = ((HatchInlineImageData) ahd.get(0)).workspacePath;
                if (g0v2 == null) {
                    bfm.AgE(510961240);
                } else {
                    bfm.AgE(510961241);
                    boolean zA65 = bfm.A65(g0v2) | AnonymousClass002.A1O(iA0d & 14);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new HatchInlineImageKt$HatchInlineImageGrid$2$1$1(g0v2, ahd);
                        bfm.Ai0(objAaT);
                    }
                    function0 = (Function0) objAaT;
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                m676HatchInlineImageTxD2sAc(str3, str4, bRgLongPressMediaTarget, f4, f3, z3, str5, function0, g0u, strA0U, bfm, AnonymousClass001.A09(iA0d << 9, (iA0d << 3) & 64512), 0);
                bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                if (bBbAAc == null) {
                    return;
                } else {
                    hatchInlineImageKt$HatchInlineImageGrid$6 = new HatchInlineImageKt$HatchInlineImageGrid$3(ahd, bRg2, f4, f3, g0v2, g0u, str2, z2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 511080498);
                if (str2 != null) {
                    ADq aDqA12 = AbstractC0885AGm.A12(ahd);
                    arrayListA0i = AnonymousClass003.A0i(aDqA12);
                    Iterator<Integer> it = aDqA12.iterator();
                    while (it.hasNext()) {
                        int iA00 = ((BNt) it).A00();
                        arrayListA0i.add(FGI.A0d(str2, "_", ((HatchInlineImageData) ahd.get(iA00)).url, inlineImageGridKeySuffix(ahd, iA00)));
                    }
                } else {
                    arrayListA0i = null;
                }
                if (ahd.size() > 4) {
                    bfm.AgE(511324313);
                    strA0f = AnonymousClass003.A0f(bfm, bbiA0M, Integer.valueOf(ahd.size() - 4), R.string._name_removed__res_0x7f120633);
                } else {
                    bfm.AgE(511477980);
                    BBI.A0R(bbiA0M, false);
                    strA0f = null;
                }
                int size = ahd.size();
                BRg bRgA0R = AnonymousClass001.A0R(C3U4.A0B(bRg2, 0.0f, f3));
                Object objA6v = bfm.A6v(LocalAttachmentCardShapeKt.LocalAttachmentCardShape);
                if (objA6v != null) {
                    bRgA0R = bRgA0R.then(C11U.A03(BRg.A00, (C1DM) objA6v));
                }
                HatchAdaptiveMediaGridKt.HatchAdaptiveMediaGrid(size, strA0f, HatchImpressionModifierKt.hatchImpression(bRgA0R, HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.IMAGE_CAROUSEL, null, null, null, 500L, 0.0f, null, null, null), B1V.A00(bfm, new HatchInlineImageKt$HatchInlineImageGrid$5(ahd, g0v2, z2, str2, arrayListA0i, g0u), -430606020), bfm, 3072, 0);
            }
            bBbAAc.A06 = hatchInlineImageKt$HatchInlineImageGrid$6;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            hatchInlineImageKt$HatchInlineImageGrid$6 = new HatchInlineImageKt$HatchInlineImageGrid$6(ahd, bRg2, f4, f3, g0v2, g0u, str2, z2, i, i2);
            bBbAAc.A06 = hatchInlineImageKt$HatchInlineImageGrid$6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /* renamed from: HatchInlineVideoThumbnail-WSk2ftU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m678HatchInlineVideoThumbnailWSk2ftU(java.lang.String r48, java.lang.String r49, X.BRg r50, float r51, X.AHD<java.lang.String> r52, boolean r53, float r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, X.G0U<? super java.lang.String, kotlin.Unit> r56, java.lang.String r57, boolean r58, X.BFM r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt.m678HatchInlineVideoThumbnailWSk2ftU(java.lang.String, java.lang.String, X.BRg, float, X.AHD, boolean, float, kotlin.jvm.functions.Function0, X.G0U, java.lang.String, boolean, X.BFM, int, int, int):void");
    }

    public static final void MediaNotAvailableView(BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        bfm.AgG(-1569629211);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 1.0f;
            }
            BRg bRgA00 = BJe.A00(AnonymousClass001.A0R(bRg2), f2, false);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA002 = C1b8.A00(bRgA00, 0.04f, C06G.A0L(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA002);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C3TH c3th = C2VU.A00;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_info, 0), AuraIconSize.SMALL, null, C06G.A0I(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
            C01N.A08(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b21), null, C06G.A08(bfm), C06G.A0W(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C115182(bRg2, f2, i, i2);
        }
    }

    public static final String inlineImageDescription(String str, boolean z, BFM bfm, int i) {
        int i2;
        if (z) {
            bfm.AgE(551993988);
            i2 = R.string._name_removed__res_0x7f120b21;
        } else {
            if (!C7BY.A0j(str) && !isImageFileName(str)) {
                bfm.AgE(552000138);
                AnonymousClass001.A1D(bfm);
                return str;
            }
            bfm.AgE(551997826);
            i2 = R.string._name_removed__res_0x7f120b1f;
        }
        str = AbstractC2271BQs.A01(bfm, i2);
        AnonymousClass001.A1D(bfm);
        return str;
    }

    public static final void logInlineImageClick(HatchScreen hatchScreen, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.INLINE_IMAGE, null, map, null);
    }

    public static final void logMediaThumbnailClick(HatchScreen hatchScreen, Map<String, String> map, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.MEDIA_THUMBNAIL, null, AnonymousClass006.A11(HatchMetadataKey.MEDIA_TYPE.getValue(), str, map), null);
    }

    public static final void VideoPosterPlaceholder(float f, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1214499389);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C1b8.A04(bfm, BJe.A00(AnonymousClass001.A0R(bRg), f, false), AnonymousClass002.A0c(bfm).border);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(f, bRg, i, i2);
        }
    }

    public static final /* synthetic */ InterfaceC2178B0w access$HatchInlineVideoThumbnail_WSk2ftU$lambda$5(MutableState mutableState) {
        return (InterfaceC2178B0w) mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: rememberSingleImageOptions-8Feqmps, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C7197Ei9 m679rememberSingleImageOptions8Feqmps(float r7, X.BFM r8, int r9) {
        /*
            X.AXN r4 = X.AnonymousClass002.A0Y(r8)
            boolean r3 = r8.A65(r4)
            r0 = r9 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L15
            boolean r0 = r8.A62(r7)
            if (r0 != 0) goto L1a
        L15:
            r0 = r9 & 6
            r1 = 0
            if (r0 != r2) goto L1b
        L1a:
            r1 = 1
        L1b:
            r1 = r1 | r3
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L26
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L61
        L26:
            int r1 = r4.Abr(r7)
            X.Ei9 r0 = X.C7197Ei9.A0P
            X.Ei8 r7 = new X.Ei8
            r7.<init>(r0)
            r0 = 1
            r7.A0I = r0
            X.Fhz r0 = X.InterfaceC8647Fhz.A05
            r7.A00(r0)
            long r3 = (long) r1
            r2 = 32
            long r0 = r3 << r2
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r3 = r3 | r0
            X.BL4 r0 = com.facebook.aura.vds.compose.image.AuraImageKt.m2575auraDecodeSizeForozmzZPI(r3)
            if (r0 == 0) goto L59
            long r3 = r0.A00
            long r0 = r3 >> r2
            int r2 = (int) r0
            long r3 = r3 & r5
            int r1 = (int) r3
            X.Exe r0 = new X.Exe
            r0.<init>(r2, r1)
            r7.A06 = r0
        L59:
            X.Ei9 r0 = new X.Ei9
            r0.<init>(r7)
            r8.Ai0(r0)
        L61:
            X.Ei9 r0 = (X.C7197Ei9) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchInlineImageKt.m679rememberSingleImageOptions8Feqmps(float, X.BFM, int):X.Ei9");
    }
}
