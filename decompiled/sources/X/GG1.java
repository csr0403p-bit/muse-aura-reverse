package X;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.List;
import org.maplibre.android.R;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public final class GG1<T> implements GG0<T> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final InterfaceC9301GDd A04;
    public final InterfaceC10618HzY A05;
    public final AnonymousClass777 A06;
    public final int[] A07;
    public final int[] A08;
    public final Object[] A09;
    public final C9362GFy<?> A0A;
    public final GHI A0B;
    public final GG8<?, ?> A0C;
    public final boolean A0D;
    public static final int[] A0F = new int[0];
    public static final Unsafe A0E = C9399GHo.A03();

    public static int A02(Hk0 msg, GG0 schema, Object data, byte[] position, int limit, int endGroup, int registers) throws InvalidProtocolBufferException {
        GG1 gg1 = (GG1) schema;
        int i = msg.A01 + 1;
        msg.A01 = i;
        if (i >= 100) {
            throw AbstractC7609F5w.A0U("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iA0O = gg1.A0O(msg, data, position, limit, endGroup, registers);
        msg.A01--;
        msg.A03 = data;
        return iA0O;
    }

    public static int A03(Hk0 schema, GG0 data, byte[] position, int limit, int endGroup, int registers) {
        GF0 gf0AR9 = data.AR9();
        int iA02 = A02(schema, data, gf0AR9, position, limit, endGroup, registers);
        data.AQ3(gf0AR9);
        schema.A03 = gf0AR9;
        return iA02;
    }

    public static int A04(Hk0 tag, GG7 data, byte[] position, int limit, int unknownFields, int registers) throws InvalidProtocolBufferException {
        int iA06 = unknownFields;
        if ((limit >>> 3) != 0) {
            int i = limit & 7;
            if (i == 0) {
                int iA07 = A07(tag, position, unknownFields);
                data.A02(limit, Long.valueOf(tag.A02));
                return iA07;
            }
            if (i == 1) {
                data.A02(limit, Long.valueOf(AbstractC7611F5y.A0I(position, unknownFields)));
                return unknownFields + 8;
            }
            if (i == 2) {
                int iA062 = A06(tag, position, unknownFields);
                int i2 = tag.A00;
                if (i2 < 0) {
                    throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                if (i2 > position.length - iA062) {
                    throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                data.A02(limit, i2 == 0 ? AbstractC9320GEb.A00 : AbstractC9320GEb.A01(position, iA062, i2));
                return iA062 + i2;
            }
            if (i == 3) {
                GG7 gg7 = new GG7();
                int i3 = (limit & (-8)) | 4;
                int i4 = tag.A01 + 1;
                tag.A01 = i4;
                if (i4 >= 100) {
                    throw AbstractC7609F5w.A0U("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                int i5 = 0;
                while (iA06 < registers) {
                    iA06 = A06(tag, position, iA06);
                    i5 = tag.A00;
                    if (i5 == i3) {
                        break;
                    }
                    iA06 = A04(tag, gg7, position, i5, iA06, registers);
                }
                tag.A01--;
                if (iA06 > registers || i5 != i3) {
                    throw AbstractC7609F5w.A0U("Failed to parse the message.");
                }
                data.A02(limit, gg7);
                return iA06;
            }
            if (i == 5) {
                data.A02(limit, Integer.valueOf(AbstractC7611F5y.A0E(position, unknownFields)));
                return unknownFields + 4;
            }
        }
        throw AbstractC7609F5w.A0U("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;[BIILX/Hk0;)V */
    @Override // X.GG0
    public final void AQe(Hk0 message, Object data, byte[] position, int limit, int registers) throws InvalidProtocolBufferException {
        A0O(message, data, position, limit, registers, 0);
    }

    private int A00(final int number) {
        if (number < this.A02 || number > this.A01) {
            return -1;
        }
        int i = 0;
        int[] iArr = this.A07;
        int length = (iArr.length / 3) - 1;
        while (i <= length) {
            int i2 = (length + i) >>> 1;
            int i3 = i2 * 3;
            int i4 = iArr[i3];
            if (number == i4) {
                return i3;
            }
            if (number < i4) {
                length = i2 - 1;
            } else {
                i = i2 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010 A[PHI: r2 r6
  0x0010: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:3:0x0006, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]
  0x0010: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:3:0x0006, B:5:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A01(X.Hk0 r7, X.GG0 r8, java.lang.Object r9, byte[] r10, int r11, int r12) throws androidx.glance.appwidget.protobuf.InvalidProtocolBufferException {
        /*
            int r6 = r11 + 1
            r5 = r10
            r2 = r10[r11]
            r3 = r7
            if (r2 >= 0) goto L10
            int r6 = A08(r7, r10, r2, r6)
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
            r2.AQe(r3, r4, r5, r6, r7)
            int r0 = r3.A01
            int r0 = r0 + (-1)
            r3.A01 = r0
            r3.A03 = r9
            return r7
        L2d:
            java.lang.String r0 = "Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit."
            androidx.glance.appwidget.protobuf.InvalidProtocolBufferException r0 = X.AbstractC7609F5w.A0U(r0)
            throw r0
        L34:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            androidx.glance.appwidget.protobuf.InvalidProtocolBufferException r0 = X.AbstractC7609F5w.A0U(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.A01(X.Hk0, X.GG0, java.lang.Object, byte[], int, int):int");
    }

    public static int A06(Hk0 data, byte[] position, int registers) {
        int i = registers + 1;
        byte b = position[registers];
        if (b < 0) {
            return A08(data, position, b, i);
        }
        data.A00 = b;
        return i;
    }

    public static int A07(Hk0 data, byte[] position, int registers) {
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

    public static int A08(Hk0 firstByte, byte[] data, int position, int registers) {
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

    public static int A09(List list) {
        GG8<?, ?> gg8 = GG2.A01;
        return list.size();
    }

    public static GDM A0A(GG1 gg1, Object obj, int i) {
        return gg1.A04.AR2(obj, i & 1048575);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.GG1 A0B(X.C9362GFy r39, X.InterfaceC9301GDd r40, X.InterfaceC10618HzY r41, X.GFw r42, X.GHI r43, X.GG8 r44) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.A0B(X.GFy, X.GDd, X.HzY, X.GFw, X.GHI, X.GG8):X.GG1");
    }

    private GG0 A0C(int pos) {
        int i = (pos / 3) * 2;
        Object[] objArr = this.A09;
        GG0 gg0 = (GG0) objArr[i];
        if (gg0 != null) {
            return gg0;
        }
        GG0<T> gg0A00 = C9359GFs.A02.A00((Class) objArr[i + 1]);
        objArr[i] = gg0A00;
        return gg0A00;
    }

    private void A0G(GGK message, Object typeAndOffset, int reader) throws InvalidProtocolBufferException {
        long jA0L;
        Object objA0T;
        if ((536870912 & reader) != 0) {
            jA0L = AbstractC7607F5u.A0L(reader);
            objA0T = GG3.A03((GG3) message, 2).A0U();
        } else {
            boolean z = this.A0D;
            jA0L = AbstractC7607F5u.A0L(reader);
            GG3 gg3 = (GG3) message;
            GG3.A07(gg3, 2);
            GG9 gg9 = gg3.A03;
            objA0T = z ? gg9.A0T() : gg9.A0S();
        }
        C9399GHo.A05(typeAndOffset, jA0L, objA0T);
    }

    private void A0H(T message, int pos) {
        int i = this.A07[pos + 2];
        long j = 1048575 & i;
        if (j != 1048575) {
            C9399GHo.A04(message, j, (1 << (i >>> 20)) | C9399GHo.A01.A05(message, j));
        }
    }

    private void A0I(T message, int pos, Object field) {
        A0E.putObject(message, AbstractC7609F5w.A0P(this.A07, pos), field);
        A0H(message, pos);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;IILjava/lang/Object;)V */
    private void A0J(Object message, Object fieldNumber, int pos, int field) {
        Unsafe unsafe = A0E;
        int[] iArr = this.A07;
        unsafe.putObject(message, iArr[field + 1] & 1048575, fieldNumber);
        C9399GHo.A04(message, iArr[field + 2] & 1048575, pos);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;I)Z */
    private boolean A0K(int message, Object pos) {
        AbstractC9320GEb abstractC9320GEb;
        Object objA00;
        boolean zEquals;
        int[] iArr = this.A07;
        int i = iArr[message + 2];
        long j = 1048575 & i;
        if (j == 1048575) {
            int i2 = iArr[message + 1];
            long j2 = i2 & 1048575;
            switch (AbstractC7608F5v.A03(i2)) {
                case 0:
                    if (Double.doubleToRawLongBits(C9399GHo.A01.A02(pos, j2)) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C9399GHo.A01.A03(pos, j2)) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (C9399GHo.A01.A06(pos, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (C9399GHo.A01.A05(pos, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return C9399GHo.A01.A0J(pos, j2);
                case 8:
                    objA00 = AbstractC9398GHn.A00(pos, j2);
                    if (objA00 instanceof String) {
                        zEquals = ((String) objA00).isEmpty();
                        return !zEquals;
                    }
                    if (!(objA00 instanceof AbstractC9320GEb)) {
                        throw BV4.A0P();
                    }
                    abstractC9320GEb = AbstractC9320GEb.A00;
                    zEquals = abstractC9320GEb.equals(objA00);
                    return !zEquals;
                case 9:
                case 17:
                    if (AbstractC9398GHn.A00(pos, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    abstractC9320GEb = AbstractC9320GEb.A00;
                    objA00 = AbstractC9398GHn.A00(pos, j2);
                    zEquals = abstractC9320GEb.equals(objA00);
                    return !zEquals;
                default:
                    throw BV4.A0P();
            }
        } else {
            if ((C9399GHo.A01.A05(pos, j) & (1 << (i >>> 20))) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0L(Object message) {
        if (message == null) {
            return false;
        }
        if (message instanceof GF0) {
            return AbstractC7609F5w.A1U(((GF0) message).memoizedSerializedSize, Integer.MIN_VALUE);
        }
        return true;
    }

    private boolean A0M(T message, int fieldNumber, int pos) {
        return AnonymousClass002.A1Q(C9399GHo.A01.A05(message, AbstractC7609F5w.A0Q(this.A07, pos)), fieldNumber);
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x06a6, code lost:
    
        throw X.AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x06ad, code lost:
    
        throw X.AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x06af, code lost:
    
        r0 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x06b4, code lost:
    
        if (r0 == 1048575) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x06b6, code lost:
    
        r10.putInt(r37, r0, r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x06bc, code lost:
    
        r6 = r35.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x06c1, code lost:
    
        if (r6 >= r35.A03) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x06c3, code lost:
    
        X.C9399GHo.A01.A07(r37, r35.A07[r35.A08[r6] + 1] & 1048575);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x06d7, code lost:
    
        if (r41 != 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x06d9, code lost:
    
        if (r2 != r40) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x06db, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x06dc, code lost:
    
        if (r2 > r40) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x06e0, code lost:
    
        if (r11 != r41) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x06e2, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x06e3, code lost:
    
        r0 = new androidx.glance.appwidget.protobuf.InvalidProtocolBufferException("Failed to parse the message.");
        r0.unfinishedMessage = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x06ec, code lost:
    
        throw r0;
     */
    /* JADX WARN: Incorrect types in method signature: (TT;[BIIILX/Hk0;)I */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04f2 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A0O(X.Hk0 r36, java.lang.Object r37, byte[] r38, int r39, int r40, int r41) throws androidx.glance.appwidget.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.A0O(X.Hk0, java.lang.Object, byte[], int, int, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0016 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0016 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0016 A[SYNTHETIC] */
    @Override // X.GG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AAo(T r11, T r12) {
        /*
            r10 = this;
            int[] r7 = r10.A07
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
            X.GHn r4 = X.C9399GHo.A01
            int r8 = r4.A05(r11, r2)
            int r2 = r4.A05(r12, r2)
            goto L30
        L28:
            boolean r8 = r10.A0K(r5, r11)
            boolean r2 = r10.A0K(r5, r12)
        L30:
            if (r8 != r2) goto Ld9
        L32:
            X.GHn r3 = X.C9399GHo.A01
            java.lang.Object r2 = r3.A07(r11, r0)
            java.lang.Object r1 = r3.A07(r12, r0)
            X.GG8<?, ?> r0 = X.GG2.A01
            if (r2 == r1) goto L16
            if (r2 == 0) goto Ld9
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto Ld9
            goto L16
        L49:
            boolean r3 = r10.A0K(r5, r11)
            boolean r2 = r10.A0K(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHn r2 = X.C9399GHo.A01
            boolean r3 = r2.A0J(r11, r0)
            boolean r0 = r2.A0J(r12, r0)
            goto La4
        L5e:
            boolean r3 = r10.A0K(r5, r11)
            boolean r2 = r10.A0K(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHn r2 = X.C9399GHo.A01
            int r3 = r2.A05(r11, r0)
            int r0 = r2.A05(r12, r0)
            goto La4
        L73:
            boolean r3 = r10.A0K(r5, r11)
            boolean r2 = r10.A0K(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHn r2 = X.C9399GHo.A01
            long r3 = r2.A06(r11, r0)
            long r1 = r2.A06(r12, r0)
            goto Lc4
        L88:
            boolean r3 = r10.A0K(r5, r11)
            boolean r2 = r10.A0K(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHn r4 = X.C9399GHo.A01
            float r2 = r4.A03(r11, r0)
            int r3 = java.lang.Float.floatToIntBits(r2)
            float r0 = r4.A03(r12, r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        La4:
            if (r3 != r0) goto Ld9
            goto L16
        La8:
            boolean r3 = r10.A0K(r5, r11)
            boolean r2 = r10.A0K(r5, r12)
            if (r3 != r2) goto Ld9
            X.GHn r8 = X.C9399GHo.A01
            double r2 = r8.A02(r11, r0)
            long r3 = java.lang.Double.doubleToLongBits(r2)
            double r0 = r8.A02(r12, r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
        Lc4:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Ld9
            goto L16
        Lca:
            X.GF0 r11 = (X.GF0) r11
            X.GG7 r1 = r11.unknownFields
            X.GF0 r12 = (X.GF0) r12
            X.GG7 r0 = r12.unknownFields
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld9
            r9 = 1
        Ld9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.AAo(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x003d A[SYNTHETIC] */
    @Override // X.GG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AKR(T r19) {
        /*
            Method dump skipped, instructions count: 1536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.AKR(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final int ANL(T t) {
        int i;
        int iHashCode;
        long jA05;
        float fA02;
        double dA00;
        int iA1X;
        int[] iArr = this.A07;
        int length = iArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long jA0L = AbstractC7607F5u.A0L(i4);
            switch (AbstractC7608F5v.A03(i4)) {
                case 0:
                    i = i2 * 53;
                    dA00 = C9399GHo.A01.A02(t, jA0L);
                    jA05 = Double.doubleToLongBits(dA00);
                    Charset charset = AbstractC9351GFk.A04;
                    iHashCode = AnonymousClass002.A0A(jA05);
                    i2 = i + iHashCode;
                    break;
                case 1:
                    i = i2 * 53;
                    fA02 = C9399GHo.A01.A03(t, jA0L);
                    iHashCode = Float.floatToIntBits(fA02);
                    i2 = i + iHashCode;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i2 * 53;
                    jA05 = C9399GHo.A01.A06(t, jA0L);
                    Charset charset2 = AbstractC9351GFk.A04;
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
                    iHashCode = C9399GHo.A01.A05(t, jA0L);
                    i2 = i + iHashCode;
                    break;
                case 7:
                    i = i2 * 53;
                    iA1X = C9399GHo.A01.A0J(t, jA0L);
                    Charset charset3 = AbstractC9351GFk.A04;
                    iHashCode = BV7.A02(iA1X);
                    i2 = i + iHashCode;
                    break;
                case 8:
                    i = i2 * 53;
                    iHashCode = ((String) AbstractC9398GHn.A00(t, jA0L)).hashCode();
                    i2 = i + iHashCode;
                    break;
                case 9:
                case 17:
                    iHashCode = C8j4.A0E(AbstractC9398GHn.A00(t, jA0L), 37);
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
                    iHashCode = AbstractC9398GHn.A00(t, jA0L).hashCode();
                    i2 = i + iHashCode;
                    break;
                case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                    if (A0M(t, i5, i3)) {
                        i = i2 * 53;
                        dA00 = BV6.A00(AbstractC9398GHn.A00(t, jA0L));
                        jA05 = Double.doubleToLongBits(dA00);
                        Charset charset22 = AbstractC9351GFk.A04;
                        iHashCode = AnonymousClass002.A0A(jA05);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A0M(t, i5, i3)) {
                        i = i2 * 53;
                        fA02 = AnonymousClass001.A02(AbstractC9398GHn.A00(t, jA0L));
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
                    if (A0M(t, i5, i3)) {
                        i = i2 * 53;
                        jA05 = C3cG.A05(AbstractC9398GHn.A00(t, jA0L));
                        Charset charset222 = AbstractC9351GFk.A04;
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
                    if (A0M(t, i5, i3)) {
                        i = i2 * 53;
                        iHashCode = AnonymousClass001.A0F(AbstractC9398GHn.A00(t, jA0L));
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A0M(t, i5, i3)) {
                        i = i2 * 53;
                        iA1X = AnonymousClass001.A1X(AbstractC9398GHn.A00(t, jA0L));
                        Charset charset32 = AbstractC9351GFk.A04;
                        iHashCode = BV7.A02(iA1X);
                        i2 = i + iHashCode;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!A0M(t, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    iHashCode = ((String) AbstractC9398GHn.A00(t, jA0L)).hashCode();
                    i2 = i + iHashCode;
                    break;
                case 60:
                case 61:
                case 68:
                    if (!A0M(t, i5, i3)) {
                        break;
                    }
                    i = i2 * 53;
                    iHashCode = AbstractC9398GHn.A00(t, jA0L).hashCode();
                    i2 = i + iHashCode;
                    break;
            }
        }
        return AnonymousClass005.A0G(((GF0) t).unknownFields, i2 * 53);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final void AQb(T t, T t2) {
        Object objAQZ;
        if (!A0L(t)) {
            throw BV5.A0O(t, "Mutating immutable message: ");
        }
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.A07;
            if (i >= iArr.length) {
                GG2.A07(t, t2);
                return;
            }
            int i2 = i + 1;
            int i3 = iArr[i2];
            long jA0L = AbstractC7607F5u.A0L(i3);
            int i4 = iArr[i];
            switch (AbstractC7608F5v.A03(i3)) {
                case 0:
                    if (A0K(i, t2)) {
                        AbstractC9398GHn abstractC9398GHn = C9399GHo.A01;
                        abstractC9398GHn.A0A(t, jA0L, abstractC9398GHn.A02(t2, jA0L));
                        A0H(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 1:
                    if (A0K(i, t2)) {
                        AbstractC9398GHn abstractC9398GHn2 = C9399GHo.A01;
                        abstractC9398GHn2.A0B(t, jA0L, abstractC9398GHn2.A03(t2, jA0L));
                        A0H(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (A0K(i, t2)) {
                        AbstractC9398GHn abstractC9398GHn3 = C9399GHo.A01;
                        abstractC9398GHn3.A0D(t, jA0L, abstractC9398GHn3.A06(t2, jA0L));
                        A0H(t, i);
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
                    if (A0K(i, t2)) {
                        C9399GHo.A04(t, jA0L, C9399GHo.A01.A05(t2, jA0L));
                        A0H(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 7:
                    if (A0K(i, t2)) {
                        AbstractC9398GHn abstractC9398GHn4 = C9399GHo.A01;
                        abstractC9398GHn4.A0F(t, jA0L, abstractC9398GHn4.A0J(t2, jA0L));
                        A0H(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 8:
                case 10:
                    if (A0K(i, t2)) {
                        C9399GHo.A05(t, jA0L, AbstractC9398GHn.A00(t2, jA0L));
                        A0H(t, i);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 9:
                case 17:
                    if (A0K(i, t2)) {
                        long jA0L2 = AbstractC7607F5u.A0L(iArr[i2]);
                        Unsafe unsafe = A0E;
                        Object object = unsafe.getObject(t2, jA0L2);
                        if (object == null) {
                            throw AbstractC7611F5y.A0S(t2, iArr, i);
                        }
                        GG0 gg0A0C = A0C(i);
                        if (A0K(i, t)) {
                            Object object2 = unsafe.getObject(t, jA0L2);
                            if (!A0L(object2)) {
                                GF0 gf0AR9 = gg0A0C.AR9();
                                gg0A0C.AQb(gf0AR9, object2);
                                unsafe.putObject(t, jA0L2, gf0AR9);
                                object2 = gf0AR9;
                            }
                            gg0A0C.AQb(object2, object);
                        } else {
                            if (A0L(object)) {
                                GF0 gf0AR92 = gg0A0C.AR9();
                                gg0A0C.AQb(gf0AR92, object);
                                unsafe.putObject(t, jA0L2, gf0AR92);
                            } else {
                                unsafe.putObject(t, jA0L2, object);
                            }
                            A0H(t, i);
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
                    AbstractC9398GHn abstractC9398GHn5 = C9399GHo.A01;
                    GDM gdmAQz = (GDM) abstractC9398GHn5.A07(t, jA0L);
                    List list = (List) abstractC9398GHn5.A07(t2, jA0L);
                    int size = gdmAQz.size();
                    int size2 = list.size();
                    objAQZ = list;
                    if (size > 0) {
                        if (size2 > 0) {
                            if (!((GDE) gdmAQz).A00) {
                                gdmAQz = gdmAQz.AQz(size2 + size);
                            }
                            gdmAQz.addAll(list);
                        }
                        objAQZ = gdmAQz;
                    }
                    C9399GHo.A05(t, jA0L, objAQZ);
                    i += 3;
                case 50:
                    InterfaceC10618HzY interfaceC10618HzY = this.A05;
                    GG8<?, ?> gg8 = GG2.A01;
                    AbstractC9398GHn abstractC9398GHn6 = C9399GHo.A01;
                    objAQZ = interfaceC10618HzY.AQZ(abstractC9398GHn6.A07(t, jA0L), abstractC9398GHn6.A07(t2, jA0L));
                    C9399GHo.A05(t, jA0L, objAQZ);
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
                    if (A0M(t2, i4, i)) {
                        C9399GHo.A05(t, jA0L, AbstractC9398GHn.A00(t2, jA0L));
                        C9399GHo.A04(t, AbstractC7609F5w.A0Q(iArr, i), i4);
                        i += 3;
                    } else {
                        i += 3;
                    }
                case 60:
                case 68:
                    if (A0M(t2, i4, i)) {
                        long jA0L3 = AbstractC7607F5u.A0L(iArr[i2]);
                        Unsafe unsafe2 = A0E;
                        Object object3 = unsafe2.getObject(t2, jA0L3);
                        if (object3 == null) {
                            throw AbstractC7611F5y.A0S(t2, iArr, i);
                        }
                        GG0 gg0A0C2 = A0C(i);
                        if (A0M(t, i4, i)) {
                            Object object4 = unsafe2.getObject(t, jA0L3);
                            if (!A0L(object4)) {
                                GF0 gf0AR93 = gg0A0C2.AR9();
                                gg0A0C2.AQb(gf0AR93, object4);
                                unsafe2.putObject(t, jA0L3, gf0AR93);
                                object4 = gf0AR93;
                            }
                            gg0A0C2.AQb(object4, object3);
                        } else {
                            if (A0L(object3)) {
                                GF0 gf0AR94 = gg0A0C2.AR9();
                                gg0A0C2.AQb(gf0AR94, object3);
                                unsafe2.putObject(t, jA0L3, gf0AR94);
                            } else {
                                unsafe2.putObject(t, jA0L3, object3);
                            }
                            C9399GHo.A04(t, AbstractC7609F5w.A0Q(iArr, i), i4);
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

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGK;LX/796;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x003c A[SYNTHETIC] */
    @Override // X.GG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQd(X.AnonymousClass796 r18, X.GGK r19, java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.AQd(X.796, X.GGK, java.lang.Object):void");
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // X.GG0
    public final GF0 AR9() {
        return (GF0) ((GF0) this.A06).A05(C79.A0K);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGt;)V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:478:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:731:0x003c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:733:0x003c A[SYNTHETIC] */
    @Override // X.GG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Aj4(X.InterfaceC9380GGt r22, java.lang.Object r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.Aj4(X.GGt, java.lang.Object):void");
    }

    public GG1(C9362GFy c9362GFy, InterfaceC9301GDd interfaceC9301GDd, InterfaceC10618HzY interfaceC10618HzY, AnonymousClass777 anonymousClass777, GHI ghi, GG8 gg8, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4) {
        this.A07 = iArr;
        this.A09 = objArr;
        this.A02 = i;
        this.A01 = i2;
        this.A0D = anonymousClass777 instanceof GF0;
        this.A08 = iArr2;
        this.A00 = i3;
        this.A03 = i4;
        this.A0B = ghi;
        this.A04 = interfaceC9301GDd;
        this.A0C = gg8;
        this.A0A = c9362GFy;
        this.A06 = anonymousClass777;
        this.A05 = interfaceC10618HzY;
    }

    public static int A05(Hk0 data, byte[] position, int registers) throws InvalidProtocolBufferException {
        int iA06 = A06(data, position, registers);
        int i = data.A00;
        if (i < 0) {
            throw AbstractC7609F5w.A0U("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i > position.length - iA06) {
            throw AbstractC7609F5w.A0U("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i == 0) {
            data.A03 = AbstractC9320GEb.A00;
            return iA06;
        }
        data.A03 = AbstractC9320GEb.A01(position, iA06, i);
        return iA06 + i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object A0D(T message, int pos) {
        GG0 gg0A0C = A0C(pos);
        long jA0P = AbstractC7609F5w.A0P(this.A07, pos);
        if (!A0K(pos, message)) {
            return gg0A0C.AR9();
        }
        Object object = A0E.getObject(message, jA0P);
        if (A0L(object)) {
            return object;
        }
        GF0 gf0AR9 = gg0A0C.AR9();
        if (object != null) {
            gg0A0C.AQb(gf0AR9, object);
        }
        return gf0AR9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object A0E(T message, int fieldNumber, int pos) {
        GG0 gg0A0C = A0C(pos);
        if (!A0M(message, fieldNumber, pos)) {
            return gg0A0C.AR9();
        }
        Object object = A0E.getObject(message, AbstractC7609F5w.A0P(this.A07, pos));
        if (A0L(object)) {
            return object;
        }
        GF0 gf0AR9 = gg0A0C.AR9();
        if (object != null) {
            gg0A0C.AQb(gf0AR9, object);
        }
        return gf0AR9;
    }

    public static Field A0F(Class<?> messageClass, String fieldName) {
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

    private boolean A0N(T message, int pos, int presenceFieldOffset, int presenceField, int presenceMask) {
        return presenceFieldOffset == 1048575 ? A0K(pos, message) : AbstractC7609F5w.A1U(presenceField, presenceMask);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final boolean AOY(T message) {
        boolean zA0N;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (i < this.A00) {
            int i4 = this.A08[i];
            int[] iArr = this.A07;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 == i2) {
                i8 = i2;
            } else if (i8 != 1048575) {
                i3 = A0E.getInt(message, i8);
            }
            if ((268435456 & i6) == 0 || A0N(message, i4, i8, i3, i9)) {
                int iA03 = AbstractC7608F5v.A03(i6);
                if (iA03 == 9 || iA03 == 17) {
                    zA0N = A0N(message, i4, i8, i3, i9);
                } else {
                    if (iA03 != 27) {
                        if (iA03 == 60 || iA03 == 68) {
                            zA0N = A0M(message, i5, i4);
                        } else {
                            if (iA03 != 49) {
                                if (iA03 == 50 && !((AbstractMap) AbstractC9398GHn.A00(message, i6 & 1048575)).isEmpty()) {
                                    throw BV4.A0a("getMetadata");
                                }
                            }
                            i++;
                            i2 = i8;
                        }
                    }
                    List list = (List) AbstractC9398GHn.A00(message, i6 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        GG0 gg0A0C = A0C(i4);
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            if (gg0A0C.AOY(list.get(i10))) {
                            }
                        }
                    }
                    i++;
                    i2 = i8;
                }
                if (zA0N && !A0C(i4).AOY(AbstractC9398GHn.A00(message, i6 & 1048575))) {
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
    @Override // X.GG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQ3(T r10) {
        /*
            r9 = this;
            boolean r0 = A0L(r10)
            if (r0 == 0) goto L8a
            boolean r0 = r10 instanceof X.GF0
            if (r0 == 0) goto L1e
            r3 = r10
            X.GF0 r3 = (X.GF0) r3
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
            int[] r6 = r9.A07
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
            java.lang.Object r1 = X.AbstractC9398GHn.A00(r10, r2)
            X.GDM r1 = (X.GDM) r1
            X.GDE r1 = (X.GDE) r1
            boolean r0 = r1.A00
            if (r0 == 0) goto L3f
            r0 = 0
            r1.A00 = r0
            goto L3f
        L52:
            sun.misc.Unsafe r8 = X.GG1.A0E
            java.lang.Object r7 = r8.getObject(r10, r2)
            if (r7 == 0) goto L3f
            r1 = r7
            X.Hxz r1 = (X.C10601Hxz) r1
            r0 = 0
            r1.isMutable = r0
            r8.putObject(r10, r2, r7)
            goto L3f
        L64:
            boolean r0 = r9.A0K(r4, r10)
            goto L6f
        L69:
            r0 = r6[r4]
            boolean r0 = r9.A0M(r10, r0, r4)
        L6f:
            if (r0 == 0) goto L3f
            X.GG0 r1 = r9.A0C(r4)
            sun.misc.Unsafe r0 = X.GG1.A0E
            java.lang.Object r0 = r0.getObject(r10, r2)
            r1.AQ3(r0)
            goto L3f
        L7f:
            X.GF0 r10 = (X.GF0) r10
            X.GG7 r1 = r10.unknownFields
            boolean r0 = r1.A02
            if (r0 == 0) goto L8a
            r0 = 0
            r1.A02 = r0
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GG1.AQ3(java.lang.Object):void");
    }
}
