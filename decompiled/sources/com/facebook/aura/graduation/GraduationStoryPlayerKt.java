package com.facebook.aura.graduation;

import X.AHD;
import X.AKQ;
import X.ANR;
import X.AVy;
import X.AWx;
import X.AaM;
import X.AaN;
import X.AbstractC1103AYp;
import X.AbstractC1754Apr;
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
import X.BOf;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00s;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DM;
import X.C1EQ;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7Je;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HtJ;
import X.HxE;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class GraduationStoryPlayerKt {
    public static final float BOTTOM_SCRIM_HEIGHT = 480.0f;
    public static final float BOTTOM_SCRIM_MID_ALPHA = 0.85f;
    public static final float BOTTOM_SCRIM_MID_STOP = 0.621f;
    public static final float CARD_BOTTOM_SPACING = 24.0f;
    public static final float CARD_HORIZONTAL_PADDING = 16.0f;
    public static final int CHAPTER_FADE_MS = 280;
    public static final int CHAPTER_SLIDE_FRACTION = 4;
    public static final float CLOSE_BUTTON_SIZE = 32.0f;
    public static final float CLOSE_TOP_SPACING = 24.0f;
    public static final String GRADUATION_SURFACE_TAG = "graduation_story";
    public static final float PROGRESS_SEGMENT_GAP = 5.0f;
    public static final long PROGRESS_TICK_MS = 50;
    public static final float PROGRESS_TOP_SPACING = 34.0f;
    public static final float PROGRESS_TRACK_HEIGHT = 2.0f;
    public static final float SCREEN_HORIZONTAL_PADDING = 20.0f;
    public static final float TEXT_BLOCK_GAP = 10.0f;
    public static final float TEXT_HORIZONTAL_PADDING = 28.0f;
    public static final float TEXT_TO_CARD_SPACING = 40.0f;
    public static final float TOP_BAR_TOUCH_TARGET = 48.0f;
    public static final float TOP_SCRIM_HEIGHT = 137.0f;
    public static final C1D3 PROGRESS_SEGMENT_SHAPE = C1D8.A00(1.0f);
    public static final float TEXT_BLOCK_TOP_INSET = ((34.0f + 2.0f) + 24.0f) + 32.0f;

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationBottomScrim$1, reason: invalid class name */
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

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationBottomScrim(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationChapterSeekTargets$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $canSeekForward;
        public final /* synthetic */ boolean $isFirstChapter;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSeekBack;
        public final /* synthetic */ Function0<Unit> $onSeekForward;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isFirstChapter = z;
            this.$canSeekForward = z2;
            this.$onSeekBack = function0;
            this.$onSeekForward = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationChapterSeekTargets(this.$isFirstChapter, this.$canSeekForward, this.$onSeekBack, this.$onSeekForward, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationChapterText$1, reason: invalid class name and case insensitive filesystem */
    public final class C121771 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ GraduationChapterUiModel $chapter;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121771(GraduationChapterUiModel graduationChapterUiModel, BRg bRg) {
            super(2);
            this.$chapter = graduationChapterUiModel;
            this.$modifier = bRg;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                GraduationStoryPlayerKt.GraduationChapterTextContent(this.$chapter, this.$modifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationChapterText$2, reason: invalid class name and case insensitive filesystem */
    public final class C121782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ GraduationChapterUiModel $chapter;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121782(GraduationChapterUiModel graduationChapterUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$chapter = graduationChapterUiModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationChapterText(this.$chapter, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationChapterTextContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C121792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ GraduationChapterUiModel $chapter;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121792(GraduationChapterUiModel graduationChapterUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$chapter = graduationChapterUiModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationChapterTextContent(this.$chapter, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationCloseButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C121801 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121801(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClose = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationCloseButton(this.$onClose, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationProgressTrack$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $chapterCount;
        public final /* synthetic */ float $chapterProgress;
        public final /* synthetic */ int $currentChapter;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i, int i2, float f, BRg bRg, int i3, int i4) {
            super(2);
            this.$chapterCount = i;
            this.$currentChapter = i2;
            this.$chapterProgress = f;
            this.$modifier = bRg;
            this.$$changed = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationProgressTrack(this.$chapterCount, this.$currentChapter, this.$chapterProgress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationSaveVideoButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C121812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSaved;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121812(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isSaving = z;
            this.$isSaved = z2;
            this.$onSave = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationSaveVideoButton(this.$isSaving, this.$isSaved, this.$onSave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationSaveVideoButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSaved;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isSaving = z;
            this.$isSaved = z2;
            this.$onSave = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationSaveVideoButton(this.$isSaving, this.$isSaved, this.$onSave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationSaveVideoButton$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSaved;
        public final /* synthetic */ boolean $isSaving;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSave;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isSaving = z;
            this.$isSaved = z2;
            this.$onSave = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationSaveVideoButton(this.$isSaving, this.$isSaved, this.$onSave, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationTopBar$3, reason: invalid class name and case insensitive filesystem */
    public final class C121823 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $chapterCount;
        public final /* synthetic */ float $chapterProgress;
        public final /* synthetic */ int $currentChapter;
        public final /* synthetic */ boolean $isSavingVideo;
        public final /* synthetic */ boolean $isVideoSaved;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ Function0<Unit> $onSaveVideo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121823(int i, int i2, float f, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, Function0<Unit> function02, int i3, int i4) {
            super(2);
            this.$chapterCount = i;
            this.$currentChapter = i2;
            this.$chapterProgress = f;
            this.$onClose = function0;
            this.$modifier = bRg;
            this.$isSavingVideo = z;
            this.$isVideoSaved = z2;
            this.$onSaveVideo = function02;
            this.$$changed = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationTopBar(this.$chapterCount, this.$currentChapter, this.$chapterProgress, this.$onClose, this.$modifier, this.$isSavingVideo, this.$isVideoSaved, this.$onSaveVideo, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationTopBarButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C121832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121832(int i, String str, Function0<Unit> function0, BRg bRg, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$contentDescription = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationTopBarButton(this.$iconRes, this.$contentDescription, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationTopScrim$1, reason: invalid class name and case insensitive filesystem */
    public final class C121841 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121841(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            GraduationStoryPlayerKt.GraduationTopScrim(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void GraduationCloseButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(687268887);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            GraduationTopBarButton(R.drawable.nav_close, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ed), function0, bRg2, bfm, (iA0T << 6) & 8064, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121801(function0, bRg2, i, i2);
        }
    }

    public static final void GraduationChapterSeekTargets(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-381098840);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function02);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 9363, 9362), bfm, iA0n)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(-1716740658);
                i3 = R.string._name_removed__res_0x7f1202b3;
            } else {
                bfm.AgE(-1716659221);
                i3 = R.string._name_removed__res_0x7f1202b2;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            BBI bbiA07 = C3cG.A07(bfm);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202b1);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            C1062ATq c1062ATq = C10G.A00;
            C3Ue.A04(C0v5.A05(c90m.AiP(c1062ATq, 1.0f, true), strA01, function0, true), bfm, 0);
            C3Ue.A04(C0v5.A05(c90m.AiP(c1062ATq, 1.0f, true), strA012, function02, z2), bfm, 0);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, z2, function0, function02, bRg2, i, i2);
        }
    }

    public static final void GraduationChapterTextContent(GraduationChapterUiModel graduationChapterUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1929452046);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, graduationChapterUiModel) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AbstractC1103AYp.A02(AbstractC1103AYp.A00(0, bfm, 0, 1), AnonymousClass001.A0R(bRg2), true), TEXT_HORIZONTAL_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(TEXT_BLOCK_GAP), bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String str = graduationChapterUiModel.header;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, auraTheme.getColors(bfm, 6).accent, C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String str2 = graduationChapterUiModel.title;
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = GraduationStoryPlayerKt$GraduationChapterTextContent$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str2, AnonymousClass001.A0Y(bs0, objAaT, false), C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title1Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(graduationChapterUiModel.body, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121792(graduationChapterUiModel, bRg2, i, i2);
        }
    }

    public static final void GraduationProgressTrack(int i, int i2, float f, BRg bRg, BFM bfm, int i3, int i4) {
        float f2;
        BRg bRg2 = bRg;
        bfm.AgG(-1241557319);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A06(bfm, f);
        }
        int i5 = i4 & 8;
        if (i5 != 0) {
            iA0D |= 3072;
        } else if ((i3 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            String strA0w = AnonymousClass006.A0w(bfm, String.valueOf(i2 + 1), String.valueOf(i), R.string._name_removed__res_0x7f1202ab);
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), SCREEN_HORIZONTAL_PADDING);
            boolean zA65 = bfm.A65(strA0w);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new GraduationStoryPlayerKt$GraduationProgressTrack$1$1(strA0w);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(PROGRESS_SEGMENT_GAP), bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            bfm.AgE(-37586194);
            for (int i6 = 0; i6 < i; i6++) {
                if (i6 < i2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                    if (i6 == i2) {
                        f2 = f;
                    }
                }
                BS0 bs0 = BRg.A00;
                BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
                float f3 = PROGRESS_TRACK_HEIGHT;
                BRg bRgA03 = C11U.A03(C10G.A04(bRgA0O, f3), PROGRESS_SEGMENT_SHAPE);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                long jA05 = C3cH.A05(bfm, auraTheme);
                C1DM c1dm = C1OM.A00;
                BRg bRgA032 = C1b8.A03(bRgA03, c1dm, jA05);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA032);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA012, g0vA0u);
                C3Ue.A04(C1b8.A03(C10G.A04(C10G.A03(bs0, f2), f3), c1dm, C3cH.A06(bfm, auraTheme)), bfm, 0);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i, i2, f, bRg2, i3, i4);
        }
    }

    public static final void GraduationSaveVideoButton(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        BRg bRg2 = bRg;
        bfm.AgG(-571729639);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(1442785130);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202b5);
                BRg bRgA07 = C10G.A07(bRg2, CLOSE_BUTTON_SIZE);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new GraduationStoryPlayerKt$GraduationSaveVideoButton$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bRgA07, objAaT, false), null, C3cH.A06(bfm, AuraTheme.INSTANCE), bfm, 0, 2);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass5 = new C121812(z, z2, function0, bRg2, i, i2);
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 1443122441);
                if (z2) {
                    bfm.AgE(1443251742);
                    String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202b7);
                    AVy aVyA00 = BOf.A00(bfm, R.drawable.check_outline_24_wght400, 0);
                    BRg bRgA072 = C10G.A07(bRg2, CLOSE_BUTTON_SIZE);
                    boolean zA652 = bfm.A65(strA012);
                    Object objAaT2 = bfm.AaT();
                    if (zA652 || objAaT2 == C78N.A00) {
                        objAaT2 = new GraduationStoryPlayerKt$GraduationSaveVideoButton$3$1(strA012);
                        bfm.Ai0(objAaT2);
                    }
                    AuraIconKt.m2567AuraIconFHprtrg(AnonymousClass001.A0Y(bRgA072, objAaT2, false), aVyA00, AuraIconSize.SMALL, null, C3cH.A06(bfm, AuraTheme.INSTANCE), null, bfm, AnonymousClass001.A04(), 32);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbiA0M);
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass5 = new AnonymousClass4(false, z2, function0, bRg2, i, i2);
                    }
                } else {
                    bfm.AgE(1443723593);
                    BBI.A0R(bbiA0M, false);
                    GraduationTopBarButton(R.drawable.arrowdownload_outline_24_wght400, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1202b4), function0, bRg2, bfm, iA0n & 8064, 0);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(z, z2, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    /* renamed from: GraduationStoryPlayer-_-WMjBM, reason: not valid java name */
    public static final void m972GraduationStoryPlayer_WMjBM(String str, Long l, final AHD<GraduationChapterUiModel> ahd, float f, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object graduationStoryPlayerKt$GraduationStoryPlayer$6;
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, ahd);
        C60O.A1M(function0, 6, function02);
        bfm.AgG(77244554);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, l);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, ahd);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, function02);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = null;
                try {
                    objAaT = C7Je.A01(str);
                } catch (SecurityException | UnsupportedOperationException unused) {
                }
                bfm.Ai0(objAaT);
            }
            Uri uri = (Uri) objAaT;
            if (ahd.isEmpty() || uri == null) {
                bfm.AgE(-909530300);
                GraduationTopBar(0, 0, 0.0f, function02, null, false, false, null, bfm, ((iA0d >> 12) & 7168) | 438, 240);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    graduationStoryPlayerKt$GraduationStoryPlayer$6 = new GraduationStoryPlayerKt$GraduationStoryPlayer$1(str, l, ahd, f, z, z2, function0, function02, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, graduationStoryPlayerKt$GraduationStoryPlayer$6);
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -909418824);
            HatchVideoPlayer hatchVideoPlayerRememberHatchVideoPlayer = RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.OFF, false, true, bfm, 438, 0);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new ParcelableSnapshotMutableLongState(0L);
                bfm.Ai0(objAaT2);
            }
            C00s c00s = (C00s) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new ParcelableSnapshotMutableLongState(0L);
                bfm.Ai0(objAaT3);
            }
            C00s c00s2 = (C00s) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT4;
            boolean zA67 = bfm.A67(hatchVideoPlayerRememberHatchVideoPlayer);
            Object objAaT5 = bfm.AaT();
            if (zA67 || objAaT5 == obj) {
                objAaT5 = new GraduationStoryPlayerKt$GraduationStoryPlayer$2$1(hatchVideoPlayerRememberHatchVideoPlayer, c00s, c00s2, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, hatchVideoPlayerRememberHatchVideoPlayer);
            boolean zA1T = AnonymousClass001.A1T(bfm, hatchVideoPlayerRememberHatchVideoPlayer, AnonymousClass002.A1Q(iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 32));
            Object objAaT6 = bfm.AaT();
            if (zA1T || objAaT6 == obj) {
                objAaT6 = new GraduationStoryPlayerKt$GraduationStoryPlayer$3$1(hatchVideoPlayerRememberHatchVideoPlayer, l, mutableState);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A19(bfm, objAaT6, hatchVideoPlayerRememberHatchVideoPlayer, l);
            final int iA00 = MutableState.A0A(mutableState) ? C60O.A00(ahd) : chapterIndexAt(ahd, c00s.AHH());
            float fProgressWithinChapter = MutableState.A0A(mutableState) ? 1.0f : progressWithinChapter(ahd, iA00, c00s.AHH(), c00s2.AHH());
            boolean zA1V = AnonymousClass002.A1V(bfm, ahd, bfm.A67(hatchVideoPlayerRememberHatchVideoPlayer), bfm.A63(iA00));
            Object objAaT7 = bfm.AaT();
            if (zA1V || objAaT7 == obj) {
                objAaT7 = new GraduationStoryPlayerKt$GraduationStoryPlayer$seekBack$1$1(hatchVideoPlayerRememberHatchVideoPlayer, iA00, ahd, mutableState);
                bfm.Ai0(objAaT7);
            }
            final Function0 function03 = (Function0) objAaT7;
            boolean zA1a = AnonymousClass001.A1a(AnonymousClass003.A1M(bfm, hatchVideoPlayerRememberHatchVideoPlayer, ahd), bfm, iA00);
            Object objAaT8 = bfm.AaT();
            if (zA1a || objAaT8 == obj) {
                objAaT8 = new GraduationStoryPlayerKt$GraduationStoryPlayer$seekForward$1$1(hatchVideoPlayerRememberHatchVideoPlayer, ahd, iA00, mutableState);
                bfm.Ai0(objAaT8);
            }
            final Function0 function04 = (Function0) objAaT8;
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgThen = bRg2.then(c1062ATq);
            Integer numValueOf = Integer.valueOf(iA00);
            boolean zA1O = AnonymousClass003.A1O(bfm, ahd, function04, AnonymousClass001.A1a(bfm.A65(function03), bfm, iA00));
            Object objAaT9 = bfm.AaT();
            if (zA1O || objAaT9 == obj) {
                objAaT9 = new PointerInputEventHandler() { // from class: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$4$1

                    /* renamed from: com.facebook.aura.graduation.GraduationStoryPlayerKt$GraduationStoryPlayer$4$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ int $chapterIndex;
                        public final /* synthetic */ AHD<GraduationChapterUiModel> $chapters;
                        public final /* synthetic */ Function0<Unit> $seekBack;
                        public final /* synthetic */ Function0<Unit> $seekForward;
                        public final /* synthetic */ BRr $this_pointerInput;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BRr bRr, Function0<Unit> function0, int i, AHD<GraduationChapterUiModel> ahd, Function0<Unit> function02) {
                            super(1);
                            this.$this_pointerInput = bRr;
                            this.$seekBack = function0;
                            this.$chapterIndex = i;
                            this.$chapters = ahd;
                            this.$seekForward = function02;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m973invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m973invokek4lQ0M(long j) {
                            Function0<Unit> function0;
                            if (AnonymousClass001.A00(j) < ((int) (((AaN) this.$this_pointerInput).A00 >> 32)) / 2.0f) {
                                function0 = this.$seekBack;
                            } else if (this.$chapterIndex >= AnonymousClass002.A0E(this.$chapters)) {
                                return;
                            } else {
                                function0 = this.$seekForward;
                            }
                            function0.invoke();
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass007.A0W(bRr, htJ, new AnonymousClass1(bRr, function03, iA00, ahd, function04));
                    }
                };
                bfm.Ai0(objAaT9);
            }
            BRg bRgA01 = AaM.A01(bRgThen, (PointerInputEventHandler) objAaT9, numValueOf, ahd);
            Alignment alignment = C2VU.A0E;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function05);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA01);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq2 = C10G.A02;
            Alignment alignment2 = C2VU.A0C;
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(c0z7.A4C(alignment2, c1062ATq2), uri, hatchVideoPlayerRememberHatchVideoPlayer, str, null, null, false, true, true, false, false, false, HatchVideoPlayer.ResizeMode.FIXED_WIDTH, 0.0f, GRADUATION_SURFACE_TAG, null, false, false, false, null, false, null, null, null, null, null, null, bfm, ((iA0d << 9) & 7168) | 113246208, 1597878, 0, 134128240);
            GraduationTopScrim(c0z7.A4C(alignment2, bs0), bfm, 0, 0);
            GraduationBottomScrim(c0z7.A4C(C2VU.A06, bs0), bfm, 0, 0);
            GraduationChapterSeekTargets(AnonymousClass002.A1M(iA00), iA00 < C60O.A00(ahd), function03, function04, null, bfm, 0, 16);
            BRg bRgA0C = C3U4.A0C(AbstractC1754Apr.A02(c1062ATq), 0.0f, TEXT_BLOCK_TOP_INSET, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A05, bfm, C2VU.A02, 6);
            int iA0D2 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbiA0M, function05);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            BRg bRgAiP = C90l.A00.AiP(c1062ATq2, 1.0f, false);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
            int iA0D3 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA043 = BBI.A04(bbiA0M);
            BRg bRgA014 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbiA0M, function05);
            BPg.A02(bfm, interfaceC1380AiAA012, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA014, g0vA0u);
            Object objAaT10 = bfm.AaT();
            if (objAaT10 == obj) {
                objAaT10 = GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT10);
            }
            ANR.A02(bfm, null, null, numValueOf, "graduationChapter", (G0U) objAaT10, null, B1V.A00(bfm, new GraduationStoryPlayerKt$GraduationStoryPlayer$5$1$1$2(ahd), -836623914), 1597824, 42);
            BBI.A0R(bbiA0M, true);
            C01N.A08(bfm, bs0, TEXT_TO_CARD_SPACING);
            GraduationAppClipCardKt.GraduationAppClipCard(C3U4.A0B(bs0, CARD_HORIZONTAL_PADDING, 0.0f), bfm, 6, 0);
            C01N.A04(bfm, bbiA0M, bs0, f + CARD_BOTTOM_SPACING, true);
            int i4 = iA0d << 3;
            GraduationTopBar(ahd.size(), iA00, fProgressWithinChapter, function02, c0z7.A4C(alignment2, bs0), z, z2, function0, bfm, AnonymousClass001.A0C(i4, ((iA0d >> 12) & 7168) | (458752 & i4) | (3670016 & i4)), 0);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            graduationStoryPlayerKt$GraduationStoryPlayer$6 = new GraduationStoryPlayerKt$GraduationStoryPlayer$6(str, l, ahd, f, z, z2, function0, function02, bRg2, i, i2);
            C3cG.A1D(bBbAAc, graduationStoryPlayerKt$GraduationStoryPlayer$6);
        }
    }

    public static final void GraduationTopBar(int i, int i2, float f, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, Function0<Unit> function02, BFM bfm, int i3, int i4) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        boolean zA1K2 = z2;
        Function0<Unit> function03 = function02;
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(-313560871);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A06(bfm, f);
        }
        if ((i3 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function0);
        }
        int i5 = i4 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i6 = i4 & 32;
        int iA0s = 196608;
        if (i6 != 0) {
            iA0D |= iA0s;
        } else if ((196608 & i3) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1K);
            iA0D |= iA0s;
        }
        int i7 = i4 & 64;
        int iA0t = 1572864;
        if (i7 != 0) {
            iA0D |= iA0t;
        } else if ((1572864 & i3) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, zA1K2);
            iA0D |= iA0t;
        }
        int i8 = i4 & 128;
        int iA0a = 12582912;
        if (i8 != 0) {
            iA0D |= iA0a;
        } else if ((i3 & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, function03);
            iA0D |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 4793491, 4793490), bfm, iA0D)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i6, zA1K);
            zA1K2 = C3cG.A1K(i7, zA1K2);
            if (i8 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = GraduationStoryPlayerKt$GraduationTopBar$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                function03 = (Function0) objAaT;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA02 = AbstractC1754Apr.A02(bRg2.then(c1062ATq));
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, PROGRESS_TOP_SPACING);
            if (i > 0) {
                bfm.AgE(-1638585178);
                GraduationProgressTrack(i, i2, f, null, bfm, iA0D & 1022, 8);
            } else {
                bfm.AgE(-1638410772);
                C01N.A08(bfm, bs0, PROGRESS_TRACK_HEIGHT);
            }
            BBI.A0R(bbi, false);
            C01N.A08(bfm, bs0, CLOSE_TOP_SPACING);
            BRg bRgA07 = C3U4.A07(c1062ATq, SCREEN_HORIZONTAL_PADDING);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            if (i2 == i - 1) {
                bfm.AgE(-47002707);
                GraduationSaveVideoButton(zA1K, zA1K2, function03, c0z7.A4C(C2VU.A0B, bs0), bfm, (iA0D >> 15) & 1022, 0);
            } else {
                bfm.AgE(-46787443);
            }
            BBI.A0R(bbi, false);
            GraduationCloseButton(function0, c0z7.A4C(C2VU.A0A, bs0), bfm, (iA0D >> 9) & 14, 0);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121823(i, i2, f, function0, bRg2, zA1K, zA1K2, function03, i3, i4);
        }
    }

    public static final void GraduationTopBarButton(int i, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1039915681);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C10G.A07(bRg2, CLOSE_BUTTON_SIZE);
            Alignment alignment = C2VU.A09;
            BRg bRgA04 = C0v5.A04(C10G.A06(C10G.A02(alignment, bRgA07, true), TOP_BAR_TOUCH_TARGET), C3cG.A0A(0), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.SMALL, str, C3cH.A06(bfm, AuraTheme.INSTANCE), null, bfm, AnonymousClass001.A03() | ((iA0D << 6) & 7168), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121832(i, str, function0, bRg2, i2, i3);
        }
    }

    public static final void GraduationBottomScrim(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(981793842);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            long j = C3cH.A0W(bfm).background;
            C3Ue.A04(C1b8.A02(C10G.A04(AnonymousClass001.A0R(bRg), BOTTOM_SCRIM_HEIGHT), C1EQ.A02(new HxE[]{C3cG.A0r(Float.valueOf(0.0f), C60P.A04(B6A.A06)), C3cG.A0r(Float.valueOf(0.621f), C60P.A04(HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.85f))), AnonymousClass007.A0g(1.0f, j)}, Float.POSITIVE_INFINITY), C1OM.A00), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final void GraduationChapterText(GraduationChapterUiModel graduationChapterUiModel, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(2003705557);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, graduationChapterUiModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            GraduationFixedFontScaleKt.GraduationFixedFontScale(B1V.A00(bfm, new C121771(graduationChapterUiModel, bRg), -845378921), bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121782(graduationChapterUiModel, bRg, i, i2);
        }
    }

    public static final void GraduationTopScrim(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1048845084);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C3Ue.A04(C1b8.A02(C10G.A04(AnonymousClass001.A0R(bRg), TOP_SCRIM_HEIGHT), C1EQ.A02(C60O.A1Z(Float.valueOf(1.0f), C60P.A04(B6A.A06), AnonymousClass007.A0g(0.0f, C3cH.A0W(bfm).background)), Float.POSITIVE_INFINITY), C1OM.A00), bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121841(bRg, i, i2);
        }
    }

    public static final int chapterIndexAt(AHD<GraduationChapterUiModel> ahd, long j) {
        int size = ahd.size();
        int i = 0;
        for (int i2 = 0; i2 < size && ((GraduationChapterUiModel) ahd.get(i2)).startTimeMs <= j; i2++) {
            i = i2;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v2 java.lang.Long) = (r1v1 java.lang.Long), (r1v5 java.lang.Long) binds: [B:6:0x001a, B:8:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float progressWithinChapter(X.AHD<com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel> r5, int r6, long r7, long r9) {
        /*
            java.lang.Object r0 = r5.get(r6)
            com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel r0 = (com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel) r0
            long r2 = r0.startTimeMs
            int r0 = r6 + 1
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r0, r5)
            com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel r0 = (com.facebook.aura.graduation.viewmodel.GraduationChapterUiModel) r0
            r1 = 0
            if (r0 == 0) goto L19
            long r0 = r0.startTimeMs
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L19:
            r6 = 0
            if (r1 != 0) goto L28
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            long r4 = r1.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3c
        L28:
            long r4 = r1.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3c
            long r7 = r7 - r2
            float r1 = (float) r7
            long r4 = r4 - r2
            float r0 = (float) r4
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.ATD.A03(r1, r6, r0)
            return r0
        L3c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.graduation.GraduationStoryPlayerKt.progressWithinChapter(X.AHD, int, long, long):float");
    }
}
