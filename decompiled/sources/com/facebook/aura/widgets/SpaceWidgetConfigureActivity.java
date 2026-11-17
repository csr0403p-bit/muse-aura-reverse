package com.facebook.aura.widgets;

import X.A6J;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.Ap7;
import X.B1V;
import X.BAC;
import X.BFM;
import X.BJt;
import X.BMW;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.EnumC10460Hji;
import X.F0C;
import X.F31;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC7353EnQ;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.ui.adaptive.AuraAdaptiveInfoKt;
import com.facebook.aura.vds.compose.theme.root.AuraRootKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceWidgetConfigureActivity extends ComponentActivity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int appWidgetId;
    public final F0C viewModel$delegate;

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetConfigureActivity$addSpace$1", f = "SpaceWidgetConfigureActivity.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetConfigureActivity$addSpace$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SpaceCard $card;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SpaceCard spaceCard, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$card = spaceCard;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceWidgetConfigureActivity.this.new AnonymousClass1(this.$card, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpaceWidgetRefresher spaceWidgetRefresher = SpaceWidgetRefresher.INSTANCE;
                SpaceWidgetConfigureActivity spaceWidgetConfigureActivity = SpaceWidgetConfigureActivity.this;
                int i2 = spaceWidgetConfigureActivity.appWidgetId;
                SpaceCard spaceCard = this.$card;
                this.label = 1;
                if (spaceWidgetRefresher.select(spaceWidgetConfigureActivity, i2, spaceCard, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SpaceWidgetConfigureActivity.this.setResult(-1, new Intent().putExtra("appWidgetId", SpaceWidgetConfigureActivity.this.appWidgetId));
            SpaceWidgetConfigureActivity.this.finish();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetConfigureActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    public final class C144031 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {

        /* renamed from: com.facebook.aura.widgets.SpaceWidgetConfigureActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04481 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SpaceWidgetConfigureActivity this$0;

            /* renamed from: com.facebook.aura.widgets.SpaceWidgetConfigureActivity$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public final class C04491 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ SpaceWidgetConfigureActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04491(SpaceWidgetConfigureActivity spaceWidgetConfigureActivity) {
                    super(2);
                    this.this$0 = spaceWidgetConfigureActivity;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                        SpaceWidgetPickerViewModel viewModel = this.this$0.getViewModel();
                        SpaceWidgetConfigureActivity spaceWidgetConfigureActivity = this.this$0;
                        boolean zA67 = bfm.A67(spaceWidgetConfigureActivity);
                        Object objAaT = bfm.AaT();
                        if (zA67 || objAaT == C78N.A00) {
                            objAaT = new SpaceWidgetConfigureActivity$onCreate$1$1$1$1$1(spaceWidgetConfigureActivity);
                            bfm.Ai0(objAaT);
                        }
                        G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                        SpaceWidgetConfigureActivity spaceWidgetConfigureActivity2 = this.this$0;
                        boolean zA672 = bfm.A67(spaceWidgetConfigureActivity2);
                        Object objAaT2 = bfm.AaT();
                        if (zA672 || objAaT2 == C78N.A00) {
                            objAaT2 = new SpaceWidgetConfigureActivity$onCreate$1$1$1$2$1(spaceWidgetConfigureActivity2);
                            bfm.Ai0(objAaT2);
                        }
                        SpaceWidgetPickerScreenKt.SpaceWidgetPickerScreen(viewModel, g0u, (Function0) ((InterfaceC7353EnQ) objAaT2), null, bfm, SpaceWidgetPickerViewModel.$stable, 8);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04481(SpaceWidgetConfigureActivity spaceWidgetConfigureActivity) {
                super(2);
                this.this$0 = spaceWidgetConfigureActivity;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    AuraRootKt.AuraRoot(null, null, B1V.A00(bfm, new C04491(this.this$0), 1673475530), bfm, 384, 3);
                } else {
                    bfm.Afo();
                }
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        public C144031() {
            super(2);
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraAdaptiveInfoKt.ProvideAuraAdaptiveInfo(B1V.A00(bfm, new C04481(SpaceWidgetConfigureActivity.this), -1261418794), bfm, 6);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpaceWidgetPickerViewModel getViewModel() {
        return (SpaceWidgetPickerViewModel) this.viewModel$delegate.getValue();
    }

    private final boolean isOwnSpaceWidget(int i) {
        if (i != 0) {
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this).getAppWidgetInfo(i);
            if (C7384Etj.areEqual(appWidgetInfo != null ? appWidgetInfo.provider : null, new ComponentName(this, (Class<?>) SpaceWidgetReceiver.class))) {
                return true;
            }
        }
        return false;
    }

    public final class Companion {
        public final Intent reconfigureIntent(Context context, int i) {
            C7384Etj.A0Y(context, 0);
            Intent intentPutExtra = new Intent(context, (Class<?>) SpaceWidgetConfigureActivity.class).setAction("android.appwidget.action.APPWIDGET_CONFIGURE").setData(Uri.fromParts("aura-space-widget-configure", String.valueOf(i), null)).putExtra("appWidgetId", i);
            C7384Etj.A0U(intentPutExtra);
            return intentPutExtra;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceWidgetConfigureActivity() {
        final Function0 function0 = null;
        this.viewModel$delegate = new BMW(new Function0<BJt>() { // from class: com.facebook.aura.widgets.SpaceWidgetConfigureActivity$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BJt invoke() {
                return this.getViewModelStore();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ BJt invoke() {
                return this.getViewModelStore();
            }
        }, new SpaceWidgetConfigureActivity$viewModel$2(this), new Function0<A6J>() { // from class: com.facebook.aura.widgets.SpaceWidgetConfigureActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final A6J invoke() {
                A6J a6j;
                Function0 function02 = function0;
                return (function02 == null || (a6j = (A6J) function02.invoke()) == null) ? this.getDefaultViewModelCreationExtras() : a6j;
            }
        }, C3cG.A0x(SpaceWidgetPickerViewModel.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSpace(SpaceCard spaceCard) {
        AnonymousClass001.A1J(new AnonymousClass1(spaceCard, null), F31.A00(this));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BAC.A00(this);
        setResult(0);
        int intExtra = getIntent().getIntExtra("appWidgetId", 0);
        this.appWidgetId = intExtra;
        if (isOwnSpaceWidget(intExtra)) {
            Ap7.A00(this, AnonymousClass001.A0M(new C144031(), 1132510675));
        } else {
            finish();
        }
    }
}
