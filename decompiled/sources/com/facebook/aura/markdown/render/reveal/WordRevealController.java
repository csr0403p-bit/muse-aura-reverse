package com.facebook.aura.markdown.render.reveal;

import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00r;
import X.C00s;
import X.C06H;
import X.C1BO;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.G0V;
import X.HtJ;
import X.HzP;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class WordRevealController {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long DOCUMENT_INTERVAL_MS = 50;

    @Deprecated
    public static final int INITIAL_FADE_MAX_WORDS = 30;

    @Deprecated
    public static final long MIN_STAGGER_MS = 1;

    @Deprecated
    public static final long WORD_FADE_MS = 300;

    @Deprecated
    public static final long WORD_STAGGER_MS = 18;
    public Long lastDocumentAdvanceMs;
    public long nextStampAtMs;
    public final C00r textLength$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r renderedTotal$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r documentCharOffset$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00r settledWords$delegate = new ParcelableSnapshotMutableIntState(0);
    public final C00s frameMs$delegate = new ParcelableSnapshotMutableLongState(0);
    public int reconciledCharOffset = -1;
    public final ArrayList<Long> paintAtMs = C3cG.A0h();

    @DebugMetadata(c = "com.facebook.aura.markdown.render.reveal.WordRevealController", f = "WordRevealController.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures, 44}, m = "run", v = 2)
    /* renamed from: com.facebook.aura.markdown.render.reveal.WordRevealController$run$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WordRevealController.this.run(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.markdown.render.reveal.WordRevealController$run$3", f = "WordRevealController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.markdown.render.reveal.WordRevealController$run$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final long run$lambda$1(long j) {
        return j;
    }

    private final void advanceDocument(long j) {
        if (this.documentCharOffset$delegate.AGd() < this.textLength$delegate.AGd()) {
            Long l = this.lastDocumentAdvanceMs;
            if (l == null || j - l.longValue() >= 50) {
                setDocumentCharOffset(this.textLength$delegate.AGd());
                this.lastDocumentAdvanceMs = Long.valueOf(j);
            }
        }
    }

    private final void advanceSettledWords() {
        while (this.settledWords$delegate.AGd() < this.paintAtMs.size()) {
            long jAHH = this.frameMs$delegate.AHH();
            Long l = this.paintAtMs.get(this.settledWords$delegate.AGd());
            C7384Etj.A0U(l);
            if (jAHH - C3cG.A05(l) < 300) {
                return;
            } else {
                setSettledWords(this.settledWords$delegate.AGd() + 1);
            }
        }
    }

    private final void dropStaleStamps() {
        int iMax = Math.max(this.renderedTotal$delegate.AGd(), this.settledWords$delegate.AGd());
        ArrayList<Long> arrayList = this.paintAtMs;
        if (iMax < arrayList.size()) {
            arrayList.subList(iMax, arrayList.size()).clear();
            this.nextStampAtMs = C60P.A01((Number) AbstractC0878AGe.A0I(this.paintAtMs));
        }
    }

    private final long getFrameMs() {
        return this.frameMs$delegate.AHH();
    }

    private final boolean hasPendingWork() {
        return this.textLength$delegate.AGd() > this.documentCharOffset$delegate.AGd() || this.renderedTotal$delegate.AGd() > this.paintAtMs.size();
    }

    private final void setDocumentCharOffset(int i) {
        this.documentCharOffset$delegate.AdX(i);
    }

    private final void setFrameMs(long j) {
        this.frameMs$delegate.Adh(j);
    }

    private final void setSettledWords(int i) {
        this.settledWords$delegate.AdX(i);
    }

    private final void stampNewWords(long j) {
        this.reconciledCharOffset = this.documentCharOffset$delegate.AGd();
        dropStaleStamps();
        int iAGd = this.renderedTotal$delegate.AGd();
        ArrayList<Long> arrayList = this.paintAtMs;
        int size = iAGd - arrayList.size();
        if (size > 0) {
            int i = 0;
            if (!arrayList.isEmpty() || size <= 30) {
                long jA07 = ATD.A07(300 / ((arrayList.size() - this.settledWords$delegate.AGd()) + size), 1L, 18L);
                j = Math.max(j, this.nextStampAtMs);
                do {
                    this.paintAtMs.add(Long.valueOf(j));
                    j += jA07;
                    i++;
                } while (i < size);
            } else {
                long j2 = j - 300;
                do {
                    arrayList.add(Long.valueOf(j2));
                    i++;
                } while (i < size);
            }
            this.nextStampAtMs = j;
        }
    }

    public final float alpha(int i) {
        float f = 1.0f;
        if (i >= this.settledWords$delegate.AGd()) {
            long jAHH = this.frameMs$delegate.AHH();
            f = 0.0f;
            if (((Number) AbstractC0878AGe.A0A(i, this.paintAtMs)) != null) {
                return ATD.A02(jAHH - r0.longValue(), 300.0f);
            }
        }
        return f;
    }

    public final int getDocumentCharOffset() {
        return this.documentCharOffset$delegate.AGd();
    }

    public final int getRenderedTotal() {
        return this.renderedTotal$delegate.AGd();
    }

    public final int getSettledWords() {
        return this.settledWords$delegate.AGd();
    }

    public final int getTextLength() {
        return this.textLength$delegate.AGd();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006d -> B:12:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object run(final X.C1BO<java.lang.Boolean> r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.markdown.render.reveal.WordRevealController.AnonymousClass1
            if (r0 == 0) goto L78
            r5 = r9
            com.facebook.aura.markdown.render.reveal.WordRevealController$run$1 r5 = (com.facebook.aura.markdown.render.reveal.WordRevealController.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L74
            if (r0 == r3) goto L70
            if (r0 != r4) goto L7e
            java.lang.Object r8 = r5.L$0
            X.1BO r8 = (X.C1BO) r8
            X.Hwg.A00(r1)
        L27:
            long r0 = X.C3cG.A05(r1)
            r7.setFrameMs(r0)
            r7.stampNewWords(r0)
            r7.advanceDocument(r0)
            r7.advanceSettledWords()
        L37:
            boolean r0 = r7.isIdle()
            if (r0 == 0) goto L60
            boolean r0 = X.C1BO.A0F(r8)
            if (r0 != 0) goto L46
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L46:
            com.facebook.aura.markdown.render.reveal.WordRevealController$$ExternalSyntheticLambda0 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealController$$ExternalSyntheticLambda0
            r0.<init>()
            r2 = 0
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.markdown.render.reveal.WordRevealController$run$3 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealController$run$3
            r0.<init>(r2)
            r5.L$0 = r8
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r1)
            if (r0 != r6) goto L37
            return r6
        L60:
            com.facebook.aura.markdown.render.reveal.WordRevealController$$ExternalSyntheticLambda1 r0 = new com.facebook.aura.markdown.render.reveal.WordRevealController$$ExternalSyntheticLambda1
            r0.<init>()
            r5.L$0 = r8
            r5.label = r4
            java.lang.Object r1 = X.AvW.A00(r0, r5)
            if (r1 != r6) goto L27
            return r6
        L70:
            java.lang.Object r8 = r5.L$0
            X.1BO r8 = (X.C1BO) r8
        L74:
            X.Hwg.A00(r1)
            goto L37
        L78:
            com.facebook.aura.markdown.render.reveal.WordRevealController$run$1 r5 = new com.facebook.aura.markdown.render.reveal.WordRevealController$run$1
            r5.<init>(r9)
            goto L12
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.markdown.render.reveal.WordRevealController.run(X.1BO, X.HtJ):java.lang.Object");
    }

    public final void setRenderedTotal(int i) {
        this.renderedTotal$delegate.AdX(i);
    }

    public final void setTextLength(int i) {
        this.textLength$delegate.AdX(i);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final boolean isIdle() {
        return !hasPendingWork() && this.reconciledCharOffset == this.documentCharOffset$delegate.AGd() && this.settledWords$delegate.AGd() >= this.paintAtMs.size();
    }

    public static final boolean run$lambda$0(C1BO c1bo, WordRevealController wordRevealController) {
        return !C1BO.A0F(c1bo) || wordRevealController.hasPendingWork();
    }
}
