package X;

import com.facebook.pando.NodeStoreJNI;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeWithGraphQL;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DaF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5131DaF implements A7O {
    public final DZu A00;

    /* JADX INFO: Incorrect field signature: TTNode; */
    public final C5123Da7 A01;
    public final boolean A02;
    public volatile InterfaceC5116DZp A03;
    public volatile byte[] A04;
    public volatile byte[] A05;
    public volatile AtomicReferenceArray<Object> conversionValues;
    public volatile AtomicReferenceArray<InterfaceC5168Day> fieldValues;
    public volatile Object typeNameMemo;
    public static final AtomicReferenceFieldUpdater<C5131DaF<?>, Object> A07 = AtomicReferenceFieldUpdater.newUpdater(C5131DaF.class, Object.class, "typeNameMemo");
    public static final AtomicReferenceFieldUpdater<C5131DaF<?>, AtomicReferenceArray<?>> A06 = AtomicReferenceFieldUpdater.newUpdater(C5131DaF.class, AtomicReferenceArray.class, "fieldValues");
    public static final AtomicReferenceFieldUpdater<C5131DaF<?>, AtomicReferenceArray<?>> A08 = AtomicReferenceFieldUpdater.newUpdater(C5131DaF.class, AtomicReferenceArray.class, "conversionValues");

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9 A[PHI: r8
  0x00a9: PHI (r8v6 java.lang.Object) = (r8v7 java.lang.Object), (r8v10 java.lang.Object) binds: [B:12:0x0039, B:34:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.InterfaceC5168Day A02(X.Da6 r10) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5131DaF.A02(X.Da6):X.Day");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Da6;LX/DaF<*>;LX/Da6;)Z */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean A0C(Da6 da6, Da6 da62, C5131DaF c5131DaF) {
        C5124Da8 c5124Da8 = (C5124Da8) da6;
        if (c5124Da8.A05 != C79.A0W) {
            InterfaceC5168Day interfaceC5168DayA03 = A03(da6, this);
            Object obj = interfaceC5168DayA03 instanceof C5139DaT ? ((C5139DaT) interfaceC5168DayA03).A00 : null;
            InterfaceC5168Day interfaceC5168DayA032 = A03(da62, c5131DaF);
            return C7384Etj.areEqual(obj, interfaceC5168DayA032 instanceof C5139DaT ? ((C5139DaT) interfaceC5168DayA032).A00 : null);
        }
        boolean z = c5124Da8.A0A;
        int i = c5124Da8.A02;
        if (z) {
            ImmutableList immutableList = (ImmutableList) A07(this, i);
            ImmutableList immutableList2 = (ImmutableList) A07(c5131DaF, ((C5124Da8) da62).A02);
            if (immutableList == null) {
                if (immutableList2 == null) {
                    return true;
                }
            } else if (immutableList2 != null && immutableList.size() == immutableList2.size()) {
                Iterable iterableA12 = AbstractC0885AGm.A12(immutableList);
                if ((iterableA12 instanceof Collection) && ((Collection) iterableA12).isEmpty()) {
                    return true;
                }
                Iterator<Integer> it = iterableA12.iterator();
                while (it.hasNext()) {
                    int iA00 = ((BNt) it).A00();
                    if (!((C5131DaF) immutableList.get(iA00)).AOK((C9YX) immutableList2.get(iA00))) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            A7O a7o = (A7O) A07(this, i);
            A7O a7o2 = (A7O) A07(c5131DaF, ((C5124Da8) da62).A02);
            if (a7o != null) {
                return a7o.AOK(a7o2);
            }
            if (a7o2 == null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;>(ITT;)TT; */
    @Override // X.C9YX
    public final Enum AIH(Enum r3, int i) {
        C7384Etj.A0Y(r3, 1);
        String str = (String) A07(this, i);
        if (str == null) {
            return null;
        }
        try {
            Class declaringClass = r3.getDeclaringClass();
            C7384Etj.A0U(declaringClass);
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            Enum enumValueOf = Enum.valueOf(declaringClass, str.toUpperCase(locale));
            C7384Etj.A0X(enumValueOf);
            return enumValueOf;
        } catch (IllegalArgumentException unused) {
            return r3;
        }
    }

    @Override // X.A7O
    public final A7O Aa4(int i) {
        return A04(i, false);
    }

    @Override // X.A7O
    public final A7O Aa5(int i) {
        return A04(i, true);
    }

    @Override // X.A7O
    public final A7O Aa6(int i) {
        Object objValueOf;
        C5131DaF c5131DaFA04 = A04(i, false);
        if (c5131DaFA04 != null) {
            return c5131DaFA04;
        }
        C5130DaE c5130DaE = (C5130DaE) this.A00;
        DZy dZy = c5130DaE.A04;
        int iA07 = dZy.A07(6);
        if (iA07 != 0) {
            objValueOf = DZx.A03(dZy.A04, iA07 + dZy.A00);
        } else {
            objValueOf = Integer.valueOf(c5130DaE.A00);
        }
        StringBuilder sbA0f = C3cG.A0f(objValueOf, "Required conversion ");
        sbA0f.append(".");
        sbA0f.append(i);
        throw BV8.A0m(" is missing", sbA0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bf, code lost:
    
        if (r7 <= r5.A08) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c1, code lost:
    
        r4 = r5.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c3, code lost:
    
        if (r4 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c5, code lost:
    
        r1 = r5.A00;
        r4 = new int[r1];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ca, code lost:
    
        if (r0 >= r1) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01cc, code lost:
    
        r4[r0] = r0;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d1, code lost:
    
        r3 = r5.A00;
        r2 = r5.A0A;
        r2.A05 = new X.C5141DaV(new X.C5142DaW(r2, r4, r3, r7), r4, r3);
        r5.A05 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x008b, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
    
        r2 = r5.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
    
        r0 = r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
    
        if (r10 != r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        r5.A00 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fb, code lost:
    
        if (r5.A01 != r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00fd, code lost:
    
        X.C5132DaL.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
    
        if (r10 < 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0102, code lost:
    
        r1 = (X.Da6) r4.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x010d, code lost:
    
        if (((X.C5124Da8) r1).A09 != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        if (A0D(r1, r12) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011d, code lost:
    
        if ((!(A03(r1, r12) instanceof X.C5139DaT)) == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011f, code lost:
    
        r7 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0121, code lost:
    
        if (r7 != r8) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0125, code lost:
    
        if (r5.A06 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0127, code lost:
    
        X.C5132DaL.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012c, code lost:
    
        r1 = java.lang.Math.min(r8, java.lang.Math.max(8, r0 * 2));
        r2 = new int[r1];
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0139, code lost:
    
        if (r0 >= r1) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013b, code lost:
    
        r2[r0] = r0;
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
    
        if (r5.A05 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0147, code lost:
    
        if (r5.A00 != r2.length) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0149, code lost:
    
        r2 = java.util.Arrays.copyOf(r2, java.lang.Math.min(r8, java.lang.Math.max(8, r5.A00 * 2)));
        X.C7384Etj.A0U(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015c, code lost:
    
        r5.A05 = true;
        r1 = r5.A00;
        r5.A00 = r1 + 1;
        r2[r1] = r10;
        r5.A07 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC5116DZp A00(X.C5131DaF r12) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5131DaF.A00(X.DaF):X.DZp");
    }

    private final InterfaceC5168Day A01(int i) {
        InterfaceC5168Day interfaceC5168DayA03;
        Da6 da6A01 = ((C5130DaE) this.A00).A03.A01(i);
        return (da6A01 == null || (interfaceC5168DayA03 = A03(da6A01, this)) == null) ? C5149Daf.A00 : interfaceC5168DayA03;
    }

    private final C5131DaF A04(int i, boolean z) {
        C5131DaF c5131DaFA06;
        DaM daM = (DaM) ((C5130DaE) this.A00).A02.A01(i);
        if (daM == null || ((z && !A0B(daM, this)) || (c5131DaFA06 = A06(daM, this)) == null)) {
            return null;
        }
        if (z && (A00(c5131DaFA06) instanceof C5136DaQ)) {
            return null;
        }
        return c5131DaFA06;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C5131DaF A05(X.DaM r8) {
        /*
            r7 = this;
            java.lang.Object r2 = r8.childFragment
            r6 = 0
            if (r2 == 0) goto L17
            boolean r0 = r2 instanceof X.DZu
            if (r0 == 0) goto L16
        L9:
            X.DZu r2 = (X.DZu) r2
            if (r2 == 0) goto L16
            X.Da7 r1 = r7.A01
            boolean r0 = r7.A02
            X.DaF r6 = new X.DaF
            r6.<init>(r2, r1, r0)
        L16:
            return r6
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<X.DaM, java.lang.Object> r5 = X.DaM.A08
            X.DZi r4 = r8.A02
            X.Da3 r3 = r8.A04
            X.DZy r2 = new X.DZy
            r2.<init>()
            r0 = 4
            int r0 = r3.A07(r0)
            if (r0 == 0) goto L3a
            int r1 = X.DZx.A01(r3, r0)
            java.nio.ByteBuffer r0 = r3.A04
            r2.A0A(r1, r0)
            X.G0U<X.DZy, X.DZu> r0 = r4.A02
            java.lang.Object r0 = r0.invoke(r2)
            if (r0 != 0) goto L3c
        L3a:
            X.DaB r0 = X.C5127DaB.A00
        L3c:
            X.AbstractC5217DdT.A00(r8, r6, r0, r5)
            java.lang.Object r2 = r8.childFragment
            boolean r0 = r2 instanceof X.DZu
            if (r0 == 0) goto L16
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5131DaF.A05(X.DaM):X.DaF");
    }

    public static final C5131DaF A06(DaM daM, C5131DaF c5131DaF) {
        int i = daM.A01;
        if (i < 0) {
            return c5131DaF.A05(daM);
        }
        AtomicReferenceArray<Object> atomicReferenceArray = c5131DaF.conversionValues;
        if (atomicReferenceArray == null) {
            atomicReferenceArray = new AtomicReferenceArray<>(((C5130DaE) c5131DaF.A00).A02.A01.size());
            if (!AbstractC5217DdT.A00(c5131DaF, null, atomicReferenceArray, A08) && (atomicReferenceArray = c5131DaF.conversionValues) == null) {
                throw BV4.A0U();
            }
        }
        Object objA05 = atomicReferenceArray.get(i);
        if (objA05 == null) {
            objA05 = c5131DaF.A05(daM);
            if (objA05 == null) {
                objA05 = C5164Dau.A00;
            }
            if (!AbstractC10556Hsj.A00(null, objA05, atomicReferenceArray, i)) {
                objA05 = atomicReferenceArray.get(i);
            }
        }
        if (objA05 != C5164Dau.A00) {
            return (C5131DaF) objA05;
        }
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(I)TT; */
    private final void A0A(int i) {
        Object objValueOf;
        C5130DaE c5130DaE = (C5130DaE) this.A00;
        DZy dZy = c5130DaE.A04;
        int iA07 = dZy.A07(6);
        if (iA07 != 0) {
            objValueOf = DZx.A03(dZy.A04, iA07 + dZy.A00);
        } else {
            objValueOf = Integer.valueOf(c5130DaE.A00);
        }
        StringBuilder sbA0f = C3cG.A0f(objValueOf, "Required field ");
        sbA0f.append(".");
        sbA0f.append(i);
        throw BV8.A0m(" is null or unset", sbA0f);
    }

    public static final boolean A0B(DaM daM, C5131DaF c5131DaF) {
        if (!daM.A05) {
            int i = daM.A01;
            if (i < 0) {
                return c5131DaF.A0E(daM.A03);
            }
            byte[] bArr = c5131DaF.A04;
            if (bArr == null) {
                bArr = new byte[((C5130DaE) c5131DaF.A00).A02.A01.size()];
                c5131DaF.A04 = bArr;
            }
            byte b = bArr[i];
            if (b != 1) {
                if (b == 2) {
                    return false;
                }
                boolean zA0E = c5131DaF.A0E(daM.A03);
                bArr[i] = zA0E ? (byte) 1 : (byte) 2;
                return zA0E;
            }
        }
        return true;
    }

    public static final boolean A0D(Da6 da6, C5131DaF c5131DaF) {
        C5124Da8 c5124Da8 = (C5124Da8) da6;
        if (!c5124Da8.A08) {
            int i = c5124Da8.A03;
            if (i < 0) {
                return c5131DaF.A0E(c5124Da8.A06);
            }
            byte[] bArr = c5131DaF.A05;
            if (bArr == null) {
                bArr = new byte[((C5130DaE) c5131DaF.A00).A03.A01.size()];
                c5131DaF.A05 = bArr;
            }
            byte b = bArr[i];
            if (b != 1) {
                if (b == 2) {
                    return false;
                }
                boolean zA0E = c5131DaF.A0E(c5124Da8.A06);
                bArr[i] = zA0E ? (byte) 1 : (byte) 2;
                return zA0E;
            }
        }
        return true;
    }

    public final TreeWithGraphQL A0F() {
        C5123Da7 c5123Da7 = this.A01;
        int i = ((C5130DaE) this.A00).A00;
        NodeStoreJNI nodeStoreJNI = c5123Da7.A01;
        long j = c5123Da7.A00;
        TreeWithGraphQL treeWithGraphQL = (TreeWithGraphQL) nodeStoreJNI.treeForNodeWithReader(j, TreeWithGraphQL.class, i);
        if (treeWithGraphQL != null) {
            return treeWithGraphQL;
        }
        TreeJNI treeJNITreeForNode = nodeStoreJNI.treeForNode(j, TreeWithGraphQL.class, true);
        if (treeJNITreeForNode == null) {
            return null;
        }
        C5119DZv c5119DZvA00 = nodeStoreJNI.scope.assetReader;
        if (c5119DZvA00 == null) {
            c5119DZvA00 = AbstractC3081BxN.A00();
        }
        return (TreeWithGraphQL) treeJNITreeForNode.recreateAsLazyFragment(C5143DaY.A00, i, c5119DZvA00.A00(nodeStoreJNI.scope.buildConfigName));
    }

    @Override // X.C9YX
    public final boolean AOK(C9YX c9yx) {
        C5131DaF c5131DaF = c9yx instanceof C5131DaF ? (C5131DaF) c9yx : null;
        if (c5131DaF != null) {
            if (this != c5131DaF) {
                C5130DaE c5130DaE = (C5130DaE) this.A00;
                int i = c5130DaE.A00;
                C5130DaE c5130DaE2 = (C5130DaE) c5131DaF.A00;
                if (i == c5130DaE2.A00) {
                    List<T> list = c5130DaE.A03.A01;
                    int size = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            Da6 da6 = (Da6) list.get(i2);
                            Da6 da6A01 = c5130DaE2.A03.A01(((C5124Da8) da6).A02);
                            if (da6A01 == null || !A0C(da6, da6A01, c5131DaF)) {
                                break;
                            }
                            i2++;
                        } else {
                            List<T> list2 = c5130DaE.A02.A01;
                            int size2 = list2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                DaM daM = (DaM) list2.get(i3);
                                C5131DaF c5131DaFA04 = A04(daM.A00, true);
                                C5131DaF c5131DaF2 = c5131DaFA04 != null ? c5131DaFA04 : null;
                                C5131DaF c5131DaFA042 = c5131DaF.A04(daM.A00, true);
                                C5131DaF c5131DaF3 = c5131DaFA042 != null ? c5131DaFA042 : null;
                                if (c5131DaF2 == null) {
                                    if (c5131DaF3 == null) {
                                    }
                                } else if (c5131DaF2.AOK(c5131DaF3)) {
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.A7O
    public final F0r AiB() {
        return new DZP(new DZJ(this.A01), this);
    }

    /* JADX WARN: Incorrect types in method signature: (TTNode;LX/DZu;Z)V */
    public C5131DaF(DZu dZu, C5123Da7 c5123Da7, boolean z) {
        AnonymousClass003.A0u(c5123Da7, dZu);
        this.A01 = c5123Da7;
        this.A00 = dZu;
        this.A02 = z;
        this.typeNameMemo = C5162Das.A00;
        this.A03 = C5152Dai.A00;
    }

    public static final InterfaceC5168Day A03(Da6 da6, C5131DaF c5131DaF) {
        InterfaceC5168Day interfaceC5168Day;
        if (A0D(da6, c5131DaF)) {
            int i = ((C5124Da8) da6).A03;
            if (i < 0) {
                return c5131DaF.A02(da6);
            }
            AtomicReferenceArray<InterfaceC5168Day> atomicReferenceArray = c5131DaF.fieldValues;
            if (atomicReferenceArray == null) {
                atomicReferenceArray = new AtomicReferenceArray<>(((C5130DaE) c5131DaF.A00).A03.A01.size());
                if (!AbstractC5217DdT.A00(c5131DaF, null, atomicReferenceArray, A06) && (atomicReferenceArray = c5131DaF.fieldValues) == null) {
                    throw BV4.A0U();
                }
            }
            InterfaceC5168Day interfaceC5168Day2 = atomicReferenceArray.get(i);
            if (interfaceC5168Day2 != null) {
                return interfaceC5168Day2;
            }
            InterfaceC5168Day interfaceC5168DayA02 = c5131DaF.A02(da6);
            if (AbstractC10556Hsj.A00(null, interfaceC5168DayA02, atomicReferenceArray, i)) {
                return interfaceC5168DayA02;
            }
            interfaceC5168Day = atomicReferenceArray.get(i);
            if (interfaceC5168Day == null) {
                throw BV4.A0U();
            }
        } else {
            interfaceC5168Day = C5149Daf.A00;
        }
        return interfaceC5168Day;
    }

    public static Object A07(C5131DaF c5131DaF, int i) {
        InterfaceC5168Day interfaceC5168DayA01 = c5131DaF.A01(i);
        if (interfaceC5168DayA01 instanceof C5139DaT) {
            return ((C5139DaT) interfaceC5168DayA01).A00;
        }
        return null;
    }

    public static final List A08(C5131DaF c5131DaF) {
        C5136DaQ c5136DaQ;
        List list;
        InterfaceC5116DZp interfaceC5116DZpA00 = A00(c5131DaF);
        return (!(interfaceC5116DZpA00 instanceof C5136DaQ) || (c5136DaQ = (C5136DaQ) interfaceC5116DZpA00) == null || (list = (List) c5136DaQ.A00.getValue()) == null) ? C0881AGi.A00 : list;
    }

    public static final List A09(C5131DaF c5131DaF, String str) {
        C5136DaQ c5136DaQ;
        List<List> list;
        String strValueOf;
        int i;
        ByteBuffer byteBuffer;
        InterfaceC5116DZp interfaceC5116DZpA00 = A00(c5131DaF);
        if (!(interfaceC5116DZpA00 instanceof C5136DaQ) || (c5136DaQ = (C5136DaQ) interfaceC5116DZpA00) == null || (list = (List) c5136DaQ.A00.getValue()) == null) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (List<InterfaceC5167Dax> list2 : list) {
            StringBuilder sbA0g = C3cG.A0g(str);
            for (InterfaceC5167Dax interfaceC5167Dax : list2) {
                if (interfaceC5167Dax instanceof C5137DaR) {
                    C5124Da8 c5124Da8 = (C5124Da8) ((C5137DaR) interfaceC5167Dax).A00;
                    C5125Da9 c5125Da9 = c5124Da8.A07;
                    int iA07 = c5125Da9.A07(10);
                    if (iA07 != 0) {
                        strValueOf = DZx.A03(c5125Da9.A04, iA07 + c5125Da9.A00);
                    } else {
                        String strA00 = C5124Da8.A00(c5124Da8);
                        if (strA00 != null) {
                            String strA01 = C5124Da8.A01(c5124Da8);
                            if (strA01 == null) {
                                strA01 = "";
                            }
                            strValueOf = FGI.A0M(strA00, strA01);
                        } else {
                            strValueOf = String.valueOf(c5124Da8.A02);
                        }
                    }
                } else if (interfaceC5167Dax instanceof C5138DaS) {
                    DaM daM = ((C5138DaS) interfaceC5167Dax).A00;
                    strValueOf = daM.A07;
                    if (strValueOf == null) {
                        Da3 da3 = daM.A04;
                        int iA072 = da3.A07(8);
                        if (iA072 != 0) {
                            i = iA072 + da3.A00;
                            byteBuffer = da3.A04;
                        } else {
                            DZy dZy = new DZy();
                            int iA073 = da3.A07(4);
                            if (iA073 != 0) {
                                dZy.A0A(DZx.A01(da3, iA073), da3.A04);
                                int iA074 = dZy.A07(6);
                                if (iA074 != 0) {
                                    i = iA074 + dZy.A00;
                                    byteBuffer = dZy.A04;
                                }
                            }
                            strValueOf = String.valueOf(daM.A00);
                            daM.A07 = strValueOf;
                        }
                        strValueOf = DZx.A03(byteBuffer, i);
                        daM.A07 = strValueOf;
                    }
                } else {
                    if (!(interfaceC5167Dax instanceof DaX)) {
                        throw C3cG.A0q();
                    }
                    sbA0g.append('[');
                    sbA0g.append(((DaX) interfaceC5167Dax).A00);
                    sbA0g.append(']');
                }
                if (sbA0g.length() > 0) {
                    sbA0g.append('.');
                }
                sbA0g.append(strValueOf);
            }
            arrayListA0m.add(sbA0g.toString());
        }
        return arrayListA0m;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0E(java.util.List<? extends X.AbstractC5134DaO> r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5131DaF.A0E(java.util.List):boolean");
    }

    @Override // X.C9YX
    public final boolean ADk(int i) {
        Boolean bool = (Boolean) A07(this, i);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.C9YX
    public final double ADl(int i) {
        Number number = (Number) A07(this, i);
        if (number != null) {
            return number.doubleValue();
        }
        return 0.0d;
    }

    @Override // X.C9YX
    public final int ADm(int i) {
        Number number = (Number) A07(this, i);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    @Override // X.C9YX
    public final String AIJ(int i) {
        return (String) A07(this, i);
    }

    @Override // X.A7O
    public final A7O AIK(int i) {
        return (A7O) A07(this, i);
    }

    @Override // X.C9YX
    public final ImmutableList<String> AJb(int i) {
        ImmutableList<String> immutableList = (ImmutableList) A07(this, i);
        if (immutableList != null) {
            return immutableList;
        }
        A0A(i);
        throw F60.createAndThrow();
    }

    @Override // X.A7O
    public final ImmutableList<? extends A7O> AJc(int i) {
        InterfaceC5168Day interfaceC5168DayA01 = A01(i);
        if (interfaceC5168DayA01.equals(C5149Daf.A00) || interfaceC5168DayA01.equals(C5150Dag.A00)) {
            return ImmutableList.of();
        }
        ImmutableList<? extends A7O> immutableList = (ImmutableList) (interfaceC5168DayA01 instanceof C5139DaT ? ((C5139DaT) interfaceC5168DayA01).A00 : null);
        if (immutableList != null) {
            return immutableList;
        }
        A0A(i);
        throw F60.createAndThrow();
    }

    @Override // X.C9YX
    public final boolean ANA(int i) {
        C5135DaP c5135DaP;
        InterfaceC5168Day interfaceC5168DayA01 = A01(i);
        if (interfaceC5168DayA01 instanceof C5139DaT) {
            return true;
        }
        Object obj = null;
        if ((interfaceC5168DayA01 instanceof C5135DaP) && (c5135DaP = (C5135DaP) interfaceC5168DayA01) != null) {
            obj = c5135DaP.A00;
        }
        return (obj instanceof C5131DaF) && obj != null;
    }
}
