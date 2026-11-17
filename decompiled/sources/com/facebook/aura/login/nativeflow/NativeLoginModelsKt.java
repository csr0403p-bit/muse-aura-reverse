package com.facebook.aura.login.nativeflow;

import X.C7384Etj;
import com.facebook.aura.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class NativeLoginModelsKt {
    public static final int NATIVE_LOGIN_BIRTHDAY_LENGTH = 8;
    public static final int NATIVE_LOGIN_MAX_ACCOUNT_ROWS = 5;
    public static final int NATIVE_LOGIN_MAX_FACEPILE_ACCOUNTS = 7;
    public static final int NATIVE_LOGIN_OTP_LENGTH = 6;

    public static final boolean isAymhSurface(List<NativeLoginAccountUiModel> list) {
        C7384Etj.A0Y(list, 0);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<NativeLoginAccountUiModel> it = list.iterator();
            while (it.hasNext()) {
                if (!(!it.next().hasMetaAi)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean suppressesEntryTosClause(boolean z, List<NativeLoginAccountUiModel> list) {
        C7384Etj.A0Y(list, 1);
        if (!z || list.isEmpty()) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (NativeLoginAccountUiModel nativeLoginAccountUiModel : list) {
                if (!(!nativeLoginAccountUiModel.hasMetaAi) || !nativeLoginAccountUiModel.disclosurePresentation.isDrawnOnItsOwnScreen()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final NativeLoginPasswordSubtitle passwordSubtitleFor(HatchPasswordCopy hatchPasswordCopy, boolean z) {
        int i;
        NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs;
        NativeLoginPasswordSubtitleArgs nativeLoginPasswordSubtitleArgs2 = NativeLoginPasswordSubtitleArgs.DESTINATION;
        NativeLoginPasswordSubtitle nativeLoginPasswordSubtitle = new NativeLoginPasswordSubtitle(R.string._name_removed__res_0x7f1204eb, nativeLoginPasswordSubtitleArgs2);
        if (z) {
            return new NativeLoginPasswordSubtitle(R.string._name_removed__res_0x7f1204fc, nativeLoginPasswordSubtitleArgs2);
        }
        if (hatchPasswordCopy == null) {
            return nativeLoginPasswordSubtitle;
        }
        if (hatchPasswordCopy.isF3) {
            boolean z2 = hatchPasswordCopy.isSignup;
            int i2 = R.string._name_removed__res_0x7f1204f2;
            if (z2) {
                i2 = R.string._name_removed__res_0x7f1204f3;
            }
            return new NativeLoginPasswordSubtitle(i2, nativeLoginPasswordSubtitleArgs2);
        }
        boolean z3 = hatchPasswordCopy.hasFacebookPassword;
        boolean z4 = hatchPasswordCopy.hasInstagramPassword;
        boolean z5 = hatchPasswordCopy.isSignup;
        if (hatchPasswordCopy.hasOwnPassword) {
            if (z3) {
                if (z4) {
                    i = R.string._name_removed__res_0x7f1204f6;
                    if (z5) {
                        i = R.string._name_removed__res_0x7f1204f7;
                    }
                } else {
                    i = R.string._name_removed__res_0x7f1204f5;
                    if (z5) {
                        i = R.string._name_removed__res_0x7f1204f8;
                    }
                }
            } else if (z4) {
                i = R.string._name_removed__res_0x7f1204f9;
                if (z5) {
                    i = R.string._name_removed__res_0x7f1204fa;
                }
            } else {
                i = R.string._name_removed__res_0x7f1204f4;
                if (z5) {
                    i = R.string._name_removed__res_0x7f1204fb;
                }
            }
            nativeLoginPasswordSubtitleArgs = NativeLoginPasswordSubtitleArgs.APP_DESTINATION;
        } else {
            if (z3) {
                if (z4) {
                    i = R.string._name_removed__res_0x7f1204ed;
                    if (z5) {
                        i = R.string._name_removed__res_0x7f1204ee;
                    }
                } else {
                    i = R.string._name_removed__res_0x7f1204ec;
                    if (z5) {
                        i = R.string._name_removed__res_0x7f1204ef;
                    }
                }
            } else {
                if (!z4) {
                    return nativeLoginPasswordSubtitle;
                }
                i = R.string._name_removed__res_0x7f1204f0;
                if (z5) {
                    i = R.string._name_removed__res_0x7f1204f1;
                }
            }
            nativeLoginPasswordSubtitleArgs = NativeLoginPasswordSubtitleArgs.APP;
        }
        return new NativeLoginPasswordSubtitle(i, nativeLoginPasswordSubtitleArgs);
    }
}
