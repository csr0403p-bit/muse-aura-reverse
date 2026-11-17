package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.facebook.aura.network.AuraAcceptLanguage;
import com.google.common.collect.ComparatorOrdering;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class DoW extends AbstractC5736DoV implements DwA {
    public static final DOM<Integer> A09 = new ComparatorOrdering(new C7572F4l(4));
    public DrN A00;
    public C6136Dwe A01;
    public C5737DoX A02;
    public Boolean A03;
    public Thread A04;
    public final Context A05;
    public final Object A06 = C3cG.A0T();
    public final boolean A07;
    public final InterfaceC5380DhX A08;

    public static Pair A03(List list, int[] iArr) {
        AbstractC5809Dpt abstractC5809Dpt = (AbstractC5809Dpt) list.get(0);
        return Pair.create(new C5378DhV(abstractC5809Dpt.A03, iArr), Integer.valueOf(abstractC5809Dpt.A00));
    }

    public static void A05(C5382DhZ c5382DhZ, DoW doW, AbstractCollection abstractCollection, AbstractCollection abstractCollection2) {
        if (doW.A01.A0E && !abstractCollection.isEmpty() && abstractCollection.size() == c5382DhZ.A01) {
            abstractCollection2.clear();
            abstractCollection2.add(abstractCollection);
        }
    }

    public static void A06(C6136Dwe c6136Dwe, DoW doW) {
        boolean zEquals;
        synchronized (doW.A06) {
            zEquals = doW.A01.equals(c6136Dwe);
            doW.A01 = c6136Dwe;
        }
        if (zEquals) {
            return;
        }
        if (c6136Dwe.A0C && doW.A05 == null) {
            CNC.A04("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        InterfaceC6069Dv7 interfaceC6069Dv7 = ((AbstractC5823DqC) doW).A00;
        if (interfaceC6069Dv7 != null) {
            interfaceC6069Dv7.AWe();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A07(X.DoW r3) {
        /*
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            X.Dwe r0 = r3.A01     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.A0C     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L26
            r0 = 32
            if (r1 < r0) goto L1a
            X.DoX r0 = r3.A02     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L1a
            boolean r1 = r0.A03()     // Catch: java.lang.Throwable -> L26
            r0 = 1
            if (r1 != 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L25
            X.Dv7 r0 = r3.A00
            if (r0 == 0) goto L25
            r0.AWe()
        L25:
            return
        L26:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L26
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DoW.A07(X.DoW):void");
    }

    public static boolean A08(C6154Dwx c6154Dwx) {
        String str;
        String str2 = c6154Dwx.A0b;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -2123537834:
                    str = "audio/eac3-joc";
                    break;
                case 187078296:
                    str = "audio/ac3";
                    break;
                case 187078297:
                    str = "audio/ac4";
                    break;
                case 1504578661:
                    str = "audio/eac3";
                    break;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC5823DqC
    public void A0B() {
        C5737DoX c5737DoX;
        C5737DoX c5737DoX2;
        boolean z = this.A07;
        synchronized (this.A06) {
            if (!z) {
                if (Util.A00 >= 32 && (c5737DoX = this.A02) != null) {
                    c5737DoX.A00();
                }
                super.A0B();
                return;
            }
            Thread thread = this.A04;
            if (thread != null && !AnonymousClass002.A1Z(thread, Thread.currentThread())) {
                throw C3cG.A0Q(String.valueOf("DefaultTrackSelector is accessed on the wrong thread."));
            }
            if (Build.VERSION.SDK_INT >= 32 && (c5737DoX2 = this.A02) != null) {
                c5737DoX2.A00();
                this.A02 = null;
            }
            super.A0B();
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dod;[[[I[ILX/Dy6;Landroidx/media3/common/Timeline;)Landroid/util/Pair<[LX/Dsl;[LX/Dic;>; */
    @Override // X.AbstractC5736DoV
    public final Pair A0C(Timeline timeline, Dy6 dy6, C5742Dod c5742Dod, int[] iArr, int[][][] iArr2) throws ClassNotFoundException {
        C6136Dwe c6136Dwe;
        boolean z;
        int i;
        Context context;
        synchronized (this.A06) {
            this.A04 = Thread.currentThread();
            c6136Dwe = this.A01;
        }
        Boolean boolValueOf = this.A03;
        if (boolValueOf == null && (context = this.A05) != null) {
            boolValueOf = Boolean.valueOf(Util.A0P(context));
            this.A03 = boolValueOf;
        }
        if (c6136Dwe.A0C && Build.VERSION.SDK_INT >= 32 && this.A02 == null) {
            this.A02 = new C5737DoX(this.A05, this, boolValueOf);
        }
        int i2 = c5742Dod.A00;
        C5378DhV[] c5378DhVArrA0G = A0G(c6136Dwe, c5742Dod, iArr, iArr2);
        HashMap mapA0u = BV4.A0u();
        for (int i3 = 0; i3 < i2; i3++) {
            C5414DiA c5414DiA = c5742Dod.A04[i3];
            for (int i4 = 0; i4 < c5414DiA.A01; i4++) {
                c6136Dwe.A0M.get(c5414DiA.A02.get(i4));
            }
        }
        C5414DiA c5414DiA2 = c5742Dod.A01;
        for (int i5 = 0; i5 < c5414DiA2.A01; i5++) {
            c6136Dwe.A0M.get(c5414DiA2.A02.get(i5));
        }
        for (int i6 = 0; i6 < i2; i6++) {
            mapA0u.get(Integer.valueOf(c5742Dod.A03[i6]));
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C5414DiA c5414DiA3 = c5742Dod.A04[i7];
            SparseArray sparseArray = c6136Dwe.A00;
            Map map = (Map) sparseArray.get(i7);
            if (map != null && map.containsKey(c5414DiA3)) {
                Map map2 = (Map) sparseArray.get(i7);
                if (map2 != null) {
                    map2.get(c5414DiA3);
                }
                c5378DhVArrA0G[i7] = null;
            }
        }
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = c5742Dod.A03[i8];
            if (c6136Dwe.A01.get(i8) || c6136Dwe.A0N.contains(Integer.valueOf(i9))) {
                c5378DhVArrA0G[i8] = null;
            }
        }
        InterfaceC5380DhX interfaceC5380DhX = this.A08;
        InterfaceC5047DQt interfaceC5047DQt = super.A01;
        C1G.A05(interfaceC5047DQt);
        InterfaceC5441Dic[] interfaceC5441DicArrA83 = interfaceC5380DhX.A83(timeline, dy6, interfaceC5047DQt, c5378DhVArrA0G);
        C5951Dsl[] c5951DslArr = new C5951Dsl[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            int[] iArr3 = c5742Dod.A03;
            c5951DslArr[i10] = (c6136Dwe.A01.get(i10) || c6136Dwe.A0N.contains(Integer.valueOf(iArr3[i10])) || (iArr3[i10] != -2 && interfaceC5441DicArrA83[i10] == null)) ? null : C5951Dsl.A01;
        }
        if (c6136Dwe.A0H) {
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i2; i13++) {
                int i14 = c5742Dod.A03[i13];
                InterfaceC5441Dic interfaceC5441Dic = interfaceC5441DicArrA83[i13];
                if ((i14 == 1 || i14 == 2) && interfaceC5441Dic != null) {
                    int[][] iArr4 = iArr2[i13];
                    int iIndexOf = c5742Dod.A04[i13].A02.indexOf(interfaceC5441Dic.ALt());
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    while (true) {
                        if (i < interfaceC5441Dic.length()) {
                            i = (iArr4[iIndexOf][interfaceC5441Dic.AGQ(i)] & 32) == 32 ? i + 1 : 0;
                        } else if (i14 != 1) {
                            if (i11 != -1) {
                                z = false;
                                break;
                            }
                            i11 = i13;
                        } else {
                            if (i12 != -1) {
                                z = false;
                                break;
                            }
                            i12 = i13;
                        }
                    }
                }
            }
            z = true;
            if (i12 != -1 && i11 != -1 && (z & true)) {
                C5951Dsl c5951Dsl = new C5951Dsl(true);
                c5951DslArr[i12] = c5951Dsl;
                c5951DslArr[i11] = c5951Dsl;
            }
        }
        return Pair.create(c5951DslArr, interfaceC5441DicArrA83);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Dod;[[[I[ILX/Dwe;Ljava/lang/String;)Landroid/util/Pair<LX/DhV;Ljava/lang/Integer;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair A0D(X.C6136Dwe r33, X.C5742Dod r34, java.lang.String r35, int[] r36, int[][][] r37) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DoW.A0D(X.Dwe, X.Dod, java.lang.String, int[], int[][][]):android.util.Pair");
    }

    public final C6136Dwe A0E() {
        C6136Dwe c6136Dwe;
        synchronized (this.A06) {
            c6136Dwe = this.A01;
        }
        return c6136Dwe;
    }

    public final /* synthetic */ boolean A0F(C6154Dwx c6154Dwx, C6136Dwe c6136Dwe) {
        boolean z;
        Boolean bool;
        C5737DoX c5737DoX;
        C5737DoX c5737DoX2;
        int i;
        C5737DoX c5737DoX3;
        C5737DoX c5737DoX4;
        if (!this.A07) {
            synchronized (this.A06) {
                z = !c6136Dwe.A0C || ((bool = this.A03) != null && bool.booleanValue()) || c6154Dwx.A06 <= 2 || ((A08(c6154Dwx) && (Util.A00 < 32 || (c5737DoX2 = this.A02) == null || !c5737DoX2.A03())) || (Build.VERSION.SDK_INT >= 32 && (c5737DoX = this.A02) != null && c5737DoX.A03() && c5737DoX.A01() && this.A02.A02() && this.A02.A04(this.A00, c6154Dwx)));
            }
            return z;
        }
        if (!c6136Dwe.A0C) {
            return true;
        }
        Boolean bool2 = this.A03;
        if ((bool2 != null && bool2.booleanValue()) || (i = c6154Dwx.A06) == -1 || i <= 2) {
            return true;
        }
        if (!A08(c6154Dwx) || (Build.VERSION.SDK_INT >= 32 && (c5737DoX4 = this.A02) != null && c5737DoX4.A03())) {
            return Build.VERSION.SDK_INT >= 32 && (c5737DoX3 = this.A02) != null && c5737DoX3.A03() && c5737DoX3.A01() && this.A02.A02() && this.A02.A04(this.A00, c6154Dwx);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0268, code lost:
    
        if (r13 == null) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C5378DhV[] A0G(final X.C6136Dwe r39, X.C5742Dod r40, int[] r41, int[][][] r42) throws java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DoW.A0G(X.Dwe, X.Dod, int[], int[][][]):X.DhV[]");
    }

    public DoW(Context context, C6141Dwj c6141Dwj, InterfaceC5380DhX interfaceC5380DhX) {
        this.A05 = context != null ? context.getApplicationContext() : null;
        this.A08 = interfaceC5380DhX;
        C6136Dwe c6136Dwe = (C6136Dwe) c6141Dwj;
        this.A01 = c6136Dwe;
        this.A00 = DrN.A02;
        if (c6136Dwe.A0C && context == null) {
            CNC.A04("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        this.A07 = AbstractC5653Dmh.A03(EnumC5618Dlz.A1r);
    }

    public static int A02(C6154Dwx c6154Dwx, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c6154Dwx.A0a)) {
            return 4;
        }
        String strA04 = A04(str);
        String strA042 = A04(c6154Dwx.A0a);
        if (strA042 == null || strA04 == null) {
            return (z && strA042 == null) ? 1 : 0;
        }
        if (strA042.startsWith(strA04) || strA04.startsWith(strA042)) {
            return 3;
        }
        return strA042.split("-", 2)[0].equals(strA04.split("-", 2)[0]) ? 2 : 0;
    }

    public static String A04(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, AuraAcceptLanguage.UNDETERMINED_TAG)) {
            return null;
        }
        return str;
    }
}
