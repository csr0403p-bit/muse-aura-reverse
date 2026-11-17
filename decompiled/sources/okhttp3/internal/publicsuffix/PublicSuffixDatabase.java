package okhttp3.internal.publicsuffix;

import X.A3c;
import X.A6B;
import X.AbstractC0878AGe;
import X.AbstractC6843Eav;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.BV7;
import X.C0881AGi;
import X.C3b6;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C6816EaU;
import X.C6819EaX;
import X.C6821EaZ;
import X.C6848Eb1;
import X.C7384Etj;
import X.C7BY;
import X.C8iN;
import X.C8j2;
import X.EZT;
import X.F60;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class PublicSuffixDatabase {
    public static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    public byte[] publicSuffixExceptionListBytes;
    public byte[] publicSuffixListBytes;
    public static final byte[] WILDCARD_LABEL = {42};
    public static final List<String> PREVAILING_RULE = Collections.singletonList("*");
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    public final AtomicBoolean listRead = C60O.A1E();
    public final CountDownLatch readCompleteLatch = BV5.A16();

    public static final String A00(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 > -1 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                byte b = bArr2[i8][i9];
                byte[] bArr3 = AbstractC6843Eav.A06;
                int i11 = b & 255;
                while (true) {
                    int i12 = i11 - (bArr[i5 + i10] & 255);
                    if (i12 == 0) {
                        i10++;
                        i9++;
                        if (i10 == i7) {
                            break;
                        }
                        if (bArr2[i8].length == i9) {
                            if (i8 == bArr2.length - 1) {
                                break;
                            }
                            i8++;
                            i9 = -1;
                            i11 = 46;
                        }
                    } else if (i12 < 0) {
                    }
                }
            }
            int i13 = i7 - i10;
            int length2 = bArr2[i8].length - i9;
            int length3 = bArr2.length;
            for (int i14 = i8 + 1; i14 < length3; i14++) {
                length2 += bArr2[i14].length;
            }
            if (length2 >= i13) {
                if (length2 <= i13) {
                    Charset charset = StandardCharsets.UTF_8;
                    C7384Etj.A0V(charset);
                    return BV4.A0n(charset, bArr, i5, i7);
                }
                i3 = i2 + 1;
            } else {
                length = i4;
            }
        }
        return null;
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Logger logger = EZT.A00;
                    EZT.A01("Failed to read public suffix list", 5, e);
                }
            } finally {
                BV7.A1N(z);
            }
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> listA0h = C7BY.A0h(str, new char[1], '.');
        return C7384Etj.areEqual(AbstractC0878AGe.A0H(listA0h), "") ? AbstractC0878AGe.A0d(listA0h, 1) : listA0h;
    }

    public final String getEffectiveTldPlusOne(String str) throws InterruptedException {
        C7384Etj.A0Y(str, 0);
        String unicode = IDN.toUnicode(str);
        C7384Etj.A0U(unicode);
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && C60Q.A0n(listFindMatchingRule, 0).charAt(0) != '!') {
            return null;
        }
        char cCharAt = C60Q.A0n(listFindMatchingRule, 0).charAt(0);
        int size = listSplitDomain.size();
        int size2 = listFindMatchingRule.size();
        if (cCharAt != '!') {
            size2++;
        }
        int i = size - size2;
        C8iN c8iNA06 = AbstractC0878AGe.A06(splitDomain(str));
        C3b6 a3c = c8iNA06;
        if (i < 0) {
            throw BV5.A0S(C8j2.A00(55), C8j2.A00(3), i);
        }
        if (i != 0) {
            a3c = new A3c(c8iNA06, i);
        }
        return A6B.A01(".", a3c);
    }

    private final List<String> findMatchingRule(List<String> list) throws InterruptedException {
        String strA00;
        String strA002;
        String strA003;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                BV4.A1A();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw C3cG.A0Q("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String strA0n = C60Q.A0n(list, i);
            Charset charset = StandardCharsets.UTF_8;
            C7384Etj.A0V(charset);
            bArr[i] = strA0n.getBytes(charset);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strA00 = null;
                break;
            }
            int i3 = i2 + 1;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                C7384Etj.A0b("publicSuffixListBytes");
                throw F60.createAndThrow();
            }
            strA00 = A00(bArr2, bArr, i2);
            if (strA00 != null) {
                break;
            }
            i2 = i3;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                bArr3[i4] = WILDCARD_LABEL;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    C7384Etj.A0b("publicSuffixListBytes");
                    throw F60.createAndThrow();
                }
                strA002 = A00(bArr4, bArr3, i4);
                if (strA002 != null) {
                    break;
                }
                i4 = i5;
            }
            strA002 = null;
        } else {
            strA002 = null;
        }
        if (strA002 != null) {
            int i6 = size - 1;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    C7384Etj.A0b("publicSuffixExceptionListBytes");
                    throw F60.createAndThrow();
                }
                strA003 = A00(bArr5, bArr, i7);
                if (strA003 != null) {
                    break;
                }
                i7 = i8;
            }
            strA003 = null;
        } else {
            strA003 = null;
        }
        if (strA003 != null) {
            return C7BY.A0h(AnonymousClass006.A0y(strA003, "!", C60O.A0w()), new char[1], '.');
        }
        if (strA00 == null && strA002 == null) {
            return PREVAILING_RULE;
        }
        List<String> listA0h = strA00 == null ? null : C7BY.A0h(strA00, new char[1], '.');
        if (listA0h == null) {
            listA0h = C0881AGi.A00;
        }
        List<String> listA0h2 = strA002 != null ? C7BY.A0h(strA002, new char[1], '.') : null;
        if (listA0h2 == null) {
            listA0h2 = C0881AGi.A00;
        }
        return listA0h.size() > listA0h2.size() ? listA0h : listA0h2;
    }

    private final void readTheList() throws EOFException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        C6819EaX c6819EaX = new C6819EaX(new C6816EaU(new C6821EaZ(resourceAsStream, new C6848Eb1())));
        try {
            byte[] bArrAZB = c6819EaX.AZB(c6819EaX.readInt());
            byte[] bArrAZB2 = c6819EaX.AZB(c6819EaX.readInt());
            c6819EaX.close();
            synchronized (this) {
                this.publicSuffixListBytes = bArrAZB;
                this.publicSuffixExceptionListBytes = bArrAZB2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        boolean zA1Y = C60P.A1Y(bArr, bArr2);
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(zA1Y);
        this.readCompleteLatch.countDown();
    }
}
