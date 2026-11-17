package X;

import X.AbstractC9339GEw;
import X.GGW;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GEw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9339GEw<MessageType extends AbstractC9339GEw<MessageType, BuilderType>, BuilderType extends GGW<MessageType, BuilderType>> extends AbstractC9340GEx<MessageType, BuilderType> {
    public static Map<Object, AbstractC9339GEw<?, ?>> defaultInstanceMap = C60O.A1C();
    public GGN unknownFields = GGN.A05;
    public int memoizedSerializedSize = -1;

    public static final void A03(Object obj, String str, StringBuilder sb, int i) throws SecurityException {
        String strA01;
        if (obj instanceof List) {
            Iterator itA13 = AbstractC7607F5u.A13(obj);
            while (itA13.hasNext()) {
                A03(itA13.next(), str, sb, i);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator itA0n = AnonymousClass002.A0n((Map) obj);
            while (itA0n.hasNext()) {
                A03(itA0n.next(), str, sb, i);
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            InterfaceC9312GDo interfaceC9312GDo = AbstractC9309GDl.A00;
            strA01 = A01(new C9306GDi(((String) obj).getBytes(GGV.A03)));
        } else {
            if (!(obj instanceof AbstractC9309GDl)) {
                String string = "}";
                if (obj instanceof AbstractC9339GEw) {
                    sb.append(" {");
                    A02((AbstractC9340GEx) obj, sb, i + 2);
                    sb.append(PairsDiscretionDocument.TERMINATOR);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A03(entry.getKey(), "key", sb, i4);
                    A03(entry.getValue(), BrowserOperationCatalogKt.VALUE, sb, i4);
                    sb.append(PairsDiscretionDocument.TERMINATOR);
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    string = obj.toString();
                }
                sb.append(string);
                return;
            }
            sb.append(": \"");
            strA01 = A01((AbstractC9309GDl) obj);
        }
        sb.append(strA01);
        sb.append('\"');
    }

    public final Object A04(Integer num) {
        GH7 gGp;
        GH7 gGp2;
        GH7 gGp3;
        if (this instanceof GGY) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new C9379GGr(GGY.DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C9364GGa.class});
                case 3:
                    return new GGY();
                case 4:
                    return new C9382GGv();
                case 5:
                    return GGY.DEFAULT_INSTANCE;
                case 6:
                    GH7<GGY> gh7 = GGY.PARSER;
                    if (gh7 != null) {
                        return gh7;
                    }
                    synchronized (GGY.class) {
                        gGp3 = GGY.PARSER;
                        if (gGp3 == null) {
                            HyE hyE = GGp.A01;
                            gGp3 = new GGp(GGY.DEFAULT_INSTANCE);
                            GGY.PARSER = gGp3;
                        }
                    }
                    return gGp3;
                default:
                    throw C8j3.A17();
            }
        }
        boolean z = this instanceof C9364GGa;
        int iIntValue = num.intValue();
        if (z) {
            switch (iIntValue) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new C9379GGr(C9364GGa.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                case 3:
                    return new C9364GGa();
                case 4:
                    return new C9383GGw();
                case 5:
                    return C9364GGa.DEFAULT_INSTANCE;
                case 6:
                    GH7<C9364GGa> gh72 = C9364GGa.PARSER;
                    if (gh72 != null) {
                        return gh72;
                    }
                    synchronized (C9364GGa.class) {
                        gGp2 = C9364GGa.PARSER;
                        if (gGp2 == null) {
                            HyE hyE2 = GGp.A01;
                            gGp2 = new GGp(C9364GGa.DEFAULT_INSTANCE);
                            C9364GGa.PARSER = gGp2;
                        }
                    }
                    return gGp2;
                default:
                    throw C8j3.A17();
            }
        }
        switch (iIntValue) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C9379GGr(GGZ.DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC9385GGy.A00});
            case 3:
                return new GGZ();
            case 4:
                return new C9384GGx();
            case 5:
                return GGZ.DEFAULT_INSTANCE;
            case 6:
                GH7<GGZ> gh73 = GGZ.PARSER;
                if (gh73 != null) {
                    return gh73;
                }
                synchronized (GGZ.class) {
                    gGp = GGZ.PARSER;
                    if (gGp == null) {
                        HyE hyE3 = GGp.A01;
                        gGp = new GGp(GGZ.DEFAULT_INSTANCE);
                        GGZ.PARSER = gGp;
                    }
                }
                return gGp;
            default:
                throw C8j3.A17();
        }
    }

    @Override // X.InterfaceC9341GEy
    public final /* bridge */ /* synthetic */ AbstractC9339GEw AEi() {
        return (AbstractC9339GEw) A04(C79.A0T);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (A04(C79.A0T).getClass().isInstance(obj)) {
            return AbstractC7609F5w.A0T(this).AAo(this, obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iANL = AbstractC7609F5w.A0T(this).ANL(this);
        this.memoizedHashCode = iANL;
        return iANL;
    }

    public static Object A00(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw BV4.A0d("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BV4.A0d("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static String A01(AbstractC9309GDl abstractC9309GDl) {
        int iA0A;
        String str;
        StringBuilder sbA0p = BV4.A0p(abstractC9309GDl.A01());
        for (int i = 0; i < abstractC9309GDl.A01(); i++) {
            C9306GDi c9306GDi = (C9306GDi) abstractC9309GDl;
            if (c9306GDi instanceof C9308GDk) {
                C9308GDk c9308GDk = (C9308GDk) c9306GDi;
                int i2 = c9308GDk.bytesLength;
                if (((i2 - (i + 1)) | i) < 0) {
                    if (i < 0) {
                        throw new ArrayIndexOutOfBoundsException(FGI.A0H("Index < 0: ", i));
                    }
                    throw new ArrayIndexOutOfBoundsException(FGI.A0T("Index > length: ", ", ", i, i2));
                }
                iA0A = c9308GDk.bytes[c9308GDk.bytesOffset + i];
            } else {
                iA0A = c9306GDi.bytes[i];
            }
            if (iA0A == 34) {
                str = "\\\"";
            } else if (iA0A == 39) {
                str = "\\'";
            } else if (iA0A != 92) {
                switch (iA0A) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA0A < 32 || iA0A > 126) {
                            iA0A = AbstractC7611F5y.A0A(sbA0p, iA0A);
                        }
                        sbA0p.append((char) iA0A);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sbA0p.append(str);
        }
        return sbA0p.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7 A[LOOP:2: B:25:0x00a1->B:27:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d A[LOOP:3: B:58:0x0167->B:60:0x016d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.GH2 r13, java.lang.StringBuilder r14, int r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9339GEw.A02(X.GH2, java.lang.StringBuilder, int):void");
    }

    @Override // X.GH2
    public final void Aiz(GGI ggi) {
        InterfaceC9366GGc interfaceC9366GGcA0T = AbstractC7609F5w.A0T(this);
        GGL ggl = ggi.A00;
        if (ggl == null) {
            ggl = new GGL(ggi);
        }
        interfaceC9366GGcA0T.Aj3(ggl, this);
    }

    public final String toString() throws Throwable {
        StringBuilder sbA13 = AbstractC7610F5x.A13(super.toString());
        A02(this, sbA13, 0);
        return sbA13.toString();
    }
}
