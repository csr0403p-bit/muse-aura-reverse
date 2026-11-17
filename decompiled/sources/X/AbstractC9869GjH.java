package X;

import com.fasterxml.jackson.core.JsonGenerationException;

/* renamed from: X.GjH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9869GjH extends AbstractC9870GjI implements InterfaceC9786Ggu {
    public static final C9861Gj9 A00 = C9861Gj9.A00;
    public static final long serialVersionUID = 1;
    public final C9861Gj9 _bindings;
    public final AbstractC9870GjI _superClass;
    public final AbstractC9870GjI[] _superInterfaces;

    public static void A02(StringBuilder sb, Object obj) {
        sb.append(((AbstractC9869GjH) obj).A0V());
        sb.append('>');
    }

    public final String A0V() {
        StringBuilder sbA0w;
        if (this instanceof C9800GhI) {
            return toString();
        }
        if (this instanceof C9868GjG) {
            C9868GjG c9868GjG = (C9868GjG) this;
            sbA0w = C60O.A0w();
            Class<?> cls = c9868GjG._class;
            BV6.A18(cls, sbA0w);
            if (c9868GjG._keyType != null && cls.getTypeParameters().length == 2) {
                sbA0w.append('<');
                sbA0w.append(((AbstractC9869GjH) c9868GjG._keyType).A0V());
                sbA0w.append(',');
                A02(sbA0w, c9868GjG._valueType);
            }
        } else if (this instanceof C9866GjE) {
            C9866GjE c9866GjE = (C9866GjE) this;
            if (c9866GjE instanceof C9871GjJ) {
                C9871GjJ c9871GjJ = (C9871GjJ) c9866GjE;
                sbA0w = C60O.A0w();
                Class<?> cls2 = c9871GjJ._class;
                BV6.A18(cls2, sbA0w);
                if (c9871GjJ._referencedType != null && cls2.getTypeParameters().length == 1) {
                    sbA0w.append('<');
                    A02(sbA0w, c9871GjJ._referencedType);
                }
            } else if (c9866GjE instanceof C9867GjF) {
                C9867GjF c9867GjF = (C9867GjF) c9866GjE;
                sbA0w = C60O.A0w();
                Class<?> cls3 = c9867GjF._class;
                BV6.A18(cls3, sbA0w);
                if (c9867GjF._iteratedType != null && cls3.getTypeParameters().length == 1) {
                    sbA0w.append('<');
                    A02(sbA0w, c9867GjF._iteratedType);
                }
            } else {
                sbA0w = C60O.A0w();
                Class<?> cls4 = c9866GjE._class;
                BV6.A18(cls4, sbA0w);
                int length = c9866GjE._bindings._types.length;
                if (length > 0 && cls4.getTypeParameters().length == length) {
                    sbA0w.append('<');
                    int i = 0;
                    do {
                        AbstractC9870GjI abstractC9870GjIA0B = c9866GjE.A0B(i);
                        if (i > 0) {
                            sbA0w.append(',');
                        }
                        sbA0w.append(((AbstractC9869GjH) abstractC9870GjIA0B).A0V());
                        i++;
                    } while (i < length);
                    sbA0w.append('>');
                }
            }
        } else {
            if (!(this instanceof AbstractC9865GjD)) {
                return AbstractC9870GjI.A04(this);
            }
            AbstractC9865GjD abstractC9865GjD = (AbstractC9865GjD) this;
            sbA0w = C60O.A0w();
            Class<?> cls5 = abstractC9865GjD._class;
            BV6.A18(cls5, sbA0w);
            if (abstractC9865GjD._elementType != null && cls5.getTypeParameters().length == 1) {
                sbA0w.append('<');
                A02(sbA0w, abstractC9865GjD._elementType);
            }
        }
        return sbA0w.toString();
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcZ(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP) throws JsonGenerationException {
        EnumC9834GiY enumC9834GiY = EnumC9834GiY.VALUE_STRING;
        C10091GpF c10091GpF = new C10091GpF();
        c10091GpF.A03 = this;
        c10091GpF.A04 = null;
        c10091GpF.A00 = enumC9834GiY;
        abstractC9996GnP.A02(abstractC9919GlE, c10091GpF);
        AcY(abstractC9919GlE, abstractC9842Gii);
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpF);
    }

    public AbstractC9869GjH(AbstractC9869GjH abstractC9869GjH) {
        super(abstractC9869GjH);
        this._superClass = abstractC9869GjH._superClass;
        this._superInterfaces = abstractC9869GjH._superInterfaces;
        this._bindings = abstractC9869GjH._bindings;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Class<*>;Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder; */
    public static void A01(Class cls, StringBuilder sb, boolean z) {
        char c;
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = name.charAt(i);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb.append(cCharAt);
            }
            if (!z) {
                return;
            } else {
                c = ';';
            }
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else {
            if (cls != Void.TYPE) {
                throw BV5.A0U("Unrecognized primitive type: ", cls.getName());
            }
            c = 'V';
        }
        sb.append(c);
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcY(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii) {
        abstractC9919GlE.A0s(A0V());
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gj9;LX/GjI;[LX/GjI;ILjava/lang/Object;Ljava/lang/Object;Z)V */
    public AbstractC9869GjH(AbstractC9870GjI abstractC9870GjI, C9861Gj9 c9861Gj9, Class cls, Object obj, Object obj2, AbstractC9870GjI[] abstractC9870GjIArr, int i, boolean z) {
        super(cls, obj, obj2, i, z);
        this._bindings = c9861Gj9 == null ? A00 : c9861Gj9;
        this._superClass = abstractC9870GjI;
        this._superInterfaces = abstractC9870GjIArr;
    }
}
