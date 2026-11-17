package X;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.maplibre.android.R;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public final class GGO<T> implements InterfaceC9366GGc<T> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AbstractC9300GDc A04;
    public final GH3 A05;
    public final GH2 A06;
    public final boolean A07;
    public final int[] A08;
    public final int[] A09;
    public final Object[] A0A;
    public final GHF<?> A0B;
    public final GHC A0C;
    public final GGX<?, ?> A0D;
    public final boolean A0E;
    public static final int[] A0G = new int[0];
    public static final Unsafe A0F = C9400GHp.A04();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.GGc] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.GGc] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.GGc] */
    @Override // X.InterfaceC9366GGc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AOY(T r13) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGO.AOY(java.lang.Object):boolean");
    }

    public static int A00(Object obj) {
        GGX<?, ?> ggx = GGM.A02;
        return ((List) obj).size();
    }

    public static GGT A02(Object obj) throws InvalidProtocolBufferException.InvalidWireTypeException {
        GGQ ggq = (GGQ) obj;
        GGQ.A08(ggq, 0);
        return ggq.A03;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.GGO A03(X.GHF r41, X.AbstractC9300GDc r42, X.GH3 r43, X.GHD r44, X.GHC r45, X.GGX r46) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGO.A03(X.GHF, X.GDc, X.GH3, X.GHD, X.GHC, X.GGX):X.GGO");
    }

    private InterfaceC9366GGc A04(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.A0A;
        InterfaceC9366GGc interfaceC9366GGc = (InterfaceC9366GGc) objArr[i2];
        if (interfaceC9366GGc != null) {
            return interfaceC9366GGc;
        }
        InterfaceC9366GGc<T> interfaceC9366GGcA00 = GGS.A02.A00((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC9366GGcA00;
        return interfaceC9366GGcA00;
    }

    public static List A09(GGO ggo, Object obj, int i) {
        return ggo.A04.A01(obj, i & 1048575);
    }

    public static List A0A(Object obj, long j) {
        List list = (List) C9400GHp.A01.A07(obj, j);
        GGX<?, ?> ggx = GGM.A02;
        return list;
    }

    private void A0B(InterfaceC9369GGf interfaceC9369GGf, Object obj, int i) throws InvalidProtocolBufferException {
        long jA0L;
        Object objA0T;
        if ((536870912 & i) != 0) {
            jA0L = AbstractC7607F5u.A0L(i);
            GGQ ggq = (GGQ) interfaceC9369GGf;
            GGQ.A08(ggq, 2);
            objA0T = ggq.A03.A0U();
        } else {
            boolean z = this.A0E;
            jA0L = AbstractC7607F5u.A0L(i);
            GGQ ggq2 = (GGQ) interfaceC9369GGf;
            GGQ.A08(ggq2, 2);
            GGT ggt = ggq2.A03;
            objA0T = z ? ggt.A0T() : ggt.A0S();
        }
        C9400GHp.A06(obj, jA0L, objA0T);
    }

    public static void A0C(InterfaceC9378GGq interfaceC9378GGq, Object obj, int i) throws CodedOutputStream$OutOfSpaceException {
        if (obj instanceof String) {
            GGI ggi = ((GGL) interfaceC9378GGq).A00;
            GHG.A09(ggi, i);
            ggi.A0C((String) obj);
        } else {
            GGI ggi2 = ((GGL) interfaceC9378GGq).A00;
            GHG.A09(ggi2, i);
            ggi2.A0B((AbstractC9309GDl) obj);
        }
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(LX/GGq;ILjava/lang/Object;I)V */
    private void A0D(InterfaceC9378GGq interfaceC9378GGq, Object obj, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        if (obj != null) {
            C9374GGk<K, V> c9374GGk = ((C9368GGe) this.A0A[(i2 / 3) * 2]).A00;
            GGI ggi = ((GGL) interfaceC9378GGq).A00;
            Iterator itA0i = C3cG.A0i((AbstractMap) obj);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                GHG.A09(ggi, i);
                Object key = entryA0l.getKey();
                Object value = entryA0l.getValue();
                EnumC10214Gra enumC10214Gra = c9374GGk.A00;
                int iA00 = GGJ.A00(enumC10214Gra, key);
                EnumC10214Gra enumC10214Gra2 = c9374GGk.A01;
                ggi.A06(iA00 + GGJ.A00(enumC10214Gra2, value));
                Object key2 = entryA0l.getKey();
                Object value2 = entryA0l.getValue();
                GGJ.A01(ggi, enumC10214Gra, key2, 1);
                GGJ.A01(ggi, enumC10214Gra2, value2, 2);
            }
        }
    }

    private void A0E(T t, int i) {
        if (this.A07) {
            return;
        }
        int i2 = this.A08[i + 2];
        int i3 = 1 << (i2 >>> 20);
        long jA0L = AbstractC7607F5u.A0L(i2);
        C9400GHp.A05(t, jA0L, C9400GHp.A01.A05(t, jA0L) | i3);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
    private boolean A0F(int i, Object obj) {
        AbstractC9309GDl abstractC9309GDl;
        Object objA00;
        boolean zEquals;
        boolean z = this.A07;
        int[] iArr = this.A08;
        if (z) {
            int i2 = iArr[i + 1];
            long jA0L = AbstractC7607F5u.A0L(i2);
            switch (AbstractC7608F5v.A03(i2)) {
                case 0:
                    if (C9400GHp.A01.A02(obj, jA0L) != 0.0d) {
                        return true;
                    }
                    break;
                case 1:
                    if (C9400GHp.A01.A03(obj, jA0L) != 0.0f) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C9400GHp.A01.A06(obj, jA0L) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C9400GHp.A01.A05(obj, jA0L) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C9400GHp.A01.A0H(obj, jA0L);
                case 8:
                    objA00 = AbstractC9365GGb.A00(obj, jA0L);
                    if (objA00 instanceof String) {
                        zEquals = ((String) objA00).isEmpty();
                        return !zEquals;
                    }
                    if (!(objA00 instanceof AbstractC9309GDl)) {
                        throw BV4.A0P();
                    }
                    abstractC9309GDl = AbstractC9309GDl.A01;
                    zEquals = abstractC9309GDl.equals(objA00);
                    return !zEquals;
                case 9:
                case 17:
                    if (AbstractC9365GGb.A00(obj, jA0L) != null) {
                        return true;
                    }
                    break;
                case 10:
                    abstractC9309GDl = AbstractC9309GDl.A01;
                    objA00 = AbstractC9365GGb.A00(obj, jA0L);
                    zEquals = abstractC9309GDl.equals(objA00);
                    return !zEquals;
                default:
                    throw BV4.A0P();
            }
        } else {
            int i3 = iArr[i + 2];
            if ((A01(obj, i3) & (1 << (i3 >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean A0G(T t, int i, int i2) {
        return AnonymousClass002.A1Q(C9400GHp.A01.A05(t, AbstractC7609F5w.A0Q(this.A08, i2)), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0016 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0016 A[SYNTHETIC] */
    @Override // X.InterfaceC9366GGc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AAo(T r11, T r12) {
        /*
            r10 = this;
            int[] r7 = r10.A08
            int r6 = r7.length
            r9 = 0
            r5 = 0
        L5:
            if (r5 >= r6) goto Lca
            int r0 = r5 + 1
            r2 = r7[r0]
            long r0 = X.AbstractC7607F5u.A0L(r2)
            int r2 = X.AbstractC7608F5v.A03(r2)
            switch(r2) {
                case 0: goto La8;
                case 1: goto L88;
                case 2: goto L73;
                case 3: goto L73;
                case 4: goto L5e;
                case 5: goto L73;
                case 6: goto L5e;
                case 7: goto L49;
                case 8: goto L28;
                case 9: goto L28;
                case 10: goto L28;
                case 11: goto L5e;
                case 12: goto L5e;
                case 13: goto L5e;
                case 14: goto L73;
                case 15: goto L5e;
                case 16: goto L73;
                case 17: goto L28;
                case 18: goto L32;
                case 19: goto L32;
                case 20: goto L32;
                case 21: goto L32;
                case 22: goto L32;
                case 23: goto L32;
                case 24: goto L32;
                case 25: goto L32;
                case 26: goto L32;
                case 27: goto L32;
                case 28: goto L32;
                case 29: goto L32;
                case 30: goto L32;
                case 31: goto L32;
                case 32: goto L32;
                case 33: goto L32;
                case 34: goto L32;
                case 35: goto L32;
                case 36: goto L32;
                case 37: goto L32;
                case 38: goto L32;
                case 39: goto L32;
                case 40: goto L32;
                case 41: goto L32;
                case 42: goto L32;
                case 43: goto L32;
                case 44: goto L32;
                case 45: goto L32;
                case 46: goto L32;
                case 47: goto L32;
                case 48: goto L32;
                case 49: goto L32;
                case 50: goto L32;
                case 51: goto L19;
                case 52: goto L19;
                case 53: goto L19;
                case 54: goto L19;
                case 55: goto L19;
                case 56: goto L19;
                case 57: goto L19;
                case 58: goto L19;
                case 59: goto L19;
                case 60: goto L19;
                case 61: goto L19;
                case 62: goto L19;
                case 63: goto L19;
                case 64: goto L19;
                case 65: goto L19;
                case 66: goto L19;
                case 67: goto L19;
                case 68: goto L19;
                default: goto L16;
            }
        L16:
            int r5 = r5 + 3
            goto L5
        L19:
            long r2 = X.AbstractC7609F5w.A0Q(r7, r5)
            X.GGb r4 = X.C9400GHp.A01
            int r8 = r4.A05(r11, r2)
            int r2 = r4.A05(r12, r2)
            goto L30
        L28:
            boolean r8 = r10.A0F(r5, r11)
            boolean r2 = r10.A0F(r5, r12)
        L30:
            if (r8 != r2) goto Ld9
        L32:
            X.GGb r3 = X.C9400GHp.A01
            java.lang.Object r2 = r3.A07(r11, r0)
            java.lang.Object r1 = r3.A07(r12, r0)
            X.GGX<?, ?> r0 = X.GGM.A02
            if (r2 == r1) goto L16
            if (r2 == 0) goto Ld9
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Ld9
            goto L16
        L49:
            boolean r3 = r10.A0F(r5, r11)
            boolean r2 = r10.A0F(r5, r12)
            if (r3 != r2) goto Ld9
            X.GGb r2 = X.C9400GHp.A01
            boolean r3 = r2.A0H(r11, r0)
            boolean r0 = r2.A0H(r12, r0)
            goto La4
        L5e:
            boolean r3 = r10.A0F(r5, r11)
            boolean r2 = r10.A0F(r5, r12)
            if (r3 != r2) goto Ld9
            X.GGb r2 = X.C9400GHp.A01
            int r3 = r2.A05(r11, r0)
            int r0 = r2.A05(r12, r0)
            goto La4
        L73:
            boolean r3 = r10.A0F(r5, r11)
            boolean r2 = r10.A0F(r5, r12)
            if (r3 != r2) goto Ld9
            X.GGb r2 = X.C9400GHp.A01
            long r3 = r2.A06(r11, r0)
            long r1 = r2.A06(r12, r0)
            goto Lc4
        L88:
            boolean r3 = r10.A0F(r5, r11)
            boolean r2 = r10.A0F(r5, r12)
            if (r3 != r2) goto Ld9
            X.GGb r4 = X.C9400GHp.A01
            float r2 = r4.A03(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A03(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        La4:
            if (r3 != r0) goto Ld9
            goto L16
        La8:
            boolean r3 = r10.A0F(r5, r11)
            boolean r2 = r10.A0F(r5, r12)
            if (r3 != r2) goto Ld9
            X.GGb r8 = X.C9400GHp.A01
            double r2 = r8.A02(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A02(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        Lc4:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Ld9
            goto L16
        Lca:
            X.GEw r11 = (X.AbstractC9339GEw) r11
            X.GGN r1 = r11.unknownFields
            X.GEw r12 = (X.AbstractC9339GEw) r12
            X.GGN r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld9
            r9 = 1
        Ld9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGO.AAo(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0400 A[PHI: r0 r10
  0x0400: PHI (r0v214 int) = (r0v140 int), (r0v145 int), (r0v183 int), (r0v205 int), (r0v207 int), (r0v217 int) binds: [B:151:0x03fe, B:122:0x0341, B:84:0x021f, B:71:0x01c1, B:67:0x01b7, B:61:0x0187] A[DONT_GENERATE, DONT_INLINE]
  0x0400: PHI (r10v34 int) = (r10v6 int), (r10v8 int), (r10v18 int), (r10v29 int), (r10v31 int), (r10v35 int) binds: [B:151:0x03fe, B:122:0x0341, B:84:0x021f, B:71:0x01c1, B:67:0x01b7, B:61:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0405 A[PHI: r10
  0x0405: PHI (r10v30 int) = (r10v6 int), (r10v8 int), (r10v18 int), (r10v31 int) binds: [B:151:0x03fe, B:122:0x0341, B:84:0x021f, B:67:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0850 A[PHI: r0 r11
  0x0850: PHI (r0v116 int) = (r0v9 int), (r0v15 int), (r0v107 int), (r0v109 int), (r0v119 int) binds: [B:320:0x084e, B:290:0x07a8, B:193:0x04d9, B:205:0x0525, B:185:0x04ae] A[DONT_GENERATE, DONT_INLINE]
  0x0850: PHI (r11v53 int) = (r11v2 int), (r11v5 int), (r11v46 int), (r11v48 int), (r11v54 int) binds: [B:320:0x084e, B:290:0x07a8, B:193:0x04d9, B:205:0x0525, B:185:0x04ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0855 A[PHI: r11
  0x0855: PHI (r11v47 int) = (r11v2 int), (r11v5 int), (r11v48 int) binds: [B:320:0x084e, B:290:0x07a8, B:205:0x0525] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    @Override // X.InterfaceC9366GGc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AKR(T r15) {
        /*
            Method dump skipped, instructions count: 2492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGO.AKR(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    public final int ANL(T t) {
        int i;
        int iHashCode;
        long jA05;
        float fA02;
        double dA00;
        int iA1X;
        int[] iArr = this.A08;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long jA0L = AbstractC7607F5u.A0L(i4);
            switch (AbstractC7608F5v.A03(i4)) {
                case 0:
                    i = i2 * 53;
                    dA00 = C9400GHp.A01.A02(t, jA0L);
                    jA05 = Double.doubleToLongBits(dA00);
                    Charset charset = GGV.A03;
                    iHashCode = AnonymousClass002.A0A(jA05);
                    i2 = i + iHashCode;
                    break;
                case 1:
                    i = i2 * 53;
                    fA02 = C9400GHp.A01.A03(t, jA0L);
                    iHashCode = Float.floatToIntBits(fA02);
                    i2 = i + iHashCode;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    jA05 = C9400GHp.A01.A06(t, jA0L);
                    Charset charset2 = GGV.A03;
                    iHashCode = AnonymousClass002.A0A(jA05);
                    i2 = i + iHashCode;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i = i2 * 53;
                    iHashCode = C9400GHp.A01.A05(t, jA0L);
                    i2 = i + iHashCode;
                    break;
                case 7:
                    i = i2 * 53;
                    iA1X = C9400GHp.A01.A0H(t, jA0L);
                    Charset charset3 = GGV.A03;
                    iHashCode = BV7.A02(iA1X);
                    i2 = i + iHashCode;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashCode = ((String) AbstractC9365GGb.A00(t, jA0L)).hashCode();
                    i2 = i + iHashCode;
                    break;
                case 9:
                case 17:
                    iHashCode = C8j4.A0E(AbstractC9365GGb.A00(t, jA0L), 37);
                    i = i2 * 53;
                    i2 = i + iHashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                case 40:
                case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                case 42:
                case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                case 44:
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                case 48:
                case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                case 50:
                    i = i2 * 53;
                    iHashCode = AbstractC9365GGb.A00(t, jA0L).hashCode();
                    i2 = i + iHashCode;
                    break;
                case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                    if (A0G(t, i5, i3)) {
                        i = i2 * 53;
                        dA00 = BV6.A00(AbstractC9365GGb.A00(t, jA0L));
                        jA05 = Double.doubleToLongBits(dA00);
                        Charset charset22 = GGV.A03;
                        iHashCode = AnonymousClass002.A0A(jA05);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A0G(t, i5, i3)) {
                        i = i2 * 53;
                        fA02 = AnonymousClass001.A02(AbstractC9365GGb.A00(t, jA0L));
                        iHashCode = Float.floatToIntBits(fA02);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 53:
                case 54:
                case 56:
                case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                    if (A0G(t, i5, i3)) {
                        i = i2 * 53;
                        jA05 = C3cG.A05(AbstractC9365GGb.A00(t, jA0L));
                        Charset charset222 = GGV.A03;
                        iHashCode = AnonymousClass002.A0A(jA05);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 55:
                case 57:
                case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                case 63:
                case 64:
                case 66:
                    if (A0G(t, i5, i3)) {
                        i = i2 * 53;
                        iHashCode = AnonymousClass001.A0F(AbstractC9365GGb.A00(t, jA0L));
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A0G(t, i5, i3)) {
                        i = i2 * 53;
                        iA1X = AnonymousClass001.A1X(AbstractC9365GGb.A00(t, jA0L));
                        Charset charset32 = GGV.A03;
                        iHashCode = BV7.A02(iA1X);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A0G(t, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    iHashCode = ((String) AbstractC9365GGb.A00(t, jA0L)).hashCode();
                    i2 = i + iHashCode;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A0G(t, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    iHashCode = AbstractC9365GGb.A00(t, jA0L).hashCode();
                    i2 = i + iHashCode;
                    break;
            }
        }
        return AnonymousClass005.A0G(((AbstractC9339GEw) t).unknownFields, i2 * 53);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    public final void AQ3(T t) {
        int i;
        int[] iArr;
        Object objUnmodifiableList;
        int i2 = this.A00;
        while (true) {
            i = this.A03;
            iArr = this.A09;
            if (i2 >= i) {
                break;
            }
            long jA0P = AbstractC7609F5w.A0P(this.A08, iArr[i2]);
            Object objA00 = AbstractC9365GGb.A00(t, jA0P);
            if (objA00 != null) {
                ((C10564Htm) objA00).isMutable = false;
                C9400GHp.A06(t, jA0P, objA00);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            AbstractC9300GDc abstractC9300GDc = this.A04;
            long j = iArr[i];
            boolean z = abstractC9300GDc instanceof C9299GDb;
            Object objA002 = AbstractC9365GGb.A00(t, j);
            if (z) {
                ((GDD) ((GDO) objA002)).A00 = false;
            } else {
                List list = (List) objA002;
                if (list instanceof Hl2) {
                    objUnmodifiableList = ((Hl2) list).AMH();
                } else if (!BV6.A1Y(C9298GDa.A00, list)) {
                    objUnmodifiableList = Collections.unmodifiableList(list);
                }
                C9400GHp.A06(t, j, objUnmodifiableList);
            }
            i++;
        }
        ((AbstractC9339GEw) t).unknownFields.A02 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0115, code lost:
    
        r12.put(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0118, code lost:
    
        r10.A0W(r6);
     */
    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGf;LX/HyE;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9366GGc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQc(X.HyE r18, X.InterfaceC9369GGf r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGO.AQc(X.HyE, X.GGf, java.lang.Object):void");
    }

    @Override // X.InterfaceC9366GGc
    public final T ARC() {
        return (T) ((AbstractC9339GEw) this.A06).A04(C79.A0K);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGq;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x001d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023d  */
    @Override // X.InterfaceC9366GGc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aj3(X.InterfaceC9378GGq r15, java.lang.Object r16) throws androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException {
        /*
            Method dump skipped, instructions count: 2552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGO.Aj3(X.GGq, java.lang.Object):void");
    }

    public GGO(GHF ghf, AbstractC9300GDc abstractC9300GDc, GH3 gh3, GH2 gh2, GHC ghc, GGX ggx, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A08 = iArr;
        this.A0A = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0E = gh2 instanceof AbstractC9339GEw;
        this.A07 = z;
        this.A09 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0C = ghc;
        this.A04 = abstractC9300GDc;
        this.A0D = ggx;
        this.A0B = ghf;
        this.A06 = gh2;
        this.A05 = gh3;
    }

    public static int A01(Object obj, int i) {
        return C9400GHp.A01.A05(obj, i & 1048575);
    }

    public static Object A05(int i, Object obj) {
        return C9400GHp.A01.A07(obj, i & 1048575);
    }

    public static Object A06(HyE hyE, GGO ggo, Object obj, int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        InterfaceC9366GGc interfaceC9366GGcA04 = ggo.A04(i);
        GGQ ggq = (GGQ) obj;
        GGQ.A08(ggq, 2);
        return GGQ.A05(ggq, hyE, interfaceC9366GGcA04);
    }

    public static Field A07(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw BV4.A0c(FGI.A0C(cls, str, declaredFields));
        }
    }

    public static List A08(int i, Object obj) {
        return (List) C9400GHp.A01.A07(obj, i & 1048575);
    }

    @Override // X.InterfaceC9366GGc
    public final void AQb(T t, T t2) {
        Object objA07;
        int i;
        t2.getClass();
        int i2 = 0;
        while (true) {
            int[] iArr = this.A08;
            if (i2 >= iArr.length) {
                if (this.A07) {
                    return;
                }
                GGM.A0P(t, t2);
                return;
            }
            int i3 = iArr[i2 + 1];
            long jA0L = AbstractC7607F5u.A0L(i3);
            int i4 = iArr[i2];
            switch (AbstractC7608F5v.A03(i3)) {
                case 0:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb = C9400GHp.A01;
                        abstractC9365GGb.A0A(t, jA0L, abstractC9365GGb.A02(t2, jA0L));
                        A0E(t, i2);
                        break;
                    }
                case 1:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb2 = C9400GHp.A01;
                        abstractC9365GGb2.A0B(t, jA0L, abstractC9365GGb2.A03(t2, jA0L));
                        A0E(t, i2);
                        break;
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb3 = C9400GHp.A01;
                        abstractC9365GGb3.A0D(t, jA0L, abstractC9365GGb3.A06(t2, jA0L));
                        A0E(t, i2);
                        break;
                    }
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        C9400GHp.A05(t, jA0L, C9400GHp.A01.A05(t2, jA0L));
                        A0E(t, i2);
                        break;
                    }
                case 7:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb4 = C9400GHp.A01;
                        abstractC9365GGb4.A0F(t, jA0L, abstractC9365GGb4.A0H(t2, jA0L));
                        A0E(t, i2);
                        break;
                    }
                case 8:
                case 10:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        objA07 = AbstractC9365GGb.A00(t2, jA0L);
                        C9400GHp.A06(t, jA0L, objA07);
                        A0E(t, i2);
                        break;
                    }
                case 9:
                case 17:
                    if (!A0F(i2, t2)) {
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb5 = C9400GHp.A01;
                        Object objA072 = abstractC9365GGb5.A07(t, jA0L);
                        objA07 = abstractC9365GGb5.A07(t2, jA0L);
                        if (objA072 == null) {
                            if (objA07 == null) {
                                break;
                            }
                            C9400GHp.A06(t, jA0L, objA07);
                        } else if (objA07 == null) {
                            break;
                        } else {
                            objA07 = GGV.A00(objA072, objA07);
                            C9400GHp.A06(t, jA0L, objA07);
                        }
                        A0E(t, i2);
                        break;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                case 40:
                case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                case 42:
                case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                case 44:
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                case 48:
                case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                    if (!(this.A04 instanceof C9299GDb)) {
                        List list = (List) AbstractC9365GGb.A00(t2, jA0L);
                        List listA00 = C9298GDa.A00(t, list.size(), jA0L);
                        int size = listA00.size();
                        int size2 = list.size();
                        if (size > 0) {
                            if (size2 > 0) {
                                listA00.addAll(list);
                            }
                            list = listA00;
                        }
                        C9400GHp.A06(t, jA0L, list);
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb6 = C9400GHp.A01;
                        GDO gdoAQy = (GDO) abstractC9365GGb6.A07(t, jA0L);
                        List list2 = (List) abstractC9365GGb6.A07(t2, jA0L);
                        int size3 = gdoAQy.size();
                        int size4 = list2.size();
                        if (size3 > 0) {
                            if (size4 > 0) {
                                if (!((GDD) gdoAQy).A00) {
                                    gdoAQy = gdoAQy.AQy(size4 + size3);
                                }
                                gdoAQy.addAll(list2);
                            }
                            list2 = gdoAQy;
                        }
                        C9400GHp.A06(t, jA0L, list2);
                        break;
                    }
                case 50:
                    GGX<?, ?> ggx = GGM.A02;
                    AbstractC9365GGb abstractC9365GGb7 = C9400GHp.A01;
                    C10564Htm c10564HtmA01 = (C10564Htm) abstractC9365GGb7.A07(t, jA0L);
                    AbstractMap abstractMap = (AbstractMap) abstractC9365GGb7.A07(t2, jA0L);
                    if (!abstractMap.isEmpty()) {
                        if (!c10564HtmA01.isMutable) {
                            c10564HtmA01 = c10564HtmA01.A01();
                        }
                        C10564Htm.A00(c10564HtmA01);
                        AbstractC7609F5w.A1R(abstractMap, c10564HtmA01);
                    }
                    C9400GHp.A06(t, jA0L, c10564HtmA01);
                    break;
                case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 61:
                case HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX /* 62 */:
                case 63:
                case 64:
                case LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE /* 65 */:
                case 66:
                case MessageDraftSenderKt.UNICODE_MULTIPART_CHARS /* 67 */:
                    if (!A0G(t2, i4, i2)) {
                        break;
                    } else {
                        C9400GHp.A06(t, jA0L, AbstractC9365GGb.A00(t2, jA0L));
                        i = iArr[i2 + 2] & 1048575;
                        C9400GHp.A05(t, i, i4);
                        break;
                    }
                case 60:
                case 68:
                    if (!A0G(t2, i4, i2)) {
                        break;
                    } else {
                        AbstractC9365GGb abstractC9365GGb8 = C9400GHp.A01;
                        Object objA073 = abstractC9365GGb8.A07(t, jA0L);
                        Object objA074 = abstractC9365GGb8.A07(t2, jA0L);
                        if (objA073 == null) {
                            if (objA074 == null) {
                                break;
                            }
                            C9400GHp.A06(t, jA0L, objA074);
                            i = iArr[i2 + 2] & 1048575;
                        } else if (objA074 == null) {
                            break;
                        } else {
                            objA074 = GGV.A00(objA073, objA074);
                            C9400GHp.A06(t, jA0L, objA074);
                            i = iArr[i2 + 2] & 1048575;
                        }
                        C9400GHp.A05(t, i, i4);
                        break;
                    }
            }
            i2 += 3;
        }
    }
}
