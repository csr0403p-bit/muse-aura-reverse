package com.facebook.aura.widgets;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import com.facebook.aura.widgets.SpaceWidgetPickerUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class SpaceWidgetPickerViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<SpaceWidgetPickerUiState> _uiState;
    public final Context appContext;
    public final C1BN<SpaceWidgetPickerUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetPickerViewModel$1", f = "SpaceWidgetPickerViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceWidgetPickerViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG blg;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                SpaceWidgetPickerViewModel spaceWidgetPickerViewModel = SpaceWidgetPickerViewModel.this;
                blg = spaceWidgetPickerViewModel._uiState;
                this.L$0 = blg;
                this.label = 1;
                obj = spaceWidgetPickerViewModel.loadSpaces(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            blg.Af8(obj);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceWidgetPickerViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<SpaceWidgetPickerViewModel> {
        public static final int $stable = 8;
        public final Context appContext;

        public Factory(Context context) {
            C7384Etj.A0Y(context, 0);
            this.appContext = context;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new SpaceWidgetPickerViewModel(this.appContext);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SpaceWidgetPickerViewModel create() {
            return new SpaceWidgetPickerViewModel(this.appContext);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetPickerViewModel", f = "SpaceWidgetPickerViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "loadSpaces", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$1, reason: invalid class name and case insensitive filesystem */
    public final class C144111 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C144111(HtJ<? super C144111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceWidgetPickerViewModel.this.loadSpaces(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$2", f = "SpaceWidgetPickerViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchSpacesDataSource $dataSource;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$dataSource = hatchSpacesDataSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$dataSource, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSpacesDataSource hatchSpacesDataSource = this.$dataSource;
                this.label = 1;
                if (hatchSpacesDataSource.loadSpacesData(false, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$dataSource, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SpaceWidgetPickerViewModel(Context context) {
        C7384Etj.A0Y(context, 0);
        this.appContext = context;
        C9286GCn c9286GCnA01 = HnJ.A01(SpaceWidgetPickerUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = new C3Pi(null, c9286GCnA01);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadSpaces(X.HtJ<? super com.facebook.aura.widgets.SpaceWidgetPickerUiState> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.widgets.SpaceWidgetPickerViewModel.C144111
            if (r0 == 0) goto L86
            r6 = r8
            com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$1 r6 = (com.facebook.aura.widgets.SpaceWidgetPickerViewModel.C144111) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 == r1) goto L5f
            if (r0 != r4) goto L9f
            java.lang.Object r3 = r6.L$1
            com.facebook.aura.spaces.repo.HatchSpacesDataSource r3 = (com.facebook.aura.spaces.repo.HatchSpacesDataSource) r3
            X.Hwg.A00(r2)
        L27:
            X.1BN<com.facebook.aura.spaces.repo.HatchSpacesData> r0 = r3.data
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.spaces.repo.HatchSpacesData r0 = (com.facebook.aura.spaces.repo.HatchSpacesData) r0
            X.AHD<com.facebook.aura.spaces.repo.SpaceCard> r0 = r0.spaceCards
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.spaces.repo.SpaceCard r0 = (com.facebook.aura.spaces.repo.SpaceCard) r0
            boolean r0 = com.facebook.aura.widgets.SpaceWidgetRefresherKt.canShowInWidget(r0)
            if (r0 == 0) goto L3a
            r3.add(r1)
            goto L3a
        L51:
            X.Hwg.A00(r2)
            android.content.Context r0 = r7.appContext
            r6.label = r1
            java.lang.Object r2 = com.facebook.aura.widgets.WidgetSessionKt.awaitWidgetSession(r0, r6)
            if (r2 != r5) goto L62
            return r5
        L5f:
            X.Hwg.A00(r2)
        L62:
            X.CGz r2 = (X.AbstractC3358CGz) r2
            if (r2 != 0) goto L69
            com.facebook.aura.widgets.SpaceWidgetPickerUiState$SignedOut r1 = com.facebook.aura.widgets.SpaceWidgetPickerUiState.SignedOut.INSTANCE
            return r1
        L69:
            com.facebook.aura.spaces.repo.HatchSpacesDataSource$Companion r0 = com.facebook.aura.spaces.repo.HatchSpacesDataSource.Companion
            com.facebook.aura.spaces.repo.HatchSpacesDataSource r3 = r0.getInstance(r2)
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$2 r0 = new com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$2
            r0.<init>(r3, r1)
            r6.L$0 = r1
            r6.L$1 = r3
            r6.label = r4
            java.lang.Object r0 = X.GAo.A00(r6, r2, r0)
            if (r0 != r5) goto L27
            return r5
        L86:
            com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$1 r6 = new com.facebook.aura.widgets.SpaceWidgetPickerViewModel$loadSpaces$1
            r6.<init>(r8)
            goto L12
        L8c:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L95
            com.facebook.aura.widgets.SpaceWidgetPickerUiState$Empty r1 = com.facebook.aura.widgets.SpaceWidgetPickerUiState.Empty.INSTANCE
            return r1
        L95:
            X.AHD r0 = X.AGI.A07(r3)
            com.facebook.aura.widgets.SpaceWidgetPickerUiState$Loaded r1 = new com.facebook.aura.widgets.SpaceWidgetPickerUiState$Loaded
            r1.<init>(r0)
            return r1
        L9f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.SpaceWidgetPickerViewModel.loadSpaces(X.HtJ):java.lang.Object");
    }

    public final C1BN<SpaceWidgetPickerUiState> getUiState() {
        return this.uiState;
    }
}
