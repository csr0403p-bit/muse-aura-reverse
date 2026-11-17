package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DFd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4931DFd {
    public static final String FALCO_ACS_PLACEHOLDER_CLAIM = "<falco_acs_placeholder_claim>";
    public final String accountId;
    public final Function0<String> atClaimProvider;
    public final boolean attachAcsPlaceholder;
    public final String rawClaim;
    public final String userId;

    public C4931DFd(String str, String str2) {
        this(str, str2, null);
    }

    public static final C4931DFd forSingleUser(String str) {
        if (str != null) {
            return new C4931DFd(str, str, null);
        }
        return null;
    }

    public void addFieldsToIdentityDescriptor(C4949DGw c4949DGw) {
        C7384Etj.A0Y(c4949DGw, 0);
        String str = this.userId;
        c4949DGw.A03 = str != null ? C9tI.A0s(str) : null;
        String str2 = this.userId;
        c4949DGw.A02 = str2 != null ? C9tI.A0s(str2) : null;
        if (!areUserIdAndAccountIdEqual()) {
            String str3 = this.accountId;
            c4949DGw.A02 = str3 != null ? C9tI.A0s(str3) : null;
        }
        String str4 = this.rawClaim;
        if (str4 != null) {
            c4949DGw.A08.add(str4);
        }
        String strInvoke = this.atClaimProvider.invoke();
        if (strInvoke != null) {
            c4949DGw.A08.add(strInvoke);
        }
        c4949DGw.A0A = true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                C4931DFd c4931DFd = (C4931DFd) obj;
                if (!C7384Etj.areEqual(this.accountId, c4931DFd.accountId) || !C7384Etj.areEqual(this.userId, c4931DFd.userId) || !C7384Etj.areEqual(this.rawClaim, c4931DFd.rawClaim)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void maybeAttachAcsPlaceholder(C3340CFk c3340CFk) {
        C7384Etj.A0Y(c3340CFk, 0);
        if (this.attachAcsPlaceholder) {
            C3340CFk.A00(c3340CFk, FALCO_ACS_PLACEHOLDER_CLAIM);
        }
    }

    public static final String accessTokenClaim(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return FGI.A0M("at.", str);
    }

    private final boolean areUserIdAndAccountIdEqual() {
        return C7384Etj.areEqual(this.userId, this.accountId);
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAppUserId() {
        return null;
    }

    public final String getAtClaim() {
        return this.atClaimProvider.invoke();
    }

    public final String getPrivacySensitiveId() {
        return this.userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.accountId;
        if (str == null) {
            str = "";
        }
        String str2 = this.userId;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.rawClaim;
        return BV6.A0A(str, str2, "", str3 != null ? str3 : "");
    }

    public final String hashString() {
        String str = this.accountId;
        if (str == null) {
            str = "";
        }
        String str2 = this.userId;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.rawClaim;
        return FGI.A0k(str, "^", str2, "^", "", "^", str3 != null ? str3 : "");
    }

    public void attachBatchLevelFields(C3341CFl c3341CFl, C3339CFj c3339CFj) {
        AnonymousClass003.A0u(c3341CFl, c3339CFj);
        C3341CFl.A00(c3341CFl, this.userId, ErrorReportingConstants.USER_ID_KEY);
        if (!areUserIdAndAccountIdEqual()) {
            C3341CFl.A00(c3341CFl, this.accountId, "account_id");
        }
        String strInvoke = this.atClaimProvider.invoke();
        if (this.rawClaim == null && strInvoke == null) {
            return;
        }
        C3340CFk c3340CFkA02 = c3339CFj.A02();
        maybeAttachAcsPlaceholder(c3340CFkA02);
        String str = this.rawClaim;
        if (str != null) {
            C3340CFk.A00(c3340CFkA02, str);
        }
        if (strInvoke != null) {
            C3340CFk.A00(c3340CFkA02, strInvoke);
        }
        c3341CFl.A0E(c3340CFkA02, "claims");
    }

    public String getClaim() {
        String atClaim = getAtClaim();
        return atClaim == null ? this.rawClaim : atClaim;
    }

    public C4931DFd(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public static final C4931DFd forSingleUser(String str, String str2, boolean z) {
        if (str == null) {
            return null;
        }
        return new C4931DFd(str, str, str2, z);
    }

    public C4931DFd(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, C6724EXi.A00(7));
    }

    public static final C4931DFd forSingleUser(String str, String str2, boolean z, String str3) {
        if (str == null) {
            return null;
        }
        return new C4931DFd(str, str, str2, z, new FYU(str3, 1));
    }

    public C4931DFd(String str, String str2, String str3, boolean z, Function0<String> function0) {
        C7384Etj.A0Y(function0, 4);
        this.accountId = str;
        this.userId = str2;
        this.attachAcsPlaceholder = z;
        this.atClaimProvider = function0;
        this.rawClaim = str3;
    }

    public static final C4931DFd forSingleUser(String str, String str2) {
        if (str == null) {
            return null;
        }
        return new C4931DFd(str, str, str2);
    }

    public /* synthetic */ C4931DFd(String str, String str2, String str3, boolean z, Function0 function0, int i, C06H c06h) {
        this(str, str2, str3, C3cG.A1K(i & 8, z), (i & 16) != 0 ? C6724EXi.A00(6) : function0);
    }
}
