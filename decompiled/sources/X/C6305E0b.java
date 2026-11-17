package X;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.E0b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6305E0b implements InterfaceC6304E0a {
    public static final Pattern A04 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern A03 = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder A01 = C60O.A0w();
    public final ArrayList<String> A02 = C3cG.A0h();
    public final E1P A00 = BV6.A0X();

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ void reset() {
    }

    public static long A00(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (BV8.A0M(matcher, i + 2) * 60000) + (BV8.A0M(matcher, i + 3) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002f. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.E0J A01(android.text.Spanned r10, java.lang.String r11) {
        /*
            X.E0L r5 = new X.E0L
            r5.<init>()
            r5.A0G = r10
            r0 = 0
            r5.A0D = r0
            if (r11 == 0) goto L4f
            int r10 = r11.hashCode()
            java.lang.String r9 = "{\\an9}"
            java.lang.String r8 = "{\\an8}"
            java.lang.String r7 = "{\\an7}"
            java.lang.String r3 = "{\\an6}"
            java.lang.String r0 = "{\\an4}"
            java.lang.String r6 = "{\\an3}"
            java.lang.String r2 = "{\\an2}"
            java.lang.String r1 = "{\\an1}"
            r4 = 0
            switch(r10) {
                case -685620710: goto L9e;
                case -685620648: goto L96;
                case -685620617: goto L91;
                case -685620555: goto L8c;
                case -685620524: goto L87;
                case -685620462: goto L82;
                default: goto L2c;
            }
        L2c:
            r3 = 1
        L2d:
            r5.A08 = r3
        L2f:
            switch(r10) {
                case -685620710: goto L7a;
                case -685620679: goto L75;
                case -685620648: goto L70;
                case -685620524: goto L66;
                case -685620493: goto L61;
                case -685620462: goto L5c;
                default: goto L32;
            }
        L32:
            r2 = 1
        L33:
            r5.A06 = r2
        L35:
            if (r3 == 0) goto L58
            r1 = 1
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r3 == r1) goto L3f
            r0 = 1064011039(0x3f6b851f, float:0.92)
        L3f:
            r5.A02 = r0
            if (r2 == 0) goto L54
            r1 = 1
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r2 == r1) goto L4b
            r0 = 1064011039(0x3f6b851f, float:0.92)
        L4b:
            r5.A01 = r0
            r5.A07 = r4
        L4f:
            X.E0J r0 = r5.A00()
            return r0
        L54:
            r0 = 1034147594(0x3da3d70a, float:0.08)
            goto L4b
        L58:
            r0 = 1034147594(0x3da3d70a, float:0.08)
            goto L3f
        L5c:
            boolean r0 = r11.equals(r9)
            goto L6a
        L61:
            boolean r0 = r11.equals(r8)
            goto L6a
        L66:
            boolean r0 = r11.equals(r7)
        L6a:
            if (r0 == 0) goto L32
            r5.A06 = r4
            r2 = 0
            goto L35
        L70:
            boolean r0 = r11.equals(r6)
            goto L7e
        L75:
            boolean r0 = r11.equals(r2)
            goto L7e
        L7a:
            boolean r0 = r11.equals(r1)
        L7e:
            r2 = 2
            if (r0 != 0) goto L33
            goto L32
        L82:
            boolean r0 = r11.equals(r9)
            goto L9a
        L87:
            boolean r0 = r11.equals(r7)
            goto La2
        L8c:
            boolean r0 = r11.equals(r3)
            goto L9a
        L91:
            boolean r0 = r11.equals(r0)
            goto La2
        L96:
            boolean r0 = r11.equals(r6)
        L9a:
            r3 = 2
            if (r0 != 0) goto L2d
            goto L2c
        L9e:
            boolean r0 = r11.equals(r1)
        La2:
            if (r0 == 0) goto L2c
            r5.A08 = r4
            r3 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6305E0b.A01(android.text.Spanned, java.lang.String):X.E0J");
    }

    /* JADX WARN: Incorrect types in method signature: ([BIILX/E03;LX/Dgn<LX/E00;>;)V */
    @Override // X.InterfaceC6304E0a
    public final void AXd(InterfaceC5344Dgn interfaceC5344Dgn, E03 e03, byte[] bArr, int i, int i2) throws NumberFormatException {
        String str;
        E1P e1p = this.A00;
        e1p.A0T(bArr, i + i2);
        e1p.A0R(i);
        Charset charsetA0N = e1p.A0N();
        if (charsetA0N == null) {
            charsetA0N = StandardCharsets.UTF_8;
        }
        long j = e03.A00;
        ArrayList arrayListA0h = (j == -9223372036854775807L || !e03.A01) ? null : C3cG.A0h();
        while (true) {
            String strA0L = e1p.A0L(charsetA0N);
            if (strA0L == null) {
                break;
            }
            if (!strA0L.isEmpty()) {
                try {
                    Integer.parseInt(strA0L);
                    String strA0L2 = e1p.A0L(charsetA0N);
                    if (strA0L2 == null) {
                        CNC.A04("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = A04.matcher(strA0L2);
                    if (matcher.matches()) {
                        long jA00 = A00(matcher, 1);
                        long jA002 = A00(matcher, 6);
                        StringBuilder sb = this.A01;
                        int i3 = 0;
                        sb.setLength(0);
                        ArrayList<String> arrayList = this.A02;
                        arrayList.clear();
                        while (true) {
                            String strA0L3 = e1p.A0L(charsetA0N);
                            if (TextUtils.isEmpty(strA0L3)) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strA0L3.trim();
                            StringBuilder sbA0x = C60O.A0x(strTrim);
                            Matcher matcher2 = A03.matcher(strTrim);
                            int i4 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i4;
                                int length = strGroup.length();
                                sbA0x.replace(iStart, iStart + length, "");
                                i4 += length;
                            }
                            BV4.A1O(sb, sbA0x);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                str = null;
                                break;
                            }
                            str = arrayList.get(i3);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (j == -9223372036854775807L || jA002 >= j) {
                            interfaceC5344Dgn.accept(new E00(ImmutableList.of(A01(spannedFromHtml, str)), jA00, jA002 - jA00));
                        } else if (arrayListA0h != null) {
                            arrayListA0h.add(new E00(ImmutableList.of(A01(spannedFromHtml, str)), jA00, jA002 - jA00));
                        }
                    } else {
                        BV6.A1I("Skipping invalid timing: ", strA0L2, "SubripParser");
                    }
                } catch (NumberFormatException unused) {
                    BV6.A1I("Skipping invalid index: ", strA0L, "SubripParser");
                }
            }
        }
        if (arrayListA0h != null) {
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                interfaceC5344Dgn.accept(it.next());
            }
        }
    }

    @Override // X.InterfaceC6304E0a
    public final /* synthetic */ E0T AXf(byte[] bArr, int i, int i2) {
        return E0e.A00(this, bArr, i, i2);
    }
}
