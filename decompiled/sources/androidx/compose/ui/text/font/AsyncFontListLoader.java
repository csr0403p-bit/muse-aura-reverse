package androidx.compose.ui.text.font;

import X.AbstractC1798ArH;
import X.B0J;
import X.B0K;
import X.B98;
import X.B9B;
import X.C1BO;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AsyncFontListLoader implements C1BO<Object> {
    public boolean A00 = true;
    public final MutableState A01;
    public final B98 A02;
    public final AsyncTypefaceCache A03;
    public final B0J A04;
    public final List<B9B> A05;
    public final G0U<B0K, Unit> A06;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:15:0x0035, B:33:0x0093, B:23:0x005a, B:25:0x0066, B:35:0x0097, B:30:0x0082, B:19:0x004a, B:21:0x0051), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:15:0x0035, B:33:0x0093, B:23:0x005a, B:25:0x0066, B:35:0x0097, B:30:0x0082, B:19:0x004a, B:21:0x0051), top: B:44:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:33:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:33:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.HtJ<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.A01(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.B9B r8, X.HtJ<java.lang.Object> r9) {
        /*
            r7 = this;
            r3 = 18
            boolean r0 = r9 instanceof X.C2312BTm
            if (r0 == 0) goto Le
            r0 = r9
            X.BTm r0 = (X.C2312BTm) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L2e
            r6 = r9
            X.BTm r6 = (X.C2312BTm) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r6.A00 = r2
        L1f:
            java.lang.Object r2 = r6.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L38
            if (r0 != r1) goto L7d
            java.lang.Object r8 = r6.A01
            goto L34
        L2e:
            X.BTm r6 = new X.BTm
            r6.<init>(r7, r9, r3)
            goto L1f
        L34:
            X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L71
            return r2
        L38:
            X.Hwg.A00(r2)
            r0 = 40
            X.BU6 r2 = X.BU6.A0M(r7, r8, r5, r0)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L71
            r6.A01 = r8     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L71
            r6.A00 = r1     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L71
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r0 = X.GAX.A01(r6, r2, r0)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L71
            if (r0 != r3) goto L4e
            return r3
        L4e:
            return r0
        L4f:
            r4 = move-exception
            X.78T r1 = r6.getContext()
            X.78p r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            X.78X r3 = r1.get(r0)
            kotlinx.coroutines.CoroutineExceptionHandler r3 = (kotlinx.coroutines.CoroutineExceptionHandler) r3
            if (r3 == 0) goto L7c
            X.78T r2 = r6.getContext()
            java.lang.String r0 = "Unable to load font "
            java.lang.String r1 = X.AnonymousClass007.A0a(r0, r8)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1, r4)
            r3.handleException(r2, r0)
            return r5
        L71:
            r1 = move-exception
            X.78T r0 = r6.getContext()
            boolean r0 = X.HzS.A06(r0)
            if (r0 == 0) goto L81
        L7c:
            return r5
        L7d:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L81:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.A00(X.B9B, X.HtJ):java.lang.Object");
    }

    @Override // X.C1BO
    public final Object getValue() {
        return this.A01.getValue();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<+LX/B9B;>;Ljava/lang/Object;LX/B0J;Landroidx/compose/ui/text/font/AsyncTypefaceCache;LX/G0U<-LX/B0K;Lkotlin/Unit;>;LX/B98;)V */
    public AsyncFontListLoader(AsyncTypefaceCache asyncTypefaceCache, B98 b98, B0J b0j, Object obj, List list, G0U g0u) {
        this.A05 = list;
        this.A04 = b0j;
        this.A03 = asyncTypefaceCache;
        this.A06 = g0u;
        this.A02 = b98;
        this.A01 = AbstractC1798ArH.A06(obj);
    }
}
