package com.facebook.aura.installsource;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraBuildChannel {
    public static final AuraBuildChannel INSTANCE = new AuraBuildChannel();
    public static final F0C isPlayAlphaInstall$delegate = AbstractC5321DgF.A03(AnonymousClass2.INSTANCE);

    /* renamed from: com.facebook.aura.installsource.AuraBuildChannel$isPlayAlphaInstall$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke() {
            /*
                r1 = this;
                boolean r0 = com.facebook.aura.installsource.BuildConfig.IS_PLAY_ALPHA
                if (r0 == 0) goto L11
                com.facebook.aura.installsource.AuraInstallSourceDetector r1 = com.facebook.aura.installsource.AuraInstallSourceDetector.INSTANCE
                android.app.Application r0 = X.C4JM.A00()
                boolean r1 = r1.isPlayStoreInstall(r0)
                r0 = 1
                if (r1 != 0) goto L12
            L11:
                r0 = 0
            L12:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.installsource.AuraBuildChannel.AnonymousClass2.invoke():java.lang.Boolean");
        }
    }

    public final boolean isPlayAlphaInstall() {
        return AnonymousClass001.A1X(isPlayAlphaInstall$delegate.getValue());
    }
}
