package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFI;
import X.C3UX;
import X.C78T;
import X.EnumC10460Hji;
import X.F60;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.common.video.HatchVideoPrefetcher;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$7$1", f = "MediaViewerContent.kt", l = {302}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$7$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isPlaybackEnabled;
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ PagerState $pagerState;
    public Object L$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$7$1$1", f = "MediaViewerContent.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.file.view.MediaViewerContentKt$MediaViewerContent$7$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ List<ContentItem> $prefetchCandidates;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<ContentItem> list, Context context, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$prefetchCandidates = list;
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$prefetchCandidates, this.$context, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchVideoPrefetcher companion = HatchVideoPrefetcher.Companion.getInstance();
            List<ContentItem> list = this.$prefetchCandidates;
            Context context = this.$context;
            int i = 0;
            for (ContentItem contentItem : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                ContentItem contentItem2 = contentItem;
                String str = contentItem2.workspacePath;
                if (str == null && (str = contentItem2.imageUri) == null) {
                    str = "";
                }
                companion.prefetchVideoByUri(context, str, contentItem2.imageUri, null, 1048576, AnonymousClass002.A1M(i));
                i = i2;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$7$1(boolean z, AHD<ContentItem> ahd, PagerState pagerState, Context context, HtJ<? super MediaViewerContentKt$MediaViewerContent$7$1> htJ) {
        super(2, htJ);
        this.$isPlaybackEnabled = z;
        this.$items = ahd;
        this.$pagerState = pagerState;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new MediaViewerContentKt$MediaViewerContent$7$1(this.$isPlaybackEnabled, this.$items, this.$pagerState, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isPlaybackEnabled) {
                List listA0F = BFI.A0F(new ContentItem[]{(ContentItem) AbstractC0878AGe.A0A(this.$pagerState.A07(), this.$items), (ContentItem) AbstractC0878AGe.A0A(this.$pagerState.A07() - 1, this.$items), (ContentItem) AbstractC0878AGe.A0A(this.$pagerState.A07() + 1, this.$items)});
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA0F) {
                    ContentItem contentItem = (ContentItem) obj2;
                    if ((contentItem.type instanceof ContentType.Video) && (str = contentItem.imageUri) != null && str.length() != 0) {
                        arrayList.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    ContentItem contentItem2 = (ContentItem) obj3;
                    String str2 = contentItem2.workspacePath;
                    if (str2 == null && (str2 = contentItem2.imageUri) == null) {
                        str2 = "";
                    }
                    AnonymousClass006.A1P(str2, obj3, hashSet, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    C78T c78tA0y = AnonymousClass001.A0y();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayList2, this.$context, null);
                    this.L$0 = null;
                    this.label = 1;
                    if (GAo.A00(this, c78tA0y, anonymousClass1) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MediaViewerContentKt$MediaViewerContent$7$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
