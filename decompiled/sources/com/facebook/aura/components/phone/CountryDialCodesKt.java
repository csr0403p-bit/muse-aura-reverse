package com.facebook.aura.components.phone;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.C60O;
import X.C7384Etj;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.agentpermission.MC;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptionsKt;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.components.reactions.AuraHeartEyesKt;
import com.facebook.aura.dancingavatars.gating.MC;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.file.utils.HtmlPdfRenderer;
import com.facebook.aura.gateway.HatchGatewayNetworkLogRecorder;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MC;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.utils.MC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class CountryDialCodesKt {
    public static final List<CountryDialCode> COUNTRY_DIAL_CODES;
    public static final CountryDialCode DEFAULT_COUNTRY_DIAL_CODE = AbstractC7607F5u.A0t("US", 1);

    public static final String countryFlagEmoji(String str) {
        C7384Etj.A0Y(str, 0);
        String upperCase = str.toUpperCase(Locale.ROOT);
        ArrayList arrayListA11 = C60O.A11(upperCase.length());
        for (int i = 0; i < upperCase.length(); i++) {
            char[] chars = Character.toChars(upperCase.charAt(i) + '\uf1a5');
            C7384Etj.A0U(chars);
            arrayListA11.add(new String(chars));
        }
        return AbstractC0878AGe.A0L("", "", "", arrayListA11, null);
    }

    static {
        CountryDialCode[] countryDialCodeArr = new CountryDialCode[229];
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t(HatchCcvCountryOptionsKt.COUNTRY_CA, 1), AbstractC7607F5u.A0t("US", 1), AbstractC7607F5u.A0t("KZ", 7), AbstractC7607F5u.A0t("RU", 7), AbstractC7607F5u.A0t("EG", 20), AbstractC7607F5u.A0t("ZA", 27), AbstractC7607F5u.A0t("GR", 30), AbstractC7607F5u.A0t("NL", 31), AbstractC7607F5u.A0t("BE", 32), AbstractC7607F5u.A0t("FR", 33), AbstractC7607F5u.A0t("ES", 34), AbstractC7607F5u.A0t("HU", 36), AbstractC7607F5u.A0t("IT", 39), AbstractC7607F5u.A0t("RO", 40), AbstractC7607F5u.A0t("CH", 41), AbstractC7607F5u.A0t("AT", 43), AbstractC7607F5u.A0t("GB", 44), AbstractC7607F5u.A0t("DK", 45), AbstractC7607F5u.A0t("SE", 46), AbstractC7607F5u.A0t("NO", 47), AbstractC7607F5u.A0t("PL", 48), AbstractC7607F5u.A0t("DE", 49), AbstractC7607F5u.A0t("PE", 51), AbstractC7607F5u.A0t("MX", 52), AbstractC7607F5u.A0t("CU", 53), AbstractC7607F5u.A0t("AR", 54), AbstractC7607F5u.A0t("BR", 55)}, 0, countryDialCodeArr, 0, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("CL", 56), AbstractC7607F5u.A0t("CO", 57), AbstractC7607F5u.A0t("VE", 58), AbstractC7607F5u.A0t("MY", 60), AbstractC7607F5u.A0t("AU", 61), AbstractC7607F5u.A0t("ID", 62), AbstractC7607F5u.A0t("PH", 63), AbstractC7607F5u.A0t("NZ", 64), AbstractC7607F5u.A0t("SG", 65), AbstractC7607F5u.A0t("TH", 66), AbstractC7607F5u.A0t("JP", 81), AbstractC7607F5u.A0t("KR", 82), AbstractC7607F5u.A0t("VN", 84), AbstractC7607F5u.A0t("CN", 86), AbstractC7607F5u.A0t("TR", 90), AbstractC7607F5u.A0t("IN", 91), AbstractC7607F5u.A0t("PK", 92), AbstractC7607F5u.A0t("AF", 93), AbstractC7607F5u.A0t("LK", 94), AbstractC7607F5u.A0t("MM", 95), AbstractC7607F5u.A0t("IR", 98), AbstractC7607F5u.A0t("SS", 211), AbstractC7607F5u.A0t("MA", 212), AbstractC7607F5u.A0t("DZ", 213), AbstractC7607F5u.A0t("TN", HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE), AbstractC7607F5u.A0t("LY", 218), AbstractC7607F5u.A0t("GM", 220)}, 0, countryDialCodeArr, 27, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("SN", 221), AbstractC7607F5u.A0t("MR", 222), AbstractC7607F5u.A0t("ML", 223), AbstractC7607F5u.A0t("GN", 224), AbstractC7607F5u.A0t("CI", 225), AbstractC7607F5u.A0t("BF", 226), AbstractC7607F5u.A0t("NE", 227), AbstractC7607F5u.A0t("TG", 228), AbstractC7607F5u.A0t("BJ", 229), AbstractC7607F5u.A0t("MU", 230), AbstractC7607F5u.A0t("LR", 231), AbstractC7607F5u.A0t("SL", 232), AbstractC7607F5u.A0t("GH", 233), AbstractC7607F5u.A0t("NG", 234), AbstractC7607F5u.A0t("TD", 235), AbstractC7607F5u.A0t("CF", 236), AbstractC7607F5u.A0t("CM", 237), AbstractC7607F5u.A0t("CV", 238), AbstractC7607F5u.A0t("ST", 239), AbstractC7607F5u.A0t("GQ", 240), AbstractC7607F5u.A0t("GA", 241), AbstractC7607F5u.A0t("CG", 242), AbstractC7607F5u.A0t("CD", 243), AbstractC7607F5u.A0t("AO", 244), AbstractC7607F5u.A0t("GW", 245), AbstractC7607F5u.A0t("SC", 248), AbstractC7607F5u.A0t("SD", 249)}, 0, countryDialCodeArr, 54, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("RW", 250), AbstractC7607F5u.A0t("ET", 251), AbstractC7607F5u.A0t("SO", 252), AbstractC7607F5u.A0t("DJ", 253), AbstractC7607F5u.A0t("KE", HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH), AbstractC7607F5u.A0t("TZ", 255), AbstractC7607F5u.A0t("UG", 256), AbstractC7607F5u.A0t("BI", 257), AbstractC7607F5u.A0t("MZ", 258), AbstractC7607F5u.A0t("ZM", 260), AbstractC7607F5u.A0t("MG", MC.mwa_accounts_center_settings.__CONFIG__), AbstractC7607F5u.A0t("RE", 262), AbstractC7607F5u.A0t("YT", 262), AbstractC7607F5u.A0t("ZW", 263), AbstractC7607F5u.A0t("NA", 264), AbstractC7607F5u.A0t("MW", 265), AbstractC7607F5u.A0t("LS", 266), AbstractC7607F5u.A0t("BW", VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH), AbstractC7607F5u.A0t("SZ", 268), AbstractC7607F5u.A0t("KM", 269), AbstractC7607F5u.A0t("SH", 290), AbstractC7607F5u.A0t("ER", 291), AbstractC7607F5u.A0t("AW", 297), AbstractC7607F5u.A0t("FO", 298), AbstractC7607F5u.A0t("GL", 299), AbstractC7607F5u.A0t("GI", 350), AbstractC7607F5u.A0t("PT", 351)}, 0, countryDialCodeArr, 81, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("LU", 352), AbstractC7607F5u.A0t("IE", 353), AbstractC7607F5u.A0t("IS", 354), AbstractC7607F5u.A0t("AL", 355), AbstractC7607F5u.A0t("MT", 356), AbstractC7607F5u.A0t("CY", 357), AbstractC7607F5u.A0t("FI", 358), AbstractC7607F5u.A0t("BG", 359), AbstractC7607F5u.A0t("LT", 370), AbstractC7607F5u.A0t("LV", 371), AbstractC7607F5u.A0t("EE", 372), AbstractC7607F5u.A0t("MD", 373), AbstractC7607F5u.A0t("AM", 374), AbstractC7607F5u.A0t("BY", 375), AbstractC7607F5u.A0t("AD", 376), AbstractC7607F5u.A0t("MC", MC.xe_feta_entrypoint_rl.__CONFIG__), AbstractC7607F5u.A0t("SM", 378), AbstractC7607F5u.A0t("UA", StaggeredEntranceKt.StaggeredEntranceDurationMs), AbstractC7607F5u.A0t("RS", 381), AbstractC7607F5u.A0t("ME", 382), AbstractC7607F5u.A0t("XK", 383), AbstractC7607F5u.A0t("HR", 385), AbstractC7607F5u.A0t("SI", 386), AbstractC7607F5u.A0t("BA", 387), AbstractC7607F5u.A0t("MK", 389), AbstractC7607F5u.A0t("CZ", 420), AbstractC7607F5u.A0t("SK", 421)}, 0, countryDialCodeArr, MinidumpReader.MODULE_FULL_SIZE, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("LI", 423), AbstractC7607F5u.A0t("FK", 500), AbstractC7607F5u.A0t("BZ", 501), AbstractC7607F5u.A0t("GT", 502), AbstractC7607F5u.A0t("SV", BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE), AbstractC7607F5u.A0t("HN", 504), AbstractC7607F5u.A0t("NI", 505), AbstractC7607F5u.A0t("CR", 506), AbstractC7607F5u.A0t("PA", 507), AbstractC7607F5u.A0t("PM", 508), AbstractC7607F5u.A0t("HT", 509), AbstractC7607F5u.A0t("GP", 590), AbstractC7607F5u.A0t("BO", MC.muse_checkout_promos.__CONFIG__), AbstractC7607F5u.A0t("GY", MC.xe_growth_hatch_abra_config.__CONFIG__), AbstractC7607F5u.A0t("EC", 593), AbstractC7607F5u.A0t("GF", 594), AbstractC7607F5u.A0t("PY", HtmlPdfRenderer.PAGE_WIDTH), AbstractC7607F5u.A0t("MQ", 596), AbstractC7607F5u.A0t("SR", 597), AbstractC7607F5u.A0t("UY", 598), AbstractC7607F5u.A0t("CW", MC.hatch_android_dancing_avatars.__CONFIG__), AbstractC7607F5u.A0t("TL", 670), AbstractC7607F5u.A0t("BN", 673), AbstractC7607F5u.A0t("NR", 674), AbstractC7607F5u.A0t("PG", 675), AbstractC7607F5u.A0t("TO", 676), AbstractC7607F5u.A0t("SB", 677)}, 0, countryDialCodeArr, 135, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("VU", 678), AbstractC7607F5u.A0t("FJ", 679), AbstractC7607F5u.A0t("PW", AuraHeartEyesKt.HEART_EYES_TOTAL_MS), AbstractC7607F5u.A0t("WF", 681), AbstractC7607F5u.A0t("CK", 682), AbstractC7607F5u.A0t("NU", 683), AbstractC7607F5u.A0t(HatchGatewayNetworkLogRecorder.METHOD_WS, 685), AbstractC7607F5u.A0t("KI", 686), AbstractC7607F5u.A0t("NC", 687), AbstractC7607F5u.A0t("TV", 688), AbstractC7607F5u.A0t("PF", 689), AbstractC7607F5u.A0t("TK", 690), AbstractC7607F5u.A0t("FM", 691), AbstractC7607F5u.A0t("MH", 692), AbstractC7607F5u.A0t("KP", 850), AbstractC7607F5u.A0t("HK", 852), AbstractC7607F5u.A0t("MO", 853), AbstractC7607F5u.A0t("KH", 855), AbstractC7607F5u.A0t("LA", 856), AbstractC7607F5u.A0t("BD", 880), AbstractC7607F5u.A0t("TW", 886), AbstractC7607F5u.A0t("MV", 960), AbstractC7607F5u.A0t("LB", 961), AbstractC7607F5u.A0t("JO", 962), AbstractC7607F5u.A0t("SY", 963), AbstractC7607F5u.A0t("IQ", 964), AbstractC7607F5u.A0t("KW", 965)}, 0, countryDialCodeArr, 162, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("SA", 966), AbstractC7607F5u.A0t("YE", 967), AbstractC7607F5u.A0t("OM", 968), AbstractC7607F5u.A0t("PS", 970), AbstractC7607F5u.A0t("AE", 971), AbstractC7607F5u.A0t("IL", 972), AbstractC7607F5u.A0t("BH", 973), AbstractC7607F5u.A0t("QA", 974), AbstractC7607F5u.A0t("BT", 975), AbstractC7607F5u.A0t("MN", 976), AbstractC7607F5u.A0t("NP", 977), AbstractC7607F5u.A0t("TJ", 992), AbstractC7607F5u.A0t("TM", 993), AbstractC7607F5u.A0t("AZ", 994), AbstractC7607F5u.A0t("GE", 995), AbstractC7607F5u.A0t("KG", 996), AbstractC7607F5u.A0t("UZ", 998), AbstractC7607F5u.A0t("BS", 1242), AbstractC7607F5u.A0t("BB", 1246), AbstractC7607F5u.A0t("AI", 1264), AbstractC7607F5u.A0t("AG", 1268), AbstractC7607F5u.A0t("VG", 1284), AbstractC7607F5u.A0t("VI", 1340), AbstractC7607F5u.A0t("KY", 1345), AbstractC7607F5u.A0t("BM", 1441), AbstractC7607F5u.A0t("GD", 1473), AbstractC7607F5u.A0t("TC", 1649)}, 0, countryDialCodeArr, 189, 27);
        System.arraycopy(new CountryDialCode[]{AbstractC7607F5u.A0t("MS", 1664), AbstractC7607F5u.A0t("MP", 1670), AbstractC7607F5u.A0t("GU", 1671), AbstractC7607F5u.A0t("AS", 1684), AbstractC7607F5u.A0t("SX", 1721), AbstractC7607F5u.A0t("LC", 1758), AbstractC7607F5u.A0t("DM", 1767), AbstractC7607F5u.A0t("VC", 1784), AbstractC7607F5u.A0t("PR", 1787), AbstractC7607F5u.A0t("DO", 1809), AbstractC7607F5u.A0t("TT", 1868), AbstractC7607F5u.A0t("KN", 1869), AbstractC7607F5u.A0t("JM", 1876)}, 0, countryDialCodeArr, HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 13);
        COUNTRY_DIAL_CODES = Arrays.asList(countryDialCodeArr);
    }

    public static final List<CountryDialCode> getCOUNTRY_DIAL_CODES() {
        return COUNTRY_DIAL_CODES;
    }

    public static final CountryDialCode getDEFAULT_COUNTRY_DIAL_CODE() {
        return DEFAULT_COUNTRY_DIAL_CODE;
    }
}
