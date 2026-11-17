package com.facebook.aura.skills.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0CD;
import X.C1BO;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0W;
import X.InterfaceC7353EnQ;
import com.facebook.aura.skills.viewmodel.RecipientPermissionGroup;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsUiState;
import com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel;
import com.facebook.aura.ui.HatchSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ String $connectorName;
    public final /* synthetic */ RecipientPermissionsViewModel $recipientPermissionsViewModel;
    public final /* synthetic */ C1BO<RecipientPermissionsUiState> $state$delegate;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$topPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$topPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ RecipientPermissionsViewModel $recipientPermissionsViewModel;
        public final /* synthetic */ C1BO<RecipientPermissionsUiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RecipientPermissionsViewModel recipientPermissionsViewModel, C1BO<RecipientPermissionsUiState> c1bo) {
            super(3);
            this.$recipientPermissionsViewModel = recipientPermissionsViewModel;
            this.$state$delegate = c1bo;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean z = this.$state$delegate.getValue().isLoading;
            boolean z2 = this.$state$delegate.getValue().loadFailed;
            boolean zIsEmpty = this.$state$delegate.getValue().groups.isEmpty();
            RecipientPermissionsViewModel recipientPermissionsViewModel = this.$recipientPermissionsViewModel;
            boolean zA67 = bfm.A67(recipientPermissionsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$3$1$1(recipientPermissionsViewModel);
                bfm.Ai0(objAaT);
            }
            HatchRecipientPermissionsScreenKt.RecipientPermissionsStatus(z, z2, zIsEmpty, (Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 16);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.skills.view.HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding + 16.0f);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass1(this.$topPadding), 793109200, true));
        c0cd.APJ(null, null, ComposableSingletons$HatchRecipientPermissionsScreenKt.lambda$417448249);
        AHD<RecipientPermissionGroup> ahd = this.$state$delegate.getValue().groups;
        String str = this.$connectorId;
        String str2 = this.$connectorName;
        RecipientPermissionsViewModel recipientPermissionsViewModel = this.$recipientPermissionsViewModel;
        C1BO<RecipientPermissionsUiState> c1bo = this.$state$delegate;
        for (RecipientPermissionGroup recipientPermissionGroup : ahd) {
            HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, FGI.A0M("action:", recipientPermissionGroup.actionKey), null, B1V.A01(new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$1(recipientPermissionGroup), -262350832, true), null, new HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1$2$2(recipientPermissionGroup, str, str2, recipientPermissionsViewModel, c1bo));
        }
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass3(this.$recipientPermissionsViewModel, this.$state$delegate), 281420952, true));
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass4(this.$bottomPadding), 145393655, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRecipientPermissionsScreenKt$HatchRecipientPermissionsScreen$2$1$1(float f, C1BO<RecipientPermissionsUiState> c1bo, String str, String str2, RecipientPermissionsViewModel recipientPermissionsViewModel, float f2) {
        super(1);
        this.$topPadding = f;
        this.$state$delegate = c1bo;
        this.$connectorId = str;
        this.$connectorName = str2;
        this.$recipientPermissionsViewModel = recipientPermissionsViewModel;
        this.$bottomPadding = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
