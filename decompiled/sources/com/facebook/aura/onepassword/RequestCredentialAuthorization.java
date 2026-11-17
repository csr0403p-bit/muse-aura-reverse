package com.facebook.aura.onepassword;

import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C60P;
import X.C7384Etj;
import X.G0U;
import X.HwU;
import X.Hx6;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.facebook.aura.common.HatchVersionName;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RequestCredentialAuthorization extends Hx6<String, Result> {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String EXTRA_PREFIX = "com.onepassword.android.workloadaccess.extra";

    @Deprecated
    public static final String NAMESPACE = "com.onepassword.android.workloadaccess";

    @Deprecated
    public static final String NO_GRANT_REFERENCE = "no_grant_reference";

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.onepassword.RequestCredentialAuthorization.Result accessRequestResult(java.lang.String r4) {
            /*
                r3 = this;
                java.lang.String r3 = "no_grant_reference"
                if (r4 == 0) goto L4d
                X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L4d
                com.facebook.aura.onepassword.OnePasswordGrantJson$$serializer r0 = com.facebook.aura.onepassword.OnePasswordGrantJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L4d
                java.lang.Object r0 = r1.A00(r4, r0)     // Catch: java.lang.Throwable -> L4d
                com.facebook.aura.onepassword.OnePasswordGrantJson r0 = (com.facebook.aura.onepassword.OnePasswordGrantJson) r0     // Catch: java.lang.Throwable -> L4d
                com.facebook.aura.onepassword.OnePasswordGrantPayloadJson r2 = r0.payload     // Catch: java.lang.Throwable -> L4d
                if (r2 == 0) goto L4d
                java.lang.String r1 = r2.state
                java.lang.String r0 = "resolved"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3c
                java.util.List<com.facebook.aura.onepassword.OnePasswordResolvedGrantJson> r0 = r2.resolved
                java.lang.Object r0 = X.AbstractC0878AGe.A0G(r0)
                com.facebook.aura.onepassword.OnePasswordResolvedGrantJson r0 = (com.facebook.aura.onepassword.OnePasswordResolvedGrantJson) r0
                if (r0 == 0) goto L47
                com.facebook.aura.onepassword.OnePasswordGrantReferenceJson r0 = r0.reference
                if (r0 == 0) goto L47
                java.lang.String r1 = r0.reference
                if (r1 == 0) goto L47
                boolean r0 = X.C7BY.A0j(r1)
                if (r0 != 0) goto L47
                com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Authorized r0 = new com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Authorized
                r0.<init>(r1)
            L39:
                com.facebook.aura.onepassword.RequestCredentialAuthorization$Result r0 = (com.facebook.aura.onepassword.RequestCredentialAuthorization.Result) r0
                return r0
            L3c:
                java.lang.String r0 = "denied"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L47
                com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Denied r0 = com.facebook.aura.onepassword.RequestCredentialAuthorization.Result.Denied.INSTANCE
                goto L39
            L47:
                com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Failed r0 = new com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Failed
                r0.<init>(r3)
                goto L39
            L4d:
                com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Failed r0 = new com.facebook.aura.onepassword.RequestCredentialAuthorization$Result$Failed
                r0.<init>(r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.onepassword.RequestCredentialAuthorization.Companion.accessRequestResult(java.lang.String):com.facebook.aura.onepassword.RequestCredentialAuthorization$Result");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public interface Result {

        public final class Authorized extends C06G implements Result {
            public static final int $stable = 0;
            public final String grantReference;

            public Authorized(String str) {
                C7384Etj.A0Y(str, 0);
                this.grantReference = str;
            }

            public final Authorized copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Authorized(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Authorized) && C7384Etj.areEqual(this.grantReference, ((Authorized) obj).grantReference));
            }

            public static /* synthetic */ Authorized copy$default(Authorized authorized, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = authorized.grantReference;
                }
                C7384Etj.A0Y(str, 0);
                return new Authorized(str);
            }

            public final String component1() {
                return this.grantReference;
            }

            public final String getGrantReference() {
                return this.grantReference;
            }

            public int hashCode() {
                return this.grantReference.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Cancelled implements Result {
            public static final int $stable = 0;
            public static final Cancelled INSTANCE = new Cancelled();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancelled);
            }

            public String toString() {
                return "Cancelled";
            }

            public int hashCode() {
                return -1216692642;
            }
        }

        public final class Denied implements Result {
            public static final int $stable = 0;
            public static final Denied INSTANCE = new Denied();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Denied);
            }

            public String toString() {
                return "Denied";
            }

            public int hashCode() {
                return 1760741806;
            }
        }

        public final class Failed extends C06G implements Result {
            public static final int $stable = 0;
            public final String error;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.error = str;
            }

            public final Failed copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Failed) && C7384Etj.areEqual(this.error, ((Failed) obj).error));
            }

            public static /* synthetic */ Failed copy$default(Failed failed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = failed.error;
                }
                C7384Etj.A0Y(str, 0);
                return new Failed(str);
            }

            public final String component1() {
                return this.error;
            }

            public final String getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    private final boolean isBelowMinimumVersion(PackageManager packageManager) {
        try {
            String str = packageManager.getPackageInfo(RequestCredentialAuthorizationKt.ONEPASSWORD_PACKAGE_NAME, 0).versionName;
            if (str != null) {
                return HatchVersionName.INSTANCE.isBelow(str, RequestCredentialAuthorizationKt.MINIMUM_ONEPASSWORD_VERSION);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @Override // X.Hx6
    public Intent createIntent(Context context, String str) {
        C7384Etj.A0Y(str, 1);
        Intent intentPutExtra = authorizationIntent().putExtra("com.onepassword.android.workloadaccess.extra.PROTOCOL_VERSION", 1).putExtra("com.onepassword.android.workloadaccess.extra.ACCESS_REQUEST_REFERENCE", str);
        C7384Etj.A0U(intentPutExtra);
        return intentPutExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.Hx6
    public Result parseResult(int i, Intent intent) {
        String stringExtra;
        Result failed;
        String stringExtra2 = null;
        if (intent != null) {
            stringExtra = intent.getStringExtra("com.onepassword.android.workloadaccess.extra.STATUS");
            stringExtra2 = intent.getStringExtra("com.onepassword.android.workloadaccess.extra.ERROR");
        } else {
            stringExtra = null;
        }
        if (i == -1 && "authorized".equals(stringExtra)) {
            return Companion.accessRequestResult(intent.getStringExtra("com.onepassword.android.workloadaccess.extra.ACCESS_REQUEST_STATUS"));
        }
        if ("denied".equals(stringExtra)) {
            failed = Result.Denied.INSTANCE;
        } else {
            if (stringExtra == null) {
                if (stringExtra2 == null) {
                    failed = i == -1 ? new Result.Failed("unknown") : Result.Cancelled.INSTANCE;
                }
            } else if (stringExtra2 == null) {
                stringExtra2 = "unknown";
            }
            failed = new Result.Failed(stringExtra2);
        }
        return failed;
    }

    private final Intent authorizationIntent() {
        Intent intent = C60P.A03("com.onepassword.android.workloadaccess.action.REQUEST_AUTHORIZATION").setPackage(RequestCredentialAuthorizationKt.ONEPASSWORD_PACKAGE_NAME);
        C7384Etj.A0U(intent);
        return intent;
    }

    public final void launch(HwU<String> hwU, String str, G0U<? super Result.Failed, Unit> g0u) {
        Result.Failed failed;
        AnonymousClass005.A0x(hwU, str, g0u);
        try {
            hwU.A01(null, str);
        } catch (ActivityNotFoundException unused) {
            failed = new Result.Failed("unavailable");
            g0u.invoke(failed);
        } catch (IllegalStateException | SecurityException unused2) {
            failed = new Result.Failed("launch_blocked");
            g0u.invoke(failed);
        }
    }

    public final void checkAvailability(Context context, G0U<? super Result.Failed, Unit> g0u, Function0<Unit> function0) {
        AnonymousClass005.A0x(context, g0u, function0);
        PackageManager packageManager = context.getPackageManager();
        if (authorizationIntent().resolveActivity(packageManager) != null) {
            C7384Etj.A0X(packageManager);
            if (!isBelowMinimumVersion(packageManager)) {
                function0.invoke();
                return;
            }
        }
        g0u.invoke(new Result.Failed(packageManager.getLaunchIntentForPackage(RequestCredentialAuthorizationKt.ONEPASSWORD_PACKAGE_NAME) != null ? "update_required" : "not_installed"));
    }
}
