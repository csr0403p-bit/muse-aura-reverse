package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cx6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4481Cx6 implements InterfaceC3892CgV {
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final InterfaceC3288C9m<Map.Entry<Object, Object>> A07;
    public static final Charset A08 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public OutputStream A00;
    public final C4482Cx9 A01 = new C4482Cx9(this);
    public final Map<Class<?>, InterfaceC3288C9m<?>> A02;
    public final InterfaceC3288C9m<Object> A03;
    public final Map<Class<?>, InterfaceC3289C9n<?>> A04;

    @Override // X.InterfaceC3892CgV
    public final /* bridge */ /* synthetic */ void A3E(C2580BeF c2580BeF, long j) throws IOException {
        A03(c2580BeF, j, true);
    }

    @Override // X.InterfaceC3892CgV
    public final void A3F(C2580BeF c2580BeF, Object obj) {
        A06(c2580BeF, obj, true);
    }

    static {
        Cx8 cx8A06 = Cx8.A06("key");
        CxD cxD = CxD.DEFAULT;
        A05 = Cx7.A00(cx8A06, cxD, 1);
        A06 = Cx7.A00(Cx8.A06(BrowserOperationCatalogKt.VALUE), cxD, 2);
        A07 = new InterfaceC3288C9m() { // from class: X.CxA
            @Override // X.C9k
            public final void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
                interfaceC3892CgV2.A3F(C4481Cx6.A05, entry.getKey());
                interfaceC3892CgV2.A3F(C4481Cx6.A06, entry.getValue());
            }
        };
    }

    public static int A00(C2580BeF c2580BeF) {
        Protobuf protobuf = (Protobuf) C2580BeF.A01(c2580BeF, Protobuf.class);
        if (protobuf != null) {
            return ((Cx7) protobuf).A00;
        }
        throw BV6.A0e();
    }

    private void A01(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.A00;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    private void A02(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.A00;
            int i = ((int) j) & 127;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | 128);
                j >>>= 7;
            }
        }
    }

    private final void A03(C2580BeF c2580BeF, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) C2580BeF.A01(c2580BeF, Protobuf.class);
        if (protobuf == null) {
            throw BV6.A0e();
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            A01(((Cx7) protobuf).A00 << 3);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    A01((((Cx7) protobuf).A00 << 3) | 1);
                    OutputStream outputStream = this.A00;
                    ByteBuffer byteBufferA0t = BV5.A0t(8);
                    byteBufferA0t.putLong(j);
                    BV6.A17(outputStream, byteBufferA0t);
                    return;
                }
                return;
            }
            A01(((Cx7) protobuf).A00 << 3);
            j = (j >> 63) ^ (j << 1);
        }
        A02(j);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(LX/C9m<TT;>;LX/BeF;TT;Z)LX/Cx6; */
    private void A04(C2580BeF c2580BeF, InterfaceC3288C9m interfaceC3288C9m, Object obj, boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        C4484CxB c4484CxB = new C4484CxB();
        try {
            OutputStream outputStream = this.A00;
            this.A00 = c4484CxB;
            try {
                interfaceC3288C9m.AA4(obj, this);
                this.A00 = outputStream;
                long j = c4484CxB.A00;
                c4484CxB.close();
                if (z && j == 0) {
                    return;
                }
                A01((A00(c2580BeF) << 3) | 2);
                A02(j);
                interfaceC3288C9m.AA4(obj, this);
            } catch (Throwable th) {
                this.A00 = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4484CxB.close();
                throw th2;
            } catch (Throwable th3) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                throw th2;
            }
        }
    }

    public static final void A05(C2580BeF c2580BeF, C4481Cx6 c4481Cx6, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) C2580BeF.A01(c2580BeF, Protobuf.class);
        if (protobuf == null) {
            throw BV6.A0e();
        }
        int iOrdinal = protobuf.intEncoding().ordinal();
        if (iOrdinal == 0) {
            c4481Cx6.A01(((Cx7) protobuf).A00 << 3);
            c4481Cx6.A01(i);
            return;
        }
        if (iOrdinal == 1) {
            c4481Cx6.A01(((Cx7) protobuf).A00 << 3);
            c4481Cx6.A01((i << 1) ^ (i >> 31));
        } else if (iOrdinal == 2) {
            c4481Cx6.A01((((Cx7) protobuf).A00 << 3) | 5);
            OutputStream outputStream = c4481Cx6.A00;
            ByteBuffer byteBufferA0t = BV5.A0t(4);
            byteBufferA0t.putInt(i);
            BV6.A17(outputStream, byteBufferA0t);
        }
    }

    public final void A06(C2580BeF c2580BeF, Object obj, boolean z) {
        int iOrdinal;
        byte[] bytes;
        OutputStream outputStream;
        ByteBuffer byteBufferA0t;
        if (obj != null) {
            if (!(obj instanceof CharSequence)) {
                if (obj instanceof Collection) {
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        A06(c2580BeF, it.next(), false);
                    }
                    return;
                }
                if (obj instanceof Map) {
                    Iterator itA0n = AnonymousClass002.A0n((Map) obj);
                    while (itA0n.hasNext()) {
                        A04(c2580BeF, A07, itA0n.next(), false);
                    }
                    return;
                }
                if (obj instanceof Double) {
                    double dA00 = BV6.A00(obj);
                    if (z && dA00 == 0.0d) {
                        return;
                    }
                    A01((A00(c2580BeF) << 3) | 1);
                    outputStream = this.A00;
                    byteBufferA0t = BV5.A0t(8);
                    byteBufferA0t.putDouble(dA00);
                } else if (obj instanceof Float) {
                    float fA02 = AnonymousClass001.A02(obj);
                    if (z && fA02 == 0.0f) {
                        return;
                    }
                    A01((A00(c2580BeF) << 3) | 5);
                    outputStream = this.A00;
                    byteBufferA0t = BV5.A0t(4);
                    byteBufferA0t.putFloat(fA02);
                } else {
                    if (obj instanceof Number) {
                        A03(c2580BeF, C3cG.A05(obj), z);
                        return;
                    }
                    if (obj instanceof Boolean) {
                        A05(c2580BeF, this, AnonymousClass001.A1X(obj) ? 1 : 0, z);
                        return;
                    }
                    if (!(obj instanceof byte[])) {
                        Map<Class<?>, InterfaceC3288C9m<?>> map = this.A02;
                        Class<?> cls = obj.getClass();
                        InterfaceC3288C9m<?> interfaceC3288C9m = map.get(cls);
                        if (interfaceC3288C9m == null) {
                            InterfaceC3289C9n<?> interfaceC3289C9n = this.A04.get(cls);
                            if (interfaceC3289C9n != null) {
                                C4482Cx9 c4482Cx9 = this.A01;
                                c4482Cx9.A01 = false;
                                c4482Cx9.A00 = c2580BeF;
                                c4482Cx9.A02 = z;
                                interfaceC3289C9n.AA4(obj, c4482Cx9);
                                return;
                            }
                            if (obj instanceof InterfaceC3933ChF) {
                                iOrdinal = ((EnumC3860Cfp) ((InterfaceC3933ChF) obj)).number_;
                            } else if (obj instanceof Enum) {
                                iOrdinal = ((Enum) obj).ordinal();
                            } else {
                                interfaceC3288C9m = this.A03;
                            }
                            A05(c2580BeF, this, iOrdinal, true);
                            return;
                        }
                        A04(c2580BeF, interfaceC3288C9m, obj, z);
                        return;
                    }
                    bytes = (byte[]) obj;
                    if (z && bytes.length == 0) {
                        return;
                    } else {
                        A01((A00(c2580BeF) << 3) | 2);
                    }
                }
                BV6.A17(outputStream, byteBufferA0t);
                return;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            A01((A00(c2580BeF) << 3) | 2);
            bytes = charSequence.toString().getBytes(A08);
            A01(bytes.length);
            this.A00.write(bytes);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/io/OutputStream;Ljava/util/Map<Ljava/lang/Class<*>;LX/C9m<*>;>;Ljava/util/Map<Ljava/lang/Class<*>;LX/C9n<*>;>;LX/C9m<Ljava/lang/Object;>;)V */
    public C4481Cx6(InterfaceC3288C9m interfaceC3288C9m, OutputStream outputStream, Map map, Map map2) {
        this.A00 = outputStream;
        this.A02 = map;
        this.A04 = map2;
        this.A03 = interfaceC3288C9m;
    }
}
