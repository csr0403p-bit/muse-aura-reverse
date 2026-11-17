package com.facebook.aura.productactions.impl;

import X.ASZ;
import X.AaC;
import X.AbstractC1496Ak3;
import X.AbstractC1798ArH;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0v5;
import X.C1YD;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1497Ak4;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.gestures.ChildPressTrackerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingConversationItemActions {
    public static final int $stable = 0;
    public static final ShoppingConversationItemActions INSTANCE = new ShoppingConversationItemActions();

    /* renamed from: $r8$lambda$fWAZNLJQcIBO2qdWPddtOz-cZ6g, reason: not valid java name */
    public static /* synthetic */ Unit m1869$r8$lambda$fWAZNLJQcIBO2qdWPddtOzcZ6g(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$10$0(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$7$0(ProductItemAnchor productItemAnchor, InterfaceC1497Ak4 interfaceC1497Ak4) {
        C7384Etj.A0Y(interfaceC1497Ak4, 1);
        productItemAnchor.coordinates = interfaceC1497Ak4;
        return Unit.INSTANCE;
    }

    public static final Unit Content$lambda$8$0(ProductItemAnchor productItemAnchor, ConversationItemActionContext conversationItemActionContext, MutableState mutableState, MutableState mutableState2) {
        InterfaceC1497Ak4 interfaceC1497Ak4 = productItemAnchor.coordinates;
        mutableState.Af8((interfaceC1497Ak4 == null || !interfaceC1497Ak4.isAttached()) ? null : AbstractC1496Ak3.A00(interfaceC1497Ak4, true));
        MutableState.A09(true, mutableState2);
        ShoppingConversationItemActionsKt.logItem(conversationItemActionContext, null, true);
        return Unit.INSTANCE;
    }

    public final void Content(final ConversationItemActionContext conversationItemActionContext, final Function0<Unit> function0, BRg bRg, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(conversationItemActionContext, 0);
        AnonymousClass002.A1B(function0, 1, g0w);
        bfm.AgG(-1327440495);
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
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 & 14;
            boolean z2 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(conversationItemActionContext));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = AbstractC1798ArH.A07(false, bfm);
            }
            final MutableState mutableState = (MutableState) objAaT;
            boolean z3 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(conversationItemActionContext));
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = AbstractC1798ArH.A07(null, bfm);
            }
            final MutableState mutableState2 = (MutableState) objAaT2;
            boolean z4 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(conversationItemActionContext));
            Object objAaT3 = bfm.AaT();
            if (z4 || objAaT3 == C78N.A00) {
                objAaT3 = new ProductItemAnchor();
                BBI.A0T(bfm, objAaT3);
            }
            final ProductItemAnchor productItemAnchor = (ProductItemAnchor) objAaT3;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12056a);
            boolean zA67 = bfm.A67(productItemAnchor);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == C78N.A00) {
                objAaT4 = new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActions$$ExternalSyntheticLambda1
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        return ShoppingConversationItemActions.Content$lambda$7$0(productItemAnchor, (InterfaceC1497Ak4) obj);
                    }
                };
                BBI.A0T(bfm, objAaT4);
            }
            BRg bRgHandlesChildPresses = ChildPressTrackerKt.handlesChildPresses(ASZ.A00(bRg2, (G0U) objAaT4), bfm, 0);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1O = AnonymousClass003.A1O(bfm, productItemAnchor, mutableState, bfm.A65(mutableState2));
            if (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(conversationItemActionContext))) {
                z = true;
            }
            boolean z5 = zA1O | z;
            Object objAaT5 = bfm.AaT();
            if (z5 || objAaT5 == C78N.A00) {
                objAaT5 = new Function0() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActions$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShoppingConversationItemActions.Content$lambda$8$0(productItemAnchor, conversationItemActionContext, mutableState2, mutableState);
                    }
                };
                BBI.A0T(bfm, objAaT5);
            }
            AnonymousClass001.A1G(C0v5.A00(null, null, bRgHandlesChildPresses, c1ydA0A, null, strA01, (Function0) objAaT5, function0, true), bfm, g0w, (iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            ConversationItemActionContext conversationItemActionContext2 = MutableState.A0A(mutableState) ? conversationItemActionContext : null;
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT6 = bfm.AaT();
            if (zA65 || objAaT6 == C78N.A00) {
                objAaT6 = new Function0() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActions$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState.A09(false, mutableState);
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0T(bfm, objAaT6);
            }
            ShoppingConversationItemActionsKt.ProductItemMenu(conversationItemActionContext2, (Function0) objAaT6, BRg.A00, (AaC) mutableState2.getValue(), g0w, bfm, AnonymousClass001.A0B(iA05 << 3, ConversationItemActionContext.$stable | 384), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActions$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ShoppingConversationItemActions shoppingConversationItemActions = this.f$0;
                    ConversationItemActionContext conversationItemActionContext3 = conversationItemActionContext;
                    Function0<Unit> function02 = function0;
                    BRg bRg4 = bRg3;
                    G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
                    int i5 = i;
                    shoppingConversationItemActions.Content(conversationItemActionContext3, function02, bRg4, g0w2, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public final void Menu(final ConversationItemActionContext conversationItemActionContext, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(10828691);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ShoppingConversationItemActionsKt.ProductItemMenu(conversationItemActionContext, function0, bRg2, null, null, bfm, AnonymousClass002.A07(iA05, ConversationItemActionContext.$stable | (iA05 & 14)), 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.productactions.impl.ShoppingConversationItemActions$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    ShoppingConversationItemActions shoppingConversationItemActions = this.f$0;
                    ConversationItemActionContext conversationItemActionContext2 = conversationItemActionContext;
                    Function0<Unit> function02 = function0;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    shoppingConversationItemActions.Menu(conversationItemActionContext2, function02, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit Content$lambda$11(ShoppingConversationItemActions shoppingConversationItemActions, ConversationItemActionContext conversationItemActionContext, Function0 function0, BRg bRg, G0W g0w, int i, int i2, BFM bfm, int i3) {
        shoppingConversationItemActions.Content(conversationItemActionContext, function0, bRg, g0w, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit Menu$lambda$0(ShoppingConversationItemActions shoppingConversationItemActions, ConversationItemActionContext conversationItemActionContext, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        shoppingConversationItemActions.Menu(conversationItemActionContext, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
