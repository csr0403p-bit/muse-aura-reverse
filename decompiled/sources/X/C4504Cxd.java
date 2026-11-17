package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.google.android.gms.internal.mlkit_vision_common.zzai;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cxd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4504Cxd implements InterfaceC3892CgV {
    public static final C2580BeF A05;
    public static final C2580BeF A06;
    public static final InterfaceC3288C9m A07;
    public static final Charset A08 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public OutputStream A00;
    public final C4506Cxf A01 = new C4506Cxf(this);
    public final Map A02;
    public final InterfaceC3288C9m A03;
    public final Map A04;

    @Override // X.InterfaceC3892CgV
    public final /* synthetic */ void A3E(C2580BeF c2580BeF, long j) throws IOException {
        A03(c2580BeF, j, true);
    }

    @Override // X.InterfaceC3892CgV
    public final void A3F(C2580BeF c2580BeF, Object obj) {
        A06(c2580BeF, obj, true);
    }

    static {
        Cx8 cx8A06 = Cx8.A06("key");
        EnumC4485CxE enumC4485CxE = EnumC4485CxE.DEFAULT;
        A05 = Cx8.A07(enumC4485CxE, cx8A06);
        A06 = Cx8.A09(enumC4485CxE, BrowserOperationCatalogKt.VALUE);
        A07 = C4507Cxg.A00;
    }

    public static int A00(C2580BeF c2580BeF) {
        zzai zzaiVar = (zzai) C2580BeF.A01(c2580BeF, zzai.class);
        if (zzaiVar != null) {
            return ((C4505Cxe) zzaiVar).A00;
        }
        throw BV6.A0e();
    }

    private final void A01(int i) throws IOException {
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

    private final void A02(long j) throws IOException {
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
        zzai zzaiVar = (zzai) C2580BeF.A01(c2580BeF, zzai.class);
        if (zzaiVar == null) {
            throw BV6.A0e();
        }
        int iOrdinal = zzaiVar.zzb().ordinal();
        if (iOrdinal == 0) {
            A01(((C4505Cxe) zzaiVar).A00 << 3);
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    A01((((C4505Cxe) zzaiVar).A00 << 3) | 1);
                    OutputStream outputStream = this.A00;
                    ByteBuffer byteBufferA0t = BV5.A0t(8);
                    byteBufferA0t.putLong(j);
                    BV6.A17(outputStream, byteBufferA0t);
                    return;
                }
                return;
            }
            A01(((C4505Cxe) zzaiVar).A00 << 3);
            j = (j >> 63) ^ (j + j);
        }
        A02(j);
    }

    private final void A04(C2580BeF c2580BeF, InterfaceC3288C9m interfaceC3288C9m, Object obj, boolean z) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C4508Cxh c4508Cxh = new C4508Cxh();
        try {
            OutputStream outputStream = this.A00;
            this.A00 = c4508Cxh;
            try {
                interfaceC3288C9m.AA4(obj, this);
                this.A00 = outputStream;
                long j = c4508Cxh.A00;
                c4508Cxh.close();
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
                c4508Cxh.close();
                throw th2;
            } finally {
            }
        }
    }

    public final void A05(C2580BeF c2580BeF, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        zzai zzaiVar = (zzai) C2580BeF.A01(c2580BeF, zzai.class);
        if (zzaiVar == null) {
            throw BV6.A0e();
        }
        int iOrdinal = zzaiVar.zzb().ordinal();
        if (iOrdinal == 0) {
            A01(((C4505Cxe) zzaiVar).A00 << 3);
            A01(i);
            return;
        }
        if (iOrdinal == 1) {
            A01(((C4505Cxe) zzaiVar).A00 << 3);
            A01((i + i) ^ (i >> 31));
        } else if (iOrdinal == 2) {
            A01((((C4505Cxe) zzaiVar).A00 << 3) | 5);
            OutputStream outputStream = this.A00;
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
                        A05(c2580BeF, AnonymousClass001.A1X(obj) ? 1 : 0, z);
                        return;
                    }
                    if (!(obj instanceof byte[])) {
                        Map map = this.A02;
                        Class<?> cls = obj.getClass();
                        InterfaceC3288C9m interfaceC3288C9m = (InterfaceC3288C9m) map.get(cls);
                        if (interfaceC3288C9m == null) {
                            C9k c9k = (C9k) this.A04.get(cls);
                            if (c9k != null) {
                                C4506Cxf c4506Cxf = this.A01;
                                c4506Cxf.A01 = false;
                                c4506Cxf.A00 = c2580BeF;
                                c4506Cxf.A02 = z;
                                c9k.AA4(obj, c4506Cxf);
                                return;
                            }
                            if (obj instanceof InterfaceC4509Cxj) {
                                iOrdinal = ((InterfaceC4509Cxj) obj).AjA();
                            } else if (obj instanceof Enum) {
                                iOrdinal = ((Enum) obj).ordinal();
                            } else {
                                interfaceC3288C9m = this.A03;
                            }
                            A05(c2580BeF, iOrdinal, true);
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

    public C4504Cxd(InterfaceC3288C9m interfaceC3288C9m, OutputStream outputStream, Map map, Map map2) {
        this.A00 = outputStream;
        this.A02 = map;
        this.A04 = map2;
        this.A03 = interfaceC3288C9m;
    }
}
