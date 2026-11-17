package X;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9tY, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tY<Element, Collection, Builder> implements C9hr<Collection> {
    /* JADX WARN: Incorrect types in method signature: (LX/9j4;ITBuilder;Z)V */
    public abstract void A07(Object obj, C9j4 c9j4, int i, boolean z);

    @Override // X.C9jG
    public final Collection deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        return (Collection) A05(interfaceC07829iw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int A01(Builder builder) {
        if (this instanceof C9tT) {
            AbstractMap abstractMap = (AbstractMap) builder;
            C7384Etj.A0Y(abstractMap, 0);
            return abstractMap.size() * 2;
        }
        if ((this instanceof C9uR) || !(this instanceof C9tZ)) {
            AbstractCollection abstractCollection = (AbstractCollection) builder;
            C7384Etj.A0Y(abstractCollection, 0);
            return abstractCollection.size();
        }
        C9u3 c9u3 = (C9u3) builder;
        C7384Etj.A0Y(c9u3, 0);
        return c9u3.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int A02(Collection collection) {
        if (this instanceof C9tT) {
            Map map = (Map) collection;
            C7384Etj.A0Y(map, 0);
            return map.size();
        }
        if (this instanceof C9uR) {
            Object[] objArr = (Object[]) collection;
            C7384Etj.A0Y(objArr, 0);
            return objArr.length;
        }
        if (this instanceof C9tb) {
            return ((C9oV) collection).A00.length;
        }
        if (this instanceof C08199te) {
            return ((C9tP) collection).A00.length;
        }
        if (this instanceof C9tc) {
            return ((C9oX) collection).A00.length;
        }
        if (this instanceof C9ta) {
            return ((C9oW) collection).A00.length;
        }
        if (this instanceof C08209tg) {
            short[] sArr = (short[]) collection;
            C7384Etj.A0Y(sArr, 0);
            return sArr.length;
        }
        if (this instanceof C08279tn) {
            long[] jArr = (long[]) collection;
            C7384Etj.A0Y(jArr, 0);
            return jArr.length;
        }
        if (this instanceof C08249tk) {
            int[] iArr = (int[]) collection;
            C7384Etj.A0Y(iArr, 0);
            return iArr.length;
        }
        if (this instanceof C08229ti) {
            float[] fArr = (float[]) collection;
            C7384Etj.A0Y(fArr, 0);
            return fArr.length;
        }
        if (this instanceof C08219th) {
            double[] dArr = (double[]) collection;
            C7384Etj.A0Y(dArr, 0);
            return dArr.length;
        }
        if (this instanceof C08259tl) {
            char[] cArr = (char[]) collection;
            C7384Etj.A0Y(cArr, 0);
            return cArr.length;
        }
        if (this instanceof C9tf) {
            byte[] bArr = (byte[]) collection;
            C7384Etj.A0Y(bArr, 0);
            return bArr.length;
        }
        boolean[] zArr = (boolean[]) collection;
        C7384Etj.A0Y(zArr, 0);
        return zArr.length;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [Builder, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v10, types: [Builder, X.9tx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [Builder, X.9ts, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [Builder, X.9tq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [Builder, X.9tt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [Builder, X.9ty, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [Builder, X.9tu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [Builder, X.9tz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [Builder, X.9u0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [Builder, X.9u1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [Builder, X.9tv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [Builder, X.9tw, java.lang.Object] */
    public Builder A03() {
        Object obj;
        if (this instanceof C9tT) {
            return (Builder) new HashMap();
        }
        if (this instanceof C9uR) {
            return (Builder) C3cG.A0h();
        }
        if (!(this instanceof C9tZ)) {
            return this instanceof A65 ? (Builder) C3cG.A0k() : (Builder) new HashSet();
        }
        C9tZ c9tZ = (C9tZ) this;
        boolean z = c9tZ instanceof C9tb;
        Object c9oV = z ? new C9oV(new short[0]) : c9tZ instanceof C08199te ? new C9tP(new long[0]) : c9tZ instanceof C9tc ? new C9oX(new int[0]) : c9tZ instanceof C9ta ? new C9oW(new byte[0]) : c9tZ instanceof C08209tg ? new short[0] : c9tZ instanceof C08279tn ? new long[0] : c9tZ instanceof C08249tk ? new int[0] : c9tZ instanceof C08229ti ? new float[0] : c9tZ instanceof C08219th ? new double[0] : c9tZ instanceof C08259tl ? new char[0] : c9tZ instanceof C9tf ? new byte[0] : new boolean[0];
        if (z) {
            short[] sArr = ((C9oV) c9oV).A00;
            C08319tr c08319tr = (Builder) new C08319tr();
            c08319tr.A01 = sArr;
            int length = sArr.length;
            c08319tr.A00 = length;
            obj = c08319tr;
            if (length < 10) {
                int i = length * 2;
                short[] sArrCopyOf = Arrays.copyOf(sArr, 10 < i ? i : 10);
                C7384Etj.A0U(sArrCopyOf);
                c08319tr.A01 = sArrCopyOf;
                obj = c08319tr;
            }
        } else if (c9tZ instanceof C08199te) {
            long[] jArr = ((C9tP) c9oV).A00;
            ?? r3 = (Builder) new C08339tt();
            r3.A01 = jArr;
            int length2 = jArr.length;
            r3.A00 = length2;
            obj = r3;
            if (length2 < 10) {
                int i2 = length2 * 2;
                long[] jArrCopyOf = Arrays.copyOf(jArr, 10 < i2 ? i2 : 10);
                C7384Etj.A0U(jArrCopyOf);
                r3.A01 = jArrCopyOf;
                return r3;
            }
        } else if (c9tZ instanceof C9tc) {
            int[] iArr = ((C9oX) c9oV).A00;
            ?? r32 = (Builder) new C08309tq();
            r32.A01 = iArr;
            int length3 = iArr.length;
            r32.A00 = length3;
            obj = r32;
            if (length3 < 10) {
                int i3 = length3 * 2;
                int[] iArrCopyOf = Arrays.copyOf(iArr, 10 < i3 ? i3 : 10);
                C7384Etj.A0U(iArrCopyOf);
                r32.A01 = iArrCopyOf;
                return r32;
            }
        } else if (c9tZ instanceof C9ta) {
            byte[] bArr = ((C9oW) c9oV).A00;
            ?? r33 = (Builder) new C08329ts();
            r33.A01 = bArr;
            int length4 = bArr.length;
            r33.A00 = length4;
            obj = r33;
            if (length4 < 10) {
                int i4 = length4 * 2;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 10 < i4 ? i4 : 10);
                C7384Etj.A0U(bArrCopyOf);
                r33.A01 = bArrCopyOf;
                return r33;
            }
        } else if (c9tZ instanceof C08209tg) {
            short[] sArr2 = (short[]) c9oV;
            C7384Etj.A0Y(sArr2, 0);
            ?? r34 = (Builder) new C08379tx();
            r34.A01 = sArr2;
            int length5 = sArr2.length;
            r34.A00 = length5;
            obj = r34;
            if (length5 < 10) {
                int i5 = length5 * 2;
                short[] sArrCopyOf2 = Arrays.copyOf(sArr2, 10 < i5 ? i5 : 10);
                C7384Etj.A0U(sArrCopyOf2);
                r34.A01 = sArrCopyOf2;
                return r34;
            }
        } else if (c9tZ instanceof C08279tn) {
            long[] jArr2 = (long[]) c9oV;
            C7384Etj.A0Y(jArr2, 0);
            ?? r35 = (Builder) new C08369tw();
            r35.A01 = jArr2;
            int length6 = jArr2.length;
            r35.A00 = length6;
            obj = r35;
            if (length6 < 10) {
                int i6 = length6 * 2;
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10 < i6 ? i6 : 10);
                C7384Etj.A0U(jArrCopyOf2);
                r35.A01 = jArrCopyOf2;
                return r35;
            }
        } else if (c9tZ instanceof C08249tk) {
            int[] iArr2 = (int[]) c9oV;
            C7384Etj.A0Y(iArr2, 0);
            ?? r36 = (Builder) new C08359tv();
            r36.A01 = iArr2;
            int length7 = iArr2.length;
            r36.A00 = length7;
            obj = r36;
            if (length7 < 10) {
                int i7 = length7 * 2;
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, 10 < i7 ? i7 : 10);
                C7384Etj.A0U(iArrCopyOf2);
                r36.A01 = iArrCopyOf2;
                return r36;
            }
        } else if (c9tZ instanceof C08229ti) {
            float[] fArr = (float[]) c9oV;
            C7384Etj.A0Y(fArr, 0);
            ?? r37 = (Builder) new C9u1();
            r37.A01 = fArr;
            int length8 = fArr.length;
            r37.A00 = length8;
            obj = r37;
            if (length8 < 10) {
                int i8 = length8 * 2;
                float[] fArrCopyOf = Arrays.copyOf(fArr, 10 < i8 ? i8 : 10);
                C7384Etj.A0U(fArrCopyOf);
                r37.A01 = fArrCopyOf;
                return r37;
            }
        } else if (c9tZ instanceof C08219th) {
            double[] dArr = (double[]) c9oV;
            C7384Etj.A0Y(dArr, 0);
            ?? r38 = (Builder) new C9u0();
            r38.A01 = dArr;
            int length9 = dArr.length;
            r38.A00 = length9;
            obj = r38;
            if (length9 < 10) {
                int i9 = length9 * 2;
                double[] dArrCopyOf = Arrays.copyOf(dArr, 10 < i9 ? i9 : 10);
                C7384Etj.A0U(dArrCopyOf);
                r38.A01 = dArrCopyOf;
                return r38;
            }
        } else if (c9tZ instanceof C08259tl) {
            char[] cArr = (char[]) c9oV;
            C7384Etj.A0Y(cArr, 0);
            ?? r39 = (Builder) new C08399tz();
            r39.A01 = cArr;
            int length10 = cArr.length;
            r39.A00 = length10;
            obj = r39;
            if (length10 < 10) {
                int i10 = length10 * 2;
                char[] cArrCopyOf = Arrays.copyOf(cArr, 10 < i10 ? i10 : 10);
                C7384Etj.A0U(cArrCopyOf);
                r39.A01 = cArrCopyOf;
                return r39;
            }
        } else if (c9tZ instanceof C9tf) {
            byte[] bArr2 = (byte[]) c9oV;
            C7384Etj.A0Y(bArr2, 0);
            ?? r310 = (Builder) new C08349tu();
            r310.A01 = bArr2;
            int length11 = bArr2.length;
            r310.A00 = length11;
            obj = r310;
            if (length11 < 10) {
                int i11 = length11 * 2;
                byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, 10 < i11 ? i11 : 10);
                C7384Etj.A0U(bArrCopyOf2);
                r310.A01 = bArrCopyOf2;
                return r310;
            }
        } else {
            if (!(c9tZ instanceof C08269tm)) {
                ?? r2 = (Builder) ((Collection) c9oV);
                C7384Etj.A0Y(r2, 0);
                return r2 instanceof ArrayList ? r2 : (Builder) new ArrayList((Collection) r2);
            }
            boolean[] zArr = (boolean[]) c9oV;
            C7384Etj.A0Y(zArr, 0);
            ?? r311 = (Builder) new C08389ty();
            r311.A01 = zArr;
            int length12 = zArr.length;
            r311.A00 = length12;
            obj = r311;
            if (length12 < 10) {
                int i12 = length12 * 2;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, 10 < i12 ? i12 : 10);
                C7384Etj.A0U(zArrCopyOf);
                r311.A01 = zArrCopyOf;
                return r311;
            }
        }
        return (Builder) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Collection A04(Builder builder) throws NegativeArraySizeException {
        Collection collection;
        if (!(this instanceof C9tT)) {
            if (this instanceof C9uR) {
                AbstractCollection abstractCollection = (AbstractCollection) builder;
                C7384Etj.A0Y(abstractCollection, 0);
                C9uG<ElementKlass> c9uG = ((C9uR) this).A00;
                C7384Etj.A0Y(c9uG, 1);
                Object objNewInstance = Array.newInstance((Class<?>) C9uT.A01(c9uG), abstractCollection.size());
                C7384Etj.A0Z(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
                Collection collection2 = (Collection) abstractCollection.toArray((Object[]) objNewInstance);
                C7384Etj.A0U(collection2);
                return collection2;
            }
            if (this instanceof C9tZ) {
                C9u3 c9u3 = (C9u3) builder;
                C7384Etj.A0Y(c9u3, 0);
                if (c9u3 instanceof C08319tr) {
                    C08319tr c08319tr = (C08319tr) c9u3;
                    short[] sArrCopyOf = Arrays.copyOf(c08319tr.A01, c08319tr.A00);
                    C7384Etj.A0U(sArrCopyOf);
                    return (Collection) new C9oV(sArrCopyOf);
                }
                if (c9u3 instanceof C08339tt) {
                    C08339tt c08339tt = (C08339tt) c9u3;
                    long[] jArrCopyOf = Arrays.copyOf(c08339tt.A01, c08339tt.A00);
                    C7384Etj.A0U(jArrCopyOf);
                    return (Collection) new C9tP(jArrCopyOf);
                }
                if (c9u3 instanceof C08309tq) {
                    C08309tq c08309tq = (C08309tq) c9u3;
                    int[] iArrCopyOf = Arrays.copyOf(c08309tq.A01, c08309tq.A00);
                    C7384Etj.A0U(iArrCopyOf);
                    return (Collection) new C9oX(iArrCopyOf);
                }
                if (c9u3 instanceof C08329ts) {
                    C08329ts c08329ts = (C08329ts) c9u3;
                    byte[] bArrCopyOf = Arrays.copyOf(c08329ts.A01, c08329ts.A00);
                    C7384Etj.A0U(bArrCopyOf);
                    return (Collection) new C9oW(bArrCopyOf);
                }
                if (c9u3 instanceof C08379tx) {
                    C08379tx c08379tx = (C08379tx) c9u3;
                    collection = (Collection) Arrays.copyOf(c08379tx.A01, c08379tx.A00);
                } else if (c9u3 instanceof C08369tw) {
                    C08369tw c08369tw = (C08369tw) c9u3;
                    collection = (Collection) Arrays.copyOf(c08369tw.A01, c08369tw.A00);
                } else if (c9u3 instanceof C08359tv) {
                    C08359tv c08359tv = (C08359tv) c9u3;
                    collection = (Collection) Arrays.copyOf(c08359tv.A01, c08359tv.A00);
                } else if (c9u3 instanceof C9u1) {
                    C9u1 c9u1 = (C9u1) c9u3;
                    collection = (Collection) Arrays.copyOf(c9u1.A01, c9u1.A00);
                } else if (c9u3 instanceof C9u0) {
                    C9u0 c9u0 = (C9u0) c9u3;
                    collection = (Collection) Arrays.copyOf(c9u0.A01, c9u0.A00);
                } else if (c9u3 instanceof C08399tz) {
                    C08399tz c08399tz = (C08399tz) c9u3;
                    collection = (Collection) Arrays.copyOf(c08399tz.A01, c08399tz.A00);
                } else if (c9u3 instanceof C08349tu) {
                    C08349tu c08349tu = (C08349tu) c9u3;
                    collection = (Collection) Arrays.copyOf(c08349tu.A01, c08349tu.A00);
                } else {
                    C08389ty c08389ty = (C08389ty) c9u3;
                    collection = (Collection) Arrays.copyOf(c08389ty.A01, c08389ty.A00);
                }
                C7384Etj.A0U(collection);
                return collection;
            }
        }
        C7384Etj.A0Y(builder, 0);
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Iterator<Element> A06(Collection collection) {
        if (this instanceof C9tT) {
            Map map = (Map) collection;
            C7384Etj.A0Y(map, 0);
            return AnonymousClass002.A0n(map);
        }
        if (!(this instanceof C9uR)) {
            throw C3cG.A0Q("This method lead to boxing and must not be used, use writeContents instead");
        }
        Object[] objArr = (Object[]) collection;
        C7384Etj.A0Y(objArr, 0);
        return new F3E(objArr);
    }

    public final Object A05(InterfaceC07829iw interfaceC07829iw) {
        Builder builderA03 = A03();
        int iA01 = A01(builderA03);
        C9j4 c9j4A55 = interfaceC07829iw.A55(getDescriptor());
        while (true) {
            int iA8N = c9j4A55.A8N(getDescriptor());
            if (iA8N == -1) {
                c9j4A55.AAd(getDescriptor());
                return A04(builderA03);
            }
            A07(builderA03, c9j4A55, iA8N + iA01, true);
        }
    }
}
