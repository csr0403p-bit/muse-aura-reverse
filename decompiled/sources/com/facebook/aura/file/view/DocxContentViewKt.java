package com.facebook.aura.file.view;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BG3;
import X.BLS;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0A8;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C90m;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.file.docx.Alignment;
import com.facebook.aura.file.docx.DocElement;
import com.facebook.aura.file.docx.DocxParser;
import com.facebook.aura.file.docx.ListStyle;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class DocxContentViewKt {
    public static final float DEFAULT_LINE_SPACING_MULTIPLIER = 1.15f;
    public static final String DOCX_MIME_TYPE = "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
    public static final String DOCX_TAG = "DocxContentView";
    public static final float FONT_SCALE = 1.4f;
    public static final float PT_TO_DP = 1.3333334f;
    public static final float SINGLE_LINE_HEIGHT_FACTOR = 1.2f;

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxDrawingPlaceholder$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ DocElement.Drawing $drawing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DocElement.Drawing drawing, int i) {
            super(2);
            this.$drawing = drawing;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DocxContentViewKt.DocxDrawingPlaceholder(this.$drawing, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxEmptyContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119352(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            DocxContentViewKt.DocxEmptyContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxImage$2, reason: invalid class name and case insensitive filesystem */
    public final class C119362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ DocElement.Image $image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119362(DocElement.Image image, int i) {
            super(2);
            this.$image = image;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DocxContentViewKt.DocxImage(this.$image, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxLoadingContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C119372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119372(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            DocxContentViewKt.DocxLoadingContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxParagraph$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ DocElement.Para $para;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DocElement.Para para, int i) {
            super(2);
            this.$para = para;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DocxContentViewKt.DocxParagraph(this.$para, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.file.view.DocxContentViewKt$DocxTable$2, reason: invalid class name and case insensitive filesystem */
    public final class C119382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ DocElement.Table $table;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119382(DocElement.Table table, int i) {
            super(2);
            this.$table = table;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DocxContentViewKt.DocxTable(this.$table, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final int computeInSampleSize(int i, int i2) {
        int i3 = 1;
        if (i > 0 && i2 > 0) {
            while (true) {
                int i4 = i3 * 2;
                if (i / i4 < i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return i3;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                AnonymousClass005.A0v(Alignment.CENTER, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(Alignment.RIGHT, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(Alignment.JUSTIFY, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(Alignment.LEFT, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ListStyle.values().length];
            try {
                AnonymousClass005.A0v(ListStyle.BULLET, iArr2, 1);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(ListStyle.NUMBERED, iArr2, 2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(ListStyle.NONE, iArr2, 3);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: DocxContent-6a0pyJM, reason: not valid java name */
    public static final void m886DocxContent6a0pyJM(File file, BRg bRg, float f, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object docxContentViewKt$DocxContent$6;
        List<DocElement> list;
        BRg bRg2 = bRg;
        float f2 = f;
        C7384Etj.A0Y(file, 0);
        bfm.AgG(-247636751);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, file) | i : i;
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
            iA0T |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            boolean zA67 = bfm.A67(file);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new DocxContentViewKt$DocxContent$1$1(file);
                bfm.Ai0(objAaT);
            }
            int i5 = iA0T & 14;
            C78e.A05(bfm, file, (G0U) objAaT);
            if (file.length() > AuraFileViewerLimits.INSTANCE.getMaxRenderBytes()) {
                bfm.AgE(1407748525);
                OpenExternallyCardKt.OpenExternallyCard(file, "application/vnd.openxmlformats-officedocument.wordprocessingml.document", bRg2, (String) null, bfm, i5 | 48 | ((iA0T << 3) & 896), 8);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    docxContentViewKt$DocxContent$6 = new DocxContentViewKt$DocxContent$2(file, bRg2, f2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 1407844625);
                float fA00 = C60Q.A00(bfm);
                boolean zA65 = bfm.A65(file);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = AnonymousClass004.A11(bfm, null);
                }
                MutableState mutableState = (MutableState) objAaT2;
                boolean zA652 = bfm.A65(file);
                Object objAaT3 = bfm.AaT();
                if (zA652 || objAaT3 == C78N.A00) {
                    objAaT3 = AnonymousClass005.A0S(bfm, false);
                }
                MutableState mutableState2 = (MutableState) objAaT3;
                boolean zA1O = AnonymousClass003.A1O(bfm, file, mutableState2, bfm.A65(mutableState));
                Object objAaT4 = bfm.AaT();
                if (zA1O || objAaT4 == C78N.A00) {
                    objAaT4 = new DocxContentViewKt$DocxContent$3$1(file, mutableState, mutableState2, null);
                    bfm.Ai0(objAaT4);
                }
                AnonymousClass001.A18(bfm, objAaT4, file);
                if (MutableState.A0A(mutableState2)) {
                    bfm.AgE(1408359442);
                    OpenExternallyCardKt.OpenExternallyCard(file, "application/vnd.openxmlformats-officedocument.wordprocessingml.document", bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e0), bfm, ((iA0T << 3) & 896) | i5 | 48, 0);
                } else if (mutableState.getValue() == null) {
                    bfm.AgE(1408571296);
                    DocxLoadingContent(bRg2, bfm, (iA0T >> 3) & 14, 0);
                } else {
                    bfm.AgE(1408669101);
                    DocxParser.PreviewResult previewResult = (DocxParser.PreviewResult) mutableState.getValue();
                    if (previewResult == null || (list = previewResult.elements) == null) {
                        bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                        if (bBbAAc == null) {
                            return;
                        } else {
                            docxContentViewKt$DocxContent$6 = new DocxContentViewKt$DocxContent$docElements$1(file, bRg2, f2, i, i2);
                        }
                    } else if (list.isEmpty()) {
                        bfm.AgE(1408708657);
                        DocxEmptyContent(bRg2, bfm, (iA0T >> 3) & 14, 0);
                        BBI.A0R(bbiA0M, false);
                        bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                        if (bBbAAc == null) {
                            return;
                        } else {
                            docxContentViewKt$DocxContent$6 = new DocxContentViewKt$DocxContent$4(file, bRg2, f2, i, i2);
                        }
                    } else {
                        bfm.AgE(1408770161);
                        BBI.A0R(bbiA0M, false);
                        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                        int iA0J = AnonymousClass003.A0J(bbiA0M);
                        AKQ akqA04 = BBI.A04(bbiA0M);
                        BRg bRgA01 = AxM.A01(bfm, bRg2);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbiA0M.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm, bbiA0M, function0);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                        FileViewerZoomKt.ZoomableContainer(C10G.A04(C10G.A02, fA00), 0.0f, B1V.A00(bfm, new DocxContentViewKt$DocxContent$5$1(f2, list), -1084625893), bfm, 384, 2);
                        DocxParser.PreviewResult previewResult2 = (DocxParser.PreviewResult) mutableState.getValue();
                        if (previewResult2 == null || !previewResult2.truncated) {
                            bfm.AgE(1540237120);
                        } else {
                            bfm.AgE(1540047803);
                            OpenExternallyCardKt.OpenExternallyCard(file, "application/vnd.openxmlformats-officedocument.wordprocessingml.document", (BRg) null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ef), bfm, i5 | 48, 4);
                        }
                        BBI.A0R(bbiA0M, false);
                        BBI.A0R(bbiA0M, true);
                    }
                }
                BBI.A0R(bbiA0M, false);
            }
            C3cG.A1D(bBbAAc, docxContentViewKt$DocxContent$6);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            docxContentViewKt$DocxContent$6 = new DocxContentViewKt$DocxContent$6(file, bRg2, f2, i, i2);
            C3cG.A1D(bBbAAc, docxContentViewKt$DocxContent$6);
        }
    }

    public static final void DocxEmptyContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-145856582);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium), 150.0f);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e9);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119352(bRg2, i, i2);
        }
    }

    public static final Bitmap decodeDownsampledBitmap(byte[] bArr, int i) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            int length = bArr.length;
            BitmapFactory.decodeByteArray(bArr, 0, length, options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = computeInSampleSize(options.outWidth, i);
            return BitmapFactory.decodeByteArray(bArr, 0, length, options2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void DocxDrawingPlaceholder(DocElement.Drawing drawing, BFM bfm, int i) {
        bfm.AgG(-701605818);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, drawing) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            BRg bRgA01 = C11U.A01(C3U4.A06(C10G.A02, AuraDimensKt.SpacingXsmall), 8.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA09 = C3U4.A09(C1b8.A00(bRgA01, 0.08f, C3cH.A07(bfm, auraTheme)), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            String strA01 = drawing.label;
            if (strA01 == null) {
                bfm.AgE(2082830944);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e3);
            } else {
                bfm.AgE(2082830417);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(FGI.A0U("[", strA01, "]"), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(drawing, i);
        }
    }

    public static final void DocxImage(DocElement.Image image, BFM bfm, int i) {
        bfm.AgG(-635790817);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, image) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            Resources resources = (Resources) bfm.A6v(AndroidCompositionLocals_androidKt.A04);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                int i2 = resources.getDisplayMetrics().widthPixels;
                if (i2 < 1) {
                    i2 = 1;
                }
                objAaT = Integer.valueOf(i2);
                bfm.Ai0(objAaT);
            }
            int iA0F = AnonymousClass001.A0F(objAaT);
            boolean zA65 = bfm.A65(image.imageBytes);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = decodeDownsampledBitmap(image.imageBytes, iA0F);
                bfm.Ai0(objAaT2);
            }
            Bitmap bitmap = (Bitmap) objAaT2;
            if (bitmap != null) {
                bfm.AgE(-38014646);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
                String str = image.altText;
                if (str.length() == 0) {
                    str = null;
                }
                AuraImageKt.AuraImage(bitmapDrawable, C3U4.A06(C11U.A01(C10G.A02, 8.0f), AuraDimensKt.SpacingXsmall), null, str, false, bfm, 0, 20);
            } else {
                bfm.AgE(-37740637);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119362(image, i);
        }
    }

    public static final void DocxLoadingContent(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-2041727829);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg), 200.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119372(bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DocxParagraph(com.facebook.aura.file.docx.DocElement.Para r55, X.BFM r56, int r57) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.DocxContentViewKt.DocxParagraph(com.facebook.aura.file.docx.DocElement$Para, X.BFM, int):void");
    }

    public static final void DocxTable(DocElement.Table table, BFM bfm, int i) {
        BRg bRgA00;
        bfm.AgG(-402917063);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, table) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingXsmall;
            BRg bRgA01 = C11U.A01(C3U4.A0B(c1062ATq, 0.0f, f), 8.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA02 = C1DI.A02(bRgA01, C1D8.A00(8.0f), 1.0f, HxS.A04(HDi.A0O[(int) (jA07 & 63)], B6A.A03(jA07), B6A.A02(jA07), B6A.A01(jA07), 0.3f));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                bfm.AgE(-203611102);
                int i2 = 0;
                for (List<String> list : table.rows) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        List<String> list2 = list;
                        if (i2 == 0) {
                            bfm.AgE(1142056223);
                            bRgA00 = C1b8.A00(bs0, 0.08f, C3cH.A07(bfm, auraTheme));
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(1142180254);
                            BBI.A0R(bbi, false);
                            bRgA00 = bs0;
                        }
                        BRg bRgThen = c1062ATq.then(bRgA00);
                        float f2 = AuraDimensKt.SpacingSmall;
                        BRg bRgA0B = C3U4.A0B(bRgThen, f2, f);
                        InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA013 = AxM.A01(bfm, bRgA0B);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
                        BPg.A02(bfm, akqA042, g0v);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA013, g0vA0u);
                        C90m c90m = C90m.A00;
                        Iterator itA0w = AnonymousClass001.A0w(bfm, list2, -394315497);
                        int i4 = 0;
                        while (itA0w.hasNext()) {
                            Object next = itA0w.next();
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                String str = (String) next;
                                if (i4 > 0) {
                                    bfm.AgE(-1882316743);
                                    C01N.A09(bfm, bs0, f2);
                                } else {
                                    bfm.AgE(-1882246590);
                                }
                                BBI.A0R(bbi, false);
                                C1822Arm c1822Arm = i2 == 0 ? C3cH.A0X(bfm, auraTheme, -60713518).footnoteEmphasized : C3cH.A0X(bfm, auraTheme, -60711505).footnoteRegular;
                                BBI.A0R(bbi, false);
                                AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C3cH.A06(bfm, auraTheme), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                                i4 = i5;
                            }
                        }
                        AnonymousClass003.A0q(bbi);
                        i2 = i3;
                    }
                    AbstractC0885AGm.A14();
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C119382(table, i);
        }
    }

    public static final BG3 buildTextDecoration(boolean z, boolean z2) {
        ArrayList arrayListA0h = C3cG.A0h();
        if (z) {
            arrayListA0h.add(BG3.A03);
        }
        if (z2) {
            arrayListA0h.add(BG3.A01);
        }
        if (arrayListA0h.isEmpty()) {
            return null;
        }
        return BLS.A00(arrayListA0h);
    }
}
