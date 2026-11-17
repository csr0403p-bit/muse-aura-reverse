package X;

import com.facebook.aura.components.reactions.AuraMicroLaunchKt;
import com.facebook.aura.iap.MC;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.util.Arrays;
import org.jsoup.helper.ValidationException;

/* renamed from: X.GuY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10318GuY {
    public static final int[] A0J = {8364, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 8218, MC.stella_payments_in_app_purchases.__CONFIG__, 8222, 8230, 8224, 8225, AuraMicroLaunchKt.MICRO_LAUNCH_TOTAL_MS, 8240, 352, 8249, 338, 141, 381, 143, VoiceCallForegroundService.AVATAR_TARGET_PX, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public static final char[] A0K;
    public String A00;
    public GuS A01;
    public int A06;
    public final GtL A07;
    public final C10316GuW A08;
    public final Gu6 A09;
    public final C10314GuU A0D;
    public final C10313GuT A0E;
    public final C10328Gui A0F;
    public EnumC10327Guh A03 = EnumC10327Guh.A0W;
    public AbstractC10326Gug A02 = null;
    public boolean A04 = false;
    public final C10312GuO A0G = new C10312GuO();
    public final C10325Guf A0A = new C10325Guf();
    public final C10323Gud A0C = new C10323Gud();
    public final C10324Gue A0B = new C10324Gue();
    public int A05 = 0;
    public final int[] A0H = new int[1];
    public final int[] A0I = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        A0K = cArr;
        Arrays.sort(cArr);
    }

    private void A00(String str, Object... objArr) {
        Gu6 gu6 = this.A09;
        if (gu6.size() < gu6.maxSize) {
            gu6.add(new Gu3(String.format(FGI.A0M("Invalid character reference: ", str), objArr), this.A07));
        }
    }

    public final void A01() {
        GuS guS = this.A01;
        C10312GuO c10312GuO = guS.A0D;
        if (c10312GuO.A01 != null || c10312GuO.A00 != null) {
            guS.A06();
        }
        A04(this.A01);
    }

    public final void A02(char c) {
        C10325Guf c10325Guf = this.A0A;
        c10325Guf.A00.A02(c);
        c10325Guf.A01 = this.A05;
        ((AbstractC10326Gug) c10325Guf).A00 = this.A07.A07();
    }

    public final void A03(String str) {
        C10325Guf c10325Guf = this.A0A;
        c10325Guf.A00.A03(str);
        c10325Guf.A01 = this.A05;
        ((AbstractC10326Gug) c10325Guf).A00 = this.A07.A07();
    }

    public final void A04(AbstractC10326Gug abstractC10326Gug) {
        if (this.A04) {
            throw new ValidationException("Must be false");
        }
        this.A02 = abstractC10326Gug;
        this.A04 = true;
        abstractC10326Gug.A01 = this.A06;
        GtL gtL = this.A07;
        int iA07 = gtL.A07();
        abstractC10326Gug.A00 = iA07;
        this.A05 = iA07;
        Integer num = abstractC10326Gug.A02;
        if (num == C79.A01) {
            this.A00 = ((GuS) abstractC10326Gug).A07.A00();
            return;
        }
        if (num == C79.A0C) {
            GuS guS = (GuS) abstractC10326Gug;
            if (guS.A06 != null) {
                Object[] objArr = {guS.A04()};
                Gu6 gu6 = this.A09;
                if (gu6.size() < gu6.maxSize) {
                    gu6.add(new Gu3("Attributes incorrectly present on end tag [/%s]", gtL, objArr));
                }
            }
        }
    }

    public final void A05(EnumC10327Guh enumC10327Guh) {
        Gu6 gu6 = this.A09;
        if (gu6.size() < gu6.maxSize) {
            gu6.add(new Gu3("Unexpectedly reached end of file (EOF) in input state [%s]", this.A07, enumC10327Guh));
        }
    }

    public final void A06(EnumC10327Guh enumC10327Guh) {
        Gu6 gu6 = this.A09;
        if (gu6.size() < gu6.maxSize) {
            GtL gtL = this.A07;
            gu6.add(new Gu3("Unexpected character '%s' in input state [%s]", gtL, Character.valueOf(gtL.A06()), enumC10327Guh));
        }
    }

    public final void A07(EnumC10327Guh enumC10327Guh) {
        if (enumC10327Guh == EnumC10327Guh.A18) {
            this.A06 = this.A07.A07();
        }
        this.A03 = enumC10327Guh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012a, code lost:
    
        if (r7.A0L('=', '-', '_') == false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] A08(java.lang.Character r13, boolean r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10318GuY.A08(java.lang.Character, boolean):int[]");
    }

    public C10318GuY(C10316GuW c10316GuW) {
        this.A08 = c10316GuW;
        C10313GuT c10313GuT = new C10313GuT(C79.A01, c10316GuW);
        this.A0E = c10313GuT;
        this.A01 = c10313GuT;
        this.A0D = new C10314GuU(C79.A0C, c10316GuW);
        C10328Gui c10328Gui = new C10328Gui(C79.A0T, c10316GuW);
        c10328Gui.A00 = true;
        this.A0F = c10328Gui;
        this.A07 = c10316GuW.A07;
        this.A09 = c10316GuW.A0C.A01;
    }
}
