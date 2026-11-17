package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BFM;
import X.C16n;
import X.C1BN;
import X.C3UX;
import X.C60Q;
import X.C60R;
import X.C60S;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.HwV;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.library.repo.GoalsState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class GoalsListWidget extends ListWidget {
    public static final int $stable = 0;
    public static final int emptyRes = 2131888805;
    public static final int fallbackIconRes = 2131230908;
    public static final int loadFailedRes = 2131888807;
    public static final Class<GoalsWidgetReceiver> receiver = GoalsWidgetReceiver.class;
    public static final int signedOutRes = 2131888817;
    public static final int titleRes = 2131888806;
    public static final GoalsListWidget INSTANCE = new GoalsListWidget();
    public static final HatchWidgetKind kind = HatchWidgetKind.GOALS;
    public static final long previewSize = C16n.A00(330.0f, 270.0f);

    @DebugMetadata(c = "com.facebook.aura.widgets.GoalsListWidget", f = "GoalsListWidget.kt", l = {96}, m = "awaitLoadedGoals", v = 2)
    /* renamed from: com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$1, reason: invalid class name */
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
            return GoalsListWidget.this.awaitLoadedGoals(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$2", f = "GoalsListWidget.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super GoalsState>, Object> {
        public final /* synthetic */ C1BN<GoalsState> $this_awaitLoadedGoals;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$2$1", f = "GoalsListWidget.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<GoalsState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                GoalsState goalsState = (GoalsState) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(GoalsListWidgetKt.SETTLED_LOADING_STATES.contains(goalsState.loadingState));
            }

            @Override // X.G0V
            public final Object invoke(GoalsState goalsState, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = goalsState;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C1BN<GoalsState> c1bn, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$this_awaitLoadedGoals = c1bn;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$this_awaitLoadedGoals, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<GoalsState> c1bn = this.$this_awaitLoadedGoals;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super GoalsState> htJ) {
            return new AnonymousClass2(this.$this_awaitLoadedGoals, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.GoalsListWidget", f = "GoalsListWidget.kt", l = {64, LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE, MessageDraftSenderKt.UNICODE_MULTIPART_CHARS, 68}, m = "loadItems", v = 2)
    /* renamed from: com.facebook.aura.widgets.GoalsListWidget$loadItems$1, reason: invalid class name and case insensitive filesystem */
    public final class C143821 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C143821(HtJ<? super C143821> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoalsListWidget.this.loadItems(null, null, null, this);
        }
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public Uri itemUri(String str) {
        C7384Etj.A0Y(str, 0);
        return C60R.A0B(WidgetComponentsKt.auraUri("goals"), "id", str);
    }

    public GoalsListWidget() {
        super("goals", "goal_widgets");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitLoadedGoals(X.C1BN<com.facebook.aura.library.repo.GoalsState> r7, X.HtJ<? super java.util.List<com.facebook.aura.library.repo.Goal>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.widgets.GoalsListWidget.AnonymousClass1
            if (r0 == 0) goto L43
            r5 = r8
            com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$1 r5 = (com.facebook.aura.widgets.GoalsListWidget.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L49
            X.Hwg.A00(r2)
        L21:
            com.facebook.aura.library.repo.GoalsState r2 = (com.facebook.aura.library.repo.GoalsState) r2
            if (r2 == 0) goto L2d
            com.facebook.aura.library.repo.LoadingState r1 = r2.loadingState
            com.facebook.aura.library.repo.LoadingState r0 = com.facebook.aura.library.repo.LoadingState.SUCCESS
            if (r1 != r0) goto L2d
            X.AHD<com.facebook.aura.library.repo.Goal> r3 = r2.goals
        L2d:
            return r3
        L2e:
            X.Hwg.A00(r2)
            com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$2 r2 = new com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$2
            r2.<init>(r7, r3)
            r5.L$0 = r3
            r5.label = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.GAX.A01(r5, r2, r0)
            if (r2 != r4) goto L21
            return r4
        L43:
            com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$1 r5 = new com.facebook.aura.widgets.GoalsListWidget$awaitLoadedGoals$1
            r5.<init>(r8)
            goto L12
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.GoalsListWidget.awaitLoadedGoals(X.1BN, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getEmptyRes() {
        return emptyRes;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getFallbackIconRes() {
        return fallbackIconRes;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public HatchWidgetKind getKind() {
        return kind;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getLoadFailedRes() {
        return loadFailedRes;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /* renamed from: getPreviewSize-MYxV2XQ */
    public long mo3155getPreviewSizeMYxV2XQ() {
        return previewSize;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Class<GoalsWidgetReceiver> getReceiver() {
        return receiver;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getSignedOutRes() {
        return signedOutRes;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public int getTitleRes() {
        return titleRes;
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public Uri listUri() {
        return C60R.A0D("goals");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0120, code lost:
    
        if (r0 != r6) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    @Override // com.facebook.aura.widgets.ListWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loadItems(android.content.Context r10, X.AbstractC3358CGz r11, com.facebook.aura.widgets.ListWidgetIcons r12, X.HtJ<? super java.util.List<com.facebook.aura.widgets.ListWidgetItemJson>> r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.GoalsListWidget.loadItems(android.content.Context, X.CGz, com.facebook.aura.widgets.ListWidgetIcons, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public GlanceAppWidget newGlanceWidget() {
        return new GoalsWidget();
    }

    @Override // com.facebook.aura.widgets.ListWidget
    public List<ListWidgetItemJson> previewItems(BFM bfm, int i) throws Resources.NotFoundException {
        bfm.AgE(2131898057);
        Context contextA08 = C60Q.A08(bfm);
        List listAsList = Arrays.asList(new HwV(Integer.valueOf(R.string._name_removed__res_0x7f120aa8), Integer.valueOf(R.string._name_removed__res_0x7f120aaa), Integer.valueOf(R.string._name_removed__res_0x7f120aa9)), new HwV(Integer.valueOf(R.string._name_removed__res_0x7f120aae), Integer.valueOf(R.string._name_removed__res_0x7f120ab0), Integer.valueOf(R.string._name_removed__res_0x7f120aaf)), new HwV(Integer.valueOf(R.string._name_removed__res_0x7f120aab), Integer.valueOf(R.string._name_removed__res_0x7f120aad), Integer.valueOf(R.string._name_removed__res_0x7f120aac)));
        ArrayList arrayListA0i = AnonymousClass003.A0i(listAsList);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            C60S.A03(contextA08, bfm, arrayListA0i, it);
        }
        AnonymousClass001.A1D(bfm);
        return arrayListA0i;
    }
}
