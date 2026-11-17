package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C3cG;
import X.C7384Etj;
import X.C9258GBl;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class PhotoLabelScanner {
    public static final PhotoLabelScanner INSTANCE = new PhotoLabelScanner();
    public static final InterfaceC2261BLa decodeMutex = new C9258GBl();

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotoLabelScanner", f = "PhotoLabelScanner.kt", l = {63, 68}, m = "filterByLabels", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotoLabelScanner$filterByLabels$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoLabelScanner.this.filterByLabels(null, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotoLabelScanner", f = "PhotoLabelScanner.kt", l = {157, 137, 139}, m = "labelAndCache", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCache$1, reason: invalid class name and case insensitive filesystem */
    public final class C111331 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111331(HtJ<? super C111331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoLabelScanner.this.labelAndCache(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.photos.PhotoLabelScanner", f = "PhotoLabelScanner.kt", l = {123}, m = "labelAndCacheGuarded", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCacheGuarded$1, reason: invalid class name and case insensitive filesystem */
    public final class C111341 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C111341(HtJ<? super C111341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PhotoLabelScanner.this.labelAndCacheGuarded(null, null, null, this);
        }
    }

    public static /* synthetic */ Object filterByLabels$default(PhotoLabelScanner photoLabelScanner, Context context, List list, List list2, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        return photoLabelScanner.filterByLabels(context, list, list2, i, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object labelAndCache(android.content.Context r13, com.facebook.aura.commands.photos.PhotoLabelDao r14, com.facebook.aura.commands.photos.PhotoEntry r15, X.HtJ<? super com.facebook.aura.commands.photos.PhotoLabelResult> r16) throws java.lang.Throwable {
        /*
            r12 = this;
            r4 = r16
            boolean r0 = r4 instanceof com.facebook.aura.commands.photos.PhotoLabelScanner.C111331
            if (r0 == 0) goto L2c
            r2 = r4
            com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCache$1 r2 = (com.facebook.aura.commands.photos.PhotoLabelScanner.C111331) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L2c
            int r3 = r3 - r1
            r2.label = r3
        L14:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r6 = r2.label
            r4 = 3
            r7 = 2
            r5 = 1
            r0 = 0
            if (r6 == 0) goto L58
            if (r6 == r5) goto L44
            if (r6 == r7) goto L37
            if (r6 != r4) goto L32
            java.lang.Object r1 = r2.L$3
            X.Hwg.A00(r3)
            return r1
        L2c:
            com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCache$1 r2 = new com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCache$1
            r2.<init>(r4)
            goto L14
        L32:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L37:
            java.lang.Object r6 = r2.L$3
            X.BLa r6 = (X.InterfaceC2261BLa) r6
            java.lang.Object r15 = r2.L$2
            com.facebook.aura.commands.photos.PhotoEntry r15 = (com.facebook.aura.commands.photos.PhotoEntry) r15
            java.lang.Object r14 = r2.L$1
            com.facebook.aura.commands.photos.PhotoLabelDao r14 = (com.facebook.aura.commands.photos.PhotoLabelDao) r14
            goto L8a
        L44:
            java.lang.Object r6 = r2.L$3
            X.BLa r6 = (X.InterfaceC2261BLa) r6
            java.lang.Object r15 = r2.L$2
            com.facebook.aura.commands.photos.PhotoEntry r15 = (com.facebook.aura.commands.photos.PhotoEntry) r15
            java.lang.Object r14 = r2.L$1
            com.facebook.aura.commands.photos.PhotoLabelDao r14 = (com.facebook.aura.commands.photos.PhotoLabelDao) r14
            java.lang.Object r13 = r2.L$0
            android.content.Context r13 = (android.content.Context) r13
            X.Hwg.A00(r3)
            goto L6e
        L58:
            X.Hwg.A00(r3)
            X.BLa r6 = com.facebook.aura.commands.photos.PhotoLabelScanner.decodeMutex
            r2.L$0 = r13
            r2.L$1 = r14
            r2.L$2 = r15
            r2.L$3 = r6
            r2.label = r5
            java.lang.Object r3 = r6.APs(r0, r2)
            if (r3 != r1) goto L6e
            return r1
        L6e:
            com.facebook.aura.commands.photos.MlKitPhotoLabeler r5 = com.facebook.aura.commands.photos.MlKitPhotoLabeler.INSTANCE     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r3 = r15.uri     // Catch: java.lang.Throwable -> Lc0
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> Lc0
            X.C7384Etj.A0U(r3)     // Catch: java.lang.Throwable -> Lc0
            r2.L$0 = r0     // Catch: java.lang.Throwable -> Lc0
            r2.L$1 = r14     // Catch: java.lang.Throwable -> Lc0
            r2.L$2 = r15     // Catch: java.lang.Throwable -> Lc0
            r2.L$3 = r6     // Catch: java.lang.Throwable -> Lc0
            r2.label = r7     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r3 = r5.labelsFor(r13, r3, r2)     // Catch: java.lang.Throwable -> Lc0
            if (r3 != r1) goto L8d
            return r1
        L8a:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> Lc2
        L8d:
            com.facebook.aura.commands.photos.PhotoLabelResult r3 = (com.facebook.aura.commands.photos.PhotoLabelResult) r3     // Catch: java.lang.Throwable -> Lc2
            r6.Ahe(r0)
            boolean r5 = r3 instanceof com.facebook.aura.commands.photos.PhotoLabelResult.Labels
            if (r5 == 0) goto Lbf
            java.lang.String r6 = r15.uri
            long r7 = r15.sizeBytes
            long r9 = r15.dateModifiedSeconds
            r5 = r3
            com.facebook.aura.commands.photos.PhotoLabelResult$Labels r5 = (com.facebook.aura.commands.photos.PhotoLabelResult.Labels) r5
            java.util.List<java.lang.String> r5 = r5.values
            java.lang.String r11 = com.facebook.aura.commands.photos.PhotoLabelCacheKt.encodeLabels(r5)
            long r12 = java.lang.System.currentTimeMillis()
            com.facebook.aura.commands.photos.PhotoLabelEntity r5 = new com.facebook.aura.commands.photos.PhotoLabelEntity
            r5.<init>(r6, r7, r9, r11, r12)
            r2.L$0 = r0
            r2.L$1 = r0
            r2.L$2 = r0
            r2.L$3 = r3
            r2.label = r4
            java.lang.Object r0 = r14.upsert(r5, r2)
            if (r0 != r1) goto Lbf
            return r1
        Lbf:
            return r3
        Lc0:
            r1 = move-exception
            goto Lc3
        Lc2:
            r1 = move-exception
        Lc3:
            r6.Ahe(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotoLabelScanner.labelAndCache(android.content.Context, com.facebook.aura.commands.photos.PhotoLabelDao, com.facebook.aura.commands.photos.PhotoEntry, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object labelAndCacheGuarded(android.content.Context r6, com.facebook.aura.commands.photos.PhotoLabelDao r7, com.facebook.aura.commands.photos.PhotoEntry r8, X.HtJ<? super com.facebook.aura.commands.photos.PhotoLabelResult> r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.photos.PhotoLabelScanner.C111341
            if (r0 == 0) goto L1e
            r4 = r9
            com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCacheGuarded$1 r4 = (com.facebook.aura.commands.photos.PhotoLabelScanner.C111341) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L24
            goto L3c
        L1e:
            com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCacheGuarded$1 r4 = new com.facebook.aura.commands.photos.PhotoLabelScanner$labelAndCacheGuarded$1
            r4.<init>(r9)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
            r4.L$1 = r0     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
            r4.L$2 = r0     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
            r4.label = r1     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
            java.lang.Object r3 = r5.labelAndCache(r6, r7, r8, r4)     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
            if (r3 != r2) goto L3f
            return r2
        L3c:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
        L3f:
            com.facebook.aura.commands.photos.PhotoLabelResult r3 = (com.facebook.aura.commands.photos.PhotoLabelResult) r3     // Catch: java.lang.Exception -> L42 java.util.concurrent.CancellationException -> L55
            return r3
        L42:
            r0 = move-exception
            java.lang.String r1 = X.C3cI.A0Y(r0)
            java.lang.String r0 = "label scan item failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "PhotoLabelScanner"
            X.CFK.A06(r0, r1)
            com.facebook.aura.commands.photos.PhotoLabelResult$Failed r0 = com.facebook.aura.commands.photos.PhotoLabelResult.Failed.INSTANCE
            return r0
        L55:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotoLabelScanner.labelAndCacheGuarded(android.content.Context, com.facebook.aura.commands.photos.PhotoLabelDao, com.facebook.aura.commands.photos.PhotoEntry, X.HtJ):java.lang.Object");
    }

    private final boolean matchesAny(List<String> list, List<? extends List<String>> list2) {
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<? extends List<String>> it = list2.iterator();
            while (it.hasNext()) {
                if (INSTANCE.containsRun(list, it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e3, code lost:
    
        r4.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        if (r4.size() < r30) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ee, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:19:0x0065, B:30:0x00c9], limit reached: 83 */
    /* JADX WARN: Path cross not found for [B:30:0x00c9, B:19:0x0065], limit reached: 83 */
    /* JADX WARN: Path cross not found for [B:30:0x00c9, B:21:0x006b], limit reached: 83 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da A[PHI: r4 r5 r8 r11 r12 r15
  0x01da: PHI (r4v6 java.util.List) = (r4v7 java.util.List), (r4v11 java.util.List) binds: [B:64:0x01d8, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r5v5 long) = (r5v6 long), (r5v10 long) binds: [B:64:0x01d8, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r8v4 int) = (r8v5 int), (r8v10 int) binds: [B:64:0x01d8, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r11v3 int) = (r11v4 int), (r11v8 int) binds: [B:64:0x01d8, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r12v3 int) = (r12v4 int), (r12v10 int) binds: [B:64:0x01d8, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r15v3 int) = (r15v4 int), (r15v9 int) binds: [B:64:0x01d8, B:40:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01dd A[PHI: r4 r5 r8 r11 r12 r15
  0x01dd: PHI (r4v4 java.util.List) = (r4v6 java.util.List), (r4v7 java.util.List) binds: [B:66:0x01db, B:64:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r5v1 long) = (r5v5 long), (r5v6 long) binds: [B:66:0x01db, B:64:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r8v1 int) = (r8v4 int), (r8v5 int) binds: [B:66:0x01db, B:64:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r11v1 int) = (r11v3 int), (r11v4 int) binds: [B:66:0x01db, B:64:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r12v1 int) = (r12v3 int), (r12v4 int) binds: [B:66:0x01db, B:64:0x01d8] A[DONT_GENERATE, DONT_INLINE]
  0x01dd: PHI (r15v1 int) = (r15v3 int), (r15v4 int) binds: [B:66:0x01db, B:64:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006b A[EDGE_INSN: B:74:0x006b->B:21:0x006b BREAK  A[LOOP:0: B:31:0x00cd->B:76:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.facebook.aura.commands.photos.PhotoLabelScanner] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0139 -> B:17:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0170 -> B:14:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object filterByLabels(android.content.Context r27, java.util.List<com.facebook.aura.commands.photos.PhotoEntry> r28, java.util.List<java.lang.String> r29, int r30, X.HtJ<? super com.facebook.aura.commands.photos.PhotoLabelScan> r31) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.PhotoLabelScanner.filterByLabels(android.content.Context, java.util.List, java.util.List, int, X.HtJ):java.lang.Object");
    }

    private final boolean containsRun(List<String> list, List<String> list2) {
        int size;
        if (list2.isEmpty() || list2.size() > list.size() || (size = list.size() - list2.size()) < 0) {
            return false;
        }
        for (int i = 0; !C7384Etj.areEqual(list.subList(i, list2.size() + i), list2); i++) {
            if (i == size) {
                return false;
            }
        }
        return true;
    }

    private final List<String> tokenize(String str) {
        List listA05 = PhotoLabelScannerKt.NON_ALPHANUMERIC.A05(AnonymousClass001.A0u(str));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return arrayListA0h;
    }
}
