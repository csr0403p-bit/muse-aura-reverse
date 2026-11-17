package X;

import java.util.Arrays;

/* renamed from: X.AHf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0903AHf extends C9u5 {
    public static final void A03(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        C7384Etj.A0Y(iArr, 0);
        C7384Etj.A0Y(iArr2, 1);
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static final void A04(Object[] objArr, int i, int i2) {
        C7384Etj.A0Y(objArr, 0);
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>([TT;[TT;III)[TT; */
    public static final void A05(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        C7384Etj.A0Y(objArr, 0);
        C7384Etj.A0Y(objArr2, 1);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final byte[] A06(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        AbstractC0886AGn.A01(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        C7384Etj.A0U(bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public static final <T> T[] A08(T[] tArr, int i, int i2) {
        C7384Etj.A0Y(tArr, 0);
        AbstractC0886AGn.A01(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        C7384Etj.A0U(tArr2);
        return tArr2;
    }

    public static final byte[] A07(byte[] bArr, byte[] bArr2) {
        boolean zA1b = AnonymousClass004.A1b(bArr, bArr2);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, zA1b ? 1 : 0, bArrCopyOf, length, length2);
        C7384Etj.A0X(bArrCopyOf);
        return bArrCopyOf;
    }
}
