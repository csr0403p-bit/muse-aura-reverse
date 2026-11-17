package com.facebook.aura.appreview;

import X.AbstractC3059Btm;
import X.AbstractC3396CJn;
import X.BV4;
import X.BV8;
import X.C3395CJm;
import X.C3398CJp;
import X.C3401CJt;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7Bm;
import X.CEF;
import X.CFK;
import X.CJS;
import X.CKL;
import X.CKO;
import X.CKQ;
import X.CKV;
import X.CKW;
import X.CSA;
import X.CSC;
import X.CSE;
import X.FGI;
import X.GBL;
import X.Hm1;
import X.HtJ;
import X.HzP;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.appreview.HatchInAppReviewOutcome;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzc;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes5.dex */
public final class HatchInAppReviewManager {
    public static final int $stable = 0;
    public static final String TAG = "HatchInAppReview";
    public static final HatchInAppReviewManager INSTANCE = new HatchInAppReviewManager();
    public static final AtomicBoolean requestInFlight = C60O.A1E();

    @DebugMetadata(c = "com.facebook.aura.appreview.HatchInAppReviewManager", f = "HatchInAppReviewManager.kt", l = {42}, m = "requestReview", v = 2)
    /* renamed from: com.facebook.aura.appreview.HatchInAppReviewManager$requestReview$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchInAppReviewManager.this.requestReview(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestReview(android.app.Activity r7, com.facebook.aura.appreview.HatchInAppReviewTrigger.TriggerSource r8, X.HtJ<? super com.facebook.aura.appreview.HatchInAppReviewOutcome> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.appreview.HatchInAppReviewManager.AnonymousClass1
            if (r0 == 0) goto L1f
            r5 = r9
            com.facebook.aura.appreview.HatchInAppReviewManager$requestReview$1 r5 = (com.facebook.aura.appreview.HatchInAppReviewManager.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L25
            goto L4c
        L1f:
            com.facebook.aura.appreview.HatchInAppReviewManager$requestReview$1 r5 = new com.facebook.aura.appreview.HatchInAppReviewManager$requestReview$1
            r5.<init>(r9)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.appreview.HatchInAppReviewManager.requestInFlight
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto L3e
            com.facebook.aura.appreview.HatchInAppReviewOutcome$FailureReason r1 = com.facebook.aura.appreview.HatchInAppReviewOutcome.FailureReason.IN_FLIGHT
            r0 = 0
            com.facebook.aura.appreview.HatchInAppReviewOutcome$Failure r3 = new com.facebook.aura.appreview.HatchInAppReviewOutcome$Failure
            r3.<init>(r1, r0)
            return r3
        L3e:
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L57
            r5.L$1 = r0     // Catch: java.lang.Throwable -> L57
            r5.label = r1     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r6.requestReviewFlow(r7, r8, r5)     // Catch: java.lang.Throwable -> L57
            if (r4 != r3) goto L4f
            return r3
        L4c:
            X.Hwg.A00(r4)     // Catch: java.lang.Throwable -> L57
        L4f:
            com.facebook.aura.appreview.HatchInAppReviewOutcome r4 = (com.facebook.aura.appreview.HatchInAppReviewOutcome) r4     // Catch: java.lang.Throwable -> L57
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.appreview.HatchInAppReviewManager.requestInFlight
            r0.set(r2)
            return r4
        L57:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r0 = com.facebook.aura.appreview.HatchInAppReviewManager.requestInFlight
            r0.set(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appreview.HatchInAppReviewManager.requestReview(android.app.Activity, com.facebook.aura.appreview.HatchInAppReviewTrigger$TriggerSource, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestReviewFlow(final Activity activity, final HatchInAppReviewTrigger.TriggerSource triggerSource, HtJ<? super HatchInAppReviewOutcome> htJ) throws DispatchException {
        CSC cscA01;
        int length;
        String strA10;
        final GBL gblA03 = C7Bm.A03(htJ);
        try {
            Context applicationContext = activity.getApplicationContext();
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (applicationContext2 != null) {
                applicationContext = applicationContext2;
            }
            C3395CJm c3395CJm = new C3395CJm();
            applicationContext.getPackageName();
            try {
                if (applicationContext.getPackageManager().getApplicationInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 0).enabled) {
                    Signature[] signatureArr = applicationContext.getPackageManager().getPackageInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 64).signatures;
                    if (signatureArr != null && (length = signatureArr.length) != 0) {
                        int i = 0;
                        do {
                            try {
                                strA10 = BV8.A10(MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256), signatureArr[i].toByteArray());
                            } catch (NoSuchAlgorithmException unused) {
                                strA10 = "";
                            }
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA10)) {
                                String str = Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA10)) {
                                    i++;
                                }
                            }
                            c3395CJm.A00 = new CKV(applicationContext, C60P.A03("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE), C3395CJm.A01, C3398CJp.A00);
                            break;
                        } while (i < length);
                    }
                    CJS cjs = AbstractC3396CJn.A00;
                    if (Log.isLoggable("PlayCore", 5)) {
                        BV4.A1K(cjs.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify.", "PlayCore");
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            final CKL ckl = new CKL(c3395CJm);
            C3395CJm c3395CJm2 = ckl.A01;
            CJS cjs2 = C3395CJm.A01;
            cjs2.A00("requestInAppReview (%s)", "com.facebook.aura");
            final CKV ckv = c3395CJm2.A00;
            if (ckv == null) {
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", FGI.A0U(cjs2.A00, " : ", "Play Store app is either not installed or not the official version"));
                }
                Locale locale = Locale.getDefault();
                Map map = AbstractC3059Btm.A00;
                cscA01 = CSC.A01(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : FGI.A0d(C60O.A0p(-1, map), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", C60O.A0p(-1, AbstractC3059Btm.A01), ")")))));
            } else {
                final CSE cse = new CSE();
                C3401CJt c3401CJt = new C3401CJt(cse, cse, c3395CJm2);
                Object obj = ckv.A07;
                synchronized (obj) {
                    try {
                        ckv.A0A.add(cse);
                        cscA01 = cse.A00;
                        cscA01.A05(new CEF() { // from class: X.CKI
                            @Override // X.CEF
                            public final void onComplete(CSA csa) {
                                CKV ckv2 = ckv;
                                CSE cse2 = cse;
                                synchronized (ckv2.A07) {
                                    ckv2.A0A.remove(cse2);
                                }
                            }
                        });
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                synchronized (obj) {
                    try {
                        if (ckv.A0B.getAndIncrement() > 0) {
                            CJS cjs3 = ckv.A06;
                            if (Log.isLoggable("PlayCore", 3)) {
                                Log.d("PlayCore", FGI.A0U(cjs3.A00, " : ", "Already connected to the service."));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ckv.A01().post(new CKW(((CKQ) c3401CJt).A00, c3401CJt, ckv));
            }
            C7384Etj.A0X(cscA01.A05(new CEF() { // from class: com.facebook.aura.appreview.HatchInAppReviewManager$requestReviewFlow$2$1
                @Override // X.CEF
                public final void onComplete(CSA<ReviewInfo> csa) {
                    CSC cscA02;
                    C7384Etj.A0Y(csa, 0);
                    if (gblA03.isActive()) {
                        if (!csa.A0C() || csa.A08() == null) {
                            CFK.A0A("HatchInAppReview", "Unable to request Google Play in-app review", csa.A07());
                            gblA03.Abf(null, new HatchInAppReviewOutcome.Failure(HatchInAppReviewOutcome.FailureReason.REQUEST_FAILED, csa.A07()));
                            return;
                        }
                        if (activity.isFinishing() || activity.isDestroyed()) {
                            gblA03.Abf(null, new HatchInAppReviewOutcome.Failure(HatchInAppReviewOutcome.FailureReason.ACTIVITY_GONE, null));
                            return;
                        }
                        try {
                            CFK.A03(triggerSource.getAnalyticsValue(), "HatchInAppReview", "Calling launchReviewFlow for trigger=%s");
                            HatchInAppReviewLogger.INSTANCE.logLaunchAttempt(triggerSource);
                            CKO cko = ckl;
                            Activity activity2 = activity;
                            CKL ckl2 = (CKL) cko;
                            zza zzaVar = (zza) csa.A08();
                            if (zzaVar.A01) {
                                cscA02 = CSC.A02(null);
                            } else {
                                Intent intent = new Intent(activity2, (Class<?>) PlayCoreDialogWrapperActivity.class);
                                intent.putExtra("confirmation_intent", zzaVar.A00);
                                intent.putExtra("window_flags", activity2.getWindow().getDecorView().getWindowSystemUiVisibility());
                                CSE cse2 = new CSE();
                                intent.putExtra("result_receiver", new zzc(ckl2.A00, cse2));
                                activity2.startActivity(intent);
                                cscA02 = cse2.A00;
                            }
                            final HatchInAppReviewTrigger.TriggerSource triggerSource2 = triggerSource;
                            final Hm1<HatchInAppReviewOutcome> hm1 = gblA03;
                            C7384Etj.A0X(cscA02.A05(new CEF() { // from class: com.facebook.aura.appreview.HatchInAppReviewManager$requestReviewFlow$2$1.1
                                @Override // X.CEF
                                public final void onComplete(CSA<Void> csa2) {
                                    Hm1<HatchInAppReviewOutcome> hm12;
                                    Object failure;
                                    C7384Etj.A0Y(csa2, 0);
                                    CFK.A02(triggerSource2.getAnalyticsValue(), Boolean.valueOf(csa2.A0C()), "HatchInAppReview", "In-app review flow completed for trigger=%s successful=%s");
                                    HatchInAppReviewTrigger.INSTANCE.recordLaunchAttempt$fbandroid_express_aura_java_com_facebook_aura_appreview_appreview();
                                    if (hm1.isActive()) {
                                        if (csa2.A0C()) {
                                            hm12 = hm1;
                                            failure = HatchInAppReviewOutcome.Success.INSTANCE;
                                        } else {
                                            CFK.A0A("HatchInAppReview", "Unable to launch Google Play in-app review", csa2.A07());
                                            hm12 = hm1;
                                            failure = new HatchInAppReviewOutcome.Failure(HatchInAppReviewOutcome.FailureReason.LAUNCH_FAILED, csa2.A07());
                                        }
                                        hm12.Abf(null, failure);
                                    }
                                }
                            }));
                        } catch (Exception e) {
                            CFK.A0A("HatchInAppReview", "Unable to launch Google Play in-app review", e);
                            gblA03.Abf(null, new HatchInAppReviewOutcome.Failure(HatchInAppReviewOutcome.FailureReason.LAUNCH_FAILED, e));
                        }
                    }
                }
            }));
        } catch (Exception e) {
            CFK.A0A("HatchInAppReview", "Unable to request Google Play in-app review", e);
            gblA03.Abf(null, new HatchInAppReviewOutcome.Failure(HatchInAppReviewOutcome.FailureReason.REQUEST_FAILED, e));
        }
        return gblA03.A0F();
    }
}
