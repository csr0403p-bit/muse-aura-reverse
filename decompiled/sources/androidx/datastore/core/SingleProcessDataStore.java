package androidx.datastore.core;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC9769Gfp;
import X.AbstractC9771Gfr;
import X.BLG;
import X.C05663ul;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C6JO;
import X.C6PH;
import X.C6PM;
import X.C8630Fhh;
import X.C8899FtG;
import X.C8983Fvi;
import X.C9772Gfs;
import X.C9776Gfx;
import X.F0C;
import X.FZO;
import X.FZS;
import X.G0V;
import X.GAt;
import X.HnJ;
import X.HnO;
import X.HtJ;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class SingleProcessDataStore<T> implements C6JO<T> {
    public List<? extends G0V<? super C6PM<T>, ? super HtJ<? super Unit>, ? extends Object>> A00;
    public final C8983Fvi<AbstractC9771Gfr<T>> A01;
    public final Function0<File> A03;
    public final C6PH<T> A05;
    public final HnO<T> A06;
    public final C3UX A07;
    public static final Set<String> A0A = C3cG.A0k();
    public static final Object A09 = C3cG.A0T();
    public final C20Q<T> A08 = new C05663ul(new C8899FtG(this, (HtJ) null, (HtJ<? super C8899FtG>) 3));
    public final F0C A02 = AbstractC7607F5u.A1A(null, FZO.A02(this, 0));
    public final BLG<AbstractC9769Gfp<T>> A04 = HnJ.A01(C9776Gfx.A00);

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C9772Gfs r8, androidx.datastore.core.SingleProcessDataStore r9, X.HtJ r10) {
        /*
            r3 = 0
            boolean r0 = r10 instanceof X.C8911FtT
            if (r0 == 0) goto L2d
            r4 = r10
            X.FtT r4 = (X.C8911FtT) r4
            int r0 = r4.$t
            if (r0 != r3) goto L2d
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A04
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r6 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 == r2) goto L40
            if (r0 == r7) goto L33
            if (r0 == r6) goto L40
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.FtT r4 = new X.FtT
            r4.<init>(r9, r10, r3)
            goto L17
        L33:
            java.lang.Object r3 = r4.A03
            X.Hsz r3 = (X.InterfaceC10560Hsz) r3
            java.lang.Object r9 = r4.A02
            androidx.datastore.core.SingleProcessDataStore r9 = (androidx.datastore.core.SingleProcessDataStore) r9
            java.lang.Object r8 = r4.A01
            X.Gfs r8 = (X.C9772Gfs) r8
            goto L8c
        L40:
            java.lang.Object r3 = r4.A01
            X.Hsz r3 = (X.InterfaceC10560Hsz) r3
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> La8
            goto Lad
        L48:
            X.Hwg.A00(r1)
            X.Hsz<T> r3 = r8.A03
            X.BLG<X.Gfp<T>> r0 = r9.A04     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> La8
            X.Gfp r1 = (X.AbstractC9769Gfp) r1     // Catch: java.lang.Throwable -> La8
            boolean r0 = r1 instanceof X.C9773Gfu     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L68
            X.G0V<T, X.HtJ<? super T>, java.lang.Object> r1 = r8.A02     // Catch: java.lang.Throwable -> La8
            X.78T r0 = r8.A01     // Catch: java.lang.Throwable -> La8
            r4.A01 = r3     // Catch: java.lang.Throwable -> La8
            r4.A00 = r2     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = A06(r9, r4, r0, r1)     // Catch: java.lang.Throwable -> La8
            if (r1 != r5) goto Lad
            return r5
        L68:
            boolean r0 = r1 instanceof X.C9774Gfv     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L7e
            boolean r0 = r1 instanceof X.C9776Gfx     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L7e
            boolean r0 = r1 instanceof X.C9775Gfw     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L79
            X.Gfw r1 = (X.C9775Gfw) r1     // Catch: java.lang.Throwable -> La8
            java.lang.Throwable r0 = r1.A00     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        L79:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        L7e:
            X.Gfp<T> r0 = r8.A00     // Catch: java.lang.Throwable -> La8
            if (r1 != r0) goto La3
            X.C8911FtT.A00(r8, r9, r3, r4, r7)     // Catch: java.lang.Throwable -> La8
            java.lang.Object r0 = A02(r9, r4)     // Catch: java.lang.Throwable -> La8
            if (r0 != r5) goto L8f
            return r5
        L8c:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> La8
        L8f:
            X.G0V<T, X.HtJ<? super T>, java.lang.Object> r2 = r8.A02     // Catch: java.lang.Throwable -> La8
            X.78T r1 = r8.A01     // Catch: java.lang.Throwable -> La8
            r4.A01 = r3     // Catch: java.lang.Throwable -> La8
            r0 = 0
            r4.A02 = r0     // Catch: java.lang.Throwable -> La8
            r4.A03 = r0     // Catch: java.lang.Throwable -> La8
            r4.A00 = r6     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = A06(r9, r4, r1, r2)     // Catch: java.lang.Throwable -> La8
            if (r1 != r5) goto Lad
            return r5
        La3:
            X.Gfv r1 = (X.C9774Gfv) r1     // Catch: java.lang.Throwable -> La8
            java.lang.Throwable r0 = r1.A00     // Catch: java.lang.Throwable -> La8
            throw r0     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        Lad:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto Lb9
            X.C3cG.A1F(r3, r1)
        Lb6:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        Lb9:
            r3.A6f(r0)
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A00(X.Gfs, androidx.datastore.core.SingleProcessDataStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.datastore.core.SingleProcessDataStore r14, X.HtJ r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A01(androidx.datastore.core.SingleProcessDataStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(androidx.datastore.core.SingleProcessDataStore r5, X.HtJ r6) {
        /*
            r4 = 1
            boolean r0 = r6 instanceof X.C8913FtV
            if (r0 == 0) goto L26
            r3 = r6
            X.FtV r3 = (X.C8913FtV) r3
            int r0 = r3.$t
            if (r0 != r4) goto L26
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r3.A00 = r2
        L17:
            java.lang.Object r2 = r3.A02
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            if (r0 == 0) goto L35
            if (r0 != r4) goto L30
            java.lang.Object r5 = r3.A01
            androidx.datastore.core.SingleProcessDataStore r5 = (androidx.datastore.core.SingleProcessDataStore) r5
            goto L2c
        L26:
            X.FtV r3 = new X.FtV
            r3.<init>(r5, r6, r4)
            goto L17
        L2c:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L46
            goto L43
        L30:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L35:
            X.Hwg.A00(r2)
            r3.A01 = r5     // Catch: java.lang.Throwable -> L46
            r3.A00 = r4     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = A01(r5, r3)     // Catch: java.lang.Throwable -> L46
            if (r0 != r1) goto L43
            return r1
        L43:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L46:
            r2 = move-exception
            X.BLG<X.Gfp<T>> r1 = r5.A04
            X.Gfv r0 = new X.Gfv
            r0.<init>(r2)
            X.AnonymousClass002.A1I(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A02(androidx.datastore.core.SingleProcessDataStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(androidx.datastore.core.SingleProcessDataStore r5, X.HtJ r6) {
        /*
            r3 = 2
            boolean r0 = r6 instanceof X.C8913FtV
            if (r0 == 0) goto L27
            r4 = r6
            X.FtV r4 = (X.C8913FtV) r4
            int r0 = r4.$t
            if (r0 != r3) goto L27
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A02
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L31
            java.lang.Object r5 = r4.A01
            androidx.datastore.core.SingleProcessDataStore r5 = (androidx.datastore.core.SingleProcessDataStore) r5
            goto L2d
        L27:
            X.FtV r4 = new X.FtV
            r4.<init>(r5, r6, r3)
            goto L17
        L2d:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L44
            goto L4f
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L36:
            X.Hwg.A00(r3)
            r4.A01 = r5     // Catch: java.lang.Throwable -> L44
            r4.A00 = r0     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = A01(r5, r4)     // Catch: java.lang.Throwable -> L44
            if (r0 != r2) goto L4f
            return r2
        L44:
            r2 = move-exception
            X.BLG<X.Gfp<T>> r1 = r5.A04
            X.Gfv r0 = new X.Gfv
            r0.<init>(r2)
            X.AnonymousClass002.A1I(r1, r0)
        L4f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A03(androidx.datastore.core.SingleProcessDataStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(androidx.datastore.core.SingleProcessDataStore r6, X.HtJ r7) throws java.io.FileNotFoundException {
        /*
            r5 = 1
            boolean r0 = r7 instanceof X.C8911FtT
            if (r0 == 0) goto Ld
            r0 = r7
            X.FtT r0 = (X.C8911FtT) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r5) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L35
            r4 = r7
            X.FtT r4 = (X.C8911FtT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.A00 = r2
        L1e:
            java.lang.Object r0 = r4.A04
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            if (r1 == 0) goto L3f
            if (r1 != r5) goto L7d
            java.lang.Object r1 = r4.A03
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r4.A02
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r6 = r4.A01
            androidx.datastore.core.SingleProcessDataStore r6 = (androidx.datastore.core.SingleProcessDataStore) r6
            goto L3b
        L35:
            X.FtT r4 = new X.FtT
            r4.<init>(r6, r7, r5)
            goto L1e
        L3b:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L60
            goto L5c
        L3f:
            X.Hwg.A00(r0)
            X.F0C r0 = r6.A02     // Catch: java.io.FileNotFoundException -> L67
            java.lang.Object r0 = r0.getValue()     // Catch: java.io.FileNotFoundException -> L67
            java.io.File r0 = (java.io.File) r0     // Catch: java.io.FileNotFoundException -> L67
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L67
            r2.<init>(r0)     // Catch: java.io.FileNotFoundException -> L67
            r1 = 0
            X.HnO<T> r0 = r6.A06     // Catch: java.lang.Throwable -> L60
            X.C8911FtT.A00(r6, r2, r1, r4, r5)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.AZL(r2)     // Catch: java.lang.Throwable -> L60
            if (r0 != r3) goto L5c
            return r3
        L5c:
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.io.FileNotFoundException -> L67
            return r0
        L60:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.io.FileNotFoundException -> L67
            throw r0     // Catch: java.io.FileNotFoundException -> L67
        L67:
            r1 = move-exception
            X.F0C r0 = r6.A02
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            boolean r0 = r0.exists()
            if (r0 != 0) goto L81
            X.HnO<T> r0 = r6.A06
            java.lang.Object r0 = r0.AEj()
            return r0
        L7d:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L81:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A04(androidx.datastore.core.SingleProcessDataStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(androidx.datastore.core.SingleProcessDataStore r7, X.HtJ r8) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            r3 = 0
            boolean r0 = r8 instanceof X.C8912FtU
            if (r0 == 0) goto Ld
            r0 = r8
            X.FtU r0 = (X.C8912FtU) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r3) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L36
            r6 = r8
            X.FtU r6 = (X.C8912FtU) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r6.A00 = r2
        L1e:
            java.lang.Object r5 = r6.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r6.A00
            r3 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L65
            if (r1 == r0) goto L5f
            if (r1 == r2) goto L45
            if (r1 != r3) goto L40
            java.lang.Object r4 = r6.A02
            java.lang.Object r1 = r6.A01
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            goto L3c
        L36:
            X.FtU r6 = new X.FtU
            r6.<init>(r7, r8, r3)
            goto L1e
        L3c:
            X.Hwg.A00(r5)     // Catch: java.io.IOException -> L5a
            return r4
        L40:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L45:
            java.lang.Object r1 = r6.A02
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r6.A01
            androidx.datastore.core.SingleProcessDataStore r0 = (androidx.datastore.core.SingleProcessDataStore) r0
            X.Hwg.A00(r5)
            X.C8912FtU.A00(r1, r5, r6, r3)     // Catch: java.io.IOException -> L5a
            java.lang.Object r0 = r0.A07(r5, r6)     // Catch: java.io.IOException -> L5a
            if (r0 != r4) goto L73
            return r4
        L5a:
            r0 = move-exception
            X.CU7.A01(r1, r0)
            throw r1
        L5f:
            java.lang.Object r7 = r6.A01
            X.Hwg.A00(r5)     // Catch: androidx.datastore.core.CorruptionException -> L74
            return r5
        L65:
            X.Hwg.A00(r5)
            r6.A01 = r7     // Catch: androidx.datastore.core.CorruptionException -> L74
            r6.A00 = r0     // Catch: androidx.datastore.core.CorruptionException -> L74
            java.lang.Object r5 = A04(r7, r6)     // Catch: androidx.datastore.core.CorruptionException -> L74
            if (r5 != r4) goto L73
            return r4
        L73:
            return r5
        L74:
            r1 = move-exception
            X.C8912FtU.A00(r7, r1, r6, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A05(androidx.datastore.core.SingleProcessDataStore, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(androidx.datastore.core.SingleProcessDataStore r10, X.HtJ r11, X.C78T r12, X.G0V r13) {
        /*
            r6 = 2
            boolean r0 = r11 instanceof X.C8911FtT
            if (r0 == 0) goto L8c
            r5 = r11
            X.FtT r5 = (X.C8911FtT) r5
            int r0 = r5.$t
            if (r0 != r6) goto L8c
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r2 = r5.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 0
            r9 = 1
            if (r0 == 0) goto L3f
            if (r0 == r9) goto L64
            if (r0 != r6) goto L92
            java.lang.Object r7 = r5.A02
            java.lang.Object r10 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            X.Hwg.A00(r2)
        L2e:
            X.BLG<X.Gfp<T>> r2 = r10.A04
            int r1 = X.C60R.A01(r7)
            X.Gfu r0 = new X.Gfu
            r0.<init>(r7, r1)
            X.GCn r2 = (X.C9286GCn) r2
            X.C9286GCn.A00(r3, r0, r2)
        L3e:
            return r7
        L3f:
            X.Hwg.A00(r2)
            X.BLG<X.Gfp<T>> r0 = r10.A04
            java.lang.Object r8 = r0.getValue()
            X.Gfu r8 = (X.C9773Gfu) r8
            T r7 = r8.A01
            int r1 = X.C60R.A01(r7)
            int r0 = r8.A00
            if (r1 != r0) goto L9e
            r1 = 4
            X.FtG r0 = new X.FtG
            r0.<init>(r7, r13, r3, r1)
            X.C8911FtT.A00(r10, r8, r7, r5, r9)
            java.lang.Object r2 = X.GAo.A00(r5, r12, r0)
            if (r2 != r4) goto L71
        L63:
            return r4
        L64:
            java.lang.Object r7 = r5.A03
            java.lang.Object r8 = r5.A02
            X.Gfu r8 = (X.C9773Gfu) r8
            java.lang.Object r10 = r5.A01
            androidx.datastore.core.SingleProcessDataStore r10 = (androidx.datastore.core.SingleProcessDataStore) r10
            X.Hwg.A00(r2)
        L71:
            T r0 = r8.A01
            int r1 = X.C60R.A01(r0)
            int r0 = r8.A00
            if (r1 != r0) goto L97
            boolean r0 = X.C7384Etj.areEqual(r7, r2)
            if (r0 != 0) goto L3e
            X.C8911FtT.A00(r10, r2, r3, r5, r6)
            java.lang.Object r0 = r10.A07(r2, r5)
            if (r0 == r4) goto L63
            r7 = r2
            goto L2e
        L8c:
            X.FtT r5 = new X.FtT
            r5.<init>(r10, r11, r6)
            goto L17
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L97:
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L9e:
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A06(androidx.datastore.core.SingleProcessDataStore, X.HtJ, X.78T, X.G0V):java.lang.Object");
    }

    @Override // X.C6JO
    public final Object Ahr(G0V<? super T, ? super HtJ<? super T>, ? extends Object> g0v, HtJ<? super T> htJ) {
        GAt gAt = new GAt(null);
        this.A01.A00(new C9772Gfs(this.A04.getValue(), htJ.getContext(), g0v, gAt));
        return gAt.A0E(htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(T r10, X.HtJ<? super kotlin.Unit> r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore.A07(java.lang.Object, X.HtJ):java.lang.Object");
    }

    @Override // X.C6JO
    public final C20Q<T> AEa() {
        return this.A08;
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+Ljava/io/File;>;LX/HnO<TT;>;Ljava/util/List<+LX/G0V<-LX/6PM<TT;>;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;>;LX/6PH<TT;>;LX/3UX;)V */
    public SingleProcessDataStore(C6PH c6ph, HnO hnO, List list, Function0 function0, C3UX c3ux) {
        this.A03 = function0;
        this.A06 = hnO;
        this.A05 = c6ph;
        this.A07 = c3ux;
        this.A00 = AbstractC0878AGe.A0X(list);
        this.A01 = new C8983Fvi<>(c3ux, FZS.A02(this, 2), new C8630Fhh(4), new C8899FtG(this, (HtJ) null, (HtJ<? super C8899FtG>) 1));
    }
}
