package com.facebook.aura.productactions.impl;

import X.A6K;
import X.AIW;
import X.AKO;
import X.AKQ;
import X.ARK;
import X.ATD;
import X.AVy;
import X.AXN;
import X.AYD;
import X.AaC;
import X.AbstractC1564Ale;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJt;
import X.BON;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0924AIa;
import X.C0A8;
import X.C0Ig;
import X.C0Yr;
import X.C0n6;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2CK;
import X.C2VG;
import X.C2VU;
import X.C3IL;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C78g;
import X.C79;
import X.C8j3;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.LocalResultEventBus;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.productactions.impl.ProductItemMenuViewModel;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ShoppingConversationItemActionsKt {
    public static final Unit ProductItemMenu$lambda$8$0$0$0(String str, InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 1);
        AbstractC1564Ale.A08(interfaceC0857A6e, str);
        return Unit.INSTANCE;
    }

    public static final void logItem(ConversationItemActionContext conversationItemActionContext, HatchComponent hatchComponent, boolean z) {
        HatchComponent hatchComponent2 = hatchComponent;
        C7384Etj.A0Y(conversationItemActionContext, 0);
        HatchComponent hatchComponent3 = conversationItemActionContext.isChip ? HatchComponent.SHOPPING_PRODUCT_ENTITY : conversationItemActionContext.isGrid ? HatchComponent.PRODUCT_GRID_CARD : HatchComponent.PRODUCT_CARD;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        String loggingValue = ShoppingResultsPresentationKt.getLoggingValue(conversationItemActionContext.product.type);
        if (loggingValue != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_TYPE, loggingValue, c0924AIaA0u);
        }
        String str = conversationItemActionContext.hostMessageId;
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.HOST_MESSAGE_ID, str, c0924AIaA0u);
        }
        Integer num = conversationItemActionContext.position;
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIaA0u, num.intValue());
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        if (z) {
            HatchInteractionLogger.INSTANCE.logLongPress(HatchSurface.SHOPPING, null, conversationItemActionContext.isChip ? HatchScreen.MAIN_CHAT : HatchScreen.PRODUCT_LIST, hatchComponent3, conversationItemActionContext.product.productId, c0924AIaA0K);
            return;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = conversationItemActionContext.isChip ? HatchScreen.MAIN_CHAT : HatchScreen.PRODUCT_LIST;
        if (hatchComponent == null) {
            hatchComponent2 = hatchComponent3;
        }
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent2, conversationItemActionContext.product.productId, c0924AIaA0K, null);
    }

    public static /* synthetic */ C78g $r8$lambda$Pav6BitSm4o7nupW5kb8qWo4p1Q(BJt bJt, C0Yr c0Yr) {
        return new ShoppingConversationItemActionsKt$ProductItemMenu$lambda$3$0$$inlined$onDispose$1(bJt);
    }

    public static final void ConversationItemActionHost(final ConversationItemActionContext conversationItemActionContext, final Function0<Unit> function0, BRg bRg, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1B(function0, 1, g0w);
        bfm.AgG(-872273491);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationItemActionContext, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (conversationItemActionContext != null) {
                bfm.AgE(-736194375);
                ShoppingConversationItemActions.INSTANCE.Content(conversationItemActionContext, function0, bRg2, g0w, bfm, AnonymousClass003.A06(iA05, ConversationItemActionContext.$stable | RuntimeInternals.IOPRIO_BACKGROUND | (iA05 & 14)), 0);
            } else {
                bfm.AgE(-736192364);
                AnonymousClass001.A1G(C0v5.A01(null, null, bRg2, C3cG.A0A(0), null, function0, true), bfm, g0w, (iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ConversationItemActionContext conversationItemActionContext2 = conversationItemActionContext;
                    Function0 function02 = function0;
                    BRg bRg4 = bRg3;
                    G0W g0w2 = g0w;
                    int i4 = i;
                    ShoppingConversationItemActionsKt.ConversationItemActionHost(conversationItemActionContext2, function02, bRg4, g0w2, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ProductItemMenu(final ConversationItemActionContext conversationItemActionContext, final Function0<Unit> function0, BRg bRg, AaC aaC, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i, final int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> g0v;
        final BRg bRg2 = bRg;
        AaC aaC2 = aaC;
        G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        bfm.AgG(-2118452320);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationItemActionContext, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, aaC2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0w2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aaC2 = null;
            }
            final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w3 = i5 == 0 ? g0w2 : null;
            if (conversationItemActionContext == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                }
                final BRg bRg3 = bRg2;
                final AaC aaC3 = aaC2;
                final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w4 = g0w3;
                g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda4
                    @Override // X.G0V
                    public final Object invoke(Object obj, Object obj2) {
                        ConversationItemActionContext conversationItemActionContext2 = conversationItemActionContext;
                        Function0 function02 = function0;
                        BRg bRg4 = bRg3;
                        AaC aaC4 = aaC3;
                        G0W g0w5 = g0w4;
                        int i6 = i;
                        ShoppingConversationItemActionsKt.ProductItemMenu(conversationItemActionContext2, function02, bRg4, aaC4, g0w5, (BFM) obj, AnonymousClass011.A02(obj2, i6), i2);
                        return Unit.INSTANCE;
                    }
                };
            } else {
                BBI bbi = (BBI) bfm;
                AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
                int i6 = iA05 & 14;
                boolean zA1R = AnonymousClass001.A1R(bfm, abstractC3358CGzA06, i6 == 4 || ((iA05 & 8) != 0 && bfm.A65(conversationItemActionContext)));
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new BJt();
                    BBI.A0O(bbi, objAaT);
                }
                final BJt bJt = (BJt) objAaT;
                boolean zA65 = bfm.A65(bJt);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = (ProductItemMenuViewModel) new BON(new ProductItemMenuViewModel.Factory(conversationItemActionContext, abstractC3358CGzA06), bJt, A6K.A00).A02(C3cG.A0x(ProductItemMenuViewModel.class));
                    bfm.Ai0(objAaT2);
                }
                final ProductItemMenuViewModel productItemMenuViewModel = (ProductItemMenuViewModel) objAaT2;
                boolean zA67 = bfm.A67(bJt);
                Object objAaT3 = bfm.AaT();
                if (zA67 || objAaT3 == C78N.A00) {
                    objAaT3 = new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda5
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return new ShoppingConversationItemActionsKt$ProductItemMenu$lambda$3$0$$inlined$onDispose$1(bJt);
                        }
                    };
                    BBI.A0O(bbi, objAaT3);
                }
                AnonymousClass001.A17(bfm, objAaT3, bJt);
                final C1BO c1boA02 = C2CK.A02(bfm, productItemMenuViewModel.uiState);
                if (((ProductItemMenuUiState) c1boA02.getValue()).actions.isEmpty()) {
                    bfm.AgE(-562908569);
                    boolean zA1V = AnonymousClass006.A1V(iA05);
                    Object objAaT4 = bfm.AaT();
                    if (zA1V || objAaT4 == C78N.A00) {
                        objAaT4 = new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda6
                            @Override // X.G0U
                            public final Object invoke(Object obj) {
                                function0.invoke();
                                return new ShoppingConversationItemActionsKt$ProductItemMenu$lambda$5$0$$inlined$onDispose$1();
                            }
                        };
                        BBI.A0O(bbi, objAaT4);
                    }
                    int i7 = ConversationItemActionContext.$stable;
                    C78e.A05(bfm, conversationItemActionContext, (G0U) objAaT4);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                    if (bBbAAc == null) {
                        return;
                    }
                    final BRg bRg4 = bRg2;
                    final AaC aaC4 = aaC2;
                    final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w5 = g0w3;
                    g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda7
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            ConversationItemActionContext conversationItemActionContext2 = conversationItemActionContext;
                            Function0 function02 = function0;
                            BRg bRg5 = bRg4;
                            AaC aaC5 = aaC4;
                            G0W g0w6 = g0w5;
                            int i8 = i;
                            ShoppingConversationItemActionsKt.ProductItemMenu(conversationItemActionContext2, function02, bRg5, aaC5, g0w6, (BFM) obj, AnonymousClass011.A02(obj2, i8), i2);
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    bfm.AgE(-562821118);
                    BBI.A0R(bbi, false);
                    final AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
                    final ResultEventBus current = LocalResultEventBus.INSTANCE.getCurrent(bfm, 6);
                    final Context contextA01 = AKO.A01(bbi);
                    final String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120569);
                    final G0U<Integer, Unit> g0uProductActionToast = ProductActionToastKt.productActionToast(bfm, 0);
                    final AXN axnA04 = AKO.A04(Am0.A04, bbi);
                    boolean zA1I = (i6 == 4 || ((iA05 & 8) != 0 && bfm.A67(conversationItemActionContext))) | AnonymousClass004.A1I(iA05);
                    Object objAaT5 = bfm.AaT();
                    if (zA1I || objAaT5 == C78N.A00) {
                        objAaT5 = new Function0() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ConversationItemActionContext conversationItemActionContext2 = conversationItemActionContext;
                                Function0 function02 = function0;
                                ShoppingConversationItemActionsKt.logMenuDismiss(conversationItemActionContext2);
                                function02.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        BBI.A0O(bbi, objAaT5);
                    }
                    final Function0 function02 = (Function0) objAaT5;
                    g0w2 = g0w3;
                    final AaC aaC5 = aaC2;
                    C0n6.A00(bfm, new BA2(C79.A00, true, true, false, false), function02, B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda9
                        @Override // X.G0V
                        public final Object invoke(Object obj, Object obj2) {
                            return ShoppingConversationItemActionsKt.ProductItemMenu$lambda$8(bRg2, strA01, function02, aaC5, axnA04, c1boA02, g0w3, conversationItemActionContext, productItemMenuViewModel, auraNavigatorA05, current, contextA01, function0, g0uProductActionToast, (BFM) obj, AnonymousClass001.A0F(obj2));
                        }
                    }, 377587497), 432, 0);
                }
            }
            bBbAAc.A06 = g0v;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg5 = bRg2;
            final AaC aaC6 = aaC2;
            final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w6 = g0w2;
            g0v = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda10
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ConversationItemActionContext conversationItemActionContext2 = conversationItemActionContext;
                    Function0 function03 = function0;
                    BRg bRg6 = bRg5;
                    AaC aaC7 = aaC6;
                    G0W g0w7 = g0w6;
                    int i8 = i;
                    ShoppingConversationItemActionsKt.ProductItemMenu(conversationItemActionContext2, function03, bRg6, aaC7, g0w7, (BFM) obj, AnonymousClass011.A02(obj2, i8), i2);
                    return Unit.INSTANCE;
                }
            };
            bBbAAc.A06 = g0v;
        }
    }

    public static final C78g ProductItemMenu$lambda$3$0(BJt bJt, C0Yr c0Yr) {
        return new ShoppingConversationItemActionsKt$ProductItemMenu$lambda$3$0$$inlined$onDispose$1(bJt);
    }

    public static final Unit ProductItemMenu$lambda$8(BRg bRg, final String str, final Function0 function0, final AaC aaC, final AXN axn, final C1BO c1bo, final G0W g0w, final ConversationItemActionContext conversationItemActionContext, final ProductItemMenuViewModel productItemMenuViewModel, final AuraNavigator auraNavigator, final ResultEventBus resultEventBus, final Context context, final Function0 function02, final G0U g0u, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C3IL.A00(bfm, C2VG.A04, AnonymousClass001.A0T(bRg), B1V.A00(bfm, new G0W() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda3
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ShoppingConversationItemActionsKt.ProductItemMenu$lambda$8$0(str, function0, aaC, axn, c1bo, g0w, conversationItemActionContext, productItemMenuViewModel, auraNavigator, resultEventBus, context, function02, g0u, (C0Ig) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                }
            }, -184594413), 3120, 4, false);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ProductItemMenu$lambda$8$0$5$0(G0W g0w, BRg bRg, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            AnonymousClass001.A1G(bRg, bfm, g0w, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ProductItemMenu$lambda$8$0$5$2$0$0$0(ProductItemMenuViewModel productItemMenuViewModel, ProductMenuActionUiState productMenuActionUiState, AuraNavigator auraNavigator, ResultEventBus resultEventBus, Context context, Function0 function0, G0U g0u) {
        productItemMenuViewModel.perform(productMenuActionUiState.id, new ProductMenuActionHost(auraNavigator, resultEventBus, context, function0, g0u));
        return Unit.INSTANCE;
    }

    public static final void ProductMenuRow(final String str, final int i, final Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, final int i2, final int i3) {
        BRg bRg2 = bRg;
        boolean zA1Q = z;
        bfm.AgG(-1660458026);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 9363, 9362), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i5, zA1Q);
            BRg bRgA0F = C10G.A0F(AnonymousClass001.A0R(bRg2), Float.NaN, 48.0f, Float.NaN, Float.NaN);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            BRg bRgA05 = C0v5.A05(AnonymousClass001.A0Y(bRgA0F, objAaT, true), null, function0, zA1Q);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA09 = C3U4.A09(bRgA05, f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, i, (iA0d >> 3) & 14);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            long j = zA1Q ? C3cI.A0K(bfm, 1884385477).primaryText : C3cI.A0K(bfm, 1884386946).primaryIcon.disabled;
            BBI.A0R(bbi, false);
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, j, null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARK.A00(BRg.A00), 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16380);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final boolean z2 = zA1Q;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    int i6 = i;
                    Function0 function03 = function0;
                    BRg bRg4 = bRg3;
                    boolean z3 = z2;
                    int i7 = i2;
                    ShoppingConversationItemActionsKt.ProductMenuRow(str2, i6, function03, bRg4, z3, (BFM) obj, AnonymousClass011.A02(obj2, i7), i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static /* synthetic */ void logItem$default(ConversationItemActionContext conversationItemActionContext, HatchComponent hatchComponent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchComponent = null;
        }
        logItem(conversationItemActionContext, hatchComponent, AnonymousClass005.A1O(i, z));
    }

    public static /* synthetic */ Unit $r8$lambda$EYZSCXuSUW2KyueYDLIahMEGv5E(ConversationItemActionContext conversationItemActionContext, Function0 function0) {
        logMenuDismiss(conversationItemActionContext);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ C78g $r8$lambda$g8yQgvC9SJRVJ4HvUfPlNwuUqWo(Function0 function0, C0Yr c0Yr) {
        function0.invoke();
        return new ShoppingConversationItemActionsKt$ProductItemMenu$lambda$5$0$$inlined$onDispose$1();
    }

    public static final Unit ConversationItemActionHost$lambda$0(ConversationItemActionContext conversationItemActionContext, Function0 function0, BRg bRg, G0W g0w, int i, int i2, BFM bfm, int i3) {
        ConversationItemActionHost(conversationItemActionContext, function0, bRg, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ProductItemMenu$lambda$0(ConversationItemActionContext conversationItemActionContext, Function0 function0, BRg bRg, AaC aaC, G0W g0w, int i, int i2, BFM bfm, int i3) {
        ProductItemMenu(conversationItemActionContext, function0, bRg, aaC, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final C78g ProductItemMenu$lambda$5$0(Function0 function0, C0Yr c0Yr) {
        function0.invoke();
        return new ShoppingConversationItemActionsKt$ProductItemMenu$lambda$5$0$$inlined$onDispose$1();
    }

    public static final Unit ProductItemMenu$lambda$6(ConversationItemActionContext conversationItemActionContext, Function0 function0, BRg bRg, AaC aaC, G0W g0w, int i, int i2, BFM bfm, int i3) {
        ProductItemMenu(conversationItemActionContext, function0, bRg, aaC, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ProductItemMenu$lambda$7$0(ConversationItemActionContext conversationItemActionContext, Function0 function0) {
        logMenuDismiss(conversationItemActionContext);
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit ProductItemMenu$lambda$9(ConversationItemActionContext conversationItemActionContext, Function0 function0, BRg bRg, AaC aaC, G0W g0w, int i, int i2, BFM bfm, int i3) {
        ProductItemMenu(conversationItemActionContext, function0, bRg, aaC, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ProductMenuRow$lambda$2(String str, int i, Function0 function0, BRg bRg, boolean z, int i2, int i3, BFM bfm, int i4) {
        ProductMenuRow(str, i, function0, bRg, z, bfm, AnonymousClass011.A00(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void logMenuDismiss(ConversationItemActionContext conversationItemActionContext) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        String str = conversationItemActionContext.product.productId;
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_ID, str, c0924AIaA0u);
        }
        String loggingValue = ShoppingResultsPresentationKt.getLoggingValue(conversationItemActionContext.product.type);
        if (loggingValue != null) {
            AnonymousClass001.A1C(HatchMetadataKey.PRODUCT_TYPE, loggingValue, c0924AIaA0u);
        }
        String str2 = conversationItemActionContext.hostMessageId;
        if (str2 != null) {
            AnonymousClass001.A1C(HatchMetadataKey.HOST_MESSAGE_ID, str2, c0924AIaA0u);
        }
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SHOPPING, null, conversationItemActionContext.isChip ? HatchScreen.MAIN_CHAT : HatchScreen.PRODUCT_LIST, HatchComponent.CLOSE_BUTTON, null, AIW.A0K(c0924AIaA0u));
    }

    public static final Unit ProductItemMenu$lambda$8$0(final String str, Function0 function0, AaC aaC, AXN axn, C1BO c1bo, final G0W g0w, ConversationItemActionContext conversationItemActionContext, final ProductItemMenuViewModel productItemMenuViewModel, final AuraNavigator auraNavigator, final ResultEventBus resultEventBus, final Context context, final Function0 function02, final G0U g0u, C0Ig c0Ig, BFM bfm, int i) {
        float f;
        float fAgx;
        float fAHT;
        float fAHP;
        int iA0d = i;
        C7384Etj.A0Y(c0Ig, 13);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).scrim;
            C1DM c1dm = C1OM.A00;
            BRg bRgA03 = C1b8.A03(c1062ATq, c1dm, j);
            boolean zA65 = bfm.A65(str);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda11
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return ShoppingConversationItemActionsKt.ProductItemMenu$lambda$8$0$0$0(str, (InterfaceC0857A6e) obj);
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            C3Ue.A04(C0v5.A01(null, null, AnonymousClass001.A0Y(bRgA03, objAaT, false), C3cG.A0A(0), null, function0, true), bfm, 0);
            float fAHT2 = c0Ig.AHT();
            float f2 = AuraDimensKt.SpacingXlarge;
            float f3 = C1DG.A04(C8j3.A0k(fAHT2 - f2), 0.0f).A00;
            if (aaC != null) {
                C1DG c1dgA0k = C8j3.A0k(axn.Agx(aaC.A02 - aaC.A01));
                C1DG c1dgA0k2 = C8j3.A0k(f3);
                if (c1dgA0k.compareTo(c1dgA0k2) <= 0) {
                    c1dgA0k2 = c1dgA0k;
                }
                f = c1dgA0k2.A00;
                fAgx = axn.Agx(aaC.A00 - aaC.A03);
            } else {
                C1DG c1dgA0k3 = C8j3.A0k(f3);
                C1DG c1dgA0k4 = C8j3.A0k(320.0f);
                if (c1dgA0k3.compareTo(c1dgA0k4) > 0) {
                    c1dgA0k3 = c1dgA0k4;
                }
                f = c1dgA0k3.A00;
                fAgx = 96.0f;
            }
            float size = 72.0f * ((ProductItemMenuUiState) c1bo.getValue()).actions.size();
            if (aaC != null) {
                C1DG c1dgA0k5 = C8j3.A0k(axn.Agx(aaC.A01));
                float f4 = AuraDimensKt.SpacingMedium;
                fAHT = ((C1DG) ATD.A09(c1dgA0k5, C8j3.A0k(f4), C1DG.A04(C8j3.A0k((c0Ig.AHT() - f) - f4), f4))).A00;
                fAHP = axn.Agx(aaC.A03);
            } else {
                fAHT = (c0Ig.AHT() - f) / 2.0f;
                fAHP = ((c0Ig.AHP() - fAgx) - size) / 2.0f;
            }
            float f5 = ((C1DG) ATD.A09(C8j3.A0k(fAHP), C8j3.A0k(f2), C1DG.A04(C8j3.A0k(((c0Ig.AHP() - fAgx) - size) - 64.0f), f2))).A00;
            BRg bRgA08 = C10G.A08(AYD.A00(bs0, fAHT, f5), f);
            float fAHP2 = c0Ig.AHP() - f5;
            float f6 = AuraDimensKt.SpacingMedium;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C10G.A0A(bRgA08, Float.NaN, C1DG.A04(C8j3.A0k(fAHP2 - f6), 0.0f).A00));
            float f7 = AuraDimensKt.SpacingSmall;
            C9m9 c9m9A00 = AcQ.A00(f7);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            BPg.A03(bfm, g0u2);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v2);
            C1062ATq c1062ATq2 = C10G.A02;
            final BRg bRgA09 = C3U4.A09(C1b8.A03(C11U.A03(c1062ATq2, auraTheme.getShapes(bfm, 6).large), c1dm, auraTheme.getColors(bfm, 6).elevated), f6);
            if (g0w != null) {
                bfm.AgE(-1361996137);
                HatchSharedElementKt.DisableHatchSharedTransitions(B1V.A00(bfm, new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda12
                    @Override // X.G0V
                    public final Object invoke(Object obj, Object obj2) {
                        return ShoppingConversationItemActionsKt.ProductItemMenu$lambda$8$0$5$0(g0w, bRgA09, (BFM) obj, AnonymousClass001.A0F(obj2));
                    }
                }, 674525132), bfm, 6);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(727879174);
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA09);
                AnonymousClass005.A0n(bfm, bbi, function03);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0v2);
                String str2 = ((ProductItemMenuUiState) c1bo.getValue()).previewImageUrl;
                if (str2 == null) {
                    bfm.AgE(171171063);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(171171064);
                    AuraImageKt.m2573AuraImageXRP3Ue8(str2, C11U.A03(C10G.A07(bs0, 64.0f), auraTheme.getShapes(bfm, 6).small), null, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 3072, 0, 32756);
                    BBI.A0R(bbi, false);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(conversationItemActionContext.product.name, C3U4.A0B(ARK.A00(bs0), f7, 0.0f), 0L, auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
            }
            BRg bRgA092 = C3U4.A09(C1b8.A03(C11U.A03(c1062ATq2, auraTheme.getShapes(bfm, 6).modal), c1dm, auraTheme.getColors(bfm, 6).elevated), AuraDimensKt.SpacingMicro);
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA092);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v2);
            bfm.AgE(464531218);
            for (final ProductMenuActionUiState productMenuActionUiState : ((ProductItemMenuUiState) c1bo.getValue()).actions) {
                bfm.Ag8(-350267154, productMenuActionUiState.id);
                String strA01 = AbstractC2271BQs.A01(bfm, productMenuActionUiState.label);
                int i2 = productMenuActionUiState.icon;
                boolean z = productMenuActionUiState.enabled;
                boolean zA1W = AnonymousClass005.A1W(bfm, context, function02, g0u, AnonymousClass005.A1V(bfm, productMenuActionUiState, auraNavigator, resultEventBus, bfm.A67(productItemMenuViewModel)));
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == C78N.A00) {
                    objAaT2 = new Function0() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShoppingConversationItemActionsKt.ProductItemMenu$lambda$8$0$5$2$0$0$0(productItemMenuViewModel, productMenuActionUiState, auraNavigator, resultEventBus, context, function02, g0u);
                        }
                    };
                    BBI.A0O(bbi, objAaT2);
                }
                ProductMenuRow(strA01, i2, (Function0) objAaT2, null, z, bfm, 0, 8);
                BBI.A0R(bbi, false);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }
}
