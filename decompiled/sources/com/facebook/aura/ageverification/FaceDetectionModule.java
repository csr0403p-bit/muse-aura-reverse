package com.facebook.aura.ageverification;

import X.AbstractC7391EuP;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7463Ews;
import X.C7Gm;
import X.C9286GCn;
import X.CEB;
import X.CFK;
import X.EnumC3305CDe;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.os.Build;
import com.facebook.aura.ageverification.intf.SelfieFaceModule;
import com.facebook.aura.appmodules.AuraAppModules;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class FaceDetectionModule {
    public static final int $stable = 0;
    public static final String TAG = "FaceDetectionModule";
    public static final FaceDetectionModule INSTANCE = new FaceDetectionModule();
    public static final BLG<ModuleLoad> moduleLoad = C3cG.A14(new ModuleLoad(FaceDetectionModuleState.NOT_LOADED, 0, false));
    public static volatile SelfieFaceModule source = SelfieFaceModule.INSTALLED;

    @DebugMetadata(c = "com.facebook.aura.ageverification.FaceDetectionModule", f = "FaceDetectionModule.kt", l = {134}, m = "awaitMode", v = 2)
    /* renamed from: com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FaceDetectionModule.this.awaitMode(null, this);
        }
    }

    public final void load(Context context) {
        C7384Etj.A0Y(context, 0);
        if (isUnsupportedApi()) {
            CFK.A05(TAG, "Face detection unavailable: api29");
            AnonymousClass002.A1I(moduleLoad, new ModuleLoad(FaceDetectionModuleState.UNAVAILABLE, 0, false));
            return;
        }
        Integer numStartRequest = startRequest();
        if (numStartRequest != null) {
            final int iIntValue = numStartRequest.intValue();
            final Context applicationContext = context.getApplicationContext();
            AuraAppModules auraAppModules = AuraAppModules.INSTANCE;
            if (!auraAppModules.isDeclared(FaceDetectionModuleKt.FACE_DETECTION_MODULE)) {
                C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.ageverification.FaceDetectionModule.load.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        FaceDetectionModule faceDetectionModule = FaceDetectionModule.INSTANCE;
                        Context context2 = applicationContext;
                        C7384Etj.A0X(context2);
                        faceDetectionModule.prepareEngine(context2, iIntValue);
                    }
                });
                return;
            }
            if (!auraAppModules.isObtainable(FaceDetectionModuleKt.FACE_DETECTION_MODULE)) {
                CFK.A06(TAG, "Face detection unavailable: not_obtainable");
                settle(iIntValue, FaceDetectionModuleState.UNAVAILABLE, false);
                return;
            }
            final EnumC3305CDe enumC3305CDe = auraAppModules.isInstalled(FaceDetectionModuleKt.FACE_DETECTION_MODULE) ? EnumC3305CDe.A04 : EnumC3305CDe.A03;
            try {
                auraAppModules.getManager().A00(new C7463Ews(enumC3305CDe, FaceDetectionModuleKt.FACE_DETECTION_MODULE)).A05(new CEB() { // from class: com.facebook.aura.ageverification.FaceDetectionModule.load.2
                    @Override // X.CEB
                    public final void onCompleted(AbstractC7391EuP<C7Gm> abstractC7391EuP) {
                        Integer numValueOf;
                        Integer num;
                        Throwable thA03;
                        C7384Etj.A0Y(abstractC7391EuP, 0);
                        C7Gm c7GmA04 = abstractC7391EuP.A04();
                        if (c7GmA04 != null && c7GmA04.A04) {
                            if (enumC3305CDe == EnumC3305CDe.A03) {
                                FaceDetectionModule.source = SelfieFaceModule.DOWNLOADED;
                            }
                            FaceDetectionModule faceDetectionModule = FaceDetectionModule.INSTANCE;
                            Context context2 = applicationContext;
                            C7384Etj.A0X(context2);
                            faceDetectionModule.prepareEngine(context2, iIntValue);
                            return;
                        }
                        EnumC3305CDe enumC3305CDe2 = enumC3305CDe;
                        Boolean boolValueOf = null;
                        if (c7GmA04 != null) {
                            numValueOf = Integer.valueOf(c7GmA04.A00);
                            num = c7GmA04.A01;
                            boolValueOf = Boolean.valueOf(c7GmA04.A03);
                        } else {
                            numValueOf = null;
                            num = null;
                        }
                        StringBuilder sbA0f = C3cG.A0f(enumC3305CDe2, "Face detection unavailable: load_failed ");
                        sbA0f.append(" downloadCode=");
                        sbA0f.append(numValueOf);
                        sbA0f.append(" splitInstallErrorCode=");
                        sbA0f.append(num);
                        String strA0y = AnonymousClass006.A0y(boolValueOf, " canRetry=", sbA0f);
                        if (c7GmA04 == null || (thA03 = c7GmA04.A02) == null) {
                            thA03 = abstractC7391EuP.A03();
                        }
                        CFK.A0A(FaceDetectionModule.TAG, strA0y, thA03);
                        FaceDetectionModule.INSTANCE.settle(iIntValue, FaceDetectionModuleState.UNAVAILABLE, enumC3305CDe == EnumC3305CDe.A03);
                    }
                }, C60O.A1D());
            } catch (Exception e) {
                CFK.A0A(TAG, AnonymousClass007.A0a("Face detection unavailable: request_failed ", enumC3305CDe), e);
                settle(iIntValue, FaceDetectionModuleState.UNAVAILABLE, false);
            }
        }
    }

    private final boolean getCanRetry(ModuleLoad moduleLoad2) {
        return moduleLoad2.state == FaceDetectionModuleState.UNAVAILABLE && moduleLoad2.downloadFailed && !isUnsupportedApi() && AuraAppModules.INSTANCE.isObtainable(FaceDetectionModuleKt.FACE_DETECTION_MODULE);
    }

    private final boolean isUnsupportedApi() {
        return Build.VERSION.SDK_INT < 30 && AuraAppModules.INSTANCE.isDeclared(FaceDetectionModuleKt.FACE_DETECTION_MODULE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void prepareEngine(android.content.Context r4, int r5) {
        /*
            r3 = this;
            java.lang.String r2 = "FaceDetectionModule"
            com.facebook.aura.ageverification.FaceDetectionModelAssets r0 = com.facebook.aura.ageverification.FaceDetectionModelAssets.INSTANCE     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.ensureAvailable(r4)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L19
            com.facebook.aura.ageverification.FaceDetectionEngine r0 = com.facebook.aura.ageverification.FaceDetectionEngine.INSTANCE     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.load(r4)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L19
            goto L21
        L13:
            r1 = move-exception
            java.lang.String r0 = "Failed to prepare the engine"
            X.CFK.A0A(r2, r0, r1)
        L19:
            java.lang.String r0 = "Face detection unavailable: init_failed"
            X.CFK.A06(r2, r0)
            com.facebook.aura.ageverification.FaceDetectionModuleState r1 = com.facebook.aura.ageverification.FaceDetectionModuleState.UNAVAILABLE
            goto L23
        L21:
            com.facebook.aura.ageverification.FaceDetectionModuleState r1 = com.facebook.aura.ageverification.FaceDetectionModuleState.READY
        L23:
            r0 = 0
            r3.settle(r5, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.FaceDetectionModule.prepareEngine(android.content.Context, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void settle(int i, FaceDetectionModuleState faceDetectionModuleState, boolean z) {
        BLG<ModuleLoad> blg = moduleLoad;
        ModuleLoad value = blg.getValue();
        if (value.request == i && value.state == FaceDetectionModuleState.LOADING) {
            AnonymousClass001.A1E(blg, value, new ModuleLoad(faceDetectionModuleState, i, z));
        }
    }

    private final Integer startRequest() {
        BLG<ModuleLoad> blg;
        ModuleLoad value;
        ModuleLoad moduleLoad2;
        do {
            blg = moduleLoad;
            value = blg.getValue();
            if (value.state != FaceDetectionModuleState.NOT_LOADED && !getCanRetry(value)) {
                return null;
            }
            moduleLoad2 = new ModuleLoad(FaceDetectionModuleState.LOADING, value.request + 1, false);
        } while (!C9286GCn.A00(value, moduleLoad2, (C9286GCn) blg));
        return Integer.valueOf(moduleLoad2.request);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitMode(android.content.Context r7, X.HtJ<? super com.facebook.aura.ageverification.SelfieMode> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.ageverification.FaceDetectionModule.AnonymousClass1
            if (r0 == 0) goto L6b
            r4 = r8
            com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$1 r4 = (com.facebook.aura.ageverification.FaceDetectionModule.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r5 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 != r1) goto L8e
            X.Hwg.A00(r5)
        L20:
            com.facebook.aura.ageverification.ModuleLoad r5 = (com.facebook.aura.ageverification.ModuleLoad) r5
            if (r5 != 0) goto L2c
            X.BLG<com.facebook.aura.ageverification.ModuleLoad> r0 = com.facebook.aura.ageverification.FaceDetectionModule.moduleLoad
            java.lang.Object r5 = r0.getValue()
            com.facebook.aura.ageverification.ModuleLoad r5 = (com.facebook.aura.ageverification.ModuleLoad) r5
        L2c:
            com.facebook.aura.ageverification.FaceDetectionModuleState r1 = r5.state
            com.facebook.aura.ageverification.FaceDetectionModuleState r0 = com.facebook.aura.ageverification.FaceDetectionModuleState.LOADING
            if (r1 != r0) goto L71
            X.BLG<com.facebook.aura.ageverification.ModuleLoad> r4 = com.facebook.aura.ageverification.FaceDetectionModule.moduleLoad
            com.facebook.aura.ageverification.FaceDetectionModuleState r3 = com.facebook.aura.ageverification.FaceDetectionModuleState.NOT_LOADED
            int r2 = r5.request
            boolean r1 = r5.downloadFailed
            com.facebook.aura.ageverification.ModuleLoad r0 = new com.facebook.aura.ageverification.ModuleLoad
            r0.<init>(r3, r2, r1)
            X.GCn r4 = (X.C9286GCn) r4
            boolean r0 = X.C9286GCn.A00(r5, r0, r4)
            if (r0 == 0) goto L71
            java.lang.String r1 = "FaceDetectionModule"
            java.lang.String r0 = "Face detection module wait timed out after 120000ms"
            X.CFK.A06(r1, r0)
            com.facebook.aura.ageverification.SelfieMode r3 = com.facebook.aura.ageverification.SelfieMode.RETRY
            return r3
        L51:
            X.Hwg.A00(r5)
            r6.load(r7)
            r0 = 0
            com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$settled$1 r2 = new com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$settled$1
            r2.<init>(r0)
            r4.L$0 = r0
            r4.label = r1
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.Object r5 = X.GAX.A01(r4, r2, r0)
            if (r5 != r3) goto L20
            return r3
        L6b:
            com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$1 r4 = new com.facebook.aura.ageverification.FaceDetectionModule$awaitMode$1
            r4.<init>(r8)
            goto L12
        L71:
            X.BLG<com.facebook.aura.ageverification.ModuleLoad> r0 = com.facebook.aura.ageverification.FaceDetectionModule.moduleLoad
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.ageverification.ModuleLoad r2 = (com.facebook.aura.ageverification.ModuleLoad) r2
            com.facebook.aura.ageverification.FaceDetectionModuleState r1 = r2.state
            com.facebook.aura.ageverification.FaceDetectionModuleState r0 = com.facebook.aura.ageverification.FaceDetectionModuleState.READY
            if (r1 != r0) goto L82
            com.facebook.aura.ageverification.SelfieMode r3 = com.facebook.aura.ageverification.SelfieMode.GUIDED
            return r3
        L82:
            boolean r0 = r6.getCanRetry(r2)
            if (r0 == 0) goto L8b
            com.facebook.aura.ageverification.SelfieMode r3 = com.facebook.aura.ageverification.SelfieMode.RETRY
            return r3
        L8b:
            com.facebook.aura.ageverification.SelfieMode r3 = com.facebook.aura.ageverification.SelfieMode.UNAVAILABLE
            return r3
        L8e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.FaceDetectionModule.awaitMode(android.content.Context, X.HtJ):java.lang.Object");
    }

    public final SelfieFaceModule getSource() {
        return source;
    }
}
