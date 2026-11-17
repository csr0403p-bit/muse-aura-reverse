package X;

import android.content.Context;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.Dkq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5572Dkq extends C5571Dkp {
    public static final ThreadLocal<XmlPullParser> A03 = new ThreadLocal<>();
    public static final Pattern A04 = Pattern.compile("<MPD\\b[^>]*\\savailabilityEndTime=\"([^\"]+)\"");
    public static volatile XmlPullParserFactory A05;
    public final Context A00;
    public final HeroPlayerSetting A01;
    public final boolean A02;

    /* JADX WARN: Incorrect types in method signature: (Lorg/xmlpull/v1/XmlPullParser;Ljava/util/List<LX/DhT;>;LX/DkX;JJJJZZ)LX/Dl9; */
    @Override // X.C5571Dkp
    public final Dl9 A0P(AbstractC5554DkX abstractC5554DkX, List list, XmlPullParser xmlPullParser, long j, long j2, long j3, long j4, boolean z, boolean z2) throws XmlPullParserException, IOException, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "FBHeadphoneRequirement");
        Dl9 dl9A0P = super.A0P(abstractC5554DkX, list, xmlPullParser, j, j2, j3, j4, z, z2);
        return (this.A01.gen.enable_audio_mas_selection && dl9A0P.A06 == 1) ? new C5581Dkz(dl9A0P, attributeValue) : dl9A0P;
    }

    public C5572Dkq() {
        C5597Dlc c5597Dlc = new C5597Dlc();
        c5597Dlc.A0T = true;
        this(null, new HeroPlayerSetting(c5597Dlc), null, false, false);
    }

    public static long A00(String str, long j) {
        if (str == null) {
            return j;
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length == 2) {
            return Long.parseLong(strArrSplit[1]);
        }
        return -1L;
    }

    public static long A02(String str, XmlPullParser xmlPullParser, long j) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            j = -9223372036854775807L;
            try {
                long j2 = Long.parseLong(attributeValue);
                if (j2 > 0 && j2 <= 9223372036854775L) {
                    return j2;
                }
                try {
                    C3cG.A1G("[AI] ", FGI.A0M("Invalid ", str), "HeroDashManifestParser");
                    return -9223372036854775807L;
                } catch (Exception unused) {
                }
            } catch (NumberFormatException e) {
                BzX.A00("HeroDashManifestParser", FGI.A0M("Failed to parse ", str), e);
                return -9223372036854775807L;
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02aa  */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C5571Dkp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5556DkZ A0R(X.C5556DkZ r57, org.xmlpull.v1.XmlPullParser r58) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5572Dkq.A0R(X.DkZ, org.xmlpull.v1.XmlPullParser):X.DkZ");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5572Dkq(android.content.Context r9, com.facebook.video.heroplayer.setting.HeroPlayerSetting r10, java.lang.String r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            boolean r3 = r10.allowOutOfBoundsAccessForPDash
            boolean r4 = r10.parseManifestIdentifier
            boolean r0 = r10.enableDashManifestPool
            r5 = 1
            if (r0 == 0) goto L24
            if (r13 != 0) goto L24
        Lb:
            int r2 = r10.dashManifestPoolSize
            X.Dlv r0 = r10.gen
            if (r0 == 0) goto L16
            boolean r0 = r0.should_log_manifest_debug_info
            r7 = 1
            if (r0 != 0) goto L17
        L16:
            r7 = 0
        L17:
            r0 = r8
            r1 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.A01 = r10
            r8.A02 = r13
            r8.A00 = r9
            return
        L24:
            r5 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5572Dkq.<init>(android.content.Context, com.facebook.video.heroplayer.setting.HeroPlayerSetting, java.lang.String, boolean, boolean):void");
    }
}
