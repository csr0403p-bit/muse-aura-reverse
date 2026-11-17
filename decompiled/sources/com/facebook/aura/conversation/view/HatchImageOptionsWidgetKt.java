package com.facebook.aura.conversation.view;

import X.AKH;
import X.AKQ;
import X.AbstractC0878AGe;
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
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1D3;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2k;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.conversation.view.richcontent.LocalIsPrimaryThreadKt;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.ImageOptionsWidgetData;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.LabelButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchImageOptionsWidgetKt {
    public static final float BubbleInset = 12.0f;
    public static final int IMAGE_OPTIONS_GRID_COLUMNS = 2;
    public static final int IMAGE_OPTIONS_MAX_SELECTIONS = 4;
    public static final float SelectedTileAlpha = 1.0f;
    public static final int SelectionAnimationDurationMs = 180;
    public static final float TileCornerRadius = 12.0f;
    public static final float TileSpacing = 8.0f;
    public static final float UnselectedTileAlpha = 0.5f;

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$ImageOptionImage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
        public final /* synthetic */ String $path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, String str2, BRg bRg, G0V<? super Integer, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$path = str;
            this.$contentDescription = str2;
            this.$modifier = bRg;
            this.$onImageSizeDecoded = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImageOptionsWidgetKt.ImageOptionImage(this.$path, this.$contentDescription, this.$modifier, this.$onImageSizeDecoded, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$ImageOptionsConfirmButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$onClick = function0;
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
            HatchImageOptionsWidgetKt.ImageOptionsConfirmButton(this.$text, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$ImageOptionsConfirmLayout$2, reason: invalid class name and case insensitive filesystem */
    public final class C114722 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $locked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114722(boolean z, String str, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$locked = z;
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImageOptionsWidgetKt.ImageOptionsConfirmLayout(this.$locked, this.$confirmText, this.$onConfirm, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$ImageOptionsGrid$2, reason: invalid class name and case insensitive filesystem */
    public final class C114732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<String> $images;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G2k<Integer, String, BRg, BFM, Integer, Unit> $tile;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114732(List<String> list, BRg bRg, G2k<? super Integer, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, int i, int i2) {
            super(2);
            this.$images = list;
            this.$modifier = bRg;
            this.$tile = g2k;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchImageOptionsWidgetKt.ImageOptionsGrid(this.$images, this.$modifier, this.$tile, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$MultiSelectImageOptions$2, reason: invalid class name and case insensitive filesystem */
    public final class C114742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $atMax;
        public final /* synthetic */ List<Integer> $confirmedIndices;
        public final /* synthetic */ ImageOptionsWidgetData $data;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ boolean $locked;
        public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;
        public final /* synthetic */ MutableState<List<Integer>> $pendingIndices$delegate;
        public final /* synthetic */ List<Integer> $picks;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;
        public final /* synthetic */ HatchWidget $widget;

        /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$MultiSelectImageOptions$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G2k<Integer, String, BRg, BFM, Integer, Unit> {
            public final /* synthetic */ boolean $atMax;
            public final /* synthetic */ List<Integer> $confirmedIndices;
            public final /* synthetic */ boolean $isPrimaryThread;
            public final /* synthetic */ boolean $locked;
            public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;
            public final /* synthetic */ MutableState<List<Integer>> $pendingIndices$delegate;
            public final /* synthetic */ List<Integer> $picks;
            public final /* synthetic */ Map<String, String> $threadLogMetadata;
            public final /* synthetic */ HatchWidget $widget;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(boolean z, List<Integer> list, List<Integer> list2, HatchWidget hatchWidget, boolean z2, boolean z3, Map<String, String> map, MutableState<List<Integer>> mutableState, G0U<? super ImageOptionPreviewRequest, Unit> g0u) {
                super(5);
                this.$locked = z;
                this.$confirmedIndices = list;
                this.$picks = list2;
                this.$widget = hatchWidget;
                this.$atMax = z2;
                this.$isPrimaryThread = z3;
                this.$threadLogMetadata = map;
                this.$pendingIndices$delegate = mutableState;
                this.$onPreview = g0u;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00ea A[PHI: r18
  0x00ea: PHI (r18v2 boolean) = (r18v0 boolean), (r18v0 boolean), (r18v3 boolean) binds: [B:21:0x0058, B:24:0x005e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(int r24, java.lang.String r25, X.BRg r26, X.BFM r27, int r28) {
                /*
                    Method dump skipped, instructions count: 249
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.C114742.AnonymousClass1.invoke(int, java.lang.String, X.BRg, X.BFM, int):void");
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, BRg bRg, BFM bfm, Integer num2) {
                invoke(AnonymousClass001.A0F(num), str, bRg, bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114742(ImageOptionsWidgetData imageOptionsWidgetData, boolean z, List<Integer> list, List<Integer> list2, HatchWidget hatchWidget, boolean z2, boolean z3, Map<String, String> map, MutableState<List<Integer>> mutableState, G0U<? super ImageOptionPreviewRequest, Unit> g0u) {
            super(2);
            this.$data = imageOptionsWidgetData;
            this.$locked = z;
            this.$confirmedIndices = list;
            this.$picks = list2;
            this.$widget = hatchWidget;
            this.$atMax = z2;
            this.$isPrimaryThread = z3;
            this.$threadLogMetadata = map;
            this.$pendingIndices$delegate = mutableState;
            this.$onPreview = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                HatchImageOptionsWidgetKt.ImageOptionsGrid(this.$data.images, null, B1V.A00(bfm, new AnonymousClass1(this.$locked, this.$confirmedIndices, this.$picks, this.$widget, this.$atMax, this.$isPrimaryThread, this.$threadLogMetadata, this.$pendingIndices$delegate, this.$onPreview), -615122145), bfm, 384, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$MultiSelectImageOptions$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ImageOptionsWidgetData $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<String, List<Integer>, Unit> $onConfirmSelection;
        public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchWidget hatchWidget, ImageOptionsWidgetData imageOptionsWidgetData, G0V<? super String, ? super List<Integer>, Unit> g0v, G0U<? super ImageOptionPreviewRequest, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$widget = hatchWidget;
            this.$data = imageOptionsWidgetData;
            this.$onConfirmSelection = g0v;
            this.$onPreview = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            HatchImageOptionsWidgetKt.MultiSelectImageOptions(this.$widget, this.$data, this.$onConfirmSelection, this.$onPreview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$SingleSelectImageOptions$2, reason: invalid class name and case insensitive filesystem */
    public final class C114752 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ImageOptionsWidgetData $data;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ boolean $locked;
        public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;
        public final /* synthetic */ MutableState<Integer> $pendingIndex$delegate;
        public final /* synthetic */ Integer $pick;
        public final /* synthetic */ String $selectedPath;
        public final /* synthetic */ Map<String, String> $threadLogMetadata;
        public final /* synthetic */ HatchWidget $widget;

        /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$SingleSelectImageOptions$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G2k<Integer, String, BRg, BFM, Integer, Unit> {
            public final /* synthetic */ boolean $isPrimaryThread;
            public final /* synthetic */ boolean $locked;
            public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;
            public final /* synthetic */ MutableState<Integer> $pendingIndex$delegate;
            public final /* synthetic */ Integer $pick;
            public final /* synthetic */ String $selectedPath;
            public final /* synthetic */ Map<String, String> $threadLogMetadata;
            public final /* synthetic */ HatchWidget $widget;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(boolean z, String str, Integer num, HatchWidget hatchWidget, boolean z2, Map<String, String> map, MutableState<Integer> mutableState, G0U<? super ImageOptionPreviewRequest, Unit> g0u) {
                super(5);
                this.$locked = z;
                this.$selectedPath = str;
                this.$pick = num;
                this.$widget = hatchWidget;
                this.$isPrimaryThread = z2;
                this.$threadLogMetadata = map;
                this.$pendingIndex$delegate = mutableState;
                this.$onPreview = g0u;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00de  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(int r21, java.lang.String r22, X.BRg r23, X.BFM r24, int r25) {
                /*
                    Method dump skipped, instructions count: 232
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.C114752.AnonymousClass1.invoke(int, java.lang.String, X.BRg, X.BFM, int):void");
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, BRg bRg, BFM bfm, Integer num2) {
                invoke(AnonymousClass001.A0F(num), str, bRg, bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114752(ImageOptionsWidgetData imageOptionsWidgetData, boolean z, String str, Integer num, HatchWidget hatchWidget, boolean z2, Map<String, String> map, MutableState<Integer> mutableState, G0U<? super ImageOptionPreviewRequest, Unit> g0u) {
            super(2);
            this.$data = imageOptionsWidgetData;
            this.$locked = z;
            this.$selectedPath = str;
            this.$pick = num;
            this.$widget = hatchWidget;
            this.$isPrimaryThread = z2;
            this.$threadLogMetadata = map;
            this.$pendingIndex$delegate = mutableState;
            this.$onPreview = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                HatchImageOptionsWidgetKt.ImageOptionsGrid(this.$data.images, null, B1V.A00(bfm, new AnonymousClass1(this.$locked, this.$selectedPath, this.$pick, this.$widget, this.$isPrimaryThread, this.$threadLogMetadata, this.$pendingIndex$delegate, this.$onPreview), -534455424), bfm, 384, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$SingleSelectImageOptions$3, reason: invalid class name and case insensitive filesystem */
    public final class C114763 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ImageOptionsWidgetData $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ImageOptionPreviewRequest, Unit> $onPreview;
        public final /* synthetic */ G0W<String, String, String, Unit> $onSendSelectionText;
        public final /* synthetic */ G0U<String, Unit> $onSetSelectedPath;
        public final /* synthetic */ HatchWidget $widget;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114763(HatchWidget hatchWidget, ImageOptionsWidgetData imageOptionsWidgetData, G0W<? super String, ? super String, ? super String, Unit> g0w, G0U<? super String, Unit> g0u, G0U<? super ImageOptionPreviewRequest, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$widget = hatchWidget;
            this.$data = imageOptionsWidgetData;
            this.$onSendSelectionText = g0w;
            this.$onSetSelectedPath = g0u;
            this.$onPreview = g0u2;
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
            HatchImageOptionsWidgetKt.SingleSelectImageOptions(this.$widget, this.$data, this.$onSendSelectionText, this.$onSetSelectedPath, this.$onPreview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: HatchImageOptionsWidget-gF0flNs, reason: not valid java name */
    public static final void m618HatchImageOptionsWidgetgF0flNs(HatchWidget hatchWidget, ImageOptionsWidgetData imageOptionsWidgetData, String str, long j, C1D3 c1d3, BRg bRg, G0W<? super String, ? super String, ? super String, Unit> g0w, G0U<? super String, Unit> g0u, G0V<? super String, ? super List<Integer>, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(hatchWidget, imageOptionsWidgetData, str);
        C7384Etj.A0Y(c1d3, 4);
        AnonymousClass005.A13(g0w, g0u, g0v, 6);
        bfm.AgG(1087456065);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(imageOptionsWidgetData, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, c1d3);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if ((i & 1572864) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0w);
        }
        if ((i & 12582912) == 0) {
            iA05 |= AnonymousClass004.A0a(bfm, g0u);
        }
        if ((i & 100663296) == 0) {
            iA05 |= AnonymousClass004.A0b(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(C1b8.A03(HatchMessageBubbleKt.m636bubbleMaxWidthrAjV9yQ(BRg.A00, 0.0f, bfm, 6, zA1Z ? 1 : 0).then(bRg2), c1d3, j), BubbleInset);
            boolean zA65 = bfm.A65(hatchWidget.widgetId);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA652 = bfm.A65(mutableState);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchImageOptionsWidgetKt$HatchImageOptionsWidget$onPreview$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            G0U g0u2 = (G0U) objAaT2;
            if (imageOptionsWidgetData.multiSelect && HatchUtil.INSTANCE.isImageOptionsMultiSelectEnabled()) {
                bfm.AgE(-533548075);
                MultiSelectImageOptions(hatchWidget, imageOptionsWidgetData, g0v, g0u2, bRgA09, bfm, HatchWidget.$stable | (iA05 & 14) | (ImageOptionsWidgetData.$stable << 3) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 18) & 896), 0);
            } else {
                bfm.AgE(-533338205);
                SingleSelectImageOptions(hatchWidget, imageOptionsWidgetData, g0w, g0u, g0u2, bRgA09, bfm, AnonymousClass002.A08(iA05 >> 12, HatchWidget.$stable | (iA05 & 14) | (ImageOptionsWidgetData.$stable << 3) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 0);
            }
            AnonymousClass001.A1D(bfm);
            ImageOptionPreviewRequest imageOptionPreviewRequest = (ImageOptionPreviewRequest) mutableState.getValue();
            List<String> list = imageOptionsWidgetData.images;
            String str2 = hatchWidget.widgetId;
            boolean zA653 = bfm.A65(mutableState);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchImageOptionsWidgetKt$HatchImageOptionsWidget$1$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            HatchImageOptionPreviewKt.m609HatchImageOptionPreviewT042LqI(imageOptionPreviewRequest, list, j, str2, str, (Function0) objAaT3, bfm, ImageOptionPreviewRequest.$stable | ((iA05 >> 3) & 896) | (57344 & (iA05 << 6)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchImageOptionsWidgetKt$HatchImageOptionsWidget$2(hatchWidget, imageOptionsWidgetData, str, j, c1d3, bRg2, g0w, g0u, g0v, i, i2);
        }
    }

    public static final void ImageOptionImage(String str, String str2, BRg bRg, G0V<? super Integer, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        G0V<? super Integer, ? super Integer, Unit> g0v2 = g0v;
        BRg bRg2 = bRg;
        bfm.AgG(-646504869);
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
            iA0d |= AnonymousClass004.A0W(bfm, g0v2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            String strBuildAuthenticatedImageUrl = HatchFileOperations.INSTANCE.buildAuthenticatedImageUrl(str, AnonymousClass002.A0h(bfm), HatchThumbnailDisplaySize.MEDIUM);
            if (strBuildAuthenticatedImageUrl != null) {
                bfm.AgE(-1392762183);
                AuraImageKt.m2573AuraImageXRP3Ue8(strBuildAuthenticatedImageUrl, bRg2, B18.A00, str2, null, false, null, 0L, true, false, false, null, null, null, g0v2, bfm, ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 100663680 | ((iA0d << 6) & 7168), (iA0d << 3) & 57344, 16112);
            } else {
                bfm.AgE(-1392512850);
                C3Ue.A04(C06G.A0N(bfm, bRg2), bfm, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, str2, bRg2, g0v2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /* renamed from: ImageOptionTile-P-Zy0YI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m619ImageOptionTilePZy0YI(java.lang.String r44, int r45, java.lang.String r46, boolean r47, boolean r48, boolean r49, int r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.G0W<? super X.AaC, ? super java.lang.Float, ? super java.lang.Float, kotlin.Unit> r52, X.BRg r53, boolean r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.m619ImageOptionTilePZy0YI(java.lang.String, int, java.lang.String, boolean, boolean, boolean, int, kotlin.jvm.functions.Function0, X.G0W, X.BRg, boolean, X.BFM, int, int, int):void");
    }

    public static final void ImageOptionsConfirmButton(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2105614160);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0L = C06G.A0L(bfm, akh);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            long j = AnonymousClass001.A0f(bfm, akh).secondaryButtonBackground;
            long jA04 = HxS.A04(HDi.A0O[(int) (jA0L & 63)], B6A.A03(jA0L), B6A.A02(jA0L), B6A.A01(jA0L), 0.3f);
            List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
            AuraButtonCorner auraButtonCorner = AuraButtonCorner.PILL;
            long j2 = B6A.A07;
            LabelButtonStyle labelButtonStyleM2416toLabelButtonStyle31qCuKU = auraButtonStyles.m2416toLabelButtonStyle31qCuKU(j, jA0L, auraButtonCorner, list, null, false, j2, j2, j2, jA0L, jA04, 0.0f, null);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            boolean zA1X = AnonymousClass002.A1X(function0);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1O = AnonymousClass001.A1O(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchImageOptionsWidgetKt$ImageOptionsConfirmButton$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0R, labelButtonStyleM2416toLabelButtonStyle31qCuKU, auraButtonSize, null, false, false, zA1X, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608, 0, 0, 134200773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, bRg2, i, i2);
        }
    }

    public static final void ImageOptionsGrid(List<String> list, BRg bRg, G2k<? super Integer, ? super String, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(418175481);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g2k);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f = TileSpacing;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(f), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                bfm.AgE(918288597);
                Iterator it = AbstractC0878AGe.A0N(list, 2).iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        List list2 = (List) next;
                        BS0 bs0 = BRg.A00;
                        C1062ATq c1062ATq = C10G.A02;
                        InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f, 6);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA012 = AxM.A01(bfm, c1062ATq);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
                        BPg.A02(bfm, akqA042, g0v2);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA012, g0vA0u);
                        C90m c90m = C90m.A00;
                        Iterator itA0w = AnonymousClass001.A0w(bfm, list2, -395779308);
                        int i7 = 0;
                        while (itA0w.hasNext()) {
                            Object next2 = itA0w.next();
                            int i8 = i7 + 1;
                            if (i7 >= 0) {
                                g2k.invoke(Integer.valueOf((i5 * 2) + i7), next2, AnonymousClass006.A0L(c90m, bs0), bfm, Integer.valueOf((iA05 << 3) & 7168));
                                i7 = i8;
                            }
                        }
                        BBI.A0R(bbi, false);
                        int size = 2 - list2.size();
                        bfm.AgE(-395767319);
                        for (int i9 = 0; i9 < size; i9++) {
                            C01N.A07(bfm, AnonymousClass006.A0L(c90m, bs0));
                        }
                        AnonymousClass003.A0q(bbi);
                        i5 = i6;
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
            bBbAAc.A06 = new C114732(list, bRg2, g2k, i, i2);
        }
    }

    public static final void MultiSelectImageOptions(HatchWidget hatchWidget, ImageOptionsWidgetData imageOptionsWidgetData, G0V<? super String, ? super List<Integer>, Unit> g0v, G0U<? super ImageOptionPreviewRequest, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        Function0 function0;
        BRg bRg2 = bRg;
        bfm.AgG(-1169063298);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchWidget, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(imageOptionsWidgetData, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            List<Integer> listImageOptionsSelectedIndices = HatchWidgetPresentationKt.imageOptionsSelectedIndices(hatchWidget.state, imageOptionsWidgetData.images.size());
            boolean z = !listImageOptionsSelectedIndices.isEmpty();
            Object[] objArr = {hatchWidget.widgetId};
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchImageOptionsWidgetKt$MultiSelectImageOptions$pendingIndices$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT, objArr);
            List list = (List) mutableStateA0K.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                int iA0F = AnonymousClass001.A0F(obj2);
                if (iA0F >= 0 && iA0F < imageOptionsWidgetData.images.size()) {
                    arrayList.add(obj2);
                }
            }
            boolean z2 = arrayList.size() >= 4;
            boolean zA1G = AnonymousClass003.A1G(bfm, LocalIsPrimaryThreadKt.LocalIsPrimaryThread);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            String strMultiSelectionMessage = multiSelectionMessage(arrayList, bfm, 0);
            String strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100026, new Object[]{Integer.valueOf(arrayList.size())}, bfm, arrayList.size());
            if (arrayList.isEmpty()) {
                AnonymousClass003.A0l(bfm, 326325542);
                function0 = null;
            } else {
                bfm.AgE(326148563);
                boolean zA1X = AnonymousClass005.A1X(bfm, strMultiSelectionMessage, arrayList, AnonymousClass003.A1Q(bfm, mapCurrentChatThreadLogMetadata, zA1G), AnonymousClass006.A1W(iA05));
                Object objAaT2 = bfm.AaT();
                if (zA1X || objAaT2 == obj) {
                    objAaT2 = new HatchImageOptionsWidgetKt$MultiSelectImageOptions$1$1(zA1G, mapCurrentChatThreadLogMetadata, g0v, strMultiSelectionMessage, arrayList);
                    bfm.Ai0(objAaT2);
                }
                function0 = (Function0) objAaT2;
                AnonymousClass001.A1D(bfm);
            }
            ImageOptionsConfirmLayout(z, strA00, function0, bRg2, B1V.A00(bfm, new C114742(imageOptionsWidgetData, z, listImageOptionsSelectedIndices, arrayList, hatchWidget, z2, zA1G, mapCurrentChatThreadLogMetadata, mutableStateA0K, g0u), -603799514), bfm, ((iA05 >> 3) & 7168) | RuntimeInternals.IOPRIO_BACKGROUND, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchWidget, imageOptionsWidgetData, g0v, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SingleSelectImageOptions(com.facebook.aura.model.HatchWidget r30, com.facebook.aura.model.ImageOptionsWidgetData r31, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r32, X.G0U<? super java.lang.String, kotlin.Unit> r33, X.G0U<? super com.facebook.aura.conversation.view.ImageOptionPreviewRequest, kotlin.Unit> r34, X.BRg r35, X.BFM r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.SingleSelectImageOptions(com.facebook.aura.model.HatchWidget, com.facebook.aura.model.ImageOptionsWidgetData, X.G0W, X.G0U, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final float getTileCornerRadius() {
        return TileCornerRadius;
    }

    public static final void logImageOptionTileClick(boolean z, Map<String, String> map, int i) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.IMAGE_OPTION_TILE, null, AnonymousClass006.A11(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), map), null);
    }

    public static final void logImageOptionsConfirmClick(boolean z, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchInteractionEnumsKt.chatScreen(z), HatchComponent.IMAGE_OPTIONS_CONFIRM_BUTTON, null, map, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String multiSelectionMessage(java.util.List<java.lang.Integer> r6, X.BFM r7, int r8) {
        /*
            X.AKH<android.content.res.Configuration> r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A00
            java.lang.Object r0 = r7.A6v(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            android.os.LocaleList r1 = r0.getLocales()
            r0 = 0
            java.util.Locale r5 = r1.get(r0)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L1e
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L23
        L1e:
            r1 = r8 & 6
            r0 = 0
            if (r1 != r2) goto L24
        L23:
            r0 = 1
        L24:
            boolean r0 = X.AnonymousClass001.A1R(r7, r5, r0)
            java.lang.Object r3 = r7.AaT()
            if (r0 != 0) goto L32
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L69
        L32:
            android.icu.text.NumberFormat r4 = android.icu.text.NumberFormat.getIntegerInstance(r5)
            android.icu.text.ListFormatter r3 = android.icu.text.ListFormatter.getInstance(r5)
            java.util.List r0 = X.AbstractC0878AGe.A0W(r6)
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r1.next()
            int r0 = X.AnonymousClass001.A0F(r0)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.format(r0)
            r2.add(r0)
            goto L46
        L62:
            java.lang.String r3 = r3.format(r2)
            r7.Ai0(r3)
        L69:
            r2 = 2131755045(0x7f100025, float:1.9140958E38)
            int r1 = r6.size()
            X.C7384Etj.A0X(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.lang.String r0 = X.AbstractC2271BQs.A00(r2, r0, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.multiSelectionMessage(java.util.List, X.BFM, int):java.lang.String");
    }

    public static final void ImageOptionsConfirmLayout(boolean z, String str, Function0<Unit> function0, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(1283236285);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AnonymousClass003.A13(bfm, g0v, iA0n >> 12);
            if (z) {
                bfm.AgE(1029790971);
            } else {
                bfm.AgE(1029714091);
                ImageOptionsConfirmButton(str, function0, null, bfm, (iA0n >> 3) & 126, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114722(z, str, function0, bRg, g0v, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* renamed from: imageOptionTileGestures-07aZr4s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m621imageOptionTileGestures07aZr4s(X.BRg r13, com.facebook.aura.conversation.view.ImageOptionTileAnchor r14, boolean r15, int r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, X.G0V<? super X.AaC, ? super java.lang.Float, kotlin.Unit> r18, X.BFM r19, int r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.m621imageOptionTileGestures07aZr4s(X.BRg, com.facebook.aura.conversation.view.ImageOptionTileAnchor, boolean, int, kotlin.jvm.functions.Function0, X.G0V, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* renamed from: longPressOnly-ggzbRbM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m622longPressOnlyggzbRbM(X.BRg r5, int r6, java.lang.String r7, kotlin.jvm.functions.Function0<kotlin.Unit> r8, X.BFM r9, int r10) {
        /*
            X.0dx r2 = X.AnonymousClass002.A0T(r9)
            androidx.compose.runtime.MutableState r4 = X.C1er.A00(r9, r8)
            boolean r1 = X.AnonymousClass003.A1N(r9, r2, r4)
            java.lang.Object r0 = r9.AaT()
            if (r1 != 0) goto L16
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L1e
        L16:
            com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$longPressOnly$1$1 r0 = new com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$longPressOnly$1$1
            r0.<init>()
            r9.Ai0(r0)
        L1e:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r0 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r0
            X.BRg r3 = X.AaM.A00(r5, r0, r2)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L32
            boolean r0 = r9.A63(r6)
            if (r0 != 0) goto L37
        L32:
            r0 = r10 & 48
            r5 = 0
            if (r0 != r1) goto L38
        L37:
            r5 = 1
        L38:
            r0 = r10 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L46
            boolean r0 = r9.A65(r7)
            if (r0 != 0) goto L4b
        L46:
            r1 = r10 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L4c
        L4b:
            r0 = 1
        L4c:
            boolean r0 = X.AnonymousClass002.A1W(r9, r4, r0, r5)
            java.lang.Object r1 = r9.AaT()
            if (r0 != 0) goto L5a
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L62
        L5a:
            com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$longPressOnly$2$1 r1 = new com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt$longPressOnly$2$1
            r1.<init>(r6, r7, r4)
            r9.Ai0(r1)
        L62:
            X.G0U r1 = (X.G0U) r1
            r0 = 0
            X.BRg r0 = X.ARD.A01(r3, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchImageOptionsWidgetKt.m622longPressOnlyggzbRbM(X.BRg, int, java.lang.String, kotlin.jvm.functions.Function0, X.BFM, int):X.BRg");
    }
}
