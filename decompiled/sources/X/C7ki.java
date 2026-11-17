package X;

import java.util.regex.Pattern;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7ki, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7ki {
    public static final /* synthetic */ Ey9 A00;
    public static final /* synthetic */ C7ki[] A01;
    public static final C7ki A02;
    public static final C7ki A03;
    public static final C7ki A04;
    public static final C7ki A05;
    public static final C7ki A06;
    public static final C7ki A07;
    public static final C7ki A08;
    public final String association;
    public final int cardLength;
    public final String humanReadableName;
    public final Pattern prefixMatchRegexPattern;
    public final String typeName;

    static {
        Pattern patternCompile = Pattern.compile("");
        C7384Etj.A0U(patternCompile);
        A07 = new C7ki("UNKNOWN", "UNKNOWN", "Unknown card type", "unknown", patternCompile, 0, 16);
        Pattern patternCompile2 = Pattern.compile("^3[47]");
        C7384Etj.A0U(patternCompile2);
        A02 = new C7ki("AMEX", "AMERICAN_EXPRESS", "American Express", "american_express", patternCompile2, 1, 15);
        Pattern patternCompile3 = Pattern.compile("^(6011|6520|6521[0-4]|6531[5-9]|653[2-9]|64[4-9]|622([2-8]|1[3-9]|12[6-9]|9[0-1]|92[0-5]))");
        C7384Etj.A0U(patternCompile3);
        A03 = new C7ki("DISCOVER", "DISCOVER", "Discover", "discover", patternCompile3, 2, 16);
        Pattern patternCompile4 = Pattern.compile("^35(2[8-9]|[3-8])");
        C7384Etj.A0U(patternCompile4);
        A04 = new C7ki("JCB", "JCB", "JCB", "jcb", patternCompile4, 3, 16);
        Pattern patternCompile5 = Pattern.compile("((^5[1-5])|(^2(?:2(?:2[1-9]|[3-9])|[3-6]|7(?:[01]|20))))");
        C7384Etj.A0U(patternCompile5);
        A05 = new C7ki("MASTER_CARD", "MASTERCARD", "MasterCard", "master_card", patternCompile5, 4, 16);
        Pattern patternCompile6 = Pattern.compile("^(508[5-9]|6521[5-9]|652[2-9]|6530|6531[0-4]|60[6-8])");
        C7384Etj.A0U(patternCompile6);
        A06 = new C7ki("RUPAY", "RUPAY", "Rupay", "rupay", patternCompile6, 5, 16);
        Pattern patternCompile7 = Pattern.compile("^4");
        C7384Etj.A0U(patternCompile7);
        C7ki c7ki = new C7ki("VISA", "VISA", "Visa", "visa", patternCompile7, 6, 16);
        A08 = c7ki;
        C7ki[] c7kiArr = {A07, A02, A03, A04, A05, A06, c7ki};
        A01 = c7kiArr;
        A00 = C3cG.A0w(c7kiArr);
    }

    public static C7ki valueOf(String str) {
        return (C7ki) Enum.valueOf(C7ki.class, str);
    }

    public static C7ki[] values() {
        return (C7ki[]) A01.clone();
    }

    public C7ki(String str, String str2, String str3, String str4, Pattern pattern, int i, int i2) {
        this.association = str2;
        this.prefixMatchRegexPattern = pattern;
        this.humanReadableName = str3;
        this.cardLength = i2;
        this.typeName = str4;
    }
}
