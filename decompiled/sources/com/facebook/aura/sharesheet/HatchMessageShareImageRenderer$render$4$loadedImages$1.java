package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import android.graphics.Bitmap;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$loadedImages$1", f = "HatchMessageShareImageRenderer.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageShareImageRenderer$render$4$loadedImages$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<String, ? extends Bitmap>>, Object> {
    public final /* synthetic */ AuraMarkdownDocument $document;
    public final /* synthetic */ G0V<String, HtJ<? super Bitmap>, Object> $imageLoader;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageShareImageRenderer$render$4$loadedImages$1(AuraMarkdownDocument auraMarkdownDocument, G0V<? super String, ? super HtJ<? super Bitmap>, ? extends Object> g0v, HtJ<? super HatchMessageShareImageRenderer$render$4$loadedImages$1> htJ) {
        super(2, htJ);
        this.$document = auraMarkdownDocument;
        this.$imageLoader = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchMessageShareImageRenderer$render$4$loadedImages$1 hatchMessageShareImageRenderer$render$4$loadedImages$1 = new HatchMessageShareImageRenderer$render$4$loadedImages$1(this.$document, this.$imageLoader, htJ);
        hatchMessageShareImageRenderer$render$4$loadedImages$1.L$0 = obj;
        return hatchMessageShareImageRenderer$render$4$loadedImages$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Map<String, ? extends Bitmap>> htJ) {
        return invoke2(c3ux, (HtJ<? super Map<String, Bitmap>>) htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r8 = r9.L$0
            X.3UX r8 = (X.C3UX) r8
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L52
            if (r0 != r5) goto L91
            java.lang.Object r3 = r9.L$5
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r9.L$3
            java.util.Collection r4 = (java.util.Collection) r4
            X.Hwg.A00(r10)
        L19:
            X.HxE r10 = (X.HxE) r10
            A r2 = r10.first
            B r1 = r10.second
            if (r1 == 0) goto L29
            X.HxE r0 = new X.HxE
            r0.<init>(r2, r1)
            r4.add(r0)
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r3.next()
            X.27k r0 = (X.C27k) r0
            r9.L$0 = r6
            r9.L$1 = r6
            r9.L$2 = r6
            r9.L$3 = r4
            r9.L$4 = r6
            r9.L$5 = r3
            r9.L$6 = r6
            r9.L$7 = r6
            r9.L$8 = r6
            r9.label = r5
            X.GBM r0 = (X.GBM) r0
            java.lang.Object r10 = r0.A0E(r9)
            if (r10 != r7) goto L19
            return r7
        L52:
            X.Hwg.A00(r10)
            com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer$Companion r1 = com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer.Companion
            com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument r0 = r9.$document
            java.util.List r0 = r1.imageUrls(r0)
            java.util.List r0 = X.AbstractC0878AGe.A0T(r0)
            X.G0V<java.lang.String, X.HtJ<? super android.graphics.Bitmap>, java.lang.Object> r4 = r9.$imageLoader
            java.util.ArrayList r3 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r2 = r0.iterator()
        L6b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L82
            java.lang.String r1 = X.AnonymousClass005.A0j(r2)
            com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1 r0 = new com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$loadedImages$1$1$1
            r0.<init>(r1, r4, r6)
            X.Hrx r0 = X.AnonymousClass001.A10(r0, r8)
            r3.add(r0)
            goto L6b
        L82:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
            goto L29
        L8c:
            java.util.Map r0 = X.AGH.A06(r4)
            return r0
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$loadedImages$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super Map<String, Bitmap>> htJ) {
        return ((HatchMessageShareImageRenderer$render$4$loadedImages$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
