package com.facebook.aura.settings;

import X.AbstractC3358CGz;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;
import X.InterfaceC7549F2g;

/* loaded from: classes.dex */
public final class HatchAiTrainingApi implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final HatchAiTrainingSetting DEFAULT_SETTING = new HatchAiTrainingSetting(true, false);
    public final BLG<HatchAiTrainingSetting> _setting;
    public final C1BN<HatchAiTrainingSetting> setting;
    public final AbstractC3358CGz userSession;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._setting.Af8(null);
    }

    public final C1BN<HatchAiTrainingSetting> getSetting() {
        return this.setting;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* renamed from: refresh-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1934refreshIoAF18A(X.HtJ<? super X.HsJ<com.facebook.aura.settings.HatchAiTrainingSetting>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.settings.HatchAiTrainingApi$refresh$1
            if (r0 == 0) goto L38
            r5 = r7
            com.facebook.aura.settings.HatchAiTrainingApi$refresh$1 r5 = (com.facebook.aura.settings.HatchAiTrainingApi$refresh$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L3e
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.settings.HatchAiTrainingApi$refresh$2 r0 = new com.facebook.aura.settings.HatchAiTrainingApi$refresh$2
            r0.<init>(r6, r1)
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L38:
            com.facebook.aura.settings.HatchAiTrainingApi$refresh$1 r5 = new com.facebook.aura.settings.HatchAiTrainingApi$refresh$1
            r5.<init>(r6, r7)
            goto L12
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchAiTrainingApi.m1934refreshIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: setEnabled-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1935setEnabledgIAlus(boolean r7, X.HtJ<? super X.HsJ<com.facebook.aura.settings.HatchAiTrainingSetting>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$1
            if (r0 == 0) goto L3a
            r5 = r8
            com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$1 r5 = (com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L40
            X.Hwg.A00(r1)
        L20:
            X.HsJ r1 = (X.HsJ) r1
            java.lang.Object r0 = r1.value
            return r0
        L25:
            X.78T r2 = X.AnonymousClass002.A0s(r1)
            r1 = 0
            com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$2 r0 = new com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$2
            r0.<init>(r7, r6, r1)
            r5.Z$0 = r7
            r5.label = r3
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L20
            return r4
        L3a:
            com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$1 r5 = new com.facebook.aura.settings.HatchAiTrainingApi$setEnabled$1
            r5.<init>(r6, r8)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchAiTrainingApi.m1935setEnabledgIAlus(boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final HatchAiTrainingApi getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchAiTrainingApi) abstractC3358CGz.A03(HatchAiTrainingApi.class, new HatchAiTrainingApi$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchAiTrainingApi(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public HatchAiTrainingApi(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCn = new C9286GCn(HwN.A01);
        this._setting = c9286GCn;
        this.setting = new C3Pi(null, c9286GCn);
    }
}
