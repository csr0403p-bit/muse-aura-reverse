package com.facebook.aura.utils;

import X.A6B;
import X.ADq;
import X.ATD;
import X.AbstractC7559F3s;
import X.C06827l3;
import X.C06847l8;
import X.C1Lu;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.EnumC06837l4;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatchLinkPreviewKt {
    public static final C06827l3 HOST_WITH_TLD;
    public static final C06827l3 HTTP_URL;
    public static final String URL_TRAILING_PUNCTUATION = ".,;:!?)]}\"'";

    /* renamed from: com.facebook.aura.utils.HatchLinkPreviewKt$findPreviewableUrlRanges$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C1Lu, ADq> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final ADq invoke(C1Lu c1Lu) {
            CharSequence charSequenceSubSequence;
            C7384Etj.A0Y(c1Lu, 0);
            String strA00 = C06847l8.A00((C06847l8) c1Lu);
            int length = strA00.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (!C7BY.A0k(HatchLinkPreviewKt.URL_TRAILING_PUNCTUATION, strA00.charAt(length))) {
                        charSequenceSubSequence = strA00.subSequence(0, length + 1);
                        break;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
                charSequenceSubSequence = "";
            } else {
                charSequenceSubSequence = "";
            }
            String string = charSequenceSubSequence.toString();
            C06827l3 c06827l3 = HatchLinkPreviewKt.HOST_WITH_TLD;
            String strA0h = C60Q.A0h(string);
            if (c06827l3.A07(strA0h != null ? strA0h : "")) {
                return ATD.A0C(c1Lu.AJM().A00, c1Lu.AJM().A00 + string.length());
            }
            return null;
        }
    }

    public static final List<ADq> findPreviewableUrlRanges(String str) {
        C7384Etj.A0Y(str, 0);
        return A6B.A02(A6B.A04(AnonymousClass1.INSTANCE, C06827l3.A00(str, HTTP_URL)));
    }

    public static final boolean isFirstPartyUrl(Uri uri) {
        C7384Etj.A0Y(uri, 0);
        return C7Je.A05(uri, "instagram.com", true) || C7Je.A05(uri, "ig.com", true) || C7Je.A05(uri, AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX, true) || C7Je.A05(uri, "fb.com", true) || C7Je.A05(uri, "threads.net", true) || C7Je.A05(uri, "wa.me", false) || C7Je.A05(uri, "whatsapp.com", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String rememberLinkPreviewUrl(java.lang.String r4, X.BFM r5, int r6) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            r0 = 1104156025(0x41d01579, float:26.010485)
            r5.AgE(r0)
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L17
            boolean r0 = r5.A65(r4)
            if (r0 != 0) goto L1c
        L17:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L1d
        L1c:
            r0 = 1
        L1d:
            java.lang.Object r3 = r5.AaT()
            if (r0 != 0) goto L27
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto L2e
        L27:
            java.lang.String r3 = firstPreviewableUrl(r4)
            r5.Ai0(r3)
        L2e:
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            if (r3 != 0) goto L37
            X.AnonymousClass001.A1D(r5)
            return r2
        L37:
            boolean r0 = r5.A65(r3)
            java.lang.Object r1 = r5.AaT()
            if (r0 != 0) goto L45
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L54
        L45:
            android.net.Uri r0 = android.net.Uri.parse(r3)
            X.C7384Etj.A0U(r0)
            boolean r0 = isFirstPartyUrl(r0)
            java.lang.Boolean r1 = X.AnonymousClass001.A0j(r5, r0)
        L54:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            com.facebook.aura.utils.HatchUtil r1 = com.facebook.aura.utils.HatchUtil.INSTANCE
            if (r0 == 0) goto L62
            boolean r0 = r1.isFirstPartyLinkPreviewEnabled()
            if (r0 != 0) goto L69
        L62:
            boolean r0 = r1.isThirdPartyLinkPreviewEnabled()
            if (r0 != 0) goto L69
            r3 = r2
        L69:
            X.AnonymousClass001.A1D(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.HatchLinkPreviewKt.rememberLinkPreviewUrl(java.lang.String, X.BFM, int):java.lang.String");
    }

    static {
        EnumC06837l4 enumC06837l4 = EnumC06837l4.A03;
        HTTP_URL = new C06827l3("https?://\\S+", enumC06837l4);
        HOST_WITH_TLD = new C06827l3("\\.[a-z]{2,}$", enumC06837l4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String firstPreviewableUrl(java.lang.String r8) {
        /*
            X.7l3 r0 = com.facebook.aura.utils.HatchLinkPreviewKt.HTTP_URL
            r7 = 0
            r6 = 0
            X.7l8 r0 = X.C06827l3.A01(r8, r0)
            if (r0 == 0) goto L48
            java.lang.String r5 = X.C06847l8.A00(r0)
            int r0 = r5.length()
            int r4 = r0 + (-1)
            java.lang.String r3 = ""
            if (r4 < 0) goto L46
        L18:
            int r2 = r4 + (-1)
            char r1 = r5.charAt(r4)
            java.lang.String r0 = ".,;:!?)]}\"'"
            boolean r0 = X.C7BY.A0k(r0, r1)
            if (r0 != 0) goto L42
            int r0 = r4 + 1
            java.lang.CharSequence r0 = r5.subSequence(r7, r0)
        L2c:
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L48
            X.7l3 r1 = com.facebook.aura.utils.HatchLinkPreviewKt.HOST_WITH_TLD
            java.lang.String r0 = X.C60Q.A0h(r2)
            if (r0 == 0) goto L3b
            r3 = r0
        L3b:
            boolean r0 = r1.A07(r3)
            if (r0 == 0) goto L48
            return r2
        L42:
            if (r2 < 0) goto L46
            r4 = r2
            goto L18
        L46:
            r0 = r3
            goto L2c
        L48:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.HatchLinkPreviewKt.firstPreviewableUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<java.lang.String> rememberLinkPreviewUrls(java.lang.String r6, int r7, X.BFM r8, int r9) {
        /*
            int r0 = X.AnonymousClass006.A0E(r6, r9)
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Lf
            boolean r0 = r8.A65(r6)
            if (r0 != 0) goto L14
        Lf:
            r0 = r9 & 6
            r1 = 0
            if (r0 != r2) goto L15
        L14:
            r1 = 1
        L15:
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L1f
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L56
        L1f:
            java.util.List r0 = findPreviewableUrlRanges(r6)
            java.util.ArrayList r5 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r4 = r0.iterator()
        L2b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r3 = r4.next()
            X.AJv r3 = (X.C0968AJv) r3
            com.facebook.aura.common.url.HatchPeerInviteLinks r2 = com.facebook.aura.common.url.HatchPeerInviteLinks.INSTANCE
            r0 = 1
            X.C7384Etj.A0Y(r3, r0)
            int r1 = r3.A00
            int r0 = r3.A01
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r1, r0)
            java.lang.String r0 = r2.withoutFragment(r0)
            r5.add(r0)
            goto L2b
        L4f:
            java.util.List r0 = X.C3cG.A0m(r5)
            r8.Ai0(r0)
        L56:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        L60:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = android.net.Uri.parse(r0)
            X.C7384Etj.A0U(r0)
            boolean r0 = isFirstPartyUrl(r0)
            if (r0 == 0) goto L82
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isFirstPartyLinkPreviewEnabled()
            if (r0 != 0) goto L8a
        L82:
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isThirdPartyLinkPreviewEnabled()
            if (r0 == 0) goto L60
        L8a:
            r3.add(r1)
            goto L60
        L8e:
            java.util.List r0 = X.AbstractC0878AGe.A0a(r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.HatchLinkPreviewKt.rememberLinkPreviewUrls(java.lang.String, int, X.BFM, int):java.util.List");
    }
}
