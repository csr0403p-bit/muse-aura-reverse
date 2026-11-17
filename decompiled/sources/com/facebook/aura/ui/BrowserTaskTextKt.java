package com.facebook.aura.ui;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.model.BrowserTaskDisplayStatus;

/* loaded from: classes2.dex */
public abstract class BrowserTaskTextKt {
    public static final String browserTaskStatusWithDetail(Context context, String str, String str2) {
        C7384Etj.A0Y(context, 0);
        return (str == null || C7BY.A0j(str)) ? str2 == null ? "" : str2 : (str2 == null || C7BY.A0j(str2)) ? str : context.getString(R.string._name_removed__res_0x7f1201ac, str, str2);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserTaskDisplayStatus.values().length];
            try {
                AnonymousClass002.A13(BrowserTaskDisplayStatus.QUEUED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserTaskDisplayStatus.STARTING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserTaskDisplayStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BrowserTaskDisplayStatus.WAITING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BrowserTaskDisplayStatus.NEEDS_YOU, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BrowserTaskDisplayStatus.PAUSED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(BrowserTaskDisplayStatus.COMPLETED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(BrowserTaskDisplayStatus.FAILED, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(BrowserTaskDisplayStatus.STOPPED, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String browserTaskStatusWithSite(String str, String str2, BFM bfm, int i) {
        if (str == null || C7BY.A0j(str)) {
            AnonymousClass004.A1A(bfm, -660186652);
            return str2 == null ? "" : str2;
        }
        if (str2 == null || C7BY.A0j(str2)) {
            bfm.AgE(-660185311);
        } else {
            bfm.AgE(-660184564);
            str = AnonymousClass006.A0w(bfm, str, str2, R.string._name_removed__res_0x7f1201ad);
        }
        AnonymousClass002.A19(bfm);
        return str;
    }

    public static final int fallbackStatusLabelRes(BrowserTaskDisplayStatus browserTaskDisplayStatus) {
        switch (AnonymousClass003.A0L(browserTaskDisplayStatus)) {
            case 0:
                return R.string._name_removed__res_0x7f1201a9;
            case 1:
                return R.string._name_removed__res_0x7f1201aa;
            case 2:
                return R.string._name_removed__res_0x7f1201ae;
            case 3:
            case 8:
                return R.string._name_removed__res_0x7f1201a7;
            case 4:
                return R.string._name_removed__res_0x7f1201a8;
            case 5:
                return R.string._name_removed__res_0x7f1201a5;
            case 6:
                return R.string._name_removed__res_0x7f1201a6;
            case 7:
                return R.string._name_removed__res_0x7f1201ab;
            default:
                throw C3cG.A0q();
        }
    }

    public static final String browserTaskStatusWithDetail(String str, String str2, BFM bfm, int i) {
        if (str != null && !C7BY.A0j(str)) {
            if (str2 != null && !C7BY.A0j(str2)) {
                bfm.AgE(-587339880);
                str = AnonymousClass006.A0w(bfm, str, str2, R.string._name_removed__res_0x7f1201ac);
            } else {
                bfm.AgE(-587340629);
            }
            AnonymousClass002.A19(bfm);
            return str;
        }
        AnonymousClass004.A1A(bfm, -587341970);
        if (str2 == null) {
            return "";
        }
        return str2;
    }
}
