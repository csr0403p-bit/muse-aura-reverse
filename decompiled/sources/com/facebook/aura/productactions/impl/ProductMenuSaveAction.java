package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.C06H;
import X.C0KA;
import X.C10571Hud;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C8j5;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import com.facebook.aura.shopping.repo.HatchSavedProductsRepository;
import com.facebook.aura.shopping.repo.HatchSavedProductsRepositoryKt;
import com.facebook.aura.shopping.repo.SavedProductState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ProductMenuSaveAction implements ProductMenuAction {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final ConversationItemActionContext context;
    public final HoC fetchJob;
    public final ProductMenuActionId id;
    public final HatchSavedProductsRepository repository;
    public final C3UX scope;
    public final BLG<State> state;
    public final ShoppingSaveTarget target;
    public final C1BN<ProductMenuActionUiState> uiState;

    public interface State {

        public final class Loading implements State {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return -1338878764;
            }
        }

        public final class Ready implements State {
            public static final int $stable = 8;
            public final boolean inFlight;
            public final SavedProductState saved;

            public Ready(SavedProductState savedProductState, boolean z) {
                C7384Etj.A0Y(savedProductState, 0);
                this.saved = savedProductState;
                this.inFlight = z;
            }

            public final Ready copy(SavedProductState savedProductState, boolean z) {
                C7384Etj.A0Y(savedProductState, 0);
                return new Ready(savedProductState, z);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Ready) {
                        Ready ready = (Ready) obj;
                        if (!C7384Etj.areEqual(this.saved, ready.saved) || this.inFlight != ready.inFlight) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ Ready copy$default(Ready ready, SavedProductState savedProductState, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    savedProductState = ready.saved;
                }
                if ((i & 2) != 0) {
                    z = ready.inFlight;
                }
                C7384Etj.A0Y(savedProductState, 0);
                return new Ready(savedProductState, z);
            }

            public final SavedProductState component1() {
                return this.saved;
            }

            public final boolean component2() {
                return this.inFlight;
            }

            public final boolean getInFlight() {
                return this.inFlight;
            }

            public final SavedProductState getSaved() {
                return this.saved;
            }

            public int hashCode() {
                return C0KA.A00(AnonymousClass005.A0E(this.saved), this.inFlight);
            }

            public String toString() {
                SavedProductState savedProductState = this.saved;
                return C8j5.A0W(", inFlight=", C3cG.A0f(savedProductState, "Ready(saved="), this.inFlight);
            }

            public /* synthetic */ Ready(SavedProductState savedProductState, boolean z, int i, C06H c06h) {
                this(savedProductState, AnonymousClass001.A1Q(i, z));
            }
        }

        public final class Unavailable implements State {
            public static final int $stable = 0;
            public static final Unavailable INSTANCE = new Unavailable();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unavailable);
            }

            public String toString() {
                return "Unavailable";
            }

            public int hashCode() {
                return -656162840;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductMenuSaveAction$perform$1", f = "ProductMenuSaveAction.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE, 66}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductMenuSaveAction$perform$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ State.Ready $current;
        public final /* synthetic */ ProductMenuActionHost $host;
        public Object L$0;
        public int label;
        public final /* synthetic */ ProductMenuSaveAction this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(State.Ready ready, ProductMenuSaveAction productMenuSaveAction, ProductMenuActionHost productMenuActionHost, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$current = ready;
            this.this$0 = productMenuSaveAction;
            this.$host = productMenuActionHost;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$current, this.this$0, this.$host, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2015unsavegIAlus;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str = this.$current.saved.itemId;
                ProductMenuSaveAction productMenuSaveAction = this.this$0;
                HatchSavedProductsRepository hatchSavedProductsRepository = productMenuSaveAction.repository;
                if (str == null) {
                    ShoppingSaveTarget shoppingSaveTarget = productMenuSaveAction.target;
                    String str2 = productMenuSaveAction.context.sessionId;
                    this.L$0 = null;
                    this.label = 1;
                    objM2015unsavegIAlus = hatchSavedProductsRepository.m2014save0E7RQCE(shoppingSaveTarget, str2, this);
                } else {
                    this.L$0 = null;
                    this.label = 2;
                    objM2015unsavegIAlus = hatchSavedProductsRepository.m2015unsavegIAlus(str, this);
                }
                if (objM2015unsavegIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                objM2015unsavegIAlus = AnonymousClass001.A0q(obj);
            }
            BLG<State> blg = this.this$0.state;
            Object obj2 = this.$current.saved;
            boolean z = objM2015unsavegIAlus instanceof C10571Hud;
            if (!z) {
                obj2 = objM2015unsavegIAlus;
            }
            AnonymousClass002.A1I(blg, new State.Ready((SavedProductState) obj2, false));
            ProductMenuActionHost productMenuActionHost = this.$host;
            if (!z) {
                productMenuActionHost.dismiss.invoke();
                productMenuActionHost.showToast.invoke(C3cG.A0R(ProductActionToastKt.productSaveToastTitle(AnonymousClass002.A1X(((SavedProductState) objM2015unsavegIAlus).itemId))));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public void perform(ProductMenuActionHost productMenuActionHost) {
        State.Ready ready;
        C7384Etj.A0Y(productMenuActionHost, 0);
        State value = this.state.getValue();
        if (!(value instanceof State.Ready) || (ready = (State.Ready) value) == null || ready.inFlight) {
            return;
        }
        this.fetchJob.A5w(null);
        ShoppingConversationItemActionsKt.logItem(this.context, HatchComponent.SAVE_BUTTON, false);
        BLG<State> blg = this.state;
        SavedProductState savedProductState = ready.saved;
        C7384Etj.A0Y(savedProductState, 0);
        C9286GCn.A00(null, new State.Ready(savedProductState, true), (C9286GCn) blg);
        AnonymousClass001.A1J(new AnonymousClass1(ready, this, productMenuActionHost, null), this.scope);
    }

    public final class Companion {
        public final ProductMenuSaveAction create(ConversationItemActionContext conversationItemActionContext, AbstractC3358CGz abstractC3358CGz, C3UX c3ux) {
            AnonymousClass005.A0x(conversationItemActionContext, abstractC3358CGz, c3ux);
            ShoppingSaveTarget shoppingSaveTargetSaveTarget = ShoppingResultsPresentationKt.saveTarget(conversationItemActionContext.product, conversationItemActionContext.source, conversationItemActionContext.hostMessageId);
            if (shoppingSaveTargetSaveTarget == null || !HatchSavedProductsRepositoryKt.isProductSaveEnabled()) {
                return null;
            }
            return new ProductMenuSaveAction(conversationItemActionContext, shoppingSaveTargetSaveTarget, HatchSavedProductsRepository.Companion.getInstance(abstractC3358CGz), c3ux);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.productactions.impl.ProductMenuActionUiState row(com.facebook.aura.productactions.impl.ProductMenuSaveAction.State r5) {
        /*
            r4 = this;
            com.facebook.aura.productactions.impl.ProductMenuSaveAction$State$Unavailable r0 = com.facebook.aura.productactions.impl.ProductMenuSaveAction.State.Unavailable.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            com.facebook.aura.productactions.impl.ProductMenuSaveAction$State$Loading r0 = com.facebook.aura.productactions.impl.ProductMenuSaveAction.State.Loading.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 == 0) goto L37
            r0 = 0
        L13:
            com.facebook.aura.productactions.impl.ProductMenuActionId r1 = r4.getId()
            r2 = 2131887470(0x7f12056e, float:1.9409548E38)
            r3 = 2131230921(0x7f0800c9, float:1.8077908E38)
            if (r0 == 0) goto L25
            r2 = 2131887474(0x7f120572, float:1.9409556E38)
            r3 = 2131230920(0x7f0800c8, float:1.8077906E38)
        L25:
            boolean r4 = r5 instanceof com.facebook.aura.productactions.impl.ProductMenuSaveAction.State.Ready
            if (r4 == 0) goto L30
            com.facebook.aura.productactions.impl.ProductMenuSaveAction$State$Ready r5 = (com.facebook.aura.productactions.impl.ProductMenuSaveAction.State.Ready) r5
            boolean r0 = r5.inFlight
            r5 = 1
            if (r0 != 0) goto L31
        L30:
            r5 = 0
        L31:
            com.facebook.aura.productactions.impl.ProductMenuActionUiState r0 = new com.facebook.aura.productactions.impl.ProductMenuActionUiState
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L37:
            boolean r0 = r5 instanceof com.facebook.aura.productactions.impl.ProductMenuSaveAction.State.Ready
            if (r0 == 0) goto L47
            r0 = r5
            com.facebook.aura.productactions.impl.ProductMenuSaveAction$State$Ready r0 = (com.facebook.aura.productactions.impl.ProductMenuSaveAction.State.Ready) r0
            com.facebook.aura.shopping.repo.SavedProductState r0 = r0.saved
            java.lang.String r0 = r0.itemId
            boolean r0 = X.AnonymousClass002.A1X(r0)
            goto L13
        L47:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ProductMenuSaveAction.row(com.facebook.aura.productactions.impl.ProductMenuSaveAction$State):com.facebook.aura.productactions.impl.ProductMenuActionUiState");
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public ProductMenuActionId getId() {
        return this.id;
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public C1BN<ProductMenuActionUiState> getUiState() {
        return this.uiState;
    }

    public ProductMenuSaveAction(ConversationItemActionContext conversationItemActionContext, ShoppingSaveTarget shoppingSaveTarget, HatchSavedProductsRepository hatchSavedProductsRepository, C3UX c3ux) {
        this.context = conversationItemActionContext;
        this.target = shoppingSaveTarget;
        this.repository = hatchSavedProductsRepository;
        this.scope = c3ux;
        this.id = ProductMenuActionId.SAVE;
        SavedProductState savedProductStateKnownState = hatchSavedProductsRepository.knownState(shoppingSaveTarget);
        C9286GCn c9286GCnA01 = HnJ.A01(savedProductStateKnownState != null ? new State.Ready(savedProductStateKnownState, false) : State.Loading.INSTANCE);
        this.state = c9286GCnA01;
        this.fetchJob = AnonymousClass001.A11(new ProductMenuSaveAction$fetchJob$1(this, null), c3ux);
        this.uiState = AnonymousClass441.A00(row((State) c9286GCnA01.getValue()), c3ux, new ProductMenuSaveAction$special$$inlined$map$1(c9286GCnA01, this), C3Ek.A00);
    }

    public /* synthetic */ ProductMenuSaveAction(ConversationItemActionContext conversationItemActionContext, ShoppingSaveTarget shoppingSaveTarget, HatchSavedProductsRepository hatchSavedProductsRepository, C3UX c3ux, C06H c06h) {
        this(conversationItemActionContext, shoppingSaveTarget, hatchSavedProductsRepository, c3ux);
    }
}
