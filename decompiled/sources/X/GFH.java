package X;

import androidx.health.platform.client.proto.CodedOutputStream$OutOfSpaceException;
import androidx.health.platform.client.proto.InvalidProtocolBufferException;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import org.maplibre.android.R;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public final class GFH<T> implements GF4<T> {
    public final int A00;
    public final int A01;
    public final InterfaceC10617HzX A02;
    public final int[] A03;
    public final Object[] A04;
    public final int A05;
    public final int A06;
    public final GFB<?> A07;
    public final InterfaceC9346GFf A08;
    public final GF8 A09;
    public final InterfaceC9348GFh A0A;
    public final GFA<?, ?> A0B;
    public final int[] A0C;
    public static final int[] A0E = new int[0];
    public static final Unsafe A0D = C9401GHq.A03();

    public static int A01(GF6 msg, GF4 schema, Object data, byte[] position, int limit, int endGroup, int registers) throws InvalidProtocolBufferException {
        GFH gfh = (GFH) schema;
        int i = msg.A01 + 1;
        msg.A01 = i;
        if (i >= 100) {
            throw AbstractC7609F5w.A0W("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA0P = gfh.A0P(msg, data, position, limit, endGroup, registers);
        msg.A01--;
        msg.A03 = data;
        return iA0P;
    }

    public static int A02(GF6 schema, GF4 data, byte[] position, int limit, int endGroup, int registers) {
        GF2 gf2ARA = data.ARA();
        int iA01 = A01(schema, data, gf2ARA, position, limit, endGroup, registers);
        data.AQ3(gf2ARA);
        schema.A03 = gf2ARA;
        return iA01;
    }

    public static int A03(GF6 tag, GFI data, byte[] position, int limit, int unknownFields, int registers) throws InvalidProtocolBufferException {
        Object c9319GEa;
        int iA07 = unknownFields;
        if ((limit >>> 3) != 0) {
            int i = limit & 7;
            if (i == 0) {
                int iA08 = A08(tag, position, unknownFields);
                data.A02(limit, Long.valueOf(tag.A02));
                return iA08;
            }
            if (i == 1) {
                data.A02(limit, Long.valueOf(AbstractC7611F5y.A0I(position, unknownFields)));
                return unknownFields + 8;
            }
            if (i == 2) {
                int iA072 = A07(tag, position, unknownFields);
                int i2 = tag.A00;
                if (i2 < 0) {
                    throw AbstractC7609F5w.A0W("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                int length = position.length;
                if (i2 > length - iA072) {
                    throw AbstractC7609F5w.A0W("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (i2 == 0) {
                    c9319GEa = GEY.A01;
                } else {
                    GEY.A00(iA072, iA072 + i2, length);
                    c9319GEa = new C9319GEa(GEY.A00.A7O(position, iA072, i2));
                }
                data.A02(limit, c9319GEa);
                return iA072 + i2;
            }
            if (i == 3) {
                GFI gfi = new GFI();
                int i3 = (limit & (-8)) | 4;
                int i4 = tag.A01 + 1;
                tag.A01 = i4;
                if (i4 >= 100) {
                    throw AbstractC7609F5w.A0W("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                int i5 = 0;
                while (iA07 < registers) {
                    iA07 = A07(tag, position, iA07);
                    i5 = tag.A00;
                    if (i5 == i3) {
                        break;
                    }
                    iA07 = A03(tag, gfi, position, i5, iA07, registers);
                }
                tag.A01--;
                if (iA07 > registers || i5 != i3) {
                    throw AbstractC7609F5w.A0W("Failed to parse the message.");
                }
                data.A02(limit, gfi);
                return iA07;
            }
            if (i == 5) {
                data.A02(limit, Integer.valueOf(AbstractC7611F5y.A0E(position, unknownFields)));
                return unknownFields + 4;
            }
        }
        throw AbstractC7609F5w.A0W("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;[BIILX/GF6;)V */
    @Override // X.GF4
    public final void AQf(GF6 message, Object data, byte[] position, int limit, int registers) throws InvalidProtocolBufferException {
        A0P(message, data, position, limit, registers, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010 A[PHI: r2 r6
  0x0010: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:3:0x0006, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0010: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:3:0x0006, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.GF6 r7, X.GF4 r8, java.lang.Object r9, byte[] r10, int r11, int r12) throws androidx.health.platform.client.proto.InvalidProtocolBufferException {
        /*
            int r6 = r11 + 1
            r5 = r10
            r2 = r10[r11]
            r3 = r7
            if (r2 >= 0) goto L10
            int r6 = A09(r7, r10, r2, r6)
            int r2 = r7.A00
            if (r2 < 0) goto L34
        L10:
            int r12 = r12 - r6
            if (r2 > r12) goto L34
            int r0 = r7.A01
            int r1 = r0 + 1
            r7.A01 = r1
            r0 = 100
            if (r1 >= r0) goto L2d
            int r7 = r6 + r2
            r2 = r8
            r4 = r9
            r2.AQf(r3, r4, r5, r6, r7)
            int r0 = r3.A01
            int r0 = r0 + (-1)
            r3.A01 = r0
            r3.A03 = r9
            return r7
        L2d:
            java.lang.String r0 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            androidx.health.platform.client.proto.InvalidProtocolBufferException r0 = X.AbstractC7609F5w.A0W(r0)
            throw r0
        L34:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            androidx.health.platform.client.proto.InvalidProtocolBufferException r0 = X.AbstractC7609F5w.A0W(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.A00(X.GF6, X.GF4, java.lang.Object, byte[], int, int):int");
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/Grb;Ljava/lang/Class<*>;LX/GF6;)I */
    public static int A04(GF6 data, EnumC10215Grb position, Class limit, byte[] fieldType, int messageType, int registers) throws InvalidProtocolBufferException {
        int iA08;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        switch (GFZ.A00[position.ordinal()]) {
            case 1:
                iA08 = A08(data, fieldType, messageType);
                objValueOf = Boolean.valueOf(AnonymousClass002.A1L((data.A02 > 0L ? 1 : (data.A02 == 0L ? 0 : -1))));
                data.A03 = objValueOf;
                return iA08;
            case 2:
                return A05(data, fieldType, messageType);
            case 3:
                objValueOf2 = Double.valueOf(Double.longBitsToDouble(AbstractC7611F5y.A0I(fieldType, messageType)));
                data.A03 = objValueOf2;
                return messageType + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(AbstractC7611F5y.A0E(fieldType, messageType));
                data.A03 = objValueOf3;
                return messageType + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(AbstractC7611F5y.A0I(fieldType, messageType));
                data.A03 = objValueOf2;
                return messageType + 8;
            case 8:
                objValueOf3 = Float.valueOf(Float.intBitsToFloat(AbstractC7611F5y.A0E(fieldType, messageType)));
                data.A03 = objValueOf3;
                return messageType + 4;
            case 9:
            case 10:
            case 11:
                iA08 = A07(data, fieldType, messageType);
                objValueOf = Integer.valueOf(data.A00);
                data.A03 = objValueOf;
                return iA08;
            case 12:
            case 13:
                iA08 = A08(data, fieldType, messageType);
                objValueOf = Long.valueOf(data.A02);
                data.A03 = objValueOf;
                return iA08;
            case 14:
                GF4 gf4A00 = GFJ.A02.A00(limit);
                GF2 gf2ARA = gf4A00.ARA();
                int iA00 = A00(data, gf4A00, gf2ARA, fieldType, messageType, registers);
                gf4A00.AQ3(gf2ARA);
                data.A03 = gf2ARA;
                return iA00;
            case 15:
                iA08 = A07(data, fieldType, messageType);
                objValueOf = Integer.valueOf(AbstractC7608F5v.A04(data.A00));
                data.A03 = objValueOf;
                return iA08;
            case 16:
                iA08 = A08(data, fieldType, messageType);
                objValueOf = Long.valueOf(AbstractC7610F5x.A0T(data.A02));
                data.A03 = objValueOf;
                return iA08;
            case 17:
                return A06(data, fieldType, messageType);
            default:
                throw BV4.A0c("unsupported field type.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
    
        throw X.AbstractC7609F5w.A0W("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0101, code lost:
    
        throw X.AbstractC7609F5w.A0W("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x010f, code lost:
    
        throw X.AbstractC7609F5w.A0W("Protocol message had invalid UTF-8.");
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A06(X.GF6 r14, byte[] r15, int r16) throws androidx.health.platform.client.proto.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.A06(X.GF6, byte[], int):int");
    }

    public static int A07(GF6 data, byte[] position, int registers) {
        int i = registers + 1;
        byte b = position[registers];
        if (b < 0) {
            return A09(data, position, b, i);
        }
        data.A00 = b;
        return i;
    }

    public static int A08(GF6 data, byte[] position, int registers) {
        int i = registers + 1;
        long j = position[registers];
        if (j >= 0) {
            data.A02 = j;
            return i;
        }
        int i2 = i + 1;
        byte b = position[i];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i3 = 7;
        while (b < 0) {
            b = position[i2];
            i3 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i3;
            i2++;
        }
        data.A02 = j2;
        return i2;
    }

    public static int A09(GF6 firstByte, byte[] data, int position, int registers) {
        int i;
        int i2;
        int i3;
        int i4 = position & 127;
        int i5 = registers + 1;
        int i6 = data[registers];
        if (i6 < 0) {
            int i7 = i4 | ((i6 & 127) << 7);
            int i8 = registers + 2;
            int i9 = data[i5];
            if (i9 < 0) {
                i4 = i7 | ((i9 & 127) << 14);
                i5 = registers + 3;
                int i10 = data[i8];
                i = i10 << 21;
                if (i10 < 0) {
                    i7 = i4 | ((i10 & 127) << 21);
                    i8 = registers + 4;
                    int i11 = data[i5];
                    if (i11 < 0) {
                        i2 = i7 | ((i11 & 127) << 28);
                        while (true) {
                            i5 = i8 + 1;
                            if (data[i8] >= 0) {
                                break;
                            }
                            i8 = i5;
                        }
                    } else {
                        i3 = i11 << 28;
                    }
                }
                firstByte.A00 = i2;
                return i5;
            }
            i3 = i9 << 14;
            firstByte.A00 = i7 | i3;
            return i8;
        }
        i = i6 << 7;
        i2 = i4 | i;
        firstByte.A00 = i2;
        return i5;
    }

    public static int A0A(GF6 tag, byte[] data, int position, int limit, int registers) throws InvalidProtocolBufferException {
        if ((position >>> 3) != 0) {
            int i = position & 7;
            if (i == 0) {
                return A08(tag, data, limit);
            }
            if (i == 1) {
                return limit + 8;
            }
            if (i == 2) {
                return A07(tag, data, limit) + tag.A00;
            }
            if (i == 3) {
                int i2 = (position & (-8)) | 4;
                int i3 = 0;
                while (limit < registers) {
                    limit = A07(tag, data, limit);
                    i3 = tag.A00;
                    if (i3 == i2) {
                        break;
                    }
                    limit = A0A(tag, data, i3, limit, registers);
                }
                if (limit > registers || i3 != i2) {
                    throw AbstractC7609F5w.A0W("Failed to parse the message.");
                }
                return limit;
            }
            if (i == 5) {
                return limit + 4;
            }
        }
        throw AbstractC7609F5w.A0W("Protocol message contained an invalid tag (zero).");
    }

    public static int A0B(List list) {
        GFA<?, ?> gfa = GFG.A01;
        return list.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.GFH A0C(X.GFB r39, X.InterfaceC9346GFf r40, X.InterfaceC10617HzX r41, X.InterfaceC9342GFa r42, X.InterfaceC9348GFh r43, X.GFA r44) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.A0C(X.GFB, X.GFf, X.HzX, X.GFa, X.GFh, X.GFA):X.GFH");
    }

    private GF4 A0D(int pos) {
        int i = (pos / 3) * 2;
        Object[] objArr = this.A04;
        GF4 gf4 = (GF4) objArr[i];
        if (gf4 != null) {
            return gf4;
        }
        GF4<T> gf4A00 = GFJ.A02.A00((Class) objArr[i + 1]);
        objArr[i] = gf4A00;
        return gf4A00;
    }

    public static Object A0G(Object obj, long j) {
        return C9401GHq.A01.A06(obj, j);
    }

    public static void A0I(GFE gfe, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        gfe.A04(i << 3);
        gfe.A03(i2);
    }

    public static void A0J(GFE gfe, int i, int i2) throws CodedOutputStream$OutOfSpaceException {
        gfe.A04(i << 3);
        gfe.A04(i2);
    }

    private void A0K(T message, int pos) {
        int i = this.A03[pos + 2];
        long j = 1048575 & i;
        if (j != 1048575) {
            AbstractC9397GHm abstractC9397GHm = C9401GHq.A01;
            abstractC9397GHm.A0B(message, j, (1 << (i >>> 20)) | abstractC9397GHm.A04(message, j));
        }
    }

    /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
    private boolean A0L(int message, Object pos) {
        GEY gey;
        Object objA0G;
        boolean zEquals;
        int[] iArr = this.A03;
        int i = iArr[message + 2];
        long j = 1048575 & i;
        if (j == 1048575) {
            int i2 = iArr[message + 1];
            long j2 = i2 & 1048575;
            switch (AbstractC7608F5v.A03(i2)) {
                case 0:
                    if (Double.doubleToRawLongBits(C9401GHq.A01.A01(pos, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C9401GHq.A01.A02(pos, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C9401GHq.A01.A05(pos, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C9401GHq.A01.A04(pos, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C9401GHq.A01.A0I(pos, j2);
                case 8:
                    objA0G = A0G(pos, j2);
                    if (objA0G instanceof String) {
                        zEquals = ((String) objA0G).isEmpty();
                        return !zEquals;
                    }
                    if (!(objA0G instanceof GEY)) {
                        throw BV4.A0P();
                    }
                    gey = GEY.A01;
                    zEquals = gey.equals(objA0G);
                    return !zEquals;
                case 9:
                case 17:
                    if (A0G(pos, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    gey = GEY.A01;
                    objA0G = A0G(pos, j2);
                    zEquals = gey.equals(objA0G);
                    return !zEquals;
                default:
                    throw BV4.A0P();
            }
        } else {
            if ((C9401GHq.A01.A04(pos, j) & (1 << (i >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0M(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof GF2) {
            return AbstractC7609F5w.A1U(((GF2) message).memoizedSerializedSize, Integer.MIN_VALUE);
        }
        return true;
    }

    private boolean A0N(T message, int fieldNumber, int pos) {
        return AnonymousClass002.A1Q(C9401GHq.A01.A04(message, AbstractC7609F5w.A0Q(this.A03, pos)), fieldNumber);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;[BIIILX/GF6;)I */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0981 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0914 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r7v34, types: [X.HxZ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0P(X.GF6 r37, java.lang.Object r38, byte[] r39, int r40, int r41, int r42) throws androidx.health.platform.client.proto.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 2602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.A0P(X.GF6, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0016 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0016 A[SYNTHETIC] */
    @Override // X.GF4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AAo(T r11, T r12) {
        /*
            r10 = this;
            int[] r7 = r10.A03
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
            X.GHm r4 = X.C9401GHq.A01
            int r8 = r4.A04(r11, r2)
            int r2 = r4.A04(r12, r2)
            goto L30
        L28:
            boolean r8 = r10.A0L(r5, r11)
            boolean r2 = r10.A0L(r5, r12)
        L30:
            if (r8 != r2) goto Ld9
        L32:
            X.GHm r3 = X.C9401GHq.A01
            java.lang.Object r2 = r3.A06(r11, r0)
            java.lang.Object r1 = r3.A06(r12, r0)
            X.GFA<?, ?> r0 = X.GFG.A01
            if (r2 == r1) goto L16
            if (r2 == 0) goto Ld9
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Ld9
            goto L16
        L49:
            boolean r3 = r10.A0L(r5, r11)
            boolean r2 = r10.A0L(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHm r2 = X.C9401GHq.A01
            boolean r3 = r2.A0I(r11, r0)
            boolean r0 = r2.A0I(r12, r0)
            goto La4
        L5e:
            boolean r3 = r10.A0L(r5, r11)
            boolean r2 = r10.A0L(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHm r2 = X.C9401GHq.A01
            int r3 = r2.A04(r11, r0)
            int r0 = r2.A04(r12, r0)
            goto La4
        L73:
            boolean r3 = r10.A0L(r5, r11)
            boolean r2 = r10.A0L(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHm r2 = X.C9401GHq.A01
            long r3 = r2.A05(r11, r0)
            long r1 = r2.A05(r12, r0)
            goto Lc4
        L88:
            boolean r3 = r10.A0L(r5, r11)
            boolean r2 = r10.A0L(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHm r4 = X.C9401GHq.A01
            float r2 = r4.A02(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A02(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        La4:
            if (r3 != r0) goto Ld9
            goto L16
        La8:
            boolean r3 = r10.A0L(r5, r11)
            boolean r2 = r10.A0L(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHm r8 = X.C9401GHq.A01
            double r2 = r8.A01(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A01(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        Lc4:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Ld9
            goto L16
        Lca:
            X.GF2 r11 = (X.GF2) r11
            X.GFI r1 = r11.unknownFields
            X.GF2 r12 = (X.GF2) r12
            X.GFI r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld9
            r9 = 1
        Ld9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.AAo(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x003c A[SYNTHETIC] */
    @Override // X.GF4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AKR(T r23) {
        /*
            Method dump skipped, instructions count: 1726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.AKR(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF4
    public final int ANL(T t) {
        int i;
        int iHashCode;
        long jA05;
        float fA02;
        double dA00;
        int iA1X;
        int[] iArr = this.A03;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long jA0L = AbstractC7607F5u.A0L(i4);
            switch (AbstractC7608F5v.A03(i4)) {
                case 0:
                    i = i2 * 53;
                    dA00 = C9401GHq.A01.A01(t, jA0L);
                    jA05 = Double.doubleToLongBits(dA00);
                    Charset charset = AbstractC9349GFi.A04;
                    iHashCode = AnonymousClass002.A0A(jA05);
                    i2 = i + iHashCode;
                    break;
                case 1:
                    i = i2 * 53;
                    fA02 = C9401GHq.A01.A02(t, jA0L);
                    iHashCode = Float.floatToIntBits(fA02);
                    i2 = i + iHashCode;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    jA05 = C9401GHq.A01.A05(t, jA0L);
                    Charset charset2 = AbstractC9349GFi.A04;
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
                    iHashCode = C9401GHq.A01.A04(t, jA0L);
                    i2 = i + iHashCode;
                    break;
                case 7:
                    i = i2 * 53;
                    iA1X = C9401GHq.A01.A0I(t, jA0L);
                    Charset charset3 = AbstractC9349GFi.A04;
                    iHashCode = BV7.A02(iA1X);
                    i2 = i + iHashCode;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashCode = ((String) A0G(t, jA0L)).hashCode();
                    i2 = i + iHashCode;
                    break;
                case 9:
                case 17:
                    iHashCode = C8j4.A0E(A0G(t, jA0L), 37);
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
                    iHashCode = A0G(t, jA0L).hashCode();
                    i2 = i + iHashCode;
                    break;
                case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                    if (A0N(t, i5, i3)) {
                        i = i2 * 53;
                        dA00 = BV6.A00(A0G(t, jA0L));
                        jA05 = Double.doubleToLongBits(dA00);
                        Charset charset22 = AbstractC9349GFi.A04;
                        iHashCode = AnonymousClass002.A0A(jA05);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A0N(t, i5, i3)) {
                        i = i2 * 53;
                        fA02 = AnonymousClass001.A02(A0G(t, jA0L));
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
                    if (A0N(t, i5, i3)) {
                        i = i2 * 53;
                        jA05 = C3cG.A05(A0G(t, jA0L));
                        Charset charset222 = AbstractC9349GFi.A04;
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
                    if (A0N(t, i5, i3)) {
                        i = i2 * 53;
                        iHashCode = AnonymousClass001.A0F(A0G(t, jA0L));
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A0N(t, i5, i3)) {
                        i = i2 * 53;
                        iA1X = AnonymousClass001.A1X(A0G(t, jA0L));
                        Charset charset32 = AbstractC9349GFi.A04;
                        iHashCode = BV7.A02(iA1X);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A0N(t, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    iHashCode = ((String) A0G(t, jA0L)).hashCode();
                    i2 = i + iHashCode;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A0N(t, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    iHashCode = A0G(t, jA0L).hashCode();
                    i2 = i + iHashCode;
                    break;
            }
        }
        return AnonymousClass005.A0G(((GF2) t).unknownFields, i2 * 53);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF4
    public final void AQb(T t, T t2) {
        Object objAQa;
        AbstractC9397GHm abstractC9397GHm;
        if (!A0M(t)) {
            throw BV5.A0O(t, "Mutating immutable message: ");
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.A03;
            if (i >= iArr.length) {
                GFG.A07(t, t2);
                return;
            }
            int i2 = i + 1;
            int i3 = iArr[i2];
            long jA0L = AbstractC7607F5u.A0L(i3);
            int i4 = iArr[i];
            switch (AbstractC7608F5v.A03(i3)) {
                case 0:
                    if (A0L(i, t2)) {
                        AbstractC9397GHm abstractC9397GHm2 = C9401GHq.A01;
                        abstractC9397GHm2.A09(t, jA0L, abstractC9397GHm2.A01(t2, jA0L));
                        A0K(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 1:
                    if (A0L(i, t2)) {
                        AbstractC9397GHm abstractC9397GHm3 = C9401GHq.A01;
                        abstractC9397GHm3.A0A(t, jA0L, abstractC9397GHm3.A02(t2, jA0L));
                        A0K(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (A0L(i, t2)) {
                        AbstractC9397GHm abstractC9397GHm4 = C9401GHq.A01;
                        abstractC9397GHm4.A0C(t, jA0L, abstractC9397GHm4.A05(t2, jA0L));
                        A0K(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (A0L(i, t2)) {
                        AbstractC9397GHm abstractC9397GHm5 = C9401GHq.A01;
                        abstractC9397GHm5.A0B(t, jA0L, abstractC9397GHm5.A04(t2, jA0L));
                        A0K(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 7:
                    if (A0L(i, t2)) {
                        AbstractC9397GHm abstractC9397GHm6 = C9401GHq.A01;
                        abstractC9397GHm6.A0E(t, jA0L, abstractC9397GHm6.A0I(t2, jA0L));
                        A0K(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 8:
                case 10:
                    if (A0L(i, t2)) {
                        AbstractC9397GHm abstractC9397GHm7 = C9401GHq.A01;
                        abstractC9397GHm7.A0D(t, jA0L, abstractC9397GHm7.A06(t2, jA0L));
                        A0K(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 9:
                case 17:
                    if (A0L(i, t2)) {
                        long jA0L2 = AbstractC7607F5u.A0L(iArr[i2]);
                        Unsafe unsafe = A0D;
                        Object object = unsafe.getObject(t2, jA0L2);
                        if (object == null) {
                            throw AbstractC7611F5y.A0S(t2, iArr, i);
                        }
                        GF4 gf4A0D = A0D(i);
                        if (A0L(i, t)) {
                            Object object2 = unsafe.getObject(t, jA0L2);
                            if (!A0M(object2)) {
                                GF2 gf2ARA = gf4A0D.ARA();
                                gf4A0D.AQb(gf2ARA, object2);
                                unsafe.putObject(t, jA0L2, gf2ARA);
                                object2 = gf2ARA;
                            }
                            gf4A0D.AQb(object2, object);
                        } else {
                            if (A0M(object)) {
                                GF2 gf2ARA2 = gf4A0D.ARA();
                                gf4A0D.AQb(gf2ARA2, object);
                                unsafe.putObject(t, jA0L2, gf2ARA2);
                            } else {
                                unsafe.putObject(t, jA0L2, object);
                            }
                            A0K(t, i);
                        }
                    } else {
                        continue;
                    }
                    i += 3;
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
                    AbstractC9397GHm abstractC9397GHm8 = C9401GHq.A01;
                    GDN gdnAR0 = (GDN) abstractC9397GHm8.A06(t, jA0L);
                    List list = (List) abstractC9397GHm8.A06(t2, jA0L);
                    int size = gdnAR0.size();
                    int size2 = list.size();
                    objAQa = list;
                    abstractC9397GHm = abstractC9397GHm8;
                    if (size > 0) {
                        if (size2 > 0) {
                            if (!((GDC) gdnAR0).A00) {
                                gdnAR0 = gdnAR0.AR0(size2 + size);
                            }
                            gdnAR0.addAll(list);
                        }
                        objAQa = gdnAR0;
                        abstractC9397GHm = abstractC9397GHm8;
                    }
                    abstractC9397GHm.A0D(t, jA0L, objAQa);
                    i += 3;
                case 50:
                    InterfaceC10617HzX interfaceC10617HzX = this.A02;
                    GFA<?, ?> gfa = GFG.A01;
                    AbstractC9397GHm abstractC9397GHm9 = C9401GHq.A01;
                    objAQa = interfaceC10617HzX.AQa(abstractC9397GHm9.A06(t, jA0L), abstractC9397GHm9.A06(t2, jA0L));
                    abstractC9397GHm = abstractC9397GHm9;
                    abstractC9397GHm.A0D(t, jA0L, objAQa);
                    i += 3;
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
                    if (A0N(t2, i4, i)) {
                        AbstractC9397GHm abstractC9397GHm10 = C9401GHq.A01;
                        abstractC9397GHm10.A0D(t, jA0L, abstractC9397GHm10.A06(t2, jA0L));
                        C9401GHq.A01.A0B(t, AbstractC7609F5w.A0Q(iArr, i), i4);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 60:
                case 68:
                    if (A0N(t2, i4, i)) {
                        long jA0L3 = AbstractC7607F5u.A0L(iArr[i2]);
                        Unsafe unsafe2 = A0D;
                        Object object3 = unsafe2.getObject(t2, jA0L3);
                        if (object3 == null) {
                            throw AbstractC7611F5y.A0S(t2, iArr, i);
                        }
                        GF4 gf4A0D2 = A0D(i);
                        if (A0N(t, i4, i)) {
                            Object object4 = unsafe2.getObject(t, jA0L3);
                            if (!A0M(object4)) {
                                GF2 gf2ARA3 = gf4A0D2.ARA();
                                gf4A0D2.AQb(gf2ARA3, object4);
                                unsafe2.putObject(t, jA0L3, gf2ARA3);
                                object4 = gf2ARA3;
                            }
                            gf4A0D2.AQb(object4, object3);
                        } else {
                            if (A0M(object3)) {
                                GF2 gf2ARA4 = gf4A0D2.ARA();
                                gf4A0D2.AQb(gf2ARA4, object3);
                                unsafe2.putObject(t, jA0L3, gf2ARA4);
                            } else {
                                unsafe2.putObject(t, jA0L3, object3);
                            }
                            C9401GHq.A01.A0B(t, AbstractC7609F5w.A0Q(iArr, i), i4);
                        }
                    } else {
                        continue;
                    }
                    i += 3;
                default:
                    i += 3;
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // X.GF4
    public final GF2 ARA() {
        return (GF2) ((GF2) this.A09).A06(C79.A0K);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GFQ;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a1f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0040 A[SYNTHETIC] */
    @Override // X.GF4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aj5(X.GFQ r23, java.lang.Object r24) throws androidx.health.platform.client.proto.CodedOutputStream$OutOfSpaceException {
        /*
            Method dump skipped, instructions count: 3518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.Aj5(X.GFQ, java.lang.Object):void");
    }

    public GFH(GFB gfb, InterfaceC9346GFf interfaceC9346GFf, InterfaceC10617HzX interfaceC10617HzX, GF8 gf8, InterfaceC9348GFh interfaceC9348GFh, GFA gfa, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A03 = iArr;
        this.A04 = objArr;
        this.A01 = i;
        this.A00 = i2;
        this.A0C = iArr2;
        this.A05 = i3;
        this.A06 = i4;
        this.A0A = interfaceC9348GFh;
        this.A08 = interfaceC9346GFf;
        this.A0B = gfa;
        this.A07 = gfb;
        this.A09 = gf8;
        this.A02 = interfaceC10617HzX;
    }

    public static int A05(GF6 data, byte[] position, int registers) throws InvalidProtocolBufferException {
        int iA07 = A07(data, position, registers);
        int i = data.A00;
        if (i < 0) {
            throw AbstractC7609F5w.A0W("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int length = position.length;
        if (i > length - iA07) {
            throw AbstractC7609F5w.A0W("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            data.A03 = GEY.A01;
            return iA07;
        }
        GEY.A00(iA07, iA07 + i, length);
        data.A03 = new C9319GEa(GEY.A00.A7O(position, iA07, i));
        return iA07 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object A0E(T message, int pos) {
        GF4 gf4A0D = A0D(pos);
        long jA0P = AbstractC7609F5w.A0P(this.A03, pos);
        if (!A0L(pos, message)) {
            return gf4A0D.ARA();
        }
        Object object = A0D.getObject(message, jA0P);
        if (A0M(object)) {
            return object;
        }
        GF2 gf2ARA = gf4A0D.ARA();
        if (object != null) {
            gf4A0D.AQb(gf2ARA, object);
        }
        return gf2ARA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object A0F(T message, int fieldNumber, int pos) {
        GF4 gf4A0D = A0D(pos);
        if (!A0N(message, fieldNumber, pos)) {
            return gf4A0D.ARA();
        }
        Object object = A0D.getObject(message, AbstractC7609F5w.A0P(this.A03, pos));
        if (A0M(object)) {
            return object;
        }
        GF2 gf2ARA = gf4A0D.ARA();
        if (object != null) {
            gf4A0D.AQb(gf2ARA, object);
        }
        return gf2ARA;
    }

    public static Field A0H(Class<?> messageClass, String fieldName) {
        try {
            return messageClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = messageClass.getDeclaredFields();
            for (Field field : declaredFields) {
                if (fieldName.equals(field.getName())) {
                    return field;
                }
            }
            throw BV4.A0c(FGI.A0C(messageClass, fieldName, declaredFields));
        }
    }

    private boolean A0O(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        return presenceFieldOffset == 1048575 ? A0L(pos, message) : AbstractC7609F5w.A1U(presenceField, presenceMask);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.GF4] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.GF4] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.GF4] */
    @Override // X.GF4
    public final boolean AOY(T t) {
        boolean zA0O;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (i < this.A05) {
            int i4 = this.A0C[i];
            int[] iArr = this.A03;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i2) {
                i8 = i2;
            } else if (i8 != 1048575) {
                i3 = A0D.getInt(t, i8);
            }
            if ((268435456 & i6) == 0 || A0O(t, i4, i8, i3, i9)) {
                int iA03 = AbstractC7608F5v.A03(i6);
                if (iA03 == 9 || iA03 == 17) {
                    zA0O = A0O(t, i4, i8, i3, i9);
                } else {
                    if (iA03 != 27) {
                        if (iA03 == 60 || iA03 == 68) {
                            zA0O = A0N(t, i5, i4);
                        } else {
                            if (iA03 != 49) {
                                if (iA03 == 50) {
                                    AbstractMap abstractMap = (AbstractMap) A0G(t, i6 & 1048575);
                                    if (!abstractMap.isEmpty() && ((GFL) this.A04[(i4 / 3) * 2]).A00.A01.javaType == EnumC10216Grc.MESSAGE) {
                                        Iterator itA0x = BV5.A0x(abstractMap);
                                        ?? A0X = 0;
                                        while (itA0x.hasNext()) {
                                            Object next = itA0x.next();
                                            A0X = A0X;
                                            if (A0X == 0) {
                                                A0X = AbstractC7609F5w.A0X(next);
                                            }
                                            if (!A0X.AOY(next)) {
                                                return false;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i++;
                            i2 = i8;
                        }
                    }
                    List list = (List) A0G(t, i6 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ?? A0D2 = A0D(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (A0D2.AOY(list.get(i10))) {
                            }
                        }
                    }
                    i++;
                    i2 = i8;
                }
                if (zA0O && !A0D(i4).AOY(A0G(t, i6 & 1048575))) {
                    return false;
                }
                i++;
                i2 = i8;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f A[SYNTHETIC] */
    @Override // X.GF4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ3(T r10) {
        /*
            r9 = this;
            boolean r0 = A0M(r10)
            if (r0 == 0) goto L8a
            boolean r0 = r10 instanceof X.GF2
            if (r0 == 0) goto L1e
            r3 = r10
            X.GF2 r3 = (X.GF2) r3
            int r2 = r3.memoizedSerializedSize
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r1 | r2
            r3.memoizedSerializedSize = r0
            r0 = 0
            r3.memoizedHashCode = r0
            r3.memoizedSerializedSize = r1
        L1e:
            int[] r6 = r9.A03
            int r5 = r6.length
            r4 = 0
        L22:
            if (r4 >= r5) goto L7f
            int r0 = r4 + 1
            r0 = r6[r0]
            long r2 = X.AbstractC7607F5u.A0L(r0)
            int r1 = X.AbstractC7608F5v.A03(r0)
            r0 = 9
            if (r1 == r0) goto L64
            r0 = 60
            if (r1 == r0) goto L69
            r0 = 68
            if (r1 == r0) goto L69
            switch(r1) {
                case 17: goto L64;
                case 18: goto L42;
                case 19: goto L42;
                case 20: goto L42;
                case 21: goto L42;
                case 22: goto L42;
                case 23: goto L42;
                case 24: goto L42;
                case 25: goto L42;
                case 26: goto L42;
                case 27: goto L42;
                case 28: goto L42;
                case 29: goto L42;
                case 30: goto L42;
                case 31: goto L42;
                case 32: goto L42;
                case 33: goto L42;
                case 34: goto L42;
                case 35: goto L42;
                case 36: goto L42;
                case 37: goto L42;
                case 38: goto L42;
                case 39: goto L42;
                case 40: goto L42;
                case 41: goto L42;
                case 42: goto L42;
                case 43: goto L42;
                case 44: goto L42;
                case 45: goto L42;
                case 46: goto L42;
                case 47: goto L42;
                case 48: goto L42;
                case 49: goto L42;
                case 50: goto L52;
                default: goto L3f;
            }
        L3f:
            int r4 = r4 + 3
            goto L22
        L42:
            java.lang.Object r1 = A0G(r10, r2)
            X.GDN r1 = (X.GDN) r1
            X.GDC r1 = (X.GDC) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L3f
            r0 = 0
            r1.A00 = r0
            goto L3f
        L52:
            sun.misc.Unsafe r8 = X.GFH.A0D
            java.lang.Object r7 = r8.getObject(r10, r2)
            if (r7 == 0) goto L3f
            r1 = r7
            X.HxZ r1 = (X.HxZ) r1
            r0 = 0
            r1.isMutable = r0
            r8.putObject(r10, r2, r7)
            goto L3f
        L64:
            boolean r0 = r9.A0L(r4, r10)
            goto L6f
        L69:
            r0 = r6[r4]
            boolean r0 = r9.A0N(r10, r0, r4)
        L6f:
            if (r0 == 0) goto L3f
            X.GF4 r1 = r9.A0D(r4)
            sun.misc.Unsafe r0 = X.GFH.A0D
            java.lang.Object r0 = r0.getObject(r10, r2)
            r1.AQ3(r0)
            goto L3f
        L7f:
            X.GF2 r10 = (X.GF2) r10
            X.GFI r1 = r10.unknownFields
            boolean r0 = r1.A02
            if (r0 == 0) goto L8a
            r0 = 0
            r1.A02 = r0
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFH.AQ3(java.lang.Object):void");
    }
}
