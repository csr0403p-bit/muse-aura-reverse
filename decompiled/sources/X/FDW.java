package X;

import android.util.SparseArray;
import android.view.View;
import com.facebook.aura.R;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class FDW implements InterfaceC7751FDd {
    public static final FBE A0B = new C7755FDh();
    public int A00;
    public F9H A01;
    public F8I A02;
    public Set<Integer> A03;
    public final int A04;
    public final int A05;
    public final SparseArray<Object> A06;
    public final EER<SparseArray<HsM>> A07;
    public final FDW A08;
    public final C7648F8p A09;
    public final LinkedList<F85> A0A;

    /* JADX WARN: Incorrect types in method signature: (LX/FBB;LX/FGT<*>;)LX/FGT<*>; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.FGT A0A(X.FGT r11, X.FBB r12) {
        /*
            r10 = this;
            r4 = r11
            r0 = 136(0x88, float:1.9E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.A06(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L41
            r0 = 137(0x89, float:1.92E-43)
            float r0 = r10.A06(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L41
            r0 = 138(0x8a, float:1.93E-43)
            r1 = 0
            float r0 = r10.A06(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L41
            r0 = 141(0x8d, float:1.98E-43)
            float r0 = r10.A06(r0, r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L41
            r0 = 144(0x90, float:2.02E-43)
            float r0 = r10.A06(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L41
            r0 = 145(0x91, float:2.03E-43)
            float r0 = r10.A06(r0, r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 0
            if (r0 == 0) goto L42
        L41:
            r3 = 1
        L42:
            r0 = 133(0x85, float:1.86E-43)
            java.util.List r2 = r10.A0H(r0)
            if (r3 != 0) goto L5b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5b
            if (r11 == 0) goto L5a
            java.lang.Integer r1 = r11.AJX()
            java.lang.Integer r0 = X.C79.A01
            if (r1 == r0) goto L5b
        L5a:
            return r4
        L5b:
            r5 = r12
            if (r11 == 0) goto L6d
            java.lang.Integer r1 = r11.AJX()
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L7a
            java.lang.String r0 = "Trying to apply View attributes to a Drawable Node is not yet supported"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L6d:
            int r0 = r10.A04
            long r7 = (long) r0
            boolean r9 = X.FBA.A09(r12)
            r6 = 0
            X.FHq r4 = new X.FHq
            r4.<init>(r5, r6, r7, r9)
        L7a:
            r1 = 2131361900(0x7f0a006c, float:1.8343565E38)
            X.FBE r0 = X.FDW.A0B
            java.lang.Object r1 = r12.A04(r0, r10, r1)
            X.FDn r1 = (X.C7760FDn) r1
            X.FDY r0 = new X.FDY
            r0.<init>(r1)
            X.C7834FGp.A00(r0, r4)
            if (r3 == 0) goto L97
            X.FGb r0 = new X.FGb
            r0.<init>(r12)
            X.C7834FGp.A01(r0, r4, r10)
        L97:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L5a
            boolean r0 = X.FBA.A0A(r12)
            if (r0 == 0) goto Lba
            java.util.Iterator r2 = r2.iterator()
        La7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5a
            X.FDW r1 = X.AbstractC7607F5u.A0y(r2)
            X.FDw r0 = new X.FDw
            r0.<init>(r12, r1)
            X.C7834FGp.A01(r0, r4, r10)
            goto La7
        Lba:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            X.FDv r0 = new X.FDv
            r0.<init>(r12, r10, r1)
            X.C7834FGp.A00(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDW.A0A(X.FGT, X.FBB):X.FGT");
    }

    public final FDW A0B() {
        return new FDW(this, null, this.A09, this.A04);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A01(X.FDW r11, int r12) {
        /*
            android.util.SparseArray<java.lang.Object> r8 = r11.A06
            java.lang.Object r10 = r8.get(r12)
            int r1 = r11.A00
            r0 = r1 & 8
            if (r0 != 0) goto L10
            r0 = r1 & 4
            if (r0 == 0) goto L21
        L10:
            X.FDy<java.lang.Integer> r0 = X.AbstractC7752FDe.A01
            java.lang.Object r0 = r0.A01()
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L22
            int r7 = r0.intValue()
            r0 = 2
            if (r7 != r0) goto L23
        L21:
            return r10
        L22:
            r7 = 0
        L23:
            X.FDy<X.FCA> r0 = X.AbstractC7752FDe.A00
            java.lang.Object r6 = r0.A01()
            X.FCA r6 = (X.FCA) r6
            r5 = 0
            if (r6 != 0) goto L46
            X.F8I r2 = r11.A02
            if (r2 == 0) goto L21
            boolean r0 = X.AbstractC8162FXe.A03()
            if (r0 != 0) goto L41
            java.lang.String r1 = "EvaluationContext can only be read from the UI Thread"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r1)
            X.FFI.A01(r5, r1, r0)
        L41:
            X.FCA r6 = r2.A00
            if (r6 != 0) goto L46
            return r10
        L46:
            X.EER<android.util.SparseArray<X.HsM>> r0 = r11.A07
            java.lang.Object r1 = r0.A00()
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            int r0 = r1.size()
            r4 = 3
            if (r0 == 0) goto L7a
            java.lang.Object r9 = r1.get(r12)
            X.HsM r9 = (X.HsM) r9
            if (r9 == 0) goto L7a
            int r0 = r11.A04
            long r2 = (long) r0
            r0 = 27
            long r2 = r2 << r0
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 | r0
            long r0 = (long) r12
            long r0 = r0 | r2
            if (r7 == r4) goto Lbc
            X.FAU r8 = new X.FAU
            r8.<init>(r11, r9, r12)
        L6f:
            X.FCM r0 = X.FCA.A01(r6, r5, r8, r0)
        L73:
            T r0 = r0.A01
            X.FCV r0 = (X.FCV) r0
            java.lang.Object r5 = r0.A00
            return r5
        L7a:
            int r0 = r11.A00
            r0 = r0 & 4
            if (r0 == 0) goto L21
            X.FAP r1 = com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER
            X.C7384Etj.A0U(r1)
            int r0 = r11.A05
            int[] r3 = r1.getPluralSubNodes(r0)
            int r2 = r3.length
            r1 = 0
        L8d:
            if (r1 >= r2) goto L21
            r0 = r3[r1]
            if (r0 != r12) goto Lc5
            java.lang.Object r8 = r8.get(r0)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L21
            java.util.Iterator r2 = r8.iterator()
        L9f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L21
            X.FDW r0 = X.AbstractC7607F5u.A0y(r2)
            int r1 = r0.A05
            r0 = 16851(0x41d3, float:2.3613E-41)
            if (r1 != r0) goto L9f
            int r0 = r11.A04
            long r2 = (long) r0
            r0 = 27
            long r2 = r2 << r0
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 | r0
            long r0 = (long) r12
            long r0 = r0 | r2
            if (r7 != r4) goto L6f
        Lbc:
            X.FCH r2 = r6.A03
            X.FCM r0 = r2.A00(r0)
            if (r0 != 0) goto L73
            return r5
        Lc5:
            int r1 = r1 + 1
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDW.A01(X.FDW, int):java.lang.Object");
    }

    public static final void A04(FDX fdx, long[] jArr) {
        C0938AIr c0938AIr = fdx.A07;
        if (c0938AIr != null) {
            for (long j : jArr) {
                c0938AIr.A00(j);
            }
        }
    }

    public final float A06(int i, float f) {
        if (this instanceof C7728FCf) {
            return ((C7728FCf) this).A00.A06(i, f);
        }
        Object objA02 = A02(this, Number.class, A01(this, i), Float.valueOf(f));
        C1H.A00(objA02);
        return AnonymousClass001.A02(objA02);
    }

    public final View A09(FBB fbb) {
        if (fbb == null) {
            return null;
        }
        return ((C7760FDn) fbb.A04(A0B, this, R.id.bk_context_key_associated_mutable_container)).A00;
    }

    public final FDW A0C(int i) {
        if (this instanceof C7728FCf) {
            C7728FCf c7728FCf = (C7728FCf) this;
            if (i == 77 || i == 38) {
                return null;
            }
            return c7728FCf.A00.A0C(i);
        }
        Object objA01 = A01(this, i);
        if (objA01 instanceof List) {
            List list = (List) objA01;
            if (list.isEmpty()) {
                return null;
            }
            objA01 = C8j4.A0p(list);
        } else if (!(objA01 instanceof FDW)) {
            return null;
        }
        return (FDW) objA01;
    }

    public final HsM A0D(int i) {
        Object obj = this.A06.get(i);
        if (obj == null) {
            return null;
        }
        return FA2.A00(this, obj, Collections.singletonList(Integer.valueOf(i)), i);
    }

    public final String A0E() {
        Object objA01 = A01(this, 33);
        if (objA01 == null) {
            return null;
        }
        if (objA01 instanceof String) {
            return (String) objA01;
        }
        if (objA01 instanceof Number) {
            return String.valueOf(C3cG.A05(objA01));
        }
        FFI.A01(null, FGI.A0U("Unsupported value type: ", C3cI.A0Y(objA01), " for Server Id Value"), null);
        return null;
    }

    public final String A0F(int i) {
        if (this instanceof C7728FCf) {
            return (i == 40 || i == 63) ? "0px" : i == 36 ? "#00000000" : ((C7728FCf) this).A00.A0F(i);
        }
        return (String) A02(this, String.class, A01(this, i), null);
    }

    public final <T> List<T> A0H(int i) {
        if (this instanceof C7728FCf) {
            return i == 62 ? Collections.EMPTY_LIST : ((C7728FCf) this).A00.A0H(i);
        }
        Object objA02 = A02(this, List.class, A01(this, i), Collections.EMPTY_LIST);
        C1H.A00(objA02);
        return (List) objA02;
    }

    public final boolean A0J(int i) {
        return (this.A00 & 8) != 0 && this.A07.A00().indexOfKey(i) >= 0;
    }

    public final boolean A0K(int i) {
        return this.A06.indexOfKey(i) >= 0 || this.A07.A00().indexOfKey(i) >= 0;
    }

    public final boolean A0L(int i, boolean z) {
        Boolean boolValueOf;
        if (this instanceof C7728FCf) {
            return ((C7728FCf) this).A00.A0L(i, z);
        }
        Object objA01 = A01(this, i);
        if (objA01 == null) {
            return z;
        }
        if (objA01 instanceof Boolean) {
            boolValueOf = (Boolean) objA01;
            if (boolValueOf == null) {
                return z;
            }
        } else {
            if (!(objA01 instanceof Number)) {
                FFI.A01(null, "Attempting to extract boolean value from unrecognized value type", null);
                return z;
            }
            boolValueOf = Boolean.valueOf(BV7.A1Q(AnonymousClass001.A0F(objA01)));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r11 == null) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x036e: IGET (r1 I:RenderContext) = (r8 I:X.FDr) (LINE:878) X.FDr.A04 java.lang.Object, block:B:213:0x036e */
    /* JADX WARN: Removed duplicated region for block: B:184:0x032a A[Catch: RuntimeException -> 0x0366, DuplicateRenderUnitException -> 0x036d, BloksComponentRenderException -> 0x03c5, TryCatch #8 {DuplicateRenderUnitException -> 0x036d, BloksComponentRenderException -> 0x03c5, RuntimeException -> 0x0366, blocks: (B:2:0x0000, B:4:0x0012, B:6:0x0016, B:8:0x001c, B:9:0x0026, B:11:0x002a, B:13:0x002e, B:14:0x0035, B:16:0x0041, B:18:0x0045, B:22:0x0051, B:24:0x0059, B:27:0x0065, B:29:0x006c, B:31:0x0076, B:28:0x006a, B:23:0x0057, B:20:0x004d, B:33:0x0080, B:35:0x0091, B:37:0x0099, B:39:0x009f, B:42:0x00c3, B:43:0x00c7, B:45:0x00ce, B:46:0x00d4, B:41:0x00a8, B:48:0x00e3, B:50:0x00f2, B:53:0x00fa, B:55:0x0112, B:56:0x0119, B:58:0x0123, B:60:0x0131, B:65:0x0142, B:67:0x0146, B:68:0x0149, B:70:0x0150, B:72:0x0154, B:74:0x0158, B:77:0x0161, B:79:0x0165, B:81:0x0173, B:86:0x0187, B:88:0x018b, B:91:0x0198, B:93:0x019c, B:94:0x019f, B:96:0x01a6, B:208:0x0365, B:107:0x01bd, B:111:0x01ca, B:112:0x01ce, B:154:0x02b6, B:158:0x02c0, B:159:0x02c2, B:161:0x02cc, B:165:0x02d8, B:166:0x02dc, B:168:0x02e2, B:169:0x02e6, B:171:0x02eb, B:172:0x02f1, B:173:0x02f3, B:184:0x032a, B:186:0x0331, B:187:0x0335, B:189:0x0340, B:191:0x0344, B:174:0x030b, B:176:0x0312, B:178:0x0316, B:180:0x031b, B:202:0x0353, B:206:0x035d, B:207:0x035f), top: B:240:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0250 A[EXC_TOP_SPLITTER, PHI: r2
  0x0250: PHI (r2v6 long[]) = (r2v5 long[]), (r2v9 long[]) binds: [B:124:0x023f, B:126:0x0247] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154 A[Catch: RuntimeException -> 0x0366, DuplicateRenderUnitException -> 0x036d, BloksComponentRenderException -> 0x03c5, TryCatch #8 {DuplicateRenderUnitException -> 0x036d, BloksComponentRenderException -> 0x03c5, RuntimeException -> 0x0366, blocks: (B:2:0x0000, B:4:0x0012, B:6:0x0016, B:8:0x001c, B:9:0x0026, B:11:0x002a, B:13:0x002e, B:14:0x0035, B:16:0x0041, B:18:0x0045, B:22:0x0051, B:24:0x0059, B:27:0x0065, B:29:0x006c, B:31:0x0076, B:28:0x006a, B:23:0x0057, B:20:0x004d, B:33:0x0080, B:35:0x0091, B:37:0x0099, B:39:0x009f, B:42:0x00c3, B:43:0x00c7, B:45:0x00ce, B:46:0x00d4, B:41:0x00a8, B:48:0x00e3, B:50:0x00f2, B:53:0x00fa, B:55:0x0112, B:56:0x0119, B:58:0x0123, B:60:0x0131, B:65:0x0142, B:67:0x0146, B:68:0x0149, B:70:0x0150, B:72:0x0154, B:74:0x0158, B:77:0x0161, B:79:0x0165, B:81:0x0173, B:86:0x0187, B:88:0x018b, B:91:0x0198, B:93:0x019c, B:94:0x019f, B:96:0x01a6, B:208:0x0365, B:107:0x01bd, B:111:0x01ca, B:112:0x01ce, B:154:0x02b6, B:158:0x02c0, B:159:0x02c2, B:161:0x02cc, B:165:0x02d8, B:166:0x02dc, B:168:0x02e2, B:169:0x02e6, B:171:0x02eb, B:172:0x02f1, B:173:0x02f3, B:184:0x032a, B:186:0x0331, B:187:0x0335, B:189:0x0340, B:191:0x0344, B:174:0x030b, B:176:0x0312, B:178:0x0316, B:180:0x031b, B:202:0x0353, B:206:0x035d, B:207:0x035f), top: B:240:0x0000 }] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.FDr] */
    @Override // X.InterfaceC7751FDd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC7823FGe A5j(X.C7764FDr<X.FBB> r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FDW.A5j(X.FDr, int, int):X.FGe");
    }

    public FDW(int i) {
        this.A0A = null;
        this.A06 = BV4.A0B();
        this.A05 = i;
        this.A04 = AbstractC7694FAo.A00.incrementAndGet();
        this.A09 = null;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        C10500Hmz c10500Hmz = new C10500Hmz(this);
        EER<SparseArray<HsM>> eer = new EER<>();
        eer.A00 = c10500Hmz;
        this.A07 = eer;
        AbstractC7692FAm.A04.incrementAndGet();
    }

    public static final Object A02(FDW fdw, Class cls, Object obj, Object obj2) {
        if (cls.isInstance(obj)) {
            return obj;
        }
        if (obj != null) {
            StringBuilder sbA0x = C60O.A0x("Unsupported value type: ");
            AbstractC7609F5w.A1L(sbA0x, obj);
            sbA0x.append(" for expected type: ");
            sbA0x.append(cls);
            sbA0x.append(" on model with styleId: ");
            FFI.A01(null, BV4.A0l(sbA0x, fdw.A05), null);
        }
        return obj2;
    }

    public static final void A03(C7764FDr c7764FDr, FDW fdw, InterfaceC7780FEk interfaceC7780FEk) {
        C7749FDb c7749FDbA00 = c7764FDr.A00();
        C7748FDa c7748FDa = (C7748FDa) c7749FDbA00.A00(fdw);
        if (c7748FDa == null) {
            throw C3cG.A0Q("Expected cache item for model");
        }
        if (c7749FDbA00.A02.get(fdw) == null) {
            FDZ.A00(c7764FDr, fdw);
            List list = c7748FDa.A05;
            if (list != null) {
                if (interfaceC7780FEk == null) {
                    throw BV4.A0U();
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((FE2) list.get(i)).ANz(interfaceC7780FEk);
                }
            }
            FDW[] fdwArr = c7748FDa.A09;
            if (fdwArr != null) {
                for (FDW fdw2 : fdwArr) {
                    A03(c7764FDr, fdw2, interfaceC7780FEk);
                }
            }
        }
    }

    public static boolean A05(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (i == i2) {
            return true;
        }
        if (mode2 == 0 && mode == 0) {
            return true;
        }
        if (mode == 1073741824 && size == i3) {
            return true;
        }
        return mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 > size && i3 <= size;
    }

    public final int A07(int i, int i2) {
        Object objA01 = A01(this, i);
        if (objA01 instanceof String) {
            try {
                return Integer.parseInt((String) objA01);
            } catch (NumberFormatException unused) {
                FFI.A01(null, "Non-int string parsed as int", null);
                return i2;
            }
        }
        Object objA02 = A02(this, Number.class, objA01, Integer.valueOf(i2));
        C1H.A00(objA02);
        return AnonymousClass001.A0F(objA02);
    }

    public final long A08(int i, long j) {
        Object objA01 = A01(this, i);
        if (objA01 instanceof String) {
            try {
                return Long.parseLong((String) objA01);
            } catch (NumberFormatException unused) {
                FFI.A01(null, "Non-long string parsed as long", null);
                return j;
            }
        }
        Object objA02 = A02(this, Number.class, objA01, Long.valueOf(j));
        C1H.A00(objA02);
        return C3cG.A05(objA02);
    }

    public final List<FDW> A0G() {
        C6979Edd.A00();
        return A0I(C7851FHl.A00.A0A(this));
    }

    public final List<FDW> A0I(int i) {
        Object objA01 = A01(this, i);
        if (objA01 instanceof FDW) {
            return Collections.singletonList(objA01);
        }
        Object objA02 = A02(this, List.class, objA01, Collections.EMPTY_LIST);
        C1H.A00(objA02);
        return (List) objA02;
    }

    public FDW(C7648F8p c7648F8p, int i, int i2) {
        this.A0A = null;
        this.A06 = new SparseArray<>(i2 + 1);
        this.A05 = i;
        this.A04 = AbstractC7694FAo.A00.incrementAndGet();
        this.A09 = c7648F8p;
        this.A08 = null;
        this.A01 = null;
        this.A02 = null;
        C10500Hmz c10500Hmz = new C10500Hmz(this);
        EER<SparseArray<HsM>> eer = new EER<>();
        eer.A00 = c10500Hmz;
        this.A07 = eer;
        AbstractC7692FAm.A04.incrementAndGet();
    }

    public FDW(FDW fdw, FDW fdw2, C7648F8p c7648F8p, int i) {
        this(fdw.A01, fdw.A02, fdw, fdw2, c7648F8p, i, false);
    }

    public FDW(F9H f9h, F8I f8i, FDW fdw, FDW fdw2, C7648F8p c7648F8p, int i, boolean z) {
        EER<SparseArray<HsM>> eer;
        this.A0A = fdw.A0A;
        this.A06 = fdw.A06.clone();
        this.A05 = fdw.A05;
        this.A04 = i;
        this.A09 = c7648F8p;
        this.A08 = fdw2;
        this.A01 = f9h;
        this.A02 = f8i;
        this.A00 = fdw.A00;
        this.A03 = fdw.A03;
        if (z) {
            eer = fdw.A07;
        } else {
            C10500Hmz c10500Hmz = new C10500Hmz(this);
            eer = new EER<>();
            eer.A00 = c10500Hmz;
        }
        this.A07 = eer;
        AbstractC7692FAm.A04.incrementAndGet();
    }

    public FDW(FDW fdw, F85 f85) {
        LinkedList<F85> linkedListA0y = fdw.A0A;
        linkedListA0y = linkedListA0y == null ? BV4.A0y() : linkedListA0y;
        this.A0A = linkedListA0y;
        linkedListA0y.addFirst(f85);
        this.A06 = fdw.A06;
        this.A05 = fdw.A05;
        this.A04 = fdw.A04;
        this.A09 = fdw.A09;
        FDW fdw2 = fdw.A08;
        this.A08 = fdw2 == null ? null : fdw2;
        this.A01 = fdw.A01;
        this.A02 = fdw.A02;
        this.A00 = fdw.A00;
        this.A03 = fdw.A03;
        C10500Hmz c10500Hmz = new C10500Hmz(this);
        EER<SparseArray<HsM>> eer = new EER<>();
        eer.A00 = c10500Hmz;
        this.A07 = eer;
        AbstractC7692FAm.A04.incrementAndGet();
    }
}
