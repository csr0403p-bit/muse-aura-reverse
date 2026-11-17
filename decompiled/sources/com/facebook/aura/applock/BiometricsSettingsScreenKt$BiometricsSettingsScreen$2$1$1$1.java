package com.facebook.aura.applock;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.C8328Fbu;
import X.G0U;
import X.G0W;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ boolean $biometricAvailable;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ C1BO<Boolean> $enabled$delegate;
    public final /* synthetic */ Executor $executor;
    public final /* synthetic */ C8328Fbu $promptInfo;
    public final /* synthetic */ AppLockRepository $repository;
    public final /* synthetic */ boolean $shouldOfferEnrollment;

    /* renamed from: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ FragmentActivity $activity;
        public final /* synthetic */ boolean $biometricAvailable;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ C1BO<Boolean> $enabled$delegate;
        public final /* synthetic */ Executor $executor;
        public final /* synthetic */ C8328Fbu $promptInfo;
        public final /* synthetic */ AppLockRepository $repository;
        public final /* synthetic */ boolean $shouldOfferEnrollment;

        /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r55, X.BFM r56, int r57) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1.AnonymousClass1.invoke(X.07C, X.BFM, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, boolean z2, Context context, FragmentActivity fragmentActivity, Executor executor, C3UX c3ux, AppLockRepository appLockRepository, C8328Fbu c8328Fbu, C1BO<Boolean> c1bo) {
            super(3);
            this.$biometricAvailable = z;
            this.$shouldOfferEnrollment = z2;
            this.$context = context;
            this.$activity = fragmentActivity;
            this.$executor = executor;
            this.$coroutineScope = c3ux;
            this.$repository = appLockRepository;
            this.$promptInfo = c8328Fbu;
            this.$enabled$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$biometricAvailable, this.$shouldOfferEnrollment, this.$context, this.$activity, this.$executor, this.$coroutineScope, this.$repository, this.$promptInfo, this.$enabled$delegate), -1519925039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1(boolean z, boolean z2, Context context, FragmentActivity fragmentActivity, Executor executor, C3UX c3ux, AppLockRepository appLockRepository, C8328Fbu c8328Fbu, C1BO<Boolean> c1bo) {
        super(1);
        this.$biometricAvailable = z;
        this.$shouldOfferEnrollment = z2;
        this.$context = context;
        this.$activity = fragmentActivity;
        this.$executor = executor;
        this.$coroutineScope = c3ux;
        this.$repository = appLockRepository;
        this.$promptInfo = c8328Fbu;
        this.$enabled$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
