package X;

import java.nio.BufferOverflowException;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class C2Y {
    public static Set<String> A05;
    public static final Charset A06 = StandardCharsets.US_ASCII;
    public static final byte[] A07;
    public final C3193C2r A01;
    public final Object A02 = C3cG.A0T();
    public int A00 = 0;
    public final Map<String, Integer> A04 = BV4.A0u();
    public final Map<String, Integer> A03 = BV4.A0u();

    public C2Y(C3193C2r c3193C2r) {
        this.A01 = c3193C2r;
    }

    private void A00(Htf htf, String str, MappedByteBuffer mappedByteBuffer, int i, int i2) {
        if (str.length() > i2) {
            str = str.substring(0, i2);
        }
        String strA00 = C3192C2q.A00(str, false);
        Charset charset = A06;
        byte[] bytes = strA00.getBytes(charset);
        int length = str.length();
        mappedByteBuffer.position(i);
        mappedByteBuffer.put(C3192C2q.A00(htf.mShortKey, true).getBytes(charset));
        mappedByteBuffer.put((byte) 61);
        mappedByteBuffer.put(bytes);
        mappedByteBuffer.put((byte) 10);
        mappedByteBuffer.put((byte) 35);
        int i3 = htf.mMaxLength - length;
        if (i3 > 0) {
            mappedByteBuffer.put(A07, 0, i3);
        }
        mappedByteBuffer.put((byte) 10);
    }

    static {
        byte[] bArr = new byte[8192];
        A07 = bArr;
        Arrays.fill(bArr, (byte) 35);
    }

    public final boolean A02(String str) {
        boolean zContains;
        synchronized (this.A02) {
            if (A05 == null) {
                A05 = new HashSet();
                for (Htf htf : Htf.values()) {
                    A05.add(htf.name());
                }
            }
            zContains = A05.contains(str);
        }
        return zContains;
    }

    public final void A01(String str, String str2) {
        MappedByteBuffer mappedByteBuffer;
        int i;
        Map<String, Integer> map;
        String str3;
        String str4;
        Object[] objArr;
        Htf htfValueOf = Htf.valueOf(str);
        synchronized (this.A02) {
            try {
                mappedByteBuffer = this.A01.A00;
                i = htfValueOf.mMaxLength;
                map = this.A04;
            } catch (BufferOverflowException e) {
                C2Q.A00().AT9("MappedMapPut", e, null);
                CFK.A0D(C9Y.TAG, "Cannot save mmapped value: %s", e, htfValueOf);
            }
            if (map.get(htfValueOf.mShortKey) == null) {
                int length = str2.length();
                String str5 = htfValueOf.mShortKey;
                int length2 = str5.length() + length + 4;
                int i2 = this.A00;
                if (length2 > 8192 - i2) {
                    str3 = C9Y.TAG;
                    str4 = "Cannot save mmapped value: %s";
                    objArr = new Object[]{htfValueOf};
                    CFK.A0H(str3, str4, objArr);
                } else {
                    BV4.A1H(str5, map, i2);
                    BV4.A1H(htfValueOf.mShortKey, this.A03, i);
                    A00(htfValueOf, str2, mappedByteBuffer, this.A00, i);
                    this.A00 = mappedByteBuffer.position();
                    mappedByteBuffer.put((byte) 35);
                }
            } else {
                Integer num = map.get(htfValueOf.mShortKey);
                C1H.A00(num);
                int iIntValue = num.intValue();
                Integer num2 = this.A03.get(htfValueOf.mShortKey);
                C1H.A00(num2);
                int iIntValue2 = num2.intValue();
                if (htfValueOf.mShortKey.length() + Math.min(str2.length(), iIntValue2) + 4 > 8192 - iIntValue) {
                    str3 = C9Y.TAG;
                    str4 = "Cannot save mmapped value: %s";
                    objArr = new Object[]{htfValueOf};
                    CFK.A0H(str3, str4, objArr);
                } else {
                    A00(htfValueOf, str2, mappedByteBuffer, iIntValue, iIntValue2);
                }
            }
        }
    }
}
