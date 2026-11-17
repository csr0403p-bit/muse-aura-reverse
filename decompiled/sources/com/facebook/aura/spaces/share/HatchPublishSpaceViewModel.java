package com.facebook.aura.spaces.share;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60N;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C7mU;
import X.C9286GCn;
import X.C9uG;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.InterfaceC08439ui;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.spaces.share.HatchPublishSpaceState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchPublishSpaceVM";
    public volatile long discoveryDeadlineMs;
    public HatchPublishSpaceState.Deployment lastDeployment;
    public final BLG<HatchPublishSpaceSnapshot> mutableSnapshot;
    public HoC pollJob;
    public final String slug;
    public final C1BN<HatchPublishSpaceSnapshot> snapshot;
    public final String spaceTitle;
    public final C1BN<HatchPublishSpaceState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final String slug;
        public final String title;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchPublishSpaceViewModel(this.userSession, this.slug, this.title);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.slug = str;
            this.title = str2;
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$loadInitialState$1", f = "HatchPublishSpaceViewModel.kt", l = {69, 71, 88}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$loadInitialState$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$loadInitialState$1$1", f = "HatchPublishSpaceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$loadInitialState$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03831 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HatchFileOperations.SpaceShareResult $result;
            public int label;
            public final /* synthetic */ HatchPublishSpaceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03831(HatchFileOperations.SpaceShareResult spaceShareResult, HatchPublishSpaceViewModel hatchPublishSpaceViewModel, HtJ<? super C03831> htJ) {
                super(2, htJ);
                this.$result = spaceShareResult;
                this.this$0 = hatchPublishSpaceViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03831(this.$result, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                HatchPublishSpaceState confirmPublish;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                String str = ((HatchFileOperations.SpaceShareResult.Success) this.$result).url;
                HatchPublishSpaceViewModel hatchPublishSpaceViewModel = this.this$0;
                if (str != null) {
                    String str2 = hatchPublishSpaceViewModel.spaceTitle;
                    if (str2 == null) {
                        str2 = hatchPublishSpaceViewModel.slug;
                    }
                    confirmPublish = new HatchPublishSpaceState.UpToDate(str, str2, HatchPublishSpaceState.Deployment.READY);
                } else {
                    String str3 = hatchPublishSpaceViewModel.spaceTitle;
                    if (str3 == null) {
                        str3 = hatchPublishSpaceViewModel.slug;
                    }
                    confirmPublish = new HatchPublishSpaceState.ConfirmPublish(str3);
                }
                hatchPublishSpaceViewModel.setSheetState(confirmPublish);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03831) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$loadInitialState$1$2", f = "HatchPublishSpaceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$loadInitialState$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ HatchPublishSpaceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchPublishSpaceViewModel hatchPublishSpaceViewModel, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = hatchPublishSpaceViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.this$0, htJ);
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass2(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                HatchPublishSpaceViewModel hatchPublishSpaceViewModel = this.this$0;
                String str = hatchPublishSpaceViewModel.spaceTitle;
                if (str == null) {
                    str = hatchPublishSpaceViewModel.slug;
                }
                hatchPublishSpaceViewModel.setSheetState(new HatchPublishSpaceState.ConfirmPublish(str));
                return Unit.INSTANCE;
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPublishSpaceViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPublishSpaceViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA00;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchPublishSpaceViewModel.TAG, FGI.A0M("Failed to fetch space share state for: ", HatchPublishSpaceViewModel.this.slug), e2);
                HatchPublishSpaceViewModel hatchPublishSpaceViewModel = HatchPublishSpaceViewModel.this;
                String str = hatchPublishSpaceViewModel.spaceTitle;
                if (str == null) {
                    str = hatchPublishSpaceViewModel.slug;
                }
                hatchPublishSpaceViewModel.setSheetState(new HatchPublishSpaceState.ConfirmPublish(str));
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                HatchPublishSpaceViewModel hatchPublishSpaceViewModel2 = HatchPublishSpaceViewModel.this;
                String str2 = hatchPublishSpaceViewModel2.slug;
                AbstractC3358CGz abstractC3358CGz = hatchPublishSpaceViewModel2.userSession;
                this.label = 1;
                obj = hatchFileOperations.fetchSpaceShareUrl(str2, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HatchFileOperations.SpaceShareResult spaceShareResult = (HatchFileOperations.SpaceShareResult) obj;
            if (spaceShareResult instanceof HatchFileOperations.SpaceShareResult.Success) {
                C78T c78tA0v = C3cG.A0v();
                C03831 c03831 = new C03831(spaceShareResult, HatchPublishSpaceViewModel.this, null);
                this.L$0 = null;
                this.label = 2;
                objA00 = GAo.A00(this, c78tA0v, c03831);
            } else {
                C78T c78tA0v2 = C3cG.A0v();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HatchPublishSpaceViewModel.this, null);
                this.L$0 = null;
                this.label = 3;
                objA00 = GAo.A00(this, c78tA0v2, anonymousClass2);
            }
            if (objA00 == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$recoverPublication$1", f = "HatchPublishSpaceViewModel.kt", l = {390}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$recoverPublication$1, reason: invalid class name and case insensitive filesystem */
    public final class C139391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPublishSpaceState.Failed $failed;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139391(HatchPublishSpaceState.Failed failed, HtJ<? super C139391> htJ) {
            super(2, htJ);
            this.$failed = failed;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPublishSpaceViewModel.this.new C139391(this.$failed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zA1X;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel = HatchPublishSpaceViewModel.this;
                    String str = hatchPublishSpaceViewModel.slug;
                    AbstractC3358CGz abstractC3358CGz = hatchPublishSpaceViewModel.userSession;
                    this.label = 1;
                    obj = hatchFileOperations.removeSpaceShare(str, abstractC3358CGz, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                zA1X = AnonymousClass001.A1X(obj);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchPublishSpaceViewModel.TAG, FGI.A0M("Failed to remove unfinished space share: ", HatchPublishSpaceViewModel.this.slug), e2);
                zA1X = false;
            }
            HatchPublishSpaceViewModel hatchPublishSpaceViewModel2 = HatchPublishSpaceViewModel.this;
            if (zA1X) {
                String str2 = hatchPublishSpaceViewModel2.spaceTitle;
                if (str2 == null) {
                    str2 = hatchPublishSpaceViewModel2.slug;
                }
                hatchPublishSpaceViewModel2.setSheetState(new HatchPublishSpaceState.ConfirmPublish(str2));
                HatchPublishSpaceViewModel.this.publishSpace();
            } else {
                hatchPublishSpaceViewModel2.setSheetState(new HatchPublishSpaceState.Failed(null, R.string._name_removed__res_0x7f121013, HatchPublishSpaceState.RetryAction.PUBLISH, false));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C139391) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$startPublish$2", f = "HatchPublishSpaceViewModel.kt", l = {147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$startPublish$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchPublishSpaceState $disclosureOrigin;
        public final /* synthetic */ String $disclosureToken;
        public final /* synthetic */ String $title;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, HatchPublishSpaceState hatchPublishSpaceState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$disclosureToken = str;
            this.$title = str2;
            this.$disclosureOrigin = hatchPublishSpaceState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPublishSpaceViewModel.this.new AnonymousClass2(this.$disclosureToken, this.$title, this.$disclosureOrigin, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchFileOperations.SpaceShareResult spaceShareResult;
            HatchPublishSpaceViewModel hatchPublishSpaceViewModel;
            HatchPublishSpaceState policyRefused;
            HatchPublishSpaceSnapshot value;
            HatchPublishSpaceState published;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel2 = HatchPublishSpaceViewModel.this;
                    String str = hatchPublishSpaceViewModel2.slug;
                    AbstractC3358CGz abstractC3358CGz = hatchPublishSpaceViewModel2.userSession;
                    String str2 = this.$disclosureToken;
                    this.label = 1;
                    obj = hatchFileOperations.shareSpace(str, abstractC3358CGz, true, str2, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                spaceShareResult = (HatchFileOperations.SpaceShareResult) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                HatchPublishSpaceViewModel.this.stopShareStatusPolling();
                CFK.A08(HatchPublishSpaceViewModel.TAG, FGI.A0M("Failed to publish space: ", HatchPublishSpaceViewModel.this.slug), e2);
                HatchPublishSpaceViewModel.this.failPublish(R.string._name_removed__res_0x7f121013, HatchPublishSpaceState.RetryAction.PUBLISH, e2.getMessage());
            }
            if (!(spaceShareResult instanceof HatchFileOperations.SpaceShareResult.NeedsDisclosureConfirmation)) {
                if (spaceShareResult instanceof HatchFileOperations.SpaceShareResult.Success) {
                    HatchFileOperations.SpaceShareResult.Success success = (HatchFileOperations.SpaceShareResult.Success) spaceShareResult;
                    String str3 = success.url;
                    BLG<HatchPublishSpaceSnapshot> blg = HatchPublishSpaceViewModel.this.mutableSnapshot;
                    do {
                        value = blg.getValue();
                        HatchPublishSpaceSnapshot hatchPublishSpaceSnapshot = value;
                        if (str3 != null) {
                            published = new HatchPublishSpaceState.Published(str3, success.shareType != null ? HatchPublishSpaceState.Deployment.READY : HatchPublishSpaceState.Deployment.PENDING);
                        } else {
                            published = hatchPublishSpaceSnapshot.sheet;
                        }
                        C7384Etj.A0Y(published, 0);
                    } while (!blg.A6e(value, new HatchPublishSpaceSnapshot(published, true)));
                    HatchPublishSpaceViewModel hatchPublishSpaceViewModel3 = HatchPublishSpaceViewModel.this;
                    if (str3 != null) {
                        hatchPublishSpaceViewModel3.stopShareStatusPolling();
                    } else if (hatchPublishSpaceViewModel3.currentSharedUrl() == null) {
                        HatchPublishSpaceViewModel.this.discoveryDeadlineMs = SystemClock.elapsedRealtime() + 15000;
                        HatchPublishSpaceViewModel.this.startShareStatusPolling();
                    }
                } else if (spaceShareResult instanceof HatchFileOperations.SpaceShareResult.PolicyRefused) {
                    HatchPublishSpaceViewModel.this.stopShareStatusPolling();
                    C3cG.A1G("Space publish refused by artifact policy: ", HatchPublishSpaceViewModel.this.slug, HatchPublishSpaceViewModel.TAG);
                    hatchPublishSpaceViewModel = HatchPublishSpaceViewModel.this;
                    policyRefused = new HatchPublishSpaceState.PolicyRefused(this.$title, ((HatchFileOperations.SpaceShareResult.PolicyRefused) spaceShareResult).message);
                } else {
                    if (!(spaceShareResult instanceof HatchFileOperations.SpaceShareResult.Failed)) {
                        throw C3cG.A0q();
                    }
                    HatchPublishSpaceViewModel.this.stopShareStatusPolling();
                    HatchFileOperations.SpaceShareResult.Failed failed = (HatchFileOperations.SpaceShareResult.Failed) spaceShareResult;
                    CFK.A04(HatchPublishSpaceViewModel.TAG, FGI.A0M("Space publish failed: ", failed.reason));
                    HxE hxEMapPublishFailure = HatchPublishSpaceViewModel.this.mapPublishFailure(failed.statusCode, failed.serverMessage);
                    HatchPublishSpaceViewModel.this.failPublish(AnonymousClass001.A0F(hxEMapPublishFailure.first), (HatchPublishSpaceState.RetryAction) hxEMapPublishFailure.second, null);
                }
                return Unit.INSTANCE;
            }
            HatchPublishSpaceViewModel.this.stopShareStatusPolling();
            hatchPublishSpaceViewModel = HatchPublishSpaceViewModel.this;
            HatchFileOperations.SpaceShareResult.NeedsDisclosureConfirmation needsDisclosureConfirmation = (HatchFileOperations.SpaceShareResult.NeedsDisclosureConfirmation) spaceShareResult;
            policyRefused = new HatchPublishSpaceState.ConfirmDisclosure(this.$title, needsDisclosureConfirmation.disclosure, needsDisclosureConfirmation.token, this.$disclosureOrigin, false, needsDisclosureConfirmation.summary);
            hatchPublishSpaceViewModel.setSheetState(policyRefused);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$startShareStatusPolling$1", f = "HatchPublishSpaceViewModel.kt", l = {230, 234}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$startShareStatusPolling$1, reason: invalid class name and case insensitive filesystem */
    public final class C139401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public int label;

        public C139401(HtJ<? super C139401> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPublishSpaceViewModel.this.new C139401(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPublishSpaceViewModel.this.new C139401(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:21:0x006e). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                r15 = this;
                r9 = r16
                X.Hji r8 = X.EnumC10460Hji.A02
                int r0 = r15.label
                r7 = 2
                r6 = 1
                if (r0 == 0) goto L22
                if (r0 == r6) goto L16
                if (r0 != r7) goto L11
                long r0 = r15.J$0
                goto L6b
            L11:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L16:
                long r4 = r15.J$2
                long r2 = r15.J$1
                int r14 = r15.I$0
                long r0 = r15.J$0
                X.Hwg.A00(r9)
                goto L52
            L22:
                X.Hwg.A00(r9)
                long r0 = android.os.SystemClock.elapsedRealtime()
            L29:
                r14 = 0
            L2a:
                long r2 = android.os.SystemClock.elapsedRealtime()
                com.facebook.aura.spaces.share.HatchSpaceSharePolling r9 = com.facebook.aura.spaces.share.HatchSpaceSharePolling.INSTANCE
                long r10 = r2 - r0
                com.facebook.aura.spaces.share.HatchPublishSpaceViewModel r4 = com.facebook.aura.spaces.share.HatchPublishSpaceViewModel.this
                long r12 = r4.discoveryDeadlineMs
                long r12 = r12 - r2
                java.lang.Long r4 = r9.nextDelayMs(r10, r12, r14)
                if (r4 == 0) goto L9d
                long r4 = r4.longValue()
                r15.J$0 = r0
                r15.I$0 = r14
                r15.J$1 = r2
                r15.J$2 = r4
                r15.label = r6
                java.lang.Object r9 = X.C7Bq.A01(r4, r15)
                if (r9 != r8) goto L52
                return r8
            L52:
                com.facebook.aura.gateway.HatchFileOperations r11 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                com.facebook.aura.spaces.share.HatchPublishSpaceViewModel r9 = com.facebook.aura.spaces.share.HatchPublishSpaceViewModel.this     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                java.lang.String r10 = r9.slug     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                X.CGz r9 = r9.userSession     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                r15.J$0 = r0     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                r15.I$0 = r14     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                r15.J$1 = r2     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                r15.J$2 = r4     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                r15.label = r7     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                java.lang.Object r9 = r11.fetchSpaceShareUrl(r10, r9, r15)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                if (r9 != r8) goto L6e
                goto La5
            L6b:
                X.Hwg.A00(r9)     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
            L6e:
                com.facebook.aura.gateway.HatchFileOperations$SpaceShareResult r9 = (com.facebook.aura.gateway.HatchFileOperations.SpaceShareResult) r9     // Catch: java.lang.Exception -> L71 java.util.concurrent.CancellationException -> La6
                goto L88
            L71:
                r3 = move-exception
                com.facebook.aura.spaces.share.HatchPublishSpaceViewModel r2 = com.facebook.aura.spaces.share.HatchPublishSpaceViewModel.this
                java.lang.String r5 = r2.slug
                java.lang.String r4 = r3.getMessage()
                java.lang.String r3 = "Share status poll failed for "
                java.lang.String r2 = ": "
                java.lang.String r3 = X.FGI.A0d(r3, r5, r2, r4)
                java.lang.String r2 = "HatchPublishSpaceVM"
                X.CFK.A06(r2, r3)
                r9 = 0
            L88:
                boolean r2 = r9 instanceof com.facebook.aura.gateway.HatchFileOperations.SpaceShareResult.Success
                if (r2 == 0) goto La3
                com.facebook.aura.gateway.HatchFileOperations$SpaceShareResult$Success r9 = (com.facebook.aura.gateway.HatchFileOperations.SpaceShareResult.Success) r9
                java.lang.String r2 = r9.url
                if (r2 == 0) goto L29
                com.facebook.aura.spaces.share.HatchPublishSpaceViewModel r1 = com.facebook.aura.spaces.share.HatchPublishSpaceViewModel.this
                java.lang.String r0 = r9.shareType
                if (r0 == 0) goto La0
                com.facebook.aura.spaces.share.HatchPublishSpaceState$Deployment r0 = com.facebook.aura.spaces.share.HatchPublishSpaceState.Deployment.READY
            L9a:
                com.facebook.aura.spaces.share.HatchPublishSpaceViewModel.access$publishPolledUrl(r1, r2, r0)
            L9d:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            La0:
                com.facebook.aura.spaces.share.HatchPublishSpaceState$Deployment r0 = com.facebook.aura.spaces.share.HatchPublishSpaceState.Deployment.PENDING
                goto L9a
            La3:
                r14 = 1
                goto L2a
            La5:
                return r8
            La6:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel.C139401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$unpublishSpace$1", f = "HatchPublishSpaceViewModel.kt", l = {347, 348}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$unpublishSpace$1, reason: invalid class name and case insensitive filesystem */
    public final class C139411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public boolean Z$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$unpublishSpace$1$1", f = "HatchPublishSpaceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceViewModel$unpublishSpace$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03841 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ boolean $success;
            public int label;
            public final /* synthetic */ HatchPublishSpaceViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03841(boolean z, HatchPublishSpaceViewModel hatchPublishSpaceViewModel, HtJ<? super C03841> htJ) {
                super(2, htJ);
                this.$success = z;
                this.this$0 = hatchPublishSpaceViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03841(this.$success, this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                this.this$0.setSheetState(this.$success ? HatchPublishSpaceState.Unpublished.INSTANCE : new HatchPublishSpaceState.Failed(null, R.string._name_removed__res_0x7f121015, HatchPublishSpaceState.RetryAction.UNPUBLISH, false));
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03841) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C139411(HtJ<? super C139411> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPublishSpaceViewModel.this.new C139411(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchPublishSpaceViewModel.this.new C139411(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(HatchPublishSpaceViewModel.TAG, FGI.A0M("Failed to unpublish space: ", HatchPublishSpaceViewModel.this.slug), e2);
                HatchPublishSpaceViewModel.this.setSheetState(new HatchPublishSpaceState.Failed(e2.getMessage(), R.string._name_removed__res_0x7f121013, HatchPublishSpaceState.RetryAction.UNPUBLISH, false));
            }
            if (i == 0) {
                Hwg.A00(obj);
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                HatchPublishSpaceViewModel hatchPublishSpaceViewModel = HatchPublishSpaceViewModel.this;
                String str = hatchPublishSpaceViewModel.slug;
                AbstractC3358CGz abstractC3358CGz = hatchPublishSpaceViewModel.userSession;
                this.label = 1;
                obj = hatchFileOperations.removeSpaceShare(str, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
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
            boolean zA1X = AnonymousClass001.A1X(obj);
            C78T c78tA0v = C3cG.A0v();
            C03841 c03841 = new C03841(zA1X, HatchPublishSpaceViewModel.this, null);
            this.Z$0 = zA1X;
            this.label = 2;
            if (GAo.A00(this, c78tA0v, c03841) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }
    }

    private final void startPublish(String str) {
        HatchPublishSpaceSnapshot value;
        HatchPublishSpaceState hatchPublishSpaceState;
        String str2;
        BLG<HatchPublishSpaceSnapshot> blg = this.mutableSnapshot;
        do {
            value = blg.getValue();
            hatchPublishSpaceState = value.sheet;
            C7384Etj.A0Y(hatchPublishSpaceState, 0);
        } while (!blg.A6e(value, new HatchPublishSpaceSnapshot(hatchPublishSpaceState, false)));
        HatchPublishSpaceState sheetState = getSheetState();
        if (sheetState instanceof HatchPublishSpaceState.ConfirmPublish) {
            str2 = ((HatchPublishSpaceState.ConfirmPublish) sheetState).title;
        } else if (sheetState instanceof HatchPublishSpaceState.Publishing) {
            str2 = ((HatchPublishSpaceState.Publishing) sheetState).title;
        } else if (sheetState instanceof HatchPublishSpaceState.ConfirmDisclosure) {
            str2 = ((HatchPublishSpaceState.ConfirmDisclosure) sheetState).title;
        } else {
            str2 = this.spaceTitle;
            if (str2 == null) {
                str2 = this.slug;
            }
        }
        HatchPublishSpaceState sheetState2 = getSheetState();
        if (sheetState2 instanceof HatchPublishSpaceState.ConfirmDisclosure) {
            sheetState2 = ((HatchPublishSpaceState.ConfirmDisclosure) sheetState2).origin;
        }
        if (str == null) {
            setSheetState(new HatchPublishSpaceState.Publishing(str2));
        }
        this.discoveryDeadlineMs = SystemClock.elapsedRealtime() + HatchSpaceSharePolling.DISCOVERY_TIMEOUT_MS;
        startShareStatusPolling();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(str, str2, sheetState2, null), AEu.A00(this));
    }

    public final void publishSpace() {
        startPublish(null);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPublishSpaceState.RetryAction.values().length];
            try {
                AnonymousClass002.A13(HatchPublishSpaceState.RetryAction.UNPUBLISH, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchPublishSpaceState.RetryAction.RECOVER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ HatchPublishSpaceState.Deployment access$deploymentFor(HatchPublishSpaceViewModel hatchPublishSpaceViewModel, String str) {
        return str != null ? HatchPublishSpaceState.Deployment.READY : HatchPublishSpaceState.Deployment.PENDING;
    }

    private final HatchPublishSpaceState.Deployment deploymentFor(String str) {
        return str != null ? HatchPublishSpaceState.Deployment.READY : HatchPublishSpaceState.Deployment.PENDING;
    }

    private final HatchPublishSpaceState getSheetState() {
        return this.mutableSnapshot.getValue().sheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HxE<Integer, HatchPublishSpaceState.RetryAction> mapPublishFailure(Integer num, String str) {
        int i;
        Integer numValueOf;
        HatchPublishSpaceState.RetryAction retryAction;
        String strA0u = str != null ? AnonymousClass001.A0u(str) : "";
        if (num == null || num.intValue() != 400) {
            i = R.string._name_removed__res_0x7f121013;
            numValueOf = Integer.valueOf(i);
            retryAction = HatchPublishSpaceState.RetryAction.PUBLISH;
        } else if (C7BY.A0q(strA0u, "already shared", false)) {
            numValueOf = Integer.valueOf(R.string._name_removed__res_0x7f121010);
            retryAction = HatchPublishSpaceState.RetryAction.UNPUBLISH;
        } else if (C7BY.A0q(strA0u, "server-backed", false)) {
            i = R.string._name_removed__res_0x7f121011;
            numValueOf = Integer.valueOf(i);
            retryAction = HatchPublishSpaceState.RetryAction.PUBLISH;
        } else {
            if (C7BY.A0q(strA0u, "unfinished publication", false)) {
                numValueOf = Integer.valueOf(R.string._name_removed__res_0x7f121012);
                retryAction = HatchPublishSpaceState.RetryAction.RECOVER;
            }
            i = R.string._name_removed__res_0x7f121013;
            numValueOf = Integer.valueOf(i);
            retryAction = HatchPublishSpaceState.RetryAction.PUBLISH;
        }
        return C3cG.A0r(numValueOf, retryAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSheetState(HatchPublishSpaceState hatchPublishSpaceState) {
        HatchPublishSpaceSnapshot value;
        boolean z;
        BLG<HatchPublishSpaceSnapshot> blg = this.mutableSnapshot;
        do {
            value = blg.getValue();
            z = value.publicationConfirmed;
            C7384Etj.A0Y(hatchPublishSpaceState, 0);
        } while (!blg.A6e(value, new HatchPublishSpaceSnapshot(hatchPublishSpaceState, z)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startShareStatusPolling() {
        HtJ htJA13 = AnonymousClass006.A13(this.pollJob);
        BLL bllA00 = AEu.A00(this);
        this.pollJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C139401(htJA13), bllA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopShareStatusPolling() {
        this.pollJob = C3cI.A15(this.pollJob);
    }

    public final C1BN<HatchPublishSpaceSnapshot> getSnapshot() {
        return this.snapshot;
    }

    public final C1BN<HatchPublishSpaceState> getUiState() {
        return this.uiState;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchPublishSpaceViewModel(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, str);
        this.userSession = abstractC3358CGz;
        this.slug = str;
        this.spaceTitle = str2;
        HatchPublishSpaceState.Loading loading = HatchPublishSpaceState.Loading.INSTANCE;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchPublishSpaceSnapshot(loading, zA1b));
        this.mutableSnapshot = c9286GCnA14;
        C3Pi c3PiA00 = C3Pi.A00(c9286GCnA14);
        this.snapshot = c3PiA00;
        this.uiState = AnonymousClass441.A00(loading, AEu.A00(this), new HatchPublishSpaceViewModel$special$$inlined$map$1(c3PiA00), C3Ek.A00);
        this.lastDeployment = HatchPublishSpaceState.Deployment.READY;
        loadInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentSharedUrl() {
        HatchPublishSpaceState sheetState = getSheetState();
        if (sheetState instanceof HatchPublishSpaceState.Published) {
            return ((HatchPublishSpaceState.Published) sheetState).url;
        }
        if (sheetState instanceof HatchPublishSpaceState.UpToDate) {
            return ((HatchPublishSpaceState.UpToDate) sheetState).url;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failPublish(int i, HatchPublishSpaceState.RetryAction retryAction, String str) {
        String strCurrentSharedUrl = currentSharedUrl();
        setSheetState(strCurrentSharedUrl != null ? new HatchPublishSpaceState.Published(strCurrentSharedUrl, HatchPublishSpaceState.Deployment.UNCONFIRMED) : new HatchPublishSpaceState.Failed(str, i, retryAction, false));
    }

    private final void loadInitialState() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishPolledUrl(String str, HatchPublishSpaceState.Deployment deployment) {
        HatchPublishSpaceState published;
        HatchPublishSpaceState sheetState = getSheetState();
        if ((sheetState instanceof HatchPublishSpaceState.Publishing) || (sheetState instanceof HatchPublishSpaceState.Loading)) {
            published = new HatchPublishSpaceState.Published(str, deployment);
        } else if (sheetState instanceof HatchPublishSpaceState.Published) {
            AnonymousClass003.A0u(str, deployment);
            published = new HatchPublishSpaceState.Published(str, deployment);
        } else {
            if (!(sheetState instanceof HatchPublishSpaceState.UpToDate)) {
                return;
            }
            HatchPublishSpaceState.UpToDate upToDate = (HatchPublishSpaceState.UpToDate) sheetState;
            published = upToDate.copy(str, upToDate.title, deployment);
        }
        setSheetState(published);
    }

    private final void recoverPublication() {
        HatchPublishSpaceState.Failed failed;
        HatchPublishSpaceState sheetState = getSheetState();
        if (!(sheetState instanceof HatchPublishSpaceState.Failed) || (failed = (HatchPublishSpaceState.Failed) sheetState) == null || failed.isRetrying) {
            return;
        }
        String str = failed.message;
        int i = failed.fallbackMessageRes;
        HatchPublishSpaceState.RetryAction retryAction = failed.retryAction;
        C7384Etj.A0Y(retryAction, 2);
        setSheetState(new HatchPublishSpaceState.Failed(str, i, retryAction, true));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C139391(failed, null), AEu.A00(this));
    }

    public final void cancelDisclosure() {
        HatchPublishSpaceState.ConfirmDisclosure confirmDisclosure;
        HatchPublishSpaceState sheetState = getSheetState();
        if (!(sheetState instanceof HatchPublishSpaceState.ConfirmDisclosure) || (confirmDisclosure = (HatchPublishSpaceState.ConfirmDisclosure) sheetState) == null) {
            return;
        }
        stopShareStatusPolling();
        setSheetState(confirmDisclosure.origin);
    }

    public final void cancelUnpublish() {
        HatchPublishSpaceState.ConfirmUnpublish confirmUnpublish;
        HatchPublishSpaceState sheetState = getSheetState();
        if (!(sheetState instanceof HatchPublishSpaceState.ConfirmUnpublish) || (confirmUnpublish = (HatchPublishSpaceState.ConfirmUnpublish) sheetState) == null) {
            return;
        }
        setSheetState(new HatchPublishSpaceState.UpToDate(confirmUnpublish.url, confirmUnpublish.title, this.lastDeployment));
    }

    public final void confirmDisclosure() {
        HatchPublishSpaceState.ConfirmDisclosure confirmDisclosure;
        HatchPublishSpaceState sheetState = getSheetState();
        if (!(sheetState instanceof HatchPublishSpaceState.ConfirmDisclosure) || (confirmDisclosure = (HatchPublishSpaceState.ConfirmDisclosure) sheetState) == null) {
            return;
        }
        setSheetState(confirmDisclosure.copy(confirmDisclosure.title, confirmDisclosure.disclosure, confirmDisclosure.token, confirmDisclosure.origin, true, confirmDisclosure.summary));
        startPublish(confirmDisclosure.token);
    }

    public final void confirmUnpublish() {
        String str;
        HatchPublishSpaceState.Deployment deployment;
        HatchPublishSpaceState sheetState = getSheetState();
        if (sheetState instanceof HatchPublishSpaceState.UpToDate) {
            HatchPublishSpaceState.UpToDate upToDate = (HatchPublishSpaceState.UpToDate) sheetState;
            str = upToDate.url;
            deployment = upToDate.deployment;
        } else {
            if (!(sheetState instanceof HatchPublishSpaceState.Published)) {
                return;
            }
            HatchPublishSpaceState.Published published = (HatchPublishSpaceState.Published) sheetState;
            str = published.url;
            deployment = published.deployment;
        }
        this.lastDeployment = deployment;
        String str2 = this.spaceTitle;
        if (str2 == null) {
            str2 = this.slug;
        }
        setSheetState(new HatchPublishSpaceState.ConfirmUnpublish(str, str2, false));
    }

    public final void retry() {
        HatchPublishSpaceState.Failed failed;
        HatchPublishSpaceState.RetryAction retryAction;
        HatchPublishSpaceState sheetState = getSheetState();
        if ((sheetState instanceof HatchPublishSpaceState.Failed) && (failed = (HatchPublishSpaceState.Failed) sheetState) != null && (retryAction = failed.retryAction) != null) {
            int iOrdinal = retryAction.ordinal();
            if (iOrdinal == 1) {
                unpublishSpace();
                return;
            } else if (iOrdinal == 2) {
                recoverPublication();
                return;
            }
        }
        startPublish(null);
    }

    public final void shareUrl(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        Intent intent = new Intent(AnonymousClass000.A00(12));
        intent.setType("text/plain");
        intent.putExtra(C60N.A00(20), str);
        C7mU.A00().A03().A05(context, Intent.createChooser(intent, null));
    }

    public final void unpublishSpace() {
        stopShareStatusPolling();
        HatchPublishSpaceState sheetState = getSheetState();
        if (sheetState instanceof HatchPublishSpaceState.ConfirmUnpublish) {
            HatchPublishSpaceState.ConfirmUnpublish confirmUnpublish = (HatchPublishSpaceState.ConfirmUnpublish) sheetState;
            setSheetState(confirmUnpublish.copy(confirmUnpublish.url, confirmUnpublish.title, true));
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C139411(null), AEu.A00(this));
    }
}
