package com.facebook.aura.email;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import com.facebook.aura.email.view.EmailScreenKt;
import com.facebook.aura.email.viewmodel.EmailInboxEntryPoint;
import com.facebook.aura.status.api.StatusTab;
import com.facebook.aura.status.api.StatusTabEntry;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailStatusTab implements StatusTab {
    public static final EmailStatusTab INSTANCE = new EmailStatusTab();
    public static final int iconRes = 2131231007;
    public static final String id = "email";
    public static final int labelRes = 2131888558;

    @Override // com.facebook.aura.status.api.StatusTab
    /* renamed from: Content-cmh-DWc, reason: not valid java name */
    public void mo735ContentcmhDWc(float f, float f2, BRg bRg, String str, Function0<Unit> function0, StatusTabEntry statusTabEntry, BFM bfm, int i) {
        EmailInboxEntryPoint emailInboxEntryPoint;
        C7384Etj.A0Y(bRg, 2);
        AnonymousClass003.A0y(function0, statusTabEntry);
        bfm.AgG(-1332271826);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA04 |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA04 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA04 |= AnonymousClass004.A0H(bfm, statusTabEntry.ordinal());
        }
        if ((1572864 & i) == 0) {
            iA04 |= AnonymousClass004.A0j(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA04, 599186), bfm, iA04)) {
            if (isEnabled(AnonymousClass002.A0h(bfm))) {
                int iA0B = AnonymousClass005.A0B(bfm, statusTabEntry, 83073504);
                if (iA0B == 0) {
                    emailInboxEntryPoint = EmailInboxEntryPoint.TAB_TAP;
                } else if (iA0B == 1) {
                    emailInboxEntryPoint = EmailInboxEntryPoint.DEEP_LINK;
                } else {
                    if (iA0B != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    emailInboxEntryPoint = EmailInboxEntryPoint.LAST_TAB;
                }
                EmailScreenKt.m753EmailScreenX35cekY(f, f2, str, function0, emailInboxEntryPoint, bRg, bfm, AnonymousClass001.A08(iA04 << 9, AnonymousClass002.A08(iA04 >> 3, iA04 & 126)), 0);
            } else {
                bfm.AgE(83554004);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new EmailStatusTab$Content$1(this, f, f2, bRg, str, function0, statusTabEntry, i);
        }
    }

    @Override // com.facebook.aura.status.api.StatusTab
    public boolean isEnabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return HatchUtils.INSTANCE.isEmailEnabled(abstractC3358CGz);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StatusTabEntry.values().length];
            try {
                AnonymousClass002.A13(StatusTabEntry.TAP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(StatusTabEntry.LINK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(StatusTabEntry.RESTORED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.facebook.aura.status.api.StatusTab
    public int getIconRes() {
        return iconRes;
    }

    @Override // com.facebook.aura.status.api.StatusTab
    public String getId() {
        return id;
    }

    @Override // com.facebook.aura.status.api.StatusTab
    public int getLabelRes() {
        return labelRes;
    }
}
