package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Eii, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7218Eii implements EjK {
    public static final Map<String, Object> A07;
    public static final Map<String, Object> A08;
    public final InterfaceC7237Ej1 A00;
    public final EhD A01;
    public final C7222Eim A02;
    public final Executor A03;
    public final InterfaceC7145EhB A04;
    public final EhE A05;
    public final Executor A06;

    public C7218Eii(InterfaceC7145EhB interfaceC7145EhB, InterfaceC7237Ej1 interfaceC7237Ej1, EhD ehD, C7222Eim c7222Eim, EhE ehE, Executor executor, Executor executor2) {
        AnonymousClass002.A1B(executor, 2, executor2);
        this.A04 = interfaceC7145EhB;
        this.A02 = c7222Eim;
        this.A06 = executor;
        this.A03 = executor2;
        this.A00 = interfaceC7237Ej1;
        this.A05 = ehE;
        this.A01 = ehD;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ej0<LX/EfF<LX/EfB;>;>;LX/EfF<LX/EfB;>;LX/Eio;LX/Eiq;)LX/Ej4; */
    public static final Ej4 A00(EfF efF, InterfaceC7236Ej0 interfaceC7236Ej0, C7226Eiq c7226Eiq, AbstractC7224Eio abstractC7224Eio) {
        Map<String, ? extends Object> map;
        Uri uri;
        Map<String, Object> extras = efF != null ? ((InterfaceC7071EfS) efF.A04()).getExtras() : null;
        C7219Eij c7219Eij = (C7219Eij) abstractC7224Eio;
        C7226Eiq c7226Eiq2 = c7219Eij.A05;
        if (c7226Eiq2 != null) {
            C7183Eht c7183Eht = c7226Eiq2.A05;
            uri = c7183Eht != null ? c7183Eht.A04 : null;
            Object obj = c7226Eiq2.A06.get("image_source_extras");
            map = obj instanceof Map ? (Map) obj : null;
        } else {
            map = null;
            uri = null;
        }
        Map<String, ? extends Object> map2 = A07;
        Map<String, ? extends Object> map3 = A08;
        Map<String, ? extends Object> map4 = interfaceC7236Ej0 != null ? ((AbstractC7206EiO) interfaceC7236Ej0).A04 : null;
        Rect rect = abstractC7224Eio.A00;
        Drawable drawableA01 = abstractC7224Eio.A01(1);
        InterfaceC8647Fhz interfaceC8647Fhz = !(drawableA01 instanceof C7242EjD) ? null : ((C7242EjD) drawableA01).A04;
        abstractC7224Eio.A01(1);
        Object obj2 = c7219Eij.A07;
        C7384Etj.A0Y(map3, 1);
        Ej4 ej4 = new Ej4();
        if (rect != null) {
            rect.width();
            rect.height();
        }
        ej4.A04 = interfaceC8647Fhz;
        ej4.A02 = obj2;
        ej4.A00 = uri;
        ej4.A08 = map4;
        ej4.A09 = extras;
        ej4.A0B = map3;
        ej4.A07 = map2;
        ej4.A0A = map;
        Map<String, Object> map5 = c7226Eiq.A06;
        ej4.A05 = map5.get("smart_fetch_strategy");
        ej4.A06 = map5.get("smart_mod_result");
        Object obj3 = map5.get("smart_original_url");
        ej4.A01 = obj3 instanceof Uri ? (Uri) obj3 : null;
        ej4.A03 = c7226Eiq.A04;
        return ej4;
    }

    @Override // X.EjK
    public final void AaG(InterfaceC7300EkR interfaceC7300EkR) {
        C7226Eiq c7226Eiq;
        C7384Etj.A0Y(interfaceC7300EkR, 0);
        if (!(interfaceC7300EkR instanceof C7219Eij)) {
            AbstractC3422CMk.A03("FrescoController2Impl", AnonymousClass007.A0a("Drawable not supported ", interfaceC7300EkR));
            return;
        }
        C7219Eij c7219Eij = (C7219Eij) interfaceC7300EkR;
        if (c7219Eij.A06 != null && (c7226Eiq = c7219Eij.A05) != null) {
            c7219Eij.A0D.A03(A00(null, null, c7226Eiq, c7219Eij), c7226Eiq, c7219Eij.A07());
        }
        c7219Eij.close();
    }

    static {
        HashMap mapA0v = BV4.A0v(1);
        mapA0v.put("component_tag", "vito2");
        A07 = Collections.unmodifiableMap(mapA0v);
        HashMap mapA0v2 = BV4.A0v(2);
        mapA0v2.put("origin", "memory_bitmap");
        mapA0v2.put("origin_sub", "shortcut");
        A08 = Collections.unmodifiableMap(mapA0v2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Eij;LX/Eiq;LX/EfF<LX/EfB;>;ZLX/Ej0<LX/EfF<LX/EfB;>;>;Z)V */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.EfF r11, X.InterfaceC7236Ej0 r12, X.C7226Eiq r13, X.C7218Eii r14, X.C7219Eij r15, boolean r16) {
        /*
            X.EjD r4 = r15.A0C
            X.Eim r0 = r14.A02
            r7 = r13
            X.Ei9 r3 = r13.A03
            r0.A01(r4, r3)
            r8 = 0
            if (r11 == 0) goto La1
            android.content.res.Resources r2 = r13.A00
            X.Egs r1 = r3.A0F
            if (r1 != 0) goto L15
            X.Egs r1 = r0.A00
        L15:
            java.lang.Object r0 = r11.A04()
            X.EfB r0 = (X.InterfaceC7064EfB) r0
            android.graphics.drawable.Drawable r0 = r1.createDrawable(r2, r0, r3)
            r5 = r0
            if (r0 != 0) goto L24
        L22:
            X.Ejd r0 = X.C7254Ejd.A00
        L24:
            r4.A01(r0)
            r15.A0B(r4, r11)
            if (r16 != 0) goto L9d
            int r0 = r3.A01
            if (r0 <= 0) goto L9d
            r15.A06(r0)
        L33:
            boolean r0 = r3.A0N
            if (r0 == 0) goto L43
            if (r12 == 0) goto L43
            boolean r0 = r12.AOQ()
            if (r0 != 0) goto L43
            r0 = 2
            r15.A03(r0)
        L43:
            boolean r0 = r3.A0I
            if (r0 == 0) goto L51
            boolean r0 = r5 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L51
            r0 = r5
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            r0.start()
        L51:
            X.Ej4 r6 = A00(r11, r12, r13, r15)
            if (r11 == 0) goto L63
            java.lang.Object r0 = r11.A04()
            X.EfB r0 = (X.InterfaceC7064EfB) r0
            if (r0 == 0) goto L63
            X.2eL r8 = r0.getImageInfo()
        L63:
            if (r12 == 0) goto L86
            boolean r0 = r12.AOQ()
            if (r0 != 0) goto L86
            boolean r0 = r12 instanceof X.C7229Eit
            if (r0 != 0) goto L86
            X.Eiz r2 = r15.A0D
            long r0 = r15.A07()
            r2.A05(r13, r8, r0)
        L78:
            boolean r0 = r12.AOQ()
            if (r0 != 0) goto L9a
            float r0 = r12.getProgress()
        L82:
            r15.A05(r0)
            return
        L86:
            X.Eiz r4 = r15.A0D
            long r10 = r15.A07()
            int r9 = r15.A00
            r4.A00(r5, r6, r7, r8, r9, r10)
            boolean r0 = r15.A0B
            if (r0 == 0) goto L97
            r15.A04 = r6
        L97:
            if (r12 == 0) goto L9a
            goto L78
        L9a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L82
        L9d:
            r15.A04()
            goto L33
        La1:
            r5 = r8
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7218Eii.A01(X.EfF, X.Ej0, X.Eiq, X.Eii, X.Eij, boolean):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Eij;LX/Eiq;LX/Ej0<LX/EfF<LX/EfB;>;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:3:0x000a, B:5:0x000f, B:7:0x0013, B:8:0x0018, B:10:0x001c, B:12:0x0027, B:14:0x002b, B:15:0x002f, B:17:0x0033), top: B:36:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC7236Ej0 r8, X.C7226Eiq r9, X.C7219Eij r10) {
        /*
            r7 = this;
            X.Eim r5 = r7.A02
            r7 = r9
            android.content.res.Resources r1 = r9.A00
            X.Ei9 r4 = r9.A03
            X.C7267Ejs.A00()
            android.graphics.drawable.Drawable r3 = r4.A08     // Catch: java.lang.Throwable -> L89
            r2 = 0
            if (r3 != 0) goto L25
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: java.lang.Throwable -> L89
            goto L25
        L18:
            java.lang.Integer r0 = r4.A0G     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L42
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L89
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L89
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L89
        L25:
            if (r3 == 0) goto L42
            boolean r0 = r4.A0M     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L2f
            android.graphics.drawable.Drawable r3 = r5.A00(r1, r3, r4)     // Catch: java.lang.Throwable -> L89
        L2f:
            X.Fhz r1 = r4.A0C     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L3d
            X.EeA<java.lang.Boolean> r0 = X.C7242EjD.A06     // Catch: java.lang.Throwable -> L89
            android.graphics.PointF r0 = r4.A06     // Catch: java.lang.Throwable -> L89
            X.EjD r5 = new X.EjD     // Catch: java.lang.Throwable -> L89
            r5.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L89
            goto L3e
        L3d:
            r5 = r3
        L3e:
            X.C7267Ejs.A00()
            goto L46
        L42:
            X.C7267Ejs.A00()
            r5 = r2
        L46:
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.A05(r0)
            r10.A0B(r5, r2)
            int r0 = r4.A01
            if (r0 > 0) goto L77
            r10.A04()
        L55:
            java.lang.Object r0 = r8.AJm()
            X.EfF r0 = (X.EfF) r0
            X.Ej4 r6 = A00(r0, r8, r9, r10)
            boolean r0 = r8.AOQ()
            if (r0 != 0) goto L7b
            boolean r0 = r8 instanceof X.C7229Eit
            if (r0 != 0) goto L7b
            X.Eiz r3 = r10.A0D
            long r1 = r10.A07()
            java.lang.Throwable r0 = r8.AFW()
            r3.A06(r9, r0, r1)
            return
        L77:
            r10.A06(r0)
            goto L55
        L7b:
            X.Eiz r4 = r10.A0D
            long r9 = r10.A07()
            java.lang.Throwable r8 = r8.AFW()
            r4.A01(r5, r6, r7, r8, r9)
            return
        L89:
            r0 = move-exception
            X.C7267Ejs.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7218Eii.A02(X.Ej0, X.Eiq, X.Eij):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021e A[Catch: all -> 0x0267, TryCatch #1 {all -> 0x0267, blocks: (B:104:0x0207, B:106:0x020b, B:108:0x020f, B:110:0x0215, B:112:0x021e, B:114:0x0222, B:121:0x023d, B:115:0x022b, B:117:0x022f, B:118:0x0233, B:120:0x0237), top: B:136:0x0207, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022b A[Catch: all -> 0x0267, PHI: r5
  0x022b: PHI (r5v3 android.graphics.drawable.Drawable) = (r5v2 android.graphics.drawable.Drawable), (r5v6 android.graphics.drawable.Drawable) binds: [B:111:0x021c, B:114:0x0222] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x0267, blocks: (B:104:0x0207, B:106:0x020b, B:108:0x020f, B:110:0x0215, B:112:0x021e, B:114:0x0222, B:121:0x023d, B:115:0x022b, B:117:0x022f, B:118:0x0233, B:120:0x0237), top: B:136:0x0207, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022f A[Catch: all -> 0x0267, TryCatch #1 {all -> 0x0267, blocks: (B:104:0x0207, B:106:0x020b, B:108:0x020f, B:110:0x0215, B:112:0x021e, B:114:0x0222, B:121:0x023d, B:115:0x022b, B:117:0x022f, B:118:0x0233, B:120:0x0237), top: B:136:0x0207, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0237 A[Catch: all -> 0x0267, TryCatch #1 {all -> 0x0267, blocks: (B:104:0x0207, B:106:0x020b, B:108:0x020f, B:110:0x0215, B:112:0x021e, B:114:0x0222, B:121:0x023d, B:115:0x022b, B:117:0x022f, B:118:0x0233, B:120:0x0237), top: B:136:0x0207, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b A[Catch: all -> 0x01bb, TryCatch #2 {all -> 0x01bb, blocks: (B:76:0x01aa, B:77:0x01b8, B:73:0x0195, B:75:0x019b), top: B:137:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c8  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.Eim] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.Eiz] */
    /* JADX WARN: Type inference failed for: r17v1, types: [X.EfF] */
    /* JADX WARN: Type inference failed for: r17v6, types: [X.EfF] */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.graphics.drawable.Drawable] */
    @Override // X.EjK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ABJ(android.graphics.Rect r20, X.InterfaceC7298EkP r21, X.InterfaceC7299EkQ r22, X.InterfaceC7300EkR r23, X.C7226Eiq r24, X.C7235Eiz r25, X.Ej6 r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7218Eii.ABJ(android.graphics.Rect, X.EkP, X.EkQ, X.EkR, X.Eiq, X.Eiz, X.Ej6, java.lang.Object):boolean");
    }
}
