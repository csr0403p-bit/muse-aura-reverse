package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.C0dx;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$3$12$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetKt$HatchShareSheet$3$12$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C0dx $haptics;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            HatchShareSheetKt.copyLinkToClipboard(this.$context, str, this.$haptics);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, C0dx c0dx) {
            super(1);
            this.$context = context;
            this.$haptics = c0dx;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$3$12$1(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, C0dx c0dx) {
        super(0);
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$haptics = c0dx;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.copyIdeaShareLink(new AnonymousClass1(this.$context, this.$haptics));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
