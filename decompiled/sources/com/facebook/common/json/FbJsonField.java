package com.facebook.common.json;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.C3cG;
import X.C60O;
import X.EnumC9834GiY;
import X.F60;
import X.FGI;
import X.Ho3;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FbJsonField {
    public final Field A00;
    public final Method A01;

    public class BeanJsonField extends FbJsonField {
        /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: Exception -> 0x00c0, TryCatch #0 {Exception -> 0x00c0, blocks: (B:2:0x0000, B:4:0x0005, B:5:0x000b, B:7:0x0013, B:9:0x0017, B:11:0x002c, B:14:0x0039, B:16:0x004c, B:18:0x0050, B:19:0x0054, B:26:0x0069, B:27:0x0071, B:29:0x0077, B:31:0x007f, B:33:0x0087, B:37:0x0090, B:39:0x009b, B:42:0x00b0, B:43:0x00bb, B:41:0x00a4, B:25:0x0067, B:22:0x005b, B:24:0x0060, B:44:0x00bc, B:12:0x002e), top: B:49:0x0000 }] */
        @Override // com.facebook.common.json.FbJsonField
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void deserialize(java.lang.Object r14, X.AbstractC9916Gl7 r15, X.AbstractC9904Gkk r16) throws java.lang.IllegalAccessException, java.lang.SecurityException, com.fasterxml.jackson.databind.JsonMappingException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
            /*
                r13 = this;
                java.lang.reflect.Method r3 = r13.A01     // Catch: java.lang.Exception -> Lc0
                r12 = 0
                if (r3 == 0) goto L2e
                java.lang.reflect.Type[] r0 = r3.getGenericParameterTypes()     // Catch: java.lang.Exception -> Lc0
                r2 = r0[r12]     // Catch: java.lang.Exception -> Lc0
            Lb:
                X.GiY r0 = r15.A1O()     // Catch: java.lang.Exception -> Lc0
                X.GiY r1 = X.EnumC9834GiY.VALUE_NULL     // Catch: java.lang.Exception -> Lc0
                if (r0 == r1) goto Lbc
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Exception -> Lc0
                if (r0 == 0) goto L60
                r0 = r2
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0     // Catch: java.lang.Exception -> Lc0
                java.lang.reflect.Type r8 = r0.getRawType()     // Catch: java.lang.Exception -> Lc0
                java.lang.Class r8 = (java.lang.Class) r8     // Catch: java.lang.Exception -> Lc0
                java.lang.reflect.Type[] r4 = r0.getActualTypeArguments()     // Catch: java.lang.Exception -> Lc0
                java.lang.Class<com.google.common.collect.ImmutableList> r0 = com.google.common.collect.ImmutableList.class
                boolean r0 = r0.isAssignableFrom(r8)     // Catch: java.lang.Exception -> Lc0
                if (r0 == 0) goto L60
                int r0 = r4.length     // Catch: java.lang.Exception -> Lc0
                goto L35
            L2e:
                java.lang.reflect.Field r0 = r13.A00     // Catch: java.lang.Exception -> Lc0
                java.lang.reflect.Type r2 = r0.getGenericType()     // Catch: java.lang.Exception -> Lc0
                goto Lb
            L35:
                boolean r0 = X.BV7.A1Q(r0)
                com.google.common.base.Preconditions.checkState(r0)     // Catch: java.lang.Exception -> Lc0
                X.Gj8 r2 = X.C9860Gj8.A08     // Catch: java.lang.Exception -> Lc0
                r0 = r4[r12]     // Catch: java.lang.Exception -> Lc0
                X.GjI r6 = r2.A09(r0)     // Catch: java.lang.Exception -> Lc0
                X.Gj9 r0 = X.AbstractC9869GjH.A00     // Catch: java.lang.Exception -> Lc0
                java.lang.reflect.TypeVariable[] r0 = r8.getTypeParameters()     // Catch: java.lang.Exception -> Lc0
                if (r0 == 0) goto L5b
                int r2 = r0.length     // Catch: java.lang.Exception -> Lc0
                r0 = 1
                if (r2 != r0) goto L5b
                X.Gj9 r7 = X.C9861Gj9.A01(r6, r8)     // Catch: java.lang.Exception -> Lc0
            L54:
                java.lang.Class r0 = r8.getSuperclass()     // Catch: java.lang.Exception -> Lc0
                if (r0 != 0) goto L67
                goto L5e
            L5b:
                X.Gj9 r7 = X.C9861Gj9.A00     // Catch: java.lang.Exception -> Lc0
                goto L54
            L5e:
                r5 = 0
                goto L69
            L60:
                X.Gj8 r0 = X.C9860Gj8.A08     // Catch: java.lang.Exception -> Lc0
                X.GjI r4 = r0.A09(r2)     // Catch: java.lang.Exception -> Lc0
                goto L71
            L67:
                X.GjE r5 = X.C9860Gj8.A05     // Catch: java.lang.Exception -> Lc0
            L69:
                r9 = 0
                X.GjM r4 = new X.GjM     // Catch: java.lang.Exception -> Lc0
                r10 = r9
                r11 = r9
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lc0
            L71:
                X.GiY r0 = r15.A1O()     // Catch: java.lang.Exception -> Lc0
                if (r0 == r1) goto Lbc
                X.GhC r0 = r15.A1Q()     // Catch: java.lang.Exception -> Lc0
                X.GhE r0 = (X.C9796GhE) r0     // Catch: java.lang.Exception -> Lc0
                if (r0 == 0) goto La4
                r1 = r16
                com.fasterxml.jackson.databind.JsonDeserializer r0 = r0.A09(r1, r4)     // Catch: java.lang.Exception -> Lc0
                if (r0 == 0) goto Lb0
                java.lang.Object r2 = r0.A0i(r15, r1)     // Catch: java.lang.Exception -> Lc0
                if (r2 == 0) goto Lbf
                r1 = 1
                if (r3 == 0) goto L9b
                r3.setAccessible(r1)     // Catch: java.lang.Exception -> Lc0
                java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> Lc0
                r3.invoke(r14, r0)     // Catch: java.lang.Exception -> Lc0
                return
            L9b:
                java.lang.reflect.Field r0 = r13.A00     // Catch: java.lang.Exception -> Lc0
                r0.setAccessible(r1)     // Catch: java.lang.Exception -> Lc0
                r0.set(r14, r2)     // Catch: java.lang.Exception -> Lc0
                return
            La4:
                java.lang.String r0 = "No codec available on JsonParser for type: "
                java.lang.String r1 = X.AnonymousClass007.A0a(r0, r4)     // Catch: java.lang.Exception -> Lc0
                com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException     // Catch: java.lang.Exception -> Lc0
                r0.<init>(r15, r1)     // Catch: java.lang.Exception -> Lc0
                goto Lbb
            Lb0:
                java.lang.String r0 = "Cannot find deserializer for type: "
                java.lang.String r1 = X.AnonymousClass007.A0a(r0, r4)     // Catch: java.lang.Exception -> Lc0
                com.fasterxml.jackson.databind.JsonMappingException r0 = new com.fasterxml.jackson.databind.JsonMappingException     // Catch: java.lang.Exception -> Lc0
                r0.<init>(r15, r1)     // Catch: java.lang.Exception -> Lc0
            Lbb:
                throw r0     // Catch: java.lang.Exception -> Lc0
            Lbc:
                r15.A1j()     // Catch: java.lang.Exception -> Lc0
            Lbf:
                return
            Lc0:
                r0 = move-exception
                X.AbstractC7609F5w.A1O(r0)
                X.F60 r0 = X.F60.createAndThrow()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.json.FbJsonField.BeanJsonField.deserialize(java.lang.Object, X.Gl7, X.Gkk):void");
        }
    }

    public final class ImmutableListJsonField extends FbJsonField {
        public Ho3<?> A00;
        public Class<?> A01;

        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            ImmutableList immutableListA0i;
            try {
                Class<?> cls = this.A01;
                if (abstractC9916Gl7.A1O() == EnumC9834GiY.VALUE_NULL) {
                    immutableListA0i = ImmutableList.of();
                } else {
                    if (cls == null) {
                        throw C60O.A0i("Need to set simple or generic inner list type!");
                    }
                    immutableListA0i = new ImmutableListDeserializer(cls).A0i(abstractC9916Gl7, abstractC9904Gkk);
                }
                Method method = super.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, immutableListA0i);
                } else {
                    Field field = super.A00;
                    field.setAccessible(true);
                    field.set(obj, immutableListA0i);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public static FbJsonField jsonField(Field field) {
        return jsonField(field, (Class<?>) null, (Ho3<?>) null);
    }

    public static FbJsonField jsonFieldWithCreator(Field field) {
        return new BeanJsonField(field, null);
    }

    public abstract void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk);

    public final class BoolJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                boolean zA1s = abstractC9916Gl7.A1s();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Boolean.valueOf(zA1s));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setBoolean(obj, zA1s);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public final class DoubleJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            double dA18;
            try {
                EnumC9834GiY enumC9834GiYA1O = abstractC9916Gl7.A1O();
                if (enumC9834GiYA1O == EnumC9834GiY.VALUE_NULL) {
                    abstractC9916Gl7.A1j();
                    dA18 = 0.0d;
                } else {
                    dA18 = (enumC9834GiYA1O == EnumC9834GiY.VALUE_STRING && "NaN".equals(abstractC9916Gl7.A27())) ? Double.NaN : abstractC9916Gl7.A18();
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Double.valueOf(dA18));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setDouble(obj, dA18);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public final class FloatJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            float fA1A;
            try {
                EnumC9834GiY enumC9834GiYA1O = abstractC9916Gl7.A1O();
                if (enumC9834GiYA1O == EnumC9834GiY.VALUE_NULL) {
                    abstractC9916Gl7.A1j();
                    fA1A = 0.0f;
                } else {
                    fA1A = (enumC9834GiYA1O == EnumC9834GiY.VALUE_STRING && "NaN".equals(abstractC9916Gl7.A27())) ? Float.NaN : abstractC9916Gl7.A1A();
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Float.valueOf(fA1A));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setFloat(obj, fA1A);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public final class IntJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                int iA26 = abstractC9916Gl7.A26();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Integer.valueOf(iA26));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setInt(obj, iA26);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public final class ListJsonField extends FbJsonField {
        public Ho3<?> A00;
        public Class<?> A01;
        public JsonDeserializer<List<?>> A02;

        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Object objA0h;
            try {
                if (abstractC9916Gl7.A1O() == EnumC9834GiY.VALUE_NULL) {
                    objA0h = C3cG.A0h();
                } else {
                    JsonDeserializer arrayListDeserializer = this.A02;
                    if (arrayListDeserializer == null) {
                        Class<?> cls = this.A01;
                        if (cls == null) {
                            throw C60O.A0i("Need to set simple or generic inner list type!");
                        }
                        arrayListDeserializer = new ArrayListDeserializer(cls);
                        this.A02 = arrayListDeserializer;
                    }
                    objA0h = (List) arrayListDeserializer.A0i(abstractC9916Gl7, abstractC9904Gkk);
                }
                Method method = super.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, objA0h);
                } else {
                    Field field = super.A00;
                    field.setAccessible(true);
                    field.set(obj, objA0h);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public final class LongJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                long jA1H = abstractC9916Gl7.A1H();
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, Long.valueOf(jA1H));
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.setLong(obj, jA1H);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public final class StringJsonField extends FbJsonField {
        @Override // com.facebook.common.json.FbJsonField
        public void deserialize(Object obj, AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IllegalAccessException, SecurityException, IllegalArgumentException, JsonParseException, InvocationTargetException {
            String strA1c;
            try {
                if (abstractC9916Gl7.A1O() == EnumC9834GiY.VALUE_NULL) {
                    abstractC9916Gl7.A1j();
                    strA1c = null;
                } else {
                    strA1c = abstractC9916Gl7.A1c();
                    if (strA1c == null) {
                        throw AbstractC7610F5x.A0g(abstractC9916Gl7, "Failed to read text from Json stream");
                    }
                }
                Method method = this.A01;
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(obj, strA1c);
                } else {
                    Field field = this.A00;
                    field.setAccessible(true);
                    field.set(obj, strA1c);
                }
            } catch (Exception e) {
                AbstractC7609F5w.A1O(e);
                throw F60.createAndThrow();
            }
        }
    }

    public FbJsonField(Field field, Method method) {
        this.A00 = field;
        this.A01 = method;
    }

    public static FbJsonField jsonField(Method method, Class<?> cls, Ho3<?> ho3) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 1) {
            Class<?> cls2 = parameterTypes[0];
            if (cls2 == String.class) {
                return new StringJsonField(null, method);
            }
            if (cls2 == Integer.TYPE) {
                return new IntJsonField(null, method);
            }
            if (cls2 == Long.TYPE) {
                return new LongJsonField(null, method);
            }
            if (cls2 == Boolean.TYPE) {
                return new BoolJsonField(null, method);
            }
            if (cls2 == Float.TYPE) {
                return new FloatJsonField(null, method);
            }
            if (cls2 == Double.TYPE) {
                return new DoubleJsonField(null, method);
            }
            if (cls2 == ImmutableList.class) {
                ImmutableListJsonField immutableListJsonField = new ImmutableListJsonField(null, method);
                immutableListJsonField.A01 = cls;
                immutableListJsonField.A00 = ho3;
                return immutableListJsonField;
            }
            if (cls2 != List.class && cls2 != ArrayList.class) {
                return new BeanJsonField(null, method);
            }
            ListJsonField listJsonField = new ListJsonField(null, method);
            listJsonField.A01 = cls;
            listJsonField.A00 = ho3;
            return listJsonField;
        }
        throw BV4.A0c(FGI.A0U("Invalid setter type ", method.getName(), " Only setter with on input parameter is supported."));
    }

    public static FbJsonField jsonField(Field field, Class<?> cls, Ho3<?> ho3) {
        Class<?> type = field.getType();
        if (type == String.class) {
            return new StringJsonField(field, null);
        }
        if (type == Integer.TYPE) {
            return new IntJsonField(field, null);
        }
        if (type == Long.TYPE) {
            return new LongJsonField(field, null);
        }
        if (type == Boolean.TYPE) {
            return new BoolJsonField(field, null);
        }
        if (type == Float.TYPE) {
            return new FloatJsonField(field, null);
        }
        if (type == Double.TYPE) {
            return new DoubleJsonField(field, null);
        }
        if (type == ImmutableList.class) {
            ImmutableListJsonField immutableListJsonField = new ImmutableListJsonField(field, null);
            immutableListJsonField.A01 = cls;
            immutableListJsonField.A00 = ho3;
            return immutableListJsonField;
        }
        if (type != List.class && type != ArrayList.class) {
            return new BeanJsonField(field, null);
        }
        ListJsonField listJsonField = new ListJsonField(field, null);
        listJsonField.A01 = cls;
        listJsonField.A00 = ho3;
        return listJsonField;
    }

    public static FbJsonField jsonField(Method method, Class<?> cls) {
        return jsonField(method, cls, (Ho3<?>) null);
    }

    public static FbJsonField jsonField(Field field, Ho3<?> ho3) {
        return jsonField(field, (Class<?>) null, ho3);
    }

    public static FbJsonField jsonField(Field field, Class<?> cls) {
        return jsonField(field, cls, (Ho3<?>) null);
    }

    public static FbJsonField jsonField(Method method, Ho3<?> ho3) {
        return jsonField(method, (Class<?>) null, ho3);
    }

    public static FbJsonField jsonField(Method method) {
        return jsonField(method, (Class<?>) null, (Ho3<?>) null);
    }
}
