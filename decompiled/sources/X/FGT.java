package X;

import com.facebook.rendercore.RenderUnit$RenderUnitOperationException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FGT<MOUNT_CONTENT> {
    public static final HxE<Long, Long> A06 = HxE.A00(BV7.A0o());
    public C0918AHu<FH1, FG4> A00;
    public C0918AHu<FH1, FG4> A01;
    public List<FG4> A02;
    public List<FG4> A03;
    public final FG7 A04;
    public final List<FG4> A05;

    /* JADX WARN: Illegal instructions before constructor call */
    public FGT() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(null, c0881AGi, c0881AGi);
    }

    public void A0T(C7834FGp<?, ? super MOUNT_CONTENT, ?> c7834FGp) {
        C7384Etj.A0Y(c7834FGp, 0);
        List<FG4> listA0h = this.A02;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
        }
        if (listA0h == null) {
            this.A02 = listA0h;
            if (this.A00 != null) {
                throw C3cG.A0Q("Binder Map and Binder List out of sync!");
            }
            this.A00 = new C0918AHu<>(6);
        }
        C0918AHu<FH1, FG4> c0918AHu = this.A00;
        if (c0918AHu != null) {
            A05(c0918AHu, c7834FGp, this, C79.A01, listA0h);
        }
    }

    public void A0U(C7834FGp<?, ? super MOUNT_CONTENT, ?> c7834FGp) {
        C7384Etj.A0Y(c7834FGp, 0);
        List<FG4> listA0h = this.A03;
        if (listA0h == null) {
            listA0h = C3cG.A0h();
        }
        if (listA0h == null) {
            this.A03 = listA0h;
            if (this.A01 != null) {
                throw C3cG.A0Q("Binder Map and Binder List out of sync!");
            }
            this.A01 = new C0918AHu<>(6);
        }
        C0918AHu<FH1, FG4> c0918AHu = this.A01;
        if (c0918AHu != null) {
            A05(c0918AHu, c7834FGp, this, C79.A00, listA0h);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;Ljava/util/List<LX/FG4;>;Ljava/util/List<LX/FG4;>;LX/AHr<LX/FH1;LX/FG4;>;Ljava/lang/Object;Ljava/lang/Object;LX/AHs<LX/FGg;>;)J */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A02(X.AbstractC0915AHr r16, X.AbstractC0916AHs r17, X.FG6 r18, java.lang.Object r19, java.lang.Object r20, java.util.List r21, java.util.List r22) {
        /*
            r9 = r21
            r5 = r22
            if (r21 == 0) goto Laf
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Laf
            if (r22 == 0) goto L9a
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L9a
            int r0 = r5.size()
            X.AHu r8 = new X.AHu
            r8.<init>(r0)
            int r6 = r5.size()
            r4 = 0
            r12 = 0
        L24:
            r10 = 1
            r7 = 1
            if (r4 >= r6) goto L6d
            java.lang.Object r3 = r5.get(r4)
            X.FG4 r3 = (X.FG4) r3
            X.FGg r0 = r3.A03
            X.FH1 r2 = r0.A01
            r0 = r16
            if (r16 == 0) goto L68
            java.lang.Object r1 = r0.A05(r2)
            X.FG4 r1 = (X.FG4) r1
            if (r1 == 0) goto L68
            X.FGg r0 = r3.A03
            r14 = r17
            boolean r0 = r14.A05(r0)
            if (r0 != 0) goto L56
            r14 = r19
            r0 = r20
            r15 = r18
            boolean r0 = r3.A05(r1, r15, r14, r0)
            if (r0 != 0) goto L56
            r7 = 0
        L56:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A0E(r2, r0)
            if (r7 != 0) goto L68
            r1.A01(r3)
            boolean r0 = r1.A04()
            if (r0 == 0) goto L6a
        L68:
            long r10 = r10 << r4
            long r12 = r12 | r10
        L6a:
            int r4 = r4 + 1
            goto L24
        L6d:
            r6 = 32
            int r5 = r9.size()
            r3 = 0
            r2 = 0
        L76:
            if (r2 >= r5) goto L97
            X.FG4 r0 = A03(r9, r2)
            X.FGg r0 = r0.A03
            X.FH1 r1 = r0.A01
            boolean r0 = r8.A07(r1)
            if (r0 == 0) goto L90
            java.lang.Object r0 = r8.A05(r1)
            boolean r0 = X.C3cG.A1P(r0, r7)
            if (r0 == 0) goto L94
        L90:
            long r0 = r10 << r2
            long r0 = r0 | r3
            r3 = r0
        L94:
            int r2 = r2 + 1
            goto L76
        L97:
            long r3 = r3 << r6
            long r3 = r3 | r12
            return r3
        L9a:
            r5 = 32
            int r2 = r9.size()
            if (r2 < r5) goto La9
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
        La7:
            long r3 = r3 << r5
            return r3
        La9:
            r0 = 1
            long r3 = r0 << r2
            long r3 = r3 - r0
            goto La7
        Laf:
            r3 = 0
            if (r22 == 0) goto Lc6
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lc6
            int r2 = r5.size()
            r0 = 32
            if (r2 < r0) goto Lc7
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
        Lc6:
            return r3
        Lc7:
            r0 = 1
            long r3 = r0 << r2
            long r3 = r3 - r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.A02(X.AHr, X.AHs, X.FG6, java.lang.Object, java.lang.Object, java.util.List, java.util.List):long");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;Ljava/util/List<LX/FG4;>;Ljava/util/List<LX/FG4;>;Ljava/lang/Object;Ljava/lang/Object;LX/AHs<LX/FGg;>;)LX/HxE<Ljava/lang/Long;Ljava/lang/Long;>; */
    public static final HxE A04(AbstractC0916AHs abstractC0916AHs, FG6 fg6, Object obj, Object obj2, List list, List list2) {
        if ((list != null && !list.isEmpty()) || (list2 != null && !list2.isEmpty())) {
            if (!C7384Etj.areEqual(list != null ? C60Q.A0W(list) : null, list2 != null ? C60Q.A0W(list2) : null)) {
                throw C3cG.A0Q(AnonymousClass006.A0y(list2 != null ? C60Q.A0W(list2) : null, "\nnewFixedBinders.size() = ", C3cG.A0f(list != null ? C60Q.A0W(list) : null, "Current and new fixed Mount Binders are of sync: \ncurrentFixedBinders.size() = ")));
            }
            if (list != null && list2 != null) {
                int size = list.size();
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    FG4 fg4A03 = A03(list, i);
                    FG4 fg4A032 = A03(list2, i);
                    if (abstractC0916AHs.A05(fg4A032.A03) || fg4A032.A05(fg4A03, fg6, obj, obj2)) {
                        j |= 1 << i;
                    } else if (fg4A03.A04()) {
                        j2 |= 1 << i;
                        fg4A03.A01(fg4A032);
                    }
                }
                return C3cG.A0r(Long.valueOf(j), Long.valueOf(j2));
            }
        }
        return A06;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;Ljava/util/List<LX/FG4;>;Ljava/util/List<LX/FG4;>;LX/AHr<LX/FH1;LX/FG4;>;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List<LX/FG4;>;Ljava/util/List<LX/FG4;>;LX/AHs<LX/FGg;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.AbstractC0915AHr r13, X.AbstractC0916AHs r14, X.FG6 r15, java.lang.Object r16, java.lang.Object r17, java.util.List r18, java.util.List r19, java.util.List r20, java.util.List r21) {
        /*
            r9 = r20
            r8 = r18
            r10 = r19
            if (r18 == 0) goto L97
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L97
            r7 = r21
            if (r19 == 0) goto L93
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L93
            int r0 = r10.size()
            X.AHu r6 = new X.AHu
            r6.<init>(r0)
            int r5 = r10.size()
            r4 = 0
        L26:
            if (r4 >= r5) goto L6d
            X.FG4 r3 = A03(r10, r4)
            X.FGg r0 = r3.A03
            X.FH1 r11 = r0.A01
            if (r13 == 0) goto L67
            java.lang.Object r2 = r13.A05(r11)
            X.FG4 r2 = (X.FG4) r2
            if (r2 == 0) goto L67
            X.FGg r0 = r3.A03
            boolean r12 = r14.A05(r0)
            if (r12 == 0) goto L47
            X.FGB r0 = r15.A03
            r1 = 1
            if (r0 != 0) goto L55
        L47:
            r1 = 1
            if (r12 != 0) goto L55
            r12 = r16
            r0 = r17
            boolean r0 = r3.A05(r2, r15, r12, r0)
            if (r0 != 0) goto L55
            r1 = 0
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.A0E(r11, r0)
            if (r1 != 0) goto L67
            r2.A01(r3)
            boolean r0 = r2.A04()
            if (r0 == 0) goto L6a
        L67:
            r9.add(r3)
        L6a:
            int r4 = r4 + 1
            goto L26
        L6d:
            r5 = 1
            int r4 = r8.size()
            r3 = 0
        L73:
            if (r3 >= r4) goto L9c
            X.FG4 r2 = A03(r8, r3)
            X.FGg r0 = r2.A03
            X.FH1 r1 = r0.A01
            boolean r0 = r6.A07(r1)
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r6.A05(r1)
            boolean r0 = X.C3cG.A1P(r0, r5)
            if (r0 == 0) goto L90
        L8d:
            r7.add(r2)
        L90:
            int r3 = r3 + 1
            goto L73
        L93:
            r7.addAll(r8)
            return
        L97:
            if (r19 == 0) goto L9c
            r9.addAll(r10)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.A06(X.AHr, X.AHs, X.FG6, java.lang.Object, java.lang.Object, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }

    public long A0J() {
        if (this instanceof FHi) {
            return ((FHi) this).A01;
        }
        if (this instanceof FI2) {
            return ((FI2) this).A00;
        }
        if (this instanceof FHV) {
            return ((FHV) this).A0E;
        }
        if (this instanceof C7862FHy) {
            return ((C7862FHy) this).A04;
        }
        if (this instanceof FIL) {
            return ((FIL) this).A00.A00;
        }
        if (this instanceof FGX) {
            return ((FGX) this).A00;
        }
        return 0L;
    }

    public InterfaceC7830FGl<MOUNT_CONTENT> A0K() {
        return this instanceof FHi ? (FHi) this : this instanceof FI2 ? (FI2) this : this instanceof FHV ? (FHV) this : this instanceof C7862FHy ? (C7862FHy) this : this instanceof FIL ? (InterfaceC7830FGl<MOUNT_CONTENT>) ((FIL) this).A00.A01 : this instanceof FGX ? (InterfaceC7830FGl<MOUNT_CONTENT>) ((FGX) this).A01 : (InterfaceC7830FGl<MOUNT_CONTENT>) ((HlT) this).A00;
    }

    public final String A0L() {
        if (!(this instanceof FIL)) {
            return this instanceof FGX ? ((FGX) this).A02 : AbstractC7608F5v.A0w(this);
        }
        Class clsAIr = ((FIL) this).A00.A01.AIr();
        C7384Etj.A0Y(clsAIr, 0);
        return BQG.A17(AnonymousClass007.A0a("poolKey:", clsAIr), 127);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e9, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/FG6;LX/AHs<LX/FGg;>;TMOUNT_CONTENT;Ljava/lang/Object;LX/FGm;)V */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:19:0x0060, B:21:0x0068, B:23:0x006e, B:29:0x0088, B:31:0x0093, B:33:0x0097, B:34:0x009b, B:41:0x00af, B:43:0x00b3, B:45:0x00bb, B:46:0x00bf, B:48:0x00c5, B:50:0x00c9, B:51:0x00cd, B:24:0x0073, B:26:0x0079, B:28:0x0084, B:36:0x00a1, B:38:0x00a5), top: B:72:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[PHI: r13
  0x00aa: PHI (r13v3 X.FH1) = (r13v2 X.FH1), (r13v8 X.FH1) binds: [B:37:0x00a3, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:19:0x0060, B:21:0x0068, B:23:0x006e, B:29:0x0088, B:31:0x0093, B:33:0x0097, B:34:0x009b, B:41:0x00af, B:43:0x00b3, B:45:0x00bb, B:46:0x00bf, B:48:0x00c5, B:50:0x00c9, B:51:0x00cd, B:24:0x0073, B:26:0x0079, B:28:0x0084, B:36:0x00a1, B:38:0x00a5), top: B:72:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0N(X.AbstractC0916AHs r22, X.C7831FGm r23, X.FG6 r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.A0N(X.AHs, X.FGm, X.FG6, java.lang.Object, java.lang.Object):void");
    }

    public final void A0S(FG1 fg1) {
        C0917AHt<FG4> c0917AHt = this.A04.A00;
        if (c0917AHt == null) {
            return;
        }
        Object[] objArr = c0917AHt.A04;
        long[] jArr = c0917AHt.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        ((FG4) C8j3.A11(objArr, i, i2)).A03(fg1);
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public Integer AJX() {
        return ((this instanceof FHi) || (this instanceof FI2) || (this instanceof FHV)) ? C79.A01 : this instanceof C7862FHy ? ((C7862FHy) this).A05 : this instanceof HlT ? ((HlT) this).A01 : A0K().AJX();
    }

    public static FG4 A03(List list, int i) {
        return (FG4) list.get(i);
    }

    public static final void A05(C0918AHu c0918AHu, C7834FGp c7834FGp, FGT fgt, Integer num, List list) {
        long jA0J = fgt.A0J();
        InterfaceC7833FGo<MODEL, CONTENT, BIND_DATA> interfaceC7833FGo = c7834FGp.A00;
        C7825FGg c7825FGg = new C7825FGg(interfaceC7833FGo.AGl(), num, jA0J);
        boolean z = FFH.A00;
        FG4 fg4 = new FG4(c7825FGg, fgt.A04, interfaceC7833FGo, c7834FGp.A01);
        FH1 fh1 = c7825FGg.A01;
        if (c0918AHu.A0C(fh1, fg4) != null) {
            int iA00 = C60O.A00(list);
            if (iA00 >= 0) {
                while (true) {
                    int i = iA00 - 1;
                    if (!A03(list, iA00).A03.A01.equals(fh1)) {
                        if (i < 0) {
                            break;
                        } else {
                            iA00 = i;
                        }
                    } else {
                        list.remove(iA00);
                        break;
                    }
                }
            }
            throw C3cG.A0Q("Binder Map and Binder List out of sync!");
        }
        list.add(fg4);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TMOUNT_CONTENT;Ljava/lang/Object;LX/FGm;)V */
    public void A0O(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        List<FG4> list = this.A02;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FG4 fg4A03 = A03(list, i);
                c7831FGm.A00(fg4A03.A03.A01, fg4A03.A00(fg6, obj, obj2), size);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TMOUNT_CONTENT;Ljava/lang/Object;LX/FGm;)V */
    public void A0P(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        int iA00;
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        List<FG4> list = this.A02;
        if (list == null || (iA00 = C60O.A00(list)) < 0) {
            return;
        }
        while (true) {
            int i = iA00 - 1;
            FG4 fg4A03 = A03(list, iA00);
            FH1 fh1 = fg4A03.A03.A01;
            C0918AHu<FH1, Object> c0918AHu = c7831FGm.A00;
            fg4A03.A02(fg6, obj, obj2, c0918AHu != null ? c0918AHu.A0B(fh1) : null);
            if (i < 0) {
                return;
            } else {
                iA00 = i;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TMOUNT_CONTENT;Ljava/lang/Object;LX/FGm;)V */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0Q(X.C7831FGm r7, X.FG6 r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            r6 = this;
            X.AnonymousClass005.A0y(r8, r9, r7)
            java.util.List<X.FG4> r4 = r6.A05
            if (r4 == 0) goto L1e
            int r3 = r4.size()
            r2 = 0
        Lc:
            if (r2 >= r3) goto L1e
            X.FG4 r1 = A03(r4, r2)
            java.lang.Object r0 = r1.A00(r8, r9, r10)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L60
            r7.A02(r0, r2, r3)     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L60
            int r2 = r2 + 1
            goto Lc
        L1c:
            r2 = move-exception
            goto L4e
        L1e:
            java.util.List<X.FG4> r5 = r6.A03
            if (r5 == 0) goto L62
            int r4 = r5.size()
            r2 = 0
        L27:
            if (r2 >= r4) goto L62
            X.FG4 r3 = A03(r5, r2)
            java.lang.Object r1 = r3.A00(r8, r9, r10)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L60
            X.FGg r0 = r3.A03     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L60
            X.FH1 r0 = r0.A01     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L60
            r7.A01(r0, r1, r4)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> L60
            int r2 = r2 + 1
            goto L27
        L3b:
            r2 = move-exception
            X.FGo<java.lang.Object, java.lang.Object, java.lang.Object> r0 = r3.A04     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r0.getDescription()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "Exception while mounting optional mount binder: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)     // Catch: java.lang.Throwable -> L60
            com.facebook.rendercore.RenderUnit$RenderUnitOperationException r1 = new com.facebook.rendercore.RenderUnit$RenderUnitOperationException     // Catch: java.lang.Throwable -> L60
            r1.<init>(r6, r0, r2)     // Catch: java.lang.Throwable -> L60
            goto L5f
        L4e:
            X.FGo<java.lang.Object, java.lang.Object, java.lang.Object> r0 = r1.A04     // Catch: java.lang.Throwable -> L60
            java.lang.String r1 = r0.getDescription()     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "Exception binding fixed mount binder: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)     // Catch: java.lang.Throwable -> L60
            com.facebook.rendercore.RenderUnit$RenderUnitOperationException r1 = new com.facebook.rendercore.RenderUnit$RenderUnitOperationException     // Catch: java.lang.Throwable -> L60
            r1.<init>(r6, r0, r2)     // Catch: java.lang.Throwable -> L60
        L5f:
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r0 = move-exception
            throw r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.A0Q(X.FGm, X.FG6, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TMOUNT_CONTENT;Ljava/lang/Object;LX/FGm;)V */
    public void A0R(C7831FGm c7831FGm, FG6 fg6, Object obj, Object obj2) {
        List<FG4> list;
        int iA00;
        Object obj3;
        int iA002;
        AnonymousClass005.A0y(fg6, obj, c7831FGm);
        List<FG4> list2 = this.A03;
        if (list2 != null && (iA002 = C60O.A00(list2)) >= 0) {
            while (true) {
                int i = iA002 - 1;
                FG4 fg4A03 = A03(list2, iA002);
                try {
                    FH1 fh1 = fg4A03.A03.A01;
                    C0918AHu<FH1, Object> c0918AHu = c7831FGm.A01;
                    fg4A03.A02(fg6, obj, obj2, c0918AHu != null ? c0918AHu.A0B(fh1) : null);
                    if (i < 0) {
                        break;
                    } else {
                        iA002 = i;
                    }
                } catch (Exception e) {
                    throw new RenderUnit$RenderUnitOperationException(this, FGI.A0d("Exception while unmounting optional binder: [", A0L(), "] ", fg4A03.A04.getDescription()), e);
                }
            }
            list = this.A05;
            if (list != null) {
                return;
            } else {
                return;
            }
        }
        list = this.A05;
        if (list != null || (iA00 = C60O.A00(list)) < 0) {
            return;
        }
        while (true) {
            int i2 = iA00 - 1;
            FG4 fg4A032 = A03(list, iA00);
            try {
                Object[] objArr = c7831FGm.A02;
                if (objArr != null) {
                    obj3 = objArr[iA00];
                    objArr[iA00] = null;
                } else {
                    obj3 = null;
                }
                fg4A032.A02(fg6, obj, obj2, obj3);
                if (i2 < 0) {
                    return;
                } else {
                    iA00 = i2;
                }
            } catch (Exception e2) {
                throw new RenderUnit$RenderUnitOperationException(this, FGI.A0M("Exception while unmounting fixed binder: ", fg4A032.A04.getDescription()), e2);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FG6;TMOUNT_CONTENT;LX/FGT<TMOUNT_CONTENT;>;Ljava/lang/Object;Ljava/lang/Object;LX/FGa;LX/FGm;ZLX/AHs<LX/FGg;>;)V */
    public void A0M(AbstractC0916AHs abstractC0916AHs, C7831FGm c7831FGm, FG6 fg6, C7819FGa c7819FGa, FGT fgt, Object obj, Object obj2, Object obj3, boolean z) {
        FG4 fg4A03;
        int iA00;
        FG4 fg4A032;
        Object obj4;
        int iA0K;
        List<FG4> list;
        List<FG4> list2;
        List<FG4> list3;
        FG4 fg4A033;
        int iA002;
        FG4 fg4A034;
        Object obj5;
        int iA003;
        List<FG4> list4;
        int iA004;
        AnonymousClass005.A0x(fg6, obj, fgt);
        C60O.A1N(c7831FGm, 6, abstractC0916AHs);
        if (AbstractC7609F5w.A0I(this.A02) <= 32 && (((list = fgt.A02) == null || list.size() <= 32) && (((list2 = this.A03) == null || list2.size() <= 32) && ((list3 = fgt.A03) == null || list3.size() <= 32)))) {
            try {
                List<FG4> list5 = fgt.A05;
                List<FG4> list6 = this.A05;
                HxE hxEA04 = A04(abstractC0916AHs, fg6, obj2, obj3, list5, list6);
                long jA05 = C3cG.A05(hxEA04.first);
                long jA052 = C3cG.A05(hxEA04.second);
                long jA02 = A02(fgt.A00, abstractC0916AHs, fg6, obj2, obj3, fgt.A02, this.A02);
                long j = jA02 & 4294967295L;
                long j2 = jA02 >>> 32;
                long jA022 = A02(fgt.A01, abstractC0916AHs, fg6, obj2, obj3, fgt.A03, this.A03);
                long j3 = jA022 & 4294967295L;
                long j4 = jA022 >>> 32;
                if (c7819FGa != null) {
                    List list7 = c7819FGa.A01;
                    if (0 < list7.size()) {
                        throw AbstractC7609F5w.A0n(list7);
                    }
                }
                if (z && (list4 = fgt.A02) != null && (iA004 = C60O.A00(list4)) >= 0) {
                    while (true) {
                        int i = iA004 - 1;
                        if ((j2 & (1 << iA004)) != 0) {
                            FG4 fg4A035 = A03(list4, iA004);
                            FH1 fh1 = fg4A035.A03.A01;
                            C0918AHu<FH1, Object> c0918AHu = c7831FGm.A00;
                            fg4A035.A02(fg6, obj, obj2, c0918AHu != null ? c0918AHu.A0B(fh1) : null);
                        }
                        if (i < 0) {
                            break;
                        } else {
                            iA004 = i;
                        }
                    }
                }
                List<FG4> list8 = fgt.A03;
                if (list8 != null && (iA003 = C60O.A00(list8)) >= 0) {
                    while (true) {
                        int i2 = iA003 - 1;
                        if ((j4 & (1 << iA003)) != 0) {
                            FG4 fg4A036 = A03(list8, iA003);
                            FH1 fh12 = fg4A036.A03.A01;
                            C0918AHu<FH1, Object> c0918AHu2 = c7831FGm.A01;
                            fg4A036.A02(fg6, obj, obj2, c0918AHu2 != null ? c0918AHu2.A0B(fh12) : null);
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            iA003 = i2;
                        }
                    }
                }
                if (jA05 != 0 && list6 != null && (iA002 = C60O.A00(list6)) >= 0) {
                    while (true) {
                        int i3 = iA002 - 1;
                        if ((jA05 & (1 << iA002)) != 0 && list5 != null && (fg4A034 = A03(list5, iA002)) != null) {
                            Object[] objArr = c7831FGm.A02;
                            if (objArr != null) {
                                obj5 = objArr[iA002];
                                objArr[iA002] = null;
                            } else {
                                obj5 = null;
                            }
                            fg4A034.A02(fg6, obj, obj2, obj5);
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            iA002 = i3;
                        }
                    }
                }
                if (jA05 != 0 && list6 != null) {
                    int size = list6.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        long j5 = 1 << i4;
                        boolean zA1L = AnonymousClass002.A1L(((jA05 & j5) > 0L ? 1 : ((jA05 & j5) == 0L ? 0 : -1)));
                        boolean z2 = (jA052 & j5) != 0;
                        if ((zA1L || z2) && (fg4A033 = A03(list6, i4)) != null) {
                            if (z2) {
                                fg4A033.A03(fg6.A01);
                            }
                            c7831FGm.A02(fg4A033.A00(fg6, obj, obj3), i4, size);
                        }
                    }
                }
                int iA0I = AbstractC7609F5w.A0I(this.A03);
                List<FG4> list9 = this.A03;
                if (list9 != null) {
                    int size2 = list9.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((1 << i5) & j3) != 0) {
                            FG4 fg4A037 = A03(list9, i5);
                            if (fg4A037.A04()) {
                                fg4A037.A03(fg6.A01);
                            } else {
                                c7831FGm.A01(fg4A037.A03.A01, fg4A037.A00(fg6, obj, obj3), iA0I);
                            }
                        }
                    }
                }
                int iA0I2 = AbstractC7609F5w.A0I(this.A02);
                List<FG4> list10 = this.A02;
                if (list10 != null) {
                    int size3 = list10.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        if ((j & (1 << i6)) != 0) {
                            FG4 fg4A038 = A03(list10, i6);
                            if (fg4A038.A04()) {
                                fg4A038.A03(fg6.A01);
                            } else {
                                c7831FGm.A00(fg4A038.A03.A01, fg4A038.A00(fg6, obj, obj3), iA0I2);
                            }
                        }
                    }
                    return;
                }
                return;
            } catch (Exception e) {
                throw new RenderUnit$RenderUnitOperationException(this, "Exception resolving fixed mount binders to update", e);
            }
        }
        ArrayList arrayListA11 = C60O.A11(AbstractC7609F5w.A0I(this.A02));
        ArrayList arrayListA112 = C60O.A11(AbstractC7609F5w.A0I(fgt.A02));
        ArrayList arrayListA113 = C60O.A11(AbstractC7609F5w.A0I(this.A03));
        ArrayList arrayListA114 = C60O.A11(AbstractC7609F5w.A0I(fgt.A03));
        try {
            List<FG4> list11 = fgt.A05;
            List<FG4> list12 = this.A05;
            HxE hxEA042 = A04(abstractC0916AHs, fg6, obj2, obj3, list11, list12);
            long jA053 = C3cG.A05(hxEA042.first);
            long jA054 = C3cG.A05(hxEA042.second);
            A06(fgt.A00, abstractC0916AHs, fg6, obj2, obj3, fgt.A02, this.A02, arrayListA11, arrayListA112);
            A06(fgt.A01, abstractC0916AHs, fg6, obj2, obj3, fgt.A03, this.A03, arrayListA113, arrayListA114);
            if (c7819FGa != null) {
                List list13 = c7819FGa.A01;
                if (0 < list13.size()) {
                    throw AbstractC7609F5w.A0n(list13);
                }
            }
            if (z && (iA0K = C8j3.A0K(arrayListA112)) >= 0) {
                while (true) {
                    int i7 = iA0K - 1;
                    FG4 fg4 = (FG4) arrayListA112.get(iA0K);
                    FH1 fh13 = fg4.A03.A01;
                    C0918AHu<FH1, Object> c0918AHu3 = c7831FGm.A00;
                    fg4.A02(fg6, obj, obj2, c0918AHu3 != null ? c0918AHu3.A0B(fh13) : null);
                    if (i7 < 0) {
                        break;
                    } else {
                        iA0K = i7;
                    }
                }
            }
            int iA0K2 = C8j3.A0K(arrayListA114);
            if (iA0K2 >= 0) {
                while (true) {
                    int i8 = iA0K2 - 1;
                    FG4 fg42 = (FG4) arrayListA114.get(iA0K2);
                    FH1 fh14 = fg42.A03.A01;
                    C0918AHu<FH1, Object> c0918AHu4 = c7831FGm.A01;
                    fg42.A02(fg6, obj, obj2, c0918AHu4 != null ? c0918AHu4.A0B(fh14) : null);
                    if (i8 < 0) {
                        break;
                    } else {
                        iA0K2 = i8;
                    }
                }
            }
            if (jA053 != 0 && list12 != null && (iA00 = C60O.A00(list12)) >= 0) {
                while (true) {
                    int i9 = iA00 - 1;
                    if ((jA053 & (1 << iA00)) != 0 && list11 != null && (fg4A032 = A03(list11, iA00)) != null) {
                        Object[] objArr2 = c7831FGm.A02;
                        if (objArr2 != null) {
                            obj4 = objArr2[iA00];
                            objArr2[iA00] = null;
                        } else {
                            obj4 = null;
                        }
                        fg4A032.A02(fg6, obj, obj2, obj4);
                    }
                    if (i9 < 0) {
                        break;
                    } else {
                        iA00 = i9;
                    }
                }
            }
            if (jA053 != 0 && list12 != null) {
                int size4 = list12.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    long j6 = 1 << i10;
                    boolean zA1L2 = AnonymousClass002.A1L(((jA053 & j6) > 0L ? 1 : ((jA053 & j6) == 0L ? 0 : -1)));
                    boolean z3 = (jA054 & j6) != 0;
                    if ((zA1L2 || z3) && (fg4A03 = A03(list12, i10)) != null) {
                        if (z3) {
                            fg4A03.A03(fg6.A01);
                        }
                        c7831FGm.A02(fg4A03.A00(fg6, obj, obj3), i10, size4);
                    }
                }
            }
            int iA0I3 = AbstractC7609F5w.A0I(this.A03);
            int size5 = arrayListA113.size();
            for (int i11 = 0; i11 < size5; i11++) {
                FG4 fg43 = (FG4) arrayListA113.get(i11);
                if (fg43.A04()) {
                    fg43.A03(fg6.A01);
                } else {
                    c7831FGm.A01(fg43.A03.A01, fg43.A00(fg6, obj, obj3), iA0I3);
                }
            }
            int iA0I4 = AbstractC7609F5w.A0I(this.A02);
            int size6 = arrayListA11.size();
            for (int i12 = 0; i12 < size6; i12++) {
                FG4 fg44 = (FG4) arrayListA11.get(i12);
                if (fg44.A04()) {
                    fg44.A03(fg6.A01);
                } else {
                    c7831FGm.A00(fg44.A03.A01, fg44.A00(fg6, obj, obj3), iA0I4);
                }
            }
        } catch (Exception e2) {
            throw new RenderUnit$RenderUnitOperationException(this, "Exception resolving fixed mount binders to update", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FGT(java.util.List r10, java.util.List r11, java.util.List r12) {
        /*
            r9 = this;
            r9.<init>()
            X.FG7 r0 = new X.FG7
            r0.<init>()
            r9.A04 = r0
            if (r10 == 0) goto L64
            int r1 = r10.size()
            r0 = 64
            if (r1 > r0) goto L5d
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L64
            java.util.ArrayList r6 = X.AnonymousClass003.A0i(r10)
            java.util.Iterator r8 = r10.iterator()
            r4 = 0
        L23:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r7 = r8.next()
            int r5 = r4 + 1
            if (r4 >= 0) goto L39
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L39:
            X.FGp r7 = (X.C7834FGp) r7
            long r0 = r9.A0J()
            java.lang.Integer r3 = X.C79.A00
            X.FGx r2 = new X.FGx
            r2.<init>(r4)
            X.FGg r4 = new X.FGg
            r4.<init>(r2, r3, r0)
            boolean r0 = X.FFH.A00
            X.FG7 r3 = r9.A04
            X.FGo<MODEL, CONTENT, BIND_DATA> r2 = r7.A00
            MODEL r1 = r7.A01
            X.FG4 r0 = new X.FG4
            r0.<init>(r4, r3, r2, r1)
            r6.add(r0)
            r4 = r5
            goto L23
        L5d:
            java.lang.String r0 = "Too many fixed mount binders. Max is 64"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L64:
            r6 = 0
        L65:
            r9.A05 = r6
            int r3 = r11.size()
            r2 = 0
            r1 = 0
        L6d:
            if (r1 >= r3) goto L7b
            java.lang.Object r0 = r11.get(r1)
            X.FGp r0 = (X.C7834FGp) r0
            r9.A0U(r0)
            int r1 = r1 + 1
            goto L6d
        L7b:
            int r1 = r12.size()
        L7f:
            if (r2 >= r1) goto L8d
            java.lang.Object r0 = r12.get(r2)
            X.FGp r0 = (X.C7834FGp) r0
            r9.A0T(r0)
            int r2 = r2 + 1
            goto L7f
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGT.<init>(java.util.List, java.util.List, java.util.List):void");
    }
}
