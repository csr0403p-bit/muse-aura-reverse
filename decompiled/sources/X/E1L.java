package X;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class E1L implements InterfaceC6304E0a {
    public static final Pattern A06 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public float A00;
    public float A01;
    public Map<String, E1M> A02;
    public final E1N A03;
    public final boolean A04;
    public final E1P A05;

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ void reset() {
    }

    public static long A01(String str) {
        Matcher matcher = A06.matcher(str.trim());
        if (matcher.matches()) {
            return (BV5.A09(matcher, 1) * 3600000000L) + (BV5.A09(matcher, 2) * 60000000) + (BV5.A09(matcher, 3) * 1000000) + (BV5.A09(matcher, 4) * 10000);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0182 A[Catch: RuntimeException -> 0x01f5, TryCatch #0 {RuntimeException -> 0x01f5, blocks: (B:46:0x0131, B:48:0x013c, B:52:0x014b, B:56:0x015a, B:59:0x0166, B:60:0x016a, B:66:0x0182, B:71:0x0194, B:76:0x01a6, B:81:0x01b8, B:86:0x01ca, B:87:0x01ce, B:93:0x01de, B:94:0x01e3, B:62:0x0170), top: B:123:0x0131, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A02(X.E1P r41, java.nio.charset.Charset r42) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1L.A02(X.E1P, java.nio.charset.Charset):void");
    }

    public E1L(List<byte[]> list) throws NumberFormatException {
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A05 = BV6.A0X();
        if (list == null || list.isEmpty()) {
            this.A04 = false;
            this.A03 = null;
            return;
        }
        this.A04 = true;
        byte[] bArr = list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        C1G.A07(str.startsWith("Format:"));
        E1N e1nA00 = E1N.A00(str);
        e1nA00.getClass();
        this.A03 = e1nA00;
        A02(BV6.A0Z(list.get(1)), charset);
    }

    /* JADX WARN: Incorrect types in method signature: (JLjava/util/List<Ljava/lang/Long;>;Ljava/util/List<Ljava/util/List<LX/E0J;>;>;)I */
    public static int A00(List list, List list2, long j) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                size = 0;
                break;
            }
            if (C3cG.A05(list.get(size)) == j) {
                break;
            }
            if (C3cG.A05(list.get(size)) < j) {
                size++;
                break;
            }
        }
        list.add(size, Long.valueOf(j));
        list2.add(size, size == 0 ? C3cG.A0h() : BV4.A0t((Collection) list2.get(size - 1)));
        return size;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:40|168|41|(2:(2:44|47)|48)(6:(1:46)|170|50|193|(1:196)(3:192|54|197)|194)|49|170|50|193|(3:191|52|196)(1:195)|194|38) */
    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01de  */
    @Override // X.InterfaceC6304E0a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AXd(X.InterfaceC5344Dgn r43, X.E03 r44, byte[] r45, int r46, int r47) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E1L.AXd(X.Dgn, X.E03, byte[], int, int):void");
    }

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ E0T AXf(byte[] bArr, int i, int i2) {
        return E0e.A00(this, bArr, i, i2);
    }

    public E1L() {
        this(null);
    }
}
