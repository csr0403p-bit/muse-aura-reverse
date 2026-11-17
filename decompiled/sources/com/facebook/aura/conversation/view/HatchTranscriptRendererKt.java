package com.facebook.aura.conversation.view;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C0981AMm;
import X.C10543Hqv;
import X.C7384Etj;
import X.C78N;
import X.F1F;
import X.FGI;
import X.G0V;
import com.facebook.aura.conversation.view.TranscriptBubbleItem;
import com.facebook.aura.conversation.view.TranscriptRow;
import com.facebook.aura.conversation.viewmodel.HatchRenderSegment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchTranscriptRendererKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchTranscriptRendererKt$CompleteSequencedContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Object $key;
        public final /* synthetic */ Function0<Unit> $onCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, Function0<Unit> function0, int i) {
            super(2);
            this.$key = obj;
            this.$onCompleted = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTranscriptRendererKt.CompleteSequencedContent(this.$key, this.$onCompleted, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchTranscriptRendererKt$CompleteSequencedContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Object $key;
        public final /* synthetic */ Function0<Unit> $onCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj, Function0<Unit> function0, int i) {
            super(2);
            this.$key = obj;
            this.$onCompleted = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTranscriptRendererKt.CompleteSequencedContent(this.$key, this.$onCompleted, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x040c A[PHI: r16
  0x040c: PHI (r16v3 boolean) = (r16v1 boolean), (r16v4 boolean) binds: [B:247:0x040a, B:245:0x0406] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0427 A[PHI: r16
  0x0427: PHI (r16v2 boolean) = (r16v1 boolean), (r16v3 boolean), (r16v3 boolean) binds: [B:247:0x040a, B:249:0x041d, B:251:0x0425] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* renamed from: HatchTranscriptRendererWithBubbles-Oqtexg8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m670HatchTranscriptRendererWithBubblesOqtexg8(X.AHD<? extends com.facebook.aura.conversation.viewmodel.HatchRenderSegment> r68, com.facebook.aura.conversation.viewmodel.HatchMessageUiModel r69, kotlin.jvm.functions.Function0<java.lang.Float> r70, X.C1DM r71, com.facebook.aura.conversation.view.InlineContentCallbacks r72, X.AHD<java.lang.String> r73, boolean r74, long r75, long r77, X.B6A r79, float r80, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r81, X.G2j<? super X.AHD<java.lang.String>, ? super java.lang.Boolean, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r82, X.G0U<? super java.lang.String, kotlin.Unit> r83, X.G0U<? super com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.Unit> r84, java.lang.String r85, X.BFM r86, int r87, int r88, int r89) {
        /*
            Method dump skipped, instructions count: 1461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchTranscriptRendererKt.m670HatchTranscriptRendererWithBubblesOqtexg8(X.AHD, com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.jvm.functions.Function0, X.1DM, com.facebook.aura.conversation.view.InlineContentCallbacks, X.AHD, boolean, long, long, X.B6A, float, X.G0V, X.G2j, X.G0U, X.G0U, java.lang.String, X.BFM, int, int, int):void");
    }

    public static final void HatchTranscriptRendererWithBubbles_Oqtexg8$completeSequenceKey(boolean z, C0981AMm<String, Boolean> c0981AMm, String str) {
        if (z) {
            Boolean bool = c0981AMm.get(str);
            Boolean boolA0i = AnonymousClass001.A0i();
            if (C7384Etj.areEqual(bool, boolA0i)) {
                return;
            }
            c0981AMm.put(str, boolA0i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.facebook.aura.conversation.view.TranscriptRow> buildTranscriptRows(java.util.List<? extends com.facebook.aura.conversation.viewmodel.HatchRenderSegment> r13, java.util.Set<java.lang.String> r14, boolean r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchTranscriptRendererKt.buildTranscriptRows(java.util.List, java.util.Set, boolean, boolean, boolean):java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.util.ArrayList] */
    public static final void buildTranscriptRows$flush(C10543Hqv<List<TranscriptBubbleItem>> c10543Hqv, F1F f1f, List<TranscriptRow> list) {
        if (c10543Hqv.element.isEmpty()) {
            return;
        }
        boolean z = true;
        boolean z2 = !f1f.element;
        f1f.element = true;
        List listA0X = AbstractC0878AGe.A0X(c10543Hqv.element);
        List<TranscriptBubbleItem> list2 = c10543Hqv.element;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z = false;
        } else {
            for (TranscriptBubbleItem transcriptBubbleItem : list2) {
                if ((transcriptBubbleItem instanceof TranscriptBubbleItem.Text) && ((TranscriptBubbleItem.Text) transcriptBubbleItem).isStreamingLast) {
                    break;
                }
            }
            z = false;
        }
        list.add(new TranscriptRow.Bubble(listA0X, z2, z));
        c10543Hqv.element = new ArrayList();
    }

    public static final AHD<HatchRenderSegment> coalesceAdjacentWidgetTokenSegments(AHD<? extends HatchRenderSegment> ahd) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (HatchRenderSegment hatchRenderSegment : ahd) {
            if (hatchRenderSegment instanceof HatchRenderSegment.WidgetTokenSegment) {
                arrayList2.addAll(((HatchRenderSegment.WidgetTokenSegment) hatchRenderSegment).widgetTokenIds);
            } else {
                coalesceAdjacentWidgetTokenSegments$flushWidgetTokens(arrayList2, arrayList);
                arrayList.add(hatchRenderSegment);
            }
        }
        coalesceAdjacentWidgetTokenSegments$flushWidgetTokens(arrayList2, arrayList);
        return AGI.A07(arrayList);
    }

    public static final boolean hasWidgetSequence(List<? extends TranscriptRow> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (TranscriptRow transcriptRow : list) {
                if (transcriptRow instanceof TranscriptRow.BareWidgets) {
                    if (!((TranscriptRow.BareWidgets) transcriptRow).ids.isEmpty()) {
                        return true;
                    }
                } else if (transcriptRow instanceof TranscriptRow.Bubble) {
                    List<TranscriptBubbleItem> list2 = ((TranscriptRow.Bubble) transcriptRow).items;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<TranscriptBubbleItem> it = list2.iterator();
                        while (it.hasNext()) {
                            if (it.next() instanceof TranscriptBubbleItem.Cards) {
                                return true;
                            }
                        }
                    }
                } else if (!(transcriptRow instanceof TranscriptRow.BareActivity)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return false;
    }

    public static final List<String> sequenceKeys(List<? extends TranscriptRow> list) {
        ArrayList arrayList = new ArrayList();
        for (TranscriptRow transcriptRow : list) {
            if (transcriptRow instanceof TranscriptRow.BareWidgets) {
                arrayList.add(((TranscriptRow.BareWidgets) transcriptRow).sequenceKey);
            } else if (transcriptRow instanceof TranscriptRow.Bubble) {
                Iterator<TranscriptBubbleItem> it = ((TranscriptRow.Bubble) transcriptRow).items.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getSequenceKey());
                }
            } else if (!(transcriptRow instanceof TranscriptRow.BareActivity)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }

    public static final String textSequenceKeyBase(int i) {
        return FGI.A0H("text:", i);
    }

    public static final String widgetSequenceKeyBase(List<String> list) {
        return FGI.A0M("widget:", AbstractC0878AGe.A0L(",", "", "", list, null));
    }

    public static final void CompleteSequencedContent(Object obj, Function0<Unit> function0, BFM bfm, int i) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass3;
        bfm.AgG(-1392576048);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, obj) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            bfm.Afo();
        } else {
            if (function0 == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(obj, function0, i);
                    bBbAAc.A06 = anonymousClass3;
                }
                return;
            }
            boolean zA1O = AnonymousClass001.A1O(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchTranscriptRendererKt$CompleteSequencedContent$2$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, obj);
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(obj, function0, i);
            bBbAAc.A06 = anonymousClass3;
        }
    }

    public static final boolean allRenderableIn(AHD<String> ahd, Set<String> set) {
        if (ahd.isEmpty()) {
            return false;
        }
        if ((ahd instanceof Collection) && ahd.isEmpty()) {
            return true;
        }
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final void coalesceAdjacentWidgetTokenSegments$flushWidgetTokens(List<String> list, List<HatchRenderSegment> list2) {
        if (list.isEmpty()) {
            return;
        }
        list2.add(new HatchRenderSegment.WidgetTokenSegment(AGI.A07(list)));
        list.clear();
    }

    public static final String segmentRevealKey(String str, TranscriptBubbleItem.Text text) {
        return FGI.A0U(str, ":", text.getSequenceKey());
    }
}
