package com.facebook.aura.bugreport;

import X.A6H;
import X.A6J;
import X.A6N;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BFI;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.accountcenter.MC;
import com.facebook.aura.browsertask.control.BrowserTaskStopKt;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraBugReportReviewViewEffect;
import com.facebook.aura.bugreport.AuraVmLogFetchState;
import com.facebook.aura.bugreport.AuraVmLogOutcome;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AuraBugReportReviewViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<AuraBugReportReviewUiState> _uiState;
    public final C3Em<AuraBugReportReviewViewEffect> _viewEffects;
    public final Context appContext;
    public HoC collectionJob;
    public HoC deleteJob;
    public final Set<String> deletedItemNames;
    public HoC downloadJob;
    public final String endpoint;
    public final SnapshotStateList<LogLine> previewLines;
    public HoC previewReadJob;
    public HoC replaceJob;
    public final A6N savedStateHandle;
    public final String submissionId;
    public boolean submitted;
    public final C1BN<AuraBugReportReviewUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C22I<AuraBugReportReviewViewEffect> viewEffects;
    public HoC vmLogJob;

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$deleteItem$2", f = "AuraBugReportReviewViewModel.kt", l = {366, 367}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$deleteItem$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$deleteItem$2$1", f = "AuraBugReportReviewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$deleteItem$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AuraBugReportCollector.CollectedItem collectedItem, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$item = collectedItem;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$item, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(this.$item.file.delete());
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new AnonymousClass1(this.$item, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraBugReportCollector.CollectedItem collectedItem, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$item = collectedItem;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBugReportReviewViewModel.this.new AnonymousClass2(this.$item, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, null);
                this.label = 1;
                if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            C3Em<AuraBugReportReviewViewEffect> c3Em = AuraBugReportReviewViewModel.this._viewEffects;
            AuraBugReportReviewViewEffect.Deleted deleted = AuraBugReportReviewViewEffect.Deleted.INSTANCE;
            this.label = 2;
            if (c3Em.emit(deleted, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$fetchVmLogs$2", f = "AuraBugReportReviewViewModel.kt", l = {205, 209, 227}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$fetchVmLogs$2, reason: invalid class name and case insensitive filesystem */
    public final class C110062 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HoC $previousFetch;
        public final /* synthetic */ AbstractC3358CGz $session;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$fetchVmLogs$2$1", f = "AuraBugReportReviewViewModel.kt", l = {205}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$fetchVmLogs$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HoC $previousFetch;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HoC hoC, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$previousFetch = hoC;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$previousFetch, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HoC hoC = this.$previousFetch;
                    if (hoC == null) {
                        return null;
                    }
                    this.label = 1;
                    if (hoC.APQ(this) == enumC10460Hji) {
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
                return new AnonymousClass1(this.$previousFetch, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$fetchVmLogs$2$2", f = "AuraBugReportReviewViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$fetchVmLogs$2$2, reason: invalid class name and collision with other inner class name */
        public final class C00552 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ AuraVmLogOutcome $outcome;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00552(AuraVmLogOutcome auraVmLogOutcome, HtJ<? super C00552> htJ) {
                super(2, htJ);
                this.$outcome = auraVmLogOutcome;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00552(this.$outcome, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(((AuraVmLogOutcome.Success) this.$outcome).file.delete());
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C00552(this.$outcome, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110062(AbstractC3358CGz abstractC3358CGz, HoC hoC, HtJ<? super C110062> htJ) {
            super(2, htJ);
            this.$session = abstractC3358CGz;
            this.$previousFetch = hoC;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C110062 c110062 = AuraBugReportReviewViewModel.this.new C110062(this.$session, this.$previousFetch, htJ);
            c110062.L$0 = obj;
            return c110062;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0121  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportReviewViewModel.C110062.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C110062) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$openPreview$3", f = "AuraBugReportReviewViewModel.kt", l = {395}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$openPreview$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraBugReportCollector.CollectedItem collectedItem, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$item = collectedItem;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBugReportReviewViewModel.this.new AnonymousClass3(this.$item, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraBugReportReviewUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                C78T c78tA0s = AnonymousClass002.A0s(obj);
                AuraBugReportReviewViewModel$openPreview$3$lines$1 auraBugReportReviewViewModel$openPreview$3$lines$1 = new AuraBugReportReviewViewModel$openPreview$3$lines$1(this.$item, null);
                this.label = 1;
                obj = GAo.A00(this, c78tA0s, auraBugReportReviewViewModel$openPreview$3$lines$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AuraBugReportReviewViewModel.this.previewLines.addAll((Collection) obj);
            BLG<AuraBugReportReviewUiState> blg = AuraBugReportReviewViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, AuraBugReportReviewUiState.copy$default(value, false, false, false, null, null, false, null, null, null, 479, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$replaceItem$1", f = "AuraBugReportReviewViewModel.kt", l = {285}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$replaceItem$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBugReportReviewViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C3Em<AuraBugReportReviewViewEffect> c3Em = AuraBugReportReviewViewModel.this._viewEffects;
                AuraBugReportReviewViewEffect.ReplaceFailed replaceFailed = AuraBugReportReviewViewEffect.ReplaceFailed.INSTANCE;
                this.label = 1;
                if (c3Em.emit(replaceFailed, this) == enumC10460Hji) {
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
            return AuraBugReportReviewViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$replaceItem$3", f = "AuraBugReportReviewViewModel.kt", l = {292, 296, 324}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$replaceItem$3, reason: invalid class name and case insensitive filesystem */
    public final class C110073 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
        public final /* synthetic */ Uri $source;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110073(AuraBugReportCollector.CollectedItem collectedItem, Uri uri, HtJ<? super C110073> htJ) {
            super(2, htJ);
            this.$item = collectedItem;
            this.$source = uri;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBugReportReviewViewModel.this.new C110073(this.$item, this.$source, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:7:0x0013, B:17:0x0054, B:18:0x0057, B:20:0x005d, B:21:0x0063, B:22:0x0074, B:24:0x007a, B:26:0x008e, B:28:0x0099, B:29:0x009b, B:30:0x00af, B:31:0x00b3, B:33:0x00d5, B:37:0x00e2, B:34:0x00d8, B:36:0x00e0, B:40:0x00f4, B:42:0x00fc, B:49:0x010d, B:50:0x0112, B:13:0x0037, B:14:0x003a, B:10:0x0020), top: B:58:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:7:0x0013, B:17:0x0054, B:18:0x0057, B:20:0x005d, B:21:0x0063, B:22:0x0074, B:24:0x007a, B:26:0x008e, B:28:0x0099, B:29:0x009b, B:30:0x00af, B:31:0x00b3, B:33:0x00d5, B:37:0x00e2, B:34:0x00d8, B:36:0x00e0, B:40:0x00f4, B:42:0x00fc, B:49:0x010d, B:50:0x0112, B:13:0x0037, B:14:0x003a, B:10:0x0020), top: B:58:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:0: B:45:0x0104->B:60:?, LOOP_END, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportReviewViewModel.C110073.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C110073) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$saveItemToDownloads$2", f = "AuraBugReportReviewViewModel.kt", l = {260, MC.mwa_accounts_center_settings.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$saveItemToDownloads$2, reason: invalid class name and case insensitive filesystem */
    public final class C110082 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $item;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110082(AuraBugReportCollector.CollectedItem collectedItem, HtJ<? super C110082> htJ) {
            super(2, htJ);
            this.$item = collectedItem;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBugReportReviewViewModel.this.new C110082(this.$item, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:21:0x004a->B:34:?, LOOP_END, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 2
                r4 = 1
                if (r0 == 0) goto L10
                if (r0 == r4) goto L28
                if (r0 != r5) goto L5f
                X.Hwg.A00(r8)     // Catch: java.lang.Throwable -> L53
                goto L46
            L10:
                X.Hwg.A00(r8)
                com.facebook.aura.bugreport.AuraBugReportCollector r3 = com.facebook.aura.bugreport.AuraBugReportCollector.INSTANCE     // Catch: java.lang.Throwable -> L53
                com.facebook.aura.bugreport.AuraBugReportReviewViewModel r0 = com.facebook.aura.bugreport.AuraBugReportReviewViewModel.this     // Catch: java.lang.Throwable -> L53
                android.content.Context r2 = r0.appContext     // Catch: java.lang.Throwable -> L53
                com.facebook.aura.bugreport.AuraBugReportCollector$CollectedItem r0 = r7.$item     // Catch: java.lang.Throwable -> L53
                java.io.File r1 = r0.file     // Catch: java.lang.Throwable -> L53
                java.lang.String r0 = "text/plain"
                r7.label = r4     // Catch: java.lang.Throwable -> L53
                java.lang.Object r8 = r3.saveItemToDownloads(r2, r1, r0, r7)     // Catch: java.lang.Throwable -> L53
                if (r8 != r6) goto L2b
                return r6
            L28:
                X.Hwg.A00(r8)     // Catch: java.lang.Throwable -> L53
            L2b:
                boolean r2 = X.AnonymousClass001.A1X(r8)     // Catch: java.lang.Throwable -> L53
                com.facebook.aura.bugreport.AuraBugReportReviewViewModel r0 = com.facebook.aura.bugreport.AuraBugReportReviewViewModel.this     // Catch: java.lang.Throwable -> L53
                X.3Em<com.facebook.aura.bugreport.AuraBugReportReviewViewEffect> r1 = r0._viewEffects     // Catch: java.lang.Throwable -> L53
                if (r2 == 0) goto L42
                com.facebook.aura.bugreport.AuraBugReportReviewViewEffect$DownloadSucceeded r0 = com.facebook.aura.bugreport.AuraBugReportReviewViewEffect.DownloadSucceeded.INSTANCE     // Catch: java.lang.Throwable -> L53
            L37:
                r7.Z$0 = r2     // Catch: java.lang.Throwable -> L53
                r7.label = r5     // Catch: java.lang.Throwable -> L53
                java.lang.Object r0 = r1.emit(r0, r7)     // Catch: java.lang.Throwable -> L53
                if (r0 != r6) goto L46
                goto L45
            L42:
                com.facebook.aura.bugreport.AuraBugReportReviewViewEffect$DownloadFailed r0 = com.facebook.aura.bugreport.AuraBugReportReviewViewEffect.DownloadFailed.INSTANCE     // Catch: java.lang.Throwable -> L53
                goto L37
            L45:
                return r6
            L46:
                com.facebook.aura.bugreport.AuraBugReportReviewViewModel r0 = com.facebook.aura.bugreport.AuraBugReportReviewViewModel.this
                X.BLG<com.facebook.aura.bugreport.AuraBugReportReviewUiState> r1 = r0._uiState
            L4a:
                boolean r0 = X.C06G.A0v(r1)
                if (r0 == 0) goto L4a
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L53:
                r2 = move-exception
                com.facebook.aura.bugreport.AuraBugReportReviewViewModel r0 = com.facebook.aura.bugreport.AuraBugReportReviewViewModel.this
                X.BLG<com.facebook.aura.bugreport.AuraBugReportReviewUiState> r1 = r0._uiState
            L58:
                boolean r0 = X.C06G.A0v(r1)
                if (r0 != 0) goto L63
                goto L58
            L5f:
                java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            L63:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraBugReportReviewViewModel.C110082.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C110082) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.bugreport.AuraBugReportReviewViewModel$setIncludeLogs$4", f = "AuraBugReportReviewViewModel.kt", l = {164}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.bugreport.AuraBugReportReviewViewModel$setIncludeLogs$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraBugReportReviewViewModel.this.new AnonymousClass4(htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [X.AGi] */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ?? A0i;
            AuraBugReportReviewUiState value;
            AuraBugReportReviewUiState auraBugReportReviewUiState;
            ArrayList arrayList;
            Object objCollect = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objCollect);
                    AuraBugReportCollector auraBugReportCollector = AuraBugReportCollector.INSTANCE;
                    AuraBugReportReviewViewModel auraBugReportReviewViewModel = AuraBugReportReviewViewModel.this;
                    Context context = auraBugReportReviewViewModel.appContext;
                    AbstractC3358CGz abstractC3358CGz = auraBugReportReviewViewModel.userSession;
                    String str = auraBugReportReviewViewModel.submissionId;
                    String str2 = auraBugReportReviewViewModel.endpoint;
                    this.label = 1;
                    objCollect = auraBugReportCollector.collect(context, abstractC3358CGz, str, str2, this);
                    if (objCollect == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objCollect);
                }
                Iterable<AuraBugReportCollector.CollectedItem> iterable = (Iterable) objCollect;
                A0i = AnonymousClass003.A0i(iterable);
                for (AuraBugReportCollector.CollectedItem collectedItem : iterable) {
                    AuraBugReportCollector.CollectedItemKind collectedItemKind = collectedItem.kind;
                    if (collectedItemKind == AuraBugReportCollector.CollectedItemKind.LOGCAT) {
                        collectedItemKind = AuraBugReportCollector.CollectedItemKind.DIAGNOSTICS;
                    }
                    File file = collectedItem.file;
                    long j = collectedItem.sizeBytes;
                    String str3 = collectedItem.pickedName;
                    AnonymousClass003.A0u(collectedItemKind, file);
                    A0i.add(new AuraBugReportCollector.CollectedItem(collectedItemKind, file, j, str3));
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(AuraBugReportReviewViewModelKt.TAG, FGI.A0M("Failed to collect diagnostics for ", AuraBugReportReviewViewModel.this.submissionId), e2);
                A0i = C0881AGi.A00;
            }
            BLG<AuraBugReportReviewUiState> blg = AuraBugReportReviewViewModel.this._uiState;
            do {
                value = blg.getValue();
                auraBugReportReviewUiState = value;
                AHD<AuraBugReportCollector.CollectedItem> ahd = auraBugReportReviewUiState.items;
                arrayList = new ArrayList();
                for (Object obj2 : ahd) {
                    if (((AuraBugReportCollector.CollectedItem) obj2).kind == AuraBugReportCollector.CollectedItemKind.VM_LOGS) {
                        arrayList.add(obj2);
                    }
                }
            } while (!blg.A6e(value, auraBugReportReviewUiState.copy(auraBugReportReviewUiState.isConfidentialOrUnclassified, auraBugReportReviewUiState.includeLogs, false, AGI.A07(AbstractC0878AGe.A0P(arrayList, A0i)), auraBugReportReviewUiState.previewTitle, auraBugReportReviewUiState.isPreviewLoading, auraBugReportReviewUiState.previewTooLargeItem, auraBugReportReviewUiState.vmLogFetch, auraBugReportReviewUiState.busyItem)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraBugReportReviewViewModel.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraBugReportReviewViewModel(Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2, A6N a6n) {
        Object value;
        AnonymousClass002.A1A(context, 0, str);
        C7384Etj.A0Y(a6n, 4);
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        this.submissionId = str;
        this.endpoint = str2;
        this.savedStateHandle = a6n;
        C9286GCn c9286GCn = new C9286GCn(new AuraBugReportReviewUiState(false, false, false, AHI.A01, null, false, null, AuraVmLogFetchState.Idle.INSTANCE, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._viewEffects = c9290GCr;
        this.viewEffects = new C3pd(c9290GCr);
        this.deletedItemNames = new LinkedHashSet();
        this.previewLines = new SnapshotStateList();
        do {
            value = c9286GCn.getValue();
        } while (!c9286GCn.A6e(value, AuraBugReportReviewUiState.copy$default((AuraBugReportReviewUiState) value, isConfidentialOrUnclassified(), false, false, null, null, false, null, null, null, 510, null)));
        Boolean bool = (Boolean) this.savedStateHandle.A01(AuraBugReportReviewViewModelKt.INCLUDE_LOGS_KEY);
        setIncludeLogs(bool != null ? bool.booleanValue() : true);
    }

    public final void deleteItem(AuraBugReportCollector.CollectedItem collectedItem) {
        AuraBugReportReviewUiState value;
        AuraBugReportReviewUiState auraBugReportReviewUiState;
        ArrayList arrayList;
        HoC hoC;
        C7384Etj.A0Y(collectedItem, 0);
        if (this._uiState.getValue().busyItem == null) {
            this.deletedItemNames.add(collectedItem.getName());
            BLG<AuraBugReportReviewUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                auraBugReportReviewUiState = value;
                AHD<AuraBugReportCollector.CollectedItem> ahd = auraBugReportReviewUiState.items;
                arrayList = new ArrayList();
                for (Object obj : ahd) {
                    AnonymousClass006.A1O(((AuraBugReportCollector.CollectedItem) obj).getName(), collectedItem.getName(), obj, arrayList);
                }
            } while (!blg.A6e(value, AuraBugReportReviewUiState.copy$default(auraBugReportReviewUiState, false, false, false, AGI.A07(arrayList), null, false, null, null, null, BrowserTaskStopKt.HTTP_SERVICE_UNAVAILABLE, null)));
            if (collectedItem.kind == AuraBugReportCollector.CollectedItemKind.VM_LOGS && (hoC = this.vmLogJob) != null) {
                hoC.A5w(null);
            }
            this.deleteJob = AnonymousClass001.A11(new AnonymousClass2(collectedItem, null), AEu.A00(this));
        }
    }

    public final List<HoC> onSubmitted() {
        this.submitted = true;
        HoC hoC = this.vmLogJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.collectionJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.replaceJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        return BFI.A0F(new HoC[]{this.collectionJob, this.vmLogJob, this.downloadJob, this.deleteJob, this.replaceJob});
    }

    public final void openPreview(AuraBugReportCollector.CollectedItem collectedItem) {
        AuraBugReportReviewUiState value;
        AuraBugReportReviewUiState auraBugReportReviewUiState;
        AuraBugReportReviewUiState value2;
        AuraBugReportReviewUiState auraBugReportReviewUiState2;
        C7384Etj.A0Y(collectedItem, 0);
        HoC hoC = this.previewReadJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.previewLines.clear();
        long j = collectedItem.sizeBytes;
        BLG<AuraBugReportReviewUiState> blg = this._uiState;
        if (j > AuraBugReportReviewViewModelKt.MAX_PREVIEW_BYTES) {
            do {
                value2 = blg.getValue();
                auraBugReportReviewUiState2 = value2;
            } while (!blg.A6e(value2, auraBugReportReviewUiState2.copy(auraBugReportReviewUiState2.isConfidentialOrUnclassified, auraBugReportReviewUiState2.includeLogs, auraBugReportReviewUiState2.isCollecting, auraBugReportReviewUiState2.items, collectedItem.getDisplayName(), false, collectedItem, auraBugReportReviewUiState2.vmLogFetch, auraBugReportReviewUiState2.busyItem)));
            return;
        }
        do {
            value = blg.getValue();
            auraBugReportReviewUiState = value;
        } while (!blg.A6e(value, auraBugReportReviewUiState.copy(auraBugReportReviewUiState.isConfidentialOrUnclassified, auraBugReportReviewUiState.includeLogs, auraBugReportReviewUiState.isCollecting, auraBugReportReviewUiState.items, collectedItem.getDisplayName(), true, null, auraBugReportReviewUiState.vmLogFetch, auraBugReportReviewUiState.busyItem)));
        this.previewReadJob = AnonymousClass001.A11(new AnonymousClass3(collectedItem, null), AEu.A00(this));
    }

    public final void replaceItem(String str, Uri uri) {
        Object next;
        AuraBugReportReviewUiState value;
        C7384Etj.A0Y(uri, 1);
        Iterator it = this._uiState.getValue().items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C7384Etj.areEqual(((AuraBugReportCollector.CollectedItem) next).getName(), str)) {
                    break;
                }
            }
        }
        AuraBugReportCollector.CollectedItem collectedItem = (AuraBugReportCollector.CollectedItem) next;
        if (collectedItem == null || this._uiState.getValue().busyItem != null) {
            AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
            return;
        }
        BLG<AuraBugReportReviewUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AuraBugReportReviewUiState.copy$default(value, false, false, false, null, null, false, null, null, new BusyItem(collectedItem.getName(), true), 255, null)));
        this.replaceJob = AnonymousClass001.A11(new C110073(collectedItem, uri, null), AEu.A00(this));
    }

    public final void saveItemToDownloads(AuraBugReportCollector.CollectedItem collectedItem) {
        AuraBugReportReviewUiState value;
        C7384Etj.A0Y(collectedItem, 0);
        if (this._uiState.getValue().busyItem == null) {
            BLG<AuraBugReportReviewUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, AuraBugReportReviewUiState.copy$default(value, false, false, false, null, null, false, null, null, new BusyItem(collectedItem.getName(), false), 255, null)));
            this.downloadJob = AnonymousClass001.A11(new C110082(collectedItem, null), AEu.A00(this));
        }
    }

    public final void setIncludeLogs(boolean z) {
        AuraBugReportReviewUiState value;
        AuraBugReportReviewUiState value2;
        AuraBugReportReviewUiState value3;
        AuraBugReportReviewUiState auraBugReportReviewUiStateCopy$default;
        this.savedStateHandle.A02(AuraBugReportReviewViewModelKt.INCLUDE_LOGS_KEY, Boolean.valueOf(z));
        BLG<AuraBugReportReviewUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AuraBugReportReviewUiState.copy$default(value, false, z, false, null, null, false, null, null, null, 509, null)));
        if (z) {
            if (this._uiState.getValue().isConfidentialOrUnclassified) {
                if (this.collectionJob == null) {
                    BLG<AuraBugReportReviewUiState> blg2 = this._uiState;
                    do {
                        value2 = blg2.getValue();
                    } while (!blg2.A6e(value2, AuraBugReportReviewUiState.copy$default(value2, false, false, true, null, null, false, null, null, null, 507, null)));
                    this.collectionJob = AnonymousClass001.A11(new AnonymousClass4(null), AEu.A00(this));
                }
                fetchVmLogs();
                return;
            }
            return;
        }
        HoC hoC = this.vmLogJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        BLG<AuraBugReportReviewUiState> blg3 = this._uiState;
        do {
            value3 = blg3.getValue();
            auraBugReportReviewUiStateCopy$default = value3;
            if (auraBugReportReviewUiStateCopy$default.vmLogFetch instanceof AuraVmLogFetchState.Fetching) {
                auraBugReportReviewUiStateCopy$default = AuraBugReportReviewUiState.copy$default(auraBugReportReviewUiStateCopy$default, false, false, false, null, null, false, null, AuraVmLogFetchState.Idle.INSTANCE, null, 383, null);
            }
        } while (!blg3.A6e(value3, auraBugReportReviewUiStateCopy$default));
    }

    public final class Factory extends AuraViewModelFactory<AuraBugReportReviewViewModel> {
        public static final int $stable = 8;
        public final Context appContext;
        public final String endpoint;
        public final String submissionId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraBugReportReviewViewModel create(A6J a6j) {
            C7384Etj.A0Y(a6j, 0);
            return new AuraBugReportReviewViewModel(this.appContext, this.userSession, this.submissionId, this.endpoint, A6H.A00(a6j));
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass003.A0v(context, str);
            this.appContext = context;
            this.userSession = abstractC3358CGz;
            this.submissionId = str;
            this.endpoint = str2;
        }
    }

    public static final /* synthetic */ AuraBugReportCollector.CollectedItemKind access$reviewableKind(AuraBugReportReviewViewModel auraBugReportReviewViewModel, AuraBugReportCollector.CollectedItemKind collectedItemKind) {
        return collectedItemKind == AuraBugReportCollector.CollectedItemKind.LOGCAT ? AuraBugReportCollector.CollectedItemKind.DIAGNOSTICS : collectedItemKind;
    }

    private final AuraBugReportCollector.CollectedItemKind reviewableKind(AuraBugReportCollector.CollectedItemKind collectedItemKind) {
        return collectedItemKind == AuraBugReportCollector.CollectedItemKind.LOGCAT ? AuraBugReportCollector.CollectedItemKind.DIAGNOSTICS : collectedItemKind;
    }

    public final void closePreview() {
        AuraBugReportReviewUiState value;
        AuraBugReportReviewUiState auraBugReportReviewUiState;
        AnonymousClass002.A1K(this.previewReadJob);
        BLG<AuraBugReportReviewUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            auraBugReportReviewUiState = value;
        } while (!blg.A6e(value, auraBugReportReviewUiState.copy(auraBugReportReviewUiState.isConfidentialOrUnclassified, auraBugReportReviewUiState.includeLogs, auraBugReportReviewUiState.isCollecting, auraBugReportReviewUiState.items, null, false, null, auraBugReportReviewUiState.vmLogFetch, auraBugReportReviewUiState.busyItem)));
        this.previewLines.clear();
    }

    public final List<AuraBugReportCollector.CollectedItem> collectedItemsForSend() {
        AuraBugReportReviewUiState value = this._uiState.getValue();
        if (!value.isConfidentialOrUnclassified) {
            value = null;
        }
        AuraBugReportReviewUiState auraBugReportReviewUiState = value;
        if (auraBugReportReviewUiState != null) {
            return auraBugReportReviewUiState.items;
        }
        return null;
    }

    public final void fetchVmLogs() {
        AuraBugReportReviewUiState value;
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        if (abstractC3358CGz == null || !this._uiState.getValue().includeLogs || this.submitted) {
            return;
        }
        HoC hoC = this.vmLogJob;
        if ((hoC == null || !hoC.isActive()) && !(this._uiState.getValue().vmLogFetch instanceof AuraVmLogFetchState.Loaded)) {
            BLG<AuraBugReportReviewUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, AuraBugReportReviewUiState.copy$default(value, false, false, false, null, null, false, null, AuraVmLogFetchState.Fetching.INSTANCE, null, 383, null)));
            HoC hoC2 = this.vmLogJob;
            this.vmLogJob = AnonymousClass001.A11(new C110062(abstractC3358CGz, hoC2, null), AEu.A00(this));
        }
    }

    public final SnapshotStateList<LogLine> getPreviewLines() {
        return this.previewLines;
    }

    public final C1BN<AuraBugReportReviewUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<AuraBugReportReviewViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final boolean isConfidentialOrUnclassified() {
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        boolean z = false;
        if (abstractC3358CGz != null && ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).isStandardVm()) {
            z = true;
        }
        return !z;
    }

    @Override // X.AEs
    public void onCleared() {
        if (this.submitted) {
            return;
        }
        AuraBugReportCollector.INSTANCE.cleanupAsync(this.appContext, this.submissionId, BFI.A0F(new HoC[]{this.collectionJob, this.vmLogJob, this.downloadJob, this.deleteJob, this.replaceJob}));
    }

    public final void onFlowDismissed() {
        if (this.submitted) {
            return;
        }
        AnonymousClass002.A1K(this.vmLogJob);
        AuraBugReportCollector.INSTANCE.cleanupAsync(this.appContext, this.submissionId, BFI.A0F(new HoC[]{this.collectionJob, this.vmLogJob, this.downloadJob, this.deleteJob, this.replaceJob}));
    }
}
