package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.C3UX;
import X.C7384Etj;
import X.C7Bm;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.spaces.cache.SpacesDiskCache;
import com.facebook.aura.spaces.repo.SpaceCard;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SpaceSnapshotRenderer {
    public static final int $stable = 8;
    public final Context context;

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRenderer", f = "SpaceSnapshotRenderer.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, 78}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceSnapshotRenderer$render$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceSnapshotRenderer.this.render(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2", f = "SpaceSnapshotRenderer.kt", l = {110, 119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ String $authToken;
        public final /* synthetic */ SpaceCard $card;
        public final /* synthetic */ SpacesDiskCache $diskCache;
        public final /* synthetic */ SpaceWidgetSize $size;
        public final /* synthetic */ String $sourceUrl;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SpaceWidgetSize spaceWidgetSize, SpacesDiskCache spacesDiskCache, String str, AbstractC3358CGz abstractC3358CGz, String str2, SpaceCard spaceCard, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$size = spaceWidgetSize;
            this.$diskCache = spacesDiskCache;
            this.$sourceUrl = str;
            this.$userSession = abstractC3358CGz;
            this.$authToken = str2;
            this.$card = spaceCard;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceSnapshotRenderer.this.new AnonymousClass2(this.$size, this.$diskCache, this.$sourceUrl, this.$userSession, this.$authToken, this.$card, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x014a: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:330), block:B:49:0x014a */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
        /* JADX WARN: Type inference failed for: r6v8, types: [android.webkit.WebView] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 339
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceSnapshotRenderer.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SpaceSnapshotRenderer(Context context) {
        C7384Etj.A0Y(context, 0);
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(X.AbstractC3358CGz r11, com.facebook.aura.spaces.repo.SpaceCard r12, com.facebook.aura.widgets.SpaceWidgetSize r13, X.HtJ<? super android.graphics.Bitmap> r14) {
        /*
            r10 = this;
            r4 = r14
            r8 = r13
            r13 = r12
            boolean r0 = r14 instanceof com.facebook.aura.widgets.SpaceSnapshotRenderer.AnonymousClass1
            r7 = r10
            if (r0 == 0) goto L28
            r3 = r4
            com.facebook.aura.widgets.SpaceSnapshotRenderer$render$1 r3 = (com.facebook.aura.widgets.SpaceSnapshotRenderer.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r12 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 2
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 == r6) goto L59
            if (r0 != r1) goto L2e
            X.Hwg.A00(r12)
            return r12
        L28:
            com.facebook.aura.widgets.SpaceSnapshotRenderer$render$1 r3 = new com.facebook.aura.widgets.SpaceSnapshotRenderer$render$1
            r3.<init>(r14)
            goto L16
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r12)
            com.facebook.aura.spaces.repo.CardMetadata r0 = r13.metadata
            r5 = 0
            if (r0 == 0) goto L90
            java.lang.String r10 = r0.sourceUrl
            if (r10 == 0) goto L90
            X.78T r4 = X.AnonymousClass001.A0y()
            com.facebook.aura.widgets.SpaceSnapshotRenderer$render$authToken$1 r0 = new com.facebook.aura.widgets.SpaceSnapshotRenderer$render$authToken$1
            r0.<init>(r11, r5)
            r3.L$0 = r11
            r3.L$1 = r13
            r3.L$2 = r8
            r3.L$3 = r10
            r3.label = r6
            java.lang.Object r12 = X.GAo.A00(r3, r4, r0)
            if (r12 != r2) goto L6b
        L58:
            return r2
        L59:
            java.lang.Object r10 = r3.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r8 = r3.L$2
            com.facebook.aura.widgets.SpaceWidgetSize r8 = (com.facebook.aura.widgets.SpaceWidgetSize) r8
            java.lang.Object r13 = r3.L$1
            com.facebook.aura.spaces.repo.SpaceCard r13 = (com.facebook.aura.spaces.repo.SpaceCard) r13
            java.lang.Object r0 = r3.L$0
            X.CGz r11 = X.C60O.A0D(r0, r12)
        L6b:
            java.lang.String r12 = (java.lang.String) r12
            com.facebook.aura.spaces.cache.SpacesDiskCache$Companion r0 = com.facebook.aura.spaces.cache.SpacesDiskCache.Companion
            com.facebook.aura.spaces.cache.SpacesDiskCache r9 = r0.getInstance(r11)
            X.GB9 r0 = com.facebook.aura.executors.AuraDispatchers.main
            r14 = 0
            com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2 r6 = new com.facebook.aura.widgets.SpaceSnapshotRenderer$render$2
            r6.<init>(r8, r9, r10, r11, r12, r13, r14)
            r3.L$0 = r14
            r3.L$1 = r14
            r3.L$2 = r14
            r3.L$3 = r14
            r3.L$4 = r14
            r3.L$5 = r14
            r3.label = r1
            java.lang.Object r0 = X.GAo.A00(r3, r0, r6)
            if (r0 == r2) goto L58
            return r0
        L90:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceSnapshotRenderer.render(X.CGz, com.facebook.aura.spaces.repo.SpaceCard, com.facebook.aura.widgets.SpaceWidgetSize, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object hasVisibleContent(WebView webView, HtJ<? super Boolean> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        webView.evaluateJavascript(SpaceSnapshotRendererKt.VISIBLE_CONTENT_JS, new ValueCallback() { // from class: com.facebook.aura.widgets.SpaceSnapshotRenderer$hasVisibleContent$2$1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str) {
                gblA03.resumeWith(Boolean.valueOf("true".equals(str)));
            }
        });
        return gblA03.A0F();
    }
}
