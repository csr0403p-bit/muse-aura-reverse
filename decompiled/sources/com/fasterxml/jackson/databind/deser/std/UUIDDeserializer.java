package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC7608F5v;
import X.AbstractC9904Gkk;
import X.F60;
import X.FGI;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes6.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    public static final int[] A00;
    public static final long serialVersionUID = 1;

    public static UUID A02(AbstractC9904Gkk abstractC9904Gkk, UUIDDeserializer uUIDDeserializer, byte[] bArr) throws InvalidFormatException {
        int length = bArr.length;
        if (length == 16) {
            return new UUID(A01(bArr, 0), A01(bArr, 8));
        }
        throw new InvalidFormatException(abstractC9904Gkk.A00, uUIDDeserializer.A0h(), bArr, FGI.A0I("Can only construct UUIDs from byte[16]; got ", length, " bytes"));
    }

    static {
        int[] iArr;
        int[] iArr2 = new int[128];
        A00 = iArr2;
        Arrays.fill(iArr2, -1);
        int i = 0;
        int i2 = 0;
        do {
            iArr = A00;
            iArr[i2 + 48] = i2;
            i2++;
        } while (i2 < 10);
        do {
            int i3 = i + 10;
            iArr[i + 97] = i3;
            iArr[i + 65] = i3;
            i++;
        } while (i < 6);
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    public static long A01(byte[] bArr, int i) {
        int i2 = i + 4;
        return ((((bArr[i2 + 3] & 255) | AbstractC7608F5v.A0C(bArr, i2 + 2, (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16))) << 32) >>> 32) | (((bArr[i + 3] & 255) | AbstractC7608F5v.A0C(bArr, i + 2, (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16))) << 32);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final /* bridge */ /* synthetic */ UUID A1L(AbstractC9904Gkk abstractC9904Gkk, Object obj) {
        if (obj instanceof byte[]) {
            return A02(abstractC9904Gkk, this, (byte[]) obj);
        }
        super.A1L(abstractC9904Gkk, obj);
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.AbstractC9904Gkk r5, com.fasterxml.jackson.databind.deser.std.UUIDDeserializer r6, java.lang.String r7, int r8) throws com.fasterxml.jackson.databind.exc.InvalidFormatException {
        /*
            char r4 = r7.charAt(r8)
            int r0 = r8 + 1
            char r3 = r7.charAt(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r4 >= r0) goto L1c
            if (r3 >= r0) goto L20
            int[] r2 = com.fasterxml.jackson.databind.deser.std.UUIDDeserializer.A00
            r0 = r2[r4]
            int r1 = r0 << 4
            r0 = r2[r3]
            r0 = r0 | r1
            if (r0 < 0) goto L20
            return r0
        L1c:
            r6.A03(r5, r7, r4)
            goto L29
        L20:
            int[] r0 = com.fasterxml.jackson.databind.deser.std.UUIDDeserializer.A00
            r0 = r0[r4]
            if (r0 < 0) goto L1c
            r6.A03(r5, r7, r3)
        L29:
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.UUIDDeserializer.A00(X.Gkk, com.fasterxml.jackson.databind.deser.std.UUIDDeserializer, java.lang.String, int):int");
    }

    private final void A03(AbstractC9904Gkk abstractC9904Gkk, String str, char c) throws InvalidFormatException {
        char c2 = c;
        if (Character.isISOControl(c)) {
            c2 = '?';
        }
        throw abstractC9904Gkk.A0Q(A0h(), str, String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c2), Integer.toHexString(c)));
    }
}
