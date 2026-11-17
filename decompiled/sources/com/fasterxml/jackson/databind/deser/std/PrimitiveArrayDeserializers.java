package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC10054GoZ;
import X.AbstractC7608F5v;
import X.AbstractC9870GjI;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C10009Gnh;
import X.C10119Gpk;
import X.C10167Gqc;
import X.C10168Gqd;
import X.C10169Gqe;
import X.C10170Gqf;
import X.C10171Gqg;
import X.C10173Gqi;
import X.C6xC;
import X.C9801GhN;
import X.C9993GnM;
import X.EnumC10062Goj;
import X.EnumC10073Gou;
import X.EnumC9834GiY;
import X.F60;
import X.InterfaceC10017Gnp;
import X.InterfaceC10165Gqa;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes6.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements InterfaceC9830GiT {
    public transient Object A00;
    public final InterfaceC10165Gqa _nuller;
    public final Boolean _unwrapSingle;

    @JacksonStdImpl
    public final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        public static final long serialVersionUID = 1;

        public BooleanDeser() {
            super(boolean[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final boolean[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
            boolean[] zArrA03;
            boolean zA1I;
            int i;
            if (abstractC9916Gl7.A1x()) {
                C9993GnM c9993GnMA0N = JsonDeserializer.A0N(abstractC9904Gkk);
                C10173Gqi c10173Gqi = c9993GnMA0N.A00;
                if (c10173Gqi == null) {
                    c10173Gqi = new C10173Gqi();
                    c9993GnMA0N.A00 = c10173Gqi;
                }
                boolean[] zArrA00 = c10173Gqi.A00();
                int i2 = 0;
                while (true) {
                    try {
                        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                        if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                            break;
                        }
                        try {
                            if (enumC9834GiYA1P == EnumC9834GiY.VALUE_TRUE) {
                                zA1I = true;
                            } else {
                                if (enumC9834GiYA1P != EnumC9834GiY.VALUE_FALSE) {
                                    if (enumC9834GiYA1P == EnumC9834GiY.VALUE_NULL) {
                                        InterfaceC10165Gqa interfaceC10165Gqa = this._nuller;
                                        if (interfaceC10165Gqa != null) {
                                            interfaceC10165Gqa.AIA(abstractC9904Gkk);
                                        } else {
                                            A1E(abstractC9904Gkk);
                                        }
                                    } else {
                                        zA1I = A1I(abstractC9916Gl7, abstractC9904Gkk);
                                    }
                                }
                                zA1I = false;
                            }
                            zArrA00[i2] = zA1I;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.A03(zArrA00, e, c10173Gqi.A00 + i2);
                        }
                        if (i2 >= zArrA00.length) {
                            zArrA00 = c10173Gqi.A02(zArrA00, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                zArrA03 = c10173Gqi.A03(zArrA00, i2);
            } else {
                zArrA03 = A1K(abstractC9916Gl7, abstractC9904Gkk);
            }
            return zArrA03;
        }
    }

    @JacksonStdImpl
    public final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        public static final long serialVersionUID = 1;

        public ByteDeser() {
            super(byte[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v3, types: [byte[]] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final byte[] A0i(X.AbstractC9916Gl7 r6, X.AbstractC9904Gkk r7) throws com.fasterxml.jackson.databind.JsonMappingException {
            /*
                r5 = this;
                X.GiY r2 = r6.A1N()
                X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
                r1 = 0
                if (r2 != r0) goto L31
                X.Gke r0 = r7._config     // Catch: java.lang.Throwable -> L14
                X.GkY r0 = r0._base     // Catch: java.lang.Throwable -> L14
                X.Gn1 r0 = r0._defaultBase64     // Catch: java.lang.Throwable -> L14
                byte[] r1 = r6.A24(r0)     // Catch: java.lang.Throwable -> L14
                return r1
            L14:
                r0 = move-exception
                java.lang.String r3 = r0.A05()
                java.lang.String r0 = "base64"
                boolean r0 = r3.contains(r0)
                if (r0 == 0) goto L31
                java.lang.String r2 = r6.A1c()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.Class<byte[]> r0 = byte[].class
                r7.A0k(r0, r2, r3, r1)
                X.F60 r0 = X.F60.createAndThrow()
                throw r0
            L31:
                X.GiY r0 = X.EnumC9834GiY.VALUE_EMBEDDED_OBJECT
                if (r2 != r0) goto L3d
                java.lang.Object r1 = r6.A1V()
                if (r1 != 0) goto L9a
                r1 = 0
                return r1
            L3d:
                boolean r0 = r6.A1x()
                if (r0 != 0) goto L48
                java.lang.Object r1 = r5.A1K(r6, r7)
                goto La0
            L48:
                X.GnM r0 = com.fasterxml.jackson.databind.JsonDeserializer.A0N(r7)
                X.Gqh r4 = r0.A01
                if (r4 != 0) goto L57
                X.Gqh r4 = new X.Gqh
                r4.<init>()
                r0.A01 = r4
            L57:
                java.lang.Object r3 = r4.A00()
                byte[] r3 = (byte[]) r3
                r2 = 0
            L5e:
                X.GiY r1 = r6.A1P()     // Catch: java.lang.Exception -> La6
                X.GiY r0 = X.EnumC9834GiY.END_ARRAY     // Catch: java.lang.Exception -> La6
                if (r1 == r0) goto L95
                X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_INT     // Catch: java.lang.Exception -> La6
                if (r1 != r0) goto L7f
                byte r1 = r6.A16()     // Catch: java.lang.Exception -> La6
            L6e:
                int r0 = r3.length     // Catch: java.lang.Exception -> La6
                if (r2 < r0) goto L79
                java.lang.Object r0 = r4.A02(r3, r2)     // Catch: java.lang.Exception -> La6
                byte[] r0 = (byte[]) r0     // Catch: java.lang.Exception -> La6
                r3 = r0
                r2 = 0
            L79:
                int r0 = r2 + 1
                r3[r2] = r1     // Catch: java.lang.Exception -> La3
                r2 = r0
                goto L5e
            L7f:
                X.GiY r0 = X.EnumC9834GiY.VALUE_NULL     // Catch: java.lang.Exception -> La6
                if (r1 != r0) goto L90
                X.Gqa r0 = r5._nuller     // Catch: java.lang.Exception -> La6
                if (r0 == 0) goto L8b
                r0.AIA(r7)     // Catch: java.lang.Exception -> La6
                goto L5e
            L8b:
                r5.A1E(r7)     // Catch: java.lang.Exception -> La6
                r1 = 0
                goto L6e
            L90:
                byte r1 = r5.A0p(r6, r7)     // Catch: java.lang.Exception -> La6
                goto L6e
            L95:
                java.lang.Object r1 = r4.A03(r3, r2)
                goto La0
            L9a:
                boolean r0 = r1 instanceof byte[]
                if (r0 == 0) goto L3d
                byte[] r1 = (byte[]) r1
            La0:
                byte[] r1 = (byte[]) r1
                return r1
            La3:
                r1 = move-exception
                r2 = r0
                goto La7
            La6:
                r1 = move-exception
            La7:
                int r0 = r4.A00
                int r0 = r0 + r2
                com.fasterxml.jackson.databind.JsonMappingException r0 = com.fasterxml.jackson.databind.JsonMappingException.A03(r3, r1, r0)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ByteDeser.A0i(X.Gl7, X.Gkk):byte[]");
        }
    }

    @JacksonStdImpl
    public final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        public static final long serialVersionUID = 1;

        public CharDeser() {
            super(char[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final char[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
            Class<?> cls;
            String strA06;
            String strA1c;
            EnumC9834GiY enumC9834GiY = EnumC9834GiY.VALUE_STRING;
            if (abstractC9916Gl7.A22(enumC9834GiY)) {
                char[] cArrA25 = abstractC9916Gl7.A25();
                int iA1E = abstractC9916Gl7.A1E();
                int iA1D = abstractC9916Gl7.A1D();
                char[] cArr = new char[iA1D];
                System.arraycopy(cArrA25, iA1E, cArr, 0, iA1D);
                return cArr;
            }
            if (abstractC9916Gl7.A1x()) {
                StringBuilder sbA0p = BV4.A0p(64);
                while (true) {
                    EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                    if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                        strA06 = sbA0p.toString();
                        break;
                    }
                    if (enumC9834GiYA1P != enumC9834GiY) {
                        if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL) {
                            cls = Character.TYPE;
                            break;
                        }
                        InterfaceC10165Gqa interfaceC10165Gqa = this._nuller;
                        if (interfaceC10165Gqa != null) {
                            interfaceC10165Gqa.AIA(abstractC9904Gkk);
                        } else {
                            A1E(abstractC9904Gkk);
                            strA1c = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
                        }
                    } else {
                        strA1c = abstractC9916Gl7.A1c();
                    }
                    int length = strA1c.length();
                    if (length != 1) {
                        abstractC9904Gkk.A0c(this, "Cannot convert a JSON String of length %d into a char element of char array", BV5.A1Y(length));
                        break;
                    }
                    BV6.A1M(strA1c, sbA0p, 0);
                }
                abstractC9904Gkk.A0X(abstractC9916Gl7, cls);
            } else {
                if (abstractC9916Gl7.A22(EnumC9834GiY.VALUE_EMBEDDED_OBJECT)) {
                    Object objA1V = abstractC9916Gl7.A1V();
                    if (objA1V == null) {
                        return null;
                    }
                    if (objA1V instanceof char[]) {
                        return (char[]) objA1V;
                    }
                    if (objA1V instanceof String) {
                        strA06 = (String) objA1V;
                    } else if (objA1V instanceof byte[]) {
                        strA06 = AbstractC10054GoZ.A01.A06((byte[]) objA1V);
                    }
                    return strA06.toCharArray();
                }
                cls = this._valueClass;
                abstractC9904Gkk.A0X(abstractC9916Gl7, cls);
            }
            throw F60.createAndThrow();
        }
    }

    @JacksonStdImpl
    public final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        public static final long serialVersionUID = 1;

        public DoubleDeser() {
            super(double[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final double[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
            double[] dArrA03;
            InterfaceC10165Gqa interfaceC10165Gqa;
            if (abstractC9916Gl7.A1x()) {
                C9993GnM c9993GnMA0N = JsonDeserializer.A0N(abstractC9904Gkk);
                C10171Gqg c10171Gqg = c9993GnMA0N.A02;
                if (c10171Gqg == null) {
                    c10171Gqg = new C10171Gqg();
                    c9993GnMA0N.A02 = c10171Gqg;
                }
                double[] dArr = (double[]) c10171Gqg.A00();
                int i = 0;
                while (true) {
                    try {
                        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                        if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                            break;
                        }
                        if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL || (interfaceC10165Gqa = this._nuller) == null) {
                            double dA0q = A0q(abstractC9916Gl7, abstractC9904Gkk);
                            if (i >= dArr.length) {
                                dArr = (double[]) c10171Gqg.A02(dArr, i);
                                i = 0;
                            }
                            int i2 = i + 1;
                            try {
                                dArr[i] = dA0q;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw JsonMappingException.A03(dArr, e, c10171Gqg.A00 + i);
                            }
                        } else {
                            interfaceC10165Gqa.AIA(abstractC9904Gkk);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                dArrA03 = c10171Gqg.A03(dArr, i);
            } else {
                dArrA03 = A1K(abstractC9916Gl7, abstractC9904Gkk);
            }
            return dArrA03;
        }
    }

    @JacksonStdImpl
    public final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        public static final long serialVersionUID = 1;

        public FloatDeser() {
            super(float[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final float[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
            float[] fArrA03;
            InterfaceC10165Gqa interfaceC10165Gqa;
            if (abstractC9916Gl7.A1x()) {
                C9993GnM c9993GnMA0N = JsonDeserializer.A0N(abstractC9904Gkk);
                C10170Gqf c10170Gqf = c9993GnMA0N.A03;
                if (c10170Gqf == null) {
                    c10170Gqf = new C10170Gqf();
                    c9993GnMA0N.A03 = c10170Gqf;
                }
                float[] fArr = (float[]) c10170Gqf.A00();
                int i = 0;
                while (true) {
                    try {
                        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                        if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                            break;
                        }
                        if (enumC9834GiYA1P != EnumC9834GiY.VALUE_NULL || (interfaceC10165Gqa = this._nuller) == null) {
                            float fA0r = A0r(abstractC9916Gl7, abstractC9904Gkk);
                            if (i >= fArr.length) {
                                fArr = (float[]) c10170Gqf.A02(fArr, i);
                                i = 0;
                            }
                            int i2 = i + 1;
                            try {
                                fArr[i] = fA0r;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw JsonMappingException.A03(fArr, e, c10170Gqf.A00 + i);
                            }
                        } else {
                            interfaceC10165Gqa.AIA(abstractC9904Gkk);
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                fArrA03 = c10170Gqf.A03(fArr, i);
            } else {
                fArrA03 = A1K(abstractC9916Gl7, abstractC9904Gkk);
            }
            return fArrA03;
        }
    }

    @JacksonStdImpl
    public final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser A00 = new IntDeser();
        public static final long serialVersionUID = 1;

        public IntDeser() {
            super(int[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final int[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
            int[] iArrA03;
            int iA1C;
            int i;
            if (abstractC9916Gl7.A1x()) {
                C9993GnM c9993GnMA0N = JsonDeserializer.A0N(abstractC9904Gkk);
                C10169Gqe c10169Gqe = c9993GnMA0N.A04;
                if (c10169Gqe == null) {
                    c10169Gqe = new C10169Gqe();
                    c9993GnMA0N.A04 = c10169Gqe;
                }
                int[] iArr = (int[]) c10169Gqe.A00();
                int i2 = 0;
                while (true) {
                    try {
                        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                        if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                            break;
                        }
                        try {
                            if (enumC9834GiYA1P == EnumC9834GiY.VALUE_NUMBER_INT) {
                                iA1C = abstractC9916Gl7.A1C();
                            } else if (enumC9834GiYA1P == EnumC9834GiY.VALUE_NULL) {
                                InterfaceC10165Gqa interfaceC10165Gqa = this._nuller;
                                if (interfaceC10165Gqa != null) {
                                    interfaceC10165Gqa.AIA(abstractC9904Gkk);
                                } else {
                                    A1E(abstractC9904Gkk);
                                    iA1C = 0;
                                }
                            } else {
                                iA1C = A0s(abstractC9916Gl7, abstractC9904Gkk);
                            }
                            iArr[i2] = iA1C;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.A03(iArr, e, c10169Gqe.A00 + i2);
                        }
                        if (i2 >= iArr.length) {
                            iArr = (int[]) c10169Gqe.A02(iArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                iArrA03 = c10169Gqe.A03(iArr, i2);
            } else {
                iArrA03 = A1K(abstractC9916Gl7, abstractC9904Gkk);
            }
            return iArrA03;
        }
    }

    @JacksonStdImpl
    public final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser A00 = new LongDeser();
        public static final long serialVersionUID = 1;

        public LongDeser() {
            super(long[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final long[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
            long[] jArrA03;
            long jA1G;
            int i;
            if (abstractC9916Gl7.A1x()) {
                C9993GnM c9993GnMA0N = JsonDeserializer.A0N(abstractC9904Gkk);
                C10168Gqd c10168Gqd = c9993GnMA0N.A05;
                if (c10168Gqd == null) {
                    c10168Gqd = new C10168Gqd();
                    c9993GnMA0N.A05 = c10168Gqd;
                }
                long[] jArr = (long[]) c10168Gqd.A00();
                int i2 = 0;
                while (true) {
                    try {
                        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                        if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                            break;
                        }
                        try {
                            if (enumC9834GiYA1P == EnumC9834GiY.VALUE_NUMBER_INT) {
                                jA1G = abstractC9916Gl7.A1G();
                            } else if (enumC9834GiYA1P == EnumC9834GiY.VALUE_NULL) {
                                InterfaceC10165Gqa interfaceC10165Gqa = this._nuller;
                                if (interfaceC10165Gqa != null) {
                                    interfaceC10165Gqa.AIA(abstractC9904Gkk);
                                } else {
                                    A1E(abstractC9904Gkk);
                                    jA1G = 0;
                                }
                            } else {
                                jA1G = A0t(abstractC9916Gl7, abstractC9904Gkk);
                            }
                            jArr[i2] = jA1G;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.A03(jArr, e, c10168Gqd.A00 + i2);
                        }
                        if (i2 >= jArr.length) {
                            jArr = (long[]) c10168Gqd.A02(jArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                jArrA03 = c10168Gqd.A03(jArr, i2);
            } else {
                jArrA03 = A1K(abstractC9916Gl7, abstractC9904Gkk);
            }
            return jArrA03;
        }
    }

    @JacksonStdImpl
    public final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        public static final long serialVersionUID = 1;

        public ShortDeser() {
            super(short[].class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final short[] A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws JsonMappingException {
            short[] sArrA03;
            short sA1D;
            int i;
            if (abstractC9916Gl7.A1x()) {
                C9993GnM c9993GnMA0N = JsonDeserializer.A0N(abstractC9904Gkk);
                C10167Gqc c10167Gqc = c9993GnMA0N.A06;
                if (c10167Gqc == null) {
                    c10167Gqc = new C10167Gqc();
                    c9993GnMA0N.A06 = c10167Gqc;
                }
                short[] sArrA00 = c10167Gqc.A00();
                int i2 = 0;
                while (true) {
                    try {
                        EnumC9834GiY enumC9834GiYA1P = abstractC9916Gl7.A1P();
                        if (enumC9834GiYA1P == EnumC9834GiY.END_ARRAY) {
                            break;
                        }
                        try {
                            if (enumC9834GiYA1P == EnumC9834GiY.VALUE_NULL) {
                                InterfaceC10165Gqa interfaceC10165Gqa = this._nuller;
                                if (interfaceC10165Gqa != null) {
                                    interfaceC10165Gqa.AIA(abstractC9904Gkk);
                                } else {
                                    A1E(abstractC9904Gkk);
                                    sA1D = 0;
                                }
                            } else {
                                sA1D = A1D(abstractC9916Gl7, abstractC9904Gkk);
                            }
                            sArrA00[i2] = sA1D;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw JsonMappingException.A03(sArrA00, e, c10167Gqc.A00 + i2);
                        }
                        if (i2 >= sArrA00.length) {
                            sArrA00 = c10167Gqc.A02(sArrA00, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
                sArrA03 = c10167Gqc.A03(sArrA00, i2);
            } else {
                sArrA03 = A1K(abstractC9916Gl7, abstractC9904Gkk);
            }
            return sArrA03;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, double[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, float[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, long[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T A1K(X.AbstractC9916Gl7 r3, X.AbstractC9904Gkk r4) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r2 = this;
            X.GiY r0 = X.EnumC9834GiY.VALUE_STRING
            boolean r0 = r3.A22(r0)
            if (r0 == 0) goto Ld
            java.lang.Object r2 = r2.A17(r3, r4)
            return r2
        Ld:
            java.lang.Boolean r1 = r2._unwrapSingle
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L21
            if (r1 != 0) goto L6a
            X.Gmd r0 = X.EnumC9965Gmd.A04
            int r1 = r4._featureFlags
            int r0 = r0._mask
            boolean r0 = X.AbstractC7609F5w.A1U(r0, r1)
            if (r0 == 0) goto L6a
        L21:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ShortDeser
            if (r0 == 0) goto L30
            short r1 = r2.A1D(r3, r4)
            r0 = 1
            short[] r2 = new short[r0]
            r0 = 0
            r2[r0] = r1
            return r2
        L30:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.LongDeser
            if (r0 == 0) goto L3f
            long r3 = r2.A0t(r3, r4)
            r0 = 1
            long[] r2 = new long[r0]
            r0 = 0
            r2[r0] = r3
            return r2
        L3f:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.IntDeser
            if (r0 == 0) goto L4c
            int r0 = r2.A0s(r3, r4)
            int[] r2 = new int[]{r0}
            return r2
        L4c:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.FloatDeser
            if (r0 == 0) goto L5b
            float r1 = r2.A0r(r3, r4)
            r0 = 1
            float[] r2 = new float[r0]
            r0 = 0
            r2[r0] = r1
            return r2
        L5b:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.DoubleDeser
            if (r0 == 0) goto L6e
            double r3 = r2.A0q(r3, r4)
            r0 = 1
            double[] r2 = new double[r0]
            r0 = 0
            r2[r0] = r3
            return r2
        L6a:
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r3, r4, r2)
            goto L75
        L6e:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.CharDeser
            if (r0 == 0) goto L7a
            com.fasterxml.jackson.databind.JsonDeserializer.A0T(r3, r4, r2)
        L75:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L7a:
            boolean r0 = r2 instanceof com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.ByteDeser
            if (r0 == 0) goto Lb0
            X.GiY r1 = r3.A1N()
            X.GiY r0 = X.EnumC9834GiY.VALUE_NUMBER_INT
            if (r1 != r0) goto L91
            byte r1 = r3.A16()
            r0 = 1
            byte[] r2 = new byte[r0]
            r0 = 0
            r2[r0] = r1
            return r2
        L91:
            X.GiY r0 = X.EnumC9834GiY.VALUE_NULL
            if (r1 != r0) goto La1
            X.Gqa r0 = r2._nuller
            if (r0 == 0) goto Lab
            r0.AIA(r4)
            java.lang.Object r2 = r2.A0m(r4)
            return r2
        La1:
            java.lang.Class<?> r0 = r2._valueClass
            java.lang.Class r0 = r0.getComponentType()
            r4.A0X(r3, r0)
            goto L75
        Lab:
            r2.A1E(r4)
            r2 = 0
            return r2
        Lb0:
            boolean r1 = r2.A1I(r3, r4)
            r0 = 1
            boolean[] r2 = new boolean[r0]
            r0 = 0
            r2[r0] = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers.A1K(X.Gl7, X.Gkk):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        InterfaceC10165Gqa c9801GhN;
        AbstractC9870GjI abstractC9870GjIA07;
        C10009Gnh c10009GnhAFv;
        Boolean boolA10 = A10(EnumC10062Goj.A01, interfaceC10017Gnp, abstractC9904Gkk, this._valueClass);
        EnumC10073Gou enumC10073Gou = interfaceC10017Gnp != null ? interfaceC10017Gnp.AHh()._contentNulls : abstractC9904Gkk._config._configOverrides._defaultSetterInfo._contentNulls;
        if (enumC10073Gou == EnumC10073Gou.SKIP) {
            c9801GhN = C10119Gpk.A01;
        } else if (enumC10073Gou == EnumC10073Gou.FAIL) {
            if (interfaceC10017Gnp == null) {
                Class<?> componentType = this._valueClass.getComponentType();
                abstractC9870GjIA07 = componentType == null ? null : AbstractC7608F5v.A0R(abstractC9904Gkk._config, componentType);
                c10009GnhAFv = null;
            } else {
                abstractC9870GjIA07 = interfaceC10017Gnp.AM9().A07();
                c10009GnhAFv = interfaceC10017Gnp.AFv();
            }
            c9801GhN = new C9801GhN(abstractC9870GjIA07, c10009GnhAFv);
        } else {
            c9801GhN = null;
        }
        if (!C6xC.A00(boolA10, this._unwrapSingle) || c9801GhN != this._nuller) {
            if (this instanceof ShortDeser) {
                return new ShortDeser(c9801GhN, this, boolA10);
            }
            if (this instanceof LongDeser) {
                return new LongDeser(c9801GhN, this, boolA10);
            }
            if (this instanceof IntDeser) {
                return new IntDeser(c9801GhN, this, boolA10);
            }
            if (this instanceof FloatDeser) {
                return new FloatDeser(c9801GhN, this, boolA10);
            }
            if (this instanceof DoubleDeser) {
                return new DoubleDeser(c9801GhN, this, boolA10);
            }
            if (!(this instanceof CharDeser)) {
                return this instanceof ByteDeser ? new ByteDeser(c9801GhN, this, boolA10) : new BooleanDeser(c9801GhN, this, boolA10);
            }
        }
        return this;
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, InterfaceC10165Gqa interfaceC10165Gqa, Boolean bool) {
        super(interfaceC10165Gqa._valueClass);
        this._unwrapSingle = bool;
        this._nuller = primitiveArrayDeserializers;
    }
}
