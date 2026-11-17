package X;

import java.util.Map;
import kotlin.Unit;

/* renamed from: X.9td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC08189td {
    public static final Map<C9uG<?>, C9hr<?>> A00;

    public static final void A00(String str) {
        for (C9hr<?> c9hr : A00.values()) {
            if (str.equals(c9hr.getDescriptor().AKP())) {
                throw C60O.A0i(C6tn.A05(FGI.A0h("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ", C60O.A0n(c9hr), ".\n                Please refer to SerialDescriptor documentation for additional information.\n            ")));
            }
        }
    }

    static {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(C3cG.A0x(String.class), C07779iq.A01);
        c0924AIaA0u.put(C3cG.A0x(Character.TYPE), C08289to.A00);
        c0924AIaA0u.put(C3cG.A0x(char[].class), C08259tl.A00);
        c0924AIaA0u.put(C3cG.A0x(Double.TYPE), C07799it.A00);
        c0924AIaA0u.put(C3cG.A0x(double[].class), C08219th.A00);
        c0924AIaA0u.put(C3cG.A0x(Float.TYPE), C07819iv.A00);
        c0924AIaA0u.put(C3cG.A0x(float[].class), C08229ti.A00);
        c0924AIaA0u.put(C3cG.A0x(Long.TYPE), C9j1.A00);
        c0924AIaA0u.put(C3cG.A0x(long[].class), C08279tn.A00);
        c0924AIaA0u.put(C3cG.A0x(C9314GDq.class), C07849iy.A01);
        c0924AIaA0u.put(C3cG.A0x(Integer.TYPE), C07729ii.A00);
        c0924AIaA0u.put(C3cG.A0x(int[].class), C08249tk.A00);
        c0924AIaA0u.put(C3cG.A0x(FKC.class), C9oC.A01);
        c0924AIaA0u.put(C3cG.A0x(Short.TYPE), C9oK.A00);
        c0924AIaA0u.put(C3cG.A0x(short[].class), C08209tg.A00);
        c0924AIaA0u.put(C3cG.A0x(C9oE.class), C9oD.A01);
        c0924AIaA0u.put(C3cG.A0x(Byte.TYPE), C9o7.A00);
        c0924AIaA0u.put(C3cG.A0x(byte[].class), C9tf.A00);
        c0924AIaA0u.put(C3cG.A0x(C9oA.class), C9o9.A01);
        c0924AIaA0u.put(C3cG.A0x(Boolean.TYPE), C07839ix.A00);
        c0924AIaA0u.put(C3cG.A0x(boolean[].class), C08269tm.A00);
        c0924AIaA0u.put(C3cG.A0x(Unit.class), C9e0.A01);
        c0924AIaA0u.put(C3cG.A0x(Void.class), C9e3.A00);
        try {
            c0924AIaA0u.put(C3cG.A0x(C0851A5x.class), A5w.A00);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            c0924AIaA0u.put(C3cG.A0x(C9tP.class), C08199te.A00);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            c0924AIaA0u.put(C3cG.A0x(C9oX.class), C9tc.A00);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            c0924AIaA0u.put(C3cG.A0x(C9oV.class), C9tb.A00);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            c0924AIaA0u.put(C3cG.A0x(C9oW.class), C9ta.A00);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            c0924AIaA0u.put(C3cG.A0x(C9zn.class), C08299tp.A00);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        A00 = AIW.A0K(c0924AIaA0u);
    }
}
