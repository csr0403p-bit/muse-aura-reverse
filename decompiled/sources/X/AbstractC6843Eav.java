package X;

import com.facebook.aura.maps.model.HatchMapSceneKt;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.Eav, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6843Eav {
    public static final String A00;
    public static final TimeZone A01;
    public static final C06827l3 A02;
    public static final C6844Eaw A03 = C6844Eaw.A00(new String[0]);
    public static final C6853EbB A04;
    public static final Eb4 A05;
    public static final byte[] A06;
    public static final C6832Eak A07;

    static {
        byte[] bArr = new byte[0];
        A06 = bArr;
        C6818EaW c6818EaW = new C6818EaW();
        c6818EaW.A00 = c6818EaW.A00;
        A05 = new Eb8(c6818EaW);
        A04 = new C6853EbB(bArr);
        A07 = C6832Eak.A02.A01(C6788EZx.A01("efbbbf"), C6788EZx.A01("feff"), C6788EZx.A01("fffe"), C6788EZx.A01("0000ffff"), C6788EZx.A01("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C7384Etj.A0X(timeZone);
        A01 = timeZone;
        A02 = C06827l3.A02("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        A00 = C7BY.A0L("Client", C7BY.A0K("okhttp3.", C6859EbH.class.getName()));
    }

    public static final long A03(C6886Ebi c6886Ebi) {
        C7384Etj.A0Y(c6886Ebi, 0);
        String strA03 = c6886Ebi.A05.A03("Content-Length");
        if (strA03 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA03);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String A04(int i, int i2, String str) {
        int i3;
        while (true) {
            i3 = i;
            if (i >= i2) {
                i3 = i2;
                break;
            }
            i++;
            char cCharAt = str.charAt(i3);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                break;
            }
        }
        return str.substring(i3, A02(str, i3, i2));
    }

    public static final String A05(String str, Object... objArr) {
        C7384Etj.A0Y(str, 0);
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final String A06(C6854EbC c6854EbC, boolean z) {
        String strA0N = c6854EbC.A02;
        if (C7BY.A0q(strA0N, ":", false)) {
            strA0N = FGI.A0N("[", strA0N, ']');
        }
        if (!z && c6854EbC.A00 == C6854EbC.A00(c6854EbC.A03)) {
            return strA0N;
        }
        StringBuilder sbA0g = C3cG.A0g(strA0N);
        sbA0g.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
        return BV4.A0l(sbA0g, c6854EbC.A00);
    }

    public static final <T> List<T> A07(T... tArr) {
        C7384Etj.A0Y(tArr, 0);
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(AbstractC0885AGm.A11(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final void A0A(Closeable closeable) throws IOException {
        C7384Etj.A0Y(closeable, 0);
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/Exception;Ljava/util/List<+Ljava/lang/Exception;>;)Ljava/lang/Throwable; */
    public static final void A0B(Exception exc, List list) {
        C7384Etj.A0Y(exc, 0);
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CU7.A01(exc, (Throwable) it.next());
        }
    }

    public static final boolean A0D(String str) {
        C7384Etj.A0Y(str, 0);
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase(CachingHatchHttpClientKt.COOKIE_HEADER) || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator<-Ljava/lang/String;>;)Z */
    public static final boolean A0E(Comparator comparator, String[] strArr, String[] strArr2) {
        int length = strArr.length;
        if (length == 0 || strArr2 == null || strArr2.length == 0) {
            return false;
        }
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            F3E f3e = new F3E(strArr2);
            while (f3e.hasNext()) {
                if (comparator.compare(str, f3e.next()) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r0 != com.facebook.aura.devices.pairing.LinkEncryptedPairingKt.LINK_COUNTER_MAX) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r0 == com.facebook.aura.devices.pairing.LinkEncryptedPairingKt.LINK_COUNTER_MAX) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r5.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        r5.A03(r2 + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0F(java.util.concurrent.TimeUnit r13, X.InterfaceC6834Eam r14, int r15) {
        /*
            r12 = 0
            long r2 = java.lang.System.nanoTime()
            X.Eb1 r0 = r14.Ags()
            boolean r0 = r0.A06()
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L2f
            X.Eb1 r0 = r14.Ags()
            long r0 = r0.A00()
            long r0 = r0 - r2
        L1d:
            X.Eb1 r6 = r14.Ags()
            long r4 = (long) r15
            long r4 = r13.toNanos(r4)
            long r4 = java.lang.Math.min(r0, r4)
            long r4 = r4 + r2
            r6.A03(r4)
            goto L35
        L2f:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L1d
        L35:
            X.EaW r9 = new X.EaW     // Catch: java.lang.Throwable -> L4c java.io.InterruptedIOException -> L5e
            r9.<init>()     // Catch: java.lang.Throwable -> L4c java.io.InterruptedIOException -> L5e
        L3a:
            r4 = 8192(0x2000, double:4.0474E-320)
            long r7 = r14.AZ7(r9, r4)     // Catch: java.lang.Throwable -> L4c java.io.InterruptedIOException -> L5e
            r5 = -1
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r9.A00     // Catch: java.lang.Throwable -> L4c java.io.InterruptedIOException -> L5e
            r9.Afk(r4)     // Catch: java.lang.Throwable -> L4c java.io.InterruptedIOException -> L5e
            goto L3a
        L4c:
            r6 = move-exception
            int r5 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.Eb1 r4 = r14.Ags()
            if (r5 != 0) goto L59
            r4.A01()
            throw r6
        L59:
            long r2 = r2 + r0
            r4.A03(r2)
            throw r6
        L5e:
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.Eb1 r5 = r14.Ags()
            if (r4 != 0) goto L74
            goto L70
        L67:
            r12 = 1
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            X.Eb1 r5 = r14.Ags()
            if (r4 != 0) goto L74
        L70:
            r5.A01()
            return r12
        L74:
            long r2 = r2 + r0
            r5.A03(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6843Eav.A0F(java.util.concurrent.TimeUnit, X.Eam, int):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: ([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator<-Ljava/lang/String;>;)[Ljava/lang/String; */
    public static final String[] A0G(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayListA0h = C3cG.A0h();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String str2 = strArr2[i2];
                    i2++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayListA0h.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayListA0h.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw BV6.A0h();
    }

    public static final int A00(char c) {
        char c2;
        int i;
        if ('0' > c) {
            return -1;
        }
        if (c < ':') {
            return c - '0';
        }
        if ('a' <= c) {
            c2 = 'g';
            i = c - 'W';
        } else {
            if ('A' > c) {
                return -1;
            }
            c2 = 'G';
            i = c - '7';
        }
        if (c >= c2) {
            return -1;
        }
        return i;
    }

    public static final int A01(String str, int i) throws NumberFormatException {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final int A02(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3 = i4;
            }
        }
        return i;
    }

    public static final C6844Eaw A09(List<C6897Ebt> list) {
        C6845Eax c6845Eax = new C6845Eax();
        for (C6897Ebt c6897Ebt : list) {
            c6845Eax.A02(c6897Ebt.A01.A07(), c6897Ebt.A02.A07());
        }
        return c6845Eax.A00();
    }

    public static final <K, V> Map<K, V> A08(Map<K, ? extends V> map) {
        return map.isEmpty() ? AGH.A0E() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final void A0C(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!"bio == null".equals(e2.getMessage())) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }
}
