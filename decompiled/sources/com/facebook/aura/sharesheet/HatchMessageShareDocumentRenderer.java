package com.facebook.aura.sharesheet;

import X.AGH;
import X.AHD;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BNt;
import X.C06H;
import X.C0968AJv;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.C8j5;
import X.F60;
import X.FGI;
import X.G0U;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorOrderCheckoutRowsKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.markdown.parser.ast.AuraBlock;
import com.facebook.aura.markdown.parser.ast.AuraInline;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.ast.ListItem;
import com.facebook.aura.markdown.parser.ast.TableCell;
import com.facebook.aura.markdown.parser.custom.extensions.AuraCustomInlineNames;
import com.facebook.aura.markdown.parser.custom.extensions.CitationPayload;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkKind;
import com.facebook.aura.markdown.parser.custom.extensions.FileLinkPayload;
import com.facebook.aura.markdown.parser.custom.extensions.ImageGroupPayload;
import com.facebook.aura.markdown.parser.custom.extensions.InlineMathPayload;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMessageShareDocumentRenderer {
    public static final int $stable = 8;
    public static final float ADAPTIVE_TEXT_SCALE_STEPS_PER_UNIT = 20.0f;
    public static final int APP_ICON_BOTTOM_GAP_PX = 56;
    public static final int APP_ICON_SIZE_PX = 77;
    public static final int ATTRIBUTION_AREA_HEIGHT_PX = 96;
    public static final float ATTRIBUTION_TEXT_SIZE_PX = 38.0f;
    public static final int BACKDROP_INSET_PX = 64;
    public static final float BODY_TEXT_SIZE_PX = 46.0f;
    public static final int BOTTOM_PADDING_PX = 52;
    public static final float CARD_CORNER_RADIUS_PX = 24.0f;
    public static final int CHIP_HEIGHT_PX = 112;
    public static final int CHIP_HORIZONTAL_PADDING_PX = 28;
    public static final float CHIP_TEXT_SIZE_PX = 36.0f;
    public static final int CODE_LANGUAGE_HEIGHT_PX = 42;
    public static final float CODE_LANGUAGE_TEXT_SIZE_PX = 24.0f;
    public static final int CODE_MAX_LINES = 12;
    public static final int CODE_PADDING_PX = 28;
    public static final float CODE_TEXT_SIZE_PX = 34.0f;
    public static final int CONTENT_TOP_PX = 197;
    public static final int CONTENT_WIDTH_PX = 1072;
    public static final int ELEMENT_SPACING_PX = 30;
    public static final int HORIZONTAL_PADDING_PX = 64;
    public static final int IMAGE_WIDTH_PX = 1200;
    public static final int MAX_ADAPTIVE_TEXT_SCALE_STEPS = 60;
    public static final int MAX_CONTENT_BOTTOM_PX = 1700;
    public static final int MAX_IMAGE_HEIGHT_PX = 1920;
    public static final int MAX_MEDIA_ITEMS = 4;
    public static final int MEDIA_GRID_GAP_PX = 16;
    public static final int MIN_ADAPTIVE_TEXT_SCALE_STEPS = 20;
    public static final int MIN_CONTENT_HEIGHT_PX = 310;
    public static final int MIN_IMAGE_HEIGHT_PX = 630;
    public static final int RULE_HEIGHT_PX = 24;
    public static final float SHADOW_OFFSET_Y_PX = 8.0f;
    public static final float SHADOW_RADIUS_PX = 32.0f;
    public static final float SHARE_CARD_CORNER_RADIUS_PX = 64.0f;
    public static final int SINGLE_MEDIA_WIDTH_PX = 840;
    public static final int TABLE_CELL_MAX_LINES = 4;
    public static final int TABLE_CELL_PADDING_PX = 16;
    public static final int TABLE_MIN_ROW_HEIGHT_PX = 62;
    public static final float TABLE_TEXT_SIZE_PX = 30.0f;
    public static final int TOP_PADDING_PX = 64;
    public final HatchMessageShareImageColors colors;
    public final Context context;
    public final AuraMarkdownDocument document;
    public final Typeface emphasizedMessageTypeface;
    public final Map<String, Bitmap> images;
    public final Typeface messageTypeface;
    public static final Companion Companion = new Companion();
    public static final int GRAY_BACKDROP_COLOR = Color.rgb(245, 245, 245);
    public static final int CARD_SHADOW_COLOR = Color.argb(26, 0, 0, 0);
    public static final Map<Character, Character> SUPERSCRIPT_DIGITS = AGH.A0D(C8j4.A16('0', '\u2070'), C8j4.A16('1', '\u00b9'), C8j4.A16('2', '\u00b2'), C8j4.A16('3', '\u00b3'), C8j4.A16('4', '\u2074'), C8j4.A16('5', '\u2075'), C8j4.A16('6', '\u2076'), C8j4.A16('7', '\u2077'), C8j4.A16('8', '\u2078'), C8j4.A16('9', '\u2079'));

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer$toPlainText$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraBlock, CharSequence> {
        @Override // X.G0U
        public final CharSequence invoke(AuraBlock auraBlock) {
            C7384Etj.A0Y(auraBlock, 0);
            return HatchMessageShareDocumentRenderer.this.toPlainText(auraBlock);
        }

        public AnonymousClass1() {
            super(1);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer$toPlainText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<ListItem, CharSequence> {
        @Override // X.G0U
        public final CharSequence invoke(ListItem listItem) {
            C7384Etj.A0Y(listItem, 0);
            return AnonymousClass007.A0a("\u2022 ", HatchMessageShareDocumentRenderer.this.toPlainText(listItem.children));
        }

        public AnonymousClass2() {
            super(1);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer$toPlainText$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<AHD<? extends TableCell>, CharSequence> {

        /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer$toPlainText$4$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<TableCell, CharSequence> {
            public final /* synthetic */ HatchMessageShareDocumentRenderer this$0;

            @Override // X.G0U
            public final CharSequence invoke(TableCell tableCell) {
                C7384Etj.A0Y(tableCell, 0);
                return HatchMessageShareDocumentRenderer.access$toStyledText(this.this$0, tableCell);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchMessageShareDocumentRenderer hatchMessageShareDocumentRenderer) {
                super(1);
                this.this$0 = hatchMessageShareDocumentRenderer;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(AHD<TableCell> ahd) {
            C7384Etj.A0Y(ahd, 0);
            return AbstractC06907md.A01(ConnectorOrderCheckoutRowsKt.DETAIL_SEPARATOR, ahd, new AnonymousClass1(HatchMessageShareDocumentRenderer.this));
        }

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(AHD<? extends TableCell> ahd) {
            return invoke2((AHD<TableCell>) ahd);
        }
    }

    public HatchMessageShareDocumentRenderer(Context context, AuraMarkdownDocument auraMarkdownDocument, Map<String, Bitmap> map, HatchMessageShareImageColors hatchMessageShareImageColors) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(auraMarkdownDocument, map, hatchMessageShareImageColors, 1);
        this.context = context;
        this.document = auraMarkdownDocument;
        this.images = map;
        this.colors = hatchMessageShareImageColors;
        Typeface typefaceA0J = C8j5.A0J(context);
        this.messageTypeface = typefaceA0J;
        this.emphasizedMessageTypeface = Typeface.create(typefaceA0J, 1);
    }

    private final void drawAttribution(Canvas canvas, int i) {
        SpannableString spannableString = new SpannableString(this.context.getString(R.string._name_removed__res_0x7f1205df, HatchAppName.value));
        int i2 = this.colors.attribution;
        Typeface typeface = Typeface.DEFAULT;
        C7384Etj.A0V(typeface);
        StaticLayout staticLayoutTextLayout = textLayout(spannableString, CONTENT_WIDTH_PX, 38.0f, i2, typeface, 1, Layout.Alignment.ALIGN_NORMAL);
        canvas.save();
        C8j4.A1G(canvas, staticLayoutTextLayout, 64.0f, (i - 52) - staticLayoutTextLayout.getHeight());
    }

    private final void drawChip(ChipElement chipElement, Canvas canvas, int i, int i2, int i3) {
        RectF rectF = new RectF(i, i2, i + i3, i2 + CHIP_HEIGHT_PX);
        Paint paint = new Paint();
        paint.setColor(this.colors.chipBackground);
        canvas.drawRoundRect(rectF, 24.0f, 24.0f, paint);
        int i4 = this.colors.primaryText;
        Typeface typeface = Typeface.DEFAULT;
        C7384Etj.A0V(typeface);
        StaticLayout staticLayoutTextLayout = textLayout(chipElement.label, i3 - 56, 36.0f, i4, typeface, 2, Layout.Alignment.ALIGN_NORMAL);
        canvas.save();
        C8j4.A1G(canvas, staticLayoutTextLayout, i + 28, i2 + ((112 - staticLayoutTextLayout.getHeight()) / 2));
    }

    private final void drawCode(CodeElement codeElement, Canvas canvas, int i, int i2, int i3) {
        RectF rectF = new RectF(i, i2, i + i3, measure(codeElement, i3) + i2);
        Paint paint = new Paint();
        paint.setColor(this.colors.codeBackground);
        canvas.drawRoundRect(rectF, 24.0f, 24.0f, paint);
        int i4 = i2 + 28;
        if (!C7BY.A0j(codeElement.language)) {
            Paint paint2 = new Paint(1);
            paint2.setColor(this.colors.secondaryText);
            paint2.setTextSize(24.0f);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            C7384Etj.A0V(typeface);
            paint2.setTypeface(resolveMessageTypeface(typeface));
            canvas.drawText(codeElement.language.toUpperCase(Locale.ROOT), i + 28, i4 + 24.0f, paint2);
            i4 = i2 + 70;
        }
        canvas.save();
        canvas.translate(i + 28, i4);
        Typeface typeface2 = Typeface.MONOSPACE;
        C7384Etj.A0V(typeface2);
        textLayout(codeElement.code, i3 - 56, 34.0f, this.colors.primaryText, typeface2, 12, Layout.Alignment.ALIGN_NORMAL).draw(canvas);
        canvas.restore();
    }

    private final void drawMedia(MediaElement mediaElement, Canvas canvas, int i, int i2, int i3) {
        List listA0a = AbstractC0878AGe.A0a(mediaElement.urls, 4);
        int size = listA0a.size();
        if (size < 1) {
            size = 1;
        }
        int iMediaColumnCount = mediaColumnCount(size);
        int i4 = (i3 - ((iMediaColumnCount - 1) * 16)) / iMediaColumnCount;
        if (listA0a.isEmpty()) {
            listA0a = Collections.singletonList(null);
        }
        int i5 = 0;
        for (Object obj : listA0a) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            String str = (String) obj;
            int i7 = i4 + 16;
            int i8 = ((i5 % iMediaColumnCount) * i7) + i;
            int i9 = i2 + ((i5 / iMediaColumnCount) * i7);
            String str2 = (String) AbstractC0878AGe.A0A(i5, mediaElement.labels);
            if (str2 == null) {
                str2 = "";
            }
            drawMediaCell(canvas, i8, i9, i4, i4, str, str2, mediaElement.isVideo);
            i5 = i6;
        }
    }

    private final void drawMediaCell(Canvas canvas, int i, int i2, int i3, int i4, String str, String str2, boolean z) {
        Bitmap bitmap;
        String string = str2;
        float f = i;
        float f2 = i2;
        RectF rectF = new RectF(f, f2, i + i3, i2 + i4);
        Path path = new Path();
        path.addRoundRect(rectF, 24.0f, 24.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Paint paint = new Paint();
        paint.setColor(this.colors.mediaPlaceholder);
        canvas.drawRect(rectF, paint);
        if (str == null || (bitmap = this.images.get(str)) == null) {
            if (C7BY.A0j(string)) {
                Context context = this.context;
                int i5 = R.string._name_removed__res_0x7f1205e1;
                if (z) {
                    i5 = R.string._name_removed__res_0x7f1205e5;
                }
                string = context.getString(i5);
            }
            int i6 = this.colors.secondaryText;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            Typeface typeface = Typeface.DEFAULT;
            C7384Etj.A0V(typeface);
            StaticLayout staticLayoutTextLayout = textLayout(string, i3 - 48, 34.0f, i6, typeface, 2, alignment);
            canvas.save();
            C8j4.A1G(canvas, staticLayoutTextLayout, i + 24, ((i4 - staticLayoutTextLayout.getHeight()) / 2) + i2);
        } else {
            canvas.drawBitmap(bitmap, centerCropRect(bitmap, i3 / i4), rectF, new Paint(3));
        }
        if (z) {
            float f3 = f + (i3 / 2.0f);
            float f4 = f2 + (i4 / 2.0f);
            Paint paint2 = new Paint(1);
            paint2.setColor(-855638017);
            canvas.drawCircle(f3, f4, 42.0f, paint2);
            Path path2 = new Path();
            float f5 = f3 - 10.0f;
            path2.moveTo(f5, f4 - 20.0f);
            path2.lineTo(f3 + 24.0f, f4);
            path2.lineTo(f5, f4 + 20.0f);
            path2.close();
            Paint paint3 = new Paint(1);
            paint3.setColor(-16777216);
            canvas.drawPath(path2, paint3);
        }
        canvas.restore();
    }

    private final int mediaColumnCount(int i) {
        if (i <= 1) {
            return 1;
        }
        if (i > 3) {
            return 2;
        }
        return i;
    }

    public final class Companion {
        public final List<String> imageUrls(AuraMarkdownDocument auraMarkdownDocument) {
            C7384Etj.A0Y(auraMarkdownDocument, 0);
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            imageUrls$collectBlocks(linkedHashSetA0k, auraMarkdownDocument.blocks);
            return AbstractC0878AGe.A0a(linkedHashSetA0k, 4);
        }

        public final Bitmap renderOnBackdrop(Bitmap bitmap) {
            C7384Etj.A0Y(bitmap, 0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth() + 128, bitmap.getHeight() + 128, Bitmap.Config.ARGB_8888);
            Canvas canvasA0R = C8j4.A0R(bitmapCreateBitmap);
            int i = HatchMessageShareDocumentRenderer.GRAY_BACKDROP_COLOR;
            canvasA0R.drawColor(i);
            RectF rectF = new RectF(64.0f, 64.0f, bitmap.getWidth() + 64.0f, bitmap.getHeight() + 64.0f);
            Paint paint = new Paint(1);
            paint.setColor(i);
            paint.setShadowLayer(32.0f, 0.0f, 8.0f, HatchMessageShareDocumentRenderer.CARD_SHADOW_COLOR);
            canvasA0R.drawRoundRect(rectF, 64.0f, 64.0f, paint);
            Paint paint2 = new Paint(1);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setTranslate(64.0f, 64.0f);
            bitmapShader.setLocalMatrix(matrix);
            paint2.setShader(bitmapShader);
            canvasA0R.drawRoundRect(rectF, 64.0f, 64.0f, paint2);
            return bitmapCreateBitmap;
        }

        public final Bitmap renderOnColor(Bitmap bitmap, int i) {
            C7384Etj.A0Y(bitmap, 0);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvasA0R = C8j4.A0R(bitmapCreateBitmap);
            canvasA0R.drawColor(i);
            canvasA0R.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            return bitmapCreateBitmap;
        }

        public static final void imageUrls$collectBlocks(LinkedHashSet<String> linkedHashSet, List<? extends AuraBlock> list) {
            AHD<AuraInline> ahd;
            Iterator<? extends AuraBlock> it = list.iterator();
            while (it.hasNext()) {
                AuraBlock auraBlockA0i = C8j4.A0i(it);
                if (auraBlockA0i instanceof AuraBlock.Paragraph) {
                    ahd = ((AuraBlock.Paragraph) auraBlockA0i).inlines;
                } else if (auraBlockA0i instanceof AuraBlock.Heading) {
                    ahd = ((AuraBlock.Heading) auraBlockA0i).inlines;
                } else if (auraBlockA0i instanceof AuraBlock.BlockQuote) {
                    imageUrls$collectBlocks(linkedHashSet, ((AuraBlock.BlockQuote) auraBlockA0i).children);
                } else if (auraBlockA0i instanceof AuraBlock.UnorderedList) {
                    Iterator it2 = ((AuraBlock.UnorderedList) auraBlockA0i).items.iterator();
                    while (it2.hasNext()) {
                        imageUrls$collectBlocks(linkedHashSet, C8j4.A1E(it2));
                    }
                } else if (auraBlockA0i instanceof AuraBlock.OrderedList) {
                    Iterator it3 = ((AuraBlock.OrderedList) auraBlockA0i).items.iterator();
                    while (it3.hasNext()) {
                        imageUrls$collectBlocks(linkedHashSet, C8j4.A1E(it3));
                    }
                } else if (auraBlockA0i instanceof AuraBlock.Table) {
                    AuraBlock.Table table = (AuraBlock.Table) auraBlockA0i;
                    Iterator it4 = table.header.iterator();
                    while (it4.hasNext()) {
                        imageUrls$collectBlocks(linkedHashSet, C8j4.A1F(it4));
                    }
                    Iterator it5 = table.rows.iterator();
                    while (it5.hasNext()) {
                        Iterator itA11 = C8j4.A11(it5);
                        while (itA11.hasNext()) {
                            imageUrls$collectBlocks(linkedHashSet, C8j4.A1F(itA11));
                        }
                    }
                } else if (auraBlockA0i instanceof AuraBlock.Custom) {
                    Object obj = ((AuraBlock.Custom) auraBlockA0i).payload;
                    if (obj instanceof ImageGroupPayload) {
                        Iterator<AuraInline.Image> it6 = ((ImageGroupPayload) obj).images.iterator();
                        while (it6.hasNext()) {
                            linkedHashSet.add(it6.next().url);
                        }
                    } else if (obj instanceof FileLinkPayload) {
                        FileLinkPayload fileLinkPayload = (FileLinkPayload) obj;
                        if (fileLinkPayload.kind == FileLinkKind.VIDEO) {
                            linkedHashSet.add(fileLinkPayload.url);
                        }
                    }
                }
                imageUrls$collectInlines(linkedHashSet, ahd);
            }
        }

        public static final void imageUrls$collectInlines(LinkedHashSet<String> linkedHashSet, List<? extends AuraInline> list) {
            AHD<AuraInline> ahd;
            Iterator<? extends AuraInline> it = list.iterator();
            while (it.hasNext()) {
                AuraInline auraInlineA0j = C8j4.A0j(it);
                if (auraInlineA0j instanceof AuraInline.Image) {
                    linkedHashSet.add(((AuraInline.Image) auraInlineA0j).url);
                } else {
                    if (auraInlineA0j instanceof AuraInline.Emphasis) {
                        ahd = ((AuraInline.Emphasis) auraInlineA0j).children;
                    } else if (auraInlineA0j instanceof AuraInline.Strong) {
                        ahd = ((AuraInline.Strong) auraInlineA0j).children;
                    } else if (auraInlineA0j instanceof AuraInline.Strikethrough) {
                        ahd = ((AuraInline.Strikethrough) auraInlineA0j).children;
                    } else if (auraInlineA0j instanceof AuraInline.Link) {
                        ahd = ((AuraInline.Link) auraInlineA0j).children;
                    }
                    imageUrls$collectInlines(linkedHashSet, ahd);
                }
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ CharSequence access$toStyledText(HatchMessageShareDocumentRenderer hatchMessageShareDocumentRenderer, TableCell tableCell) {
        return hatchMessageShareDocumentRenderer.toPlainText(tableCell.children);
    }

    private final void appendCustomInline(AuraInline.Custom custom, SpannableStringBuilder spannableStringBuilder) {
        CitationPayload citationPayload;
        String superscript;
        InlineMathPayload inlineMathPayload;
        String str = custom.name;
        if (AuraCustomInlineNames.MATH.equals(str)) {
            Object obj = custom.payload;
            if (!(obj instanceof InlineMathPayload) || (inlineMathPayload = (InlineMathPayload) obj) == null) {
                return;
            }
            TypefaceSpan typefaceSpan = new TypefaceSpan("monospace");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) inlineMathPayload.expression);
            if (spannableStringBuilder.length() > length) {
                spannableStringBuilder.setSpan(typefaceSpan, length, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (AuraCustomInlineNames.CITATION.equals(str)) {
            Object obj2 = custom.payload;
            if (!(obj2 instanceof CitationPayload) || (citationPayload = (CitationPayload) obj2) == null) {
                return;
            }
            int length2 = spannableStringBuilder.length();
            Integer num = citationPayload.displayNumber;
            if (num == null || (superscript = toSuperscript(num.intValue())) == null) {
                superscript = citationPayload.id;
            }
            spannableStringBuilder.append((CharSequence) superscript);
            spannableStringBuilder.setSpan(new SuperscriptSpan(), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.7f), length2, spannableStringBuilder.length(), 33);
        }
    }

    private final void appendTo(AuraInline auraInline, SpannableStringBuilder spannableStringBuilder) {
        char c;
        Object foregroundColorSpan;
        int length;
        if (auraInline instanceof AuraInline.Text) {
            spannableStringBuilder.append((CharSequence) ((AuraInline.Text) auraInline).text);
            return;
        }
        if (auraInline instanceof AuraInline.Emphasis) {
            foregroundColorSpan = new StyleSpan(2);
            length = spannableStringBuilder.length();
            Iterator it = ((AuraInline.Emphasis) auraInline).children.iterator();
            while (it.hasNext()) {
                appendTo(C8j4.A0j(it), spannableStringBuilder);
            }
        } else if (auraInline instanceof AuraInline.Strong) {
            foregroundColorSpan = new StyleSpan(1);
            length = spannableStringBuilder.length();
            Iterator it2 = ((AuraInline.Strong) auraInline).children.iterator();
            while (it2.hasNext()) {
                appendTo(C8j4.A0j(it2), spannableStringBuilder);
            }
        } else if (auraInline instanceof AuraInline.Strikethrough) {
            foregroundColorSpan = new StrikethroughSpan();
            length = spannableStringBuilder.length();
            Iterator it3 = ((AuraInline.Strikethrough) auraInline).children.iterator();
            while (it3.hasNext()) {
                appendTo(C8j4.A0j(it3), spannableStringBuilder);
            }
        } else {
            if (auraInline instanceof AuraInline.InlineCode) {
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) ((AuraInline.InlineCode) auraInline).code);
                spannableStringBuilder.setSpan(new TypefaceSpan("monospace"), length2, spannableStringBuilder.length(), 33);
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.colors.inlineCodeBackground), length2, spannableStringBuilder.length(), 33);
                return;
            }
            if (!(auraInline instanceof AuraInline.Link)) {
                if (auraInline instanceof AuraInline.AutoLink) {
                    ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(this.colors.link);
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ((AuraInline.AutoLink) auraInline).url);
                    if (spannableStringBuilder.length() > length3) {
                        spannableStringBuilder.setSpan(foregroundColorSpan2, length3, spannableStringBuilder.length(), 33);
                        return;
                    }
                    return;
                }
                if (auraInline instanceof AuraInline.Image) {
                    String string = ((AuraInline.Image) auraInline).alt;
                    if (C7BY.A0j(string)) {
                        string = this.context.getString(R.string._name_removed__res_0x7f1205e1);
                    }
                    spannableStringBuilder.append((CharSequence) string);
                    return;
                }
                if (C7384Etj.areEqual(auraInline, AuraInline.LineBreak.INSTANCE)) {
                    c = '\n';
                } else {
                    if (!C7384Etj.areEqual(auraInline, AuraInline.SoftLineBreak.INSTANCE)) {
                        if (!(auraInline instanceof AuraInline.Custom)) {
                            throw C3cG.A0q();
                        }
                        appendCustomInline((AuraInline.Custom) auraInline, spannableStringBuilder);
                        return;
                    }
                    c = ' ';
                }
                spannableStringBuilder.append(c);
                return;
            }
            foregroundColorSpan = new ForegroundColorSpan(this.colors.link);
            length = spannableStringBuilder.length();
            Iterator it4 = ((AuraInline.Link) auraInline).children.iterator();
            while (it4.hasNext()) {
                appendTo(C8j4.A0j(it4), spannableStringBuilder);
            }
        }
        if (spannableStringBuilder.length() > length) {
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 33);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.sharesheet.ShareElement> customShareElements(com.facebook.aura.markdown.parser.ast.AuraBlock.Custom r5) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer.customShareElements(com.facebook.aura.markdown.parser.ast.AuraBlock$Custom):java.util.List");
    }

    private final void draw(ShareElement shareElement, Canvas canvas, int i, int i2, int i3) {
        if (shareElement instanceof TextElement) {
            canvas.save();
            canvas.translate(i, i2);
            TextElement textElement = (TextElement) shareElement;
            textLayout(textElement.text, i3, textElement.textSize, this.colors.primaryText, textElement.typeface, textElement.maxLines, Layout.Alignment.ALIGN_NORMAL).draw(canvas);
            canvas.restore();
            return;
        }
        if (shareElement instanceof CodeElement) {
            drawCode((CodeElement) shareElement, canvas, i, i2, i3);
            return;
        }
        if (shareElement instanceof TableElement) {
            drawTable((TableElement) shareElement, canvas, i, i2, i3);
            return;
        }
        if (shareElement instanceof MediaElement) {
            MediaElement mediaElement = (MediaElement) shareElement;
            drawMedia(mediaElement, canvas, i, i2, mediaWidth(mediaElement, i3));
        } else if (shareElement instanceof ChipElement) {
            drawChip((ChipElement) shareElement, canvas, i, i2, i3);
        } else {
            if (!C7384Etj.areEqual(shareElement, RuleElement.INSTANCE)) {
                throw C3cG.A0q();
            }
            Paint paint = new Paint();
            paint.setColor(this.colors.divider);
            canvas.drawRect(i, i2 + 12, i + i3, i2 + 14, paint);
        }
    }

    private final void drawAppIcon(Canvas canvas) {
        Drawable drawable = this.context.getDrawable(R.drawable.hatch_logo);
        if (drawable != null) {
            drawable.setBounds(64, 64, 141, 141);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drawTable(com.facebook.aura.sharesheet.TableElement r26, android.graphics.Canvas r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer.drawTable(com.facebook.aura.sharesheet.TableElement, android.graphics.Canvas, int, int, int):void");
    }

    private final boolean isBlankBreak(AuraInline auraInline) {
        if ((auraInline instanceof AuraInline.LineBreak) || (auraInline instanceof AuraInline.SoftLineBreak)) {
            return true;
        }
        return (auraInline instanceof AuraInline.Text) && C7BY.A0j(((AuraInline.Text) auraInline).text);
    }

    private final int measure(ShareElement shareElement, int i) {
        if (shareElement instanceof TextElement) {
            TextElement textElement = (TextElement) shareElement;
            return textLayout(textElement.text, i, textElement.textSize, this.colors.primaryText, textElement.typeface, textElement.maxLines, Layout.Alignment.ALIGN_NORMAL).getHeight();
        }
        if (shareElement instanceof CodeElement) {
            CodeElement codeElement = (CodeElement) shareElement;
            int i2 = C7BY.A0j(codeElement.language) ? 0 : 42;
            Typeface typeface = Typeface.MONOSPACE;
            C7384Etj.A0V(typeface);
            return i2 + 56 + textLayout(codeElement.code, i - 56, 34.0f, this.colors.primaryText, typeface, 12, Layout.Alignment.ALIGN_NORMAL).getHeight();
        }
        if (shareElement instanceof TableElement) {
            Iterator<T> it = tableRowHeights((TableElement) shareElement, i).iterator();
            int iA03 = 0;
            while (it.hasNext()) {
                iA03 += C60Q.A03(it);
            }
            return iA03;
        }
        if (shareElement instanceof MediaElement) {
            MediaElement mediaElement = (MediaElement) shareElement;
            return mediaHeight(mediaElement, mediaWidth(mediaElement, i));
        }
        if (shareElement instanceof ChipElement) {
            return CHIP_HEIGHT_PX;
        }
        if (C7384Etj.areEqual(shareElement, RuleElement.INSTANCE)) {
            return 24;
        }
        throw C3cG.A0q();
    }

    private final int mediaHeight(MediaElement mediaElement, int i) {
        int size = AbstractC0878AGe.A0a(mediaElement.urls, 4).size();
        if (size < 1) {
            size = 1;
        }
        int iMediaColumnCount = mediaColumnCount(size);
        int i2 = ((size + iMediaColumnCount) - 1) / iMediaColumnCount;
        return (((i - ((iMediaColumnCount - 1) * 16)) / iMediaColumnCount) * i2) + ((i2 - 1) * 16);
    }

    private final int mediaWidth(MediaElement mediaElement, int i) {
        return AbstractC0878AGe.A0a(mediaElement.urls, 4).size() <= 1 ? Math.min(i, 840) : i;
    }

    private final Typeface resolveMessageTypeface(Typeface typeface) {
        if (!C7384Etj.areEqual(typeface, Typeface.DEFAULT)) {
            if (C7384Etj.areEqual(typeface, Typeface.DEFAULT_BOLD)) {
                typeface = this.emphasizedMessageTypeface;
            }
            return typeface;
        }
        typeface = this.messageTypeface;
        C7384Etj.A0T(typeface);
        return typeface;
    }

    private final List<Integer> tableRowHeights(TableElement tableElement, int i) {
        Integer numA0T;
        Integer numValueOf;
        int iIntValue;
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(tableElement.rows, Collections.singletonList(tableElement.header));
        Iterator it = arrayListA0P.iterator();
        if (it.hasNext()) {
            numA0T = C8j5.A0T(it);
            while (it.hasNext()) {
                Integer numA0T2 = C8j5.A0T(it);
                if (numA0T.compareTo(numA0T2) < 0) {
                    numA0T = numA0T2;
                }
            }
        } else {
            numA0T = null;
        }
        int i2 = 1;
        if (numA0T != null && (iIntValue = numA0T.intValue()) >= 1) {
            i2 = iIntValue;
        }
        int i3 = i / i2;
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0P);
        Iterator it2 = arrayListA0P.iterator();
        while (it2.hasNext()) {
            Iterator itA11 = C8j4.A11(it2);
            if (itA11.hasNext()) {
                CharSequence charSequence = (CharSequence) itA11.next();
                int i4 = i3 - 32;
                int i5 = this.colors.primaryText;
                Typeface typeface = Typeface.DEFAULT;
                C7384Etj.A0V(typeface);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                numValueOf = Integer.valueOf(textLayout(charSequence, i4, 30.0f, i5, typeface, 4, alignment).getHeight() + 32);
                while (itA11.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(textLayout((CharSequence) itA11.next(), i4, 30.0f, this.colors.primaryText, typeface, 4, alignment).getHeight() + 32);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            C60Q.A1P(arrayListA0i, Math.max(62, numValueOf != null ? numValueOf.intValue() : 62));
        }
        return arrayListA0i;
    }

    public static /* synthetic */ StaticLayout textLayout$default(HatchMessageShareDocumentRenderer hatchMessageShareDocumentRenderer, CharSequence charSequence, int i, float f, int i2, Typeface typeface, int i3, Layout.Alignment alignment, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i2 = hatchMessageShareDocumentRenderer.colors.primaryText;
        }
        if ((i4 & 16) != 0) {
            typeface = Typeface.DEFAULT;
            C7384Etj.A0V(typeface);
        }
        if ((i4 & 32) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        if ((i4 & 64) != 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        return hatchMessageShareDocumentRenderer.textLayout(charSequence, i, f, i2, typeface, i3, alignment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence toPlainText(AuraBlock auraBlock) {
        CharSequence charSequenceFromHtml;
        Iterable iterableA0P;
        G0U anonymousClass4;
        int i = 0;
        if (auraBlock instanceof AuraBlock.Paragraph) {
            return toStyledText(((AuraBlock.Paragraph) auraBlock).inlines, false);
        }
        if (auraBlock instanceof AuraBlock.Heading) {
            return toStyledText(((AuraBlock.Heading) auraBlock).inlines, true);
        }
        if (auraBlock instanceof AuraBlock.BlockQuote) {
            return toPlainText(((AuraBlock.BlockQuote) auraBlock).children);
        }
        if (!(auraBlock instanceof AuraBlock.UnorderedList)) {
            if (auraBlock instanceof AuraBlock.OrderedList) {
                AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
                AHD<ListItem> ahd = orderedList.items;
                ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
                for (Object obj : ahd) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    int i3 = orderedList.startNumber + i;
                    CharSequence plainText = toPlainText(((ListItem) obj).children);
                    StringBuilder sbA0w = C60O.A0w();
                    sbA0w.append(i3);
                    arrayListA0i.add(AnonymousClass006.A0y(plainText, ". ", sbA0w));
                    i = i2;
                }
                charSequenceFromHtml = C3cH.A0e(PairsDiscretionDocument.TERMINATOR, arrayListA0i);
            } else if (auraBlock instanceof AuraBlock.CodeBlock) {
                charSequenceFromHtml = ((AuraBlock.CodeBlock) auraBlock).code;
            } else if (auraBlock instanceof AuraBlock.Table) {
                AuraBlock.Table table = (AuraBlock.Table) auraBlock;
                iterableA0P = AbstractC0878AGe.A0P(table.rows, Collections.singletonList(table.header));
                anonymousClass4 = new AnonymousClass4();
            } else if (C7384Etj.areEqual(auraBlock, AuraBlock.ThematicBreak.INSTANCE)) {
                charSequenceFromHtml = "\u2014";
            } else if (auraBlock instanceof AuraBlock.HtmlBlock) {
                charSequenceFromHtml = Html.fromHtml(((AuraBlock.HtmlBlock) auraBlock).html, 0);
                C7384Etj.A0U(charSequenceFromHtml);
            } else {
                if (!(auraBlock instanceof AuraBlock.Custom)) {
                    throw C3cG.A0q();
                }
                charSequenceFromHtml = "Interactive content";
            }
            return charSequenceFromHtml;
        }
        iterableA0P = ((AuraBlock.UnorderedList) auraBlock).items;
        anonymousClass4 = new AnonymousClass2();
        charSequenceFromHtml = AbstractC06907md.A01(PairsDiscretionDocument.TERMINATOR, iterableA0P, anonymousClass4);
        return charSequenceFromHtml;
    }

    private final List<ShareElement> toShareElements(AuraBlock auraBlock) {
        CharSequence charSequenceFromHtml;
        Object tableElement;
        float f;
        int i = 0;
        if (auraBlock instanceof AuraBlock.Paragraph) {
            AuraBlock.Paragraph paragraph = (AuraBlock.Paragraph) auraBlock;
            AHD<AuraInline> ahd = paragraph.inlines;
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : ahd) {
                if (obj instanceof AuraInline.Image) {
                    arrayListA0h.add(obj);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                AHD<AuraInline> ahd2 = paragraph.inlines;
                if (!(ahd2 instanceof Collection) || !ahd2.isEmpty()) {
                    Iterator it = ahd2.iterator();
                    while (it.hasNext()) {
                        AuraInline auraInlineA0j = C8j4.A0j(it);
                        if ((auraInlineA0j instanceof AuraInline.Image) || isBlankBreak(auraInlineA0j)) {
                        }
                    }
                }
                ArrayList arrayListA0m = AnonymousClass002.A0m(arrayListA0h);
                Iterator it2 = arrayListA0h.iterator();
                while (it2.hasNext()) {
                    arrayListA0m.add(((AuraInline.Image) it2.next()).url);
                }
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0h);
                Iterator it3 = arrayListA0h.iterator();
                while (it3.hasNext()) {
                    arrayListA0m2.add(((AuraInline.Image) it3.next()).alt);
                }
                tableElement = new MediaElement(arrayListA0m, arrayListA0m2, false);
            }
            charSequenceFromHtml = toStyledText(paragraph.inlines, false);
            tableElement = C8j5.A0Q(charSequenceFromHtml);
            break;
        }
        if (auraBlock instanceof AuraBlock.Heading) {
            AuraBlock.Heading heading = (AuraBlock.Heading) auraBlock;
            CharSequence styledText = toStyledText(heading.inlines, true);
            int i2 = heading.level;
            if (i2 == 1) {
                f = 62.0f;
            } else if (i2 != 2) {
                f = 54.0f;
                if (i2 != 3) {
                    f = 50.0f;
                }
            } else {
                f = 58.0f;
            }
            Typeface typeface = Typeface.DEFAULT_BOLD;
            C7384Etj.A0V(typeface);
            tableElement = new TextElement(styledText, f, typeface, Integer.MAX_VALUE);
        } else {
            if (auraBlock instanceof AuraBlock.BlockQuote) {
                AHD<AuraBlock> ahd3 = ((AuraBlock.BlockQuote) auraBlock).children;
                ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd3);
                Iterator it4 = ahd3.iterator();
                while (it4.hasNext()) {
                    SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("\u203a ").append(toPlainText(C8j4.A0i(it4)));
                    C7384Etj.A0X(spannableStringBuilderAppend);
                    arrayListA0m3.add(C8j5.A0Q(spannableStringBuilderAppend));
                }
                return arrayListA0m3;
            }
            if (auraBlock instanceof AuraBlock.UnorderedList) {
                AHD<ListItem> ahd4 = ((AuraBlock.UnorderedList) auraBlock).items;
                ArrayList arrayListA0m4 = AnonymousClass002.A0m(ahd4);
                Iterator it5 = ahd4.iterator();
                while (it5.hasNext()) {
                    SpannableStringBuilder spannableStringBuilderAppend2 = new SpannableStringBuilder("\u2022 ").append(toPlainText(((ListItem) it5.next()).children));
                    C7384Etj.A0U(spannableStringBuilderAppend2);
                    arrayListA0m4.add(C8j5.A0Q(spannableStringBuilderAppend2));
                }
                return arrayListA0m4;
            }
            if (auraBlock instanceof AuraBlock.OrderedList) {
                AuraBlock.OrderedList orderedList = (AuraBlock.OrderedList) auraBlock;
                AHD<ListItem> ahd5 = orderedList.items;
                ArrayList arrayListA0m5 = AnonymousClass002.A0m(ahd5);
                for (Object obj2 : ahd5) {
                    int i3 = i + 1;
                    if (i < 0) {
                        AbstractC0885AGm.A14();
                        throw F60.createAndThrow();
                    }
                    SpannableStringBuilder spannableStringBuilderAppend3 = new SpannableStringBuilder(FGI.A08(orderedList.startNumber + i, ". ")).append(toPlainText(((ListItem) obj2).children));
                    C7384Etj.A0U(spannableStringBuilderAppend3);
                    arrayListA0m5.add(C8j5.A0Q(spannableStringBuilderAppend3));
                    i = i3;
                }
                return arrayListA0m5;
            }
            if (auraBlock instanceof AuraBlock.CodeBlock) {
                AuraBlock.CodeBlock codeBlock = (AuraBlock.CodeBlock) auraBlock;
                String str = codeBlock.language;
                if (str == null) {
                    str = "";
                }
                tableElement = new CodeElement(str, codeBlock.code);
            } else if (auraBlock instanceof AuraBlock.Table) {
                AuraBlock.Table table = (AuraBlock.Table) auraBlock;
                AHD<TableCell> ahd6 = table.header;
                ArrayList arrayListA0m6 = AnonymousClass002.A0m(ahd6);
                Iterator it6 = ahd6.iterator();
                while (it6.hasNext()) {
                    arrayListA0m6.add(toPlainText(C8j4.A1F(it6)));
                }
                AHD<AHD<TableCell>> ahd7 = table.rows;
                ArrayList arrayListA0m7 = AnonymousClass002.A0m(ahd7);
                for (List list : ahd7) {
                    ArrayList arrayListA0m8 = AnonymousClass002.A0m(list);
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        arrayListA0m8.add(toPlainText(C8j4.A1F(it7)));
                    }
                    arrayListA0m7.add(arrayListA0m8);
                }
                tableElement = new TableElement(arrayListA0m6, arrayListA0m7);
            } else {
                if (!C7384Etj.areEqual(auraBlock, AuraBlock.ThematicBreak.INSTANCE)) {
                    if (!(auraBlock instanceof AuraBlock.HtmlBlock)) {
                        if (auraBlock instanceof AuraBlock.Custom) {
                            return customShareElements((AuraBlock.Custom) auraBlock);
                        }
                        throw C3cG.A0q();
                    }
                    charSequenceFromHtml = Html.fromHtml(((AuraBlock.HtmlBlock) auraBlock).html, 0);
                    C7384Etj.A0U(charSequenceFromHtml);
                    tableElement = C8j5.A0Q(charSequenceFromHtml);
                    break;
                }
                tableElement = RuleElement.INSTANCE;
            }
        }
        return Collections.singletonList(tableElement);
    }

    private final CharSequence toStyledText(TableCell tableCell) {
        return toPlainText(tableCell.children);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap render() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer.render():android.graphics.Bitmap");
    }

    private final Rect centerCropRect(Bitmap bitmap, float f) {
        if (bitmap.getWidth() / bitmap.getHeight() > f) {
            int height = (int) (bitmap.getHeight() * f);
            int width = (bitmap.getWidth() - height) / 2;
            return new Rect(width, 0, height + width, bitmap.getHeight());
        }
        int width2 = (int) (bitmap.getWidth() / f);
        int height2 = (bitmap.getHeight() - width2) / 2;
        return new Rect(0, height2, bitmap.getWidth(), width2 + height2);
    }

    private final int contentHeight(List<? extends ShareElement> list) {
        Iterator<? extends ShareElement> it = list.iterator();
        int iMeasure = 0;
        while (it.hasNext()) {
            iMeasure += measure(it.next(), CONTENT_WIDTH_PX) + 30;
        }
        return iMeasure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ShareElement> scaleTextToFillMinimumContentHeight(List<? extends ShareElement> list) {
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof TextElement)) {
                        return list;
                    }
                }
            }
            if (contentHeight(list) < 310) {
                Iterator<Integer> it2 = new C0968AJv(60, 20, -1).iterator();
                while (it2.hasNext()) {
                    float fA00 = ((BNt) it2).A00() / 20.0f;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    for (ShareElement shareElement : list) {
                        C7384Etj.A0Z(shareElement, "null cannot be cast to non-null type com.facebook.aura.sharesheet.TextElement");
                        arrayListA0i.add(((TextElement) shareElement).scaledBy(fA00));
                    }
                    if (contentHeight(arrayListA0i) <= 310) {
                        return arrayListA0i;
                    }
                }
                throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
            }
        }
        return list;
    }

    private final StaticLayout textLayout(CharSequence charSequence, int i, float f, int i2, Typeface typeface, int i3, Layout.Alignment alignment) {
        int length = charSequence.length();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(i2);
        textPaint.setTextSize(f);
        textPaint.setTypeface(resolveMessageTypeface(typeface));
        if (i < 1) {
            i = 1;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, i).setAlignment(alignment).setIncludePad(false).setLineSpacing(0.0f, 1.12f).setMaxLines(i3).setEllipsize(TextUtils.TruncateAt.END).build();
        C7384Etj.A0U(staticLayoutBuild);
        return staticLayoutBuild;
    }

    private final String toSuperscript(int i) {
        String strValueOf = String.valueOf(i);
        int length = strValueOf.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = strValueOf.charAt(i2);
            Character ch = SUPERSCRIPT_DIGITS.get(Character.valueOf(cCharAt));
            if (ch != null) {
                cCharAt = ch.charValue();
            }
            arrayListA11.add(Character.valueOf(cCharAt));
        }
        return AbstractC0878AGe.A0L("", "", "", arrayListA11, null);
    }

    private final void withSpan(SpannableStringBuilder spannableStringBuilder, Object obj, Function0<Unit> function0) {
        int length = spannableStringBuilder.length();
        function0.invoke();
        if (spannableStringBuilder.length() > length) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence toPlainText(List<? extends AuraBlock> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AbstractC0878AGe.A0i(spannableStringBuilder, PairsDiscretionDocument.TERMINATOR, "", "", list, new AnonymousClass1());
        return spannableStringBuilder;
    }

    private final List<ShareElement> toShareElements(List<? extends AuraBlock> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<? extends AuraBlock> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(toShareElements(C8j4.A0i(it)), arrayListA0h);
        }
        return arrayListA0h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CharSequence toStyledText(List<? extends AuraInline> list, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator<? extends AuraInline> it = list.iterator();
        while (it.hasNext()) {
            appendTo(C8j4.A0j(it), spannableStringBuilder);
        }
        if (z && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
